package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.drawee.p935b.C13780b;
import com.facebook.drawee.p935b.C13780b.C13781a;
import com.facebook.drawee.p939e.C13831t;
import com.facebook.drawee.p939e.C13832u;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.drawee.p942h.C13843b;

/* renamed from: com.facebook.drawee.view.b */
public final class C13848b<DH extends C13843b> implements C13832u {

    /* renamed from: a */
    public boolean f36127a;

    /* renamed from: b */
    DH f36128b;

    /* renamed from: c */
    public C13842a f36129c;

    /* renamed from: d */
    public final C13780b f36130d = C13780b.m27909a();

    /* renamed from: e */
    private boolean f36131e;

    /* renamed from: f */
    private boolean f36132f = true;

    /* renamed from: i */
    private void m28159i() {
        if (!this.f36127a || !this.f36132f) {
            m28158h();
        } else {
            m28157g();
        }
    }

    /* renamed from: b */
    public final void mo25982b() {
        this.f36130d.mo25731a(C13781a.ON_HOLDER_ATTACH);
        this.f36127a = true;
        m28159i();
    }

    /* renamed from: c */
    public final void mo25983c() {
        this.f36130d.mo25731a(C13781a.ON_HOLDER_DETACH);
        this.f36127a = false;
        m28159i();
    }

    /* renamed from: d */
    public final DH mo25984d() {
        return (C13843b) C13689i.m27652a(this.f36128b);
    }

    /* renamed from: e */
    public final Drawable mo25985e() {
        if (this.f36128b == null) {
            return null;
        }
        return this.f36128b.mo25888a();
    }

    /* renamed from: f */
    private boolean m28156f() {
        if (this.f36129c == null || this.f36129c.mo25745e() != this.f36128b) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m28158h() {
        if (this.f36131e) {
            this.f36130d.mo25731a(C13781a.ON_DETACH_CONTROLLER);
            this.f36131e = false;
            if (m28156f()) {
                this.f36129c.mo25747g();
            }
        }
    }

    /* renamed from: g */
    private void m28157g() {
        if (!this.f36131e) {
            this.f36130d.mo25731a(C13781a.ON_ATTACH_CONTROLLER);
            this.f36131e = true;
            if (!(this.f36129c == null || this.f36129c.mo25745e() == null)) {
                this.f36129c.mo25746f();
            }
        }
    }

    /* renamed from: a */
    public final void mo25886a() {
        if (!this.f36131e) {
            C13697a.m27687b(C13780b.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f36129c)), toString());
            this.f36127a = true;
            this.f36132f = true;
            m28159i();
        }
    }

    public final String toString() {
        return C13685h.m27644a(this).mo25582a("controllerAttached", this.f36131e).mo25582a("holderAttached", this.f36127a).mo25582a("drawableVisible", this.f36132f).mo25581a("events", (Object) this.f36130d.toString()).toString();
    }

    /* renamed from: a */
    private void m28155a(C13832u uVar) {
        Drawable e = mo25985e();
        if (e instanceof C13831t) {
            ((C13831t) e).mo25885a(uVar);
        }
    }

    public C13848b(DH dh) {
        if (dh != null) {
            mo25980a(dh);
        }
    }

    /* renamed from: a */
    public final void mo25887a(boolean z) {
        C13781a aVar;
        if (this.f36132f != z) {
            C13780b bVar = this.f36130d;
            if (z) {
                aVar = C13781a.ON_DRAWABLE_SHOW;
            } else {
                aVar = C13781a.ON_DRAWABLE_HIDE;
            }
            bVar.mo25731a(aVar);
            this.f36132f = z;
            m28159i();
        }
    }

    /* renamed from: a */
    public final void mo25979a(C13842a aVar) {
        boolean z = this.f36131e;
        if (z) {
            m28158h();
        }
        if (m28156f()) {
            this.f36130d.mo25731a(C13781a.ON_CLEAR_OLD_CONTROLLER);
            this.f36129c.mo25709a((C13843b) null);
        }
        this.f36129c = aVar;
        if (this.f36129c != null) {
            this.f36130d.mo25731a(C13781a.ON_SET_CONTROLLER);
            this.f36129c.mo25709a((C13843b) this.f36128b);
        } else {
            this.f36130d.mo25731a(C13781a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m28157g();
        }
    }

    /* renamed from: a */
    public final void mo25980a(DH dh) {
        boolean z;
        this.f36130d.mo25731a(C13781a.ON_SET_HIERARCHY);
        boolean f = m28156f();
        m28155a((C13832u) null);
        this.f36128b = (C13843b) C13689i.m27652a(dh);
        Drawable a = this.f36128b.mo25888a();
        if (a == null || a.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        mo25887a(z);
        m28155a((C13832u) this);
        if (f) {
            this.f36129c.mo25709a((C13843b) dh);
        }
    }

    /* renamed from: a */
    public final boolean mo25981a(MotionEvent motionEvent) {
        if (!m28156f()) {
            return false;
        }
        return this.f36129c.mo25740a(motionEvent);
    }

    /* renamed from: a */
    public static <DH extends C13843b> C13848b<DH> m28154a(DH dh, Context context) {
        return new C13848b<>(dh);
    }
}
