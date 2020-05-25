package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29473c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EmojiContent */
public class EmojiContent extends BaseContent {
    private static String BIG_EMOJI_MESSAGE_HINT = "";
    @C17952c(mo34828a = "display_name")
    private String displayName;
    @C17952c(mo34828a = "height")
    int height;
    @C17952c(mo34828a = "image_id")
    private long imageId;
    @C17952c(mo34828a = "image_type")
    private String imageType;
    @C17952c(mo34828a = "package_id")
    private long packageId;
    @C17952c(mo34828a = "url")
    UrlModel url;
    @C17952c(mo34828a = "version")
    private String version;
    @C17952c(mo34828a = "width")
    int width;

    public String getDisplayName() {
        return this.displayName;
    }

    public int getHeight() {
        return this.height;
    }

    public long getImageId() {
        return this.imageId;
    }

    public String getImageType() {
        return this.imageType;
    }

    public long getPackageId() {
        return this.packageId;
    }

    public UrlModel getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public int getWidth() {
        return this.width;
    }

    public SharePackage generateSharePackage() {
        SharePackage a = PureDataSharePackage.m79359a("gif");
        Bundle bundle = a.f106900i;
        bundle.putSerializable("video_cover", getUrl());
        bundle.putInt("aweme_type", getType());
        return a;
    }

    public void tryInit() {
        if (TextUtils.isEmpty(BIG_EMOJI_MESSAGE_HINT)) {
            Context a = C11010c.m22280a();
            if (a != null) {
                BIG_EMOJI_MESSAGE_HINT = a.getString(R.string.bez);
            }
        }
    }

    public UrlModel getLocalUrl() {
        String str;
        if (getType() == 502) {
            return null;
        }
        if (getType() == 501) {
            str = C29473c.m69542a(0, "0", this.imageId, this.imageType);
        } else {
            str = C29473c.m69542a(this.packageId, this.version, this.imageId, this.imageType);
        }
        if (!new File(str).exists()) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("file://");
        sb.append(str);
        arrayList.add(sb.toString());
        urlModel.setUrlList(arrayList);
        StringBuilder sb2 = new StringBuilder("file://");
        sb2.append(str);
        urlModel.setUri(sb2.toString());
        return urlModel;
    }

    public String getMsgHint() {
        if (501 == getType()) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(C11010c.m22280a().getString(R.string.bgu));
            sb.append("]");
            return sb.toString();
        } else if (!C9431p.m18664a(getDisplayName())) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(getDisplayName());
            sb2.append("]");
            return sb2.toString();
        } else {
            super.getMsgHint();
            return BIG_EMOJI_MESSAGE_HINT;
        }
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setImageId(long j) {
        this.imageId = j;
    }

    public void setImageType(String str) {
        this.imageType = str;
    }

    public void setPackageId(long j) {
        this.packageId = j;
    }

    public void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static EmojiContent obtain(C29366a aVar) {
        EmojiContent emojiContent = new EmojiContent();
        emojiContent.setUrl(aVar.getAnimateUrl());
        emojiContent.setImageId(aVar.getId());
        emojiContent.setDisplayName(C29298a.m69088b(aVar));
        emojiContent.setImageType(aVar.getAnimateType());
        emojiContent.setPackageId(aVar.getResourcesId());
        emojiContent.setVersion(aVar.getVersion());
        emojiContent.setWidth(aVar.getWidth());
        emojiContent.setHeight(aVar.getHeight());
        if (aVar.getStickerType() == 2) {
            emojiContent.setType(501);
        } else if (aVar.getStickerType() == 3) {
            emojiContent.setType(502);
        } else {
            emojiContent.setType(500);
        }
        return emojiContent;
    }

    public String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a = C11010c.m22280a();
        if (getType() == 501 || C9431p.m18664a(getDisplayName()) || !getDisplayName().contains("GIF")) {
            return getMsgHint();
        }
        if (!z2) {
            return a.getString(R.string.fr3);
        }
        return a.getString(R.string.h82, new Object[]{str});
    }
}
