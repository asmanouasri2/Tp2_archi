
import java.awt.event.ActionListener;

public interface IViewInscription {
	boolean champsValides();
	public void Show_InscriptionForm();
	public void Annuler_Inscription();
	void addValiderListener(ActionListener listener);
	void addAnnulerListener(ActionListener listener);
	public void Reset_Champs();
	public void ShowDialog(final String msg);
	public void ShowErreur(final String msg);
	public String Get_Mat();
	public String Get_Name();
	public String Get_Prenom();
	public String Get_email();
	public String Get_pwd();
	public String Get_id_univ();
}