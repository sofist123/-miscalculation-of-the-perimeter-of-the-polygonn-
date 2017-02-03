/**
 * Created by Софист on 10.06.2016.
 */
public class Otrezok4 {
  //  public double dlinaAB(double ax, double ay, double bx, double by) {
  //      return (Math.sqrt((bx - ax) * (bx - ax) + (by - ay) * (by - ay)));
  //  }

    //Следующий метод отличается от предыдущего тем,что в нем есть вывод на консоль промежуточных значений отрезков

    public double dlinaAB(double ax, double ay, double bx, double by) {
        double l=(Math.sqrt((bx - ax) * (bx - ax) + (by - ay) * (by - ay)));
        System.out.println("Расстояние между точками (" + ax + " ; " +ay + ") и (" + bx + " ; " +by + ") равно " + l);
        return l;
    }

    public double perimetrNUgolnika(double[][] massivXY) {
        int n = massivXY.length;
        double p = dlinaAB(massivXY[0][0],massivXY[0][1],massivXY[n-1][0],massivXY[n-1][1]);
        for (int i = 0; i < n-1; i++) {
            p += dlinaAB(massivXY[i][0],massivXY[i][1],massivXY[i+1][0],massivXY[i+1][1]);
        }
        return p;
    }

}
