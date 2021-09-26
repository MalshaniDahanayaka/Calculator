package com.kelaniya.v5;

import com.kelaniya.v5.input.Inputs;
import com.kelaniya.v5.input.InvalidInputException;
import com.kelaniya.v5.operation.InvalidOperationException;
import com.kelaniya.v5.operation.Operation;
import com.kelaniya.v5.operation.OperationFactory;
import com.kelaniya.v5.repository.NumberRepository;
import com.kelaniya.v5.repository.NumberRepositoryException;
import com.kelaniya.v5.ui.UI;

import java.io.IOException;

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute(){ // we will change this in future
    try{
        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);
        ui.showMessage("The result is " + result);
        } catch (InvalidOperationException | InvalidInputException | NumberRepositoryException e) {
            ui.showMessage("Error Occurred!" + e.getMessage());

        }



    }

}
