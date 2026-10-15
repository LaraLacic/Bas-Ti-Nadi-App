package com.example.bastinadiapp.ui.theme

import com.example.bastinadiapp.R

class Attraction(
    val city: String,
    var id: Int,
    val image: Int,
    val title: String,
    val workingHours: String,
    val ticketPrice: String,
    val rating: String,
    val description: String,
    var isFavorited: Boolean
)

val attractions : List<Attraction> = listOf(
    Attraction(
        city = "Zagreb",
        id = 0,
        title = "Muzej prekinutih veza",
        image = R.drawable.muzej_prekinutih,
        description = "Muzej s jedinstvenim izlošcima koji pričaju priče o ljubavi, vezama i prekidima.",
        workingHours = "Radnim danima: 9:00 - 21:00\n" +
                        "Vikendom: 10:00 - 22:00",
        ticketPrice = "Odrasli: 8 €\n" +
                        "Djeca i studenti: 4 €",
        rating = "★★★★☆ (4.6/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Zagreb",
        id = 1,
        title = "Maksimir park i Zooloski vrt",
        image = R.drawable.patk_maksimir,
        description = "Predivan gradski park s jezerima, šetnicama i zoološkim vrtom. Idealan za obitelji i ljubitelje prirode.",
        workingHours = "8:00 - 20:00",
        ticketPrice = "Odrasli: 5 €\n" +
                        "Djeca: 3 €",
        rating = "★★★★☆ (4.5/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Zagreb",
        id = 2,
        title = "Gornji grad i Kamenita vrata",
        image = R.drawable.gornji_grad,
        description = "Povijesni dio Zagreba s uskim ulicama, starim zgradama i čuvenim Kamenitim vratima – simbolom zaštite grada.",
        workingHours = "Otvoreno cijeli dan.",
        ticketPrice = "Besplatno.",
        rating = "★★★★★ (4.7/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Zagreb",
        id = 3,
        title = "Tehnički muzej Nikola Tesla",
        image = R.drawable.tehnicki_muzej_nt,
        description = "Muzej posvećen znanosti i tehnologiji, uključujući zbirke o Tesli i inovacijama iz Hrvatske.",
        workingHours = "Utorak - Subota: 9:00 - 17:00\n" +
                        "Nedjelja: 10:00 - 13:00",
        ticketPrice = "Odrasli: 5 €\n" +
                        "Djeca i studenti: 3 €",
        rating = "★★★★☆ (4.6/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Zagreb",
        id = 4,
        title = "Botanički vrt Zagreb",
        image = R.drawable.botanicki_zagreb,
        description = "Oaza mira u centru Zagreba s bogatom zbirkom biljaka, idealna za šetnje i opuštanje.",
        workingHours = "9:00 - 16:00",
        ticketPrice = "Besplatno",
        rating = "★★★★☆ (4.5/5)",
        isFavorited = false
    ),

    Attraction(
        city = "Dubrovnik",
        id = 5,
        title = "Stari Grad i Zidine Dubrovnika",
        image = R.drawable.zidine_dubrovnik,
        description = "Povijesni dio Dubrovnika s impresivnim zidinama, starim palačama i crkvama. Ove zidine su simbol bogate povijesti grada i pružaju spektakularan pogled na more.",
        workingHours = "Ljetno (1.4. - 31.10.): 8:00 - 19:30\n" +
                        "Zimsko (1.11. - 31.3.): 9:00 - 15:00",
        ticketPrice = "Odrasli: 35 €\n" +
                        "Djeca: 15 €",
        rating = "★★★★★ (4.8/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Dubrovnik",
        id = 6,
        title = "Lokrum otok",
        image = R.drawable.lokrum,
        description = "Predivan otočić samo 10 minuta brodom od Dubrovnika. Nudi mirne plaže, botanički vrt i povijesne ruševine.",
        workingHours = "10:00 AM - 8:30 PM",
        ticketPrice = "Brodska karta: 27 € (uključuje ulaz na otok)",
        rating = "★★★★★ (4.7/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Dubrovnik",
        id = 7,
        title = "Franjevački samostan",
        image = R.drawable.samostan_dubrovnik,
        description = "Povijesni samostan s jednim od najstarijih ljekarni u Europi. Impresivna arhitektura i zbirka umjetnina.",
        workingHours = "Ljeto: 9:00 - 18:00\n" +
                        "Zima: 9:00 - 16:00",
        ticketPrice = "Odrasli: 7 €\n" +
                        "Djeca: 4 €",
        rating = "★★★★☆ (4.5/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Dubrovnik",
        id = 8,
        title = "Tvrđava Lovrijenac",
        image = R.drawable.lovrijenac,
        description = "Tvrđava Lovrijenac, poznata kao \"Gibraltar Dubrovnika\", impozantna je utvrda smještena na 37 metara visokoj stijeni izvan zidina Starog grada. Izgrađena u 11. stoljeću, služila je kao ključna obrambena točka Dubrovnika protiv Mlečana. Danas je poznata i kao spektakularna pozornica za izvedbe Shakespeareovog *Hamleta* te kao kulisa popularnih filmskih i TV produkcija.",
        workingHours = "8:00 - 19:00",
        ticketPrice = "Uključeno u kartu za gradske zidine : Odrasli: 35 €\n" +
                        "Djeca: 15 €",
        rating = "★★★★★ (4.7/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Dubrovnik",
        id = 9,
        title = "Plaža Banje",
        image = R.drawable.plaza_banje,
        description = "Popularna gradska plaža s predivnim pogledom na Stari Grad.",
        workingHours = "Otvoreno cijeli dan",
        ticketPrice = "Besplatno",
        rating = "★★★★☆ (4.6/5)",
        isFavorited = false
    ),

    Attraction(
        city = "Split",
        id = 10,
        title = "Dioklecijanova palača",
        image = R.drawable.dioklecijanova_palaca,
        description = "Monumentalni rimski kompleks koji predstavlja srce Splita. Unutar zidina nalaze se crkve, trgovi i uske ulice prepune života.",
        workingHours = "9:00 - 20:00",
        ticketPrice = "Besplatan ulaz u kompleks (ture dodatno naplaćene).",
        rating = "★★★★☆ (4.7/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Split",
        id = 11,
        title = "Park Marjan",
        image = R.drawable.park_marjan,
        description = "Brdo iznad Splita koje nudi šetnice, biciklističke staze i panoramske poglede na grad i more.",
        workingHours = "Otvoreno cijeli dan",
        ticketPrice = "Besplatno",
        rating = "★★★★☆ (4.8/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Split",
        id = 12,
        title = "Riva",
        image = R.drawable.riva,
        description = "Popularna šetnica uz more, prepuna kafića, restorana i trgovina. Idealno za opuštanje uz kavu i uživanje u pogledu na more.",
        workingHours = "Otvoreno cieli dan",
        ticketPrice = "Besplatno",
        rating = "★★★★★ (4.8/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Split",
        id = 13,
        title = "Galerija Meštrović",
        image = R.drawable.galerija_mestrovic,
        description = "",
        workingHours = "Utorak - Nedjelja: 9:00 - 19:00\n" +
                        "Ponedjeljak: Zatvoreno",
        ticketPrice = "Odrasli: 8 €\n" +
                        "Djeca i studenti: 4 €",
        rating = "★★★★☆ (4.6/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Split",
        id = 14,
        title = "Bačvice plaža",
        image = R.drawable.plaza_bacvice,
        description = "Najpoznatija splitska plaža poznata po piciginu i živahnoj atmosferi.",
        workingHours = "Otvoreno cijeli dan",
        ticketPrice = "Besplatno",
        rating = "★★★★★ (4.8/5)",
        isFavorited = false
    ),

    Attraction(
        city = "Zadar",
        id = 15,
        title = "Morske orgulje i Pozdrav Suncu",
        image = R.drawable.orgulje_zadar,
        description = "Inovativni projekt koji spaja arhitekturu i prirodu. Morske orgulje proizvode glazbu valovima, dok Pozdrav Suncu osvjetljava noć.",
        workingHours = "Otvoreno 24 sata",
        ticketPrice = "Besplatno",
        rating = "★★★★★ (4.9/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Zadar",
        id = 16,
        title = "Crkva sv. Donata",
        image = R.drawable.crkva_sv_donata,
        description = "Predromanička crkva iz 9. stoljeća, simbol Zadra i jedan od najbolje očuvanih spomenika tog razdoblja.",
        workingHours = "Ljeto: 9:00 - 20:00\n" +
                        "Zima: 9:00 - 17:00",
        ticketPrice = "4 €",
        rating = "★★★★☆ (4.6/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Zadar",
        id = 17,
        title = "Narodni trg",
        image = R.drawable.narodni_trg,
        description = "Povijesni trg u srcu grada, okružen kafićima i povijesnim zgradama, idealan za promatranje gradske atmosfere.",
        workingHours = "Otvoreno cijeli dan.",
        ticketPrice = "Besplatno",
        rating = "★★★★☆ (4.5/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Zadar",
        id = 18,
        title = "Arheološki muzej Zadar",
        image = R.drawable.arheoloski_muzej_zadar,
        description = "Muzej s bogatom zbirkom artefakata iz rimskog i srednjovjekovnog razdoblja.",
        workingHours = "Ljetno: 9:00 - 21:00\n" +
                        "Zimsko: 9:00 - 15:00",
        ticketPrice = "Odrasli: 6 €\n" +
                        "Djeca: 3 €",
        rating = "★★★★☆ (4.4/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Zadar",
        id = 19,
        title = "Pješčana plaža Kolovare",
        image = R.drawable.kolovare,
        description = "Popularna gradska plaža s bistrom vodom i mnogo sadržaja za obitelji.",
        workingHours = "Otvoreno cijeli dan",
        ticketPrice = "Besplatno",
        rating = "★★★★☆ (4.6/5)",
        isFavorited = false
    ),

    Attraction(
        city = "Rijeka",
        id = 20,
        title = "Trsatska gradina",
        image = R.drawable.trsatska_gradina,
        description = "Srednjovjekovna utvrda s koje se pruža pogled na cijeli grad i Kvarnerski zaljev.",
        workingHours = "Ljetno (1.4. - 31.10.): 8:00 - 19:30\n" +
                        "Zimsko (1.11. - 31.3.): 9:00 - 15:00",
        ticketPrice = "Besplatno",
        rating = "★★★★☆ (4.5/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Rijeka",
        id = 21,
        title = "Muzej moderne i suvremene umjetnosti",
        image = R.drawable.muzej_msu,
        description = "Prostor za izložbe suvremene umjetnosti, s radovima hrvatskih i međunarodnih umjetnika.",
        workingHours = "Utorak - Subota: 10:00 - 18:00\n" +
                        "Nedjelja i ponedjeljak: Zatvoreno",
        ticketPrice = "5 €",
        rating = "★★★★☆ (4.4/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Rijeka",
        id = 22,
        title = "Korzo",
        image = R.drawable.korzo_rijeka,
        description = "Glavna pješačka ulica u Rijeci, prepuna trgovina, kafića i povijesnih zgrada. Popularno mjesto za druženje i šetnju.",
        workingHours = "Otvoreno cijeli dan.",
        ticketPrice = "Besplatno.",
        rating = "★★★★★ (4.7/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Rijeka",
        id = 23,
        title = "Astronomski centar Rijeka",
        image = R.drawable.astronomski_centar,
        description = "Jedinstveni astronomski centar s planetarijem i interaktivnim sadržajima za ljubitelje svemira.",
        workingHours = "Utorak - Subota: 16:00 - 22:00",
        ticketPrice = "Odrasli: 5 €\n" +
                        "Djeca: 3 €",
        rating = "★★★★☆ (4.6/5)",
        isFavorited = false
    ),

    Attraction(
        city = "Pula",
        id = 24,
        title = "Arena Pula",
        image = R.drawable.arena_pula,
        description = "Rimski amfiteatar, jedan od najočuvanijih u svijetu, gdje se održavaju koncerti i događaji.",
        workingHours = "Ljeto: 8:00 - 20:00\n" +
                        "Zima: 9:00 - 17:00",
        ticketPrice = "Odrasli: 10 €\n" +
                        "Djeca: 5 €",
        rating = "★★★★★ (4.8/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Pula",
        id = 25,
        title = "Brijuni nacionalni park",
        image = R.drawable.brijuni,
        description = "Arhipelag s bujnom prirodom, povijesnim ostacima i safari parkom. Idealno za jednodnevni izlet.",
        workingHours = "8:00 - 18:00",
        ticketPrice = "Odrasli: 35 € (uključuje brod i vodiča)\n" +
                        "Djeca: 18 €",
        rating = "★★★★★ (4.7/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Pula",
        id = 26,
        title = "Rt Kamenjak",
        image = R.drawable.rt_kamenjak,
        description = "Predivni poluotok s netaknutom prirodom i kristalno čistim morem.",
        workingHours = "Otvoreno cijeli dan",
        ticketPrice = "10 € po automobilu",
        rating = "★★★★★ (4.9/5)",
        isFavorited = false
    ),

    Attraction(
        city = "Šibenik",
        id = 27,
        title = "Katedrala sv. Jakova",
        image = R.drawable.katedrala_sv_jakova,
        description = "UNESCO-ov zaštićeni spomenik, poznat po svojim jedinstvenim kamenom detaljima i arhitektonskoj ljepoti.",
        workingHours = "Ljeto: 9:00 - 19:00\n" +
                        "Zima: 10:00 - 17:00",
        ticketPrice = "5 €",
        rating = "★★★★★ (4.8/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Šibenik",
        id = 28,
        title = "Tvrđava sv. Mihovila",
        image = R.drawable.tvrdava_sv_mihovila,
        description = "Povijesna tvrđava s amfiteatrom na vrhu, koja nudi nevjerojatan pogled na Šibenik i obližnje otoke.",
        workingHours = "Ljeto: 9:00 - 22:00\n" +
                        "Zima: 10:00 - 18:00",
        ticketPrice = "10 €",
        rating = "★★★★★ (4.7/5)",
        isFavorited = false
    ),

    Attraction(
        city = "Osijek",
        id = 29,
        title = "Tvrđa",
        image = R.drawable.tvrda_osijek,
        description = "Povijesna barokna utvrda koja je danas živahno mjesto s restoranima, galerijama i događanjima.",
        workingHours = "Otvoreno cijeli dan",
        ticketPrice = "Besplatno",
        rating = "★★★★★ (4.8/5)",
        isFavorited = false
    ),
    Attraction(
        city = "Osijek",
        id = 30,
        title = "Zoološki vrt Osijek",
        image = R.drawable.zoo_osijek,
        description = "Najstariji zoološki vrt u Hrvatskoj, smješten uz Dravu. Popularno mjesto za obitelji.",
        workingHours = "9:00 - 19:00",
        ticketPrice = "Odrasli: 4 €\n" +
                        "Djeca: 2 €",
        rating = "★★★★☆ (4.5/5)",
        isFavorited = false
    )
)