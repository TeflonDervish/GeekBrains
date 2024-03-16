package OOP.task7.ComplexNumber.Fabric.Fabric;

import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexNumberGenerator;
import OOP.task7.ComplexNumber.Fabric.Product.ComplexNumber;
import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexNumber;

/**
 * Реализация интерфейса для генерации комплексных чисел.
 */
public class ComplexNumberGenerator implements IComplexNumberGenerator {

    /**
     * Создает новое комплексное число на основе заданных действительной и мнимой частей.
     * @param real действительная часть комплексного числа.
     * @param imaginary мнимая часть комплексного числа.
     * @return объект, представляющий созданное комплексное число.
     */
    @Override
    public IComplexNumber createNumber(double real, double imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}
