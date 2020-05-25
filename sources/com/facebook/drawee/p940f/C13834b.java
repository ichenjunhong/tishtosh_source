package com.facebook.drawee.p940f;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.common.p920d.C13689i;
import com.facebook.drawee.p939e.C13816q.C13818b;
import java.util.List;

/* renamed from: com.facebook.drawee.f.b */
public final class C13834b {

    /* renamed from: a */
    public static final C13818b f36085a = C13818b.f36066f;

    /* renamed from: b */
    public static final C13818b f36086b = C13818b.f36067g;

    /* renamed from: c */
    public Resources f36087c;

    /* renamed from: d */
    public int f36088d = 300;

    /* renamed from: e */
    public float f36089e = 0.0f;

    /* renamed from: f */
    public Drawable f36090f = null;

    /* renamed from: g */
    public C13818b f36091g = f36085a;

    /* renamed from: h */
    public Drawable f36092h = null;

    /* renamed from: i */
    public C13818b f36093i = f36085a;

    /* renamed from: j */
    public Drawable f36094j = null;

    /* renamed from: k */
    public C13818b f36095k = f36085a;

    /* renamed from: l */
    public Drawable f36096l = null;

    /* renamed from: m */
    public C13818b f36097m = f36085a;

    /* renamed from: n */
    public C13818b f36098n = f36086b;

    /* renamed from: o */
    public PointF f36099o = null;

    /* renamed from: p */
    public ColorFilter f36100p = null;

    /* renamed from: q */
    public Drawable f36101q = null;

    /* renamed from: r */
    public List<Drawable> f36102r = null;

    /* renamed from: s */
    public Drawable f36103s = null;

    /* renamed from: t */
    public C13837e f36104t = null;

    /* renamed from: u */
    private Matrix f36105u = null;

    /* renamed from: a */
    public final C13833a mo25912a() {
        m28086b();
        return new C13833a(this);
    }

    /* renamed from: b */
    private void m28086b() {
        if (this.f36102r != null) {
            for (Drawable a : this.f36102r) {
                C13689i.m27652a(a);
            }
        }
    }

    /* renamed from: a */
    public final C13834b mo25913a(int i) {
        this.f36088d = i;
        return this;
    }

    /* renamed from: b */
    public final C13834b mo25921b(Drawable drawable) {
        this.f36092h = drawable;
        return this;
    }

    /* renamed from: c */
    public final C13834b mo25924c(Drawable drawable) {
        this.f36094j = drawable;
        return this;
    }

    /* renamed from: d */
    public final C13834b mo25927d(Drawable drawable) {
        this.f36096l = drawable;
        return this;
    }

    /* renamed from: e */
    public final C13834b mo25929e(Drawable drawable) {
        this.f36101q = drawable;
        return this;
    }

    /* renamed from: a */
    public static C13834b m28085a(Resources resources) {
        return new C13834b(resources);
    }

    /* renamed from: b */
    public final C13834b mo25922b(C13818b bVar) {
        this.f36093i = bVar;
        return this;
    }

    /* renamed from: c */
    public final C13834b mo25925c(C13818b bVar) {
        this.f36095k = bVar;
        return this;
    }

    /* renamed from: d */
    public final C13834b mo25928d(C13818b bVar) {
        this.f36097m = bVar;
        return this;
    }

    /* renamed from: e */
    public final C13834b mo25930e(C13818b bVar) {
        this.f36098n = bVar;
        this.f36105u = null;
        return this;
    }

    /* renamed from: b */
    public final C13834b mo25920b(int i) {
        this.f36090f = this.f36087c.getDrawable(i);
        return this;
    }

    /* renamed from: c */
    public final C13834b mo25923c(int i) {
        this.f36092h = this.f36087c.getDrawable(i);
        return this;
    }

    /* renamed from: d */
    public final C13834b mo25926d(int i) {
        this.f36094j = this.f36087c.getDrawable(i);
        return this;
    }

    /* renamed from: a */
    public final C13834b mo25914a(ColorFilter colorFilter) {
        this.f36100p = colorFilter;
        return this;
    }

    /* renamed from: f */
    public final C13834b mo25931f(Drawable drawable) {
        if (drawable == null) {
            this.f36103s = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.f36103s = stateListDrawable;
        }
        return this;
    }

    public C13834b(Resources resources) {
        this.f36087c = resources;
    }

    /* renamed from: a */
    public final C13834b mo25915a(PointF pointF) {
        this.f36099o = pointF;
        return this;
    }

    /* renamed from: a */
    public final C13834b mo25916a(Drawable drawable) {
        this.f36090f = drawable;
        return this;
    }

    /* renamed from: a */
    public final C13834b mo25917a(C13818b bVar) {
        this.f36091g = bVar;
        return this;
    }

    /* renamed from: a */
    public final C13834b mo25918a(C13837e eVar) {
        this.f36104t = eVar;
        return this;
    }

    /* renamed from: a */
    public final C13834b mo25919a(List<Drawable> list) {
        this.f36102r = list;
        return this;
    }
}
