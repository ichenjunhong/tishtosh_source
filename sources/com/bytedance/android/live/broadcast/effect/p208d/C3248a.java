package com.bytedance.android.live.broadcast.effect.p208d;

import android.view.View;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.android.live.broadcast.effect.d.a */
public final class C3248a {

    /* renamed from: a */
    public final View f9380a;

    /* renamed from: b */
    public final AdjustPercentBar f9381b;

    /* renamed from: c */
    public final int f9382c;

    /* renamed from: d */
    public final int f9383d;

    public C3248a() {
        this(null, null, 0, 0, 15, null);
    }

    public C3248a(View view, AdjustPercentBar adjustPercentBar, int i, int i2) {
        this.f9380a = view;
        this.f9381b = adjustPercentBar;
        this.f9382c = i;
        this.f9383d = i2;
    }

    public /* synthetic */ C3248a(View view, AdjustPercentBar adjustPercentBar, int i, int i2, int i3, C52707g gVar) {
        if ((i3 & 1) != 0) {
            view = null;
        }
        if ((i3 & 2) != 0) {
            adjustPercentBar = null;
        }
        if ((i3 & 4) != 0) {
            i = R.layout.alj;
        }
        if ((i3 & 8) != 0) {
            i2 = R.layout.ald;
        }
        this(view, adjustPercentBar, i, i2);
    }
}
