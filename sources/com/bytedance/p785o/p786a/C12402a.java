package com.bytedance.p785o.p786a;

import android.app.Application;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.p785o.p786a.p787a.C12408c;
import com.bytedance.p785o.p786a.p787a.C12409d;
import com.bytedance.p785o.p786a.p787a.C12409d.C12411a;
import com.bytedance.p785o.p786a.p795c.C12421a;
import com.bytedance.p785o.p786a.p795c.C12422b;
import com.bytedance.p785o.p786a.p795c.C12424d;
import java.util.HashMap;

/* renamed from: com.bytedance.o.a.a */
public class C12402a {

    /* renamed from: a */
    public static volatile C12402a f32647a;

    /* renamed from: b */
    private final Application f32648b;

    /* renamed from: c */
    private final HashMap<String, C12421a> f32649c;

    /* renamed from: com.bytedance.o.a.a$a */
    public static class C12404a {

        /* renamed from: a */
        public final Application f32650a;

        /* renamed from: b */
        public final HashMap<String, C12421a> f32651b = new HashMap<>();

        /* renamed from: c */
        public C12408c f32652c;

        /* renamed from: d */
        public C12411a f32653d;

        public C12404a(Application application) {
            if (application != null) {
                this.f32650a = application;
                return;
            }
            throw new RuntimeException("Godzilla init, application is null");
        }

        /* renamed from: a */
        public final C12404a mo23463a(C12421a aVar) {
            String b = aVar.mo23475b();
            if (TextUtils.isEmpty(b)) {
                throw new RuntimeException(C2240a.m6772a("%s plugin name is null", new Object[]{aVar.getClass().getName()}));
            } else if (this.f32651b.get(b) == null) {
                this.f32651b.put(b, aVar);
                return this;
            } else {
                throw new RuntimeException(C2240a.m6772a("%s plugin is already exist", new Object[]{b}));
            }
        }
    }

    /* renamed from: a */
    public static C12402a m24980a(C12402a aVar) {
        if (aVar != null) {
            synchronized (C12402a.class) {
                if (f32647a == null) {
                    f32647a = aVar;
                } else {
                    C12409d.m24989a("Godzilla", "Godzilla instance is already set. this invoking will be ignored");
                }
            }
            return f32647a;
        }
        throw new RuntimeException("Godzilla should not be null.");
    }

    /* renamed from: a */
    public final void mo23462a(C12424d dVar) {
        for (C12421a aVar : this.f32649c.values()) {
            if (aVar instanceof C12422b) {
                ((C12422b) aVar).mo23480a(dVar);
            } else if (aVar.mo23479d() == dVar) {
                aVar.mo23473a();
            }
        }
    }

    private C12402a(Application application, HashMap<String, C12421a> hashMap, C12408c cVar, C12411a aVar) {
        this.f32648b = application;
        this.f32649c = hashMap;
        C12413b.INSTANCE.init(this.f32648b, cVar, aVar);
        for (C12421a a : hashMap.values()) {
            a.mo23474a(this.f32648b);
        }
    }
}
