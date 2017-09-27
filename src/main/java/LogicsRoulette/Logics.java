package LogicsRoulette;

import SeleniumEnter.Enter;
import SeleniumEnter.Parsing;

import java.util.List;

/**
 * Created by Borovsky on 27.09.2017.
 */
public class Logics {
    public void logics(){
        Parsing parsing = new Parsing();
        parsing.parsing();
        List<Integer> dozen = parsing.getDozen();
        int a = dozen.get(0);
        int b = dozen.get(1);
        int c = dozen.get(2);
        int d = dozen.get(3);
        System.out.println("logics");
        if ((a+b+c+d==4)){
            Enter enter = new Enter("dozen1");
        }
        if ((a+b+c+d==8)&&(a==b)&&(a==c)&&(c==d)){
            Enter enter = new Enter("dozen2");
        }
        if ((a+b+c+d==12)&&(a==b)&&(a==c)&&(c==d)){
            Enter enter = new Enter("dozen3");
        }
    }


}

