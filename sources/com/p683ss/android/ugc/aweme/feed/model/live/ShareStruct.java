package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.ShareStruct */
public class ShareStruct extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "bool_persist")
    public int boolPersist;
    @C17952c(mo34828a = "share_desc")
    public String shareDesc;
    @C17952c(mo34828a = "share_link_desc")
    public String shareLinkDesc;
    @C17952c(mo34828a = "share_qrcode_url")
    public UrlModel shareQrcodeUrl;
    @C17952c(mo34828a = "share_title")
    public String shareTitle;
    @C17952c(mo34828a = "share_url")
    public String shareUrl;
    @C17952c(mo34828a = "share_weibo_desc")
    public String shareWeiboDesc;
}
