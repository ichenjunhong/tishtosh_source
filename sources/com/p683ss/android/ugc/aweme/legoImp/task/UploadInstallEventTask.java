package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.UploadInstallEventTask */
public class UploadInstallEventTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C32458a.m75144a("UploadInstallEventTask");
        if (C23859b.m58575b().mo49471b(context, "is_first_install")) {
            SecApiImpl.createISecApibyMonsterPlugin().reportData("install");
            C23859b.m58575b().mo49466a(context, "is_first_install", false);
        }
    }
}
