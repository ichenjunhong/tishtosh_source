package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.p038f.C0794k;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42323i;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42293t;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.p683ss.android.ugc.aweme.util.C47634q;
import com.p683ss.android.ugc.aweme.util.C47640t;
import com.p683ss.android.ugc.aweme.web.p2399c.p2400a.C48273a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage */
public final class RemoteImageSharePackage extends LinkDefaultSharePackage {

    /* renamed from: b */
    public static final C42192a f106699b = new C42192a(null);

    /* renamed from: a */
    public String f106700a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage$a */
    public static final class C42192a {
        private C42192a() {
        }

        public /* synthetic */ C42192a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static RemoteImageSharePackage m92581a(Context context, C48273a aVar, String str, String str2) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aVar, "shareInfo");
            C52711k.m112240b(str, "imageUrl");
            C42326a b = new C42326a().mo86236a("pic").mo86239b("web");
            String str3 = aVar.f121483a;
            C52711k.m112236a((Object) str3, "shareInfo.title");
            C42326a c = b.mo86240c(str3);
            String str4 = aVar.f121484b;
            C52711k.m112236a((Object) str4, "shareInfo.desc");
            C42326a d = c.mo86241d(str4);
            String b2 = C42149b.m92515b(aVar.f121486d);
            if (b2 == null) {
                b2 = "";
            }
            RemoteImageSharePackage remoteImageSharePackage = new RemoteImageSharePackage(d.mo86242e(b2));
            remoteImageSharePackage.f106700a = str;
            Bundle bundle = remoteImageSharePackage.f106900i;
            bundle.putString("app_name", context.getString(R.string.ip));
            StringBuilder sb = new StringBuilder("file://");
            sb.append(aVar.f121488f);
            bundle.putString("thumb_url", sb.toString());
            bundle.putString("thumb_path", aVar.f121488f);
            bundle.putString("url_for_im_share", str2);
            return remoteImageSharePackage;
        }
    }

    public RemoteImageSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo85939a(C42307b bVar, Context context) {
        C52711k.m112240b(bVar, "channel");
        C52711k.m112240b(context, "context");
        C41979aq.m91947b().addShareRecord(bVar.mo86136b(), 1);
        C0794k a = new C47634q(new WeakReference(context)).mo94933a(this.f106700a, new C47640t(C42149b.m92512a(context)));
        if (C52711k.m112239a((Object) (Boolean) a.f2711a, (Object) Boolean.valueOf(true)) && a.f2712b != null) {
            S s = a.f2712b;
            if (s == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) s, "downloadResult.second!!");
            Uri a2 = C42150c.m92518a((String) s, context);
            S s2 = a.f2712b;
            if (s2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) s2, "downloadResult.second!!");
            C42323i iVar = new C42323i(a2, (String) s2, null, null, null, null, 60, null);
            C42318f fVar = iVar;
            if (bVar.mo86132a(context, fVar)) {
                bVar.mo49947a(fVar, context);
            } else {
                String string = C42150c.m92517a().getString(R.string.bd4);
                C52711k.m112236a((Object) string, "chaosContext().getString…string.i18n_share_system)");
                new C42293t(string).mo86133a(iVar, context);
            }
        }
        return false;
    }
}
