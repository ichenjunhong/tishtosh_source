package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.c */
public class C42482c implements Serializable, Cloneable {
    @C17952c(mo34828a = "is_commerce_music")

    /* renamed from: a */
    boolean f107420a;
    @C17952c(mo34828a = "album")
    public String album;
    @C17952c(mo34828a = "audio_track")
    public UrlModel audioTrack;
    @C17952c(mo34828a = "audition_duration")
    public int auditionDuration;
    @C17952c(mo34828a = "author")
    public String authorName;
    @C17952c(mo34828a = "is_original_sound")

    /* renamed from: b */
    boolean f107421b;
    @C17952c(mo34828a = "dmv_auto_show")

    /* renamed from: c */
    boolean f107422c;
    @C17952c(mo34828a = "challenge")
    public AVChallenge challenge;
    @C17952c(mo34828a = "cover_hd")
    public UrlModel coverHd;
    @C17952c(mo34828a = "cover_large")
    public UrlModel coverLarge;
    @C17952c(mo34828a = "cover_medium")
    public UrlModel coverMedium;
    @C17952c(mo34828a = "cover_thumb")
    public UrlModel coverThumb;
    @C17952c(mo34828a = "lyric_url")

    /* renamed from: d */
    private String f107423d;
    @C17952c(mo34828a = "duration")
    public int duration;
    @C17952c(mo34828a = "preview_start_time")

    /* renamed from: e */
    private float f107424e;
    @C17952c(mo34828a = "extra")
    public String extra;
    @C17952c(mo34828a = "lyric_type")

    /* renamed from: f */
    private int f107425f;
    @C17952c(mo34828a = "prevent_download")

    /* renamed from: g */
    private boolean f107426g;
    @C17952c(mo34828a = "music_wave_data")

    /* renamed from: h */
    private float[] f107427h;
    @C17952c(mo34828a = "is_mv_theme_music")

    /* renamed from: i */
    private boolean f107428i;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public long f107429id;
    @C17952c(mo34828a = "log_pb")

    /* renamed from: j */
    private LogPbBean f107430j;
    @C17952c(mo34828a = "come_from_for_mod")

    /* renamed from: k */
    private int f107431k;
    @C17952c(mo34828a = "redirect")

    /* renamed from: l */
    private boolean f107432l;
    @C17952c(mo34828a = "search_key_words")

    /* renamed from: m */
    private String f107433m;
    @C17952c(mo34828a = "id_str")
    public String mid;
    @C17952c(mo34828a = "title")
    public String musicName;
    @C17952c(mo34828a = "status")
    public int musicStatus;
    @C17952c(mo34828a = "music_type")
    public int musicType;
    @C17952c(mo34828a = "song_id")

    /* renamed from: n */
    private String f107434n;
    @C17952c(mo34828a = "stick_point_music_alg")

    /* renamed from: o */
    private C43799ew f107435o = new C43799ew();
    @C17952c(mo34828a = "offline_desc")
    public String offlineDesc;
    @C17952c(mo34828a = "music_priority")

    /* renamed from: p */
    private int f107436p;
    @C17952c(mo34828a = "path")
    public String path;
    @C17952c(mo34828a = "play_url")
    public UrlModel playUrl;
    @C17952c(mo34828a = "shoot_duration")
    public int shootDuration;
    @C17952c(mo34828a = "source_platform")
    public int source;
    @C17952c(mo34828a = "strong_beat_url")
    public UrlModel strongBeatUrl;

    public String getAlbum() {
        return this.album;
    }

    public int getAuditionDuration() {
        return this.auditionDuration;
    }

    public int getComeFromForMod() {
        return this.f107431k;
    }

    public UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public UrlModel getCoverThumb() {
        return this.coverThumb;
    }

    public boolean getDmvAutoShow() {
        return this.f107422c;
    }

    public int getDuration() {
        return this.duration;
    }

    public long getId() {
        return this.f107429id;
    }

    public LogPbBean getLogPb() {
        return this.f107430j;
    }

    public int getLrcType() {
        return this.f107425f;
    }

    public String getLrcUrl() {
        return this.f107423d;
    }

    public String getMid() {
        return this.mid;
    }

    public String getMusicId() {
        return this.mid;
    }

    public String getMusicName() {
        return this.musicName;
    }

    public int getMusicPriority() {
        return this.f107436p;
    }

    public int getMusicStatus() {
        return this.musicStatus;
    }

    public int getMusicType() {
        return this.musicType;
    }

    public float[] getMusicWaveData() {
        return this.f107427h;
    }

    public String getName() {
        return this.musicName;
    }

    public String getOfflineDesc() {
        return this.offlineDesc;
    }

    public String getPath() {
        return this.path;
    }

    public UrlModel getPlayUrl() {
        return this.playUrl;
    }

    public float getPreviewStartTime() {
        return this.f107424e;
    }

    public String getSearchKeyWords() {
        return this.f107433m;
    }

    public int getShootDuration() {
        return this.shootDuration;
    }

    public String getSinger() {
        return this.authorName;
    }

    public String getSongId() {
        return this.f107434n;
    }

    public C43799ew getStickPointMusicAlg() {
        return this.f107435o;
    }

    public UrlModel getStrongBeatUrl() {
        return this.strongBeatUrl;
    }

    public boolean isCommerceMusic() {
        return this.f107420a;
    }

    public boolean isMvThemeMusic() {
        return this.f107428i;
    }

    public boolean isOriginalSound() {
        return this.f107421b;
    }

    public boolean isPreventDownload() {
        return this.f107426g;
    }

    public boolean isRedirect() {
        return this.f107432l;
    }

    public C42482c clone() {
        try {
            return (C42482c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int getPresenterDuration() {
        if (this.shootDuration > 0) {
            return this.shootDuration;
        }
        return this.duration;
    }

    public int getRealAuditionDuration() {
        if (this.auditionDuration > 0) {
            return this.auditionDuration;
        }
        return getPresenterDuration();
    }

    public String getPicBig() {
        if (this.coverLarge == null || this.coverLarge.getUrlList() == null || this.coverLarge.getUrlList().isEmpty()) {
            return null;
        }
        return (String) this.coverLarge.getUrlList().get(0);
    }

    public String getPicMedium() {
        if (this.coverMedium == null || this.coverMedium.getUrlList() == null || this.coverMedium.getUrlList().isEmpty()) {
            return null;
        }
        return (String) this.coverMedium.getUrlList().get(0);
    }

    public String getPicSmall() {
        if (this.coverThumb == null || this.coverThumb.getUrlList() == null || this.coverThumb.getUrlList().isEmpty()) {
            return null;
        }
        return (String) this.coverThumb.getUrlList().get(0);
    }

    public void setComeFromForMod(int i) {
        this.f107431k = i;
    }

    public void setCommerceMusic(boolean z) {
        this.f107420a = z;
    }

    public void setDmvAutoShow(boolean z) {
        this.f107422c = z;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.f107430j = logPbBean;
    }

    public void setLrcType(int i) {
        this.f107425f = i;
    }

    public void setLrcUrl(String str) {
        this.f107423d = str;
    }

    public void setMusicId(String str) {
        this.mid = str;
    }

    public void setMusicPriority(int i) {
        this.f107436p = i;
    }

    public void setMusicWaveData(float[] fArr) {
        this.f107427h = fArr;
    }

    public void setMvThemeMusic(boolean z) {
        this.f107428i = z;
    }

    public void setOriginalSound(boolean z) {
        this.f107421b = z;
    }

    public void setPreventDownload(boolean z) {
        this.f107426g = z;
    }

    public void setPreviewStartTime(float f) {
        this.f107424e = f;
    }

    public void setRedirect(boolean z) {
        this.f107432l = z;
    }

    public void setSearchKeyWords(String str) {
        this.f107433m = str;
    }

    public void setSongId(String str) {
        this.f107434n = str;
    }

    public void setStickPointMusicAlg(C43799ew ewVar) {
        this.f107435o = ewVar;
    }

    public void setStrongBeatUrl(UrlModel urlModel) {
        this.strongBeatUrl = urlModel;
    }
}
