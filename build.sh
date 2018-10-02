#!/bin/bash


(cd fortune-teller-ui; ./mvnw clean package && ./mvnw install dockerfile:build)
(cd cowsay-service/cowsay; docker build -t spsarolkar/cowsay .)
