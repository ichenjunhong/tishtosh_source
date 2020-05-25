package com.p888c.p889a.p890a.p891a.p893b;

import android.view.View;
import com.p888c.p889a.p890a.p891a.C13383a;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;

/* renamed from: com.c.a.a.a.b.b */
public abstract class C13394b {
    /* renamed from: a */
    public abstract void mo25089a();

    /* renamed from: a */
    public abstract void mo25090a(View view);

    /* renamed from: b */
    public abstract void mo25091b();

    /* renamed from: b */
    public abstract void mo25092b(View view);

    /* renamed from: a */
    public static C13394b m26999a(C13395c cVar, C13396d dVar) {
        if (C13383a.m26982a()) {
            C13426e.m27071a((Object) cVar, "AdSessionConfiguration is null");
            C13426e.m27071a((Object) dVar, "AdSessionContext is null");
            return new C13404l(cVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
