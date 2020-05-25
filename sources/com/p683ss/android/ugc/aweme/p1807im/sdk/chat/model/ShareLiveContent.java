package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareLiveContent */
public class ShareLiveContent extends BaseContent {
    @C17952c(mo34828a = "push_detail")
    private String pushDetail;
    @C17952c(mo34828a = "cover_url")
    private UrlModel roomCover;
    @C17952c(mo34828a = "room_description")
    private String roomDesc;
    @C17952c(mo34828a = "room_id")
    private String roomId;
    @C17952c(mo34828a = "room_owner_avatar")
    private UrlModel roomOwnerAvatar;
    @C17952c(mo34828a = "room_owner_id")
    private String roomOwnerId;
    @C17952c(mo34828a = "room_owner_name")
    private String roomOwnerName;
    @C17952c(mo34828a = "room_owner_sec_id")
    private String roomSecOwnerId;

    public String getPushDetail() {
        return this.pushDetail;
    }

    public UrlModel getRoomCover() {
        return this.roomCover;
    }

    public String getRoomDesc() {
        return this.roomDesc;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public UrlModel getRoomOwnerAvatar() {
        return this.roomOwnerAvatar;
    }

    public String getRoomOwnerId() {
        return this.roomOwnerId;
    }

    public String getRoomOwnerName() {
        return this.roomOwnerName;
    }

    public String getRoomSecOwnerId() {
        return this.roomSecOwnerId;
    }

    public String getMsgHint() {
        return C11010c.m22280a().getString(R.string.bkb, new Object[]{getRoomOwnerName()});
    }

    public SharePackage generateSharePackage() {
        SharePackage a = new C42326a().mo86236a(CustomActionPushReceiver.f104061f).mo86239b(getRoomId()).mo86238a();
        Bundle bundle = a.f106900i;
        bundle.putString("live_id", getRoomOwnerId());
        bundle.putSerializable("video_cover", getRoomCover());
        bundle.putString("author_name", getRoomOwnerName());
        bundle.putSerializable("thumb_for_share", getRoomOwnerAvatar());
        if (!TextUtils.isEmpty(getRoomDesc())) {
            bundle.putString("room_title", getRoomDesc());
        }
        return a;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setRoomCover(UrlModel urlModel) {
        this.roomCover = urlModel;
    }

    public void setRoomDesc(String str) {
        this.roomDesc = str;
    }

    public void setRoomId(String str) {
        this.roomId = str;
    }

    public void setRoomOwnerAvatar(UrlModel urlModel) {
        this.roomOwnerAvatar = urlModel;
    }

    public void setRoomOwnerId(String str) {
        this.roomOwnerId = str;
    }

    public void setRoomOwnerName(String str) {
        this.roomOwnerName = str;
    }

    public void setRoomSecOwnerId(String str) {
        this.roomSecOwnerId = str;
    }

    public static ShareLiveContent fromSharePackage(SharePackage sharePackage) {
        ShareLiveContent shareLiveContent = new ShareLiveContent();
        shareLiveContent.setRoomId(sharePackage.f106896e);
        shareLiveContent.setRoomOwnerId(sharePackage.f106900i.getString("live_id"));
        shareLiveContent.setRoomSecOwnerId(sharePackage.f106900i.getString("sec_user_id"));
        shareLiveContent.setRoomOwnerName(sharePackage.f106900i.getString("author_name"));
        Serializable serializable = sharePackage.f106900i.getSerializable("thumb_for_share");
        boolean z = serializable instanceof UrlModel;
        if (z) {
            shareLiveContent.setRoomOwnerAvatar((UrlModel) serializable);
        }
        shareLiveContent.setPushDetail(sharePackage.f106900i.getString("author_name"));
        if (sharePackage.f106900i.containsKey("room_title")) {
            shareLiveContent.setRoomDesc(sharePackage.f106900i.getString("room_title"));
        }
        Serializable serializable2 = sharePackage.f106900i.getSerializable("video_cover");
        if (serializable2 instanceof UrlModel) {
            shareLiveContent.setRoomCover((UrlModel) serializable2);
        } else if (z) {
            shareLiveContent.setRoomCover((UrlModel) serializable);
        } else {
            shareLiveContent.setRoomCover(null);
        }
        return shareLiveContent;
    }
}
