Feature: FizzBuzz
  Print a sequence o N numbers,
    but for multiples of 3 print Fizz
    and for multiples of 5 print Buzz
    and for multiples of 3 and 5 print FizzBuzz

  Scenario Outline: FizzBuzz a number
    Given the user selected the number <Number>
    When the user clicked the FizzBuzz button
    Then the program prints <Result>
    Examples:
    | Number | Result |
    |2       |2       |
    |3       |Fizz    |
    |5       |Buzz    |
    |6       |Fizz    |
    |10      |Buzz    |
    |15      |FizzBuzz|


