package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.os.Bundle;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StickerEmojiContent */
public class StickerEmojiContent extends EmojiContent {
    public UrlModel getLocalUrl() {
        return null;
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("gif");
        Bundle bundle = a.f106900i;
        bundle.putSerializable("video_cover", getUrl());
        bundle.putInt("aweme_type", getType());
        return a;
    }

    public String getMsgHint() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(C11010c.m22280a().getString(R.string.bgu));
        sb.append("]");
        return sb.toString();
    }

    public static StickerEmojiContent obtain(C29366a aVar) {
        StickerEmojiContent stickerEmojiContent = new StickerEmojiContent();
        stickerEmojiContent.setUrl(aVar.getAnimateUrl());
        stickerEmojiContent.setImageId(aVar.getId());
        stickerEmojiContent.setDisplayName(C29298a.m69088b(aVar));
        stickerEmojiContent.setImageType(aVar.getAnimateType());
        stickerEmojiContent.setPackageId(aVar.getResourcesId());
        stickerEmojiContent.setVersion(aVar.getVersion());
        stickerEmojiContent.setWidth(aVar.getWidth());
        stickerEmojiContent.setHeight(aVar.getHeight());
        return stickerEmojiContent;
    }
}
