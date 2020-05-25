package com.p683ss.android.ugc.aweme.lancet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.lancet.f */
public final class C18985f {

    /* renamed from: a */
    public static final Map<String, Set<String>> f52290a;

    static {
        HashMap hashMap = new HashMap(70);
        f52290a = hashMap;
        m46163a(hashMap, "video_play", "homepage_follow");
        m46163a(f52290a, "video_play", "finish");
        m46163a(f52290a, "click", "comment");
        m46163a(f52290a, "comment", "homepage_follow");
        m46163a(f52290a, "like", "homepage_follow");
        m46163a(f52290a, "challenge_click", "homepage_follow");
        m46163a(f52290a, "song_cover", "homepage_follow");
        m46163a(f52290a, "head", "homepage_follow");
        m46163a(f52290a, LeakCanaryFileProvider.f132049i, "homepage_follow");
        m46163a(f52290a, "play_time", "homepage_follow");
        m46163a(f52290a, "share_video", "chat");
        m46163a(f52290a, "share_video", "copy");
        m46163a(f52290a, "share_video", "weixin_moments");
        m46163a(f52290a, "client_show", "homepage_fresh");
        m46163a(f52290a, "video_play", "homepage_fresh");
        m46163a(f52290a, "video_play", "finish");
        m46163a(f52290a, "click", "comment");
        m46163a(f52290a, "comment", "homepage_fresh");
        m46163a(f52290a, "like", "homepage_fresh");
        m46163a(f52290a, "challenge_click", "homepage_fresh");
        m46163a(f52290a, "song_cover", "homepage_fresh");
        m46163a(f52290a, "follow", "homepage_fresh");
        m46163a(f52290a, "head", "homepage_fresh");
        m46163a(f52290a, LeakCanaryFileProvider.f132049i, "homepage_fresh");
        m46163a(f52290a, "slide_left", "left");
        m46163a(f52290a, "play_time", "homepage_fresh");
        m46163a(f52290a, "share_video", "chat");
        m46163a(f52290a, "share_video", "copy");
        m46163a(f52290a, "share_video", "qq");
        m46163a(f52290a, "video_play", "homepage_hot");
        m46163a(f52290a, "video_play", "finish");
        m46163a(f52290a, "click", "comment");
        m46163a(f52290a, "comment", "homepage_hot");
        m46163a(f52290a, "like", "homepage_hot");
        m46163a(f52290a, "challenge_click", "homepage_hot");
        m46163a(f52290a, "song_cover", "homepage_hot");
        m46163a(f52290a, "follow", "homepage_hot");
        m46163a(f52290a, "head", "homepage_hot");
        m46163a(f52290a, LeakCanaryFileProvider.f132049i, "homepage_hot");
        m46163a(f52290a, "slide_left", "left");
        m46163a(f52290a, "play_time", "homepage_hot");
        m46163a(f52290a, "follow", "others_homepage");
        m46163a(f52290a, "share_video", "chat");
        m46163a(f52290a, "share_video", "copy");
        m46163a(f52290a, "share_video", "qq");
        m46163a(f52290a, "share_video", "qzone");
        m46163a(f52290a, "share_video", "weibo");
        m46163a(f52290a, "share_video", "weixin");
        m46163a(f52290a, "share_video", "weixin_moments");
        m46163a(f52290a, "dislike", "long_press");
        m46163a(f52290a, "dislike", "tap");
        m46163a(f52290a, "shoot", "direct_shoot");
        m46163a(f52290a, "shoot", "single_song");
        m46163a(f52290a, "shoot", "challenge");
        m46163a(f52290a, "publish", "start");
        m46163a(f52290a, "search", "general_search");
        m46163a(f52290a, "follow", "general_search");
        m46163a(f52290a, "enter_detail", "personal_homapage");
        m46163a(f52290a, "challenge_click", "general_search");
        m46163a(f52290a, "song_cover", "general_search");
        m46163a(f52290a, "search", "video");
        m46163a(f52290a, "feed_enter", "search_result");
        m46163a(f52290a, "search", "user");
        m46163a(f52290a, "follow", "discovery");
        m46163a(f52290a, "enter_detail", "personal_homepage");
        m46163a(f52290a, "search", "music");
        m46163a(f52290a, "song_cover", "search_result");
        m46163a(f52290a, "search", "challenge");
        m46163a(f52290a, "challenge_click", "search_result");
    }

    /* renamed from: a */
    private static void m46163a(Map<String, Set<String>> map, String str, String str2) {
        Set set = (Set) map.get(str);
        if (set == null) {
            HashSet hashSet = new HashSet();
            hashSet.add(str2);
            map.put(str, hashSet);
            return;
        }
        set.add(str2);
    }
}
