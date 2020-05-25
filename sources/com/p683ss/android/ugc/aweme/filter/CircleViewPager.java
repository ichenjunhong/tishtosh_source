package com.p683ss.android.ugc.aweme.filter;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.p683ss.android.ugc.aweme.views.FixedViewPager;
import com.p683ss.android.ugc.tools.view.p2510c.C50222e;

/* renamed from: com.ss.android.ugc.aweme.filter.CircleViewPager */
public class CircleViewPager extends FixedViewPager {

    /* renamed from: a */
    private int f82141a;

    /* renamed from: b */
    private C31366a f82142b;

    /* renamed from: c */
    private int f82143c;

    /* renamed from: d */
    private C31367b f82144d;

    /* renamed from: com.ss.android.ugc.aweme.filter.CircleViewPager$a */
    public interface C31366a {
        /* renamed from: a */
        void mo64255a();

        /* renamed from: a */
        void mo64256a(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.CircleViewPager$b */
    public interface C31367b {
    }

    /* renamed from: a */
    private void m73122a() {
        setOnTouchListener(new C50222e(1.2f, 200, null));
    }

    public void setOnScrolledListener(C31366a aVar) {
        this.f82142b = aVar;
    }

    public void setOnViewPagerTouchEventListener(C31367b bVar) {
        this.f82144d = bVar;
    }

    public CircleViewPager(Context context) {
        super(context);
        m73122a();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setStartItem(int i) {
        this.f82143c = i;
        setCurrentItem(i);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        this.f82141a = getWidth();
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    public final void mo64249a(float f) {
        float currentItem = ((((float) getCurrentItem()) + f) - ((float) this.f82143c)) * ((float) this.f82141a);
        if (currentItem >= ((float) ((-this.f82143c) * this.f82141a))) {
            if (currentItem > ((float) (((getAdapter().getCount() - this.f82143c) - 1) * this.f82141a))) {
                if (this.f82142b != null) {
                    this.f82142b.mo64255a();
                }
                return;
            }
            if (this.f82142b != null) {
                this.f82142b.mo64256a(f);
            }
            scrollTo((int) currentItem, 0);
        }
    }

    public CircleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m73122a();
    }
}
