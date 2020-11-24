public class StudentTest {

    public static void main(String[] args) {
        
        Student student = new Student("鈴木一朗");
        student.take("国語",2, 90);
        System.out.println(student.getGPA());
        System.out.println(student.getTotalUnit());
        System.out.println(student.judge());
    }
  }