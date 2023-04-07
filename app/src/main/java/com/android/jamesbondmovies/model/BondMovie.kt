package com.android.jamesbondmovies.model

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.compose.ui.res.stringResource


import com.android.jamesbondmovies.R

data class BondMovie(
    val id : Int,
    val title : String,
    val year : String,
    val rating : String,
    val movieInfo : String,
    val actors : String,
    val director : String,
    val image : Int
)

fun movieList() : List<BondMovie>{
    return listOf(
            BondMovie(
                1,
                "Dr. No",
                "1962",
                "95%",
                "In the film that launched the James Bond saga, Agent 007 (Sean Connery) battles mysterious Dr. No, a scientific genius bent on destroying the U.S. space program. As the countdown to disaster begins, Bond must go to Jamaica, where he encounters beautiful Honey Ryder (Ursula Andress), to confront a megalomaniacal villain in his massive island headquarters",
                " Sean Connery, Ursula Andress, Joseph Wiseman, Jack Lord",
                " Terence Young",
                R.drawable.dr_no_image
            ),
        BondMovie(
            2,
            "FROM RUSSIA WITH LOVE",
            "1963",
            "97%",
            "Agent 007 (Sean Connery) is back in the second installment of the James Bond series, this time battling a secret crime organization known as SPECTRE. Russians Rosa Klebb (Lotte Lenya) and Kronsteen are out to snatch a decoding device known as the Lektor, using the ravishing Tatiana (Daniela Bianchi) to lure Bond into helping them. Bond willingly travels to meet Tatiana in Istanbul, where he must rely on his wits to escape with his life in a series of deadly encounters with the enemy.",
            "  Sean Connery, Daniela Bianchi, Robert Shaw, Lotte Lenya",
            " Terence Young",
            R.drawable.from_russia_with_love_image
        ),
        BondMovie(
            3,
            "GOLDFINGER ",
            "1964",
            "99%",
            "Special agent 007 (Sean Connery) comes face to face with one of the most notorious villains of all time, and now he must outwit and outgun the powerful tycoon to prevent him from cashing in on a devious scheme to raid Fort Knox — and obliterate the world\'s economy.",
            "Sean Connery, Gert Frobe, Honor Blackman, Shirley Eaton",
            "uy Hamilton",
            R.drawable.goldfinger_image
        ),
        BondMovie(
            4,
            "THUNDERBALL",
            "1965",
            "87%",
            "Led by one-eyed evil mastermind Emilio Largo (Adolfo Celi), the terrorist group SPECTRE hijacks two warheads from a NATO plane and threatens widespread nuclear destruction to extort 100 million pounds. The dashing Agent 007, James Bond (Sean Connery), is sent to recover the warheads from the heart of Largo\'s lair in the Bahamas, facing underwater attacks from sharks and men alike. He must also convince the enchanting Domino (Claudine Auger), Largo's mistress, to become a key ally.",
            "Sean Connery, Claudine Auger, Adolfo Celi, Luciana Paluzzi",
            " Terence Young",
            R.drawable.thunderball_image
        ),
        BondMovie(
            5,
            "YOU ONLY LIVE TWICE",
            "1967",
            "73%",
            "During the Cold War, American and Russian spacecrafts go missing, leaving each superpower believing the other is to blame. As the world teeters on the brink of nuclear war, British intelligence learns that one of the crafts has landed in the Sea of Japan. After faking his own death, secret agent James Bond (Sean Connery) is sent to investigate. In Japan, he\'s aided by Tiger Tanaka (Tetsuro Tamba) and the beautiful Aki (Akiko Wakabayashi), who help him uncover a sinister global conspiracy.",
            "Sean Connery, Akiko Wakabayashi, Donald Pleasence, Tetsuro",
            " Lewis Gilbert",
            R.drawable.u_only_live_twice_image
        ),
        BondMovie(
            6,
            "CASINO ROYALE",
            "1967",
            "25%",
            "This wacky send-up of James Bond films stars David Niven as the iconic debonair spy, now retired and living a peaceful existence. Bond is called back into duty when the mysterious organization SMERSH begins assassinating British secret agents. Ridiculous circumstances lead to the involvement of a colorful cast of characters, including the villainous Le Chiffre (Orson Welles), seasoned gambler Evelyn Tremble (Peter Sellers) and Bond\'s bumbling nephew, Jimmy Bond (Woody Allen).",
            " Peter Sellers, Ursula Andress, David Niven, Orson Welles",
            " Val Guest, Ken Hughes, John Huston, Joseph McGrath",
            R.drawable.casino_royale_image
        ),
        BondMovie(
            7,
            "ON HER MAJESTY'S SECRET SERVICE",
            "1969",
            "81%",
            "Agent 007 (George Lazenby) and the adventurous Tracy Di Vicenzo (Diana Rigg) join forces to battle the evil SPECTRE organization in the treacherous Swiss Alps. But the group\'s powerful leader, Ernst Stavro Blofeld (Telly Savalas), is launching his most calamitous scheme yet: a germ warfare plot that could kill millions!",
            " George Lazenby, Diana Rigg, Telly Savalas, Gabriele Ferzetti",
            " Peter R. Hunt",
            R.drawable.on_her_majesty_secret_service_image
        ),
        BondMovie(
            8,
            "DIAMONDS ARE FOREVER",
            "1971",
            "64%",
            "While investigating mysterious activities in the world diamond market, 007 (Sean Connery) discovers that his evil nemesis Blofeld (Charles Gray) is stockpiling the gems to use in his deadly laser satellite. With the help of beautiful smuggler Tiffany Case (Jill St. John), Bond sets out to stop the madman — as the fate of the world hangs in the balance!",
            "Sean Connery, Jill St. John, Charles Gray, Lana Wood",
            "Guy Hamilton",
            R.drawable.diamonds_are_fotrever_image
        )
    )
}