package com.p683ss.android.ugc.aweme.p1911j;

import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9610j;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p551k.p552a.C9628f;
import com.bytedance.crash.p554m.C9668b;
import com.bytedance.crash.p555n.C9713t;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import org.json.JSONObject;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.j.a */
public final class C35708a {

    /* renamed from: a */
    public static final C35708a f91668a = new C35708a();

    /* renamed from: com.ss.android.ugc.aweme.j.a$a */
    static final class C35709a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C35709a f91669a = new C35709a();

        C35709a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "realMsg");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(',');
            Thread currentThread = Thread.currentThread();
            C52711k.m112236a((Object) currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.j.a$b */
    static final class C35710b<T> implements C1710e<String> {

        /* renamed from: a */
        public static final C35710b f91670a = new C35710b();

        C35710b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C35708a aVar = C35708a.f91668a;
            C52711k.m112236a((Object) str, "it");
            aVar.mo74318b(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.j.a$c */
    static final class C35711c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C35711c f91671a = new C35711c();

        C35711c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C32458a.m75148a(th);
            String message = th.getMessage();
            if (message != null) {
                C35708a.f91668a.mo74318b(message);
            }
        }
    }

    private C35708a() {
    }

    /* renamed from: a */
    public static void m80693a(JSONObject jSONObject) {
        C23569o.m57779a("aweme_error_find_bug", jSONObject);
    }

    /* renamed from: c */
    private static void m80694c(String str) {
        C32458a.m75141a(6, "BugReportCrashUtil", str);
    }

    /* renamed from: a */
    public final void mo74317a(String str) {
        if (!C30224d.m70968c()) {
            StringBuilder sb = new StringBuilder("can't report:");
            sb.append(str);
            m80694c(sb.toString());
        } else if (str != null) {
            C2201v.m6614b(str).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) C35709a.f91669a).mo6505a((C1710e<? super T>) C35710b.f91670a, (C1710e<? super Throwable>) C35711c.f91671a);
        }
    }

    /* renamed from: b */
    public final void mo74318b(String str) {
        try {
            if (!C9610j.m19136a()) {
                StringBuilder sb = new StringBuilder("Npth is not init, report abort:");
                sb.append(str);
                m80694c(sb.toString());
                return;
            }
            C9628f a = C9628f.m19195a();
            C9571d dVar = C9571d.JAVA;
            C9584a aVar = new C9584a(new JSONObject());
            aVar.mo17395a("data", (Object) C9713t.m19435a((Throwable) new C35712b(str)));
            aVar.mo17395a("isOOM", (Object) Boolean.valueOf(false));
            aVar.mo17395a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
            C9668b.m19279a(C9668b.m19285a(C9616k.m19147a().mo17446a()), a.mo17472a(dVar, aVar).f26141a.toString());
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
    }
}
