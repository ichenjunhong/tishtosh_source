package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareRankingListContent */
public class ShareRankingListContent extends BaseContent {
    protected static String AWEME_MSG_HINT = "";
    @C17952c(mo34828a = "update_time")
    String lastUpdateTime;

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return AWEME_MSG_HINT;
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("ranking");
        a.f106900i.putInt("aweme_type", getType());
        return a;
    }

    public void tryInit() {
        Context a = C11010c.m22280a();
        if (a != null) {
            int type = getType();
            if (type != 2301) {
                switch (type) {
                    case 1801:
                        AWEME_MSG_HINT = a.getString(R.string.bnh);
                        return;
                    case 1802:
                        AWEME_MSG_HINT = a.getString(R.string.bni);
                        return;
                    case 1803:
                        AWEME_MSG_HINT = a.getString(R.string.bne);
                        return;
                }
            } else {
                AWEME_MSG_HINT = C11010c.m22280a().getString(R.string.bnd);
            }
        }
    }

    public void setLastUpdateTime(String str) {
        this.lastUpdateTime = str;
    }

    public static ShareRankingListContent fromSharePackage(SharePackage sharePackage) {
        ShareRankingListContent shareRankingListContent = new ShareRankingListContent();
        shareRankingListContent.lastUpdateTime = sharePackage.f106900i.getString("update_time");
        shareRankingListContent.type = sharePackage.f106900i.getInt("aweme_type");
        return shareRankingListContent;
    }
}
