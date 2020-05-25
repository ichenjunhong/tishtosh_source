package com.p683ss.android.ugc.aweme.commercialize.feed.p1569c;

import android.view.View;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.commercialize.model.C26141u;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.C22389f;
import com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c.f */
public final class C25896f extends C25889a {
    /* renamed from: c */
    public final void mo53215c() {
        AwemeRawAd awemeRawAd = this.f68420c.getAwemeRawAd();
        if (awemeRawAd != null) {
            C26141u nativeCardInfo = awemeRawAd.getNativeCardInfo();
            if (nativeCardInfo != null) {
                View findViewById = mo53211a(this.f68424g, R.layout.bjy).findViewById(R.id.d7);
                C52711k.m112236a((Object) findViewById, "webLayout.findViewById(R.id.ad_web_image)");
                RemoteImageView remoteImageView = (RemoteImageView) findViewById;
                remoteImageView.setVisibility(0);
                C22389f.m55398a(remoteImageView, nativeCardInfo.image);
                remoteImageView.setOnClickListener(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53213a(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.d7) {
            this.f68422e.mo46461a(19);
        }
    }

    public C25896f(LinearLayout linearLayout, C22400a aVar) {
        C52711k.m112240b(linearLayout, "feedAdLayout");
        C52711k.m112240b(aVar, "adMaskParams");
        super(linearLayout, aVar);
    }
}
