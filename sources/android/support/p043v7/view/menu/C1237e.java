package android.support.p043v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.view.menu.C1262o.C1263a;
import android.support.p043v7.widget.C1417ah;
import android.support.p043v7.widget.C1418ai;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C1237e extends C1259m implements C1262o, OnKeyListener, OnDismissListener {

    /* renamed from: h */
    private static final int f4158h = 2132213771;

    /* renamed from: A */
    private C1263a f4159A;

    /* renamed from: B */
    private OnDismissListener f4160B;

    /* renamed from: a */
    final Handler f4161a;

    /* renamed from: b */
    final List<C1242a> f4162b = new ArrayList();

    /* renamed from: c */
    final OnGlobalLayoutListener f4163c = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (C1237e.this.mo4077e() && C1237e.this.f4162b.size() > 0 && !((C1242a) C1237e.this.f4162b.get(0)).f4192a.f4619v) {
                View view = C1237e.this.f4164d;
                if (view == null || !view.isShown()) {
                    C1237e.this.dismiss();
                    return;
                }
                for (C1242a aVar : C1237e.this.f4162b) {
                    aVar.f4192a.mo4075d();
                }
            }
        }
    };

    /* renamed from: d */
    View f4164d;

    /* renamed from: e */
    ViewTreeObserver f4165e;

    /* renamed from: f */
    boolean f4166f;

    /* renamed from: i */
    private final Context f4167i;

    /* renamed from: j */
    private final int f4168j;

    /* renamed from: k */
    private final int f4169k;

    /* renamed from: l */
    private final int f4170l;

    /* renamed from: m */
    private final boolean f4171m;

    /* renamed from: n */
    private final List<C1246h> f4172n = new ArrayList();

    /* renamed from: o */
    private final OnAttachStateChangeListener f4173o = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C1237e.this.f4165e != null) {
                if (!C1237e.this.f4165e.isAlive()) {
                    C1237e.this.f4165e = view.getViewTreeObserver();
                }
                C1237e.this.f4165e.removeGlobalOnLayoutListener(C1237e.this.f4163c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: p */
    private final C1417ah f4174p = new C1417ah() {
        /* renamed from: a */
        public final void mo4085a(C1246h hVar, MenuItem menuItem) {
            C1237e.this.f4161a.removeCallbacksAndMessages(hVar);
        }

        /* renamed from: b */
        public final void mo4086b(final C1246h hVar, final MenuItem menuItem) {
            final C1242a aVar = null;
            C1237e.this.f4161a.removeCallbacksAndMessages(null);
            int size = C1237e.this.f4162b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (hVar == ((C1242a) C1237e.this.f4162b.get(i)).f4193b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C1237e.this.f4162b.size()) {
                    aVar = (C1242a) C1237e.this.f4162b.get(i2);
                }
                C1237e.this.f4161a.postAtTime(new Runnable() {
                    public final void run() {
                        if (aVar != null) {
                            C1237e.this.f4166f = true;
                            aVar.f4193b.mo4126b(false);
                            C1237e.this.f4166f = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            hVar.mo4113a(menuItem, 4);
                        }
                    }
                }, hVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: q */
    private int f4175q = 0;

    /* renamed from: r */
    private int f4176r = 0;

    /* renamed from: s */
    private View f4177s;

    /* renamed from: t */
    private int f4178t;

    /* renamed from: u */
    private boolean f4179u;

    /* renamed from: v */
    private boolean f4180v;

    /* renamed from: w */
    private int f4181w;

    /* renamed from: x */
    private int f4182x;

    /* renamed from: y */
    private boolean f4183y;

    /* renamed from: z */
    private boolean f4184z;

    /* renamed from: android.support.v7.view.menu.e$a */
    static class C1242a {

        /* renamed from: a */
        public final C1418ai f4192a;

        /* renamed from: b */
        public final C1246h f4193b;

        /* renamed from: c */
        public final int f4194c;

        /* renamed from: a */
        public final ListView mo4088a() {
            return this.f4192a.mo4078f();
        }

        public C1242a(C1418ai aiVar, C1246h hVar, int i) {
            this.f4192a = aiVar;
            this.f4193b = hVar;
            this.f4194c = i;
        }
    }

    /* renamed from: a */
    public final void mo1083a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public final boolean mo1087a() {
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo1092c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo4079g() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1089a(C1272u uVar) {
        for (C1242a aVar : this.f4162b) {
            if (uVar == aVar.f4193b) {
                aVar.mo4088a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        mo4068a((C1246h) uVar);
        if (this.f4159A != null) {
            this.f4159A.mo3716a(uVar);
        }
        return true;
    }

    /* renamed from: i */
    private int m3787i() {
        if (C1056u.m3055f(this.f4177s) == 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: e */
    public final boolean mo4077e() {
        if (this.f4162b.size() <= 0 || !((C1242a) this.f4162b.get(0)).f4192a.mo4077e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final ListView mo4078f() {
        if (this.f4162b.isEmpty()) {
            return null;
        }
        return ((C1242a) this.f4162b.get(this.f4162b.size() - 1)).mo4088a();
    }

    /* renamed from: h */
    private C1418ai m3786h() {
        C1418ai aiVar = new C1418ai(this.f4167i, null, this.f4169k, this.f4170l);
        aiVar.f5113a = this.f4174p;
        aiVar.f4614q = this;
        aiVar.mo4771a((OnDismissListener) this);
        aiVar.f4612o = this.f4177s;
        aiVar.f4607j = this.f4176r;
        aiVar.mo4772a(true);
        aiVar.mo4778d(2);
        return aiVar;
    }

    public final void dismiss() {
        int size = this.f4162b.size();
        if (size > 0) {
            C1242a[] aVarArr = (C1242a[]) this.f4162b.toArray(new C1242a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1242a aVar = aVarArr[i];
                if (aVar.f4192a.mo4077e()) {
                    aVar.f4192a.dismiss();
                }
            }
        }
    }

    public final void onDismiss() {
        C1242a aVar;
        int size = this.f4162b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C1242a) this.f4162b.get(i);
            if (!aVar.f4192a.mo4077e()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f4193b.mo4126b(false);
        }
    }

    /* renamed from: d */
    public final void mo4075d() {
        boolean z;
        if (!mo4077e()) {
            for (C1246h c : this.f4172n) {
                m3784c(c);
            }
            this.f4172n.clear();
            this.f4164d = this.f4177s;
            if (this.f4164d != null) {
                if (this.f4165e == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f4165e = this.f4164d.getViewTreeObserver();
                if (z) {
                    this.f4165e.addOnGlobalLayoutListener(this.f4163c);
                }
                this.f4164d.addOnAttachStateChangeListener(this.f4173o);
            }
        }
    }

    /* renamed from: b */
    public final void mo4072b(boolean z) {
        this.f4183y = z;
    }

    /* renamed from: a */
    public final void mo1085a(C1263a aVar) {
        this.f4159A = aVar;
    }

    /* renamed from: b */
    public final void mo4071b(int i) {
        this.f4179u = true;
        this.f4181w = i;
    }

    /* renamed from: c */
    public final void mo4073c(int i) {
        this.f4180v = true;
        this.f4182x = i;
    }

    /* renamed from: a */
    public final void mo4070a(OnDismissListener onDismissListener) {
        this.f4160B = onDismissListener;
    }

    /* renamed from: c */
    public final void mo4074c(boolean z) {
        this.f4184z = z;
    }

    /* renamed from: d */
    private int m3785d(int i) {
        ListView a = ((C1242a) this.f4162b.get(this.f4162b.size() - 1)).mo4088a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f4164d.getWindowVisibleDisplayFrame(rect);
        if (this.f4178t == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo4067a(int i) {
        if (this.f4175q != i) {
            this.f4175q = i;
            this.f4176r = C1039e.m2968a(i, C1056u.m3055f(this.f4177s));
        }
    }

    /* renamed from: a */
    public final void mo4068a(C1246h hVar) {
        hVar.mo4111a((C1262o) this, this.f4167i);
        if (mo4077e()) {
            m3784c(hVar);
        } else {
            this.f4172n.add(hVar);
        }
    }

    /* renamed from: c */
    private void m3784c(C1246h hVar) {
        View view;
        C1242a aVar;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f4167i);
        C1245g gVar = new C1245g(hVar, from, this.f4171m, f4158h);
        if (!mo4077e() && this.f4183y) {
            gVar.f4208b = true;
        } else if (mo4077e()) {
            gVar.f4208b = C1259m.m3907b(hVar);
        }
        int a = m3905a(gVar, null, this.f4167i, this.f4168j);
        C1418ai h = m3786h();
        h.mo4588a((ListAdapter) gVar);
        h.mo4774b(a);
        h.f4607j = this.f4176r;
        if (this.f4162b.size() > 0) {
            aVar = (C1242a) this.f4162b.get(this.f4162b.size() - 1);
            view = m3783a(aVar, hVar);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            h.mo5501c(false);
            h.mo5500a(null);
            int d = m3785d(a);
            if (d == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f4178t = d;
            if (VERSION.SDK_INT >= 26) {
                h.f4612o = view;
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f4177s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f4176r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f4177s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f4176r & 5) == 5) {
                if (z) {
                    i3 = i + a;
                } else {
                    i3 = i - view.getWidth();
                }
            } else if (z) {
                i3 = i + view.getWidth();
            } else {
                i3 = i - a;
            }
            h.f4605h = i3;
            h.mo4775b(true);
            h.mo4769a(i2);
        } else {
            if (this.f4179u) {
                h.f4605h = this.f4181w;
            }
            if (this.f4180v) {
                h.mo4769a(this.f4182x);
            }
            h.f4618u = this.f4284g;
        }
        this.f4162b.add(new C1242a(h, hVar, this.f4178t));
        h.mo4075d();
        ListView f = h.mo4078f();
        f.setOnKeyListener(this);
        if (aVar == null && this.f4184z && hVar.f4221g != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.s, f, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(hVar.f4221g);
            f.addHeaderView(frameLayout, null, false);
            h.mo4075d();
        }
    }

    /* renamed from: a */
    public final void mo4069a(View view) {
        if (this.f4177s != view) {
            this.f4177s = view;
            this.f4176r = C1039e.m2968a(this.f4175q, C1056u.m3055f(this.f4177s));
        }
    }

    /* renamed from: a */
    public final void mo1086a(boolean z) {
        for (C1242a a : this.f4162b) {
            m3906a(a.mo4088a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private static MenuItem m3782a(C1246h hVar, C1246h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m3783a(C1242a aVar, C1246h hVar) {
        int i;
        C1245g gVar;
        MenuItem a = m3782a(aVar.f4193b, hVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo4088a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C1245g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C1245g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == gVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: a */
    public final void mo1084a(C1246h hVar, boolean z) {
        int size = this.f4162b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (hVar == ((C1242a) this.f4162b.get(i)).f4193b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f4162b.size()) {
                ((C1242a) this.f4162b.get(i2)).f4193b.mo4126b(false);
            }
            C1242a aVar = (C1242a) this.f4162b.remove(i);
            aVar.f4193b.mo4125b((C1262o) this);
            if (this.f4166f) {
                C1418ai aiVar = aVar.f4192a;
                if (VERSION.SDK_INT >= 23) {
                    aiVar.f4620w.setExitTransition(null);
                }
                aVar.f4192a.f4620w.setAnimationStyle(0);
            }
            aVar.f4192a.dismiss();
            int size2 = this.f4162b.size();
            if (size2 > 0) {
                this.f4178t = ((C1242a) this.f4162b.get(size2 - 1)).f4194c;
            } else {
                this.f4178t = m3787i();
            }
            if (size2 == 0) {
                dismiss();
                if (this.f4159A != null) {
                    this.f4159A.mo3715a(hVar, true);
                }
                if (this.f4165e != null) {
                    if (this.f4165e.isAlive()) {
                        this.f4165e.removeGlobalOnLayoutListener(this.f4163c);
                    }
                    this.f4165e = null;
                }
                this.f4164d.removeOnAttachStateChangeListener(this.f4173o);
                this.f4160B.onDismiss();
                return;
            }
            if (z) {
                ((C1242a) this.f4162b.get(0)).f4193b.mo4126b(false);
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

    public C1237e(Context context, View view, int i, int i2, boolean z) {
        this.f4167i = context;
        this.f4177s = view;
        this.f4169k = i;
        this.f4170l = i2;
        this.f4171m = z;
        this.f4183y = false;
        this.f4178t = m3787i();
        Resources resources = context.getResources();
        this.f4168j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
        this.f4161a = new Handler();
    }
}
