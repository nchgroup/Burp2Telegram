#!/usr/bin/env bash

mvn clean install && echo "[ + ] Completed!" || echo "[ - ] Compile Error"
