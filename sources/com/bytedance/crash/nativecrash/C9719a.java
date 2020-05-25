package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.crash.p555n.C9705m;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.crash.nativecrash.a */
public final class C9719a {

    /* renamed from: a */
    public Map<String, String> f26448a;

    /* renamed from: b */
    public final String mo17544b() {
        return (String) this.f26448a.get("signal_line");
    }

    /* renamed from: a */
    public final boolean mo17543a() {
        if (this.f26448a == null || this.f26448a.isEmpty() || TextUtils.isEmpty((CharSequence) this.f26448a.get("process_name")) || TextUtils.isEmpty((CharSequence) this.f26448a.get("crash_thread_name")) || TextUtils.isEmpty((CharSequence) this.f26448a.get("pid")) || TextUtils.isEmpty((CharSequence) this.f26448a.get("tid")) || TextUtils.isEmpty((CharSequence) this.f26448a.get("start_time")) || TextUtils.isEmpty((CharSequence) this.f26448a.get("crash_time")) || TextUtils.isEmpty((CharSequence) this.f26448a.get("signal_line"))) {
            return false;
        }
        return true;
    }

    public C9719a(File file) {
        String str;
        File e = C9705m.m19401e(file);
        if (e.exists() && e.length() != 0) {
            String absolutePath = e.getAbsolutePath();
            if (!NativeImpl.f26446a) {
                str = null;
            } else {
                str = NativeImpl.doGetCrashHeader(absolutePath);
            }
            if (str != null) {
                String[] split = str.split("\n");
                this.f26448a = new HashMap();
                for (String split2 : split) {
                    String[] split3 = split2.split("=");
                    if (split3.length == 2) {
                        this.f26448a.put(split3[0], split3[1]);
                    }
                }
            }
        }
    }
}
