package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39053b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39405q;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39307c.C39308a;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b */
public final class C39303b extends Dialog {

    /* renamed from: a */
    public C25687b f100480a;

    /* renamed from: b */
    public boolean f100481b;

    /* renamed from: c */
    public String f100482c;

    /* renamed from: d */
    public final boolean f100483d;

    /* renamed from: e */
    public final C39067g f100484e;

    /* renamed from: f */
    public final C39308a f100485f;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b$a */
    static final class C39304a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39303b f100486a;

        C39304a(C39303b bVar) {
            this.f100486a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f100486a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b$b */
    static final class C39305b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39303b f100487a;

        C39305b(C39303b bVar) {
            this.f100487a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f100487a.f100481b && !TextUtils.isEmpty(this.f100487a.f100482c)) {
                C39405q.f100788a = "coupon_toast";
                C39303b bVar = this.f100487a;
                String str = this.f100487a.f100482c;
                if (str == null) {
                    C52711k.m112234a();
                }
                Context context = this.f100487a.getContext();
                C52711k.m112236a((Object) context, "context");
                String string = context.getResources().getString(R.string.csp);
                C52711k.m112236a((Object) string, "context.resources.getString(R.string.poi_reserve)");
                Bundle bundle = new Bundle();
                bundle.putString("title", string);
                bundle.putBoolean("hide_nav_bar", false);
                bundle.putBoolean("hide_status_bar", false);
                bundle.putBoolean("use_webview_title", false);
                bundle.putBoolean("show_closeall", true);
                C39460p.m87761a(bVar.getContext(), str, bundle);
                C39053b.m86889a("click", "reserve", "poi_page", "coupon_toast", this.f100487a.f100484e, null);
                this.f100487a.mo80125a("click_reserve");
            } else if (this.f100487a.f100483d) {
                this.f100487a.mo80125a("click_share_friend");
                C39308a aVar = this.f100487a.f100485f;
                if (aVar != null) {
                    aVar.mo80013E();
                }
            } else {
                this.f100487a.mo80125a("click_first_ok");
            }
            this.f100487a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.b$c */
    static final class C39306c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39303b f100488a;

        C39306c(C39303b bVar) {
            this.f100488a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f100488a.f100480a != null) {
                this.f100488a.mo80125a("click_first_look");
                C39452l.m87730a(this.f100488a.f100484e, "enter_card_bag", C23089d.m56640a().mo47829a("enter_from", "poi_page"));
                SmartRouter.buildRoute(this.f100488a.getContext(), "//coupon").withParam("is_coupon_valid", true).open();
            }
            this.f100488a.dismiss();
        }
    }

    public final void show() {
        super.show();
        if (this.f100481b) {
            m87377b("click_reserve");
        } else if (this.f100483d) {
            m87377b("click_first_coupon_share_friend");
        } else {
            m87377b("click_first_coupon");
        }
    }

    /* renamed from: b */
    private final void m87377b(String str) {
        String str2;
        C39067g gVar = this.f100484e;
        String str3 = "show_coupon_toast";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", str);
        String str4 = "coupon_id";
        C25687b bVar = this.f100480a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        C23089d a2 = a.mo47826a(str4, bVar.getCouponId());
        String str5 = "poi_id";
        C39067g gVar2 = this.f100484e;
        if (gVar2 != null) {
            str2 = gVar2.getPoiId();
        } else {
            str2 = null;
        }
        C39452l.m87730a(gVar, str3, a2.mo47829a(str5, str2));
    }

    /* renamed from: a */
    public final void mo80125a(String str) {
        String str2;
        C39067g gVar = this.f100484e;
        String str3 = "click_coupon_toast";
        C23089d a = C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", str);
        String str4 = "coupon_id";
        C25687b bVar = this.f100480a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        C23089d a2 = a.mo47826a(str4, bVar.getCouponId());
        String str5 = "poi_id";
        C39067g gVar2 = this.f100484e;
        if (gVar2 != null) {
            str2 = gVar2.getPoiId();
        } else {
            str2 = null;
        }
        C39452l.m87730a(gVar, str3, a2.mo47829a(str5, str2));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bmp);
        setCanceledOnTouchOutside(false);
        C25687b bVar = this.f100480a;
        if (bVar != null) {
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.a21);
            C52711k.m112236a((Object) dmtTextView, "coupon_valid_date");
            Context context = getContext();
            C52711k.m112236a((Object) context, "context");
            String string = context.getResources().getString(R.string.ak5);
            C52711k.m112236a((Object) string, "context.resources.getStr…oupon_valid_start_to_end)");
            String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{bVar.getValidStart(), bVar.getValidEnd()}, 2));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            dmtTextView.setText(a);
            if (this.f100481b) {
                ((DmtTextView) findViewById(R.id.bud)).setText(R.string.cro);
                DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.am5);
                C52711k.m112236a((Object) dmtTextView2, "go_coupon_detail");
                dmtTextView2.setVisibility(8);
            } else {
                if (this.f100483d) {
                    ((DmtTextView) findViewById(R.id.bud)).setText(R.string.ajy);
                } else {
                    ((DmtTextView) findViewById(R.id.bud)).setText(R.string.f7q);
                }
                DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.am5);
                C52711k.m112236a((Object) dmtTextView3, "go_coupon_detail");
                dmtTextView3.setVisibility(0);
            }
        }
        ((ImageView) findViewById(R.id.ue)).setOnClickListener(new C39304a(this));
        ((DmtTextView) findViewById(R.id.bud)).setOnClickListener(new C39305b(this));
        ((DmtTextView) findViewById(R.id.am5)).setOnClickListener(new C39306c(this));
    }

    public C39303b(Context context, C25687b bVar, boolean z, String str, boolean z2, C39067g gVar, C39308a aVar) {
        C52711k.m112240b(context, "context");
        super(context, R.style.a70);
        this.f100480a = bVar;
        this.f100481b = z;
        this.f100482c = str;
        this.f100483d = z2;
        this.f100484e = gVar;
        this.f100485f = aVar;
    }
}
