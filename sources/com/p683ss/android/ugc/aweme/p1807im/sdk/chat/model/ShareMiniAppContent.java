package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent */
public class ShareMiniAppContent extends BaseContent {
    @C17952c(mo34828a = "app_id")
    private String appId;
    @C17952c(mo34828a = "app_name")
    private String appName;
    @C17952c(mo34828a = "extra")
    private Extra extra;
    @C17952c(mo34828a = "image_url")
    private String imageUrl;
    @C17952c(mo34828a = "is_game")
    private boolean isGame;
    @C17952c(mo34828a = "push_detail")
    private String pushDetail;
    @C17952c(mo34828a = "query")
    private String query;
    @C17952c(mo34828a = "title")
    private String title;
    @C17952c(mo34828a = "token")
    private String token;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent$Extra */
    public static class Extra implements Serializable {
        @C17952c(mo34828a = "channel")
        String channel;

        public String getChannel() {
            return this.channel;
        }

        public void setChannel(String str) {
            this.channel = str;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getQuery() {
        return this.query;
    }

    public String getTitle() {
        return this.title;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isGame() {
        return this.isGame;
    }

    public String getExtraStr() {
        return new C17971f().mo34889b(this.extra);
    }

    public String getMsgHint() {
        if (this.isGame) {
            return C11010c.m22280a().getResources().getString(R.string.bku, new Object[]{this.appName});
        }
        return C11010c.m22280a().getResources().getString(R.string.bks, new Object[]{this.appName});
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setGame(boolean z) {
        this.isGame = z;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setQuery(String str) {
        this.query = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public static ShareMiniAppContent fromSharePackage(SharePackage sharePackage) {
        ShareMiniAppContent shareMiniAppContent = new ShareMiniAppContent();
        shareMiniAppContent.appName = sharePackage.f106900i.getString("app_name");
        shareMiniAppContent.title = sharePackage.f106897f;
        shareMiniAppContent.imageUrl = sharePackage.f106900i.getString("thumb_url");
        shareMiniAppContent.pushDetail = sharePackage.f106900i.getString("app_name");
        shareMiniAppContent.isGame = sharePackage.f106900i.getBoolean("is_game", false);
        shareMiniAppContent.query = sharePackage.f106900i.getString("query");
        shareMiniAppContent.appId = sharePackage.f106900i.getString("app_id");
        shareMiniAppContent.token = sharePackage.f106900i.getString("token");
        shareMiniAppContent.extra = (Extra) new C17971f().mo34884a(sharePackage.f106900i.getString("extra"), Extra.class);
        if (shareMiniAppContent.isGame) {
            shareMiniAppContent.setType(2401);
        } else {
            shareMiniAppContent.setType(2402);
        }
        return shareMiniAppContent;
    }
}
