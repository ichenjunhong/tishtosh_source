package com.p683ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.music.model.AwemeSearchMusicList;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.a */
public final class C37395a {

    /* renamed from: a */
    public boolean f95407a;

    /* renamed from: b */
    private long f95408b;

    /* renamed from: a */
    public final ArrayList<MusicModel> mo76906a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            AwemeSearchMusicList awemeSearchMusicList = (AwemeSearchMusicList) JSON.parseObject(str, AwemeSearchMusicList.class);
            if (awemeSearchMusicList != null) {
                this.f95408b = (long) awemeSearchMusicList.cursor;
                List<Music> list = awemeSearchMusicList.musicList;
                if (list != null) {
                    ArrayList<MusicModel> arrayList = new ArrayList<>();
                    for (Music convertToMusicModel : list) {
                        MusicModel convertToMusicModel2 = convertToMusicModel.convertToMusicModel();
                        if (convertToMusicModel2 != null) {
                            arrayList.add(convertToMusicModel2);
                        }
                        convertToMusicModel2.setLogPb(awemeSearchMusicList.logPb);
                    }
                    this.f95407a = awemeSearchMusicList.isHasMore();
                    return arrayList;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final String mo76905a(String str, boolean z, String str2, boolean z2) {
        if (!z) {
            try {
                this.f95408b = 0;
            } catch (Exception unused) {
                return null;
            }
        }
        if (z2) {
            long j = this.f95408b;
            C18922i iVar = new C18922i("https://api.tiktokv.com/aweme/v1/music/search/");
            iVar.mo38777a("cursor", j);
            iVar.mo38776a("count", 8);
            iVar.mo38778a("keyword", str);
            iVar.mo38778a("search_source", str2);
            iVar.mo38778a("search_source", "aweme_lyric_sticker");
            iVar.mo38778a("search_channel", "aweme_lyric");
            return iVar.toString();
        }
        long j2 = this.f95408b;
        C18922i iVar2 = new C18922i("https://api.tiktokv.com/aweme/v1/music/search/");
        iVar2.mo38777a("cursor", j2);
        iVar2.mo38776a("count", 8);
        iVar2.mo38778a("keyword", str);
        iVar2.mo38778a("search_source", str2);
        iVar2.mo38778a("search_channel", "tiktok_music_create");
        return iVar2.toString();
    }
}
