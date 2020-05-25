package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.Looper;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9610j;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p551k.p552a.C9628f;
import com.bytedance.crash.p554m.C9668b;
import com.p683ss.android.anrmonitor.ANRError;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.utils.C47913ge;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.AnrTask */
public class AnrTask implements LegoTask {
    /* access modifiers changed from: 0000 */
    public final /* synthetic */ void lambda$run$0$AnrTask(ANRError aNRError, int i) {
    }

    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public void run(Context context) {
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    private void uploadANRToSlardar(ANRError aNRError) {
        if (C9610j.m19136a() && aNRError != null && aNRError.getStackTraces() != null) {
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aNRError.getStackTraces().get(Looper.getMainLooper().getThread());
            if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
                StringBuilder sb = new StringBuilder("AnrMonitor: ");
                sb.append(stackTraceElementArr[0].toString());
                sb.append(" caused anr\nat ");
                sb.append(stackTraceElementArr[0].getClassName());
                sb.append(" (");
                String className = stackTraceElementArr[0].getClassName();
                int lastIndexOf = className.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    className = className.substring(lastIndexOf + 1);
                }
                sb.append(className);
                sb.append(".java:0)\n");
                sb.append(C47913ge.m103638a(stackTraceElementArr));
                String sb2 = sb.toString();
                C9584a aVar = new C9584a(new JSONObject());
                aVar.mo17395a("data", (Object) sb2);
                aVar.mo17395a("isOOM", (Object) Boolean.valueOf(false));
                aVar.mo17395a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
                C9668b.m19279a(C9668b.m19285a(C9616k.m19147a().mo17446a()), C9628f.m19195a().mo17472a(C9571d.JAVA, aVar).f26141a.toString());
            }
        }
    }
}
