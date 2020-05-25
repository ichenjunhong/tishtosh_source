package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent */
public class ShareAwemeContent extends BaseContent {
    private static String AWEME_MSG_HINT = "";
    int awemeType;
    @C17952c(mo34828a = "content_name")
    String contentName;
    @C17952c(mo34828a = "content_thumb")
    UrlModel contentThumb;
    @C17952c(mo34828a = "cover_url")
    UrlModel coverUrl;
    @C17952c(mo34828a = "diamond_game_id")
    String diamondGameId;
    @C17952c(mo34828a = "cover_height")
    float height;
    @C17952c(mo34828a = "hot_spot_create_time")
    long hotSpotCreateTime;
    @C17952c(mo34828a = "is_hot_spot_video")
    boolean isHotSpotVideo;
    @C17952c(mo34828a = "itemId")
    String itemId;
    @C17952c(mo34828a = "need_skip_strange")
    int needSkipStrange;
    @C17952c(mo34828a = "secUID")
    String secUid;
    @C17952c(mo34828a = "content_title")
    String title;
    @C17952c(mo34828a = "uid")
    String user;
    @C17952c(mo34828a = "cover_width")
    float width;

    public int getAwemeType() {
        return this.awemeType;
    }

    public String getContentName() {
        return this.contentName;
    }

    public UrlModel getContentThumb() {
        return this.contentThumb;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public String getDiamondGameId() {
        return this.diamondGameId;
    }

    public float getHeight() {
        return this.height;
    }

    public long getHotSpotCreateTime() {
        return this.hotSpotCreateTime;
    }

    public String getItemId() {
        return this.itemId;
    }

    public int getNeedSkipStrange() {
        return this.needSkipStrange;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUser() {
        return this.user;
    }

    public float getWidth() {
        return this.width;
    }

    public boolean isHotSpotVideo() {
        return this.isHotSpotVideo;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return AWEME_MSG_HINT;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(AWEME_MSG_HINT)) {
            Context a = C11010c.m22280a();
            if (a != null) {
                AWEME_MSG_HINT = a.getString(R.string.bnc);
            }
        }
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("aweme");
        Bundle bundle = a.f106900i;
        bundle.putInt("aweme_type", getAwemeType());
        bundle.putString("item_id_string", this.itemId);
        bundle.putString("author_id", this.user);
        bundle.putSerializable("video_cover", getCoverUrl());
        bundle.putString("diamond_game_id", getDiamondGameId());
        bundle.putBoolean("is_hot_spot_video", isHotSpotVideo());
        return a;
    }

    public void setAwemeType(int i) {
        this.awemeType = i;
    }

    public void setContentName(String str) {
        this.contentName = str;
    }

    public void setContentThumb(UrlModel urlModel) {
        this.contentThumb = urlModel;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setDiamondGameId(String str) {
        this.diamondGameId = str;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setHotSpotCreateTime(long j) {
        this.hotSpotCreateTime = j;
    }

    public void setHotSpotVideo(boolean z) {
        this.isHotSpotVideo = z;
    }

    public void setItemId(String str) {
        this.itemId = str;
    }

    public void setNeedSkipStrange(int i) {
        this.needSkipStrange = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(String str) {
        this.user = str;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public static ShareAwemeContent fromSharePackage(SharePackage sharePackage) {
        ShareAwemeContent shareAwemeContent = new ShareAwemeContent();
        shareAwemeContent.setUser(sharePackage.f106900i.getString("uid_for_share"));
        shareAwemeContent.setSecUid(sharePackage.f106900i.getString("sec_user_id"));
        shareAwemeContent.setItemId(sharePackage.f106900i.getString("item_id_string"));
        shareAwemeContent.setCoverUrl((UrlModel) sharePackage.f106900i.getSerializable("video_cover"));
        shareAwemeContent.setContentThumb((UrlModel) sharePackage.f106900i.getSerializable("thumb_for_share"));
        shareAwemeContent.setContentName(sharePackage.f106900i.getString("author_name"));
        shareAwemeContent.setWidth((float) sharePackage.f106900i.getInt("aweme_width"));
        shareAwemeContent.setHeight((float) sharePackage.f106900i.getInt("aweme_height"));
        shareAwemeContent.setHotSpotVideo(sharePackage.f106900i.getBoolean("is_hot_spot_video"));
        shareAwemeContent.setHotSpotCreateTime(System.currentTimeMillis());
        shareAwemeContent.setAwemeType(0);
        shareAwemeContent.setType(800);
        shareAwemeContent.setTitle(sharePackage.f106900i.getString("desc"));
        shareAwemeContent.setDiamondGameId(sharePackage.f106900i.getString("diamond_game_id"));
        shareAwemeContent.setNeedSkipStrange(sharePackage.f106900i.getInt("key_message_source", 0));
        return shareAwemeContent;
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C11010c.m22280a();
        if (z2) {
            return a.getString(R.string.h88, new Object[]{str});
        }
        if (z) {
            AWEME_MSG_HINT = a.getString(R.string.fr9);
        } else {
            AWEME_MSG_HINT = a.getString(R.string.hf5);
        }
        return AWEME_MSG_HINT;
    }
}
