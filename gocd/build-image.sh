#!/bin/bash
echo "Building & Pushing Docker Image."
./mvnw package
docker build . -t iabughosh/micro-channel:$GO_PIPELINE_COUNTER