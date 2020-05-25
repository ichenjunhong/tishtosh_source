package com.p683ss.android.ugc.aweme.choosemusic.p1514h;

import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.h.d */
public final class C24964d {
    /* renamed from: a */
    public static String m60737a(int i) {
        return i == 0 ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    /* renamed from: b */
    public static boolean m60741b() {
        if (C37249a.f95099a.getMusicListType2() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m60739a() {
        if (AccountService.createIAccountServicebyMonsterPlugin().userService().isChildrenMode() || C37249a.m83510a() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static List<MusicModel> m60740b(List<Music> list) {
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                convertToMusicModel.setChallengeUserCount(music.getUserCount());
                convertToMusicModel.setChallengeMusic(true);
                convertToMusicModel.setDataType(0);
                arrayList.add(convertToMusicModel);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<MusicModel> m60738a(List<Music> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                arrayList.add(music.convertToMusicModel());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static MusicModel m60736a(List<MusicModel> list, String str) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        for (MusicModel musicModel : list) {
            if (musicModel != null && C9431p.m18665a(musicModel.getMusicId(), str)) {
                return musicModel;
            }
        }
        return null;
    }
}
