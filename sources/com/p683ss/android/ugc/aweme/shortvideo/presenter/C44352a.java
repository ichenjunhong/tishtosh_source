package com.p683ss.android.ugc.aweme.shortvideo.presenter;

import com.p683ss.android.medialib.player.EffectConfig;
import com.p683ss.android.ugc.aweme.effect.C29205j;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.p2178c.C42483a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p001a.C0013i;
import p2628d.C52855s;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.a */
public final class C44352a {

    /* renamed from: a */
    private static final ExecutorService f112248a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49845a("EffectVideoCover").mo49844a(3).mo49847a());

    /* renamed from: a */
    public static void m97145a(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback) {
        m97146a(list, str, f, i, z, editPreviewInfo, null, onVideoCoverCallback);
    }

    /* renamed from: a */
    public static void m97146a(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, String str2, OnVideoCoverCallback onVideoCoverCallback) {
        C42483a aVar = new C42483a();
        C52855s a = C43668b.m95934a(editPreviewInfo, z, (long) i);
        EditVideoSegment editVideoSegment = (EditVideoSegment) a.getFirst();
        if (aVar.init(editVideoSegment.getVideoPath()) < 0) {
            if (onVideoCoverCallback != null) {
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
            }
            aVar.stopRender();
            return;
        }
        EffectConfig filter = C29205j.m68772a(list, editVideoSegment.getVideoCutInfo(), z, (long[]) a.getThird()).setFilter(str);
        if (f != -1.0f) {
            filter.setFilterIntensity(f);
        }
        int width = editVideoSegment.getVideoFileInfo().getWidth();
        if (width <= 0 || width >= 256) {
            width = UnReadVideoExperiment.BROWSE_RECORD_LIST;
        }
        aVar.renderVideo(new long[]{((Long) a.getSecond()).longValue()}, filter, width, width);
        C44353b bVar = new C44353b(z, editVideoSegment, aVar, str2, onVideoCoverCallback);
        C0013i.m18a((Callable<TResult>) bVar, (Executor) f112248a);
    }
}
