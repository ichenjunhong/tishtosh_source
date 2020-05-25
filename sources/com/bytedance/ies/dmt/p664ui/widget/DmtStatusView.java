package com.bytedance.ies.dmt.p664ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.common.C10682e;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtStatusView */
public class DmtStatusView extends FrameLayout implements C10682e, C10726f {

    /* renamed from: a */
    List<View> f28644a;

    /* renamed from: b */
    public boolean f28645b;

    /* renamed from: c */
    private int f28646c;

    /* renamed from: d */
    private int f28647d;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.DmtStatusView$a */
    public static class C10719a {

        /* renamed from: a */
        public Context f28648a;

        /* renamed from: b */
        View f28649b;

        /* renamed from: c */
        public View f28650c;

        /* renamed from: d */
        public View f28651d;

        /* renamed from: e */
        View f28652e;

        /* renamed from: f */
        View f28653f;

        /* renamed from: g */
        int f28654g = -1;

        /* renamed from: a */
        public final C10719a mo19223a() {
            DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(this.f28648a);
            dmtLoadingLayout.setLayoutParams(new LayoutParams(-1, -1));
            mo19228a((View) dmtLoadingLayout);
            return this;
        }

        /* renamed from: c */
        public final C10719a mo19233c(int i) {
            this.f28654g = i;
            return this;
        }

        /* renamed from: a */
        public static C10719a m21676a(Context context) {
            return new C10719a(context).mo19223a();
        }

        /* renamed from: b */
        public final C10719a mo19231b(View view) {
            this.f28650c = view;
            this.f28650c.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: c */
        public final C10719a mo19234c(View view) {
            this.f28651d = view;
            this.f28651d.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        public C10719a(Context context) {
            if (context != null) {
                this.f28648a = context;
                return;
            }
            throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
        }

        /* renamed from: b */
        public final C10719a mo19230b(int i) {
            return mo19232b(new C10723a(this.f28648a).mo19282c(i).f28711a);
        }

        /* renamed from: a */
        public final C10719a mo19224a(int i) {
            return mo19229a(new C10723a(this.f28648a).mo19282c(i).f28711a);
        }

        /* renamed from: b */
        public final C10719a mo19232b(C10722c cVar) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f28648a);
            dmtDefaultView.setLayoutParams(new LayoutParams(-1, -1));
            dmtDefaultView.setStatus(cVar);
            this.f28651d = dmtDefaultView;
            return this;
        }

        /* renamed from: a */
        public final C10719a mo19228a(View view) {
            this.f28649b = view;
            this.f28649b.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: a */
        public final C10719a mo19229a(C10722c cVar) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this.f28648a);
            dmtDefaultView.setLayoutParams(new LayoutParams(-1, -1));
            dmtDefaultView.setStatus(cVar);
            this.f28650c = dmtDefaultView;
            return this;
        }

        /* renamed from: a */
        public final C10719a mo19225a(int i, int i2) {
            return mo19229a(new C10723a(this.f28648a).mo19280b(i).mo19282c(i2).f28711a);
        }

        /* renamed from: a */
        public final C10719a mo19227a(int i, int i2, int i3, OnClickListener onClickListener) {
            return mo19232b(new C10723a(this.f28648a).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, onClickListener).f28711a);
        }

        /* renamed from: a */
        public final C10719a mo19226a(int i, int i2, int i3, int i4, OnClickListener onClickListener) {
            return mo19232b(new C10723a(this.f28648a).mo19277a(i).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, onClickListener).f28711a);
        }
    }

    /* renamed from: n */
    public final void mo19220n() {
        this.f28645b = true;
    }

    /* renamed from: f */
    public final void mo19212f() {
        setVisibility(0);
        setStatus(0);
    }

    /* renamed from: i */
    public boolean mo19215i() {
        if (this.f28646c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo19216j() {
        if (this.f28646c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo19211e() {
        if (this.f28646c == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo19213g() {
        setVisibility(0);
        setStatus(1);
    }

    /* renamed from: h */
    public final void mo19214h() {
        setVisibility(0);
        setStatus(2);
    }

    /* renamed from: k */
    public boolean mo19217k() {
        if (this.f28646c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo19218l() {
        if (this.f28646c == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo19219m() {
        if (this.f28646c == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo19209d() {
        if (this.f28646c != -1) {
            View b = mo19205b(this.f28646c);
            if (b != null) {
                b.setVisibility(4);
            }
            setVisibility(4);
            this.f28646c = -1;
        }
    }

    /* renamed from: c */
    public C10719a mo19207c() {
        C10719a aVar = new C10719a(getContext());
        aVar.f28649b = (View) this.f28644a.get(0);
        aVar.f28650c = (View) this.f28644a.get(1);
        aVar.f28651d = (View) this.f28644a.get(2);
        aVar.f28652e = (View) this.f28644a.get(3);
        aVar.f28653f = (View) this.f28644a.get(4);
        return aVar;
    }

    /* renamed from: a */
    public void mo19029a(int i) {
        mo63503c(i);
    }

    /* renamed from: b */
    public final void mo19206b(boolean z) {
        mo19213g();
    }

    public DmtStatusView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public final void mo19208c(boolean z) {
        this.f28645b = z;
        mo19209d();
    }

    /* renamed from: a */
    public final void mo19204a(boolean z) {
        if (z) {
            C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
        }
        if (this.f28645b) {
            mo19209d();
        } else {
            mo19214h();
        }
    }

    /* renamed from: b */
    public final View mo19205b(int i) {
        if (i < 0 || i >= this.f28644a.size()) {
            return null;
        }
        return (View) this.f28644a.get(i);
    }

    /* renamed from: d */
    public final boolean mo19210d(boolean z) {
        if (!C10724d.m21707a(getContext())) {
            C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
            if (!this.f28645b) {
                mo19214h();
            }
            return false;
        }
        if (!this.f28645b) {
            mo19212f();
        }
        return true;
    }

    public void setStatus(int i) {
        if (this.f28646c != i) {
            if (this.f28646c >= 0) {
                View b = mo19205b(this.f28646c);
                if (b != null) {
                    b.setVisibility(4);
                }
            }
            if (i >= 0) {
                setVisibility(0);
                View b2 = mo19205b(i);
                if (b2 != null) {
                    b2.setVisibility(0);
                }
            } else {
                setVisibility(4);
            }
            this.f28646c = i;
        }
    }

    /* renamed from: c */
    private void mo63503c(int i) {
        if (i >= 0 && this.f28647d != i) {
            this.f28647d = i;
            View view = (View) this.f28644a.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).mo19029a(this.f28647d);
            }
            View view2 = (View) this.f28644a.get(1);
            if (view2 instanceof C10682e) {
                ((C10682e) view2).mo19029a(this.f28647d);
            }
            View view3 = (View) this.f28644a.get(2);
            if (view3 instanceof DmtDefaultView) {
                ((DmtDefaultView) view3).mo19029a(this.f28647d);
            }
            View view4 = (View) this.f28644a.get(3);
            if (view4 instanceof DmtDefaultView) {
                ((DmtDefaultView) view4).mo19029a(this.f28647d);
            }
            View view5 = (View) this.f28644a.get(4);
            if (view5 instanceof DmtDefaultView) {
                ((DmtDefaultView) view5).mo19029a(this.f28647d);
            }
        }
    }

    public void setBuilder(C10719a aVar) {
        if (aVar == null) {
            aVar = C10719a.m21676a(getContext());
        }
        this.f28644a.clear();
        this.f28644a.add(aVar.f28649b);
        this.f28644a.add(aVar.f28650c);
        this.f28644a.add(aVar.f28651d);
        this.f28644a.add(aVar.f28652e);
        this.f28644a.add(aVar.f28653f);
        if (aVar.f28654g < 0) {
            aVar.f28654g = C10675b.m21494a().f28434a;
        }
        mo63503c(aVar.f28654g);
        removeAllViews();
        for (int i = 0; i < this.f28644a.size(); i++) {
            View view = (View) this.f28644a.get(i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    public void setUseScreenHeight(int i) {
        View view = (View) this.f28644a.get(0);
        if (view instanceof C10726f) {
            ((C10726f) view).setUseScreenHeight(i);
        }
        View view2 = (View) this.f28644a.get(1);
        if (view2 instanceof C10726f) {
            ((C10726f) view2).setUseScreenHeight(i);
        }
        View view3 = (View) this.f28644a.get(2);
        if (view3 instanceof C10726f) {
            ((C10726f) view3).setUseScreenHeight(i);
        }
        View view4 = (View) this.f28644a.get(3);
        if (view4 instanceof C10726f) {
            ((C10726f) view4).setUseScreenHeight(i);
        }
        View view5 = (View) this.f28644a.get(4);
        if (view5 instanceof C10726f) {
            ((C10726f) view5).setUseScreenHeight(i);
        }
    }

    public DmtStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28644a = new ArrayList(5);
        this.f28646c = -1;
        this.f28647d = -1;
        this.f28645b = false;
    }
}
