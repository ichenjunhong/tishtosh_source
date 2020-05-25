package com.p683ss.caijing.globaliap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.base.p2547b.C51159b;
import com.p683ss.base.p2547b.C51160c;
import com.p683ss.caijing.globaliap.p2563f.C51283b;
import com.p683ss.caijing.globaliap.p2563f.C51284c;
import com.p683ss.caijing.globaliap.pay.C51292c;
import com.p683ss.caijing.globaliap.pay.PayActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.caijing.globaliap.e */
public final class C51270e {
    /* renamed from: b */
    private static synchronized String m110223b(Context context) {
        String a;
        synchronized (C51270e.class) {
            a = C51160c.m110046a(context);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b2, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m110219a(android.content.Context r7) {
        /*
            java.lang.Class<com.ss.caijing.globaliap.e> r0 = com.p683ss.caijing.globaliap.C51270e.class
            monitor-enter(r0)
            if (r7 != 0) goto L_0x0007
            monitor-exit(r0)
            return
        L_0x0007:
            java.lang.String r1 = m110223b(r7)     // Catch:{ all -> 0x00b3 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x0018
            java.lang.String r7 = "startBackgroundTask"
            com.p683ss.caijing.globaliap.p2563f.C51283b.m110246a(r7)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r0)
            return
        L_0x0018:
            android.content.Context r1 = r7.getApplicationContext()     // Catch:{ all -> 0x00b3 }
            com.p683ss.caijing.globaliap.pay.C51292c.m110276a(r1)     // Catch:{ all -> 0x00b3 }
            com.ss.caijing.globaliap.b.a r1 = com.p683ss.caijing.globaliap.p2557b.C51223a.m110135a()     // Catch:{ all -> 0x00b3 }
            com.ss.caijing.globaliap.d.a r2 = new com.ss.caijing.globaliap.d.a     // Catch:{ all -> 0x00b3 }
            android.content.Context r7 = r7.getApplicationContext()     // Catch:{ all -> 0x00b3 }
            r2.<init>(r7)     // Catch:{ all -> 0x00b3 }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r7 = r1.f127930a     // Catch:{ all -> 0x00b3 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00b3 }
        L_0x0032:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x00b3 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x004f
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x00b3 }
            com.ss.caijing.globaliap.b.b r3 = (com.p683ss.caijing.globaliap.p2557b.C51224b) r3     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = r3.mo101752a()     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = r2.mo101752a()     // Catch:{ all -> 0x00b3 }
            boolean r3 = android.text.TextUtils.equals(r3, r6)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0032
            goto L_0x0071
        L_0x004f:
            java.util.Queue<com.ss.caijing.globaliap.b.b> r7 = r1.f127931b     // Catch:{ all -> 0x00b3 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00b3 }
        L_0x0055:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0070
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x00b3 }
            com.ss.caijing.globaliap.b.b r3 = (com.p683ss.caijing.globaliap.p2557b.C51224b) r3     // Catch:{ all -> 0x00b3 }
            java.lang.String r3 = r3.mo101752a()     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = r2.mo101752a()     // Catch:{ all -> 0x00b3 }
            boolean r3 = android.text.TextUtils.equals(r3, r6)     // Catch:{ all -> 0x00b3 }
            if (r3 == 0) goto L_0x0055
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 != 0) goto L_0x0082
            java.util.concurrent.locks.Lock r7 = r1.f127932c     // Catch:{ all -> 0x00b3 }
            r7.lock()     // Catch:{ all -> 0x00b3 }
            java.util.Queue<com.ss.caijing.globaliap.b.b> r7 = r1.f127931b     // Catch:{ all -> 0x00b3 }
            r7.add(r2)     // Catch:{ all -> 0x00b3 }
            java.util.concurrent.locks.Lock r7 = r1.f127932c     // Catch:{ all -> 0x00b3 }
            r7.unlock()     // Catch:{ all -> 0x00b3 }
        L_0x0082:
            com.ss.caijing.globaliap.b.a r7 = com.p683ss.caijing.globaliap.p2557b.C51223a.m110135a()     // Catch:{ all -> 0x00b3 }
            boolean r7 = r7.isAlive()     // Catch:{ all -> 0x00b3 }
            if (r7 != 0) goto L_0x00b1
            android.content.Context r7 = com.p683ss.caijing.globaliap.pay.C51292c.m110280b()     // Catch:{ all -> 0x00b3 }
            if (r7 != 0) goto L_0x0095
            int r7 = com.p683ss.caijing.globaliap.pay.C51293d.f128064a     // Catch:{ all -> 0x00b3 }
            goto L_0x00a6
        L_0x0095:
            java.lang.String r1 = "pay_controll"
            java.lang.String r2 = "retry_sleep_time"
            android.content.SharedPreferences r7 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r7, r1, r5)     // Catch:{ all -> 0x00b3 }
            r1 = -1
            int r7 = r7.getInt(r2, r1)     // Catch:{ all -> 0x00b3 }
            if (r7 != r1) goto L_0x00a6
            int r7 = com.p683ss.caijing.globaliap.pay.C51293d.f128064a     // Catch:{ all -> 0x00b3 }
        L_0x00a6:
            com.ss.caijing.globaliap.b.a r1 = com.p683ss.caijing.globaliap.p2557b.C51223a.m110135a()     // Catch:{ all -> 0x00b3 }
            com.ss.caijing.globaliap.b.a r7 = r1.mo101749a(r7)     // Catch:{ all -> 0x00b3 }
            r7.start()     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r0)
            return
        L_0x00b3:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.caijing.globaliap.C51270e.m110219a(android.content.Context):void");
    }

    /* renamed from: a */
    public static synchronized void m110220a(Context context, String str) {
        synchronized (C51270e.class) {
            if (TextUtils.isEmpty(m110223b(context))) {
                C51283b.m110246a("checkAllUnconsumedPurchasesOnBackground");
            } else {
                m110221a(context, str, false);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m110224b(Context context, String str) {
        synchronized (C51270e.class) {
            C51159b.m110043a(context, "extra_group", "host", str);
            HashMap hashMap = new HashMap();
            hashMap.put("set_host", str);
            C51284c.m110260a("caijing_iap_google_set_host", hashMap);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m110221a(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            java.lang.Class<com.ss.caijing.globaliap.e> r4 = com.p683ss.caijing.globaliap.C51270e.class
            monitor-enter(r4)
            if (r2 == 0) goto L_0x0033
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x000c
            goto L_0x0033
        L_0x000c:
            java.lang.String r0 = m110223b(r2)     // Catch:{ all -> 0x0030 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = "checkAllUnconsumedPurchasesOnBackground"
            com.p683ss.caijing.globaliap.p2563f.C51283b.m110246a(r2)     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)
            return
        L_0x001d:
            if (r2 != 0) goto L_0x0022
            java.lang.String r0 = ""
            goto L_0x002a
        L_0x0022:
            java.lang.String r0 = "pay_controll"
            java.lang.String r1 = "cj_appid"
            java.lang.String r0 = com.p683ss.base.p2547b.C51159b.m110042a(r2, r0, r1)     // Catch:{ all -> 0x0030 }
        L_0x002a:
            r1 = 0
            com.p683ss.caijing.globaliap.p2559d.C51265g.m110203a(r2, r0, r3, r1)     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)
            return
        L_0x0030:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
        L_0x0033:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.caijing.globaliap.C51270e.m110221a(android.content.Context, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public static synchronized boolean m110222a(Activity activity, String str, Map<String, String> map, int i, Bundle bundle) {
        synchronized (C51270e.class) {
            if (TextUtils.isEmpty(m110223b(activity))) {
                C51283b.m110246a("payChannel");
                return false;
            } else if (!C51292c.f128060a.contains(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" is not available");
                return false;
            } else {
                String a = C51292c.m110275a();
                if (TextUtils.isEmpty(a)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a);
                    sb2.append(" is null");
                    return false;
                }
                C51292c.m110276a(activity.getApplicationContext());
                C51292c.m110279a(a, "order", C51160c.m110048a(map));
                C51292c.m110278a(a, "order_extras", bundle);
                C51292c.m110279a(a, "app_id", (String) map.get("app_id"));
                C51292c.m110279a(a, "merchant_id", (String) map.get("merchant_id"));
                C51292c.m110279a(a, "total_amount", (String) map.get("total_amount"));
                C51292c.m110279a(a, "uid", (String) map.get("uid"));
                Intent intent = new Intent(activity, PayActivity.class);
                intent.putExtra("processId", a);
                activity.startActivityForResult(intent, i);
                activity.overridePendingTransition(0, 0);
                return true;
            }
        }
    }
}
