import java.util.*;
import java.io.*;
public class Average{
	public static double average(ArrayList<Integer> a) {
		return a.stream().mapToInt(i->i).average().getAsDouble();
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0;i<n;i++) {
            int k=input.nextInt();
			a.add(k);
		}
		double result = average(a);
		System.out.println(result);
	}

}