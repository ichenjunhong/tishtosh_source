package com.facebook.fresco.animation.p947a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.C13737b;
import com.facebook.fresco.animation.p947a.C13857a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.fresco.animation.a.c */
public final class C13859c<T extends C13857a> extends C13858b<T> {

    /* renamed from: b */
    final C13737b f36148b;

    /* renamed from: c */
    public boolean f36149c;

    /* renamed from: d */
    long f36150d;

    /* renamed from: e */
    public long f36151e = 2000;

    /* renamed from: f */
    public long f36152f = 1000;

    /* renamed from: g */
    public C13861a f36153g;

    /* renamed from: h */
    private final ScheduledExecutorService f36154h;

    /* renamed from: i */
    private final Runnable f36155i = new Runnable() {
        public final void run() {
            synchronized (C13859c.this) {
                boolean z = false;
                C13859c.this.f36149c = false;
                C13859c cVar = C13859c.this;
                if (cVar.f36148b.now() - cVar.f36150d > cVar.f36151e) {
                    z = true;
                }
                if (!z) {
                    C13859c.this.mo26007f();
                } else if (C13859c.this.f36153g != null) {
                    C13859c.this.f36153g.mo26009f();
                }
            }
        }
    };

    /* renamed from: com.facebook.fresco.animation.a.c$a */
    public interface C13861a {
        /* renamed from: f */
        void mo26009f();
    }

    /* renamed from: f */
    public final synchronized void mo26007f() {
        if (!this.f36149c) {
            this.f36149c = true;
            this.f36154h.schedule(this.f36155i, this.f36152f, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final boolean mo26000a(Drawable drawable, Canvas canvas, int i) {
        this.f36150d = this.f36148b.now();
        boolean a = super.mo26000a(drawable, canvas, i);
        mo26007f();
        return a;
    }

    public C13859c(T t, C13861a aVar, C13737b bVar, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f36153g = aVar;
        this.f36148b = bVar;
        this.f36154h = scheduledExecutorService;
    }
}
