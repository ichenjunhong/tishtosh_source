package android.arch.lifecycle;

import android.arch.lifecycle.C0176h.C0177a;
import android.os.Handler;

/* renamed from: android.arch.lifecycle.u */
public final class C0201u implements C0184k {

    /* renamed from: i */
    static final C0201u f468i = new C0201u();

    /* renamed from: a */
    int f469a;

    /* renamed from: b */
    int f470b;

    /* renamed from: c */
    boolean f471c = true;

    /* renamed from: d */
    boolean f472d = true;

    /* renamed from: e */
    Handler f473e;

    /* renamed from: f */
    final C0185l f474f = new C0185l(this);

    /* renamed from: g */
    Runnable f475g = new Runnable() {
        public final void run() {
            C0201u uVar = C0201u.this;
            if (uVar.f470b == 0) {
                uVar.f471c = true;
                uVar.f474f.mo332a(C0177a.ON_PAUSE);
            }
            C0201u.this.mo346b();
        }
    };

    /* renamed from: h */
    public C0206a f476h = new C0206a() {
        /* renamed from: a */
        public final void mo348a() {
            C0201u uVar = C0201u.this;
            uVar.f469a++;
            if (uVar.f469a == 1 && uVar.f472d) {
                uVar.f474f.mo332a(C0177a.ON_START);
                uVar.f472d = false;
            }
        }

        /* renamed from: b */
        public final void mo349b() {
            C0201u uVar = C0201u.this;
            uVar.f470b++;
            if (uVar.f470b == 1) {
                if (uVar.f471c) {
                    uVar.f474f.mo332a(C0177a.ON_RESUME);
                    uVar.f471c = false;
                    return;
                }
                uVar.f473e.removeCallbacks(uVar.f475g);
            }
        }
    };

    /* renamed from: a */
    public static C0184k m422a() {
        return f468i;
    }

    public final C0176h getLifecycle() {
        return this.f474f;
    }

    private C0201u() {
    }

    /* renamed from: b */
    public final void mo346b() {
        if (this.f469a == 0 && this.f471c) {
            this.f474f.mo332a(C0177a.ON_STOP);
            this.f472d = true;
        }
    }
}
