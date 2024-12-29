```scala
class MyClass {
  private val myVar = 10

  def myMethod(): Int = {
    myVar + 1 //Trying to access private member from another method in the same class
  }
}
```