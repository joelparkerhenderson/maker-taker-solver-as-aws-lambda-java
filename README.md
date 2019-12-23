# Maker Taker Solver as AWS Lambda Java

Maker Taker Solver is a simple constraint satisfaction solver.

This app provides an API via AWS Lambda.

This app is implemented as Java 11.

To get started, see [doc/new](doc/new).


## Invoke

We use the demo payload file [payload.json](payload.json).

To invoke:

```sh
aws lambda invoke \
  --function-name MakerTakerSolverAsAWSLambdaJava \
  --payload file://payload.json \
  response.json
```

To see the reponse:

```sh
cat response.json
```
