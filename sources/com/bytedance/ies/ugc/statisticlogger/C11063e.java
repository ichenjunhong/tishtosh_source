package com.bytedance.ies.ugc.statisticlogger;

import com.p683ss.android.common.applog.AppLog.ILogSessionHook;
import org.json.JSONObject;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p094l.C2189f;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.e */
public final class C11063e {

    /* renamed from: a */
    public static final C2189f<C11053c> f29694a;

    /* renamed from: b */
    static volatile String f29695b;

    /* renamed from: c */
    static volatile long f29696c;

    /* renamed from: d */
    public static final C11064a f29697d = new C11064a();

    /* renamed from: e */
    public static final C11063e f29698e = new C11063e();

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.e$a */
    public static final class C11064a implements ILogSessionHook {
        C11064a() {
        }

        public final void onLogSessionStart(long j) {
            C2189f a = C11063e.f29694a;
            C11053c cVar = new C11053c(C11062d.Start, j, null, null, 12, null);
            a.onNext(cVar);
            C11063e eVar = C11063e.f29698e;
            C11063e.f29696c = j;
        }

        public final void onLogSessionBatchEvent(long j, String str, JSONObject jSONObject) {
            C11063e eVar = C11063e.f29698e;
            C11063e.f29695b = str;
            C2189f a = C11063e.f29694a;
            C11053c cVar = new C11053c(C11062d.LogSessionBatch, j, str, jSONObject);
            a.onNext(cVar);
        }

        public final void onLogSessionTerminate(long j, String str, JSONObject jSONObject) {
            C2189f a = C11063e.f29694a;
            C11053c cVar = new C11053c(C11062d.End, j, str, jSONObject);
            a.onNext(cVar);
        }
    }

    private C11063e() {
    }

    /* renamed from: a */
    public static String m22389a() {
        return f29695b;
    }

    static {
        C2189f<C11053c> n = C2180b.m6534l().mo6479n();
        C52711k.m112236a((Object) n, "PublishSubject.create<Se…geEvent>().toSerialized()");
        f29694a = n;
    }
}
