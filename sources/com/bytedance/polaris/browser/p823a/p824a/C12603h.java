package com.bytedance.polaris.browser.p823a.p824a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.polaris.browser.p823a.C12608b;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p825c.C12623a;
import com.bytedance.polaris.p826d.C12650p;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.h */
public final class C12603h implements C9382a, C12608b {

    /* renamed from: a */
    protected Handler f33086a = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: b */
    private final WeakReference<Activity> f33087b;

    /* renamed from: c */
    private final C12597c f33088c;

    /* renamed from: d */
    private int f33089d;

    /* renamed from: e */
    private C12602g f33090e = new C12602g() {
    };

    /* renamed from: f */
    private C12602g f33091f = new C12602g() {
    };

    /* renamed from: com.bytedance.polaris.browser.a.a.h$a */
    static class C12606a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final C12623a f33094a;

        /* renamed from: b */
        final Handler f33095b;

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[Catch:{ Throwable -> 0x00ac }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2 A[Catch:{ Throwable -> 0x00ac }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r11) {
            /*
                r10 = this;
                r11 = 0
                com.bytedance.polaris.c.a r0 = r10.f33094a     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r0 = r0.f33161f     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r1 = "weixin"
                com.bytedance.polaris.c.a r2 = r10.f33094a     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r2 = r2.f33157b     // Catch:{ Throwable -> 0x00ac }
                boolean r1 = r1.equals(r2)     // Catch:{ Throwable -> 0x00ac }
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0022
                java.lang.String r1 = "weixin_moments"
                com.bytedance.polaris.c.a r4 = r10.f33094a     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r4 = r4.f33157b     // Catch:{ Throwable -> 0x00ac }
                boolean r1 = r1.equals(r4)     // Catch:{ Throwable -> 0x00ac }
                if (r1 == 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r1 = 0
                goto L_0x0023
            L_0x0022:
                r1 = 1
            L_0x0023:
                boolean r4 = com.bytedance.polaris.p826d.C12650p.m25425c(r0)     // Catch:{ Throwable -> 0x00ac }
                if (r4 == 0) goto L_0x008b
                com.bytedance.polaris.d.a r4 = new com.bytedance.polaris.d.a     // Catch:{ Throwable -> 0x00ac }
                android.app.Application r5 = com.bytedance.polaris.p821a.C12563i.m25215a()     // Catch:{ Throwable -> 0x00ac }
                r4.<init>(r5)     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r5 = com.bytedance.common.utility.C9395d.m18571a(r0)     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r6 = r4.mo23727b(r5)     // Catch:{ Throwable -> 0x00ac }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ac }
                r7.<init>()     // Catch:{ Throwable -> 0x00ac }
                r7.append(r5)     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r5 = ".dat"
                r7.append(r5)     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r5 = r7.toString()     // Catch:{ Throwable -> 0x00ac }
                java.lang.String r4 = r4.mo23726a(r5)     // Catch:{ Throwable -> 0x00ac }
                boolean r7 = com.bytedance.polaris.p826d.C12625a.m25361a()     // Catch:{ Throwable -> 0x00ac }
                if (r7 == 0) goto L_0x007c
                java.io.File r7 = new java.io.File     // Catch:{ Throwable -> 0x00ac }
                r7.<init>(r6)     // Catch:{ Throwable -> 0x00ac }
                boolean r8 = r7.isFile()     // Catch:{ Throwable -> 0x00ac }
                if (r8 != 0) goto L_0x007b
                com.bytedance.polaris.a.e r8 = com.bytedance.polaris.p821a.C12563i.m25225g()     // Catch:{ Throwable -> 0x00ac }
                if (r8 == 0) goto L_0x0074
                com.bytedance.polaris.a.e r8 = com.bytedance.polaris.p821a.C12563i.m25225g()     // Catch:{ Throwable -> 0x00ac }
                r9 = 512000(0x7d000, float:7.17465E-40)
                boolean r0 = r8.mo23616a(r0, r9, r4, r5)     // Catch:{ Throwable -> 0x00ac }
                if (r0 == 0) goto L_0x0074
                r3 = 1
            L_0x0074:
                if (r3 == 0) goto L_0x007c
                boolean r3 = r7.isFile()     // Catch:{ Throwable -> 0x00ac }
                goto L_0x007c
            L_0x007b:
                r3 = r8
            L_0x007c:
                if (r3 == 0) goto L_0x008b
                if (r1 == 0) goto L_0x0087
                r0 = 150(0x96, float:2.1E-43)
                android.graphics.Bitmap r0 = com.bytedance.common.utility.BitmapUtils.getBitmapFromSD(r6, r0, r0)     // Catch:{ Throwable -> 0x00ac }
                goto L_0x008c
            L_0x0087:
                com.bytedance.polaris.c.a r0 = r10.f33094a     // Catch:{ Throwable -> 0x00ac }
                r0.f33170o = r6     // Catch:{ Throwable -> 0x00ac }
            L_0x008b:
                r0 = r11
            L_0x008c:
                if (r1 == 0) goto L_0x00ac
                if (r0 == 0) goto L_0x00ac
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00ac }
                r1.<init>()     // Catch:{ Throwable -> 0x00ac }
                android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Throwable -> 0x00ac }
                r3 = 85
                r0.compress(r2, r3, r1)     // Catch:{ Throwable -> 0x00ac }
                byte[] r2 = r1.toByteArray()     // Catch:{ Throwable -> 0x00ac }
                if (r2 == 0) goto L_0x00a6
                com.bytedance.polaris.c.a r3 = r10.f33094a     // Catch:{ Throwable -> 0x00ac }
                r3.f33169n = r2     // Catch:{ Throwable -> 0x00ac }
            L_0x00a6:
                r1.close()     // Catch:{ Throwable -> 0x00ac }
                r0.recycle()     // Catch:{ Throwable -> 0x00ac }
            L_0x00ac:
                android.os.Handler r0 = r10.f33095b
                r1 = 12
                com.bytedance.polaris.c.a r2 = r10.f33094a
                android.os.Message r0 = r0.obtainMessage(r1, r2)
                android.os.Handler r1 = r10.f33095b
                r1.sendMessage(r0)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.p823a.p824a.C12603h.C12606a.doInBackground(java.lang.Void[]):java.lang.Void");
        }

        C12606a(Handler handler, C12623a aVar) {
            this.f33095b = handler;
            this.f33094a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo23674a() {
    }

    /* renamed from: b */
    public final void mo23676b() {
    }

    /* renamed from: c */
    private boolean m25315c() {
        if (!(C12563i.m25223e() == null || this.f33087b == null)) {
            this.f33087b.get();
        }
        return false;
    }

    /* renamed from: d */
    private boolean m25316d() {
        if (!(C12563i.m25223e() == null || this.f33087b == null)) {
            this.f33087b.get();
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m25314a(Context context) {
        C12563i.m25223e();
        return false;
    }

    public final void handleMsg(Message message) {
        ProgressDialog progressDialog;
        if (message != null && message.what == 12 && (message.obj instanceof C12623a)) {
            C12623a aVar = (C12623a) message.obj;
            if (aVar.f33168m != null) {
                progressDialog = (ProgressDialog) aVar.f33168m.get();
            } else {
                progressDialog = null;
            }
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            if (aVar.f33156a == this.f33089d) {
                this.f33089d++;
                m25309a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m25309a(C12623a aVar) {
        String str;
        String str2 = aVar.f33157b;
        String str3 = aVar.f33158c;
        String str4 = aVar.f33159d;
        String str5 = aVar.f33162g;
        String str6 = aVar.f33160e;
        String str7 = aVar.f33163h;
        if (C12650p.m25425c(aVar.f33161f)) {
            str = aVar.f33161f;
        } else {
            str = null;
        }
        String str8 = str;
        byte[] bArr = aVar.f33169n;
        String str9 = aVar.f33170o;
        if ("weixin".equals(str2)) {
            m25313a(false, str3, str4, str5, bArr, str6, aVar, str7);
        } else if ("weixin_moments".equals(str2)) {
            m25313a(true, str3, str4, str5, bArr, str6, aVar, str7);
        } else if ("qzone_sns".equals(str2) || "qzone".equals(str2)) {
            m25312a(true, str3, str4, str8, str9, str5, aVar, str6, str7);
        } else {
            if ("qq".equals(str2)) {
                m25312a(false, str3, str4, str8, str9, str5, aVar, str6, str7);
            }
        }
    }

    /* renamed from: a */
    private void m25311a(String str, JSONObject jSONObject) {
        if (this.f33088c != null) {
            this.f33088c.mo23678a(str, jSONObject);
        }
    }

    /* renamed from: a */
    private void m25310a(C12623a aVar, boolean z) {
        JSONObject jSONObject;
        if (aVar != null) {
            if (aVar.f33167l == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = aVar.f33167l;
            }
            try {
                jSONObject.put("code", z ? 1 : 0);
            } catch (JSONException unused) {
            }
            m25311a(aVar.f33171p, aVar.f33167l);
        }
    }

    public C12603h(WeakReference<Activity> weakReference, C12597c cVar) {
        this.f33087b = weakReference;
        this.f33088c = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5 A[Catch:{ Exception -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9 A[Catch:{ Exception -> 0x00e9 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23675a(com.bytedance.polaris.browser.p823a.C12610d r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "code"
            r2 = 1
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00e9 }
            org.json.JSONObject r1 = r6.f33102d     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r6 = r6.f33100b     // Catch:{ Exception -> 0x00e9 }
            com.bytedance.polaris.c.a r3 = new com.bytedance.polaris.c.a     // Catch:{ Exception -> 0x00e9 }
            r3.<init>()     // Catch:{ Exception -> 0x00e9 }
            r3.mo23725a(r1)     // Catch:{ Exception -> 0x00e9 }
            r3.f33167l = r7     // Catch:{ Exception -> 0x00e9 }
            r3.f33171p = r6     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r6 = r3.f33157b     // Catch:{ Exception -> 0x00e9 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x00e9 }
            if (r6 == 0) goto L_0x0024
            r5.m25310a(r3, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e9
        L_0x0024:
            java.lang.String r6 = r3.f33157b     // Catch:{ Exception -> 0x00e9 }
            java.lang.ref.WeakReference<android.app.Activity> r7 = r5.f33087b     // Catch:{ Exception -> 0x00e9 }
            if (r7 == 0) goto L_0x0033
            java.lang.ref.WeakReference<android.app.Activity> r7 = r5.f33087b     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x00e9 }
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ Exception -> 0x00e9 }
            goto L_0x0034
        L_0x0033:
            r7 = 0
        L_0x0034:
            if (r7 != 0) goto L_0x003b
            r5.m25310a(r3, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e9
        L_0x003b:
            java.lang.String r1 = "weixin"
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00e9 }
            r4 = 2131954827(0x7f130c8b, float:1.9546164E38)
            if (r1 != 0) goto L_0x007d
            java.lang.String r1 = "weixin_moments"
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00e9 }
            if (r1 == 0) goto L_0x004f
            goto L_0x007d
        L_0x004f:
            java.lang.String r1 = "qzone_sns"
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00e9 }
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = "qzone"
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00e9 }
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = "qq"
            boolean r6 = r1.equals(r6)     // Catch:{ Exception -> 0x00e9 }
            if (r6 == 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r5.m25310a(r3, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e9
        L_0x006d:
            boolean r6 = m25314a(r7)     // Catch:{ Exception -> 0x00e9 }
            if (r6 != 0) goto L_0x009d
            r6 = 2132547744(0x7f1c18a0, float:2.0748743E38)
            com.bytedance.common.utility.C9432q.m18673a(r7, r4, r6)     // Catch:{ Exception -> 0x00e9 }
            r5.m25310a(r3, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e9
        L_0x007d:
            boolean r6 = r5.m25315c()     // Catch:{ Exception -> 0x00e9 }
            if (r6 != 0) goto L_0x008d
            r6 = 2132547746(0x7f1c18a2, float:2.0748747E38)
            com.bytedance.common.utility.C9432q.m18673a(r7, r4, r6)     // Catch:{ Exception -> 0x00e9 }
            r5.m25310a(r3, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e9
        L_0x008d:
            boolean r6 = r5.m25316d()     // Catch:{ Exception -> 0x00e9 }
            if (r6 != 0) goto L_0x009d
            r6 = 2132547745(0x7f1c18a1, float:2.0748745E38)
            com.bytedance.common.utility.C9432q.m18673a(r7, r4, r6)     // Catch:{ Exception -> 0x00e9 }
            r5.m25310a(r3, r0)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e9
        L_0x009d:
            java.lang.String r6 = r3.f33161f     // Catch:{ Exception -> 0x00e9 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x00e9 }
            if (r6 == 0) goto L_0x00a9
            r5.m25309a(r3)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e9
        L_0x00a9:
            int r6 = r5.f33089d     // Catch:{ Exception -> 0x00e9 }
            int r6 = r6 + r2
            r5.f33089d = r6     // Catch:{ Exception -> 0x00e9 }
            int r6 = r5.f33089d     // Catch:{ Exception -> 0x00e9 }
            r3.f33156a = r6     // Catch:{ Exception -> 0x00e9 }
            android.app.ProgressDialog r6 = new android.app.ProgressDialog     // Catch:{ Exception -> 0x00e9 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00e9 }
            r1 = 2132547740(0x7f1c189c, float:2.0748735E38)
            java.lang.String r7 = r7.getString(r1)     // Catch:{ Exception -> 0x00e9 }
            r6.setMessage(r7)     // Catch:{ Exception -> 0x00e9 }
            r6.setCancelable(r2)     // Catch:{ Exception -> 0x00e9 }
            r6.show()     // Catch:{ Exception -> 0x00e9 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00e9 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x00e9 }
            r3.f33168m = r7     // Catch:{ Exception -> 0x00e9 }
            android.os.Handler r6 = r5.f33086a     // Catch:{ Exception -> 0x00e9 }
            r7 = 12
            android.os.Message r6 = r6.obtainMessage(r7, r3)     // Catch:{ Exception -> 0x00e9 }
            android.os.Handler r7 = r5.f33086a     // Catch:{ Exception -> 0x00e9 }
            r1 = 3500(0xdac, double:1.729E-320)
            r7.sendMessageDelayed(r6, r1)     // Catch:{ Exception -> 0x00e9 }
            com.bytedance.polaris.browser.a.a.h$a r6 = new com.bytedance.polaris.browser.a.a.h$a     // Catch:{ Exception -> 0x00e9 }
            android.os.Handler r7 = r5.f33086a     // Catch:{ Exception -> 0x00e9 }
            r6.<init>(r7, r3)     // Catch:{ Exception -> 0x00e9 }
            java.lang.Void[] r7 = new java.lang.Void[r0]     // Catch:{ Exception -> 0x00e9 }
            r6.execute(r7)     // Catch:{ Exception -> 0x00e9 }
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.p823a.p824a.C12603h.mo23675a(com.bytedance.polaris.browser.a.d, org.json.JSONObject):boolean");
    }

    /* renamed from: a */
    private void m25313a(boolean z, String str, String str2, String str3, byte[] bArr, String str4, C12623a aVar, String str5) {
        Activity activity;
        String str6;
        if (this.f33087b != null) {
            activity = (Activity) this.f33087b.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m25310a(aVar, false);
        } else if (!m25315c()) {
            C9432q.m18673a((Context) activity, (int) R.drawable.b6s, (int) R.string.cvg);
            m25310a(aVar, false);
        } else if (!m25316d()) {
            C9432q.m18673a((Context) activity, (int) R.drawable.b6s, (int) R.string.cvf);
            m25310a(aVar, false);
        } else if ("system".equals(str5)) {
            Intent intent = new Intent();
            if (z) {
                str6 = "com.tencent.mm.ui.tools.ShareToTimeLineUI";
            } else {
                str6 = "com.tencent.mm.ui.tools.ShareImgUI";
            }
            intent.setComponent(new ComponentName("com.tencent.mm", str6));
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(335577088);
            intent.setType("text/plain");
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("android.intent.extra.TEXT", str3);
            } else if (!TextUtils.isEmpty(str4)) {
                intent.putExtra("android.intent.extra.TEXT", str4);
            }
            activity.startActivity(intent);
            m25310a(aVar, true);
        } else {
            C12563i.m25223e();
        }
    }

    /* renamed from: a */
    private void m25312a(boolean z, String str, String str2, String str3, String str4, String str5, C12623a aVar, String str6, String str7) {
        Activity activity;
        if (this.f33087b != null) {
            activity = (Activity) this.f33087b.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m25310a(aVar, false);
            return;
        }
        Activity activity2 = activity;
        if (!m25314a((Context) activity2)) {
            C9432q.m18673a((Context) activity2, (int) R.drawable.b6s, (int) R.string.cve);
            m25310a(aVar, false);
        } else if ("system".equals(str7)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity"));
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(335577088);
            intent.setType("text/plain");
            if (!TextUtils.isEmpty(str5)) {
                intent.putExtra("android.intent.extra.TEXT", str5);
            } else if (!TextUtils.isEmpty(str6)) {
                intent.putExtra("android.intent.extra.TEXT", str6);
            }
            activity2.startActivity(intent);
            m25310a(aVar, true);
        } else {
            C12563i.m25223e();
        }
    }
}
