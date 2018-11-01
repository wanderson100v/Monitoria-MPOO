package controll;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalPopupMenuSeparatorUI;
import javax.xml.transform.Templates;

import model.BasePessoas;
import model.Pessoa;
import view.CadastroView;
import view.Messagem;

public class CadastroController implements ActionListener {
	private BasePessoas basePessoas;
	private CadastroView cadastroView;
	private KeyHandler keyHandler;
	
	public CadastroController(BasePessoas basePessoas, CadastroView cadastroView) {
		super();
		this.basePessoas = basePessoas;
		this.cadastroView = cadastroView;
		this.keyHandler = new KeyHandler();
		control();
	}

	public void control() {
		cadastroView.getSairButton().addActionListener(this); // tratamento de evento na propria classe
		cadastroView.getCadastrarButton().addActionListener(this); // propria classe
		cadastroView.getTelefoneField().addKeyListener(keyHandler); // classe interna
		cadastroView.getIdadeField().addKeyListener(keyHandler); // classe interna
	}

	/**
	 * Implementação do método definido na interface ActionListener a fim de para o caso tratar os eventos
	 * de botão sair e cadastrar da tela de cadstro.
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(cadastroView.getSairButton()  == arg0.getSource()) // caso a origem do evento seja o botão sair da tela de cadastro
			
			System.exit(0); // saia do sistema passando "0" afim de informar que não houve erros
		
		else if(cadastroView.getCadastrarButton() == arg0.getSource() )  // caso a origem do evento seja o botão cadastrar da tela de cadastro
		{
			/* (Para o caso) foi identificado a seguinte sequencia de passos.
			 * 1 - pegar dados da tela;
			 * 2 - verificar dados que foram pegos da tela; 
			 * 3 - tentar cadastrar; 
			 * 4 - mostrar oo usuário se ocorreu sucesso ou não atravez da tela.
			 */
			
			/* Assunto - tratamento de exeções: caso ocorra algum erro em tempo de execução( ou seja quando a apliacção esteja rodando)
			   dentro do bloco "try" (que siginifica tentar ou seja tenta executar o que esta dentro do seu escopo "{ }"). Porém em caso
			   de erro o mesmo deve ser definido um tratamento para o mesmo dentro de um bloco "catch".
			 */
			try {
				// passo 1.
				String nome = cadastroView.getNomeField().getText();
				String email = cadastroView.getEmailField().getText();
				String endereco = cadastroView.getEnderecoField().getText();
				int telefone = Integer.parseInt(cadastroView.getTelefoneField().getText()); // linha que pode ocasionar em erro por tentativa de converção de texto invalido para inteiro
				int idade = Integer.parseInt(cadastroView.getIdadeField().getText()); // possibilidade de mesmo erro da linha acima.
				
				//passo 2
				if(!nome.equals("") && !endereco.equals("")&& !email.isEmpty()) {	
					// passo 3
					boolean isMaiorDeIdade = basePessoas.addPessoa(new Pessoa(nome, email, endereco, telefone, idade));
					
					// passo 4 (feedback)
					if(!isMaiorDeIdade)
						Messagem.imprimirMsg("Cadastro erro","O usuário é menor de idade ", JOptionPane.ERROR_MESSAGE);
					else 
						Messagem.imprimirMsg("Cadastro sucesso",nome+" cadastrado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
				}else {
					//passo 4 (feedback)
					Messagem.imprimirMsg("Cadastro erro","há campos obrigatorios vazios ", JOptionPane.ERROR_MESSAGE);
				}
				
			}catch (Exception e) {
				//passo 4 (feedback)
				Messagem.imprimirMsg("Cadastro erro","informe numeros para idade e telefone ", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	/**
	 * Classe implementada afim de tratar eventos de teclado
	 * @author Wanderson
	 *
	 */
	private class KeyHandler implements KeyListener{
		
		/**
		 * A cada apertar de tecla é checado para os campos de texto que se espera entrada de números como 
		 * telefone e idade se está ocorrendo isso de fato, em caso de erro o texto é mudado de cor. Obs: essa
		 * implementação foi feta apenas afim de exemplificar atravez de um problema proposto durante a monitoria
		 * que era dar um feedback em tempo real para o usuário se estava ocorrendo erros( para cada tecla digitada)
		 * o tratamento de eventos de teclado.
		 */
		@Override
		public void keyTyped(KeyEvent arg0) {
			if(arg0.getSource() instanceof JTextField) { // verificando se a origem do evento -é um- JTextField
				try {// bloco de tentativa
					/*
					   Obs.: a linha abaixo  pode ocasionar em erro ( dado que já foi verificado que o argumento de origem 
					   do evento é um JTextField foi feito um cast ou seja uma converção para JTextField afim de 
					   utilizar do método getText() e em seguida pegar esse texto para ver se é inteiro atravez do 
					   parseInt ( método estatico da classe Integer que converte uma String para um inteiro). 
					 */
					int validar = Integer.parseInt(((JTextField)(arg0.getSource())).getText()); 
					
					/*
					   se chegou nessa linha siginifica que a de cima n ocasionou em erro e que o texto na tela contém apenas
					   números portanto mudei o texto para preto(prevendo o caso do texto estar vermelho por antes conter letras)
					*/
					((JTextField)(arg0.getSource())).setForeground(Color.black); 
				
				}catch (Exception e) { // bloco de tratamento de erro para tentativa
					// em caso erro ou seja, o texto que esta na tela contém letras, a cor do texto é mudada para vermelho
					((JTextField)(arg0.getSource())).setForeground(Color.red);
				}
			}
		}
		
		@Override
		public void keyPressed(KeyEvent arg0) {}

		@Override
		public void keyReleased(KeyEvent arg0) {}
		
	}
}
