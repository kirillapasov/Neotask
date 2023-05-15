package com.example.neo1;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationCalculatorController {

    @GetMapping("/calculate")
    public ResponseEntity<Double> calculateVacation(@RequestParam("salary") double averageSalary,
                                                    @RequestParam("vacationDays") int vacationDays) {
        // Расчет суммы отпускных
        double vacationPay = averageSalary / 12 * vacationDays;

        return new ResponseEntity<>(vacationPay, HttpStatus.OK);
    }
}