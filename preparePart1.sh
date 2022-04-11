#!/bin/bash

#Prepare venv to work 
sudo apt-get install default-jdk
echo 'Succesfully instaled java'
echo 'Prepare virtualenv'
virtualenv venv
echo '###############################################################################'
echo 'Please type source venv/bin/activate, after it run ./preparePart2.sh'
echo '###############################################################################'
