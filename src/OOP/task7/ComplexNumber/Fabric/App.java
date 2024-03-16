package OOP.task7.ComplexNumber.Fabric;

import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexOperation;
import OOP.task7.ComplexNumber.Fabric.Fabric.ComplexNumberGenerator;
import OOP.task7.ComplexNumber.Fabric.Fabric.ConcreteOperationFactory;
import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexNumber;
import OOP.task7.ComplexNumber.Fabric.Product.*;

/**
 * Основной класс приложения для демонстрации операций с комплексными числами.
 */
public class App {
    /**
     * Точка входа в приложение.
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        // Создание генератора комплексных чисел
        ComplexNumberGenerator numberGenerator = new ComplexNumberGenerator();

        // Создание двух комплексных чисел
        IComplexNumber a = numberGenerator.createNumber(2, 2);
        IComplexNumber b = numberGenerator.createNumber(4, 4);

        // Создание фабрики операций
        ConcreteOperationFactory factory = new ConcreteOperationFactory();

        // Получение операций
        IComplexOperation addition = factory.createAddOperation();
        IComplexOperation subtraction = factory.createSubtractOperation();
        IComplexOperation multiplication = factory.createMultiplyOperation();
        IComplexOperation division = factory.createDivideOperation();

        try {
            // Выполнение операций и логирование результатов
            addition.operate(a, b);
            subtraction.operate(a, b);
            multiplication.operate(a, b);
            division.operate(a, b);
        } catch (Exception e) {
            // Обработка исключений и логирование ошибок
            LoggingService.logError("An error occurred during complex operation: " + e.getMessage());
        }
    }
}
