package okhttp3;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: okhttp3.h */
public final class C53530h {

    /* renamed from: A */
    public static final C53530h f132501A = m113690a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* renamed from: B */
    public static final C53530h f132502B = m113690a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* renamed from: C */
    public static final C53530h f132503C = m113690a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* renamed from: D */
    public static final C53530h f132504D = m113690a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* renamed from: E */
    public static final C53530h f132505E = m113690a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: F */
    public static final C53530h f132506F = m113690a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* renamed from: G */
    public static final C53530h f132507G = m113690a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* renamed from: H */
    public static final C53530h f132508H = m113690a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* renamed from: I */
    public static final C53530h f132509I = m113690a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: J */
    public static final C53530h f132510J = m113690a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* renamed from: K */
    public static final C53530h f132511K = m113690a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* renamed from: L */
    public static final C53530h f132512L = m113690a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* renamed from: M */
    public static final C53530h f132513M = m113690a("TLS_RSA_WITH_NULL_SHA256", 59);

    /* renamed from: N */
    public static final C53530h f132514N = m113690a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* renamed from: O */
    public static final C53530h f132515O = m113690a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* renamed from: P */
    public static final C53530h f132516P = m113690a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* renamed from: Q */
    public static final C53530h f132517Q = m113690a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* renamed from: R */
    public static final C53530h f132518R = m113690a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* renamed from: S */
    public static final C53530h f132519S = m113690a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* renamed from: T */
    public static final C53530h f132520T = m113690a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* renamed from: U */
    public static final C53530h f132521U = m113690a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* renamed from: V */
    public static final C53530h f132522V = m113690a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* renamed from: W */
    public static final C53530h f132523W = m113690a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* renamed from: X */
    public static final C53530h f132524X = m113690a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* renamed from: Y */
    public static final C53530h f132525Y = m113690a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: Z */
    public static final C53530h f132526Z = m113690a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: a */
    static final Comparator<String> f132527a = new Comparator<String>() {
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0035 A[PHI: r2 
          PHI: (r2v2 int) = (r2v1 int), (r2v0 int), (r2v0 int) binds: [B:12:0x0034, B:10:0x0030, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r8 = (java.lang.String) r8
                int r0 = r7.length()
                int r1 = r8.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 4
            L_0x0011:
                r2 = -1
                r3 = 1
                if (r1 >= r0) goto L_0x0026
                char r4 = r7.charAt(r1)
                char r5 = r8.charAt(r1)
                if (r4 == r5) goto L_0x0023
                if (r4 >= r5) goto L_0x0022
                goto L_0x0035
            L_0x0022:
                return r3
            L_0x0023:
                int r1 = r1 + 1
                goto L_0x0011
            L_0x0026:
                int r7 = r7.length()
                int r8 = r8.length()
                if (r7 == r8) goto L_0x0034
                if (r7 >= r8) goto L_0x0033
                goto L_0x0035
            L_0x0033:
                return r3
            L_0x0034:
                r2 = 0
            L_0x0035:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C53530h.C535311.compare(java.lang.Object, java.lang.Object):int");
        }
    };

    /* renamed from: aA */
    public static final C53530h f132528aA = m113690a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);

    /* renamed from: aB */
    public static final C53530h f132529aB = m113690a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);

    /* renamed from: aC */
    public static final C53530h f132530aC = m113690a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);

    /* renamed from: aD */
    public static final C53530h f132531aD = m113690a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);

    /* renamed from: aE */
    public static final C53530h f132532aE = m113690a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);

    /* renamed from: aF */
    public static final C53530h f132533aF = m113690a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);

    /* renamed from: aG */
    public static final C53530h f132534aG = m113690a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);

    /* renamed from: aH */
    public static final C53530h f132535aH = m113690a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);

    /* renamed from: aI */
    public static final C53530h f132536aI = m113690a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: aJ */
    public static final C53530h f132537aJ = m113690a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: aK */
    public static final C53530h f132538aK = m113690a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);

    /* renamed from: aL */
    public static final C53530h f132539aL = m113690a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);

    /* renamed from: aM */
    public static final C53530h f132540aM = m113690a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);

    /* renamed from: aN */
    public static final C53530h f132541aN = m113690a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);

    /* renamed from: aO */
    public static final C53530h f132542aO = m113690a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);

    /* renamed from: aP */
    public static final C53530h f132543aP = m113690a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);

    /* renamed from: aQ */
    public static final C53530h f132544aQ = m113690a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);

    /* renamed from: aR */
    public static final C53530h f132545aR = m113690a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);

    /* renamed from: aS */
    public static final C53530h f132546aS = m113690a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);

    /* renamed from: aT */
    public static final C53530h f132547aT = m113690a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);

    /* renamed from: aU */
    public static final C53530h f132548aU = m113690a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);

    /* renamed from: aV */
    public static final C53530h f132549aV = m113690a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);

    /* renamed from: aW */
    public static final C53530h f132550aW = m113690a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);

    /* renamed from: aX */
    public static final C53530h f132551aX = m113690a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: aY */
    public static final C53530h f132552aY = m113690a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: aZ */
    public static final C53530h f132553aZ = m113690a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: aa */
    public static final C53530h f132554aa = m113690a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: ab */
    public static final C53530h f132555ab = m113690a("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: ac */
    public static final C53530h f132556ac = m113690a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* renamed from: ad */
    public static final C53530h f132557ad = m113690a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* renamed from: ae */
    public static final C53530h f132558ae = m113690a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* renamed from: af */
    public static final C53530h f132559af = m113690a("TLS_RSA_WITH_SEED_CBC_SHA", NormalGiftView.MASK_TRANSLATE_VALUE);

    /* renamed from: ag */
    public static final C53530h f132560ag = m113690a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: ah */
    public static final C53530h f132561ah = m113690a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: ai */
    public static final C53530h f132562ai = m113690a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: aj */
    public static final C53530h f132563aj = m113690a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: ak */
    public static final C53530h f132564ak = m113690a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* renamed from: al */
    public static final C53530h f132565al = m113690a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: am */
    public static final C53530h f132566am = m113690a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* renamed from: an */
    public static final C53530h f132567an = m113690a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: ao */
    public static final C53530h f132568ao = m113690a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", NormalGiftView.ALPHA_255);

    /* renamed from: ap */
    public static final C53530h f132569ap = m113690a("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: aq */
    public static final C53530h f132570aq = m113690a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: ar */
    public static final C53530h f132571ar = m113690a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: as */
    public static final C53530h f132572as = m113690a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: at */
    public static final C53530h f132573at = m113690a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: au */
    public static final C53530h f132574au = m113690a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: av */
    public static final C53530h f132575av = m113690a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: aw */
    public static final C53530h f132576aw = m113690a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: ax */
    public static final C53530h f132577ax = m113690a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* renamed from: ay */
    public static final C53530h f132578ay = m113690a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);

    /* renamed from: az */
    public static final C53530h f132579az = m113690a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);

    /* renamed from: b */
    public static final C53530h f132580b = m113690a("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: ba */
    public static final C53530h f132581ba = m113690a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: bb */
    public static final C53530h f132582bb = m113690a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: bc */
    public static final C53530h f132583bc = m113690a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: bd */
    public static final C53530h f132584bd = m113690a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: be */
    public static final C53530h f132585be = m113690a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: bf */
    public static final C53530h f132586bf = m113690a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: bg */
    public static final C53530h f132587bg = m113690a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: bh */
    public static final C53530h f132588bh = m113690a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: bi */
    public static final C53530h f132589bi = m113690a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: bk */
    private static final Map<String, C53530h> f132590bk = new TreeMap(f132527a);

    /* renamed from: c */
    public static final C53530h f132591c = m113690a("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: d */
    public static final C53530h f132592d = m113690a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: e */
    public static final C53530h f132593e = m113690a("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: f */
    public static final C53530h f132594f = m113690a("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: g */
    public static final C53530h f132595g = m113690a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: h */
    public static final C53530h f132596h = m113690a("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: i */
    public static final C53530h f132597i = m113690a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: j */
    public static final C53530h f132598j = m113690a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: k */
    public static final C53530h f132599k = m113690a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: l */
    public static final C53530h f132600l = m113690a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: m */
    public static final C53530h f132601m = m113690a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: n */
    public static final C53530h f132602n = m113690a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: o */
    public static final C53530h f132603o = m113690a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: p */
    public static final C53530h f132604p = m113690a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: q */
    public static final C53530h f132605q = m113690a("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: r */
    public static final C53530h f132606r = m113690a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: s */
    public static final C53530h f132607s = m113690a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: t */
    public static final C53530h f132608t = m113690a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: u */
    public static final C53530h f132609u = m113690a("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: v */
    public static final C53530h f132610v = m113690a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: w */
    public static final C53530h f132611w = m113690a("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: x */
    public static final C53530h f132612x = m113690a("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* renamed from: y */
    public static final C53530h f132613y = m113690a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* renamed from: z */
    public static final C53530h f132614z = m113690a("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* renamed from: bj */
    public final String f132615bj;

    public final String toString() {
        return this.f132615bj;
    }

    private C53530h(String str) {
        if (str != null) {
            this.f132615bj = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static synchronized C53530h m113689a(String str) {
        C53530h hVar;
        synchronized (C53530h.class) {
            hVar = (C53530h) f132590bk.get(str);
            if (hVar == null) {
                hVar = new C53530h(str);
                f132590bk.put(str, hVar);
            }
        }
        return hVar;
    }

    /* renamed from: a */
    private static C53530h m113690a(String str, int i) {
        return m113689a(str);
    }
}
