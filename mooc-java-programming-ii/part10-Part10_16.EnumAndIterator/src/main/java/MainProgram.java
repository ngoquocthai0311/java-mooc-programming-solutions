
public class MainProgram {

    public static void main(String[] args) {
        // test your classes here
        Employees t = new Employees(); 
        Person h = new Person("Adasdsadsto", Education.PHD); 
        t.add(h); 
        t.print(Education.PHD); 
        // expected output: "Arto, PHD"
    }               
}
