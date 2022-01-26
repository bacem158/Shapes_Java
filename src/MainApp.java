import java.io.*;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args)  {
		int choix = 0;
        Scanner sc = new Scanner(System.in);
        
        while(choix != 1 && choix != 2) {
		System.out.println("1 . Draw a Triangle \n"
			           	+ "2 . Draw a Square");
		choix = sc.nextInt();
		}
        
        if (choix == 1) {
			Triangle T1 = new Triangle(choix, choix);

			File directory = new File("c:\\java\\Shapes\\");
			if(!directory.exists()) {
	    	directory.mkdirs();
			}
			
			try{
			File file = new File("c:\\java\\Shapes\\"+T1+".txt");
			FileWriter out = new FileWriter(file);
			out.write(T1.draw());
			out.close();
			System.out.println("Triangle Created :)");
			}catch (IOException e) {
			System.out.println("file write error");
			}
		}
        
        	else if (choix == 2) {
			Triangle S1 = new Triangle(choix, choix);

			File directory = new File("c:\\java\\Shapes\\");
			if(!directory.exists()) {
	    	directory.mkdirs();
			}
			
			try{
			File file = new File("c:\\java\\Shapes\\"+S1+".txt");
			FileWriter out = new FileWriter(file);
			out.write(S1.draw());
			out.close();
			System.out.println("Triangle Created :)");
			}catch (IOException e) {
			System.out.println("file write error");
			}
		}
        
        	else {
    			System.out.println("Choice inexistant");
    		}

	}

}
