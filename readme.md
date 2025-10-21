# Chestii interesante
## Capitolul 1
Am aflat despre text blocks în Java, care permit scrierea de stringuri multi-linie într-un mod mai ușor de citit și întreținut.
Oleaca cam ciudate.

Exemplu:
```java
String textBlock = """
        Aceasta este o linie.
        Aceasta este o altă \n linie \s assert
        Aceasta este a treia linie.
    """;
System.out.println(textBlock);
```
Output:
```
Aceasta este o linie.
Aceasta este o altă 
 linie.   assert
    Aceasta este a treia linie.
```

## Capitolul 2

Modulo pt. numerele negative în Java, unde rezultatul păstrează semnul împărțitului.
Exemplu:
```java
int result1 = 5 % -3;   // result1 va fi 2
int result2 = -5 % 3;   // result2 va fi -2
int result3 = -5 % -3;  // result3 va fi -2
```

Alta chestie este cea de a 3 a regula de promovare a tipurilor primitive în Java. Când se efectueaza operatii cu short, byte sau char, acestea sunt promovate la int înainte de a se efectua operația.


## Capitolul 3
Pattern matching in structuri de control _if_ și _switch_ în Java, care permite verificarea tipului și extragerea valorii într-un mod mai concis.
Exemplu cu _if_:
```java
Object obj = "Hello, World!";
if (obj instanceof String str) {
    System.out.println("Lungimea stringului este: " + str.length());
}
```

Alta chestie pe care am aflat este referitor la switched expressions în Java, care permit utilizarea expresiilor switch pentru a returna valori, si mai ales keyword ul _yield_ pentru a returna valori dintr un switch.
Exemplu:
```java
int dayOfWeek = 3;
String dayName = switch (dayOfWeek) {
    case 1 -> "Luni";
    case 2 -> "Marți";
    case 3 -> "Miercuri";
    case 4 -> "Joi";
    case 5 -> "Vineri";
    case 6 -> "Sâmbătă";
    case 7 -> "Duminică";
    default -> {
        yield "Zi invalidă";
    }
};
System.out.println("Numele zilei este: " + dayName);
```

Alta chestie interesanta ar fi labels în Java, care permit etichetarea blocurilor de cod pentru a facilita controlul fluxului, în special în buclele imbricate.
Exemplu:
```java
OUTER_LOOP:
for (int i = 0; i < 5; i++) {
    INNER_LOOP:
    for (int j = 0; j < 5; j++) {
        if (i + j > 5) {
            break OUTER_LOOP; // Iese din ambele bucle
        }
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

## Capitolul 4
Arrays.binarySearch în Java, ce permite cautarea eficienta intr-un array ce se presupune ca ar fi sortat. Ce e cam weird ar fi ce returneaza cand nu gaseste elementul cautat, ca este o valoare negativa calculata ca -(inseration point) - 1.
In schimb daca array-ul nu este sorta, rezultatul este imprevizibil.

Alta chestie interesanta ar fi Arrays.compare în Java, care permite compararea a două array-uri.

- daca ambele array-uri sunt egale -- 0
- daca primul array este mai mic (dpdv al ) -- o valoare negativa
- daca primul array este lexicografic mai mare -- o valoare pozitiva

