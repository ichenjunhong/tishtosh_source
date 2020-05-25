package com.p683ss.android.ugc.aweme.p1807im.sdk.share.model;

import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.PureDataSharePackage */
public final class PureDataSharePackage extends SharePackage {

    /* renamed from: a */
    public static final C35127a f90340a = new C35127a(null);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.PureDataSharePackage$a */
    public static final class C35127a {
        private C35127a() {
        }

        public /* synthetic */ C35127a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static SharePackage m79360a(String str) {
            C52711k.m112240b(str, "type");
            return new SharePackage(new C42326a().mo86236a(str));
        }
    }

    /* renamed from: a */
    public static final SharePackage m79359a(String str) {
        return C35127a.m79360a(str);
    }
}
