# Ejercicio 1

`MedicoResidenteInvestigador` extiende `Medico` y contiene un `Residente`. Así se evita el diamante: `calcularNomina()` se resuelve en la subclase concreta, que combina ambas reglas de manera explícita. El cambio de área del residente es un caso límite incluido en `main`.
