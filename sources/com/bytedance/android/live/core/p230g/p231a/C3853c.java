package com.bytedance.android.live.core.p230g.p231a;

import android.net.Uri;
import android.os.SystemClock;
import android.support.p030v4.p038f.C0777a;
import com.facebook.imagepipeline.p971k.C14048a;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.live.core.g.a.c */
public class C3853c extends C14048a {

    /* renamed from: a */
    private static ExecutorService f10874a;

    /* renamed from: b */
    private final Map<String, List<String>> f10875b = new C0777a();

    /* renamed from: c */
    private int f10876c;

    /* renamed from: d */
    private long f10877d = -1;

    /* renamed from: a */
    private static void m9781a() {
        if (f10874a == null) {
            synchronized (C3853c.class) {
                if (f10874a == null) {
                    f10874a = C3857g.m9783a(1, C3856f.f10882a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9234a(C14232c cVar) {
        this.f10876c++;
        cVar.mo26455a((C14050c) this);
    }

    public void onRequestCancellation(String str) {
        super.onRequestCancellation(str);
        this.f10875b.remove(str);
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        List list = (List) this.f10875b.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    public void onRequestSuccess(C14229b bVar, String str, boolean z) {
        long j;
        super.onRequestSuccess(bVar, str, z);
        List list = (List) this.f10875b.remove(str);
        if (list != null && list.contains("NetworkFetchProducer")) {
            Uri uri = bVar.mSourceUri;
            if (this.f10877d > 0) {
                j = SystemClock.elapsedRealtime() - this.f10877d;
                this.f10877d = -1;
            } else {
                j = -1;
            }
            m9781a();
            f10874a.submit(new C3855e(uri, j));
        }
    }

    public void onRequestFailure(C14229b bVar, String str, Throwable th, boolean z) {
        super.onRequestFailure(bVar, str, th, z);
        this.f10875b.remove(str);
        int i = this.f10876c - 1;
        this.f10876c = i;
        if (i == 0) {
            m9781a();
            f10874a.submit(new C3854d(th, bVar));
        }
    }

    public void onRequestStart(C14229b bVar, Object obj, String str, boolean z) {
        super.onRequestStart(bVar, obj, str, z);
        this.f10875b.put(str, new LinkedList());
        if (this.f10877d == -1) {
            this.f10877d = SystemClock.elapsedRealtime();
        }
    }
}
