package com.p683ss.android.agilelogger.p1125b.p1131c;

import com.p683ss.android.agilelogger.p1136f.C18830k;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

/* renamed from: com.ss.android.agilelogger.b.c.a */
public final class C18798a implements C18799b {
    /* renamed from: a */
    public final /* synthetic */ String mo38395a(Object obj) {
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj;
        StringBuilder sb = new StringBuilder(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return null;
        }
        if (stackTraceElementArr.length == 1) {
            StringBuilder sb2 = new StringBuilder("\t─ ");
            sb2.append(stackTraceElementArr[0].toString());
            return sb2.toString();
        }
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                sb.append("\t├ ");
                sb.append(stackTraceElementArr[i].toString());
                sb.append(C18830k.f52009a);
            } else {
                sb.append("\t└ ");
                sb.append(stackTraceElementArr[i].toString());
            }
        }
        return sb.toString();
    }
}
