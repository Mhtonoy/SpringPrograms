package in.mh.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.mh.bean.Student;

public class StudentRowMaper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student std = new Student();
		
		std.setName(rs.getString("std_name"));
		std.setRollno(rs.getInt("std_roll"));
		std.setMarks(rs.getFloat("std_marks"));
		
		return std;
	}

}
