package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct */
public class HotSearchSprintStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @C17952c(mo34828a = "followers")
    public List<User> hitRankPeoples;
    @C17952c(mo34828a = "sprint")
    public int sprint;

    public List<User> getHitRankPeoples() {
        return this.hitRankPeoples;
    }

    public int getSprint() {
        return this.sprint;
    }

    public void setHitRankPeoples(List<User> list) {
        this.hitRankPeoples = list;
    }

    public void setSprint(int i) {
        this.sprint = i;
    }
}
