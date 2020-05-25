package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.share.ShareInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.C41408c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.MixStruct */
public class MixStruct implements Serializable {
    @C17952c(mo34828a = "author")
    public User author;
    @C17952c(mo34828a = "auto_mix_author_info")
    public C41408c autoMixAuthorInfo;
    @C17952c(mo34828a = "cover_url")
    public UrlModel cover;
    @C17952c(mo34828a = "create_time")
    public long createTime;
    @C17952c(mo34828a = "desc")
    public String desc;
    @C17952c(mo34828a = "extra")
    public String extra;
    @C17952c(mo34828a = "icon_url")
    public UrlModel icon;
    @C17952c(mo34828a = "mix_id")
    public String mixId;
    @C17952c(mo34828a = "mix_name")
    public String mixName;
    @C17952c(mo34828a = "mix_type")
    public int mixType;
    @C17952c(mo34828a = "share_info")
    public ShareInfo shareInfo;
    @C17952c(mo34828a = "statis")
    public MixStatisStruct statis;
    @C17952c(mo34828a = "status")
    public MixStatusStruct status;
    @C17952c(mo34828a = "update_time")
    public long updateTime;
}
