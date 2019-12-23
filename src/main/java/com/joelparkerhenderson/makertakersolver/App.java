package com.joelparkerhenderson.makertakersolver;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<RequestClass, ResponseClass> {
    public ResponseClass handleRequest(RequestClass request, Context context) {
        String greetingString = String.format("Hello %s", request.name);
        return new ResponseClass(greetingString);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
