package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$3 */
final /* synthetic */ class IMService$$Lambda$3 implements C23371a {
    private final IMService arg$1;
    private final RemoteImageView arg$2;
    private final C23371a arg$3;
    private final Context arg$4;
    private final int arg$5;

    IMService$$Lambda$3(IMService iMService, RemoteImageView remoteImageView, C23371a aVar, Context context, int i) {
        this.arg$1 = iMService;
        this.arg$2 = remoteImageView;
        this.arg$3 = aVar;
        this.arg$4 = context;
        this.arg$5 = i;
    }

    public final void run(Object obj) {
        this.arg$1.lambda$wrapperVideoShareBtnImIconAndText$4$IMService(this.arg$2, this.arg$3, this.arg$4, this.arg$5, (Boolean) obj);
    }
}
