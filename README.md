# Taller-3

## Tema B
El código presenta varias violaciones a los principios SOLID, estos son los siguientes:

-En la línea 2, de la clase ShoppingCart, no se está respetando el Dependency Inversion Principle, ya que la clase está dependiendo de un módulo concreto, en vez de depender de una abstracción; esto se puede solucionar haciendo que la lista sea de una interfaz Comprable, dando más flexibilidad.

-En la línea 14, la clase ShoppingCart viola el Single Responsability Principle al añadirle una función de más a la clase, que además no tiene relación con ella; esto se puede solucionar creando otra clase, como EnviaRecibo, para poner la lógica del método enviar recibo.

-En la línea 48, en la clase DigitalProduct, se viola el principio Liskov Substitution Principle, ya que el método getWeight que es heredado está teniendo dando un resultado no esperado; la solución a esto es crear una nueva Interfaz llamada Shoppable que permita a una clase convertirse en un artículo que se pueda agregar al carrito, eliminando la necesidad que extiendan de Product.

-En la línea 54, en el método calculateIVA de la clase IvaCalculator, se viola el Open Closed Principle, debido a que la lógica está abierta a la modificación; para solucionar esto, la interfaz Shoppable mencionada anteriormente también serviría, se podría incluir el método calculateIVA en la interfaz, eliminando la necesidad de una clase IvaCalculator.
