package com.irfanharfiansyah.listfootballclub;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ClubData {
    //        Menyimpan data nama club
    private static String [] club_name = {
            "Barcelona","Real Madrid","Manchester United","Bayern München",
            "Ajax","Liverpool","Arsenal","Internazionale",
            "AC Milan","Atletico De Madrid","Juventus","AS Roma",
            "Tottenham Hotspurs","Chelsea","Paris Saint Germain"
    };
//        Menyimpan data negera club
    private static String [] club_country = {
            "Spanyol","Spanyol","Inggris","Germain",
            "Netherlands","Inggris","Inggris","Italia",
            "Italia","Spanyol","Italia","Italia",
            "Inggris","Inggris","France"
    };
//      Menyimpan data gambar logo club
    private static int [] club_logo = {
            R.drawable.barca, R.drawable.madrid1, R.drawable.mu1, R.drawable.munchen1,
            R.drawable.ajax1, R.drawable.liverpool1, R.drawable.arsenal1, R.drawable.inter1,
            R.drawable.acmilan1, R.drawable.atm, R.drawable.juve, R.drawable.roma1,
            R.drawable.tottenham1, R.drawable.chelsea, R.drawable.psg1
    };
//    Menyimpan data deskripsi club
    private static String [] club_desc = {
            "Fútbol Club Barcelona, juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol.\n" +
                    "\n" +
                    "Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris, Jerman dan Katalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto \"Més que un club\" (Lebih dari sebuah klub). Tidak seperti banyak klub sepak bola lainnya, para pendukung memiliki dan mengoperasikan Barcelona. Ia adalah klub sepak bola kedua terkaya di dunia dalam hal pendapatan, dengan omzet tahunan sebesar €560,8 juta dan kedua yang paling berharga, senilai $3,56 miliar.[2][3] Lagu kebangsaan resmi Barcelona adalah \"Cant del Barça\", yang ditulis oleh Jaume Picas dan Josep Maria Espinas.[4]",
            "Real Madrid Club de Fútbol ( Pengucapan bahasa Spanyol:  [reˈal maˈðɾið kluβ e fuðβol] ( dengarkan )Tentang suara ini , yang berarti Klub Sepak Bola Kerajaan Madrid ), biasa disebut sebagai Real Madrid , adalah klub sepak bola profesional Spanyol yang berbasis di Madrid .\n" +
                    "\n" +
                    "Didirikan pada 6 Maret 1902 sebagai Klub Sepak Bola Madrid, klub ini secara tradisional mengenakan seragam kandang berwarna putih sejak awal. The kehormatan judul nyata adalah bahasa Spanyol untuk \"royal\" dan diberikan ke klub oleh Raja Alfonso XIII pada tahun 1920 bersama-sama dengan mahkota kerajaan di lambang. Tim telah memainkan pertandingan kandangnya di Stadion Santiago Bernabéu yang berkapasitas 81.044 di pusat kota Madrid sejak 1947. Tidak seperti kebanyakan entitas olahraga Eropa, anggota Real Madrid ( socios ) telah memiliki dan mengoperasikan klub sepanjang sejarahnya.",
            "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.\n" +
                    "\n" +
                    "Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA,[2] empat Piala Liga dan rekor 21 FA Community Shield. Klub ini juga telah memenangkan tiga Piala Eropa, satu Piala UEFA, satu Piala Winners UEFA, satu Piala Super UEFA, satu Piala Interkontinental dan satu Piala Dunia Antarklub FIFA. Pada 1998-1999, klub memenangkan treble dari Liga Premier, Piala FA dan Liga Champions, prestasi belum pernah terjadi sebelumnya untuk klub Inggris.",
            "Fußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern München (pengucapan bahasa Jerman: [ʔɛf ˈt͡seː ˈbaɪ̯ɐn ˈmʏnçən]), FC Bayern Minga (dalam bahasa Bayern), atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bayern. Hal ini terkenal karena tim sepak bola profesional yang membantai Club' Raksasa Spanyol yaitu Barcelona dengan Skore 8-2 yang bermain di [LA LIGA], peringkat teratas sistem liga sepak bola Jerman, dan merupakan klub paling sukses dalam sejarah sepak bola Jerman, setelah memenangkan rekor 30 gelar nasional dan 19 piala nasional.[4]",
            "Amsterdamsche Football Club Ajax (pengucapan Belanda: [ˈaːjɑks]) (Euronext: AJAX; juga dikenal dengan nama Ajax Amsterdam, AFC Ajax, atau hanya Ajax (dibaca A-yaks)) adalah sebuah klub sepak bola dari Amsterdam, Belanda. Klub ini adalah salah satu klub terkuat di Belanda dan juga di Eropa. Secara historis, Ajax (dinamai sesuai pahlawan Yunani legendaris) telah menjadi klub paling sukses di Belanda, dengan 34 gelar Eredivisie dan 19 Piala KNVB. Ajax terus bermain di Eredivisie, sejak awal liga pada tahun 1956 dan, bersama dengan Feyenoord dan PSV Eindhoven, itu adalah salah satu klub \"tiga besar\" yang mendominasi kompetisi itu.",
            "Liverpool Football Club /ˈlɪvərpuːl/ (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool. Saat ini Liverpool adalah peserta Liga Utama Inggris. Liverpool juga merupakan juara dari Liga Utama Inggris musim 2019–2020.\n" +
                    "\n" +
                    "Liverpool telah memenangkan 6 trofi Liga Champions UEFA (dulu Piala Champions) dan merupakan klub dengan pemegang gelar juara Liga Champions UEFA terbanyak di Inggris dan ketiga di Eropa setelah Real Madrid dan AC Milan.[3] Selain itu Liverpool juga pemegang 3 gelar juara Liga Eropa UEFA dan 4 gelar Piala Super UEFA.",
            "Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. Didirikan pada 1886 dengan nama Dial Square. Klub ini bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris, yang telah memenangkan 13 gelar kasta utama Liga Inggris (10 pada era Divisi Pertama dan 3 pada era Premier League) dan 14 gelar di Piala FA (Gelar paling banyak). Arsenal memegang rekor untuk periode terpanjang berada di kasta puncak Liga Inggris tanpa pernah terdegradasi sejak musim 1919 dan menjadi tim pada peringkat pertama dalam klasemen Liga Inggris sepanjang abad ke-20.[3] Arsenal menjadi tim kedua di Inggris yang menyelesaikan semusim liga tanpa kalah (musim 2003–04) dan tim pertama yang melakukannya pada era di mana satu musim berlangsung 38 pertandingan.",
            "Football Club Internazionale Milano,[9] atau yang dikenal dengan nama Internazionale (/ˌinternattsjoˈnaːle/) ataupun juga Inter, dan bahasa sehari-hari dikenal sebagai Inter Milan di luar Italia,[10] adalah sebuah klub sepak bola profesional asal Italia yang saat ini bermain di Serie A Liga Italia. Inter Milan mempunyai julukan sebagai il Nerazzurri (si biru hitam), il Biscone (si ular besar), dan juga La Beneamata (yang tersayang). Klub bermain di Serie A (divisi pertama) sejak tahun 1908, dan pendukung Internazionale disebut Interisti.\n" +
                    "\n" +
                    "Dari tahun 2006 hingga tahun 2010 adalah tahun pencapaian terbaik kedua bagi Inter sepanjang sejarah sejak berdiri. Dalam kurun waktu tersebut mereka sukses memperoleh lima gelar yaitu Serie A, Coppa Italia, Liga Champions UEFA, Piala Super Italia, dan Piala Dunia Antarklub FIFA.[11]",
            "Associazione Calcio Milan (pengucapan bahasa Italia: [assotʃatˈtsjoːne ˈkaltʃo ˈmiːlan]), sering disebut sebagai A.C. Milan atau hanya Milan, adalah sebuah klub sepak bola Italia yang berbasis di Milan, Lombardia, yang bermain di Serie A. Mereka bermain dengan seragam bergaris merah-hitam dan celana putih (kadang-kadang hitam), sehingga dijuluki rossoneri (\"merah-hitam\"). Milan adalah tim tersukses kedua dalam sejarah persepak bolaan Italia, menjuarai Serie A 18 kali dan Piala Italia 5 kali.",
            "Atlético de Madrid nama lengkap Club Atletico de Madrid, SAD (singkatan dari Sociedad Anónima Deportiva) (pengucapan bahasa Spanyol: [ˈkluβ atˈletiko ðe maˈðɾið]), atau Atlético Madrid, atau juga disebut Atlético atau Atleti, adalah tim sepak bola Spanyol yang bermain di La Liga Santander. Bermarkas di Madrid. Tim yang berdiri tahun 1903 memiliki prestasi yang baik dipercaturan sepak bola Spanyol. Klub ini juga memiliki rivalitas dengan tetangganya Real Madrid, yang dikenal dengan Derbi Madrid.",
            "Juventus Football Club S.p.A. (BIT: JUVE) (dari bahasa Latin:[6] iuventus: masa muda [juˈvɛntus]), biasa disebut sebagai Juventus dan populer dengan nama Juve (pengucapan [ˈjuːve]),[7] adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte. Klub ini didirikan pada tahun 1897 dengan nama Sport Club Juventus oleh sekelompok pelajar muda di kota Turin yang dipimpin oleh Eugenio Canfari dan saudaranya Enrico.[3][8][9]\n" +
                    "\n" +
                    "Sejak bulan September 2011, mereka berkandang di Juventus Stadium yang berkapasitas 41.507 tempat duduk.[10] Stadion tersebut dibangun di lokasi yang sama dengan stadion yang mereka gunakan sebelumnya, yaitu Stadion Delle Alpi, yang harus dirobohkan demi membangun Juventus Stadium.[11]",
            "Associazione Sportiva Roma (BIT: ASR, LSE: 0DMN), biasa disebut AS Roma, adalah sebuah klub sepak bola Italia yang bermarkas di Roma. Klub ini berlaga di Serie A.\n" +
                    "\n" +
                    "Roma telah memenangkan Serie A tiga kali, pertama di 1941-42 kemudian pada 1982-1983 dan sekali lagi pada 2000-01, serta memenangkan sembilan gelar Coppa Italia dan Supercoppa Italiana dua gelar. Di panggung Eropa, Roma memenangkan Piala Inter-Cities Fairs pada 1960-61, mendekati kemenangan Piala Eropa pada 1983-84 (kalah di final bermain di kandang melawan Liverpool setelah adu penalti), dan berakhir sebagai runner-up di Piala UEFA untuk 1990-1991 (kalah agregat melawan Internazionale).",
            "Tottenham Hotspur Football Club /ˈtɒtənəm/,[2][3] adalah klub sepak bola yang berasal dari Tottenham, sebuah daerah yang berada di wilayah utara London. Mereka juga dikenal sebagai Spurs, The Spurs dan Tottenham, sementara penggemar mereka memberi mereka nama the Lilywhites karena seragam tradisional mereka yang berwarna putih. Didirikan pada tahun 1882, Tottenham memenangkan Piala FA untuk pertama kalinya pada tahun 1901, dan menjadi satu-satunya klub non-Liga yang menjuarai Piala FA, sejak dibentuknya The Football League.",
            "Chelsea Football Club /ˈtʃɛlsiː/ adalah sebuah klub sepakbola profesional terbesar di London dan dunia yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris.\n" +
                    "\n" +
                    "Chelsea satu-satunya klub asal London yang memiliki gelar Liga Champions. Chelsea merupakan club London terbesar melebihi Arsenal dan Tottenham Hotspurs. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih pada dekade 1960-an, 1970-an, 1990-an, dan 2000-an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam gelar juara Liga Utama Inggris, delapan Piala FA, lima Piala Liga, dua Liga Eropa UEFA, dua Piala Winners UEFA, dua Liga Champions UEFA, dan satu Piala Super UEFA.",
            "Paris Saint-Germain Football Club (pengucapan bahasa Prancis: [paʁi sɛ̃ ʒɛʁmɛ̃]) atau dikenal luas dengan sebutan PSG merupakan sebuah tim sepak bola Prancis yang bermain di Ligue 1, Prancis. Bermarkas di Paris, Prancis. Klub ini didirikan pada 12 Agustus 1970, berkat penggabungan Paris FC dan dengan Stade Saint-Germain.",
};
//    Untuk mendapatkan seluruh data list club
    static ArrayList<Club> getClub() {
        ArrayList<Club> list = new ArrayList<>();
        for (int i = 0; i < club_name.length; i++) {
            Club club = new Club();
            club.setName(club_name[i]);
            club.setCountry(club_country[i]);
            club.setDescription(club_desc[i]);
            club.setPhoto(club_logo[i]);
            list.add(club);
        }
        return list;
    }
}
