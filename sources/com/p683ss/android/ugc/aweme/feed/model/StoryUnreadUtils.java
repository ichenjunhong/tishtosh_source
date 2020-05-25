package com.p683ss.android.ugc.aweme.feed.model;

import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.feed.model.StoryUnreadUtils */
public class StoryUnreadUtils {
    public static boolean hasUnreadStory(User user) {
        if (user == null || user.isHasUnreadStory() == null) {
            return false;
        }
        return user.isHasUnreadStory().booleanValue();
    }

    public static boolean hasUnreadStoryWithCheck(User user, User user2) {
        if (C47915gg.m103664m(user2) && C47915gg.m103664m(user) && user.isHasUnreadStory() != null) {
            user2.setHasUnreadStory(user.isHasUnreadStory().booleanValue());
        }
        return hasUnreadStory(user2);
    }
}
