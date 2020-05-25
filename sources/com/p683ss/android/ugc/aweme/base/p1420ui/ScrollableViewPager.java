package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.support.p030v4.view.DmtRtlViewPager;
import android.support.p030v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.LegacyServiceImpl;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.base.ui.ScrollableViewPager */
public class ScrollableViewPager extends DmtRtlViewPager {

    /* renamed from: g */
    public int f63016g;

    /* renamed from: h */
    public boolean f63017h = true;

    /* renamed from: i */
    float f63018i;

    /* renamed from: j */
    float f63019j;

    /* renamed from: k */
    C23638a f63020k = new C23638a() {
        /* renamed from: a */
        public final boolean mo49061a(int i) {
            return true;
        }

        /* renamed from: a */
        public final boolean mo49060a(float f, float f2) {
            if (Math.abs(f) <= ((float) ScrollableViewPager.this.f63016g) || Math.abs(f) <= Math.abs(f2)) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: l */
    private boolean f63021l;

    /* renamed from: m */
    private C23696j f63022m;

    /* renamed from: n */
    private boolean f63023n;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.ScrollableViewPager$a */
    public interface C23638a {

        /* renamed from: b */
        public static final int f63025b = C23728o.m58241a(8.0d);

        /* renamed from: a */
        boolean mo49060a(float f, float f2);

        /* renamed from: a */
        boolean mo49061a(int i);
    }

    public int getItemCount() {
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    /* renamed from: a */
    public final ScrollableViewPager mo49054a(C23638a aVar) {
        this.f63020k = aVar;
        return this;
    }

    public void setBlockCanScroll(boolean z) {
        this.f63023n = z;
    }

    public void setEnableDispatchTouchEventCheck(boolean z) {
        this.f63021l = z;
    }

    public void setOnFlingEndListener(C23696j jVar) {
        this.f63022m = jVar;
    }

    /* renamed from: a */
    private void m57961a(Context context) {
        this.f63016g = C23728o.m58241a(8.0d);
        setDefaultGutterSize(0);
    }

    public ScrollableViewPager(Context context) {
        super(context);
        m57961a(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f63017h && this.f63021l) {
            if (motionEvent.getAction() == 0) {
                this.f63018i = motionEvent.getX();
                this.f63019j = motionEvent.getY();
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                m57962a(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (LegacyServiceImpl.createILegacyServicebyMonsterPlugin().getMainPageExperimentService().mo75670a(motionEvent, getContext())) {
            return false;
        }
        boolean z = true;
        if (!((this.f63017h && m57962a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            z = false;
        }
        if (z) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (!((this.f63017h && m57962a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            z = false;
        }
        if (z) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m57962a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        boolean z = true;
        if (action == 0) {
            this.f63018i = motionEvent.getX();
            this.f63019j = motionEvent.getY();
            return true;
        }
        float x = motionEvent.getX() - this.f63018i;
        float y = motionEvent.getY() - this.f63019j;
        if (Math.abs(x) < 1.0E-6f) {
            return true;
        }
        if (C47918gj.m103682a(getContext())) {
            x = -x;
        }
        boolean z2 = false;
        if (x <= 0.0f) {
            if (getCurrentItem() < getItemCount() - 1 && this.f63020k.mo49061a(-1)) {
                z2 = true;
            }
            if ((action == 1 || action == 3) && !z2 && this.f63022m != null && this.f63020k.mo49060a(x, y)) {
                this.f63022m.mo49121a();
            }
            z = z2;
        } else if (getCurrentItem() <= 0 || !this.f63020k.mo49061a(1)) {
            z = false;
        }
        if (!z && x > 0.0f) {
            this.f63018i = motionEvent.getX();
        }
        return z;
    }

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m57961a(context);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        try {
            super.addFocusables(arrayList, i, i2);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            C9220a.m18311a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final boolean mo2984a(View view, boolean z, int i, int i2, int i3) {
        if (this.f63023n || !C23729p.m58262a(view) || !super.mo2984a(view, z, i, i2, i3)) {
            return false;
        }
        return true;
    }
}
