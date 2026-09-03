# Ejercicio 3

`Cuadrado` no hereda de `Rectangulo`: si el rectángulo tuviera setters independientes, cambiar solamente el ancho rompería el invariante del cuadrado y Liskov. Cada `escalar` devuelve covariantemente su clase concreta; la compuesta lo aplica recursivamente a sus hijos.
