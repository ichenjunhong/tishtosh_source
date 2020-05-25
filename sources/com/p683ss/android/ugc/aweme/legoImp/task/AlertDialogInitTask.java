package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.uikit.dialog.C11104b;
import com.bytedance.ies.uikit.dialog.C11104b.C11106b;
import com.p683ss.android.ugc.aweme.app.C23036aw;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AlertDialogInitTask */
public class AlertDialogInitTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        if (isMainThread(context)) {
            C11104b.f29897b = new C11106b() {
            };
        }
    }

    public boolean isMainThread(Context context) {
        if (C23036aw.m56553a(context) == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }
}
