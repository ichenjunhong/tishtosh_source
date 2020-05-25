package androidx.work.impl.background.systemjob;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: androidx.work.impl.background.systemjob.a */
final class C1617a {

    /* renamed from: a */
    private final ComponentName f5690a;

    C1617a(Context context) {
        this.f5690a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        com.C2240a.m6772a("API version too low. Cannot convert network type value %s", new java.lang.Object[]{r1});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        r2 = new android.os.PersistableBundle();
        r2.putString("EXTRA_WORK_SPEC_ID", r10.f5602a);
        r2.putBoolean("EXTRA_IS_PERIODIC", r10.mo5982a());
        r11 = new android.app.job.JobInfo.Builder(r11, r9.f5690a).setRequiredNetworkType(r1).setRequiresCharging(r0.f5520c).setRequiresDeviceIdle(r0.f5521d).setExtras(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r0.f5521d != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r10.f5613l != androidx.work.C1531a.LINEAR) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r11.setBackoffCriteria(r10.f5614m, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r10.mo5982a() == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r11.setPeriodic(r10.f5609h, r10.f5610i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        r11.setPeriodic(r10.f5609h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        r11.setMinimumLatency(r10.f5608g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        if (r0.mo5912a() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        r10 = r0.f5524g.f5531a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r10.hasNext() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r1 = (androidx.work.C1536d.C1537a) r10.next();
        r11.addTriggerContentUri(new android.app.job.JobInfo.TriggerContentUri(r1.f5532a, r1.f5533b ? 1 : 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b8, code lost:
        r11.setPersisted(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
        r11.setRequiresBatteryNotLow(r0.f5522e);
        r11.setRequiresStorageNotLow(r0.f5523f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        return r11.build();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.job.JobInfo mo6025a(androidx.work.impl.p056b.C1583g r10, int r11) {
        /*
            r9 = this;
            androidx.work.c r0 = r10.f5611j
            androidx.work.h r1 = r0.f5519b
            int[] r2 = androidx.work.impl.background.systemjob.C1617a.C16181.f5691a
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 26
            r4 = 24
            r5 = 0
            r6 = 1
            switch(r2) {
                case 1: goto L_0x0024;
                case 2: goto L_0x002f;
                case 3: goto L_0x0022;
                case 4: goto L_0x001c;
                case 5: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0026
        L_0x0016:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x0026
            r1 = 4
            goto L_0x0030
        L_0x001c:
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r4) goto L_0x0026
            r1 = 3
            goto L_0x0030
        L_0x0022:
            r1 = 2
            goto L_0x0030
        L_0x0024:
            r1 = 0
            goto L_0x0030
        L_0x0026:
            java.lang.String r2 = "API version too low. Cannot convert network type value %s"
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r1
            com.C2240a.m6772a(r2, r7)
        L_0x002f:
            r1 = 1
        L_0x0030:
            android.os.PersistableBundle r2 = new android.os.PersistableBundle
            r2.<init>()
            java.lang.String r7 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r8 = r10.f5602a
            r2.putString(r7, r8)
            java.lang.String r7 = "EXTRA_IS_PERIODIC"
            boolean r8 = r10.mo5982a()
            r2.putBoolean(r7, r8)
            android.app.job.JobInfo$Builder r7 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r8 = r9.f5690a
            r7.<init>(r11, r8)
            android.app.job.JobInfo$Builder r11 = r7.setRequiredNetworkType(r1)
            boolean r1 = r0.f5520c
            android.app.job.JobInfo$Builder r11 = r11.setRequiresCharging(r1)
            boolean r1 = r0.f5521d
            android.app.job.JobInfo$Builder r11 = r11.setRequiresDeviceIdle(r1)
            android.app.job.JobInfo$Builder r11 = r11.setExtras(r2)
            boolean r1 = r0.f5521d
            if (r1 != 0) goto L_0x0070
            androidx.work.a r1 = r10.f5613l
            androidx.work.a r2 = androidx.work.C1531a.LINEAR
            if (r1 != r2) goto L_0x006b
            r6 = 0
        L_0x006b:
            long r1 = r10.f5614m
            r11.setBackoffCriteria(r1, r6)
        L_0x0070:
            boolean r1 = r10.mo5982a()
            if (r1 == 0) goto L_0x0088
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x0082
            long r1 = r10.f5609h
            long r6 = r10.f5610i
            r11.setPeriodic(r1, r6)
            goto L_0x008d
        L_0x0082:
            long r1 = r10.f5609h
            r11.setPeriodic(r1)
            goto L_0x008d
        L_0x0088:
            long r1 = r10.f5608g
            r11.setMinimumLatency(r1)
        L_0x008d:
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r4) goto L_0x00b8
            boolean r10 = r0.mo5912a()
            if (r10 == 0) goto L_0x00b8
            androidx.work.d r10 = r0.f5524g
            java.util.Set<androidx.work.d$a> r10 = r10.f5531a
            java.util.Iterator r10 = r10.iterator()
        L_0x009f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00b8
            java.lang.Object r1 = r10.next()
            androidx.work.d$a r1 = (androidx.work.C1536d.C1537a) r1
            boolean r2 = r1.f5533b
            android.app.job.JobInfo$TriggerContentUri r4 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r1 = r1.f5532a
            r4.<init>(r1, r2)
            r11.addTriggerContentUri(r4)
            goto L_0x009f
        L_0x00b8:
            r11.setPersisted(r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r3) goto L_0x00c9
            boolean r10 = r0.f5522e
            r11.setRequiresBatteryNotLow(r10)
            boolean r10 = r0.f5523f
            r11.setRequiresStorageNotLow(r10)
        L_0x00c9:
            android.app.job.JobInfo r10 = r11.build()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.C1617a.mo6025a(androidx.work.impl.b.g, int):android.app.job.JobInfo");
    }
}
