package model.bo;

import java.util.List;

import exceptions.DaoException;
import model.dao.Backup;
import model.dao.IDaoBackup;
import model.vo.Ponto;

public class BusinessBackup implements IBusinessBackup{
	private IDaoBackup daoBackup;
	
	public BusinessBackup() {
		daoBackup = new Backup();
	}
	
	@Override
	public void backup() throws DaoException {
		daoBackup.backup();
	}

	@Override
	public void salvarPonto(Ponto ponto) {
		if(daoBackup != null )
			daoBackup.salvarPonto(ponto);
	}

	@Override
	public List<Ponto> getPontos() throws DaoException {
		return daoBackup.getPontos();
	}
	
}
