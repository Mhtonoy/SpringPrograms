package in.mh.SpringNamedParameterJdbcCrudOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.mh.bean.Student;
import in.mh.mappers.StudentRowMaper;
import in.mh.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate jdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
        
//        insertOperation(jdbcTemplate);
//        updateOperation(jdbcTemplate);
//        deleteOperation(jdbcTemplate);
        selectOperation(jdbcTemplate);
    }
    
//    ------------------------------- Insert Operation ---------------------------------------------
    
    public static void insertOperation(NamedParameterJdbcTemplate jdbcTemplate) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter Rollno: ");
    	int rollno = sc.nextInt();
    	System.out.print("Enter Name: ");
    	sc.nextLine();
    	String name = sc.nextLine();
    	System.out.print("Enter Marks: ");
    	float marks = sc.nextFloat();
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("key_rollno", rollno);
    	map.put("key_name", name);
    	map.put("key_marks", marks);
    	
    	String insert_sql_query = "INSERT INTO student VALUES(:key_rollno, :key_name, :key_marks)";
    	int count = jdbcTemplate.update(insert_sql_query, map);
    	
    	if(count > 0)
    	{
    		System.out.println("Insertion Successful");
    	}
    	else
    	{
    		System.out.println("Insertion Failed");
    	}
    	
    	sc.close();
    	
    }
    
//    ------------------------------- Update Operation ---------------------------------------------
    
    public static void updateOperation(NamedParameterJdbcTemplate jdbcTemplate) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Rollno: ");
    	int rollno = sc.nextInt();
    	System.out.print("Enter Marks: ");
    	float marks = sc.nextFloat();
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("key_marks", marks);
    	map.put("key_rollno", rollno);
    	
    	String update_sql_query = "UPDATE student SET std_marks=:key_marks WHERE std_roll=:key_rollno";
    	int count = jdbcTemplate.update(update_sql_query, map);
    	if(count > 0) 
    	{
    		System.out.println("Update Successful");
    	}
    	else
    	{
    		System.out.println("Update Failed.");
    	}
    	
    	sc.close();
    	
    }

//    ------------------------------- Delete Operation ---------------------------------------------
    
    public static void deleteOperation(NamedParameterJdbcTemplate jdbcTemplate) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Rollno: ");
    	int rollno = sc.nextInt();
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	map.put("key_rollno", rollno);
    	
    	String sql_delete_query = "DELETE FROM student WHERE std_roll = :key_rollno";
    	int count = jdbcTemplate.update(sql_delete_query, map);
    	if(count > 0) 
    	{
    		System.out.println("Delete Successful");
    	}
    	else
    	{
    		System.out.println("Delete Failed.");
    	}
    	
    	sc.close();
    }

//    ------------------------------- Select Operation ---------------------------------------------
    public static void selectOperation(NamedParameterJdbcTemplate jdbcTemplate) {

    	String select_sql_query = "SELECT * FROM student";
    	List<Student> list = jdbcTemplate.query(select_sql_query, new StudentRowMaper());
    
    	
    	for(Student std: list)
    	{
    		System.out.println("Rollno : " + std.getRollno());
    		System.out.println("Name : " + std.getName());
    		System.out.println("Marks : " + std.getMarks());
    		System.out.println("---------------------------------------------");
    	}
    }
}
