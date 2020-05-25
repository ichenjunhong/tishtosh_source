package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$5 */
final /* synthetic */ class IMService$$Lambda$5 implements C33242d {
    private final SharePackage arg$1;
    private final IMUser arg$2;
    private final String arg$3;
    private final C23371a arg$4;

    IMService$$Lambda$5(SharePackage sharePackage, IMUser iMUser, String str, C23371a aVar) {
        this.arg$1 = sharePackage;
        this.arg$2 = iMUser;
        this.arg$3 = str;
        this.arg$4 = aVar;
    }

    public final void sendMsg() {
        IMService.lambda$null$0$IMService(this.arg$1, this.arg$2, this.arg$3, this.arg$4);
    }
}
