package com.p683ss.android.ugc.aweme.photomovie;

import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.util.concurrent.CancellationException;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.photomovie.h */
final /* synthetic */ class C38800h implements C0011g {

    /* renamed from: a */
    private final C387971 f98734a;

    /* renamed from: b */
    private final PhotoMovieContext f98735b;

    C38800h(C387971 r1, PhotoMovieContext photoMovieContext) {
        this.f98734a = r1;
        this.f98735b = photoMovieContext;
    }

    public final Object then(C0013i iVar) {
        C387971 r0 = this.f98734a;
        PhotoMovieContext photoMovieContext = this.f98735b;
        if (iVar.mo31c()) {
            r0.mo34623a((Throwable) new CancellationException());
        } else if (iVar.mo33d()) {
            r0.mo34623a((Throwable) iVar.mo35f());
        } else {
            if (photoMovieContext.isSaveLocalWithoutWaterMark()) {
                C48016e.m103954e(C43308eb.f109498k);
                C48016e.m103948c(photoMovieContext.mOutputVideoPath, photoMovieContext.getLocalTempPath());
            }
            r0.mo34624b(iVar.mo34e());
        }
        return null;
    }
}
