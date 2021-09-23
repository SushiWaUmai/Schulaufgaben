# Vererbung

### Abstrakte Klassen
- Keine Objekte erstellbar
- Bauplan für Unterklassen -> verschiedene Unterklassen, bestimmte Funktionalität garantieren
  - abstrakte Methoden
  - Keine fertige Implementation

### Subtyping
- Objekte der Unterklasse finden an Stellen Verwendung, wo Objekte der Oberklasse erwartet werden.
- Objekt bei Konstruktoren!
```java
Fahrzeug f1 = new Fahrzeug();   //✔️
Fahrzeug f2 = new Auto();       //✔️
Fahrzeug f3 - new Fahrrad();    //✔️
Auto meinAuto = new Fahrrad();  //❌
Auto a2 = new Farrad();         //❌
Auto meinVIP = new Cabrio();    // Subtyping
Auto meinVIP2 = new Auto();     // Regulaer
```

### Typecast
Objekte der Oberklasse werden explizit als Objekt der Unterklasse gecastet.

```java
Fahrzeug f;
Auto a;
Fahrrad r;

a = new Auto();
f = a;

// Beim Compilieren Fehler!❌
r = (Fahrrad)a;

// Beim Compilieren OK.
// Da f von Klasse Auto und Auto keine Oberklasse zu Fahrrad
// => Laufzeitfehler❌
r = (Fahrrad)f; 
```