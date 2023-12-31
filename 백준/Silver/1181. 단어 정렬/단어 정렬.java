import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class Main {
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		List<String> n = new ArrayList<String>(20010);
		for(int i =0; i<T; i++){
			String temp= br.readLine();
			if(!n.contains(temp)) {
                n.add(temp);
            }
		}
		Comparator<String> myComparator = new Comparator<String>() {
			  public int compare(String x, String y) { 
				  if(x.length()>y.length()){ // 클때
					  return 1;
				  }
				   else if(x.length()==y.length()){
					  return x.compareTo(y);
                      // compareTo() 같을때 0, 클때 1, 작을때 -1;
				  }
				  return -1; // 작을때
			  }
			};
		Collections.sort(n, myComparator);
		for(int i =0; i<n.size(); i++){
			System.out.println(n.get(i));
		}
	}
}
