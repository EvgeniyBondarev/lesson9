/*
* Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() и
* Informable c default методом info() с default реализацией, применить интерфейсы к
* абстрактному классу Phone и классам-наследникам.*/
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new SamsungPhone("+77777777777", "Samsung", 10);
        Phone phone2 = new XiaomiPhone("+75555555555", "Xiaomi", 15);
        Phone phone3 = new ApplePhone("+72222222222", "Apple", 20);
        phone1.info();
        phone2.info();
        phone3.info();
        phone1.receiveCall("абонент1");
        phone1.getNumber();
        phone2.receiveCall("абонент2");
        phone2.getNumber();
        phone3.receiveCall("абонент3");
        phone3.getNumber();
    }
}
