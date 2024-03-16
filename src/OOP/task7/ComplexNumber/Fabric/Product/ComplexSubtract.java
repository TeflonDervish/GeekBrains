package OOP.task7.ComplexNumber.Fabric.Product;

import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexNumber;
import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexOperation;

/**
 * Реализация операции вычитания комплексных чисел.
 */
public class ComplexSubtract implements IComplexOperation {

    /**
     * Выполняет операцию вычитания одного комплексного числа из другого.
     * @param a первое комплексное число, из которого нужно вычесть.
     * @param b второе комплексное число, которое нужно вычесть.
     * @return результат вычитания в виде нового комплексного числа.
     */
    @Override
    public IComplexNumber operate(IComplexNumber a, IComplexNumber b) {
        IComplexNumber result = a.subtract(b);
        LoggingService.logInfo(String.format("Subtraction: %s - %s = %s", a, b, result));
        return result;
    }
}
