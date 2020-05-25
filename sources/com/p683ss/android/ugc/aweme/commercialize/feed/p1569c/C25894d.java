package com.p683ss.android.ugc.aweme.commercialize.feed.p1569c;

import android.view.View;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.p683ss.android.ugc.aweme.p1308ad.utils.C22434b;
import com.p683ss.android.ugc.aweme.p1308ad.view.AdTagGroup;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.c.d */
public final class C25894d extends C25889a {
    /* renamed from: c */
    public final void mo53215c() {
        boolean z;
        AwemeRawAd awemeRawAd = this.f68420c.getAwemeRawAd();
        if (awemeRawAd != null) {
            String[] appCategory = awemeRawAd.getAppCategory();
            if (appCategory != null) {
                View findViewById = mo53211a(this.f68424g, R.layout.bjw).findViewById(R.id.d0);
                C52711k.m112236a((Object) findViewById, "normalLayout.findViewById(R.id.ad_tag_layout)");
                AdTagGroup adTagGroup = (AdTagGroup) findViewById;
                if (appCategory.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : appCategory) {
                        if (str.length() <= 6) {
                            arrayList.add(str);
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    C52711k.m112236a((Object) array, "strings.toArray(arrayOf<String>())");
                    adTagGroup.setTagList((String[]) array);
                } else {
                    adTagGroup.setVisibility(8);
                }
                adTagGroup.setOnClickListener(this);
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
        if (num != null && num.intValue() == R.id.d0) {
            C22434b.m55466c(this.f68423f);
            this.f68422e.mo46461a(15);
        }
    }

    public C25894d(LinearLayout linearLayout, C22400a aVar) {
        C52711k.m112240b(linearLayout, "feedAdLayout");
        C52711k.m112240b(aVar, "adMaskParams");
        super(linearLayout, aVar);
    }
}
