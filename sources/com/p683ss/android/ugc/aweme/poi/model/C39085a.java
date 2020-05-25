package com.p683ss.android.ugc.aweme.poi.model;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.a */
public final class C39085a implements Serializable {
    @C17952c(mo34828a = "raw_data")

    /* renamed from: a */
    private String f99677a;
    @C17952c(mo34828a = "raw_datas")

    /* renamed from: b */
    private List<String> f99678b;
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    private String f99679c;

    /* renamed from: d */
    private AwemeRawAd f99680d;

    /* renamed from: e */
    private List<AwemeRawAd> f99681e;

    public final AwemeRawAd getAwemeAd() {
        return this.f99680d;
    }

    public final List<AwemeRawAd> getAwemeAds() {
        return this.f99681e;
    }

    public final String getRawData() {
        return this.f99677a;
    }

    public final List<String> getRawDatas() {
        return this.f99678b;
    }

    public final String getTitle() {
        if (TextUtils.isEmpty(this.f99679c)) {
            return "";
        }
        return this.f99679c;
    }

    public final void parseRawData() {
        if (!TextUtils.isEmpty(this.f99677a)) {
            this.f99680d = getAwemeRawAd(this.f99677a);
        }
        if (this.f99680d == null && !C9376b.m18558a((Collection<T>) this.f99678b)) {
            for (String awemeRawAd : this.f99678b) {
                AwemeRawAd awemeRawAd2 = getAwemeRawAd(awemeRawAd);
                if (awemeRawAd2 != null && !awemeRawAd2.isNewStyleAd()) {
                    this.f99680d = awemeRawAd2;
                    return;
                }
            }
        }
    }

    public final void setAwemeRawAds(List<AwemeRawAd> list) {
        this.f99681e = list;
    }

    public final void setRawData(String str) {
        this.f99677a = str;
    }

    public static AwemeRawAd getAwemeRawAd(String str) {
        try {
            return (AwemeRawAd) new C17971f().mo34885a(str, new C17956a<AwemeRawAd>() {
            }.f49843c);
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            return null;
        }
    }
}
