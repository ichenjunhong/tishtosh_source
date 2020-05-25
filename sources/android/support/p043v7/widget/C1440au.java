package android.support.p043v7.widget;

import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1327f.C1329b;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;

/* renamed from: android.support.v7.widget.au */
public abstract class C1440au extends C1327f {

    /* renamed from: m */
    public boolean f5184m = true;

    /* renamed from: a */
    public abstract boolean mo5626a(C1352v vVar);

    /* renamed from: a */
    public abstract boolean mo5627a(C1352v vVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo5628a(C1352v vVar, C1352v vVar2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo5629b(C1352v vVar);

    /* renamed from: g */
    public final void mo5630g(C1352v vVar) {
        mo5003e(vVar);
    }

    /* renamed from: h */
    public final void mo5631h(C1352v vVar) {
        mo5003e(vVar);
    }

    /* renamed from: i */
    public final void mo5632i(C1352v vVar) {
        mo5003e(vVar);
    }

    /* renamed from: f */
    public final boolean mo5004f(C1352v vVar) {
        if (!this.f5184m || vVar.isInvalid()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo5625a(C1352v vVar, boolean z) {
        mo5003e(vVar);
    }

    /* renamed from: a */
    public final boolean mo4994a(C1352v vVar, C1329b bVar, C1329b bVar2) {
        int i;
        int i2;
        int i3 = bVar.f4732a;
        int i4 = bVar.f4733b;
        View view = vVar.itemView;
        if (bVar2 == null) {
            i = view.getLeft();
        } else {
            i = bVar2.f4732a;
        }
        int i5 = i;
        if (bVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = bVar2.f4733b;
        }
        int i6 = i2;
        if (vVar.isRemoved() || (i3 == i5 && i4 == i6)) {
            return mo5626a(vVar);
        }
        view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
        return mo5627a(vVar, i3, i4, i5, i6);
    }

    /* renamed from: b */
    public final boolean mo4998b(C1352v vVar, C1329b bVar, C1329b bVar2) {
        if (bVar == null || (bVar.f4732a == bVar2.f4732a && bVar.f4733b == bVar2.f4733b)) {
            return mo5629b(vVar);
        }
        return mo5627a(vVar, bVar.f4732a, bVar.f4733b, bVar2.f4732a, bVar2.f4733b);
    }

    /* renamed from: c */
    public final boolean mo5000c(C1352v vVar, C1329b bVar, C1329b bVar2) {
        if (bVar.f4732a == bVar2.f4732a && bVar.f4733b == bVar2.f4733b) {
            mo5631h(vVar);
            return false;
        }
        return mo5627a(vVar, bVar.f4732a, bVar.f4733b, bVar2.f4732a, bVar2.f4733b);
    }

    /* renamed from: a */
    public final boolean mo4995a(C1352v vVar, C1352v vVar2, C1329b bVar, C1329b bVar2) {
        int i;
        int i2;
        int i3 = bVar.f4732a;
        int i4 = bVar.f4733b;
        if (vVar2.shouldIgnore()) {
            int i5 = bVar.f4732a;
            i = bVar.f4733b;
            i2 = i5;
        } else {
            i2 = bVar2.f4732a;
            i = bVar2.f4733b;
        }
        return mo5628a(vVar, vVar2, i3, i4, i2, i);
    }
}
