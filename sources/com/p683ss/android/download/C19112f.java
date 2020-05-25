package com.p683ss.android.download;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.text.TextUtils;
import com.bytedance.common.utility.p523c.C9384a;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.ss.android.download.f */
public final class C19112f {

    /* renamed from: a */
    static String f52671a;

    /* renamed from: b */
    private static AsyncTask<Void, Integer, Void> f52672b;

    /* renamed from: c */
    private static AsyncTask<Void, Integer, Void> f52673c;

    /* renamed from: com.ss.android.download.f$a */
    public interface C19115a {
        /* renamed from: a */
        void mo39049a(SharedPreferences sharedPreferences);
    }

    /* renamed from: com.ss.android.download.f$b */
    public interface C19116b {
        /* renamed from: a */
        void mo39048a(Editor editor);
    }

    /* renamed from: a */
    public static void m46584a(final Context context, final C19115a aVar) {
        if (!TextUtils.isEmpty(f52671a)) {
            if (!(f52673c == null || f52673c.getStatus() == Status.FINISHED)) {
                f52673c.cancel(true);
            }
            try {
                C191142 r0 = new AsyncTask<Void, Integer, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void doInBackground(Void... voidArr) {
                        synchronized (C19112f.f52671a) {
                            SharedPreferences a = C35807d.m80935a(context, C19112f.f52671a, 0);
                            if (aVar != null) {
                                aVar.mo39049a(a);
                            }
                        }
                        return null;
                    }
                };
                f52673c = r0;
                C9384a.m18565a(r0, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m46585a(Context context, final C19116b bVar) {
        if (!TextUtils.isEmpty(f52671a)) {
            if (!(f52672b == null || f52672b.getStatus() == Status.FINISHED)) {
                f52672b.cancel(true);
            }
            final Context applicationContext = context.getApplicationContext();
            try {
                C191131 r0 = new AsyncTask<Void, Integer, Void>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void doInBackground(Void... voidArr) {
                        synchronized (C19112f.f52671a) {
                            Editor edit = C35807d.m80935a(applicationContext, C19112f.f52671a, 0).edit();
                            if (bVar != null) {
                                bVar.mo39048a(edit);
                            }
                            C9402b.m18594a(edit);
                        }
                        return null;
                    }
                };
                f52672b = r0;
                C9384a.m18565a(r0, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }
}
