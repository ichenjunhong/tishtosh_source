package com.p683ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback;

/* renamed from: com.ss.android.ugc.aweme.port.internal.k */
public final /* synthetic */ class C39662k implements IProcessCallback {

    /* renamed from: a */
    private final Activity f101231a;

    /* renamed from: b */
    private final Aweme f101232b;

    public C39662k(Activity activity, Aweme aweme) {
        this.f101231a = activity;
        this.f101232b = aweme;
    }

    public final void finish(Object obj) {
        C39660i.m88352a(this.f101231a, this.f101232b, (PhotoContext) obj);
        C26890h.m65011a("add_watermark", C23089d.m56640a().mo47829a("enter_from", "download_video").f61491a);
    }
}
