package com.p683ss.android.ugc.aweme.p1807im.service.share.p1909b;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.service.share.b.a */
public final class C35479a extends C35480b {

    /* renamed from: a */
    public final ViewGroup f91196a;

    /* renamed from: b */
    public final ViewGroup f91197b;

    /* renamed from: c */
    public final FrameLayout f91198c;

    /* renamed from: d */
    public final boolean f91199d;

    /* renamed from: e */
    public final MeasureLinearLayout f91200e;

    public C35479a(Activity activity, SharePackage sharePackage, ViewGroup viewGroup, ViewGroup viewGroup2, FrameLayout frameLayout, boolean z, MeasureLinearLayout measureLinearLayout) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C52711k.m112240b(viewGroup, "headerContainer");
        C52711k.m112240b(viewGroup2, "editContainer");
        C52711k.m112240b(frameLayout, "sendContainer");
        C52711k.m112240b(measureLinearLayout, "rootContainer");
        super(activity, sharePackage, null, 4, null);
        this.f91196a = viewGroup;
        this.f91197b = viewGroup2;
        this.f91198c = frameLayout;
        this.f91199d = z;
        this.f91200e = measureLinearLayout;
    }
}
