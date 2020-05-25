package dmt.p2652av.video.superentrance.player;

import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.tools.utils.C50203g;

/* renamed from: dmt.av.video.superentrance.player.a */
public class C53023a implements C38871j {
    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPlayProgressChange ");
        sb.append(f);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onRetryOnError ");
        sb.append(String.valueOf(dVar));
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPlayCompleted ");
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: d */
    public void mo53534d(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPlayCompletedFirstTime ");
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPreparePlay ");
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPlayFailed ");
        sb.append(String.valueOf(dVar));
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onPausePlay ");
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        String str;
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onRenderReady ");
        if (fVar != null) {
            str = fVar.f125563a;
        } else {
            str = null;
        }
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onBuffering ");
        sb.append(z);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        String str;
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onRenderFirstFrame ");
        if (gVar != null) {
            str = gVar.f125566a;
        } else {
            str = null;
        }
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onResumePlay ");
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
        StringBuilder sb = new StringBuilder("BaseVideoPlayerListener onDecoderBuffering  ");
        sb.append(z);
        C50203g.m108358a(sb.toString());
    }
}
