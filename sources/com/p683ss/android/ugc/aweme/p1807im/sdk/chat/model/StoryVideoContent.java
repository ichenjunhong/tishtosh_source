package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b.C33406h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage.C35127a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent */
public final class StoryVideoContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "check_pics")
    private List<String> checkPics;
    @C17952c(mo34828a = "check_texts")
    private List<String> checkTexts;
    @C17952c(mo34828a = "from_gallery")
    private int fromGallery;
    @C17952c(mo34828a = "height")
    private int height;
    private transient String localCheckPic;
    private transient String localPoster;
    private transient String localVideo;
    @C17952c(mo34828a = "mass_msg")
    private int massMsg;
    @C17952c(mo34828a = "md5")
    private String md5;
    private transient boolean needVerify;
    @C17952c(mo34828a = "poster")
    private C33376a poster;
    @C17952c(mo34828a = "video")
    private EncryptedVideoContent video;
    @C17952c(mo34828a = "width")
    private int width;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final StoryVideoContent fromSharePackage(SharePackage sharePackage) {
            C52711k.m112240b(sharePackage, "sharePackage");
            StoryVideoContent storyVideoContent = new StoryVideoContent();
            storyVideoContent.setPoster((C33376a) sharePackage.f106900i.getSerializable("video_cover"));
            storyVideoContent.setHeight(sharePackage.f106900i.getInt("aweme_height"));
            storyVideoContent.setWidth(sharePackage.f106900i.getInt("aweme_width"));
            if (sharePackage.f106900i.containsKey("video")) {
                storyVideoContent.setVideo((EncryptedVideoContent) C35277o.m79760a(sharePackage.f106900i.getString("video"), EncryptedVideoContent.class));
            }
            return storyVideoContent;
        }

        public final StoryVideoContent obtain(C33406h hVar) {
            C52711k.m112240b(hVar, "videoParam");
            StoryVideoContent storyVideoContent = new StoryVideoContent();
            storyVideoContent.setCheckTexts(hVar.getCheckTexts());
            storyVideoContent.setLocalCheckPic(hVar.getCheckPic());
            storyVideoContent.setLocalPoster(hVar.getThumbnailPath());
            storyVideoContent.setFromGallery(hVar.getFromGallery());
            storyVideoContent.setLocalVideo(hVar.getVideoPath());
            storyVideoContent.setMd5(hVar.getSrcVideoMD5());
            storyVideoContent.setHeight(hVar.getHeight());
            storyVideoContent.setWidth(hVar.getWidth());
            storyVideoContent.setMassMsg(0);
            return storyVideoContent;
        }

        public final List<C11178a> obtainAttachmentList(StoryVideoContent storyVideoContent) {
            C52711k.m112240b(storyVideoContent, "storyVideoContent");
            C11178a aVar = new C11178a();
            C11178a aVar2 = new C11178a();
            C11178a aVar3 = new C11178a();
            aVar.setIndex(0);
            aVar2.setIndex(1);
            aVar3.setIndex(2);
            aVar.setLocalPath(storyVideoContent.getLocalCheckPic());
            aVar2.setLocalPath(storyVideoContent.getLocalVideo());
            aVar3.setLocalPath(storyVideoContent.getLocalPoster());
            if (storyVideoContent.getNeedVerify()) {
                aVar.setStatus(-1);
                aVar2.setStatus(-1);
                aVar3.setStatus(-1);
            }
            List<C11178a> arrayList = new ArrayList<>();
            arrayList.add(aVar);
            arrayList.add(aVar2);
            arrayList.add(aVar3);
            return arrayList;
        }

        public final StoryVideoContent obtain(C34409a aVar) {
            C52711k.m112240b(aVar, "mediaModel");
            if (!aVar.isVideo()) {
                return null;
            }
            StoryVideoContent storyVideoContent = new StoryVideoContent();
            storyVideoContent.setLocalCheckPic(aVar.getThumbnail());
            storyVideoContent.setLocalVideo(aVar.getFilePath());
            storyVideoContent.setLocalPoster(aVar.getThumbnail());
            storyVideoContent.setWidth(aVar.getWidth());
            storyVideoContent.setHeight(aVar.getHeight());
            storyVideoContent.setFromGallery(1);
            storyVideoContent.setMassMsg(0);
            storyVideoContent.setNeedVerify(true);
            return storyVideoContent;
        }

        public final void updateContentLocal(StoryVideoContent storyVideoContent, C11207p pVar) {
            boolean z;
            boolean z2;
            C52711k.m112240b(storyVideoContent, "storyVideoContent");
            C52711k.m112240b(pVar, "message");
            List attachments = pVar.getAttachments();
            if (attachments != null) {
                int i = 0;
                for (Object next : attachments) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    C11178a aVar = (C11178a) next;
                    boolean z3 = true;
                    if (i == 0 && aVar != null) {
                        CharSequence localCheckPic = storyVideoContent.getLocalCheckPic();
                        if (localCheckPic == null || localCheckPic.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            storyVideoContent.setLocalCheckPic(aVar.getLocalPath());
                        }
                    }
                    if (i == 1 && aVar != null) {
                        CharSequence localVideo = storyVideoContent.getLocalVideo();
                        if (localVideo == null || localVideo.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            storyVideoContent.setLocalVideo(aVar.getLocalPath());
                        }
                    }
                    if (i == 2 && aVar != null) {
                        CharSequence localPoster = storyVideoContent.getLocalPoster();
                        if (!(localPoster == null || localPoster.length() == 0)) {
                            z3 = false;
                        }
                        if (z3) {
                            storyVideoContent.setLocalPoster(aVar.getLocalPath());
                        }
                    }
                    i = i2;
                }
            }
        }

        public final void updateAfterVECompile(StoryVideoContent storyVideoContent, C11207p pVar, CompileResult compileResult) {
            C52711k.m112240b(storyVideoContent, "storyVideoContent");
            C52711k.m112240b(pVar, "message");
            C52711k.m112240b(compileResult, "result");
            storyVideoContent.setMd5(compileResult.getVideoMd5());
            storyVideoContent.setLocalVideo(compileResult.getVideoPath());
            storyVideoContent.setLocalCheckPic(compileResult.getCheckPic());
            storyVideoContent.setLocalPoster(compileResult.getThumbnailPath());
            storyVideoContent.setWidth(compileResult.getVideoWidth());
            storyVideoContent.setHeight(compileResult.getVideoHeight());
            List attachments = pVar.getAttachments();
            if (attachments != null) {
                int size = attachments.size();
                for (int i = 0; i < size; i++) {
                    C11178a aVar = (C11178a) attachments.get(i);
                    if (aVar != null) {
                        aVar.setStatus(0);
                        switch (i) {
                            case 0:
                                aVar.setLocalPath(storyVideoContent.getLocalCheckPic());
                                break;
                            case 1:
                                aVar.setLocalPath(storyVideoContent.getLocalVideo());
                                break;
                            case 2:
                                aVar.setLocalPath(storyVideoContent.getLocalPoster());
                                break;
                        }
                    }
                }
            }
        }
    }

    public static final StoryVideoContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final StoryVideoContent obtain(C33406h hVar) {
        return Companion.obtain(hVar);
    }

    public static final StoryVideoContent obtain(C34409a aVar) {
        return Companion.obtain(aVar);
    }

    public static final List<C11178a> obtainAttachmentList(StoryVideoContent storyVideoContent) {
        return Companion.obtainAttachmentList(storyVideoContent);
    }

    public static final void updateAfterVECompile(StoryVideoContent storyVideoContent, C11207p pVar, CompileResult compileResult) {
        Companion.updateAfterVECompile(storyVideoContent, pVar, compileResult);
    }

    public final List<String> getCheckPics() {
        return this.checkPics;
    }

    public final List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public final int getFromGallery() {
        return this.fromGallery;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getLocalCheckPic() {
        return this.localCheckPic;
    }

    public final String getLocalPoster() {
        return this.localPoster;
    }

    public final String getLocalVideo() {
        return this.localVideo;
    }

    public final int getMassMsg() {
        return this.massMsg;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final boolean getNeedVerify() {
        return this.needVerify;
    }

    public final C33376a getPoster() {
        return this.poster;
    }

    public final EncryptedVideoContent getVideo() {
        return this.video;
    }

    public final int getWidth() {
        return this.width;
    }

    public final UrlModel getDisplayPoster() {
        if (this.poster == null) {
            return null;
        }
        return C33376a.convert(this.poster);
    }

    public final void tryInit() {
        this.msgHint = C11010c.m22280a().getString(R.string.boi);
    }

    public final List<String> getCheckPicList() {
        if (this.checkPics == null) {
            this.checkPics = new ArrayList();
        }
        List<String> list = this.checkPics;
        if (list == null) {
            C52711k.m112234a();
        }
        return list;
    }

    public final SharePackage generateSharePackage() {
        SharePackage a = C35127a.m79360a("story_video");
        Bundle bundle = a.f106900i;
        bundle.putSerializable("video_cover", this.poster);
        bundle.putInt("aweme_width", this.width);
        bundle.putInt("aweme_height", this.height);
        bundle.putString("video", C35277o.m79761a(this.video));
        return a;
    }

    public final void setCheckPics(List<String> list) {
        this.checkPics = list;
    }

    public final void setCheckTexts(List<String> list) {
        this.checkTexts = list;
    }

    public final void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setLocalCheckPic(String str) {
        this.localCheckPic = str;
    }

    public final void setLocalPoster(String str) {
        this.localPoster = str;
    }

    public final void setLocalVideo(String str) {
        this.localVideo = str;
    }

    public final void setMassMsg(int i) {
        this.massMsg = i;
    }

    public final void setMd5(String str) {
        this.md5 = str;
    }

    public final void setNeedVerify(boolean z) {
        this.needVerify = z;
    }

    public final void setPoster(C33376a aVar) {
        this.poster = aVar;
    }

    public final void setVideo(EncryptedVideoContent encryptedVideoContent) {
        this.video = encryptedVideoContent;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
