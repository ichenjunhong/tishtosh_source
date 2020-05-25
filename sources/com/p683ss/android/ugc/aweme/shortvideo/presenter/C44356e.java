package com.p683ss.android.ugc.aweme.shortvideo.presenter;

import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.p2425e.C48551b;
import com.p683ss.android.ugc.p2425e.C48557d;
import java.io.File;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.e */
public final class C44356e extends C26851b<MusicListModel, C44355d> {
    /* renamed from: b */
    public final void mo44838b() {
        final String str;
        super.mo44838b();
        if (((MusicListModel) this.f70700f).getData() == null) {
            mo44840c_(new Exception());
            return;
        }
        List<Music> list = ((MusicList) ((MusicListModel) this.f70700f).getData()).musicList;
        if (C9376b.m18558a((Collection<T>) list)) {
            mo44840c_(new IllegalArgumentException("empty music list."));
            return;
        }
        Music music = (Music) list.get(0);
        if (music.getPlayUrl() == null || C9376b.m18558a((Collection<T>) music.getPlayUrl().getUrlList())) {
            mo44840c_(new IllegalArgumentException("music exists but no valid play url."));
            return;
        }
        String str2 = (String) music.getPlayUrl().getUrlList().get(0);
        String b = C48557d.m105031a().mo96062b();
        if (!C48551b.m105019a(b)) {
            new File(b).mkdirs();
        }
        String b2 = C48551b.m105020b(str2);
        if (b.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(b2);
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b);
            sb2.append(File.separator);
            sb2.append(b2);
            str = sb2.toString();
        }
        if (C48016e.m103944b(str)) {
            if (this.f70701g != null) {
                ((C44355d) this.f70701g).mo74301a((MusicList) ((MusicListModel) this.f70700f).getData(), str);
            }
            return;
        }
        Downloader.with(C11010c.m22280a()).url(str2).savePath(b).name(b2).retryCount(3).showNotification(false).mainThreadListener(new AbsDownloadListener() {
            public final void onCanceled(DownloadInfo downloadInfo) {
                super.onCanceled(downloadInfo);
                if (C44356e.this.f70701g != null) {
                    ((C44355d) C44356e.this.f70701g).mo74302a(new Exception("cancelled"), "task is cancelled");
                }
            }

            public final void onSuccessed(DownloadInfo downloadInfo) {
                super.onSuccessed(downloadInfo);
                if (C44356e.this.f70701g != null) {
                    ((C44355d) C44356e.this.f70701g).mo74301a((MusicList) ((MusicListModel) C44356e.this.f70700f).getData(), str);
                }
            }

            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                super.onFailed(downloadInfo, baseException);
                if (C44356e.this.f70701g != null) {
                    ((C44355d) C44356e.this.f70701g).mo74302a(new Exception(baseException.getMessage()), baseException.getMessage());
                }
            }
        }).download();
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        super.mo44840c_(exc);
        if (this.f70701g != null) {
            ((C44355d) this.f70701g).mo74302a(exc, "");
        }
    }
}
