package threads.ThreadUsingExecuters;

import java.util.concurrent.locks.ReentrantLock;

public class EmployeSalary implements Runnable{
    private final ReentrantLock lock=new ReentrantLock();//this is loking

    Employee emp;
    public EmployeSalary(Employee emp) {
        this.emp=emp;
    }

    @Override
    public void run() {
        lock.lock();
        double salary= emp.getBasicsalary()*emp.getDays();
        emp.setSalary(salary);
        lock.unlock();
    }
}
