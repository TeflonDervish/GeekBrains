package OOP.task7.ComplexNumber.Fabric.Fabric;

import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexOperation;
import OOP.task7.ComplexNumber.Fabric.Abstraction.OperationFactory;
import OOP.task7.ComplexNumber.Fabric.Product.*;

/**
 * Реализация фабрики операций для работы с комплексными числами.
 */
public class ConcreteOperationFactory implements OperationFactory {

    /**
     * Создает объект для выполнения операции сложения комплексных чисел.
     * @return объект для выполнения операции сложения.
     */
    @Override
    public IComplexOperation createAddOperation() {
        LoggingService.logInfo("Создана операция сложения");
        return new ComplexAdd();
    }

    /**
     * Создает объект для выполнения операции вычитания комплексных чисел.
     * @return объект для выполнения операции вычитания.
     */
    @Override
    public IComplexOperation createSubtractOperation() {
        LoggingService.logInfo("Создана операция вычитания");
        return new ComplexSubtract();
    }

    /**
     * Создает объект для выполнения операции умножения комплексных чисел.
     * @return объект для выполнения операции умножения.
     */
    @Override
    public IComplexOperation createMultiplyOperation() {
        LoggingService.logInfo("Создана операция умножения");
        return new ComplexMultiply();
    }

    /**
     * Создает объект для выполнения операции деления комплексных чисел.
     * @return объект для выполнения операции деления.
     */
    @Override
    public IComplexOperation createDivideOperation() {
        LoggingService.logInfo("Создана операция деления");
        return new ComplexDivision();
    }
}
