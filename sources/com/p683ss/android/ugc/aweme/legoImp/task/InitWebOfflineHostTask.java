package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.falconx.statistic.C9771b;
import com.bytedance.ies.p688h.C10968a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.web.C48380q;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitWebOfflineHostTask */
public class InitWebOfflineHostTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        String k = C48380q.m104676k();
        C10968a.f29454d = k;
        C9771b.f26588a = k;
    }
}
