package com.p683ss.android.ugc.aweme.base;

import android.net.Uri;
import android.support.p030v4.p038f.C0777a;
import com.facebook.imagepipeline.p971k.C14048a;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.base.f */
public class C23527f extends C14048a {

    /* renamed from: a */
    private static ExecutorService f62625a;

    /* renamed from: b */
    private final Map<String, List<String>> f62626b = new C0777a();

    /* renamed from: c */
    private int f62627c;

    /* renamed from: d */
    private long f62628d = -1;

    /* renamed from: a */
    private static void m57698a() {
        if (f62625a == null) {
            synchronized (C23527f.class) {
                if (f62625a == null) {
                    f62625a = C23549j.m57746a(1, C23544i.f62667a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo48686a(C14232c cVar) {
        this.f62627c++;
        cVar.mo26455a((C14050c) this);
    }

    public void onRequestCancellation(String str) {
        super.onRequestCancellation(str);
        this.f62626b.remove(str);
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        super.onProducerFinishWithSuccess(str, str2, map);
        List list = (List) this.f62626b.get(str);
        if (list != null) {
            list.add(str2);
        }
    }

    public void onRequestSuccess(C14229b bVar, String str, boolean z) {
        long j;
        super.onRequestSuccess(bVar, str, z);
        List list = (List) this.f62626b.remove(str);
        if (list != null) {
            boolean contains = list.contains("NetworkFetchProducer");
            Uri uri = bVar.mSourceUri;
            if (this.f62628d > 0) {
                j = System.currentTimeMillis() - this.f62628d;
                this.f62628d = -1;
            } else {
                j = -1;
            }
            m57698a();
            f62625a.submit(new C23535h(uri, j, contains));
        }
    }

    public void onRequestFailure(C14229b bVar, String str, Throwable th, boolean z) {
        super.onRequestFailure(bVar, str, th, z);
        this.f62626b.remove(str);
        int i = this.f62627c - 1;
        this.f62627c = i;
        if (i == 0) {
            m57698a();
            f62625a.submit(new C23532g(bVar, th));
        }
    }

    public void onRequestStart(C14229b bVar, Object obj, String str, boolean z) {
        super.onRequestStart(bVar, obj, str, z);
        this.f62626b.put(str, new LinkedList());
        if (this.f62628d == -1) {
            this.f62628d = System.currentTimeMillis();
        }
    }
}
