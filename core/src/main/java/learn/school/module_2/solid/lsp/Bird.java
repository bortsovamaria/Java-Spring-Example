package learn.school.module_2.solid.lsp;

// Плохо: Нарушение LSP
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}

// Хорошо: Разделение на более специфичные классы
//class Bird {
//    // Общие методы для всех птиц
//}
//
//class FlyingBird extends Bird {
//    public void fly() {
//        System.out.println("Flying");
//    }
//}
//
//class Ostrich extends Bird {
//    // Страус не умеет летать, но может бегать
//}