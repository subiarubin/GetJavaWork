
class BiCycle{
 String define_me(){
 return "a vehicle with pedals.";
 }
}
class MotorCycle extends BiCycle{




 String define_me1()
{
 return "a cycle with an engine.";
 }
 MotorCycle()
 {
 System.out.println("Hello I am a  motorcycle, I am "+ define_me1());
 String temp=define_me(); //Fix
 
 System.out.println("My ancestor is a cycle "+"who is "+ temp );
 }
}
class Solution{
 public static void main(String []args)
 {
 MotorCycle M=new MotorCycle();
 }
 
}
 

