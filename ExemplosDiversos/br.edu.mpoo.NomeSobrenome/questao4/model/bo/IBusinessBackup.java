package model.bo;

import java.util.List;

import exceptions.DaoException;
import model.vo.Ponto;

public interface IBusinessBackup {
	public void backup() throws DaoException;
	public List<Ponto> getPontos() throws DaoException;
	public void salvarPonto(Ponto ponto);
}
