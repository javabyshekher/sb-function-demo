package in.ashokit.runner;

import in.ashokit.repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        double bonus = employeeDao.getBonus(7788);
        System.out.println("empno : 7788");
        System.out.println("bonus : " + bonus);
    }
}
