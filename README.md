# Maker Taker Solver as AWS Lambda Java

Maker Taker Solver is a simple constraint satisfaction solver.

* [Introduction](#introduction)
* [Concepts](#concepts)
* [Demo](#demo)
* [Implementation](#implementation)


## Introduction

Maker Taker Solver is a simple constraint satisfaction solver.

  * This app provides an API via AWS Lambda.

  * This app is implemented as Java 11.


## Concepts

A "maker" is any kind of producer, or publisher, or source.

A "taker" is any kind of consumer, or subscriber, or sink.

A "solver" is any kind of application, or program, or function, that calculates good matches of makers and takers.

A "score" is a contraint weight, and has a hard contraint weight and a soft constraint weight.

A "pair" is a binding of a maker and a taker, with a score.

A "tag" is any kind of attribute, or characteristic, or property.

An "interaction" is a binding of two tags and a score.


## Demo

To run the demo, see [demo](demo).

To see the JSON input file and output file:

  * [payload of makers and takers](https://github.com/joelparkerhenderson/maker_taker_solver_as_aws_lambda_java/blob/master/demo/payload.json)

  * [response of score pairs](https://github.com/joelparkerhenderson/maker_taker_solver_as_aws_lambda_java/blob/master/demo/response.json)


## Implementation

This repository is a simple maker taker solver.

Input:

  * A list of makers
  
  * A list of takers

Solver:

  * The solver is a work in progress, and currently is trivial.

  * Currently the solver pairs each maker each taker.

  * Currently each pair has a neutral score, which is a hard contraint score of 0, and a soft contraint score of 0.

  * TODO: implement constraint scores.

Output:

  * A greeting that says "Hello" that we use for testing

  * A list of solver pairs
  
  * The input lists of tags, interactions, makers, tags; this is for convenience.
