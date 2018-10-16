package model.bo;

import enumeracoes.TipoTelefone;

public class Telefone {
	private TipoTelefone tipoTelefone;
	private Integer numero,prefixo;
	
	public Telefone(TipoTelefone tipoTelefone, Integer numero, Integer prefixo,Cliente cliente) {
		cliente.getTelefone().setNumero(numero);
		cliente.getTelefone().setTipoTelefone(tipoTelefone);
		cliente.getTelefone().setPrefixo(prefixo);
	}
	
	public Telefone(Cliente cliente) {
	}
	
	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	
	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getPrefixo() {
		return prefixo;
	}
	
	public void setPrefixo(Integer prefixo) {
		this.prefixo = prefixo;
	}
	public static void main(String[] args) {
		Cliente cliente= new Cliente("wanderson");
		Telefone t = new Telefone(TipoTelefone.PESSOAL,124367,34,cliente);
	}
	
}
