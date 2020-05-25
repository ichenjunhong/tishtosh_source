package dmt.p2652av.video;

import android.arch.lifecycle.C0184k;
import android.view.SurfaceView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.Callable;

/* renamed from: dmt.av.video.n */
final /* synthetic */ class C52982n implements Callable {

    /* renamed from: a */
    private final C529801 f131406a;

    /* renamed from: b */
    private final VideoPublishEditModel f131407b;

    C52982n(C529801 r1, VideoPublishEditModel videoPublishEditModel) {
        this.f131406a = r1;
        this.f131407b = videoPublishEditModel;
    }

    public final Object call() {
        return C52979m.m112708a(this.f131407b, (C0184k) C52979m.this, (SurfaceView) null);
    }
}
