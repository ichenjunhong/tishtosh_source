package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.sdk.webview.p1209a.C19737b;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.services.MainServiceForJsb;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb */
public class SetupMainServiceForJsb implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C19737b.m48250a(new MainServiceForJsb());
    }
}
