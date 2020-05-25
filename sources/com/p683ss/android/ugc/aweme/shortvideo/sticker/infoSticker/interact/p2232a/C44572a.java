package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.p2232a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.poi.IPOIService;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38950a;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.services.POIService;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a.a */
public class C44572a {

    /* renamed from: b */
    private static C44572a f112767b;

    /* renamed from: a */
    C38950a f112768a;

    /* renamed from: c */
    private long f112769c;

    /* renamed from: a */
    public static C44572a m97511a() {
        if (f112767b == null) {
            synchronized (C44572a.class) {
                f112767b = new C44572a();
            }
        }
        return f112767b;
    }

    /* renamed from: a */
    public final C44572a mo90503a(C38950a aVar) {
        this.f112768a = aVar;
        return this;
    }

    /* renamed from: a */
    public final void mo90504a(Activity activity) {
        if (System.currentTimeMillis() - this.f112769c >= 1000) {
            this.f112769c = System.currentTimeMillis();
            if (this.f112768a != null) {
                this.f112768a.mo74232a();
            }
            if (activity != null && !activity.isFinishing()) {
                IPOIService createIPOIServicebyMonsterPlugin = POIService.createIPOIServicebyMonsterPlugin();
                if (createIPOIServicebyMonsterPlugin != null) {
                    Dialog pOISearchDialog = createIPOIServicebyMonsterPlugin.getPOISearchDialog(activity, new Bundle(), new C44574b(this, activity));
                    pOISearchDialog.setOnDismissListener(new C44575c(this));
                    PoiServiceImpl.createIPoiServicebyMonsterPlugin().setNotShowNoMyLocation(pOISearchDialog, true);
                    pOISearchDialog.show();
                }
            }
        }
    }

    /* renamed from: a */
    static String m97512a(String str, Activity activity) {
        Map b = C39454n.f100872a.mo80415b(activity);
        String str2 = "";
        if (b == null || !b.containsKey(str)) {
            return str2;
        }
        return (String) b.get(str);
    }
}
