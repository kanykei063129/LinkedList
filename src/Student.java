import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
