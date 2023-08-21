package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalculator(float num1, float num2) {
        return formatResult(num1, " + ", num2,  num1 + num2);
    }
    public String minusCalculator(float num1, float num2) {
        return formatResult(num1, " - ", num2,  num1 - num2);
    }
    public String multiplyCalculator(float num1, float num2) {
        return formatResult(num1, " * ", num2,  num1 * num2);
    }
    public String divideCalculator(float num1, float num2) {
        if (num2 != 0) {
            return formatResult(num1, " / ", num2,  num1 / num2);
        } else {
            return "Ошибка! Делить на 0 нельзя";
        }
    }

    private String formatResult(float num1, String operation, float num2, double result) {
        return String.format("%s %s %s = %s", num1, operation, num2, result);
    }
}

