package com.p683ss.android.ugc.aweme.story.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.model.DateStory */
public class DateStory {
    @C17952c(mo34828a = "aweme_list")
    List<Aweme> awemeList;
    @C17952c(mo34828a = "story_date")
    long storyDate;

    public List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public long getStoryDate() {
        return this.storyDate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DateStory{storyDate=");
        sb.append(this.storyDate);
        sb.append(", awemeList=");
        sb.append(this.awemeList);
        sb.append('}');
        return sb.toString();
    }

    public void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public void setStoryDate(long j) {
        this.storyDate = j;
    }
}
