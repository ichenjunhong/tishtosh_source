package com.p683ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.C1416ag;
import android.support.p043v7.widget.C1422ak;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1346r.C1347a;
import android.support.p043v7.widget.RecyclerView.C1346r.C1348b;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.MainFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager */
public class GalleryLayoutManager extends C1332i implements C1348b {

    /* renamed from: a */
    int f79079a;

    /* renamed from: b */
    public int f79080b;

    /* renamed from: c */
    View f79081c;

    /* renamed from: d */
    public C1416ag f79082d;

    /* renamed from: e */
    C30271b f79083e;

    /* renamed from: f */
    public boolean f79084f;

    /* renamed from: g */
    public int f79085g;

    /* renamed from: h */
    public WeakReference<Activity> f79086h;

    /* renamed from: i */
    public C30273d f79087i;

    /* renamed from: j */
    public ArrayList<C30272c> f79088j;

    /* renamed from: k */
    public RecyclerView f79089k;

    /* renamed from: l */
    public int f79090l;

    /* renamed from: m */
    private int f79091m;

    /* renamed from: n */
    private int f79092n;

    /* renamed from: o */
    private boolean f79093o;

    /* renamed from: p */
    private C30274e f79094p;

    /* renamed from: q */
    private C1422ak f79095q;

    /* renamed from: r */
    private C1422ak f79096r;

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$LayoutParams */
    public static class LayoutParams extends android.support.p043v7.widget.RecyclerView.LayoutParams {
        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$a */
    class C30270a extends C1415af {
        C30270a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final void mo5110a(View view, C1349s sVar, C1347a aVar) {
            int i;
            C1332i iVar = this.f4780i;
            int i2 = 0;
            if (iVar == null || !iVar.mo4742e()) {
                i = 0;
            } else {
                android.support.p043v7.widget.RecyclerView.LayoutParams layoutParams = (android.support.p043v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
                int g = iVar.mo5049g(view) - layoutParams.leftMargin;
                int i3 = iVar.mo5053i(view) + layoutParams.rightMargin;
                int v = iVar.f4745I - iVar.mo5065v();
                int i4 = g + ((int) (((float) (i3 - g)) / 2.0f));
                i = ((int) (((float) (v - iVar.mo5063t())) / 2.0f)) - i4;
            }
            C1332i iVar2 = this.f4780i;
            if (iVar2 != null && iVar2.mo4745f()) {
                android.support.p043v7.widget.RecyclerView.LayoutParams layoutParams2 = (android.support.p043v7.widget.RecyclerView.LayoutParams) view.getLayoutParams();
                int h = iVar2.mo5051h(view) - layoutParams2.topMargin;
                int j = iVar2.mo5055j(view) + layoutParams2.bottomMargin;
                int i5 = h + ((int) (((float) (j - h)) / 2.0f));
                i2 = ((int) (((float) ((iVar2.f4746J - iVar2.mo5066w()) - iVar2.mo5064u())) / 2.0f)) - i5;
            }
            int a = mo5491a((int) Math.sqrt((double) ((i * i) + (i2 * i2))));
            if (a > 0) {
                aVar.mo5113a(-i, -i2, a, this.f5105b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$b */
    class C30271b extends C1340m {

        /* renamed from: a */
        int f79098a;

        /* renamed from: b */
        boolean f79099b;

        private C30271b() {
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            this.f79098a = i;
            if (this.f79098a == 0) {
                GalleryLayoutManager.this.f79090l = 0;
                View a = GalleryLayoutManager.this.f79082d.mo5498a(recyclerView.getLayoutManager());
                if (a != null) {
                    recyclerView.getLayoutManager();
                    int c = C1332i.m4418c(a);
                    if (c != GalleryLayoutManager.this.f79080b) {
                        if (GalleryLayoutManager.this.f79081c != null) {
                            GalleryLayoutManager.this.f79081c.setSelected(false);
                        }
                        GalleryLayoutManager.this.f79081c = a;
                        GalleryLayoutManager.this.f79081c.setSelected(true);
                        GalleryLayoutManager.this.f79080b = c;
                        if (GalleryLayoutManager.this.f79088j != null) {
                            GalleryLayoutManager.this.mo60650a(recyclerView, a, GalleryLayoutManager.this.f79080b);
                        }
                    } else if (!GalleryLayoutManager.this.f79084f && GalleryLayoutManager.this.f79088j != null && this.f79099b) {
                        this.f79099b = false;
                        GalleryLayoutManager.this.mo60650a(recyclerView, a, GalleryLayoutManager.this.f79080b);
                    }
                }
                return;
            }
            GalleryLayoutManager.this.f79090l = 2;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            View a = GalleryLayoutManager.this.f79082d.mo5498a(recyclerView.getLayoutManager());
            if (a != null) {
                recyclerView.getLayoutManager();
                int c = C1332i.m4418c(a);
                if (c != GalleryLayoutManager.this.f79080b) {
                    if (GalleryLayoutManager.this.f79081c != null) {
                        GalleryLayoutManager.this.f79081c.setSelected(false);
                    }
                    GalleryLayoutManager.this.f79081c = a;
                    GalleryLayoutManager.this.f79081c.setSelected(true);
                    GalleryLayoutManager.this.f79080b = c;
                    if (!GalleryLayoutManager.this.f79084f && this.f79098a != 0) {
                        this.f79099b = true;
                    } else if (GalleryLayoutManager.this.f79088j != null) {
                        GalleryLayoutManager.this.mo60650a(recyclerView, a, GalleryLayoutManager.this.f79080b);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$c */
    public interface C30272c {
        /* renamed from: a */
        void mo60311a(RecyclerView recyclerView, View view, int i);

        /* renamed from: h */
        void mo60319h();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$d */
    public interface C30273d {
        /* renamed from: a */
        void mo60652a(GalleryLayoutManager galleryLayoutManager, View view, float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$e */
    class C30274e {

        /* renamed from: a */
        SparseArray<Rect> f79101a = new SparseArray<>();

        /* renamed from: b */
        int f79102b = 0;

        C30274e() {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo60650a(RecyclerView recyclerView, View view, int i) {
        Iterator it = this.f79088j.iterator();
        while (it.hasNext()) {
            ((C30272c) it.next()).mo60311a(recyclerView, view, i);
        }
    }

    /* renamed from: j */
    private int m71149j() {
        return (this.f4745I - mo5065v()) - mo5063t();
    }

    /* renamed from: k */
    private int m71150k() {
        return (this.f4746J - mo5066w()) - mo5064u();
    }

    /* renamed from: l */
    private C30274e m71151l() {
        if (this.f79094p == null) {
            this.f79094p = new C30274e();
        }
        return this.f79094p;
    }

    /* renamed from: m */
    private C1422ak m71152m() {
        if (this.f79085g == 0) {
            if (this.f79095q == null) {
                this.f79095q = C1422ak.m4897a((C1332i) this);
            }
            return this.f79095q;
        }
        if (this.f79096r == null) {
            this.f79096r = C1422ak.m4899b((C1332i) this);
        }
        return this.f79096r;
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4667a() {
        if (this.f79085g == 1) {
            return new LayoutParams(-1, -2);
        }
        return new LayoutParams(-2, -1);
    }

    /* renamed from: e */
    public final boolean mo4742e() {
        if (this.f79089k == null || this.f79089k.mo4880l() || !this.f79093o || this.f79085g != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo4745f() {
        if (this.f79089k == null || this.f79089k.mo4880l() || !this.f79093o || this.f79085g != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m71148h() {
        if (this.f79094p != null) {
            this.f79094p.f79101a.clear();
        }
        if (this.f79080b != -1) {
            this.f79079a = this.f79080b;
        }
        this.f79079a = Math.min(Math.max(0, this.f79079a), mo5013A() - 1);
        this.f79092n = this.f79079a;
        this.f79091m = this.f79079a;
        this.f79080b = -1;
        if (this.f79081c != null) {
            this.f79081c.setSelected(false);
            this.f79081c = null;
        }
    }

    /* renamed from: g */
    public final boolean mo60651g() {
        if (this.f79086h == null || this.f79086h.get() == null) {
            return true;
        }
        Activity activity = (Activity) this.f79086h.get();
        if (activity != null && (activity instanceof MainActivity)) {
            MainActivity mainActivity = (MainActivity) activity;
            if (mainActivity.isUnderMainTab() && (mainActivity.getCurFragment() instanceof MainFragment)) {
                MainFragment mainFragment = (MainFragment) mainActivity.getCurFragment();
                if (mainFragment.getUserVisibleHint() && mainFragment.mo75505e()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo4684a(android.support.p043v7.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    public final void mo4672a(int i) {
        if (this.f79089k != null && i >= 0) {
            mo4726a(this.f79089k, (C1349s) null, i);
        }
    }

    public GalleryLayoutManager(int i) {
        this.f79091m = 1;
        this.f79093o = true;
        this.f79080b = -1;
        this.f79082d = new C1416ag();
        this.f79083e = new C30271b();
        this.f79084f = false;
        this.f79085g = 0;
        this.f79088j = new ArrayList<>();
        this.f79090l = 0;
        this.f79085g = 0;
    }

    /* renamed from: d */
    public final PointF mo4738d(int i) {
        int i2 = -1;
        if (mo5062s() != 0 && i >= this.f79092n) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f79085g == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i2;
        }
        return pointF;
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4669a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final android.support.p043v7.widget.RecyclerView.LayoutParams mo4668a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    private float m71140a(View view, float f) {
        int i;
        int b = m71143b(view, f);
        if (this.f79085g == 0) {
            i = view.getWidth();
        } else {
            i = view.getHeight();
        }
        return Math.max(-1.0f, Math.min(1.0f, (((float) b) * 1.0f) / ((float) i)));
    }

    /* renamed from: b */
    private int m71143b(View view, float f) {
        C1422ak m = m71152m();
        int c = ((m.mo5520c() - m.mo5518b()) / 2) + m.mo5518b();
        if (this.f79085g == 0) {
            return (int) (((((float) (view.getWidth() / 2)) - f) + ((float) view.getLeft())) - ((float) c));
        }
        return (int) (((((float) (view.getHeight() / 2)) - f) + ((float) view.getTop())) - ((float) c));
    }

    /* renamed from: c */
    public final void mo4689c(C1343o oVar, C1349s sVar) {
        if (mo5013A() == 0) {
            m71148h();
            mo5020a(oVar);
        } else if (!sVar.f4798g) {
            if (sVar.mo5115a() == 0 || sVar.f4797f) {
                if (mo5062s() == 0 || sVar.f4797f) {
                    m71148h();
                }
                this.f79079a = Math.min(Math.max(0, this.f79079a), mo5013A() - 1);
                mo5020a(oVar);
                if (this.f79085g == 0) {
                    mo5020a(oVar);
                    int b = m71152m().mo5518b();
                    int c = m71152m().mo5520c();
                    int i = this.f79079a;
                    Rect rect = new Rect();
                    int k = m71150k();
                    View b2 = oVar.mo5096b(this.f79079a);
                    mo5038b(b2, 0);
                    mo5032a_(b2, 0, 0);
                    int e = m4421e(b2);
                    int f = m4422f(b2);
                    int u = (int) (((float) mo5064u()) + (((float) (k - f)) / 2.0f));
                    int t = (int) (((float) mo5063t()) + (((float) (m71149j() - e)) / 2.0f));
                    rect.set(t, u, e + t, f + u);
                    m4411a(b2, rect.left, rect.top, rect.right, rect.bottom);
                    if (m71151l().f79101a.get(i) == null) {
                        m71151l().f79101a.put(i, rect);
                    } else {
                        ((Rect) m71151l().f79101a.get(i)).set(rect);
                    }
                    this.f79092n = i;
                    this.f79091m = i;
                    int g = mo5049g(b2);
                    int i2 = mo5053i(b2);
                    m71141a(oVar, this.f79079a - 1, g, b);
                    m71144b(oVar, this.f79079a + 1, i2, c);
                } else {
                    mo5020a(oVar);
                    int b3 = m71152m().mo5518b();
                    int c2 = m71152m().mo5520c();
                    int i3 = this.f79079a;
                    Rect rect2 = new Rect();
                    int j = m71149j();
                    View b4 = oVar.mo5096b(this.f79079a);
                    mo5038b(b4, 0);
                    mo5032a_(b4, 0, 0);
                    int e2 = m4421e(b4);
                    int f2 = m4422f(b4);
                    int t2 = (int) (((float) mo5063t()) + (((float) (j - e2)) / 2.0f));
                    int u2 = (int) (((float) mo5064u()) + (((float) (m71150k() - f2)) / 2.0f));
                    rect2.set(t2, u2, e2 + t2, f2 + u2);
                    m4411a(b4, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    if (m71151l().f79101a.get(i3) == null) {
                        m71151l().f79101a.put(i3, rect2);
                    } else {
                        ((Rect) m71151l().f79101a.get(i3)).set(rect2);
                    }
                    this.f79092n = i3;
                    this.f79091m = i3;
                    int h = mo5051h(b4);
                    int j2 = mo5055j(b4);
                    m71146c(oVar, this.f79079a - 1, h, b3);
                    m71147d(oVar, this.f79079a + 1, j2, c2);
                }
                if (this.f79087i != null) {
                    for (int i4 = 0; i4 < mo5062s(); i4++) {
                        View g2 = mo5050g(i4);
                        this.f79087i.mo60652a(this, g2, m71140a(g2, 0.0f));
                    }
                }
                this.f79083e.onScrolled(this.f79089k, 0, 0);
            }
        }
    }

    /* renamed from: b */
    public final void mo4687b(RecyclerView recyclerView, int i, int i2) {
        super.mo4687b(recyclerView, i, i2);
    }

    /* renamed from: a */
    public final int mo4665a(int i, C1343o oVar, C1349s sVar) {
        if (mo5062s() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int c = ((m71152m().mo5520c() - m71152m().mo5518b()) / 2) + m71152m().mo5518b();
        if (i > 0) {
            if (m4418c(mo5050g(mo5062s() - 1)) == mo5013A() - 1) {
                View g = mo5050g(mo5062s() - 1);
                i2 = -Math.max(0, Math.min(i, (((g.getRight() - g.getLeft()) / 2) + g.getLeft()) - c));
            }
        } else if (this.f79092n == 0) {
            View g2 = mo5050g(0);
            i2 = -Math.min(0, Math.max(i, (((g2.getRight() - g2.getLeft()) / 2) + g2.getLeft()) - c));
        }
        int i3 = -i2;
        m71151l().f79102b = i3;
        m71142a(oVar, sVar, i3);
        mo5052h(i2);
        return i3;
    }

    /* renamed from: b */
    public final int mo4685b(int i, C1343o oVar, C1349s sVar) {
        if (mo5062s() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int c = ((m71152m().mo5520c() - m71152m().mo5518b()) / 2) + m71152m().mo5518b();
        if (i > 0) {
            if (m4418c(mo5050g(mo5062s() - 1)) == mo5013A() - 1) {
                View g = mo5050g(mo5062s() - 1);
                i2 = -Math.max(0, Math.min(i, (((mo5055j(g) - mo5051h(g)) / 2) + mo5051h(g)) - c));
            }
        } else if (this.f79092n == 0) {
            View g2 = mo5050g(0);
            i2 = -Math.min(0, Math.max(i, (((mo5055j(g2) - mo5051h(g2)) / 2) + mo5051h(g2)) - c));
        }
        int i3 = -i2;
        m71151l().f79102b = i3;
        m71142a(oVar, sVar, i3);
        mo5054i(i2);
        return i3;
    }

    /* renamed from: a */
    private void m71142a(C1343o oVar, C1349s sVar, int i) {
        int i2;
        int i3;
        C1343o oVar2 = oVar;
        int i4 = i;
        if (mo5013A() != 0) {
            int i5 = 0;
            if (this.f79085g == 0) {
                int b = m71152m().mo5518b();
                int c = m71152m().mo5520c();
                if (mo5062s() > 0) {
                    if (i4 >= 0) {
                        int i6 = 0;
                        for (int i7 = 0; i7 < mo5062s(); i7++) {
                            View g = mo5050g(i7 + i6);
                            if (mo5053i(g) - i4 >= b) {
                                break;
                            }
                            mo5026a(g, oVar2);
                            this.f79092n++;
                            i6--;
                        }
                    } else {
                        for (int s = mo5062s() - 1; s >= 0; s--) {
                            View g2 = mo5050g(s);
                            if (mo5049g(g2) - i4 > c) {
                                mo5026a(g2, oVar2);
                                this.f79091m--;
                            }
                        }
                    }
                }
                int i8 = this.f79092n;
                int k = m71150k();
                int i9 = -1;
                if (i4 >= 0) {
                    if (mo5062s() != 0) {
                        View g3 = mo5050g(mo5062s() - 1);
                        i8 = m4418c(g3) + 1;
                        i3 = mo5053i(g3);
                    } else {
                        i3 = -1;
                    }
                    int i10 = i3;
                    int i11 = i8;
                    while (i11 < mo5013A() && i10 < c + i4) {
                        Rect rect = (Rect) m71151l().f79101a.get(i11);
                        View b2 = oVar2.mo5096b(i11);
                        mo5037b(b2);
                        if (rect == null) {
                            rect = new Rect();
                            m71151l().f79101a.put(i11, rect);
                        }
                        mo5032a_(b2, i5, i5);
                        int e = m4421e(b2);
                        int f = m4422f(b2);
                        int u = (int) (((float) mo5064u()) + (((float) (k - f)) / 2.0f));
                        if (i10 == -1 && i8 == 0) {
                            int t = (int) (((float) mo5063t()) + (((float) (m71149j() - e)) / 2.0f));
                            rect.set(t, u, e + t, f + u);
                        } else {
                            rect.set(i10, u, e + i10, f + u);
                        }
                        m4411a(b2, rect.left, rect.top, rect.right, rect.bottom);
                        i10 = rect.right;
                        this.f79091m = i11;
                        i11++;
                        i5 = 0;
                    }
                } else {
                    if (mo5062s() > 0) {
                        View g4 = mo5050g(0);
                        i8 = m4418c(g4) - 1;
                        i9 = mo5049g(g4);
                    }
                    while (i8 >= 0 && i9 > b + i4) {
                        Rect rect2 = (Rect) m71151l().f79101a.get(i8);
                        View b3 = oVar2.mo5096b(i8);
                        mo5038b(b3, 0);
                        if (rect2 == null) {
                            rect2 = new Rect();
                            m71151l().f79101a.put(i8, rect2);
                        }
                        mo5032a_(b3, 0, 0);
                        int e2 = m4421e(b3);
                        int f2 = m4422f(b3);
                        int u2 = (int) (((float) mo5064u()) + (((float) (k - f2)) / 2.0f));
                        rect2.set(i9 - e2, u2, i9, f2 + u2);
                        m4411a(b3, rect2.left, rect2.top, rect2.right, rect2.bottom);
                        i9 = rect2.left;
                        this.f79092n = i8;
                        i8--;
                    }
                }
                i2 = 0;
            } else {
                i2 = 0;
                m71145b(oVar, sVar, i);
            }
            if (this.f79087i != null) {
                while (i2 < mo5062s()) {
                    View g5 = mo5050g(i2);
                    this.f79087i.mo60652a(this, g5, m71140a(g5, (float) i4));
                    i2++;
                }
            }
        }
    }

    /* renamed from: b */
    private void m71145b(C1343o oVar, C1349s sVar, int i) {
        int i2;
        int i3;
        C1343o oVar2 = oVar;
        int b = m71152m().mo5518b();
        int c = m71152m().mo5520c();
        int i4 = 0;
        if (mo5062s() > 0) {
            if (i < 0) {
                for (int s = mo5062s() - 1; s >= 0; s--) {
                    View g = mo5050g(s);
                    if (mo5051h(g) - i <= c) {
                        break;
                    }
                    mo5026a(g, oVar2);
                    this.f79091m--;
                }
            } else {
                int i5 = 0;
                for (int i6 = 0; i6 < mo5062s(); i6++) {
                    View g2 = mo5050g(i6 + i5);
                    if (mo5055j(g2) - i >= b) {
                        break;
                    }
                    mo5026a(g2, oVar2);
                    this.f79092n++;
                    i5--;
                }
            }
        }
        int i7 = this.f79092n;
        int j = m71149j();
        int i8 = -1;
        if (i >= 0) {
            if (mo5062s() != 0) {
                View g3 = mo5050g(mo5062s() - 1);
                i7 = m4418c(g3) + 1;
                i3 = mo5055j(g3);
            } else {
                i3 = -1;
            }
            int i9 = i3;
            int i10 = i7;
            while (i10 < mo5013A() && i9 < c + i) {
                Rect rect = (Rect) m71151l().f79101a.get(i10);
                View b2 = oVar2.mo5096b(i10);
                mo5037b(b2);
                if (rect == null) {
                    rect = new Rect();
                    m71151l().f79101a.put(i10, rect);
                }
                mo5032a_(b2, i4, i4);
                int e = m4421e(b2);
                int f = m4422f(b2);
                int t = (int) (((float) mo5063t()) + (((float) (j - e)) / 2.0f));
                if (i9 == -1 && i7 == 0) {
                    int u = (int) (((float) mo5064u()) + (((float) (m71150k() - f)) / 2.0f));
                    rect.set(t, u, e + t, f + u);
                } else {
                    rect.set(t, i9, e + t, f + i9);
                }
                m4411a(b2, rect.left, rect.top, rect.right, rect.bottom);
                i9 = rect.bottom;
                this.f79091m = i10;
                i10++;
                i4 = 0;
            }
            return;
        }
        if (mo5062s() > 0) {
            View g4 = mo5050g(0);
            i2 = m4418c(g4) - 1;
            i8 = mo5051h(g4);
        } else {
            i2 = i7;
        }
        while (i2 >= 0 && i8 > b + i) {
            Rect rect2 = (Rect) m71151l().f79101a.get(i2);
            View b3 = oVar2.mo5096b(i2);
            mo5038b(b3, 0);
            if (rect2 == null) {
                rect2 = new Rect();
                m71151l().f79101a.put(i2, rect2);
            }
            mo5032a_(b3, 0, 0);
            int e2 = m4421e(b3);
            int t2 = (int) (((float) mo5063t()) + (((float) (j - e2)) / 2.0f));
            rect2.set(t2, i8 - m4422f(b3), e2 + t2, i8);
            m4411a(b3, rect2.left, rect2.top, rect2.right, rect2.bottom);
            i8 = rect2.top;
            this.f79092n = i2;
            i2--;
        }
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C30270a aVar = new C30270a(recyclerView.getContext());
        aVar.f4778g = i;
        mo5022a((C1346r) aVar);
    }

    /* renamed from: a */
    private void m71141a(C1343o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int k = m71150k();
        while (i >= 0 && i2 > i3) {
            View b = oVar.mo5096b(i);
            mo5038b(b, 0);
            mo5032a_(b, 0, 0);
            int e = m4421e(b);
            int f = m4422f(b);
            int u = (int) (((float) mo5064u()) + (((float) (k - f)) / 2.0f));
            rect.set(i2 - e, u, i2, f + u);
            m4411a(b, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            this.f79092n = i;
            if (m71151l().f79101a.get(i) == null) {
                m71151l().f79101a.put(i, rect);
            } else {
                ((Rect) m71151l().f79101a.get(i)).set(rect);
            }
            i--;
        }
    }

    /* renamed from: b */
    private void m71144b(C1343o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int k = m71150k();
        while (i < mo5013A() && i2 < i3) {
            View b = oVar.mo5096b(i);
            mo5037b(b);
            mo5032a_(b, 0, 0);
            int e = m4421e(b);
            int f = m4422f(b);
            int u = (int) (((float) mo5064u()) + (((float) (k - f)) / 2.0f));
            rect.set(i2, u, e + i2, f + u);
            m4411a(b, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            this.f79091m = i;
            if (m71151l().f79101a.get(i) == null) {
                m71151l().f79101a.put(i, rect);
            } else {
                ((Rect) m71151l().f79101a.get(i)).set(rect);
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m71146c(C1343o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int j = m71149j();
        while (i >= 0 && i2 > i3) {
            View b = oVar.mo5096b(i);
            mo5038b(b, 0);
            mo5032a_(b, 0, 0);
            int e = m4421e(b);
            int t = (int) (((float) mo5063t()) + (((float) (j - e)) / 2.0f));
            rect.set(t, i2 - m4422f(b), e + t, i2);
            m4411a(b, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            this.f79092n = i;
            if (m71151l().f79101a.get(i) == null) {
                m71151l().f79101a.put(i, rect);
            } else {
                ((Rect) m71151l().f79101a.get(i)).set(rect);
            }
            i--;
        }
    }

    /* renamed from: d */
    private void m71147d(C1343o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int j = m71149j();
        while (i < mo5013A() && i2 < i3) {
            View b = oVar.mo5096b(i);
            mo5037b(b);
            mo5032a_(b, 0, 0);
            int e = m4421e(b);
            int t = (int) (((float) mo5063t()) + (((float) (j - e)) / 2.0f));
            rect.set(t, i2, e + t, m4422f(b) + i2);
            m4411a(b, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            this.f79091m = i;
            if (m71151l().f79101a.get(i) == null) {
                m71151l().f79101a.put(i, rect);
            } else {
                ((Rect) m71151l().f79101a.get(i)).set(rect);
            }
            i++;
        }
    }
}
