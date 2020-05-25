package com.facebook.fresco.animation.p947a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.fresco.animation.p947a.C13857a;

/* renamed from: com.facebook.fresco.animation.a.b */
public class C13858b<T extends C13857a> implements C13857a {

    /* renamed from: a */
    public T f36144a;

    /* renamed from: b */
    private int f36145b = -1;

    /* renamed from: c */
    private ColorFilter f36146c;

    /* renamed from: d */
    private Rect f36147d;

    /* renamed from: a */
    public final int mo25996a() {
        if (this.f36144a == null) {
            return -1;
        }
        return this.f36144a.mo25996a();
    }

    /* renamed from: b */
    public final int mo26001b() {
        if (this.f36144a == null) {
            return -1;
        }
        return this.f36144a.mo26001b();
    }

    /* renamed from: d */
    public final int mo26005d() {
        if (this.f36144a == null) {
            return 0;
        }
        return this.f36144a.mo26005d();
    }

    /* renamed from: e */
    public int mo26006e() {
        if (this.f36144a == null) {
            return 0;
        }
        return this.f36144a.mo26006e();
    }

    /* renamed from: c */
    public final void mo26003c() {
        if (this.f36144a != null) {
            this.f36144a.mo26003c();
        }
    }

    public C13858b(T t) {
        this.f36144a = t;
    }

    /* renamed from: c */
    public final int mo26004c(int i) {
        if (this.f36144a == null) {
            return 0;
        }
        return this.f36144a.mo26004c(i);
    }

    /* renamed from: a */
    public final void mo25997a(int i) {
        if (this.f36144a != null) {
            this.f36144a.mo25997a(i);
        }
        this.f36145b = i;
    }

    /* renamed from: b */
    public final boolean mo26002b(int i) {
        if (this.f36144a != null) {
            return this.f36144a.mo26002b(i);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo25998a(ColorFilter colorFilter) {
        if (this.f36144a != null) {
            this.f36144a.mo25998a(colorFilter);
        }
        this.f36146c = colorFilter;
    }

    /* renamed from: a */
    public final void mo25999a(Rect rect) {
        if (this.f36144a != null) {
            this.f36144a.mo25999a(rect);
        }
        this.f36147d = rect;
    }

    /* renamed from: a */
    public boolean mo26000a(Drawable drawable, Canvas canvas, int i) {
        if (this.f36144a == null || !this.f36144a.mo26000a(drawable, canvas, i)) {
            return false;
        }
        return true;
    }
}
