package com.p683ss.android.agilelogger.p1135e;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.C2240a;
import com.p683ss.android.agilelogger.C18816f;
import com.p683ss.android.agilelogger.C18832g;
import com.p683ss.android.agilelogger.p1136f.C18817a;
import com.p683ss.android.agilelogger.p1136f.C18829j;
import java.util.Locale;

/* renamed from: com.ss.android.agilelogger.e.b */
public final class C18814b {
    /* renamed from: a */
    public static void m45894a(C18816f fVar) {
        String str;
        String str2 = "";
        switch (fVar.f51991g) {
            case MSG:
                str2 = (String) fVar.f51992h;
                break;
            case STACKTRACE_STR:
                if (fVar.f51993i != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(fVar.f51993i);
                    sb.append(C18829j.m45923a((Throwable) fVar.f51992h));
                    str2 = sb.toString();
                    break;
                } else {
                    str2 = C18829j.m45923a((Throwable) fVar.f51992h);
                    break;
                }
            case BORDER:
                str2 = C18817a.m45900a(fVar.f51991g, (String) fVar.f51992h);
                break;
            case JSON:
                str2 = C18817a.m45900a(fVar.f51991g, (String) fVar.f51992h);
                break;
            case BUNDLE:
                str2 = C18817a.m45899a(fVar.f51991g, (Bundle) fVar.f51992h);
                break;
            case INTENT:
                str2 = C18817a.m45898a(fVar.f51991g, (Intent) fVar.f51992h);
                break;
            case THROWABLE:
                str2 = C18817a.m45902a(fVar.f51991g, (Throwable) fVar.f51992h);
                break;
            case THREAD:
                str2 = C18817a.m45901a(fVar.f51991g, (Thread) fVar.f51992h);
                break;
            case STACKTRACE:
                str2 = C18817a.m45903a(fVar.f51991g, (StackTraceElement[]) fVar.f51992h);
                break;
        }
        fVar.f51988d = str2;
        Locale locale = Locale.getDefault();
        String str3 = "[%s][%d:%d%s][%s][%s][%s, %s, %s]%s\n";
        Object[] objArr = new Object[10];
        objArr[0] = "";
        objArr[1] = Integer.valueOf(Process.myPid());
        objArr[2] = Long.valueOf(fVar.f51989e);
        if (fVar.f51990f) {
            str = "*";
        } else {
            str = "";
        }
        objArr[3] = str;
        objArr[4] = C18832g.m45925a(fVar.f51986b);
        objArr[5] = "";
        objArr[6] = fVar.f51994j;
        objArr[7] = fVar.f51995k;
        objArr[8] = fVar.f51996l;
        objArr[9] = fVar.f51988d;
        C2240a.m6773a(locale, str3, objArr);
    }
}
