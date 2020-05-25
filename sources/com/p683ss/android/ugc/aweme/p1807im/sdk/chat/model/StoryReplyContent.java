package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage.C35127a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent */
public final class StoryReplyContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "story")
    private StoryContent storyContent = new StoryContent();
    @C17952c(mo34828a = "text")
    private String storyReplyText;
    @C17952c(mo34828a = "story_state")
    private boolean storyState = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final StoryReplyContent fromSharePackage(SharePackage sharePackage) {
            C52711k.m112240b(sharePackage, "sharePackage");
            StoryReplyContent storyReplyContent = new StoryReplyContent();
            storyReplyContent.setStoryReplyText(sharePackage.f106900i.getString("share_text"));
            storyReplyContent.getStoryContent().setStoryId(sharePackage.f106900i.getString("item_id_string"));
            Serializable serializable = sharePackage.f106900i.getSerializable("video_cover");
            if (serializable instanceof UrlModel) {
                storyReplyContent.getStoryContent().setStoryCover((UrlModel) serializable);
            }
            storyReplyContent.getStoryContent().setVideoHeight(sharePackage.f106900i.getInt("aweme_height"));
            storyReplyContent.getStoryContent().setVideoWidth(sharePackage.f106900i.getInt("aweme_width"));
            return storyReplyContent;
        }

        public final String wrapMessageHint(C11207p pVar, String str) {
            C52711k.m112240b(pVar, "message");
            C52711k.m112240b(str, "msgHint");
            Context a = C11010c.m22280a();
            if (pVar.isSelf()) {
                StringBuilder sb = new StringBuilder();
                sb.append(a.getString(R.string.bof));
                sb.append(str);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.getString(R.string.boe));
            sb2.append(str);
            return sb2.toString();
        }
    }

    public static final StoryReplyContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final String wrapMessageHint(C11207p pVar, String str) {
        return Companion.wrapMessageHint(pVar, str);
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
        this.msgHint = this.storyReplyText;
    }

    public final SharePackage generateSharePackage() {
        SharePackage a = C35127a.m79360a("story_reply");
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
