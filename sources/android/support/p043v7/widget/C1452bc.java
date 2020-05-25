package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1016aa;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.C1063y;
import android.support.p030v4.view.C1067z;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.view.menu.C1233a;
import android.support.p043v7.view.menu.C1246h;
import android.support.p043v7.view.menu.C1246h.C1247a;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.widget.Toolbar.LayoutParams;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window.Callback;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.bc */
public final class C1452bc implements C1505v {

    /* renamed from: a */
    Toolbar f5234a;

    /* renamed from: b */
    CharSequence f5235b;

    /* renamed from: c */
    Callback f5236c;

    /* renamed from: d */
    boolean f5237d;

    /* renamed from: e */
    private int f5238e;

    /* renamed from: f */
    private View f5239f;

    /* renamed from: g */
    private View f5240g;

    /* renamed from: h */
    private Drawable f5241h;

    /* renamed from: i */
    private Drawable f5242i;

    /* renamed from: j */
    private Drawable f5243j;

    /* renamed from: k */
    private boolean f5244k;

    /* renamed from: l */
    private CharSequence f5245l;

    /* renamed from: m */
    private CharSequence f5246m;

    /* renamed from: n */
    private ActionMenuPresenter f5247n;

    /* renamed from: o */
    private int f5248o;

    /* renamed from: p */
    private int f5249p;

    /* renamed from: q */
    private Drawable f5250q;

    /* renamed from: a */
    public final ViewGroup mo5667a() {
        return this.f5234a;
    }

    /* renamed from: k */
    public final void mo5689k() {
        this.f5237d = true;
    }

    /* renamed from: m */
    public final int mo5691m() {
        return this.f5238e;
    }

    /* renamed from: n */
    public final int mo5692n() {
        return this.f5248o;
    }

    /* renamed from: d */
    public final void mo5680d() {
        this.f5234a.collapseActionView();
    }

    /* renamed from: e */
    public final CharSequence mo5682e() {
        return this.f5234a.getTitle();
    }

    /* renamed from: f */
    public final boolean mo5684f() {
        return this.f5234a.canShowOverflowMenu();
    }

    /* renamed from: g */
    public final boolean mo5685g() {
        return this.f5234a.isOverflowMenuShowing();
    }

    /* renamed from: h */
    public final boolean mo5686h() {
        return this.f5234a.isOverflowMenuShowPending();
    }

    /* renamed from: i */
    public final boolean mo5687i() {
        return this.f5234a.showOverflowMenu();
    }

    /* renamed from: j */
    public final boolean mo5688j() {
        return this.f5234a.hideOverflowMenu();
    }

    /* renamed from: l */
    public final void mo5690l() {
        this.f5234a.dismissPopupMenus();
    }

    /* renamed from: o */
    public final Menu mo5693o() {
        return this.f5234a.getMenu();
    }

    /* renamed from: c */
    public final boolean mo5679c() {
        return this.f5234a.hasExpandedActionView();
    }

    /* renamed from: p */
    private void m5053p() {
        Drawable drawable;
        if ((this.f5238e & 2) == 0) {
            drawable = null;
        } else if ((this.f5238e & 1) == 0) {
            drawable = this.f5241h;
        } else if (this.f5242i != null) {
            drawable = this.f5242i;
        } else {
            drawable = this.f5241h;
        }
        this.f5234a.setLogo(drawable);
    }

    /* renamed from: q */
    private void m5054q() {
        Drawable drawable;
        if ((this.f5238e & 4) != 0) {
            Toolbar toolbar = this.f5234a;
            if (this.f5243j != null) {
                drawable = this.f5243j;
            } else {
                drawable = this.f5250q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f5234a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: r */
    private void m5055r() {
        if ((this.f5238e & 4) != 0) {
            if (TextUtils.isEmpty(this.f5246m)) {
                this.f5234a.setNavigationContentDescription(this.f5249p);
                return;
            }
            this.f5234a.setNavigationContentDescription(this.f5246m);
        }
    }

    /* renamed from: b */
    public final Context mo5676b() {
        return this.f5234a.getContext();
    }

    /* renamed from: b */
    private void m5050b(Drawable drawable) {
        this.f5242i = drawable;
        m5053p();
    }

    /* renamed from: c */
    private void m5052c(CharSequence charSequence) {
        this.f5246m = charSequence;
        m5055r();
    }

    /* renamed from: a */
    public final void mo5669a(Drawable drawable) {
        this.f5241h = drawable;
        m5053p();
    }

    /* renamed from: b */
    private void m5051b(CharSequence charSequence) {
        this.f5235b = charSequence;
        if ((this.f5238e & 8) != 0) {
            this.f5234a.setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo5668a(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1124a.m3315b(mo5676b(), i);
        } else {
            drawable = null;
        }
        mo5669a(drawable);
    }

    /* renamed from: d */
    public final void mo5681d(int i) {
        String str;
        if (i == 0) {
            str = null;
        } else {
            str = mo5676b().getString(i);
        }
        m5052c((CharSequence) str);
    }

    /* renamed from: e */
    public final void mo5683e(int i) {
        this.f5234a.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo5677b(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1124a.m3315b(mo5676b(), i);
        } else {
            drawable = null;
        }
        m5050b(drawable);
    }

    /* renamed from: a */
    public final void mo5671a(C1436at atVar) {
        if (this.f5239f != null && this.f5239f.getParent() == this.f5234a) {
            this.f5234a.removeView(this.f5239f);
        }
        this.f5239f = atVar;
        if (atVar != null && this.f5248o == 2) {
            this.f5234a.addView(this.f5239f, 0);
            LayoutParams layoutParams = (LayoutParams) this.f5239f.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f3592a = 8388691;
            atVar.setAllowCollapse(true);
        }
    }

    /* renamed from: c */
    public final void mo5678c(int i) {
        int i2 = this.f5238e ^ i;
        this.f5238e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m5055r();
                }
                m5054q();
            }
            if ((i2 & 3) != 0) {
                m5053p();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f5234a.setTitle(this.f5235b);
                    this.f5234a.setSubtitle(this.f5245l);
                } else {
                    this.f5234a.setTitle((CharSequence) null);
                    this.f5234a.setSubtitle((CharSequence) null);
                }
            }
            if (!((i2 & 16) == 0 || this.f5240g == null)) {
                if ((i & 16) != 0) {
                    this.f5234a.addView(this.f5240g);
                    return;
                }
                this.f5234a.removeView(this.f5240g);
            }
        }
    }

    /* renamed from: a */
    public final void mo5673a(Callback callback) {
        this.f5236c = callback;
    }

    /* renamed from: a */
    public final void mo5674a(CharSequence charSequence) {
        if (!this.f5244k) {
            m5051b(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo5675a(boolean z) {
        this.f5234a.setCollapsible(z);
    }

    public C1452bc(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.ax, R.drawable.a0);
    }

    /* renamed from: a */
    public final C1063y mo5666a(final int i, long j) {
        float f;
        C1063y m = C1056u.m3067m(this.f5234a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return m.mo3244a(f).mo3245a(j).mo3247a((C1067z) new C1016aa() {

            /* renamed from: c */
            private boolean f5255c;

            /* renamed from: c */
            public final void mo3182c(View view) {
                this.f5255c = true;
            }

            /* renamed from: a */
            public final void mo3180a(View view) {
                C1452bc.this.f5234a.setVisibility(0);
            }

            /* renamed from: b */
            public final void mo3181b(View view) {
                if (!this.f5255c) {
                    C1452bc.this.f5234a.setVisibility(i);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo5670a(C1263a aVar, C1247a aVar2) {
        this.f5234a.setMenuCallbacks(aVar, aVar2);
    }

    /* renamed from: a */
    public final void mo5672a(Menu menu, C1263a aVar) {
        if (this.f5247n == null) {
            this.f5247n = new ActionMenuPresenter(this.f5234a.getContext());
            this.f5247n.f4151h = R.id.ai;
        }
        this.f5247n.mo1085a(aVar);
        this.f5234a.setMenu((C1246h) menu, this.f5247n);
    }

    private C1452bc(Toolbar toolbar, boolean z, int i, int i2) {
        boolean z2;
        this.f5234a = toolbar;
        this.f5235b = toolbar.getTitle();
        this.f5245l = toolbar.getSubtitle();
        if (this.f5235b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f5244k = z2;
        this.f5243j = toolbar.getNavigationIcon();
        C1451bb a = C1451bb.m5032a(toolbar.getContext(), null, new int[]{R.attr.bt, R.attr.bw, R.attr.bx, R.attr.i5, R.attr.i6, R.attr.i7, R.attr.i8, R.attr.i9, R.attr.i_, R.attr.j8, R.attr.js, R.attr.jt, R.attr.k_, R.attr.n0, R.attr.n7, R.attr.nh, R.attr.ni, R.attr.nl, R.attr.oc, R.attr.po, R.attr.t8, R.attr.un, R.attr.vs, R.attr.wa, R.attr.wb, R.attr.a3v, R.attr.a3y, R.attr.a6u, R.attr.a76}, R.attr.f, 0);
        this.f5250q = a.mo5652a(15);
        if (z) {
            CharSequence c = a.mo5658c(27);
            if (!TextUtils.isEmpty(c)) {
                this.f5244k = true;
                m5051b(c);
            }
            CharSequence c2 = a.mo5658c(25);
            if (!TextUtils.isEmpty(c2)) {
                this.f5245l = c2;
                if ((this.f5238e & 8) != 0) {
                    this.f5234a.setSubtitle(c2);
                }
            }
            Drawable a2 = a.mo5652a(20);
            if (a2 != null) {
                m5050b(a2);
            }
            Drawable a3 = a.mo5652a(17);
            if (a3 != null) {
                mo5669a(a3);
            }
            if (this.f5243j == null && this.f5250q != null) {
                this.f5243j = this.f5250q;
                m5054q();
            }
            mo5678c(a.mo5650a(10, 0));
            int g = a.mo5665g(9, 0);
            if (g != 0) {
                View inflate = LayoutInflater.from(this.f5234a.getContext()).inflate(g, this.f5234a, false);
                if (!(this.f5240g == null || (this.f5238e & 16) == 0)) {
                    this.f5234a.removeView(this.f5240g);
                }
                this.f5240g = inflate;
                if (!(inflate == null || (this.f5238e & 16) == 0)) {
                    this.f5234a.addView(this.f5240g);
                }
                mo5678c(this.f5238e | 16);
            }
            int f = a.mo5663f(13, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f5234a.getLayoutParams();
                layoutParams.height = f;
                this.f5234a.setLayoutParams(layoutParams);
            }
            int d = a.mo5659d(7, -1);
            int d2 = a.mo5659d(3, -1);
            if (d >= 0 || d2 >= 0) {
                this.f5234a.setContentInsetsRelative(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo5665g(28, 0);
            if (g2 != 0) {
                this.f5234a.setTitleTextAppearance(this.f5234a.getContext(), g2);
            }
            int g3 = a.mo5665g(26, 0);
            if (g3 != 0) {
                this.f5234a.setSubtitleTextAppearance(this.f5234a.getContext(), g3);
            }
            int g4 = a.mo5665g(22, 0);
            if (g4 != 0) {
                this.f5234a.setPopupTheme(g4);
            }
        } else {
            int i3 = 11;
            if (this.f5234a.getNavigationIcon() != null) {
                this.f5250q = this.f5234a.getNavigationIcon();
                i3 = 15;
            }
            this.f5238e = i3;
        }
        a.mo5653a();
        if (R.string.ax != this.f5249p) {
            this.f5249p = R.string.ax;
            if (TextUtils.isEmpty(this.f5234a.getNavigationContentDescription())) {
                mo5681d(this.f5249p);
            }
        }
        this.f5246m = this.f5234a.getNavigationContentDescription();
        this.f5234a.setNavigationOnClickListener(new OnClickListener() {

            /* renamed from: a */
            final C1233a f5251a;

            {
                C1233a aVar = new C1233a(C1452bc.this.f5234a.getContext(), 0, 16908332, 0, 0, C1452bc.this.f5235b);
                this.f5251a = aVar;
            }

            public final void onClick(View view) {
                if (C1452bc.this.f5236c != null && C1452bc.this.f5237d) {
                    C1452bc.this.f5236c.onMenuItemSelected(0, this.f5251a);
                }
            }
        });
    }
}
