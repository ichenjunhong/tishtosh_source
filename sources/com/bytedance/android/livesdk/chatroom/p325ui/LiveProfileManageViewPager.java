package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.viewpager.C4281a;
import com.bytedance.android.live.uikit.viewpager.SSViewPager;
import com.bytedance.android.livesdk.chatroom.p325ui.C6080dg.C6082b;
import com.bytedance.android.livesdk.p428z.C8592c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageViewPager */
public final class LiveProfileManageViewPager extends SSViewPager {

    /* renamed from: b */
    public static final C5913a f15519b = new C5913a(null);

    /* renamed from: a */
    C5914b f15520a;

    /* renamed from: c */
    private boolean f15521c;

    /* renamed from: d */
    private boolean f15522d;

    /* renamed from: e */
    private ValueAnimator f15523e;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageViewPager$a */
    public static final class C5913a {
        private C5913a() {
        }

        public /* synthetic */ C5913a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageViewPager$b */
    public static final class C5914b extends C4281a {

        /* renamed from: a */
        public C6093dl f15524a;

        /* renamed from: e */
        public C8592c f15525e;

        /* renamed from: f */
        public final Context f15526f;

        /* renamed from: g */
        public final LayoutInflater f15527g;

        /* renamed from: h */
        public final C6082b f15528h;

        /* renamed from: i */
        public final Room f15529i;

        /* renamed from: j */
        public final User f15530j;

        /* renamed from: k */
        public final boolean f15531k;

        /* renamed from: l */
        public final boolean f15532l;

        public final int getCount() {
            return 2;
        }

        /* renamed from: a */
        public final void mo11835a(int i) {
            this.f15525e.mo15080a(i);
        }

        /* renamed from: a */
        public final void mo11836a(boolean z) {
            this.f15524a.mo12127b(z);
        }

        /* renamed from: a */
        public final View mo8729a(int i, View view, ViewGroup viewGroup) {
            View view2;
            if (i == 0) {
                view2 = this.f15524a;
            } else {
                view2 = this.f15525e;
            }
            return view2;
        }

        public C5914b(Context context, LayoutInflater layoutInflater, C6082b bVar, Room room, User user, boolean z, boolean z2) {
            Long l;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(layoutInflater, "layoutInflater");
            C52711k.m112240b(bVar, "manageClickCallback");
            super(context, layoutInflater);
            this.f15526f = context;
            this.f15527g = layoutInflater;
            this.f15528h = bVar;
            this.f15529i = room;
            this.f15530j = user;
            this.f15531k = z;
            this.f15532l = z2;
            C6093dl dlVar = new C6093dl(this.f15526f, this.f15529i, this.f15530j, this.f15531k, this.f15532l);
            this.f15524a = dlVar;
            Context context2 = this.f15526f;
            Room room2 = this.f15529i;
            Long l2 = null;
            if (room2 != null) {
                l = Long.valueOf(room2.getId());
            } else {
                l = null;
            }
            Room room3 = this.f15529i;
            if (room3 != null) {
                User owner = room3.getOwner();
                if (owner != null) {
                    l2 = Long.valueOf(owner.getId());
                }
            }
            this.f15525e = new C8592c(context2, l, l2);
            this.f15524a.setClickCallback(this.f15528h);
            this.f15525e.setClickCallback(this.f15528h);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileManageViewPager$c */
    static final class C5915c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ LiveProfileManageViewPager f15533a;

        /* renamed from: b */
        final /* synthetic */ LayoutParams f15534b;

        C5915c(LiveProfileManageViewPager liveProfileManageViewPager, LayoutParams layoutParams) {
            this.f15533a = liveProfileManageViewPager;
            this.f15534b = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112240b(valueAnimator, "animation");
            LayoutParams layoutParams = this.f15534b;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = ((Integer) animatedValue).intValue();
                this.f15533a.setLayoutParams(this.f15534b);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public LiveProfileManageViewPager(Context context) {
        this(context, null, 2, null);
    }

    public final ValueAnimator getHeightAnimator() {
        return this.f15523e;
    }

    public final C5914b getMAdapter() {
        return this.f15520a;
    }

    /* renamed from: a */
    public final void mo11828a() {
        C5914b bVar = this.f15520a;
        if (bVar != null) {
            bVar.f15524a.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = bVar.f15524a.getMeasuredHeight();
            LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = measuredHeight;
            setLayoutParams(layoutParams);
        }
    }

    public final void setHeightAnimator(ValueAnimator valueAnimator) {
        this.f15523e = valueAnimator;
    }

    public final void setMAdapter(C5914b bVar) {
        this.f15520a = bVar;
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.f15521c) {
            return super.canScrollHorizontally(i);
        }
        return this.f15521c;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15521c) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return this.f15521c;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f15521c) {
            return super.onTouchEvent(motionEvent);
        }
        return this.f15521c;
    }

    public final void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        if (pagerAdapter != null && (pagerAdapter instanceof C5914b)) {
            this.f15520a = (C5914b) pagerAdapter;
        }
    }

    /* renamed from: a */
    public final void mo11829a(int i) {
        C5914b bVar = this.f15520a;
        if (bVar != null) {
            bVar.mo11835a(i);
            setCurrentItem(1, true);
            mo11830a((View) bVar.f15525e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11830a(View view) {
        if (view != null) {
            this.f15522d = false;
            view.measure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = view.getMeasuredHeight();
            LayoutParams layoutParams = getLayoutParams();
            int measuredHeight2 = getMeasuredHeight();
            ValueAnimator valueAnimator = this.f15523e;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            this.f15523e = ValueAnimator.ofInt(new int[]{measuredHeight2, measuredHeight});
            ValueAnimator valueAnimator2 = this.f15523e;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new C5915c(this, layoutParams));
                valueAnimator2.setDuration(300).start();
            }
        }
    }

    public LiveProfileManageViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15522d = true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.f15522d) {
            int childCount = getChildCount();
            int i3 = 9999;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
                if (childAt != null && (childAt instanceof C6093dl)) {
                    i3 = ((C6093dl) childAt).getMeasuredHeight();
                }
            }
            i2 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public /* synthetic */ LiveProfileManageViewPager(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public final boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (this.f15521c) {
            return super.canScroll(view, z, i, i2, i3);
        }
        return this.f15521c;
    }
}
