package jdbc;


	public class MainClass {

		public static void main(String[] args) {
			JdbcExample j = new JdbcExample();

			// Inserting one customer
			j.insertCustomer(103, "Karan", "Pune", 3457, 45000);

			// Inserting 5 customer
			j.insertCustomer(104, "Shiva", "Akola", 5679, 7800);

			j.insertCustomer(105, "Ravi", "Mumbai", 4567, 34000);

			j.insertCustomer(106, "Manish", "Nanded", 5679, 60800);

			j.insertCustomer(107, "Hari", "Pune", 8766, 50800);

			j.insertCustomer(109, "Ramesh", "Bhopal", 1267, 8000);

			// update the balance

			j.updateBalance(104, 65000);

			// Delete the Row
			j.delete(104);

			// List the Customer
			j.getCustomerDetails();

			// Get customer details with id
			j.getCustomerWithId(102);

		}

	}



