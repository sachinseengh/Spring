package com.springcore.crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoimpl  implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public int insert(Student student) {
		String sql ="insert into spring(id,name) values(?,?)";
	   int i= jdbcTemplate.update(sql,student.getId(),student.getName());
		return i;
	}

	@Override
	public int updateDetails(Student student) {
		String sql ="update spring set id=? ,name=?";
	    int i=  jdbcTemplate.update(sql,student.getId(),student.getName());
	
		return i;
	}

	@Override
	public int delete(int id) {
		String sql= "delete from spring where id=?";
		int i = jdbcTemplate.update(sql,id);
		return i;
	}

	@Override
	public Student getStudentById(int id) {
		String sql = "select * from spring where id=?";
		RowMapper rowMapper = new RowMapper() {
			public Object mapRow(ResultSet rs,int rowNum) throws SQLException{
				Student st = new Student();
				st.setName(rs.getString(2));
				return st;		
			}
		};
		Student st = (Student) jdbcTemplate.queryForObject(sql, rowMapper,id);
		return st;
		
	}

	@Override
	public List<Student> getAllStudent() {
		String sql = "select * from spring";
		RowMapper rowMapper = new RowMapper() {
			public Object mapRow(ResultSet rs,int rowNum) throws SQLException{
				Student st = new Student();
				st.setName(rs.getString(2));
				return st;		
			}
		};
		List<Student> list = jdbcTemplate.query(sql, rowMapper);
		return list;
	 
	}

	public void setJdbcTemplate(JdbcTemplate jdbctemplate2) {
		this.jdbcTemplate=jdbctemplate2;
		
	}

}
