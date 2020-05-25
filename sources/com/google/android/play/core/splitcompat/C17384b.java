package com.google.android.play.core.splitcompat;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.C2240a;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.splitcompat.b */
public final class C17384b {

    /* renamed from: a */
    private static ThreadPoolExecutor f48911a;

    /* renamed from: b */
    private final String f48912b;

    public C17384b(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f48912b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private int m42577a(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m42578a(this.f48912b, str, objArr));
        }
        return 0;
    }

    /* renamed from: a */
    private static String m42578a(String str, String str2, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            try {
                str2 = C2240a.m6773a(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                String str3 = "Unable to format ";
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3.concat(valueOf);
                } else {
                    new String(str3);
                }
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public static Executor m42579a() {
        if (f48911a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C17387e());
            f48911a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f48911a;
    }

    /* renamed from: a */
    public final int mo33685a(String str, Object... objArr) {
        return m42577a(4, str, objArr);
    }

    /* renamed from: a */
    public final int mo33686a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m42578a(this.f48912b, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo33687b(String str, Object... objArr) {
        return m42577a(3, str, objArr);
    }

    /* renamed from: c */
    public final int mo33688c(String str, Object... objArr) {
        return m42577a(5, str, objArr);
    }

    /* renamed from: d */
    public final int mo33689d(String str, Object... objArr) {
        return m42577a(6, str, objArr);
    }
}
