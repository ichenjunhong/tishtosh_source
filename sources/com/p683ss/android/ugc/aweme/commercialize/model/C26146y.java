package com.p683ss.android.ugc.aweme.commercialize.model;

import com.bytedance.p879t.p881b.C13233a;
import com.bytedance.p879t.p881b.C13234b;
import com.bytedance.p879t.p881b.C13238f;
import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.y */
public final class C26146y implements Serializable {
    @C17952c(mo34828a = "ad_choice")
    public C26142v adChoiceIcon;
    @C17952c(mo34828a = "adVerifications")
    public List<C13233a> adVerificationList;
    @C17952c(mo34828a = "creative_type")
    @C17950a(mo34824a = false)
    public int creative_type = 4;
    @C17952c(mo34828a = "impression_type")
    @C17950a(mo34824a = false)
    public int impression_type = 4;
    @C17952c(mo34828a = "local_cache_loaded")
    public boolean loaded;
    public transient boolean loading;
    @C17952c(mo34828a = "providerType")
    public int providerType = 2;
    @C17952c(mo34828a = "local_cache_vast")
    public C13238f vast;
    @C17952c(mo34828a = "vastContent")
    @C17950a(mo34824a = false)
    public String vastContent;
    @C17952c(mo34828a = "vastUrl")
    @C17950a(mo34824a = false)
    public String vastUrl;
    @C17952c(mo34828a = "vastWrapperCount")
    @C17950a(mo34824a = false)
    public int vastWrapperCount = 1;

    public final List<C13234b> getCreativeList() {
        if (this.vast == null) {
            return null;
        }
        return this.vast.creativeList;
    }

    public final Set<String> getImpressions() {
        if (this.vast == null) {
            return null;
        }
        return this.vast.impressionSet;
    }
}
