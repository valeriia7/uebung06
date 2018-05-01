_Übungsaufgabe zur Veranstaltung [Programmieren 2](https://hsro-wif-prg2.github.io) im [Bachelorstudiengang Wirtschaftsinformatik](https://www.fh-rosenheim.de/technik/informatik-mathematik/wirtschaftsinformatik-bachelor/) an der [Hochschule Rosenheim](http://www.fh-rosenheim.de)._


# Rekursion

Für alle Teilaufgaben gilt: Es darf kein `for` oder `while` verwendet werden.
Die Aufgaben sollen allein durch Rekursion realisiert werden.

Vorgehensweise:

1. Identifizieren Sie den Terminalfall; wann ist die Lösung trivial?
2. Identifizieren Sie den Rekursionsfall; wann ist die Lösung nicht-trivial, aber auf eine andere Lösung zurückzuführen?
3. Welches sind die Parameter für die Methode, und wie müssen diese im Rekursionsfall angepasst werden?

> **Hinweis:** Da die Signaturen bereits vorgegeben sind, ist oft ist eine Hilfsmethode nötig, um die eigentliche Rekursion zu realisieren.


## Rekursion für Arrays

Implementieren Sie die generischen statischen Methoden `toString` und `contains` der vorgegebenen Klasse `Arrays`.
Welche Parameter sind für die Hilfsfunktion sinnvoll?

> **Hinweis:** Versuchen Sie **ohne** Kopien des Arrays auszukommen.


## Rekursion für Listen

Implementieren Sie die Methoden `addRek` und `containsRek` der generischen Klasse `Liste`.
Als Hilfestellung sind die beiden iterativen Implementierungen (`add` und `contains`) gegeben.

> ** Hinweis:** Sie können die Hilfsmethoden entweder in der Klasse `Liste` anlegen, oder aber die Klasse `Liste.Element` erweitern.


## Rekursion für Binärbäume

Implementieren Sie die Methoden `addRek` und `containsRek` der generischen Klasse `Baum`.
Als Hilfestellung sind auch hier die iterativen Implementierungen (`add` und `contains`) gegeben.


## Zusatzaufgabe

Implementieren Sie die Methoden `toStringRek` der Klassen `Liste` und `Baum` rekursiv.
Die jeweils iterativen `toString` Methoden sind gegeben.

