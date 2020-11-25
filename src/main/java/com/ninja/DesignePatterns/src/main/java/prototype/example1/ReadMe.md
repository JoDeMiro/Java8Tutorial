A minta lényege a klónozás, azaz az eredeti objektummal megegyező új példány létrehozása.
Az egyszerű értékadás erre nem alkalmas, mivel az csak az objektum hivatkozását másolja le, melynek eredményeképpen az
eredeti példány és másolata ugyanoda hivatkozik. Két típust különböztetünk meg, a sekély és a mély klónozást.
A sekély klónozás esetében az osztály által hivatkozott objektumokat ugyanúgy másoljuk,
mint elemi típusú tulajdonságait.
A mély klónozásnál az osztály által hivatkozott objektumokat is klónozzuk.

Ha valódi másolatot szeretnénk az objektumról, akkor használjunk klónozást.
A másolat azt jelenti, hogy nem ugyanaz az objektum, de olyan, mint az eredeti.
Ha az objektum még új, tehát még nem végeztünk rajta állapotváltoztató műveletet,
akkor hívhatunk konstruktort is, megfelelő paraméterekkel, de ez többszálú környezeten ellenjavallt.
Az atomi tulajdonság biztosítására is hasznos a klón, mivel a műveleteket a klónon végezzük,
és csak sikeres esetben cseréljük le az eredetit a másolatra, amin immár az újabb műveletek
is el vannak végezve. Tipikus példa a bankszámla.