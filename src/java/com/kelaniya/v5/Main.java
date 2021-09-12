package com.kelaniya.v5;


import com.kelaniya.v5.input.CommandLineInputs;
import com.kelaniya.v5.input.Inputs;
import com.kelaniya.v5.operation.Operation;
import com.kelaniya.v5.operation.OperationFactory;
import com.kelaniya.v5.repository.FileNumberRepository;
import com.kelaniya.v5.repository.NumberRepository;
import com.kelaniya.v5.ui.CmdLineUI;
import com.kelaniya.v5.ui.UI;

public class Main {

    public static void main(String[] args) throws Exception {

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        app.execute();

    }


}



