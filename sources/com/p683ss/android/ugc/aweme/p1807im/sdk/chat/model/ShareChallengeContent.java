package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent */
public class ShareChallengeContent extends BaseContent {
    @C17952c(mo34828a = "challenge_id")
    private String challengeId;
    @C17952c(mo34828a = "cover_url")
    private List<UrlModel> coverUrl;
    @C17952c(mo34828a = "is_commerce")
    private boolean isCommerce;
    @C17952c(mo34828a = "push_detail")
    private String pushDetail;
    @C17952c(mo34828a = "title")
    private String title;
    @C17952c(mo34828a = "user_count")
    private long userCount;

    public String getChallengeId() {
        return this.challengeId;
    }

    public List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public long getUserCount() {
        return this.userCount;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public SharePackage generateSharePackage() {
        return PureDataSharePackage.m79359a("challenge");
    }

    public String getMsgHint() {
        return C11010c.m22280a().getResources().getString(R.string.bff, new Object[]{this.pushDetail});
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCoverUrl(List<UrlModel> list) {
        this.coverUrl = list;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(int i) {
        this.userCount = (long) i;
    }

    public static ShareChallengeContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f106900i.getString("challenge_id");
        String string2 = sharePackage.f106900i.getString("challenge_name");
        Boolean valueOf = Boolean.valueOf(sharePackage.f106900i.getBoolean("is_commerce"));
        long j = sharePackage.f106900i.getLong("view_count");
        String string3 = sharePackage.f106900i.getString("cover_thumb");
        ShareChallengeContent shareChallengeContent = new ShareChallengeContent();
        shareChallengeContent.challengeId = string;
        shareChallengeContent.title = string2;
        shareChallengeContent.isCommerce = valueOf.booleanValue();
        shareChallengeContent.userCount = j;
        StringBuilder sb = new StringBuilder("#");
        sb.append(shareChallengeContent.title);
        shareChallengeContent.pushDetail = sb.toString();
        if (!TextUtils.isEmpty(string3)) {
            shareChallengeContent.coverUrl = (List) JSON.parseObject(string3, List.class);
        }
        return shareChallengeContent;
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        Context a = C11010c.m22280a();
        if (z2) {
            return a.getString(R.string.h83, new Object[]{str, this.pushDetail});
        }
        if (z) {
            StringBuilder sb = new StringBuilder("{");
            sb.append(this.pushDetail);
            sb.append("}");
            str2 = a.getString(R.string.fr4, new Object[]{sb.toString()});
        } else {
            str2 = a.getString(R.string.hf0, new Object[]{this.pushDetail});
        }
        return str2;
    }
}
