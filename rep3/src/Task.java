public class Task {
    public static void main(String[] args) {
        // Task 1
        // 1) цикл for
        for (int i = 500; i <= 650; i = i + 10) {
            System.out.println(i);
        }
    }
}
class Task2{
    public static void main(String[] args) {
        // 2) цикл while
        int j = 500;
        while(j <= 650){
            System.out.println(j + " ");
            j += 10;
        }
    }
}
class Task3 {
    public static void main(String[] args) {
        // 3) цикл do-while
        int n = 500;
        int v = 650;
        do{
            System.out.println(n);
            n += 10;
        }while ( n <= v );


    }
}
class task2 {
    public static void main(String[] args) {
        int a = 2;
        while (2 * a - 1 < 5000) {
            System.out.println(2 * a - 1);
            a++;
        }
    }
}
class task3 {
    public static void main(String[] args) {
        int v = 10;
        System.out.print("дільники числа " + v + ": ");
        for (int i = 1; i <= v; i++) {
            if (v % i == 0 && i > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
class Task4{
    public static void main(String[] args) {
        int n = 10;                          // 1) цикл for
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Факторіал числа " + n + " = " + fact);
    }
}
class Task5{
    public static void main(String[] args) {
        int n = 10;                      // 2) цикл while
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Факторіал числа " + n + " = " + fact);
    }
}
class Task6 {
    public static void main(String[] args) {

        int a = 0;

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {


                if (h / 10 == m % 10 && h % 10 == m / 10) {
                    a++;
                }
            }
        }

        System.out.println("симетричних комбінацій: " + a);
    }
}

