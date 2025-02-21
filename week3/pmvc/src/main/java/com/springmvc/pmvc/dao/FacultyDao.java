package com.springmvc.pmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.pmvc.beans.Course;
import com.springmvc.pmvc.beans.Faculty;

/**
 * 
 */
public class FacultyDao {
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public List<Course> getCourses(Faculty f){
		return jdbcTemplate.query("select * from Faculty f, Course c where f.f_id = c.f_id and f.f_id="+f.getF_id(),new RowMapper<Course>(){    
	        public Course mapRow(ResultSet rs, int row) throws SQLException {    
	        	Course s= new Course();    
	            s.setC_id(rs.getInt("c_id"));    
	            s.setC_name(rs.getString("c_name"));
	            s.setDuration(rs.getInt("duration"));
	            s.setF_id(rs.getInt("f_id"));
	            return s;    
	        }    
	    });
	}
	public List<Faculty> getFaculties(){
		return jdbcTemplate.query("select * from Faculty",new RowMapper<Faculty>(){    
	        public Faculty mapRow(ResultSet rs, int row) throws SQLException {    
	        	Faculty s= new Faculty();    
	            s.setF_id(rs.getInt("f_id"));    
	            s.setF_name(rs.getString("f_name"));
	            s.setPass(rs.getString("pass"));
	            s.setEmail(rs.getString("email"));
	            s.setMobile(rs.getString("mobile"));
	            return s;    
	        }    
	    });
	}
}
