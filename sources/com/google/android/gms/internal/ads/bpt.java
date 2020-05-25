package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzpn.zza;

final class bpt {

    /* renamed from: A */
    private static final int f43454A = btw.m36765b("sosn");

    /* renamed from: B */
    private static final int f43455B = btw.m36765b("tvsh");

    /* renamed from: C */
    private static final int f43456C = btw.m36765b("----");

    /* renamed from: D */
    private static final String[] f43457D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f43458a = btw.m36765b("nam");

    /* renamed from: b */
    private static final int f43459b = btw.m36765b("trk");

    /* renamed from: c */
    private static final int f43460c = btw.m36765b("cmt");

    /* renamed from: d */
    private static final int f43461d = btw.m36765b("day");

    /* renamed from: e */
    private static final int f43462e = btw.m36765b("ART");

    /* renamed from: f */
    private static final int f43463f = btw.m36765b("too");

    /* renamed from: g */
    private static final int f43464g = btw.m36765b("alb");

    /* renamed from: h */
    private static final int f43465h = btw.m36765b("com");

    /* renamed from: i */
    private static final int f43466i = btw.m36765b("wrt");

    /* renamed from: j */
    private static final int f43467j = btw.m36765b("lyr");

    /* renamed from: k */
    private static final int f43468k = btw.m36765b("gen");

    /* renamed from: l */
    private static final int f43469l = btw.m36765b("covr");

    /* renamed from: m */
    private static final int f43470m = btw.m36765b("gnre");

    /* renamed from: n */
    private static final int f43471n = btw.m36765b("grp");

    /* renamed from: o */
    private static final int f43472o = btw.m36765b("disk");

    /* renamed from: p */
    private static final int f43473p = btw.m36765b("trkn");

    /* renamed from: q */
    private static final int f43474q = btw.m36765b("tmpo");

    /* renamed from: r */
    private static final int f43475r = btw.m36765b("cpil");

    /* renamed from: s */
    private static final int f43476s = btw.m36765b("aART");

    /* renamed from: t */
    private static final int f43477t = btw.m36765b("sonm");

    /* renamed from: u */
    private static final int f43478u = btw.m36765b("soal");

    /* renamed from: v */
    private static final int f43479v = btw.m36765b("soar");

    /* renamed from: w */
    private static final int f43480w = btw.m36765b("soaa");

    /* renamed from: x */
    private static final int f43481x = btw.m36765b("soco");

    /* renamed from: y */
    private static final int f43482y = btw.m36765b("rtng");

    /* renamed from: z */
    private static final int f43483z = btw.m36765b("pgap");

    /* renamed from: a */
    public static zza m36413a(btr btr) {
        zza zza;
        int g = btr.f43868b + btr.mo30703g();
        int g2 = btr.mo30703g();
        int i = g2 >>> 24;
        zzpr zzpr = null;
        if (i == 169 || i == 65533) {
            int i2 = g2 & 16777215;
            if (i2 == f43460c) {
                int g3 = btr.mo30703g();
                if (btr.mo30703g() == bph.f43377ap) {
                    btr.mo30699d(8);
                    String e = btr.mo30701e(g3 - 16);
                    zzpr = new zzpr("und", e, e);
                } else {
                    String str = "Failed to parse comment attribute: ";
                    String valueOf = String.valueOf(bph.m36393b(g2));
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        new String(str);
                    }
                }
                btr.mo30697c(g);
                return zzpr;
            }
            if (i2 != f43458a) {
                if (i2 != f43459b) {
                    if (i2 != f43465h) {
                        if (i2 != f43466i) {
                            if (i2 == f43461d) {
                                zzpv a = m36415a(g2, "TDRC", btr);
                                btr.mo30697c(g);
                                return a;
                            } else if (i2 == f43462e) {
                                zzpv a2 = m36415a(g2, "TPE1", btr);
                                btr.mo30697c(g);
                                return a2;
                            } else if (i2 == f43463f) {
                                zzpv a3 = m36415a(g2, "TSSE", btr);
                                btr.mo30697c(g);
                                return a3;
                            } else if (i2 == f43464g) {
                                zzpv a4 = m36415a(g2, "TALB", btr);
                                btr.mo30697c(g);
                                return a4;
                            } else if (i2 == f43467j) {
                                zzpv a5 = m36415a(g2, "USLT", btr);
                                btr.mo30697c(g);
                                return a5;
                            } else if (i2 == f43468k) {
                                zzpv a6 = m36415a(g2, "TCON", btr);
                                btr.mo30697c(g);
                                return a6;
                            } else if (i2 == f43471n) {
                                zzpv a7 = m36415a(g2, "TIT1", btr);
                                btr.mo30697c(g);
                                return a7;
                            }
                        }
                    }
                    zzpv a8 = m36415a(g2, "TCOM", btr);
                    btr.mo30697c(g);
                    return a8;
                }
            }
            zzpv a9 = m36415a(g2, "TIT2", btr);
            btr.mo30697c(g);
            return a9;
        }
        try {
            if (g2 == f43470m) {
                int b = m36416b(btr);
                String str2 = (b <= 0 || b > f43457D.length) ? null : f43457D[b - 1];
                return str2 != null ? new zzpv("TCON", null, str2) : null;
            } else if (g2 == f43472o) {
                zzpv b2 = m36417b(g2, "TPOS", btr);
                btr.mo30697c(g);
                return b2;
            } else if (g2 == f43473p) {
                zzpv b3 = m36417b(g2, "TRCK", btr);
                btr.mo30697c(g);
                return b3;
            } else if (g2 == f43474q) {
                zzpu a10 = m36414a(g2, "TBPM", btr, true, false);
                btr.mo30697c(g);
                return a10;
            } else if (g2 == f43475r) {
                zzpu a11 = m36414a(g2, "TCMP", btr, true, true);
                btr.mo30697c(g);
                return a11;
            } else if (g2 == f43469l) {
                int g4 = btr.mo30703g();
                if (btr.mo30703g() == bph.f43377ap) {
                    int g5 = btr.mo30703g() & 16777215;
                    String str3 = g5 == 13 ? "image/jpeg" : g5 == 14 ? "image/png" : null;
                    if (str3 != null) {
                        btr.mo30699d(4);
                        byte[] bArr = new byte[(g4 - 16)];
                        btr.mo30693a(bArr, 0, bArr.length);
                        zza = new zzpp(str3, null, 3, bArr);
                        btr.mo30697c(g);
                        return zza;
                    }
                }
                zza = null;
                btr.mo30697c(g);
                return zza;
            } else if (g2 == f43476s) {
                zzpv a12 = m36415a(g2, "TPE2", btr);
                btr.mo30697c(g);
                return a12;
            } else if (g2 == f43477t) {
                zzpv a13 = m36415a(g2, "TSOT", btr);
                btr.mo30697c(g);
                return a13;
            } else if (g2 == f43478u) {
                zzpv a14 = m36415a(g2, "TSO2", btr);
                btr.mo30697c(g);
                return a14;
            } else if (g2 == f43479v) {
                zzpv a15 = m36415a(g2, "TSOA", btr);
                btr.mo30697c(g);
                return a15;
            } else if (g2 == f43480w) {
                zzpv a16 = m36415a(g2, "TSOP", btr);
                btr.mo30697c(g);
                return a16;
            } else if (g2 == f43481x) {
                zzpv a17 = m36415a(g2, "TSOC", btr);
                btr.mo30697c(g);
                return a17;
            } else if (g2 == f43482y) {
                zzpu a18 = m36414a(g2, "ITUNESADVISORY", btr, false, false);
                btr.mo30697c(g);
                return a18;
            } else if (g2 == f43483z) {
                zzpu a19 = m36414a(g2, "ITUNESGAPLESS", btr, false, true);
                btr.mo30697c(g);
                return a19;
            } else if (g2 == f43454A) {
                zzpv a20 = m36415a(g2, "TVSHOWSORT", btr);
                btr.mo30697c(g);
                return a20;
            } else if (g2 == f43455B) {
                zzpv a21 = m36415a(g2, "TVSHOW", btr);
                btr.mo30697c(g);
                return a21;
            } else if (g2 == f43456C) {
                Object obj = null;
                String str4 = null;
                int i3 = -1;
                int i4 = -1;
                while (btr.f43868b < g) {
                    int i5 = btr.f43868b;
                    int g6 = btr.mo30703g();
                    int g7 = btr.mo30703g();
                    btr.mo30699d(4);
                    if (g7 == bph.f43375an) {
                        obj = btr.mo30701e(g6 - 12);
                    } else if (g7 == bph.f43376ao) {
                        str4 = btr.mo30701e(g6 - 12);
                    } else {
                        if (g7 == bph.f43377ap) {
                            i3 = i5;
                            i4 = g6;
                        }
                        btr.mo30699d(g6 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(obj) && "iTunSMPB".equals(str4)) {
                    if (i3 != -1) {
                        btr.mo30697c(i3);
                        btr.mo30699d(16);
                        zzpr = new zzpr("und", str4, btr.mo30701e(i4 - 16));
                    }
                }
                btr.mo30697c(g);
                return zzpr;
            }
        } finally {
            btr.mo30697c(g);
        }
        String str5 = "Skipped unknown metadata entry: ";
        String valueOf2 = String.valueOf(bph.m36393b(g2));
        if (valueOf2.length() != 0) {
            str5.concat(valueOf2);
        } else {
            new String(str5);
        }
        btr.mo30697c(g);
        return null;
    }

    /* renamed from: a */
    private static zzpv m36415a(int i, String str, btr btr) {
        int g = btr.mo30703g();
        if (btr.mo30703g() == bph.f43377ap) {
            btr.mo30699d(8);
            return new zzpv(str, null, btr.mo30701e(g - 16));
        }
        String str2 = "Failed to parse text attribute: ";
        String valueOf = String.valueOf(bph.m36393b(i));
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        return null;
    }

    /* renamed from: a */
    private static zzpu m36414a(int i, String str, btr btr, boolean z, boolean z2) {
        int b = m36416b(btr);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            String str2 = "Failed to parse uint8 attribute: ";
            String valueOf = String.valueOf(bph.m36393b(i));
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        } else if (z) {
            return new zzpv(str, null, Integer.toString(b));
        } else {
            return new zzpr("und", str, Integer.toString(b));
        }
    }

    /* renamed from: b */
    private static zzpv m36417b(int i, String str, btr btr) {
        int g = btr.mo30703g();
        if (btr.mo30703g() == bph.f43377ap && g >= 22) {
            btr.mo30699d(10);
            int e = btr.mo30700e();
            if (e > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(e);
                String sb2 = sb.toString();
                int e2 = btr.mo30700e();
                if (e2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(e2);
                    sb2 = sb3.toString();
                }
                return new zzpv(str, null, sb2);
            }
        }
        String str2 = "Failed to parse index/count attribute: ";
        String valueOf2 = String.valueOf(bph.m36393b(i));
        if (valueOf2.length() != 0) {
            str2.concat(valueOf2);
        } else {
            new String(str2);
        }
        return null;
    }

    /* renamed from: b */
    private static int m36416b(btr btr) {
        btr.mo30699d(4);
        if (btr.mo30703g() != bph.f43377ap) {
            return -1;
        }
        btr.mo30699d(8);
        return btr.mo30698d();
    }
}
