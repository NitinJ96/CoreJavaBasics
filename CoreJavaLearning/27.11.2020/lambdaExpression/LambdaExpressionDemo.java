package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();  
	       list.add("Nitin");         
	       list.add("Pradeep");       
	       list.add("Nirmal");         
	       list.add("Arun");         
	       list.add("Joel");                
	       list.forEach(          
	           // lambda expression        
	           (names)->System.out.println(names)         
	       ); 
	}

}
