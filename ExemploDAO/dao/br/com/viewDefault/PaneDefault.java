package br.com.viewDefault;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PaneDefault extends JPanel{
	private Color color =new Color(255,222,173);
	
	
	public PaneDefault() {
		setBackground(color);
		setBorder(BorderFactory.createLineBorder(Color.yellow,5));
	}
	
	public PaneDefault(LayoutManager layoutManager) {
		super(layoutManager);
		setBorder(BorderFactory.createLineBorder(Color.yellow,5));
		setBackground(color);
		
	}
	
	
}
