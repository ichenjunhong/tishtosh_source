package com.p683ss.android.ugc.aweme.photo;

import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photo.k */
public final class C38682k {
    /* renamed from: a */
    public static final PublishOutput m86038a(PhotoContext photoContext) {
        C52711k.m112240b(photoContext, "$this$toPublishOutput");
        PublishOutput publishOutput = new PublishOutput(photoContext.creationId, photoContext.mPhotoLocalPath, "", false, false, 24, null);
        return publishOutput;
    }
}
