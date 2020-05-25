package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadDmtSecSoTask */
public class PreloadDmtSecSoTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C32458a.m75144a("PreloadDmtSecSoTask");
        SecApiImpl.createISecApibyMonsterPlugin().loadSo();
    }
}
