package com.p683ss.android.ugc.aweme.utils;

import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.IShortVideoConfig;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.p */
public final class C47935p {

    /* renamed from: a */
    public static final C47935p f120531a = new C47935p();

    private C47935p() {
    }

    /* renamed from: d */
    public static final boolean m103711d(Aweme aweme) {
        boolean z;
        if (aweme != null) {
            z = aweme.downloadWithoutWatermark;
        } else {
            z = false;
        }
        if (!z || !C31190f.m72831a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m103708a(Aweme aweme) {
        Music music;
        if (aweme != null) {
            music = aweme.getMusic();
        } else {
            music = null;
        }
        if (music == null || aweme.getMusic().getMusicStatus() != 0 || C25945k.m62923n().mo54138a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m103712e(Aweme aweme) {
        boolean z;
        if (aweme == null || aweme.getVideoMaskInfo() == null) {
            return false;
        }
        Boolean showMask = aweme.getVideoMaskInfo().getShowMask();
        if (showMask != null) {
            z = showMask.booleanValue();
        } else {
            z = false;
        }
        if (!z || C13248c.m26638a(aweme.getVideoMaskInfo().getTitle()) || C13248c.m26638a(aweme.getVideoMaskInfo().getCancelMaskLabel())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m103709b(Aweme aweme) {
        Video video;
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().shortVideoConfig();
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video == null || aweme.getVideo().getVideoLength() <= 0 || ((((long) aweme.getVideo().getVideoLength()) > shortVideoConfig.maxDuetVideoTime() && !aweme.isSupportGameChallenge()) || !aweme.canDuetVideoType() || aweme.isVr() || aweme.getDuetSetting() == 2 || ((aweme.getDuetSetting() == 1 && !C31190f.m72831a(aweme)) || m103708a(aweme) || aweme.getMusic() == null || aweme.getMusic().getPlayUrl() == null || aweme.getMusic().getPlayUrl().getUrlList() == null || aweme.getMusic().getPlayUrl().getUrlList().isEmpty() || aweme.isWithPromotionalMusic()))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m103710c(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().shortVideoConfig();
        if (aweme.getVideo() != null) {
            Video video = aweme.getVideo();
            C52711k.m112236a((Object) video, "aweme.video");
            if (video.getVideoLength() > 0) {
                Video video2 = aweme.getVideo();
                C52711k.m112236a((Object) video2, "aweme.video");
                if (((long) video2.getVideoLength()) <= shortVideoConfig.maxStitchVideoTime() && aweme.canStitchVideoType() && !aweme.isVr() && aweme.getDuetSetting() != 2 && ((aweme.getDuetSetting() != 1 || C31190f.m72831a(aweme)) && !m103708a(aweme) && aweme.getMusic() != null)) {
                    Music music = aweme.getMusic();
                    C52711k.m112236a((Object) music, "aweme.music");
                    if (music.getPlayUrl() != null) {
                        Music music2 = aweme.getMusic();
                        C52711k.m112236a((Object) music2, "aweme.music");
                        UrlModel playUrl = music2.getPlayUrl();
                        C52711k.m112236a((Object) playUrl, "aweme.music.playUrl");
                        if (playUrl.getUrlList() != null) {
                            Music music3 = aweme.getMusic();
                            C52711k.m112236a((Object) music3, "aweme.music");
                            UrlModel playUrl2 = music3.getPlayUrl();
                            C52711k.m112236a((Object) playUrl2, "aweme.music.playUrl");
                            List urlList = playUrl2.getUrlList();
                            C52711k.m112236a((Object) urlList, "aweme.music.playUrl.urlList");
                            if ((!urlList.isEmpty()) && !aweme.isWithPromotionalMusic()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
