package com.p683ss.android.ugc.aweme.sticker.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.b */
public final class C46067b implements Serializable {
    @C17952c(mo34828a = "ad_owner_id")
    public String adOwnerId;
    @C17952c(mo34828a = "ad_owner_name")
    public String adOwnerName;
    @C17952c(mo34828a = "challenge_id")
    public String challengeId;
    @C17952c(mo34828a = "unlock_info")
    public C46068c commerceStickerUnlockInfo;
    @C17952c(mo34828a = "detail_desc")
    public String detailDesc;
    @C17952c(mo34828a = "detail_letters")
    public String detailLetters;
    @C17952c(mo34828a = "detail_open_url")
    public String detailOpenUrl;
    @C17952c(mo34828a = "detail_web_url")
    public String detailWebUrl;
    @C17952c(mo34828a = "detail_web_url_title")
    public String detailWebUrlTitle;
    @C17952c(mo34828a = "disclaimer")
    public ChallengeDisclaimer disclaimer;
    @C17952c(mo34828a = "expire_time")
    public long expireTime;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f116245id;
    @C17952c(mo34828a = "music_id")
    public String musicId;
    @C17952c(mo34828a = "screen_desc")
    public String screenDesc;
    @C17952c(mo34828a = "screen_icon")
    public UrlModel screenIcon;

    public final String getAdOwnerId() {
        return this.adOwnerId;
    }

    public final String getAdOwnerName() {
        return this.adOwnerName;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final C46068c getCommerceStickerUnlockInfo() {
        return this.commerceStickerUnlockInfo;
    }

    public final String getDetailDesc() {
        return this.detailDesc;
    }

    public final String getDetailLetters() {
        return this.detailLetters;
    }

    public final String getDetailOpenUrl() {
        return this.detailOpenUrl;
    }

    public final String getDetailWebUrl() {
        return this.detailWebUrl;
    }

    public final String getDetailWebUrlTitle() {
        return this.detailWebUrlTitle;
    }

    public final ChallengeDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final String getId() {
        return this.f116245id;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getScreenDesc() {
        return this.screenDesc;
    }

    public final UrlModel getScreenIcon() {
        return this.screenIcon;
    }

    public final void setAdOwnerId(String str) {
        this.adOwnerId = str;
    }

    public final void setAdOwnerName(String str) {
        this.adOwnerName = str;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setCommerceStickerUnlockInfo(C46068c cVar) {
        this.commerceStickerUnlockInfo = cVar;
    }

    public final void setDetailDesc(String str) {
        this.detailDesc = str;
    }

    public final void setDetailLetters(String str) {
        this.detailLetters = str;
    }

    public final void setDetailOpenUrl(String str) {
        this.detailOpenUrl = str;
    }

    public final void setDetailWebUrl(String str) {
        this.detailWebUrl = str;
    }

    public final void setDetailWebUrlTitle(String str) {
        this.detailWebUrlTitle = str;
    }

    public final void setDisclaimer(ChallengeDisclaimer challengeDisclaimer) {
        this.disclaimer = challengeDisclaimer;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setId(String str) {
        this.f116245id = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setScreenDesc(String str) {
        this.screenDesc = str;
    }

    public final void setScreenIcon(UrlModel urlModel) {
        this.screenIcon = urlModel;
    }
}
