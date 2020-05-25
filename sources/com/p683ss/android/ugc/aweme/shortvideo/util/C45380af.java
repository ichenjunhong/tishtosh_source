package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.af */
public final class C45380af implements Callback {

    /* renamed from: h */
    private static C45380af f114750h = new C45380af();

    /* renamed from: a */
    public Context f114751a;

    /* renamed from: b */
    public Handler f114752b;

    /* renamed from: c */
    public TextView f114753c;

    /* renamed from: d */
    public volatile long f114754d;

    /* renamed from: e */
    public volatile long f114755e;

    /* renamed from: f */
    public volatile long f114756f;

    /* renamed from: g */
    public volatile long f114757g;

    /* renamed from: i */
    private Handler f114758i;

    /* renamed from: j */
    private ViewGroup f114759j;

    /* renamed from: k */
    private volatile long f114760k;

    /* renamed from: l */
    private int f114761l;

    /* renamed from: m */
    private volatile boolean f114762m;

    /* renamed from: a */
    public static C45380af m98935a() {
        return f114750h;
    }

    /* renamed from: d */
    private static long m98937d() {
        try {
            return Runtime.getRuntime().maxMemory();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo91717b() {
        if (this.f114753c != null && this.f114759j != null && this.f114762m) {
            this.f114759j.removeView(this.f114753c);
            this.f114753c = null;
            this.f114759j = null;
        }
    }

    private C45380af() {
        this.f114758i = new Handler(Looper.getMainLooper());
        this.f114760k = 2500;
        this.f114761l = 0;
        this.f114762m = false;
        this.f114760k = 2500;
        this.f114762m = false;
        this.f114752b = new Handler(C45452q.m99043a(), this);
    }

    /* renamed from: c */
    private void m98936c() {
        C42437ay a = C42437ay.m93202a();
        a.mo86520a("dalvikPss", Long.valueOf(this.f114754d));
        a.mo86520a("nativePss", Long.valueOf(this.f114755e));
        a.mo86520a("otherPss", Long.valueOf(this.f114757g));
        a.mo86520a("totalPss", Long.valueOf(this.f114756f));
        C23569o.m57779a("av_video_memory", a.mo86522b());
    }

    /* renamed from: a */
    public final void mo91716a(Context context) {
        if (context != null) {
            this.f114751a = context;
            this.f114752b.sendEmptyMessage(0);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:11|12|(4:14|15|16|(1:18)(2:19|(1:21)))|22|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00b8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r9 = r9.what
            r0 = 0
            if (r9 != 0) goto L_0x00d0
            r9 = 3
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00c5 }
            boolean r1 = r1.isInterrupted()     // Catch:{ Exception -> 0x00c5 }
            if (r1 == 0) goto L_0x001a
            int r1 = r8.f114761l     // Catch:{ Exception -> 0x00c5 }
            if (r1 <= r9) goto L_0x0017
            r8.m98936c()     // Catch:{ Exception -> 0x00c5 }
        L_0x0017:
            r8.f114761l = r0     // Catch:{ Exception -> 0x00c5 }
            return r0
        L_0x001a:
            android.content.Context r1 = r8.f114751a     // Catch:{ Exception -> 0x00c5 }
            r2 = 1
            if (r1 != 0) goto L_0x0021
            goto L_0x00b8
        L_0x0021:
            java.lang.String r3 = "activity"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x00b8 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ Exception -> 0x00b8 }
            if (r1 != 0) goto L_0x002d
            goto L_0x00b8
        L_0x002d:
            int[] r3 = new int[r2]     // Catch:{ Exception -> 0x00b8 }
            int r4 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00b8 }
            r3[r0] = r4     // Catch:{ Exception -> 0x00b8 }
            android.os.Debug$MemoryInfo[] r1 = r1.getProcessMemoryInfo(r3)     // Catch:{ Exception -> 0x00b8 }
            r3 = r1[r0]     // Catch:{ Exception -> 0x00b8 }
            int r3 = r3.dalvikPss     // Catch:{ Exception -> 0x00b8 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00b8 }
            r8.f114754d = r3     // Catch:{ Exception -> 0x00b8 }
            r3 = r1[r0]     // Catch:{ Exception -> 0x00b8 }
            int r3 = r3.nativePss     // Catch:{ Exception -> 0x00b8 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00b8 }
            r8.f114755e = r3     // Catch:{ Exception -> 0x00b8 }
            r3 = r1[r0]     // Catch:{ Exception -> 0x00b8 }
            int r3 = r3.otherPss     // Catch:{ Exception -> 0x00b8 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00b8 }
            r8.f114757g = r3     // Catch:{ Exception -> 0x00b8 }
            r3 = r1[r0]     // Catch:{ Exception -> 0x00b8 }
            int r3 = r3.getTotalPss()     // Catch:{ Exception -> 0x00b8 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x00b8 }
            r8.f114756f = r3     // Catch:{ Exception -> 0x00b8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r4 = "dalvikPss="
            r3.<init>(r4)     // Catch:{ Exception -> 0x00b8 }
            r4 = r1[r0]     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4.dalvikPss     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4 / 1000
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r4 = " nativePss="
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            r4 = r1[r0]     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4.nativePss     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4 / 1000
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r4 = " otherPss="
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            r4 = r1[r0]     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4.otherPss     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4 / 1000
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r4 = " totalPss="
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            r4 = r1[r0]     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4.getTotalPss()     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4 / 1000
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r4 = " MaxMemory="
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            long r4 = m98937d()     // Catch:{ Exception -> 0x00b8 }
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r6
            r3.append(r4)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00b8 }
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98973d(r3)     // Catch:{ Exception -> 0x00b8 }
            boolean r3 = r8.f114762m     // Catch:{ Exception -> 0x00b8 }
            if (r3 == 0) goto L_0x00b8
            android.os.Handler r3 = r8.f114758i     // Catch:{ Exception -> 0x00b8 }
            com.ss.android.ugc.aweme.shortvideo.util.af$1 r4 = new com.ss.android.ugc.aweme.shortvideo.util.af$1     // Catch:{ Exception -> 0x00b8 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x00b8 }
            r3.post(r4)     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            int r1 = r8.f114761l     // Catch:{ Exception -> 0x00c5 }
            int r1 = r1 + r2
            r8.f114761l = r1     // Catch:{ Exception -> 0x00c5 }
            android.os.Handler r9 = r8.f114752b
            long r1 = r8.f114760k
            r9.sendEmptyMessageDelayed(r0, r1)
            goto L_0x00d0
        L_0x00c5:
            int r1 = r8.f114761l
            if (r1 <= r9) goto L_0x00cd
            r8.m98936c()
        L_0x00cd:
            r8.f114761l = r0
            return r0
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.util.C45380af.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: a */
    public final void mo91715a(Activity activity, ViewGroup viewGroup) {
        if (activity != null && !activity.isFinishing() && viewGroup != null && this.f114762m) {
            this.f114759j = viewGroup;
            this.f114753c = new TextView(activity.getApplicationContext());
            this.f114753c.setLayoutParams(new LayoutParams(-2, -2));
            this.f114753c.setTextSize(15.0f);
            this.f114753c.setTextColor(this.f114753c.getResources().getColor(R.color.b04));
            viewGroup.addView(this.f114753c);
        }
    }
}
