package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47818dm;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.CheckNoticeTask */
public class CheckNoticeTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        String str;
        C32458a.m75144a("CheckNoticeTask");
        Boolean valueOf = Boolean.valueOf(C47818dm.m103457a(C11010c.m22280a()));
        Context a = C11010c.m22280a();
        String str2 = "notice";
        if (valueOf.booleanValue()) {
            str = "allow_on";
        } else {
            str = "allow_off";
        }
        C18898c.m46009a(a, str2, str);
    }
}
