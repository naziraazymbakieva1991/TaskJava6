package peaksoft;

public class ServiceImpl implements Service {

    private final Student[] students;

    public ServiceImpl(Student[] students) {
        this.students = students;
    }

    @Override
    public void updateStudent(Long id, String name, String lastName) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setLastName(lastName);
            }
        }
    }

    @Override
    public Student getStudentById(Long id) {
        Student student1 = null;
        for (Student student : students) {
            if (student.getId() == id) {
                student1 = student;
            }

        }
        return student1;

    }

    @Override
    public Boolean getName(String name) {
        for (Student a : students) {
            if (a.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getCountAge(int age) {
        int count = 0;
        for (Student student : students) {
            count += student.getAge();
        }
        System.out.println(count / students.length);
        return count;
    }





    @Override
    public Student[] getAllStudents() {

        return students;
    }
}
