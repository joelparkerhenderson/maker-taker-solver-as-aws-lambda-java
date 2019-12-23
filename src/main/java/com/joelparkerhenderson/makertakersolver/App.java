package com.joelparkerhenderson.makertakersolver;
import java.util.*;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<RequestClass, ResponseClass> {
    
    public ResponseClass handleRequest(RequestClass request, Context context) {
        String greeting = "Hello";
        Solver solver = new Solver();
        List<Pair> pairs = solver.solve(request.makers, request.takers);

        ResponseClass response = new ResponseClass(
            greeting,
            pairs,
            request.tags,
            request.interactions,
            request.makers,
            request.takers
        );
        return response;
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
