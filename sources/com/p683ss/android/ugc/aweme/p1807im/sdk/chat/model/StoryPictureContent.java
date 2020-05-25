package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11178a;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33655i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35194aj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35266f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent */
public class StoryPictureContent extends BaseContent {
    public static String STORY_PICTURE_HINT = "";
    @C17952c(mo34828a = "check_pics")
    List<String> checkPics;
    @C17952c(mo34828a = "check_texts")
    List<String> checkTexts;
    String compressPath;
    @C17952c(mo34828a = "from_gallery")
    int fromGallery;
    @C17952c(mo34828a = "cover_height")
    int height;
    @C17952c(mo34828a = "mass_msg")
    int massMsg;
    @C17952c(mo34828a = "md5")
    String md5;
    String picturePath;
    boolean sendRaw;
    @C17952c(mo34828a = "resource_url")
    C33376a url;
    @C17952c(mo34828a = "cover_width")
    int width;

    public List<String> getCheckPics() {
        return this.checkPics;
    }

    public List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public String getCompressPath() {
        return this.compressPath;
    }

    public int getFromGallery() {
        return this.fromGallery;
    }

    public int getHeight() {
        return this.height;
    }

    public int getMassMsg() {
        return this.massMsg;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPicturePath() {
        return this.picturePath;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isSendRaw() {
        return this.sendRaw;
    }

    public String getMsgHint() {
        super.getMsgHint();
        return STORY_PICTURE_HINT;
    }

    public UrlModel getUrl() {
        if (this.url == null) {
            return null;
        }
        return C33376a.convert(this.url);
    }

    public void tryInit() {
        if (TextUtils.isEmpty(STORY_PICTURE_HINT)) {
            Context a = C11010c.m22280a();
            if (a != null) {
                STORY_PICTURE_HINT = a.getString(R.string.boc);
            }
        }
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("pic");
        Bundle bundle = a.f106900i;
        UrlModel url2 = getUrl();
        if (url2 == null) {
            url2 = new UrlModel();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(getPicturePath());
            url2.setUri(sb.toString());
        }
        bundle.putSerializable("video_cover", url2);
        a.f106900i.putInt("aweme_width", getWidth());
        a.f106900i.putInt("aweme_height", getHeight());
        return a;
    }

    public void setCheckPics(List<String> list) {
        this.checkPics = list;
    }

    public void setCheckTexts(List<String> list) {
        this.checkTexts = list;
    }

    public void setCompressPath(String str) {
        this.compressPath = str;
    }

    public void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMassMsg(int i) {
        this.massMsg = i;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPicturePath(String str) {
        this.picturePath = str;
    }

    public void setSendRaw(boolean z) {
        this.sendRaw = z;
    }

    public void setUrl(C33376a aVar) {
        this.url = aVar;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static List<C11178a> obtainAttachmentList(StoryPictureContent storyPictureContent) {
        C11178a aVar = new C11178a();
        aVar.setIndex(0);
        aVar.setLocalPath(storyPictureContent.compressPath);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        return arrayList;
    }

    public static StoryPictureContent obtain(C33655i iVar) {
        String str;
        StoryPictureContent storyPictureContent = new StoryPictureContent();
        String path = iVar.getPath();
        File file = new File(path);
        if (file.length() > 524288) {
            str = C35194aj.m79548a(C35266f.m79738a((InputStream) C35266f.m79736a(new File(path))));
        } else {
            str = C35194aj.m79547a(file);
        }
        storyPictureContent.setMd5(str);
        storyPictureContent.setFromGallery(iVar.getFromGallery());
        storyPictureContent.setCheckTexts(iVar.getCheckTexts());
        storyPictureContent.setPicturePath(iVar.getPath());
        storyPictureContent.setHeight(iVar.getHeight());
        storyPictureContent.setWidth(iVar.getWith());
        storyPictureContent.setMassMsg(0);
        storyPictureContent.setType(2700);
        return storyPictureContent;
    }
}
