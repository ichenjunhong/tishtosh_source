package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9431p;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.r */
public final class C39462r {
    /* renamed from: a */
    public static void m87771a(View view, CharSequence charSequence, Context context, int i, String str, PoiDetail poiDetail, String str2) {
    }

    /* renamed from: a */
    public static boolean m87772a() {
        return false;
    }

    /* renamed from: a */
    public static Bitmap m87764a(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.dku);
    }

    /* renamed from: a */
    public static <T extends C23526a> T m87765a(C39128l lVar, Class<T> cls) throws IllegalAccessException, InstantiationException {
        Bundle bundle = new Bundle(2);
        bundle.putSerializable("poi_bundle", lVar);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "poi_page");
        T t = (C23526a) cls.newInstance();
        t.setArguments(bundle);
        return t;
    }

    /* renamed from: a */
    static void m87766a(Context context, PoiDetail poiDetail) {
        C39452l.m87731a(poiDetail, "enter_chat", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "click_poi_contact_method").mo47829a("poi_id", poiDetail.getPoiId()).mo47829a("poi_type", poiDetail.getTypeCode()).mo47829a("to_user_id", poiDetail.getEnterpriseId()));
        C39454n.f100872a.mo80411a(context, poiDetail.getEnterpriseId(), poiDetail.getEnterpriseSecUid(), poiDetail.getEnterpriseTitle(), poiDetail.getEnterpriseThumb(), poiDetail.getEnterpriseVerifyReason(), poiDetail.getEnterpriseSignature());
    }

    /* renamed from: a */
    public static boolean m87773a(double d, double d2) {
        if (Math.abs(d) > 90.0d || Math.abs(d2) > 180.0d || d == ProfileUiInitOptimizeEnterThreshold.DEFAULT || d2 == ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m87767a(Context context, PoiDetail poiDetail, String str) {
        C23249s sVar = (C23249s) new C23249s().mo48137c("poi_page").mo47941a("click_profile_card");
        sVar.f62105e = str;
        sVar.mo48144s(poiDetail.getEnterpriseId()).mo48135b(poiDetail.getPoiId(), poiDetail.getPoiTypeStr()).mo48076e();
        User enterpriseModel = poiDetail.getEnterpriseModel();
        if (context != null && enterpriseModel != null && !TextUtils.isEmpty(enterpriseModel.getUid())) {
            String uid = enterpriseModel.getUid();
            String secUid = enterpriseModel.getSecUid();
            SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", uid).withParam("sec_user_id", secUid).withParam("profile_enterprise_type", enterpriseModel.getCommerceUserLevel()).open();
        }
    }

    /* renamed from: a */
    public static void m87769a(Context context, String str, String str2, String str3, C39067g gVar) {
        if (!C9431p.m18664a(str)) {
            m87770a(context, str.split(";"), str2, str3, gVar);
        }
    }

    /* renamed from: b */
    static void m87774b(Context context, String str, String str2, String str3, C39067g gVar) {
        C39452l.m87730a(gVar, "poi_call", C23089d.m56640a().mo47829a("enter_from", str3).mo47829a("shop_id", "").mo47829a("poi_type", gVar.getPoiType()).mo47829a("poi_id", gVar.getPoiId()).mo47829a("group_id", gVar.getAwemeId()).mo47829a("previous_page", gVar.getPreviousPage()).mo47829a("click_method", str2));
        context.startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null)));
    }

    /* renamed from: a */
    private static void m87770a(Context context, String[] strArr, String str, String str2, C39067g gVar) {
        if (strArr != null && strArr.length != 0) {
            C26891a aVar = new C26891a(context);
            C39463s sVar = new C39463s(context, strArr, str2, str, gVar);
            aVar.mo54844a((CharSequence[]) strArr, (OnClickListener) sVar);
            aVar.mo54845b();
        }
    }

    /* renamed from: a */
    public static void m87768a(Context context, PoiDetail poiDetail, String str, C39067g gVar, boolean z, String str2) {
        String[] strArr;
        String phone = poiDetail.getPhone();
        if (C9431p.m18664a(phone)) {
            strArr = new String[0];
        } else {
            strArr = phone.split(";");
        }
        if (strArr.length > 0) {
            C39443d.m87708c(context, C23324d.m57378a().getRawAdAwemeById(gVar.getAwemeId()), poiDetail.getPoiId());
            C39452l.m87730a(gVar, "poi_contact_method", C23089d.m56640a().mo47829a("enter_method", "show").mo47829a("previous_page", gVar.getPreviousPage()).mo47829a("poi_id", poiDetail.getPoiId()).mo47829a("content_type", "phone"));
        }
        ArrayList arrayList = new ArrayList();
        boolean isEnterprise = poiDetail.isEnterprise();
        if (isEnterprise) {
            arrayList.add(context.getString(R.string.d1o));
            C39452l.m87730a(gVar, "poi_contact_method", C23089d.m56640a().mo47829a("enter_method", "show").mo47829a("previous_page", gVar.getPreviousPage()).mo47829a("poi_id", poiDetail.getPoiId()).mo47829a("content_type", "message"));
        }
        arrayList.addAll(Arrays.asList(strArr));
        if (arrayList.size() != 0) {
            C26891a aVar = new C26891a(context);
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            C39464t tVar = new C39464t(isEnterprise, context, poiDetail, gVar, strArr2, str2, str);
            aVar.mo54844a((CharSequence[]) strArr2, (OnClickListener) tVar);
            aVar.mo54845b();
        }
    }
}
