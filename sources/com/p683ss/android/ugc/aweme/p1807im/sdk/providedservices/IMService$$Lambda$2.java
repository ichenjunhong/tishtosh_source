package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IMService$$Lambda$2 */
final /* synthetic */ class IMService$$Lambda$2 implements Runnable {
    private final Context arg$1;
    private final RemoteImageView arg$2;
    private final int arg$3;

    IMService$$Lambda$2(Context context, RemoteImageView remoteImageView, int i) {
        this.arg$1 = context;
        this.arg$2 = remoteImageView;
        this.arg$3 = i;
    }

    public final void run() {
        IMService.lambda$wrapperIMShareIcon$3$IMService(this.arg$1, this.arg$2, this.arg$3);
    }
}
