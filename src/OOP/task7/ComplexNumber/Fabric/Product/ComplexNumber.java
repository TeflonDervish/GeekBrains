package OOP.task7.ComplexNumber.Fabric.Product;

import OOP.task7.ComplexNumber.Fabric.Abstraction.IComplexNumber;

/**
 * Класс для представления комплексных чисел и выполнения операций с ними.
 */
public class ComplexNumber extends IComplexNumber {

    /**
     * Конструктор для создания комплексного числа.
     * @param real действительная часть комплексного числа.
     * @param imaginary мнимая часть комплексного числа.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Выполняет операцию сложения с другим комплексным числом.
     * @param other комплексное число, которое нужно сложить с текущим.
     * @return результат сложения в виде нового комплексного числа.
     */
    @Override
    public IComplexNumber add(IComplexNumber other) {
        return new ComplexNumber(this.real + other.getReal(), this.imaginary + other.getImaginary());
    }

    /**
     * Выполняет операцию вычитания с другим комплексным числом.
     * @param other комплексное число, которое нужно вычесть из текущего.
     * @return результат вычитания в виде нового комплексного числа.
     */
    @Override
    public IComplexNumber subtract(IComplexNumber other) {
        return new ComplexNumber(this.real - other.getReal(), this.imaginary - other.getImaginary());
    }

    /**
     * Выполняет операцию умножения с другим комплексным числом.
     * @param other комплексное число, на которое нужно умножить текущее.
     * @return результат умножения в виде нового комплексного числа.
     */
    @Override
    public IComplexNumber multiply(IComplexNumber other) {
        return new ComplexNumber(this.real * other.getReal() - this.imaginary * other.getImaginary(),
                this.real * other.getImaginary() + this.imaginary * other.getReal());
    }

    /**
     * Выполняет операцию деления на другое комплексное число.
     * @param other комплексное число, на которое нужно разделить текущее.
     * @return результат деления в виде нового комплексного числа.
     */
    @Override
    public IComplexNumber divide(IComplexNumber other) {
        double denominator = other.getReal() * other.getReal() + other.getImaginary() * other.getImaginary();
        double realPart = this.real * other.getReal() + this.imaginary * other.getImaginary() / denominator;
        double imaginaryPart = this.imaginary * other.getReal() - this.real * other.getImaginary() / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
