# Introduction

### There are several ways to control logic in `Java`

### __`if`__ statement  
`if` statements are all similar in programming languages. There are only slight syntactic differences, but they all follow the same structure.  
Let's  cover operators quickly:

#### __Comparison Operators - In order of Precedence__
|  operators  |  meaning  |
|-------------|-----------|
| > | Greater than | 
| < | Less than | 
| >= | Greater than or equal | 
| <= | Less than or equal | 
| == | Equal to | 
| != | Not Equal to | 

#### __Logical Operators__
|  operators  |  meaning  |
|-------------|-----------|
| && | AND | 
| \|\| | OR | 
| ! | NOT | 
---



Sytax to `if` statements:
```java
if (1 > 2) {
  // Some Logic
} else if (1 > 0) {
  // Some logic
} else {
  // Some logic
}
```

If  `//Some logic` is 1 line of code, you can omit `{ }` brackets.
```java
if (1 > 2)      <- DO NOT PUT Semi-colon
  // Some Logic
else if (1 > 0) <- DO NOT PUT Semi-colon
  // Some logic
else            <- DO NOT PUT Semi-colon
  // Some logic

``` 
### __`switch`__ statement
There is some debate about Switch statements being faster than `if` statements, but I could not find any evidence. Just keep in mind that `switch` and `if` statements exist separately for a reason. They can be used interchangebly, but they are not the same.

Here is the syntax for it"

```java
String action = "ADD_NEW_USER";

switch(action){
  case "ADD_NEW_USER":
    // invoke appropriate methods
    break;

  case "REMOVE_USER":
    // call methods to remove user and cleanup 
    break;

  case "UPDATE_USER":
    // call methods to update user properties
    break;

  default:
    // Do nothing or apply default behavior
    break;
}

```
### __`ternary`__ operator

This takes some getting used to. But practice makes perfect.
This is the basic structure of a `ternary operator`:
```java
boolean isEven = 10 % 2 == 0 ? true : false;

String name = "Shamsiddin";

String shortName = name.length() > 5 
  ? name.subString(0, 5) 
  : name;
```