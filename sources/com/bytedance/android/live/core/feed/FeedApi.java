package com.bytedance.android.live.core.feed;

import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import p064c.p065a.C2201v;

public interface FeedApi {
    @C12706h
    C2201v<C4172a<FeedItem, C2974a>> feed(@C12699af String str, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "req_from") String str2);

    @C12706h
    C2201v<C4172a<FeedItem, C2974a>> feed(@C12699af String str, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "req_from") String str2, @C12724z(mo23894a = "is_draw") long j2, @C12724z(mo23894a = "draw_room_id") long j3);

    @C12706h
    C2201v<C4172a<FeedItem, C2974a>> feed(@C12699af String str, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "req_from") String str2, @C12724z(mo23894a = "is_draw") long j2, @C12724z(mo23894a = "draw_room_id") long j3, @C12724z(mo23894a = "draw_room_owner_id") long j4);

    @C12706h
    C2201v<C4176c<FeedItem>> feedAfter(@C12699af String str, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "min_time") long j2, @C12724z(mo23894a = "offset") long j3, @C12724z(mo23894a = "count") long j4, @C12724z(mo23894a = "req_from") String str2, @C12724z(mo23894a = "hb_info") String str3, @C12724z(mo23894a = "gaid") String str4, @C12724z(mo23894a = "ad_user_agent") String str5);

    @C12706h
    C2201v<C4176c<FeedItem>> feedAfter(@C12699af String str, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "offset") long j2, @C12724z(mo23894a = "count") long j3, @C12724z(mo23894a = "req_from") String str2, @C12724z(mo23894a = "diff_stream") Integer num, @C12724z(mo23894a = "hb_info") String str3, @C12724z(mo23894a = "gaid") String str4, @C12724z(mo23894a = "ad_user_agent") String str5);

    @C12706h
    C2201v<C4176c<FeedItem>> feedAfter(@C12699af String str, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "offset") long j2, @C12724z(mo23894a = "count") long j3, @C12724z(mo23894a = "req_from") String str2, @C12724z(mo23894a = "hb_info") String str3, @C12724z(mo23894a = "gaid") String str4, @C12724z(mo23894a = "ad_user_agent") String str5);

    @C12706h
    C2201v<C4176c<FeedItem>> feedInitial(@C12699af String str, @C12724z(mo23894a = "min_time") long j, @C12724z(mo23894a = "offset") long j2, @C12724z(mo23894a = "count") long j3, @C12724z(mo23894a = "req_from") String str2, @C12724z(mo23894a = "push_item_id") long j4, @C12724z(mo23894a = "hb_info") String str3, @C12724z(mo23894a = "gaid") String str4, @C12724z(mo23894a = "ad_user_agent") String str5);

    @C12706h
    C2201v<C4176c<FeedItem>> feedInitial(@C12699af String str, @C12724z(mo23894a = "min_time") long j, @C12724z(mo23894a = "offset") long j2, @C12724z(mo23894a = "count") long j3, @C12724z(mo23894a = "req_from") String str2, @C12724z(mo23894a = "diff_stream") Integer num, @C12724z(mo23894a = "hb_info") String str3, @C12724z(mo23894a = "gaid") String str4, @C12724z(mo23894a = "ad_user_agent") String str5);

    @C12706h
    C2201v<C4172a<FeedItem, C2974a>> newFeed(@C12699af String str, @C12724z(mo23894a = "max_time") long j, @C12724z(mo23894a = "req_from") String str2, @C12724z(mo23894a = "offset") long j2);
}
