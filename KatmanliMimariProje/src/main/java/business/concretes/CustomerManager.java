package business.concretes;

import business.abstracts.ICustomerService;
import dao.ICustomerDao;
import entities.Customer;

import java.util.List;

public class CustomerManager implements ICustomerService {
    private final ICustomerDao customerDao;

    //Dependency Injection
    public CustomerManager(ICustomerDao customerDao){
        this.customerDao=customerDao;
    }


    @Override
    public void save(Customer customer) {
       Customer checkMailCustomer=this.customerDao.findByMail(customer.getMail());
       if (checkMailCustomer!=null){
           throw new RuntimeException(customer.getMail()+"bu mail adresi daha önce eklenmiş");
       }
       this.customerDao.save(customer);

    }

    @Override
    public Customer findById(int id) {
        return this.customerDao.findById(id);
    }

    @Override
    public void update(Customer customer) {
        Customer checkMailCustomer=this.customerDao.findByMail(customer.getMail());
        if (checkMailCustomer!=null&&checkMailCustomer.getId()!=customer.getId()){
            throw new RuntimeException(customer.getMail()+"bu mail adresi daha önce eklenmiş");
        }
        this.customerDao.update(customer);
    }

    @Override
    public void deleteById(Customer customer) {

    }

    @Override
    public void deleteById(int id) {
        Customer customer=this.findById(id);
        this.customerDao.delete(this.findById(id));

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
