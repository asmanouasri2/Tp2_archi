import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfaceEtudiantRepository {

	
	void add (Etudiant E)throws SQLException;
	
	boolean Exists(String email) throws SQLException;
	
	boolean ExistsMat(int mat) throws SQLException;
	
	ArrayList< EtudiantLimite  > getAllEtudiantForfaiLimite();
	
		
}
