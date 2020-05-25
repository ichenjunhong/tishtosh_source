package com.p683ss.android.ugc.aweme.search.p2122b;

import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: com.ss.android.ugc.aweme.search.b.b */
public final class C41407b {

    /* renamed from: a */
    public final C41406a f104968a;

    /* renamed from: b */
    public int f104969b = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: c */
    private final int f104970c;

    /* renamed from: a */
    public final void mo84080a() {
        this.f104969b = DynamicTabYellowPointVersion.DEFAULT;
    }

    public C41407b(int i, C41406a aVar) {
        this.f104970c = i;
        this.f104968a = aVar;
    }

    /* renamed from: b */
    public boolean mo84082b(int i, int i2) {
        if (this.f104970c > 0 && (i2 - i) - 1 <= this.f104970c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo84081a(int i, int i2) {
        if (i > this.f104969b) {
            this.f104969b = i;
            if (mo84082b(i, i2)) {
                this.f104968a.ar_();
            }
        }
    }
}
