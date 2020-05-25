package com.p683ss.android.ugc.aweme.qrcode;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.f */
public final class C41009f {
    /* renamed from: a */
    static String m90636a() {
        File externalFilesDir = C11010c.m22280a().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        C48016e.m103937a(externalFilesDir);
        return externalFilesDir.getAbsolutePath();
    }

    /* renamed from: a */
    static final /* synthetic */ Object m90635a(File file) throws Exception {
        try {
            file.delete();
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m90638c(int i) {
        if (m90634a(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static File m90634a(int i) {
        String a = m90636a();
        if (!TextUtils.isEmpty(a)) {
            File file = new File(a, m90637b(i));
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: b */
    static String m90637b(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(C20902b.m53242a().getCurUserId());
        if (i == 1) {
            str = "_qrcode_image_cache_for_invite";
        } else {
            str = "_qrcode_image_cache";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    public static void m90639d(int i) {
        if (m90638c(i)) {
            File a = m90634a(i);
            if (a != null && a.exists()) {
                C0013i.m16a((Callable<TResult>) new C41011h<TResult>(a));
            }
        }
    }
}
