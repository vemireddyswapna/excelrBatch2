public class Demo011 {
    class Parent {
        public String Name = "Hitler";
        
        void parentDetails() {
            System.out.println("Parent's name is " + Name);
        }
    }
    
    class Child extends Parent {
        String Son = "Jean Marie";
        
        void childDetails() {
            System.out.println("Son's full name is " + super.Name + ". " + Son);
        }
    }
    
    public static void main(String[] args) {
        Demo011 demo = new Demo011(); // Create an instance of Demo011
        
        Parent pobj = demo.new Parent(); // Create an instance of Parent class
        pobj.parentDetails(); // Call method of Parent class
        
        Child cobj = demo.new Child(); // Create an instance of Child class
        cobj.childDetails(); // Call method of Child class
    }
}
