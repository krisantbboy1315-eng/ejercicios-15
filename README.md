# Ejercicio 5

`TransaccionSospechosaException` extiende la rama transaccional e implementa la interfaz de seguridad, simulando herencia múltiple. Cuando se dan las tres condiciones, prevalece la excepción de fraude por ser la de mayor severidad; saldo insuficiente se encadena como causa y límite diario queda como excepción suprimida. Así no se pierde información ni la traza de la causa.
