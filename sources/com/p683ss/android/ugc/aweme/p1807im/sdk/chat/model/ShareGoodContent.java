package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodContent */
public class ShareGoodContent extends BaseContent {
    @C17952c(mo34828a = "avatar")
    private UrlModel avatar;
    @C17952c(mo34828a = "enter_method")
    private String enterMethod = "click_message";
    @C17952c(mo34828a = "product_id")
    private String productId;
    @C17952c(mo34828a = "promotion_id")
    private String promotionId;
    @C17952c(mo34828a = "sec_user_id")
    private String secUserId = "";
    @C17952c(mo34828a = "title")
    private String title;
    @C17952c(mo34828a = "user_count")
    private long userCount;
    @C17952c(mo34828a = "user_id")
    private String userId;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public String getSecUserId() {
        return this.secUserId;
    }

    public String getTitle() {
        return this.title;
    }

    public long getUserCount() {
        return this.userCount;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getMsgHint() {
        return C2240a.m6773a(Locale.getDefault(), C11010c.m22280a().getString(R.string.bhn), new Object[]{getTitle()});
    }

    public SharePackage generateSharePackage() {
        SharePackage a = new C42326a().mo86236a("good").mo86240c(getTitle()).mo86238a();
        Bundle bundle = a.f106900i;
        bundle.putSerializable("video_cover", getAvatar());
        bundle.putString("user_id", getUserId());
        bundle.putString("user_count", String.valueOf(getUserCount()));
        bundle.putString("promotion_id", getPromotionId());
        bundle.putString("product_id", getProductId());
        if (!TextUtils.isEmpty(getSecUserId())) {
            bundle.putString("sec_user_id", getSecUserId());
        }
        return a;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setPromotionId(String str) {
        this.promotionId = str;
    }

    public void setSecUserId(String str) {
        this.secUserId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(long j) {
        this.userCount = j;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public static ShareGoodContent fromSharePackage(SharePackage sharePackage) {
        ShareGoodContent shareGoodContent = new ShareGoodContent();
        shareGoodContent.title = sharePackage.f106897f;
        Serializable serializable = sharePackage.f106900i.getSerializable("video_cover");
        if (serializable instanceof UrlModel) {
            shareGoodContent.avatar = (UrlModel) serializable;
        }
        String string = sharePackage.f106900i.getString("user_id");
        String string2 = sharePackage.f106900i.getString("sec_user_id");
        int i = sharePackage.f106900i.getInt("user_count");
        String string3 = sharePackage.f106900i.getString("promotion_id");
        String string4 = sharePackage.f106900i.getString("product_id");
        shareGoodContent.userId = string;
        if (!TextUtils.isEmpty(string2)) {
            shareGoodContent.secUserId = string2;
        }
        shareGoodContent.userCount = (long) i;
        shareGoodContent.promotionId = string3;
        shareGoodContent.productId = string4;
        shareGoodContent.type = 0;
        return shareGoodContent;
    }
}
