package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1382aq.C23255y;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.LogLaunchModeTask */
public class LogLaunchModeTask implements LegoTask {
    private String from;
    private String method;
    private Uri uri;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        String str = "";
        if (this.uri != null) {
            str = this.uri.getQueryParameter("enter_to");
        }
        long c = C23859b.m58575b().mo49473c(C32463a.m75161a().getApplicationContext(), "red_point_count");
        C23255y e = new C23255y().mo48177a(this.method).mo48181e(Integer.toString(1));
        if (str == null) {
            str = "";
        }
        C23255y d = e.mo48179c(str).mo48180d(Long.toString(c));
        d.f62158a = this.from;
        d.mo48076e();
    }

    public LogLaunchModeTask(Uri uri2, String str) {
        this.uri = uri2;
        this.from = str;
        this.method = "enter_launch";
    }

    public LogLaunchModeTask(Uri uri2, String str, String str2) {
        this.uri = uri2;
        this.from = str;
        this.method = str2;
    }
}
