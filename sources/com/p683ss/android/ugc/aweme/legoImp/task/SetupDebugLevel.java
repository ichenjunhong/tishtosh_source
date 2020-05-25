package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Environment;
import com.bytedance.common.utility.C9415i;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SetupDebugLevel */
public class SetupDebugLevel implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public void run(Context context) {
        boolean z;
        try {
            String packageName = context.getPackageName();
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getPath());
            sb.append("/Android/data/");
            sb.append(packageName);
            sb.append("/cache/");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("debug.flag");
            z = new File(sb3.toString()).exists();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C9415i.m18633a(2);
        }
    }
}
