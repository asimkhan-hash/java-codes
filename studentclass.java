package classstudent;

public class studentclass
{

    public static class student{

        String name;
        int age;
        int rno;
        double percent;
    }

    public static void main(String[] args) {
        student x = new student ();
        x.name = "Asim";
        x.age = 20 ;
        x.rno = 13;
        x.percent = 89;
        System.out.println(x.name + " " + x.age + " " + x.rno + " " + x.percent );

    }
}
