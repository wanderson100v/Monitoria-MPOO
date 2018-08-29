package model.dao;

import java.util.List;

import exceptions.DaoException;
import model.vo.Ponto;

public interface IDaoBackup {
	public void backup() throws DaoException;
	public List<Ponto> getPontos() throws DaoException;
	public void salvarPonto(Ponto ponto);
}
