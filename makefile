all:
	mkdir -p bin
	cd src/core && make
	javac src/*/*.java -classpath lib/antlr-3.5.1-complete.jar -d bin

clean:
	cd src/core && make clean
	rm -rf bin
