package com.squareup.p1094a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.p1094a.C18396v.C18402d;
import com.squareup.p1094a.C18396v.C18403e;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.a.a */
abstract class C18341a<T> {

    /* renamed from: a */
    public final C18396v f50649a;

    /* renamed from: b */
    public final C18409y f50650b;

    /* renamed from: c */
    final WeakReference<T> f50651c;

    /* renamed from: d */
    final boolean f50652d;

    /* renamed from: e */
    public final int f50653e;

    /* renamed from: f */
    public final int f50654f;

    /* renamed from: g */
    final int f50655g;

    /* renamed from: h */
    final Drawable f50656h;

    /* renamed from: i */
    public final String f50657i;

    /* renamed from: j */
    public final Object f50658j;

    /* renamed from: k */
    public boolean f50659k;

    /* renamed from: l */
    public boolean f50660l;

    /* renamed from: com.squareup.a.a$a */
    static class C18342a<M> extends WeakReference<M> {

        /* renamed from: a */
        final C18341a f50661a;

        public C18342a(C18341a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f50661a = aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo36781a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo36782a(Bitmap bitmap, C18402d dVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36783b() {
        this.f50660l = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C18403e mo36785d() {
        return this.f50650b.f50856r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final T mo36784c() {
        if (this.f50651c == null) {
            return null;
        }
        return this.f50651c.get();
    }

    C18341a(C18396v vVar, T t, C18409y yVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        WeakReference<T> weakReference;
        this.f50649a = vVar;
        this.f50650b = yVar;
        if (t == null) {
            weakReference = null;
        } else {
            weakReference = new C18342a<>(this, t, vVar.f50803j);
        }
        this.f50651c = weakReference;
        this.f50653e = i;
        this.f50654f = i2;
        this.f50652d = z;
        this.f50655g = i3;
        this.f50656h = drawable;
        this.f50657i = str;
        if (obj == 0) {
            obj = this;
        }
        this.f50658j = obj;
    }
}
