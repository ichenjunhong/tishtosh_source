package com.p683ss.android.ugc.aweme.commercialize.feed.p1569c;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.falconx.statistic.StatisticData;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26141u;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.C22389f;
import com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b;
import com.p683ss.android.ugc.aweme.p1308ad.view.AdRatingView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c.e */
public final class C25895e extends C25889a {
    /* renamed from: c */
    public final void mo53215c() {
        AwemeRawAd awemeRawAd = this.f68420c.getAwemeRawAd();
        if (awemeRawAd != null) {
            C26141u nativeCardInfo = awemeRawAd.getNativeCardInfo();
            if (nativeCardInfo != null) {
                View a = mo53211a(this.f68424g, R.layout.bjx);
                View findViewById = a.findViewById(R.id.c0);
                C52711k.m112236a((Object) findViewById, "shopLayout.findViewById(R.id.ad_image)");
                RemoteImageView remoteImageView = (RemoteImageView) findViewById;
                if (TextUtils.isEmpty(nativeCardInfo.imageUrl)) {
                    ((C13833a) remoteImageView.getHierarchy()).mo25898a(C13818b.f36065e);
                    C22389f.m55400a(remoteImageView, C23556a.m57755a(R.drawable.adz));
                } else {
                    ((C13833a) remoteImageView.getHierarchy()).mo25898a(C13818b.f36061a);
                    C22389f.m55401a(remoteImageView, nativeCardInfo.imageUrl);
                }
                OnClickListener onClickListener = this;
                remoteImageView.setOnClickListener(onClickListener);
                View findViewById2 = a.findViewById(R.id.d1);
                C52711k.m112236a((Object) findViewById2, "shopLayout.findViewById(R.id.ad_title)");
                TextView textView = (TextView) findViewById2;
                if (TextUtils.isEmpty(nativeCardInfo.title)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(nativeCardInfo.title);
                }
                View findViewById3 = a.findViewById(R.id.c3);
                C52711k.m112236a((Object) findViewById3, "shopLayout.findViewById(R.id.ad_label)");
                TextView textView2 = (TextView) findViewById3;
                if (TextUtils.isEmpty(nativeCardInfo.featureLabel)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(nativeCardInfo.featureLabel);
                }
                ((LinearLayout) a.findViewById(R.id.d2)).setOnClickListener(onClickListener);
                View findViewById4 = a.findViewById(R.id.c6);
                C52711k.m112236a((Object) findViewById4, "shopLayout.findViewById(R.id.ad_like_layout)");
                LinearLayout linearLayout = (LinearLayout) findViewById4;
                View findViewById5 = a.findViewById(R.id.ci);
                C52711k.m112236a((Object) findViewById5, "shopLayout.findViewById(R.id.ad_rating_view)");
                AdRatingView adRatingView = (AdRatingView) findViewById5;
                View findViewById6 = a.findViewById(R.id.b6);
                C52711k.m112236a((Object) findViewById6, "shopLayout.findViewById(R.id.ad_app_use_number)");
                TextView textView3 = (TextView) findViewById6;
                if (nativeCardInfo.feedbackRate < 80) {
                    linearLayout.setVisibility(8);
                } else if (nativeCardInfo.feedbackRate < 90) {
                    adRatingView.setRatingProgress(4.0f);
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(nativeCardInfo.feedbackRate));
                    sb.append(this.f68419b.getString(R.string.b9l));
                    textView3.setText(sb.toString());
                } else if (nativeCardInfo.feedbackRate <= 100) {
                    adRatingView.setRatingProgress(5.0f);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(String.valueOf(nativeCardInfo.feedbackRate));
                    sb2.append(this.f68419b.getString(R.string.b9l));
                    textView3.setText(sb2.toString());
                } else {
                    adRatingView.setRatingProgress(5.0f);
                    StringBuilder sb3 = new StringBuilder(StatisticData.ERROR_CODE_NOT_FOUND);
                    sb3.append(this.f68419b.getString(R.string.b9l));
                    textView3.setText(sb3.toString());
                }
                linearLayout.setOnClickListener(onClickListener);
                View findViewById7 = a.findViewById(R.id.cg);
                C52711k.m112236a((Object) findViewById7, "shopLayout.findViewById(R.id.ad_price)");
                TextView textView4 = (TextView) findViewById7;
                View findViewById8 = a.findViewById(R.id.ck);
                C52711k.m112236a((Object) findViewById8, "shopLayout.findViewById(R.id.ad_service)");
                TextView textView5 = (TextView) findViewById8;
                textView4.setText(nativeCardInfo.originPrice);
                textView5.setText(nativeCardInfo.service);
                ((LinearLayout) a.findViewById(R.id.ch)).setOnClickListener(onClickListener);
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
        if (num != null && num.intValue() == R.id.c0) {
            this.f68422e.mo46461a(19);
        } else if (num != null && num.intValue() == R.id.d2) {
            C22434b.m55466c(this.f68423f);
            this.f68422e.mo46461a(20);
        } else if (num != null && num.intValue() == R.id.c6) {
            C22434b.m55466c(this.f68423f);
            this.f68422e.mo46461a(13);
        } else {
            if (num != null && num.intValue() == R.id.ch) {
                this.f68422e.mo46461a(21);
            }
        }
    }

    public C25895e(LinearLayout linearLayout, C22400a aVar) {
        C52711k.m112240b(linearLayout, "feedAdLayout");
        C52711k.m112240b(aVar, "adMaskParams");
        super(linearLayout, aVar);
    }
}
