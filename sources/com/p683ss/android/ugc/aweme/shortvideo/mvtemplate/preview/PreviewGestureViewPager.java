package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p683ss.android.ttve.utils.C20141b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager */
public final class PreviewGestureViewPager extends ViewPager {

    /* renamed from: a */
    private float f111969a;

    /* renamed from: b */
    private C44205a f111970b;

    /* renamed from: c */
    private float f111971c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewGestureViewPager$a */
    public interface C44205a {
        /* renamed from: a */
        void mo90118a(boolean z);
    }

    public PreviewGestureViewPager(Context context) {
        this(context, null, 2, null);
    }

    public final void setGestureCallback(C44205a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f111970b = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.f111969a = motionEvent.getX();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        Integer num;
        int i;
        if (motionEvent != null) {
            f = motionEvent.getX();
        } else {
            f = 0.0f;
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 2) {
            if (this.f111969a == -1.0f) {
                this.f111969a = f;
            }
        } else if (num != null && num.intValue() == 1) {
            PagerAdapter adapter = getAdapter();
            if (adapter != null) {
                i = adapter.getCount();
            } else {
                i = 0;
            }
            if (getCurrentItem() == 0 && f - this.f111969a > this.f111971c) {
                C44205a aVar = this.f111970b;
                if (aVar != null) {
                    aVar.mo90118a(true);
                }
            } else if (getCurrentItem() == i - 1 && this.f111969a - f > this.f111971c) {
                C44205a aVar2 = this.f111970b;
                if (aVar2 != null) {
                    aVar2.mo90118a(false);
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public PreviewGestureViewPager(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        this.f111969a = -1.0f;
        this.f111971c = C20141b.m49696a(context, 10.0f);
    }

    public /* synthetic */ PreviewGestureViewPager(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
