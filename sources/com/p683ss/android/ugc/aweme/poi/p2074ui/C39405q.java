package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.q */
public final class C39405q extends Dialog {

    /* renamed from: a */
    public static String f100788a = "";

    /* renamed from: b */
    private boolean f100789b;

    /* renamed from: c */
    private C39067g f100790c;

    /* renamed from: d */
    private RemoteImageView f100791d;

    /* renamed from: e */
    private View f100792e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo80378a(String str) {
        String str2;
        C39067g gVar = this.f100790c;
        String str3 = "poi_puscene_success";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("previous_page", this.f100790c.getPreviousPage()).mo47829a("enter_method", str).mo47829a("poi_id", this.f100790c.getPoiId());
        String str4 = "content_type";
        if (this.f100789b) {
            str2 = "reserve";
        } else {
            str2 = "queue";
        }
        C39452l.m87730a(gVar, str3, a.mo47829a(str4, str2).mo47829a("poi_posititon", ""));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bmk);
        int i = 0;
        setCanceledOnTouchOutside(false);
        this.f100792e = findViewById(R.id.a5_);
        this.f100791d = (RemoteImageView) findViewById(R.id.a59);
        findViewById(R.id.a5a).setOnClickListener(new C39406r(this));
        C39454n nVar = C39454n.f100872a;
        String str = "poi_resource";
        String str2 = "imagePOIOrder.png";
        C52711k.m112240b(str, "channel");
        C52711k.m112240b(str2, "resName");
        String geckoRes = C39454n.m87738a().getGeckoRes(str, str2);
        boolean z = !TextUtils.isEmpty(geckoRes);
        C23088c a = C23088c.m56631a();
        a.mo47824a("action", "imagePOIOrder.png");
        String str3 = "success";
        if (z) {
            i = 1;
        }
        a.mo47822a(str3, Integer.valueOf(i));
        C23131p.m56692a("poi_log", "resource_preload_error_rate", a.mo47825b());
        if (TextUtils.isEmpty(geckoRes)) {
            this.f100792e.setVisibility(8);
        } else {
            C23515d.m57677a(this.f100791d, geckoRes);
        }
        mo80378a("show");
    }

    public C39405q(Activity activity, boolean z, C39067g gVar) {
        super(activity, R.style.a7i);
        this.f100789b = z;
        this.f100790c = gVar;
    }
}
