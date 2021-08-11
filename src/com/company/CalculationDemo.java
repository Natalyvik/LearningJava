package com.company;
public class CalculationDemo {
        // Math.abs - вычесляет значение по модулю
        // Math.sin - вычесление тригонометрических функций: синус, косинус, тангенс, катангенс, арксинус, арккосинус, арктангенс
        // Math.toDegrees - переведет угол angrad, измеряемый в радианах в градусы
        // Math.toRadian - переводит угол angdeg, измеряемый в градусах - в радианы
        // Math.pow - возведение в степень
        // Math.sqrt - извлечение квадратного корня
        // Math.cbrt - извлечение кубического корня
        // Math.random - генерирует случайное позитивное вещественное (double) число в промежутке от 0.0 до 1.0.
        // Math.round - округляет так, как привычно обывателю.
        // Если дробная часть числа больше либо равна 0.5, то число будет округлено в большую сторону, иначе в меньшую
        // Math.floor - независимо от значений дробной части, округляет число в меньшую сторону
        // Math.ceil - напротив, вне зависимости от значений дробной части, округляет числа в большую сторону
        // Math.log - вычесление логорифма

        public static void calculate1 ( double x){
            System.out.println(10 * (Math.sin(x) + Math.abs(Math.pow(x, 4) - Math.pow(x, 5))));
        }
        public static void calculate2 ( double x, double y){
            System.out.println(Math.pow(2.718, -x) - Math.cos(x) + Math.sin(2 * x * y));
        }
        public static void calculate3 ( double x){
            System.out.println(Math.sqrt(Math.pow(x, 4) + Math.sqrt(Math.abs(x + 1))));
        }
        public static void calculate4 ( double x){
            System.out.println((Math.sin(x) + Math.cos(x)) / Math.tan(x) + 0.43);
        }
        public static void calculate5 ( double x){
            System.out.println((0.125 * x + Math.abs(Math.sin(x))) / (1.5 * Math.pow(x, 2) + Math.cos(x)));
        }
        public static void calculate6 ( double x, double y){
            System.out.println(((x + y) / (x + 1)) - ((x * y - 12) / (34 * x)));
        }
        public static void calculate7 ( double x, double y){
            System.out.println((Math.sin(x) + Math.cos(x)) / (Math.cos(x) - Math.sin(x)) + Math.tan(x) * Math.tan(y));
        }
        public static void calculate8 ( double x, double y, double e ){
            e = 2.718;
            System.out.println(1 + Math.pow(e, y - 1) / 1 + Math.pow(x, 2) * Math.abs(y - Math.tan(x)));
        }
        public static void calculate9 ( int x){
            System.out.println(Math.abs(x ^ 3 - x ^ 2) - 7 * x / (x ^ 3 - 15 * x));
        }
        public static void calculate10 ( int x){
            System.out.println(Math.sqrt(1 + x / 3 + Math.abs(x) + (x ^ 3 + 4 / 2)));
        }
        public static void calculate11 ( double x){
            System.out.println(Math.log(Math.abs(Math.cos(x))) / Math.log(1 + Math.pow(x, 2)));
        }
        public static double calculate12 ( double x, double y){
            return (Math.sin(Math.sqrt(x + 1)) + 1) / Math.cos(12 * y - 4);
        }
        public static void calculate12Version2 ( double x, double y){
            System.out.println((Math.sin(Math.sqrt(x + 1)) + 1) / Math.cos(12 * y - 4));
        }
        public static double calculate18 ( double a, double b, double c){
            if (b == 0) {
                System.out.println("на ноль делить нельзя");
                return 0;
            }
            return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) + Math.pow(b, -2);
        }
    }


