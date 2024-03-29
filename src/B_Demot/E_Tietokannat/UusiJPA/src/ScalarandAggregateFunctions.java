import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggregateFunctions {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entitymanager = emfactory.createEntityManager();

		// Scalar function
		// Query query = entitymanager.createQuery("Select UPPER(e.ename) from Employee e");
		// Query query = entitymanager.createQuery("Select e.ename from Employee e");
		Query query = entitymanager.createQuery("Select e.ename from Employee e where e.salary between 40000 and 60000");
		List<String> list = query.getResultList();

		for (String e : list) {
			System.out.println("Employee NAME : " + e);
		}

		// Aggregate function
		Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
		Double result = (Double) query1.getSingleResult();
		System.out.println("Max Employee Salary :" + result);
	}
}