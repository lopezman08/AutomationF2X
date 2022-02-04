# AutomationF2X

El código contiene dos escenarios de prueba con el fin de validar algunas de las funcionalidades para anular sesiones que se encuentran en la sección Sesiones del Módulo de Administración. Para ejecutar la automatizacion basta con abrir la clase Runner y seleccionar ejecutar con JUnit. No es necesario descargar el ChromeDriver dado que la automatización se encarga de descargar el driver necesario para la ejecución de la prueba.

Se incluyen dos archivos, el primero se llama Evidencias ejecución casos de prueba.pdf y contiene las evidencias de la ejecución de los casos de prueba manuales. El segundo archivo se llama Proceso de desarrollo de software. txt y contiene una breve explicación del proceso de desarrollo de software.

El reporte de las incidencias encontradas durante la ejecución de las pruebas se encuentra en el siguiente enlace: https://my.bugasura.io/testReports/75604/App/87538. Para esta función se utiliza una herramienta llamada "bugasura", se envia invitación de acceso al correo julio.carvajal@f2x.com.co para la visualización de los mismos y se adjunta el archivo excel con el resumen de los bugs evidenciados. Cabe resaltar que en el reporte se encuentran otros issues reportados que corresponden a una explicación de la herramienta bugasura pero no hacen parte de los bugs encontrados en las pruebas.

IMPORTANTE

Antes de ejecutar la automatización se debe ingresar por consola a la ruta del proyecto y ejecutar el comando mvn clean verify con el fin de limpiar las ejecuciones y evidencias que se realizaron previamente. Posterior a esto se ejecuta la automatizacion y luego de finalizar el proceso, ingresar nuevamente por consola a la ruta del proyecto y ejecutar el comando mvn serenity:aggregate, con este ultimo se genera un reporte de serenity que permite visualizar los resultados de la ejecución de la automatización junto con las evidencias de la ejecución.

Para visualizar el reporte es necesario ingresar a la ruta ...\AutomationF2X-master\target\site\serenity y buscar un archivo llamado index, se debe abrir una pestaña en el navegador web que contiene el reporte.
