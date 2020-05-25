package com.p888c.p889a.p890a.p891a.p900h.p901a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.h.a.b */
public abstract class C13440b extends AsyncTask<Object, Void, String> {

    /* renamed from: d */
    public C13441a f35012d;

    /* renamed from: e */
    protected final C13442b f35013e;

    /* renamed from: com.c.a.a.a.h.a.b$a */
    public interface C13441a {
        /* renamed from: a */
        void mo25143a(C13440b bVar);
    }

    /* renamed from: com.c.a.a.a.h.a.b$b */
    public interface C13442b {
        /* renamed from: a */
        JSONObject mo25144a();

        /* renamed from: a */
        void mo25145a(JSONObject jSONObject);
    }

    public C13440b(C13442b bVar) {
        this.f35013e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (this.f35012d != null) {
            this.f35012d.mo25143a(this);
        }
    }

    /* renamed from: a */
    public final void mo25141a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
