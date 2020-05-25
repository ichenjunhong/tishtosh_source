package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareCouponContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bj */
public class C33788bj extends C33809cc {
    public C33788bj(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        String str;
        String str2;
        String str3;
        super.mo71780a(pVar, pVar2, baseContent, i);
        ShareCouponContent shareCouponContent = (ShareCouponContent) baseContent;
        this.f87727w.setText(shareCouponContent.getCouponDesc());
        this.f87728x.setVisibility(0);
        this.f87728x.setText(shareCouponContent.getPoiName());
        this.f87729y.setText(R.string.bg_);
        C23515d.m57669a(this.f87726v, shareCouponContent.getMerchantIconUrl());
        this.f87708j.setTag(50331648, Integer.valueOf(33));
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", shareCouponContent.getPoiId());
        hashMap.put("activity_id", shareCouponContent.getActivityId());
        hashMap.put("coupon_id", shareCouponContent.getCouponId());
        String str4 = "is_self";
        if (pVar.isSelf()) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str4, str);
        hashMap.put("uid", this.f87707i);
        this.f87708j.setTag(67108864, hashMap);
        boolean isSelf = pVar.isSelf();
        if (isSelf) {
            str2 = this.f87707i;
        } else {
            str2 = C35265e.m79730b().toString();
        }
        if (isSelf) {
            str3 = C35265e.m79730b().toString();
        } else {
            str3 = this.f87707i;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("enter_from", "chat");
        hashMap2.put("from_user_id", str3);
        hashMap2.put("conversation_id", this.f87712n.getConversationId());
        hashMap2.put("to_user_id", str2);
        hashMap2.put("poi_id", shareCouponContent.getPoiId());
        hashMap2.put("coupon_id", shareCouponContent.getCouponId());
        hashMap2.put("activity_id", shareCouponContent.getActivityId());
        C26890h.m65011a("show_receive_coupon_inner", (Map<String, String>) hashMap2);
    }
}
