package com.p683ss.android.ugc.aweme.favorites.api.notice;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNotice */
public class CollectionNotice implements Serializable {
    public static final int MIX_TYPE = 1;
    @C17952c(mo34828a = "collect_notice")
    public ArrayList<C29681a> collectNoticeList;
    @C17952c(mo34828a = "status_code")
    public int statusCode;
    @C17952c(mo34828a = "status_msg")
    public String statusMsg;

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.notice.CollectionNotice$a */
    static class C29681a implements Serializable {
        @C17952c(mo34828a = "type")

        /* renamed from: a */
        public int f77587a;
        @C17952c(mo34828a = "status")

        /* renamed from: b */
        public boolean f77588b;

        C29681a() {
        }
    }

    public boolean getMixStatus() {
        if (this.collectNoticeList == null) {
            return false;
        }
        for (int i = 0; i < this.collectNoticeList.size(); i++) {
            C29681a aVar = (C29681a) this.collectNoticeList.get(i);
            if (aVar.f77587a == 1) {
                return aVar.f77588b;
            }
        }
        return false;
    }
}
