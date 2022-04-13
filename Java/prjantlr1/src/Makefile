all: clear generate compile test clear

ANTLR=$(shell pwd)/antlr-4.9.3-complete.jar

generate:
	java -jar $(ANTLR) -o output MyGrammar.g4

compile:
	javac -cp $(ANTLR):output:. Main.java

test:
	java -cp $(ANTLR):output:. Main > zobaczymy.ll
	lli zobaczymy.ll

clear:
	rm -f zobaczymy.ll
	rm -f *.class
	rm -rf output

