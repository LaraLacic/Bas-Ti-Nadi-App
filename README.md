# 📱 Baš Ti Nađi App (`BasTiNadiApp`)

**Baš Ti Nađi App** je moderna Android aplikacija razvijena u programskom jeziku **Kotlin** i sučelju **Jetpack Compose**. Aplikacija je namijenjena istraživanju svjetskih gradova, pregledu detaljnih informacija o gradskim atrakcijama te vođenju personaliziranog popisa mjesta za posjetiti u sklopu planiranja putovanja.

---

## 📋 Sadržaj
- [O aplikaciji](#-o-aplikaciji)
- [Glavne značajke i zasloni](#-glavne-značajke-i-zasloni)
- [Arhitektura i Navigacija](#-arhitektura-i-navigacija)
- [Tehnologije i okviri](#-tehnologije-i-okviri)
- [Upute za pokretanje](#-upute-za-pokretanje)
- [Autor](#-autor)

---

## 🚀 O aplikaciji
Aplikacija korisnicima pruža intutivan i vizualno atraktivan doživljaj istraživanja turističkih destinacija s tamnom temom (`#0D1B2A`). Korisnik može brzo pretraživati gradove, pregledavati ključne informacije o pojedinim atrakcijama (radno vrijeme, cijena ulaznice, ocjena, opis) te dodavati vlastite atrakcije i označavati ih na popisu za putovanje.

---

## 🛠️ Glavne značajke i zasloni

### 1. Istraživanje gradova (`CityScreen`)
* **Pretraživanje u realnom vremenu:** Interaktivna traka za pretraživanje (`SearchBar`) s dinamičkim filtriranjem atrakcija prema nazivu grada (case-insensitive).
* **Prikaz u mreži (Grid Layout):** Prikaz atrakcija u karticama posloženima po dvije u redu (`Row` unutar `LazyColumn`).
* **Kartice atrakcija (`AttractionCard`):** Zaobljene kartice sa slikom i naslovom atrakcije na preklapajućoj tamnoj pozadini.

### 2. Detalji o atrakciji (`AttractionDetailsScreen`)
* **Glavna slika i zaglavlje:** Prošireni slikovni prikaz s gradijentnim prijelazom i brzim gumbima za povratak na početni ekran ili odlazak na planer putovanja.
* **Strukturirane informacije:** Prikaz opisa atrakcije te ključnih parametara:
  * 🕒 **Radno vrijeme** (`Working hours`)
  * 🎟️ **Cijena ulaznice** (`Ticket price`)
  * ⭐ **Ocjena** (`Rating`)

### 3. Planer putovanja (`TripScreen`)
* **Osobni popis atrakcija:** Mogućnost dodavanja vlastitih mjesta koja korisnik želi posjetiti putem pop-up dijaloga (`AlertDialog`).
* **Interaktivno označavanje:** Kvačice (`Checkbox`) koje pri označavanju prekriže naziv atrakcije (`TextDecoration.LineThrough`)

---

## 🧩 Arhitektura i Navigacija

Aplikacija koristi deklarativni **Jetpack Compose Navigation Controller** za upravljanje prijelazima između zaslona:
* **Rute (`Routes`):**
  * `CityScreen`: Početni zaslon pretraživanja.
  * `AttractionDetails/{attractionId}`: Dinamička ruta koja prima cjelobrojni identifikator atrakcije (`NavType.IntType`).
  * `TripScreen`: Zaslon za planiranje i vođenje popisa atrakcija.

---

## 💻 Tehnologije i okviri
* **Jezik:** [Kotlin](https://kotlinlang.org/)
* **UI Okvir:** Jetpack Compose (Material 3)
* **Navigacija:** `androidx.navigation:navigation-compose`
* **Komponente i prilagodbe:** `LazyColumn`, `OutlinedTextField`, `AlertDialog`, `AnimatedContentSize`, Custom `CircularButton`.
* **Dizajn i Teme:** Prilagođena tamna paleta boja (`0xFF0D1B2A`, `0xFF1B263B`), gradijenti i Edge-to-Edge podrška (`enableEdgeToEdge()`).

---

## ⚙️ Upute za pokretanje

1. **Klonirajte repozitorij:**
   ```bash
   git clone [https://github.com/LaraLacic/BasTiNadiApp.git](https://github.com/LaraLacic/BasTiNadiApp.git)
2. **Otvorite Android Studio (Hedgehog ili noviji).**
* Odaberite Open i odaberite mapu projekta.
3.Pokretanje:
* Pričekajte da se završi sinkronizacija Gradle zavisnosti.
* Pokrenite aplikaciju na Android emulatoru ili fizičkom uređaju s Android OS-om.

---

## 👤 Autor

* **Lara Lacić**
* **Ustanova:** Fakultet elektrotehnike, računarstva i informacijskih tehnologija Osijek (FERIT)
* **Studij:** Sveučilišni diplomski studij Računarstvo
