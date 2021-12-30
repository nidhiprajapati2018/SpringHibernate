package com.jnit;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;



public class SpringSelect {
	
	private HibernateTemplate Template;
	
	public void setHibernateTemplate(HibernateTemplate Template) {
		this.Template = Template;
	}
	
	public void saveStudent(Student x) {
		Template.save(x);
	}


}
