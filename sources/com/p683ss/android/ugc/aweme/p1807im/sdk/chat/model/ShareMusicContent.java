package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent */
public class ShareMusicContent extends BaseContent {
    @C17952c(mo34828a = "cover_url")
    private List<UrlModel> awemeCoverList;
    @C17952c(mo34828a = "music_cover")
    private UrlModel coverThumb;
    @C17952c(mo34828a = "music_id")
    private String musicId;
    @C17952c(mo34828a = "title")
    private String musicName;
    @C17952c(mo34828a = "push_detail")
    private String pushDetail;
    @C17952c(mo34828a = "user_count")
    private int userCount;

    public List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("music");
        a.f106900i.putSerializable("video_cover", getCoverThumb());
        return a;
    }

    public String getMsgHint() {
        return C11010c.m22280a().getString(R.string.bl1, new Object[]{getMusicName()});
    }

    public void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public void setCoverThumb(UrlModel urlModel) {
        this.coverThumb = urlModel;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setMusicName(String str) {
        this.musicName = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public static ShareMusicContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f106900i.getString("music_id");
        String string2 = sharePackage.f106900i.getString("music_name");
        int i = sharePackage.f106900i.getInt("user_count");
        UrlModel urlModel = (UrlModel) sharePackage.f106900i.getSerializable("video_cover");
        UrlModel urlModel2 = (UrlModel) sharePackage.f106900i.getSerializable("cover_thumb");
        String string3 = sharePackage.f106900i.getString("aweme_cover_list");
        ShareMusicContent shareMusicContent = new ShareMusicContent();
        shareMusicContent.musicId = string;
        shareMusicContent.musicName = string2;
        shareMusicContent.pushDetail = shareMusicContent.musicName;
        shareMusicContent.userCount = i;
        if (urlModel != null) {
            shareMusicContent.coverThumb = urlModel;
        } else if (urlModel2 != null) {
            shareMusicContent.coverThumb = urlModel2;
        }
        if (!TextUtils.isEmpty(string3)) {
            shareMusicContent.awemeCoverList = (List) JSON.parseObject(string3, List.class);
        }
        return shareMusicContent;
    }
}
