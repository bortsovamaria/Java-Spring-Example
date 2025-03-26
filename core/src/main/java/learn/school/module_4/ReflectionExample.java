package learn.school.module_4;

import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {

        try {
            // Получаем объект Class для класса String
            Class<?> stringClass = Class.forName("java.lang.String");

            // Выводим имя класса
            System.out.println("Имя класса: " + stringClass.getName());

            // Получаем все публичные методы класса String
            Method[] methods = stringClass.getMethods();

            // Выводим имена всех методов
            System.out.println("Методы класса String:");
            for (Method method : methods) {
                System.out.println(method.getName());
            }

            // Создаем экземпляр класса String с помощью рефлексии
            String str = (String) stringClass.getDeclaredConstructor(String.class).newInstance("Hello, Reflection!");

            // Вызываем метод toUpperCase() с помощью рефлексии
            Method toUpperCaseMethod = stringClass.getMethod("toUpperCase");
            String upperCaseStr = (String) toUpperCaseMethod.invoke(str);

            // Выводим результат
            System.out.println("Результат вызова toUpperCase(): " + upperCaseStr);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
