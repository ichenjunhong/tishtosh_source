package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.share.C41963ah.C41964a;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45469z;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.web.p2399c.p2400a.C48273a;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage */
public final class WebSharePackage extends SharePackage {

    /* renamed from: b */
    public static final C42198a f106714b = new C42198a(null);

    /* renamed from: a */
    public String f106715a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$a */
    public static final class C42198a {
        private C42198a() {
        }

        public /* synthetic */ C42198a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static String m92605a(JSONObject jSONObject, String str) {
            String optString = jSONObject.optString(str);
            if (optString == null || C52711k.m112239a((Object) optString, (Object) TEVideoRecorder.FACE_BEAUTY_NULL)) {
                return null;
            }
            return optString;
        }

        /* renamed from: a */
        public static WebSharePackage m92602a(Context context, C48273a aVar, String str) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aVar, "shareInfo");
            C42326a b = new C42326a().mo86236a("pic").mo86239b("web");
            String str2 = aVar.f121483a;
            C52711k.m112236a((Object) str2, "shareInfo.title");
            C42326a c = b.mo86240c(str2);
            String str3 = aVar.f121484b;
            C52711k.m112236a((Object) str3, "shareInfo.desc");
            C42326a d = c.mo86241d(str3);
            String b2 = C42149b.m92515b(aVar.f121486d);
            if (b2 == null) {
                b2 = "";
            }
            WebSharePackage webSharePackage = new WebSharePackage(d.mo86242e(b2));
            Bundle bundle = webSharePackage.f106900i;
            bundle.putString("app_name", context.getString(R.string.ip));
            StringBuilder sb = new StringBuilder("file://");
            sb.append(aVar.f121488f);
            bundle.putString("thumb_url", sb.toString());
            bundle.putString("thumb_path", aVar.f121488f);
            bundle.putString("url_for_im_share", str);
            return webSharePackage;
        }

        /* renamed from: a */
        public static WebSharePackage m92603a(Context context, C48273a aVar, String str, boolean z) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aVar, "shareInfo");
            C42326a b = new C42326a().mo86236a("web").mo86239b("web");
            String str2 = aVar.f121483a;
            C52711k.m112236a((Object) str2, "shareInfo.title");
            C42326a c = b.mo86240c(str2);
            String str3 = aVar.f121484b;
            C52711k.m112236a((Object) str3, "shareInfo.desc");
            C42326a d = c.mo86241d(str3);
            String b2 = C42149b.m92515b(aVar.f121486d);
            if (b2 == null) {
                b2 = "";
            }
            WebSharePackage webSharePackage = new WebSharePackage(d.mo86242e(b2));
            Bundle bundle = webSharePackage.f106900i;
            bundle.putString("app_name", context.getString(R.string.ip));
            bundle.putString("thumb_url", aVar.f121485c);
            bundle.putString("url_for_im_share", str);
            bundle.putBoolean("user_origin_link", z);
            webSharePackage.f106715a = aVar.f121485c;
            C23515d.m57687b(aVar.f121485c);
            return webSharePackage;
        }

        /* renamed from: a */
        public static WebSharePackage m92604a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
            boolean z;
            boolean z2;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(jSONObject, "meta");
            C52711k.m112240b(str2, "currentUrl");
            C52711k.m112240b(str3, "paramsTitle");
            C42326a aVar = new C42326a();
            aVar.mo86236a("web");
            String a = m92605a(jSONObject, "title");
            if (a == null) {
                a = "";
            }
            aVar.mo86240c(a);
            String a2 = m92605a(jSONObject, "description");
            if (a2 == null) {
                a2 = "";
            }
            aVar.mo86241d(a2);
            String a3 = m92605a(jSONObject, "url");
            if (a3 == null) {
                a3 = "";
            }
            aVar.mo86242e(a3);
            CharSequence charSequence = aVar.f106904c;
            boolean z3 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CharSequence charSequence2 = str;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || !(!C52711k.m112239a((Object) str, (Object) "undefined"))) {
                    aVar.mo86240c(str3);
                } else {
                    aVar.mo86240c(str);
                }
            }
            CharSequence charSequence3 = aVar.f106905d;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z3 = true;
            }
            if (z3) {
                aVar.mo86241d(" ");
            }
            String str4 = aVar.f106906e;
            if (str4 == null || !(!C52830p.m112402a(str4))) {
                aVar.mo86242e(str2);
            } else {
                C18922i iVar = new C18922i(aVar.f106906e);
                if (!C41964a.m91931a()) {
                    IAccountUserService g = C20854a.m53167g();
                    C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                    iVar.mo38778a("u_code", C19547d.m47843b(g.getCurUserId()));
                }
                if (!C41964a.m91932b()) {
                    iVar.mo38778a("iid", C19034d.m46312a());
                }
                String a4 = iVar.mo38774a();
                C52711k.m112236a((Object) a4, "urlBuilder.build()");
                aVar.mo86242e(a4);
            }
            WebSharePackage webSharePackage = new WebSharePackage(aVar);
            Bundle bundle = webSharePackage.f106900i;
            bundle.putString("app_name", context.getString(R.string.ip));
            bundle.putString("thumb_url", m92605a(jSONObject, "image"));
            return webSharePackage;
        }
    }

    public WebSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final C42318f mo73884a(C42307b bVar) {
        String a;
        C52711k.m112240b(bVar, "channel");
        boolean z = this.f106900i.getBoolean("user_origin_link");
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        if (!C52830p.m112402a(this.f106898g)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f106898g);
            sb2.append(' ');
            sb.append(sb2.toString());
        }
        if (z) {
            sb.append(this.f106899h);
        } else {
            sb.append(C42150c.m92521a(this.f106899h, bVar));
        }
        if (C52711k.m112239a((Object) bVar.mo86136b(), (Object) "facebook")) {
            if (z) {
                a = this.f106899h;
            } else {
                a = C42150c.m92521a(this.f106899h, bVar);
            }
            C42322h hVar = new C42322h(a, null, null, 6, null);
            return hVar;
        }
        String sb3 = sb.toString();
        C52711k.m112236a((Object) sb3, "textBuilder.toString()");
        C42324j jVar = new C42324j(sb3, this.f106897f);
        String str = this.f106715a;
        if (str == null) {
            str = "";
        }
        String a2 = C23515d.m57665a(str);
        C52711k.m112236a((Object) a2, "downloadedPath");
        if (a2.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C45469z.m99095d(C11010c.m22280a()));
            sb4.append("image_for_share.jpg");
            String sb5 = sb4.toString();
            C48016e.m103947c(sb5);
            C48016e.m103948c(a2, sb5);
            String uri = C42150c.m92518a(sb5, C11010c.m22280a()).toString();
            C52711k.m112236a((Object) uri, "sharePath.pathToUri(AppC…tionContext()).toString()");
            jVar.mo86232a("image", uri);
        }
        return jVar;
    }

    /* renamed from: a */
    public final boolean mo85939a(C42307b bVar, Context context) {
        C52711k.m112240b(bVar, "channel");
        C52711k.m112240b(context, "context");
        C41979aq.m91947b().addShareRecord(bVar.mo86136b(), 2);
        return false;
    }
}
