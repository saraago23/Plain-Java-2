package objektetSeanca12.ushtrimi1;

public class Main {
    public static void main(String[] args) {

        Person personi1=new Person("Sara","saraago@hotmail.com");
        System.out.println("Sara eshte: " + personi1);

        Student studenti1 = new Student(3,9.8);
        studenti1.setEmer("Sara");
        studenti1.setAdrese("saraago@hotmail.com");
        System.out.println("Studenti eshte: " + studenti1);

        Pedagog pedagog1 = new Pedagog(2,600);
        pedagog1.setEmer("Lorenc");
        pedagog1.setAdrese("lorenc@gmail.com");
        System.out.println("Lorenci eshte: " + pedagog1);
    }
}