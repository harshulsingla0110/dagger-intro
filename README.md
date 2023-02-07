# dagger-intro
Dependency Injection using Dagger.

 ### Dependency Injection ###
 `Dependency injection` is a technique used to remove hard-coded dependencies between objects, making it easier to change them later. This is useful in situations where you want to be able to swap out one implementation of a dependency for another, without having to change the code that uses it.

- Class need objects to do some work. System will provide it. Class will only do the work for which it has been made.
- We don’t need to make objects.

 ### Benefits of using dependency injection
- class is not testable
- Code is not extensible
- Single Responsibility
- Lifetime of Objects (Reusability)

## Dagger

### Intro
- Dagger is a fully static, compile-time dependency injection framework.
- Compile time checking is performed if Dagger can create the required objects.
- Annotation Based.
- Dagger will behave as a system for us to create required objects.
- Dagger will help us inject these objects.
- Dagger will manage the lifetime of the objects.
- Dagger will help us write manageable code.

### Concept

- Consumer:
    - Those who consume objects.
    - @Inject
- Producer:
    - Those classes which will produce objects
    - @Module, @Provides, @Binds
- Connector:
    - Connect consume and producer
    - @Component

