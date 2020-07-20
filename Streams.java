
import java.util.*;
import java.util.function.Function;
public class Streams{
	public static ArrayList<String> palindromeCheck(ArrayList<String>l){
        ArrayList<String> palindromes=new ArrayList<>();
        for(String str:l){
            int i=0,j=str.length()-1,f=0;
            while(i<j){
                if(str.charAt(i)!=str.charAt(j)){
                    f=1;
                    break;
                }
                i++;j--;
            }
            if(f==0) palindromes.add(str);
        }
        return palindromes;
    }
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int size=input.nextInt();
		ArrayList<String>list=new ArrayList<String>();
		for(int i=0;i<size;i++){
			list.add(input.next());
		}
		Function<ArrayList<String>,ArrayList<String>>palindromelist=Streams::palindromeCheck;
		ArrayList<String> listOfStrings=palindromelist.apply(list);
		System.out.println(listOfStrings);
		input.close();
	}

}
