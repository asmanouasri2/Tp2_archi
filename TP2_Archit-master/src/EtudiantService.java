import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class EtudiantService {
	
		private InterfaceEtudiantRepository StudRep;
		private InterfaceUniversityRepository UnivRep;
		private IJournal j;
		
		public void setEtudRep(InterfaceEtudiantRepository StudRep) {
			this.StudRep = StudRep;
		}
		public void setUnivRep(InterfaceUniversityRepository UnivRep) {
			this.UnivRep = UnivRep;
		}
		public void setJournal(IJournal j) {
			this.j = j;
		}
		
		public InterfaceEtudiantRepository getStudRep() {
			return this.StudRep;
		}
		public InterfaceUniversityRepository getUnivRep() {
			return this.UnivRep;
		}
		public IJournal getJournal() {
			return this.j;
		}
		
		public boolean inscription (int matricule, String nom, String prenom, String email,String pwd, int id_universite) throws SQLException	
		{
			
		    Etudiant stud = new Etudiant(matricule, nom, prenom, email,pwd,id_universite);
		    Universite univ= UnivRep.GetById(id_universite, j);

		    j.outPut_Msg("Log: d�but de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);                           
		    AbstractFactory AF = new ConcreteCreator();
		    IPackage pack = AF.getPackage(univ.getPack());
		    stud.setNbLivreMensuel_Autorise(pack.getNbrLivreAutorise());

			 StudRep.add(stud, j);

			 j.outPut_Msg("Log: Fin de l'op�ration d'ajout de l'�tudiant avec matricule "+matricule);
			 return true;
		    
			
		}
		public void ajouterBonus() throws SQLException {
			ArrayList<Etudiant> etudiants = StudRep.getEtudiants();
			
			for(Etudiant e : etudiants) {
				Universite univ = UnivRep.GetById(e.getId_universite(), new ScreenJourn());
				e.giveBonus(univ);
			}
		}
		
	public void ajouterBonus() throws SQLException {
		ArrayList<Etudiant> etudiants = StudRep.getEtudiants();
		
		for(Etudiant e : etudiants) {
			Universite univ = UnivRep.GetById(e.getId_universite(), new ScreenJourn());
			e.giveBonus(univ);
		}
	}
	
	
public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}
public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}
	
}