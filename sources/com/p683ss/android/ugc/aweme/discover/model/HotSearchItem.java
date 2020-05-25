package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchItem */
public final class HotSearchItem extends BaseHotSearchItem implements Serializable {
    public static final Companion Companion = new Companion(null);
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "ad_data")
    private final HotSearchAdData adData;
    @C17952c(mo34828a = "can_extend_detail")
    private final boolean canExtendDetail;
    @C17952c(mo34828a = "challenge_id")
    private String challengeId;
    private boolean hasSentMob;
    @C17952c(mo34828a = "hot_value")
    private long hotValue;
    @C17952c(mo34828a = "group_id")

    /* renamed from: id */
    private String f74685id;
    private boolean isFromNearby;
    private boolean isTrending;
    private int label;
    private LogPbBean logPb;
    @C17952c(mo34828a = "position")
    private int position;
    @C17952c(mo34828a = "search_word")
    private String realSearchWord = "";
    @C17952c(mo34828a = "room_count")
    private int roomCount;
    @C17952c(mo34828a = "schema")
    private String schema = "";
    @C17952c(mo34828a = "top_aweme_id")
    private String topAwemeId;
    @C17952c(mo34828a = "word_cover")
    private UrlModel urlModel;
    @C17952c(mo34828a = "video_count")
    private int videoCount;
    private String word = "";
    @C17952c(mo34828a = "word_type")
    private int wordType = 1;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchItem$Companion */
    public static final class Companion implements Serializable {
        private Companion() {
        }

        public final HotSearchItem createPlaceHolder() {
            return new HotSearchItem();
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final HotSearchAdData getAdData() {
        return this.adData;
    }

    public final boolean getCanExtendDetail() {
        return this.canExtendDetail;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final boolean getHasSentMob() {
        return this.hasSentMob;
    }

    public final long getHotValue() {
        return this.hotValue;
    }

    public final String getId() {
        return this.f74685id;
    }

    public final int getLabel() {
        return this.label;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getRealSearchWord() {
        return this.realSearchWord;
    }

    public final int getRoomCount() {
        return this.roomCount;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTopAwemeId() {
        return this.topAwemeId;
    }

    public final UrlModel getUrlModel() {
        return this.urlModel;
    }

    public final int getVideoCount() {
        return this.videoCount;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getWordType() {
        return this.wordType;
    }

    public final boolean isFromNearby() {
        return this.isFromNearby;
    }

    public final boolean isTrending() {
        return this.isTrending;
    }

    public final boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = this.word;
        if (str == null) {
            return "PLACE_HOLDER";
        }
        return str;
    }

    public final int getType() {
        if (TextUtils.isEmpty(this.challengeId)) {
            return 0;
        }
        return 1;
    }

    public final boolean isHistory() {
        if (this.wordType == 11) {
            return true;
        }
        return false;
    }

    public final boolean isPlaceholder() {
        return TextUtils.isEmpty(this.word);
    }

    public final boolean isTop() {
        if (this.wordType == 2) {
            return true;
        }
        return false;
    }

    public final boolean isTopic() {
        if (this.wordType == 2) {
            return true;
        }
        return false;
    }

    public HotSearchItem() {
    }

    public final boolean getShowHistory() {
        if (!isHistory() || this.hotValue != 0) {
            return false;
        }
        return true;
    }

    public final int getHotSpotWordType() {
        if (isTop()) {
            return HotSpotCons.INSTANCE.getTYPE_TOPIC();
        }
        if (isTrending()) {
            return HotSpotCons.INSTANCE.getTYPE_RISING();
        }
        if (this.isFromNearby) {
            return HotSpotCons.INSTANCE.getTYPE_NEARBY();
        }
        if (isHistory()) {
            return HotSpotCons.INSTANCE.getTYPE_HISTORY();
        }
        return HotSpotCons.INSTANCE.getTYPE_NORMAL();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.word != null) {
            String str = this.word;
            if (str == null) {
                C52711k.m112234a();
            }
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        if (this.realSearchWord != null) {
            String str2 = this.realSearchWord;
            if (str2 == null) {
                C52711k.m112234a();
            }
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = (((((i5 + i2) * 31) + this.label) * 31) + Long.valueOf(this.hotValue).hashCode()) * 31;
        if (this.challengeId != null) {
            String str3 = this.challengeId;
            if (str3 == null) {
                C52711k.m112234a();
            }
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (hashCode + i3) * 31;
        if (this.urlModel != null) {
            UrlModel urlModel2 = this.urlModel;
            if (urlModel2 == null) {
                C52711k.m112234a();
            }
            i4 = urlModel2.hashCode();
        }
        return ((i6 + i4) * 31) + this.position;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setFromNearby(boolean z) {
        this.isFromNearby = z;
    }

    public final void setHasSentMob(boolean z) {
        this.hasSentMob = z;
    }

    public final void setHotValue(long j) {
        this.hotValue = j;
    }

    public final void setId(String str) {
        this.f74685id = str;
    }

    public final void setIsTrending(boolean z) {
        this.isTrending = z;
    }

    public final void setLabel(int i) {
        this.label = i;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRealSearchWord(String str) {
        this.realSearchWord = str;
    }

    public final void setRoomCount(int i) {
        this.roomCount = i;
    }

    public final void setTopAwemeId(String str) {
        this.topAwemeId = str;
    }

    public final void setTrending(boolean z) {
        this.isTrending = z;
    }

    public final void setUrlModel(UrlModel urlModel2) {
        this.urlModel = urlModel2;
    }

    public final void setVideoCount(int i) {
        this.videoCount = i;
    }

    public final void setWordType(int i) {
        this.wordType = i;
    }

    public final void setSchema(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.schema = str;
    }

    public final void setWord(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.word = str;
    }

    public final void setHistory(boolean z) {
        if (z) {
            this.wordType = 11;
        } else {
            this.wordType = 1;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C52711k.m112239a((Object) getClass(), (Object) obj.getClass()))) {
            return false;
        }
        HotSearchItem hotSearchItem = (HotSearchItem) obj;
        if (this.label != hotSearchItem.label) {
            return false;
        }
        if (this.word != null) {
            z = !C52711k.m112239a((Object) this.word, (Object) hotSearchItem.word);
        } else if (hotSearchItem.word != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (this.realSearchWord != null) {
            z2 = !C52711k.m112239a((Object) this.realSearchWord, (Object) hotSearchItem.realSearchWord);
        } else if (hotSearchItem.realSearchWord != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || this.hotValue != hotSearchItem.hotValue) {
            return false;
        }
        if (this.challengeId != null) {
            z3 = !C52711k.m112239a((Object) this.challengeId, (Object) hotSearchItem.challengeId);
        } else if (hotSearchItem.challengeId != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.position != hotSearchItem.position) {
            return false;
        }
        return true;
    }

    public HotSearchItem(String str, String str2, int i, long j) {
        C52711k.m112240b(str, "word");
        C52711k.m112240b(str2, "realSearchWord");
        this.word = str;
        this.realSearchWord = str2;
        this.label = i;
        this.hotValue = j;
    }
}
