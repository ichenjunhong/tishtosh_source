package com.bytedance.ies.dmt.p664ui.p665a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.dmt.ui.a.b */
public final class C10636b implements C10639d {

    /* renamed from: a */
    public static C10639d f28180a = new C10636b();

    /* renamed from: b */
    public static C10639d f28181b;

    /* renamed from: c */
    public static final C10637a f28182c = new C10637a(null);

    /* renamed from: com.bytedance.ies.dmt.ui.a.b$a */
    public static final class C10637a {
        private C10637a() {
        }

        public /* synthetic */ C10637a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static View m21423a(Context context, int i, ViewGroup viewGroup, boolean z) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(viewGroup, "root");
            C10639d dVar = C10636b.f28181b;
            if (dVar != null) {
                return dVar.mo18878a(context, i, viewGroup, false);
            }
            return C10636b.f28180a.mo18878a(context, i, viewGroup, false);
        }
    }

    /* renamed from: a */
    public final View mo18878a(Context context, int i, ViewGroup viewGroup, boolean z) {
        C52711k.m112240b(context, "context");
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, z);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…late(resId, root, attach)");
        return inflate;
    }
}
