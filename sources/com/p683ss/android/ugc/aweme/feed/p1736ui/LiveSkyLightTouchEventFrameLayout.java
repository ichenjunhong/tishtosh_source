package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.CustomInterceptTouchEventFrameLayout;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveSkyLightTouchEventFrameLayout */
public final class LiveSkyLightTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a */
    private boolean f80438a;

    /* renamed from: b */
    private float f80439b;

    /* renamed from: c */
    private float f80440c;

    /* renamed from: d */
    private long f80441d;

    /* renamed from: e */
    private C52670a<C52860x> f80442e = C30718a.f80445a;

    /* renamed from: f */
    private C52682m<? super Float, ? super Float, Boolean> f80443f = C30719b.f80446a;

    /* renamed from: g */
    private boolean f80444g;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveSkyLightTouchEventFrameLayout$a */
    static final class C30718a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C30718a f80445a = new C30718a();

        C30718a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.LiveSkyLightTouchEventFrameLayout$b */
    static final class C30719b extends C52712l implements C52682m<Float, Float, Boolean> {

        /* renamed from: a */
        public static final C30719b f80446a = new C30719b();

        C30719b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).floatValue();
            ((Number) obj2).floatValue();
            return Boolean.valueOf(false);
        }
    }

    public final C52670a<C52860x> getCallBack() {
        return this.f80442e;
    }

    public final boolean getNeedIntercept() {
        return this.f80444g;
    }

    public final C52682m<Float, Float, Boolean> getScrollPredicate() {
        return this.f80443f;
    }

    public final void setNeedIntercept(boolean z) {
        this.f80444g = z;
    }

    public final void setCallBack(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f80442e = aVar;
    }

    public final void setScrollPredicate(C52682m<? super Float, ? super Float, Boolean> mVar) {
        C52711k.m112240b(mVar, "<set-?>");
        this.f80443f = mVar;
    }

    public LiveSkyLightTouchEventFrameLayout(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "ev");
        super.onInterceptTouchEvent(motionEvent);
        this.f80438a = false;
        switch (motionEvent.getAction()) {
            case 0:
                this.f80439b = motionEvent.getX();
                this.f80440c = motionEvent.getY();
                this.f80441d = System.currentTimeMillis();
                break;
            case 1:
                if (this.f80444g) {
                    float x = motionEvent.getX() - this.f80439b;
                    float y = motionEvent.getY() - this.f80440c;
                    if (Math.abs(x) < ((float) CustomInterceptTouchEventFrameLayout.f62924a) && Math.abs(y) < ((float) CustomInterceptTouchEventFrameLayout.f62924a)) {
                        this.f80442e.invoke();
                        this.f80438a = true;
                        break;
                    }
                }
                break;
            case 2:
                if (this.f80444g) {
                    float x2 = motionEvent.getX() - this.f80439b;
                    float y2 = motionEvent.getY() - this.f80440c;
                    if (Math.abs(x2) <= ((float) CustomInterceptTouchEventFrameLayout.f62924a) && Math.abs(y2) <= ((float) CustomInterceptTouchEventFrameLayout.f62924a)) {
                        if (System.currentTimeMillis() - this.f80441d > ((long) ViewConfiguration.getDoubleTapTimeout())) {
                            this.f80442e.invoke();
                            this.f80438a = true;
                            break;
                        }
                    } else if (((Boolean) this.f80443f.invoke(Float.valueOf(x2), Float.valueOf(y2))).booleanValue()) {
                        this.f80442e.invoke();
                        this.f80438a = true;
                        break;
                    }
                }
                break;
        }
        return this.f80438a;
    }

    public LiveSkyLightTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet);
    }

    public LiveSkyLightTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet, i);
    }

    public LiveSkyLightTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attr");
        super(context, attributeSet, i, i2);
    }
}
