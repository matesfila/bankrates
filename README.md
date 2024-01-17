Aplikácia obsahuje tieto **enpointy**:

Zoznam kurzov:
http://localhost:8080/getRates

Výpočet prevodu:
http://localhost:8080/computeRate

Príklad použitia výpočtu prevodu:
http://localhost:8080/computeRate?currencyFrom=EUR&currencyTo=USD&value=10

Hlavný **zdrojový kód** je v package:
com.tatrabanka.zadanie.matusfila.bankrates

**Databáza** je v pamäti (H2) a inicializuje sa pri spusteni aplikácie, dáta sú uložené v src/main/resources/import.sql.

**Unit testy** sú v triede BankratesApplicationTests.

Po zbuildovaní vznikne target/bankrates-0.0.1-SNAPSHOT.jar, ktoré je plnohodnotné so všetkými závislosťami, samostatne spustiteľné príkazom java -jar.

**Docker** sa dá vytvoriť vďaka Dockerfile a vďaka pomocným windows shell skriptom na vytvorenie docker image a spustenie kontajnera:
docker_build.bat
docker_run.bat

Vyvíjal som pomocou týchto nástrojov:
Windows 11, IntelliJ Idea, Liberica Java 17.0.9, maven 3.6.3.
