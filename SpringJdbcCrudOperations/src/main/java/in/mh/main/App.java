package in.mh.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.mh.bean.Student;
import in.mh.mappers.StudentRowMapper;
import in.mh.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//        insertOperation(sc, jdbcTemplate);
//        updateOperation(jdbcTemplate);
//        deleteOperation(jdbcTemplate);
        selectOperation(jdbcTemplate);
        
        
    }
    
    
    public static void insertOperation(Scanner sc, JdbcTemplate jdbcTemplate)
    {
    	System.out.print("Enter Roll: ");
        int std_rollno = sc.nextInt();
        System.out.print("Enter Name: ");
        sc.nextLine();
        String std_name = sc.nextLine();
        System.out.print("Enter Marks: ");
        float std_marks = sc.nextFloat();

      
        String insert_sql_query = "INSERT INTO student VALUES(?, ?, ?)";
        int count = jdbcTemplate.update(insert_sql_query, std_rollno, std_name, std_marks);
        
        if(count > 0)
        {
        	System.out.println("Insertion Successful");
        }
        else
        {
        	System.out.println("Insertion Failed");
        }
    }
    
    
    public static void updateOperation(JdbcTemplate jdbcTemplate)
    {
    	float marks = 98.3f;
    	int rollno = 101;
    	
    	String update_sql_query = "UPDATE student SET std_marks=? WHERE std_roll=?";
    	int count = jdbcTemplate.update(update_sql_query, marks, rollno);
    	if(count>0)
    	{
    		System.out.println("Update Successful");
    	}
        else
        {
        	System.out.println("Update Failed");
        }
    }
    
    
    public static void deleteOperation(JdbcTemplate jdbcTemplate)
    {
    	int rollno = 102;
    	
    	String delete_sql_query = "DELETE FROM student WHERE std_roll=?";
    	int count = jdbcTemplate.update(delete_sql_query, rollno);
    	if(count > 0)
    	{
    		System.out.println("Delete Successful");
    	}
        else
        {
        	System.out.println("Delete Failed");
        }
    }
    
    
    public static void selectOperation(JdbcTemplate jdbcTemplate)
    {
    	
//    	-------------------Operation 1------------------------
    	String select_sql_query = "SELECT * FROM student";
    	List<Student> list = jdbcTemplate.query(select_sql_query, new StudentRowMapper());
    	
    	for(Student std: list)
    	{
    		System.out.println("Rollno : " + std.getRollno());
    		System.out.println("Name : " + std.getName());
    		System.out.println("Marks : " + std.getMarks());
    		System.out.println("---------------------------------------------");
    	}
    	
    	
    	/*
//    	-------------------Operation 2------------------------
    	int rollno = 103;
    	String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
    	List<Student> list = jdbcTemplate.query(select_sql_query, new StudentRowMapper(), rollno);
    	
    	for(Student std: list)
    	{
    		System.out.println("Rollno : " + std.getRollno());
    		System.out.println("Name : " + std.getName());
    		System.out.println("Marks : " + std.getMarks());
    		System.out.println("---------------------------------------------");
    	}
    	*/

    	/*
//    	-------------------Operation 3------------------------
    	int rollno = 101;
    	String select_sql_query = "SELECT * FROM student WHERE std_roll=?";
    	Student std = jdbcTemplate.queryForObject(select_sql_query, new StudentRowMapper(), rollno);
    	
    		System.out.println("Rollno : " + std.getRollno());
    		System.out.println("Name : " + std.getName());
    		System.out.println("Marks : " + std.getMarks());
    		System.out.println("---------------------------------------------");
    		
    	*/
    }
    

}
