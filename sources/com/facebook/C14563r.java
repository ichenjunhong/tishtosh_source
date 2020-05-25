package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.C2240a;
import java.net.HttpURLConnection;
import java.util.List;

/* renamed from: com.facebook.r */
public class C14563r extends AsyncTask<Void, Void, List<C14696t>> {

    /* renamed from: c */
    private static final String f37834c = C14563r.class.getCanonicalName();

    /* renamed from: a */
    public final C14564s f37835a;

    /* renamed from: b */
    public Exception f37836b;

    /* renamed from: d */
    private final HttpURLConnection f37837d;

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Handler handler;
        super.onPreExecute();
        if (C14533n.m29769c()) {
            C2240a.m6772a("execute async task: %s", new Object[]{this});
        }
        if (this.f37835a.f37839a == null) {
            if (Thread.currentThread() instanceof HandlerThread) {
                handler = new Handler();
            } else {
                handler = new Handler(Looper.getMainLooper());
            }
            this.f37835a.f37839a = handler;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{RequestAsyncTask: ");
        sb.append(" connection: ");
        sb.append(this.f37837d);
        sb.append(", requests: ");
        sb.append(this.f37835a);
        sb.append("}");
        return sb.toString();
    }

    public C14563r(C14564s sVar) {
        this(null, sVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<C14696t> doInBackground(Void... voidArr) {
        try {
            if (this.f37837d == null) {
                return GraphRequest.m27269a(this.f37835a);
            }
            return GraphRequest.m27270a(this.f37837d, this.f37835a);
        } catch (Exception e) {
            this.f37836b = e;
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ void onPostExecute(Object obj) {
        super.onPostExecute((List) obj);
        if (this.f37836b != null) {
            C2240a.m6772a("onPostExecute: exception encountered during request: %s", new Object[]{this.f37836b.getMessage()});
        }
    }

    private C14563r(HttpURLConnection httpURLConnection, C14564s sVar) {
        this.f37835a = sVar;
        this.f37837d = null;
    }
}
