package com.p683ss.android.ugc.aweme.feed.adapter;

import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p683ss.android.ugc.aweme.feed.helper.C30360a;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout.C30722a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bh */
public final class C30069bh {

    /* renamed from: a */
    public final View f78493a;

    /* renamed from: b */
    public final C30313ae<C30332aw> f78494b;

    /* renamed from: c */
    public final Fragment f78495c;

    /* renamed from: d */
    public final OnTouchListener f78496d;

    /* renamed from: e */
    public final BaseFeedPageParams f78497e;

    /* renamed from: f */
    public final C30198m f78498f;

    /* renamed from: g */
    public final C30360a f78499g;

    /* renamed from: h */
    public final OnTouchListener f78500h;

    /* renamed from: i */
    public final C30722a f78501i;

    /* renamed from: j */
    public final String f78502j;

    /* renamed from: k */
    public final long f78503k;

    /* renamed from: l */
    public final String f78504l;

    private C30069bh(View view, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar, C30360a aVar, OnTouchListener onTouchListener2, C30722a aVar2, String str, long j, String str2) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(aeVar, "listener");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(onTouchListener, "tapTouchListener");
        C52711k.m112240b(baseFeedPageParams, "baseFeedPageParams");
        C52711k.m112240b(mVar, "iHandlePlay");
        C52711k.m112240b(aVar, "feedAllScreenHelper");
        C52711k.m112240b(onTouchListener2, "titleTouchListener");
        C52711k.m112240b(aVar2, "onLongPressAwemeListener");
        C52711k.m112240b(str, "eventType");
        this.f78493a = view;
        this.f78494b = aeVar;
        this.f78495c = fragment;
        this.f78496d = onTouchListener;
        this.f78497e = baseFeedPageParams;
        this.f78498f = mVar;
        this.f78499g = aVar;
        this.f78500h = onTouchListener2;
        this.f78501i = aVar2;
        this.f78502j = str;
        this.f78503k = j;
        this.f78504l = str2;
    }

    public /* synthetic */ C30069bh(View view, C30313ae aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar, C30360a aVar, OnTouchListener onTouchListener2, C30722a aVar2, String str, long j, String str2, int i, C52707g gVar) {
        this(view, aeVar, fragment, onTouchListener, baseFeedPageParams, mVar, aVar, onTouchListener2, aVar2, str, j, null);
    }
}
