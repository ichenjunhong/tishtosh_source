package com.p683ss.android.ugc.aweme.friends.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList */
public final class RecommendUserDialogList extends RecommendList {
    @C17952c(mo34828a = "next_cursor")
    private int nextCursor;
    @C17952c(mo34828a = "users")
    private List<? extends User> recommendUsers;

    public final int getCursor() {
        return this.nextCursor;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final List<User> getRecommendUsers() {
        return this.recommendUsers;
    }

    public final List<User> getUserList() {
        if (this.recommendUsers == null) {
            this.recommendUsers = new ArrayList(0);
        }
        return this.recommendUsers;
    }

    public final void setCursor(int i) {
        this.nextCursor = i;
    }

    public final void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public final void setRecommendUsers(List<? extends User> list) {
        this.recommendUsers = list;
    }

    public final void setUserList(List<User> list) {
        this.recommendUsers = list;
    }
}
