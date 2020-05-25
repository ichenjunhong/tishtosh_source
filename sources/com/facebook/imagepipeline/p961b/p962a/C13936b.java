package com.facebook.imagepipeline.p961b.p962a;

import android.os.Looper;
import android.os.SystemClock;
import com.C2240a;
import com.facebook.imagepipeline.common.C13949a;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14123ai.C14124a;
import com.facebook.imagepipeline.p974n.C14140an;
import com.facebook.imagepipeline.p974n.C14176c;
import com.facebook.imagepipeline.p974n.C14178e;
import com.facebook.imagepipeline.p974n.C14188k;
import com.facebook.imagepipeline.p974n.C14207t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53522d;
import okhttp3.C53522d.C53523a;
import okhttp3.C53524e;
import okhttp3.C53524e.C53525a;
import okhttp3.C53526f;
import okhttp3.C53682y;

/* renamed from: com.facebook.imagepipeline.b.a.b */
public class C13936b extends C14176c<C13940a> {
    private final C53522d mCacheControl;
    private final C53525a mCallFactory;
    public Executor mCancellationExecutor;

    /* renamed from: com.facebook.imagepipeline.b.a.b$a */
    public static class C13940a extends C14207t {

        /* renamed from: a */
        public long f36356a;

        /* renamed from: b */
        public long f36357b;

        /* renamed from: c */
        public long f36358c;

        public C13940a(C14188k<C14044e> kVar, C14140an anVar) {
            super(kVar, anVar);
        }
    }

    public C13936b(C53682y yVar) {
        this(yVar, yVar.f133192c.mo111573a());
    }

    public C13936b(C53525a aVar, Executor executor) {
        this(aVar, executor, true);
    }

    public C13940a createFetchState(C14188k<C14044e> kVar, C14140an anVar) {
        return new C13940a(kVar, anVar);
    }

    public void onFetchCompletion(C13940a aVar, int i) {
        aVar.f36358c = SystemClock.elapsedRealtime();
    }

    public Map<String, String> getExtraMap(C13940a aVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.f36357b - aVar.f36356a));
        hashMap.put("fetch_time", Long.toString(aVar.f36358c - aVar.f36357b));
        hashMap.put("total_time", Long.toString(aVar.f36358c - aVar.f36356a));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    public void fetch(C13940a aVar, C14124a aVar2) {
        aVar.f36356a = System.currentTimeMillis();
        try {
            C53499a a = new C53499a().mo111262a(aVar.mo26420c().toString()).mo111260a();
            if (this.mCacheControl != null) {
                a.mo111266a(this.mCacheControl);
            }
            C13949a aVar3 = aVar.f37087e.mo26384a().mBytesRange;
            if (aVar3 != null) {
                a.mo111271b("Range", C2240a.m6773a(null, "bytes=%s-%s", new Object[]{C13949a.m28425a(aVar3.f36383a), C13949a.m28425a(aVar3.f36384b)}));
            }
            fetchWithRequest(aVar, aVar2, a.mo111272c());
        } catch (Exception e) {
            aVar2.mo26373a(e);
        }
    }

    public void handleException(C53524e eVar, Exception exc, C14124a aVar) {
        if (eVar.mo111250d()) {
            aVar.mo26371a();
        } else {
            aVar.mo26373a(exc);
        }
    }

    public C13936b(C53525a aVar, Executor executor, boolean z) {
        C53522d dVar;
        this.mCallFactory = aVar;
        this.mCancellationExecutor = executor;
        if (z) {
            dVar = new C53523a().mo111322a().mo111324b();
        } else {
            dVar = null;
        }
        this.mCacheControl = dVar;
    }

    /* access modifiers changed from: protected */
    public void fetchWithRequest(final C13940a aVar, final C14124a aVar2, C53498ab abVar) {
        final C53524e a = this.mCallFactory.mo111325a(abVar);
        aVar.f37087e.mo26385a(new C14178e() {
            /* renamed from: a */
            public final void mo23173a() {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    a.mo111248c();
                } else {
                    C13936b.this.mCancellationExecutor.execute(new Runnable() {
                        public final void run() {
                            a.mo111248c();
                        }
                    });
                }
            }
        });
        a.mo111246a(new C53526f() {
            public final void onFailure(C53524e eVar, IOException iOException) {
                C13936b.this.handleException(eVar, iOException, aVar2);
            }

            public final void onResponse(C53524e eVar, C53504ad adVar) throws IOException {
                aVar.f36357b = System.currentTimeMillis();
                C53506ae aeVar = adVar.f132404g;
                try {
                    if (!adVar.mo111275a()) {
                        C13936b bVar = C13936b.this;
                        StringBuilder sb = new StringBuilder("Unexpected HTTP code ");
                        sb.append(adVar);
                        bVar.handleException(eVar, new IOException(sb.toString()), aVar2);
                        return;
                    }
                    C13949a a = C13949a.m28424a(adVar.mo111276b("Content-Range"));
                    if (!(a == null || (a.f36383a == 0 && a.f36384b == Integer.MAX_VALUE))) {
                        aVar.f37090h = a;
                        aVar.f37089g = 8;
                    }
                    long contentLength = aeVar.contentLength();
                    if (contentLength < 0) {
                        contentLength = 0;
                    }
                    aVar2.mo26372a(aeVar.byteStream(), (int) contentLength);
                    aeVar.close();
                } catch (Exception e) {
                    C13936b.this.handleException(eVar, e, aVar2);
                } finally {
                    aeVar.close();
                }
            }
        });
    }
}
