package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C22927af;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SetupTestSpHost */
public class SetupTestSpHost implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        String string = C35807d.m80935a(context, "test_data", 0).getString("host", "");
        if (!TextUtils.isEmpty(string)) {
            C22927af.m56377a().mo47702a(string);
        }
    }
}
