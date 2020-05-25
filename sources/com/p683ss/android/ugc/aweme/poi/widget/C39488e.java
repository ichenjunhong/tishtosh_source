package com.p683ss.android.ugc.aweme.poi.widget;

import android.view.View.OnClickListener;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.e */
public final class C39488e {

    /* renamed from: a */
    public String f101017a;

    /* renamed from: b */
    public UrlModel f101018b;

    /* renamed from: c */
    public boolean f101019c = true;

    /* renamed from: d */
    public OnClickListener f101020d;

    public C39488e(String str, UrlModel urlModel, boolean z, OnClickListener onClickListener) {
        C52711k.m112240b(str, "title");
        C52711k.m112240b(urlModel, "urlModel");
        C52711k.m112240b(onClickListener, "callback");
        this.f101017a = str;
        this.f101018b = urlModel;
        this.f101020d = onClickListener;
    }
}
