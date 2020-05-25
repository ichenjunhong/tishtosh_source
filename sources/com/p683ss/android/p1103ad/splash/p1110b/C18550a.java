package com.p683ss.android.p1103ad.splash.p1110b;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.p582g.p583a.p592d.C10009j.C10018a;
import com.bytedance.p582g.p583a.p592d.C10020k;
import com.p683ss.android.p1103ad.splash.core.C18626e;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.C18655l;
import com.p683ss.android.p1103ad.splash.core.p1116e.C18627a;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.b.a */
public class C18550a {

    /* renamed from: a */
    public static volatile boolean f51124a = true;

    /* renamed from: d */
    private static volatile C18550a f51125d;

    /* renamed from: b */
    public volatile boolean f51126b;

    /* renamed from: c */
    public volatile int f51127c;

    /* renamed from: e */
    private volatile boolean f51128e;

    private C18550a() {
    }

    /* renamed from: c */
    private boolean m44903c() {
        if (!this.f51128e || !f51124a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C18550a m44899a() {
        if (f51125d == null) {
            synchronized (C18550a.class) {
                if (f51125d == null) {
                    f51125d = new C18550a();
                }
            }
        }
        return f51125d;
    }

    /* renamed from: b */
    public static JSONObject m44902b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C18642g.m45227e() == null) {
                return jSONObject;
            }
            String b = C18642g.m45227e().mo38026b();
            jSONObject.put("device_id", C18642g.m45191S());
            jSONObject.put("app_version", "1.9.22-rc.2");
            jSONObject.put("channel", b);
            jSONObject.put("update_version_code", C18642g.m45189Q());
            jSONObject.put("package_name", C18642g.m45184L().getPackageName());
            return jSONObject;
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private static boolean m44904d() {
        boolean z;
        C18626e e = C18642g.m45227e();
        if (e == null) {
            return false;
        }
        String b = e.mo38026b();
        String S = C18642g.m45191S();
        String a = e.mo38025a();
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(S) || TextUtils.isEmpty(a)) {
            z = false;
        } else {
            z = true;
        }
        if (C18642g.m45184L().getApplicationContext() == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("is_ad_event", "1");
            } catch (JSONException unused) {
            }
            C18642g.m45201a(84378473382L, "splash_ad", "context_npe", jSONObject);
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private synchronized void m44900a(final C18655l lVar) {
        if (m44903c()) {
            if (C18642g.m45227e() != null) {
                if (C18642g.m45175C() != null) {
                    if (!m44904d()) {
                        this.f51126b = false;
                        m44901a(lVar, false);
                        return;
                    }
                    boolean z = true;
                    if (this.f51126b) {
                        m44901a(lVar, true);
                        return;
                    }
                    if (this.f51127c > 5) {
                        z = false;
                    }
                    if (!z) {
                        m44901a(lVar, false);
                        return;
                    }
                    C18627a a = C18627a.m45126a();
                    C185511 r1 = new Runnable() {
                        public final void run() {
                            boolean z;
                            try {
                                if (!C18550a.this.f51126b) {
                                    String P = C18642g.m45188P();
                                    ArrayList arrayList = new ArrayList(2);
                                    ArrayList arrayList2 = new ArrayList(4);
                                    C18626e e = C18642g.m45227e();
                                    if (e == null) {
                                        z = false;
                                    } else {
                                        z = C18744j.f51828a.contains(e.mo38025a());
                                    }
                                    if (z) {
                                        arrayList.add("https://mon.isnssdk.com/monitor/appmonitor/v2/settings");
                                        arrayList.add("https://i.isnssdk.com/monitor/appmonitor/v2/settings");
                                        arrayList2.add("https://mon.isnssdk.com/monitor/collect/");
                                        arrayList2.add("https://i.isnssdk.com/monitor/collect/");
                                    } else {
                                        arrayList.add("https://mon.snssdk.com/monitor/appmonitor/v2/settings");
                                        arrayList.add("https://monsetting.toutiao.com/monitor/appmonitor/v2/settings");
                                        arrayList2.add("https://mon.snssdk.com/monitor/collect/");
                                        arrayList2.add("https://mon.toutiao.com/monitor/collect/");
                                        arrayList2.add("https://mon.toutiaocloud.com/monitor/collect/");
                                        arrayList2.add("https://mon.toutiaocloud.net/monitor/collect/");
                                    }
                                    C10020k.m20168a(P, arrayList);
                                    C10020k.m20169b(P, arrayList2);
                                    C10020k.m20167a(C18642g.m45184L().getApplicationContext(), P, C18550a.m44902b(), new C10018a() {
                                        /* renamed from: a */
                                        public final String mo7396a() {
                                            return null;
                                        }
                                    });
                                }
                                C18550a.this.f51126b = true;
                                C18550a.this.f51127c = 0;
                                C18550a.m44901a(lVar, true);
                            } catch (Throwable th) {
                                if ((th instanceof ClassNotFoundException) || (th instanceof NoClassDefFoundError)) {
                                    C18550a.f51124a = false;
                                }
                                C18550a.this.f51126b = false;
                                C18550a.m44901a(lVar, false);
                                C18550a.this.f51127c++;
                                th.getMessage();
                            }
                        }
                    };
                    if (a.f51439a == null) {
                        a.f51439a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(2).mo49847a());
                    }
                    a.f51439a.submit(r1);
                    return;
                }
            }
            m44901a(lVar, false);
        }
    }

    /* renamed from: a */
    public static void m44901a(C18655l lVar, boolean z) {
        if (lVar != null) {
            if (z) {
                lVar.mo37849a(1, "");
            } else {
                lVar.mo37850b(0, "");
            }
        }
    }

    /* renamed from: a */
    public final void mo37842a(Exception exc, String str) {
        if (m44903c()) {
            try {
                String message = exc.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str, message);
                    mo37845a("service_ad_exception", (JSONObject) null, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo37843a(final String str, int i, final JSONObject jSONObject) {
        if (m44903c()) {
            if (!this.f51126b) {
                m44900a(new C18655l() {
                    /* renamed from: b */
                    public final void mo37850b(int i, Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo37849a(int i, Object obj) {
                        C10020k.m20166a(C18642g.m45188P()).mo17977a(str, 1, jSONObject);
                    }
                });
            } else {
                C10020k.m20166a(C18642g.m45188P()).mo17977a(str, i, jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo37845a(final String str, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (m44903c()) {
            if (!this.f51126b) {
                m44900a(new C18655l() {
                    /* renamed from: b */
                    public final void mo37850b(int i, Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo37849a(int i, Object obj) {
                        C10020k.m20166a(C18642g.m45188P()).mo17982a(str, jSONObject, jSONObject2);
                    }
                });
            } else {
                C10020k.m20166a(C18642g.m45188P()).mo17982a(str, jSONObject, jSONObject2);
            }
        }
    }

    /* renamed from: b */
    public final void mo37846b(final String str, int i, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (m44903c()) {
            if (!this.f51126b) {
                m44900a(new C18655l() {
                    /* renamed from: b */
                    public final void mo37850b(int i, Object obj) {
                    }

                    /* renamed from: a */
                    public final void mo37849a(int i, Object obj) {
                        C10020k.m20166a(C18642g.m45188P()).mo17978a(str, 1, jSONObject, jSONObject2);
                    }
                });
            } else {
                C10020k.m20166a(C18642g.m45188P()).mo17978a(str, i, jSONObject, jSONObject2);
            }
        }
    }

    /* renamed from: a */
    public final void mo37844a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (m44903c()) {
            Handler handler = new Handler(Looper.getMainLooper());
            final String str2 = str;
            final JSONObject jSONObject3 = jSONObject;
            C185532 r0 = new Runnable(0, null) {
                public final void run() {
                    C18550a.this.mo37846b(str2, 0, jSONObject3, null);
                }
            };
            handler.postDelayed(r0, 5000);
        }
    }
}
