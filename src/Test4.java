import java.util.Scanner;

/**
 * Created by Софист on 10.06.2016.
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("Пользовател,введите,периметр какого n-угольника вы хотите просчитать на оси 0xy координат с задаными значениями x1,y1,x2,y2,...,xn,yn");

        System.out.println("Пользователь,введи значение равное количеству вершин ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//..
        System.out.println("Значение n = " + n + "-угольник .");
        double[][] massivXY = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Пользователь,введи координаты " + (i + 1) + "-ой вершины");
            System.out.println("значение 'x' для координат 0xy");
            massivXY[i][0] = scanner.nextDouble();
            System.out.println("значение 'y' для координат 0xy");
            massivXY[i][1] = scanner.nextDouble();
        }

        System.out.println("Вершины " + n + "-угольника:");
        for (int i = 0; i < n; i++)
            System.out.println("(" + massivXY[i][0] + " ; " + massivXY[i][1] + ")");

        Otrezok4 value = new Otrezok4();

        System.out.println("Значение периметра " + n + "-угольника равно " + value.perimetrNUgolnika(massivXY));
    }
}
