import com.zwz.po.EmpEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    //    获取 SessionFactory    会话工厂
    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
    //        生产会话  通过opensession  获取session对象
    Session session=sessionFactory.openSession();
    //        开启事务
    Transaction transaction = session.beginTransaction();
    @org.junit.Test
    public void Test() {

//        执行查询  查询的类型   查询的参数
        EmpEntity empEntity1=session.load(EmpEntity.class,1);
        System.out.println("emp="+empEntity1);
//提交事务
        transaction.commit();
//        关闭事务
        session.close();
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
//        EmpEntity empEntity=session.load(EmpEntity.class,1);
//       System.out.println("emp="+empEntity);
//        Query query=session.createQuery("form emp where id=?");
//        query.setParameter(0,1);
//        Object o=query.uniqueResult();
//        System.out.println("o="+o);
//        SQLQuery sq1Query = session.createSQLQuery("select * from emp");
//        sq1Query.addEntity(EmpEntity.class);
//        List<EmpEntity> list1 = sq1Query .list();
//        for (EmpEntity emp : list1) {
//            System . out. println("emp = " + emp) ;


            SQLQuery sq1Query = session.createSQLQuery("INSERT INTO emp(emp.id,emp.jobId,emp.`name`,emp.age,emp.salary,emp.dept) VALUES(?,?,?,?,?,?)");
            sq1Query.addEntity(EmpEntity.class);
            List<EmpEntity> list1 = sq1Query .list();
            for (EmpEntity emp : list1) {
                System . out. println("emp = " + emp) ;
        }



    }
}