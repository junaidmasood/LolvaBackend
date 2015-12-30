package in.lolva.services;

import org.springframework.beans.factory.annotation.Autowired;

import in.lolva.dao.LolvaDAO;

public class LolvaServices implements ILolvaServices{

	@Autowired
    LolvaDAO lolvaDAO;


	@Override
	public String getPoints(int user_id) {
		// TODO Auto-generated method stub
		return lolvaDAO.getPoints(user_id);
	}

}
