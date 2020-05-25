package com.p683ss.android.ugc.aweme.poi.p2061d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.poi.model.C39096ab;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;
import com.p683ss.android.ugc.aweme.poi.widget.TextAppendViewLayout;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.d.b */
public final class C39061b {

    /* renamed from: a */
    public LinearLayout f99611a;

    /* renamed from: b */
    public DmtTextView f99612b;

    /* renamed from: c */
    public final Context f99613c;

    /* renamed from: d */
    public PoiDetail f99614d;

    /* renamed from: com.ss.android.ugc.aweme.poi.d.b$a */
    public static final class C39062a extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C39061b f99615a;

        /* renamed from: b */
        final /* synthetic */ C39096ab f99616b;

        /* renamed from: a */
        public final void mo59929a(View view) {
            C52711k.m112240b(view, "v");
            String contentUrl = this.f99616b.getContentUrl();
            if (!TextUtils.isEmpty(contentUrl)) {
                C39460p.m87762a(this.f99615a.f99613c, contentUrl, "poi_page");
                this.f99615a.mo79221a("mini_g_city_click");
            }
        }

        public C39062a(C39061b bVar, C39096ab abVar) {
            this.f99615a = bVar;
            this.f99616b = abVar;
        }
    }

    /* renamed from: a */
    public final void mo79221a(String str) {
        C39452l.m87731a(this.f99614d, str, new C23089d().mo47829a("enter_from", "poi_page").mo47829a("poi_id", this.f99614d.getPoiId()));
    }

    public C39061b(PoiDetail poiDetail, TextAppendViewLayout textAppendViewLayout) {
        C52711k.m112240b(poiDetail, "poiDetail");
        C52711k.m112240b(textAppendViewLayout, "newLineLayout");
        this.f99614d = poiDetail;
        LinearLayout linearLayout = (LinearLayout) textAppendViewLayout.mo80466a(R.id.e1s);
        C52711k.m112236a((Object) linearLayout, "newLineLayout.city_window_layout");
        this.f99611a = linearLayout;
        DmtTextView dmtTextView = (DmtTextView) textAppendViewLayout.mo80466a(R.id.e1t);
        C52711k.m112236a((Object) dmtTextView, "newLineLayout.city_window_name");
        this.f99612b = dmtTextView;
        Context context = textAppendViewLayout.getContext();
        C52711k.m112236a((Object) context, "newLineLayout.context");
        this.f99613c = context;
    }
}
