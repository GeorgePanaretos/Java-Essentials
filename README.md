# Java-Essentials 🚀

Java-Essentials is a powerful library that provides essential utility classes and functions for Java developers. It aims to simplify common tasks and improve productivity by offering a comprehensive set of tools and functionalities.

## Features ✨

- :hammer_and_wrench: **Utility Classes**: Java-Essentials includes a collection of utility classes that cover various common programming tasks, such as string manipulation, file handling, data conversion, and more.
- :art: **Functional Programming**: The library embraces functional programming concepts, offering a range of functional interfaces, higher-order functions, and stream utilities to enable concise and expressive code.
- :clock1: **Date and Time**: Java-Essentials provides enhanced date and time handling capabilities, including convenient methods for parsing, formatting, and manipulating dates and time zones.
- :chart_with_upwards_trend: **Mathematics**: The library includes mathematical functions and algorithms, allowing developers to perform advanced calculations with ease.
- :key: **Encryption and Hashing**: Java-Essentials offers secure encryption and hashing utilities, enabling developers to safeguard sensitive data and implement authentication mechanisms.

## Installation ⚙️

To start using Java-Essentials in your project, follow these simple steps:

1. Add the Java-Essentials dependency to your project's `pom.xml` file:

   ```xml
   <dependency>
       <groupId>com.example</groupId>
       <artifactId>java-essentials</artifactId>
       <version>1.0.0</version>
   </dependency>
   ```

2. Import the necessary classes into your Java files:

   ```java
   import com.example.javaessentials.StringUtils;
   import com.example.javaessentials.DateUtils;
   import com.example.javaessentials.MathUtils;
   import com.example.javaessentials.SecurityUtils;
   // ... add other imports as needed
   ```

3. Start using the Java-Essentials functions and classes in your code:

   ```java
   String modifiedString = StringUtils.reverse("Hello, World!");
   System.out.println(modifiedString);  // Output: "!dlroW ,olleH"

   LocalDate now = DateUtils.getCurrentDate();
   System.out.println(now);  // Output: "2023-07-02"

   double result = MathUtils.calculateSquareRoot(25);
   System.out.println(result);  // Output: 5.0

   String hashedPassword = SecurityUtils.hashPassword("myPassword123");
   System.out.println(hashedPassword);  // Output: "4b4e674dc8cc717f0e43aefe0f6ddcdc"
   ```

## Documentation 📚

### StringUtils

The `StringUtils` class provides various string manipulation methods:

- `reverse(String str)`: Reverses the input string.

### DateUtils

The `DateUtils` class offers convenient date and time manipulation methods:

- `getCurrentDate()`: Retrieves the current date.

### MathUtils

The `MathUtils` class contains mathematical functions and algorithms:

- `calculateSquareRoot(double number)`: Calculates the square root of a given number.

### SecurityUtils

The `SecurityUtils` class provides encryption and hashing utilities:

- `hashPassword(String password)`: Hashes the provided password.

For more detailed documentation and a comprehensive list of available classes and methods, please refer to the [Java-Essentials Wiki](https://github.com/GeorgePanaretos/Java-Essentials/wiki).

## Contributing 🤝

Contributions to Java-Essentials are welcome! If you encounter

 any bugs, have suggestions for improvements, or would like to add new features, please feel free to open an issue or submit a pull request on the [GitHub repository](https://github.com/GeorgePanaretos/Java-Essentials).

## License 📝

Java-Essentials is released under the [MIT License](https://github.com/GeorgePanaretos/Java-Essentials/blob/main/LICENSE).

---
