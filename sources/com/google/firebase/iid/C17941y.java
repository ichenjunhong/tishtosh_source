package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.p030v4.p038f.C0800n;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.iid.y */
public final class C17941y {

    /* renamed from: c */
    private static C17941y f49820c;

    /* renamed from: a */
    final Queue<Intent> f49821a = new ArrayDeque();

    /* renamed from: b */
    public final Queue<Intent> f49822b = new ArrayDeque();

    /* renamed from: d */
    private final C0800n<String, String> f49823d = new C0800n<>();

    /* renamed from: e */
    private Boolean f49824e = null;

    /* renamed from: a */
    public static synchronized C17941y m43971a() {
        C17941y yVar;
        synchronized (C17941y.class) {
            if (f49820c == null) {
                f49820c = new C17941y();
            }
            yVar = f49820c;
        }
        return yVar;
    }

    private C17941y() {
    }

    /* renamed from: a */
    public static PendingIntent m43969a(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, i, m43970a(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    /* renamed from: a */
    static Intent m43970a(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    /* renamed from: b */
    public final int mo34791b(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "Starting service: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                c = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            c = 0;
        }
        switch (c) {
            case 0:
                this.f49821a.offer(intent);
                break;
            case 1:
                this.f49822b.offer(intent);
                break;
            default:
                String str3 = "Unknown service action: ";
                String valueOf2 = String.valueOf(str);
                if (valueOf2.length() != 0) {
                    str3.concat(valueOf2);
                } else {
                    new String(str3);
                }
                return 500;
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return m43968a(context, intent2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096 A[Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad A[Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2 A[Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m43968a(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            android.support.v4.f.n<java.lang.String, java.lang.String> r0 = r5.f49823d
            monitor-enter(r0)
            android.support.v4.f.n<java.lang.String, java.lang.String> r1 = r5.f49823d     // Catch:{ all -> 0x00d4 }
            java.lang.String r2 = r7.getAction()     // Catch:{ all -> 0x00d4 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00d4 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            r0 = 0
            if (r1 != 0) goto L_0x006d
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            android.content.pm.ResolveInfo r1 = r1.resolveService(r7, r0)
            if (r1 == 0) goto L_0x0092
            android.content.pm.ServiceInfo r2 = r1.serviceInfo
            if (r2 != 0) goto L_0x0023
            goto L_0x0092
        L_0x0023:
            android.content.pm.ServiceInfo r1 = r1.serviceInfo
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r3 = r1.packageName
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = r1.name
            if (r2 != 0) goto L_0x0036
            goto L_0x0092
        L_0x0036:
            java.lang.String r1 = r1.name
            java.lang.String r2 = "."
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0057
            java.lang.String r1 = r2.concat(r1)
            goto L_0x005c
        L_0x0057:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x005c:
            android.support.v4.f.n<java.lang.String, java.lang.String> r2 = r5.f49823d
            monitor-enter(r2)
            android.support.v4.f.n<java.lang.String, java.lang.String> r3 = r5.f49823d     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r7.getAction()     // Catch:{ all -> 0x006a }
            r3.put(r4, r1)     // Catch:{ all -> 0x006a }
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            goto L_0x006d
        L_0x006a:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r6
        L_0x006d:
            java.lang.String r2 = "FirebaseInstanceId"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x008b
            java.lang.String r2 = "Restricting intent to a specific service: "
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0086
            r2.concat(r3)
            goto L_0x008b
        L_0x0086:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
        L_0x008b:
            java.lang.String r2 = r6.getPackageName()
            r7.setClassName(r2, r1)
        L_0x0092:
            java.lang.Boolean r1 = r5.f49824e     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            if (r1 != 0) goto L_0x00a5
            java.lang.String r1 = "android.permission.WAKE_LOCK"
            int r1 = r6.checkCallingOrSelfPermission(r1)     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            if (r1 != 0) goto L_0x009f
            r0 = 1
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            r5.f49824e = r0     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
        L_0x00a5:
            java.lang.Boolean r0 = r5.f49824e     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            boolean r0 = r0.booleanValue()     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            if (r0 == 0) goto L_0x00b2
            android.content.ComponentName r6 = android.support.p030v4.content.WakefulBroadcastReceiver.m2042a_(r6, r7)     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            goto L_0x00c7
        L_0x00b2:
            if (r6 == 0) goto L_0x00c3
            boolean r0 = r6 instanceof android.content.Context     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            if (r0 == 0) goto L_0x00c3
            r0 = r6
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            boolean r0 = com.p683ss.android.ugc.aweme.push.downgrade.C40895d.m90464a(r0, r7)     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
            if (r0 == 0) goto L_0x00c3
            r6 = 0
            goto L_0x00c7
        L_0x00c3:
            android.content.ComponentName r6 = r6.startService(r7)     // Catch:{ SecurityException -> 0x00d1, IllegalStateException -> 0x00ce }
        L_0x00c7:
            if (r6 != 0) goto L_0x00cc
            r6 = 404(0x194, float:5.66E-43)
            return r6
        L_0x00cc:
            r6 = -1
            return r6
        L_0x00ce:
            r6 = 402(0x192, float:5.63E-43)
            return r6
        L_0x00d1:
            r6 = 401(0x191, float:5.62E-43)
            return r6
        L_0x00d4:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17941y.m43968a(android.content.Context, android.content.Intent):int");
    }
}
