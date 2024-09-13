public class FindFact{

public static int findFactorial(int num){
if(num==1){
return 1;
}
return n*findFactorial(num-1);
}
public static void main(String[] args){
	int result= findFactorial(5);
	System.out.println("result is:"+result);
}}