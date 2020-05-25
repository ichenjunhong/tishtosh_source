package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34791a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.d */
public final class C35009d extends C34791a {
    /* renamed from: a */
    public final String mo72908a(IMContact iMContact) {
        IMUser a = C34010e.m77749a(iMContact);
        if (a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(a.getUniqueId());
        return sb.toString();
    }
}
