package com.p683ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.adaptation.C22453b.C22458d;

/* renamed from: com.ss.android.ugc.aweme.adaptation.d */
public final /* synthetic */ class C22460d implements Runnable {

    /* renamed from: a */
    private final Activity f60494a;

    /* renamed from: b */
    private final int f60495b;

    /* renamed from: c */
    private final ViewGroup f60496c;

    /* renamed from: d */
    private final View f60497d;

    /* renamed from: e */
    private final View f60498e;

    /* renamed from: f */
    private final C22458d f60499f;

    public C22460d(Activity activity, int i, ViewGroup viewGroup, View view, View view2, C22458d dVar) {
        this.f60494a = activity;
        this.f60495b = i;
        this.f60496c = viewGroup;
        this.f60497d = view;
        this.f60498e = view2;
        this.f60499f = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (com.p683ss.android.ugc.aweme.utils.p2390d.C47801c.f120346a == 1) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r12 == 1) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            android.app.Activity r1 = r15.f60494a
            int r0 = r15.f60495b
            android.view.ViewGroup r2 = r15.f60496c
            android.view.View r3 = r15.f60497d
            android.view.View r4 = r15.f60498e
            com.ss.android.ugc.aweme.adaptation.b$d r11 = r15.f60499f
            if (r1 == 0) goto L_0x00cb
            android.view.WindowManager r5 = r1.getWindowManager()
            android.view.Display r5 = r5.getDefaultDisplay()
            android.util.DisplayMetrics r6 = new android.util.DisplayMetrics
            r6.<init>()
            boolean r7 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55514f()
            if (r7 == 0) goto L_0x0027
            r5.getRealMetrics(r6)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002a
        L_0x0025:
            goto L_0x002a
        L_0x0027:
            r5.getMetrics(r6)
        L_0x002a:
            boolean r5 = com.p683ss.android.common.util.C18920g.m46054c()
            r7 = 0
            r8 = 1
            if (r5 == 0) goto L_0x003a
            boolean r5 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55506a(r1)
            if (r5 == 0) goto L_0x003a
            r5 = 1
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            boolean r9 = com.p683ss.android.common.util.C18920g.m46054c()
            r10 = 28
            if (r9 == 0) goto L_0x004f
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r10) goto L_0x004f
            boolean r9 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55506a(r1)
            if (r9 != 0) goto L_0x004f
            r9 = 1
            goto L_0x0050
        L_0x004f:
            r9 = 0
        L_0x0050:
            if (r5 == 0) goto L_0x0054
            r5 = 0
            goto L_0x0058
        L_0x0054:
            int r5 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55504a(r1)
        L_0x0058:
            int r12 = com.p683ss.android.ugc.aweme.utils.p2390d.C47801c.f120346a
            r13 = 3
            if (r12 == r13) goto L_0x0065
            int r12 = com.p683ss.android.ugc.aweme.utils.p2390d.C47801c.f120346a
            if (r12 != r8) goto L_0x0063
        L_0x0061:
            r12 = 1
            goto L_0x0079
        L_0x0063:
            r12 = 0
            goto L_0x0079
        L_0x0065:
            java.lang.String r12 = "ro.smartisan.version"
            java.lang.String r12 = com.p683ss.android.ugc.aweme.utils.p2390d.C47802d.m103436a(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0073
            r12 = 1
            goto L_0x0074
        L_0x0073:
            r12 = 2
        L_0x0074:
            com.p683ss.android.ugc.aweme.utils.p2390d.C47801c.f120346a = r12
            if (r12 != r8) goto L_0x0063
            goto L_0x0061
        L_0x0079:
            if (r12 == 0) goto L_0x00a4
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r10) goto L_0x00a4
            boolean r10 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55514f()
            if (r10 == 0) goto L_0x00a0
            android.content.ContentResolver r10 = r1.getContentResolver()
            java.lang.String r12 = "navigationbar_trigger_mode"
            int r10 = android.provider.Settings.Global.getInt(r10, r12, r7)
            if (r10 != 0) goto L_0x00a0
            android.content.ContentResolver r10 = r1.getContentResolver()
            java.lang.String r12 = "nav_fixed_mode"
            int r10 = android.provider.Settings.Global.getInt(r10, r12, r7)
            if (r10 == 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r10 = 0
            goto L_0x00a1
        L_0x00a0:
            r10 = 1
        L_0x00a1:
            if (r10 == 0) goto L_0x00a4
            r7 = 1
        L_0x00a4:
            boolean r8 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55508b(r1)
            int r10 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55509c(r1)
            int r12 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58225c()
            if (r8 == 0) goto L_0x00b4
            if (r10 > 0) goto L_0x00b8
        L_0x00b4:
            if (r9 != 0) goto L_0x00b8
            if (r7 == 0) goto L_0x00b9
        L_0x00b8:
            int r5 = r5 - r12
        L_0x00b9:
            r7 = r5
            double r13 = (double) r0
            int r9 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r13)
            com.ss.android.ugc.aweme.adaptation.f r13 = new com.ss.android.ugc.aweme.adaptation.f
            r0 = r13
            r5 = r6
            r6 = r8
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.p683ss.android.p1137b.p1138a.p1139a.C18842a.m45934b(r13)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.adaptation.C22460d.run():void");
    }
}
