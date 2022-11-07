******Question number 01******

/**
 *Inteface
 */

public interface Measurable {
    double getMeasurable();
}


/**
 * Sub Class Quiz
 */

public class Quiz implements Measurable{
    private double score;
    public Quiz(double ascore) {
        score = ascore;


    }


    @Override
    public double getMeasurable() {
        return score;
    }


}

/**
 * Data Class
 */

public class Data {
    public static double max(Measurable[] objects) {
        if (objects.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Measurable obj : objects) {
            sum = sum + obj.getMeasurable();

        }
        if (objects.length > 0) {
            return sum / objects.length;
        }
        else {
            return 0;
        }
    }

    public static double max1(Measurable[] objects) {
        if (objects.length == 0) {
            return 0;
        }
        Measurable max = objects[0];
        for (int i = 0; i < objects.length; i++) {
            Measurable mn = objects[i];
            if (mn.getMeasurable() > max.getMeasurable()) {
                max = mn;
            }
        }
        if (objects.length > 0) {
            return max.getMeasurable();

        }
        else
            return  0;
    }
}


/**
 * Tester Class
 */

public class QuizeTester {
    public static void main(String[] args) {
        Measurable [] m = new Quiz[3];
        m[0] = new Quiz(90);
        m[1] = new Quiz(88);
        m[2] = new Quiz(85);


        double avg = Data.max1(m);
        double max = Data.max1(m);
        System.out.println("The Average is "+max);



    }
}

//********************************************//
*********Question Number 02**********


/**
 * Interface Measurable
 */

public interface Measurable {
    double getMeasurable();
}

/**
 * Sub Class Quiz
 */

public class Quiz implements Measurable {
    private double score;
    private String Grade;

    public Quiz(double ascore, String agrade) {
        score = ascore;
        Grade = agrade;

    }
    public double getScore() {
        return score;
    }
    public String getGrade(){
        return Grade;
    }
    @Override
    public double getMeasurable() {
        return score;
    }

}


/**
 * Tester Class
 */

public class QuizeTester {
    public static void main(String[] args) {
        Measurable [] m = new Quiz[3];
        m[0] = new Quiz(90,"A+");
        m[1] = new Quiz(88,"A");
        m[2] = new Quiz(85,"A-");

        double avg = Data.max(m);
        Quiz max = (Quiz) Data.max1(m);
        System.out.println("The Average is "+avg);
        System.out.println("The Maximum Number is "+max.getScore());
        System.out.println("The Maximum Grade is "+max.getGrade());



    }
}


/**
 * Data Class
 */

public class Data implements Measurable {
    public static double max(Measurable[] objects) {
        if (objects.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Measurable obj : objects) {
            sum = sum + obj.getMeasurable();

        }
        if (objects.length > 0) {
            return sum / objects.length;
        } else return 0;
    }

    public static Measurable max1(Measurable[] objects) {
        if (objects.length == 0) {
            return null;
        }
        Measurable max = objects[0];
        for (int i = 0; i < objects.length; i++) {
            Measurable mn = objects[i];
            if (mn.getMeasurable() > max.getMeasurable()) {
                max = mn;
            }
        }
        if(objects.length>0) {
            return max;
        }
        else
        {
            return null;
        }

    }

    @Override
    public double getMeasurable() {
        return 0;
    }
}


//***************************************************//
**********Question Number 03*************


/**
 * Interface
 */

public interface Person {
    double getMeasure();
}


/**
 * SubClass Quiz
 */


public class Quiz implements Person{
    private String name;
    private double height;

    public Quiz(String aname, double aheight) {
        name = aname;
        height = aheight;
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public double getMeasure() {
        return height;
    }
}

/**
 * SubClass Data
 */


public class Data  {

    public static double average(Person[]objects){
        double sum = 0;
        for(Person obj:objects){
            sum = sum + obj.getMeasure();
        }
        return sum/objects.length;
    }
    public static Person getMax(Person[]objects){
        if(objects.length<0)
        {
            return null;
        }
        Person max = objects[0];
        for(int i=0;i<objects.length;i++){
            if(objects[i].getMeasure()>max.getMeasure()){
                max = objects[i];
            }
        }
        return max;
    }
}


/**
 * Tester Class/Main Class
 */



public class PersonTester {
    public static void main(String[] args) {
        Person person[] =  new Quiz[3];
        person[0] = new Quiz("Al-Amin",70);
        person[1] = new Quiz("Rakib",66);
        person[2] = new Quiz("Tamim ", 65);

        double average = Data.average(person);
        Quiz max = (Quiz) Data.getMax(person);
        System.out.println("The average height (in inch) :"+average);
        System.out.println("The name of the tallest Person:"+max.getName());
    }
}


//******************************************************//
************Question Number 04*********************



/**
 * Interface Measure
 */


public interface Measure {
    public double getMeasure();
}

public class Quiz implements Measure{


    private double score;

    public Quiz(double ascore) {
        score = ascore;
    }

    public static double largest(Measure[]object){
        double max = 0;
        for(Measure obj:object){
            if(obj.getMeasure()>max){
                max = obj.getMeasure();
            }
        }
        return max;
    }
    public static double smallest(Measure[]object) {
        double min = object[0].getMeasure();
        for (Measure obj : object) {
            if (obj.getMeasure() < min) {
                min = obj.getMeasure();
            }
        }
        return min;
    }
    @Override
    public double getMeasure() {
        return score;
    }
}


/**
 * Tester Class Measure Tester
 */


public class MeasureTester {
    public static void main(String[] args) {
        Measure measure[] = new Quiz[3];
        measure[0] = new Quiz(125);
        measure[1] = new Quiz(122);
        measure[2] = new Quiz(125);
        double mx = Quiz.largest(measure);
        double mn = Quiz.smallest(measure);
        System.out.println("The largest value is:  "+mx);
        System.out.println("The Smallest Number is:  "+mn);
    }
}
//*********************************************************//

*****************Question Number 08****************
/**
 *After Adding The method.
 */



public class Data {
    public static Measurable max1(Object[]objects) {
        if (objects.length == 0) {
            return null;
        }
        Measurable max = (Measurable) objects[0];
        for (int i = 0; i < objects.length; i++) {
            Measurable mn = (Measurable) objects[i];
            if (mn.getMeasurable() > max.getMeasurable()) {
                max = mn;
            }
        }
        if(objects.length>0) {
            return max;
        }
        else
        {
            return null;
        }

    }

}



**********Question Number 09*************



public class Data
{
    public static double average (Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if(objects.length > 0) {return sum / objects.length;}
        return 0;
    }

    public static double average(Object[] objects, Measurer meas)
    {
        double sum = 0;
        for (Object obj : objects)
        {
            sum = sum + meas.measure(obj);
        }
        if (objects.length > 0) {return sum/objects.length;}
        else {return 0;}
    }
    public static Object max(Object[] objects, Measurer m) {
        double maxMeasure = m.measure(0);
        int maxIndex = 0;
        for (int i=0; i< objects.length; i++)
        {
            Object obj = objects[i];
            if(maxMeasure<m.measure(i)){
                maxMeasure = m.measure(i);
                maxIndex = i;
            }
        }
        return objects[maxIndex];
    }
}


//***************************************************//
************Question Number 10***************



/**
 * Interface
 */


public interface Comparable {
    public double getValue();
    public String getName();
}

/**
 * Coin Class/Subclass
 */


public class Coin implements Comparable{

    private double value;
    private String name;

    public Coin(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public double getValue() {
        return value;
    }
}

public class CashResister {
    private double purchase;
    private double payment;

    public CashResister(double purchase, double payment) {
        this.purchase = purchase;
        this.payment = payment;
    }

    /**
     * CashresisterClass/Subclass
     */


    public CashResister() {

    }

    public void recordPurchase(double ammount){
        purchase = ammount+purchase;
    }
    public void recievePayment(int coinCount,Coin coinType){
        payment = payment + coinCount*coinType.getValue();
    }
    public double giveChange(){
        double change = payment - purchase;
        return change;
    }

}

/**
 * Tester Class/Main Class
 */

public class CoinTester {
    public static void main(String[] args) {
        final Coin DOLLAR = new Coin(1.0,"Dollar");
        final Coin Quarter = new Coin(.25,"Quarter");
        CashResister resister = new CashResister();
        resister.recordPurchase(1.95);
        resister.recordPurchase(5.95);
        resister.recievePayment(3,DOLLAR);
        resister.recievePayment(2,Quarter);
        double change = resister.giveChange();
        System.out.println("Change :"+change);

    }
}

//************************************************************//
************Question Number 13****************


/**
 * Main Class
 */



        import java.util.ArrayList;
        import java.util.Collections;
public class BagTester {
    public static void main(String[] args) {


        ArrayList<String> bag = new ArrayList<String>();
        bag.add("Red Ball");
        bag.add("Bat");
        bag.add("Laptop");
        bag.add("Red Ball");
        bag.add("Novel");
        bag.add("Novel");
        System.out.println("Red ball: "+Collections.frequency(bag,"Red Ball"));
        System.out.println("Bat:"+Collections.frequency(bag,"Bat"));
        System.out.println("Laptop:"+Collections.frequency(bag,"Laptop"));
        System.out.println("Novel:"+Collections.frequency(bag,"Novel"));


    }
}

/*
Md.Al-Amin Babu
Department of Computer Science & Engineering
session 2020-21
University of Rajshahi.
Assignment: Interfacing
*/