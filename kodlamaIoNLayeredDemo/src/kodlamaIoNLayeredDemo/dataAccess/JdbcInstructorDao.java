package kodlamaIoNLayeredDemo.dataAccess;

import kodlamaIoNLayeredDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
System.out.println("JDBC ile veritabanına eklendi");	
	}

}
