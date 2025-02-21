package com.springmvc.pmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvc.pmvc.beans.Course;



/**
 * 
 */
public class CourseDao {
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	public List<Course> getCourseList(){
		return jdbcTemplate.query("select * from Faculty",new RowMapper<Course>(){    
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
}
