package com.p683ss.android.ugc.aweme.commerce.p1530b;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.p879t.p881b.C13233a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48675k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.b.g */
public final class C25503g {
    /* renamed from: e */
    private static C13233a m62037e(Aweme aweme) {
        return C26471cd.m64025f(aweme);
    }

    /* renamed from: a */
    public static String m62031a(Aweme aweme) {
        if (!m62038f(aweme)) {
            return "";
        }
        return m62037e(aweme).javascriptResource;
    }

    /* renamed from: b */
    public static String m62033b(Aweme aweme) {
        if (!m62038f(aweme)) {
            return "";
        }
        return m62037e(aweme).vender;
    }

    /* renamed from: c */
    public static String m62035c(Aweme aweme) {
        if (!m62038f(aweme)) {
            return "";
        }
        return m62037e(aweme).verificationParameters;
    }

    /* renamed from: d */
    public static String m62036d(Aweme aweme) {
        StringBuilder sb = new StringBuilder();
        sb.append(m62031a(aweme));
        sb.append(m62033b(aweme));
        sb.append(m62035c(aweme));
        return C48675k.m105342a(sb.toString());
    }

    /* renamed from: f */
    private static boolean m62038f(Aweme aweme) {
        if (!C26512f.m64061d(aweme) || aweme.getAwemeRawAd().getOmVast() == null || m62037e(aweme) == null || C26471cd.m64025f(aweme) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m62034b(View view, int i, int i2) {
        if (((float) view.getHeight()) <= ((float) i) * 0.8f || ((float) view.getWidth()) <= ((float) i2) * 0.8f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<View> m62032a(View view, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (m62034b(view, i, i2)) {
            arrayList.add(view);
        }
        if (!(view instanceof ViewGroup)) {
            return arrayList;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if (m62034b(view, i, i2)) {
                arrayList.add(childAt);
            }
            arrayList.addAll(m62032a(childAt, i, i2));
        }
        return arrayList;
    }
}
