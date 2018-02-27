package HR;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Person client1 = new Client("Yura", "Sony");
        Client client2 = new Client("Petya", "Philips");

        Employee manager1 = new Manager("Ivan", "boss manager");
        Manager manager2 = new Manager("Stepan", "slow manager");

        SysAdmin sysAdmin1 = new SysAdmin("Kostya", "boss sysadmin");

        Worker worker1 = new Worker("Alex", "cleaner");

        Person[] allPeopleList = new Person[]{client1, client2, manager1,manager2, sysAdmin1, worker1};
        Employee[] employeesList = new Employee[allPeopleList.length];
        Manager[] managersList = new Manager[allPeopleList.length];
        Client[] clientsList = new Client[allPeopleList.length];

        // get all employees
        for (int i = 0, j = 0; i < allPeopleList.length; i++) {
            if (allPeopleList[i] instanceof Employee) {
                employeesList[j] = (Employee) allPeopleList[i];
                j++;
            }
        }

        // get all managers;
        for (int i = 0, j = 0; i < allPeopleList.length; i++) {
            if (allPeopleList[i] instanceof Manager) {
                managersList[j] = (Manager) allPeopleList[i];
                j++;
            }
        }

        // get all clients
        for (int i = 0, j = 0; i < employeesList.length; i++) {
            if (allPeopleList[i] instanceof Client) {
                clientsList[j] = (Client) allPeopleList[i];
                j++;
            }
        }

        for(Employee a : employeesList) {
            if (a != null) {
                System.out.println("Employees: " + a.getName() + " - " + a.getProfession());
            }
        }

        for(Manager a : managersList) {
            if (a != null) {
                System.out.println("Managers: " + a.getName() + " - " + a.getProfession());
            }
        }

        for(Client a : clientsList) {
            if (a != null) {
                System.out.println("Clients: " + a.getName() + " - " + a.getCompanyName());
            }
        }
    }
}
