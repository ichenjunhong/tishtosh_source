package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17951b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.AdDefaultSearchStruct */
public class AdDefaultSearchStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @C17951b(mo34826a = StringJsonAdapterFactory.class)
    @C17952c(mo34828a = "ad_data")
    private AwemeRawAd adData;
    @C17952c(mo34828a = "default_word")
    private String defaultWord;
    @C17952c(mo34828a = "position")
    private int position;
    @C17952c(mo34828a = "search_word")
    private String searchWord;

    public AwemeRawAd getAdData() {
        return this.adData;
    }

    public String getDefaultWord() {
        return this.defaultWord;
    }

    public int getPosition() {
        return this.position;
    }

    public String getSearchWord() {
        return this.searchWord;
    }
}
