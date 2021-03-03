package com.au.Employee;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.au.util.SessionUtil;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

@SuppressWarnings("deprecation")
public class Manager {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0, id = 0;
		boolean ch = true;
		while (ch) {
			System.out.println(
					"Employee database \n Enter your choice \n1. Create Employee \n2. Update All Employee \n3. Update Employee by id \n4. Delete employee by id  \n5. Get All Employee \n6. Get Employee by id\n7. Exit");
			choice = Integer.parseInt(s.nextLine());
			switch (choice) {
			case 1:
				addEmployee();
				break;

			case 2:
				updateAllEmployee();
				break;

			case 3:
				System.out.println("Enter id to update Employee Details");
				id = Integer.parseInt(s.nextLine());
				updateEmployee(id);
				break;

			case 4:
				System.out.println("Enter id to remove Employee Details");
				id = Integer.parseInt(s.nextLine());
				System.out.println("Are you sure you want to remove ? \n1 - Yes\n0-No");
				int cnf = Integer.parseInt(s.nextLine());
				if (cnf == 1)
					removeEmployee(id);
				break;

			case 5:
				getAllEmployees();
				break;

			case 6:
				System.out.println("Enter id to display Employee Details");
				id = Integer.parseInt(s.nextLine());
				getEmployee(id);
				break;

			case 7:
				System.out.println("Exited");
				ch = false;

			default:
				break;
			}
		}
	}

	public static void addEmployee() {
		Session session = SessionUtil.getSession();
		try {
			Transaction tnx = session.beginTransaction();
			Employee e1 = new Employee();
			System.out.println("Enter First Name:");
			String fn = s.nextLine();
			e1.setFname(fn);
			System.out.println("Enter Last Name:");
			e1.setLname(s.nextLine());
			System.out.println("Enter Designation:");
			e1.setDesignation(s.nextLine());
			System.out.println("Enter DOB:");
			Date d = java.sql.Date.valueOf(s.nextLine());
			e1.setDob(d);
			System.out.println("Enter Age:");
			e1.setAge(s.nextLine());
			System.out.println("Enter Salary:");
			e1.setSalary(Integer.parseInt(s.nextLine()));
			session.save(e1);
			tnx.commit();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			System.out.println("Successfully saved....");
		}
	}

	public static void updateAllEmployee() {
		Session session = SessionUtil.getSession();
		try {
			Transaction tnx = session.beginTransaction();
			System.out.println("Enter new designation you want to update");
			String newDesignation = s.nextLine();
			Query query = session.createQuery("from Employee");
			List<Employee> empList = query.list();
			if (empList == null)
				System.out.println("No Employee exists!");
			else {
				for (Employee emp : empList) {
					emp.setDesignation(newDesignation);
					session.update(emp);
				}

				tnx.commit();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			System.out.println("Successfully Updated....");
		}
	}

	public static void updateEmployee(int id) {
		Session session = SessionUtil.getSession();
		try {
			Transaction tnx = session.beginTransaction();
			System.out.println("Enter the new designation");
			String newDesignation = s.nextLine();
			Employee emp = (Employee) session.get(Employee.class, id);
			if (emp == null)
				System.out.println("No Employee exists with such Id, please re-enter correct id");
			else {
				emp.setDesignation(newDesignation);
				session.update(emp);
				System.out.println("Updated Employee Details are: ");
				getEmployee(id);
				tnx.commit();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			System.out.println("Successfull");
		}
	}

	public static void removeEmployee(int id) {
		Session session = SessionUtil.getSession();
		try {
			Transaction tnx = session.beginTransaction();
			Employee emp = (Employee) session.get(Employee.class, id);
			if (emp == null)
				System.out.println("No Employee exists with such Id, please re-enter correct id");
			else {
				session.delete(emp);
				tnx.commit();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			System.out.println("Successfull");
		}
	}

	private static void getAllEmployees() {
		Session session = SessionUtil.getSession();
		try {
			Query q = session.createQuery("from Employee");
			List<Employee> employees = (List<Employee>) q.list();
			System.out.println("|\tid\t|\t name \t| \tage\t | \tsalary \t| \tDOB\t |\t Designation\t |");
			for (Employee emp : employees) {
				System.out.println("|\t" + emp.getEid() + "\t|\t" + emp.getFname() +" "+ emp.getLname() + "\t|\t"
						+ emp.getAge() + "\t|\t" + emp.getSalary() + "\t|\t" + emp.getDob() + "\t|\t"
						+ emp.getDesignation() + "\t|");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			session.close();
			System.out.println("Successfull");
		}
	}

	public static void getEmployee(int id) {
		Session session = SessionUtil.getSession();

		Transaction tnx = session.beginTransaction();
		try {
			Employee emp = (Employee) session.get(Employee.class, id);
			if (emp == null)
				System.out.println("No Employee exists with such Id, please re-enter correct id");
			else {

				System.out.println("|\tid\t|\t name \t| \tage\t | \tsalary \t| \tDOB\t |\t Designation\t |");

				System.out.println("|\t" + emp.getEid() + "\t|\t" + emp.getFname()  +" "+ emp.getLname() + "\t|\t"
						+ emp.getAge() + "\t|\t" + emp.getSalary() + "\t|\t" + emp.getDob() + "\t|\t"
						+ emp.getDesignation() + "\t|");

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			tnx.commit();
			session.close();
			System.out.println("Successfull");
		}
	}

}