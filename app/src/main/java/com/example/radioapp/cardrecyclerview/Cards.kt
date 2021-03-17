package com.example.radioapp.cardrecyclerview

import com.example.radioapp.R

class Cards {

    companion object {
        //Sanoma Media
        const val FM_Radio_Rock = "http://digitacdn.akamaized.net/hls/live/629243/radiorock/master.m3u8"
        const val FM_Radio_Suomipop = "http://digitacdn.akamaized.net/hls/live/629243/radiosuomipop/master.m3u8"
        const val FM_Radio_Aalto = "http://digitacdn.akamaized.net/hls/live/629243/radioaalto/master.m3u8"
        const val FM_Aito_Iskelma = "http://digitacdn.akamaized.net/hls/live/629243/aitoiskelma/master-128000.m3u8"
        const val FM_Loop = "http://digitacdn.akamaized.net/hls/live/629243/loop/master-128000.m3u8"
        const val FM_HitMix = "http://digitacdn.akamaized.net/hls/live/629243/hitmix/master.m3u8"
        const val FM_Helmiradio = "http://digitacdn.akamaized.net/hls/live/629243/radiohelmi/master-128000.m3u8"
        const val FM_Groove_FM_Business = "http://digitacdn.akamaized.net/hls/live/629243/groove/master-128000.m3u8"
        //YLE
        const val FM_YLE_Radio_Suomi = "http://yleuni-f.akamaihd.net/i/yleliveradiohd_3@113880/index_128_a-p.m3u8"
        const val FM_YleX = " http://yleuni-f.akamaihd.net/i/yleliveradiohd_2@113879/index_128_a-p.m3u8"
        const val FM_YLE_Puhe = "http://yleuni-f.akamaihd.net/i/yleliveradiohd_5@113882/index_128_a-p.m3u8"
        const val FM_YLE_Klassinen = "http://yleuni-f.akamaihd.net/i/yleliveradiohd_4@113881/index_128_a-p.m3u8"
        const val FM_YLE_Sami_Radio = "http://yleuni-f.akamaihd.net/i/yleliveradiohd_33@113910/index_128_a-p.m3u8"
        const val FM_YLE_Vega = "http://yleuni-f.akamaihd.net/i/yleliveradiohd_32@113909/index_128_a-p.m3u8"
        //Bauer Media
        const val FM_Radio_Nova = "http://stream.bauermedia.fi/radionova/radionova_128.mp3"
        const val FM_Radio_Nostalgia = "http://stream.bauermedia.fi/nostalgia/nostalgia_128.mp3"
        const val FM_KISS = "http://stream.bauermedia.fi/kiss/kiss_128.mp3"
        const val FM_NRJ = "http://stream.bauermedia.fi/nrj/nrj_128.mp3"
        const val FM_Radio_City = "http://stream.bauermedia.fi/radiocity/radiocity_128.mp3"
        const val FM_SuomiRock = "http://stream.bauermedia.fi/suomirock/suomirock_128.mp3"
        const val FM_Kasari = "http://stream.bauermedia.fi/kasari/kasari_128.mp3"
        const val FM_Ysari = "http://stream.bauermedia.fi/ysari/ysari_128.mp3"
        const val FM_Bassoradio = "http://stream.bauermedia.fi/basso/bassoradio_128.mp3"
        const val FM_SuomiRap = "http://stream.bauermedia.fi/suomirap/suomirap_128.mp3"
        const val FM_Iskelma = "http://stream.bauermedia.fi/iskelma/iskelma_128.mp3"
        const val FM_Radio_Pooki = "http://stream.bauermedia.fi/radiopooki/radiopooki_128.mp3"
        const val FM_Radio_957 = "http://stream.bauermedia.fi/radio957/radio957_128.mp3"
        const val FM_Radio_Classic = "http://stream.bauermedia.fi/classic/classic_128.mp3"
        //Muut
        const val FM_Radio_Helsinki = "http://77.86.233.1:8002/;"
        const val FM_Jarviradio = "http://radio.6net.fi:8000/jarviradio"

        val listOfStationsFIN = arrayListOf(
            Card("Radio Rock", R.drawable.fm_radio_rock, FM_Radio_Rock),
            Card("Radio Suomipop", R.drawable.fm_radio_suomipop, FM_Radio_Suomipop),
            Card("Radio Aalto", R.drawable.fm_radio_aalto, FM_Radio_Aalto),
            Card("Aito Iskelmä", R.drawable.fm_aito_iskelma, FM_Aito_Iskelma),
            Card("Loop", R.drawable.fm_loop, FM_Loop),
            Card("HitMix", R.drawable.fm_hitmix, FM_HitMix),
            Card("Helmiradio", R.drawable.fm_helmiradio, FM_Helmiradio),
            Card("Groove FM Business", R.drawable.fm_groove_fm_business, FM_Groove_FM_Business),
            Card("YLE Radio Suomi", R.drawable.fm_yle, FM_YLE_Radio_Suomi),
            Card("YleX", R.drawable.fm_yle, FM_YleX),
            Card("YLE Puhe", R.drawable.fm_yle, FM_YLE_Puhe),
            Card("YLE Klassinen", R.drawable.fm_yle, FM_YLE_Klassinen),
            Card("YLE Vega", R.drawable.fm_yle, FM_YLE_Vega),
            Card("YLE Sámi Radio", R.drawable.fm_yle, FM_YLE_Sami_Radio),
            Card("Radio Nova", R.drawable.fm_radio_nova, FM_Radio_Nova),
            Card("Radio Nostalgia", R.drawable.fm_radio_nostalgia, FM_Radio_Nostalgia),
            Card("KISS", R.drawable.fm_kiss, FM_KISS),
            Card("NRJ", R.drawable.fm_nrj, FM_NRJ),
            Card("Radio City", R.drawable.fm_radio_city, FM_Radio_City),
            Card("SuomiRock", R.drawable.fm_suomirock, FM_SuomiRock),
            Card("Kasari", R.drawable.fm_kasari, FM_Kasari),
            Card("Ysäri", R.drawable.fm_ysari, FM_Ysari),
            Card("Bassoradio", R.drawable.fm_bassoradio, FM_Bassoradio),
            Card("SuomiRap", R.drawable.fm_suomirap, FM_SuomiRap),
            Card("Iskelmä", R.drawable.fm_iskelma, FM_Iskelma),
            Card("Radio Pooki", R.drawable.fm_radio_pooki, FM_Radio_Pooki),
            Card("Radio 957", R.drawable.fm_radio_957, FM_Radio_957),
            Card("Radio Classic", R.drawable.fm_radio_classic, FM_Radio_Classic),
            Card("Radio Helsinki", R.drawable.fm_radio_helsinki, FM_Radio_Helsinki),
            Card("Järviradio", R.drawable.fm_jarviradio, FM_Jarviradio)
        )

        //Ruotsi
        const val FM_Sveriges_Radio_P1 = "http://sverigesradio.se/topsy/direkt/132-hi.mp3"
        const val FM_Sveriges_Radio_P2 = "http://sverigesradio.se/topsy/direkt/2562-hi.mp3"
        const val FM_Sveriges_Radio_P2_Sprak_och_musik = "http://sverigesradio.se/topsy/direkt/163-hi.mp3"
        const val FM_Sveriges_Radio_P3 = "http://sverigesradio.se/topsy/direkt/164-hi.mp3"
        const val FM_Sveriges_Radio_P3_Din_gata = "http://sverigesradio.se/topsy/direkt/2576-hi.mp3"
        const val FM_Sveriges_Radio_P4_Blekinge = "http://sverigesradio.se/topsy/direkt/213-hi.mp3"
        const val FM_Sveriges_Radio_P4_Dalarna = "http://sverigesradio.se/topsy/direkt/223-hi.mp3"
        const val FM_Sveriges_Radio_P4_Gotland = "http://sverigesradio.se/topsy/direkt/205-hi.mp3"
        const val FM_Sveriges_Radio_P4_Gavleborg = "http://sverigesradio.se/topsy/direkt/210-hi.mp3"
        const val FM_Sveriges_Radio_P4_Goteborg = "http://sverigesradio.se/topsy/direkt/212-hi.mp3"
        const val FM_Sveriges_Radio_P4_Halland = "http://sverigesradio.se/topsy/direkt/220-hi.mp3"
        const val FM_Sveriges_Radio_P4_Jamtland = "http://sverigesradio.se/topsy/direkt/200-hi.mp3"
        const val FM_Sveriges_Radio_P4_Jonkoping = "http://sverigesradio.se/topsy/direkt/203-hi.mp3"
        const val FM_Sveriges_Radio_P4_Kalmar = "http://sverigesradio.se/topsy/direkt/201-hi.mp3"
        const val FM_Sveriges_Radio_P4_Kristianstad = "http://sverigesradio.se/topsy/direkt/211-hi.mp3"
        const val FM_Sveriges_Radio_P4_Kronoberg = "http://sverigesradio.se/topsy/direkt/214-hi.mp3"
        const val FM_Sveriges_Radio_P4_Malmohus = "http://sverigesradio.se/topsy/direkt/207-hi.mp3"
        const val FM_Sveriges_Radio_P4_Norrbotten = "http://sverigesradio.se/topsy/direkt/209-hi.mp3"
        const val FM_Sveriges_Radio_P4_Sjuharad = "http://sverigesradio.se/topsy/direkt/206-hi.mp3"
        const val FM_Sveriges_Radio_P4_Skaraborg = "http://sverigesradio.se/topsy/direkt/208-hi.mp3"
        const val FM_Sveriges_Radio_P4_Stockholm = "http://sverigesradio.se/topsy/direkt/701-hi.mp3"
        const val FM_Sveriges_Radio_P4_Sodertalje = "http://sverigesradio.se/topsy/direkt/5283-hi.mp3"
        const val FM_Sveriges_Radio_P4_Sormland = "http://sverigesradio.se/topsy/direkt/202-hi.mp3"
        const val FM_Sveriges_Radio_P4_Uppland = "http://sverigesradio.se/topsy/direkt/218-hi.mp3"
        const val FM_Sveriges_Radio_P4_Varmland = "http://sverigesradio.se/topsy/direkt/204-hi.mp3"
        const val FM_Sveriges_Radio_P4_Vast = "http://sverigesradio.se/topsy/direkt/219-hi.mp3"
        const val FM_Sveriges_Radio_P4_Vasterbotten = "http://sverigesradio.se/topsy/direkt/215-hi.mp3"
        const val FM_Sveriges_Radio_P4_Vasternorrland = "http://sverigesradio.se/topsy/direkt/216-hi.mp3"
        const val FM_Sveriges_Radio_P4_Vastmanland = "http://sverigesradio.se/topsy/direkt/217-hi.mp3"
        const val FM_Sveriges_Radio_P4_Orebro = "http://sverigesradio.se/topsy/direkt/221-hi.mp3"
        const val FM_Sveriges_Radio_P4_Ostergotland = "http://sverigesradio.se/topsy/direkt/222-hi.mp3"
        const val FM_Sveriges_Radio_P4_Plus = "http://sverigesradio.se/topsy/direkt/4951-hi.mp3"
        const val FM_Sveriges_Radio_P6 = "http://sverigesradio.se/topsy/direkt/166-hi.mp3"
        const val FM_Sveriges_Radio_Radioapans_knattekanal = "http://sverigesradio.se/topsy/direkt/2755-hi.mp3"
        const val FM_Sveriges_Radio_SR_Sapmi = "http://sverigesradio.se/topsy/direkt/224-hi.mp3"
        const val FM_Sveriges_Radio_SR_Sisuradio = "http://sverigesradio.se/topsy/direkt/226-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_01 = "http://sverigesradio.se/topsy/direkt/2383-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_02 = "http://sverigesradio.se/topsy/direkt/2384-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_03 = "http://sverigesradio.se/topsy/direkt/2385-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_04 = "http://sverigesradio.se/topsy/direkt/2386-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_05 = "http://sverigesradio.se/topsy/direkt/2387-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_06 = "http://sverigesradio.se/topsy/direkt/2388-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_07 = "http://sverigesradio.se/topsy/direkt/2389-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_08 = "http://sverigesradio.se/topsy/direkt/2390-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_09 = "http://sverigesradio.se/topsy/direkt/3268-hi.mp3"
        const val FM_Sveriges_Radio_SR_Extra_10 = "http://sverigesradio.se/topsy/direkt/3269-hi.mp3"


        const val FM_Bandit_Rock = "http://fm02-ice.stream.khz.se/fm02_mp3"


        const val FM_Rockklassiker = "http://live-bauerse-fm.sharp-stream.com/rockklassiker_instream_se_aacp"
        const val FM_Lugna_Favoriter = "http://fm03-ice.stream.khz.se/fm03_mp3"
        const val FM_Countrykanalen_Radio = "http://eu1.radio.u-2.im:3326/;"
        const val FM_NRJ_SWE = "http://edge-bauersefm-02-gos1.sharp-stream.com/nrj_instreamtest_se_mp3"
        const val FM_88OR = "http://radiostreamtwo.mine.nu:18000/;"
        const val FM_Dansbandsdax = "http://sc.dbd.nu:8358/;"
        const val FM_Dansbandskanalen = "http://stream.dbmedia.se/dbkMP3"
        const val FM_Dansbandsfavoriter = "http://wr15-ice.stream.khz.se/wr15_mp3?awparams=companionAds%3Atrue&platform=web&aw_0_1st.playerid=mtgradio-web"
        const val FM_Gold_1024 = "http://goldfm.nu:8082/goldfm_mp3"
        const val FM_RIX_FM = "http://fm01-ice.stream.khz.se/fm01_mp3"

        val listOfStationsSWE = arrayListOf(


            Card("P1", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P1),
            Card("P2", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P2),
            Card("P2 Språk och musik", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P2_Sprak_och_musik),
            Card("P3", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P3),
            Card("P3 Din gata", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P3_Din_gata),
            Card("P4 Blekinge", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Blekinge),
            Card("P4 Dalarna", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Dalarna),
            Card("P4 Gotland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Gotland),
            Card("P4 Gävleborg", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Gavleborg),
            Card("P4 Göteborg", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Goteborg),
            Card("P4 Halland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Halland),
            Card("P4 Jämtland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Jamtland),
            Card("P4 Jönköping", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Jonkoping),
            Card("P4 Kalmar", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Kalmar),
            Card("P4 Kristianstad", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Kristianstad),
            Card("P4 Kronoberg", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Kronoberg),
            Card("P4 Malmöhus", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Malmohus),
            Card("P4 Norrbotten", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Norrbotten),
            Card("P4 Sjuhärad", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Sjuharad),
            Card("P4 Skaraborg", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Skaraborg),
            Card("P4 Stockholm", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Stockholm),
            Card("P4 Södertälje", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Sodertalje),
            Card("P4 Sörmland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Sormland),
            Card("P4 Uppland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Uppland),
            Card("P4 Värmland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Varmland),
            Card("P4 Väst", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Vast),
            Card("P4 Västerbotten", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Vasterbotten),
            Card("P4 Västernorrland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Vasternorrland),
            Card("P4 Västmanland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Vastmanland),
            Card("P4 Örebro", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Orebro),
            Card("P4 Östergötland", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Ostergotland),
            Card("P4 Plus", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P4_Plus),
            Card("P6", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_P6),
            Card("Radioapans knattekanal", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_Radioapans_knattekanal),
            Card("Radio SR Sápmi", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Sapmi),
            Card("SR Sisuradio", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Sisuradio),
            /*
            Card("SR Extra 01", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_01),
            Card("SR Extra 02", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_02),
            Card("SR Extra 03", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_03),
            Card("SR Extra 04", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_04),
            Card("SR Extra 05", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_05),
            Card("SR Extra 06", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_06),
            Card("SR Extra 07", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_07),
            Card("SR Extra 08", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_08),
            Card("SR Extra 09", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_09),
            Card("SR Extra 10", R.drawable.fm_sveriges_radio, FM_Sveriges_Radio_SR_Extra_10),
            */


            Card("Bandit Rock", R.drawable.fm_bandit_rock, FM_Bandit_Rock),
            Card("Rockklassiker", R.drawable.fm_rockklassiker, FM_Rockklassiker),
            Card("RIX FM", R.drawable.fm_rix_fm, FM_RIX_FM),
            Card("Lugna Favoriter", R.drawable.fm_lugna_favoriter, FM_Lugna_Favoriter),
            Card("NRJ", R.drawable.fm_nrj, FM_NRJ_SWE),
            Card("Countrykanalen Radio", R.drawable.fm_countrykanalen, FM_Countrykanalen_Radio),
            Card("88OR", R.drawable.fm_88or, FM_88OR),
            Card("Dansbandskanalen", R.drawable.fm_dansbandskanalen, FM_Dansbandskanalen),
            Card("Dansbandsdax", R.drawable.fm_dansbandsdax, FM_Dansbandsdax),
            Card("Dansbandsfavoriter", R.drawable.fm_dansbandsfavoriter, FM_Dansbandsfavoriter),
            Card("Gold 102.4", R.drawable.fm_gold_1024, FM_Gold_1024)
        )

        //Yhdysvallat
        const val FM_1067_Lite = "http://wltw-fm.akacast.akamaistream.net/7/291/19974/v1/auth.akacast.akamaistream.net/wltw-fmhttp://wltw-fm.akacast.akamaistream.net/7/291/19974/v1/auth.akacast.akamaistream.net/wltw-fm"
        const val FM_Z100 = "http://whtz-fm.akacast.akamaistream.net/7/579/19972/v1/auth.akacast.akamaistream.net/whtz-fm"
        const val FM_1035_KTU = "http://wktu-fm.akacast.akamaistream.net/7/110/19973/v1/auth.akacast.akamaistream.net/wktu-fm"

        val listOfStationsUSA = arrayListOf(
            Card("106.7 Lite FM", R.drawable.fm_yle, FM_1067_Lite),
            Card("Z100", R.drawable.fm_yle, FM_Z100),
            Card("103.5 KTU", R.drawable.fm_yle, FM_1035_KTU),
            Card("YLE Klassinen", R.drawable.fm_yle, FM_YLE_Klassinen),
            Card("YLE Vega", R.drawable.fm_yle, FM_YLE_Vega),
            Card("YLE Sámi Radio", R.drawable.fm_yle, FM_YLE_Sami_Radio)
        )

        const val FM_BBC_Radio_1 = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_radio1_mf_q"
        const val FM_BBC_Radio_2 = "http://episodes.ne.fm:8000/bbcradio2"
        const val FM_BBC_Radio_3 = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_radio3_mf_q"
        const val FM_BBC_Radio_4 = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_radio4fm_mf_p"
        const val FM_BBC_Radio_Scotland = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_scotlandfm_mf_p"
        const val FM_BBC_Radio_Wales = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_walesmw_mf_p"
        const val FM_BBC_Radio_Cymru = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_cymru_mf_p"
        const val FM_BBC_Radio_Cymru_2 = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_cymru2_mf_p"
        const val FM_BBC_Radio_Cumbria = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrcumbria_mf_q"
        const val FM_BBC_Radio_Derby = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrderby_mf_p"
        const val FM_BBC_Radio_Devon = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrdevon_mf_p"
        const val FM_BBC_Radio_Foyle = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_foyle_mf_p"
        const val FM_BBC_Radio_Humberside = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrhumber_mf_p"
        const val FM_BBC_Radio_Kent = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrkent_mf_q"
        const val FM_BBC_Radio_Lancashire = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrlancs_mf_q"
        const val FM_BBC_Radio_Leeds = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrleeds_mf_q"
        const val FM_BBC_Radio_Lincolnshire = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrlincs_mf_p"
        const val FM_BBC_Radio_London = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrldn_mf_q"
        const val FM_BBC_Radio_Manchester = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrmanc_mf_p"
        const val FM_BBC_Radio_Merseyside = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrmersey_mf_p"
        const val FM_BBC_Radio_Newcastle = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrnewc_mf_q"
        const val FM_BBC_Radio_Norfolk = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrnorfolk_mf_p"
        const val FM_BBC_Radio_Northampton = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrnthhnts_mf_q"
        const val FM_BBC_Radio_Oxford = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lroxford_mf_q"
        const val FM_BBC_Radio_Sheffield = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrsheff_mf_q"
        const val FM_BBC_Radio_Shropshire = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrshrops_mf_p"
        const val FM_BBC_Radio_Solent = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrsolent_mf_q"
        const val FM_BBC_Radio_Stoke = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrstoke_mf_p"
        const val FM_BBC_Radio_Suffolk = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrsuffolk_mf_q"
        const val FM_BBC_Radio_Ulster = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_ulster_mf_p"
        const val FM_BBC_Radio_Wiltshire = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lrwilts_mf_p"
        const val FM_BBC_Radio_York = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_lryork_mf_p"
        const val FM_BBC_Asian_Network = "http://bbcmedia.ic.llnwd.net/stream/bbcmedia_asianet_mf_p"
        const val FM_BBC_Arabic = "http://bbcwssc.ic.llnwd.net/stream/bbcwssc_mp1_ws-araba_backup"



        const val FM_Capital_FM = "http://streaming03.zfast.co.uk:8085/stream"
        const val FM_Capital_UK_FM = "http://ice-sov.musicradio.com/CapitalUKMP3"
        const val FM_Capital_Dance = "http://ice-sov.musicradio.com/CapitalDanceMP3"
        const val FM_Capital_Xtra = "http://ice-sov.musicradio.com/CapitalXTRALondonMP3"
        //const val FM_Capital_Cymru = "http://ice-sov.musicradio.com/CapitalCymruMP3"
        const val FM_Capital_Birmingham = "http://ice-sov.musicradio.com/CapitalBirminghamMP3"
        const val FM_Capital_Brighton = "http://ice-sov.musicradio.com/CapitalBrightonMP3"
        const val FM_Capital_Burnley = "http://ice-sov.musicradio.com/CapitalBurnleyMP3"
        const val FM_Capital_Edinburgh = "http://ice-sov.musicradio.com/CapitalEdinburghMP3"
        const val FM_Capital_Glasgow = "http://ice-sov.musicradio.com/CapitalGlasgowMP3"
        const val FM_Capital_Manchester = "http://ice-sov.musicradio.com/CapitalManchesterMP3"
        const val FM_Capital_Liverpool = "http://ice-sov.musicradio.com/CapitalLiverpoolMP3"
        const val FM_Capital_London = "http://ice-sov.musicradio.com/CapitalMP3"
        const val FM_Capital_Preston = "http://ice-sov.musicradio.com/CapitalPrestonMP3"
        const val FM_Capital_Stratford = "http://ice-sov.musicradio.com/CapitalStratfordMP3"
        const val FM_Capital_Warwick = "http://ice-sov.musicradio.com/CapitalWarwickMP3"


        const val FM_Heart_UK = "http://ice-sov.musicradio.com/HeartUKMP3"
        const val FM_Heart_Dance = "http://ice-sov.musicradio.com/HeartDanceMP3"
        const val FM_Heart_70s = "http://ice-sov.musicradio.com/Heart70sMP3"
        const val FM_Heart_80s = "http://ice-sov.musicradio.com/Heart80sMP3"
        const val FM_Heart_90s = "http://ice-sov.musicradio.com/Heart90sMP3"
        const val FM_Heart_Bristol = "http://ice-sov.musicradio.com/HeartBristolMP3"
        const val FM_Heart_London = "http://ice-sov.musicradio.com/HeartLondonMP3"
        const val FM_Heart_Milton_Keynes = "http://ice-sov.musicradio.com/HeartMiltonKeynesMP3"
        const val FM_Heart_Watford = "http://ice-sov.musicradio.com/HeartWatfordMP3"
        const val FM_Heart_Glasgow = "http://ice-sov.musicradio.com/HeartGlasgowMP3"

        const val FM_Radio_X_UK = "http://ice-sov.musicradio.com/RadioXUKMP3"
        const val FM_Radio_X_Manchester = "http://ice-sov.musicradio.com/RadioXManchesterMP3"
        const val FM_Radio_X_London = "http://ice-sov.musicradio.com/RadioXLondonMP3"


        const val FM_Smooth_East_Midlands = "http://ice-sov.musicradio.com/SmoothEastMidsMP3"
        const val FM_Smooth_LakeDistrict = "http://ice-sov.musicradio.com/SmoothLakeDistrictMP3"
        const val FM_Smooth_London = "http://ice-sov.musicradio.com/SmoothLondonMP3"
        const val FM_Smooth_North_East = "http://ice-sov.musicradio.com/SmoothNorthEastMP3"
        const val FM_Smooth_North_West = "http://ice-sov.musicradio.com/SmoothNorthWestMP3"
        const val FM_Smooth_Scotland = "http://ice-sov.musicradio.com/SmoothScotlandMP3"
        const val FM_Smooth_West_Midlands = "http://ice-sov.musicradio.com/SmoothWestMidsMP3"
        const val FM_Smooth_Chill = "http://ice-sov.musicradio.com/SmoothChillMP3"
        const val FM_Smooth_Country = "http://ice-sov.musicradio.com/SmoothCountryMP3"



        val listOfStationsUK = arrayListOf(
            Card("BBC Radio 1", R.drawable.fm_bbc, FM_BBC_Radio_1),
            Card("BBC Radio 2", R.drawable.fm_bbc, FM_BBC_Radio_2),
            Card("BBC Radio 3", R.drawable.fm_bbc, FM_BBC_Radio_3),
            Card("BBC Radio 4", R.drawable.fm_bbc, FM_BBC_Radio_4),
            Card("BBC Radio Scotland", R.drawable.fm_bbc, FM_BBC_Radio_Scotland),
            Card("BBC Radio Wales", R.drawable.fm_bbc, FM_BBC_Radio_Wales),
            Card("BBC Radio Cymru", R.drawable.fm_bbc, FM_BBC_Radio_Cymru),
            Card("BBC Radio Cymru 2", R.drawable.fm_bbc, FM_BBC_Radio_Cymru_2),
            Card("BBC Radio Cumbria", R.drawable.fm_bbc, FM_BBC_Radio_Cumbria),
            Card("BBC Radio Derby", R.drawable.fm_bbc, FM_BBC_Radio_Derby),
            Card("BBC Radio Devon", R.drawable.fm_bbc, FM_BBC_Radio_Devon),
            Card("BBC Radio Foyle", R.drawable.fm_bbc, FM_BBC_Radio_Foyle),
            Card("BBC Radio Humbershire", R.drawable.fm_bbc, FM_BBC_Radio_Humberside),
            Card("BBC Radio Kent", R.drawable.fm_bbc, FM_BBC_Radio_Kent),
            Card("BBC Radio Lancashire", R.drawable.fm_bbc, FM_BBC_Radio_Lancashire),
            Card("BBC Radio Leeds", R.drawable.fm_bbc, FM_BBC_Radio_Leeds),
            Card("BBC Radio Lincolnshire", R.drawable.fm_bbc, FM_BBC_Radio_Lincolnshire),
            Card("BBC Radio London", R.drawable.fm_bbc, FM_BBC_Radio_London),
            Card("BBC Radio Manchester", R.drawable.fm_bbc, FM_BBC_Radio_Manchester),
            Card("BBC Radio Merseyside", R.drawable.fm_bbc, FM_BBC_Radio_Merseyside),
            Card("BBC Radio Newcastle", R.drawable.fm_bbc, FM_BBC_Radio_Newcastle),
            Card("BBC Radio Norfolk", R.drawable.fm_bbc, FM_BBC_Radio_Norfolk),
            Card("BBC Radio Northampton", R.drawable.fm_bbc, FM_BBC_Radio_Northampton),
            Card("BBC Radio Oxford", R.drawable.fm_bbc, FM_BBC_Radio_Oxford),
            Card("BBC Radio Sheffield", R.drawable.fm_bbc, FM_BBC_Radio_Sheffield),
            Card("BBC Radio Shropshire", R.drawable.fm_bbc, FM_BBC_Radio_Shropshire),
            Card("BBC Radio Solent", R.drawable.fm_bbc, FM_BBC_Radio_Solent),
            Card("BBC Radio Stoke", R.drawable.fm_bbc, FM_BBC_Radio_Stoke),
            Card("BBC Radio Suffolk", R.drawable.fm_bbc, FM_BBC_Radio_Suffolk),
            Card("BBC Radio Ulster", R.drawable.fm_bbc, FM_BBC_Radio_Ulster),
            Card("BBC Radio Wiltshire", R.drawable.fm_bbc, FM_BBC_Radio_Wiltshire),
            Card("BBC Radio York", R.drawable.fm_bbc, FM_BBC_Radio_York),
            Card("BBC Asian Network", R.drawable.fm_bbc, FM_BBC_Asian_Network),
            Card("BBC Arabic", R.drawable.fm_bbc, FM_BBC_Arabic),

            Card("Capital FM", R.drawable.fm_capital, FM_Capital_FM),
            Card("Capital UK FM", R.drawable.fm_capital, FM_Capital_UK_FM),
            Card("Capital ", R.drawable.fm_capital, FM_Capital_Dance),
            Card("Capital Xtra", R.drawable.fm_capital, FM_Capital_Xtra),
            //Card("Capital Cymru", R.drawable.fm_capital, FM_Capital_Cymru),
            Card("Capital ", R.drawable.fm_capital, FM_Capital_Birmingham),
            Card("Capital Brighton", R.drawable.fm_capital, FM_Capital_Brighton),
            Card("Capital Burnley", R.drawable.fm_capital, FM_Capital_Burnley),
            Card("Capital Edinburgh", R.drawable.fm_capital, FM_Capital_Edinburgh),
            Card("Capital Glasgow", R.drawable.fm_capital, FM_Capital_Glasgow),
            Card("Capital Manchester", R.drawable.fm_capital, FM_Capital_Manchester),
            Card("Capital Liverpool", R.drawable.fm_capital, FM_Capital_Liverpool),
            Card("Capital London", R.drawable.fm_capital, FM_Capital_London),
            Card("Capital Preston", R.drawable.fm_capital, FM_Capital_Preston),
            Card("Capital Stratford", R.drawable.fm_capital, FM_Capital_Stratford),
            Card("Capital Warwick", R.drawable.fm_capital, FM_Capital_Warwick),

            Card("Heart UK", R.drawable.fm_heart, FM_Heart_UK),
            Card("Heart Dance", R.drawable.fm_heart, FM_Heart_Dance),
            Card("Heart 70s", R.drawable.fm_heart, FM_Heart_70s),
            Card("Heart 80s", R.drawable.fm_heart, FM_Heart_80s),
            Card("Heart 90s", R.drawable.fm_heart, FM_Heart_90s),
            Card("Heart Bristol", R.drawable.fm_heart, FM_Heart_Bristol),
            Card("Heart Glasgow", R.drawable.fm_heart, FM_Heart_Glasgow),
            Card("Heart London", R.drawable.fm_heart, FM_Heart_London),
            Card("Heart Milton Keynes", R.drawable.fm_heart, FM_Heart_Milton_Keynes),
            Card("Heart Watford", R.drawable.fm_heart, FM_Heart_Watford),

            Card("Radio X UK", R.drawable.fm_radio_x, FM_Radio_X_UK),
            Card("Radio X Manchester", R.drawable.fm_radio_x, FM_Radio_X_Manchester),
            Card("Radio X London", R.drawable.fm_radio_x, FM_Radio_X_London),

            Card("Smooth East Midlands", R.drawable.fm_smooth_radio, FM_Smooth_East_Midlands),
            Card("Smooth Lake District", R.drawable.fm_smooth_radio, FM_Smooth_LakeDistrict),
            Card("Smooth London", R.drawable.fm_smooth_radio, FM_Smooth_London),
            Card("Smooth North East", R.drawable.fm_smooth_radio, FM_Smooth_North_East),
            Card("Smooth North West", R.drawable.fm_smooth_radio, FM_Smooth_North_West),
            Card("Smooth Scotland", R.drawable.fm_smooth_radio, FM_Smooth_Scotland),
            Card("Smooth West Midlands", R.drawable.fm_smooth_radio, FM_Smooth_West_Midlands),
            Card("Smooth Chill", R.drawable.fm_smooth_radio, FM_Smooth_Chill),
            Card("Smooth Country", R.drawable.fm_smooth_radio, FM_Smooth_Country)


        )

        val listOfStationsRUS = arrayListOf(
            Card("YLE Radio Suomi", R.drawable.fm_yle, FM_YLE_Radio_Suomi),
            Card("YleX", R.drawable.fm_yle, FM_YleX),
            Card("YLE Puhe", R.drawable.fm_yle, FM_YLE_Puhe),
            Card("YLE Klassinen", R.drawable.fm_yle, FM_YLE_Klassinen),
            Card("YLE Vega", R.drawable.fm_yle, FM_YLE_Vega),
            Card("YLE Sámi Radio", R.drawable.fm_yle, FM_YLE_Sami_Radio)
        )

        //Viro
        const val FM_Klassikaraadio = "http://icecast.err.ee/klassikaraadiomadal.mp3"
        const val FM_Retro_FM = "http://nrj.babahhcdn.com/RETROFM_boadcast"

        val listOfStationsEST = arrayListOf(
            Card("Klassikaraadio", R.drawable.fm_klassikaraadio, FM_Klassikaraadio),
            Card("Retro FM", R.drawable.fm_retro_fm, FM_Retro_FM),
            Card("YLE Klassinen", R.drawable.fm_yle, FM_YLE_Klassinen),
            Card("YLE Vega", R.drawable.fm_yle, FM_YLE_Vega),
            Card("YLE Sámi Radio", R.drawable.fm_yle, FM_YLE_Sami_Radio)
        )

    }


}