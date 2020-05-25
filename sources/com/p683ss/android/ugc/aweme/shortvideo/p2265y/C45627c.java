package com.p683ss.android.ugc.aweme.shortvideo.p2265y;

import android.text.TextUtils;
import com.google.p1057b.p1058a.C17410f;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.c */
public final class C45627c implements C17410f<MusicModel, C42482c> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33734a(Object obj) {
        return m99362a((MusicModel) obj);
    }

    /* renamed from: a */
    public static C42482c m99362a(MusicModel musicModel) {
        C42482c cVar = new C42482c();
        Music convertToMusic = musicModel.convertToMusic();
        cVar.setCommerceMusic(musicModel.isCommerceMusic());
        cVar.setOriginalSound(musicModel.isOriginalSound());
        cVar.f107429id = convertToMusic.getId();
        cVar.mid = convertToMusic.getMid();
        cVar.musicName = convertToMusic.getMusicName();
        cVar.album = convertToMusic.getAlbum();
        cVar.path = musicModel.getLocalPath();
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            cVar.path = musicModel.getLocalPath();
        } else if (musicModel.isPlayUrlValid()) {
            cVar.path = (String) musicModel.getUrl().getUrlList().get(0);
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
            new C45625a();
            cVar.challenge = C45625a.m99357a(convertToMusic.getChallenge());
        }
        cVar.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        cVar.setLrcUrl(convertToMusic.getLrcUrl());
        cVar.setLrcType(convertToMusic.getLrcType());
        cVar.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        cVar.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            cVar.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        return cVar;
    }
}
