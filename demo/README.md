
# Demo

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
