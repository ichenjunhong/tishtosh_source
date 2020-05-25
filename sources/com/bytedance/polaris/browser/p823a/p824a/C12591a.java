package com.bytedance.polaris.browser.p823a.p824a;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.polaris.browser.p823a.C12608b;
import com.bytedance.polaris.p821a.C12563i;
import com.bytedance.polaris.p825c.C12623a;
import com.bytedance.polaris.p826d.C12625a;
import com.bytedance.polaris.p826d.C12634f;
import com.bytedance.polaris.p826d.C12650p;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.a */
public final class C12591a implements C9382a, C12608b {

    /* renamed from: a */
    private final WeakReference<Activity> f33056a;

    /* renamed from: b */
    private final C12597c f33057b;

    /* renamed from: c */
    private int f33058c;

    /* renamed from: d */
    private Handler f33059d = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: e */
    private C12602g f33060e = new C12602g() {
    };

    /* renamed from: f */
    private C12602g f33061f = new C12602g() {
    };

    /* renamed from: com.bytedance.polaris.browser.a.a.a$a */
    static class C12594a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        final C12623a f33064a;

        /* renamed from: b */
        final Handler f33065b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                String str = this.f33064a.f33161f;
                if (C12650p.m25425c(str)) {
                    String substring = str.substring(str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR) + 1);
                    C12625a aVar = new C12625a(C12563i.m25215a());
                    String a = C9395d.m18571a(str);
                    String b = aVar.mo23728b(a, substring);
                    String a2 = C12625a.m25360a(a, substring);
                    String a3 = aVar.mo23726a(a2);
                    boolean a4 = C12634f.m25386a().mo23732a(str);
                    if (a4) {
                        for (int i = 1; i < 4; i++) {
                            Thread.sleep((long) (i * 1000));
                            a4 = C12634f.m25386a().mo23732a(str);
                            if (!a4) {
                                break;
                            }
                        }
                    }
                    if (a4) {
                        this.f33065b.sendMessage(this.f33065b.obtainMessage(13, this.f33064a));
                        return null;
                    }
                    if (C12625a.m25361a() && !new File(b).isFile() && C12563i.m25225g() != null) {
                        C12563i.m25225g().mo23616a(str, 5120000, a3, a2);
                    }
                    this.f33064a.f33170o = b;
                }
            } catch (Throwable unused) {
            }
            this.f33065b.sendMessage(this.f33065b.obtainMessage(13, this.f33064a));
            return null;
        }

        C12594a(Handler handler, C12623a aVar) {
            this.f33065b = handler;
            this.f33064a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo23674a() {
    }

    /* renamed from: b */
    public final void mo23676b() {
    }

    /* renamed from: c */
    private boolean m25287c() {
        if (!(C12563i.m25223e() == null || this.f33056a == null)) {
            this.f33056a.get();
        }
        return false;
    }

    /* renamed from: d */
    private boolean m25288d() {
        if (!(C12563i.m25223e() == null || this.f33056a == null)) {
            this.f33056a.get();
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m25285a(Context context) {
        C12563i.m25223e();
        return false;
    }

    /* renamed from: a */
    private void m25279a(C12623a aVar) {
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
            m25284a(false, str3, str4, str5, bArr, str6, aVar, str7);
        } else if ("weixin_moments".equals(str2)) {
            m25284a(true, str3, str4, str5, bArr, str6, aVar, str7);
        } else if ("qzone_sns".equals(str2) || "qzone".equals(str2)) {
            m25283a(true, str3, str4, str8, str9, str5, aVar, str6, str7);
        } else {
            if ("qq".equals(str2)) {
                m25283a(false, str3, str4, str8, str9, str5, aVar, str6, str7);
            }
        }
    }

    public final void handleMsg(Message message) {
        ProgressDialog progressDialog;
        if (message.what == 13 && (message.obj instanceof C12623a)) {
            C12623a aVar = (C12623a) message.obj;
            if (aVar.f33168m != null) {
                progressDialog = (ProgressDialog) aVar.f33168m.get();
            } else {
                progressDialog = null;
            }
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            if (aVar.f33156a == this.f33058c) {
                this.f33058c++;
                if (TextUtils.isEmpty(aVar.f33170o)) {
                    m25279a(aVar);
                    return;
                }
                try {
                    if (new File(aVar.f33170o).exists()) {
                        String str = aVar.f33157b;
                        String str2 = aVar.f33170o;
                        String str3 = aVar.f33163h;
                        String str4 = aVar.f33160e;
                        try {
                            if (TextUtils.isEmpty(str2)) {
                                m25279a(aVar);
                            } else {
                                if (!new File(str2).exists()) {
                                    m25279a(aVar);
                                }
                                if ("weixin".equals(str)) {
                                    m25286b(false, str2, aVar, str3, str4);
                                } else if ("weixin_moments".equals(str)) {
                                    m25286b(true, str2, aVar, str3, str4);
                                } else {
                                    if (!"qzone_sns".equals(str)) {
                                        if (!"qzone".equals(str)) {
                                            if ("qq".equals(str)) {
                                                m25282a(false, str2, aVar, str3, str4);
                                            }
                                        }
                                    }
                                    m25282a(true, str2, aVar, str3, str4);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    } else {
                        m25279a(aVar);
                    }
                } catch (Throwable unused2) {
                    m25279a(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m25281a(String str, JSONObject jSONObject) {
        if (this.f33057b != null) {
            this.f33057b.mo23678a(str, jSONObject);
        }
    }

    /* renamed from: a */
    private void m25280a(C12623a aVar, boolean z) {
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
            m25281a(aVar.f33171p, aVar.f33167l);
        }
    }

    public C12591a(WeakReference<Activity> weakReference, C12597c cVar) {
        this.f33056a = weakReference;
        this.f33057b = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7 A[Catch:{ Exception -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab A[Catch:{ Exception -> 0x00e0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23675a(com.bytedance.polaris.browser.p823a.C12610d r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = "code"
            r2 = 1
            r7.put(r1, r2)     // Catch:{ Exception -> 0x00e0 }
            org.json.JSONObject r1 = r6.f33102d     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r6 = r6.f33100b     // Catch:{ Exception -> 0x00e0 }
            com.bytedance.polaris.c.a r3 = new com.bytedance.polaris.c.a     // Catch:{ Exception -> 0x00e0 }
            r3.<init>()     // Catch:{ Exception -> 0x00e0 }
            r3.mo23725a(r1)     // Catch:{ Exception -> 0x00e0 }
            r3.f33167l = r7     // Catch:{ Exception -> 0x00e0 }
            r3.f33171p = r6     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r6 = r3.f33157b     // Catch:{ Exception -> 0x00e0 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x00e0 }
            if (r6 != 0) goto L_0x00dd
            java.lang.String r6 = r3.f33161f     // Catch:{ Exception -> 0x00e0 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x00e0 }
            if (r6 == 0) goto L_0x0029
            goto L_0x00dd
        L_0x0029:
            java.lang.String r6 = r3.f33157b     // Catch:{ Exception -> 0x00e0 }
            java.lang.ref.WeakReference<android.app.Activity> r7 = r5.f33056a     // Catch:{ Exception -> 0x00e0 }
            if (r7 != 0) goto L_0x0031
            goto L_0x00e0
        L_0x0031:
            java.lang.ref.WeakReference<android.app.Activity> r7 = r5.f33056a     // Catch:{ Exception -> 0x00e0 }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x00e0 }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ Exception -> 0x00e0 }
            if (r7 != 0) goto L_0x003d
            goto L_0x00e0
        L_0x003d:
            java.lang.String r1 = "weixin"
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00e0 }
            r4 = 2131954827(0x7f130c8b, float:1.9546164E38)
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "weixin_moments"
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x0051
            goto L_0x007f
        L_0x0051:
            java.lang.String r1 = "qzone_sns"
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00e0 }
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "qzone"
            boolean r1 = r1.equals(r6)     // Catch:{ Exception -> 0x00e0 }
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = "qq"
            boolean r6 = r1.equals(r6)     // Catch:{ Exception -> 0x00e0 }
            if (r6 == 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            r5.m25280a(r3, r0)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e0
        L_0x006f:
            boolean r6 = m25285a(r7)     // Catch:{ Exception -> 0x00e0 }
            if (r6 != 0) goto L_0x009f
            r6 = 2132547744(0x7f1c18a0, float:2.0748743E38)
            com.bytedance.common.utility.C9432q.m18673a(r7, r4, r6)     // Catch:{ Exception -> 0x00e0 }
            r5.m25280a(r3, r0)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e0
        L_0x007f:
            boolean r6 = r5.m25287c()     // Catch:{ Exception -> 0x00e0 }
            if (r6 != 0) goto L_0x008f
            r6 = 2132547746(0x7f1c18a2, float:2.0748747E38)
            com.bytedance.common.utility.C9432q.m18673a(r7, r4, r6)     // Catch:{ Exception -> 0x00e0 }
            r5.m25280a(r3, r0)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e0
        L_0x008f:
            boolean r6 = r5.m25288d()     // Catch:{ Exception -> 0x00e0 }
            if (r6 != 0) goto L_0x009f
            r6 = 2132547745(0x7f1c18a1, float:2.0748745E38)
            com.bytedance.common.utility.C9432q.m18673a(r7, r4, r6)     // Catch:{ Exception -> 0x00e0 }
            r5.m25280a(r3, r0)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e0
        L_0x009f:
            java.lang.String r6 = r3.f33161f     // Catch:{ Exception -> 0x00e0 }
            boolean r6 = com.bytedance.common.utility.C9431p.m18664a(r6)     // Catch:{ Exception -> 0x00e0 }
            if (r6 == 0) goto L_0x00ab
            r5.m25280a(r3, r0)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e0
        L_0x00ab:
            int r6 = r5.f33058c     // Catch:{ Exception -> 0x00e0 }
            int r6 = r6 + r2
            r5.f33058c = r6     // Catch:{ Exception -> 0x00e0 }
            int r6 = r5.f33058c     // Catch:{ Exception -> 0x00e0 }
            r3.f33156a = r6     // Catch:{ Exception -> 0x00e0 }
            android.app.ProgressDialog r6 = new android.app.ProgressDialog     // Catch:{ Exception -> 0x00e0 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x00e0 }
            r1 = 2132547740(0x7f1c189c, float:2.0748735E38)
            java.lang.String r7 = r7.getString(r1)     // Catch:{ Exception -> 0x00e0 }
            r6.setMessage(r7)     // Catch:{ Exception -> 0x00e0 }
            r6.setCancelable(r2)     // Catch:{ Exception -> 0x00e0 }
            r6.show()     // Catch:{ Exception -> 0x00e0 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x00e0 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x00e0 }
            r3.f33168m = r7     // Catch:{ Exception -> 0x00e0 }
            com.bytedance.polaris.browser.a.a.a$a r6 = new com.bytedance.polaris.browser.a.a.a$a     // Catch:{ Exception -> 0x00e0 }
            android.os.Handler r7 = r5.f33059d     // Catch:{ Exception -> 0x00e0 }
            r6.<init>(r7, r3)     // Catch:{ Exception -> 0x00e0 }
            java.lang.Void[] r7 = new java.lang.Void[r0]     // Catch:{ Exception -> 0x00e0 }
            r6.execute(r7)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e0
        L_0x00dd:
            r5.m25280a(r3, r0)     // Catch:{ Exception -> 0x00e0 }
        L_0x00e0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.polaris.browser.p823a.p824a.C12591a.mo23675a(com.bytedance.polaris.browser.a.d, org.json.JSONObject):boolean");
    }

    /* renamed from: a */
    private void m25282a(boolean z, String str, C12623a aVar, String str2, String str3) {
        Activity activity;
        if (this.f33056a != null) {
            activity = (Activity) this.f33056a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m25280a(aVar, false);
        } else if (!m25285a((Context) activity)) {
            C9432q.m18673a((Context) activity, (int) R.drawable.b6s, (int) R.string.cve);
            m25280a(aVar, false);
        } else {
            File file = new File(str);
            if (!file.exists()) {
                C9432q.m18674a((Context) activity, (int) R.drawable.b6s, "图片不存在");
                m25280a(aVar, false);
            } else if ("system".equals(str2)) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.tencent.mobileqq", "com.tencent.mobileqq.activity.JumpActivity"));
                intent.setAction("android.intent.action.SEND");
                intent.addFlags(335577088);
                intent.setType("image/*");
                if (new File(str).exists()) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
                String str4 = "android.intent.extra.TEXT";
                if (str3 == null) {
                    str3 = "";
                }
                intent.putExtra(str4, str3);
                activity.startActivity(intent);
                m25280a(aVar, true);
            } else {
                C12563i.m25223e();
            }
        }
    }

    /* renamed from: b */
    private void m25286b(boolean z, String str, C12623a aVar, String str2, String str3) {
        Activity activity;
        String str4;
        if (this.f33056a != null) {
            activity = (Activity) this.f33056a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m25280a(aVar, false);
        } else if (!m25287c()) {
            C9432q.m18673a((Context) activity, (int) R.drawable.b6s, (int) R.string.cvg);
            m25280a(aVar, false);
        } else if (!m25288d()) {
            C9432q.m18673a((Context) activity, (int) R.drawable.b6s, (int) R.string.cvf);
            m25280a(aVar, false);
        } else {
            File file = new File(str);
            if (!file.exists()) {
                C9432q.m18674a((Context) activity, (int) R.drawable.b6s, "图片不存在");
                m25280a(aVar, false);
            } else if ("system".equals(str2)) {
                Intent intent = new Intent();
                if (z) {
                    str4 = "com.tencent.mm.ui.tools.ShareToTimeLineUI";
                } else {
                    str4 = "com.tencent.mm.ui.tools.ShareImgUI";
                }
                intent.setComponent(new ComponentName("com.tencent.mm", str4));
                intent.setAction("android.intent.action.SEND");
                intent.addFlags(335577088);
                intent.setType("image/*");
                if (new File(str).exists()) {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                }
                String str5 = "Kdescription";
                if (str3 == null) {
                    str3 = "";
                }
                intent.putExtra(str5, str3);
                activity.startActivity(intent);
                m25280a(aVar, true);
            } else {
                C12563i.m25223e();
            }
        }
    }

    /* renamed from: a */
    private void m25284a(boolean z, String str, String str2, String str3, byte[] bArr, String str4, C12623a aVar, String str5) {
        Activity activity;
        String str6;
        if (this.f33056a != null) {
            activity = (Activity) this.f33056a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m25280a(aVar, false);
        } else if (!m25287c()) {
            C9432q.m18673a((Context) activity, (int) R.drawable.b6s, (int) R.string.cvg);
            m25280a(aVar, false);
        } else if (!m25288d()) {
            C9432q.m18673a((Context) activity, (int) R.drawable.b6s, (int) R.string.cvf);
            m25280a(aVar, false);
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
            m25280a(aVar, true);
        } else {
            C12563i.m25223e();
        }
    }

    /* renamed from: a */
    private void m25283a(boolean z, String str, String str2, String str3, String str4, String str5, C12623a aVar, String str6, String str7) {
        Activity activity;
        if (this.f33056a != null) {
            activity = (Activity) this.f33056a.get();
        } else {
            activity = null;
        }
        if (activity == null) {
            m25280a(aVar, false);
            return;
        }
        Activity activity2 = activity;
        if (!m25285a((Context) activity2)) {
            C9432q.m18673a((Context) activity2, (int) R.drawable.b6s, (int) R.string.cve);
            m25280a(aVar, false);
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
            m25280a(aVar, true);
        } else {
            C12563i.m25223e();
        }
    }
}
