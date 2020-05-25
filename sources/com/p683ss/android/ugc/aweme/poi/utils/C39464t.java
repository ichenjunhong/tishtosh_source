package com.p683ss.android.ugc.aweme.poi.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.t */
final /* synthetic */ class C39464t implements OnClickListener {

    /* renamed from: a */
    private final boolean f100890a;

    /* renamed from: b */
    private final Context f100891b;

    /* renamed from: c */
    private final PoiDetail f100892c;

    /* renamed from: d */
    private final C39067g f100893d;

    /* renamed from: e */
    private final String[] f100894e;

    /* renamed from: f */
    private final String f100895f;

    /* renamed from: g */
    private final String f100896g;

    C39464t(boolean z, Context context, PoiDetail poiDetail, C39067g gVar, String[] strArr, String str, String str2) {
        this.f100890a = z;
        this.f100891b = context;
        this.f100892c = poiDetail;
        this.f100893d = gVar;
        this.f100894e = strArr;
        this.f100895f = str;
        this.f100896g = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f100890a;
        Context context = this.f100891b;
        PoiDetail poiDetail = this.f100892c;
        C39067g gVar = this.f100893d;
        String[] strArr = this.f100894e;
        String str = this.f100895f;
        String str2 = this.f100896g;
        if (i != 0 || !z) {
            C39452l.m87730a(gVar, "poi_contact_method", C23089d.m56640a().mo47829a("enter_method", "click").mo47829a("previous_page", gVar.getPreviousPage()).mo47829a("poi_id", poiDetail.getPoiId()).mo47829a("content_type", "phone"));
            C39462r.m87774b(context, strArr[i], str, str2, gVar);
        } else {
            if (poiDetail.isEnterprise()) {
                C39452l.m87730a(gVar, "poi_contact_method", C23089d.m56640a().mo47829a("enter_method", "click").mo47829a("previous_page", gVar.getPreviousPage()).mo47829a("poi_id", poiDetail.getPoiId()).mo47829a("content_type", "message"));
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66722a((Activity) context, "poi_page", "click_chat_button", (C23505g) new C39465u(context, poiDetail));
                } else {
                    C39462r.m87766a(context, poiDetail);
                }
            }
        }
    }
}
