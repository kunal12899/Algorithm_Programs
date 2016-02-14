class TestMemberOuter1{
 private int data=30;
 class Inner{
  void msg(){System.out.println("data is "+data);}
 }
 
 void display(){
  Inner in=new Inner();
  in.msg();
 }
 public static void main(String args[]){
  TestMemberOuter1 obj=new TestMemberOuter1();
  obj.display();
  System.out.println("NOw using inner class method");
  TestMemberOuter1.Inner inm= obj.new Inner();
  inm.msg(); 

 }
}



/*System.out.println("NOw using inner class method");
TestMemberOuter2.Inner inm= obj.new Inner();
inm.msg();   */