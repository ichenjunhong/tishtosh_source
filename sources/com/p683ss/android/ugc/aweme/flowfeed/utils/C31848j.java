package com.p683ss.android.ugc.aweme.flowfeed.utils;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p669e.C10704b;
import com.p683ss.android.common.applog.GlobalContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.j */
public final class C31848j {

    /* renamed from: a */
    public RecyclerView f83213a;

    /* renamed from: b */
    protected Set<C31854k> f83214b;

    /* renamed from: c */
    protected int f83215c;

    /* renamed from: d */
    public boolean f83216d;

    /* renamed from: e */
    public C31846h f83217e;

    /* renamed from: f */
    private C31853a f83218f;

    /* renamed from: g */
    private int f83219g;

    /* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.j$a */
    public interface C31853a {
        /* renamed from: n */
        boolean mo64650n();
    }

    /* renamed from: f */
    private static boolean m74222f(C31854k kVar) {
        return true;
    }

    /* renamed from: f */
    public final void mo64966f() {
        this.f83214b.clear();
    }

    /* renamed from: j */
    private int m74224j() {
        if (this.f83217e != null) {
            return this.f83217e.mo64955a();
        }
        return 0;
    }

    /* renamed from: h */
    public final void mo64968h() {
        mo64967g();
        mo64961b();
        mo64965e();
    }

    /* renamed from: k */
    private int m74225k() {
        return ((this.f83213a.getTop() + this.f83213a.getBottom()) / 2) - m74224j();
    }

    /* renamed from: g */
    public void mo64967g() {
        if (!C9376b.m18558a((Collection<T>) this.f83214b)) {
            for (C31854k kVar : this.f83214b) {
                kVar.f83225d = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo64963c() {
        if (!C9376b.m18558a((Collection<T>) this.f83214b)) {
            for (C31854k p : this.f83214b) {
                p.mo64814p();
            }
        }
    }

    /* renamed from: a */
    public final void mo64958a() {
        boolean z;
        if (!C9376b.m18558a((Collection<T>) this.f83214b)) {
            for (C31854k kVar : this.f83214b) {
                Rect a = kVar.mo56766a();
                int i = (a.top + a.bottom) / 2;
                if (i < this.f83213a.getTop() + m74224j() || i > this.f83213a.getBottom() + m74224j()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && !kVar.f83227f) {
                    kVar.f83227f = true;
                    kVar.mo64812n();
                } else if (!z && kVar.f83227f) {
                    kVar.f83227f = false;
                    kVar.mo64813o();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo64961b() {
        boolean z;
        if (!C9376b.m18558a((Collection<T>) this.f83214b)) {
            for (C31854k kVar : this.f83214b) {
                Rect a = kVar.mo56766a();
                int i = (a.top + a.bottom) / 2;
                if (Math.abs((i - this.f83213a.getBottom()) - m74224j()) <= 10 || Math.abs((i - this.f83213a.getTop()) - m74224j()) <= 10) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !kVar.f83226e) {
                    kVar.f83226e = true;
                    kVar.mo56771e();
                }
            }
        }
    }

    /* renamed from: i */
    private List<C31854k> m74223i() {
        ArrayList arrayList = new ArrayList();
        if (C10181b.m20511a().mo18168a(OptimizeFlowFeedAutoPlayExperiment.class, true, "optimize_flowfeed_autoplay", 31744, 1) == 1) {
            ArrayList arrayList2 = new ArrayList();
            for (C31854k kVar : this.f83214b) {
                if (m74220d(kVar)) {
                    if (kVar.f83225d != 16) {
                        kVar.f83225d = 16;
                        arrayList.add(kVar);
                    }
                    arrayList2.add(kVar);
                } else if (m74222f(kVar) && kVar.f83225d == 16) {
                    kVar.f83225d = 32;
                    kVar.mo56770d();
                }
            }
            if (arrayList2.size() == 0) {
                Iterator it = this.f83214b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C31854k kVar2 = (C31854k) it.next();
                    if (m74221e(kVar2)) {
                        if (kVar2.f83225d != 16) {
                            kVar2.f83225d = 16;
                            arrayList.add(kVar2);
                        }
                    }
                }
            }
        } else {
            for (C31854k kVar3 : this.f83214b) {
                if (m74219c(kVar3)) {
                    if (kVar3.f83225d != 16) {
                        kVar3.f83225d = 16;
                        arrayList.add(kVar3);
                    }
                } else if (kVar3.f83225d == 16) {
                    kVar3.f83225d = 32;
                    kVar3.mo56770d();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo64964d() {
        if (this.f83215c == 2 || C9376b.m18558a((Collection<T>) this.f83214b)) {
            return;
        }
        if (this.f83218f == null || this.f83218f.mo64650n()) {
            List i = m74223i();
            m74218a(i);
            for (int i2 = 0; i2 < i.size(); i2++) {
                C31854k kVar = (C31854k) i.get(i2);
                if (i2 == 0) {
                    kVar.mo64811b(this.f83215c);
                } else {
                    kVar.f83225d = 32;
                    kVar.mo56770d();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo64965e() {
        if (this.f83215c == 2 || C9376b.m18558a((Collection<T>) this.f83214b)) {
            return;
        }
        if (this.f83218f == null || this.f83218f.mo64650n()) {
            List i = m74223i();
            m74218a(i);
            for (int i2 = 0; i2 < i.size(); i2++) {
                C31854k kVar = (C31854k) i.get(i2);
                if (i2 == 0) {
                    kVar.mo56767a(this.f83215c);
                } else {
                    kVar.f83225d = 32;
                    kVar.mo56770d();
                }
            }
        }
    }

    public C31848j(RecyclerView recyclerView) {
        this(recyclerView, null, null);
    }

    /* renamed from: a */
    private void m74218a(List<C31854k> list) {
        Collections.sort(list, new Comparator<C31854k>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((C31854k) obj2).mo56766a().bottom - ((C31854k) obj).mo56766a().bottom;
            }
        });
    }

    /* renamed from: b */
    public final void mo64962b(C31854k kVar) {
        if (kVar != null) {
            kVar.mo64972m();
        }
        this.f83214b.remove(kVar);
    }

    /* renamed from: c */
    private boolean m74219c(C31854k kVar) {
        int k = m74225k();
        Rect a = kVar.mo56766a();
        if (a.top > k || a.bottom < k) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo64959a(long j) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                C31848j.this.mo64965e();
            }
        }, 500);
    }

    /* renamed from: a */
    public final void mo64960a(C31854k kVar) {
        if (kVar != null) {
            kVar.mo64972m();
        }
        this.f83214b.add(kVar);
    }

    /* renamed from: d */
    private boolean m74220d(C31854k kVar) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f83219g == 0) {
            this.f83219g = (int) C9432q.m18687b(GlobalContext.getContext(), 80.0f);
        }
        int k = m74225k();
        int i = this.f83219g + k;
        Rect a = kVar.mo56766a();
        StringBuilder sb = new StringBuilder("rect.top <= targetRegionBottomLine: ");
        if (a.top <= i) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        StringBuilder sb2 = new StringBuilder("rect.bottom >= targetRegionCentreLine: ");
        if (a.bottom >= k) {
            z2 = true;
        } else {
            z2 = false;
        }
        sb2.append(z2);
        StringBuilder sb3 = new StringBuilder("hitTargetRegion: ");
        if (a.top > i || a.bottom < k) {
            z3 = false;
        } else {
            z3 = true;
        }
        sb3.append(z3);
        if (a.top > i || a.bottom < k) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m74221e(C31854k kVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int b = C10704b.m21578b(GlobalContext.getContext());
        Rect a = kVar.mo56766a();
        int i = (int) (((float) (a.bottom - a.top)) * 0.3f);
        StringBuilder sb = new StringBuilder("rect.top <= targetRegionBottomLine: ");
        if (a.top <= b) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        StringBuilder sb2 = new StringBuilder("(rect.bottom - targetRegionTopLine) >= offset: ");
        if (a.bottom <= 0 || a.bottom >= b || a.bottom - 0 < i) {
            z2 = false;
        } else {
            z2 = true;
        }
        sb2.append(z2);
        StringBuilder sb3 = new StringBuilder("(targetRegionBottomLine - rect.top) >= offset: ");
        if (a.top <= 0 || a.top >= b || b - a.top < i) {
            z3 = false;
        } else {
            z3 = true;
        }
        sb3.append(z3);
        if ((a.bottom <= 0 || a.bottom >= b || a.bottom - 0 < i) && (a.top <= 0 || a.top >= b || b - a.top < i)) {
            return false;
        }
        return true;
    }

    public C31848j(RecyclerView recyclerView, C31846h hVar, C31853a aVar) {
        this.f83214b = new LinkedHashSet();
        this.f83215c = 0;
        this.f83217e = hVar;
        this.f83218f = aVar;
        this.f83213a = recyclerView;
        this.f83213a.mo4801a((C1340m) new C1340m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C31848j.this.f83215c = i;
                if (C31848j.this.f83217e != null) {
                    C31848j.this.f83217e.mo64957b(recyclerView, i);
                }
                if (i == 0) {
                    if (C31848j.this.f83216d) {
                        C31848j.this.mo64965e();
                    }
                    C31848j.this.f83216d = false;
                    return;
                }
                if (i == 2) {
                    C31848j.this.f83216d = true;
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (C31848j.this.f83217e != null) {
                    C31848j.this.f83217e.mo64956a(recyclerView, i2);
                }
                if (C31848j.this.f83215c == 1) {
                    C31848j.this.mo64965e();
                }
                C31848j.this.mo64961b();
                C31848j.this.mo64958a();
                C31848j.this.mo64963c();
            }
        });
        if (C10181b.m20511a().mo18168a(OptimizeFlowFeedAutoPlayExperiment.class, true, "optimize_flowfeed_autoplay", 31744, 1) == 1) {
            this.f83214b = new TreeSet(new Comparator<C31854k>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((C31854k) obj2).mo56772f() - ((C31854k) obj).mo56772f();
                }
            });
        } else {
            this.f83214b = new LinkedHashSet();
        }
    }
}
