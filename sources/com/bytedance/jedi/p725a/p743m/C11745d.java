package com.bytedance.jedi.p725a.p743m;

import android.os.Handler;
import android.os.Looper;
import com.p1081h.p1082a.C18114c;

/* renamed from: com.bytedance.jedi.a.m.d */
public final class C11745d implements C18114c {

    /* renamed from: a */
    private final Handler f31201a;

    /* renamed from: com.bytedance.jedi.a.m.d$a */
    static class C11746a extends Handler {

        /* renamed from: a */
        private final String f31202a;

        /* renamed from: b */
        private final int f31203b;

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[SYNTHETIC, Splitter:B:20:0x0071] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r14) {
            /*
                r13 = this;
                java.lang.Object r14 = r14.obj
                java.lang.String r14 = (java.lang.String) r14
                java.lang.String r0 = r13.f31202a
                java.lang.String r1 = "logs"
                java.io.File r2 = new java.io.File
                r2.<init>(r0)
                boolean r0 = r2.exists()
                if (r0 != 0) goto L_0x0016
                r2.mkdirs()
            L_0x0016:
                java.io.File r0 = new java.io.File
                java.lang.String r3 = "%s_%s.log"
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]
                r6 = 0
                r5[r6] = r1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8 = 1
                r5[r8] = r7
                java.lang.String r3 = com.C2240a.m6772a(r3, r5)
                r0.<init>(r2, r3)
                r3 = 0
                r7 = r3
                r5 = 0
            L_0x0031:
                boolean r9 = r0.exists()
                if (r9 == 0) goto L_0x0051
                int r5 = r5 + r8
                java.io.File r7 = new java.io.File
                java.lang.String r9 = "%s_%s.log"
                java.lang.Object[] r10 = new java.lang.Object[r4]
                r10[r6] = r1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
                r10[r8] = r11
                java.lang.String r9 = com.C2240a.m6772a(r9, r10)
                r7.<init>(r2, r9)
                r12 = r7
                r7 = r0
                r0 = r12
                goto L_0x0031
            L_0x0051:
                if (r7 == 0) goto L_0x005f
                long r1 = r7.length()
                int r4 = r13.f31203b
                long r4 = (long) r4
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x005f
                r0 = r7
            L_0x005f:
                java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x006e }
                r1.<init>(r0, r8)     // Catch:{ IOException -> 0x006e }
                r1.append(r14)     // Catch:{ IOException -> 0x006f }
                r1.flush()     // Catch:{ IOException -> 0x006f }
                r1.close()     // Catch:{ IOException -> 0x006f }
                return
            L_0x006e:
                r1 = r3
            L_0x006f:
                if (r1 == 0) goto L_0x0078
                r1.flush()     // Catch:{ IOException -> 0x0078 }
                r1.close()     // Catch:{ IOException -> 0x0078 }
                return
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.p725a.p743m.C11745d.C11746a.handleMessage(android.os.Message):void");
        }

        C11746a(Looper looper, String str, int i) {
            super(looper);
            this.f31202a = str;
            this.f31203b = i;
        }
    }

    public C11745d(Handler handler) {
        this.f31201a = handler;
    }

    /* renamed from: a */
    public final void mo22497a(int i, String str, String str2) {
        this.f31201a.sendMessage(this.f31201a.obtainMessage(i, str2));
    }
}
