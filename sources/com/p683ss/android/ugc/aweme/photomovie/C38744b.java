package com.p683ss.android.ugc.aweme.photomovie;

import com.p683ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photomovie.b */
public final class C38744b {
    /* renamed from: a */
    public static final PublishOutput m86100a(PhotoMovieContext photoMovieContext) {
        String str;
        boolean z;
        boolean z2;
        C52711k.m112240b(photoMovieContext, "$this$toPublishOutput");
        String str2 = photoMovieContext.creationId;
        String str3 = photoMovieContext.mFinalVideoTmpPath;
        C42482c cVar = photoMovieContext.mMusic;
        if (cVar != null) {
            str = cVar.getMusicId();
        } else {
            str = null;
        }
        String str4 = str;
        if (photoMovieContext.mMusic != null) {
            C42482c cVar2 = photoMovieContext.mMusic;
            C52711k.m112236a((Object) cVar2, "mMusic");
            z = cVar2.isCommerceMusic();
        } else {
            z = false;
        }
        if (photoMovieContext.mMusic != null) {
            C42482c cVar3 = photoMovieContext.mMusic;
            C52711k.m112236a((Object) cVar3, "mMusic");
            z2 = cVar3.isOriginalSound();
        } else {
            z2 = true;
        }
        PublishOutput publishOutput = new PublishOutput(str2, str3, str4, z, z2);
        return publishOutput;
    }
}
