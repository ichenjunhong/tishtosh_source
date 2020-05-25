package com.p683ss.android.ugc.aweme;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.p1437bj.C23836d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.IFestivalService;
import com.p683ss.android.ugc.aweme.shortvideo.C43301dw;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.p683ss.android.ugc.aweme.watermark.C48234c;
import com.p683ss.android.ugc.aweme.watermark.C48235d.C48236a;
import com.p683ss.android.ugc.aweme.watermark.C48237e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.y */
public final class C27988y {
    /* renamed from: a */
    public static final C23836d m66753a() {
        return new C23836d(true);
    }

    /* renamed from: a */
    public static final String[] m66754a(C22055c cVar, int i, int i2, int i3, boolean z, String str) {
        String a;
        boolean z2;
        String str2;
        C52711k.m112240b(str, "filePrefix");
        C48236a aVar = new C48236a();
        IFestivalService createIFestivalServicebyMonsterPlugin = FestivalService.createIFestivalServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIFestivalServicebyMonsterPlugin, "ServiceManager.get().get…tivalService::class.java)");
        String waterPicDir = createIFestivalServicebyMonsterPlugin.getWaterPicDir();
        C52711k.m112236a((Object) waterPicDir, "ServiceManager.get().get…::class.java).waterPicDir");
        aVar.mo95727a(waterPicDir);
        if (cVar == null) {
            a = "";
        } else if (TextUtils.isEmpty(cVar.mo46157a())) {
            a = cVar.mo46158b();
        } else {
            a = cVar.mo46157a();
        }
        String str3 = a;
        if (cVar == null || !TextUtils.equals(C39618d.f101183x.mo74283c(), cVar.mo46159c())) {
            z2 = false;
        } else {
            z2 = true;
        }
        C48234c[] a2 = C48237e.m104489a(i, i2, str3, z2, C43301dw.m94963a(i3), z, aVar.mo95728a());
        String str4 = C43308eb.f109498k;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (z) {
            str2 = "_leftalign";
        } else {
            str2 = "_rightalign";
        }
        sb.append(str2);
        String[] a3 = C48237e.m104491a(a2, str4, sb.toString());
        C52711k.m112236a((Object) a3, "I18nWaterMarkImageHelper…e(filePrefix, leftAlign))");
        return a3;
    }
}
