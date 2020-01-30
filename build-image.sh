#!/bin/bash
echo "Building Docker Image."
./mvnw package docker:build docker:push
