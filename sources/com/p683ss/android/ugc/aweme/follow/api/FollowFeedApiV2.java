package com.p683ss.android.ugc.aweme.follow.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2 */
public interface FollowFeedApiV2 {
    @C53084o(mo110612a = "/aweme/v2/follow/feed/")
    @C53074e
    C17832m<FollowFeedList> getFollowFeedList(@C53072c(mo110600a = "follow_req_index") int i, @C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "level") int i2, @C53072c(mo110600a = "count") int i3, @C53072c(mo110600a = "pull_type") int i4, @C53072c(mo110600a = "feed_style") int i5, @C53072c(mo110600a = "enter_time") long j2, @C53072c(mo110600a = "rec_impr_users") String str, @C53072c(mo110600a = "aweme_id") String str2, @C53072c(mo110600a = "aweme_ids") String str3, @C53072c(mo110600a = "push_params") String str4, @C53072c(mo110600a = "impression_ids") String str5, @C53072c(mo110600a = "last_feed_ids") String str6, @C53072c(mo110600a = "gps_access") int i6, @C53072c(mo110600a = "last_follow_uid") String str7, @C53072c(mo110600a = "address_book_access") int i7, @C53072c(mo110600a = "filter_strategy") int i8, @C53072c(mo110600a = "notice_count_log_id") String str8, @C53072c(mo110600a = "notice_item_count") Integer num, @C53072c(mo110600a = "notice_live_count") Integer num2, @C53072c(mo110600a = "notice_count_type") Integer num3, @C53072c(mo110600a = "notice_link_author_id") Long l, @C53072c(mo110600a = "notice_link_item_id") Long l2, @C53072c(mo110600a = "notice_is_display_live") Integer num4, @C53072c(mo110600a = "vcd_auth_first_time") Integer num5);

    @C53075f(mo110603a = "/aweme/v2/follow/feed/")
    C17832m<FollowFeedList> getFollowFeedListNew(@C53089t(mo110619a = "follow_req_index") int i, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "level") int i2, @C53089t(mo110619a = "count") int i3, @C53089t(mo110619a = "pull_type") int i4, @C53089t(mo110619a = "feed_style") int i5, @C53089t(mo110619a = "enter_time") long j2, @C53089t(mo110619a = "rec_impr_users") String str, @C53089t(mo110619a = "aweme_id") String str2, @C53089t(mo110619a = "aweme_ids") String str3, @C53089t(mo110619a = "push_params") String str4, @C53089t(mo110619a = "gps_access") int i6, @C53089t(mo110619a = "last_follow_uid") String str5, @C53089t(mo110619a = "address_book_access") int i7, @C53089t(mo110619a = "filter_strategy") int i8, @C53089t(mo110619a = "notice_count_log_id") String str6, @C53089t(mo110619a = "notice_item_count") Integer num, @C53089t(mo110619a = "notice_live_count") Integer num2, @C53089t(mo110619a = "notice_count_type") Integer num3, @C53089t(mo110619a = "notice_link_author_id") Long l, @C53089t(mo110619a = "notice_link_item_id") Long l2, @C53089t(mo110619a = "notice_is_display_live") Integer num4, @C53089t(mo110619a = "vcd_auth_first_time") Integer num5);
}
