package com.ethan.service;

import com.ethan.dao.CustomerDao;
import com.ethan.dao.LinkManDao;
import com.ethan.domain.Customer;
import com.ethan.domain.LinkMan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * TODO
 *
 * @author Ethan
 * @version 1.0
 * @date 2023/08/13/ 17:40
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private LinkManDao linkManDao;


    /**
     * 导航查询
     *
     * @param
     * @return void
     * @author Ethan
     */
    public void testQuery() {
        LinkMan linkMan = linkManDao.getOne(1l);
        // 对象导航查询所属的客户
        Customer customer = linkMan.getCustomer();
        System.out.println(customer);
        System.out.println(linkMan);
    }

    public void testQuery1() {
        Customer customer = customerDao.findByCustName("百度1");
        Set<LinkMan> linkMans = customer.getLinkMans();

        System.out.println(customer);
        System.out.println(linkMans);
    }

    /**
     * 级联添加
     */
    public void testCascadeAdd() {
        Customer customer = new Customer();
        customer.setCustName("百度1");

        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("小李1");

        linkMan.setCustomer(customer);
        customer.getLinkMans().add(linkMan);

        customerDao.save(customer);
    }

    @Transactional
    public void testTransaction() {
        Customer customer = new Customer();
        customer.setCustName("百度11111");
        customerDao.save(customer);
        int a = 1 / 0;
    }


}
