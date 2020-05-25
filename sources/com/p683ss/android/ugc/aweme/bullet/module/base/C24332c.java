package com.p683ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Message;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.bullet.kit.web.C10499c;
import com.bytedance.ies.bullet.kit.web.C10523f;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.kit.web.p648a.C10484a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.bytedance.ies.uikit.dialog.C11104b;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.p683ss.android.ugc.aweme.bullet.business.C24254b;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27252m;
import com.p683ss.android.ugc.aweme.crossplatform.platform.webview.C27252m.C27255c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.c */
public final class C24332c extends C10484a implements C9382a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f64593a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C24332c.class), "popupBlackList", "getPopupBlackList()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/PopupBlackList;"))};

    /* renamed from: c */
    public static final C24333a f64594c = new C24333a(null);

    /* renamed from: b */
    public final C10326b f64595b;

    /* renamed from: d */
    private WeakReference<C11104b> f64596d;

    /* renamed from: e */
    private final C52668f f64597e = C52732g.m112285a(C24335c.f64603a);

    /* renamed from: f */
    private final C9381g f64598f = new C9381g(this);

    /* renamed from: g */
    private final C24254b f64599g;

    /* renamed from: h */
    private final C10523f f64600h;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.c$a */
    public static final class C24333a {
        private C24333a() {
        }

        public /* synthetic */ C24333a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.c$b */
    static final class C24334b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Callback f64601a;

        /* renamed from: b */
        final /* synthetic */ String f64602b;

        C24334b(Callback callback, String str) {
            this.f64601a = callback;
            this.f64602b = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                this.f64601a.invoke(this.f64602b, false, false);
                dialogInterface.dismiss();
                return;
            }
            if (i == -1) {
                this.f64601a.invoke(this.f64602b, true, true);
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.c$c */
    static final class C24335c extends C52712l implements C52670a<PopupBlackList> {

        /* renamed from: a */
        public static final C24335c f64603a = new C24335c();

        C24335c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m59673a();
        }

        /* renamed from: a */
        private static PopupBlackList m59673a() {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                return b.getPopupBlackList();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: b */
    private final PopupBlackList m59653b() {
        return (PopupBlackList) this.f64597e.getValue();
    }

    /* renamed from: a */
    public final void mo18582a(C10524g gVar, String str, Callback callback) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (!C9431p.m18664a(str) && callback != null) {
            Activity a = this.f64599g.mo50010a();
            WeakReference<C11104b> weakReference = this.f64596d;
            String str2 = null;
            C11104b bVar = weakReference != null ? (C11104b) weakReference.get() : null;
            if (bVar != null && bVar.isShowing()) {
                bVar.dismiss();
            }
            C11105a aVar = new C11105a(a);
            aVar.mo20135a((int) R.string.b8c);
            if (a != null) {
                str2 = a.getString(R.string.b8b, new Object[]{str});
            }
            aVar.mo20146b((CharSequence) str2);
            OnClickListener bVar2 = new C24334b(callback, str);
            aVar.mo20145b((int) R.string.b8a, bVar2);
            aVar.mo20136a((int) R.string.b8_, bVar2);
            aVar.mo20141a(false);
            this.f64596d = new WeakReference<>(aVar.mo20148b());
        }
    }

    /* renamed from: a */
    public final void mo18580a(C10524g gVar, String str) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10523f fVar = this.f64600h;
        if (fVar != null) {
            fVar.mo18580a(gVar, str);
        }
    }

    /* renamed from: a */
    public final void mo18581a(C10524g gVar, String str, int i, String str2) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (str != null && C52830p.m112411b(str, "bytedance://", false, 2, null)) {
            m59654b(str);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f64599g.mo50011a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.mo49974a(str);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo18583a(C10524g gVar, ValueCallback<Uri[]> valueCallback, C10499c cVar) {
        String str;
        C52711k.m112240b(gVar, "kitContainerApi");
        if (cVar == null) {
            return false;
        }
        Activity a = this.f64599g.mo50010a();
        if (!(a instanceof AppCompatActivity)) {
            a = null;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) a;
        if (appCompatActivity == null) {
            return false;
        }
        C27252m c = m59655c();
        String[] a2 = cVar.mo18570a();
        Context context = appCompatActivity;
        if (C47946e.m103734a(context) == 0 && C47946e.m103737c(context) == 0) {
            c.f71906b = valueCallback;
            if (a2 != null) {
                if (!(a2.length == 0)) {
                    str = a2[0];
                    c.mo55641a(str, "");
                }
            }
            str = "";
            c.mo55641a(str, "");
        } else {
            C23361b.m57419a(appCompatActivity, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C27255c(c, valueCallback, a2));
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo18584a(C10524g gVar, String str, String str2, JsResult jsResult) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (m59652a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo18585a(C10524g gVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (m59652a(str)) {
            return false;
        }
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
        return true;
    }

    /* renamed from: a */
    public final Bitmap mo18571a() {
        boolean z;
        C10578a b = this.f64599g.mo50019b();
        if (!(b instanceof C24336d)) {
            b = null;
        }
        C24336d dVar = (C24336d) b;
        if (dVar != null) {
            Boolean bool = (Boolean) dVar.f64617ap.mo18457b();
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (z) {
                return Bitmap.createBitmap(1, 1, Config.ARGB_8888);
            }
        }
        return super.mo18571a();
    }

    /* renamed from: c */
    private final C27252m m59655c() {
        Activity a = this.f64599g.mo50010a();
        Fragment fragment = null;
        if (!(a instanceof AppCompatActivity)) {
            a = null;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) a;
        if (appCompatActivity == null) {
            C47625i.m103103a("activity is null, file upload failed!");
            C9415i.m18634a((Throwable) new IllegalArgumentException("activity is null, 找下商业化zhangxiang"));
        }
        if (appCompatActivity != null) {
            C0654k supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                fragment = supportFragmentManager.mo2224a("web_view_upload_file");
            }
        }
        if (!(fragment instanceof C27252m)) {
            fragment = new C27252m();
            if (appCompatActivity != null) {
                C0654k supportFragmentManager2 = appCompatActivity.getSupportFragmentManager();
                if (supportFragmentManager2 != null) {
                    supportFragmentManager2.mo2225a().mo2178a(fragment, "web_view_upload_file").mo2195c();
                }
            }
        }
        return (C27252m) fragment;
    }

    /* renamed from: c */
    public final void mo18588c(C10524g gVar) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10523f fVar = this.f64600h;
        if (fVar != null) {
            fVar.mo18588c(gVar);
        }
    }

    /* renamed from: a */
    public final void mo18573a(ValueCallback<Uri> valueCallback) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        m59655c().f71905a = valueCallback;
        m59655c().mo55641a("", "");
    }

    /* renamed from: b */
    private final boolean m59654b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z = true;
        try {
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "uri");
            if (!C52711k.m112239a((Object) "log_event", (Object) parse.getHost())) {
                return false;
            }
            try {
                Message obtainMessage = this.f64598f.obtainMessage(1);
                obtainMessage.obj = parse;
                this.f64598f.sendMessage(obtainMessage);
            } catch (Exception unused) {
            }
            return z;
        } catch (Exception unused2) {
            z = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m59652a(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r1 = r7.m59653b()
            if (r1 != 0) goto L_0x0011
            com.ss.android.ugc.aweme.bullet.business.b r8 = r7.f64599g
            boolean r8 = r8.mo50022e()
            return r8
        L_0x0011:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r1 = r7.m59653b()
            r2 = 1
            if (r1 == 0) goto L_0x0023
            java.lang.Integer r1 = r1.getDimensional()
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            com.ss.android.ugc.aweme.global.config.settings.pojo.PopupBlackList r3 = r7.m59653b()
            if (r3 == 0) goto L_0x0061
            java.util.List r3 = r3.getKeywordList()
            if (r3 == 0) goto L_0x0061
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003f
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0061
        L_0x003f:
            java.util.Iterator r3 = r3.iterator()
        L_0x0043:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0061
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = r8
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r6 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = p2628d.p2650m.C52830p.m112455b(r5, r4, r0)
            if (r4 == 0) goto L_0x0043
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            com.ss.android.ugc.aweme.bullet.business.b r3 = r7.f64599g
            boolean r3 = r3.mo50022e()
            if (r3 == 0) goto L_0x0075
            switch(r1) {
                case 0: goto L_0x006d;
                case 1: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            r8 = 0
            goto L_0x0072
        L_0x006f:
            if (r8 != 0) goto L_0x006d
            r8 = 1
        L_0x0072:
            if (r8 == 0) goto L_0x0075
            return r2
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.C24332c.m59652a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo18586b(C10524g gVar) {
        C52711k.m112240b(gVar, "kitContainerApi");
        WeakReference<C11104b> weakReference = this.f64596d;
        if (weakReference != null) {
            C11104b bVar = (C11104b) weakReference.get();
            if (bVar != null) {
                C52711k.m112236a((Object) bVar, "it");
                if (bVar.isShowing()) {
                    bVar.dismiss();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e A[Catch:{ Exception -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061 A[SYNTHETIC, Splitter:B:31:0x0061] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r11.what
            r1 = 1
            if (r0 != r1) goto L_0x007a
            java.lang.Object r0 = r11.obj
            boolean r0 = r0 instanceof android.net.Uri
            if (r0 != 0) goto L_0x0010
            goto L_0x007a
        L_0x0010:
            java.lang.Object r11 = r11.obj     // Catch:{ Exception -> 0x0079 }
            if (r11 == 0) goto L_0x0071
            android.net.Uri r11 = (android.net.Uri) r11     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = "log_event"
            java.lang.String r2 = r11.getHost()     // Catch:{ Exception -> 0x0079 }
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)     // Catch:{ Exception -> 0x0079 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0024
            return
        L_0x0024:
            java.lang.String r0 = "category"
            java.lang.String r2 = r11.getQueryParameter(r0)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = "tag"
            java.lang.String r3 = r11.getQueryParameter(r0)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = "label"
            java.lang.String r4 = r11.getQueryParameter(r0)     // Catch:{ Exception -> 0x0079 }
            r0 = 0
            java.lang.String r5 = "value"
            java.lang.String r5 = r11.getQueryParameter(r5)     // Catch:{ Exception -> 0x0045 }
            if (r5 == 0) goto L_0x0045
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0045 }
            goto L_0x0046
        L_0x0045:
            r5 = r0
        L_0x0046:
            java.lang.String r7 = "ext_value"
            java.lang.String r7 = r11.getQueryParameter(r7)     // Catch:{ Exception -> 0x0053 }
            if (r7 == 0) goto L_0x0053
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x0053 }
            r0 = r7
        L_0x0053:
            r7 = r0
            r0 = 0
            java.lang.String r1 = "extra"
            java.lang.String r11 = r11.getQueryParameter(r1)     // Catch:{ Exception -> 0x0079 }
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r11)     // Catch:{ Exception -> 0x0079 }
            if (r1 != 0) goto L_0x0068
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0068 }
            r1.<init>(r11)     // Catch:{ Exception -> 0x0068 }
            r9 = r1
            goto L_0x0069
        L_0x0068:
            r9 = r0
        L_0x0069:
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x0079 }
            com.p683ss.android.common.p1146d.C18898c.m46012a(r1, r2, r3, r4, r5, r7, r9)     // Catch:{ Exception -> 0x0079 }
            return
        L_0x0071:
            d.u r11 = new d.u     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = "null cannot be cast to non-null type android.net.Uri"
            r11.<init>(r0)     // Catch:{ Exception -> 0x0079 }
            throw r11     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            return
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.module.base.C24332c.handleMsg(android.os.Message):void");
    }

    /* renamed from: a */
    public final View mo18572a(C10524g gVar) {
        C52711k.m112240b(gVar, "kitContainerApi");
        Activity a = this.f64599g.mo50010a();
        if (!(a instanceof AppCompatActivity)) {
            a = null;
        }
        AppCompatActivity appCompatActivity = (AppCompatActivity) a;
        if (appCompatActivity == null) {
            return null;
        }
        Context context = appCompatActivity;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    /* renamed from: a */
    public final void mo18576a(C10524g gVar, int i) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10523f fVar = this.f64600h;
        if (fVar != null) {
            fVar.mo18576a(gVar, i);
        }
    }

    /* renamed from: a */
    public final void mo18574a(ValueCallback<Uri> valueCallback, String str) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        C52711k.m112240b(str, "acceptType");
        m59655c().f71905a = valueCallback;
        m59655c().mo55641a(str, "");
    }

    public C24332c(C10326b bVar, C24254b bVar2, C10523f fVar) {
        C52711k.m112240b(bVar, "ctx");
        C52711k.m112240b(bVar2, "bulletBusiness");
        this.f64595b = bVar;
        this.f64599g = bVar2;
        this.f64600h = fVar;
    }

    /* renamed from: a */
    public final void mo18575a(ValueCallback<Uri> valueCallback, String str, String str2) {
        C52711k.m112240b(valueCallback, "uploadMsg");
        C52711k.m112240b(str, "acceptType");
        C52711k.m112240b(str2, "capture");
        m59655c().f71905a = valueCallback;
        m59655c().mo55641a(str, str2);
    }

    /* renamed from: a */
    public final void mo18578a(C10524g gVar, View view, CustomViewCallback customViewCallback) {
        C52711k.m112240b(gVar, "kitContainerApi");
        C10523f fVar = this.f64600h;
        if (fVar != null) {
            fVar.mo18578a(gVar, view, customViewCallback);
        }
    }

    /* renamed from: b */
    public final boolean mo18587b(C10524g gVar, String str, String str2, JsResult jsResult) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (m59652a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo18589c(C10524g gVar, String str, String str2, JsResult jsResult) {
        C52711k.m112240b(gVar, "kitContainerApi");
        if (m59652a(str)) {
            return false;
        }
        if (jsResult != null) {
            jsResult.confirm();
        }
        return true;
    }
}
