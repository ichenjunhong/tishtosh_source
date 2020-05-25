package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCompilationContent */
public final class ShareCompilationContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "author_id")
    private String authorId = "";
    @C17952c(mo34828a = "video_cover_urls")
    private List<UrlModel> awemeCoverList;
    @C17952c(mo34828a = "mix_id")
    private String compilationId = "";
    @C17952c(mo34828a = "cover_url")
    private UrlModel cover;
    @C17952c(mo34828a = "text")
    private String title = "";
    @C17952c(mo34828a = "play_count")
    private Long viewCount = Long.valueOf(0);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCompilationContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }

        public final ShareCompilationContent fromSharePackage(SharePackage sharePackage) {
            boolean z;
            C52711k.m112240b(sharePackage, "sharePackage");
            ShareCompilationContent shareCompilationContent = new ShareCompilationContent();
            Bundle bundle = sharePackage.f106900i;
            shareCompilationContent.setCompilationId(bundle.getString("compilation_id"));
            shareCompilationContent.setAuthorId(bundle.getString("user_id"));
            shareCompilationContent.setTitle(bundle.getString("compilation_name"));
            shareCompilationContent.setViewCount(Long.valueOf(bundle.getLong("view_count")));
            Serializable serializable = bundle.getSerializable("video_cover");
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareCompilationContent.setCover((UrlModel) serializable);
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
                    shareCompilationContent.setAwemeCoverList((List) parseObject);
                }
            }
            return shareCompilationContent;
        }
    }

    public static final ShareCompilationContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final String getCompilationId() {
        return this.compilationId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getViewCount() {
        return this.viewCount;
    }

    public final SharePackage generateSharePackage() {
        SharePackage a = C35127a.m79360a("mix");
        a.f106900i.putSerializable("video_cover", this.cover);
        return a;
    }

    public final String getMsgHint() {
        String string = C11010c.m22280a().getResources().getString(R.string.a1u, new Object[]{this.title});
        C52711k.m112236a((Object) string, "AppContextManager.getApp…smit_complilation, title)");
        return string;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCompilationId(String str) {
        this.compilationId = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setViewCount(Long l) {
        this.viewCount = l;
    }
}
