package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47731bq;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.GeckoTask */
public class GeckoTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void run(Context context) {
        C32458a.m75144a("GeckoTask");
        if (C47731bq.m103352f()) {
            C47731bq.m103332a(C11010c.m22288i());
        } else {
            C47731bq.m103339b(C11010c.m22288i());
        }
    }
}
