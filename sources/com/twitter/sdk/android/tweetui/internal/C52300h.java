package com.twitter.sdk.android.tweetui.internal;

import android.os.Build.VERSION;
import com.twitter.sdk.android.core.models.C52203j;
import com.twitter.sdk.android.core.models.C52217t.C52218a;

/* renamed from: com.twitter.sdk.android.tweetui.internal.h */
public final class C52300h {
    /* renamed from: a */
    public static C52218a m111737a(C52203j jVar) {
        for (C52218a aVar : jVar.videoInfo.variants) {
            boolean z = true;
            if ((VERSION.SDK_INT < 21 || !"application/x-mpegURL".equals(aVar.contentType)) && !"video/mp4".equals(aVar.contentType)) {
                z = false;
                continue;
            }
            if (z) {
                return aVar;
            }
        }
        return null;
    }
}
