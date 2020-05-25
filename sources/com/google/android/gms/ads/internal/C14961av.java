package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.C15740bx;
import com.google.android.gms.internal.ads.afc;
import com.google.android.gms.internal.ads.beh;
import com.google.android.gms.internal.ads.caf;
import com.p683ss.android.ugc.aweme.lancet.C18984e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.internal.av */
final class C14961av extends AsyncTask<Void, Void, String> {

    /* renamed from: a */
    private final /* synthetic */ C14957ar f38569a;

    private C14961av(C14957ar arVar) {
        this.f38569a = arVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            this.f38569a.f38560d = (beh) this.f38569a.f38558b.get(((Long) caf.m37099d().mo30717a(C15740bx.f44351cf)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            afc.m32795c("", e);
        }
        return this.f38569a.mo27554c();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f38569a.f38563g != null && str != null) {
            WebView c = this.f38569a.f38563g;
            C18984e.m46161a(str);
            c.loadUrl(str);
        }
    }

    /* synthetic */ C14961av(C14957ar arVar, C14958as asVar) {
        this(arVar);
    }
}
