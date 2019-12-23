# Maker Taker Solver as AWS Lambda Java

Maker Taker Solver is a simple constraint satisfaction solver.

This app provides an API via AWS Lambda.

This app is implemented as Java 11.

To get started, see [doc/new](doc/new).

## Payload

We use this demo file `payload.json`:

```json
{
  "makers": [
    {
      "id": "maker_1",
      "name": "Maker 1"
    },
    {
      "id": "maker_2",
      "name": "Maker 2"
    }
  ],
  "takers": [
    {
      "id": "taker_1",
      "name": "Taker 1"
    },
    {
      "id": "taker_2",
      "name": "Taker 2"
    }
  ]
}
```


## Invoke

To invoke:

```sh
aws lambda invoke \
  --function-name MakerTakerSolverAsAWSLambdaJava \
  --payload file://payload.json \
  response.json
```

To see the reponse with friendly formatting:

```sh
cat response.json | jq

```

Output:

```json
{
  "makers": [
    {
      "id": "maker_1",
      "tName": "Maker 1"
    },
    {
      "id": "maker_2",
      "tName": "Maker 2"
    }
  ],
  "takers": [
    {
      "id": "taker_1",
      "tName": "Taker 1"
    },
    {
      "id": "taker_2",
      "tName": "Taker 2"
    }
  ],
  "greeting": "Hello"
}
```
