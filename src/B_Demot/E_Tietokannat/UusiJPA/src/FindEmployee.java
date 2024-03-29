import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindEmployee {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entitymanager = emfactory.createEntityManager();
		Employee employee = entitymanager.find(Employee.class, 1301);

		System.out.println("employee ID = " + employee.getEid());
		System.out.println("employee NAME = " + employee.getEname());
		System.out.println("employee SALARY = " + employee.getSalary());
		System.out.println("employee DESIGNATION = " + employee.getDeg());
	}
}