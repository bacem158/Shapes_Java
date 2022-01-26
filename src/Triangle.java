import java.util.Scanner;

public class Triangle extends Shape implements Geometry{

	public Triangle(int size, int num) {
		super(size,num);
	}
	
    Scanner sc = new Scanner(System.in);

	@Override
	public String draw() {
		System.out.println("Give a Size : ");
		setSize(sc.nextInt());
		for (int i = 1; i <= getSize(); i++) {
			  
            for (int j = getSize(); j >= i; j--) {
                System.out.print(" ");
            }
  
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
  
            System.out.println();
		}
		return draw();
	}

	
}