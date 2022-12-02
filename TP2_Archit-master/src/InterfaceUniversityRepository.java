import java.sql.SQLException;

public interface InterfaceUniversityRepository {
      
	public Universite GetById(int universityId) throws SQLException ;
	
}
