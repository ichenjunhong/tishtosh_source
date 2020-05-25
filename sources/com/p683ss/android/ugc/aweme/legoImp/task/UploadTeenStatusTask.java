package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.UploadTeenStatusTask */
public class UploadTeenStatusTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        String str;
        String str2;
        TimeLockUserSetting f = C23794bh.m58390d().mo47109f();
        if (f != null) {
            if (f.isTimeLockOn()) {
                str = "on";
            } else {
                str = "off";
            }
            if (f.isContentFilterOn()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            C26890h.m65011a("time_lock_status", C23089d.m56640a().mo47829a("status", str).f61491a);
            C26890h.m65011a("teen_mode_status", C23089d.m56640a().mo47829a("status", str2).f61491a);
        }
    }
}
