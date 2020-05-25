package com.p683ss.android.vesdk.runtime;

import com.p683ss.android.vesdk.C50751p;
import java.io.File;

/* renamed from: com.ss.android.vesdk.runtime.e */
public final class C50772e {

    /* renamed from: a */
    public String f127570a = VERuntime.m109853a().f127477e.f127520a;

    /* renamed from: a */
    public static String m109884a(String str, String str2) throws C50751p {
        File file = new File(str, str2);
        if (file.exists() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder("mkdirs failed, workspace path: ");
        sb.append(str);
        throw new C50751p(-100, sb.toString());
    }
}
