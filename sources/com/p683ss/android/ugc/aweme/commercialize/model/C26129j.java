package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.j */
public final class C26129j extends Comment implements Serializable {
    private static final long serialVersionUID = 1075399560205544614L;
    @C17952c(mo34828a = "avatar_icon")

    /* renamed from: a */
    private UrlModel f68991a;
    @C17952c(mo34828a = "source")

    /* renamed from: b */
    private String f68992b;
    @C17952c(mo34828a = "title")

    /* renamed from: c */
    private String f68993c;
    @C17952c(mo34828a = "button_text")

    /* renamed from: d */
    private String f68994d;
    @C17952c(mo34828a = "comment_info")

    /* renamed from: e */
    private String f68995e;
    @C17952c(mo34828a = "comment_time")

    /* renamed from: f */
    private long f68996f;
    @C17952c(mo34828a = "comment_style")

    /* renamed from: g */
    private int f68997g;
    @C17952c(mo34828a = "show_button_number")

    /* renamed from: h */
    private int f68998h;
    @C17952c(mo34828a = "comment_nickname")

    /* renamed from: i */
    private String f68999i;
    @C17952c(mo34828a = "type")

    /* renamed from: j */
    private int f69000j;
    @C17952c(mo34828a = "tag_text")

    /* renamed from: k */
    private String f69001k;
    @C17952c(mo34828a = "show_comment_number")

    /* renamed from: l */
    private int f69002l;

    /* renamed from: m */
    private String f69003m;

    /* renamed from: n */
    private AwemeRawAd f69004n;

    /* renamed from: o */
    private boolean f69005o;

    public final String getAid() {
        return this.f69003m;
    }

    public final UrlModel getAvatarIcon() {
        return this.f68991a;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.f69004n;
    }

    public final String getButtonText() {
        return this.f68994d;
    }

    public final String getCommentInfo() {
        return this.f68995e;
    }

    public final String getCommentNickName() {
        return this.f68999i;
    }

    public final int getCommentStyle() {
        return this.f68997g;
    }

    public final long getCommentTime() {
        return this.f68996f;
    }

    public final int getShowButtonNumber() {
        return this.f68998h;
    }

    public final int getShowCommentNumber() {
        return this.f69002l;
    }

    public final String getSource() {
        return this.f68992b;
    }

    public final String getTagText() {
        return this.f69001k;
    }

    public final String getTitle() {
        return this.f68993c;
    }

    public final int getType() {
        return this.f69000j;
    }

    public final boolean isAdFake() {
        return this.f69005o;
    }

    public final C26129j setAdFake(boolean z) {
        this.f69005o = z;
        return this;
    }

    public final C26129j setAid(String str) {
        this.f69003m = str;
        return this;
    }

    public final void setAvatarIcon(UrlModel urlModel) {
        this.f68991a = urlModel;
    }

    public final C26129j setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.f69004n = awemeRawAd;
        return this;
    }

    public final void setButtonText(String str) {
        this.f68994d = str;
    }

    public final void setCommentInfo(String str) {
        this.f68995e = str;
    }

    public final void setCommentNickName(String str) {
        this.f68999i = str;
    }

    public final void setCommentStyle(int i) {
        this.f68997g = i;
    }

    public final void setCommentTime(long j) {
        this.f68996f = j;
    }

    public final void setShowButtonNumber(int i) {
        this.f68998h = i;
    }

    public final void setSource(String str) {
        this.f68992b = str;
    }

    public final void setTitle(String str) {
        this.f68993c = str;
    }
}
