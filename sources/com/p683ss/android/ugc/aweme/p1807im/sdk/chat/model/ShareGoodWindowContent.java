package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Locale;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodWindowContent */
public class ShareGoodWindowContent extends BaseContent {
    @C17952c(mo34828a = "avatar")
    private UrlModel avatar;
    @C17952c(mo34828a = "entrance_location")
    private String entranceLocation = "message";
    @C17952c(mo34828a = "name")
    private String name;
    @C17952c(mo34828a = "sec_user_id")
    private String secUserId = "";
    @C17952c(mo34828a = "title")
    private String title;
    @C17952c(mo34828a = "user_id")
    private String userId;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getEntranceLocation() {
        return this.entranceLocation;
    }

    public String getName() {
        return this.name;
    }

    public String getSecUserId() {
        return this.secUserId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getMsgHint() {
        return C2240a.m6773a(Locale.getDefault(), C11010c.m22280a().getString(R.string.bhr), new Object[]{getName()});
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("good_window");
        Bundle bundle = a.f106900i;
        bundle.putSerializable("video_cover", getAvatar());
        bundle.putString("user_id", getUserId());
        if (!TextUtils.isEmpty(getSecUserId())) {
            a.f106900i.putString("sec_user_id", getSecUserId());
        }
        a.f106900i.putString(LeakCanaryFileProvider.f132049i, getName());
        return a;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setEntranceLocation(String str) {
        this.entranceLocation = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSecUserId(String str) {
        this.secUserId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public static ShareGoodWindowContent fromSharePackage(SharePackage sharePackage) {
        ShareGoodWindowContent shareGoodWindowContent = new ShareGoodWindowContent();
        String string = sharePackage.f106900i.getString("user_id");
        String string2 = sharePackage.f106900i.getString("sec_user_id");
        sharePackage.f106900i.getString("user_count");
        sharePackage.f106900i.getString("promotion_id");
        sharePackage.f106900i.getString("product_id");
        String string3 = sharePackage.f106900i.getString(LeakCanaryFileProvider.f132049i);
        Serializable serializable = sharePackage.f106900i.getSerializable("video_cover");
        if (serializable instanceof UrlModel) {
            shareGoodWindowContent.avatar = (UrlModel) serializable;
        }
        shareGoodWindowContent.name = string3;
        shareGoodWindowContent.userId = string;
        if (!TextUtils.isEmpty(string2)) {
            shareGoodWindowContent.secUserId = string2;
        }
        shareGoodWindowContent.type = 0;
        return shareGoodWindowContent;
    }
}
