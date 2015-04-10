package com.gofdp.behavioralpatterns.interpreter;

import java.util.List;

import com.gofdp.behavioralpatterns.interpreter.operators.AdditionEvaluator;
import com.gofdp.behavioralpatterns.interpreter.operators.DivisionEvaluator;
import com.gofdp.behavioralpatterns.interpreter.operators.IOperatorEvaluator;
import com.gofdp.behavioralpatterns.interpreter.operators.MultiplicationEvaluator;
import com.gofdp.behavioralpatterns.interpreter.operators.SubtractionEvaluator;

public class ExpressionEvaluator {

    private List<ExpressionToken> _expression;
    private ExpressionToken _result;

    public ExpressionEvaluator(List<ExpressionToken> expression) {
        _expression = expression;
    }

    public ExpressionToken evaluate() {
        if (_result != null)
            return _result;

        // Strategy pattern
        evaluateOperators(new DivisionEvaluator());
        evaluateOperators(new MultiplicationEvaluator());
        evaluateOperators(new SubtractionEvaluator());
        evaluateOperators(new AdditionEvaluator());

        return _expression.size() == 1 ? _expression.get(0) : null;
    }

    private void evaluateOperators(IOperatorEvaluator oe) {
        for (int i = 0; i < _expression.size(); i++) {
            ExpressionToken et = _expression.get(i);
            if (et instanceof Operator) {
                if (et.getValue().equals(oe.targetValue())) {
                    ExpressionToken result = oe.evaluate(
                            _expression.get(i - 1), _expression.get(i),
                            _expression.get(i + 1));
                    _expression.set(i - 1, result);
                    shiftExpression(i + 2, 2);
                    i--;
                }
            }
        }
    }

    private void shiftExpression(int from, int positions) {
        if (from > _expression.size())
            return;

        for (int i = from; i < _expression.size(); i++)
            _expression.set(i - positions, _expression.get(i));

        _expression = _expression.subList(0, _expression.size() - positions);
    }
}
