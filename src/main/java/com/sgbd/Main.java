package com.sgbd;

import com.sgbd.controllers.InputReader;
import com.sgbd.controllers.Scheduler;
import com.sgbd.models.operations.Operation;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        String entrada_ai = "r4(v)r3(y)r1(y)r1(x)w2(u)r2(x)w1(y)r2(y)c1w4(u)r3(x)c4w3(u)w3(z)c3";
//        String entrada_ai = "w2(u)w3(u)w4(u)w4(x)w2(x)c2c3c4";
        String entrada_ai = "r1(x)w1(y)r2(y)w2(z)c1r3(z)w3(x)c3c2";

        List<Operation> operations = InputReader.readInput(entrada_ai);
        Scheduler scheduler = new Scheduler(operations);
        System.out.println(scheduler.schedule(operations));
        // PRINT DO SCHEDULE
        for (Operation operation: scheduler.getScheduledOperations()) {
            System.out.println(operation.getTransactionId() + " " + operation.getType() + " " + operation.getObject());
        }
    }
}
