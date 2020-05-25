package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c.C35109a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$0 */
final /* synthetic */ class IMService$$Lambda$0 implements C35109a {
    private final Activity arg$1;
    private final SharePackage arg$2;
    private final IMUser arg$3;
    private final C23371a arg$4;

    IMService$$Lambda$0(Activity activity, SharePackage sharePackage, IMUser iMUser, C23371a aVar) {
        this.arg$1 = activity;
        this.arg$2 = sharePackage;
        this.arg$3 = iMUser;
        this.arg$4 = aVar;
    }

    public final void onShare(String str) {
        new C33220b(this.arg$1, new IMService$$Lambda$5(this.arg$2, this.arg$3, str, this.arg$4)).sendMsg();
    }
}
