package com.p683ss.android.ugc.aweme.player.p2050a;

import com.p683ss.android.common.util.NetworkUtils.C18911h;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1963ml.C37120o;
import com.p683ss.android.ugc.aweme.player.C38850c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38865f;
import com.p683ss.android.ugc.aweme.video.C47985af;
import com.p683ss.android.ugc.aweme.video.preload.C48083f;
import com.p683ss.android.ugc.aweme.video.preload.C48083f.C48084a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.player.a.b */
public final class C38828b {

    /* renamed from: A */
    public static final int f98793A = 300;

    /* renamed from: B */
    public static final int f98794B = 5;

    /* renamed from: C */
    public static final int f98795C = 20;

    /* renamed from: D */
    public static final int f98796D = 15;

    /* renamed from: E */
    public static int f98797E = 0;

    /* renamed from: F */
    public static String f98798F = null;

    /* renamed from: G */
    public static final C38831c f98799G = new C38831c(null);

    /* renamed from: r */
    public static final int f98800r = 1;

    /* renamed from: s */
    public static final int f98801s = 2;

    /* renamed from: t */
    public static final int f98802t = 3;

    /* renamed from: u */
    public static final String f98803u = f98803u;

    /* renamed from: v */
    public static final String f98804v = f98804v;

    /* renamed from: w */
    public static final String f98805w = f98805w;

    /* renamed from: x */
    public static final String f98806x = f98806x;

    /* renamed from: y */
    public static final int f98807y = 50;

    /* renamed from: z */
    public static final int f98808z = 200;

    /* renamed from: a */
    public Aweme f98809a;

    /* renamed from: b */
    public Integer f98810b;

    /* renamed from: c */
    public boolean f98811c;

    /* renamed from: d */
    public boolean f98812d;

    /* renamed from: e */
    public String f98813e;

    /* renamed from: f */
    public List<C48083f> f98814f;

    /* renamed from: g */
    public List<C47985af> f98815g;

    /* renamed from: h */
    public int f98816h;

    /* renamed from: i */
    public float f98817i;

    /* renamed from: j */
    public long f98818j;

    /* renamed from: k */
    public long f98819k;

    /* renamed from: l */
    public int f98820l;

    /* renamed from: m */
    public long f98821m;

    /* renamed from: n */
    public ArrayList<Aweme> f98822n;

    /* renamed from: o */
    public C38865f f98823o;

    /* renamed from: p */
    public int f98824p;

    /* renamed from: q */
    public long f98825q;

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$a */
    public static final class C38829a {

        /* renamed from: a */
        public C38828b f98826a = new C38828b();

        /* renamed from: a */
        public final C38829a mo78788a(float f) {
            this.f98826a.f98817i = f;
            return this;
        }

        /* renamed from: b */
        public final C38829a mo78797b(int i) {
            this.f98826a.f98820l = i;
            return this;
        }

        /* renamed from: c */
        public final C38829a mo78801c(int i) {
            this.f98826a.f98816h = i;
            return this;
        }

        /* renamed from: d */
        public final C38829a mo78803d(int i) {
            this.f98826a.f98824p = i;
            return this;
        }

        /* renamed from: a */
        public final C38829a mo78789a(int i) {
            this.f98826a.f98810b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: b */
        public final C38829a mo78798b(long j) {
            this.f98826a.f98819k = j;
            return this;
        }

        /* renamed from: c */
        public final C38829a mo78802c(long j) {
            this.f98826a.f98825q = j;
            return this;
        }

        /* renamed from: a */
        public final C38829a mo78790a(long j) {
            this.f98826a.f98818j = j;
            return this;
        }

        /* renamed from: b */
        public final C38829a mo78799b(List<C47985af> list) {
            this.f98826a.f98815g = list;
            return this;
        }

        /* renamed from: a */
        public final C38829a mo78791a(Aweme aweme) {
            this.f98826a.f98809a = aweme;
            return this;
        }

        /* renamed from: b */
        public final C38829a mo78800b(boolean z) {
            this.f98826a.f98812d = z;
            return this;
        }

        /* renamed from: a */
        public final C38829a mo78792a(C38865f fVar) {
            this.f98826a.f98823o = fVar;
            return this;
        }

        /* renamed from: a */
        public final C38829a mo78793a(String str) {
            this.f98826a.f98813e = str;
            return this;
        }

        /* renamed from: a */
        public final C38829a mo78794a(ArrayList<Aweme> arrayList) {
            this.f98826a.f98822n = arrayList;
            return this;
        }

        /* renamed from: a */
        public final C38829a mo78795a(List<C48083f> list) {
            this.f98826a.f98814f = list;
            return this;
        }

        /* renamed from: a */
        public final C38829a mo78796a(boolean z) {
            this.f98826a.f98811c = z;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$b */
    public static final class C38830b {

        /* renamed from: a */
        public String f98827a;

        /* renamed from: b */
        public String f98828b;

        /* renamed from: c */
        public int f98829c;

        /* renamed from: d */
        public int f98830d;

        /* renamed from: e */
        public String f98831e;

        /* renamed from: f */
        public long f98832f;

        /* renamed from: g */
        public long f98833g;

        /* renamed from: h */
        public int f98834h;

        /* renamed from: i */
        public int f98835i = -1;

        /* renamed from: j */
        public int f98836j;

        /* renamed from: k */
        public String f98837k;

        /* renamed from: l */
        public long f98838l;

        /* renamed from: m */
        public long f98839m;

        /* renamed from: n */
        public Integer f98840n = Integer.valueOf(0);

        /* renamed from: o */
        public Integer f98841o = Integer.valueOf(0);

        /* renamed from: a */
        public final JSONObject mo78804a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ip", C38850c.m86284a(this.f98827a, C38828b.f98796D));
            jSONObject.put("host", C38850c.m86284a(this.f98828b, C38828b.f98795C));
            jSONObject.put("hit_code", this.f98829c);
            jSONObject.put("hit_code_l2", this.f98830d);
            if (this.f98829c == 0) {
                jSONObject.put("cdn_hit_str", this.f98831e);
            }
            jSONObject.put("rsp_time", this.f98832f);
            jSONObject.put("cache_size", this.f98833g);
            jSONObject.put("url_idx", this.f98835i);
            jSONObject.put("status_code", this.f98834h);
            jSONObject.put("dl_duration", this.f98839m);
            jSONObject.put("dl_size", this.f98838l);
            return jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$c */
    public static final class C38831c {
        private C38831c() {
        }

        /* renamed from: a */
        public static int m86260a() {
            return C38828b.f98800r;
        }

        /* renamed from: b */
        public static int m86262b() {
            return C38828b.f98801s;
        }

        /* renamed from: c */
        public static int m86263c() {
            return C38828b.f98802t;
        }

        /* renamed from: d */
        public static int m86264d() {
            return C38828b.f98794B;
        }

        /* renamed from: e */
        public static int m86265e() {
            return C38828b.f98797E;
        }

        public /* synthetic */ C38831c(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m86261a(int i) {
            C38828b.f98797E = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$d */
    public static final class C38832d {

        /* renamed from: a */
        public String f98842a;

        /* renamed from: b */
        public ArrayList<C38830b> f98843b;

        /* renamed from: c */
        public String f98844c;

        /* renamed from: d */
        public boolean f98845d;

        /* renamed from: e */
        public C18911h f98846e = C18911h.NONE;

        /* renamed from: f */
        public int f98847f;

        /* renamed from: g */
        public int f98848g;

        /* renamed from: h */
        public int f98849h;

        /* renamed from: i */
        public float f98850i;

        /* renamed from: j */
        public long f98851j;

        /* renamed from: k */
        public long f98852k;

        /* renamed from: l */
        public int f98853l;

        /* renamed from: m */
        public long f98854m;

        /* renamed from: n */
        public boolean f98855n;

        /* renamed from: o */
        public ArrayList<Integer> f98856o;

        /* renamed from: p */
        public ArrayList<Aweme> f98857p;

        /* renamed from: q */
        public C38865f f98858q;

        /* JADX WARNING: Removed duplicated region for block: B:113:0x027a  */
        /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x0174  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x018e  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x020d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo78805a(org.json.JSONObject r13) {
            /*
                r12 = this;
                java.lang.String r0 = "jsonObject"
                p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
                java.lang.String r0 = "network_lib_type"
                java.lang.String r1 = r12.f98842a
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000e
                goto L_0x0040
            L_0x000e:
                int r4 = r1.hashCode()
                r5 = -1298662846(0xffffffffb297fa42, float:-1.7692518E-8)
                if (r4 == r5) goto L_0x0036
                r5 = -1015101340(0xffffffffc37ec864, float:-254.78278)
                if (r4 == r5) goto L_0x002c
                r5 = 110693149(0x6990b1d, float:5.7568533E-35)
                if (r4 == r5) goto L_0x0022
                goto L_0x0040
            L_0x0022:
                java.lang.String r4 = "ttnet"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0040
                r1 = 1
                goto L_0x0041
            L_0x002c:
                java.lang.String r4 = "okhttp"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0040
                r1 = 2
                goto L_0x0041
            L_0x0036:
                java.lang.String r4 = "engine"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0040
                r1 = 0
                goto L_0x0041
            L_0x0040:
                r1 = -1
            L_0x0041:
                r13.put(r0, r1)
                java.util.ArrayList<com.ss.android.ugc.aweme.player.a.b$b> r0 = r12.f98843b
                if (r0 == 0) goto L_0x00e9
                org.json.JSONArray r0 = new org.json.JSONArray
                r0.<init>()
                org.json.JSONArray r1 = new org.json.JSONArray
                r1.<init>()
                java.util.ArrayList<com.ss.android.ugc.aweme.player.a.b$b> r4 = r12.f98843b
                if (r4 != 0) goto L_0x0059
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0059:
                java.util.Iterator r4 = r4.iterator()
                java.lang.String r5 = "cdnRequestRecords!!.iterator()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                r5 = 0
            L_0x0063:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x008c
                java.lang.Object r6 = r4.next()
                com.ss.android.ugc.aweme.player.a.b$b r6 = (com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38830b) r6
                int r7 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.f98808z
                int r8 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.f98793A
                int r9 = r6.f98834h
                if (r7 <= r9) goto L_0x0078
                goto L_0x0084
            L_0x0078:
                if (r8 <= r9) goto L_0x0084
                int r5 = r6.f98836j
                org.json.JSONObject r6 = r6.mo78804a()
                r0.put(r6)
                goto L_0x0063
            L_0x0084:
                org.json.JSONObject r6 = r6.mo78804a()
                r1.put(r6)
                goto L_0x0063
            L_0x008c:
                java.lang.String r4 = "cdn_request_records"
                r13.put(r4, r0)
                java.lang.String r0 = "cdn_error_records"
                r13.put(r0, r1)
                java.util.ArrayList<com.ss.android.ugc.aweme.player.a.b$b> r0 = r12.f98843b
                if (r0 != 0) goto L_0x009d
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x009d:
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x00ea
                java.util.ArrayList<com.ss.android.ugc.aweme.player.a.b$b> r0 = r12.f98843b
                if (r0 != 0) goto L_0x00aa
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00aa:
                java.util.ArrayList<com.ss.android.ugc.aweme.player.a.b$b> r1 = r12.f98843b
                if (r1 != 0) goto L_0x00b1
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00b1:
                int r1 = r1.size()
                int r1 = r1 - r3
                java.lang.Object r0 = r0.get(r1)
                java.lang.String r1 = "cdnRequestRecords!!.get(…equestRecords!!.size - 1)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.player.a.b$b r0 = (com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38830b) r0
                if (r0 == 0) goto L_0x00ea
                java.lang.Integer r0 = r0.f98841o
                if (r0 != 0) goto L_0x00c8
                goto L_0x00ea
            L_0x00c8:
                int r0 = r0.intValue()
                if (r0 != r3) goto L_0x00ea
                java.lang.String r0 = "is_redirect"
                r13.put(r0, r3)
                java.lang.String r0 = "is_ies_router"
                com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
                java.lang.Class<com.ss.android.ugc.aweme.video.experiment.EnableIesRouteExperiment> r7 = com.p683ss.android.ugc.aweme.video.experiment.EnableIesRouteExperiment.class
                r8 = 1
                java.lang.String r9 = "enable_ies_route"
                r10 = 31744(0x7c00, float:4.4483E-41)
                r11 = 1
                boolean r1 = r6.mo18172a(r7, r8, r9, r10, r11)
                r13.put(r0, r1)
                goto L_0x00ea
            L_0x00e9:
                r5 = 0
            L_0x00ea:
                java.lang.String r0 = "group_id"
                java.lang.String r1 = r12.f98844c
                r13.put(r0, r1)
                java.lang.String r0 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.f98798F
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r1 = r12.f98844c
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 != 0) goto L_0x0103
                com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38831c.m86261a(r2)
                goto L_0x010b
            L_0x0103:
                int r0 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38831c.m86265e()
                int r0 = r0 + r3
                com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38831c.m86261a(r0)
            L_0x010b:
                java.lang.String r0 = "play_index"
                int r1 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38831c.m86265e()
                r13.put(r0, r1)
                java.lang.String r0 = r12.f98844c
                com.p683ss.android.ugc.aweme.player.p2050a.C38828b.f98798F = r0
                java.lang.String r0 = "is_h265"
                boolean r1 = r12.f98845d
                r13.put(r0, r1)
                java.lang.String r0 = "access"
                com.ss.android.common.util.NetworkUtils$h r1 = r12.f98846e
                r13.put(r0, r1)
                java.lang.String r0 = "internet_speed"
                int r1 = r12.f98847f
                r13.put(r0, r1)
                java.lang.String r0 = "video_bitrate"
                int r1 = r12.f98848g
                r13.put(r0, r1)
                java.lang.String r0 = "video_quality"
                int r1 = r12.f98849h
                r13.put(r0, r1)
                java.lang.String r0 = "video_duration"
                float r1 = r12.f98850i
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r13.put(r0, r1)
                java.lang.String r0 = "play_duration"
                long r1 = r12.f98851j
                r13.put(r0, r1)
                java.lang.String r0 = "url_cnt"
                r13.put(r0, r5)
                java.lang.String r0 = "cur_cache_duration"
                long r1 = r12.f98852k
                r13.put(r0, r1)
                java.lang.String r0 = "play_order"
                int r1 = r12.f98853l
                r13.put(r0, r1)
                java.lang.String r0 = "cache_size"
                long r1 = r12.f98852k
                r3 = 1024(0x400, double:5.06E-321)
                long r1 = r1 / r3
                r13.put(r0, r1)
                java.lang.String r0 = "play_bitrate"
                long r1 = r12.f98854m
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 <= 0) goto L_0x0177
                long r1 = r12.f98854m
                goto L_0x017f
            L_0x0177:
                com.ss.android.ugc.aweme.video.h r1 = com.p683ss.android.ugc.aweme.video.C48121w.m104249M()
                long r1 = r1.mo95271H()
            L_0x017f:
                long r1 = r1 / r3
                r13.put(r0, r1)
                java.lang.String r0 = "buffering"
                boolean r1 = r12.f98855n
                r13.put(r0, r1)
                com.ss.android.ugc.aweme.player.sdk.a.e$f r0 = r12.f98858q
                if (r0 == 0) goto L_0x0209
                com.ss.android.ugc.aweme.player.sdk.a.e$f r0 = r12.f98858q
                if (r0 != 0) goto L_0x0195
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0195:
                com.ss.android.ugc.aweme.player.sdk.a.e$d r0 = r0.f98976g
                if (r0 == 0) goto L_0x0209
                java.lang.String r0 = "ffr_free_dur"
                com.ss.android.ugc.aweme.player.sdk.a.e$f r1 = r12.f98858q
                if (r1 != 0) goto L_0x01a2
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01a2:
                com.ss.android.ugc.aweme.player.sdk.a.e$d r1 = r1.f98976g
                long r1 = r1.f98961a
                r13.put(r0, r1)
                java.lang.String r0 = "ffr_stop_dur"
                com.ss.android.ugc.aweme.player.sdk.a.e$f r1 = r12.f98858q
                if (r1 != 0) goto L_0x01b2
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01b2:
                com.ss.android.ugc.aweme.player.sdk.a.e$d r1 = r1.f98976g
                long r1 = r1.f98962b
                r13.put(r0, r1)
                java.lang.String r0 = "ffr_head_dur"
                com.ss.android.ugc.aweme.player.sdk.a.e$f r1 = r12.f98858q
                if (r1 != 0) goto L_0x01c2
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01c2:
                com.ss.android.ugc.aweme.player.sdk.a.e$d r1 = r1.f98976g
                long r1 = r1.f98963c
                r13.put(r0, r1)
                java.lang.String r0 = "ffr_fst_data_dur"
                com.ss.android.ugc.aweme.player.sdk.a.e$f r1 = r12.f98858q
                if (r1 != 0) goto L_0x01d2
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01d2:
                com.ss.android.ugc.aweme.player.sdk.a.e$d r1 = r1.f98976g
                long r1 = r1.f98964d
                r13.put(r0, r1)
                java.lang.String r0 = "ffr_dec_dur"
                com.ss.android.ugc.aweme.player.sdk.a.e$f r1 = r12.f98858q
                if (r1 != 0) goto L_0x01e2
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01e2:
                com.ss.android.ugc.aweme.player.sdk.a.e$d r1 = r1.f98976g
                long r1 = r1.f98965e
                r13.put(r0, r1)
                java.lang.String r0 = "ffr_render_dur"
                com.ss.android.ugc.aweme.player.sdk.a.e$f r1 = r12.f98858q
                if (r1 != 0) goto L_0x01f2
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x01f2:
                com.ss.android.ugc.aweme.player.sdk.a.e$d r1 = r1.f98976g
                long r1 = r1.f98966f
                r13.put(r0, r1)
                java.lang.String r0 = "ffr_play_buf_dur"
                com.ss.android.ugc.aweme.player.sdk.a.e$f r1 = r12.f98858q
                if (r1 != 0) goto L_0x0202
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0202:
                com.ss.android.ugc.aweme.player.sdk.a.e$d r1 = r1.f98976g
                long r1 = r1.f98967g
                r13.put(r0, r1)
            L_0x0209:
                java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r12.f98857p
                if (r0 == 0) goto L_0x0276
                java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r12.f98857p
                if (r0 != 0) goto L_0x0214
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0214:
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x0276
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r12.f98856o = r0
                java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r12.f98857p
                if (r0 != 0) goto L_0x0228
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0228:
                java.util.Iterator r0 = r0.iterator()
            L_0x022c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0276
                java.lang.Object r1 = r0.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
                java.lang.String r2 = "item"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                com.ss.android.ugc.aweme.feed.model.Video r2 = r1.getVideo()
                if (r2 == 0) goto L_0x022c
                com.ss.android.ugc.aweme.feed.model.Video r2 = r1.getVideo()
                if (r2 != 0) goto L_0x024c
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x024c:
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
                if (r2 == 0) goto L_0x022c
                java.util.ArrayList<java.lang.Integer> r2 = r12.f98856o
                if (r2 != 0) goto L_0x0259
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0259:
                com.ss.android.ugc.aweme.video.preload.j r3 = com.p683ss.android.ugc.aweme.video.preload.C48107j.m104193f()
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
                java.lang.String r4 = "item.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r1.getPlayAddr()
                int r1 = r3.mo95346b(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.add(r1)
                goto L_0x022c
            L_0x0276:
                java.util.ArrayList<java.lang.Integer> r0 = r12.f98856o
                if (r0 == 0) goto L_0x02ba
                java.util.ArrayList<java.lang.Integer> r0 = r12.f98856o
                if (r0 != 0) goto L_0x0281
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0281:
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x02ba
                org.json.JSONArray r0 = new org.json.JSONArray
                r0.<init>()
                java.util.ArrayList<java.lang.Integer> r1 = r12.f98856o
                if (r1 != 0) goto L_0x0293
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0293:
                java.util.Iterator r1 = r1.iterator()
                java.lang.String r2 = "followCacheSizes!!.iterator()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            L_0x029c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x02b5
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.String r3 = "e"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                int r2 = r2.intValue()
                r0.put(r2)
                goto L_0x029c
            L_0x02b5:
                java.lang.String r1 = "cache_duration"
                r13.put(r1, r0)
            L_0x02ba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38832d.mo78805a(org.json.JSONObject):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.b$e */
    static final class C38833e<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C38828b f98859a;

        /* renamed from: b */
        final /* synthetic */ C52727e f98860b;

        C38833e(C38828b bVar, C52727e eVar) {
            this.f98859a = bVar;
            this.f98860b = eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:102:0x022b A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0230 A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0237 A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x023c A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x023f A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x02b6 A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:134:0x020c A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0155 A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x015c A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x015f A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x017a A[Catch:{ Throwable -> 0x02d9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0209 A[Catch:{ Throwable -> 0x02d9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r15 = this;
                com.ss.android.ugc.aweme.player.a.b$d r0 = new com.ss.android.ugc.aweme.player.a.b$d     // Catch:{ Throwable -> 0x02d9 }
                r0.<init>()     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r1     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f98809a     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r3 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.lang.Integer r3 = r3.f98810b     // Catch:{ Throwable -> 0x02d9 }
                r4 = 0
                if (r3 == 0) goto L_0x001b
                int r3 = r3.intValue()     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x001c
            L_0x001b:
                r3 = 0
            L_0x001c:
                org.json.JSONObject r1 = r1.getRequestIdAndOrderJsonObject(r2, r3)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r2 = "ServiceManager.get().get…ect(aweme, pageType ?: 0)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r2 = r2.f98813e     // Catch:{ Throwable -> 0x02d9 }
                r0.f98842a = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                float r2 = r2.f98817i     // Catch:{ Throwable -> 0x02d9 }
                r0.f98850i = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                long r2 = r2.f98818j     // Catch:{ Throwable -> 0x02d9 }
                r0.f98851j = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                long r2 = r2.f98819k     // Catch:{ Throwable -> 0x02d9 }
                r0.f98852k = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                int r2 = r2.f98820l     // Catch:{ Throwable -> 0x02d9 }
                r0.f98853l = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                long r2 = r2.f98821m     // Catch:{ Throwable -> 0x02d9 }
                r0.f98854m = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.f98822n     // Catch:{ Throwable -> 0x02d9 }
                r0.f98857p = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f98809a     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56877m(r2)     // Catch:{ Throwable -> 0x02d9 }
                r0.f98844c = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                boolean r2 = r2.f98811c     // Catch:{ Throwable -> 0x02d9 }
                r0.f98845d = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                boolean r2 = r2.f98812d     // Catch:{ Throwable -> 0x02d9 }
                r0.f98855n = r2     // Catch:{ Throwable -> 0x02d9 }
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.common.util.NetworkUtils$h r2 = com.p683ss.android.common.util.NetworkUtils.getNetworkType(r2)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r3 = "NetworkUtils.getNetworkT….getApplicationContext())"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r3 = "<set-?>"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)     // Catch:{ Throwable -> 0x02d9 }
                r0.f98846e = r2     // Catch:{ Throwable -> 0x02d9 }
                int r2 = com.p683ss.android.ugc.p2454f.C48918e.m105714f()     // Catch:{ Throwable -> 0x02d9 }
                r0.f98847f = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.sdk.a.e$f r2 = r2.f98823o     // Catch:{ Throwable -> 0x02d9 }
                r0.f98858q = r2     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.util.List<com.ss.android.ugc.aweme.video.preload.f> r2 = r2.f98814f     // Catch:{ Throwable -> 0x02d9 }
                r3 = 0
                if (r2 == 0) goto L_0x0213
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x02d9 }
                r2.<init>()     // Catch:{ Throwable -> 0x02d9 }
                r0.f98843b = r2     // Catch:{ Throwable -> 0x02d9 }
                r2 = -1
                com.ss.android.ugc.aweme.player.a.b r5 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.util.List<com.ss.android.ugc.aweme.video.af> r5 = r5.f98815g     // Catch:{ Throwable -> 0x02d9 }
                if (r5 == 0) goto L_0x00b3
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.util.List<com.ss.android.ugc.aweme.video.af> r2 = r2.f98815g     // Catch:{ Throwable -> 0x02d9 }
                if (r2 == 0) goto L_0x00a9
                int r2 = r2.size()     // Catch:{ Throwable -> 0x02d9 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x00aa
            L_0x00a9:
                r2 = r3
            L_0x00aa:
                if (r2 != 0) goto L_0x00af
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x02d9 }
            L_0x00af:
                int r2 = r2.intValue()     // Catch:{ Throwable -> 0x02d9 }
            L_0x00b3:
                com.ss.android.ugc.aweme.player.a.b r5 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.util.List<com.ss.android.ugc.aweme.video.preload.f> r5 = r5.f98814f     // Catch:{ Throwable -> 0x02d9 }
                if (r5 != 0) goto L_0x00bc
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x02d9 }
            L_0x00bc:
                java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x02d9 }
                r6 = 0
            L_0x00c1:
                boolean r7 = r5.hasNext()     // Catch:{ Throwable -> 0x02d9 }
                if (r7 == 0) goto L_0x0213
                java.lang.Object r7 = r5.next()     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.video.preload.f r7 = (com.p683ss.android.ugc.aweme.video.preload.C48083f) r7     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b$b r8 = new com.ss.android.ugc.aweme.player.a.b$b     // Catch:{ Throwable -> 0x02d9 }
                r8.<init>()     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r9 = r7.f120839g     // Catch:{ Throwable -> 0x02d9 }
                r8.f98827a = r9     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r9 = r7.f120837e     // Catch:{ Throwable -> 0x02d9 }
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Throwable -> 0x02d9 }
                boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x02d9 }
                if (r9 != 0) goto L_0x00e7
                java.lang.String r9 = r7.f120837e     // Catch:{ Throwable -> 0x02d9 }
                android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x00e8
            L_0x00e7:
                r9 = r3
            L_0x00e8:
                if (r9 == 0) goto L_0x00ef
                java.lang.String r9 = r9.getHost()     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x00f0
            L_0x00ef:
                r9 = r3
            L_0x00f0:
                r8.f98828b = r9     // Catch:{ Throwable -> 0x02d9 }
                long r9 = r7.f120841i     // Catch:{ Throwable -> 0x02d9 }
                r8.f98832f = r9     // Catch:{ Throwable -> 0x02d9 }
                long r9 = r7.f120842j     // Catch:{ Throwable -> 0x02d9 }
                r8.f98833g = r9     // Catch:{ Throwable -> 0x02d9 }
                java.util.Map<java.lang.String, java.lang.String> r9 = r7.f120843k     // Catch:{ Throwable -> 0x02d9 }
                int r9 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.m86240a(r9)     // Catch:{ Throwable -> 0x02d9 }
                r8.f98829c = r9     // Catch:{ Throwable -> 0x02d9 }
                int r9 = r7.f120844l     // Catch:{ Throwable -> 0x02d9 }
                r8.f98834h = r9     // Catch:{ Throwable -> 0x02d9 }
                int r9 = r7.f120845m     // Catch:{ Throwable -> 0x02d9 }
                r8.f98835i = r9     // Catch:{ Throwable -> 0x02d9 }
                int r9 = r7.f120846n     // Catch:{ Throwable -> 0x02d9 }
                r8.f98836j = r9     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r9 = r7.f120837e     // Catch:{ Throwable -> 0x02d9 }
                r10 = 1
                if (r9 == 0) goto L_0x0121
                java.lang.String r11 = "https"
                r12 = 2
                boolean r9 = p2628d.p2650m.C52830p.m112411b(r9, r11, r4, r12, r3)     // Catch:{ Throwable -> 0x02d9 }
                if (r9 != r10) goto L_0x0121
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x0125
            L_0x0121:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x02d9 }
            L_0x0125:
                r8.f98840n = r9     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.player.a.b r9 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.util.List<com.ss.android.ugc.aweme.video.preload.f> r11 = r9.f98814f     // Catch:{ Throwable -> 0x02d9 }
                if (r11 == 0) goto L_0x014a
                java.util.List<com.ss.android.ugc.aweme.video.af> r11 = r9.f98815g     // Catch:{ Throwable -> 0x02d9 }
                if (r11 == 0) goto L_0x014a
                java.util.List<com.ss.android.ugc.aweme.video.af> r11 = r9.f98815g     // Catch:{ Throwable -> 0x02d9 }
                if (r11 != 0) goto L_0x0138
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x02d9 }
            L_0x0138:
                int r11 = r11.size()     // Catch:{ Throwable -> 0x02d9 }
                java.util.List<com.ss.android.ugc.aweme.video.preload.f> r9 = r9.f98814f     // Catch:{ Throwable -> 0x02d9 }
                if (r9 != 0) goto L_0x0143
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x02d9 }
            L_0x0143:
                int r9 = r9.size()     // Catch:{ Throwable -> 0x02d9 }
                if (r11 != r9) goto L_0x014a
                goto L_0x014b
            L_0x014a:
                r10 = 0
            L_0x014b:
                if (r10 == 0) goto L_0x016e
                if (r6 >= r2) goto L_0x016e
                com.ss.android.ugc.aweme.player.a.b r9 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                java.util.List<com.ss.android.ugc.aweme.video.af> r9 = r9.f98815g     // Catch:{ Throwable -> 0x02d9 }
                if (r9 == 0) goto L_0x015c
                java.lang.Object r9 = r9.get(r6)     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.video.af r9 = (com.p683ss.android.ugc.aweme.video.C47985af) r9     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x015d
            L_0x015c:
                r9 = r3
            L_0x015d:
                if (r9 == 0) goto L_0x016e
                r9.mo95147a()     // Catch:{ Throwable -> 0x02d9 }
                long r10 = r9.f120624e     // Catch:{ Throwable -> 0x02d9 }
                long r12 = r7.f120841i     // Catch:{ Throwable -> 0x02d9 }
                r14 = 0
                long r10 = r10 + r12
                r8.f98839m = r10     // Catch:{ Throwable -> 0x02d9 }
                long r9 = r9.f120623d     // Catch:{ Throwable -> 0x02d9 }
                r8.f98838l = r9     // Catch:{ Throwable -> 0x02d9 }
            L_0x016e:
                java.util.Map<java.lang.String, java.lang.String> r9 = r7.f120843k     // Catch:{ Throwable -> 0x02d9 }
                int r9 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.m86241b(r9)     // Catch:{ Throwable -> 0x02d9 }
                r8.f98830d = r9     // Catch:{ Throwable -> 0x02d9 }
                int r9 = r8.f98829c     // Catch:{ Throwable -> 0x02d9 }
                if (r9 != 0) goto L_0x01e5
                java.util.Map<java.lang.String, java.lang.String> r9 = r7.f120843k     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r10 = ""
                if (r9 == 0) goto L_0x01e3
                java.lang.String r11 = com.p683ss.android.ugc.aweme.video.preload.C48083f.C48084a.m104140a()     // Catch:{ Throwable -> 0x02d9 }
                boolean r11 = r9.containsKey(r11)     // Catch:{ Throwable -> 0x02d9 }
                if (r11 == 0) goto L_0x01b2
                java.lang.String r10 = com.p683ss.android.ugc.aweme.video.preload.C48083f.C48084a.m104140a()     // Catch:{ Throwable -> 0x02d9 }
                java.lang.Object r9 = r9.get(r10)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x02d9 }
                if (r9 == 0) goto L_0x01ac
                int r10 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.f98807y     // Catch:{ Throwable -> 0x02d9 }
                if (r9 == 0) goto L_0x01a4
                java.lang.String r9 = r9.substring(r10)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r10 = "(this as java.lang.String).substring(startIndex)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x01ad
            L_0x01a4:
                d.u r0 = new d.u     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)     // Catch:{ Throwable -> 0x02d9 }
                throw r0     // Catch:{ Throwable -> 0x02d9 }
            L_0x01ac:
                r9 = r3
            L_0x01ad:
                java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x01e3
            L_0x01b2:
                java.lang.String r11 = com.p683ss.android.ugc.aweme.video.preload.C48083f.C48084a.m104141b()     // Catch:{ Throwable -> 0x02d9 }
                boolean r11 = r9.containsKey(r11)     // Catch:{ Throwable -> 0x02d9 }
                if (r11 == 0) goto L_0x01e3
                java.lang.String r10 = com.p683ss.android.ugc.aweme.video.preload.C48083f.C48084a.m104141b()     // Catch:{ Throwable -> 0x02d9 }
                java.lang.Object r9 = r9.get(r10)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x02d9 }
                if (r9 == 0) goto L_0x01de
                int r10 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.f98807y     // Catch:{ Throwable -> 0x02d9 }
                if (r9 == 0) goto L_0x01d6
                java.lang.String r9 = r9.substring(r10)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r10 = "(this as java.lang.String).substring(startIndex)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x01df
            L_0x01d6:
                d.u r0 = new d.u     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)     // Catch:{ Throwable -> 0x02d9 }
                throw r0     // Catch:{ Throwable -> 0x02d9 }
            L_0x01de:
                r9 = r3
            L_0x01df:
                java.lang.String r10 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x02d9 }
            L_0x01e3:
                r8.f98831e = r10     // Catch:{ Throwable -> 0x02d9 }
            L_0x01e5:
                java.util.Map<java.lang.String, java.lang.String> r9 = r7.f120843k     // Catch:{ Throwable -> 0x02d9 }
                if (r9 == 0) goto L_0x01fa
                java.lang.String r10 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.f98804v     // Catch:{ Throwable -> 0x02d9 }
                boolean r10 = r9.containsKey(r10)     // Catch:{ Throwable -> 0x02d9 }
                if (r10 == 0) goto L_0x01fa
                java.lang.String r10 = com.p683ss.android.ugc.aweme.player.p2050a.C38828b.f98804v     // Catch:{ Throwable -> 0x02d9 }
                java.lang.Object r9 = r9.get(r10)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x01fb
            L_0x01fa:
                r9 = r3
            L_0x01fb:
                r8.f98837k = r9     // Catch:{ Throwable -> 0x02d9 }
                int r7 = r7.f120848p     // Catch:{ Throwable -> 0x02d9 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x02d9 }
                r8.f98841o = r7     // Catch:{ Throwable -> 0x02d9 }
                java.util.ArrayList<com.ss.android.ugc.aweme.player.a.b$b> r7 = r0.f98843b     // Catch:{ Throwable -> 0x02d9 }
                if (r7 != 0) goto L_0x020c
                p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Throwable -> 0x02d9 }
            L_0x020c:
                r7.add(r8)     // Catch:{ Throwable -> 0x02d9 }
                int r6 = r6 + 1
                goto L_0x00c1
            L_0x0213:
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f98809a     // Catch:{ Throwable -> 0x02d9 }
                if (r2 == 0) goto L_0x0224
                com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ Throwable -> 0x02d9 }
                if (r2 == 0) goto L_0x0224
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x0225
            L_0x0224:
                r2 = r3
            L_0x0225:
                com.ss.android.ugc.playerkit.session.a r5 = com.p683ss.android.ugc.playerkit.session.C50122a.m108112a()     // Catch:{ Throwable -> 0x02d9 }
                if (r2 == 0) goto L_0x0230
                java.lang.String r6 = r2.getUri()     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x0231
            L_0x0230:
                r6 = r3
            L_0x0231:
                com.ss.android.ugc.playerkit.session.Session r5 = r5.mo97901b(r6)     // Catch:{ Throwable -> 0x02d9 }
                if (r2 == 0) goto L_0x023c
                java.util.List r6 = r2.getBitRate()     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x023d
            L_0x023c:
                r6 = r3
            L_0x023d:
                if (r5 == 0) goto L_0x027e
                java.lang.String r7 = r5.sourceId     // Catch:{ Throwable -> 0x02d9 }
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Throwable -> 0x02d9 }
                if (r2 == 0) goto L_0x0249
                java.lang.String r3 = r2.getSourceId()     // Catch:{ Throwable -> 0x02d9 }
            L_0x0249:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x02d9 }
                boolean r2 = android.text.TextUtils.equals(r7, r3)     // Catch:{ Throwable -> 0x02d9 }
                if (r2 == 0) goto L_0x027e
                int r2 = r5.bitrate     // Catch:{ Throwable -> 0x02d9 }
                r0.f98848g = r2     // Catch:{ Throwable -> 0x02d9 }
                if (r6 == 0) goto L_0x027e
                r2 = r6
                java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ Throwable -> 0x02d9 }
                int r2 = r2.size()     // Catch:{ Throwable -> 0x02d9 }
            L_0x025e:
                if (r4 >= r2) goto L_0x027e
                java.lang.Object r3 = r6.get(r4)     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.feed.model.BitRate r3 = (com.p683ss.android.ugc.aweme.feed.model.BitRate) r3     // Catch:{ Throwable -> 0x02d9 }
                int r3 = r3.getBitRate()     // Catch:{ Throwable -> 0x02d9 }
                int r7 = r5.bitrate     // Catch:{ Throwable -> 0x02d9 }
                if (r3 != r7) goto L_0x027b
                java.lang.Object r2 = r6.get(r4)     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.feed.model.BitRate r2 = (com.p683ss.android.ugc.aweme.feed.model.BitRate) r2     // Catch:{ Throwable -> 0x02d9 }
                int r2 = r2.getQualityType()     // Catch:{ Throwable -> 0x02d9 }
                r0.f98849h = r2     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x027e
            L_0x027b:
                int r4 = r4 + 1
                goto L_0x025e
            L_0x027e:
                java.lang.String r2 = "pt_predictL"
                d.f.b.v$e r3 = r15.f98860b     // Catch:{ Throwable -> 0x02d9 }
                T r3 = r3.element     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x02d9 }
                r1.put(r2, r3)     // Catch:{ Throwable -> 0x02d9 }
                r0.mo78805a(r1)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r0 = "event_error_code"
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                int r2 = r2.f98816h     // Catch:{ Throwable -> 0x02d9 }
                r1.put(r0, r2)     // Catch:{ Throwable -> 0x02d9 }
                com.ss.android.ugc.aweme.video.g r0 = com.p683ss.android.ugc.aweme.video.C48121w.m104250N()     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r2 = "codec_name"
                java.lang.String r3 = "playerInfoProvider"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)     // Catch:{ Throwable -> 0x02d9 }
                int r3 = r0.mo95245c()     // Catch:{ Throwable -> 0x02d9 }
                r1.put(r2, r3)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r2 = "codec_id"
                int r0 = r0.mo95246d()     // Catch:{ Throwable -> 0x02d9 }
                r1.put(r2, r0)     // Catch:{ Throwable -> 0x02d9 }
                boolean r0 = com.p683ss.android.ugc.aweme.setting.C41631k.m91508c()     // Catch:{ Throwable -> 0x02d9 }
                if (r0 == 0) goto L_0x02c1
                java.lang.String r0 = "traffic_economy_mode"
                com.ss.android.ugc.aweme.setting.k r2 = com.p683ss.android.ugc.aweme.setting.C41631k.f105364a     // Catch:{ Throwable -> 0x02d9 }
                int r2 = r2.mo85387d()     // Catch:{ Throwable -> 0x02d9 }
                r1.put(r0, r2)     // Catch:{ Throwable -> 0x02d9 }
            L_0x02c1:
                java.lang.String r0 = "is_success"
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                int r2 = r2.f98824p     // Catch:{ Throwable -> 0x02d9 }
                r1.put(r0, r2)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r0 = "wait_duration"
                com.ss.android.ugc.aweme.player.a.b r2 = r15.f98859a     // Catch:{ Throwable -> 0x02d9 }
                long r2 = r2.f98825q     // Catch:{ Throwable -> 0x02d9 }
                r1.put(r0, r2)     // Catch:{ Throwable -> 0x02d9 }
                java.lang.String r0 = "video_play_end"
                com.p683ss.android.ugc.aweme.common.C26890h.m65012a(r0, r1)     // Catch:{ Throwable -> 0x02d9 }
                goto L_0x02df
            L_0x02d9:
                r0 = move-exception
                java.lang.String r1 = "VideoStopPlayEvent report fail."
                com.bytedance.p502b.p503a.p506b.p508b.C9220a.m18312a(r0, r1)
            L_0x02df:
                d.x r0 = p2628d.C52860x.f131107a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.player.p2050a.C38828b.C38833e.call():java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo78787a() {
        C37120o a = C37120o.m83349a();
        C52711k.m112236a((Object) a, "SmartPreloadV2Judge.instance()");
        a.mo76394d();
        C52727e eVar = new C52727e();
        C37120o a2 = C37120o.m83349a();
        C52711k.m112236a((Object) a2, "SmartPreloadV2Judge.instance()");
        eVar.element = a2.mo76393c();
        C0013i.m18a((Callable<TResult>) new C38833e<TResult>(this, eVar), (Executor) C26890h.m65003a());
    }

    /* renamed from: b */
    public static int m86241b(Map<String, String> map) {
        if (map == null || !map.containsKey(f98803u)) {
            return 0;
        }
        return C38834c.m86267a((String) map.get(f98803u));
    }

    /* renamed from: a */
    public static int m86240a(Map<String, String> map) {
        if (map != null) {
            if (map.containsKey(C48084a.m104140a())) {
                return C38834c.m86267a((String) map.get(C48084a.m104140a()));
            }
            if (map.containsKey(C48084a.m104141b())) {
                return C38834c.m86267a((String) map.get(C48084a.m104141b()));
            }
        }
        return 0;
    }
}
