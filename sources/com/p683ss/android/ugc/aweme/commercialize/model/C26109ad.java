package com.p683ss.android.ugc.aweme.commercialize.model;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.commercialize.link.C25953d;
import com.p683ss.android.ugc.aweme.commercialize.star.C26257b;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ad */
public class C26109ad {
    @C17952c(mo34828a = "commerce_ad_link")

    /* renamed from: a */
    public boolean f68919a = C25953d.m62948a();
    @C17952c(mo34828a = "commerce_ad_link_tags")

    /* renamed from: b */
    public String f68920b;
    @C17952c(mo34828a = "star_atlas_order_id")

    /* renamed from: c */
    public long f68921c = 0;
    @C17952c(mo34828a = "is_star_atlas")

    /* renamed from: d */
    public boolean f68922d;
    @C17952c(mo34828a = "star_atlas_content")

    /* renamed from: e */
    public String f68923e;
    @C17952c(mo34828a = "shop_order_share_structinfo")

    /* renamed from: f */
    public ShopOrderShareStructInfo f68924f;
    @C17952c(mo34828a = "anchor_id")

    /* renamed from: g */
    public String f68925g = "";
    @C17952c(mo34828a = "anchor_business_type")

    /* renamed from: h */
    public int f68926h = C25600a.NO_TYPE.getTYPE();
    @C17952c(mo34828a = "anchor_content")

    /* renamed from: i */
    public String f68927i;
    @C17952c(mo34828a = "anchor_title")

    /* renamed from: j */
    public String f68928j;
    @C17952c(mo34828a = "anchor_icon")

    /* renamed from: k */
    public UrlModel f68929k;
    @C17952c(mo34828a = "source")

    /* renamed from: l */
    public int f68930l;
    @C17952c(mo34828a = "open_url")

    /* renamed from: m */
    public String f68931m;
    @C17952c(mo34828a = "mp_url")

    /* renamed from: n */
    public String f68932n;
    @C17952c(mo34828a = "web_url")

    /* renamed from: o */
    public String f68933o;
    @C17952c(mo34828a = "zip_uri")

    /* renamed from: p */
    public String f68934p;
    @C17952c(mo34828a = "national_task_enter_from")

    /* renamed from: q */
    public String f68935q;
    @C17952c(mo34828a = "task_id")

    /* renamed from: r */
    public String f68936r = "";
    @C17952c(mo34828a = "outer_star_atlas")

    /* renamed from: s */
    public String f68937s;
    @C17952c(mo34828a = "anchor_tag")

    /* renamed from: t */
    public String f68938t;

    /* renamed from: u */
    public String f68939u;

    /* renamed from: v */
    public String f68940v;

    /* renamed from: w */
    public String f68941w;

    /* renamed from: x */
    public String f68942x;

    /* renamed from: y */
    public String f68943y;
    @C17952c(mo34828a = "recommend_anchor")

    /* renamed from: z */
    public List<C25626g> f68944z = null;

    /* renamed from: a */
    public static String m63394a(C26109ad adVar) {
        if (adVar == null) {
            return null;
        }
        return new C17971f().mo34889b(adVar);
    }

    /* renamed from: a */
    public static C26109ad m63393a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new C26109ad();
        }
        return (C26109ad) new C17971f().mo34884a(str, C26109ad.class);
    }

    /* renamed from: a */
    public static C26109ad m63391a(PhotoContext photoContext) {
        if (photoContext == null || TextUtils.isEmpty(photoContext.commerceData)) {
            return new C26109ad();
        }
        return (C26109ad) new C17971f().mo34884a(photoContext.commerceData, C26109ad.class);
    }

    /* renamed from: a */
    public static C26109ad m63392a(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null || TextUtils.isEmpty(baseShortVideoContext.commerceData)) {
            return new C26109ad();
        }
        return (C26109ad) new C17971f().mo34884a(baseShortVideoContext.commerceData, C26109ad.class);
    }

    /* renamed from: a */
    public final void mo53628a(boolean z) {
        if (C26257b.m63629a()) {
            this.f68922d = z;
        } else {
            this.f68922d = false;
        }
    }
}
