package com.p683ss.android.ugc.aweme.feed.param;

/* renamed from: com.ss.android.ugc.aweme.feed.param.a */
public final class C30668a {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0346 A[Catch:{ JSONException -> 0x035c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0792  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x07a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.feed.param.C30669b m71946a(android.app.Activity r132) {
        /*
            android.content.Intent r0 = r132.getIntent()
            java.lang.String r1 = "refer"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "cid"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "ids"
            java.lang.String r4 = r0.getStringExtra(r4)
            java.lang.String r5 = "userid"
            java.lang.String r5 = r0.getStringExtra(r5)
            java.lang.String r6 = "sec_userid"
            java.lang.String r6 = r0.getStringExtra(r6)
            java.lang.String r7 = "video_from"
            java.lang.String r7 = r0.getStringExtra(r7)
            java.lang.String r8 = "video_challenge_profile_from"
            java.lang.String r8 = r0.getStringExtra(r8)
            java.lang.String r9 = "music_id"
            java.lang.String r9 = r0.getStringExtra(r9)
            java.lang.String r10 = "sticker_id"
            java.lang.String r10 = r0.getStringExtra(r10)
            java.lang.String r11 = "challenge_id"
            java.lang.String r11 = r0.getStringExtra(r11)
            java.lang.String r12 = "movie_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            java.lang.String r13 = "extra_tutorial_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            java.lang.String r14 = "creation_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            java.lang.String r15 = "channel_id"
            r16 = r14
            r14 = 0
            int r15 = r0.getIntExtra(r15, r14)
            java.lang.String r14 = "enter_method"
            java.lang.String r14 = r0.getStringExtra(r14)
            r18 = r15
            java.lang.String r15 = "poi_id"
            java.lang.String r15 = r0.getStringExtra(r15)
            r19 = r13
            java.lang.String r13 = "spu_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r20 = r12
            java.lang.String r12 = "rate_type"
            r21 = r13
            r13 = 1
            int r12 = r0.getIntExtra(r12, r13)
            java.lang.String r13 = "page_size"
            r22 = r12
            r12 = 20
            int r12 = r0.getIntExtra(r13, r12)
            java.lang.String r13 = "promotion_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r23 = r13
            java.lang.String r13 = "product_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r24 = r13
            java.lang.String r13 = "carrier_type"
            java.lang.String r13 = r0.getStringExtra(r13)
            r25 = r13
            java.lang.String r13 = "refer_seed_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r26 = r13
            java.lang.String r13 = "refer_seed_name"
            java.lang.String r13 = r0.getStringExtra(r13)
            r27 = r13
            java.lang.String r13 = "data_type"
            java.lang.String r13 = r0.getStringExtra(r13)
            r28 = r13
            java.lang.String r13 = "entrance_info"
            java.lang.String r13 = r0.getStringExtra(r13)
            r29 = r13
            java.lang.String r13 = "video_type"
            r30 = r12
            r12 = -1
            int r13 = r0.getIntExtra(r13, r12)
            java.lang.String r12 = "from_uid"
            java.lang.String r12 = r0.getStringExtra(r12)
            r31 = r12
            java.lang.String r12 = "from_token"
            r0.getStringExtra(r12)
            java.lang.String r12 = "query_aweme_mode"
            java.lang.String r12 = r0.getStringExtra(r12)
            r32 = r12
            java.lang.String r12 = "account_type"
            java.lang.String r12 = r0.getStringExtra(r12)
            r33 = r12
            java.lang.String r12 = "tab_name"
            java.lang.String r12 = r0.getStringExtra(r12)
            r34 = r12
            java.lang.String r12 = "push_params"
            java.lang.String r12 = r0.getStringExtra(r12)
            r35 = r12
            java.lang.String r12 = "like_enter_method"
            java.lang.String r12 = r0.getStringExtra(r12)
            r36 = r12
            java.lang.String r12 = "content_source"
            java.lang.String r12 = r0.getStringExtra(r12)
            r37 = r12
            java.lang.String r12 = "user_id_list"
            java.util.ArrayList r12 = r0.getStringArrayListExtra(r12)
            r38 = r12
            java.lang.String r12 = "enter_from_request_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r39 = r12
            java.lang.String r12 = "previous_page"
            java.lang.String r12 = r0.getStringExtra(r12)
            r40 = r12
            java.lang.String r12 = "search_keyword"
            java.lang.String r12 = r0.getStringExtra(r12)
            r41 = r12
            java.lang.String r12 = "extra_previous_page_position"
            java.lang.String r12 = r0.getStringExtra(r12)
            r42 = r12
            java.lang.String r12 = "from_adsapp_activity"
            r43 = r13
            r13 = 0
            boolean r12 = r0.getBooleanExtra(r12, r13)
            r44 = r12
            java.lang.String r12 = "from_post_list"
            int r12 = r0.getIntExtra(r12, r13)
            java.lang.String r13 = "related_gid"
            java.lang.String r13 = r0.getStringExtra(r13)
            r46 = r13
            java.lang.String r13 = "type"
            r47 = r12
            r12 = 0
            int r13 = r0.getIntExtra(r13, r12)
            r48 = r13
            java.lang.String r13 = "is_recommend"
            boolean r13 = r0.getBooleanExtra(r13, r12)
            java.lang.String r12 = "cell_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r49 = r12
            java.lang.String r12 = "task_type"
            r50 = r13
            r13 = 0
            int r12 = r0.getIntExtra(r12, r13)
            java.lang.String r13 = "micro_game_station_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r51 = r13
            java.lang.String r13 = "micro_game_station_hashtag"
            java.lang.String r13 = r0.getStringExtra(r13)
            r52 = r13
            java.lang.String r13 = "feeds_aweme_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r53 = r13
            java.lang.String r13 = "hot_search_key"
            java.lang.String r13 = r0.getStringExtra(r13)
            r54 = r13
            java.lang.String r13 = "item_id_list"
            java.lang.String r13 = r0.getStringExtra(r13)
            r55 = r13
            java.lang.String r13 = "is_hot_search_key"
            r56 = r12
            r12 = 0
            boolean r13 = r0.getBooleanExtra(r13, r12)
            r57 = r13
            java.lang.String r13 = "hot_is_ad"
            boolean r13 = r0.getBooleanExtra(r13, r12)
            java.lang.String r12 = "outer_aweme_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r58 = r12
            java.lang.String r12 = "micro_game_station_count"
            r59 = r13
            r13 = 10
            int r12 = r0.getIntExtra(r12, r13)
            java.lang.String r13 = "micro_game_station_cursor"
            r60 = r12
            r12 = 0
            int r13 = r0.getIntExtra(r13, r12)
            java.lang.String r12 = "activity_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r61 = r12
            java.lang.String r12 = "new_source_type"
            java.lang.String r12 = r0.getStringExtra(r12)
            r62 = r12
            java.lang.String r12 = "new_source_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r63 = r12
            java.lang.String r12 = "comment_deleted"
            r64 = r13
            r13 = 0
            int r12 = r0.getIntExtra(r12, r13)
            java.lang.String r13 = "react_session_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            r65 = r13
            java.lang.String r13 = "poi_leaderboard"
            r66 = r12
            r12 = 0
            boolean r13 = r0.getBooleanExtra(r13, r12)
            java.lang.String r12 = "city_code"
            java.lang.String r12 = r0.getStringExtra(r12)
            r67 = r13
            java.lang.String r13 = "poi_class_code"
            r68 = r12
            r12 = 0
            int r13 = r0.getIntExtra(r13, r12)
            java.lang.String r12 = "district_code"
            java.lang.String r12 = r0.getStringExtra(r12)
            r69 = r12
            java.lang.String r12 = "sub_class"
            java.lang.String r12 = r0.getStringExtra(r12)
            r70 = r12
            java.lang.String r12 = "backend_type_code"
            java.lang.String r12 = r0.getStringExtra(r12)
            r71 = r12
            java.lang.String r12 = "page_poi_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r72 = r12
            java.lang.String r12 = "poi_street_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r73 = r12
            java.lang.String r12 = "poi_street_name"
            java.lang.String r12 = r0.getStringExtra(r12)
            r74 = r12
            java.lang.String r12 = "poi_cover_aweme_id"
            r76 = r13
            r75 = r14
            r13 = 0
            long r77 = r0.getLongExtra(r12, r13)
            java.lang.Long r12 = java.lang.Long.valueOf(r77)
            java.lang.String r13 = "poi_street_longitude"
            r79 = r15
            r14 = 0
            r80 = r12
            double r12 = r0.getDoubleExtra(r13, r14)
            r81 = r12
            java.lang.String r12 = "poi_street_latidute"
            double r12 = r0.getDoubleExtra(r12, r14)
            java.lang.String r14 = "poi_news"
            r15 = 0
            boolean r14 = r0.getBooleanExtra(r14, r15)
            java.lang.String r15 = "card_type"
            java.lang.String r15 = r0.getStringExtra(r15)
            r83 = r15
            java.lang.String r15 = "object_id"
            java.lang.String r15 = r0.getStringExtra(r15)
            r84 = r15
            java.lang.String r15 = "is_trending"
            r85 = r14
            r14 = 0
            boolean r15 = r0.getBooleanExtra(r15, r14)
            java.lang.String r14 = "mix_from_order"
            java.lang.String r14 = r0.getStringExtra(r14)
            r86 = r15
            java.lang.String r15 = "cur_poi_lat"
            java.lang.String r15 = r0.getStringExtra(r15)
            r87 = r14
            java.lang.String r14 = "cur_poi_lng"
            java.lang.String r14 = r0.getStringExtra(r14)
            r88 = r14
            java.lang.String r14 = "process_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r89 = r14
            java.lang.String r14 = "isFromSearchTopic"
            r90 = r15
            r15 = 0
            boolean r14 = r0.getBooleanExtra(r14, r15)
            java.lang.String r15 = "live_enter_method"
            java.lang.String r15 = r0.getStringExtra(r15)
            r91 = r15
            java.lang.String r15 = "level1_comment_deleted"
            r92 = r14
            r14 = 0
            int r15 = r0.getIntExtra(r15, r14)
            java.lang.String r14 = "show_vote"
            java.lang.String r14 = r0.getStringExtra(r14)     // Catch:{ Exception -> 0x02c3 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ Exception -> 0x02c3 }
            r93 = r12
            r12 = 1
            if (r14 != r12) goto L_0x02c6
            r14 = 1
            goto L_0x02c7
        L_0x02c3:
            r93 = r12
            r12 = 1
        L_0x02c6:
            r14 = 0
        L_0x02c7:
            java.lang.String r13 = "comment_force_open_reply"
            r95 = r14
            r14 = 0
            int r13 = r0.getIntExtra(r13, r14)
            if (r13 != r12) goto L_0x02d4
            r13 = 1
            goto L_0x02d5
        L_0x02d4:
            r13 = 0
        L_0x02d5:
            java.lang.String r14 = "show_vote"
            java.lang.String r14 = r0.getStringExtra(r14)     // Catch:{ Exception -> 0x02e5 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ Exception -> 0x02e5 }
            if (r14 != r12) goto L_0x02e3
            r14 = 1
            goto L_0x02e7
        L_0x02e3:
            r14 = 0
            goto L_0x02e7
        L_0x02e5:
            r14 = r95
        L_0x02e7:
            java.lang.String r12 = "from_group_id"
            java.lang.String r12 = r0.getStringExtra(r12)
            r96 = r13
            java.lang.String r13 = "refer_commodity_id"
            java.lang.String r13 = r0.getStringExtra(r13)
            java.util.HashMap r45 = new java.util.HashMap
            r45.<init>()
            r97 = r15
            java.lang.String r15 = "feed_param_log_extra"
            java.io.Serializable r15 = r0.getSerializableExtra(r15)
            r98 = r13
            boolean r13 = r15 instanceof java.util.HashMap
            if (r13 == 0) goto L_0x030c
            r45 = r15
            java.util.HashMap r45 = (java.util.HashMap) r45
        L_0x030c:
            r13 = r45
            java.util.HashMap r45 = new java.util.HashMap
            r45.<init>()
            r99 = r13
            java.lang.String r13 = "feed_param_extra"
            java.io.Serializable r13 = r0.getSerializableExtra(r13)
            boolean r13 = r13 instanceof java.util.HashMap
            if (r13 == 0) goto L_0x0323
            r45 = r15
            java.util.HashMap r45 = (java.util.HashMap) r45
        L_0x0323:
            r13 = r45
            java.lang.String r15 = "video_current_position"
            r100 = r12
            r101 = r13
            r12 = 0
            long r12 = r0.getLongExtra(r15, r12)
            java.lang.String r15 = "tracker_data"
            java.lang.String r15 = r0.getStringExtra(r15)
            r102 = r12
            java.lang.String r12 = "isChain"
            r13 = 0
            boolean r12 = r0.getBooleanExtra(r12, r13)
            boolean r13 = android.text.TextUtils.isEmpty(r15)     // Catch:{ JSONException -> 0x035c }
            if (r13 != 0) goto L_0x035c
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x035c }
            r13.<init>(r15)     // Catch:{ JSONException -> 0x035c }
            r104 = r12
            java.lang.String r12 = "previous_page"
            boolean r12 = r13.has(r12)     // Catch:{ JSONException -> 0x035e }
            if (r12 == 0) goto L_0x035e
            java.lang.String r12 = "previous_page"
            java.lang.String r12 = r13.getString(r12)     // Catch:{ JSONException -> 0x035e }
            goto L_0x0360
        L_0x035c:
            r104 = r12
        L_0x035e:
            r12 = r40
        L_0x0360:
            java.lang.String r13 = "enter_from"
            java.lang.String r13 = r0.getStringExtra(r13)
            if (r13 != 0) goto L_0x036a
            java.lang.String r13 = ""
        L_0x036a:
            r105 = r15
            java.lang.String r15 = "tab_text"
            java.lang.String r15 = r0.getStringExtra(r15)
            r106 = r15
            java.lang.String r15 = "extra_detail_title_text"
            java.lang.String r15 = r0.getStringExtra(r15)
            r107 = r15
            java.lang.String r15 = "detail_cell_type"
            r108 = r14
            r14 = 0
            int r15 = r0.getIntExtra(r15, r14)
            r109 = r15
            java.lang.String r15 = "key_has_more"
            int r15 = r0.getIntExtra(r15, r14)
            java.lang.String r14 = "poi_tab_type"
            java.lang.String r14 = r0.getStringExtra(r14)
            r110 = r15
            java.lang.String r15 = "page_type"
            java.lang.String r15 = r0.getStringExtra(r15)
            r111 = r15
            java.lang.String r15 = "video_from_dcd"
            r112 = r14
            r14 = 0
            boolean r15 = r0.getBooleanExtra(r15, r14)
            java.lang.String r14 = "extra_search_result_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r113 = r14
            java.lang.String r14 = "extra_list_result_type"
            java.lang.String r14 = r0.getStringExtra(r14)
            r114 = r14
            java.lang.String r14 = "extra_list_item_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r115 = r14
            java.lang.String r14 = "extra_list_item_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r116 = r14
            java.lang.String r14 = "extra_search_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r117 = r14
            java.lang.String r14 = "impr_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r118 = r14
            java.lang.String r14 = "extra_follow_uid_list"
            java.lang.String r14 = r0.getStringExtra(r14)
            java.util.ArrayList r40 = new java.util.ArrayList
            r40.<init>()
            boolean r45 = android.text.TextUtils.isEmpty(r14)
            if (r45 != 0) goto L_0x03f4
            r119 = r15
            java.lang.String r15 = "-"
            java.lang.String[] r15 = r14.split(r15)
            java.util.List r40 = java.util.Arrays.asList(r15)
            goto L_0x03f6
        L_0x03f4:
            r119 = r15
        L_0x03f6:
            r120 = r40
            java.lang.String r15 = "extra_follow_blue_dot_list"
            java.lang.String r15 = r0.getStringExtra(r15)
            java.util.ArrayList r40 = new java.util.ArrayList
            r40.<init>()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0413
            java.lang.String r14 = "-"
            java.lang.String[] r14 = r15.split(r14)
            java.util.List r40 = java.util.Arrays.asList(r14)
        L_0x0413:
            r14 = r40
            java.lang.String r15 = "extra_selected_follow_uid"
            java.lang.String r15 = r0.getStringExtra(r15)
            r121 = r15
            java.lang.String r15 = "extra_is_follow_sky_light"
            r122 = r14
            r14 = 0
            boolean r15 = r0.getBooleanExtra(r15, r14)
            java.lang.String r14 = "extra_author_name"
            java.lang.String r14 = r0.getStringExtra(r14)
            r123 = r15
            java.lang.String r15 = "extra_has_latest_following_user"
            r124 = r14
            r14 = 0
            boolean r15 = r0.getBooleanExtra(r15, r14)
            r125 = r15
            java.lang.String r15 = "show_donation"
            boolean r15 = r0.getBooleanExtra(r15, r14)
            java.lang.String r14 = "page_challenge_mention"
            boolean r14 = android.text.TextUtils.equals(r1, r14)
            if (r14 == 0) goto L_0x044f
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L_0x0452
        L_0x044d:
            r1 = r13
            goto L_0x0452
        L_0x044f:
            if (r1 != 0) goto L_0x0452
            goto L_0x044d
        L_0x0452:
            java.lang.String r14 = "key_from_chat_room_playing"
            r126 = r15
            r15 = 0
            boolean r14 = r0.getBooleanExtra(r14, r15)
            java.lang.String r15 = "key_from_chat_room_real_aid"
            java.lang.String r15 = r0.getStringExtra(r15)
            r127 = r15
            java.lang.String r15 = "from_recommend_card"
            r128 = r14
            r14 = 0
            int r15 = r0.getIntExtra(r15, r14)
            java.lang.String r17 = ""
            java.lang.String r14 = "special_topic_region"
            boolean r14 = r0.hasExtra(r14)
            if (r14 == 0) goto L_0x047c
            java.lang.String r14 = "special_topic_region"
            java.lang.String r17 = r0.getStringExtra(r14)
        L_0x047c:
            r129 = r15
            r14 = r17
            java.lang.String r15 = "video_cover_transition"
            r130 = r14
            r14 = 0
            boolean r15 = r0.getBooleanExtra(r15, r14)
            java.lang.String r14 = "feed_group_id"
            java.lang.String r14 = r0.getStringExtra(r14)
            r131 = r14
            com.ss.android.ugc.aweme.feed.param.b r14 = new com.ss.android.ugc.aweme.feed.param.b
            r14.<init>()
            com.ss.android.ugc.aweme.feed.param.b r1 = r14.setEventType(r1)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setAid(r2)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setCid(r3)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setIds(r4)
            if (r5 != 0) goto L_0x04aa
            java.lang.String r5 = ""
        L_0x04aa:
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setUid(r5)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setSecUid(r6)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setFrom(r7)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setChallengeProfileFrom(r8)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setMusicId(r9)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setStickerId(r10)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setChallengeId(r11)
            r2 = r75
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setEnterMethodValue(r2)
            r2 = r79
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPoiId(r2)
            r2 = r21
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setSpuId(r2)
            r2 = r22
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setRateType(r2)
            r2 = r30
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPageSize(r2)
            r2 = r20
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setMvId(r2)
            r2 = r19
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setTutorialId(r2)
            r2 = r16
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setCreationId(r2)
            r2 = r18
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setChannelId(r2)
            r2 = r24
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setProductId(r2)
            r2 = r23
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPromotionId(r2)
            r2 = r25
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setCarrierType(r2)
            r2 = r26
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setReferSeedId(r2)
            r2 = r27
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setReferSeedName(r2)
            r2 = r28
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setDataType(r2)
            r2 = r29
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setEntranceInfo(r2)
            r2 = r43
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setVideoType(r2)
            r2 = r31
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setShareUserId(r2)
            r2 = r32
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setQueryAwemeMode(r2)
            r2 = r33
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setAccountType(r2)
            r2 = r38
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setUserList(r2)
            r2 = r34
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setTabName(r2)
            r2 = r35
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPushParams(r2)
            r2 = r36
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setLikeEnterMethod(r2)
            r2 = r37
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setContentSource(r2)
            r2 = r39
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setEnterFromRequestId(r2)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPreviousPage(r12)
            r2 = r41
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setSearchKeyword(r2)
            r2 = r42
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPreviousPagePosition(r2)
            r2 = r44
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setFromAdsActivity(r2)
            r2 = r50
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setRecommend(r2)
            r2 = r48
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setType(r2)
            r2 = r49
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setCellId(r2)
            java.lang.String r2 = "index"
            r3 = -1
            int r0 = r0.getIntExtra(r2, r3)
            com.ss.android.ugc.aweme.feed.param.b r0 = r1.setIndex(r0)
            r1 = r47
            r2 = 1
            if (r1 != r2) goto L_0x059c
            r1 = 1
            goto L_0x059d
        L_0x059c:
            r1 = 0
        L_0x059d:
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setFromPostList(r1)
            r1 = r56
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setTaskType(r1)
            r3 = 2
            if (r1 != r3) goto L_0x05ac
            r3 = 1
            goto L_0x05ad
        L_0x05ac:
            r3 = 0
        L_0x05ad:
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setShowCommentAfterOpen(r3)
            r3 = 3
            if (r1 != r3) goto L_0x05b5
            goto L_0x05b6
        L_0x05b5:
            r2 = 0
        L_0x05b6:
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setShowShareAfterOpen(r2)
            r1 = r46
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setRelatedId(r1)
            r1 = r51
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setMicroAppId(r1)
            r1 = r52
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setHashTagName(r1)
            r1 = r60
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCount(r1)
            r1 = r53
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setFeedsAwemeId(r1)
            r1 = r54
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setHotSearch(r1)
            r1 = r55
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setItemIdList(r1)
            r1 = r57
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setFromHotSearchRanking(r1)
            r1 = r64
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCursor(r1)
            r14 = r108
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setShowVote(r14)
            r1 = r59
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setAdSpot(r1)
            r1 = r58
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setOutAwemeId(r1)
            r1 = r102
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setVideoCurrentPosition(r1)
            r1 = r61
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setActivityId(r1)
            r1 = r62
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setNewSourceType(r1)
            r1 = r63
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setNewSourceId(r1)
            r1 = r66
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCommentDeleted(r1)
            r1 = r100
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setFromGroupId(r1)
            r1 = r98
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setReferCommodityId(r1)
            r1 = r65
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setReactSessionId(r1)
            r1 = r68
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCityCode(r1)
            r1 = r76
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setPoiClassCode(r1)
            r1 = r67
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setShowVideoRank(r1)
            r1 = r69
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setDistrictCode(r1)
            r1 = r70
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setSubClass(r1)
            r1 = r105
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setTracker(r1)
            r1 = r97
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setLevel1CommentDeleted(r1)
            r12 = r96
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCommentForceOpenReply(r12)
            r1 = r104
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setChain(r1)
            r1 = r112
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setPoiTabType(r1)
            r1 = r111
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setPoiPageType(r1)
            r1 = r106
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setTabText(r1)
            r1 = r107
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setDetailTitleText(r1)
            r1 = r109
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCellDetailType(r1)
            r1 = r71
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setBackendType(r1)
            r1 = r72
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setPagePoiId(r1)
            r1 = r73
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setStreetId(r1)
            r1 = r93
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setStreetLatitude(r1)
            r1 = r81
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setStreetLongitude(r1)
            r1 = r90
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCurPoiLat(r1)
            r1 = r88
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCurPoiLng(r1)
            r1 = r74
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setStreetName(r1)
            r1 = r80
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setStreetAwemeId(r1)
            r1 = r85
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setShowPoiNews(r1)
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setHotEnterMethod(r13)
            r1 = r83
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setCardType(r1)
            r1 = r126
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setNeedShowDonation(r1)
            r1 = r84
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setObjectId(r1)
            r1 = r87
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setMixFromOrder(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r86)
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setTrending(r1)
            r1 = r89
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setProcessId(r1)
            r1 = r119
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setVideoFromDcd(r1)
            r2 = r113
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setSearchResultId(r2)
            r2 = r114
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setListResultType(r2)
            r2 = r115
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setListItemId(r2)
            r2 = r116
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setSearchThirdItemId(r2)
            r2 = r117
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setSearchId(r2)
            r2 = r130
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setSpecialTopicRegion(r2)
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setVideoFromDcd(r1)
            r1 = r128
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setIsFromChatRoomPlaying(r1)
            r1 = r127
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setChatRoomPlayingRealAid(r1)
            r1 = r92
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setIsFromSearchTopic(r1)
            r1 = r120
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setUidList(r1)
            r1 = r122
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setBlueDotList(r1)
            r1 = r121
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setSelectedUid(r1)
            r1 = r124
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setAuthorName(r1)
            r1 = r125
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setHasLatestFollowingUser(r1)
            r1 = r110
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setHasMore(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r123)
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setIsfollowSkyLight(r1)
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setEnableDetailActivityVideoCoverTransition(r15)
            r1 = r118
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setmImprId(r1)
            r1 = r99
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setLogExtra(r1)
            r1 = r101
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setExtra(r1)
            r1 = r131
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setFeedGroupIdForMixVideo(r1)
            r1 = r129
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setFromRecommendCard(r1)
            r1 = r91
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setLiveEnterMethodValue(r1)
            java.lang.String r1 = "context"
            r2 = r132
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
            java.lang.String r1 = "param"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            android.app.Activity r1 = com.p683ss.android.ugc.aweme.base.utils.C23729p.m58248a(r132)
            if (r1 == 0) goto L_0x07a8
            android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
            android.arch.lifecycle.y r1 = android.arch.lifecycle.C0214z.m440a(r1)
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.FeedParamProvider> r2 = com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.class
            android.arch.lifecycle.x r1 = r1.mo359a(r2)
            java.lang.String r2 = "ViewModelProviders.of(ac…aramProvider::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.feed.param.FeedParamProvider r1 = (com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider) r1
            r1.f80146a = r0
            return r0
        L_0x07a8:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.param.C30668a.m71946a(android.app.Activity):com.ss.android.ugc.aweme.feed.param.b");
    }
}
