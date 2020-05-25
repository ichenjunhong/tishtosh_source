package com.p683ss.android.ugc.aweme.story.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.app.api.C22982e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.model.StoryResponse */
public class StoryResponse extends BaseResponse implements C22982e {
    @C17952c(mo34828a = "enable_auto_open_window")
    public int autoOpenWindow = 1;
    @C17952c(mo34828a = "commerce_story_feed")
    C46654a commerceStoryFeed;
    @C17952c(mo34828a = "cursor")
    long cursor;
    @C17952c(mo34828a = "has_more")
    boolean hasMore;
    @C17952c(mo34828a = "latest_time")
    int latestTime;
    @C17952c(mo34828a = "request_id")
    String requestId;
    @C17952c(mo34828a = "story_feed")
    List<Story> storyFeed;
    @C17952c(mo34828a = "type")
    int type;

    /* renamed from: com.ss.android.ugc.aweme.story.model.StoryResponse$a */
    public static class C46654a {
        @C17952c(mo34828a = "entry_icon")

        /* renamed from: a */
        public UrlModel f117668a;
        @C17952c(mo34828a = "entry_text")

        /* renamed from: b */
        public String f117669b;
        @C17952c(mo34828a = "entry_open_url")

        /* renamed from: c */
        public String f117670c;
        @C17952c(mo34828a = "entry_web_url")

        /* renamed from: d */
        public String f117671d;
        @C17952c(mo34828a = "entry_web_title")

        /* renamed from: e */
        public String f117672e;
        @C17952c(mo34828a = "auto_open_window")

        /* renamed from: f */
        public boolean f117673f;
        @C17952c(mo34828a = "bubble_color")

        /* renamed from: g */
        public String f117674g;
        @C17952c(mo34828a = "bubble_text")

        /* renamed from: h */
        public String f117675h;
    }

    public C46654a getCommerceStoryFeed() {
        return this.commerceStoryFeed;
    }

    public long getCursor() {
        return this.cursor;
    }

    public int getLatestTime() {
        return this.latestTime;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getStatusCode() {
        return this.status_code;
    }

    public List<Story> getStoryFeed() {
        return this.storyFeed;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLatestTime(int i) {
        this.latestTime = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setStatusCode(int i) {
        this.status_code = i;
    }

    public void setStoryFeed(List<Story> list) {
        this.storyFeed = list;
    }
}
