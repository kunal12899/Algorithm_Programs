interface Eatable{
	void eat();
}

class Test1{
	
public static void main(String args[])
{
	
Eatable e= new Eatable(){
	
public void eat(){
	
	System.out.println("Inside inner class");
}
};
e.eat();
}


}
