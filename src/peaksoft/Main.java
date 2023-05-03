package peaksoft;

import java.util.Arrays;

public class Main {
    /**
     * Задача ServiceImpl'дын ичиндеги методтоду ишке ашыруу керек
     * <p>
     * 1 - метод бул студенти id полясы менен табып и ошол студентин атын и фамилиясын озгортуу
     * 2 - метод бул студенти id полясы менен табып консолго чыгаруу
     * 3 - метод boolean кайтарат эгер биз издеген ат болсо
     * 4 - метод биз берген жаштын санын чыгарат
     * 5 - бул баардык студенттерди чыгаруу
     * <p>
     * Баардык методторду Майн класстан чыкырып иштетуу керек
     *
     * Cтуденттердин обьектилерин Майн класстан тузуп SerivceImpl классынын ичиндеги поляга конструктор аркылуу салсаныз болот
     * <p>
     * 1 - жана 2 методтто Id полясы менен таппай калса анда анда - мындай студент жок деп чыгуусу керек
     * <p>
     * Методтордун атын кайтаруу тибин параметрин озгортууго болбойт
     * <p>
     * *
     */
    public static void main(String[] args) {
      Student[]students={new Student( 1L,"Asel","Azimova",25)};
      new Student(2L,"Aibek","Bekimov",20);
      new Student(3L,"Aziza","Osmonova",30);
      new Student(3L,"Gulzar","Derkembaeva",18);
      new Student(4L,"Marat","Alimov",22);

      ServiceImpl service=new ServiceImpl(students);

        System.out.println(service.getName("Asel"));
        System.out.println(service.getAllStudents());
        System.out.println(service.getCountAge(25));
        System.out.println(service.getStudentById(2l));
        System.out.println(Arrays.toString(service.getAllStudents()));
    }

}