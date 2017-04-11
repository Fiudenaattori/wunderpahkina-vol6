Ohessa pari kirjoittamaani ratkaisua tuoreimpaan wunderpähkinään.

Ensimmäinen on kirjoitettu C++11:llä, ja lukee syötteensä standard inputista. Koodin voi ajaa ja kääntää esimerkiksi:

$ env CXXFLAGS="-Os -std=c++11 -Wall" make wunderpahkina-vol6
$ ./wunderpahkina-vol6 < input.txt

Toinen on kirjoitettu J:llä ja olettaa löytävänsa työhakemistostaan tiedoston 'input.txt', joka on samanmuotoinen kuin githubista löytyvä esimerkki. Koodin ajamiseksi pitää ladata J-ajoympäristö (http://code.jsoftware.com/wiki/System/Installation), jonka jälkeen koodi ajetaan:

$ /path/to/j64-805/bin/jconsole < wunderpahkina-vol6.ijs

Koodeistani en ole ylpeä niinkään sen takia mitä niissä on, vaan siksi mitä niistä puuttuu.
- C++-ratkaisusta puuttuvat kielelle tyypilliset muistinvaraukset sekä kontrollirakenteet, ja kaikki logiikka onkin totetutettu STL:n avulla.
- J-koodista taas puuttuu kokonaan välilyönnit, tai oikeastaan minkäänlainen järkevä rakenne.

Hauskoja lukuhetkiä ja kiitos näistäkin pienistä hetkistä koodailun parissa!

- Atte
