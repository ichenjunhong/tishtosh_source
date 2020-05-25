package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.share.libra.WhatsppShareTypeExperiment;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42265f;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42301x;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage */
public final class DownloadedVideoSharePackage extends SharePackage {

    /* renamed from: c */
    public static final C42182a f106676c = new C42182a(null);

    /* renamed from: a */
    public String f106677a;

    /* renamed from: b */
    public Aweme f106678b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage$a */
    public static final class C42182a {
        private C42182a() {
        }

        public /* synthetic */ C42182a(C52707g gVar) {
            this();
        }
    }

    public DownloadedVideoSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final C42318f mo73884a(C42307b bVar) {
        boolean z;
        C52711k.m112240b(bVar, "channel");
        boolean z2 = true;
        if (!(bVar instanceof C42301x) || !WhatsppShareTypeExperiment.m92641a()) {
            z = false;
        } else {
            z = true;
        }
        if (!C52711k.m112239a((Object) bVar.mo86136b(), (Object) "facebook") || new C42265f().mo86141a(C11010c.m22280a())) {
            z2 = false;
        }
        if (z || z2) {
            Aweme aweme = this.f106678b;
            if (aweme == null) {
                C52711k.m112237a("aweme");
            }
            ShareInfo shareInfo = aweme.getShareInfo();
            C52711k.m112236a((Object) shareInfo, "aweme.shareInfo");
            String shareUrl = shareInfo.getShareUrl();
            C52711k.m112236a((Object) shareUrl, "aweme.shareInfo.shareUrl");
            C42322h hVar = new C42322h(C42150c.m92521a(shareUrl, bVar), null, null, 6, null);
            return hVar;
        }
        String str = this.f106677a;
        if (str == null) {
            C52711k.m112237a(LeakCanaryFileProvider.f132050j);
        }
        Uri a = C42150c.m92518a(str, C42150c.m92517a());
        String str2 = this.f106677a;
        if (str2 == null) {
            C52711k.m112237a(LeakCanaryFileProvider.f132050j);
        }
        C42325k kVar = new C42325k(a, str2, null, null, null, null, 60, null);
        String str3 = "content_url";
        String str4 = kVar.f106893g;
        if (str4 == null) {
            str4 = "";
        }
        kVar.mo86232a(str3, str4);
        kVar.mo86232a("fb_app_id", "1862952583919182");
        kVar.mo86232a("media_type", "video/mp4");
        return kVar;
    }

    /* renamed from: a */
    public final boolean mo85939a(C42307b bVar, Context context) {
        C52711k.m112240b(bVar, "channel");
        C52711k.m112240b(context, "context");
        C41979aq.m91947b().addShareRecord(bVar.mo86136b(), 0);
        return false;
    }
}
