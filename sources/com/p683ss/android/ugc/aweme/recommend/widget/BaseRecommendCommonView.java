package com.p683ss.android.ugc.aweme.recommend.widget;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.BaseRecommendCommonView */
public abstract class BaseRecommendCommonView extends FrameLayout implements C0199s<C23274a> {

    /* renamed from: a */
    private final View f104538a;

    /* renamed from: b */
    private final DataCenter f104539b;

    /* renamed from: c */
    private final ViewStub f104540c;

    public BaseRecommendCommonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BaseRecommendCommonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public void onChanged(C23274a aVar) {
    }

    public abstract int getContentLayoutResId();

    /* access modifiers changed from: protected */
    public final DataCenter getMDataCenter() {
        return this.f104539b;
    }

    /* access modifiers changed from: protected */
    public final View getMRootView() {
        return this.f104538a;
    }

    /* access modifiers changed from: protected */
    public final Context getMContext() {
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        return context;
    }

    /* access modifiers changed from: protected */
    public final FragmentActivity getMActivity() {
        Context context = getContext();
        if (context != null) {
            return (FragmentActivity) context;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public BaseRecommendCommonView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.byx, this);
        C52711k.m112236a((Object) inflate, "View.inflate(context, R.…mmon_user_vertical, this)");
        this.f104538a = inflate;
        C0210y a = C0214z.m440a(getMActivity());
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            this.f104539b = DataCenter.m57235a(a, (C0184k) mActivity);
            View findViewById = this.f104538a.findViewById(R.id.zn);
            C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.content_container)");
            this.f104540c = (ViewStub) findViewById;
            this.f104540c.setLayoutResource(getContentLayoutResId());
            this.f104540c.inflate();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public /* synthetic */ BaseRecommendCommonView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
