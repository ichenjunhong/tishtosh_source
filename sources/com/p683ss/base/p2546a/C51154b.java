package com.p683ss.base.p2546a;

import android.os.AsyncTask;

/* renamed from: com.ss.base.a.b */
public final class C51154b<Result> {

    /* renamed from: a */
    private C51155a<Result> f127781a = new C51155a<>(0);

    /* renamed from: com.ss.base.a.b$a */
    static class C51155a<Result> extends AsyncTask<Void, Void, C51153a<Result>> {

        /* renamed from: a */
        C51157d<Result> f127782a;

        /* renamed from: b */
        C51156c<Result> f127783b;

        private C51155a() {
        }

        /* synthetic */ C51155a(byte b) {
            this();
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            C51153a aVar = new C51153a();
            this.f127782a.mo101675a(aVar);
            return aVar;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            C51153a aVar = (C51153a) obj;
            if (this.f127783b != null) {
                if (aVar.f127780c) {
                    this.f127783b.mo101674a(aVar.f127778a);
                    return;
                }
                this.f127783b.mo101673a();
            }
        }
    }

    /* renamed from: a */
    public static <Result> C51154b<Result> m110035a(C51157d<Result> dVar) {
        return new C51154b<>(dVar);
    }

    private C51154b(C51157d<Result> dVar) {
        this.f127781a.f127782a = dVar;
    }

    /* renamed from: a */
    public final void mo101670a(C51156c<Result> cVar) {
        this.f127781a.f127783b = cVar;
        this.f127781a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
