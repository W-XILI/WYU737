package Day04;

public class TakeTemperatureThread extends Thread{
    private int number = 100;
    private double temperature = 36.0 + Math.random();
    @Override
    public void run() {
        try{
            temperature();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void temperature(){
        Student student = new Student(100);
        int i = student.getID();
        for( ; i>=0 ; i--){
            Thread thread = Thread.currentThread();
            System.out.println("编号"+i+"的学生的温度为"+this.temperature);
        }
    }


    public static void main(String[] args) {
        TakeTemperatureThread t1 = new TakeTemperatureThread();
        TakeTemperatureThread t2 = new TakeTemperatureThread();
        TakeTemperatureThread t3 = new TakeTemperatureThread();
        TakeTemperatureThread t4 = new TakeTemperatureThread();
        TakeTemperatureThread t5 = new TakeTemperatureThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
