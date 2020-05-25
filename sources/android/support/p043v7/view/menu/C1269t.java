package android.support.p043v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.widget.C1418ai;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.view.menu.t */
final class C1269t extends C1259m implements C1262o, OnKeyListener, OnItemClickListener, OnDismissListener {

    /* renamed from: e */
    private static final int f4298e = 2132213779;

    /* renamed from: a */
    final C1418ai f4299a;

    /* renamed from: b */
    final OnGlobalLayoutListener f4300b = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (C1269t.this.mo4077e() && !C1269t.this.f4299a.f4619v) {
                View view = C1269t.this.f4301c;
                if (view == null || !view.isShown()) {
                    C1269t.this.dismiss();
                    return;
                }
                C1269t.this.f4299a.mo4075d();
            }
        }
    };

    /* renamed from: c */
    View f4301c;

    /* renamed from: d */
    ViewTreeObserver f4302d;

    /* renamed from: f */
    private final Context f4303f;

    /* renamed from: h */
    private final C1246h f4304h;

    /* renamed from: i */
    private final C1245g f4305i;

    /* renamed from: j */
    private final boolean f4306j;

    /* renamed from: k */
    private final int f4307k;

    /* renamed from: l */
    private final int f4308l;

    /* renamed from: m */
    private final int f4309m;

    /* renamed from: n */
    private final OnAttachStateChangeListener f4310n = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C1269t.this.f4302d != null) {
                if (!C1269t.this.f4302d.isAlive()) {
                    C1269t.this.f4302d = view.getViewTreeObserver();
                }
                C1269t.this.f4302d.removeGlobalOnLayoutListener(C1269t.this.f4300b);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: o */
    private OnDismissListener f4311o;

    /* renamed from: p */
    private View f4312p;

    /* renamed from: q */
    private C1263a f4313q;

    /* renamed from: r */
    private boolean f4314r;

    /* renamed from: s */
    private boolean f4315s;

    /* renamed from: t */
    private int f4316t;

    /* renamed from: u */
    private int f4317u = 0;

    /* renamed from: v */
    private boolean f4318v;

    /* renamed from: a */
    public final void mo1083a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public final void mo4068a(C1246h hVar) {
    }

    /* renamed from: a */
    public final boolean mo1087a() {
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo1092c() {
        return null;
    }

    /* renamed from: f */
    public final ListView mo4078f() {
        return this.f4299a.mo4078f();
    }

    public final void dismiss() {
        if (mo4077e()) {
            this.f4299a.dismiss();
        }
    }

    /* renamed from: e */
    public final boolean mo4077e() {
        if (this.f4314r || !this.f4299a.mo4077e()) {
            return false;
        }
        return true;
    }

    public final void onDismiss() {
        this.f4314r = true;
        this.f4304h.close();
        if (this.f4302d != null) {
            if (!this.f4302d.isAlive()) {
                this.f4302d = this.f4301c.getViewTreeObserver();
            }
            this.f4302d.removeGlobalOnLayoutListener(this.f4300b);
            this.f4302d = null;
        }
        this.f4301c.removeOnAttachStateChangeListener(this.f4310n);
        if (this.f4311o != null) {
            this.f4311o.onDismiss();
        }
    }

    /* renamed from: d */
    public final void mo4075d() {
        boolean z;
        boolean z2 = true;
        if (!mo4077e()) {
            if (this.f4314r || this.f4312p == null) {
                z2 = false;
            } else {
                this.f4301c = this.f4312p;
                this.f4299a.mo4771a((OnDismissListener) this);
                this.f4299a.f4614q = this;
                this.f4299a.mo4772a(true);
                View view = this.f4301c;
                if (this.f4302d == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f4302d = view.getViewTreeObserver();
                if (z) {
                    this.f4302d.addOnGlobalLayoutListener(this.f4300b);
                }
                view.addOnAttachStateChangeListener(this.f4310n);
                this.f4299a.f4612o = view;
                this.f4299a.f4607j = this.f4317u;
                if (!this.f4315s) {
                    this.f4316t = m3905a(this.f4305i, null, this.f4303f, this.f4307k);
                    this.f4315s = true;
                }
                this.f4299a.mo4774b(this.f4316t);
                this.f4299a.mo4778d(2);
                this.f4299a.f4618u = this.f4284g;
                this.f4299a.mo4075d();
                ListView f = this.f4299a.mo4078f();
                f.setOnKeyListener(this);
                if (this.f4318v && this.f4304h.f4221g != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f4303f).inflate(R.layout.s, f, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f4304h.f4221g);
                    }
                    frameLayout.setEnabled(false);
                    f.addHeaderView(frameLayout, null, false);
                }
                this.f4299a.mo4588a((ListAdapter) this.f4305i);
                this.f4299a.mo4075d();
            }
        }
        if (!z2) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public final void mo4067a(int i) {
        this.f4317u = i;
    }

    /* renamed from: b */
    public final void mo4071b(int i) {
        this.f4299a.f4605h = i;
    }

    /* renamed from: c */
    public final void mo4073c(int i) {
        this.f4299a.mo4769a(i);
    }

    /* renamed from: b */
    public final void mo4072b(boolean z) {
        this.f4305i.f4208b = z;
    }

    /* renamed from: c */
    public final void mo4074c(boolean z) {
        this.f4318v = z;
    }

    /* renamed from: a */
    public final void mo1085a(C1263a aVar) {
        this.f4313q = aVar;
    }

    /* renamed from: a */
    public final void mo4069a(View view) {
        this.f4312p = view;
    }

    /* renamed from: a */
    public final void mo4070a(OnDismissListener onDismissListener) {
        this.f4311o = onDismissListener;
    }

    /* renamed from: a */
    public final void mo1086a(boolean z) {
        this.f4315s = false;
        if (this.f4305i != null) {
            this.f4305i.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1089a(android.support.p043v7.view.menu.C1272u r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0071
            android.support.v7.view.menu.n r0 = new android.support.v7.view.menu.n
            android.content.Context r3 = r9.f4303f
            android.view.View r5 = r9.f4301c
            boolean r6 = r9.f4306j
            int r7 = r9.f4308l
            int r8 = r9.f4309m
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.support.v7.view.menu.o$a r2 = r9.f4313q
            r0.mo4275a(r2)
            boolean r2 = android.support.p043v7.view.menu.C1259m.m3907b(r10)
            r0.mo4276a(r2)
            android.widget.PopupWindow$OnDismissListener r2 = r9.f4311o
            r0.f4287c = r2
            r2 = 0
            r9.f4311o = r2
            android.support.v7.view.menu.h r2 = r9.f4304h
            r2.mo4126b(r1)
            android.support.v7.widget.ai r2 = r9.f4299a
            int r2 = r2.f4605h
            android.support.v7.widget.ai r3 = r9.f4299a
            int r3 = r3.mo4776c()
            int r4 = r9.f4317u
            android.view.View r5 = r9.f4312p
            int r5 = android.support.p030v4.view.C1056u.m3055f(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x0052
            android.view.View r4 = r9.f4312p
            int r4 = r4.getWidth()
            int r2 = r2 + r4
        L_0x0052:
            boolean r4 = r0.mo4279d()
            r5 = 1
            if (r4 == 0) goto L_0x005b
        L_0x0059:
            r0 = 1
            goto L_0x0065
        L_0x005b:
            android.view.View r4 = r0.f4285a
            if (r4 != 0) goto L_0x0061
            r0 = 0
            goto L_0x0065
        L_0x0061:
            r0.mo4274a(r2, r3, r5, r5)
            goto L_0x0059
        L_0x0065:
            if (r0 == 0) goto L_0x0071
            android.support.v7.view.menu.o$a r0 = r9.f4313q
            if (r0 == 0) goto L_0x0070
            android.support.v7.view.menu.o$a r0 = r9.f4313q
            r0.mo3716a(r10)
        L_0x0070:
            return r5
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.view.menu.C1269t.mo1089a(android.support.v7.view.menu.u):boolean");
    }

    /* renamed from: a */
    public final void mo1084a(C1246h hVar, boolean z) {
        if (hVar == this.f4304h) {
            dismiss();
            if (this.f4313q != null) {
                this.f4313q.mo3715a(hVar, z);
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public C1269t(Context context, C1246h hVar, View view, int i, int i2, boolean z) {
        this.f4303f = context;
        this.f4304h = hVar;
        this.f4306j = z;
        this.f4305i = new C1245g(hVar, LayoutInflater.from(context), this.f4306j, f4298e);
        this.f4308l = i;
        this.f4309m = i2;
        Resources resources = context.getResources();
        this.f4307k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
        this.f4312p = view;
        this.f4299a = new C1418ai(this.f4303f, null, this.f4308l, this.f4309m);
        hVar.mo4111a((C1262o) this, context);
    }
}
