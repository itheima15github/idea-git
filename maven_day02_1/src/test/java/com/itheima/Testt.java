package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testt {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsDao dao = ac.getBean(ItemsDao.class);
        Items items = dao.findById(1);

        System.out.println(items);
    }

    @Test
    public void test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsService service = ac.getBean(ItemsService.class);
        Items items = service.findById(1);

        System.out.println(items);
    }
}
