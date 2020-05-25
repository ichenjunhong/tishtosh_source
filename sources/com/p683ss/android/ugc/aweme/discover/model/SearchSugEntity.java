package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SugExtraInfo;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchSugEntity */
public class SearchSugEntity {
    @C17952c(mo34828a = "content")
    public String content;
    public Map<String, String> extraParam;
    public boolean isMobShow;
    @C17952c(mo34828a = "word_record")
    public Word mWord;
    @C17952c(mo34828a = "pos")
    public List<Position> position;
    @C17952c(mo34828a = "extra_info")
    public SugExtraInfo sugExtraInfo;
    @C17952c(mo34828a = "sug_type")
    public String sugType;

    public boolean isHistoryType() {
        return TextUtils.equals(this.sugType, "history");
    }
}
