package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.squareup.wire.WireFieldNoEnum;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask */
public class PreloadWireFieldNoEnumClassTask implements LegoTask {
    private void preloadClass(Class cls) {
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C32458a.m75144a("PreloadWireFieldNoEnumClassTask");
        try {
            preloadClass(WireFieldNoEnum.class);
        } catch (Throwable unused) {
        }
    }
}
