package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchInfo */
public final class HotSearchInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 4;
    @C17952c(mo34828a = "challenge_id")
    public String challengeId;
    @C17952c(mo34828a = "group_id")

    /* renamed from: id */
    public String f79728id;
    @C17952c(mo34828a = "label")
    public int label;
    @C17952c(mo34828a = "search_word")
    public String searchWord;
    @C17952c(mo34828a = "sentence")
    public String sentence;
    @C17952c(mo34828a = "value")
    public long value;
    @C17952c(mo34828a = "vb_rank")
    public int videoRank;
    @C17952c(mo34828a = "vb_rank_value")
    public long videoRankVV;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchInfo$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getId() {
        return this.f79728id;
    }

    public final int getLabel() {
        return this.label;
    }

    public final String getSearchWord() {
        return this.searchWord;
    }

    public final String getSentence() {
        return this.sentence;
    }

    public final long getValue() {
        return this.value;
    }

    public final int getVideoRank() {
        return this.videoRank;
    }

    public final long getVideoRankVV() {
        return this.videoRankVV;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setSearchWord(String str) {
        this.searchWord = str;
    }

    public final void setSentence(String str) {
        this.sentence = str;
    }

    public final void setValue(long j) {
        this.value = j;
    }

    public final void setVideoRank(int i) {
        this.videoRank = i;
    }

    public final void setVideoRankVV(long j) {
        this.videoRankVV = j;
    }
}
