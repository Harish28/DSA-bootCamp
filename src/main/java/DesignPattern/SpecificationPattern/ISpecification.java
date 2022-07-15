package DesignPattern.SpecificationPattern;

public interface ISpecification<T> {
    boolean isSatisfied(T t);
}
