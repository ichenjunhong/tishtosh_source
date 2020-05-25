package com.p683ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedCompoundConfig */
public class FeedCompoundConfig {
    @C17952c(mo34828a = "is_retry")
    public int isRetry;
    @C17952c(mo34828a = "path")
    public String path;
    @C17952c(mo34828a = "replace_path")
    public String replacePath;
    @C17952c(mo34828a = "compound_request_domain")
    public List<String> requestDomains;
    @C17952c(mo34828a = "threshold")
    public int threshold;

    public boolean isFeedCompoundClose() {
        if (TextUtils.isEmpty(this.path) || TextUtils.isEmpty(this.replacePath) || this.threshold <= 0 || this.requestDomains == null || this.requestDomains.size() == 0) {
            return true;
        }
        return false;
    }
}
