package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchEpisodeDataList */
public class SearchEpisodeDataList extends SearchApiResult {
    @C17952c(mo34828a = "data")
    public List<EpisodeData> episodeDataList;
    @C17952c(mo34828a = "offset")
    public int offset;
    @C17952c(mo34828a = "total")
    private int total;

    public boolean getHasMore() {
        if (this.offset < this.total) {
            return true;
        }
        return false;
    }
}
