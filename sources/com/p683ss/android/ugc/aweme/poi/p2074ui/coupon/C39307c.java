package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c */
public final class C39307c extends Dialog {

    /* renamed from: a */
    public final String f100489a;

    /* renamed from: b */
    public final C39067g f100490b;

    /* renamed from: c */
    public final C39308a f100491c;

    /* renamed from: d */
    private final String f100492d;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c$a */
    public interface C39308a {
        /* renamed from: E */
        void mo80013E();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c$b */
    static final class C39309b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39307c f100493a;

        C39309b(C39307c cVar) {
            this.f100493a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f100493a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.c$c */
    static final class C39310c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39307c f100494a;

        C39310c(C39307c cVar) {
            this.f100494a = cVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C39067g gVar = this.f100494a.f100490b;
            String str2 = "click_coupon_toast";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "click_share_friend").mo47829a("coupon_id", this.f100494a.f100489a);
            String str3 = "poi_id";
            C39067g gVar2 = this.f100494a.f100490b;
            if (gVar2 != null) {
                str = gVar2.getPoiId();
            } else {
                str = null;
            }
            C39452l.m87730a(gVar, str2, a.mo47829a(str3, str));
            C39308a aVar = this.f100494a.f100491c;
            if (aVar != null) {
                aVar.mo80013E();
            }
            this.f100494a.dismiss();
        }
    }

    public final void show() {
        String str;
        super.show();
        C39067g gVar = this.f100490b;
        String str2 = "show_coupon_toast";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", "share_friend").mo47829a("coupon_id", this.f100489a);
        String str3 = "poi_id";
        C39067g gVar2 = this.f100490b;
        if (gVar2 != null) {
            str = gVar2.getPoiId();
        } else {
            str = null;
        }
        C39452l.m87730a(gVar, str2, a.mo47829a(str3, str));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bmn);
        setCanceledOnTouchOutside(false);
        String str = this.f100492d;
        if (str != null) {
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.cn0);
            C52711k.m112236a((Object) dmtTextView, "share_content");
            dmtTextView.setText(str);
        }
        ((ImageView) findViewById(R.id.ue)).setOnClickListener(new C39309b(this));
        ((DmtTextView) findViewById(R.id.bud)).setOnClickListener(new C39310c(this));
    }

    public C39307c(Context context, String str, String str2, C39067g gVar, C39308a aVar) {
        C52711k.m112240b(context, "context");
        super(context, R.style.a70);
        this.f100492d = str;
        this.f100489a = str2;
        this.f100490b = gVar;
        this.f100491c = aVar;
    }
}
