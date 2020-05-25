package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AntispamApiUploadTask */
public class AntispamApiUploadTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        C32458a.m75144a("AntispamApiUploadTask");
        if (C23859b.m58575b().mo49472b(context, "is_first_install", true)) {
            SecApiImpl.createISecApibyMonsterPlugin().reportData("install");
            C23859b.m58575b().mo49466a(context, "is_first_install", false);
        }
        SecApiImpl.createISecApibyMonsterPlugin().reportData("cold_start");
    }
}
