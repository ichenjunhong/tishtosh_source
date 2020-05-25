package com.airbnb.lottie.p107b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import com.airbnb.lottie.C2297a;
import com.airbnb.lottie.p108c.C2401h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.b.a */
public final class C2338a {

    /* renamed from: a */
    public final C2401h<String> f7280a = new C2401h<>();

    /* renamed from: b */
    public final Map<C2401h<String>, Typeface> f7281b = new HashMap();

    /* renamed from: c */
    public final Map<String, Typeface> f7282c = new HashMap();

    /* renamed from: d */
    public final AssetManager f7283d;

    /* renamed from: e */
    public C2297a f7284e;

    /* renamed from: f */
    public String f7285f = ".ttf";

    public C2338a(Callback callback, C2297a aVar) {
        this.f7284e = aVar;
        if (!(callback instanceof View)) {
            this.f7283d = null;
        } else {
            this.f7283d = ((View) callback).getContext().getAssets();
        }
    }
}
