JFLAGS = -g
JC = javac
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Sistem.java \
	AnaPencere.java \
	Mlistener.java \
	ListPersonel.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
