package com.p683ss.android.ugc.aweme.requesttask.background;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.video.C48121w;

/* renamed from: com.ss.android.ugc.aweme.requesttask.background.PreCreatePlayerTask */
public class PreCreatePlayerTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C48121w.m104249M().mo95289v();
    }
}
