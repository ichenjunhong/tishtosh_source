package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.e */
public final class C43305e implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    private String f109480a = "";
    @C17952c(mo34828a = "sticker_ids")

    /* renamed from: b */
    private List<String> f109481b;
    @C17952c(mo34828a = "mv_ids")

    /* renamed from: c */
    private List<String> f109482c;
    @C17952c(mo34828a = "challenge_names")

    /* renamed from: d */
    private List<String> f109483d;
    @C17952c(mo34828a = "connect_music")

    /* renamed from: e */
    private List<? extends C42482c> f109484e;
    @C17952c(mo34828a = "anchor")

    /* renamed from: f */
    private C43838fk f109485f;
    @C17952c(mo34828a = "mentioned_users")

    /* renamed from: g */
    private List<? extends TaskMentionedUser> f109486g;
    @C17952c(mo34828a = "optional_materials")

    /* renamed from: h */
    private List<Integer> f109487h;

    public final C43838fk getAnchor() {
        return this.f109485f;
    }

    public final List<String> getChallengeNames() {
        return this.f109483d;
    }

    public final List<C42482c> getConnectMusic() {
        return this.f109484e;
    }

    public final String getId() {
        return this.f109480a;
    }

    public final List<TaskMentionedUser> getMentionedUsers() {
        return this.f109486g;
    }

    public final List<String> getMvIds() {
        return this.f109482c;
    }

    public final List<Integer> getOptionalMaterials() {
        return this.f109487h;
    }

    public final List<String> getStickerIds() {
        return this.f109481b;
    }

    public final void setAnchor(C43838fk fkVar) {
        this.f109485f = fkVar;
    }

    public final void setChallengeNames(List<String> list) {
        this.f109483d = list;
    }

    public final void setConnectMusic(List<? extends C42482c> list) {
        this.f109484e = list;
    }

    public final void setMentionedUsers(List<? extends TaskMentionedUser> list) {
        this.f109486g = list;
    }

    public final void setMvIds(List<String> list) {
        this.f109482c = list;
    }

    public final void setOptionalMaterials(List<Integer> list) {
        this.f109487h = list;
    }

    public final void setStickerIds(List<String> list) {
        this.f109481b = list;
    }

    public final void setId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f109480a = str;
    }
}
