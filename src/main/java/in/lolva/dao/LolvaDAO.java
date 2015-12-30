package in.lolva.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class LolvaDAO implements ILolvaDAO{

	@Autowired  
     DataSource dataSource; 
	
	private JdbcTemplate jdbcTemplateObject;
	//private JdbcTemplate jdbcTemplateObj;

	
	//Getter Setter for DataSource Bean
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;

	      
	}      
	
	@Override
	public String getPoints(int user_id) {
		

	     jdbcTemplateObject = new JdbcTemplate(dataSource);
	     
	     JdbcTemplate jdbcTemplate = jdbcTemplateObject;
	      
	    
	     String name= (String)jdbcTemplate.queryForObject("SELECT username "
	      		+ "FROM user_details WHERE user_id="+user_id,String.class);
	      
	   
		return name;
	}

}
