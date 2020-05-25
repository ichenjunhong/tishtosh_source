package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.C23460b;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveChallenge */
public class LiveChallenge {
    @C17952c(mo34828a = "cha_name")
    public String challengeName;
    @C23460b
    @C17952c(mo34828a = "cid")
    public String cid;
    @C17952c(mo34828a = "is_commerce")
    public boolean isCommerce;
    @C17952c(mo34828a = "schema")
    public String schema;
    @C17952c(mo34828a = "sub_type")
    public int subType;
    @C17952c(mo34828a = "type")
    public int type;

    public Challenge toAwemeChallenge() {
        Challenge challenge = new Challenge();
        challenge.setCid(this.cid);
        challenge.setChallengeName(this.challengeName);
        challenge.setSchema(this.schema);
        challenge.setType(this.type);
        challenge.setSubType(this.subType);
        return challenge;
    }
}
