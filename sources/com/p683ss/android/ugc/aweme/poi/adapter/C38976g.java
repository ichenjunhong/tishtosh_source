package com.p683ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39093g;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41312z;
import java.io.Serializable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.g */
public final class C38976g {

    /* renamed from: a */
    public String f99270a;

    /* renamed from: b */
    public int f99271b;

    /* renamed from: c */
    public String f99272c;

    /* renamed from: d */
    private C39067g f99273d;

    /* renamed from: a */
    private final void m86810a(C39092f fVar) {
        C39093g classOption = fVar.getClassOption();
        C52711k.m112236a((Object) classOption, "struct.classOption");
        C39452l.m87730a(this.f99273d, "enter_poi_leaderboard", C23089d.m56640a().mo47829a("enter_from", this.f99270a).mo47829a("city_info", C23198ae.m56845a()).mo47829a("enter_method", "click_leaderboard_banner").mo47829a("poi_channel", this.f99272c).mo47829a("sub_class", classOption.getName()).mo47829a("district_code", fVar.getDistrictCode()));
    }

    /* renamed from: b */
    private final void m86812b(C39092f fVar) {
        CharSequence charSequence;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f99270a).mo47829a("enter_method", "click_poi_banner").mo47829a("banner_id", fVar.getBid());
        String str = "tag_id";
        String schema = fVar.getSchema();
        C52711k.m112236a((Object) schema, "struct.schema");
        String schema2 = fVar.getSchema();
        C52711k.m112236a((Object) schema2, "struct.schema");
        int b = C52830p.m112444b((CharSequence) schema2, '/', 0, false, 6, (Object) null) + 1;
        if (schema != null) {
            String substring = schema.substring(b);
            C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            C23089d a2 = a.mo47829a(str, substring).mo47829a("poi_channel", this.f99272c).mo47829a("city_info", C23198ae.m56845a());
            C39067g gVar = this.f99273d;
            String str2 = null;
            if (gVar != null) {
                charSequence = gVar.getPoiId();
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                String str3 = "from_poi_id";
                C39067g gVar2 = this.f99273d;
                if (gVar2 != null) {
                    str2 = gVar2.getPoiId();
                }
                a2.mo47829a(str3, str2);
            }
            C39452l.m87730a(this.f99273d, "enter_tag_detail", a2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final void m86811a(C39092f fVar, int i) {
        CharSequence charSequence;
        C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f99270a).mo47829a("previous_page", this.f99270a).mo47829a("banner_id", fVar.getBid()).mo47826a("client_order", i).mo47829a("city_info", C23198ae.m56845a()).mo47829a("poi_channel", this.f99272c);
        C39067g gVar = this.f99273d;
        String str = null;
        if (gVar != null) {
            charSequence = gVar.getPoiId();
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            String str2 = "from_poi_id";
            C39067g gVar2 = this.f99273d;
            if (gVar2 != null) {
                str = gVar2.getPoiId();
            }
            a.mo47829a(str2, str);
        }
        C39452l.m87730a(this.f99273d, "banner_click", a);
    }

    /* renamed from: a */
    public final void mo79131a(Context context, C39092f fVar, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fVar, "struct");
        m86811a(fVar, i);
        if (TextUtils.isEmpty(fVar.getSchema())) {
            m86810a(fVar);
            Bundle bundle = new Bundle();
            bundle.putString("backend_type_code", this.f99272c);
            bundle.putString("enter_from", "categorized_city_poi");
            bundle.putString("enter_method", "click_leaderboard_banner");
            bundle.putString("district_code", fVar.getDistrictCode());
            SmartRouter.buildRoute(context, "//poi/city/rank").withParam(bundle).open();
            return;
        }
        String str = null;
        if (C41312z.m91071a("aweme://poi/detail/:id", fVar.getSchema())) {
            C39129m mVar = new C39129m();
            String schema = fVar.getSchema();
            C52711k.m112236a((Object) schema, "struct.schema");
            String schema2 = fVar.getSchema();
            C52711k.m112236a((Object) schema2, "struct.schema");
            int b = C52830p.m112444b((CharSequence) schema2, '/', 0, false, 6, (Object) null) + 1;
            if (schema != null) {
                String substring = schema.substring(b);
                C52711k.m112236a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                C39129m o = mVar.mo79718a(substring).mo79716a(this.f99273d).mo79726h(this.f99270a).mo79729k("click_poi_banner").mo79730l(this.f99272c).mo79733o(fVar.getBid());
                C39067g gVar = this.f99273d;
                if (gVar != null) {
                    str = gVar.getPoiId();
                }
                SmartRouter.buildRoute(context, "//poi/detail").withParam("poi_bundle", (Serializable) o.mo79734p(str).mo79713a()).open();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type java.lang.String");
        }
        String schema3 = fVar.getSchema();
        C52711k.m112236a((Object) schema3, "struct.schema");
        if (C52830p.m112456b((CharSequence) schema3, (CharSequence) "poi/detail", false, 2, (Object) null)) {
            C39129m o2 = new C39129m().mo79718a(C41312z.m91072b(fVar.getSchema(), "id")).mo79716a(this.f99273d).mo79726h(this.f99270a).mo79729k("click_poi_banner").mo79730l(this.f99272c).mo79733o(fVar.getBid());
            C39067g gVar2 = this.f99273d;
            if (gVar2 != null) {
                str = gVar2.getPoiId();
            }
            SmartRouter.buildRoute(context, "//poi/detail").withParam("poi_bundle", (Serializable) o2.mo79734p(str).mo79713a()).open();
            return;
        }
        String schema4 = fVar.getSchema();
        C52711k.m112236a((Object) schema4, "struct.schema");
        if (C52830p.m112411b(schema4, WebKitApi.SCHEME_HTTP, false, 2, null)) {
            String schema5 = fVar.getSchema();
            C52711k.m112236a((Object) schema5, "struct.schema");
            if (!C52830p.m112456b((CharSequence) schema5, (CharSequence) "title=", false, 2, (Object) null)) {
                String schema6 = fVar.getSchema();
                C52711k.m112236a((Object) schema6, "struct.schema");
                if (C52830p.m112419a((CharSequence) schema6, "?", 0, false, 6, (Object) null) != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(fVar.getSchema());
                    sb.append("&title=");
                    sb.append(fVar.getTitle());
                    fVar.updateSchema(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(fVar.getSchema());
                    sb2.append("?title=");
                    sb2.append(fVar.getTitle());
                    fVar.updateSchema(sb2.toString());
                }
            }
            StringBuilder sb3 = new StringBuilder("aweme://webview/?url=");
            sb3.append(Uri.encode(fVar.getSchema()));
            C41302w.m91042a().mo83861a(sb3.toString());
            return;
        }
        C41302w.m91042a().mo83861a(fVar.getSchema());
        if (C41312z.m91071a("aweme://challenge/detail/:id", fVar.getSchema())) {
            m86812b(fVar);
        }
    }

    public C38976g(C39067g gVar, String str, int i, String str2) {
        C52711k.m112240b(str, "fromPage");
        this.f99273d = gVar;
        this.f99270a = str;
        this.f99271b = i;
        this.f99272c = str2;
    }
}
