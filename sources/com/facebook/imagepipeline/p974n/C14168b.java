package com.facebook.imagepipeline.p974n;

import com.facebook.common.p921e.C13697a;

/* renamed from: com.facebook.imagepipeline.n.b */
public abstract class C14168b<T> implements C14188k<T> {

    /* renamed from: a */
    private boolean f36990a;

    /* renamed from: a */
    public static boolean m29025a(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: a */
    public static boolean m29026a(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: b */
    public static boolean m29028b(int i, int i2) {
        return (i & 10) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26239a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26240a(float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26241a(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26242a(Throwable th);

    /* renamed from: b */
    public final synchronized void mo26402b() {
        if (!this.f36990a) {
            this.f36990a = true;
            try {
                mo26239a();
            } catch (Exception e) {
                m29024a(e);
            }
        }
    }

    /* renamed from: a */
    private void m29024a(Exception exc) {
        C13697a.m27693c(getClass(), "unhandled exception", (Throwable) exc);
    }

    /* renamed from: b */
    public static boolean m29027b(int i) {
        if (!m29025a(i)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void mo26403b(float f) {
        if (!this.f36990a) {
            try {
                mo26240a(f);
            } catch (Exception e) {
                m29024a(e);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo26405b(Throwable th) {
        if (!this.f36990a) {
            this.f36990a = true;
            try {
                mo26242a(th);
            } catch (Exception e) {
                m29024a(e);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo26404b(T t, int i) {
        if (!this.f36990a) {
            this.f36990a = m29025a(i);
            try {
                mo26241a(t, i);
            } catch (Exception e) {
                m29024a(e);
            }
        }
    }
}
