package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.p1099a.C18489a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33655i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent */
public class OnlyPictureContent extends BaseContent {
    private static String ONLY_PICTURE_GINT = "";
    @C17952c(mo34828a = "compress_path")
    String compressPath;
    @C17952c(mo34828a = "cover_height")
    int height;
    @C17952c(mo34828a = "mime")
    String mime;
    @C17952c(mo34828a = "local_path")
    String picturePath;
    @C17952c(mo34828a = "send_raw")
    boolean sendRaw;
    @C17952c(mo34828a = "resource_url")
    UrlModel url;
    @C17952c(mo34828a = "cover_width")
    int width;

    public String getCompressPath() {
        return this.compressPath;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMime() {
        return this.mime;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSendRaw() {
        return this.sendRaw;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return ONLY_PICTURE_GINT;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(ONLY_PICTURE_GINT)) {
            Context a = C11010c.m22280a();
            if (a != null) {
                ONLY_PICTURE_GINT = a.getString(R.string.bnf);
            }
        }
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("pic");
        Bundle bundle = a.f106900i;
        if (getUrl() != null) {
            bundle.putSerializable("video_cover", getUrl());
        } else {
            UrlModel urlModel = new UrlModel();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(getPicturePath());
            urlModel.setUri(sb.toString());
            bundle.putSerializable("video_cover", urlModel);
        }
        bundle.putInt("aweme_width", getWidth());
        bundle.putInt("aweme_height", getHeight());
        return a;
    }

    public void setCompressPath(String str) {
        this.compressPath = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMime(String str) {
        this.mime = str;
    }

    public void setPicturePath(String str) {
        this.picturePath = str;
    }

    public void setSendRaw(boolean z) {
        this.sendRaw = z;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static OnlyPictureContent obtain(C18489a aVar) {
        OnlyPictureContent onlyPictureContent = new OnlyPictureContent();
        onlyPictureContent.setPicturePath(aVar.f50916b);
        onlyPictureContent.setWidth(aVar.f50919e);
        onlyPictureContent.setHeight(aVar.f50920f);
        onlyPictureContent.setMime(aVar.f50918d);
        return onlyPictureContent;
    }

    public static OnlyPictureContent obtain(C33655i iVar) {
        OnlyPictureContent onlyPictureContent = new OnlyPictureContent();
        onlyPictureContent.setPicturePath(iVar.getPath());
        onlyPictureContent.setWidth(iVar.getWith());
        onlyPictureContent.setHeight(iVar.getHeight());
        onlyPictureContent.setMime(iVar.getMime());
        return onlyPictureContent;
    }
}
