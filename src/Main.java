import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int q = r.nextInt(0, 36);

        switch (q) {
            case 0:
                System.out.println("Отдых 5 мин");
                break;
            case 1:
                System.out.println("Что такое объектно-ориентированное программирование (ООП)?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a1 = s.nextLine();
                if (a1.equals("q")) {
                    System.out.println("Парадигма программирования, основанная на понятии объекты");
                    System.out.println("Парадигма - стиль програмирования. ");
                }
                break;
            case 2:
                System.out.println("Что такое класс и объект?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a2 = s.nextLine();
                if (a2.equals("q")) {
                    System.out.println("Класс - шаблон для постраения объекта");
                    System.out.println("Объект - всё, что видно глазам");
                    System.out.println("Для получения объекта нужен класс. На основе класса сторится объект");
                }
                break;
            case 3:
                System.out.println("Что такое поля в классе?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a3 = s.nextLine();
                if (a3.equals("q")) {
                    System.out.println("Переменные");
                }
                break;
            case 4:
                System.out.println("Что такое конструктор? Зачем нам это нужно?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a4 = s.nextLine();
                if (a4.equals("q")) {
                    System.out.println("Сециальный метод, которые является экземпляром класса");
                    System.out.println("Нужен для того, чтобы правильно создать/активировать/подготовить к работе");
                }
                break;
            case 5:
                System.out.println("Какие есть типы конструктора?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a5 = s.nextLine();
                if (a5.equals("q")) {
                    System.out.println("По умолчанию, без параметра, с параметром");
                }
                break;
            case 6:
                System.out.println("Можем ли мы создать объект без конструктора?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a6 = s.nextLine();
                if (a6.equals("q")) {
                    System.out.println("Нет");
                }
                break;
            case 7:
                System.out.println("Что такое инкапсуляция?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a7 = s.nextLine();
                if (a7.equals("q")) {
                    System.out.println("Механизм, который ограничивает доступ к полям другим классвам, с целью запретить модификацию");
                }
                break;
            case 8:
                System.out.println("Почему мы используем геттеры и сеттеры?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a8 = s.nextLine();
                if (a8.equals("q")) {
                    System.out.println("Чтобы дать и вернуть значение");
                }
                break;
            case 9:
                System.out.println("Что является приватным?");  // смысл вопроса
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a9 = s.nextLine();
                if (a9.equals("q")) {
                    System.out.println("");
                }
                break;
            case 10:
                System.out.println("Что такое наследование?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a10 = s.nextLine();
                if (a10.equals("q")) {
                    System.out.println("Это увелечение возможностей класса или же связка классов");
                    System.out.println("Нужен для удобства и построения значения класса");
                }
                break;
            case 11:
                System.out.println(" Какие бывают типы наследования?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a11 = s.nextLine();
                if (a11.equals("q")) {
                    System.out.println("Одиночное, многоуровневое, иерархическое");
                    System.out.println("Одиночое - когда один класс наследует супер класс");
                    System.out.println("Многоуровневое - когда один класс наследуется супер классом, а затем побочный класс наследует его");
                    System.out.println("Иерархическое - когда супер класс служит основой для нескольких классов");
                }
                break;
            case 12:
                System.out.println("Что такое extends?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a12 = s.nextLine();
                if (a12.equals("q")) {
                    System.out.println("Ключевое слово для совершения наследования");
                }
                break;
            case 13:
                System.out.println("Что такое ‘this’  и ‘super’  ключевые слова?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a13 = s.nextLine();
                if (a13.equals("q")) {
                    System.out.println("this - ключевое слово, через которое мы обращаемся к переменным");
                    System.out.println("super - ключевое слово, используется при наследовании, для наследования коструктора");
                }
                break;
            case 14:
                System.out.println("Что такое пакеты?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a14 = s.nextLine();
                if (a14.equals("q")) {
                    System.out.println("Объединитель классов. Сортировка");
                }
                break;
            case 15:
                System.out.println("Почему мы используем метод toString()?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a15 = s.nextLine();
                if (a15.equals("q")) {
                    System.out.println("Для получения представления данного объекта в виде строки");
                }
                break;
            case 16:
                System.out.println(" Расскажите о модификаторах доступа");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a16 = s.nextLine();
                if (a16.equals("q")) {
                    System.out.println("public - самый открытый, виден всем");
                    System.out.println("protected - виден только внутри пакета");
                    System.out.println("default - только внутри пакета и класса, дочерние классы не видят");
                    System.out.println("private - самый закрытый");
                }
                break;
            case 17:
                System.out.println("Какая разница между модификаторами Protected и Default?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a17 = s.nextLine();
                if (a17.equals("q")) {
                    System.out.println("default не виден дочерним классам");
                }
                break;
            case 18:
                System.out.println(" Можем ли мы создать static  и final класс?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a18 = s.nextLine();
                if (a18.equals("q")) {
                    System.out.println("static нет, final можем, но бессмысленно");
                }
                break;
            case 19:
                System.out.println("Что происходит, когда мы используем ключевые слова static и final для классов, полей, методов?"); // уточнить
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a19 = s.nextLine();
                if (a19.equals("q")) {
                    System.out.println("");
                }
                break;
            case 20:
                System.out.println("Что такое полиморфизм?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a20 = s.nextLine();
                if (a20.equals("q")) {
                    System.out.println("Это возможность / способность объекта принимать различные формы");
                }
                break;
            case 21:
                System.out.println(" Что такое методы @Overriding и Overloading?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a21 = s.nextLine();
                if (a21.equals("q")) {
                    System.out.println("Override - это изменения формы метода из радительского класса");
                    System.out.println("Overload - это построение одного метода по разным формам (перегрузка)");
                }
                break;
            case 22:
                System.out.println("Что такое абстракция в java?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a22 = s.nextLine();
                if (a22.equals("q")) {
                    System.out.println("свойство класса");
                }
                break;
            case 23:
                System.out.println("Какая разница между простым классом и абстрактным классом");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a23 = s.nextLine();
                if (a23.equals("q")) {
                    System.out.println("Не можем создать объект абстрактного класса");
                }
                break;
            case 24:
                System.out.println("Что такое абстрактный класс?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a24 = s.nextLine();
                if (a24.equals("q")) {
                    System.out.println("это класс, у которого не реализован один или больше методов");
                    System.out.println("(как я понял) Общее название(doctor, student, driver = person)");
                }
                break;
            case 25:
                System.out.println("Можем ли мы создать объект абстрактного класса в java?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a25 = s.nextLine();
                if (a25.equals("q")) {
                    System.out.println("Нет");
                }
                break;
            case 26:
                System.out.println("Зачем нам нужен конструктор внутри абстрактного класса? ");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a26 = s.nextLine();
                if (a26.equals("q")) {
                    System.out.println("Чтобы дать значение дочерним классам");
                }
                break;
            case 27:
                System.out.println("Что такое абстрактные методы?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a27 = s.nextLine();
                if (a27.equals("q")) {
                    System.out.println("Методы у которых нет реализации");
                }
                break;
            case 28:
                System.out.println("Что такое интерфейс?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a28 = s.nextLine();
                if (a28.equals("q")) {
                    System.out.println("Тип который содержит в себе методы и постоянные переменные");
                }
                break;
            case 29:
                System.out.println("Что такое ключевое слово ‘implements’?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a29 = s.nextLine();
                if (a29.equals("q")) {
                    System.out.println("Слово для реализации интерфейса");
                }
                break;
            case 30:
                System.out.println("Можем ли мы создать объект интерфейса?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a30 = s.nextLine();
                if (a30.equals("q")) {
                    System.out.println("Нет");
                }
                break;
            case 31:
                System.out.println("Как мы можем создать метод с телом внутри интерфейса?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a31 = s.nextLine();
                if (a31.equals("q")) {
                    System.out.println("Сделать метод дефолтным");
                }
                break;
            case 32:
                System.out.println("Можем ли мы определить поля внутри интерфейса?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a32 = s.nextLine();
                if (a32.equals("q")) {
                    System.out.println("Да");
                }
                break;
            case 33:
                System.out.println(" Какая разница между интерфейсом и абстрактным классом?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a33 = s.nextLine();
                if (a33.equals("q")) {
                    System.out.println("1. Интерфейс описывает только поведение");
                    System.out.println("2. Абстрактный класс связывает между собой и объединяет классы, имеющие очень близкую связь.");
                    System.out.println("3. Классы могут реализовать сколько угодно интерфейсов, а наследоваться только одни раз");
                    System.out.println("4. extends, implements");
                    System.out.println("5. В интерфейсе нет коструктора");
                }
                break;
            case 34:
                System.out.println("Может ли абстрактный класс реализовать интерфейс?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a34 = s.nextLine();
                if (a34.equals("q")) {
                    System.out.println("Да");
                }
                break;
            case 35:
                System.out.println("Может ли интерфейс расширять “extends” абстрактный класс?");
                System.out.println("Нажмите q и enter чтобы узнать ответ");
                String a35 = s.nextLine();
                if (a35.equals("q")) {
                    System.out.println("");
                }
                break;
            case 36:
                System.out.println("Отдых 5 мин");


        }


    }
}