package com.p683ss.android.ugc.aweme.music.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.ExternalMusicInfo */
public final class ExternalMusicInfo implements Serializable {
    @C17952c(mo34828a = "external_app_link")
    public String externalAppLink;
    @C17952c(mo34828a = "external_deep_link")
    public String externalDeepLink;
    @C17952c(mo34828a = "external_song_key")
    public String externalSongKey;
    @C17952c(mo34828a = "h5_url")
    public String jumpUrl;
    @C17952c(mo34828a = "partner_name")
    public String partnerName;
    @C17952c(mo34828a = "partner_song_id")
    public String partnerSongId;

    public final String getExternalAppLink() {
        return this.externalAppLink;
    }

    public final String getExternalDeepLink() {
        return this.externalDeepLink;
    }

    public final String getExternalSongKey() {
        return this.externalSongKey;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerSongId() {
        return this.partnerSongId;
    }

    public final void setExternalAppLink(String str) {
        this.externalAppLink = str;
    }

    public final void setExternalDeepLink(String str) {
        this.externalDeepLink = str;
    }

    public final void setExternalSongKey(String str) {
        this.externalSongKey = str;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setPartnerName(String str) {
        this.partnerName = str;
    }

    public final void setPartnerSongId(String str) {
        this.partnerSongId = str;
    }
}
