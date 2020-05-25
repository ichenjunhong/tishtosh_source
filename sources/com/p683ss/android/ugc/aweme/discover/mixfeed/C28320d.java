package com.p683ss.android.ugc.aweme.discover.mixfeed;

import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d */
public final class C28320d extends C26876b<C28329k> {

    /* renamed from: a */
    public C30504w f74288a;

    /* renamed from: b */
    public boolean f74289b;

    /* renamed from: d */
    private boolean f74290d;

    /* renamed from: b */
    public final void mo44838b() {
        boolean z;
        if (this.f74288a != null) {
            C30504w wVar = this.f74288a;
            if (!this.f74290d || this.f74289b) {
                z = true;
            } else {
                z = false;
            }
            wVar.mo55806d(z);
        }
        this.f74290d = false;
        this.f74289b = false;
        if (this.f70700f != null) {
            super.mo44838b();
        }
    }

    /* renamed from: a_ */
    public final boolean mo44934a_(Object... objArr) {
        if (this.f74288a != null) {
            this.f74288a.mo55806d(this.f74289b);
        }
        return super.mo44934a_(objArr);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        boolean z;
        if (this.f74288a != null) {
            C30504w wVar = this.f74288a;
            if (!this.f74290d || this.f74289b) {
                z = true;
            } else {
                z = false;
            }
            wVar.mo55806d(z);
        }
        this.f74290d = false;
        this.f74289b = false;
        if (this.f70700f != null) {
            super.mo44840c_(exc);
        }
    }
}
