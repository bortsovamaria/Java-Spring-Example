package learn.school.module_2.solid.dip;

// Плохо: Высокоуровневый модуль зависит от низкоуровневого
class LightBulb {
    public void turnOn() {
        System.out.println("LightBulb: On");
    }
}

class Switch {
    private final LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        bulb.turnOn();
    }
}

// Хорошо: Зависимость от абстракции
//interface Switchable {
//    void turnOn();
//}
//
//class LightBulb implements Switchable {
//    @Override
//    public void turnOn() {
//        System.out.println("LightBulb: On");
//    }
//}
//
//class Switch {
//    private final Switchable device;
//
//    public Switch(Switchable device) {
//        this.device = device;
//    }
//
//    public void operate() {
//        device.turnOn();
//    }
//}