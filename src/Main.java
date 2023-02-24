import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


//        Person p1 = new Person(
//                1L,
//                "Malika",
//                21,
//                LocalDate.of(2002, Month.JANUARY, 15)
//        );
//        Person p2 = new Person(
//                2L,
//                "Asem",
//                10,
//                LocalDate.of(2013, Month.JANUARY, 15)
//        );
//        System.out.println(p1);
//        System.out.println(p2);
//
//        System.out.println(p1.getName() + " " + p1.getDateOfBirth());
//        Random random = new Random();
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10);
//        }
//        System.out.println(Arrays.toString(arr));


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Write your name: ");
//        String name = sc.nextLine();
//        System.out.println("Write your age: ");
//        int age = sc.nextInt();
//        switch(age) {
//            case 1:
//                System.out.println("You are baby");
//                break;
//            case 18:
//                System.out.println("You are big guy");
//                break;
//            case 25:
//                System.out.println("You are adult");
//                break;
//            default:
//                System.out.println("You didn't entered your age");
//                break;
//        }

        //System.out.println("Your name: " + name + ", your age is: " + age);
        //int x = 5;
        //int y = 6;
        //String names = "ITStep";
        //System.out.println(x * 5);
    }
}
class Person {
    private Long id;
    private String name;
    private int age;
    private LocalDate dateOfBirth;

    public Person(Long id, String name, int age, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}