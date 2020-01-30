#!/bin/bash
echo "Building Docker Image."
./mvnw docker:build docker:push
