package com.p683ss.android.ugc.aweme.poi.preview;

import android.content.Context;
import android.support.p030v4.view.ViewPager;
import android.support.p043v7.widget.RecyclerView;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39168b;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39170c;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2069a.C39161a;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.p2070b.C39169a;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39181e;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39181e.C39182a;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39181e.C39183b;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39194h;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.b */
public final class C39159b {

    /* renamed from: a */
    protected C39181e f99894a;

    /* renamed from: b */
    protected C39194h f99895b;

    /* renamed from: a */
    public static C39159b m87005a() {
        return new C39159b();
    }

    /* renamed from: b */
    public static int m87006b() {
        try {
            int intValue = C32816h.m75716b().getPoiSetting().getMaxPicSize().intValue();
            if (intValue >= 0) {
                return intValue;
            }
            return 2000;
        } catch (C10174a unused) {
            return 2000;
        }
    }

    /* renamed from: a */
    public final void mo79801a(String str, int i, int i2) {
        if (i >= i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"tag\":");
            sb.append(str);
            sb.append(",\"position\":");
            sb.append(i);
            sb.append(",\"size\":");
            sb.append(i2);
            sb.append("}");
            C23131p.m56692a("poi_log", "", C23088c.m56631a().mo47824a("service", "preview").mo47824a("status", sb.toString()).mo47825b());
            i = i2 - 1;
        } else if (i < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"tag\":");
            sb2.append(str);
            sb2.append(",\"position\":");
            sb2.append(i);
            sb2.append(",\"size\":");
            sb2.append(i2);
            sb2.append("}");
            C23131p.m56692a("poi_log", "", C23088c.m56631a().mo47824a("service", "preview").mo47824a("status", sb2.toString()).mo47825b());
            i = 0;
        }
        this.f99894a.f99935a = i;
        this.f99894a.f99942h = i2;
        this.f99895b.mo79874a(this.f99894a).mo79875b();
    }

    /* renamed from: a */
    public final void mo79800a(Context context, List<String> list, List<String> list2, List<String> list3, boolean z, C39183b bVar, boolean z2, boolean z3) {
        C39182a b = C39181e.m87057a().mo79841b(list).mo79836a(list2).mo79844c(list3).mo79833a((C39170c) new C39169a()).mo79832a((C39168b) new C39161a()).mo79837a(true).mo79839b(-16777216).mo79831a((int) R.color.z7).mo79842b(true);
        b.f99969f = z;
        b.f99970g = null;
        this.f99894a = b.mo79845c(z2).mo79846d(z3).mo79838a();
        this.f99895b = C39194h.m87103a(context);
    }

    /* renamed from: a */
    public final void mo79798a(Context context, List<String> list, List<String> list2, ViewPager viewPager, int i, int i2, String str, HashMap<String, String> hashMap, boolean z, boolean z2) {
        C39182a a = C39181e.m87057a().mo79841b(list).mo79836a(list2).mo79833a((C39170c) new C39169a()).mo79832a((C39168b) new C39161a()).mo79837a(true);
        a.f99966c = viewPager;
        a.f99967d = i;
        this.f99894a = a.mo79843c((int) R.id.ci1).mo79834a(str).mo79835a(hashMap).mo79839b(-16777216).mo79831a((int) R.color.z7).mo79842b(true).mo79840b("top_pic").mo79845c(true).mo79846d(true).mo79838a();
        this.f99895b = C39194h.m87103a(context);
    }

    /* renamed from: a */
    public final void mo79799a(Context context, List<String> list, List<String> list2, List<String> list3, RecyclerView recyclerView, int i, String str, String str2, HashMap<String, String> hashMap, boolean z, boolean z2) {
        C39182a a = C39181e.m87057a().mo79841b(list).mo79836a(list2).mo79844c(list3).mo79833a((C39170c) new C39169a()).mo79832a((C39168b) new C39161a()).mo79837a(true);
        a.f99965b = recyclerView;
        this.f99894a = a.mo79843c((int) R.id.c0t).mo79834a(str).mo79835a(hashMap).mo79839b(-16777216).mo79831a((int) R.color.z7).mo79842b(true).mo79840b(str2).mo79845c(true).mo79846d(true).mo79838a();
        this.f99895b = C39194h.m87103a(context);
    }
}
