package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.th */
final class C16263th implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicInteger f45605a;

    /* renamed from: b */
    private final /* synthetic */ int f45606b;

    /* renamed from: c */
    private final /* synthetic */ agl f45607c;

    /* renamed from: d */
    private final /* synthetic */ List f45608d;

    C16263th(AtomicInteger atomicInteger, int i, agl agl, List list) {
        this.f45605a = atomicInteger;
        this.f45606b = i;
        this.f45607c = agl;
        this.f45608d = list;
    }

    public final void run() {
        if (this.f45605a.incrementAndGet() >= this.f45606b) {
            try {
                agl agl = this.f45607c;
                List<aga> list = this.f45608d;
                ArrayList arrayList = new ArrayList();
                for (aga aga : list) {
                    Object obj = aga.get();
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                agl.mo28823b(arrayList);
            } catch (InterruptedException | ExecutionException e) {
                abv.m32795c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
