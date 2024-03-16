package OOP.task7.ComplexNumber.Fabric.Product;

import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexNumber;
import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexOperation;

/**
 * Реализация операции деления комплексных чисел.
 */
public class ComplexDivision implements IComplexOperation {

    /**
     * Выполняет операцию деления двух комплексных чисел.
     * @param a первое комплексное число, делимое.
     * @param b второе комплексное число, делитель.
     * @return результат деления в виде нового комплексного числа.
     */
    @Override
    public IComplexNumber operate(IComplexNumber a, IComplexNumber b) {
        IComplexNumber result = a.divide(b);
        LoggingService.logInfo(String.format("Division: %s / %s = %s", a, b, result));
        return result;
    }
}
