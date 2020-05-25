package com.p683ss.android.socialbase.downloader.p1220i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.i.f */
public final class C19947f extends Handler {

    /* renamed from: a */
    private final WeakReference<C19948a> f54851a;

    /* renamed from: com.ss.android.socialbase.downloader.i.f$a */
    public interface C19948a {
        /* renamed from: a */
        void mo41692a(Message message);
    }

    public final void handleMessage(Message message) {
        C19948a aVar = (C19948a) this.f54851a.get();
        if (aVar != null && message != null) {
            aVar.mo41692a(message);
        }
    }

    public C19947f(Looper looper, C19948a aVar) {
        super(looper);
        this.f54851a = new WeakReference<>(aVar);
    }
}
