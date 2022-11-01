public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задание 1");
        int age=4;
        if (age>=18) { System.out.println("Поздравляю с совершеннолетием!");}
        else {System.out.println("Cовершеннолетие ещё не наступило!");}
        //Задача 2
        System.out.println("Задание 2");
        if (age>=7&&age<18){System.out.println("Школа");}
        if (age>=18&&age<24){System.out.println("Университет");}
        if (age>=24){System.out.println("Работа");}
        //Задача 3
        System.out.println("Задание 3");
        int goodTicket=60;
        int standTicket=5;
        int allSeat=102;
        int goodSeat=60;
        int standSeat = allSeat-goodSeat;
        if (goodTicket+standTicket >= allSeat) {System.out.println("Мест нет");}
        if (goodTicket < goodSeat){System.out.println("Есть "+ (goodSeat-goodTicket) +" сидячих мест");}
        if (standTicket < standSeat){System.out.println("Есть " +(standSeat-standTicket)+ " стоячих мест");}
        //Задача 4
        System.out.println("Задание 4");
        if (age>=18) { System.out.println("Поздравляю с совершеннолетием!");}
        else {System.out.println("Cовершеннолетие ещё не наступило!");}
        //Задача 5
        System.out.println("Задание 5");
        if (age>=24)  System.out.println("Работа");
        else {if(age>=18) System.out.println("Университет");
              else{if(age>=7)System.out.println("Школа");}
        }
        //Задача 6
        System.out.println("Задание 6");
        if (goodTicket < goodSeat){System.out.println("Есть "+ (goodSeat-goodTicket) +" сидячих мест");}
        else {System.out.println("Сидячих мест нет");}
        if (standTicket < standSeat){System.out.println("Есть " +(standSeat-standTicket)+ " стоячих мест");}
        else {System.out.println("Стоячих мест нет");}
        //Задача 7
        System.out.println("Задание 7");
        boolean isKindergarten = age>=2;
        boolean isSchool = age>=7;
        boolean isUniversity = age>18;
        boolean IsWork = age>24;
        if (IsWork)  System.out.println("Если возраст человека равен "+age+", то ему нужно ходить на работу");
        else {if(isUniversity) System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в университет");
              else{if(isSchool) System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в школу");
              else if (isKindergarten) System.out.println("Если возраст человека равен "+age+", то ему нужно ходить в детский сад");}
        }
        //Задача 8
        System.out.println("Задание 8");
        boolean no = age<5;
        boolean withAdult = age>=5&&age<14;
        if (no)  System.out.println("Нельзя кататься на атракционе");
        else {if(withAdult) System.out.println("Можно кататься на атракционе с взрослым");
            else System.out.println("Можно кататься на атракционе одному");
            }
        //Задача 9
        System.out.println("Задание 9");
        int one=3;
        int two=2;
        int free=1;
        boolean oneMoreTwo = one>two;
        boolean oneMoreFree = one>free;
        boolean twoMoreFree = two>free;
        if (one==two&&two==free) System.out.println("Все числа равны и это "+ one);
        else{
                if (oneMoreTwo) {
                    if (oneMoreFree) System.out.println("Самое большое число " + one);
                    else System.out.println("Самое большое число " + free);
                } else {
                    if (twoMoreFree) System.out.println("Самое большое число " + two);
                    else System.out.println("Самое большое число " + free);
            }
        }
    }
}