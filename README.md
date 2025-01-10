# Mutable State in Seemingly Immutable Scala Class

This example highlights a potential pitfall in Scala: the use of mutable fields within what might appear to be an immutable class. While the `name` field is declared as a `val` (immutable), the `age` field uses a mutable `var`.  This can lead to unexpected behavior and violates the principle of immutability often associated with functional programming in Scala.

The code includes an attempt to modify the immutable `name`, which results in a compiler error, illustrating the expected behavior of `val`s. However, the mutable `age` field can be changed, potentially introducing bugs if not handled carefully (demonstrated by an `IllegalArgumentException` when setting a negative age).

The solution demonstrates improved code design to emphasize immutability.