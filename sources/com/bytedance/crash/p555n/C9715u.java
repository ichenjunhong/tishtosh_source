package com.bytedance.crash.p555n;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.crash.C9616k;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.n.u */
public final class C9715u {
    /* renamed from: a */
    private static long m19450a() {
        try {
            return m19454b(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m19453b() {
        try {
            return m19451a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static long m19455c() {
        try {
            return m19454b(C9616k.m19154f().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static long m19456d() {
        try {
            return m19451a(C9616k.m19154f().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static boolean m19459g() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: e */
    private static long m19457e() {
        try {
            if (m19459g()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: f */
    private static long m19458f() {
        try {
            if (m19459g()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: a */
    private static long m19451a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private static long m19454b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (VERSION.SDK_INT >= 18) {
                return statFs.getFreeBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m19452a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m19450a());
            jSONObject.put("inner_total", m19453b());
            jSONObject.put("sdcard_free", m19457e());
            jSONObject.put("sdcard_total", m19458f());
            jSONObject.put("inner_free_real", m19455c());
            jSONObject.put("inner_total_real", m19456d());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
