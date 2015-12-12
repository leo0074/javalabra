javalabra
Demolition-tyyppinen peli, missä pelaaja ohjaan ruudun alaosassa olevaa lautaa, millä pyrkii estämään pallon pääsyn ruudun alaosan yli ja tuhoamaan kentässä olevia pelikoita.
Pelin ideana on tuhota pallolla kaikki kentän yläosassa sijaitsevat laatat päästämttä palloa karkaamaan kentän alaosasta
Käyttäjät: pelaaja
pelaajan toiminnot:
	laudan siirtäminen kentässä hiiren avulla
	pelin aloittaminen, keskeyttäminen ja jatkaminen
	seuraavaan kenttään siirtyminen

rakennekuvaus:
Ohjelman keskeisin luokka on Kenttä, joka yhdistää muiden luokkien toiminnallisuutta. Viesti-luokan tehtävä on piirtää kentän alareunaan statusviestejä esim. jos pallo menee
kentän yli niin viesti muuttuu. Laatta kuvaa pelikentän yläosassa olevia laattoja, jotka tutkivat osuuko pallo niihin ja jos osuu merkkaavat itsensä deaktiiviseksi ja ilmoittavat
pistelaskurille. Pistelaskuri pitää kirjaa pisteistä ja ilmoittaa ne kentän oikeaan alareunaan. Lauta kuvaa kentän alaosassa olevaa lautaa, jota pelaaja voi hiiren avulla liikutella.
Lauta siis tutkii missä hiiri sijaitsee ja siirtyy sitä vastaavaan x-koordinaattiin. 

Paivittaja vastaa siitä, että peli kulkee eteenpäin eli, että pallo liikkuu eteenpäin ja että lauta pysyy hiiren perässä. Pallo on kentän pallo, joka tietää missä sijaitsee ja ilmoittaa
kentälle, jos se päätyy ulos pelikentästä. Reunat-luokka vastaa siitä, ettei pallo mene kentän sivujen tai yläosan ylitse.
Nappaimisto kuuntelee näppäimistön painalluksia ja muuttaa pelin kulkua niiden mukaan, jos tilanne pelissä on sopiva.

