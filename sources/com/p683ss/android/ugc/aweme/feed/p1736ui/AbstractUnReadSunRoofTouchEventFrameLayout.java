package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.AbstractUnReadSunRoofTouchEventFrameLayout */
public abstract class AbstractUnReadSunRoofTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a */
    private C52670a<C52860x> f80333a;

    /* renamed from: b */
    private C52682m<? super Float, ? super Float, Boolean> f80334b;

    /* renamed from: c */
    private boolean f80335c;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.AbstractUnReadSunRoofTouchEventFrameLayout$a */
    static final class C30693a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C30693a f80336a = new C30693a();

        C30693a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.AbstractUnReadSunRoofTouchEventFrameLayout$b */
    static final class C30694b extends C52712l implements C52682m<Float, Float, Boolean> {

        /* renamed from: a */
        public static final C30694b f80337a = new C30694b();

        C30694b() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).floatValue();
            ((Number) obj2).floatValue();
            return Boolean.valueOf(false);
        }
    }

    public AbstractUnReadSunRoofTouchEventFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AbstractUnReadSunRoofTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C52670a<C52860x> getCallBack() {
        return this.f80333a;
    }

    public final boolean getNeedIntercept() {
        return this.f80335c;
    }

    public final C52682m<Float, Float, Boolean> getScrollPredicate() {
        return this.f80334b;
    }

    public final void setNeedIntercept(boolean z) {
        this.f80335c = z;
    }

    public final void setCallBack(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f80333a = aVar;
    }

    public final void setScrollPredicate(C52682m<? super Float, ? super Float, Boolean> mVar) {
        C52711k.m112240b(mVar, "<set-?>");
        this.f80334b = mVar;
    }

    public AbstractUnReadSunRoofTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f80333a = C30693a.f80336a;
        this.f80334b = C30694b.f80337a;
    }

    public /* synthetic */ AbstractUnReadSunRoofTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
