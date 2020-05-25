package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.ama;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.overlay.i */
public final class C15012i {

    /* renamed from: a */
    public final int f38810a;

    /* renamed from: b */
    public final LayoutParams f38811b;

    /* renamed from: c */
    public final ViewGroup f38812c;

    /* renamed from: d */
    public final Context f38813d;

    public C15012i(ama ama) throws C15010g {
        this.f38811b = ama.getLayoutParams();
        ViewParent parent = ama.getParent();
        this.f38813d = ama.mo29186r();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C15010g("Could not get the parent of the WebView for an overlay.");
        }
        this.f38812c = (ViewGroup) parent;
        this.f38810a = this.f38812c.indexOfChild(ama.getView());
        this.f38812c.removeView(ama.getView());
        ama.mo29162b(true);
    }
}
