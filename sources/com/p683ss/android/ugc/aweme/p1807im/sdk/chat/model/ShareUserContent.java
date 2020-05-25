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
import java.io.Serializable;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent */
public class ShareUserContent extends BaseContent {
    @C17952c(mo34828a = "avatar")
    private UrlModel avatar;
    @C17952c(mo34828a = "cover_url")
    private List<UrlModel> awemeCoverList;
    @C17952c(mo34828a = "desc")
    private String desc;
    @C17952c(mo34828a = "name")
    private String name;
    @C17952c(mo34828a = "push_detail")
    private String pushDetail;
    @C17952c(mo34828a = "secUID")
    String secUid;
    @C17952c(mo34828a = "uid")
    private String uid;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getName() {
        return this.name;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getUid() {
        return this.uid;
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("user");
        a.f106900i.putSerializable("video_cover", getAvatar());
        return a;
    }

    public String getMsgHint() {
        return C11010c.m22280a().getString(R.string.bp_, new Object[]{getName()});
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public static ShareUserContent fromSharePackage(SharePackage sharePackage) {
        ShareUserContent shareUserContent = new ShareUserContent();
        shareUserContent.uid = sharePackage.f106900i.getString("uid");
        shareUserContent.secUid = sharePackage.f106900i.getString("sec_user_id");
        shareUserContent.name = sharePackage.f106900i.getString(LeakCanaryFileProvider.f132049i);
        shareUserContent.desc = sharePackage.f106900i.getString("desc");
        Serializable serializable = sharePackage.f106900i.getSerializable("video_cover");
        if (serializable instanceof UrlModel) {
            shareUserContent.avatar = (UrlModel) serializable;
        }
        shareUserContent.pushDetail = sharePackage.f106900i.getString(LeakCanaryFileProvider.f132049i);
        String string = sharePackage.f106900i.getString("aweme_cover_list");
        if (!TextUtils.isEmpty(string)) {
            shareUserContent.awemeCoverList = (List) JSON.parseObject(string, List.class);
        }
        return shareUserContent;
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        Context a = C11010c.m22280a();
        if (z2) {
            return a.getString(R.string.h86, new Object[]{str, getName()});
        }
        if (z) {
            str2 = a.getString(R.string.fr7, new Object[]{getName()});
        } else {
            str2 = a.getString(R.string.hf3, new Object[]{getName()});
        }
        return str2;
    }
}
