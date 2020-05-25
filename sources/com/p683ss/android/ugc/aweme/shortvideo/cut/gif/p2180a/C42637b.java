package com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a;

import com.p683ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p683ss.android.vesdk.C50720o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.b */
public final class C42637b {
    /* renamed from: a */
    static final /* synthetic */ Object m93551a(ConvertListener convertListener, C50720o oVar) throws Exception {
        convertListener.onDone(false);
        oVar.mo99389m();
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93550a(int i, ConvertListener convertListener, float f, C50720o oVar) throws Exception {
        if (i == 4103) {
            convertListener.onDone(true);
            oVar.mo99389m();
        } else if (i == 4105) {
            convertListener.onUpdateProgress((int) (f * 100.0f));
        }
        return null;
    }
}
