package com.p683ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback;

/* renamed from: com.ss.android.ugc.aweme.port.internal.j */
public final /* synthetic */ class C39661j implements IProcessCallback {

    /* renamed from: a */
    private final Activity f101229a;

    /* renamed from: b */
    private final Aweme f101230b;

    public C39661j(Activity activity, Aweme aweme) {
        this.f101229a = activity;
        this.f101230b = aweme;
    }

    public final void finish(Object obj) {
        C39660i.m88352a(this.f101229a, this.f101230b, (PhotoContext) obj);
    }
}
