package com.p683ss.android.ugc.p2425e.p2428c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.p2425e.p2426a.C48550e;

/* renamed from: com.ss.android.ugc.e.c.a */
public final class C48555a {

    /* renamed from: a */
    public C48550e f122010a;

    /* renamed from: b */
    public boolean f122011b;

    /* renamed from: c */
    private boolean f122012c = true;

    public C48555a(C48550e eVar) {
        this.f122010a = eVar;
    }

    /* renamed from: a */
    public final void mo96058a(final String str, boolean z) {
        this.f122011b = z;
        new AsyncTask() {
            /* access modifiers changed from: protected */
            public final Object doInBackground(Object[] objArr) {
                try {
                    return NetworkUtils.executeGet(0, str);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            public final void onPostExecute(Object obj) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (C48555a.this.f122010a != null) {
                        C48555a.this.f122010a.mo76938a(null, str, 4, C48555a.this.f122011b);
                    }
                } else if (C48555a.this.f122010a != null) {
                    C48555a.this.f122010a.mo76935a(1);
                }
            }
        }.execute(null);
    }
}
