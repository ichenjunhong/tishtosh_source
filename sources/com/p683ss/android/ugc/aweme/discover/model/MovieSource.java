package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.MovieSource */
public final class MovieSource {
    @C17952c(mo34828a = "album_id")
    public String albumId;
    @C17952c(mo34828a = "cid")
    public String cid;
    @C17952c(mo34828a = "cover")
    public UrlModel cover;
    @C17952c(mo34828a = "duration")
    public double duration;
    @C17952c(mo34828a = "episode_list")
    public List<EpisodeData> episodesList;
    @C17952c(mo34828a = "has_more")
    public boolean hasMore;
    @C17952c(mo34828a = "latest_seqs_count")
    public int latestSeqsCount;
    @C17952c(mo34828a = "mp_icon")
    public String mpIcon;
    @C17952c(mo34828a = "mp_id")
    public int mpId;
    @C17952c(mo34828a = "mp_name")
    public String mpName;
    @C17952c(mo34828a = "play_word")
    public String playWord;
    @C17952c(mo34828a = "release_date")
    public long releaseDate = -1;
    @C17952c(mo34828a = "schema")
    public String schema;
    @C17952c(mo34828a = "seqs_count")
    public int seqsCount;
    @C17952c(mo34828a = "status")
    public int status = -1;
    @C17952c(mo34828a = "title")
    public String title;

    public final EpisodeData getNewEpisodeData() {
        if (this.status == 1) {
            return getFirstEpisodeData();
        }
        return getLastEpisodeData();
    }

    public final boolean isDouyinSource() {
        EpisodeData firstEpisodeData = getFirstEpisodeData();
        if (firstEpisodeData == null || firstEpisodeData.schemaType != 1) {
            return false;
        }
        return true;
    }

    public final EpisodeData getFirstEpisodeData() {
        if (this.episodesList != null) {
            List<EpisodeData> list = this.episodesList;
            if (list == null) {
                C52711k.m112234a();
            }
            if (list.size() > 0) {
                List<EpisodeData> list2 = this.episodesList;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                return (EpisodeData) list2.get(0);
            }
        }
        return null;
    }

    public final EpisodeData getLastEpisodeData() {
        if (this.episodesList != null) {
            List<EpisodeData> list = this.episodesList;
            if (list == null) {
                C52711k.m112234a();
            }
            if (list.size() > 0) {
                List<EpisodeData> list2 = this.episodesList;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                List<EpisodeData> list3 = this.episodesList;
                if (list3 == null) {
                    C52711k.m112234a();
                }
                return (EpisodeData) list2.get(list3.size() - 1);
            }
        }
        return null;
    }
}
