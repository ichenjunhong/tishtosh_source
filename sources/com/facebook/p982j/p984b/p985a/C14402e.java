package com.facebook.p982j.p984b.p985a;

import android.util.SparseArray;
import android.view.animation.Interpolator;
import com.facebook.p982j.p984b.C14394a;
import java.util.List;

/* renamed from: com.facebook.j.b.a.e */
public abstract class C14402e<T extends C14394a, M> {

    /* renamed from: a */
    private final SparseArray<T> f37396a;

    /* renamed from: b */
    private final List<Interpolator> f37397b;

    /* renamed from: c */
    private final int f37398c;

    /* renamed from: d */
    private final int f37399d;

    protected C14402e() {
    }

    /* renamed from: a */
    protected static float m29510a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26581a(T t, T t2, float f, M m);

    public C14402e(List<T> list, float[][][] fArr) {
        int size = list.size();
        this.f37396a = new SparseArray<>(size);
        for (int i = 0; i < size; i++) {
            C14394a aVar = (C14394a) list.get(i);
            this.f37396a.put(aVar.mo26578a(), aVar);
        }
        this.f37398c = this.f37396a.keyAt(0);
        this.f37399d = this.f37396a.keyAt(size - 1);
        this.f37397b = C14395a.m29502a(fArr);
    }

    /* renamed from: a */
    public void mo26579a(float f, M m) {
        C14394a aVar;
        C14394a aVar2 = null;
        if (this.f37397b.isEmpty() || f <= ((float) this.f37398c)) {
            mo26581a((C14394a) this.f37396a.get(this.f37398c), null, 0.0f, m);
        } else if (f >= ((float) this.f37399d)) {
            mo26581a((C14394a) this.f37396a.get(this.f37399d), null, 0.0f, m);
        } else {
            int size = this.f37397b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    aVar = null;
                    break;
                } else if (((float) this.f37396a.keyAt(i)) == f || (((float) this.f37396a.keyAt(i)) < f && ((float) this.f37396a.keyAt(i + 1)) > f)) {
                    aVar2 = (C14394a) this.f37396a.valueAt(i);
                    aVar = (C14394a) this.f37396a.valueAt(i + 1);
                } else {
                    i++;
                }
            }
            mo26581a(aVar2, aVar, ((Interpolator) this.f37397b.get(i)).getInterpolation((f - ((float) aVar2.mo26578a())) / ((float) (aVar.mo26578a() - aVar2.mo26578a()))), m);
        }
    }
}
