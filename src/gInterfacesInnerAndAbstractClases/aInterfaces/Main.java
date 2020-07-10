package gInterfacesInnerAndAbstractClases.aInterfaces;

public class Main {

    public static void main(String[] args) {

        ITelephone timsPhone;       // Or - DeskPhone timsPhone;
        timsPhone = new DeskPhone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        System.out.println();

        timsPhone = new MobilePhone(23565);
        timsPhone.powerOn();
        timsPhone.callPhone(23565);
        timsPhone.answer();
    }
}
