package wiev;

import business.concretes.CustomerManager;
import dao.concretes.CustomerDao;
import entities.Customer;

import java.lang.invoke.CallSite;
import java.time.LocalDate;
import java.util.concurrent.Callable;

public class App {
    public static void main(String[] args) {

       //kullanıcı ekledim
        CustomerManager customerManager=new CustomerManager(new CustomerDao());
        /*
       Customer customer=new Customer();
       customer.setName("Spring Dersleri");
       customer.setMail("info@patika.dev");
       customer.setGender(Customer.GENDER.FEMALE);
       customer.setOnDate(LocalDate.now());
       customerManager.save(customer);

        //yazdıgım customerı ekrana bastırdım
        Customer firstCustomer=customerManager.findById(1);
        System.out.println(firstCustomer.toString());
*/
    }
}
