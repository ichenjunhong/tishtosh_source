package com.p683ss.android.ugc.aweme.video;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50144b;

/* renamed from: com.ss.android.ugc.aweme.video.s */
public final /* synthetic */ class C48117s implements C50144b {

    /* renamed from: a */
    public static final C50144b f120925a = new C48117s();

    private C48117s() {
    }

    /* renamed from: a */
    public final String mo95439a(String str) {
        return (str == null || !str.startsWith(WebKitApi.SCHEME_HTTP) || str.startsWith(WebKitApi.SCHEME_HTTPS)) ? str : str.replaceFirst(WebKitApi.SCHEME_HTTP, WebKitApi.SCHEME_HTTPS);
    }
}
