package com.p683ss.android.ugc.aweme.shortvideo.cut;

import com.p683ss.android.ugc.aweme.draft.model.C29067e;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.e */
public final class C42628e implements Serializable {

    /* renamed from: a */
    private String f107837a;

    /* renamed from: b */
    private List<? extends AVTextExtraStruct> f107838b;

    /* renamed from: c */
    private int f107839c;

    /* renamed from: d */
    private String f107840d;

    /* renamed from: e */
    private C29067e f107841e;

    /* renamed from: f */
    private List<? extends AVChallenge> f107842f;

    /* renamed from: g */
    private int f107843g;

    /* renamed from: h */
    private StickerChallenge f107844h;

    /* renamed from: i */
    private String f107845i;

    /* renamed from: j */
    private String f107846j;

    /* renamed from: k */
    private int f107847k;

    /* renamed from: l */
    private int f107848l;

    /* renamed from: m */
    private String f107849m;

    /* renamed from: n */
    private VideoCategoryParam f107850n;

    public final int getAllowDownloadSetting() {
        return this.f107848l;
    }

    public final String getAnchorInfo() {
        return this.f107845i;
    }

    public final List<AVChallenge> getChallenges() {
        return this.f107842f;
    }

    public final int getCommentSetting() {
        return this.f107843g;
    }

    public final String getCommerceData() {
        return this.f107849m;
    }

    public final C29067e getDefaultSelectStickerPoi() {
        return this.f107841e;
    }

    public final int getDownloadSetting() {
        return this.f107847k;
    }

    public final String getPoiId() {
        return this.f107840d;
    }

    public final String getPublishData() {
        return this.f107846j;
    }

    public final StickerChallenge getStickerChallenge() {
        return this.f107844h;
    }

    public final List<AVTextExtraStruct> getStructList() {
        return this.f107838b;
    }

    public final String getTitle() {
        return this.f107837a;
    }

    public final VideoCategoryParam getVideoCategory() {
        return this.f107850n;
    }

    public final int isPrivate() {
        return this.f107839c;
    }

    public final void setAllowDownloadSetting(int i) {
        this.f107848l = i;
    }

    public final void setAnchorInfo(String str) {
        this.f107845i = str;
    }

    public final void setChallenges(List<? extends AVChallenge> list) {
        this.f107842f = list;
    }

    public final void setCommentSetting(int i) {
        this.f107843g = i;
    }

    public final void setCommerceData(String str) {
        this.f107849m = str;
    }

    public final void setDefaultSelectStickerPoi(C29067e eVar) {
        this.f107841e = eVar;
    }

    public final void setDownloadSetting(int i) {
        this.f107847k = i;
    }

    public final void setPoiId(String str) {
        this.f107840d = str;
    }

    public final void setPrivate(int i) {
        this.f107839c = i;
    }

    public final void setPublishData(String str) {
        this.f107846j = str;
    }

    public final void setStickerChallenge(StickerChallenge stickerChallenge) {
        this.f107844h = stickerChallenge;
    }

    public final void setStructList(List<? extends AVTextExtraStruct> list) {
        this.f107838b = list;
    }

    public final void setTitle(String str) {
        this.f107837a = str;
    }

    public final void setVideoCategory(VideoCategoryParam videoCategoryParam) {
        this.f107850n = videoCategoryParam;
    }
}
