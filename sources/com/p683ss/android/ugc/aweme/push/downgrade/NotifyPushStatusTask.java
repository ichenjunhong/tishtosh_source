package com.p683ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.lego.p1915c.C35890a;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.NotifyPushStatusTask */
public class NotifyPushStatusTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    private static boolean isPushProcess(String str) {
        if (TextUtils.isEmpty(str) || (!str.endsWith(":push") && !str.endsWith(":pushservice"))) {
            return false;
        }
        return true;
    }

    public void run(Context context) {
        String b = C35890a.m81059b(context);
        if (isPushProcess(b)) {
            StringBuilder sb = new StringBuilder("content://");
            sb.append(context.getPackageName());
            sb.append(".push.status");
            try {
                context.getContentResolver().call(Uri.parse(sb.toString()), "", b, new Bundle());
            } catch (Throwable unused) {
            }
        }
    }
}
