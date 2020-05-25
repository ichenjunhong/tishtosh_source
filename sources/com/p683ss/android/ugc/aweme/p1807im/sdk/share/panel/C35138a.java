package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.a */
public final class C35138a {

    /* renamed from: a */
    public static final C35138a f90369a = new C35138a();

    /* renamed from: b */
    private static final int f90370b = C23728o.m58241a(56.0d);

    private C35138a() {
    }

    /* renamed from: a */
    public static void m79371a(SharePackage sharePackage, View view) {
        C52711k.m112240b(sharePackage, "sharePackage");
        C52711k.m112240b(view, "editLayout");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.bnm);
        ImageView imageView = (ImageView) view.findViewById(R.id.b49);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.bnl);
        C13837e eVar = new C13837e();
        eVar.mo25932a(C9432q.m18687b(C11010c.m22280a(), 2.0f));
        String str = sharePackage.f106895d;
        int hashCode = str.hashCode();
        if (hashCode != -1354573786) {
            if (hashCode != 3178685) {
                if (hashCode == 603552178 && str.equals("good_window")) {
                    C52711k.m112236a((Object) remoteImageView, "shareCover");
                    LayoutParams layoutParams = remoteImageView.getLayoutParams();
                    layoutParams.width = f90370b;
                    layoutParams.height = f90370b;
                    remoteImageView.setLayoutParams(layoutParams);
                    eVar.mo25937a(true);
                    C52711k.m112236a((Object) imageView, "shareGoodWindowTag");
                    imageView.setVisibility(0);
                }
            } else if (str.equals("good")) {
                imageView.setImageResource(R.drawable.d_d);
                C52711k.m112236a((Object) imageView, "shareGoodWindowTag");
                imageView.setVisibility(0);
            }
        } else if (str.equals("coupon")) {
            C52711k.m112236a((Object) imageView2, "shareCouponTag");
            imageView2.setVisibility(0);
        }
        C52711k.m112236a((Object) remoteImageView, "shareCover");
        C13833a aVar = (C13833a) remoteImageView.getHierarchy();
        C52711k.m112236a((Object) aVar, "shareCover.hierarchy");
        aVar.mo25899a(eVar);
    }
}
