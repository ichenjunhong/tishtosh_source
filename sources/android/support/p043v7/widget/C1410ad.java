package android.support.p043v7.widget;

import android.support.p030v4.p040os.C0968g;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1332i.C1335a;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.ad */
final class C1410ad implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<C1410ad> f5080a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C1413b> f5081e = new Comparator<C1413b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            boolean z;
            boolean z2;
            C1413b bVar = (C1413b) obj;
            C1413b bVar2 = (C1413b) obj2;
            int i = 0;
            if (bVar.f5093d == null) {
                z = true;
            } else {
                z = false;
            }
            if (bVar2.f5093d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (bVar.f5093d != null) {
                    return -1;
                }
                i = 1;
            } else if (bVar.f5090a == bVar2.f5090a) {
                int i2 = bVar2.f5091b - bVar.f5091b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = bVar.f5092c - bVar2.f5092c;
                if (i3 != 0) {
                    return i3;
                }
            } else if (!bVar.f5090a) {
                return 1;
            } else {
                i = -1;
            }
            return i;
        }
    };

    /* renamed from: b */
    ArrayList<RecyclerView> f5082b = new ArrayList<>();

    /* renamed from: c */
    long f5083c;

    /* renamed from: d */
    long f5084d;

    /* renamed from: f */
    private ArrayList<C1413b> f5085f = new ArrayList<>();

    /* renamed from: android.support.v7.widget.ad$a */
    static class C1412a implements C1335a {

        /* renamed from: a */
        int f5086a;

        /* renamed from: b */
        int f5087b;

        /* renamed from: c */
        int[] f5088c;

        /* renamed from: d */
        int f5089d;

        C1412a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5484a() {
            if (this.f5088c != null) {
                Arrays.fill(this.f5088c, -1);
            }
            this.f5089d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo5486a(int i) {
            if (this.f5088c != null) {
                int i2 = this.f5089d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f5088c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo5075a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f5089d * 2;
                if (this.f5088c == null) {
                    this.f5088c = new int[4];
                    Arrays.fill(this.f5088c, -1);
                } else if (i3 >= this.f5088c.length) {
                    int[] iArr = this.f5088c;
                    this.f5088c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f5088c, 0, iArr.length);
                }
                this.f5088c[i3] = i;
                this.f5088c[i3 + 1] = i2;
                this.f5089d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo5485a(RecyclerView recyclerView, boolean z) {
            this.f5089d = 0;
            if (this.f5088c != null) {
                Arrays.fill(this.f5088c, -1);
            }
            C1332i iVar = recyclerView.f4703n;
            if (recyclerView.f4702m != null && iVar != null && iVar.f4740D) {
                if (z) {
                    if (!recyclerView.f4695f.mo5751d()) {
                        iVar.mo4723a(recyclerView.f4702m.getItemCount(), (C1335a) this);
                    }
                } else if (!recyclerView.mo4882n()) {
                    iVar.mo4722a(this.f5086a, this.f5087b, recyclerView.f4646E, (C1335a) this);
                }
                if (this.f5089d > iVar.f4741E) {
                    iVar.f4741E = this.f5089d;
                    iVar.f4742F = z;
                    recyclerView.f4694e.mo5097b();
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.ad$b */
    static class C1413b {

        /* renamed from: a */
        public boolean f5090a;

        /* renamed from: b */
        public int f5091b;

        /* renamed from: c */
        public int f5092c;

        /* renamed from: d */
        public RecyclerView f5093d;

        /* renamed from: e */
        public int f5094e;

        C1413b() {
        }
    }

    C1410ad() {
    }

    public final void run() {
        long j;
        C1413b bVar;
        boolean z;
        long j2 = 0;
        try {
            C0968g.m2814a("RV Prefetch");
            if (this.f5082b.isEmpty()) {
                this.f5083c = 0;
                C0968g.m2813a();
                return;
            }
            int size = this.f5082b.size();
            long j3 = 0;
            for (int i = 0; i < size; i++) {
                RecyclerView recyclerView = (RecyclerView) this.f5082b.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f5083c = 0;
                C0968g.m2813a();
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(j3) + this.f5084d;
            int size2 = this.f5082b.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                RecyclerView recyclerView2 = (RecyclerView) this.f5082b.get(i3);
                if (recyclerView2.getWindowVisibility() == 0) {
                    recyclerView2.f4645D.mo5485a(recyclerView2, false);
                    i2 += recyclerView2.f4645D.f5089d;
                }
            }
            this.f5085f.ensureCapacity(i2);
            int i4 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                RecyclerView recyclerView3 = (RecyclerView) this.f5082b.get(i5);
                if (recyclerView3.getWindowVisibility() == 0) {
                    C1412a aVar = recyclerView3.f4645D;
                    int abs = Math.abs(aVar.f5086a) + Math.abs(aVar.f5087b);
                    int i6 = i4;
                    int i7 = 0;
                    while (i7 < aVar.f5089d * 2) {
                        if (i6 >= this.f5085f.size()) {
                            bVar = new C1413b();
                            this.f5085f.add(bVar);
                        } else {
                            bVar = (C1413b) this.f5085f.get(i6);
                        }
                        int i8 = aVar.f5088c[i7 + 1];
                        if (i8 <= abs) {
                            z = true;
                        } else {
                            z = false;
                        }
                        try {
                            bVar.f5090a = z;
                            bVar.f5091b = abs;
                            bVar.f5092c = i8;
                            bVar.f5093d = recyclerView3;
                            bVar.f5094e = aVar.f5088c[i7];
                            i6++;
                            i7 += 2;
                        } catch (Throwable th) {
                            th = th;
                            j2 = 0;
                            this.f5083c = j2;
                            C0968g.m2813a();
                            throw th;
                        }
                    }
                    i4 = i6;
                }
            }
            Collections.sort(this.f5085f, f5081e);
            for (int i9 = 0; i9 < this.f5085f.size(); i9++) {
                C1413b bVar2 = (C1413b) this.f5085f.get(i9);
                if (bVar2.f5093d == null) {
                    break;
                }
                if (bVar2.f5090a) {
                    j = Long.MAX_VALUE;
                } else {
                    j = nanos;
                }
                C1352v a = m4858a(bVar2.f5093d, bVar2.f5094e, j);
                if (a != null && a.mNestedRecyclerView != null && a.isBound() && !a.isInvalid()) {
                    RecyclerView recyclerView4 = (RecyclerView) a.mNestedRecyclerView.get();
                    if (recyclerView4 != null) {
                        if (recyclerView4.f4714y && recyclerView4.f4696g.mo5833b() != 0) {
                            recyclerView4.mo4813b();
                        }
                        C1412a aVar2 = recyclerView4.f4645D;
                        aVar2.mo5485a(recyclerView4, true);
                        if (aVar2.f5089d != 0) {
                            C0968g.m2814a("RV Nested Prefetch");
                            C1349s sVar = recyclerView4.f4646E;
                            C1322a aVar3 = recyclerView4.f4702m;
                            sVar.f4795d = 1;
                            sVar.f4796e = aVar3.getItemCount();
                            sVar.f4798g = false;
                            sVar.f4799h = false;
                            sVar.f4800i = false;
                            for (int i10 = 0; i10 < aVar2.f5089d * 2; i10 += 2) {
                                m4858a(recyclerView4, aVar2.f5088c[i10], nanos);
                            }
                            C0968g.m2813a();
                        }
                    }
                }
                bVar2.f5090a = false;
                bVar2.f5091b = 0;
                bVar2.f5092c = 0;
                bVar2.f5093d = null;
                bVar2.f5094e = 0;
            }
            this.f5083c = 0;
            C0968g.m2813a();
        } catch (Throwable th2) {
            th = th2;
            this.f5083c = j2;
            C0968g.m2813a();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5481a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f5083c == 0) {
            this.f5083c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1412a aVar = recyclerView.f4645D;
        aVar.f5086a = i;
        aVar.f5087b = i2;
    }

    /* renamed from: a */
    private static C1352v m4858a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b = recyclerView.f4696g.mo5833b();
        int i2 = 0;
        while (true) {
            if (i2 >= b) {
                z = false;
                break;
            }
            C1352v d = RecyclerView.m4272d(recyclerView.f4696g.mo5837c(i2));
            if (d.mPosition == i && !d.isInvalid()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        C1343o oVar = recyclerView.f4694e;
        try {
            recyclerView.mo4851g();
            C1352v a = oVar.mo5090a(i, false, j);
            if (a != null) {
                if (!a.isBound() || a.isInvalid()) {
                    oVar.mo5093a(a, false);
                } else {
                    oVar.mo5094a(a.itemView);
                }
            }
            return a;
        } finally {
            recyclerView.mo4805a(false);
        }
    }
}
