Az egyke használható lusta inicializációval. Ekkor a példány csak az osztálymetódus első hívásakor jön létre.
Ha ezt párhuzamos környezetben használják, akkor biztosítani kell, hogy ne legyen race condition, különben több szál is
létrehozhat egy példányt, ami kritikus a rendszer szempontjából, és annak összeomlását okozhatja.
A következő Java példa duplán ellenőrzött zárolással használja a lusta példányosítást, így biztosítva a szálbiztosságot. 