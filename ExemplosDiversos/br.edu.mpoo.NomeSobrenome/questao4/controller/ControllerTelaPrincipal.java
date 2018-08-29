package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

import exceptions.DaoException;
import exceptions.PontoException;
import model.bo.BusinessBackup;
import model.bo.IBusinessBackup;
import model.vo.Ponto;
import model.vo.Ponto2D;
import model.vo.Ponto3D;
import view.Mensagem;
import view.TelaPrincipal;

public class ControllerTelaPrincipal implements ItemListener{
	private TelaPrincipal telaPrincipal;
	private IBusinessBackup businessBackup;
	
	public ControllerTelaPrincipal(TelaPrincipal telaPrincipal) {
		super();
		this.telaPrincipal = telaPrincipal;
		businessBackup = new BusinessBackup();
	};
	
	public void control() {
		telaPrincipal.getBntNovo().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				telaPrincipal.getPanelNovo().setVisible(true);
			}
		});
		
		telaPrincipal.getBntSair().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		telaPrincipal.getBntAdd().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					criarPonto();
					Mensagem.imprimirMsg("Sucess","Ponto criado com sucesso",JOptionPane.DEFAULT_OPTION);
				} catch (PontoException e) {
					Mensagem.imprimirMsg("Sucess","Ponto criado com sucesso",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		telaPrincipal.getBntShow().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					Mensagem.imprimirMsg("Mensagem",businessBackup.getPontos().toString(),JOptionPane.INFORMATION_MESSAGE);
				} catch (DaoException e) {
					Mensagem.imprimirMsg("Error","Erro ao carregar pontos",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		telaPrincipal.getPanelNovo().getJrb2d().addItemListener(this);
		telaPrincipal.getPanelNovo().getJrb3d().addItemListener(this);
		
		
		
		telaPrincipal.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(telaPrincipal.getPanelNovo().getJrb2d().isSelected()) 
			telaPrincipal.getPanelNovo().getLine4().setVisible(false);
		else if(telaPrincipal.getPanelNovo().getJrb3d().isSelected()) 
			telaPrincipal.getPanelNovo().getLine4().setVisible(true);
		
	}
	
	public void criarPonto() throws PontoException {
		
		try {
			Ponto ponto = null;
			double px = Double.parseDouble(telaPrincipal.getPanelNovo().getFldCx().getText());
			double py = Double.parseDouble(telaPrincipal.getPanelNovo().getFldCy().getText());
			
			if(telaPrincipal.getPanelNovo().getJrb2d().isSelected())
				ponto = new Ponto2D(px, py);
			else{
				double pz = Double.parseDouble(telaPrincipal.getPanelNovo().getFldCz().getText());
				ponto = new Ponto3D(px, py, pz);
			}
			
			businessBackup.salvarPonto(ponto);
			
		}catch(NumberFormatException e){
			throw new PontoException("Erro ao criar ponto");
		}
	}
}
