package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.os.Bundle;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage.C35127a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent */
public final class SelfStoryReplyContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "story")
    private StoryContent storyContent = new StoryContent();
    @C17952c(mo34828a = "text")
    private String storyReplyText;
    @C17952c(mo34828a = "story_state")
    private boolean storyState = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final SelfStoryReplyContent fromSharePackage(SharePackage sharePackage) {
            C52711k.m112240b(sharePackage, "sharePackage");
            SelfStoryReplyContent selfStoryReplyContent = new SelfStoryReplyContent();
            selfStoryReplyContent.setStoryReplyText(sharePackage.f106900i.getString("share_text"));
            selfStoryReplyContent.getStoryContent().setStoryId(sharePackage.f106900i.getString("item_id_string"));
            Serializable serializable = sharePackage.f106900i.getSerializable("video_cover");
            if (serializable instanceof UrlModel) {
                selfStoryReplyContent.getStoryContent().setStoryCover((UrlModel) serializable);
            }
            selfStoryReplyContent.getStoryContent().setVideoHeight(sharePackage.f106900i.getInt("aweme_height"));
            selfStoryReplyContent.getStoryContent().setVideoWidth(sharePackage.f106900i.getInt("aweme_width"));
            return selfStoryReplyContent;
        }
    }

    public static final SelfStoryReplyContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public final StoryContent getStoryContent() {
        return this.storyContent;
    }

    public final String getStoryReplyText() {
        return this.storyReplyText;
    }

    public final boolean getStoryState() {
        return this.storyState;
    }

    public final void tryInit() {
        super.tryInit();
        this.msgHint = this.storyReplyText;
    }

    public final SharePackage generateSharePackage() {
        SharePackage a = C35127a.m79360a("story_self_reply");
        Bundle bundle = a.f106900i;
        bundle.putString("share_text", this.storyReplyText);
        bundle.putString("item_id_string", this.storyContent.getStoryId());
        bundle.putSerializable("video_cover", this.storyContent.getStoryCover());
        bundle.putInt("aweme_width", this.storyContent.getVideoWidth());
        bundle.putInt("aweme_height", this.storyContent.getVideoHeight());
        return a;
    }

    public final void setStoryReplyText(String str) {
        this.storyReplyText = str;
    }

    public final void setStoryState(boolean z) {
        this.storyState = z;
    }

    public final void setStoryContent(StoryContent storyContent2) {
        C52711k.m112240b(storyContent2, "<set-?>");
        this.storyContent = storyContent2;
    }
}
