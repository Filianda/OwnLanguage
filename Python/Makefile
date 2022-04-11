grammar = ../MyGrammar
testfile = ../test.txt
generate:
        antlr4 -Dlanguage=Python3 $(grammar).g4 -visitor -o dist
testbeta:
        python3 main.py $(testfile)
test:
        python3 main.py $(testfile) > test.ll
        lli test.ll
