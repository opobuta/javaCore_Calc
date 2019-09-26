# Calc
javaCore_Calc - is a console program that perform simple math operations: add, substract, multiply and divide.
It was created in study purposes.
Project contains **Main** class and two additional classes: **MathAction** and **ReadValue**.

   **Main class**

Contains initialisation of Scanner that allows to read two values and operation type from the console which are 
passing validation in **ReadValue** class. After that it calls **MathAction** class to perform desired action and give the result.
In the end the result is displayed in console.

**ReadValue class**
The class contains two methods:
* **public static double readDouble (Scanner s)** - peforms the validation of entered value (positive/negative, integer/fractional values)
and returns it in **double** format;
* **public static String readAction(Scanner s)** - performs the validation of entered action (add ("+"), substract("-"), multiply("*") or divide("/")
and returns them in **String** format.

**MathAction class**
The class contains 5 methods:
* **private static BigDecimal add (double d1, double d2)** - perform the *add* action of two input parameters 
and returns the result in **BigDecimal** format;
* **private static BigDecimal sub (double d1, double d2)** - perform the *substract* action of two input parameters 
and returns the result in **BigDecimal** format;
* **private static BigDecimal mult (double d1, double d2)** - perform the *multiply* action of two input parameters 
and returns the result in **BigDecimal** format;
* **private static BigDecimal div (double d1, double d2)** - perform the *divide* action of two input parameters 
and returns the result in **BigDecimal** format;
* **public static BigDecimal performAction(double d1, double d2, String act)** - calls on of the described above methods depending on 
*act* input parameter (desired math action).

# To run the code:

1. Click on Run Main() button or press Shift+F10;
2. Type in console the first value and press Enter button;
3. Type in console the desired action and press Enter button;
4. Type in console the second value and press Enter button;
5. Observe the result in console.

