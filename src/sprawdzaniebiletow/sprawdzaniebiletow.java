package sprawdzaniebiletow;
import javax.swing.*;
public class sprawdzaniebiletow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noEntry = 0;
		int entry = 0;
		int count = 0;
		
		while (count < 5)
		{
			int age = Integer.parseInt(JOptionPane.showInputDialog("Wprowadz wiek. Wejscie od 19 lat"));
			if (age > 18)
			{
				System.out.println(age + ": Wejdz");
			}
			else
			{
				System.out.println(age + ": Wyjdz");
			}
			count++;
		}
		System.out.println(noEntry + " nie mo¿esz wejsc");
		System.out.println(entry + " mozesz wejsc");
		System.out.println((entry*20) + "% testuj¹cych program");
	}

}
