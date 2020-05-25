package com.p683ss.android.ugc.playerkit;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.b */
public final class C50105b {
    /* renamed from: a */
    public static boolean m108062a(C50116c cVar) {
        if (!C50109a.m108068s().mo95423d()) {
            return false;
        }
        if (C50116c.TT.equals(cVar) || C50116c.TT_HARDWARE.equals(cVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m108061a(UrlModel urlModel) {
        if (urlModel == null) {
            return false;
        }
        List urlList = urlModel.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            return false;
        }
        Iterator it = urlList.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty((String) it.next())) {
                it.remove();
            }
        }
        if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m108063a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
