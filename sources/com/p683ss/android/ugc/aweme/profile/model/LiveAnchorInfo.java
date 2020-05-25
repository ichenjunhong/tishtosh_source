package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.LiveAnchorInfo */
public class LiveAnchorInfo implements Serializable {
    @C17952c(mo34828a = "scheduled_master_switch")
    private boolean globalSwitch;
    @C17952c(mo34828a = "scheduled_profile_switch")
    private boolean profileSwitch;
    @C17952c(mo34828a = "scheduled_time_text")
    private String scheduledTimeText;

    public String getScheduledTimeText() {
        return this.scheduledTimeText;
    }

    public boolean isGlobalSwitch() {
        return this.globalSwitch;
    }

    public boolean isProfileSwitch() {
        return this.profileSwitch;
    }

    public void setGlobalSwitch(boolean z) {
        this.globalSwitch = z;
    }

    public void setProfileSwitch(boolean z) {
        this.profileSwitch = z;
    }

    public void setScheduledTimeText(String str) {
        this.scheduledTimeText = str;
    }
}
