package com.p683ss.android.ugc.aweme.p1402b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.b.b */
public final class C23344b {

    /* renamed from: a */
    public static final C23344b f62351a = new C23344b();

    private C23344b() {
    }

    /* renamed from: a */
    public final View mo48400a(Activity activity, int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        View view = null;
        if (!(activity instanceof C23346d)) {
            activity = null;
        }
        C23346d dVar = (C23346d) activity;
        if (dVar != null) {
            C23345c inflater = dVar.getInflater();
            if (inflater != null) {
                view = inflater.mo48401a(i);
            }
        }
        if (view != null) {
            return view;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(res, container, false)");
        return inflate;
    }
}
