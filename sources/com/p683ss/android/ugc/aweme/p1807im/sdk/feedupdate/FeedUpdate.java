package com.p683ss.android.ugc.aweme.p1807im.sdk.feedupdate;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate */
public class FeedUpdate {
    @C17952c(mo34828a = "cursor")
    long cursor;
    @C17952c(mo34828a = "data")
    public List<C34166d> items;
    @C17952c(mo34828a = "status_code")
    int statusCode;
    @C17952c(mo34828a = "status_msg")
    String statusMsg;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$a */
    class C34163a implements Serializable {
        @C17952c(mo34828a = "aweme_id")

        /* renamed from: a */
        String f88273a;
        @C17952c(mo34828a = "create_time")

        /* renamed from: b */
        long f88274b;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$b */
    class C34164b {
        @C17952c(mo34828a = "label_thumb")

        /* renamed from: a */
        public UrlModel f88275a;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$c */
    public class C34165c {
        @C17952c(mo34828a = "aweme_id")

        /* renamed from: a */
        public String f88276a;
        @C17952c(mo34828a = "create_time")

        /* renamed from: b */
        public long f88277b;
        @C17952c(mo34828a = "desc")

        /* renamed from: c */
        public String f88278c;
        @C17952c(mo34828a = "video")

        /* renamed from: d */
        public C34167e f88279d;
        @C17952c(mo34828a = "image_infos")

        /* renamed from: e */
        public List<C34164b> f88280e;
        @C17952c(mo34828a = "aweme_type")

        /* renamed from: f */
        public int f88281f;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$d */
    public class C34166d implements Serializable {
        @C17952c(mo34828a = "author_user_id")

        /* renamed from: a */
        long f88282a;
        @C17952c(mo34828a = "aweme_list")

        /* renamed from: b */
        List<C34163a> f88283b;
        @C17952c(mo34828a = "last_aweme_info")

        /* renamed from: c */
        C34165c f88284c;

        public final List<C34163a> getAwemeSubsets() {
            return this.f88283b;
        }

        public final C34165c getLastAweme() {
            return this.f88284c;
        }

        public final long getUid() {
            return this.f88282a;
        }

        public final void setAwemeSubsets(List<C34163a> list) {
            this.f88283b = list;
        }

        public final void setLastAweme(C34165c cVar) {
            this.f88284c = cVar;
        }

        public final void setUid(long j) {
            this.f88282a = j;
        }

        public C34166d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.feedupdate.FeedUpdate$e */
    class C34167e {
        @C17952c(mo34828a = "cover")

        /* renamed from: a */
        public UrlModel f88286a;
    }

    public long getCursor() {
        return this.cursor;
    }

    public List<C34166d> getItems() {
        return this.items;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMsg() {
        return this.statusMsg;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setItems(List<C34166d> list) {
        this.items = list;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
