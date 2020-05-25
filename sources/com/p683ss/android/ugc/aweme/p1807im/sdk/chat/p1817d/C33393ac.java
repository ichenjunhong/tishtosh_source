package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.p702im.core.p706c.C11207p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.ac */
public class C33393ac extends C33392ab {
    /* renamed from: a */
    public static String m76551a(C11207p pVar) {
        if (pVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("upload");
        sb.append(pVar.getIndex());
        sb.append("_");
        sb.append(pVar.getUuid());
        return sb.toString();
    }
}
