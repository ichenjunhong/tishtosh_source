package com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k.C31855a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a.a */
public final class C28301a implements C31855a {

    /* renamed from: g */
    public static boolean f74222g;

    /* renamed from: a */
    protected Set<C31854k> f74223a = new LinkedHashSet();

    /* renamed from: b */
    protected int f74224b = 0;

    /* renamed from: c */
    public int f74225c;

    /* renamed from: d */
    public boolean f74226d = true;

    /* renamed from: e */
    public int f74227e = 0;

    /* renamed from: f */
    public boolean f74228f;

    /* renamed from: h */
    public int f74229h = -1;

    /* renamed from: i */
    private RecyclerView f74230i;

    /* renamed from: j */
    private boolean f74231j;

    /* renamed from: k */
    private Handler f74232k = new Handler(Looper.getMainLooper());

    /* renamed from: l */
    private int f74233l = -1;

    /* renamed from: m */
    private int f74234m = -1;

    /* renamed from: n */
    private int f74235n = -1;

    /* renamed from: o */
    private int f74236o = -1;

    /* renamed from: k */
    private int m67218k() {
        int[] iArr = new int[2];
        this.f74230i.getLocationOnScreen(iArr);
        return (iArr[1] + this.f74230i.getHeight()) / 2;
    }

    /* renamed from: g */
    public final void mo56703g() {
        for (C31854k c : this.f74223a) {
            c.mo56769c();
        }
    }

    /* renamed from: j */
    private boolean m67217j() {
        int[] iArr = new int[2];
        this.f74230i.getLocationOnScreen(iArr);
        int i = iArr[1];
        for (C31854k a : this.f74223a) {
            if (a.mo56766a().top <= i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo56697c() {
        if (C9376b.m18558a((Collection<T>) this.f74223a)) {
            return false;
        }
        for (C31854k kVar : this.f74223a) {
            if (kVar.mo56772f() == 0) {
                if (m67218k() >= kVar.mo56766a().top) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo56699d() {
        if (C9376b.m18558a((Collection<T>) this.f74223a)) {
            return false;
        }
        for (C31854k i : this.f74223a) {
            if (i.mo56775i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo56701e() {
        if (C9376b.m18558a((Collection<T>) this.f74223a)) {
            return false;
        }
        for (C31854k kVar : this.f74223a) {
            if (kVar.mo56775i() && (kVar.f83227f || kVar.mo56774h())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo56702f() {
        if (!C9376b.m18558a((Collection<T>) this.f74223a)) {
            for (C31854k kVar : this.f74223a) {
                if (!kVar.mo56775i()) {
                    kVar.mo56769c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo56690a() {
        if (this.f74234m == -1) {
            C31854k kVar = null;
            for (C31854k kVar2 : this.f74223a) {
                if (kVar2.mo56772f() != 0) {
                    kVar2.mo56769c();
                } else if (m67218k() >= kVar2.mo56766a().top) {
                    kVar = kVar2;
                }
            }
            if (kVar != null) {
                mo56694b(kVar);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo56695b() {
        C1332i layoutManager = this.f74230i.getLayoutManager();
        if (layoutManager != null) {
            View c = layoutManager.mo4736c(0);
            if (c != null) {
                int[] iArr = new int[2];
                this.f74230i.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                c.getLocationOnScreen(iArr2);
                if (iArr2[1] >= iArr[1]) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void mo56704h() {
        if (!f74222g && !mo56701e() && this.f74234m == -1) {
            if (this.f74235n >= 0) {
                mo56691a(this.f74235n);
            } else if (this.f74236o >= 0) {
                mo56691a(this.f74236o);
            } else {
                if (!this.f74228f || !this.f74226d) {
                    if (mo56697c()) {
                        mo56705i();
                        return;
                    }
                    mo56703g();
                } else if (!this.f74223a.isEmpty()) {
                    mo56690a();
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo56705i() {
        ArrayList arrayList;
        int k = m67218k();
        switch (this.f74225c) {
            case 1:
                arrayList = new ArrayList(this.f74223a.size());
                for (C31854k kVar : this.f74223a) {
                    if ((kVar.mo56772f() % 4 == 0 || kVar.mo56772f() % 4 == 3) && m67212a(kVar, k)) {
                        arrayList.add(kVar);
                    }
                }
                break;
            case 2:
                arrayList = new ArrayList(this.f74223a.size());
                for (C31854k kVar2 : this.f74223a) {
                    if ((kVar2.mo56772f() & 1) != 1 && m67212a(kVar2, k)) {
                        arrayList.add(kVar2);
                    }
                }
                break;
            default:
                arrayList = new ArrayList(this.f74223a);
                break;
        }
        m67210a((List<C31854k>) arrayList, k);
        if (arrayList.size() > 0 && arrayList.get(0) != null) {
            C31854k kVar3 = (C31854k) arrayList.get(0);
            if (m67216h(kVar3)) {
                m67213b(kVar3.mo56772f());
            }
        }
    }

    /* renamed from: e */
    public final void mo56700e(C31854k kVar) {
        this.f74236o = kVar.mo56772f();
    }

    /* renamed from: f */
    private void m67214f(C31854k kVar) {
        int f = kVar.mo56772f();
        if ((f & 1) != 1) {
            mo56691a(f + 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo56694b(C31854k kVar) {
        if (m67215g(kVar)) {
            kVar.mo56768b();
        }
    }

    /* renamed from: c */
    public final void mo56696c(C31854k kVar) {
        if (kVar != null) {
            kVar.mo64972m();
            kVar.f83228g = null;
        }
        this.f74223a.remove(kVar);
    }

    /* renamed from: d */
    public final void mo56698d(C31854k kVar) {
        if (!this.f74231j) {
            kVar.mo56769c();
            if (this.f74225c == 2) {
                m67214f(kVar);
            }
        }
    }

    /* renamed from: h */
    private boolean m67216h(C31854k kVar) {
        if (!this.f74231j && this.f74236o != -1 && m67211a(kVar.mo56772f(), this.f74236o)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m67213b(int i) {
        for (C31854k kVar : this.f74223a) {
            if (kVar.mo56772f() != i || !m67215g(kVar)) {
                kVar.mo56770d();
            } else if (!kVar.mo56774h() && this.f74234m == -1) {
                kVar.mo56767a(this.f74224b);
            }
        }
    }

    /* renamed from: g */
    private boolean m67215g(C31854k kVar) {
        if (m67217j()) {
            return true;
        }
        int k = m67218k();
        Rect a = kVar.mo56766a();
        Context context = this.f74230i.getContext();
        if (a.bottom > C9432q.m18688b(context)) {
            return false;
        }
        int abs = Math.abs(k - ((a.top + a.bottom) / 2));
        if (a.top < k || ((float) abs) <= C9432q.m18687b(context, 100.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo56691a(int i) {
        if (!C9376b.m18558a((Collection<T>) this.f74223a)) {
            for (C31854k kVar : this.f74223a) {
                if (kVar.mo56772f() == i) {
                    kVar.mo56768b();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo56692a(C31854k kVar) {
        kVar.mo64972m();
        if (kVar.mo56775i()) {
            this.f74223a.add(kVar);
            return;
        }
        if (!mo56699d() && this.f74228f && this.f74226d && this.f74233l < 0) {
            this.f74233l = kVar.mo56772f();
            View g = kVar.mo56773g();
            if (g != null) {
                g.post(new C28304b(this, kVar));
            } else {
                return;
            }
        }
        if (this.f74234m >= 0 && kVar.mo56772f() == this.f74234m) {
            kVar.mo56768b();
            this.f74234m = -1;
        }
        kVar.f83228g = this;
        this.f74223a.add(kVar);
    }

    /* renamed from: a */
    public final void mo56693a(boolean z) {
        this.f74228f = true;
        this.f74233l = -1;
        this.f74236o = -1;
    }

    /* renamed from: a */
    private void m67210a(List<C31854k> list, final int i) {
        Collections.sort(list, new Comparator<C31854k>() {
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ int compare(java.lang.Object r4, java.lang.Object r5) {
                /*
                    r3 = this;
                    com.ss.android.ugc.aweme.flowfeed.utils.k r4 = (com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k) r4
                    com.ss.android.ugc.aweme.flowfeed.utils.k r5 = (com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k) r5
                    android.graphics.Rect r0 = r4.mo56766a()
                    android.graphics.Rect r1 = r5.mo56766a()
                    com.ss.android.ugc.aweme.discover.mixfeed.a.a r2 = com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a.this
                    int r2 = r2.f74225c
                    switch(r2) {
                        case 1: goto L_0x0014;
                        case 2: goto L_0x0014;
                        default: goto L_0x0013;
                    }
                L_0x0013:
                    goto L_0x002a
                L_0x0014:
                    com.ss.android.ugc.aweme.discover.mixfeed.a.a r2 = com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a.this
                    int r2 = r2.f74227e
                    if (r2 <= 0) goto L_0x001f
                    int r0 = r0.top
                    int r1 = r1.top
                    goto L_0x0038
                L_0x001f:
                    com.ss.android.ugc.aweme.discover.mixfeed.a.a r2 = com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a.this
                    int r2 = r2.f74227e
                    if (r2 >= 0) goto L_0x002a
                    int r0 = r0.bottom
                    int r1 = r1.bottom
                    goto L_0x0038
                L_0x002a:
                    int r2 = r0.top
                    int r0 = r0.bottom
                    int r2 = r2 + r0
                    int r0 = r2 / 2
                    int r2 = r1.top
                    int r1 = r1.bottom
                    int r2 = r2 + r1
                    int r1 = r2 / 2
                L_0x0038:
                    int r2 = r3
                    int r2 = r2 - r0
                    int r0 = java.lang.Math.abs(r2)
                    int r2 = r3
                    int r2 = r2 - r1
                    int r1 = java.lang.Math.abs(r2)
                    if (r0 == r1) goto L_0x004a
                    int r0 = r0 - r1
                    return r0
                L_0x004a:
                    int r4 = r4.mo56772f()
                    int r5 = r5.mo56772f()
                    int r4 = r4 - r5
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.mixfeed.p1654a.C28301a.C283032.compare(java.lang.Object, java.lang.Object):int");
            }
        });
    }

    /* renamed from: a */
    private static boolean m67211a(int i, int i2) {
        if (i / 2 == i2 / 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m67212a(C31854k kVar, int i) {
        if (this.f74227e == 0) {
            return true;
        }
        Rect a = kVar.mo56766a();
        if (this.f74227e > 0) {
            if (a.top > i || a.top < i - a.height()) {
                return false;
            }
            return true;
        } else if (a.bottom < i || a.bottom > i + a.height()) {
            return false;
        } else {
            return true;
        }
    }

    public C28301a(RecyclerView recyclerView, int i, boolean z, boolean z2) {
        this.f74230i = recyclerView;
        this.f74225c = i;
        this.f74231j = z;
        recyclerView.mo4801a((C1340m) new C1340m(true) {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C28301a.this.f74224b = i;
                C28301a.this.f74228f = false;
                if (i != 2 && i == 0 && !C28301a.this.mo56701e()) {
                    if (C28301a.this.mo56695b()) {
                        C28301a.this.f74228f = true;
                        C28301a.this.mo56690a();
                    } else if (C28301a.this.f74226d || C28301a.this.mo56697c()) {
                        C28301a.this.mo56705i();
                    }
                    C28301a.this.f74227e = 0;
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                C28301a.this.f74227e = i2;
                if (C28301a.this.mo56701e()) {
                    C28301a.this.mo56702f();
                }
                if (C28301a.this.f74229h != -1) {
                    if (!C28301a.this.mo56699d()) {
                        C28301a.this.mo56691a(C28301a.this.f74229h);
                    }
                    C28301a.this.f74229h = -1;
                    return;
                }
                if (true && Math.abs(i2) < 100) {
                    if (C28301a.this.mo56695b()) {
                        C28301a.this.f74228f = true;
                        C28301a.this.mo56690a();
                    } else if (C28301a.this.f74226d || C28301a.this.mo56697c()) {
                        C28301a.this.mo56705i();
                    }
                }
            }
        });
    }
}
