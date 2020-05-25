package com.p683ss.android.legoimpl;

import android.app.Application;
import android.content.Context;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.legoimpl.BusinessToolsTask */
public class BusinessToolsTask implements LegoTask {
    private Application mApplication;

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public BusinessToolsTask(Application application) {
        this.mApplication = application;
    }

    public void run(Context context) {
        if (this.mApplication != null) {
            C23794bh.m58412z().mo47718d(this.mApplication);
        }
    }
}
