package OOP.task7.ComplexNumber.Fabric.Abstraction;

/**
 * Интерфейс для операций над комплексными числами.
 */
public interface IComplexOperation {

    /**
     * Выполняет операцию над двумя комплексными числами.
     * @param a первое комплексное число.
     * @param b второе комплексное число.
     * @return результат операции в виде нового комплексного числа.
     */
    IComplexNumber operate(IComplexNumber a, IComplexNumber b);
}
