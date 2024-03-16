package OOP.task7.ComplexNumber.Fabric.Abstraction;

/**
 * Абстрактный класс для представления комплексных чисел и выполнения операций с ними.
 */
public abstract class IComplexNumber {
    protected double real;
    protected double imaginary;

    /**
     * Возвращает действительную часть комплексного числа.
     * @return действительная часть комплексного числа.
     */
    public double getReal() {
        return real;
    }

    /**
     * Устанавливает действительную часть комплексного числа.
     * @param real действительная часть комплексного числа.
     */
    public void setReal(int real) {
        this.real = real;
    }

    /**
     * Возвращает мнимую часть комплексного числа.
     * @return мнимая часть комплексного числа.
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Устанавливает мнимую часть комплексного числа.
     * @param imaginary мнимая часть комплексного числа.
     */
    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * Выполняет операцию сложения с другим комплексным числом.
     * @param other второе комплексное число для сложения.
     * @return результат сложения в виде нового комплексного числа.
     */
    public abstract IComplexNumber add(IComplexNumber other);

    /**
     * Выполняет операцию вычитания с другим комплексным числом.
     * @param other второе комплексное число для вычитания.
     * @return результат вычитания в виде нового комплексного числа.
     */
    public abstract IComplexNumber subtract(IComplexNumber other);

    /**
     * Выполняет операцию умножения с другим комплексным числом.
     * @param other второе комплексное число для умножения.
     * @return результат умножения в виде нового комплексного числа.
     */
    public abstract IComplexNumber multiply(IComplexNumber other);

    /**
     * Выполняет операцию деления с другим комплексным числом.
     * @param other второе комплексное число для деления.
     * @return результат деления в виде нового комплексного числа.
     */
    public abstract IComplexNumber divide(IComplexNumber other);

    /**
     * Переопределение метода toString() для представления комплексного числа в виде строки.
     * @return строковое представление комплексного числа.
     */
    @Override
    public String toString() {
        if (imaginary < 0)
            return String.format("%.2f - %.2fi", real, Math.abs(imaginary));
        else
            return String.format("%.2f + %.2fi", real, imaginary);
    }
}

