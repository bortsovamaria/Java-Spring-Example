package learn.school.module_2.solid.isp;

// Плохо: Один интерфейс для всех задач
interface Worker {
    void work();
    void eat();
}

class Engineer implements Worker {
    @Override
    public void work() {
        System.out.println("Engineering work");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}

// Хорошо: Разделение интерфейсов
//interface Workable {
//    void work();
//}
//
//interface Eatable {
//    void eat();
//}
//
//class Engineer implements Workable {
//    @Override
//    public void work() {
//        System.out.println("Engineering work");
//    }
//}