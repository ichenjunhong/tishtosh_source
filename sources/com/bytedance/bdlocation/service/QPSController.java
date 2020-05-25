package com.bytedance.bdlocation.service;

import android.location.Location;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class QPSController {
    private final Object lock = new Object();
    private Map<Long, C9245a> mQps = new ConcurrentHashMap();

    /* renamed from: com.bytedance.bdlocation.service.QPSController$a */
    public static class C9245a {

        /* renamed from: a */
        public int f25302a;

        /* renamed from: b */
        public int f25303b;
    }

    public C9245a getQPS(long j) {
        C9245a aVar;
        synchronized (this.lock) {
            aVar = (C9245a) this.mQps.get(Long.valueOf(j));
        }
        return aVar;
    }

    public void startLocation(long j) {
        synchronized (this.lock) {
            this.mQps.put(Long.valueOf(j), new C9245a());
        }
    }

    public void stopLocation(long j) {
        synchronized (this.lock) {
            this.mQps.remove(Long.valueOf(j));
        }
    }

    public void callback(Location location) {
        synchronized (this.lock) {
            for (Entry value : this.mQps.entrySet()) {
                C9245a aVar = (C9245a) value.getValue();
                aVar.f25302a++;
            }
        }
    }

    public void callbackError(Throwable th) {
        synchronized (this.lock) {
            for (Entry value : this.mQps.entrySet()) {
                C9245a aVar = (C9245a) value.getValue();
                aVar.f25303b++;
            }
        }
    }
}
