package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.widget.LinearLayout;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2077b.C39325c;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.s */
public final class C39407s {

    /* renamed from: a */
    public static final C39407s f100794a = new C39407s();

    private C39407s() {
    }

    /* renamed from: a */
    public static final void m87632a(Context context, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bundle, "bundle");
    }

    /* renamed from: a */
    public static final void m87633a(Context context, List<Object> list, LinearLayout linearLayout) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(linearLayout, "poiServiceItemContainer");
    }

    /* renamed from: a */
    public static final Fragment m87631a(C39128l lVar) {
        C39325c cVar;
        C52711k.m112240b(lVar, "poiBundle");
        try {
            cVar = (C39325c) C39462r.m87765a(lVar, C39325c.class);
        } catch (Exception unused) {
            cVar = null;
        }
        return cVar;
    }
}
