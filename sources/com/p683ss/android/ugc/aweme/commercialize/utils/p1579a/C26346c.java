package com.p683ss.android.ugc.aweme.commercialize.utils.p1579a;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a.C26326a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.p1580a.C26333a;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.c */
public final class C26346c implements C26365g {

    /* renamed from: a */
    public Context f69528a;

    /* renamed from: b */
    public List<C26333a> f69529b;

    /* renamed from: c */
    public C26325a f69530c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.c$a */
    public static final class C26347a {

        /* renamed from: a */
        public C26346c f69531a;

        public C26347a() {
            C26346c cVar = new C26346c(null, null, null, 7, null);
            this.f69531a = cVar;
        }

        /* renamed from: a */
        public final C26347a mo54090a(Context context) {
            C26347a aVar = this;
            if (context != null) {
                aVar.f69531a.mo54087a(context);
            }
            return aVar;
        }

        /* renamed from: a */
        public final C26347a mo54091a(C26333a aVar) {
            C52711k.m112240b(aVar, "handler");
            C26347a aVar2 = this;
            aVar2.f69531a.f69529b.add(aVar);
            return aVar2;
        }

        /* renamed from: a */
        public final C26347a mo54092a(C26325a aVar) {
            C52711k.m112240b(aVar, "params");
            C26347a aVar2 = this;
            aVar2.f69531a.mo54088a(aVar);
            return aVar2;
        }
    }

    private C26346c() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a */
    public final boolean mo54089a() {
        for (C26333a aVar : this.f69529b) {
            Context context = this.f69528a;
            C52711k.m112240b(context, "<set-?>");
            aVar.f69517e = context;
            C26325a aVar2 = this.f69530c;
            C52711k.m112240b(aVar2, "<set-?>");
            aVar.f69518f = aVar2;
            if (aVar.mo54084a()) {
                boolean b = aVar.mo54085b();
                aVar.mo54081a(b, this.f69530c);
                if (b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54087a(Context context) {
        C52711k.m112240b(context, "<set-?>");
        this.f69528a = context;
    }

    /* renamed from: a */
    public final void mo54088a(C26325a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f69530c = aVar;
    }

    private C26346c(Context context, List<C26333a> list, C26325a aVar) {
        this.f69528a = context;
        this.f69529b = list;
        this.f69530c = aVar;
    }

    /* synthetic */ C26346c(Context context, List list, C26325a aVar, int i, C52707g gVar) {
        this(C11010c.m22280a(), new ArrayList(), new C26326a().f69476a);
    }
}
