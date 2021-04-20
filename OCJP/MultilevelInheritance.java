class Animal{  
  void eat(){
      System.out.println("eating...");
      }  
}  
class Dog extends Animal{  
  void bark(){
      System.out.println("barking...");
      }  
}  
class Babydog extends Dog{
    void weep()
    {
        System.out.println("weeping...");
    }
}
class MultilevelInheritance{  
public static void main(String args[]){  
     Babydog b=new Babydog();  
     b.bark();  
     b.weep();
     b.eat();  
}
}  