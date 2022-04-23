/*
Нека имате ученици със следните оценки: Иванчо - 2, Ани – 5,
Марийка - 6, Пенчо - 4, Бориславчо - 5. Използвайте printf да
отпечатате оценките им в табличен вид, всеки ученик - на отделен
ред.
**/
public class ex3 {
    public static void main(String[] args) {
        String name1 = "Иванчо";
        String name2 = "Ани";
        String name3 = "Марийка";
        String name4 = "Пенчо";
        String name5 = "Бориславчо";

        Integer grade1 = 2;
        Integer grade2 = 5;
        Integer grade3 = 6;
        Integer grade4 = 4;
        Integer grade5 = 5;

        System.out.printf("| %-15s | %s%n","Name","Grade");
        System.out.printf("| %-15s | %d%n",name1,grade1);
        System.out.printf("| %-15s | %d%n",name2,grade2);
        System.out.printf("| %-15s | %d%n",name3,grade3);
        System.out.printf("| %-15s | %d%n",name4,grade4);
        System.out.printf("| %-15s | %d%n",name5,grade5);
    }
}
