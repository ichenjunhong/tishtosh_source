package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicOwnerInfo */
public final class MusicOwnerInfo implements Serializable {
    @C17952c(mo34828a = "avatar")
    private UrlModel avatar;
    @C17952c(mo34828a = "enter_type")
    private int enterType;
    @C17952c(mo34828a = "handle")
    private String handle;
    @C17952c(mo34828a = "nick_name")
    private String nickName;
    @C17952c(mo34828a = "sec_uid")
    private String secUid;
    @C17952c(mo34828a = "uid")
    private String uid;
    @C17952c(mo34828a = "is_verified")
    private boolean verified;

    /* renamed from: com.ss.android.ugc.aweme.music.model.MusicOwnerInfo$ArtistType */
    public interface ArtistType {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* renamed from: com.ss.android.ugc.aweme.music.model.MusicOwnerInfo$ArtistType$Companion */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getEnterType() {
        return this.enterType;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setEnterType(int i) {
        this.enterType = i;
    }

    public final void setHandle(String str) {
        this.handle = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setVerified(boolean z) {
        this.verified = z;
    }
}
