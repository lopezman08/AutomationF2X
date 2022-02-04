# AutomationF2X

El código contiene dos escenarios de prueba con el fin de validar algunas de las funcionalidades para anular sesiones que se encuentran en la sección Sesiones del Módulo de Administración. Para ejecutar la automatizacion basta con abrir la clase Runner y seleccionar ejecutar con JUnit.

IMPORTANTE

Antes de ejecutar la automatización se debe ingresar por consola a la ruta del proyecto y ejecutar el comando mvn clean verify con el fin de limpiar las ejecuciones y evidencias que se realizaron previamente. Posterior a esto se ejecuta la automatizacion y luego de finalizar el proceso, ingresar nuevamente por consola a la ruta del proyecto y ejecutar el comando mvn serenity:aggregate, con este ultimo se genera un reporte de serenity que permite visualizar los resultados de la ejecución de la automatización junto con las evidencias de la ejecución

Para visualizar el reporte es necesario ingresar a la ruta ...\AutomationF2X-master\target\site\serenity y buscar un archivo llamado index, se debe abrir una pestaña en el navegador web que contiene el reporte
