package com.p683ss.android.ugc.aweme.common.p1589a;

import android.support.p030v4.p038f.C0801o;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.a.c */
public final class C26836c<T> {

    /* renamed from: c */
    private static final List<Object> f70662c = Collections.emptyList();

    /* renamed from: a */
    protected C0801o<C26835b<T>> f70663a = new C0801o<>();

    /* renamed from: b */
    public C26835b<T> f70664b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r5v0, types: [java.util.List] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54767a(T r2, int r3, android.support.p043v7.widget.RecyclerView.C1352v r4, java.util.List<java.lang.Object> r5) {
        /*
            r1 = this;
            int r0 = r4.mItemViewType
            com.ss.android.ugc.aweme.common.a.b r0 = r1.m64863a(r0)
            if (r0 == 0) goto L_0x0011
            if (r5 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            java.util.List<java.lang.Object> r5 = f70662c
        L_0x000d:
            r0.mo51022a(r2, r3, r4, r5)
            return
        L_0x0011:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No delegate found for item at position = "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = " for viewType = "
            r5.append(r3)
            int r3 = r4.mItemViewType
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.common.p1589a.C26836c.mo54767a(java.lang.Object, int, android.support.v7.widget.RecyclerView$v, java.util.List):void");
    }

    /* renamed from: a */
    private C26835b<T> m64863a(int i) {
        return (C26835b) this.f70663a.mo2592a(i, this.f70664b);
    }

    /* renamed from: a */
    public final C26836c<T> mo54763a(C26835b<T> bVar) {
        int c = this.f70663a.mo2596c();
        while (this.f70663a.mo2591a(c) != null) {
            c++;
            if (c == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        return mo54762a(c, false, bVar);
    }

    /* renamed from: b */
    public final void mo54768b(RecyclerView recyclerView) {
        if (this.f70663a != null) {
            for (int i = 0; i < this.f70663a.mo2596c(); i++) {
                if (this.f70663a.mo2600d(i) != null) {
                    ((C26835b) this.f70663a.mo2600d(i)).mo54759b(recyclerView);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo54770c(C1352v vVar) {
        C26835b a = m64863a(vVar.mItemViewType);
        if (a != null) {
            a.mo54756a(vVar);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(vVar);
        sb.append(" for item at position = ");
        sb.append(vVar.getAdapterPosition());
        sb.append(" for viewType = ");
        sb.append(vVar.mItemViewType);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: d */
    public final void mo54771d(C1352v vVar) {
        C26835b a = m64863a(vVar.mItemViewType);
        if (a != null) {
            a.mo54758b(vVar);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(vVar);
        sb.append(" for item at position = ");
        sb.append(vVar.getAdapterPosition());
        sb.append(" for viewType = ");
        sb.append(vVar.mItemViewType);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo54769b(C1352v vVar) {
        if (m64863a(vVar.mItemViewType) != null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(vVar);
        sb.append(" for item at position = ");
        sb.append(vVar.getAdapterPosition());
        sb.append(" for viewType = ");
        sb.append(vVar.mItemViewType);
        throw new NullPointerException(sb.toString());
    }

    /* renamed from: a */
    public final void mo54764a(C1352v vVar) {
        if (m64863a(vVar.mItemViewType) == null) {
            StringBuilder sb = new StringBuilder("No delegate found for ");
            sb.append(vVar);
            sb.append(" for item at position = ");
            sb.append(vVar.getAdapterPosition());
            sb.append(" for viewType = ");
            sb.append(vVar.mItemViewType);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo54765a(RecyclerView recyclerView) {
        if (this.f70663a != null) {
            for (int i = 0; i < this.f70663a.mo2596c(); i++) {
                if (this.f70663a.mo2600d(i) != null) {
                    ((C26835b) this.f70663a.mo2600d(i)).mo54757a(recyclerView);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo54760a(T t, int i) {
        if (t != null) {
            int c = this.f70663a.mo2596c();
            for (int i2 = 0; i2 < c; i2++) {
                if (((C26835b) this.f70663a.mo2600d(i2)).mo51023a(t, i)) {
                    return this.f70663a.mo2597c(i2);
                }
            }
            if (this.f70664b != null) {
                return 2147483646;
            }
            StringBuilder sb = new StringBuilder("No AdapterDelegate added that matches position=");
            sb.append(i);
            sb.append(" delegates=");
            sb.append(this.f70663a);
            sb.append(" items=");
            sb.append(t);
            throw new NullPointerException(sb.toString());
        }
        throw new NullPointerException("Items datasource is null!");
    }

    /* renamed from: a */
    public final C1352v mo54761a(ViewGroup viewGroup, int i) {
        C26835b a = m64863a(i);
        if (a != null) {
            C1352v a2 = a.mo51021a(viewGroup);
            if (a2 != null) {
                return a2;
            }
            StringBuilder sb = new StringBuilder("ViewHolder returned from AdapterDelegate ");
            sb.append(a);
            sb.append(" for ViewType =");
            sb.append(i);
            sb.append(" is null!");
            throw new NullPointerException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("No AdapterDelegate added for ViewType ");
        sb2.append(i);
        throw new NullPointerException(sb2.toString());
    }

    /* renamed from: a */
    public final void mo54766a(T t, int i, C1352v vVar) {
        mo54767a(t, i, vVar, f70662c);
    }

    /* renamed from: a */
    public final C26836c<T> mo54762a(int i, boolean z, C26835b<T> bVar) {
        if (bVar == null) {
            throw new NullPointerException("AdapterDelegate is null!");
        } else if (i == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (this.f70663a.mo2591a(i) == null) {
            this.f70663a.mo2595b(i, bVar);
            return this;
        } else {
            StringBuilder sb = new StringBuilder("An AdapterDelegate is already registered for the viewType = ");
            sb.append(i);
            sb.append(". Already registered AdapterDelegate is ");
            sb.append(this.f70663a.mo2591a(i));
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
