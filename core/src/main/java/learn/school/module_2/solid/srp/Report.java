package learn.school.module_2.solid.srp;

// Плохо: Класс выполняет несколько задач
class Report {
    void generateReport() {
        // Генерация отчета
    }

    void saveToFile() {
        // Сохранение отчета в файл
    }
}

// Хорошо: Разделение ответственности
//class Report {
//    void generateReport() {
//        // Генерация отчета
//    }
//}
//
//class ReportSaver {
//    void saveToFile(Report report) {
//        // Сохранение отчета в файл
//    }
//}