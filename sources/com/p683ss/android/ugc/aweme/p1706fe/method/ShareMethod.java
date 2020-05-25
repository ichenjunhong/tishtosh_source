package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.google.gson.C17971f;
import com.google.p1057b.p1064g.C17760g;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.C42044a.C42045a;
import com.p683ss.android.ugc.aweme.share.improve.C42131b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42056ad;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42079d;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42118r;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42130z;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42138d;
import com.p683ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage.C42192a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C42198a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42315c;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47930l;
import com.p683ss.android.ugc.aweme.web.p2399c.p2400a.C48273a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod */
public final class ShareMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29837a f77901a = new C29837a(null);

    /* renamed from: b */
    private final ArrayList<String> f77902b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$a */
    public static final class C29837a {
        private C29837a() {
        }

        public /* synthetic */ C29837a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$b */
    public static final class C29838b extends C42315c {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f77903a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f77904b;

        /* renamed from: c */
        final /* synthetic */ String f77905c;

        /* renamed from: a */
        public final boolean mo49947a(C42318f fVar, Context context) {
            C52711k.m112240b(fVar, C42311c.f106865i);
            C52711k.m112240b(context, "context");
            Activity g = C11016e.m22312g();
            SharePackage sharePackage = this.f77904b;
            String str = this.f77905c;
            C52711k.m112240b(sharePackage, "sharePackage");
            if (g == null) {
                return false;
            }
            sharePackage.f106900i.putString("url_for_im_share", str);
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (!a.isLogin()) {
                C27965f.m66719a(g, "", "click_shareim_button");
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("share_package", sharePackage);
            C33194e.m76279d().enterChooseContact(g, bundle, null);
            C30130ag.m70700a("chat_merge");
            return true;
        }

        C29838b(ShareMethod shareMethod, SharePackage sharePackage, String str, C42307b bVar) {
            this.f77903a = shareMethod;
            this.f77904b = sharePackage;
            this.f77905c = str;
            super(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$c */
    public static final class C29839c implements C42354e {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f77906a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f77907b;

        /* renamed from: c */
        final /* synthetic */ C29789a f77908c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f77909d;

        /* renamed from: e */
        final /* synthetic */ String f77910e;

        /* renamed from: a */
        public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
            C52711k.m112240b(gVar, "action");
            C52711k.m112240b(sharePackage, "sharePackage");
            C52711k.m112240b(context, "context");
        }

        /* renamed from: a */
        public final void mo49960a(SharePackage sharePackage, Context context) {
            C52711k.m112240b(sharePackage, "sharePackage");
            C52711k.m112240b(context, "context");
            try {
                JSONObject jSONObject = this.f77907b;
                if (jSONObject != null) {
                    jSONObject.put("code", 0);
                }
            } catch (JSONException unused) {
            }
        }

        /* renamed from: b */
        public final void mo49962b(SharePackage sharePackage, Context context) {
            C52711k.m112240b(sharePackage, "sharePackage");
            C52711k.m112240b(context, "context");
            C29789a aVar = this.f77908c;
            if (aVar != null) {
                aVar.mo60041a(this.f77907b);
            }
        }

        /* renamed from: a */
        public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
            C52711k.m112240b(bVar, "channel");
            C52711k.m112240b(context, "context");
            if (this.f77909d != null) {
                C26890h.onEvent(MobClick.obtain().setEventName(this.f77909d.optString("tag")).setLabelName(bVar.mo86136b()).setValue(this.f77909d.optString("value")).setJsonObject(this.f77909d.optJSONObject("extras")));
            }
            if (z) {
                String b = bVar.mo86136b();
                String str = this.f77910e;
                C52711k.m112236a((Object) str, "url");
                C23089d a = C23089d.m56640a();
                a.mo47829a("enter_from", "h5_page");
                a.mo47829a("platform", b);
                a.mo47829a("url", str);
                C26890h.m65011a("h5_share", a.f61491a);
            }
            C29789a aVar = this.f77908c;
            if (aVar != null) {
                aVar.mo60041a(this.f77907b);
            }
        }

        C29839c(ShareMethod shareMethod, JSONObject jSONObject, C29789a aVar, JSONObject jSONObject2, String str) {
            this.f77906a = shareMethod;
            this.f77907b = jSONObject;
            this.f77908c = aVar;
            this.f77909d = jSONObject2;
            this.f77910e = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$d */
    public static final class C29840d extends C17760g<List<? extends String>> {
        C29840d() {
        }
    }

    public ShareMethod() {
        this(null, 1, null);
    }

    public ShareMethod(C10757a aVar) {
        super(aVar);
        this.f77902b = new ArrayList<>(Arrays.asList(new String[]{"copylink", "qrcode", "browser", "refresh"}));
    }

    /* renamed from: a */
    private final void m69974a(String str) {
        if (!TextUtils.isEmpty(str)) {
            List list = (List) new C17971f().mo34885a(str, new C29840d().getType());
            if (list != null) {
                this.f77902b.clear();
                this.f77902b.addAll(list);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo60070a(WeakReference<Context> weakReference, JSONObject jSONObject) {
        C52711k.m112240b(weakReference, "contextWeakReference");
        C52711k.m112240b(jSONObject, "params");
        return m69975a(weakReference, jSONObject, null, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r9, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r10) {
        /*
            r8 = this;
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r0 = "code"
            r7 = 1
            r6.put(r0, r7)
            java.lang.ref.WeakReference r1 = r8.f77793e
            java.lang.String r0 = "mContextRef"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r0)
            com.bytedance.ies.g.a.a r0 = r8.f77795g
            if (r0 == 0) goto L_0x001f
            android.webkit.WebView r0 = r0.f28930d
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = r0.getUrl()
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r3 = r0
            r0 = r8
            r2 = r9
            r4 = r6
            r5 = r10
            boolean r9 = r0.m69975a(r1, r2, r3, r4, r5)
            java.lang.String r0 = "tricky_flag"
            boolean r0 = r6.has(r0)
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "code"
            if (r9 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r7 = -1
        L_0x0037:
            r6.put(r0, r7)
            r10.mo60041a(r6)
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.ShareMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    public /* synthetic */ ShareMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }

    /* renamed from: a */
    private final boolean m69975a(WeakReference<Context> weakReference, JSONObject jSONObject, String str, JSONObject jSONObject2, C29789a aVar) {
        SharePackage sharePackage;
        JSONObject jSONObject3 = jSONObject;
        String str2 = str;
        JSONObject jSONObject4 = jSONObject2;
        if (jSONObject3 == null) {
            return false;
        }
        String optString = jSONObject3.optString("title");
        String optString2 = jSONObject3.optString("desc");
        String optString3 = jSONObject3.optString("image");
        String optString4 = jSONObject3.optString("url");
        String optString5 = jSONObject3.optString("image_path");
        String optString6 = jSONObject3.optString("type");
        String optString7 = jSONObject3.optString("shareitems");
        boolean optBoolean = jSONObject3.optBoolean("use_origin_link", false);
        m69974a(optString7);
        List<String> a = C47930l.m103705a(jSONObject3.optJSONArray("shareEntriesForbidList"));
        JSONObject jSONObject5 = null;
        if (jSONObject3.has("logArgs")) {
            jSONObject5 = jSONObject3.optJSONObject("logArgs");
        }
        JSONObject jSONObject6 = jSONObject5;
        boolean isEmpty = TextUtils.isEmpty(optString);
        if (TextUtils.isEmpty(optString2) || isEmpty) {
            if (!isEmpty) {
                optString2 = optString;
            }
            C52711k.m112236a((Object) optString2, "if (!emptyTitle) {\n     …    description\n        }");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(optString);
            sb.append(' ');
            sb.append(optString2);
            optString2 = sb.toString();
        }
        boolean z = optBoolean;
        C48273a aVar2 = new C48273a(optString, optString2, optString3, optString4, null, optString5);
        String optString8 = jSONObject3.optString("platform");
        Context context = (Context) weakReference.get();
        CharSequence charSequence = optString8;
        if (TextUtils.isEmpty(charSequence) || context == null) {
            return false;
        }
        Activity a2 = C23729p.m58248a(context);
        if (a2 == null) {
            return false;
        }
        C42350b bVar = new C42350b();
        C41979aq.m91946a().injectUniversalConfig(bVar, a2, true);
        CharSequence charSequence2 = optString6;
        if (TextUtils.equals(charSequence2, "image")) {
            C52711k.m112236a((Object) optString3, "image");
            sharePackage = C42192a.m92581a(context, aVar2, optString3, str2);
            bVar.mo86262a((C42357g) new C42118r(optString3));
        } else if (TextUtils.equals(charSequence2, "local_img")) {
            sharePackage = C42198a.m92602a(context, aVar2, str2);
        } else {
            SharePackage a3 = C42198a.m92603a(context, aVar2, str2, z);
            C42138d dVar = new C42138d(a3, null, 0, 6, null);
            bVar.mo86258a((C42307b) new C29838b(this, a3, str2, dVar));
            sharePackage = a3;
        }
        if (this.f77902b.contains("refresh")) {
            C42056ad adVar = new C42056ad(null, this.f77795g, null, 4, null);
            bVar.mo86262a((C42357g) adVar);
        }
        if (this.f77902b.contains("browser")) {
            bVar.mo86262a((C42357g) new C42130z());
        }
        if (this.f77902b.contains("copylink")) {
            C42079d dVar2 = new C42079d("fromWeb", false, false, 6, null);
            bVar.mo86262a((C42357g) dVar2);
        }
        for (String a4 : a) {
            bVar.mo86263a(a4);
        }
        bVar.mo86259a(sharePackage);
        if (!TextUtils.equals(charSequence, "share_native")) {
            C42307b a5 = C42045a.m92010a(optString8, a2);
            if (a5 == null) {
                return false;
            }
            return a5.mo49947a(sharePackage.mo73884a(a5), context);
        }
        if (jSONObject4 != null) {
            jSONObject4.put("tricky_flag", "tricky_flag");
        }
        C29839c cVar = new C29839c(this, jSONObject2, aVar, jSONObject6, optString4);
        bVar.mo86261a((C42354e) cVar);
        C42131b bVar2 = new C42131b(a2, bVar.mo86266a(), 0, 4, null);
        bVar2.show();
        return true;
    }
}
