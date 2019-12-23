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
  "greeting": "Hello",
  "pairs": [
    {
      "maker": {
        "id": "maker_1",
        "name": "Maker 1",
        "tags": [
          {
            "id": "tag_1",
            "name": "Tag 1"
          },
          {
            "id": "tag_2",
            "name": "Tag 2"
          }
        ]
      },
      "taker": {
        "id": "taker_1",
        "name": "Taker 1",
        "tags": [
          {
            "id": "tag_5",
            "name": "Tag 5"
          },
          {
            "id": "tag_6",
            "name": "Tag 6"
          }
        ]
      }
    },
    {
      "maker": {
        "id": "maker_2",
        "name": "Maker 2",
        "tags": [
          {
            "id": "tag_3",
            "name": "Tag 3"
          },
          {
            "id": "tag_4",
            "name": "Tag 4"
          }
        ]
      },
      "taker": {
        "id": "taker_2",
        "name": "Taker 2",
        "tags": [
          {
            "id": "tag_7",
            "name": "Tag 7"
          },
          {
            "id": "tag_8",
            "name": "Tag 8"
          }
        ]
      }
    }
  ],
  "makers": [],
  "takers": []
}
```
