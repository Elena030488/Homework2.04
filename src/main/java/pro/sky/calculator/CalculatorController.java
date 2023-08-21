package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping()
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }
    @GetMapping(path = "plus")
    public String plusCalculator(@RequestParam float num1, @RequestParam float num2) {
        return calculatorService.plusCalculator(num1, num2);
    }
    @GetMapping(path = "minus")
    public String minusCalculator(@RequestParam float num1, @RequestParam float num2) {
        return calculatorService.minusCalculator(num1, num2);
    }
    @GetMapping(path = "multiply")
    public String multiplyCalculator(@RequestParam float num1, @RequestParam float num2) {
        return calculatorService.multiplyCalculator(num1, num2);
    }
    @GetMapping(path = "divide")
    public String divideCalculator(@RequestParam float num1, @RequestParam float num2) {
        return calculatorService.divideCalculator(num1, num2);
    }
}
