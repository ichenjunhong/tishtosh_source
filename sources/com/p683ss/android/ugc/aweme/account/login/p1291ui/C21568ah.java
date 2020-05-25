package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.os.Bundle;
import android.util.SparseArray;
import com.p683ss.android.ugc.aweme.account.util.C22285w;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.ah */
public final class C21568ah {

    /* renamed from: a */
    public SparseArray<C21569a> f58504a = new SparseArray<>();

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.ah$a */
    public static class C21569a {

        /* renamed from: a */
        public String f58505a;

        /* renamed from: b */
        public C22285w f58506b;

        /* renamed from: a */
        public final void mo45836a(Bundle bundle) {
            this.f58505a = bundle.getString("phone_ticker_phone_number");
            this.f58506b.mo46381a(bundle);
        }

        public C21569a(String str, C22285w wVar) {
            this.f58505a = str;
            this.f58506b = wVar;
        }
    }

    /* renamed from: a */
    public final C22285w mo45833a(int i) {
        try {
            return ((C21569a) this.f58504a.get(i)).f58506b;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C21569a mo45835b(int i) {
        try {
            return (C21569a) this.f58504a.get(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45834a(int r3, java.lang.String r4, long r5, int r7, com.p683ss.android.ugc.aweme.account.util.C22285w.C22286a r8) {
        /*
            r2 = this;
            android.util.SparseArray<com.ss.android.ugc.aweme.account.login.ui.ah$a> r0 = r2.f58504a     // Catch:{ Exception -> 0x001c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x001c }
            com.ss.android.ugc.aweme.account.login.ui.ah$a r0 = (com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.C21569a) r0     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r0.f58505a     // Catch:{ Exception -> 0x001c }
            boolean r1 = android.text.TextUtils.equals(r1, r4)     // Catch:{ Exception -> 0x001c }
            if (r1 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.account.util.w r0 = r0.f58506b     // Catch:{ Exception -> 0x001c }
            goto L_0x001d
        L_0x0015:
            if (r0 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.account.util.w r0 = r0.f58506b     // Catch:{ Exception -> 0x001c }
            r0.mo46379a()     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0022
            r0.f60054d = r8
            return
        L_0x0022:
            com.ss.android.ugc.aweme.account.util.w r0 = new com.ss.android.ugc.aweme.account.util.w
            r0.<init>(r5, r7, r8)
            android.util.SparseArray<com.ss.android.ugc.aweme.account.login.ui.ah$a> r5 = r2.f58504a
            com.ss.android.ugc.aweme.account.login.ui.ah$a r6 = new com.ss.android.ugc.aweme.account.login.ui.ah$a
            r6.<init>(r4, r0)
            r5.put(r3, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.mo45834a(int, java.lang.String, long, int, com.ss.android.ugc.aweme.account.util.w$a):void");
    }
}
