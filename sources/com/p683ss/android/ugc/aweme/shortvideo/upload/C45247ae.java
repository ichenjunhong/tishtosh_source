package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.ttuploader.TTUploadLog;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ae */
public final class C45247ae {
    /* renamed from: a */
    public static final void m98723a() {
        if (m98724b()) {
            TTUploadLog.turnOn(1, 1);
        }
    }

    /* renamed from: b */
    private static final boolean m98724b() {
        if (TextUtils.equals(C11010c.m22295p(), "local_test")) {
            return true;
        }
        return false;
    }
}
