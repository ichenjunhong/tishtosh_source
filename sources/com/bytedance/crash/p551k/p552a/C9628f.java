package com.bytedance.crash.p551k.p552a;

import android.content.Context;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9586c;
import com.bytedance.crash.p551k.p552a.C9622c.C9623a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.k.a.f */
public final class C9628f {

    /* renamed from: a */
    private static volatile C9628f f26279a;

    /* renamed from: b */
    private Context f26280b;

    /* renamed from: c */
    private Map<C9571d, C9622c> f26281c = new HashMap();

    /* renamed from: d */
    private C9619b f26282d;

    /* renamed from: e */
    private C9624d f26283e;

    /* renamed from: a */
    public static C9628f m19195a() {
        if (f26279a == null) {
            Context f = C9616k.m19154f();
            if (f != null) {
                f26279a = new C9628f(f);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return f26279a;
    }

    private C9628f(Context context) {
        this.f26280b = context;
        try {
            this.f26282d = C9619b.m19170a();
            this.f26283e = new C9624d(this.f26280b);
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    private C9622c m19194a(C9571d dVar) {
        C9622c cVar = (C9622c) this.f26281c.get(dVar);
        if (cVar != null) {
            return cVar;
        }
        switch (dVar) {
            case JAVA:
                cVar = new C9633j(this.f26280b, this.f26282d, this.f26283e);
                break;
            case LAUNCH:
                cVar = new C9634k(this.f26280b, this.f26282d, this.f26283e);
                break;
            case NATIVE:
                cVar = new C9635l(this.f26280b, this.f26282d, this.f26283e);
                break;
            case ANR:
                cVar = new C9618a(this.f26280b, this.f26282d, this.f26283e);
                break;
            case DART:
                cVar = new C9631h(this.f26280b, this.f26282d, this.f26283e);
                break;
            case CUSTOM_JAVA:
                cVar = new C9630g(this.f26280b, this.f26282d, this.f26283e);
                break;
            case BLOCK:
                cVar = new C9627e(this.f26280b, this.f26282d, this.f26283e);
                break;
            case ENSURE:
                cVar = new C9632i(this.f26280b, this.f26282d, this.f26283e);
                break;
        }
        if (cVar != null) {
            this.f26281c.put(dVar, cVar);
        }
        return cVar;
    }

    /* renamed from: a */
    public final C9584a mo17474a(List<C9584a> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C9584a aVar = new C9584a();
        JSONArray jSONArray = new JSONArray();
        for (C9584a aVar2 : list) {
            jSONArray.put(aVar2.f26141a);
        }
        aVar.mo17395a("data", (Object) jSONArray);
        C9586c a = C9586c.m19047a(this.f26280b);
        C9586c.m19049a(a);
        C9586c.m19052b(a);
        a.mo17410a(C9616k.m19147a().mo17446a());
        a.mo17409a(C9616k.m19151c().mo17507a());
        a.mo17408a(C9616k.m19147a().mo17451f());
        aVar.mo17387a(a);
        return aVar;
    }

    /* renamed from: a */
    public final C9584a mo17472a(C9571d dVar, C9584a aVar) {
        if (dVar == null) {
            return aVar;
        }
        C9622c a = m19194a(dVar);
        if (a != null) {
            return a.mo17465a(aVar, null, false);
        }
        return aVar;
    }

    /* renamed from: a */
    public final C9584a mo17473a(C9571d dVar, C9584a aVar, C9623a aVar2, boolean z) {
        if (dVar == null) {
            return null;
        }
        C9622c a = m19194a(dVar);
        if (a != null) {
            return a.mo17465a(null, aVar2, true);
        }
        return null;
    }
}
