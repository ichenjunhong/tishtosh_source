package com.p683ss.android.ugc.aweme.discover.api;

import com.bytedance.retrofit2.p831b.C12702d;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0013i;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.CommentApi */
public final class CommentApi {

    /* renamed from: a */
    public static final IRetrofit f73685a = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.CommentApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "/aweme/v2/comment/list/")
        C0013i<CommentItemList> fetchCommentListV2(@C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "insert_ids") String str2, @C53089t(mo110619a = "address_book_access") Integer num, @C53089t(mo110619a = "gps_access") Integer num2, @C53089t(mo110619a = "forward_page_type") int i2, @C53089t(mo110619a = "ad_creative_id") Long l, @C53089t(mo110619a = "channel_id") int i3, @C53089t(mo110619a = "city") String str3, @C12702d Object obj);
    }
}
