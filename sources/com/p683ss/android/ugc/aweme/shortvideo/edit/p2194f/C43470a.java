package com.p683ss.android.ugc.aweme.shortvideo.edit.p2194f;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.f.a */
public final class C43470a implements Serializable {

    /* renamed from: a */
    private String f109866a = "";

    /* renamed from: b */
    private String f109867b = "";

    /* renamed from: c */
    private String f109868c = "";

    /* renamed from: d */
    private int f109869d;

    /* renamed from: e */
    private int f109870e;

    /* renamed from: f */
    private float f109871f;

    /* renamed from: g */
    private float f109872g;

    public final String getAudioRecorderUrl() {
        return this.f109866a;
    }

    public final int getEndTime() {
        return this.f109870e;
    }

    public final String getMusicId() {
        return this.f109867b;
    }

    public final String getMusicUrl() {
        return this.f109868c;
    }

    public final float getMusicVolume() {
        return this.f109872g;
    }

    public final int getStartTime() {
        return this.f109869d;
    }

    public final float getVoiceVolume() {
        return this.f109871f;
    }

    public final void setEndTime(int i) {
        this.f109870e = i;
    }

    public final void setMusicVolume(float f) {
        this.f109872g = f;
    }

    public final void setStartTime(int i) {
        this.f109869d = i;
    }

    public final void setVoiceVolume(float f) {
        this.f109871f = f;
    }

    public final void setAudioRecorderUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f109866a = str;
    }

    public final void setMusicId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f109867b = str;
    }

    public final void setMusicUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f109868c = str;
    }

    public final boolean hasChanged(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "newData");
        if (hasAudioRecorderChange(videoPublishEditModel) || hasBgmMusicChange(videoPublishEditModel) || hasVolumeChange(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public final boolean hasVolumeChange(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "newData");
        if (this.f109871f == videoPublishEditModel.voiceVolume && this.f109872g == videoPublishEditModel.musicVolume) {
            return false;
        }
        return true;
    }

    public final boolean hasAudioRecorderChange(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "newData");
        if (videoPublishEditModel.veAudioRecorderParam == null || TextUtils.isEmpty(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            if (!TextUtils.isEmpty(this.f109866a)) {
                return true;
            }
            return false;
        } else if (!this.f109866a.equals(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean hasBgmMusicChange(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "newData");
        if (TextUtils.isEmpty(videoPublishEditModel.musicId)) {
            if (!TextUtils.isEmpty(this.f109867b)) {
                return true;
            }
            return false;
        } else if (this.f109870e == videoPublishEditModel.mMusicEnd && this.f109869d == videoPublishEditModel.mMusicStart && this.f109867b.equals(videoPublishEditModel.musicId)) {
            return false;
        } else {
            return true;
        }
    }

    public final void getData(VideoPublishEditModel videoPublishEditModel) {
        C52711k.m112240b(videoPublishEditModel, "model");
        if (videoPublishEditModel.veAudioRecorderParam == null || TextUtils.isEmpty(videoPublishEditModel.veAudioRecorderParam.getAudioUrl())) {
            this.f109866a = "";
        } else {
            this.f109866a = videoPublishEditModel.veAudioRecorderParam.getAudioUrl();
        }
        if (TextUtils.isEmpty(videoPublishEditModel.musicId)) {
            this.f109867b = "";
        } else {
            String str = videoPublishEditModel.musicId;
            C52711k.m112236a((Object) str, "model.musicId");
            this.f109867b = str;
        }
        if (TextUtils.isEmpty(videoPublishEditModel.mMusicPath)) {
            this.f109868c = "";
        } else {
            String str2 = videoPublishEditModel.mMusicPath;
            C52711k.m112236a((Object) str2, "model.mMusicPath");
            this.f109868c = str2;
        }
        this.f109869d = videoPublishEditModel.mMusicStart;
        this.f109870e = videoPublishEditModel.mMusicEnd;
        this.f109871f = videoPublishEditModel.voiceVolume;
        this.f109872g = videoPublishEditModel.musicVolume;
    }
}
