package com.p683ss.android.ugc.aweme.lancet.p1153c;

import android.net.NetworkInfo;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.lancet.c.d */
public final class C18978d {
    /* renamed from: a */
    public static NetworkInfo m46154a() {
        try {
            return (NetworkInfo) Class.forName("android.net.NetworkInfo").getConstructor(new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class}).newInstance(new Object[]{Integer.valueOf(1), Integer.valueOf(0), "CONNECTED", "CONNECTED"});
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return null;
        }
    }
}
