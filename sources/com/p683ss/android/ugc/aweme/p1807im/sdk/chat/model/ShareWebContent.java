package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareWebContent */
public class ShareWebContent extends BaseContent {
    @C17952c(mo34828a = "desc")
    private String desc;
    @C17952c(mo34828a = "cover_url")
    private String image;
    @C17952c(mo34828a = "push_detail")
    private String pushDetail;
    @C17952c(mo34828a = "title")
    private String title;
    @C17952c(mo34828a = "link_url")
    private String url;

    public String getDesc() {
        return this.desc;
    }

    public String getImage() {
        return this.image;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("web");
        a.f106900i.putSerializable("thumb_url", getImage());
        return a;
    }

    public String getMsgHint() {
        return C11010c.m22280a().getString(R.string.bpg, new Object[]{getTitle()});
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public static ShareWebContent fromSharePackage(SharePackage sharePackage) {
        ShareWebContent shareWebContent = new ShareWebContent();
        shareWebContent.setTitle(sharePackage.f106897f);
        shareWebContent.setDesc(sharePackage.f106898g);
        shareWebContent.setImage(sharePackage.f106900i.getString("thumb_url"));
        String string = sharePackage.f106900i.getString("url_for_im_share");
        if (TextUtils.isEmpty(string)) {
            string = sharePackage.f106899h;
        }
        shareWebContent.setUrl(string);
        shareWebContent.setPushDetail(sharePackage.f106897f);
        return shareWebContent;
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        Context a = C11010c.m22280a();
        if (z2) {
            return a.getString(R.string.h84, new Object[]{str});
        }
        if (z) {
            str2 = a.getString(R.string.fr5);
        } else {
            str2 = a.getString(R.string.hf1);
        }
        return str2;
    }
}
