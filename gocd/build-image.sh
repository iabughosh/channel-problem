#!/bin/bash
echo "Building & Pushing Docker Image."
./mvnw package
sudo docker build . -t iabughosh/micro-channel:$GO_PIPELINE_COUNTER