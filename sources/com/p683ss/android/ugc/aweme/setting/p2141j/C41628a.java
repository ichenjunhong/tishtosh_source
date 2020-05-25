package com.p683ss.android.ugc.aweme.setting.p2141j;

import android.content.Context;
import android.net.Uri;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ttve.utils.C20141b;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.setting.j.a */
public final class C41628a {

    /* renamed from: a */
    public static final C41628a f105362a = new C41628a();

    private C41628a() {
    }

    /* renamed from: a */
    public static final void m91503a(Context context, String str, Map<String, String> map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        boolean z6;
        boolean z7;
        boolean z8;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "originUrl");
        C52711k.m112240b(map, "params");
        String str3 = (String) map.get("anchor_type");
        String str4 = (String) map.get("shoot_way");
        String str5 = (String) map.get("creation_id");
        StringBuilder sb = new StringBuilder(str);
        boolean z9 = false;
        if (str3 == null) {
            str3 = "Wiki";
            String str6 = (String) map.get("title");
            String str7 = (String) map.get("close");
            CharSequence charSequence = str7;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || C52830p.m112406a(str7, "true", true)) {
                z3 = true;
            } else {
                z3 = false;
            }
            String str8 = (String) map.get("hide_nav_bar");
            CharSequence charSequence2 = str8;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || C52830p.m112406a(str8, "true", true)) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean a = C52830p.m112406a((String) map.get("back"), "true", true);
            boolean a2 = C52830p.m112406a((String) map.get("addButton"), "true", true);
            Uri parse = Uri.parse(str);
            C52711k.m112236a((Object) parse, "Uri.parse(originUrl)");
            if (parse.getQuery() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('&');
                str2 = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('?');
                str2 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder(str2);
            StringBuilder sb5 = new StringBuilder("addButton=");
            sb5.append(a2);
            sb4.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder("&back=");
            sb6.append(a);
            sb4.append(sb6.toString());
            StringBuilder sb7 = new StringBuilder("&close=");
            sb7.append(z3);
            sb4.append(sb7.toString());
            C52711k.m112236a((Object) sb4, "StringBuilder(if (Uri.pa…d(\"&$CLOSE=$enableClose\")");
            CharSequence charSequence3 = str6;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                StringBuilder sb8 = new StringBuilder("&title=");
                sb8.append(str6);
                sb4.append(sb8.toString());
            }
            CharSequence charSequence4 = str4;
            if (charSequence4 == null || charSequence4.length() == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                StringBuilder sb9 = new StringBuilder("&shoot_way=");
                sb9.append(str4);
                sb4.append(sb9.toString());
            }
            CharSequence charSequence5 = str5;
            if (charSequence5 == null || charSequence5.length() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                StringBuilder sb10 = new StringBuilder("&creation_id=");
                sb10.append(str5);
                sb4.append(sb10.toString());
            }
            if (z5) {
                StringBuilder sb11 = new StringBuilder("&hide_nav_bar=1&status_bar_height=");
                sb11.append(C20141b.m49700b(context, (float) C11065a.m22390a(context)));
                sb4.append(sb11.toString());
            } else {
                sb4.append("&hide_nav_bar=0&status_bar_height=0");
            }
            sb = sb4;
        }
        boolean a3 = C52830p.m112406a((String) map.get("show_keyboard"), "true", true);
        String str9 = "";
        String str10 = (String) map.get("host_filter");
        if (str10 != null && C52830p.m112406a(str10, "true", true)) {
            Uri parse2 = Uri.parse(str);
            C52711k.m112236a((Object) parse2, "Uri.parse(originUrl)");
            String host = parse2.getHost();
            if (host == null) {
                host = "";
            }
            str9 = host;
        }
        CharSequence charSequence6 = (CharSequence) map.get("disable_app_link");
        if (charSequence6 == null || charSequence6.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C52830p.m112406a((String) map.get("disable_app_link"), "true", true)) {
            z9 = true;
        }
        SmartRouter.buildRoute(context, "//wiki").withParam("url", sb.toString()).withParam("shoot_way", str4).withParam("creation_id", str5).withParam("show_keyboard", a3).withParam("anchor_type", str3).withParam("author_id", (String) map.get("author_id")).withParam("group_id", (String) map.get("group_id")).withParam("enter_from", (String) map.get("enter_from")).withParam("language", (String) map.get("language")).withParam("wiki_entry", (String) map.get("wiki_entry")).withParam("anchor_entry", (String) map.get("anchor_entry")).withParam("host_filter", str9).withParam("disable_app_link", z9).open();
    }
}
