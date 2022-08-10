**Classes and Objects**

```aidl

It is a blueprint for clearing Objects

An Object is an instance of a Class.


Attributes/
Behaviour/Methods

Classes are maned with the PascalNamingConvention.

Key Concept to Understand when it comes to classes.

TextBox Class.

(Attributes)
(Text,Limit,Length,isFocused)

(Methods)
(setText(),clear(),enable(),disable())

```


**Memory Management**

```aidl

Java manages our memory in 2 different locations:


1.Heap - Objects.

2.Stack - Primitives and Short lived variables.


```
**KeyWords**

```aidl

static--->it is used when we are calling a method from the main
method.
```
**Encapsulation**

```aidl

Bundle the data and methods that operate on the data inside a single unit/object.

```

**Getters and Setters**

```aidl

They are used for vaildation.

There may be datarisks when i allow seeting of class fields/attributes
directly.

setters and getters are the functions i use to access the class fields.

They come in when i do not want to access my class attributes directly.

In Java we should make our fields private(i.e accessible only to the class
then have getters and setters)

```
**Abstraction**
```
It means that we should reduce complexity by hiding unecessary details in
our classes.

```
**Coupling**

```aidl

It is the level of dependency between classes.

The more our classes are coupled to each other, the more costly
our changes are going to be.

By reducing coupling we can reduce the impact of changes

We should hide the uncessarry details from the class as much
as possible especially for util methods than can be used internally.

We should declare those as private.


Because private methods are used internally within the class the other
methods are not affected.

We should strictly adhere to using the methods than can be used
internally to stictly internally.

OOP is a way of thinking,it is a way of building software.

```

**Constructors**

```aidl

They are better design than getters and setters..


Through them we pass initial values during creation of the class.

A constructor is a special method that is called when we create a new Object.


If we do not create a custom constructor java creates a default constuctor for us.


We use constuctors to intialize our Objects.

We can use setters in our constructors for better validation.
```

**Method Overloading**

```aidl
This is creating different implementations of the same method,
but with different parameters.

i call the methods within the class without using this keyword.
Important to know.


In python and c sharp we can have default values to functions/constructors
but not java

The Only way to make parameters optional is by overloading a method.

We should be careful of overloading methods and constrictors and only do that
when we have to.

We only should overload when we are passing two very different methods to 
our constructors.
```

**Static Methods**

```aidl

In OOP a class can have two types of members.


1.Instance members.

eg the attributes i pass to constuctor when instantiating an Object.

emplyee.baseSalary;

2.Static members.

They are fields and methods beloging to a class and not an Object.

example is when you have an employee class and you want to represent the number
of employees.

When calling instance methods within the static methods it is good to note 
that you cannot see the object methods unless you instantiate them.

The main method is static so that it can be directly called without creating
a new Object.
```
**Notes By**

```aidl

Mbugua Caleb.

```

