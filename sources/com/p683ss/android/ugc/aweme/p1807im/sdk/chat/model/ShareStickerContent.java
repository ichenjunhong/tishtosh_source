package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.PureDataSharePackage.C35127a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareStickerContent */
public final class ShareStickerContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "video_cover_urls")
    private List<UrlModel> awemeCoverList;
    @C17952c(mo34828a = "cover_url")
    private UrlModel cover;
    @C17952c(mo34828a = "sticker_id")
    private String stickerId = "";
    @C17952c(mo34828a = "text")
    private String title = "";
    @C17952c(mo34828a = "user_count")
    private Long userCount = Long.valueOf(0);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareStickerContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final ShareStickerContent fromSharePackage(SharePackage sharePackage) {
            boolean z;
            C52711k.m112240b(sharePackage, "sharePackage");
            ShareStickerContent shareStickerContent = new ShareStickerContent();
            Bundle bundle = sharePackage.f106900i;
            shareStickerContent.setStickerId(bundle.getString("sticker_id"));
            shareStickerContent.setTitle(bundle.getString("sticker_name"));
            shareStickerContent.setUserCount(Long.valueOf(bundle.getLong("user_count")));
            Serializable serializable = bundle.getSerializable("video_cover");
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareStickerContent.setCover((UrlModel) serializable);
            String string = bundle.getString("aweme_cover_list");
            if (string != null) {
                CharSequence charSequence = string;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object parseObject = JSON.parseObject(string, List.class);
                    if (!C52731z.m112267c(parseObject)) {
                        parseObject = null;
                    }
                    shareStickerContent.setAwemeCoverList((List) parseObject);
                }
            }
            return shareStickerContent;
        }
    }

    public static final ShareStickerContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public final SharePackage generateSharePackage() {
        SharePackage a = C35127a.m79360a("sticker");
        a.f106900i.putSerializable("video_cover", this.cover);
        return a;
    }

    public final String getMsgHint() {
        String string = C11010c.m22280a().getResources().getString(R.string.a1v, new Object[]{this.title});
        C52711k.m112236a((Object) string, "AppContextManager.getApp…_transmit_sticker, title)");
        return string;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }

    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        String str2;
        Context a = C11010c.m22280a();
        if (z2) {
            return a.getString(R.string.h81, new Object[]{str, this.title});
        }
        if (z) {
            str2 = a.getString(R.string.fr2, new Object[]{this.title});
            C52711k.m112236a((Object) str2, "context.getString(R.stri….cell_sent_effect, title)");
        } else {
            str2 = a.getString(R.string.hey, new Object[]{this.title});
            C52711k.m112236a((Object) str2, "context.getString(R.stri….self_sent_effect, title)");
        }
        return str2;
    }
}
