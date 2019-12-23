package com.joelparkerhenderson.makertakersolver;
import java.util.*;
import java.util.stream.*;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<RequestClass, ResponseClass> {
    
    public ResponseClass handleRequest(final RequestClass request, final Context context) {
        final Map<TagPair, Score> rubric = request.interactions.stream().collect(Collectors.toMap(Interaction::getTagPair, Interaction::getScore));    
        final List<Pair> pairs = Solver.solve(rubric, request.makers, request.takers);
        final String greeting = "Hello";
        final ResponseClass response = new ResponseClass(
            greeting,
            pairs,
            request.tags,
            request.interactions,
            request.makers,
            request.takers
        );
        return response;
    }
    public static void main(final String[] args) {
        System.out.println("Hello");
    }
}
