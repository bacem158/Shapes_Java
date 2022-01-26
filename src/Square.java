import java.util.Scanner;

public class Square extends Shape implements Geometry{
	
	public Square(int size, int num) {
		super(size,num);
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public String draw() {
		System.out.println("Give a Size : ");
		setSize(sc.nextInt());
		for(int i = 1; i <= getSize(); i++)
		{
			for(int j = 1; j <= getSize(); j++)
			{
				System.out.print("*"); 
			}
			System.out.print("\n"); 
		}
		return null;
	}

}
