package OOP.task7.ComplexNumber.Fabric.Abstraction;

/**
 * Интерфейс для фабрики операций над комплексными числами.
 */
public interface OperationFactory {

    /**
     * Создает объект для выполнения операции сложения комплексных чисел.
     * @return объект для выполнения операции сложения.
     */
    IComplexOperation createAddOperation();

    /**
     * Создает объект для выполнения операции вычитания комплексных чисел.
     * @return объект для выполнения операции вычитания.
     */
    IComplexOperation createSubtractOperation();

    /**
     * Создает объект для выполнения операции умножения комплексных чисел.
     * @return объект для выполнения операции умножения.
     */
    IComplexOperation createMultiplyOperation();

    /**
     * Создает объект для выполнения операции деления комплексных чисел.
     * @return объект для выполнения операции деления.
     */
    IComplexOperation createDivideOperation();

}
