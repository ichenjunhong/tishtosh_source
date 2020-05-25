package com.p2620vk.sdk;

import java.util.HashMap;
import java.util.Random;

/* renamed from: com.vk.sdk.c */
public class C52420c {

    /* renamed from: a */
    static final HashMap<Long, C52420c> f130758a = new HashMap<>();

    /* renamed from: b */
    long f130759b;

    /* renamed from: a */
    public final long mo109409a() {
        if (f130758a.containsKey(Long.valueOf(this.f130759b))) {
            return this.f130759b;
        }
        Random random = new Random();
        while (true) {
            long nextLong = random.nextLong();
            if (!f130758a.containsKey(Long.valueOf(nextLong)) && nextLong != 0) {
                f130758a.put(Long.valueOf(nextLong), this);
                this.f130759b = nextLong;
                return nextLong;
            }
        }
    }

    /* renamed from: a */
    public static C52420c m111974a(long j) {
        return (C52420c) f130758a.get(Long.valueOf(j));
    }
}
