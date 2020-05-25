package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.StoryBlockInfo */
public class StoryBlockInfo implements Serializable {
    @C17952c(mo34828a = "life_story_block")
    public boolean isBlock;
    @C17952c(mo34828a = "life_story_blocked")
    public boolean isBlocked;

    public boolean isBlock() {
        return this.isBlock;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void setBlock(boolean z) {
        this.isBlock = z;
    }

    public void setBlocked(boolean z) {
        this.isBlocked = z;
    }
}
