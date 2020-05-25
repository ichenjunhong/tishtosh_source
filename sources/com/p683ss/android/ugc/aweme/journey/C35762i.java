package com.p683ss.android.ugc.aweme.journey;

import com.google.p1057b.p1064g.C17760g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.journey.i */
public final class C35762i {

    /* renamed from: com.ss.android.ugc.aweme.journey.i$a */
    public static final class C35763a extends C17760g<List<? extends C35777q>> {
        C35763a() {
        }
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.p683ss.android.ugc.aweme.journey.C35777q> m80899a(android.content.Context r7) {
        /*
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            android.content.res.AssetManager r0 = r7.getAssets()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "interest_list/interest_list_"
            r1.<init>(r2)
            com.ss.android.ugc.aweme.journey.s r2 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            d.f r2 = com.p683ss.android.ugc.aweme.journey.C35781s.f91906k
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = ".json"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.InputStream r0 = r0.open(r1)
            java.lang.String r1 = "assetInputString"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.nio.charset.Charset r1 = p2628d.p2650m.C52808d.f131043a
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            java.io.Reader r2 = (java.io.Reader) r2
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = 0
            r2 = r0
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ Throwable -> 0x0451 }
            java.io.Reader r2 = (java.io.Reader) r2     // Catch:{ Throwable -> 0x0451 }
            java.lang.String r2 = p2628d.p2638e.C52666o.m112218b(r2)     // Catch:{ Throwable -> 0x0451 }
            p2628d.p2638e.C52647c.m112189a(r0, r1)
            com.google.gson.f r0 = com.p683ss.android.ugc.aweme.utils.C47760cd.m103383a()
            com.ss.android.ugc.aweme.journey.i$a r1 = new com.ss.android.ugc.aweme.journey.i$a
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r0 = r0.mo34885a(r2, r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0069
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0070
        L_0x0069:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x0070:
            java.util.Iterator r1 = r0.iterator()
        L_0x0074:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x044e
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.journey.q r2 = (com.p683ss.android.ugc.aweme.journey.C35777q) r2
            java.lang.String r3 = r2.f91887a
            java.lang.String r4 = "s"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
            java.lang.String r4 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r4)
            int r4 = r3.hashCode()
            r5 = 2132546948(0x7f1c1584, float:2.0747128E38)
            switch(r4) {
                case -2028215897: goto L_0x042a;
                case -1963180254: goto L_0x0415;
                case -1811893345: goto L_0x0400;
                case -1797219060: goto L_0x03eb;
                case -1781830854: goto L_0x03d6;
                case -1082679165: goto L_0x03c1;
                case -1050401237: goto L_0x03ab;
                case -833750813: goto L_0x0395;
                case -752113842: goto L_0x036b;
                case -720253902: goto L_0x0355;
                case -686144149: goto L_0x033f;
                case -317480538: goto L_0x0329;
                case -254629764: goto L_0x0313;
                case -210304353: goto L_0x02fd;
                case -86374264: goto L_0x02e7;
                case 66115: goto L_0x02d1;
                case 67700: goto L_0x02bb;
                case 2052559: goto L_0x02a5;
                case 2195582: goto L_0x028f;
                case 2602678: goto L_0x0279;
                case 65798035: goto L_0x0263;
                case 66292295: goto L_0x024d;
                case 74710533: goto L_0x0237;
                case 123562007: goto L_0x0221;
                case 169588576: goto L_0x020b;
                case 400139022: goto L_0x01f5;
                case 587876755: goto L_0x01df;
                case 807717335: goto L_0x01c9;
                case 833183507: goto L_0x01b3;
                case 982113085: goto L_0x019d;
                case 1085311376: goto L_0x0187;
                case 1298968424: goto L_0x0171;
                case 1414863620: goto L_0x015b;
                case 1419008025: goto L_0x0145;
                case 1461903030: goto L_0x012f;
                case 1638848318: goto L_0x0119;
                case 1665004953: goto L_0x0103;
                case 1961668532: goto L_0x00f0;
                case 2024011449: goto L_0x00da;
                case 2096973700: goto L_0x00c4;
                case 2096998767: goto L_0x00ae;
                case 2125602895: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x043f
        L_0x0098:
            java.lang.String r4 = "Gaming"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546955(0x7f1c158b, float:2.0747142E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…new_user_interest_gaming)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x00ae:
            java.lang.String r4 = "Fandom"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546951(0x7f1c1587, float:2.0747134E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…new_user_interest_fandom)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x00c4:
            java.lang.String r4 = "Family"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546950(0x7f1c1586, float:2.0747132E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…new_user_interest_family)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x00da:
            java.lang.String r4 = "Comedy"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546944(0x7f1c1580, float:2.074712E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…new_user_interest_comedy)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x00f0:
            java.lang.String r4 = "DIY & Life Hacks"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            java.lang.String r3 = r7.getString(r5)
            java.lang.String r4 = "context.getString(R.stri…r_interest_diy_lifehacks)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0103:
            java.lang.String r4 = "Nature & Wildlife"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546965(0x7f1c1595, float:2.0747163E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…erest_in_nature_wildlife)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0119:
            java.lang.String r4 = "Learning"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546963(0x7f1c1593, float:2.0747159E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…ser_interest_in_learning)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x012f:
            java.lang.String r4 = "Motivation"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546964(0x7f1c1594, float:2.074716E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…r_interest_in_motivation)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0145:
            java.lang.String r4 = "Bollywood"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546958(0x7f1c158e, float:2.0747149E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…er_interest_in_bollywood)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x015b:
            java.lang.String r4 = "Home decor"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546961(0x7f1c1591, float:2.0747155E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…r_interest_in_home_decor)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0171:
            java.lang.String r4 = "Entertainment"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546960(0x7f1c1590, float:2.0747153E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…nterest_in_entertainment)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0187:
            java.lang.String r4 = "Home & Garden"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546956(0x7f1c158c, float:2.0747145E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…ser_interest_home_garden)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x019d:
            java.lang.String r4 = "Arts & Crafts"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546957(0x7f1c158d, float:2.0747147E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…r_interest_in_artscrafts)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x01b3:
            java.lang.String r4 = "Love & Dating"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546968(0x7f1c1598, float:2.0747169E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…ser_interest_love_dating)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x01c9:
            java.lang.String r4 = "Animals"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546938(0x7f1c157a, float:2.0747108E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…ew_user_interest_animals)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x01df:
            java.lang.String r4 = "Beauty & Style"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546941(0x7f1c157d, float:2.0747114E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…er_interest_beauty_style)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x01f5:
            java.lang.String r4 = "Fitness & Health"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546953(0x7f1c1589, float:2.0747138E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…_interest_fitness_health)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x020b:
            java.lang.String r4 = "Tech & Science"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546966(0x7f1c1596, float:2.0747165E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…interest_in_tech_science)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0221:
            java.lang.String r4 = "Outdoors"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546972(0x7f1c159c, float:2.0747177E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…w_user_interest_outdoors)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0237:
            java.lang.String r4 = "Music"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546983(0x7f1c15a7, float:2.07472E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…w_user_interest_us_music)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x024d:
            java.lang.String r4 = "Drama"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546949(0x7f1c1585, float:2.074713E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri….new_user_interest_drama)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0263:
            java.lang.String r4 = "Dance"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546946(0x7f1c1582, float:2.0747124E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri….new_user_interest_dance)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0279:
            java.lang.String r4 = "Tech"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546978(0x7f1c15a2, float:2.074719E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.string.new_user_interest_tech)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x028f:
            java.lang.String r4 = "Food"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546954(0x7f1c158a, float:2.074714E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.string.new_user_interest_food)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x02a5:
            java.lang.String r4 = "Auto"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546940(0x7f1c157c, float:2.0747112E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.string.new_user_interest_auto)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x02bb:
            java.lang.String r4 = "DIY"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546981(0x7f1c15a5, float:2.0747195E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…new_user_interest_us_diy)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x02d1:
            java.lang.String r4 = "Art"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546939(0x7f1c157b, float:2.074711E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.string.new_user_interest_art)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x02e7:
            java.lang.String r4 = "Fashion Accessories"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546952(0x7f1c1588, float:2.0747136E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…erest_fashionaccessories)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x02fd:
            java.lang.String r4 = "Pop Culture"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546973(0x7f1c159d, float:2.074718E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…user_interest_popculture)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0313:
            java.lang.String r4 = "Motivation & Advice"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546969(0x7f1c1599, float:2.074717E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…nterest_motivationadvice)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0329:
            java.lang.String r4 = "Emotional"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546959(0x7f1c158f, float:2.074715E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…er_interest_in_emotional)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x033f:
            java.lang.String r4 = "Occupation"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546970(0x7f1c159a, float:2.0747173E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…user_interest_occupation)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0355:
            java.lang.String r4 = "Science & Education"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546974(0x7f1c159e, float:2.0747181E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…terest_science_education)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x036b:
            java.lang.String r4 = "Life Hacks"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            java.lang.String r3 = "US"
            com.ss.android.ugc.aweme.journey.s r4 = com.p683ss.android.ugc.aweme.journey.C35781s.f91909n
            java.lang.String r4 = r4.mo74443g()
            r6 = 1
            boolean r3 = p2628d.p2650m.C52830p.m112406a(r3, r4, r6)
            if (r3 == 0) goto L_0x038a
            r3 = 2132546982(0x7f1c15a6, float:2.0747197E38)
            java.lang.String r3 = r7.getString(r3)
            goto L_0x038e
        L_0x038a:
            java.lang.String r3 = r7.getString(r5)
        L_0x038e:
            java.lang.String r4 = "if (\"US\".equals(NewUserJ…_lifehacks)\n            }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0395:
            java.lang.String r4 = "Daily Life"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546945(0x7f1c1581, float:2.0747122E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…_user_interest_dailylife)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x03ab:
            java.lang.String r4 = "Tollywood"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546967(0x7f1c1597, float:2.0747167E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…er_interest_in_tollywood)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x03c1:
            java.lang.String r4 = "Oddly Satisfying"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546971(0x7f1c159b, float:2.0747175E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…interest_oddlysatisfying)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x03d6:
            java.lang.String r4 = "Travel"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546980(0x7f1c15a4, float:2.0747193E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…new_user_interest_travel)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x03eb:
            java.lang.String r4 = "Talent"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546977(0x7f1c15a1, float:2.0747187E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…new_user_interest_talent)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0400:
            java.lang.String r4 = "Sports"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546975(0x7f1c159f, float:2.0747183E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…new_user_interest_sports)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x0415:
            java.lang.String r4 = "Kollywood"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546962(0x7f1c1592, float:2.0747157E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…er_interest_in_kollywood)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x042a:
            java.lang.String r4 = "Clothing & Apparel"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x043f
            r3 = 2132546943(0x7f1c157f, float:2.0747118E38)
            java.lang.String r3 = r7.getString(r3)
            java.lang.String r4 = "context.getString(R.stri…nterest_clothing_apparel)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            goto L_0x0441
        L_0x043f:
            java.lang.String r3 = ""
        L_0x0441:
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0074
            r2.f91888b = r3
            goto L_0x0074
        L_0x044e:
            return r0
        L_0x044f:
            r7 = move-exception
            goto L_0x0454
        L_0x0451:
            r7 = move-exception
            r1 = r7
            throw r1     // Catch:{ all -> 0x044f }
        L_0x0454:
            p2628d.p2638e.C52647c.m112189a(r0, r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.C35762i.m80899a(android.content.Context):java.util.List");
    }
}
