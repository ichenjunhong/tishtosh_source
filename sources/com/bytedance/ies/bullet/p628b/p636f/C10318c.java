package com.bytedance.ies.bullet.p628b.p636f;

import android.net.Uri;
import com.bytedance.ies.bullet.p628b.C10244c;
import com.bytedance.ies.bullet.p628b.C10244c.C10246b;
import com.bytedance.ies.bullet.p628b.p633e.C10277aa;
import com.bytedance.ies.bullet.p628b.p633e.C10284d;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.C10295n;
import com.bytedance.ies.bullet.p628b.p633e.C10305r;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.bullet.b.f.c */
public final class C10318c implements C10322e {

    /* renamed from: b */
    public static final C10319a f27727b = new C10319a(null);

    /* renamed from: d */
    private static final C52670a<String> f27728d = C10320b.f27731a;

    /* renamed from: a */
    public C10244c f27729a;

    /* renamed from: c */
    private final C10295n f27730c = new C10305r();

    /* renamed from: com.bytedance.ies.bullet.b.f.c$a */
    public static final class C10319a {
        private C10319a() {
        }

        public /* synthetic */ C10319a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.f.c$b */
    static final class C10320b extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C10320b f27731a = new C10320b();

        C10320b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            return uuid;
        }
    }

    /* renamed from: a */
    public final void mo18295a() {
        if (this.f27729a != null) {
            C10244c cVar = this.f27729a;
            if (cVar == null) {
                C52711k.m112237a("core");
            }
            cVar.mo18265b(this.f27730c);
        }
        this.f27730c.mo18295a();
    }

    /* renamed from: a */
    public final <T extends C10284d<?, ?, ?, ?>> C10290i mo18260a(Class<? extends T> cls) {
        C52711k.m112240b(cls, "clazz");
        return this.f27730c.mo18260a(cls);
    }

    /* renamed from: a */
    public final C10290i mo18261a(String str) {
        C52711k.m112240b(str, "sessionId");
        return this.f27730c.mo18261a(str);
    }

    /* renamed from: a */
    public final void mo18274a(C10246b bVar) {
        C52711k.m112240b(bVar, "coreProvider");
        C10244c a = bVar.mo18244a();
        a.mo18263a(this.f27730c);
        this.f27729a = a;
    }

    /* renamed from: a */
    public final void mo18391a(Uri uri, C10326b bVar, C52686q<? super C10290i, ? super Uri, ? super Boolean, C52860x> qVar, C52671b<? super Throwable, C52860x> bVar2) {
        List list;
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(bVar, "providerFactory");
        C52711k.m112240b(qVar, "resolve");
        C52711k.m112240b(bVar2, "reject");
        C10316a aVar = new C10316a();
        aVar.mo18493a(Uri.class, uri);
        Uri uri2 = (Uri) aVar.f27725b.mo18457b();
        if (uri2 != null) {
            C10244c cVar = this.f27729a;
            if (cVar == null) {
                C52711k.m112237a("core");
            }
            C10295n nVar = this.f27730c;
            C10277aa aaVar = new C10277aa((String) f27728d.invoke());
            List list2 = (List) aVar.f27724a.mo18457b();
            if (list2 != null) {
                Iterable<String> iterable = list2;
                Collection arrayList = new ArrayList();
                for (String str : iterable) {
                    if (C52830p.m112402a(str)) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                list = (List) arrayList;
            } else {
                list = C52575l.m112097a();
            }
            cVar.mo18264a(nVar, aaVar, uri2, list, bVar, qVar, bVar2);
            return;
        }
        StringBuilder sb = new StringBuilder("bullet uri parse failed ");
        sb.append(uri);
        bVar2.invoke(new IllegalStateException(sb.toString()));
    }
}
