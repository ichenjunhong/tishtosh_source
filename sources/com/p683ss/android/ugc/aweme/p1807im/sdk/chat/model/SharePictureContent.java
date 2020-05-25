package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SharePictureContent */
public class SharePictureContent extends ShareAwemeContent {
    private static String PICTURE_MSG_HINT = "";

    public int getAwemeType() {
        this.awemeType = 2;
        return 2;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return PICTURE_MSG_HINT;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(PICTURE_MSG_HINT)) {
            Context a = C11010c.m22280a();
            if (a != null) {
                PICTURE_MSG_HINT = a.getString(R.string.bng);
            }
        }
    }

    public static SharePictureContent fromSharePackage(SharePackage sharePackage) {
        SharePictureContent sharePictureContent = new SharePictureContent();
        sharePictureContent.setUser(sharePackage.f106900i.getString("uid_for_share"));
        sharePictureContent.setItemId(sharePackage.f106900i.getString("item_id_string"));
        sharePictureContent.setCoverUrl((UrlModel) sharePackage.f106900i.getSerializable("video_cover"));
        sharePictureContent.setContentThumb((UrlModel) sharePackage.f106900i.getSerializable("thumb_url"));
        sharePictureContent.setContentName(sharePackage.f106900i.getString("author_name"));
        sharePictureContent.setWidth((float) sharePackage.f106900i.getInt("aweme_width"));
        sharePictureContent.setHeight((float) sharePackage.f106900i.getInt("aweme_height"));
        sharePictureContent.setNeedSkipStrange(sharePackage.f106900i.getInt("key_message_source", 0));
        sharePictureContent.setAwemeType(2);
        sharePictureContent.setType(800);
        sharePictureContent.setTitle(sharePackage.f106897f);
        return sharePictureContent;
    }
}
