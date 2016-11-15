# sve
Sistema de Voto Electronico

## Metodología de Trabajo con Git

Utilizamos 5 tipos de ramas: Master, Development, Release, Features, y Hotfix.

- Master: ('master')
Es la rama principal. Contiene el repositorio que se encuentra publicado en producción, por lo que debe estar siempre estable.

- Development: ('develop')
Es una rama sacada de master. Es la rama de integración, todas las nuevas funcionalidades se deben integrar en esta rama. 
Luego que se realice la integración y se corrijan los errores (en caso de haber alguno), es decir que la rama se encuentre estable, 
se puede hacer un merge de development sobre la rama release.

- Release: ('release')
Se originan a partir de la rama develop. Se incorporan a master y develop. Esta rama se utilizan para preparar el siguiente 
código en producción. Se hacen los últimos ajustes y se corrigen los últimos bugs antes de pasar el código a producción 
incorporándolo a la rama master.

- Features: ('feature/titulo_representativo')
Cada nueva funcionalidad se debe realizar en una rama nueva, específica para esa funcionalidad. Estas se deben sacar de 
development. Una vez que la funcionalidad esté desarrollada, se hace un merge de la rama sobre development, donde se integrará con 
las demás funcionalidades.

- Hotfix: ('hotfix/titulo_representativo')
Son bugs que surgen en producción, por lo que se deben arreglar y publicar de forma urgente. Es por ello, que son ramas sacadas de 
master. Una vez corregido el error, se debe hacer un merge de la rama sobre master. Al final, para que no quede desactualizada, se debe 
realizar el merge de master sobre development.

### Flujo de Trabajo

	# Cuando aparece un nuevo requerimiento, parados en la rama develop, creamos un nuevo branch de Feature donde desarrollaremos el requerimiento.
	$ git branch feature/miRequerimiento
	$ git checkout feature/miRequerimiento

	# Una vez finalizado el desarrollo, testeado y aprobado, estamos listos para llevar nuestros cambios a la rama 'develop'
	$ git add <archivo_modificado>
	$ git commit -m "<titulo_del_mantis_asociado>"
	$ git checkout develop
	$ git pull origin develop
	$ git merge feature/miRequerimiento

	# Subimos nuestros cambios de la rama 'develop' al repositorio remoto
	# En caso de existir conflictos post merge, los solucionamos y commiteamos estos cambios como se hizo en el paso anterior.
	$ git push origin develop

	# Como hemos finalizado con el nuevo requerimiento, eliminamos la rama de Feature que utilizamos para el desarrollo
	$ git branch -d feature/miRequerimiento
