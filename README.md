# Maker Taker Solver as AWS Lambda Java


Maker Taker Solver is a simple constraint satisfaction solver.

  * This app provides an API via AWS Lambda.

  * This app is implemented as Java 11.

To get started, see [doc/new](doc/new).

To run the demo, see [demo](demo).


## Concepts

A "maker" is any kind of producer, or publisher, or source.

A "taker" is any kind of consumer, or subscriber, or sink.

A "solver" is any kind of application, or program, or function, that calculates good matches of makers and takers.

A "score" is a contraint weight, and has a hard contraint weight and a soft constraint weight.

A "pair" is a binding of a maker and a taker, with a score.


## How this works

This repository is a simple maker taker solver.

Input

  * A list of makers
  
  * A list of takers

Solver:

  * The solver is a work in progress, and currently is trivial.

  * Currently the solver pairs the first maker with the first taker.

  * Currently each pair has a neutral score, which is a hard contraint score of 0, and a soft contraint score of 0.

  * The solver runs on the next maker and taker, and so on, while there are remaining makers and remaining takers.

  * TODO: implement constraint scores.

Output:

  * A greeting that says "Hello" (we use this for our testing)

  * A list of solver pairs
  
  * Any remaining makers
  
  * Any remaining takers
