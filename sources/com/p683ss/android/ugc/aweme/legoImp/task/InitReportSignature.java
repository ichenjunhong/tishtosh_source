package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitReportSignature */
public class InitReportSignature implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        NetworkUtils.setServerTimeFromResponse(C35980g.f92209a);
    }

    static final /* synthetic */ long lambda$run$0$InitReportSignature(String str) {
        try {
            return ((JSONObject) new JSONObject(str).get("extra")).optLong("now", -1);
        } catch (Exception unused) {
            return -1;
        }
    }
}
