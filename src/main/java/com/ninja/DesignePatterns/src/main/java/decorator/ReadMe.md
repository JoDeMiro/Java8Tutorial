Az objektumorientált programozásban (OOP) a díszítő programtervező minta egy olyan programtervezési minta,
amely lehetővé teszi adott objektumokhoz más viselkedések hozzáadását akár statikusan, akár dinamikusan anélkül,
hogy hatással lenne az azonos osztályból származó többi objektumra.[1] A díszítő gyakran alkalmas arra is,
hogy a program megfeleljen az egyértelmű felelősség elvének, mivel lehetővé teszi a felelősségek egyértelmű
felosztását különböző osztályok között.

https://hu.wikipedia.org/wiki/Díszítő_programtervezési_minta

A díszítő minta arra használható, hogy kiterjeszthető legyen (díszítés) számos objektum funkcionalitása statikusan vagy
néhány esetben futási időben, függetlenül más azonos osztályhoz tartozó példányoktól, mindehhez alapozást nyújtva
tervezési időben. Mindez megvalósítható egy új díszítő osztály tervezésével, amely becsomagolja az eredeti osztályt.

A becsomagolás megvalósítható a következő lépések sorozatával: 
1, hozzunk létre egy "díszítő" osztályt az eredeti "komponens" alosztályaként (lásd az UML diagramot);
2, a díszítő osztályban adjunk hozzá egy komponens referenciát mezőként;
3, adjunk át egy komponenst a díszítő osztály konstruktorának, hogy kezdő értékkel töltse fel a komponens referenciát;
4, a díszítő osztályban minden "Komponens" metódust irányítsunk át a "Komponens" referenciára és
5, a konkrét díszítő osztályban felüldefiniálhatjuk bármelyik Komponens metódust, amelyik viselkedését módosítani szükséges.

Ezt a mintát arra tervezték, hogy többszörös díszítőket lehessen egymásra halmozni a másik tetején, minden alkalommal új
funkcionalitást adva hozzá a felüldefiniált metódus(ok)hoz. 
Jegyezzük meg, hogy a díszítők és az eredeti osztály objektum közös funkcionalitás halmazon osztoznak.
A fenti diagramban az "operation()" metódus elérhető a díszítőkben és a díszített objektumban egyaránt. 
A díszítő jellegzetességek lehetnek metódusok, tulajdonságok, vagy egyéb tagok, melyeket általában egy
interfész deklarál, vagy osztály öröklődés definiál, amelyet a díszítők megosztanak egymás közt és a
díszítő objektum között. A fenti példában a "Komponens" osztályt örökli mind a konkrét komponens,
mind a díszítőből (Decorator) származó alosztályok.
A díszítő minta alternatívája az alosztályok képzésének. Az alosztályok képzésével viselkedések adhatók hozzá fordítási
időben, és a változás kihat az eredeti osztály összes példányára, míg a díszítő minta használatával futási időben
biztosítható új viselkedés egyéni objektumok számára. 
Ez a különbség akkor válik nagyon fontossá, amikor sokféle független módon lehetséges a funkcionalitás kiterjesztése.
Néhány objektumorientált programozási nyelvben az osztályok létrehozása futási időben nem lehetséges, és tipikusan nem
lehetséges megjósolni tervezési időben, hogy a kiterjesztések milyen kombinációjára lesz szükség később.
Ez azt jelentené, hogy egy új osztálynak el kéne készíteni az összes lehetséges kombinációját.
Ezzel szemben a díszítők objektumok, melyek futási időben jönnek létre, kombinálhatók használat előtt.
Az I/O folyamok megvalósítása mind a Java-ban, mind a .NET keretrendszerben alkalmazza a díszítő mintát. 