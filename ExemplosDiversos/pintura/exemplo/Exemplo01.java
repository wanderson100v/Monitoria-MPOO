package exemplo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exemplo01 {
	public static void main(String[] args) {
		Random r = new Random();
		int size = r.nextInt(5)+5;
		
		List<Color> items = new ArrayList<>();
		
		for(int i =0 ; i < size ; i ++)
			items.add(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		
		pintura(items,new Tela());
	}
	private static void pintura(List<Color> items, Tela tela) {
		new Thread(new Runnable() {@Override
		
			public void run() {
			
				while(true) {
					tela.g.setColor(Color.white);
					tela.g.fillRect(0,0,tela.getWidth(),tela.getHeight());
					
					int aux = 0;
					if(items.size() > 0)
						for(int i =0 ; i <6 ; i ++)
							for(int j =0 ; j <4 ; j ++) {
								if(aux > items.size()-1)
									break;
								tela.g.setColor(items.get(aux));
								tela.g.fillRect((j+1)*32,(i+1)*32,32,32);
								aux++;
							}
					tela.repaint();
				}
			}
		}).start();
	
	}
}

class Tela extends JFrame{
	BufferedImage pinturaBackEnd = new BufferedImage(300,300,BufferedImage.TYPE_4BYTE_ABGR);
	Graphics2D g = pinturaBackEnd.createGraphics();
	public JPanel fundo;
	
	public Tela() {
		fundo = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.drawImage(pinturaBackEnd,0,0,null);
			}
		};
		
		add(fundo);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		fundo.setIgnoreRepaint(true);
		setSize(300,300);
		setVisible(true);
		
	}
}
