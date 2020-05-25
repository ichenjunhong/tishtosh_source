package com.p683ss.android.ugc.aweme.shortvideo.p2241t;

import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.asve.recorder.RecorderConcatResult;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g.C44886a;
import java.lang.ref.WeakReference;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.t.l */
public final /* synthetic */ class C44891l implements C52671b {

    /* renamed from: a */
    private final C44886a f113612a;

    /* renamed from: b */
    private final WeakReference f113613b;

    /* renamed from: c */
    private final C44881d f113614c;

    public C44891l(C44886a aVar, WeakReference weakReference, C44881d dVar) {
        this.f113612a = aVar;
        this.f113613b = weakReference;
        this.f113614c = dVar;
    }

    public final Object invoke(Object obj) {
        C44886a aVar = this.f113612a;
        WeakReference weakReference = this.f113613b;
        C44881d dVar = this.f113614c;
        RecorderConcatResult recorderConcatResult = (RecorderConcatResult) obj;
        if (((C44881d) weakReference.get()) != null) {
            new Handler(Looper.getMainLooper()).post(new C44892m(aVar, dVar, recorderConcatResult));
        }
        return C52860x.f131107a;
    }
}
