package OOP.task7.ComplexNumber.Fabric.Abstraction;

/**
 * Интерфейс для генерации комплексных чисел.
 */
public interface IComplexNumberGenerator {

    /**
     * Создает новое комплексное число на основе заданных действительной и мнимой частей.
     * @param real действительная часть комплексного числа.
     * @param imaginary мнимая часть комплексного числа.
     * @return объект, представляющий созданное комплексное число.
     */
    public IComplexNumber createNumber(double real, double imaginary);
}
