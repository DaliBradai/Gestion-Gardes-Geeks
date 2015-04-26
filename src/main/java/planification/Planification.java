package planification;

import java.util.Date;
import java.util.List;

import model.Doctor;

public class Planification implements IPlanification{


	public float quotion(List<Doctor> l) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Doctor> planification(List<Doctor> l, java.sql.Date dateDebut,
			java.sql.Date dateFin) {
		// TODO Auto-generated method stub
		return null;
	}

	public Indice minPreference(List<Doctor> l, java.sql.Date dateDebut,
			java.sql.Date dateFin) {
		Indice indice = new Indice(-1, -1);
		int i = 0;
		int j = 0;
		int indiceDoc = -1;
		int indicePlan = -1;
		Date dateMin=dateDebut;
		
		for(Doctor d : l){
			dateMin = d.getPreferences().get(0);
			for(Date date : d.getPreferences()){
				if(j==0){
					dateMin = date;
				}else{
					if(date.compareTo(dateMin)>0){
						dateMin = date;
						min = i;
					}
						
				}
				j=j+1;				
			}
			j=j+1;
		}
		return indice;
	}

	
 
}
