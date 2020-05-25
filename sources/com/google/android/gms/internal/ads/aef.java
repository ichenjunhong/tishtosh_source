package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@C16299uq
public final class aef {

    /* renamed from: a */
    public Map<Integer, Bitmap> f40348a = new ConcurrentHashMap();

    /* renamed from: b */
    public AtomicInteger f40349b = new AtomicInteger(0);

    /* renamed from: a */
    public final void mo28748a(Integer num) {
        this.f40348a.remove(num);
    }
}
