package com.p683ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.comment.abtest.C25069a;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30181a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.util.C47620d;
import com.p683ss.android.ugc.aweme.video.C48121w;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.d */
public final class C25707d extends C30181a {
    public C25707d(String str, int i) {
        super(str, i);
    }

    /* renamed from: a */
    public final void mo52903a(Activity activity, Fragment fragment) {
        if (activity == null) {
            C25069a.m60928b("ATTACH ACTIVITY == NULL");
        }
        this.f78758c = activity;
        this.f78759d = fragment;
    }

    /* renamed from: a */
    public final void mo52904a(C30332aw awVar, String str) {
        if (mo60470c() != null) {
            Aweme aweme = (Aweme) awVar.f79229b;
            String aid = aweme.getAid();
            C47620d.m103097a(aweme);
            TextUtils.isEmpty(aid);
        }
    }

    /* renamed from: a */
    public final void mo52905a(C30332aw awVar, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        Aweme aweme = (Aweme) awVar.f79229b;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            User author = aweme.getAuthor();
            if (author == null) {
                StringBuilder sb = new StringBuilder("ECCommerce , author is null and awemeid is ");
                sb.append(aweme.getAid());
                C9220a.m18310a(sb.toString());
            } else if (aweme.hasPromotion()) {
                Context d = mo60471d();
                if (d != null) {
                    C30669b a = FeedParamProvider.m71941a(d);
                    if (!TextUtils.isEmpty(a.getEntranceInfo())) {
                        str4 = a.getEntranceInfo();
                    } else {
                        try {
                            str4 = new JSONObject(a.getTracker()).optString("entrance_info");
                        } catch (Exception unused) {
                            str4 = "";
                        }
                    }
                    String str8 = str4;
                    ICommerceService a2 = C25539a.m62079a();
                    Activity c = mo60470c();
                    String promotionId = aweme.getPromotion().getPromotionId();
                    long promotionSource = (long) aweme.getPromotion().getPromotionSource();
                    if (TextUtils.isEmpty(str3)) {
                        str5 = "INVALID_ENTER_FROM";
                    } else {
                        str5 = str3;
                    }
                    if (TextUtils.isEmpty(str)) {
                        str6 = "";
                    } else {
                        str6 = str;
                    }
                    String str9 = "full_screen_card";
                    if (TextUtils.isEmpty(str2)) {
                        str7 = "";
                    } else {
                        str7 = str2;
                    }
                    a2.onFeedAnchorClick(c, aweme, promotionId, promotionSource, author, false, str5, str6, str9, str7, C48121w.m104249M().mo95256n(), str8);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo52906b(C30332aw awVar, String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        Aweme aweme = (Aweme) awVar.f79229b;
        if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
            User author = aweme.getAuthor();
            Context d = mo60471d();
            if (d != null && author != null && aweme.getPromotion() != null) {
                C30669b a = FeedParamProvider.m71941a(d);
                if (!TextUtils.isEmpty(a.getEntranceInfo())) {
                    str4 = a.getEntranceInfo();
                } else {
                    try {
                        str4 = new JSONObject(a.getTracker()).optString("entrance_info");
                    } catch (Exception unused) {
                        str4 = "";
                    }
                }
                String str8 = str4;
                ICommerceService a2 = C25539a.m62079a();
                Activity c = mo60470c();
                String promotionId = aweme.getPromotion().getPromotionId();
                long promotionSource = (long) aweme.getPromotion().getPromotionSource();
                if (TextUtils.isEmpty(str3)) {
                    str5 = "INVALID_ENTER_FROM";
                } else {
                    str5 = str3;
                }
                if (TextUtils.isEmpty(str)) {
                    str6 = "";
                } else {
                    str6 = str;
                }
                String str9 = "full_screen_card";
                if (TextUtils.isEmpty(str2)) {
                    str7 = "";
                } else {
                    str7 = str2;
                }
                a2.logAndStartPreview(c, aweme, promotionId, promotionSource, author, str5, str6, str9, str7, C48121w.m104249M().mo95256n(), str8, false);
            }
        }
    }
}
