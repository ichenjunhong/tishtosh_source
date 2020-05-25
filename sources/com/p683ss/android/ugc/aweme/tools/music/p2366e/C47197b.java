package com.p683ss.android.ugc.aweme.tools.music.p2366e;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1060c.C17593ar;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.b */
public final class C47197b implements C17410f<MusicModel, C42482c> {

    /* renamed from: a */
    public static final C47198a f119156a = new C47198a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.b$a */
    public static final class C47198a {
        private C47198a() {
        }

        public /* synthetic */ C47198a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static ArrayList<C42482c> m102457a(List<? extends MusicModel> list) {
            boolean z;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new ArrayList<>();
            }
            ArrayList<C42482c> a = C17593ar.m43275a((Iterable<? extends E>) C17593ar.m43278a(list, new C47197b()));
            C52711k.m112236a((Object) a, "Lists.newArrayList(Lists…AVMusicTransformation()))");
            return a;
        }

        /* renamed from: a */
        public static MusicModel m102456a(C42482c cVar) {
            C52711k.m112240b(cVar, "avMusic");
            MusicModel musicModel = new MusicModel();
            musicModel.setMusicId(cVar.getMusicId());
            musicModel.setId(cVar.getId());
            musicModel.setAlbum(cVar.getAlbum());
            musicModel.setName(cVar.getMusicName());
            musicModel.setAlbum(cVar.getAlbum());
            if (cVar.getCoverMedium() != null) {
                UrlModel coverMedium = cVar.getCoverMedium();
                C52711k.m112236a((Object) coverMedium, "avMusic.getCoverMedium()");
                if (!C9376b.m18558a((Collection<T>) coverMedium.getUrlList())) {
                    UrlModel coverMedium2 = cVar.getCoverMedium();
                    C52711k.m112236a((Object) coverMedium2, "avMusic.getCoverMedium()");
                    musicModel.setPicPremium((String) coverMedium2.getUrlList().get(0));
                }
            }
            if (cVar.getCoverThumb() != null) {
                UrlModel coverThumb = cVar.getCoverThumb();
                C52711k.m112236a((Object) coverThumb, "avMusic.getCoverThumb()");
                if (!C9376b.m18558a((Collection<T>) coverThumb.getUrlList())) {
                    UrlModel coverThumb2 = cVar.getCoverThumb();
                    C52711k.m112236a((Object) coverThumb2, "avMusic.getCoverThumb()");
                    musicModel.setPicSmall((String) coverThumb2.getUrlList().get(0));
                }
            }
            musicModel.setLocalPath(cVar.getPath());
            musicModel.setSinger(cVar.getSinger());
            if (cVar.getMusicType() == MusicType.ONLINE.ordinal()) {
                musicModel.setUrl(cVar.getPlayUrl());
            }
            musicModel.setDuration(cVar.duration);
            musicModel.setShootDuration(Integer.valueOf(cVar.shootDuration));
            musicModel.setAuditionDuration(Integer.valueOf(cVar.auditionDuration));
            if (cVar.getMusicType() == MusicType.BAIDU.ordinal()) {
                musicModel.setMusicType(MusicType.BAIDU);
            }
            if (cVar.getMusicType() == MusicType.LOCAL.ordinal()) {
                musicModel.setMusicType(MusicType.LOCAL);
            }
            if (cVar.getMusicType() == MusicType.ONLINE.ordinal()) {
                musicModel.setMusicType(MusicType.ONLINE);
            }
            musicModel.setOfflineDesc(cVar.getOfflineDesc());
            musicModel.setMusicStatus(cVar.getMusicStatus());
            musicModel.setStrongBeatUrl(cVar.getStrongBeatUrl());
            musicModel.setLrcUrl(cVar.getLrcUrl());
            musicModel.setLrcType(cVar.getLrcType());
            musicModel.setPreviewStartTime(cVar.getPreviewStartTime());
            musicModel.setExtra(cVar.extra);
            return musicModel;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33734a(Object obj) {
        return m102454a((MusicModel) obj);
    }

    /* renamed from: a */
    public static C42482c m102454a(MusicModel musicModel) {
        String str;
        String str2 = null;
        if (musicModel == null) {
            return null;
        }
        C42482c cVar = new C42482c();
        Music convertToMusic = musicModel.convertToMusic();
        C52711k.m112236a((Object) convertToMusic, "music");
        cVar.f107429id = convertToMusic.getId();
        cVar.setCommerceMusic(convertToMusic.isCommercialMusic());
        cVar.setOriginalSound(convertToMusic.isOriginalSound());
        cVar.mid = convertToMusic.getMid();
        cVar.musicName = convertToMusic.getMusicName();
        cVar.album = convertToMusic.getAlbum();
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            cVar.path = musicModel.getLocalPath();
        } else if (musicModel.isPlayUrlValid()) {
            UrlModel url = musicModel.getUrl();
            C52711k.m112236a((Object) url, "input.url");
            cVar.path = (String) url.getUrlList().get(0);
        }
        cVar.audioTrack = convertToMusic.getAudioTrack();
        cVar.authorName = convertToMusic.getAuthorName();
        cVar.playUrl = convertToMusic.getPlayUrl();
        cVar.coverThumb = convertToMusic.getCoverThumb();
        cVar.coverMedium = convertToMusic.getCoverMedium();
        cVar.coverHd = convertToMusic.getConverHd();
        cVar.coverLarge = convertToMusic.getCoverLarge();
        cVar.duration = convertToMusic.getDuration();
        cVar.shootDuration = convertToMusic.getShootDuration();
        cVar.auditionDuration = convertToMusic.getAuditionDuration();
        cVar.musicType = musicModel.getMusicType().ordinal();
        cVar.offlineDesc = musicModel.getOfflineDesc();
        cVar.musicStatus = convertToMusic.getMusicStatus();
        if (convertToMusic.getChallenge() != null) {
            new C47195a();
            cVar.challenge = C47195a.m102452a(convertToMusic.getChallenge());
        }
        cVar.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        cVar.setLrcUrl(convertToMusic.getLrcUrl());
        cVar.setLrcType(convertToMusic.getLrcType());
        cVar.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        cVar.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            cVar.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        cVar.setMvThemeMusic(musicModel.isMvThemeMusic());
        LogPbBean logPbBean = new LogPbBean();
        com.p683ss.android.ugc.aweme.feed.model.LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null) {
            str = logPb.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        cVar.setLogPb(logPbBean);
        cVar.setComeFromForMod(musicModel.getComeFromForMod());
        cVar.setRedirect(musicModel.isRedirect());
        cVar.setSearchKeyWords(musicModel.getSearchKeyWords());
        cVar.setSongId(musicModel.getSongId());
        cVar.extra = musicModel.getExtra();
        cVar.setDmvAutoShow(musicModel.getDmvAutoShow());
        if (TextUtils.isEmpty(cVar.extra)) {
            Music music = musicModel.getMusic();
            if (music != null) {
                str2 = music.getExtra();
            }
            cVar.extra = str2;
        }
        return cVar;
    }
}
