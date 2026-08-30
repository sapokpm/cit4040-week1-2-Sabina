## error 1
File: Main.java

Error message:
```
Main.java:6: error: illegal start of expression
javac Main.java
^
Main.java:6: error: reached end of file while parsing
```

Cause:
Terminal commands `javac Main.java` and `java Main` were accidentally pasted inside the .java file (after the closing brace), instead of being run in the terminal. Java tried to parse them as code.

Fix:
Removed the two stray lines so the file contains only valid Java:
```java
public class Main {
    public static void main (String[] args) {
        System.out.println("Hello, backend!");
        }
}
```
