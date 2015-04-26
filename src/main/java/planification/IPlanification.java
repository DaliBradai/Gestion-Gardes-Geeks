package planification;
import java.sql.Date;
import java.util.List;

import model.*;

public interface IPlanification {
	public Indice minPreference(List<Doctor> l,Date dateDebut, Date dateFin);
	public float quotion(List<Doctor> l);
	public List<Doctor> planification(List<Doctor> l,Date dateDebut, Date dateFin);

}
