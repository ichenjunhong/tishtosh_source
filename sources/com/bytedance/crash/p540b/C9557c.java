package com.bytedance.crash.p540b;

import android.app.ActivityManager;
import android.app.ActivityManager.ProcessErrorStateInfo;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.p555n.C9713t;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.c */
public final class C9557c {

    /* renamed from: a */
    public static ProcessErrorStateInfo f26057a;

    /* renamed from: a */
    public static JSONObject m18964a(boolean z) throws JSONException {
        try {
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", C9713t.m19436a(stackTrace));
            return jSONObject;
        } catch (Throwable th) {
            C9577e.m18999a().mo17384a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: a */
    static String m18963a(Context context, int i) {
        ProcessErrorStateInfo processErrorStateInfo;
        boolean z;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                int myPid = Process.myPid();
                List processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    Iterator it = processesInErrorState.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        processErrorStateInfo = (ProcessErrorStateInfo) it.next();
                        if (processErrorStateInfo.pid == myPid && processErrorStateInfo.condition == 2) {
                            break;
                        }
                    }
                }
            }
            processErrorStateInfo = null;
            if (processErrorStateInfo != null && Process.myPid() == processErrorStateInfo.pid) {
                if (f26057a != null) {
                    ProcessErrorStateInfo processErrorStateInfo2 = f26057a;
                    if (!String.valueOf(processErrorStateInfo2.condition).equals(String.valueOf(processErrorStateInfo.condition)) || !String.valueOf(processErrorStateInfo2.processName).equals(String.valueOf(processErrorStateInfo.processName)) || !String.valueOf(processErrorStateInfo2.pid).equals(String.valueOf(processErrorStateInfo.pid)) || !String.valueOf(processErrorStateInfo2.uid).equals(String.valueOf(processErrorStateInfo.uid)) || !String.valueOf(processErrorStateInfo2.tag).equals(String.valueOf(processErrorStateInfo.tag)) || !String.valueOf(processErrorStateInfo2.shortMsg).equals(String.valueOf(processErrorStateInfo.shortMsg)) || !String.valueOf(processErrorStateInfo2.longMsg).equals(String.valueOf(processErrorStateInfo.longMsg))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                }
                f26057a = processErrorStateInfo;
                StringBuilder sb = new StringBuilder();
                sb.append("|------------- processErrorStateInfo--------------|\n");
                StringBuilder sb2 = new StringBuilder("condition: ");
                sb2.append(processErrorStateInfo.condition);
                sb2.append("\n");
                sb.append(sb2.toString());
                StringBuilder sb3 = new StringBuilder("processName: ");
                sb3.append(processErrorStateInfo.processName);
                sb3.append("\n");
                sb.append(sb3.toString());
                StringBuilder sb4 = new StringBuilder("pid: ");
                sb4.append(processErrorStateInfo.pid);
                sb4.append("\n");
                sb.append(sb4.toString());
                StringBuilder sb5 = new StringBuilder("uid: ");
                sb5.append(processErrorStateInfo.uid);
                sb5.append("\n");
                sb.append(sb5.toString());
                StringBuilder sb6 = new StringBuilder("tag: ");
                sb6.append(processErrorStateInfo.tag);
                sb6.append("\n");
                sb.append(sb6.toString());
                StringBuilder sb7 = new StringBuilder("shortMsg : ");
                sb7.append(processErrorStateInfo.shortMsg);
                sb7.append("\n");
                sb.append(sb7.toString());
                StringBuilder sb8 = new StringBuilder("longMsg : ");
                sb8.append(processErrorStateInfo.longMsg);
                sb8.append("\n");
                sb.append(sb8.toString());
                sb.append("-----------------------end----------------------------");
                return sb.toString();
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
