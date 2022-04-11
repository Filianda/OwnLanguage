all: generate compile test
ANTLR=$(shell pwd)/antlr-4.9.3-complete.jar
generate:
    java -jar $(ANTLR) -o output MyGrammar.g4
compile:
    javac -cp $(ANTLR):output:. Main.java
test:
    java -cp $(ANTLR):output:. Main > test.ll
    lli test.ll
clean:
    rm test.ll
    rm *.class
    rm -rf output
