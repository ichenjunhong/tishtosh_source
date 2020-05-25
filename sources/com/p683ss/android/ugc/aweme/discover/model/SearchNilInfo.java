package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchNilInfo */
public final class SearchNilInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String HIT_CORE_TABLE = HIT_CORE_TABLE;
    public static final String HIT_HEAT_SPEECH = HIT_HEAT_SPEECH;
    public static final String HIT_LIMIT = HIT_LIMIT;
    public static final int HIT_TYPE_SENSITIVE = 12;
    @C17952c(mo34828a = "search_nil_item")
    private String nilItem;
    @C17952c(mo34828a = "text_type")
    private Integer textType;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchNilInfo$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final String getHIT_CORE_TABLE() {
            return SearchNilInfo.HIT_CORE_TABLE;
        }

        public final String getHIT_HEAT_SPEECH() {
            return SearchNilInfo.HIT_HEAT_SPEECH;
        }

        public final String getHIT_LIMIT() {
            return SearchNilInfo.HIT_LIMIT;
        }

        public final int getHIT_TYPE_SENSITIVE() {
            return SearchNilInfo.HIT_TYPE_SENSITIVE;
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final String getNilItem() {
        return this.nilItem;
    }

    public final Integer getTextType() {
        return this.textType;
    }

    public final boolean isHate() {
        return HIT_HEAT_SPEECH.equals(this.nilItem);
    }

    public final boolean isHitCoreTable() {
        return HIT_CORE_TABLE.equals(this.nilItem);
    }

    public final boolean isHitLimit() {
        return HIT_LIMIT.equals(this.nilItem);
    }

    public final boolean isSensitive() {
        return Integer.valueOf(HIT_TYPE_SENSITIVE).equals(this.textType);
    }

    public final void setNilItem(String str) {
        this.nilItem = str;
    }

    public final void setTextType(Integer num) {
        this.textType = num;
    }
}
