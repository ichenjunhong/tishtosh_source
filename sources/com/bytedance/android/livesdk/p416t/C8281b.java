package com.bytedance.android.livesdk.p416t;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.p030v4.p038f.C0801o;
import android.text.TextUtils;
import com.bytedance.android.livesdk.p416t.p418b.C8286b;
import com.bytedance.android.livesdk.p416t.p418b.C8287c;
import com.bytedance.android.livesdk.p416t.p418b.C8288d;
import com.bytedance.android.livesdk.p416t.p419c.C8294e;

/* renamed from: com.bytedance.android.livesdk.t.b */
public final class C8281b extends Fragment {

    /* renamed from: a */
    C0801o<C8284a> f22624a = new C0801o<>();

    /* renamed from: b */
    C0801o<C8284a> f22625b = new C0801o<>();

    /* renamed from: com.bytedance.android.livesdk.t.b$a */
    static class C8284a {

        /* renamed from: a */
        public String[] f22630a;

        /* renamed from: b */
        public String[] f22631b = new String[0];

        /* renamed from: c */
        C8286b f22632c;

        /* renamed from: d */
        Runnable f22633d;

        /* renamed from: e */
        Runnable f22634e;

        /* renamed from: f */
        private C8288d f22635f;

        /* renamed from: g */
        private C8286b f22636g;

        /* renamed from: a */
        public final void mo14467a() {
            this.f22635f.mo9069b(this.f22630a);
            C8300e.m16448a().mo14477a(this.f22630a, this.f22631b);
        }

        /* renamed from: a */
        public final void mo14469a(boolean z) {
            this.f22635f.mo9068a(this.f22630a);
            C8300e.m16448a().mo14476a(this.f22630a);
            if (z) {
                this.f22634e.run();
                C8300e.m16448a().mo14478b(this.f22630a, this.f22631b);
            }
        }

        /* renamed from: a */
        public final void mo14468a(Activity activity, C8287c cVar) {
            this.f22636g.mo14471a(activity, cVar, this.f22630a, this.f22631b);
        }

        C8284a(String[] strArr, Runnable runnable, C8288d dVar, C8286b bVar, Runnable runnable2, C8286b bVar2) {
            this.f22630a = strArr;
            this.f22633d = runnable;
            this.f22634e = runnable2;
            this.f22635f = dVar;
            this.f22632c = bVar;
            this.f22636g = bVar2;
        }
    }

    /* renamed from: c */
    private static Intent m16407c(Context context) {
        return new Intent("android.settings.APPLICATION_SETTINGS");
    }

    /* renamed from: a */
    static Intent m16403a(Context context) {
        return C8294e.m16435c().mo14472a(context);
    }

    /* renamed from: b */
    private static Intent m16405b(Context context) {
        StringBuilder sb = new StringBuilder("package:");
        sb.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14461a(final C8284a aVar) {
        aVar.mo14468a(getActivity(), new C8287c() {
            /* renamed from: b */
            public final void mo14466b() {
                aVar.mo14467a();
            }

            /* renamed from: a */
            public final void mo14465a() {
                C8281b bVar = C8281b.this;
                C8284a aVar = aVar;
                int a = (C8273a.m16389a(aVar.f22630a) & -65536) >>> 16;
                try {
                    if (C8281b.m16404a((Context) bVar.getActivity(), C8281b.m16403a((Context) bVar.getActivity()))) {
                        bVar.startActivityForResult(C8281b.m16403a((Context) bVar.getActivity()), a);
                        bVar.f22625b.mo2595b(a, aVar);
                        return;
                    }
                    bVar.mo14462a(aVar, a);
                } catch (Exception unused) {
                    bVar.mo14462a(aVar, a);
                }
            }
        });
    }

    /* renamed from: a */
    static boolean m16404a(Context context, Intent intent) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.permission;
        if (TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m16406b(C8284a aVar, int i) {
        try {
            startActivityForResult(m16407c(getActivity()), i);
            this.f22625b.mo2595b(i, aVar);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14462a(C8284a aVar, int i) {
        try {
            if (m16404a((Context) getActivity(), m16405b(getActivity()))) {
                startActivityForResult(m16405b(getActivity()), i);
                this.f22625b.mo2595b(i, aVar);
                return;
            }
            m16406b(aVar, i);
        } catch (Exception unused) {
            m16406b(aVar, i);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C8284a aVar = (C8284a) this.f22625b.mo2591a(i);
        this.f22625b.mo2594b(i);
        if (aVar != null && C8299d.m16446a((Context) getActivity(), aVar.f22630a)) {
            aVar.mo14469a(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRequestPermissionsResult(int r7, java.lang.String[] r8, int[] r9) {
        /*
            r6 = this;
            super.onRequestPermissionsResult(r7, r8, r9)
            android.support.v4.f.o<com.bytedance.android.livesdk.t.b$a> r0 = r6.f22624a
            java.lang.Object r0 = r0.mo2591a(r7)
            com.bytedance.android.livesdk.t.b$a r0 = (com.bytedance.android.livesdk.p416t.C8281b.C8284a) r0
            android.support.v4.f.o<com.bytedance.android.livesdk.t.b$a> r1 = r6.f22624a
            r1.mo2594b(r7)
            if (r0 == 0) goto L_0x00a5
            android.app.Activity r7 = r6.getActivity()
            int r1 = r9.length
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            r7 = 0
            goto L_0x0039
        L_0x001d:
            int r1 = r9.length
            r4 = 0
        L_0x001f:
            if (r4 >= r1) goto L_0x0029
            r5 = r9[r4]
            if (r5 == 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x0029:
            com.bytedance.android.livesdk.t.c.c r9 = com.bytedance.android.livesdk.p416t.p419c.C8294e.m16435c()
            boolean r9 = r9.mo14473a()
            if (r9 == 0) goto L_0x0038
            boolean r7 = com.bytedance.android.livesdk.p416t.C8299d.m16446a(r7, r8)
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            if (r7 == 0) goto L_0x003f
            r0.mo14469a(r2)
            return
        L_0x003f:
            android.app.Activity r7 = r6.getActivity()
            if (r8 == 0) goto L_0x0055
            int r9 = r8.length
            r1 = 0
        L_0x0047:
            if (r1 >= r9) goto L_0x0055
            r4 = r8[r1]
            boolean r4 = android.support.p030v4.app.C0636b.m1719a(r7, r4)
            if (r4 == 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x005c
            r0.mo14467a()
            return
        L_0x005c:
            android.app.Activity r7 = r6.getActivity()
            android.app.Activity r8 = r6.getActivity()
            android.content.Intent r8 = m16403a(r8)
            boolean r7 = m16404a(r7, r8)
            if (r7 != 0) goto L_0x0096
            android.app.Activity r7 = r6.getActivity()
            android.app.Activity r8 = r6.getActivity()
            android.content.Intent r8 = m16405b(r8)
            boolean r7 = m16404a(r7, r8)
            if (r7 != 0) goto L_0x0096
            android.app.Activity r7 = r6.getActivity()
            android.app.Activity r8 = r6.getActivity()
            android.content.Intent r8 = m16407c(r8)
            boolean r7 = m16404a(r7, r8)
            if (r7 != 0) goto L_0x0096
            r0.mo14467a()
            return
        L_0x0096:
            android.app.Activity r7 = r6.getActivity()
            java.lang.String[] r8 = r0.f22630a
            java.lang.String[] r7 = com.bytedance.android.livesdk.p416t.C8299d.m16447a(r7, r8)
            r0.f22631b = r7
            r6.mo14461a(r0)
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p416t.C8281b.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
