package com.p683ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.net.C37777i;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.C42131b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42056ad;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42079d;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42130z;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42138d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness */
public class ShareBusiness extends AbsShareBusiness {
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo55471c() {
        super.mo55471c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo55468b() {
        boolean z;
        boolean z2;
        if ((this.f71634k instanceof Activity) && this.f71614a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "h5_page");
            hashMap.put("previous_page", this.f71633j.f71718a.f71709f);
            hashMap.put("scene_id", "1004");
            C26890h.m65011a("h5_click_more_button", (Map<String, String>) hashMap);
            C42350b bVar = new C42350b();
            bVar.mo86258a((C42307b) new C42138d(this.f71614a));
            C41979aq.m91946a().injectUniversalConfig(bVar, (Activity) this.f71634k, true);
            bVar.mo86259a((SharePackage) this.f71614a);
            bVar.mo86270b(true);
            String host = Uri.parse(this.f71617d).getHost();
            ArrayList arrayList = new ArrayList(C27148b.m65491a());
            arrayList.addAll((Set) C23183v.m56778a().mo47915k().mo47782d());
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C37777i.m84365a(host, (String) it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z || !mo55467a()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                bVar.mo86267b();
            }
            if (this.f71615b.contains("copylink")) {
                bVar.mo86262a((C42357g) new C42079d("fromWeb", false, true));
            }
            if (this.f71615b.contains("refresh")) {
                bVar.mo86262a((C42357g) new C42056ad(this.f71631h));
            }
            if (this.f71615b.contains("browser")) {
                bVar.mo86262a((C42357g) new C42130z());
            }
            bVar.mo86265a(true);
            this.f71614a.f106900i.putString("aweme_id", this.f71633j.f71718a.f71713j);
            bVar.mo86261a((C42354e) new C42354e() {
                /* renamed from: a */
                public final void mo49960a(SharePackage sharePackage, Context context) {
                }

                /* renamed from: b */
                public final void mo49962b(SharePackage sharePackage, Context context) {
                }

                /* renamed from: a */
                public final void mo49961a(C42357g gVar, SharePackage sharePackage, Context context) {
                    if (gVar instanceof C42079d) {
                        ShareBusiness.this.mo55470b(gVar.mo49954c());
                    }
                }

                /* renamed from: a */
                public final void mo49959a(C42307b bVar, boolean z, SharePackage sharePackage, Context context) {
                    ShareBusiness.this.mo55470b(bVar.mo86136b());
                }
            });
            new C42131b(C11016e.m22312g(), bVar.mo86266a()).show();
        }
    }

    public ShareBusiness(C27173c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo55464a(WebView webView) {
        super.mo55464a(webView);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo55469b(WebView webView) {
        super.mo55469b(webView);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo55465a(String str) {
        super.mo55465a(str);
    }
}
