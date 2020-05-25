package com.p683ss.android.ugc.aweme.setting.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.setting.C41579ba;
import com.p683ss.android.ugc.aweme.share.C41978ap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.model.ShareSettings */
public class ShareSettings extends BaseResponse {
    @C17952c(mo34828a = "command_patterns")
    public List<String> commandPatterns;
    @C17952c(mo34828a = "muted_share_platforms")
    public List<String> mutedSharePlatforms;
    @C17952c(mo34828a = "share_gif_platforms")
    public List<C41978ap> shareGifPlatforms;
    @C17952c(mo34828a = "share_actions")
    public List<C41579ba> shareOrderList;
    @C17952c(mo34828a = "share_platforms")
    public List<C41978ap> sharePlatforms;
}
