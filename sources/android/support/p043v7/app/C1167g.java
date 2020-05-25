package android.support.p043v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.view.C1230i;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.widget.C1452bc;
import android.support.p043v7.widget.C1505v;
import android.support.p043v7.widget.Toolbar;
import android.support.p043v7.widget.Toolbar.C1381b;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.g */
final class C1167g extends ActionBar {

    /* renamed from: a */
    C1505v f3814a;

    /* renamed from: b */
    boolean f3815b;

    /* renamed from: c */
    public Callback f3816c;

    /* renamed from: d */
    private boolean f3817d;

    /* renamed from: e */
    private boolean f3818e;

    /* renamed from: f */
    private ArrayList<Object> f3819f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f3820g = new Runnable() {
        /* JADX INFO: finally extract failed */
        public final void run() {
            C1246h hVar;
            C1167g gVar = C1167g.this;
            Menu h = gVar.mo3784h();
            if (h instanceof C1246h) {
                hVar = (C1246h) h;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                hVar.mo4137e();
            }
            try {
                h.clear();
                if (!gVar.f3816c.onCreatePanelMenu(0, h) || !gVar.f3816c.onPreparePanel(0, null, h)) {
                    h.clear();
                }
                if (hVar != null) {
                    hVar.mo4138f();
                }
            } catch (Throwable th) {
                if (hVar != null) {
                    hVar.mo4138f();
                }
                throw th;
            }
        }
    };

    /* renamed from: h */
    private final C1381b f3821h = new C1381b() {
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return C1167g.this.f3816c.onMenuItemSelected(0, menuItem);
        }
    };

    /* renamed from: android.support.v7.app.g$a */
    final class C1170a implements C1263a {

        /* renamed from: b */
        private boolean f3825b;

        C1170a() {
        }

        /* renamed from: a */
        public final boolean mo3716a(C1246h hVar) {
            if (C1167g.this.f3816c == null) {
                return false;
            }
            C1167g.this.f3816c.onMenuOpened(108, hVar);
            return true;
        }

        /* renamed from: a */
        public final void mo3715a(C1246h hVar, boolean z) {
            if (!this.f3825b) {
                this.f3825b = true;
                C1167g.this.f3814a.mo5690l();
                if (C1167g.this.f3816c != null) {
                    C1167g.this.f3816c.onPanelClosed(108, hVar);
                }
                this.f3825b = false;
            }
        }
    }

    /* renamed from: android.support.v7.app.g$b */
    final class C1171b implements C1247a {
        /* renamed from: a */
        public final boolean mo1290a(C1246h hVar, MenuItem menuItem) {
            return false;
        }

        C1171b() {
        }

        /* renamed from: a */
        public final void mo1289a(C1246h hVar) {
            if (C1167g.this.f3816c != null) {
                if (C1167g.this.f3814a.mo5685g()) {
                    C1167g.this.f3816c.onPanelClosed(108, hVar);
                } else if (C1167g.this.f3816c.onPreparePanel(0, null, hVar)) {
                    C1167g.this.f3816c.onMenuOpened(108, hVar);
                }
            }
        }
    }

    /* renamed from: android.support.v7.app.g$c */
    class C1172c extends C1230i {
        public final View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C1167g.this.f3814a.mo5676b());
            }
            return super.onCreatePanelView(i);
        }

        public C1172c(Callback callback) {
            super(callback);
        }

        public final boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !C1167g.this.f3815b) {
                C1167g.this.f3814a.mo5689k();
                C1167g.this.f3815b = true;
            }
            return onPreparePanel;
        }
    }

    /* renamed from: d */
    public final void mo3596d(boolean z) {
    }

    /* renamed from: e */
    public final void mo3598e(boolean z) {
    }

    /* renamed from: a */
    public final int mo3583a() {
        return this.f3814a.mo5691m();
    }

    /* renamed from: b */
    public final Context mo3592b() {
        return this.f3814a.mo5676b();
    }

    /* renamed from: c */
    public final boolean mo3595c() {
        return this.f3814a.mo5687i();
    }

    /* renamed from: d */
    public final boolean mo3597d() {
        return this.f3814a.mo5688j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo3602g() {
        this.f3814a.mo5667a().removeCallbacks(this.f3820g);
    }

    /* renamed from: e */
    public final boolean mo3599e() {
        this.f3814a.mo5667a().removeCallbacks(this.f3820g);
        C1056u.m3034a((View) this.f3814a.mo5667a(), this.f3820g);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Menu mo3784h() {
        if (!this.f3817d) {
            this.f3814a.mo5670a((C1263a) new C1170a(), (C1247a) new C1171b());
            this.f3817d = true;
        }
        return this.f3814a.mo5693o();
    }

    /* renamed from: f */
    public final boolean mo3601f() {
        if (!this.f3814a.mo5679c()) {
            return false;
        }
        this.f3814a.mo5680d();
        return true;
    }

    /* renamed from: a */
    public final void mo3587a(Configuration configuration) {
        super.mo3587a(configuration);
    }

    /* renamed from: a */
    public final void mo3585a(float f) {
        C1056u.m3048c((View) this.f3814a.mo5667a(), f);
    }

    /* renamed from: b */
    public final void mo3593b(boolean z) {
        m3491a(0, 8);
    }

    /* renamed from: f */
    public final void mo3600f(boolean z) {
        if (z != this.f3818e) {
            this.f3818e = z;
            int size = this.f3819f.size();
            for (int i = 0; i < size; i++) {
                this.f3819f.get(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo3586a(int i) {
        this.f3814a.mo5681d(i);
    }

    /* renamed from: a */
    public final void mo3588a(CharSequence charSequence) {
        this.f3814a.mo5674a(charSequence);
    }

    /* renamed from: a */
    public final void mo3589a(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        m3491a(i, 4);
    }

    /* renamed from: a */
    public final boolean mo3591a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo3595c();
        }
        return true;
    }

    /* renamed from: a */
    private void m3491a(int i, int i2) {
        this.f3814a.mo5678c((i & i2) | ((i2 ^ -1) & this.f3814a.mo5691m()));
    }

    /* renamed from: a */
    public final boolean mo3590a(int i, KeyEvent keyEvent) {
        int i2;
        Menu h = mo3784h();
        if (h == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        h.setQwertyMode(z);
        return h.performShortcut(i, keyEvent, 0);
    }

    C1167g(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f3814a = new C1452bc(toolbar, false);
        this.f3816c = new C1172c(callback);
        this.f3814a.mo5673a(this.f3816c);
        toolbar.setOnMenuItemClickListener(this.f3821h);
        this.f3814a.mo5674a(charSequence);
    }
}
