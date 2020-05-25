package com.p683ss.android.agilelogger.p1125b.p1127b.p1129b;

import android.content.Intent;
import com.p683ss.android.agilelogger.p1136f.C18823e;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.ss.android.agilelogger.b.b.b.b */
public final class C18794b implements C18795c<Intent> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo38395a(Object obj) {
        return m45867a((Intent) obj);
    }

    /* renamed from: a */
    public static String m45867a(Intent intent) {
        if (intent == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        C18823e.m45913a(intent, sb);
        sb.append(" }");
        return sb.toString();
    }
}
