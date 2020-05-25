package android.support.p043v7.widget;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;

/* renamed from: android.support.v7.widget.ak */
public abstract class C1422ak {

    /* renamed from: a */
    public final C1332i f5119a;

    /* renamed from: b */
    int f5120b;

    /* renamed from: c */
    final Rect f5121c;

    /* renamed from: a */
    public abstract int mo5516a(View view);

    /* renamed from: a */
    public abstract void mo5517a(int i);

    /* renamed from: b */
    public abstract int mo5518b();

    /* renamed from: b */
    public abstract int mo5519b(View view);

    /* renamed from: c */
    public abstract int mo5520c();

    /* renamed from: c */
    public abstract int mo5521c(View view);

    /* renamed from: d */
    public abstract int mo5522d();

    /* renamed from: d */
    public abstract int mo5523d(View view);

    /* renamed from: e */
    public abstract int mo5524e();

    /* renamed from: e */
    public abstract int mo5525e(View view);

    /* renamed from: f */
    public abstract int mo5526f();

    /* renamed from: f */
    public abstract int mo5527f(View view);

    /* renamed from: g */
    public abstract int mo5528g();

    /* renamed from: h */
    public abstract int mo5529h();

    /* renamed from: a */
    public final int mo5515a() {
        if (Integer.MIN_VALUE == this.f5120b) {
            return 0;
        }
        return mo5524e() - this.f5120b;
    }

    /* renamed from: a */
    public static C1422ak m4897a(C1332i iVar) {
        return new C1422ak(iVar) {
            /* renamed from: b */
            public final int mo5518b() {
                return this.f5119a.mo5063t();
            }

            /* renamed from: d */
            public final int mo5522d() {
                return this.f5119a.f4745I;
            }

            /* renamed from: f */
            public final int mo5526f() {
                return this.f5119a.mo5065v();
            }

            /* renamed from: g */
            public final int mo5528g() {
                return this.f5119a.f4743G;
            }

            /* renamed from: h */
            public final int mo5529h() {
                return this.f5119a.f4744H;
            }

            /* renamed from: c */
            public final int mo5520c() {
                return this.f5119a.f4745I - this.f5119a.mo5065v();
            }

            /* renamed from: e */
            public final int mo5524e() {
                return (this.f5119a.f4745I - this.f5119a.mo5063t()) - this.f5119a.mo5065v();
            }

            /* renamed from: a */
            public final void mo5517a(int i) {
                this.f5119a.mo5052h(i);
            }

            /* renamed from: a */
            public final int mo5516a(View view) {
                return this.f5119a.mo5049g(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public final int mo5519b(View view) {
                return this.f5119a.mo5053i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: d */
            public final int mo5523d(View view) {
                this.f5119a.mo5027a(view, true, this.f5121c);
                return this.f5121c.left;
            }

            /* renamed from: c */
            public final int mo5521c(View view) {
                this.f5119a.mo5027a(view, true, this.f5121c);
                return this.f5121c.right;
            }

            /* renamed from: f */
            public final int mo5527f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1332i.m4422f(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            /* renamed from: e */
            public final int mo5525e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1332i.m4421e(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        };
    }

    /* renamed from: b */
    public static C1422ak m4899b(C1332i iVar) {
        return new C1422ak(iVar) {
            /* renamed from: b */
            public final int mo5518b() {
                return this.f5119a.mo5064u();
            }

            /* renamed from: d */
            public final int mo5522d() {
                return this.f5119a.f4746J;
            }

            /* renamed from: f */
            public final int mo5526f() {
                return this.f5119a.mo5066w();
            }

            /* renamed from: g */
            public final int mo5528g() {
                return this.f5119a.f4744H;
            }

            /* renamed from: h */
            public final int mo5529h() {
                return this.f5119a.f4743G;
            }

            /* renamed from: c */
            public final int mo5520c() {
                return this.f5119a.f4746J - this.f5119a.mo5066w();
            }

            /* renamed from: e */
            public final int mo5524e() {
                return (this.f5119a.f4746J - this.f5119a.mo5064u()) - this.f5119a.mo5066w();
            }

            /* renamed from: a */
            public final void mo5517a(int i) {
                this.f5119a.mo5054i(i);
            }

            /* renamed from: a */
            public final int mo5516a(View view) {
                return this.f5119a.mo5051h(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public final int mo5519b(View view) {
                return this.f5119a.mo5055j(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            /* renamed from: d */
            public final int mo5523d(View view) {
                this.f5119a.mo5027a(view, true, this.f5121c);
                return this.f5121c.top;
            }

            /* renamed from: c */
            public final int mo5521c(View view) {
                this.f5119a.mo5027a(view, true, this.f5121c);
                return this.f5121c.bottom;
            }

            /* renamed from: f */
            public final int mo5527f(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1332i.m4421e(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            /* renamed from: e */
            public final int mo5525e(View view) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return C1332i.m4422f(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }
        };
    }

    private C1422ak(C1332i iVar) {
        this.f5120b = DynamicTabYellowPointVersion.DEFAULT;
        this.f5121c = new Rect();
        this.f5119a = iVar;
    }

    /* renamed from: a */
    public static C1422ak m4898a(C1332i iVar, int i) {
        switch (i) {
            case 0:
                return m4897a(iVar);
            case 1:
                return m4899b(iVar);
            default:
                throw new IllegalArgumentException("invalid orientation");
        }
    }
}
