package com.p683ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p831b.C12702d;
import com.bytedance.retrofit2.p831b.C12723y;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.app.api.p1367c.C22977c;
import com.p683ss.android.ugc.aweme.feed.cache.C30176c;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.ArrayList;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedApi */
public final class FeedApi {

    /* renamed from: a */
    private static final String f78671a;

    /* renamed from: b */
    private static volatile int f78672b = 0;

    /* renamed from: c */
    private static volatile C30149g f78673c;

    /* renamed from: d */
    private static volatile C30149g f78674d;

    /* renamed from: e */
    private static Object f78675e = new Object();

    /* renamed from: f */
    private static Object f78676f = new Object();

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedApi$RetrofitApi */
    interface RetrofitApi {
        @C53075f(mo110603a = "/aweme/v1/follow/feed/")
        @C12723y(mo23893a = 2)
        C17832m<FeedItemList> fetchFollowFeed(@C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "feed_style") Integer num, @C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "volume") double d, @C53089t(mo110619a = "pull_type") int i2, @C53089t(mo110619a = "req_from") String str2, @C53089t(mo110619a = "gaid") String str3, @C53089t(mo110619a = "aweme_ids") String str4, @C53089t(mo110619a = "push_params") String str5, @C53089t(mo110619a = "ad_user_agent") String str6, @C53089t(mo110619a = "filter_warn") int i3, @C53089t(mo110619a = "bid_ad_params") String str7, @C53089t(mo110619a = "android_id") String str8, @C53089t(mo110619a = "ad_personality_mode") Integer num2, @C53089t(mo110619a = "address_book_access") Integer num3, @C53089t(mo110619a = "gps_access") Integer num4, @C53089t(mo110619a = "top_view_cid") String str9, @C53089t(mo110619a = "top_view_aid") Long l, @C53089t(mo110619a = "local_cache") String str10, @C53089t(mo110619a = "interest_list") String str11, @C12702d Object obj, @C53089t(mo110619a = "sound_output_device") Integer num5, @C53089t(mo110619a = "cmpl_enc") String str12);

        @C53075f(mo110603a = "/aweme/v1/follow/feed/")
        @C12723y(mo23893a = 3)
        C17832m<FeedItemList> fetchFollowFeedImmediate(@C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "feed_style") Integer num, @C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "volume") double d, @C53089t(mo110619a = "pull_type") int i2, @C53089t(mo110619a = "req_from") String str2, @C53089t(mo110619a = "gaid") String str3, @C53089t(mo110619a = "aweme_ids") String str4, @C53089t(mo110619a = "push_params") String str5, @C53089t(mo110619a = "ad_user_agent") String str6, @C53089t(mo110619a = "filter_warn") int i3, @C53089t(mo110619a = "bid_ad_params") String str7, @C53089t(mo110619a = "android_id") String str8, @C53089t(mo110619a = "ad_personality_mode") Integer num2, @C53089t(mo110619a = "address_book_access") Integer num3, @C53089t(mo110619a = "gps_access") Integer num4, @C53089t(mo110619a = "top_view_cid") String str9, @C53089t(mo110619a = "top_view_aid") Long l, @C53089t(mo110619a = "local_cache") String str10, @C53089t(mo110619a = "interest_list") String str11, @C12702d Object obj, @C53089t(mo110619a = "sound_output_device") Integer num5, @C53089t(mo110619a = "cmpl_enc") String str12);

        @C53075f(mo110603a = "/aweme/v1/nearby/feed/")
        C17832m<FeedItemList> fetchNearbyFeed(@C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "feed_style") Integer num, @C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "poi_class_code") int i2, @C53089t(mo110619a = "filter_warn") int i3);

        @C53075f(mo110603a = "/aweme/v1/feed/")
        @C12723y(mo23893a = 2)
        C17832m<FeedItemList> fetchRecommendFeed(@C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "feed_style") Integer num, @C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "volume") double d, @C53089t(mo110619a = "pull_type") int i3, @C53089t(mo110619a = "req_from") String str2, @C53089t(mo110619a = "gaid") String str3, @C53089t(mo110619a = "aweme_ids") String str4, @C53089t(mo110619a = "push_params") String str5, @C53089t(mo110619a = "ad_user_agent") String str6, @C53089t(mo110619a = "filter_warn") int i4, @C53089t(mo110619a = "bid_ad_params") String str7, @C53089t(mo110619a = "android_id") String str8, @C53089t(mo110619a = "ad_personality_mode") Integer num2, @C53089t(mo110619a = "address_book_access") Integer num3, @C53089t(mo110619a = "gps_access") Integer num4, @C53089t(mo110619a = "top_view_cid") String str9, @C53089t(mo110619a = "top_view_aid") Long l, @C53089t(mo110619a = "local_cache") String str10, @C53089t(mo110619a = "preload_aweme_ids") String str11, @C53089t(mo110619a = "interest_list") String str12, @C12702d Object obj, @C53089t(mo110619a = "cached_item_num") Integer num5, @C53089t(mo110619a = "last_ad_show_interval") Long l2, @C53089t(mo110619a = "real_time_actions") String str13, @C53089t(mo110619a = "vpa_content_choice") Integer num6, @C53089t(mo110619a = "sound_output_device") Integer num7, @C53089t(mo110619a = "cmpl_enc") String str14);

        @C53075f(mo110603a = "/aweme/v1/feed/")
        @C12723y(mo23893a = 3)
        C17832m<FeedItemList> fetchRecommendFeedImmediate(@C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "feed_style") Integer num, @C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "volume") double d, @C53089t(mo110619a = "pull_type") int i3, @C53089t(mo110619a = "req_from") String str2, @C53089t(mo110619a = "gaid") String str3, @C53089t(mo110619a = "aweme_ids") String str4, @C53089t(mo110619a = "push_params") String str5, @C53089t(mo110619a = "ad_user_agent") String str6, @C53089t(mo110619a = "filter_warn") int i4, @C53089t(mo110619a = "bid_ad_params") String str7, @C53089t(mo110619a = "android_id") String str8, @C53089t(mo110619a = "ad_personality_mode") Integer num2, @C53089t(mo110619a = "address_book_access") Integer num3, @C53089t(mo110619a = "gps_access") Integer num4, @C53089t(mo110619a = "top_view_cid") String str9, @C53089t(mo110619a = "top_view_aid") Long l, @C53089t(mo110619a = "local_cache") String str10, @C53089t(mo110619a = "preload_aweme_ids") String str11, @C53089t(mo110619a = "interest_list") String str12, @C12702d Object obj, @C53089t(mo110619a = "cached_item_num") Integer num5, @C53089t(mo110619a = "last_ad_show_interval") Long l2, @C53089t(mo110619a = "real_time_actions") String str13, @C53089t(mo110619a = "vpa_content_choice") Integer num6, @C53089t(mo110619a = "sound_output_device") Integer num7, @C53089t(mo110619a = "cmpl_enc") String str14);

        @C53075f(mo110603a = "/aweme/v2/feed/")
        @C12723y(mo23893a = 2)
        C17832m<C22977c<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(@C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "max_cursor") long j, @C53089t(mo110619a = "min_cursor") long j2, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "feed_style") Integer num, @C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "volume") double d, @C53089t(mo110619a = "pull_type") int i3, @C53089t(mo110619a = "req_from") String str2, @C53089t(mo110619a = "gaid") String str3, @C53089t(mo110619a = "aweme_ids") String str4, @C53089t(mo110619a = "push_params") String str5, @C53089t(mo110619a = "ad_user_agent") String str6, @C53089t(mo110619a = "filter_warn") int i4, @C53089t(mo110619a = "bid_ad_params") String str7, @C53089t(mo110619a = "android_id") String str8, @C53089t(mo110619a = "ad_personality_mode") Integer num2, @C53089t(mo110619a = "address_book_access") Integer num3, @C53089t(mo110619a = "gps_access") Integer num4, @C53089t(mo110619a = "top_view_cid") String str9, @C53089t(mo110619a = "top_view_aid") Long l, @C53089t(mo110619a = "local_cache") String str10, @C53089t(mo110619a = "preload_aweme_ids") String str11, @C53089t(mo110619a = "interest_list") String str12, @C12702d Object obj, @C53089t(mo110619a = "cached_item_num") Integer num5, @C53089t(mo110619a = "last_ad_show_interval") Long l2, @C53089t(mo110619a = "real_time_actions") String str13, @C53089t(mo110619a = "vpa_content_choice") Integer num6, @C53089t(mo110619a = "sound_output_device") Integer num7, @C53089t(mo110619a = "cmpl_enc") String str14, @C53089t(mo110619a = "af_params") String str15);

        @C53075f(mo110603a = "/aweme/v1/roaming/feed/")
        C17832m<FeedItemList> fetchRoamingFeed(@C53089t(mo110619a = "count") int i, @C53089t(mo110619a = "roaming_code") String str);

        @C53075f(mo110603a = "/aweme/v1/fresh/feed/")
        C17832m<FeedTimeLineItemList> fetchTimelineFeed(@C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "max_time") long j, @C53089t(mo110619a = "min_time") long j2, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "aweme_id") String str, @C53089t(mo110619a = "aweme_ids") String str2, @C53089t(mo110619a = "push_params") String str3, @C53089t(mo110619a = "filter_warn") int i3);
    }

    static {
        StringBuilder sb = new StringBuilder("pb_convert_flag");
        sb.append(C11010c.m22293n());
        f78671a = sb.toString();
    }

    /* renamed from: a */
    private static C30149g m70731a() {
        if (f78673c == null) {
            synchronized (f78675e) {
                if (f78673c == null) {
                    IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
                    String str = C18845b.f52040e;
                    ArrayList arrayList = new ArrayList();
                    if (TextUtils.equals(C11010c.m22295p(), "local_test")) {
                        arrayList.add(new ComplianceEncryptCheckInterceptor());
                    }
                    arrayList.add(new FeedRetryInterceptorTTNet());
                    arrayList.add(new DetectInterceptor());
                    arrayList.add(new FetchNetworkInfoInterceptor());
                    f78673c = new C30149g((RetrofitApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(str, arrayList).create(RetrofitApi.class));
                }
            }
        }
        return f78673c;
    }

    /* renamed from: b */
    private static C30149g m70735b() {
        if (f78674d == null) {
            synchronized (f78676f) {
                if (f78674d == null) {
                    IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
                    String str = C18845b.f52040e;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new FeedRetryInterceptorTTNet());
                    arrayList.add(new FetchNetworkInfoInterceptor());
                    arrayList.add(new FeedCompoundInterceptor());
                    f78674d = new C30149g((RetrofitApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(str, arrayList).create(RetrofitApi.class));
                }
            }
        }
        return f78674d;
    }

    /* renamed from: a */
    private static String m70734a(C30176c cVar) {
        if (cVar == null) {
            return null;
        }
        return cVar.mo60464a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007d, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0244  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.p683ss.android.ugc.aweme.feed.model.FeedItemList m70733a(com.p683ss.android.ugc.aweme.feed.api.C30157o r46) throws java.lang.Exception {
        /*
            r15 = r46
            java.lang.Integer r0 = r15.f78708a
            int r2 = r0.intValue()
            java.lang.Long r0 = r15.f78709b
            long r4 = r0.longValue()
            java.lang.Long r0 = r15.f78710c
            long r6 = r0.longValue()
            java.lang.Integer r0 = r15.f78711d
            int r8 = r0.intValue()
            java.lang.Integer r9 = r15.f78712e
            java.lang.String r0 = r15.f78713f
            java.lang.Integer r1 = r15.f78714g
            int r13 = r1.intValue()
            java.lang.String r14 = r15.f78715h
            java.lang.String r12 = r15.f78716i
            com.ss.android.ugc.aweme.feed.cache.c r1 = r15.f78717j
            java.lang.Boolean r3 = r15.f78718k
            boolean r3 = r3.booleanValue()
            java.lang.String r11 = r15.f78719l
            com.ss.android.ugc.aweme.an.a r10 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            boolean r10 = r10.f60703d
            r36 = r11
            r11 = 0
            if (r10 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.an.a r10 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r15 = "feed_request_to_feed_api"
            r10.mo46921b(r15, r11)
            com.ss.android.ugc.aweme.an.a r10 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r15 = "feed_compose_params"
            r10.mo46917a(r15, r11)
        L_0x004f:
            com.ss.android.ugc.aweme.protection.api.services.b r10 = com.p683ss.android.ugc.aweme.protection.api.services.C40859b.f104022a
            com.ss.android.ugc.aweme.protection.api.services.c r10 = r10.getAntiAddictionService()
            int r15 = r10.mo83191b()
            r11 = 1
            if (r15 != r11) goto L_0x005e
            r15 = 1
            goto L_0x005f
        L_0x005e:
            r15 = 0
        L_0x005f:
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r11 = "0"
            boolean r11 = android.text.TextUtils.equals(r11, r0)
            r11 = r16 | r11
            if (r11 == 0) goto L_0x0080
            boolean r11 = r10.mo83193d()
            if (r11 == 0) goto L_0x0080
            if (r15 == 0) goto L_0x0080
            java.lang.String r10 = r10.mo83195f()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r10 = r0
        L_0x0081:
            com.ss.android.ugc.aweme.services.function.FunctionSupportService r0 = com.p683ss.android.ugc.aweme.services.function.FunctionSupportService.INSTANCE
            com.ss.android.ugc.aweme.services.function.IFunctionKey r11 = com.p683ss.android.ugc.aweme.services.function.IFunctionKey.AD
            boolean r0 = r0.notSupport(r11)
            if (r0 == 0) goto L_0x008e
            java.lang.String r11 = ""
            goto L_0x0092
        L_0x008e:
            java.lang.String r11 = com.p683ss.android.ugc.trill.p2518c.C50312a.m108586c()
        L_0x0092:
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = ""
            goto L_0x009b
        L_0x0097:
            java.lang.String r0 = com.p683ss.android.ugc.trill.p2518c.C50312a.m108587d()
        L_0x009b:
            com.ss.android.ugc.aweme.commercialize.splash.k r15 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62918i()
            java.lang.String r15 = r15.mo53866d()
            r38 = r12
            com.ss.android.ugc.aweme.commercialize.splash.k r12 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62918i()
            java.lang.Long r28 = r12.mo53863b(r15)
            com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            r39 = r15
            java.lang.String r15 = "feed_get_live_splash_id"
            r40 = r14
            r14 = 0
            r12.mo46917a(r15, r14)
            java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.a r12 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62919j()
            java.lang.String r27 = r12.mo53880a()
            com.ss.android.ugc.aweme.an.a r12 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r15 = "feed_get_live_splash_id"
            r12.mo46921b(r15, r14)
            r12 = 4
            if (r13 == r12) goto L_0x00d4
            if (r13 != 0) goto L_0x00d7
        L_0x00d4:
            com.p683ss.android.ugc.aweme.p1386ar.C23265f.m57212a()
        L_0x00d7:
            java.lang.String r29 = com.p683ss.android.ugc.aweme.journey.C35781s.m80910a(r13)
            boolean r14 = com.p683ss.android.ugc.aweme.feed.api.C30144b.m70746a()
            java.lang.String r15 = "feed"
            java.lang.String r20 = com.p683ss.android.ugc.aweme.commercialize.log.RawURLGetter.m63083a(r15)
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = ""
        L_0x00e9:
            r21 = r0
            com.ss.android.ugc.aweme.ao r0 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            int r0 = r0.mo47256q()
            java.lang.Integer r25 = java.lang.Integer.valueOf(r0)
            com.bytedance.ttnet.c.e r15 = new com.bytedance.ttnet.c.e
            r15.<init>()
            com.bytedance.ies.abmock.b r30 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FirstFeedConnectTimeoutExperiment> r31 = com.p683ss.android.ugc.aweme.feed.experiment.FirstFeedConnectTimeoutExperiment.class
            r32 = 1
            java.lang.String r33 = "first_feed_connect_timeout"
            r34 = 31744(0x7c00, float:4.4483E-41)
            r35 = 0
            int r0 = r30.mo18168a(r31, r32, r33, r34, r35)
            r41 = r13
            long r12 = (long) r0
            r15.f26780c = r12
            com.bytedance.ies.abmock.b r30 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FirstFeedReadTimeoutExperiment> r31 = com.p683ss.android.ugc.aweme.feed.experiment.FirstFeedReadTimeoutExperiment.class
            java.lang.String r33 = "first_feed_read_timeout"
            int r0 = r30.mo18168a(r31, r32, r33, r34, r35)
            long r12 = (long) r0
            r15.f26781d = r12
            com.bytedance.ies.abmock.b r30 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FirstFeedWriteTimeoutExperiment> r31 = com.p683ss.android.ugc.aweme.feed.experiment.FirstFeedWriteTimeoutExperiment.class
            java.lang.String r33 = "first_feed_write_timeout"
            int r0 = r30.mo18168a(r31, r32, r33, r34, r35)
            long r12 = (long) r0
            r15.f26782e = r12
            r0 = 2
            r13 = r41
            r12 = 4
            if (r13 == r12) goto L_0x014c
            if (r13 == 0) goto L_0x014c
            r12 = 1
            if (r13 != r12) goto L_0x013d
            goto L_0x014c
        L_0x013d:
            if (r13 != r0) goto L_0x0148
            int r12 = com.p683ss.android.ugc.aweme.commercialize.utils.C26511e.m64101a()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0151
        L_0x0148:
            r12 = 4
            r30 = 0
            goto L_0x0154
        L_0x014c:
            r12 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
        L_0x0151:
            r30 = r12
            r12 = 4
        L_0x0154:
            if (r13 == r12) goto L_0x0161
            if (r13 == 0) goto L_0x0161
            r12 = 1
            if (r13 == r12) goto L_0x0161
            if (r13 != r0) goto L_0x015e
            goto L_0x0161
        L_0x015e:
            r31 = 0
            goto L_0x016b
        L_0x0161:
            long r16 = com.p683ss.android.ugc.aweme.commercialize.utils.C26511e.m64103b()
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r31 = r0
        L_0x016b:
            com.p683ss.android.ugc.aweme.commercialize.utils.C26511e.m64102a(r13)
            com.ss.android.ugc.aweme.ao r0 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            int r0 = r0.mo47241b()
            java.lang.Integer r33 = java.lang.Integer.valueOf(r0)
            java.lang.String r32 = com.p683ss.android.ugc.aweme.feed.api.C30144b.m70747b()
            if (r14 == 0) goto L_0x0244
            if (r3 == 0) goto L_0x01c3
            boolean r0 = com.p683ss.android.ugc.aweme.feed.experiment.C30223c.m70964e()
            if (r0 == 0) goto L_0x0189
            goto L_0x01c3
        L_0x0189:
            com.ss.android.ugc.aweme.feed.api.g r0 = m70735b()
            java.lang.String r19 = m70734a(r1)
            r1 = r2
            r2 = r4
            r4 = r6
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r13
            r10 = r11
            r11 = r40
            r12 = r38
            r13 = r20
            r14 = r36
            r37 = r39
            r39 = r15
            r15 = r21
            r16 = r25
            r17 = r37
            r18 = r28
            r20 = r27
            r21 = r29
            r22 = r39
            r23 = r30
            r24 = r31
            r25 = r32
            r26 = r33
            r27 = r46
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = com.p683ss.android.ugc.aweme.feed.helper.C30361b.m71277b(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0444
        L_0x01c3:
            r37 = r39
            r39 = r15
            com.ss.android.ugc.aweme.feed.api.g r0 = m70731a()
            double r14 = com.p683ss.android.ugc.aweme.audio.AudioUtils.m57293a()
            if (r3 == 0) goto L_0x01d6
            java.lang.String r3 = "enter_auto"
        L_0x01d3:
            r16 = r3
            goto L_0x01d9
        L_0x01d6:
            java.lang.String r3 = ""
            goto L_0x01d3
        L_0x01d9:
            if (r11 != 0) goto L_0x01e0
            java.lang.String r3 = ""
            r17 = r3
            goto L_0x01e2
        L_0x01e0:
            r17 = r11
        L_0x01e2:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            int r18 = r3.mo47107d()
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103731a()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            java.lang.String r26 = m70734a(r1)
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.Integer r34 = com.p683ss.android.ugc.aweme.feed.C30129af.m70699a(r1)
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            java.lang.String r35 = r1.mo47257r()
            r1 = r0
            r3 = r4
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            r0 = r38
            r12 = r13
            r13 = r16
            r16 = r40
            r14 = r17
            r15 = r16
            r16 = r0
            r17 = r20
            r19 = r36
            r20 = r21
            r21 = r25
            r24 = r37
            r25 = r28
            r28 = r29
            r29 = r39
            com.google.b.h.a.m r0 = r1.mo60427a(r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.app.api.c.c r0 = (com.p683ss.android.ugc.aweme.app.api.p1367c.C22977c) r0
            r1 = r46
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = com.p683ss.android.ugc.aweme.feed.api.C30144b.m70744a(r0, r1)
            goto L_0x0444
        L_0x0244:
            r0 = r38
            r37 = r39
            r16 = r40
            r39 = r15
            com.bytedance.ies.abmock.b r40 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FeedImmediateExperiment> r41 = com.p683ss.android.ugc.aweme.feed.experiment.FeedImmediateExperiment.class
            r42 = 1
            java.lang.String r43 = "is_feed_immediate"
            r44 = 31744(0x7c00, float:4.4483E-41)
            r45 = 0
            boolean r12 = r40.mo18172a(r41, r42, r43, r44, r45)
            if (r12 == 0) goto L_0x0353
            r12 = 1
            if (r2 != r12) goto L_0x02e0
            com.bytedance.ies.abmock.b r40 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FollowFeedPathExperiment> r41 = com.p683ss.android.ugc.aweme.experiment.FollowFeedPathExperiment.class
            r42 = 1
            java.lang.String r43 = "new_follow_feed_path"
            r44 = 31744(0x7c00, float:4.4483E-41)
            r45 = 0
            boolean r12 = r40.mo18172a(r41, r42, r43, r44, r45)
            if (r12 == 0) goto L_0x02e0
            com.ss.android.ugc.aweme.feed.api.g r2 = m70731a()
            double r14 = com.p683ss.android.ugc.aweme.audio.AudioUtils.m57293a()
            if (r3 == 0) goto L_0x0286
            java.lang.String r3 = "enter_auto"
        L_0x0283:
            r17 = r3
            goto L_0x0289
        L_0x0286:
            java.lang.String r3 = ""
            goto L_0x0283
        L_0x0289:
            if (r11 != 0) goto L_0x0290
            java.lang.String r3 = ""
            r18 = r3
            goto L_0x0292
        L_0x0290:
            r18 = r11
        L_0x0292:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            int r19 = r3.mo47107d()
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103731a()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()
            java.lang.Integer r24 = java.lang.Integer.valueOf(r3)
            java.lang.String r27 = m70734a(r1)
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.Integer r30 = com.p683ss.android.ugc.aweme.feed.C30129af.m70699a(r1)
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            java.lang.String r31 = r1.mo47257r()
            r3 = r2
            r11 = r14
            r14 = r17
            r15 = r18
            r17 = r0
            r18 = r20
            r20 = r36
            r22 = r25
            r25 = r37
            r26 = r28
            r28 = r29
            r29 = r39
            com.google.b.h.a.m r0 = r3.fetchFollowFeedImmediate(r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0
            goto L_0x0444
        L_0x02e0:
            com.ss.android.ugc.aweme.feed.api.g r12 = m70731a()
            double r14 = com.p683ss.android.ugc.aweme.audio.AudioUtils.m57293a()
            if (r3 == 0) goto L_0x02ef
            java.lang.String r3 = "enter_auto"
        L_0x02ec:
            r17 = r3
            goto L_0x02f2
        L_0x02ef:
            java.lang.String r3 = ""
            goto L_0x02ec
        L_0x02f2:
            if (r11 != 0) goto L_0x02f9
            java.lang.String r3 = ""
            r19 = r3
            goto L_0x02fb
        L_0x02f9:
            r19 = r11
        L_0x02fb:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            int r18 = r3.mo47107d()
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103731a()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            java.lang.String r26 = m70734a(r1)
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.Integer r34 = com.p683ss.android.ugc.aweme.feed.C30129af.m70699a(r1)
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            java.lang.String r35 = r1.mo47257r()
            r1 = r12
            r3 = r4
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            r12 = r13
            r13 = r17
            r14 = r19
            r15 = r16
            r16 = r0
            r17 = r20
            r19 = r36
            r20 = r21
            r21 = r25
            r24 = r37
            r25 = r28
            r28 = r29
            r29 = r39
            com.google.b.h.a.m r0 = r1.fetchRecommendFeedImmediate(r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0
            goto L_0x0444
        L_0x0353:
            r12 = 1
            if (r2 != r12) goto L_0x03d3
            com.bytedance.ies.abmock.b r40 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FollowFeedPathExperiment> r41 = com.p683ss.android.ugc.aweme.experiment.FollowFeedPathExperiment.class
            r42 = 1
            java.lang.String r43 = "new_follow_feed_path"
            r44 = 31744(0x7c00, float:4.4483E-41)
            r45 = 0
            boolean r12 = r40.mo18172a(r41, r42, r43, r44, r45)
            if (r12 == 0) goto L_0x03d3
            com.ss.android.ugc.aweme.feed.api.g r2 = m70731a()
            double r14 = com.p683ss.android.ugc.aweme.audio.AudioUtils.m57293a()
            if (r3 == 0) goto L_0x0379
            java.lang.String r3 = "enter_auto"
        L_0x0376:
            r17 = r3
            goto L_0x037c
        L_0x0379:
            java.lang.String r3 = ""
            goto L_0x0376
        L_0x037c:
            if (r11 != 0) goto L_0x0383
            java.lang.String r3 = ""
            r18 = r3
            goto L_0x0385
        L_0x0383:
            r18 = r11
        L_0x0385:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            int r19 = r3.mo47107d()
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103731a()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()
            java.lang.Integer r24 = java.lang.Integer.valueOf(r3)
            java.lang.String r27 = m70734a(r1)
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.Integer r30 = com.p683ss.android.ugc.aweme.feed.C30129af.m70699a(r1)
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            java.lang.String r31 = r1.mo47257r()
            r3 = r2
            r11 = r14
            r14 = r17
            r15 = r18
            r17 = r0
            r18 = r20
            r20 = r36
            r22 = r25
            r25 = r37
            r26 = r28
            r28 = r29
            r29 = r39
            com.google.b.h.a.m r0 = r3.fetchFollowFeed(r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0
            goto L_0x0444
        L_0x03d3:
            com.ss.android.ugc.aweme.feed.api.g r12 = m70731a()
            double r14 = com.p683ss.android.ugc.aweme.audio.AudioUtils.m57293a()
            if (r3 == 0) goto L_0x03e2
            java.lang.String r3 = "enter_auto"
        L_0x03df:
            r17 = r3
            goto L_0x03e5
        L_0x03e2:
            java.lang.String r3 = ""
            goto L_0x03df
        L_0x03e5:
            if (r11 != 0) goto L_0x03ec
            java.lang.String r3 = ""
            r19 = r3
            goto L_0x03ee
        L_0x03ec:
            r19 = r11
        L_0x03ee:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            int r18 = r3.mo47107d()
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103731a()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            int r3 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            java.lang.String r26 = m70734a(r1)
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            java.lang.Integer r34 = com.p683ss.android.ugc.aweme.feed.C30129af.m70699a(r1)
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()
            java.lang.String r35 = r1.mo47257r()
            r1 = r12
            r3 = r4
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            r12 = r13
            r13 = r17
            r14 = r19
            r15 = r16
            r16 = r0
            r17 = r20
            r19 = r36
            r20 = r21
            r21 = r25
            r24 = r37
            r25 = r28
            r28 = r29
            r29 = r39
            com.google.b.h.a.m r0 = r1.fetchRecommendFeed(r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0
        L_0x0444:
            com.ss.android.ugc.aweme.commercialize.splash.k r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62918i()
            r1.mo53865c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.api.FeedApi.m70733a(com.ss.android.ugc.aweme.feed.api.o):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:43|44|(1:46)(1:47)|48|49|50|51|54|55|(3:58|(1:60)(1:61)|62)|63|64|65|66|(2:68|(1:70)(2:71|(1:73)(2:74|(1:76)(2:77|(1:79)(2:80|(1:82)(2:83|(1:85)))))))|86|87|88|89|(1:91)|92|(3:96|(2:99|97)|119)) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0250 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:86:0x02c9 */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x025e A[Catch:{ Exception -> 0x02c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02d9 A[Catch:{ Exception -> 0x030d }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0303 A[Catch:{ Exception -> 0x030d }, LOOP:0: B:97:0x02fd->B:99:0x0303, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.feed.model.FeedItemList m70732a(int r36, long r37, long r39, int r41, java.lang.Integer r42, java.lang.String r43, int r44, int r45, java.lang.String r46, java.lang.String r47, java.lang.String r48, long r49, com.p683ss.android.ugc.aweme.feed.cache.C30176c r51) throws java.lang.Exception {
        /*
            r0 = r36
            r12 = r44
            java.lang.String r1 = com.p683ss.android.common.applog.TeaAgent.getServerDeviceId()
            com.p683ss.android.ugc.aweme.feed.api.C30146d.f78687b = r1
            r13 = 1
            r1 = 2
            if (r0 != r1) goto L_0x003a
            com.ss.android.ugc.aweme.feed.api.g r1 = m70731a()     // Catch:{ ExecutionException -> 0x0034 }
            com.ss.android.ugc.aweme.antiaddic.lock.b r2 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()     // Catch:{ ExecutionException -> 0x0034 }
            int r11 = r2.mo47107d()     // Catch:{ ExecutionException -> 0x0034 }
            r2 = r36
            r3 = r37
            r5 = r39
            r7 = r41
            r8 = r43
            r9 = r47
            r10 = r48
            com.google.b.h.a.m r0 = r1.fetchTimelineFeed(r2, r3, r5, r7, r8, r9, r10, r11)     // Catch:{ ExecutionException -> 0x0034 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0034 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x0034 }
            goto L_0x030e
        L_0x0034:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p683ss.android.ugc.aweme.base.api.C23453a.getCompatibleException(r0)
            throw r0
        L_0x003a:
            r1 = 7
            if (r0 != r1) goto L_0x0067
            com.ss.android.ugc.aweme.feed.api.g r2 = m70731a()     // Catch:{ ExecutionException -> 0x0061 }
            com.ss.android.ugc.aweme.antiaddic.lock.b r0 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()     // Catch:{ ExecutionException -> 0x0061 }
            int r11 = r0.mo47107d()     // Catch:{ ExecutionException -> 0x0061 }
            r3 = r37
            r5 = r39
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = r45
            com.google.b.h.a.m r0 = r2.fetchNearbyFeed(r3, r5, r7, r8, r9, r10, r11)     // Catch:{ ExecutionException -> 0x0061 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0061 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x0061 }
            goto L_0x030e
        L_0x0061:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p683ss.android.ugc.aweme.base.api.C23453a.getCompatibleException(r0)
            throw r0
        L_0x0067:
            r1 = 12
            if (r0 != r1) goto L_0x0085
            com.ss.android.ugc.aweme.feed.api.g r0 = m70731a()     // Catch:{ ExecutionException -> 0x007f }
            r7 = r41
            r1 = r46
            com.google.b.h.a.m r0 = r0.fetchRoamingFeed(r7, r1)     // Catch:{ ExecutionException -> 0x007f }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x007f }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x007f }
            goto L_0x030e
        L_0x007f:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p683ss.android.ugc.aweme.base.api.C23453a.getCompatibleException(r0)
            throw r0
        L_0x0085:
            r7 = r41
            com.ss.android.ugc.aweme.services.function.FunctionSupportService r1 = com.p683ss.android.ugc.aweme.services.function.FunctionSupportService.INSTANCE
            com.ss.android.ugc.aweme.services.function.IFunctionKey r2 = com.p683ss.android.ugc.aweme.services.function.IFunctionKey.AD
            boolean r1 = r1.notSupport(r2)
            if (r0 == 0) goto L_0x01bd
            com.bytedance.ttnet.c.e r29 = new com.bytedance.ttnet.c.e
            r29.<init>()
            com.bytedance.ies.abmock.b r13 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FollowFeedPathExperiment> r14 = com.p683ss.android.ugc.aweme.experiment.FollowFeedPathExperiment.class
            r15 = 1
            java.lang.String r16 = "new_follow_feed_path"
            r17 = 31744(0x7c00, float:4.4483E-41)
            r18 = 0
            boolean r2 = r13.mo18172a(r14, r15, r16, r17, r18)     // Catch:{ ExecutionException -> 0x01b7 }
            if (r2 == 0) goto L_0x011f
            com.ss.android.ugc.aweme.feed.api.g r0 = m70731a()     // Catch:{ ExecutionException -> 0x01b7 }
            double r8 = com.p683ss.android.ugc.aweme.audio.AudioUtils.m57293a()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.String r11 = ""
            java.lang.String r13 = ""
            java.lang.String r15 = ""
            com.ss.android.ugc.aweme.antiaddic.lock.b r2 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()     // Catch:{ ExecutionException -> 0x01b7 }
            int r16 = r2.mo47107d()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.String r17 = ""
            if (r1 == 0) goto L_0x00c6
            java.lang.String r1 = ""
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r1 = com.p683ss.android.ugc.trill.p2518c.C50312a.m108585b()     // Catch:{ ExecutionException -> 0x01b7 }
        L_0x00ca:
            r18 = r1
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()     // Catch:{ ExecutionException -> 0x01b7 }
            int r1 = r1.mo47256q()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x01b7 }
            int r1 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103731a()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x01b7 }
            int r1 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x01b7 }
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r27 = com.p683ss.android.ugc.aweme.feed.C30129af.m70699a(r1)     // Catch:{ ExecutionException -> 0x01b7 }
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.String r28 = r1.mo47257r()     // Catch:{ ExecutionException -> 0x01b7 }
            r1 = r37
            r3 = r39
            r5 = r41
            r6 = r42
            r7 = r43
            r10 = r44
            r12 = r13
            r13 = r47
            r14 = r48
            r26 = r29
            com.google.b.h.a.m r0 = r0.fetchFollowFeed(r1, r3, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x01b7 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x01b7 }
            goto L_0x01a7
        L_0x011f:
            com.ss.android.ugc.aweme.ao r2 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()     // Catch:{ ExecutionException -> 0x01b7 }
            int r2 = r2.mo47241b()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r33 = java.lang.Integer.valueOf(r2)     // Catch:{ ExecutionException -> 0x01b7 }
            com.ss.android.ugc.aweme.feed.api.g r2 = m70731a()     // Catch:{ ExecutionException -> 0x01b7 }
            double r10 = com.p683ss.android.ugc.aweme.audio.AudioUtils.m57293a()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r17 = ""
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()     // Catch:{ ExecutionException -> 0x01b7 }
            int r18 = r3.mo47107d()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.String r19 = ""
            if (r1 == 0) goto L_0x0148
            java.lang.String r1 = ""
            goto L_0x014c
        L_0x0148:
            java.lang.String r1 = com.p683ss.android.ugc.trill.p2518c.C50312a.m108585b()     // Catch:{ ExecutionException -> 0x01b7 }
        L_0x014c:
            r20 = r1
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()     // Catch:{ ExecutionException -> 0x01b7 }
            int r1 = r1.mo47256q()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x01b7 }
            int r1 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103731a()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x01b7 }
            int r1 = com.p683ss.android.ugc.aweme.utils.permission.C47945d.m103733b()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x01b7 }
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Integer r34 = com.p683ss.android.ugc.aweme.feed.C30129af.m70699a(r1)     // Catch:{ ExecutionException -> 0x01b7 }
            com.ss.android.ugc.aweme.ao r1 = com.p683ss.android.ugc.aweme.C23794bh.m58381G()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.String r35 = r1.mo47257r()     // Catch:{ ExecutionException -> 0x01b7 }
            r1 = r2
            r2 = r36
            r3 = r37
            r5 = r39
            r7 = r41
            r8 = r42
            r9 = r43
            r12 = r44
            r15 = r47
            r16 = r48
            com.google.b.h.a.m r0 = r1.fetchRecommendFeed(r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x01b7 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p683ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x01b7 }
        L_0x01a7:
            if (r0 == 0) goto L_0x01b6
            com.ss.android.ugc.aweme.feed.aa r1 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()     // Catch:{ ExecutionException -> 0x01b7 }
            java.lang.String r2 = r0.getRequestId()     // Catch:{ ExecutionException -> 0x01b7 }
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r0.logPb     // Catch:{ ExecutionException -> 0x01b7 }
            r1.mo60162a(r2, r3)     // Catch:{ ExecutionException -> 0x01b7 }
        L_0x01b6:
            return r0
        L_0x01b7:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p683ss.android.ugc.aweme.base.api.C23453a.getCompatibleException(r0)
            throw r0
        L_0x01bd:
            int r1 = f78672b     // Catch:{ ExecutionException -> 0x0385 }
            int r1 = r1 + r13
            f78672b = r1     // Catch:{ ExecutionException -> 0x0385 }
            r2 = 0
            if (r1 != r13) goto L_0x01c7
            r1 = 1
            goto L_0x01c8
        L_0x01c7:
            r1 = 0
        L_0x01c8:
            java.lang.String r3 = ""
            com.ss.android.ugc.aweme.commercialize.symphony.a r4 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62920k()     // Catch:{ Exception -> 0x01d9 }
            android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r4 = r4.mo53951a(r5)     // Catch:{ Exception -> 0x01d9 }
            r26 = r4
            goto L_0x01db
        L_0x01d9:
            r26 = r3
        L_0x01db:
            com.ss.android.ugc.aweme.feed.api.o r3 = new com.ss.android.ugc.aweme.feed.api.o     // Catch:{ ExecutionException -> 0x0385 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r36)     // Catch:{ ExecutionException -> 0x0385 }
            java.lang.Long r16 = java.lang.Long.valueOf(r37)     // Catch:{ ExecutionException -> 0x0385 }
            java.lang.Long r17 = java.lang.Long.valueOf(r39)     // Catch:{ ExecutionException -> 0x0385 }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r41)     // Catch:{ ExecutionException -> 0x0385 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r44)     // Catch:{ ExecutionException -> 0x0385 }
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r1)     // Catch:{ ExecutionException -> 0x0385 }
            r14 = r3
            r19 = r42
            r20 = r43
            r22 = r47
            r23 = r48
            r24 = r51
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ ExecutionException -> 0x0385 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = m70733a(r3)     // Catch:{ ExecutionException -> 0x0385 }
            r1 = 4
            if (r12 == r1) goto L_0x020c
            if (r12 != 0) goto L_0x0241
        L_0x020c:
            com.ss.android.ugc.aweme.ar.f r1 = com.p683ss.android.ugc.aweme.p1386ar.C23265f.f62213b     // Catch:{ ExecutionException -> 0x0385 }
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ ExecutionException -> 0x0385 }
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FeedImmediateExperiment> r3 = com.p683ss.android.ugc.aweme.feed.experiment.FeedImmediateExperiment.class
            r4 = 1
            java.lang.String r5 = "is_feed_immediate"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            r36 = r1
            r37 = r3
            r38 = r4
            r39 = r5
            r40 = r6
            r41 = r7
            boolean r1 = r36.mo18172a(r37, r38, r39, r40, r41)     // Catch:{ ExecutionException -> 0x0385 }
            if (r1 == 0) goto L_0x022f
            java.lang.String r1 = "immediate"
            goto L_0x0231
        L_0x022f:
            java.lang.String r1 = "high"
        L_0x0231:
            java.lang.String r3 = "abKey"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)     // Catch:{ ExecutionException -> 0x0385 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ ExecutionException -> 0x0385 }
            long r5 = com.p683ss.android.ugc.aweme.p1386ar.C23265f.f62212a     // Catch:{ ExecutionException -> 0x0385 }
            r7 = 0
            long r3 = r3 - r5
            com.p683ss.android.ugc.aweme.p1386ar.C23265f.m57213a(r3, r1)     // Catch:{ ExecutionException -> 0x0385 }
        L_0x0241:
            com.ss.android.ugc.aweme.commercialize.symphony.a r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62920k()     // Catch:{ Exception -> 0x0250 }
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Exception -> 0x0250 }
            java.util.List r4 = r0.getItems()     // Catch:{ Exception -> 0x0250 }
            r1.mo53952a(r3, r4)     // Catch:{ Exception -> 0x0250 }
        L_0x0250:
            java.util.List r1 = r0.getItems()     // Catch:{ Exception -> 0x02c9 }
            java.lang.String r3 = r0.getRequestId()     // Catch:{ Exception -> 0x02c9 }
            boolean r4 = com.p683ss.android.ugc.aweme.feed.C30436k.m71375f()     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x02c9
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x026a
            java.lang.String r1 = "Aweme_Items_is_null"
            com.p683ss.android.ugc.aweme.feed.C30436k.m71367a(r1, r3)     // Catch:{ Exception -> 0x02c9 }
            goto L_0x02c9
        L_0x026a:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x02c9 }
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch:{ Exception -> 0x02c9 }
            if (r1 != 0) goto L_0x0278
            java.lang.String r1 = "Aweme_is_null"
            com.p683ss.android.ugc.aweme.feed.C30436k.m71367a(r1, r3)     // Catch:{ Exception -> 0x02c9 }
            goto L_0x02c9
        L_0x0278:
            com.ss.android.ugc.aweme.feed.model.Video r4 = r1.getVideo()     // Catch:{ Exception -> 0x02c9 }
            if (r4 != 0) goto L_0x0284
            java.lang.String r1 = "video_is_null"
            com.p683ss.android.ugc.aweme.feed.C30436k.m71367a(r1, r3)     // Catch:{ Exception -> 0x02c9 }
            goto L_0x02c9
        L_0x0284:
            com.ss.android.ugc.aweme.feed.model.Video r4 = r1.getVideo()     // Catch:{ Exception -> 0x02c9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r4.getPlayAddr()     // Catch:{ Exception -> 0x02c9 }
            if (r4 != 0) goto L_0x0294
            java.lang.String r1 = "playAddr_is_null"
            com.p683ss.android.ugc.aweme.feed.C30436k.m71367a(r1, r3)     // Catch:{ Exception -> 0x02c9 }
            goto L_0x02c9
        L_0x0294:
            com.ss.android.ugc.aweme.feed.model.Video r4 = r1.getVideo()     // Catch:{ Exception -> 0x02c9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r4.getPlayAddr()     // Catch:{ Exception -> 0x02c9 }
            java.util.List r4 = r4.getUrlList()     // Catch:{ Exception -> 0x02c9 }
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)     // Catch:{ Exception -> 0x02c9 }
            if (r4 == 0) goto L_0x02ac
            java.lang.String r1 = "UrlList_is_null"
            com.p683ss.android.ugc.aweme.feed.C30436k.m71367a(r1, r3)     // Catch:{ Exception -> 0x02c9 }
            goto L_0x02c9
        L_0x02ac:
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()     // Catch:{ Exception -> 0x02c9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r1.getPlayAddr()     // Catch:{ Exception -> 0x02c9 }
            java.util.List r1 = r1.getUrlList()     // Catch:{ Exception -> 0x02c9 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x02c9 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x02c9 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x02c9 }
            if (r1 == 0) goto L_0x02c9
            java.lang.String r1 = "first_video_url_is_null"
            com.p683ss.android.ugc.aweme.feed.C30436k.m71367a(r1, r3)     // Catch:{ Exception -> 0x02c9 }
        L_0x02c9:
            com.ss.android.ugc.aweme.app.ah r1 = com.p683ss.android.ugc.aweme.app.C22930ah.m56380a()     // Catch:{ ExecutionException -> 0x0385 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x030d }
            com.ss.android.ugc.aweme.antiaddic.a.a r4 = r1.f61257a     // Catch:{ Exception -> 0x030d }
            boolean r4 = r4.mo47079b(r2)     // Catch:{ Exception -> 0x030d }
            if (r4 == 0) goto L_0x02de
            r4 = -1
            r1.mo47704a(r4)     // Catch:{ Exception -> 0x030d }
        L_0x02de:
            long r4 = r1.f61258b     // Catch:{ Exception -> 0x030d }
            r6 = 1
            long r4 = r4 + r6
            r1.mo47704a(r4)     // Catch:{ Exception -> 0x030d }
            com.ss.android.ugc.aweme.antiaddic.a.a r4 = r1.f61257a     // Catch:{ Exception -> 0x030d }
            r4.mo47078a(r2)     // Catch:{ Exception -> 0x030d }
            long r1 = r1.f61258b     // Catch:{ Exception -> 0x030d }
            if (r0 == 0) goto L_0x030e
            java.util.List r3 = r0.getItems()     // Catch:{ Exception -> 0x030d }
            if (r3 == 0) goto L_0x030e
            java.util.List r3 = r0.getItems()     // Catch:{ Exception -> 0x030d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x030d }
        L_0x02fd:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x030d }
            if (r4 == 0) goto L_0x030e
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x030d }
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r4     // Catch:{ Exception -> 0x030d }
            r4.setFeedCount(r1)     // Catch:{ Exception -> 0x030d }
            goto L_0x02fd
        L_0x030d:
        L_0x030e:
            if (r0 == 0) goto L_0x0326
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.preloadAds
            if (r1 == 0) goto L_0x0326
            com.ss.android.ugc.aweme.lego.a$f r1 = com.p683ss.android.ugc.aweme.lego.C35857a.m81001b()
            com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadTask r2 = new com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadTask
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r0.preloadAds
            r2.<init>(r3)
            com.ss.android.ugc.aweme.lego.a$f r1 = r1.mo74526a(r2)
            r1.mo74527a()
        L_0x0326:
            if (r0 == 0) goto L_0x033e
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.preloadAwemes
            if (r1 == 0) goto L_0x033e
            com.ss.android.ugc.aweme.lego.a$f r1 = com.p683ss.android.ugc.aweme.lego.C35857a.m81001b()
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.LiveAwesomeSplashPreloadTask r2 = new com.ss.android.ugc.aweme.commercialize.splash.livesplash.LiveAwesomeSplashPreloadTask
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r0.preloadAwemes
            r2.<init>(r3)
            com.ss.android.ugc.aweme.lego.a$f r1 = r1.mo74526a(r2)
            r1.mo74527a()
        L_0x033e:
            if (r0 == 0) goto L_0x035d
            boolean r1 = com.p683ss.android.ugc.aweme.net.C37793m.f96256b
            if (r1 != 0) goto L_0x0350
            com.p683ss.android.ugc.aweme.net.C37793m.f96256b = r13
            com.ss.android.ugc.aweme.net.m$a r1 = new com.ss.android.ugc.aweme.net.m$a
            r1.<init>(r13)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            p001a.C0013i.m16a(r1)
        L_0x0350:
            com.ss.android.ugc.aweme.feed.aa r1 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r2 = r0.getRequestId()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r0.logPb
            r1.mo60162a(r2, r3)
        L_0x035d:
            com.ss.android.ugc.aweme.commercialize.api.b r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62924o()
            java.lang.String r2 = "feed"
            java.util.List r3 = r0.getItems()
            r1.mo52800a(r2, r3)
            com.ss.android.ugc.aweme.commercialize.feed.d.a r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62925p()
            java.util.List r2 = r0.getItems()
            r1.mo53224a(r2)
            com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62909a()
            com.ss.android.ugc.aweme.commercialize.feed.ag r1 = r1.getAdComponentMonitorLog()
            java.util.List r2 = r0.getItems()
            r1.mo53187a(r2)
            return r0
        L_0x0385:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p683ss.android.ugc.aweme.base.api.C23453a.getCompatibleException(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.api.FeedApi.m70732a(int, long, long, int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, long, com.ss.android.ugc.aweme.feed.cache.c):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}
