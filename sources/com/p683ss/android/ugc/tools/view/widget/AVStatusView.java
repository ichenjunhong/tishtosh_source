package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.tools.view.p2511d.C50223a;
import com.p683ss.android.ugc.tools.view.widget.C50273c.C50274a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVStatusView */
public class AVStatusView extends FrameLayout implements C50223a, C50288l {

    /* renamed from: a */
    List<View> f125945a;

    /* renamed from: b */
    public int f125946b;

    /* renamed from: c */
    public boolean f125947c;

    /* renamed from: d */
    private int f125948d;

    /* renamed from: com.ss.android.ugc.tools.view.widget.AVStatusView$a */
    public static class C50243a {

        /* renamed from: a */
        Context f125949a;

        /* renamed from: b */
        View f125950b;

        /* renamed from: c */
        View f125951c;

        /* renamed from: d */
        View f125952d;

        /* renamed from: e */
        View f125953e;

        /* renamed from: f */
        View f125954f;

        /* renamed from: g */
        int f125955g = -1;

        /* renamed from: a */
        private C50243a m108468a() {
            AVLoadingLayout aVLoadingLayout = new AVLoadingLayout(this.f125949a);
            aVLoadingLayout.setLayoutParams(new LayoutParams(-1, -1));
            this.f125950b = aVLoadingLayout;
            this.f125950b.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: b */
        public final C50243a mo98106b(int i) {
            this.f125955g = 1;
            return this;
        }

        /* renamed from: a */
        public static C50243a m108469a(Context context) {
            return new C50243a(context).m108468a();
        }

        /* renamed from: b */
        public final C50243a mo98107b(View view) {
            this.f125952d = view;
            this.f125952d.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        private C50243a(Context context) {
            if (context != null) {
                this.f125949a = context;
                return;
            }
            throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
        }

        /* renamed from: b */
        private C50243a m108471b(C50273c cVar) {
            AVDefaultView aVDefaultView = new AVDefaultView(this.f125949a);
            aVDefaultView.setLayoutParams(new LayoutParams(-1, -1));
            aVDefaultView.setStatus(cVar);
            this.f125952d = aVDefaultView;
            return this;
        }

        /* renamed from: a */
        private C50243a m108470a(C50273c cVar) {
            AVDefaultView aVDefaultView = new AVDefaultView(this.f125949a);
            aVDefaultView.setLayoutParams(new LayoutParams(-1, -1));
            aVDefaultView.setStatus(cVar);
            this.f125951c = aVDefaultView;
            return this;
        }

        /* renamed from: a */
        public final C50243a mo98102a(int i) {
            return m108470a(new C50274a(this.f125949a).mo98173b(R.string.amc).f126138a);
        }

        /* renamed from: a */
        public final C50243a mo98105a(View view) {
            this.f125951c = view;
            this.f125951c.setLayoutParams(new LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: a */
        public final C50243a mo98103a(int i, int i2) {
            return m108470a(new C50274a(this.f125949a).mo98171a(i).mo98173b(R.string.f5x).f126138a);
        }

        /* renamed from: a */
        public final C50243a mo98104a(int i, int i2, int i3, OnClickListener onClickListener) {
            return m108471b(new C50274a(this.f125949a).mo98171a(R.string.f5o).mo98173b(R.string.f5k).mo98172a(C50285i.BORDER, R.string.f5u, onClickListener).f126138a);
        }
    }

    /* renamed from: e */
    public final void mo98099e() {
        this.f125947c = true;
    }

    /* renamed from: b */
    public final void mo98095b() {
        setVisibility(0);
        setStatus(0);
    }

    /* renamed from: c */
    public final void mo98097c() {
        setVisibility(0);
        setStatus(1);
    }

    /* renamed from: d */
    public final void mo98098d() {
        setVisibility(0);
        setStatus(2);
    }

    /* renamed from: a */
    public final void mo98093a() {
        if (this.f125946b != -1) {
            View b = m108458b(this.f125946b);
            if (b != null) {
                b.setVisibility(4);
            }
            setVisibility(4);
            this.f125946b = -1;
        }
    }

    /* renamed from: a */
    public final void mo97996a(int i) {
        m108459c(i);
    }

    /* renamed from: b */
    public final void mo98096b(boolean z) {
        mo98097c();
    }

    public AVStatusView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo98094a(boolean z) {
        if (this.f125947c) {
            mo98093a();
        } else {
            mo98098d();
        }
    }

    /* renamed from: b */
    private View m108458b(int i) {
        if (i < 0 || i >= this.f125945a.size()) {
            return null;
        }
        return (View) this.f125945a.get(i);
    }

    public void setStatus(int i) {
        if (this.f125946b != i) {
            if (this.f125946b >= 0) {
                View b = m108458b(this.f125946b);
                if (b != null) {
                    b.setVisibility(4);
                }
            }
            if (i >= 0) {
                setVisibility(0);
                View b2 = m108458b(i);
                if (b2 != null) {
                    b2.setVisibility(0);
                }
            } else {
                setVisibility(4);
            }
            this.f125946b = i;
        }
    }

    /* renamed from: c */
    private void m108459c(int i) {
        if (i >= 0 && this.f125948d != i) {
            this.f125948d = i;
            View view = (View) this.f125945a.get(0);
            if (view instanceof AVLoadingLayout) {
                ((AVLoadingLayout) view).mo97996a(this.f125948d);
            }
            View view2 = (View) this.f125945a.get(1);
            if (view2 instanceof C50223a) {
                ((C50223a) view2).mo97996a(this.f125948d);
            }
            View view3 = (View) this.f125945a.get(2);
            if (view3 instanceof AVDefaultView) {
                ((AVDefaultView) view3).mo97996a(this.f125948d);
            }
            View view4 = (View) this.f125945a.get(3);
            if (view4 instanceof AVDefaultView) {
                ((AVDefaultView) view4).mo97996a(this.f125948d);
            }
            View view5 = (View) this.f125945a.get(4);
            if (view5 instanceof AVDefaultView) {
                ((AVDefaultView) view5).mo97996a(this.f125948d);
            }
        }
    }

    public void setBuilder(C50243a aVar) {
        if (aVar == null) {
            aVar = C50243a.m108469a(getContext());
        }
        this.f125945a.clear();
        this.f125945a.add(aVar.f125950b);
        this.f125945a.add(aVar.f125951c);
        this.f125945a.add(aVar.f125952d);
        this.f125945a.add(aVar.f125953e);
        this.f125945a.add(aVar.f125954f);
        if (aVar.f125955g < 0) {
            aVar.f125955g = C39629l.m88232a().mo58564B().mo74262a();
        }
        m108459c(aVar.f125955g);
        removeAllViews();
        for (int i = 0; i < this.f125945a.size(); i++) {
            View view = (View) this.f125945a.get(i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    public void setUseScreenHeight(int i) {
        View view = (View) this.f125945a.get(0);
        if (view instanceof C50288l) {
            ((C50288l) view).setUseScreenHeight(i);
        }
        View view2 = (View) this.f125945a.get(1);
        if (view2 instanceof C50288l) {
            ((C50288l) view2).setUseScreenHeight(i);
        }
        View view3 = (View) this.f125945a.get(2);
        if (view3 instanceof C50288l) {
            ((C50288l) view3).setUseScreenHeight(i);
        }
        View view4 = (View) this.f125945a.get(3);
        if (view4 instanceof C50288l) {
            ((C50288l) view4).setUseScreenHeight(i);
        }
        View view5 = (View) this.f125945a.get(4);
        if (view5 instanceof C50288l) {
            ((C50288l) view5).setUseScreenHeight(i);
        }
    }

    public AVStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AVStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f125945a = new ArrayList(5);
        this.f125946b = -1;
        this.f125948d = -1;
        this.f125947c = false;
    }
}
