package com.p683ss.android.ugc.aweme.music.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.TextView;
import com.google.gson.C18082l;
import com.p683ss.android.ugc.aweme.music.C37218a;
import com.p683ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import java.util.List;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.music.service.IMusicService */
public interface IMusicService {
    void attachPartnerTag(TextView textView, Music music, boolean z);

    boolean checkValidMusic(MusicModel musicModel, Context context, boolean z);

    boolean checkValidMusic(MusicModel musicModel, Context context, boolean z, boolean z2);

    void downloadMusic(Context context, MusicModel musicModel, boolean z, int i, C37435b bVar);

    Music fetchMusicById(String str, int i);

    Music fetchMusicByIdAndLyricType(String str, boolean z, int i, int i2);

    void fetchMusicDetail(Context context, String str, int i, boolean z, ProgressDialog progressDialog, C37434a aVar);

    String formatVideoDuration(int i);

    int getDownloadStrategy();

    boolean getIsUseMusicPartnersNewStyle();

    String getMusicCoverDisplayText();

    List<String> getMusicCoverUrl(String str);

    long getMusicDuration(String str);

    void initService();

    C37218a provideMusicDownloadPlayHelper(C37625m mVar);

    C0013i<List<MusicModel>> refreshHotMusicList();

    C0013i<SuggestMusicList> refreshSuggestList(String str, String str2);

    C0013i<SuggestMusicList> refreshSuggestList(String str, String str2, String str3);

    C0013i<SuggestMusicList> refreshSuggestList(String str, String str2, String str3, long j);

    C0013i<SuggestMusicList> refreshSuggestLyricList(String str, String str2);

    C0013i<SuggestMusicList> refreshSuggestLyricList(String str, String str2, long j);

    void releaseMusicDownloadTasks();

    void setDownloadStrategy(int i);

    void updateMusicAbTestModel(C18082l lVar);

    C0013i<CollectedMusicList> userCollectedMusicList(int i, int i2);
}
