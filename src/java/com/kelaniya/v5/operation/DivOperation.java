package com.kelaniya.v5.operation;

import java.awt.dnd.InvalidDnDOperationException;

public class DivOperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidOperationException {

        if(numbers[1]==0){
            throw new InvalidOperationException("Do not divide by zero");
        }

        return numbers[0] / numbers[1];
    }
}
