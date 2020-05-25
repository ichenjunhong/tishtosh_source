package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.be */
public final class C30790be extends DmtStatusView {

    /* renamed from: c */
    private List<View> f80666c = new ArrayList(3);

    /* renamed from: d */
    private List<C30791a> f80667d = new ArrayList(3);

    /* renamed from: e */
    private int f80668e = -1;

    /* renamed from: f */
    private int f80669f = -1;

    /* renamed from: g */
    private Integer f80670g = null;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.be$a */
    public interface C30791a {
        /* renamed from: a */
        View mo63433a(View view);
    }

    /* renamed from: c */
    public final C10719a mo19207c() {
        return null;
    }

    public final void setBuilder(C10719a aVar) {
    }

    /* renamed from: i */
    public final boolean mo19215i() {
        if (this.f80668e == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo19216j() {
        if (this.f80668e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo19211e() {
        if (this.f80668e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo19217k() {
        if (this.f80668e == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo19209d() {
        if (this.f80668e != -1) {
            View view = (View) this.f80666c.get(this.f80668e);
            if (view != null) {
                view.setVisibility(8);
            }
            setVisibility(8);
            this.f80668e = -1;
        }
    }

    /* renamed from: a */
    public final void mo19029a(int i) {
        m72172d(i);
    }

    public C30790be(Context context) {
        super(context);
    }

    public final void setStatus(int i) {
        if (this.f80668e != i) {
            if (this.f80668e >= 0) {
                View view = (View) this.f80666c.get(this.f80668e);
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            if (i >= 0) {
                setVisibility(0);
                View c = mo63503c(i);
                if (c != null) {
                    c.setVisibility(0);
                }
            } else {
                setVisibility(8);
            }
            this.f80668e = i;
        }
    }

    public final void setUseScreenHeight(int i) {
        View view = (View) this.f80666c.get(0);
        if (view instanceof DmtLoadingLayout) {
            ((DmtLoadingLayout) view).setUseScreenHeight(i);
        }
        View view2 = (View) this.f80666c.get(1);
        if (view2 instanceof DmtDefaultView) {
            ((DmtDefaultView) view2).setUseScreenHeight(i);
        }
        View view3 = (View) this.f80666c.get(2);
        if (view3 instanceof DmtDefaultView) {
            ((DmtDefaultView) view3).setUseScreenHeight(i);
        }
        this.f80670g = Integer.valueOf(i);
    }

    /* renamed from: d */
    private void m72172d(int i) {
        if (i >= 0 && this.f80669f != i) {
            this.f80669f = i;
            View view = (View) this.f80666c.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).mo19029a(this.f80669f);
            }
            View view2 = (View) this.f80666c.get(1);
            if (view2 instanceof DmtDefaultView) {
                ((DmtDefaultView) view2).mo19029a(this.f80669f);
            }
            View view3 = (View) this.f80666c.get(2);
            if (view3 instanceof DmtDefaultView) {
                ((DmtDefaultView) view3).mo19029a(this.f80669f);
            }
        }
    }

    /* renamed from: c */
    public final View mo63503c(int i) {
        View view = (View) this.f80666c.get(i);
        if (view == null && this.f80667d.get(i) != null) {
            C30791a aVar = (C30791a) this.f80667d.get(i);
            this.f80667d.set(i, null);
            view = aVar.mo63433a(this);
            if (view != null) {
                this.f80666c.set(i, view);
                if (this.f80670g != null) {
                    if (i == 0 && (view instanceof DmtLoadingLayout)) {
                        ((DmtLoadingLayout) view).setUseScreenHeight(this.f80670g.intValue());
                    } else if (i == 1 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).setUseScreenHeight(this.f80670g.intValue());
                    } else if (i == 2 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).setUseScreenHeight(this.f80670g.intValue());
                    }
                }
                if (this.f80669f > 0) {
                    if (i == 0 && (view instanceof DmtLoadingLayout)) {
                        ((DmtLoadingLayout) view).mo19029a(this.f80669f);
                    } else if (i == 1 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).mo19029a(this.f80669f);
                    } else if (i == 2 && (view instanceof DmtDefaultView)) {
                        ((DmtDefaultView) view).mo19029a(this.f80669f);
                    }
                }
                view.setLayoutParams(new LayoutParams(-1, -1));
                view.setVisibility(8);
                addView(view);
            }
        }
        return view;
    }

    /* renamed from: a */
    public final void mo63502a(C30791a aVar, C30791a aVar2, C30791a aVar3) {
        this.f80666c.add(0, null);
        this.f80666c.add(1, null);
        this.f80666c.add(2, null);
        this.f80667d.add(0, aVar);
        this.f80667d.add(1, aVar2);
        this.f80667d.add(2, aVar3);
        if (this.f80669f < 0) {
            this.f80669f = C10675b.m21494a().f28434a;
        }
    }
}
