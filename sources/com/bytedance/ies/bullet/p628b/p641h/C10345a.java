package com.bytedance.ies.bullet.p628b.p641h;

import android.net.Uri;
import com.bytedance.android.monitor.p461a.C8872c;
import com.bytedance.android.monitor.p462b.C8878d;
import com.bytedance.ies.bullet.p628b.p629a.C10240c;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p628b.p641h.C10354c.C10355a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52820l;

/* renamed from: com.bytedance.ies.bullet.b.h.a */
public abstract class C10345a extends C10353b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f27767a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10345a.class), "unitIdentifier", "getUnitIdentifier()Lcom/bytedance/ies/bullet/core/monitor/Identifier;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C10345a.class), "pageIdentifier", "getPageIdentifier()Lcom/bytedance/ies/bullet/core/monitor/PageIdentifier;"))};

    /* renamed from: i */
    public static final C10346a f27768i = new C10346a(null);

    /* renamed from: b */
    public String f27769b;

    /* renamed from: c */
    public String f27770c;

    /* renamed from: d */
    public final C10360g f27771d;

    /* renamed from: e */
    public final Uri f27772e;

    /* renamed from: f */
    public final C10326b f27773f;

    /* renamed from: g */
    public final String f27774g;

    /* renamed from: h */
    public final String f27775h;

    /* renamed from: l */
    private final C52668f f27776l = C52732g.m112286a(C52757k.NONE, new C10349d(this));

    /* renamed from: m */
    private final C52668f f27777m = C52732g.m112286a(C52757k.NONE, new C10347b(this));

    /* renamed from: com.bytedance.ies.bullet.b.h.a$a */
    public static final class C10346a {
        private C10346a() {
        }

        public /* synthetic */ C10346a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.h.a$b */
    static final class C10347b extends C52712l implements C52670a<C10363j> {

        /* renamed from: a */
        final /* synthetic */ C10345a f27778a;

        C10347b(C10345a aVar) {
            this.f27778a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C10363j(this.f27778a.f27772e, this.f27778a.f27772e);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.h.a$c */
    static final class C10348c<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10345a f27779a;

        /* renamed from: b */
        final /* synthetic */ C10359f f27780b;

        /* renamed from: c */
        final /* synthetic */ String f27781c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f27782d;

        /* renamed from: e */
        final /* synthetic */ JSONObject f27783e;

        /* renamed from: f */
        final /* synthetic */ JSONObject f27784f;

        C10348c(C10345a aVar, C10359f fVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            this.f27779a = aVar;
            this.f27780b = fVar;
            this.f27781c = str;
            this.f27782d = jSONObject;
            this.f27783e = jSONObject2;
            this.f27784f = jSONObject3;
        }

        public final /* synthetic */ Object call() {
            String str;
            JSONObject jSONObject;
            C10345a aVar = this.f27779a;
            C10359f fVar = this.f27780b;
            String str2 = this.f27781c;
            JSONObject jSONObject2 = this.f27782d;
            JSONObject jSONObject3 = this.f27783e;
            JSONObject jSONObject4 = this.f27784f;
            C8872c b = C8878d.m17456b();
            String b2 = fVar.mo18433b();
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("bid", aVar.f27774g);
            jSONObject5.put("pid", aVar.f27775h);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObject6 = jSONObject2;
            String str3 = "is_fallback";
            if (aVar.mo18413d() == null) {
                str = "origin";
            } else {
                str = "fallback";
            }
            jSONObject6.put(str3, str);
            jSONObject6.put("sdk_type", "bullet");
            C10240c.m20716a(jSONObject6, fVar.mo18402a());
            C10360g gVar = aVar.f27771d;
            if (gVar != null) {
                C10240c.m20716a(jSONObject6, gVar.mo18402a());
            }
            JSONObject jSONObject7 = new JSONObject();
            if (jSONObject3 != null) {
                C10240c.m20716a(jSONObject7, jSONObject3);
            }
            if (jSONObject4 == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = jSONObject4;
            }
            b.mo15868a(b2, str2, jSONObject5, jSONObject6, jSONObject7, jSONObject, aVar.mo18406a());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.h.a$d */
    static final class C10349d extends C52712l implements C52670a<C10360g> {

        /* renamed from: a */
        final /* synthetic */ C10345a f27785a;

        C10349d(C10345a aVar) {
            this.f27785a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C10360g(this.f27785a.f27772e, null, 2, null);
        }
    }

    /* renamed from: a */
    public abstract int mo18406a();

    /* renamed from: e */
    public final C10360g mo18414e() {
        return (C10360g) this.f27776l.getValue();
    }

    /* renamed from: f */
    public final C10363j mo18415f() {
        return (C10363j) this.f27777m.getValue();
    }

    /* renamed from: b */
    public final C10357d mo18411b() {
        return (C10357d) this.f27773f.mo18401c(C10357d.class);
    }

    /* renamed from: c */
    public final C10358e mo18412c() {
        return (C10358e) this.f27773f.mo18401c(C10358e.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Uri mo18413d() {
        return (Uri) this.f27773f.mo18401c(Uri.class);
    }

    /* renamed from: a */
    public final boolean mo18410a(Uri uri) {
        boolean z;
        C52711k.m112240b(uri, "uri");
        try {
            if (!uri.getBooleanQueryParameter("monitor_enabled", false)) {
                String uri2 = uri.toString();
                C52711k.m112236a((Object) uri2, "uri.toString()");
                C10358e c = mo18412c();
                if (c != null) {
                    List a = c.mo18424a();
                    if (a != null) {
                        Iterator it = a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (new C52820l((String) it.next()).containsMatchIn(uri2)) {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                z = false;
                if (!z) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo18408a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        C10354c a = C10355a.m20932a();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        a.mo15871a(str, i, jSONObject, jSONObject2);
    }

    public C10345a(Uri uri, C10326b bVar, String str, String str2) {
        C10360g gVar;
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "providerFactory");
        C52711k.m112240b(str, "bid");
        C52711k.m112240b(str2, "pid");
        this.f27772e = uri;
        this.f27773f = bVar;
        this.f27774g = str;
        this.f27775h = str2;
        Uri d = mo18413d();
        if (d != null) {
            gVar = new C10360g(d, "original");
        } else {
            gVar = null;
        }
        this.f27771d = gVar;
    }

    /* renamed from: a */
    public final void mo18409a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(str2, "triggerFrom");
        C10359f e = mo18414e();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("trigger", str2);
        if (jSONObject != null) {
            C10240c.m20716a(jSONObject4, jSONObject);
        }
        mo18407a(str, e, jSONObject4, jSONObject2, jSONObject3);
    }

    /* renamed from: a */
    public void mo18407a(String str, C10359f fVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(fVar, "identifier");
        try {
            C10348c cVar = new C10348c(this, fVar, str, jSONObject, jSONObject2, jSONObject3);
            C0013i.m18a((Callable<TResult>) cVar, (Executor) C0013i.f24a);
        } catch (Exception e) {
            String b = fVar.mo18433b();
            C10357d b2 = mo18411b();
            if (b2 != null) {
                Map linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("url", b);
                linkedHashMap.put("platform", String.valueOf(mo18406a()));
                b2.mo18421a(e, "hybrid report failed", linkedHashMap);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m20912a(C10345a aVar, String str, C10359f fVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i, Object obj) {
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if ((i & 4) != 0) {
            jSONObject4 = null;
        } else {
            jSONObject4 = jSONObject;
        }
        if ((i & 8) != 0) {
            jSONObject5 = null;
        } else {
            jSONObject5 = jSONObject2;
        }
        aVar.mo18407a(str, fVar, jSONObject4, jSONObject5, (JSONObject) null);
    }
}
