package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.discover.model.EpisodeData */
public final class EpisodeData {
    @C17952c(mo34828a = "album_id")
    public String albumId;
    @C17952c(mo34828a = "definition")
    public String definition;
    @C17952c(mo34828a = "duration")
    public double duration;
    @C17952c(mo34828a = "episode_id")
    public String episodeId;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "online_time")
    public long onlineTime;
    @C17952c(mo34828a = "opening")
    public double opening;
    @C17952c(mo34828a = "schema_type")
    public int schemaType;
    @C17952c(mo34828a = "schema")
    public String scheme;
    @C17952c(mo34828a = "seq")
    public int seq;
    public String seqStr;
    @C17952c(mo34828a = "sub_title")
    public String subTitle;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "url")
    public String url;
    @C17952c(mo34828a = "vid")
    public String vid;

    public final String getSeqStr() {
        if (TextUtils.isEmpty(this.seqStr)) {
            return String.valueOf(this.seq);
        }
        return this.seqStr;
    }
}
