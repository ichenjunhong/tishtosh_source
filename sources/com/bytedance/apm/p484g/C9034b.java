package com.bytedance.apm.p484g;

import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.net.C9146a;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p497o.C9149b.C9153b;
import com.bytedance.apm.p501q.C9202r;
import com.bytedance.p582g.p583a.p584a.C9946b;
import com.bytedance.p582g.p583a.p584a.C9946b.C9947a;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.g.b */
public final class C9034b implements C9153b {

    /* renamed from: a */
    public static String f24643a = "https://i.isnssdk.com/monitor/collect/c/exception";

    /* renamed from: d */
    public static final Object f24644d = new Object();

    /* renamed from: i */
    private static volatile C9034b f24645i;

    /* renamed from: j */
    private static volatile C9036a f24646j;

    /* renamed from: b */
    public volatile int f24647b;

    /* renamed from: c */
    public volatile JSONObject f24648c;

    /* renamed from: e */
    public final LinkedList<C9038d> f24649e = new LinkedList<>();

    /* renamed from: f */
    private volatile long f24650f;

    /* renamed from: g */
    private volatile boolean f24651g;

    /* renamed from: h */
    private volatile long f24652h;

    /* renamed from: k */
    private volatile C9032a f24653k;

    /* renamed from: com.bytedance.apm.g.b$a */
    public interface C9036a {
    }

    private C9034b() {
        C9149b.m18170a().mo16523a((C9153b) this);
        this.f24653k = new C9032a();
    }

    /* renamed from: a */
    public static C9034b m17915a() {
        if (f24645i == null) {
            synchronized (f24644d) {
                if (f24645i == null) {
                    f24645i = new C9034b();
                }
            }
        }
        return f24645i;
    }

    /* renamed from: b */
    public static boolean m17917b() {
        if (!ApmDelegate.m17947a().f24748h || ApmDelegate.m17947a().mo16431a("exception_filter_network")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m17918c() {
        this.f24650f = System.currentTimeMillis();
        ApmDelegate.m17947a().mo16430a((Runnable) new Runnable() {
            public final void run() {
                try {
                    LinkedList linkedList = new LinkedList();
                    synchronized (C9034b.f24644d) {
                        linkedList.addAll(C9034b.this.f24649e);
                        C9034b.this.f24649e.clear();
                        C9034b.this.f24647b = 0;
                    }
                    if (!linkedList.isEmpty()) {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        while (!linkedList.isEmpty()) {
                            C9038d dVar = (C9038d) linkedList.poll();
                            if (dVar != null) {
                                jSONArray.put(new JSONObject(dVar.f24656b));
                            }
                        }
                        jSONObject.put("data", jSONArray);
                        if (C9034b.this.f24648c == null) {
                            C9034b.this.f24648c = C8976c.m17753i();
                        }
                        jSONObject.put("header", C9034b.this.f24648c);
                        C9034b.this.mo16367a(C9034b.f24643a, jSONObject.toString());
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public static void m17916a(String str) {
        f24643a = str;
    }

    /* renamed from: a */
    public final void mo16358a(long j) {
        try {
            if (this.f24653k != null) {
                this.f24653k.mo16364a();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - this.f24650f > 1200000 && this.f24647b > 0) || this.f24647b > 20) {
                m17918c();
            }
            if (this.f24651g && currentTimeMillis - this.f24652h > 1800000) {
                this.f24651g = false;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo16367a(String str, String str2) {
        try {
            if (ApmDelegate.m17947a().f24748h) {
                C9946b.m19988a(1048576, C9202r.m18286a(str, C8976c.m17752h()), str2.getBytes(), C9947a.GZIP, "application/json; charset=utf-8", true);
            }
        } catch (Throwable th) {
            int i = -1;
            if (th instanceof C9146a) {
                i = ((C9146a) th).getStatusCode();
            }
            if (i >= 500 && i <= 600) {
                this.f24652h = System.currentTimeMillis();
                this.f24651g = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo16368a(String str, String str2, String str3, boolean z) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    boolean z2 = false;
                    if (z) {
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("log_type", "log_exception");
                        if (str3 != null) {
                            if (str3.length() > 10240) {
                                jSONObject.put("extraMessage", str3.substring(0, VideoPreloadSizeExperiment.DEFAULT));
                            } else {
                                jSONObject.put("extraMessage", str3);
                            }
                        }
                        C9036a aVar = f24646j;
                    }
                    if (!ApmDelegate.m17947a().f24748h) {
                        if (this.f24653k != null) {
                            this.f24653k.mo16365a(str, str2);
                        }
                        return;
                    }
                    boolean a = ApmDelegate.m17947a().mo16431a(str);
                    boolean b = ApmDelegate.m17947a().mo16433b(str3);
                    if ((a || b) && !this.f24651g) {
                        synchronized (f24644d) {
                            int size = this.f24649e.size();
                            if (size >= 20) {
                                z2 = true;
                            }
                            this.f24649e.add(new C9038d(str, str2));
                            this.f24647b = size + 1;
                        }
                        if (z2) {
                            m17918c();
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
