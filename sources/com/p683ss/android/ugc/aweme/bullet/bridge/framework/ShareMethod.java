package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.bullet.kit.web.C10524g;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.google.gson.C17971f;
import com.google.p1057b.p1064g.C17760g;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.C30130ag;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.C42044a.C42045a;
import com.p683ss.android.ugc.aweme.share.improve.C42131b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42079d;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42118r;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42130z;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42138d;
import com.p683ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage.C42192a;
import com.p683ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C42198a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42315c;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47930l;
import com.p683ss.android.ugc.aweme.web.p2399c.p2400a.C48273a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod */
public final class ShareMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24213a f64245b = new C24213a(null);

    /* renamed from: c */
    private final ArrayList<String> f64246c = new ArrayList<>(Arrays.asList(new String[]{"copylink", "qrcode", "browser", "refresh"}));

    /* renamed from: d */
    private final String f64247d = "share";

    /* renamed from: e */
    private C10269a f64248e = C10269a.PRIVATE;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$a */
    public static final class C24213a {
        private C24213a() {
        }

        public /* synthetic */ C24213a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$b */
    public static final class C24214b extends C42315c {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f64249a;

        /* renamed from: b */
        final /* synthetic */ SharePackage f64250b;

        /* renamed from: c */
        final /* synthetic */ String f64251c;

        /* renamed from: a */
        public final boolean mo49947a(C42318f fVar, Context context) {
            C52711k.m112240b(fVar, C42311c.f106865i);
            C52711k.m112240b(context, "context");
            Activity g = C11016e.m22312g();
            SharePackage sharePackage = this.f64250b;
            String str = this.f64251c;
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

        C24214b(ShareMethod shareMethod, SharePackage sharePackage, String str, C42307b bVar) {
            this.f64249a = shareMethod;
            this.f64250b = sharePackage;
            this.f64251c = str;
            super(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$c */
    public static final class C24215c implements C42357g {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f64252a;

        /* renamed from: a */
        public final int mo49948a() {
            return R.drawable.ao1;
        }

        /* renamed from: b */
        public final int mo49953b() {
            return R.string.d6_;
        }

        /* renamed from: c */
        public final String mo49954c() {
            return "refresh";
        }

        /* renamed from: d */
        public final boolean mo49955d() {
            return false;
        }

        /* renamed from: e */
        public final boolean mo49956e() {
            return false;
        }

        /* renamed from: f */
        public final boolean mo49957f() {
            return true;
        }

        /* renamed from: g */
        public final int mo49958g() {
            return C42358a.m93000a(this);
        }

        C24215c(ShareMethod shareMethod) {
            this.f64252a = shareMethod;
        }

        /* renamed from: a */
        public final void mo49949a(Context context) {
            C52711k.m112240b(context, "context");
            C42358a.m93001a((C42357g) this, context);
        }

        /* renamed from: a */
        public final void mo49951a(ImageView imageView) {
            C52711k.m112240b(imageView, "iconView");
            C42358a.m93002a((C42357g) this, imageView);
        }

        /* renamed from: a */
        public final void mo49952a(TextView textView) {
            C52711k.m112240b(textView, "textView");
            C42358a.m93003a((C42357g) this, textView);
        }

        /* renamed from: a */
        public final void mo49950a(Context context, SharePackage sharePackage) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(sharePackage, "sharePackage");
            C10290i g = this.f64252a.mo49907g();
            if (g != null) {
                if (!(g instanceof C10524g)) {
                    g = null;
                }
                C10524g gVar = (C10524g) g;
                if (gVar != null) {
                    WebView m_ = gVar.mo18665m_();
                    if (m_ != null) {
                        m_.reload();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$d */
    public static final class C24216d implements C42354e {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f64253a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f64254b;

        /* renamed from: c */
        final /* synthetic */ C24112a f64255c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f64256d;

        /* renamed from: e */
        final /* synthetic */ String f64257e;

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
                JSONObject jSONObject = this.f64254b;
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
            C24112a aVar = this.f64255c;
            if (aVar != null) {
                aVar.mo49913a(this.f64254b);
            }
        }

        /* renamed from: a */
        public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
            C52711k.m112240b(bVar, "channel");
            C52711k.m112240b(context, "context");
            if (this.f64256d != null) {
                C26890h.onEvent(MobClick.obtain().setEventName(this.f64256d.optString("tag")).setLabelName(bVar.mo86136b()).setValue(this.f64256d.optString("value")).setJsonObject(this.f64256d.optJSONObject("extras")));
            }
            if (z) {
                String b = bVar.mo86136b();
                String str = this.f64257e;
                C52711k.m112236a((Object) str, "url");
                C23089d a = C23089d.m56640a();
                a.mo47829a("enter_from", "h5_page");
                a.mo47829a("platform", b);
                a.mo47829a("url", str);
                C26890h.m65011a("h5_share", a.f61491a);
            }
            C24112a aVar = this.f64255c;
            if (aVar != null) {
                aVar.mo49913a(this.f64254b);
            }
        }

        C24216d(ShareMethod shareMethod, JSONObject jSONObject, C24112a aVar, JSONObject jSONObject2, String str) {
            this.f64253a = shareMethod;
            this.f64254b = jSONObject;
            this.f64255c = aVar;
            this.f64256d = jSONObject2;
            this.f64257e = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$e */
    public static final class C24217e extends C17760g<List<? extends String>> {
        C24217e() {
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64248e;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64247d;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64248e = aVar;
    }

    public ShareMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49906a(org.json.JSONObject r9, com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a r10) {
        /*
            r8 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "code"
            r7 = 1
            r0.put(r1, r7)
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            android.content.Context r1 = r8.mo18743e()
            r2.<init>(r1)
            com.bytedance.ies.bullet.b.e.i r1 = r8.mo49907g()
            r3 = 0
            if (r1 == 0) goto L_0x003a
            boolean r4 = r1 instanceof com.bytedance.ies.bullet.kit.web.C10524g
            if (r4 != 0) goto L_0x002a
            r1 = r3
        L_0x002a:
            com.bytedance.ies.bullet.kit.web.g r1 = (com.bytedance.ies.bullet.kit.web.C10524g) r1
            if (r1 == 0) goto L_0x003a
            android.webkit.WebView r1 = r1.mo18665m_()
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r1.getUrl()
            r4 = r1
            goto L_0x003b
        L_0x003a:
            r4 = r3
        L_0x003b:
            r1 = r8
            r3 = r9
            r5 = r0
            r6 = r10
            boolean r9 = r1.m59233a(r2, r3, r4, r5, r6)
            java.lang.String r1 = "tricky_flag"
            boolean r1 = r0.has(r1)
            if (r1 != 0) goto L_0x0057
            java.lang.String r1 = "code"
            if (r9 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r7 = -1
        L_0x0051:
            r0.put(r1, r7)
            r10.mo49913a(r0)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod.mo49906a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }

    /* renamed from: a */
    private final boolean m59233a(WeakReference<Context> weakReference, JSONObject jSONObject, String str, JSONObject jSONObject2, C24112a aVar) {
        SharePackage sharePackage;
        JSONObject jSONObject3 = jSONObject;
        String str2 = str;
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
        if (!TextUtils.isEmpty(optString7)) {
            List list = (List) new C17971f().mo34885a(optString7, new C24217e().getType());
            if (list != null) {
                this.f64246c.clear();
                this.f64246c.addAll(list);
            }
        }
        List<String> a = C47930l.m103705a(jSONObject3.optJSONArray("shareEntriesForbidList"));
        JSONObject jSONObject4 = null;
        if (jSONObject3.has("logArgs")) {
            jSONObject4 = jSONObject3.optJSONObject("logArgs");
        }
        JSONObject jSONObject5 = jSONObject4;
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
            if (str2 == null) {
                str2 = "";
            }
            sharePackage = C42192a.m92581a(context, aVar2, optString3, str2);
            bVar.mo86262a((C42357g) new C42118r(optString3));
        } else if (TextUtils.equals(charSequence2, "local_img")) {
            sharePackage = C42198a.m92602a(context, aVar2, str2);
        } else {
            C42198a aVar3 = WebSharePackage.f106714b;
            SharePackage a3 = C42198a.m92603a(context, aVar2, str2, false);
            C42138d dVar = new C42138d(a3, null, 0, 6, null);
            bVar.mo86258a((C42307b) new C24214b(this, a3, str2, dVar));
            sharePackage = a3;
        }
        if (this.f64246c.contains("refresh")) {
            bVar.mo86262a((C42357g) new C24215c(this));
        }
        if (this.f64246c.contains("browser")) {
            bVar.mo86262a((C42357g) new C42130z());
        }
        if (this.f64246c.contains("copylink")) {
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
        JSONObject jSONObject6 = jSONObject2;
        jSONObject6.put("tricky_flag", "tricky_flag");
        C24216d dVar3 = new C24216d(this, jSONObject6, aVar, jSONObject5, optString4);
        bVar.mo86261a((C42354e) dVar3);
        C42131b bVar2 = new C42131b(a2, bVar.mo86266a(), 0, 4, null);
        bVar2.show();
        return true;
    }
}
