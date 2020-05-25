package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

class bjm {

    /* renamed from: A */
    public static final int f42622A = blp.m36021a("pasp");

    /* renamed from: B */
    public static final int f42623B = blp.m36021a("TTML");

    /* renamed from: C */
    public static final int f42624C = blp.m36021a("vmhd");

    /* renamed from: D */
    public static final int f42625D = blp.m36021a("smhd");

    /* renamed from: E */
    public static final int f42626E = blp.m36021a("mp4v");

    /* renamed from: F */
    public static final int f42627F = blp.m36021a("stts");

    /* renamed from: G */
    public static final int f42628G = blp.m36021a("stss");

    /* renamed from: H */
    public static final int f42629H = blp.m36021a("ctts");

    /* renamed from: I */
    public static final int f42630I = blp.m36021a("stsc");

    /* renamed from: J */
    public static final int f42631J = blp.m36021a("stsz");

    /* renamed from: K */
    public static final int f42632K = blp.m36021a("stco");

    /* renamed from: L */
    public static final int f42633L = blp.m36021a("co64");

    /* renamed from: N */
    private static final int f42634N = blp.m36021a("ftyp");

    /* renamed from: O */
    private static final int f42635O = blp.m36021a("mdat");

    /* renamed from: P */
    private static final int f42636P = blp.m36021a("tfdt");

    /* renamed from: Q */
    private static final int f42637Q = blp.m36021a("tfhd");

    /* renamed from: R */
    private static final int f42638R = blp.m36021a("trex");

    /* renamed from: S */
    private static final int f42639S = blp.m36021a("trun");

    /* renamed from: T */
    private static final int f42640T = blp.m36021a("sidx");

    /* renamed from: U */
    private static final int f42641U = blp.m36021a("moof");

    /* renamed from: V */
    private static final int f42642V = blp.m36021a("traf");

    /* renamed from: W */
    private static final int f42643W = blp.m36021a("mvex");

    /* renamed from: X */
    private static final int f42644X = blp.m36021a("pssh");

    /* renamed from: Y */
    private static final int f42645Y = blp.m36021a("saiz");

    /* renamed from: Z */
    private static final int f42646Z = blp.m36021a("uuid");

    /* renamed from: a */
    public static final int f42647a = blp.m36021a("avc1");

    /* renamed from: aa */
    private static final int f42648aa = blp.m36021a("senc");

    /* renamed from: b */
    public static final int f42649b = blp.m36021a("avc3");

    /* renamed from: c */
    public static final int f42650c = blp.m36021a("esds");

    /* renamed from: d */
    public static final int f42651d = blp.m36021a("mp4a");

    /* renamed from: e */
    public static final int f42652e = blp.m36021a("ac-3");

    /* renamed from: f */
    public static final int f42653f = blp.m36021a("dac3");

    /* renamed from: g */
    public static final int f42654g = blp.m36021a("ec-3");

    /* renamed from: h */
    public static final int f42655h = blp.m36021a("dec3");

    /* renamed from: i */
    public static final int f42656i = blp.m36021a("moov");

    /* renamed from: j */
    public static final int f42657j = blp.m36021a("mvhd");

    /* renamed from: k */
    public static final int f42658k = blp.m36021a("trak");

    /* renamed from: l */
    public static final int f42659l = blp.m36021a("mdia");

    /* renamed from: m */
    public static final int f42660m = blp.m36021a("minf");

    /* renamed from: n */
    public static final int f42661n = blp.m36021a("stbl");

    /* renamed from: o */
    public static final int f42662o = blp.m36021a("avcC");

    /* renamed from: p */
    public static final int f42663p = blp.m36021a("tkhd");

    /* renamed from: q */
    public static final int f42664q = blp.m36021a("mdhd");

    /* renamed from: r */
    public static final int f42665r = blp.m36021a("hdlr");

    /* renamed from: s */
    public static final int f42666s = blp.m36021a("stsd");

    /* renamed from: t */
    public static final int f42667t = blp.m36021a("sinf");

    /* renamed from: u */
    public static final int f42668u = blp.m36021a("schm");

    /* renamed from: v */
    public static final int f42669v = blp.m36021a("schi");

    /* renamed from: w */
    public static final int f42670w = blp.m36021a("tenc");

    /* renamed from: x */
    public static final int f42671x = blp.m36021a("encv");

    /* renamed from: y */
    public static final int f42672y = blp.m36021a("enca");

    /* renamed from: z */
    public static final int f42673z = blp.m36021a("frma");

    /* renamed from: M */
    public final int f42674M;

    bjm(int i) {
        this.f42674M = i;
    }

    /* renamed from: a */
    public static int m35904a(int i) {
        return (i >> 24) & NormalGiftView.ALPHA_255;
    }

    public String toString() {
        return m35905b(this.f42674M);
    }

    /* renamed from: b */
    public static String m35905b(int i) {
        char c = (char) (i >> 24);
        char c2 = (char) ((i >> 16) & NormalGiftView.ALPHA_255);
        char c3 = (char) ((i >> 8) & NormalGiftView.ALPHA_255);
        char c4 = (char) (i & NormalGiftView.ALPHA_255);
        StringBuilder sb = new StringBuilder(4);
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }
}
