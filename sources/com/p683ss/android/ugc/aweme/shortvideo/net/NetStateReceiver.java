package com.p683ss.android.ugc.aweme.shortvideo.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.net.NetStateReceiver */
public class NetStateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f112199a = "NetStateReceiver";

    /* renamed from: b */
    private static boolean f112200b;

    /* renamed from: c */
    private static int f112201c;

    /* renamed from: d */
    private static ArrayList<C44331a> f112202d = new ArrayList<>();

    /* renamed from: e */
    private static BroadcastReceiver f112203e;

    /* renamed from: a */
    private static BroadcastReceiver m97100a() {
        if (f112203e == null) {
            synchronized (NetStateReceiver.class) {
                if (f112203e == null) {
                    f112203e = new NetStateReceiver();
                }
            }
        }
        return f112203e;
    }

    /* renamed from: b */
    public static void m97103b(Context context) {
        if (f112203e != null) {
            try {
                context.getApplicationContext().unregisterReceiver(f112203e);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m97104b(C44331a aVar) {
        if (f112202d != null && f112202d.contains(aVar)) {
            f112202d.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m97101a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.ugc.aweme.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.getApplicationContext().registerReceiver(m97100a(), intentFilter);
    }

    /* renamed from: a */
    public static void m97102a(C44331a aVar) {
        if (f112202d == null) {
            f112202d = new ArrayList<>();
        }
        f112202d.add(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r2 == 1) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            f112203e = r3
            java.lang.String r0 = r5.getAction()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x001a
            java.lang.String r5 = r5.getAction()
            java.lang.String r0 = "com.ss.ugc.aweme.CONNECTIVITY_CHANGE"
            boolean r5 = r5.equalsIgnoreCase(r0)
            if (r5 == 0) goto L_0x008b
        L_0x001a:
            boolean r5 = com.p683ss.android.ugc.aweme.shortvideo.net.C44332b.m97107a(r4)
            r0 = 0
            if (r5 != 0) goto L_0x0024
            f112200b = r0
            goto L_0x0061
        L_0x0024:
            r5 = 1
            f112200b = r5
            java.lang.String r1 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            android.net.NetworkInfo r4 = com.p683ss.android.ugc.aweme.shortvideo.net.C44333c.m97109a(r4)
            r1 = 4
            if (r4 == 0) goto L_0x005e
            java.lang.String r2 = r4.getExtraInfo()
            if (r2 != 0) goto L_0x003d
            goto L_0x005e
        L_0x003d:
            int r2 = r4.getType()
            if (r2 != 0) goto L_0x005b
            java.lang.String r4 = r4.getExtraInfo()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = "cmnet"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0059
            r5 = 2
            goto L_0x005f
        L_0x0059:
            r5 = 3
            goto L_0x005f
        L_0x005b:
            if (r2 != r5) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r5 = 4
        L_0x005f:
            f112201c = r5
        L_0x0061:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.net.a> r4 = f112202d
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x008b
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.net.a> r4 = f112202d
            int r4 = r4.size()
        L_0x006f:
            if (r0 >= r4) goto L_0x008b
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.net.a> r5 = f112202d
            java.lang.Object r5 = r5.get(r0)
            com.ss.android.ugc.aweme.shortvideo.net.a r5 = (com.p683ss.android.ugc.aweme.shortvideo.net.C44331a) r5
            if (r5 == 0) goto L_0x0088
            boolean r1 = f112200b
            if (r1 == 0) goto L_0x0085
            int r1 = f112201c
            r5.mo90203a(r1)
            goto L_0x0088
        L_0x0085:
            r5.mo90202a()
        L_0x0088:
            int r0 = r0 + 1
            goto L_0x006f
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.net.NetStateReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
