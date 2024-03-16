package OOP.task7.ComplexNumber.Fabric.Product;

import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexNumber;
import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexOperation;

/**
 * Реализация операции умножения комплексных чисел.
 */
public class ComplexMultiply implements IComplexOperation {

    /**
     * Выполняет операцию умножения двух комплексных чисел.
     * @param a первое комплексное число.
     * @param b второе комплексное число.
     * @return результат умножения в виде нового комплексного числа.
     */
    @Override
    public IComplexNumber operate(IComplexNumber a, IComplexNumber b) {
        IComplexNumber result = a.multiply(b);
        LoggingService.logInfo(String.format("Multiplication: %s * %s = %s", a, b, result));
        return result;
    }
}
