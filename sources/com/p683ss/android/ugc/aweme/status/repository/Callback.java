package com.p683ss.android.ugc.aweme.status.repository;

import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.music.model.Music;

/* renamed from: com.ss.android.ugc.aweme.status.repository.Callback */
public interface Callback {
    void callback(Music music);

    void onProgress(DownloadInfo downloadInfo);
}
