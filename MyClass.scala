```scala
class MyClass(val name: String) {
  private var _age: Int = 0 // Private mutable field

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    if (newAge >= 0) _age = newAge else throw new IllegalArgumentException("Age cannot be negative")
  }
}

object Main extends App{
  val person = new MyClass("Alice")
  person.age = 30
  println(person.age) // Output: 30

  //Trying to change the immutable name field
  //person.name = "Bob" //Compiler error: reassignment to val

  person.age = -5 // Throws IllegalArgumentException
}
```