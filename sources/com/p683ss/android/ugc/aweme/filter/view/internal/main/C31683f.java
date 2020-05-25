package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.widget.SeekBar;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31633e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.f */
public final class C31683f implements C31633e {

    /* renamed from: a */
    private final SeekBar f82751a;

    /* renamed from: a */
    public final SeekBar mo64541a() {
        return this.f82751a;
    }

    /* renamed from: b */
    public final boolean mo64543b() {
        if (this.f82751a.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64542a(boolean z) {
        int i;
        SeekBar seekBar = this.f82751a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        seekBar.setVisibility(i);
    }

    public C31683f(SeekBar seekBar) {
        C52711k.m112240b(seekBar, "seekBar");
        this.f82751a = seekBar;
        this.f82751a.setVisibility(0);
    }
}
