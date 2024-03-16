package OOP.task7.ComplexNumber.Fabric.Product;

import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexNumber;
import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexOperation;


/**
 * Реализация операции сложения комплексных чисел.
 */
public class ComplexAdd implements IComplexOperation {

    /**
     * Выполняет операцию сложения двух комплексных чисел.
     * @param a первое комплексное число.
     * @param b второе комплексное число.
     * @return результат сложения в виде нового комплексного числа.
     */
    @Override
    public IComplexNumber operate(IComplexNumber a, IComplexNumber b) {
        IComplexNumber result = a.add(b);
        LoggingService.logInfo(String.format("Addition: %s + %s = %s", a, b, result));
        return result;
    }
}
