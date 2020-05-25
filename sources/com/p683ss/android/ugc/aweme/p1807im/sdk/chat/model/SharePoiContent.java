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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent */
public class SharePoiContent extends BaseContent {
    @C17952c(mo34828a = "cover_url")
    private List<UrlModel> coverUrl;
    @C17952c(mo34828a = "map_url")
    private UrlModel mapUrl;
    @C17952c(mo34828a = "poi_icon_url")
    private UrlModel poiIconUrl;
    @C17952c(mo34828a = "poi_id")
    private String poiId;
    @C17952c(mo34828a = "push_detail")
    private String pushDetail;
    @C17952c(mo34828a = "subtitle")
    private String subtitle;
    @C17952c(mo34828a = "title")
    private String title;
    @C17952c(mo34828a = "user_count")
    private int userCount;

    public List<UrlModel> getCoverUrl() {
        return this.coverUrl;
    }

    public UrlModel getMapUrl() {
        return this.mapUrl;
    }

    public UrlModel getPoiIconUrl() {
        return this.poiIconUrl;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPushDetail() {
        return this.pushDetail;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("poi");
        a.f106900i.putSerializable("video_cover", getMapUrl());
        return a;
    }

    public String getMsgHint() {
        return C11010c.m22280a().getResources().getString(R.string.blz, new Object[]{this.pushDetail});
    }

    public void setCoverUrl(List<UrlModel> list) {
        this.coverUrl = list;
    }

    public void setMapUrl(UrlModel urlModel) {
        this.mapUrl = urlModel;
    }

    public void setPoiIconUrl(UrlModel urlModel) {
        this.poiIconUrl = urlModel;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPushDetail(String str) {
        this.pushDetail = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public static SharePoiContent fromSharePackage(SharePackage sharePackage) {
        String string = sharePackage.f106900i.getString("poi_id");
        String string2 = sharePackage.f106900i.getString("poi_name");
        String string3 = sharePackage.f106900i.getString("simple_addr");
        int i = sharePackage.f106900i.getInt("user_count");
        String string4 = sharePackage.f106900i.getString("subtitle");
        String string5 = sharePackage.f106900i.getString("map_url");
        String string6 = sharePackage.f106900i.getString("cover_url");
        String string7 = sharePackage.f106900i.getString("poi_icon_url");
        SharePoiContent sharePoiContent = new SharePoiContent();
        sharePoiContent.poiId = string;
        sharePoiContent.title = string2;
        sharePoiContent.pushDetail = string3;
        sharePoiContent.userCount = i;
        sharePoiContent.subtitle = string4;
        if (!TextUtils.isEmpty(string5)) {
            sharePoiContent.mapUrl = (UrlModel) JSON.parseObject(string5, UrlModel.class);
        }
        if (!TextUtils.isEmpty(string6)) {
            sharePoiContent.coverUrl = (List) JSON.parseObject(string6, List.class);
        }
        if (!TextUtils.isEmpty(string7)) {
            sharePoiContent.poiIconUrl = (UrlModel) JSON.parseObject(string7, UrlModel.class);
        }
        sharePoiContent.type = 0;
        return sharePoiContent;
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        Context a = C11010c.m22280a();
        if (z2) {
            return a.getString(R.string.h85, new Object[]{str});
        }
        if (z) {
            str2 = a.getString(R.string.fr6);
        } else {
            str2 = a.getString(R.string.hf2);
        }
        return str2;
    }
}
