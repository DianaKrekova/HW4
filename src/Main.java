import ru.mirea.krekova4.Circle;
import ru.mirea.krekova4.Rectangle;
import ru.mirea.krekova4.Shape;
import ru.mirea.krekova4.Square;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Shape[] arrS=new Shape[5];
        arrS[0]=new Circle(4);
        arrS[1]=new Rectangle(2,8);
        arrS[2]=new Square("red", true,5);
        arrS[3]=new Square(6);
        arrS[4]=new Circle("green", false, 3);
        for (int i=0;i<5;i++){
            System.out.println(arrS[i].toString());
            System.out.println("Площадь: " + arrS[i].getArea());
            System.out.println("Перимитер: " + arrS[i].getPerimeter()+'\n');
        }
    }
}