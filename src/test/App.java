package test;

import figures.Cercle;
import figures.Point;

public class App {

	public static void main(String[] args) {
		Point p = new Point(100,100);
		Cercle c1 = new Cercle(p, 50);
		Cercle c2 = new Cercle(new Point(150, 150), new Point(200,200));
		System.out.println("Perimetre du cercle "+c1.toString()+ " est : "+c1.getPerimetre());
		System.out.println("Surface du "+c2+ " est :"+c2.getSurface());
		Point p1 = new Point(130, 130);
		if((c1.appartient(p1)==true)&&(c2.appartient(p1)))
			System.out.println(p+ "appartient a l'intersection de " +c1+ " et " +c2);
		else
			System.out.println(p+ "n'appartient  pas a l'intersection de " +c1+ " et " +c2);

}
}
