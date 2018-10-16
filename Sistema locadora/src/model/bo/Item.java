package model.bo;

import java.util.Date;

import enumeracoes.TipoItem;

public class Item {
	private Float valor;
	private String titulo;
	private Date data_devolucao;
	private TipoItem tipoItem;
	
	

	public Item(Float valor, String titulo, Date data_devolucao, TipoItem tipoItem) {
		super();
		this.valor = valor;
		this.titulo = titulo;
		this.data_devolucao = data_devolucao;
		this.tipoItem = tipoItem;
	}

	
	public TipoItem getTipoItem() {
		return tipoItem;
	}


	public void setTipoItem(TipoItem tipoItem) {
		this.tipoItem = tipoItem;
	}


	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(Date data_devolucao) {
		this.data_devolucao = data_devolucao;
	}
	
	
	
	
	
}
