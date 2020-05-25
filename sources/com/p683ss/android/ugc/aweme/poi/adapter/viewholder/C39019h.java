package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.poi.model.C39134r;
import com.p683ss.android.ugc.aweme.poi.utils.C39442c;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.h */
public final class C39019h {

    /* renamed from: a */
    public static final C39019h f99445a = new C39019h();

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.h$a */
    public static final class C39020a implements C23505g {

        /* renamed from: a */
        final /* synthetic */ Context f99446a;

        /* renamed from: b */
        final /* synthetic */ C39134r f99447b;

        /* renamed from: c */
        final /* synthetic */ String f99448c;

        /* renamed from: d */
        final /* synthetic */ String f99449d;

        /* renamed from: e */
        final /* synthetic */ String f99450e;

        /* renamed from: f */
        final /* synthetic */ String f99451f;

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo46279a() {
            Context context = this.f99446a;
            String a = C39019h.m86856a(this.f99446a, this.f99449d, this.f99450e, this.f99451f);
            String string = this.f99446a.getResources().getString(R.string.crx);
            C52711k.m112236a((Object) string, "it.resources.getString(R.string.poi_queue)");
            C39019h.m86857a(context, a, string);
        }

        C39020a(Context context, C39134r rVar, String str, String str2, String str3, String str4) {
            this.f99446a = context;
            this.f99447b = rVar;
            this.f99448c = str;
            this.f99449d = str2;
            this.f99450e = str3;
            this.f99451f = str4;
        }
    }

    private C39019h() {
    }

    /* renamed from: a */
    public static final void m86857a(Context context, String str, String str2) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(str2, "title");
        if (context != null) {
            Bundle bundle = new Bundle();
            bundle.putString("title", str2);
            bundle.putBoolean("hide_nav_bar", false);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("use_webview_title", false);
            bundle.putBoolean("show_closeall_and_back", true);
            C39460p.m87761a(context, str, bundle);
        }
    }

    /* renamed from: a */
    public static final String m86856a(Context context, String str, String str2, String str3) {
        C36282r a = C36286a.m81925a().mo75118a();
        String str4 = "";
        double[] dArr = new double[2];
        if (a != null && a.isValid() && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                dArr[0] = Double.parseDouble(str);
                dArr[1] = Double.parseDouble(str2);
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
            str4 = String.valueOf(C39442c.m87692a(dArr, new double[]{a.getLatitude(), a.getLongitude()}));
        }
        if (C52830p.m112456b((CharSequence) str3, (CharSequence) "?", false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append("&distance=");
            sb.append(str4);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append("?distance=");
        sb2.append(str4);
        return sb2.toString();
    }
}
