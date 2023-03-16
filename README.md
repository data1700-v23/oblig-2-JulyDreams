Oblig 2
=======
OsloMet brukernavn: s374978

GitHub brukernavn: JulyDreams

Github repo URL: https://github.com/data1700-v23/oblig-2-JulyDreams.git

Fullt navn: Iuliana Tarnovschi

Kort beskrivelse av applikasjon (5-10 setninger):
Denne applikasjonen gjør at brukeren kan kjøpe biletter ved å først fylle ut skjema. JS filen med funksjonen regBilett kalles 
når knappen "Kjøp bilett" er klikket, hvis noen av feltene er ikke fylt ut eller det er fylt feil info blir feilmeldingene 
sendt gjennom tilsvarende id i span. Denne funksjonen henter verdiene som ble fylt inn og legger dem i objektet "bilett". 
Funksjonen sender "bilett"-objektet til serveren med get-"/lagre" der legges hvert objekt i arrayet. hentAlle funksjonen henter 
alle bilettene lagret på serveren og viser dem på nettsiden i span med id="alleBilettene". 
Når knappen "Slett alle bilettene" er trykket blir funksjonen slettAlt kalles og den sender get forespørsel til server at 
den skal slette alt som ligger i "alleBillettene"-id og arrayet blir slettet i controlleren.
Det er en liten feil: når jeg skriver inn kun antall lagres det et array og skrives ut på nettsiden selv om kravet er at alle 
felt skal være fylt ut- snakket med en TA som sa det går fint å levere med denne feilen, vi fant ikke ut av det.