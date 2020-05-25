package com.p683ss.android.ugc.aweme.feed.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.p1367c.C22977c;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.utils.C47929k;
import com.p683ss.ugc.aweme.proto.aweme_v2_feed_response;

/* renamed from: com.ss.android.ugc.aweme.feed.api.g */
public final class C30149g implements RetrofitApi {

    /* renamed from: a */
    private RetrofitApi f78689a;

    /* renamed from: a */
    private static void m70759a() {
        if (C22574a.m55738f().f60703d) {
            C22574a.m55738f().mo46921b("feed_compose_params", false);
            C22574a.m55738f().mo46916a("feed_api_to_net_api", System.currentTimeMillis(), false);
        }
    }

    /* renamed from: b */
    private static void m70760b() {
        if (C22574a.m55738f().f60703d) {
            C22574a.m55738f().mo46921b("feed_net_api_to_feed_api", false);
            C22574a.m55738f().mo46917a("feed_api_to_ui_response", false);
        }
    }

    C30149g(RetrofitApi retrofitApi) {
        if (retrofitApi != null) {
            this.f78689a = retrofitApi;
            return;
        }
        throw new IllegalArgumentException("retrofitApi should not be null");
    }

    public final C17832m<FeedItemList> fetchRoamingFeed(int i, String str) {
        return this.f78689a.fetchRoamingFeed(i, str);
    }

    public final C17832m<FeedItemList> fetchNearbyFeed(long j, long j2, int i, Integer num, String str, int i2, int i3) {
        return this.f78689a.fetchNearbyFeed(j, j2, i, num, str, i2, i3);
    }

    public final C17832m<FeedTimeLineItemList> fetchTimelineFeed(int i, long j, long j2, int i2, String str, String str2, String str3, int i3) {
        return this.f78689a.fetchTimelineFeed(i, j, j2, i2, str, str2, str3, i3);
    }

    public final C17832m<FeedItemList> fetchFollowFeed(long j, long j2, int i, Integer num, String str, double d, int i2, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, Object obj, Integer num5, String str12) {
        long j3 = j;
        long j4 = j2;
        int i4 = i;
        Integer num6 = num;
        String str13 = str;
        double d2 = d;
        int i5 = i2;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        int i6 = i3;
        String str19 = str7;
        String str20 = str8;
        Integer num7 = num2;
        Integer num8 = num3;
        Integer num9 = num4;
        String str21 = str9;
        Long l2 = l;
        String str22 = str10;
        String str23 = str11;
        Object obj2 = obj;
        Integer num10 = num5;
        String str24 = str12;
        m70759a();
        C17832m<FeedItemList> fetchFollowFeed = this.f78689a.fetchFollowFeed(j3, j4, i4, num6, str13, d2, i5, str14, str15, str16, str17, str18, i6, str19, str20, num7, num8, num9, str21, l2, str22, str23, obj2, num10, str24);
        m70760b();
        return fetchFollowFeed;
    }

    public final C17832m<FeedItemList> fetchFollowFeedImmediate(long j, long j2, int i, Integer num, String str, double d, int i2, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, Object obj, Integer num5, String str12) {
        long j3 = j;
        long j4 = j2;
        int i4 = i;
        Integer num6 = num;
        String str13 = str;
        double d2 = d;
        int i5 = i2;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        int i6 = i3;
        String str19 = str7;
        String str20 = str8;
        Integer num7 = num2;
        Integer num8 = num3;
        Integer num9 = num4;
        String str21 = str9;
        Long l2 = l;
        String str22 = str10;
        String str23 = str11;
        Object obj2 = obj;
        Integer num10 = num5;
        String str24 = str12;
        m70759a();
        C17832m<FeedItemList> fetchFollowFeedImmediate = this.f78689a.fetchFollowFeedImmediate(j3, j4, i4, num6, str13, d2, i5, str14, str15, str16, str17, str18, i6, str19, str20, num7, num8, num9, str21, l2, str22, str23, obj2, num10, str24);
        m70760b();
        return fetchFollowFeedImmediate;
    }

    /* renamed from: a */
    public final C17832m<C22977c<aweme_v2_feed_response, FeedItemList>> mo60427a(int i, long j, long j2, int i2, Integer num, String str, double d, int i3, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, String str12, Object obj, Integer num5, Long l2, String str13, Integer num6, Integer num7, String str14) {
        return fetchRecommendFeedV2(i, j, j2, i2, num, str, d, i3, str2, str3, str4, str5, str6, i4, str7, str8, num2, num3, num4, str9, l, str10, str11, str12, obj, num5, l2, str13, num6, num7, str14, C47929k.m103704a());
    }

    public final C17832m<FeedItemList> fetchRecommendFeed(int i, long j, long j2, int i2, Integer num, String str, double d, int i3, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, String str12, Object obj, Integer num5, Long l2, String str13, Integer num6, Integer num7, String str14) {
        int i5 = i;
        long j3 = j;
        long j4 = j2;
        int i6 = i2;
        Integer num8 = num;
        String str15 = str;
        double d2 = d;
        int i7 = i3;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        int i8 = i4;
        String str21 = str7;
        String str22 = str8;
        Integer num9 = num2;
        Integer num10 = num3;
        Integer num11 = num4;
        String str23 = str9;
        Long l3 = l;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        Object obj2 = obj;
        Integer num12 = num5;
        Long l4 = l2;
        String str27 = str13;
        Integer num13 = num6;
        Integer num14 = num7;
        String str28 = str14;
        m70759a();
        C17832m<FeedItemList> fetchRecommendFeed = this.f78689a.fetchRecommendFeed(i5, j3, j4, i6, num8, str15, d2, i7, str16, str17, str18, str19, str20, i8, str21, str22, num9, num10, num11, str23, l3, str24, str25, str26, obj2, num12, l4, str27, num13, num14, str28);
        m70760b();
        return fetchRecommendFeed;
    }

    public final C17832m<FeedItemList> fetchRecommendFeedImmediate(int i, long j, long j2, int i2, Integer num, String str, double d, int i3, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, String str12, Object obj, Integer num5, Long l2, String str13, Integer num6, Integer num7, String str14) {
        int i5 = i;
        long j3 = j;
        long j4 = j2;
        int i6 = i2;
        Integer num8 = num;
        String str15 = str;
        double d2 = d;
        int i7 = i3;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str6;
        int i8 = i4;
        String str21 = str7;
        String str22 = str8;
        Integer num9 = num2;
        Integer num10 = num3;
        Integer num11 = num4;
        String str23 = str9;
        Long l3 = l;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        Object obj2 = obj;
        Integer num12 = num5;
        Long l4 = l2;
        String str27 = str13;
        Integer num13 = num6;
        Integer num14 = num7;
        String str28 = str14;
        m70759a();
        C17832m<FeedItemList> fetchRecommendFeedImmediate = this.f78689a.fetchRecommendFeedImmediate(i5, j3, j4, i6, num8, str15, d2, i7, str16, str17, str18, str19, str20, i8, str21, str22, num9, num10, num11, str23, l3, str24, str25, str26, obj2, num12, l4, str27, num13, num14, str28);
        m70760b();
        return fetchRecommendFeedImmediate;
    }

    public final C17832m<C22977c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(int i, long j, long j2, int i2, Integer num, String str, double d, int i3, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, String str12, Object obj, Integer num5, Long l2, String str13, Integer num6, Integer num7, String str14, String str15) {
        int i5 = i;
        long j3 = j;
        long j4 = j2;
        int i6 = i2;
        Integer num8 = num;
        String str16 = str;
        double d2 = d;
        int i7 = i3;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        int i8 = i4;
        String str22 = str7;
        String str23 = str8;
        Integer num9 = num2;
        Integer num10 = num3;
        Integer num11 = num4;
        String str24 = str9;
        Long l3 = l;
        String str25 = str10;
        String str26 = str11;
        String str27 = str12;
        Object obj2 = obj;
        Integer num12 = num5;
        Long l4 = l2;
        String str28 = str13;
        Integer num13 = num6;
        Integer num14 = num7;
        String str29 = str14;
        m70759a();
        C17832m<C22977c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2 = this.f78689a.fetchRecommendFeedV2(i5, j3, j4, i6, num8, str16, d2, i7, str17, str18, str19, str20, str21, i8, str22, str23, num9, num10, num11, str24, l3, str25, str26, str27, obj2, num12, l4, str28, num13, num14, str29, C47929k.m103704a());
        m70760b();
        return fetchRecommendFeedV2;
    }
}
