package test;

public abstract class BinaryExpression implements Expression {

    protected final Expression left;// the meaning of final - immutable, protecting the properties
    protected final Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
