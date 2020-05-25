package com.p683ss.android.p1103ad.splash.core;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.C18549b;
import com.p683ss.android.p1103ad.splash.C18558c;
import com.p683ss.android.p1103ad.splash.C18721d;
import com.p683ss.android.p1103ad.splash.C18727e;
import com.p683ss.android.p1103ad.splash.C18757i;
import com.p683ss.android.p1103ad.splash.C18768o;
import com.p683ss.android.p1103ad.splash.C18771r;
import com.p683ss.android.p1103ad.splash.C18772s;
import com.p683ss.android.p1103ad.splash.C18776v;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18629a;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18629a.C18630a;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18631b;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18633d;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18639g;
import com.p683ss.android.p1103ad.splash.p1109a.C18547a;
import com.p683ss.android.p1103ad.splash.p1109a.C18547a.C18548a;
import com.p683ss.android.p1103ad.splash.p1111c.C18561c;
import com.p683ss.android.p1103ad.splash.p1120d.C18726d;
import com.p683ss.android.p1103ad.splash.p1123g.C18741g;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import com.p683ss.android.p1103ad.splash.p1123g.C18751o;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.g */
public class C18642g {

    /* renamed from: A */
    static int f51463A = 0;

    /* renamed from: B */
    static boolean f51464B = false;

    /* renamed from: C */
    static boolean f51465C = false;

    /* renamed from: D */
    static volatile Future f51466D = null;

    /* renamed from: E */
    static int f51467E = -1;

    /* renamed from: F */
    static boolean f51468F = false;

    /* renamed from: G */
    static boolean f51469G = false;

    /* renamed from: H */
    static long f51470H = 2000;

    /* renamed from: I */
    static long f51471I = 2000;

    /* renamed from: J */
    static boolean f51472J = false;

    /* renamed from: K */
    static boolean f51473K = false;

    /* renamed from: L */
    static boolean f51474L = false;

    /* renamed from: M */
    static C18629a f51475M = null;

    /* renamed from: N */
    static C18558c f51476N = null;

    /* renamed from: O */
    static C18549b f51477O = null;

    /* renamed from: P */
    static C18721d f51478P = null;

    /* renamed from: Q */
    private static final String f51479Q = "19222";

    /* renamed from: R */
    private static ExecutorService f51480R;

    /* renamed from: S */
    private static ExecutorService f51481S;

    /* renamed from: T */
    private static ExecutorService f51482T;

    /* renamed from: U */
    private static HashMap<String, String> f51483U;

    /* renamed from: V */
    private static Context f51484V;

    /* renamed from: W */
    private static Handler f51485W = new Handler(Looper.getMainLooper());

    /* renamed from: X */
    private static int f51486X;

    /* renamed from: Y */
    private static int f51487Y;

    /* renamed from: Z */
    private static volatile boolean f51488Z = false;

    /* renamed from: a */
    public static C18757i f51489a;

    /* renamed from: aa */
    private static volatile boolean f51490aa = false;

    /* renamed from: ab */
    private static volatile String f51491ab;

    /* renamed from: ac */
    private static int f51492ac = 0;

    /* renamed from: ad */
    private static boolean f51493ad = false;

    /* renamed from: ae */
    private static volatile C18726d f51494ae;

    /* renamed from: af */
    private static int f51495af;

    /* renamed from: ag */
    private static boolean f51496ag = true;

    /* renamed from: ah */
    private static boolean f51497ah = false;

    /* renamed from: ai */
    private static C18561c f51498ai;

    /* renamed from: aj */
    private static boolean f51499aj = true;

    /* renamed from: ak */
    private static boolean f51500ak = false;

    /* renamed from: al */
    private static boolean f51501al = true;

    /* renamed from: am */
    private static boolean f51502am = false;

    /* renamed from: an */
    private static C18727e f51503an;

    /* renamed from: ao */
    private static boolean f51504ao = false;

    /* renamed from: ap */
    private static int f51505ap = 0;

    /* renamed from: b */
    static volatile C18776v f51506b;

    /* renamed from: c */
    static C18771r f51507c;

    /* renamed from: d */
    static C18772s f51508d;

    /* renamed from: e */
    static ExecutorService f51509e;

    /* renamed from: f */
    static long f51510f;

    /* renamed from: g */
    static boolean f51511g;

    /* renamed from: h */
    static ConcurrentHashMap<Long, Integer> f51512h;

    /* renamed from: i */
    static volatile boolean f51513i;

    /* renamed from: j */
    static long f51514j;

    /* renamed from: k */
    static C18626e f51515k;

    /* renamed from: l */
    static boolean f51516l;

    /* renamed from: m */
    static C18631b f51517m;

    /* renamed from: n */
    static int f51518n;

    /* renamed from: o */
    static int f51519o;

    /* renamed from: p */
    static boolean f51520p = true;

    /* renamed from: q */
    static int f51521q;

    /* renamed from: r */
    static int f51522r;

    /* renamed from: s */
    static int f51523s;

    /* renamed from: t */
    static int f51524t;

    /* renamed from: u */
    static boolean f51525u = true;

    /* renamed from: v */
    static volatile String f51526v;

    /* renamed from: w */
    static volatile long f51527w = 864000000;

    /* renamed from: x */
    static volatile boolean f51528x = true;

    /* renamed from: y */
    static C18768o f51529y;

    /* renamed from: z */
    static int f51530z = 0;

    /* renamed from: A */
    public static long m45173A() {
        return f51510f;
    }

    /* renamed from: B */
    public static boolean m45174B() {
        return f51511g;
    }

    /* renamed from: C */
    public static ExecutorService m45175C() {
        return f51481S;
    }

    /* renamed from: D */
    public static ExecutorService m45176D() {
        return f51482T;
    }

    /* renamed from: F */
    public static String m45178F() {
        return f51491ab;
    }

    /* renamed from: G */
    public static long m45179G() {
        return f51527w;
    }

    /* renamed from: J */
    public static C18561c m45182J() {
        return f51498ai;
    }

    /* renamed from: K */
    public static HashMap<String, String> m45183K() {
        return f51483U;
    }

    /* renamed from: L */
    public static Context m45184L() {
        return f51484V;
    }

    /* renamed from: M */
    public static int m45185M() {
        return f51492ac;
    }

    /* renamed from: N */
    public static boolean m45186N() {
        return f51493ad;
    }

    /* renamed from: O */
    public static C18726d m45187O() {
        return f51494ae;
    }

    /* renamed from: P */
    public static String m45188P() {
        return "1385";
    }

    /* renamed from: Q */
    public static String m45189Q() {
        return f51479Q;
    }

    /* renamed from: R */
    public static int m45190R() {
        return f51463A;
    }

    /* renamed from: T */
    public static int m45192T() {
        return f51495af;
    }

    /* renamed from: U */
    public static boolean m45193U() {
        return f51496ag;
    }

    /* renamed from: V */
    public static int m45194V() {
        return f51467E;
    }

    /* renamed from: W */
    public static boolean m45195W() {
        return f51499aj;
    }

    /* renamed from: X */
    public static boolean m45196X() {
        return f51468F;
    }

    /* renamed from: Y */
    public static boolean m45197Y() {
        return f51465C;
    }

    /* renamed from: Z */
    public static long m45198Z() {
        return f51470H;
    }

    /* renamed from: aa */
    public static long m45211aa() {
        return f51471I;
    }

    /* renamed from: ab */
    public static boolean m45212ab() {
        return f51500ak;
    }

    /* renamed from: ac */
    public static boolean m45213ac() {
        return f51501al;
    }

    /* renamed from: ad */
    public static boolean m45214ad() {
        return f51502am;
    }

    /* renamed from: ae */
    public static C18727e m45215ae() {
        return f51503an;
    }

    /* renamed from: af */
    public static boolean m45216af() {
        return f51474L;
    }

    /* renamed from: ag */
    public static C18721d m45217ag() {
        return f51478P;
    }

    /* renamed from: ah */
    public static int m45218ah() {
        return f51505ap;
    }

    /* renamed from: c */
    public static long m45222c() {
        return f51514j;
    }

    /* renamed from: d */
    public static boolean m45226d() {
        return f51516l;
    }

    /* renamed from: f */
    public static C18558c m45229f() {
        return f51476N;
    }

    /* renamed from: h */
    public static int m45233h() {
        return f51487Y;
    }

    /* renamed from: j */
    public static void m45237j() {
        f51490aa = true;
    }

    /* renamed from: k */
    public static int m45238k() {
        return f51522r;
    }

    /* renamed from: l */
    public static int m45239l() {
        return f51519o;
    }

    /* renamed from: m */
    public static int m45240m() {
        return f51486X;
    }

    /* renamed from: n */
    public static int m45241n() {
        return f51521q;
    }

    /* renamed from: o */
    public static int m45242o() {
        return f51524t;
    }

    /* renamed from: p */
    public static int m45243p() {
        return f51518n;
    }

    /* renamed from: q */
    public static int m45244q() {
        return f51523s;
    }

    /* renamed from: r */
    public static boolean m45245r() {
        return f51488Z;
    }

    /* renamed from: s */
    public static void m45246s() {
        f51488Z = true;
    }

    /* renamed from: t */
    public static ExecutorService m45247t() {
        return f51480R;
    }

    /* renamed from: u */
    public static ExecutorService m45248u() {
        return f51509e;
    }

    /* renamed from: v */
    public static boolean m45249v() {
        return f51504ao;
    }

    /* renamed from: w */
    public static C18776v m45250w() {
        return f51506b;
    }

    /* renamed from: x */
    public static C18771r m45251x() {
        return f51507c;
    }

    /* renamed from: y */
    public static C18772s m45252y() {
        return f51508d;
    }

    /* renamed from: z */
    public static C18757i m45253z() {
        return f51489a;
    }

    /* renamed from: a */
    public static void m45209a(boolean z) {
        f51473K = z;
    }

    /* renamed from: a */
    public static boolean m45210a() {
        return f51513i;
    }

    /* renamed from: i */
    public static boolean m45236i() {
        return f51490aa;
    }

    /* renamed from: I */
    public static C18629a m45181I() {
        if (f51475M == null) {
            f51475M = new C18630a();
        }
        return f51475M;
    }

    /* renamed from: b */
    public static boolean m45221b() {
        return f51525u;
    }

    /* renamed from: e */
    public static C18626e m45227e() {
        if (f51515k == null) {
            f51515k = new C18626e();
        }
        return f51515k;
    }

    /* renamed from: g */
    public static C18549b m45231g() {
        if (f51477O == null) {
            f51477O = new C18549b() {
            };
        }
        return f51477O;
    }

    /* renamed from: E */
    public static String m45177E() {
        try {
            if (C18747l.m45742a(f51526v)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getPath());
                sb.append("/Android/data/");
                sb.append(m45184L().getPackageName());
                sb.append("/splashCache/");
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return f51526v;
    }

    /* renamed from: H */
    public static C18631b m45180H() {
        if (f51517m == null) {
            synchronized (C18642g.class) {
                if (f51517m == null) {
                    f51517m = new C18633d(f51484V, new C18639g(f51484V));
                }
            }
        }
        return f51517m;
    }

    /* renamed from: S */
    public static String m45191S() {
        String str = "";
        if (f51515k != null) {
            str = f51515k.mo38027c();
        }
        if (TextUtils.isEmpty(str)) {
            return C18673u.m45399a().f51608b.getString("splash_ad_did", "");
        }
        return str;
    }

    /* renamed from: a */
    public static void m45203a(C18561c cVar) {
        f51498ai = cVar;
    }

    /* renamed from: b */
    public static void m45219b(ExecutorService executorService) {
        f51481S = executorService;
    }

    /* renamed from: e */
    public static void m45228e(boolean z) {
        f51499aj = z;
    }

    /* renamed from: g */
    public static void m45232g(boolean z) {
        f51501al = z;
    }

    /* renamed from: i */
    public static void m45235i(boolean z) {
        f51502am = z;
    }

    /* renamed from: a */
    public static void m45199a(int i) {
        f51505ap = i | f51505ap;
    }

    /* renamed from: b */
    public static void m45220b(boolean z) {
        f51504ao = z;
    }

    /* renamed from: c */
    public static void m45223c(ExecutorService executorService) {
        f51482T = executorService;
    }

    /* renamed from: f */
    public static void m45230f(boolean z) {
        f51500ak = z;
    }

    /* renamed from: h */
    public static void m45234h(boolean z) {
        f51472J = z;
    }

    /* renamed from: a */
    public static void m45200a(long j) {
        f51512h.remove(Long.valueOf(j));
    }

    /* renamed from: c */
    public static void m45224c(boolean z) {
        f51493ad = z;
    }

    /* renamed from: d */
    public static void m45225d(boolean z) {
        new StringBuilder("UDPClient. setIsFirstTimeRequestAd: ").append(false);
        f51496ag = false;
    }

    /* renamed from: a */
    public static void m45202a(Context context) {
        f51484V = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m45205a(C18726d dVar) {
        f51494ae = dVar;
    }

    /* renamed from: a */
    public static void m45206a(C18727e eVar) {
        if (f51515k == null) {
            f51515k = new C18626e();
        }
        f51503an = eVar;
    }

    /* renamed from: a */
    public static void m45207a(HashMap<String, String> hashMap) {
        f51483U = hashMap;
    }

    /* renamed from: a */
    public static void m45208a(ExecutorService executorService) {
        f51480R = executorService;
    }

    /* renamed from: a */
    public static void m45201a(long j, String str, String str2, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            long optLong = jSONObject.optLong("ad_fetch_time", 0);
            if (optLong != 0) {
                try {
                    optJSONObject.putOpt("ad_fetch_time", Long.valueOf(optLong));
                } catch (JSONException unused) {
                    C18741g.m45694a("error in transferring ad fetch time");
                }
            }
            optJSONObject.putOpt("current_time", C18751o.m45748a(System.currentTimeMillis()));
            jSONObject.putOpt("ad_extra_data", optJSONObject);
        }
        if (f51497ah) {
            final C18547a a = new C18548a().mo37834a(jSONObject).mo37832a(j).mo37837c(str2).mo37836b(str).mo37833a("umeng").mo37835a();
            f51485W.post(new Runnable() {
                public final void run() {
                    if (C18642g.f51489a != null) {
                        C18642g.f51489a.mo38359a(a);
                    }
                }
            });
            return;
        }
        Handler handler = f51485W;
        final String str3 = str;
        final String str4 = str2;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        C186475 r1 = new Runnable() {
            public final void run() {
                if (C18642g.f51489a != null) {
                    C18642g.f51489a.mo38360a(str3, str4, j2, 0, jSONObject2);
                }
            }
        };
        handler.post(r1);
    }

    /* renamed from: a */
    public static void m45204a(C18602b bVar, String str, String str2, Map<String, Object> map) {
        if (bVar != null) {
            final long p = bVar.mo37863p();
            String r = bVar.mo37864r();
            long f = bVar.mo37862f();
            final JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.putOpt("log_extra", r);
                jSONObject.putOpt("ad_fetch_time", Long.valueOf(f));
                JSONObject jSONObject2 = new JSONObject();
                if (!map.isEmpty()) {
                    for (Entry entry : map.entrySet()) {
                        if (entry != null) {
                            jSONObject2.putOpt((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
                jSONObject2.putOpt("current_time", C18751o.m45748a(System.currentTimeMillis()));
                jSONObject.putOpt("ad_extra_data", jSONObject2);
            } catch (Exception unused) {
                C18741g.m45694a("error int putting ad_extra_data");
            }
            if (f51497ah) {
                C18548a a = new C18548a().mo37836b(str).mo37833a("umeng");
                a.f51121e = r;
                final C18547a a2 = a.mo37837c(str2).mo37832a(p).mo37834a(jSONObject).mo37835a();
                f51485W.post(new Runnable() {
                    public final void run() {
                        if (C18642g.f51489a != null) {
                            C18642g.f51489a.mo38359a(a2);
                        }
                    }
                });
                return;
            }
            Handler handler = f51485W;
            final String str3 = str;
            final String str4 = str2;
            C186453 r0 = new Runnable() {
                public final void run() {
                    if (C18642g.f51489a != null) {
                        C18642g.f51489a.mo38360a(str3, str4, p, 0, jSONObject);
                    }
                }
            };
            handler.post(r0);
        }
    }
}
