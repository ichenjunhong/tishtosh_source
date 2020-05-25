package com.p683ss.android.ugc.aweme.feed.preload;

import android.content.Context;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.experiment.PreloadMediaCodecListExperiment;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.PreloadMediaCodecListTask */
public class PreloadMediaCodecListTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        if (VERSION.SDK_INT >= 21 && C10181b.m20511a().mo18172a(PreloadMediaCodecListExperiment.class, true, "preload_media_codec", 31744, false)) {
            new MediaCodecList(1).getCodecInfos();
        }
    }
}
