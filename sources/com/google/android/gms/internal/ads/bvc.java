package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class bvc implements bwh {

    /* renamed from: a */
    private final WeakReference<View> f44033a;

    /* renamed from: b */
    private final WeakReference<abb> f44034b;

    public bvc(View view, abb abb) {
        this.f44033a = new WeakReference<>(view);
        this.f44034b = new WeakReference<>(abb);
    }

    /* renamed from: a */
    public final View mo30767a() {
        return (View) this.f44033a.get();
    }

    /* renamed from: b */
    public final boolean mo30768b() {
        return this.f44033a.get() == null || this.f44034b.get() == null;
    }

    /* renamed from: c */
    public final bwh mo30769c() {
        return new bvb((View) this.f44033a.get(), (abb) this.f44034b.get());
    }
}
