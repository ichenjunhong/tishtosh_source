package com.facebook.fresco.animation.p952c;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.p921e.C13697a;
import com.facebook.drawee.p939e.C13801d;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p954d.C13884a;
import com.facebook.fresco.animation.p954d.C13885b;
import com.facebook.fresco.animation.p954d.C13886c;
import com.facebook.p945f.p946a.C13856a;

/* renamed from: com.facebook.fresco.animation.c.a */
public class C13877a extends Drawable implements Animatable, C13856a {

    /* renamed from: c */
    public static C13885b f36197c;

    /* renamed from: j */
    private static final Class<?> f36198j = C13877a.class;

    /* renamed from: k */
    private static final C13882b f36199k = new C13883c();

    /* renamed from: a */
    public int f36200a;

    /* renamed from: b */
    public boolean f36201b;

    /* renamed from: d */
    public C13857a f36202d;

    /* renamed from: e */
    public long f36203e;

    /* renamed from: f */
    public long f36204f;

    /* renamed from: g */
    public long f36205g;

    /* renamed from: h */
    public volatile C13879a f36206h;

    /* renamed from: i */
    public final Runnable f36207i;

    /* renamed from: l */
    private C13884a f36208l;

    /* renamed from: m */
    private volatile boolean f36209m;

    /* renamed from: n */
    private long f36210n;

    /* renamed from: o */
    private long f36211o;

    /* renamed from: p */
    private int f36212p;

    /* renamed from: q */
    private int f36213q;

    /* renamed from: r */
    private volatile C13882b f36214r;

    /* renamed from: s */
    private C13801d f36215s;

    /* renamed from: com.facebook.fresco.animation.c.a$a */
    public interface C13879a {
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f36209m;
    }

    public C13877a() {
        this(null, null);
    }

    /* renamed from: c */
    private static long m28271c() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public final void mo25995a() {
        if (this.f36202d != null) {
            this.f36202d.mo26003c();
        }
    }

    public int getIntrinsicHeight() {
        if (this.f36202d == null) {
            return super.getIntrinsicHeight();
        }
        return this.f36202d.mo26001b();
    }

    public int getIntrinsicWidth() {
        if (this.f36202d == null) {
            return super.getIntrinsicWidth();
        }
        return this.f36202d.mo25996a();
    }

    /* renamed from: b */
    public final long mo26026b() {
        if (this.f36202d == null) {
            return 0;
        }
        if (this.f36208l != null) {
            return this.f36208l.mo23161a();
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f36202d.mo26005d(); i2++) {
            i += this.f36202d.mo26004c(i2);
        }
        return (long) i;
    }

    public void start() {
        if (!this.f36209m && this.f36202d != null && this.f36202d.mo26005d() > 1) {
            this.f36209m = true;
            this.f36203e = m28271c();
            this.f36211o = this.f36203e;
            this.f36210n = -1;
            this.f36212p = -1;
            invalidateSelf();
            this.f36214r.mo26040a(this);
        }
    }

    public void stop() {
        if (this.f36209m) {
            this.f36209m = false;
            this.f36203e = 0;
            this.f36211o = this.f36203e;
            this.f36210n = -1;
            this.f36212p = -1;
            unscheduleSelf(this.f36207i);
            this.f36214r.mo26042b(this);
        }
    }

    /* renamed from: a */
    public final void mo26025a(C13882b bVar) {
        if (bVar == null) {
            bVar = f36199k;
        }
        this.f36214r = bVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f36202d != null) {
            this.f36202d.mo25999a(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f36209m) {
            return false;
        }
        long j = (long) i;
        if (this.f36210n == j) {
            return false;
        }
        this.f36210n = j;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        if (this.f36215s == null) {
            this.f36215s = new C13801d();
        }
        this.f36215s.f35967a = i;
        if (this.f36202d != null) {
            this.f36202d.mo25997a(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f36215s == null) {
            this.f36215s = new C13801d();
        }
        this.f36215s.mo25807a(colorFilter);
        if (this.f36202d != null) {
            this.f36202d.mo25998a(colorFilter);
        }
    }

    /* renamed from: a */
    public final void mo26024a(C13857a aVar) {
        this.f36202d = aVar;
        if (this.f36202d != null) {
            this.f36208l = new C13886c(this.f36202d);
            this.f36202d.mo25999a(getBounds());
            if (this.f36215s != null) {
                this.f36215s.mo25808a((Drawable) this);
            }
        }
        this.f36208l = m28270a(this.f36202d, null);
        stop();
    }

    public void draw(Canvas canvas) {
        long j;
        if (this.f36202d != null && this.f36208l != null) {
            long c = m28271c();
            if (this.f36209m) {
                j = (c - this.f36203e) + this.f36205g;
            } else {
                j = Math.max(this.f36210n, 0);
            }
            int a = this.f36208l.mo23160a(j, this.f36210n);
            if (a == -1) {
                a = this.f36202d.mo26005d() - 1;
                this.f36214r.mo26042b(this);
                this.f36209m = false;
            } else if (a == 0 && this.f36212p != -1 && c >= this.f36211o) {
                this.f36214r.mo26043c(this);
            }
            boolean a2 = this.f36202d.mo26000a(this, canvas, a);
            if (a2) {
                this.f36214r.mo26041a(this, a);
                this.f36212p = a;
            }
            if (!a2) {
                this.f36213q++;
                if (C13697a.m27683a(2)) {
                    C13697a.m27673a(f36198j, "Dropped a frame. Count: %s", (Object) Integer.valueOf(this.f36213q));
                }
            }
            long c2 = m28271c();
            if (this.f36209m) {
                long a3 = this.f36208l.mo23162a(c2 - this.f36203e);
                if (a3 != -1) {
                    this.f36211o = this.f36203e + a3 + this.f36204f;
                    scheduleSelf(this.f36207i, this.f36211o);
                }
            }
            if (this.f36206h != null) {
                boolean z = this.f36209m;
            }
            this.f36210n = j;
        }
    }

    /* renamed from: a */
    private static C13884a m28270a(C13857a aVar, Object obj) {
        if (aVar == null) {
            return null;
        }
        if (f36197c != null) {
            C13884a a = f36197c.mo23184a(aVar, obj);
            if (a != null) {
                return a;
            }
        }
        return new C13886c(aVar);
    }

    public C13877a(C13857a aVar, Object obj) {
        this.f36200a = -1000;
        this.f36204f = 8;
        this.f36214r = f36199k;
        this.f36207i = new Runnable() {
            public final void run() {
                C13877a.this.unscheduleSelf(C13877a.this.f36207i);
                C13877a.this.invalidateSelf();
            }
        };
        this.f36202d = aVar;
        this.f36208l = m28270a(this.f36202d, obj);
    }
}
