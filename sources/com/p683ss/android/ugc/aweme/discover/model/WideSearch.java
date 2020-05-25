package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.discover.model.WideSearch */
public class WideSearch extends BaseHotSearchItem {
    @C17952c(mo34828a = "challenge")
    public Challenge challenge;
    @C17952c(mo34828a = "music")
    public Music music;
    public int type;
    @C17952c(mo34828a = "user")
    public User user;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.WideSearch$WideSearchType */
    public interface WideSearchType {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WideSearch{user=");
        sb.append(this.user);
        sb.append(", challenge=");
        sb.append(this.challenge);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", type=");
        sb.append(this.type);
        sb.append('}');
        return sb.toString();
    }
}
