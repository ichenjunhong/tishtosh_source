package android.support.design.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: android.support.design.widget.o */
final class C0563o {

    /* renamed from: e */
    private static C0563o f2045e;

    /* renamed from: a */
    final Object f2046a = new Object();

    /* renamed from: b */
    final Handler f2047b = new Handler(Looper.getMainLooper(), new Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0563o oVar = C0563o.this;
            C0566b bVar = (C0566b) message.obj;
            synchronized (oVar.f2046a) {
                if (oVar.f2048c == bVar || oVar.f2049d == bVar) {
                    oVar.mo1758a(bVar, 2);
                }
            }
            return true;
        }
    });

    /* renamed from: c */
    C0566b f2048c;

    /* renamed from: d */
    C0566b f2049d;

    /* renamed from: android.support.design.widget.o$a */
    interface C0565a {
        /* renamed from: a */
        void mo1247a();

        void dismiss(int i);
    }

    /* renamed from: android.support.design.widget.o$b */
    static class C0566b {

        /* renamed from: a */
        final WeakReference<C0565a> f2051a;

        /* renamed from: b */
        int f2052b;

        /* renamed from: c */
        boolean f2053c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo1768a(C0565a aVar) {
            if (aVar == null || this.f2051a.get() != aVar) {
                return false;
            }
            return true;
        }

        C0566b(int i, C0565a aVar) {
            this.f2051a = new WeakReference<>(aVar);
            this.f2052b = i;
        }
    }

    /* renamed from: a */
    static C0563o m1554a() {
        if (f2045e == null) {
            f2045e = new C0563o();
        }
        return f2045e;
    }

    private C0563o() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1759b() {
        if (this.f2049d != null) {
            this.f2048c = this.f2049d;
            this.f2049d = null;
            C0565a aVar = (C0565a) this.f2048c.f2051a.get();
            if (aVar != null) {
                aVar.mo1247a();
                return;
            }
            this.f2048c = null;
        }
    }

    /* renamed from: d */
    public final boolean mo1762d(C0565a aVar) {
        boolean f;
        synchronized (this.f2046a) {
            f = mo1765f(aVar);
        }
        return f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo1765f(C0565a aVar) {
        if (this.f2048c == null || !this.f2048c.mo1768a(aVar)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo1766g(C0565a aVar) {
        if (this.f2049d == null || !this.f2049d.mo1768a(aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1756a(C0565a aVar) {
        synchronized (this.f2046a) {
            if (mo1765f(aVar)) {
                mo1757a(this.f2048c);
            }
        }
    }

    /* renamed from: c */
    public final void mo1761c(C0565a aVar) {
        synchronized (this.f2046a) {
            if (mo1765f(aVar) && this.f2048c.f2053c) {
                this.f2048c.f2053c = false;
                mo1757a(this.f2048c);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo1764e(C0565a aVar) {
        boolean z;
        synchronized (this.f2046a) {
            if (!mo1765f(aVar)) {
                if (!mo1766g(aVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1757a(C0566b bVar) {
        if (bVar.f2052b != -2) {
            int i = 2750;
            if (bVar.f2052b > 0) {
                i = bVar.f2052b;
            } else if (bVar.f2052b == -1) {
                i = 1500;
            }
            this.f2047b.removeCallbacksAndMessages(bVar);
            this.f2047b.sendMessageDelayed(Message.obtain(this.f2047b, 0, bVar), (long) i);
        }
    }

    /* renamed from: b */
    public final void mo1760b(C0565a aVar) {
        synchronized (this.f2046a) {
            if (mo1765f(aVar) && !this.f2048c.f2053c) {
                this.f2048c.f2053c = true;
                this.f2047b.removeCallbacksAndMessages(this.f2048c);
            }
        }
    }

    public final void dismiss(C0565a aVar, int i) {
        synchronized (this.f2046a) {
            if (mo1765f(aVar)) {
                mo1758a(this.f2048c, i);
            } else if (mo1766g(aVar)) {
                mo1758a(this.f2049d, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1758a(C0566b bVar, int i) {
        C0565a aVar = (C0565a) bVar.f2051a.get();
        if (aVar == null) {
            return false;
        }
        this.f2047b.removeCallbacksAndMessages(bVar);
        aVar.dismiss(i);
        return true;
    }
}
