package com.p683ss.android.ugc.aweme.profile.api;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12690b;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1172b.C19181f;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.AwemeAdStatus;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.profile.C39715aa;
import com.p683ss.android.ugc.aweme.profile.service.C40023p;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.util.C40542c;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Map;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.AwemeApi */
public final class AwemeApi {

    /* renamed from: a */
    public static final String f101545a;

    /* renamed from: b */
    public static final String f101546b;

    /* renamed from: c */
    public static final String f101547c;

    /* renamed from: d */
    public static final String f101548d;

    /* renamed from: e */
    public static final RealApi f101549e = ((RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.AwemeApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "/aweme/v2/douplus/item/check/")
        C17832m<AwemeAdStatus> checkItemAdStatus(@C53089t(mo110619a = "item_id") String str, @C53089t(mo110619a = "from_source") int i);

        @C53084o(mo110612a = "/aweme/v1/commit/dislike/item/")
        @C53074e
        C12690b<BaseResponse> disLikeAweme(@C53089t(mo110619a = "aweme_id") String str, @C53073d Map<String, String> map);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C18845b.f52040e);
        sb.append("/aweme/v1/aweme/post/");
        f101545a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C18845b.f52040e);
        sb2.append("/aweme/v1/aweme/favorite/");
        f101546b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C18845b.f52040e);
        sb3.append("/aweme/v1/aweme/listcollection/");
        f101547c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C18845b.f52040e);
        sb4.append("/aweme/v1/private/aweme/");
        f101548d = sb4.toString();
    }

    /* renamed from: a */
    private static String m88494a(int i) {
        if (i != 0) {
            if (i == 4) {
                return f101547c;
            }
            if (i != 11) {
                if (i != 14) {
                    return f101546b;
                }
                return f101548d;
            }
        }
        return f101545a;
    }

    /* renamed from: a */
    private static void m88495a(FeedItemList feedItemList, C19181f fVar) {
        if (feedItemList != null) {
            C19170a[] aVarArr = null;
            String str = "X-TT-LOGID";
            if (!TextUtils.isEmpty(str)) {
                aVarArr = fVar.mo39138a(str);
            }
            if (aVarArr != null) {
                for (C19170a aVar : aVarArr) {
                    if ("X-TT-LOGID".equalsIgnoreCase(aVar.mo39116a())) {
                        feedItemList.setRequestId(aVar.mo39117b());
                        return;
                    }
                }
            }
            if (feedItemList.logPb != null) {
                feedItemList.setRequestId(feedItemList.logPb.getImprId());
            }
        }
    }

    /* renamed from: a */
    public static FeedItemList m88492a(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4) {
        int i5;
        boolean z2;
        String str4 = str;
        long j2 = j;
        C19181f fVar = new C19181f();
        C18922i iVar = new C18922i(f101546b);
        iVar.mo38776a("invalid_item_count", i3);
        iVar.mo38776a("is_hiding_invalid_item", i4);
        iVar.mo38777a("max_cursor", j2);
        if ((TextUtils.isEmpty(str2) || C32816h.m75716b().getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
            iVar.mo38778a("user_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            String str5 = str2;
            iVar.mo38778a("sec_user_id", str2);
        }
        iVar.mo38776a("count", i2);
        C40026s sVar = C40026s.f101964a;
        if (z) {
            i5 = 60;
        } else {
            i5 = 0;
        }
        String a = iVar.mo38774a();
        Class<FeedItemList> cls = FeedItemList.class;
        if (j2 <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) sVar.apiExecuteGetJSONObject(i5, a, cls, null, fVar, z2, null);
        m88495a(feedItemList, fVar);
        C40542c.m89957a(i, str, feedItemList);
        C40023p.f101960a.mo52800a("personal", feedItemList.getItems());
        return feedItemList;
    }

    /* renamed from: a */
    public static FeedItemList m88493a(boolean z, String str, String str2, int i, long j, int i2, String str3, int i3, int i4, Integer num) throws Exception {
        int i5;
        boolean z2;
        String str4 = str;
        int i6 = i;
        long j2 = j;
        C19181f fVar = new C19181f();
        C18922i iVar = new C18922i(m88494a(i));
        if (i6 == 0) {
            iVar.mo38776a("source", 0);
        } else if (i6 == 11) {
            iVar.mo38776a("source", 1);
        }
        C39715aa.m88421a(iVar, num, i6);
        if (i6 == 4) {
            iVar.mo38777a("cursor", j2);
        } else {
            iVar.mo38777a("max_cursor", j2);
            if ((TextUtils.isEmpty(str2) || C32816h.m75716b().getSecIdSwitch().intValue() == 0) && !TextUtils.isEmpty(str)) {
                iVar.mo38778a("user_id", str4);
            }
            if (!TextUtils.isEmpty(str2)) {
                iVar.mo38778a("sec_user_id", str2);
            }
        }
        if (i6 == 1) {
            iVar.mo38776a("hotsoon_filtered_count", i3);
            iVar.mo38776a("hotsoon_has_more", i4);
        }
        iVar.mo38776a("count", i2);
        C40026s sVar = C40026s.f101964a;
        if (z) {
            i5 = 60;
        } else {
            i5 = 0;
        }
        String a = iVar.mo38774a();
        Class<FeedItemList> cls = FeedItemList.class;
        if (j2 <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        FeedItemList feedItemList = (FeedItemList) sVar.apiExecuteGetJSONObject(i5, a, cls, null, fVar, z2, str3);
        m88495a(feedItemList, fVar);
        C40542c.m89957a(i6, str4, feedItemList);
        C40023p.f101960a.mo52800a("personal", feedItemList.getItems());
        return feedItemList;
    }
}
