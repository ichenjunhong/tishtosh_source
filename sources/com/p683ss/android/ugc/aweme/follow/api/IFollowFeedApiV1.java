package com.p683ss.android.ugc.aweme.follow.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1 */
public interface IFollowFeedApiV1 {
    @C53084o(mo110612a = "/aweme/v1/follow/feed/")
    @C53074e
    C17832m<FollowFeedList> getFollowFeedList(@C53072c(mo110600a = "max_cursor") long j, @C53072c(mo110600a = "min_cursor") long j2, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "pull_type") int i2, @C53072c(mo110600a = "feed_style") int i3, @C53072c(mo110600a = "enter_time") long j3, @C53072c(mo110600a = "fetch_recommend") int i4, @C53072c(mo110600a = "impression_ids") String str, @C53072c(mo110600a = "last_feed_ids") String str2, @C53072c(mo110600a = "rec_impr_users") String str3, @C53072c(mo110600a = "is_up_phone") int i5, @C53072c(mo110600a = "is_recommend") int i6, @C53072c(mo110600a = "aweme_id") String str4, @C53072c(mo110600a = "aweme_ids") String str5, @C53072c(mo110600a = "push_params") String str6, @C53072c(mo110600a = "address_book_access") int i7, @C53072c(mo110600a = "gps_access") int i8, @C53072c(mo110600a = "last_follow_uid") String str7, @C53072c(mo110600a = "filter_strategy") int i9, @C53072c(mo110600a = "notice_is_display_live") Integer num, @C53072c(mo110600a = "notice_count_log_id") String str8, @C53072c(mo110600a = "notice_item_count") Integer num2, @C53072c(mo110600a = "notice_live_count") Integer num3, @C53072c(mo110600a = "notice_count_type") Integer num4, @C53072c(mo110600a = "notice_link_author_id") Long l, @C53072c(mo110600a = "notice_link_item_id") Long l2);

    @C53084o(mo110612a = "/aweme/v1/friend/feed/")
    @C53074e
    C17832m<FollowFeedList> getFriendList(@C53072c(mo110600a = "max_cursor") long j, @C53072c(mo110600a = "min_cursor") long j2, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "pull_type") int i2, @C53072c(mo110600a = "feed_style") int i3, @C53072c(mo110600a = "enter_time") long j3, @C53072c(mo110600a = "fetch_recommend") int i4, @C53072c(mo110600a = "impression_ids") String str, @C53072c(mo110600a = "is_up_phone") int i5, @C53072c(mo110600a = "is_recommend") int i6, @C53072c(mo110600a = "push_params") String str2, @C53072c(mo110600a = "address_book_access") int i7, @C53072c(mo110600a = "gps_access") int i8, @C53072c(mo110600a = "notice_count_log_id") String str3, @C53072c(mo110600a = "notice_item_count") Integer num, @C53072c(mo110600a = "notice_count_type") Integer num2, @C53072c(mo110600a = "notice_link_author_id") Long l, @C53072c(mo110600a = "notice_link_item_id") Long l2);

    @C53084o(mo110612a = "/aweme/v1/follow/feed/recommend/")
    @C53074e
    C17832m<FollowFeedList> getRecommendList(@C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "pull_type") int i2, @C53072c(mo110600a = "feed_style") int i3, @C53072c(mo110600a = "enter_time") long j, @C53072c(mo110600a = "impression_ids") String str, @C53072c(mo110600a = "last_feed_ids") String str2);
}
