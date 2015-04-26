package planification;
import java.util.List;

import model.*;

public interface IPlanification {
	public int minPlanification(List<Doctor> l);
	public float quotion(List<Doctor> l);
	public List<Doctor> planification(List<Doctor> l);

}
