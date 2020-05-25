package com.bytedance.android.livesdk.live.model;

import com.bytedance.common.utility.C9431p;
import com.google.gson.p1076a.C17952c;
import java.util.HashMap;
import java.util.Map;

public class FeedDraw {
    @C17952c(mo34828a = "settings")
    private Map<String, Integer> settings = new HashMap();
    @C17952c(mo34828a = "url")
    private String url;

    public Map<String, Integer> getSettings() {
        return this.settings;
    }

    public String getUrl() {
        return this.url;
    }

    public static FeedDraw defaultInstance() {
        FeedDraw feedDraw = new FeedDraw();
        feedDraw.url = "";
        return feedDraw;
    }

    public static boolean needCollectUnRead(String str) {
        if (!C9431p.m18664a(str) && !str.startsWith("homepage_follow_stream")) {
            return true;
        }
        return false;
    }

    public boolean isSupportedRequestFrom(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        Integer num = (Integer) this.settings.get(str);
        if (num == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static String conventRequestFrom(String str, String str2) {
        if ("homepage_hot".equals(str) && "video_head".equals(str2)) {
            return "homepage_hot_head_draw";
        }
        if (!"live_merge".equals(str)) {
            return "";
        }
        if ("live_cover".equals(str2)) {
            return "feed_draw";
        }
        return "";
    }
}
