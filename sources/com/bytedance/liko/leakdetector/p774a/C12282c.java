package com.bytedance.liko.leakdetector.p774a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.bytedance.liko.leakdetector.a.c */
public final class C12282c {

    /* renamed from: a */
    public static final C12282c f32395a = new C12282c();

    private C12282c() {
    }

    /* renamed from: a */
    public static void m24764a(Context context, String str) {
        if (context != null) {
            SharedPreferences a = C35807d.m80935a(context, "LeakDetectorSp", 0);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    Editor putString = edit.putString("ld_memory_peak_dump_file", str);
                    if (putString != null) {
                        putString.commit();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m24765b(Context context, String str) {
        if (context != null) {
            SharedPreferences a = C35807d.m80935a(context, "LeakDetectorSp", 0);
            if (a != null) {
                Editor edit = a.edit();
                if (edit != null) {
                    Editor putString = edit.putString("ld_oom_dump_file", str);
                    if (putString != null) {
                        putString.commit();
                    }
                }
            }
        }
    }
}
