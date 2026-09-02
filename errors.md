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

## error 2
File: Main.java

Code:
```java
System.out.printline("Hello, backend!");
```

Error message:
```
Main.java:3: error: cannot find symbol
        System.out.printline("Hello, backend!");
                  ^
  symbol:   method printline(String)
  location: variable out of type PrintStream
```

Cause:
Misspelled the method name — `printline` instead of `println`.

Fix:
```java
System.out.println("Hello, backend!");
```

## error 3
File: Main.java

Code:
```java
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello, backend!");
    }
}
```

Error message:
```
Main.java:1: error: class Application is public, should be declared in a file named Application.java
public class Application {
       ^
```

Cause:
Renamed the class to `Application`, but the file is still named `Main.java`. Java requires a public class name to match its file name exactly.

Fix:
Either rename the class back to `Main` (to match `Main.java`), or rename the file to `Application.java` to match the class.

## Task 3.4 — NullPointerException
File: Calculator.java

Terminal output:
```
Product: Apple, Price: $0.99, Stock Quantity: 5, In Stock: true, Size Code: M, Total Price: $4.95
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
	at Calculator.main(Calculator.java:12)
```
