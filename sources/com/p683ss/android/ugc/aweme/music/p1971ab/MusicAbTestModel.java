package com.p683ss.android.ugc.aweme.music.p1971ab;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41565b;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41575g;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41578j;

/* renamed from: com.ss.android.ugc.aweme.music.ab.MusicAbTestModel */
public final class MusicAbTestModel {
    @C41565b(mo85350a = "打开音乐即搜即得", mo85351b = "关闭音乐即搜即得")
    @C17952c(mo34828a = "enable_music_instant_search")
    @C41575g(mo85354a = "Music")
    private boolean isMusicInstantSearchEnabled;
    @C41578j(mo85357a = "本地音乐入口", mo85358b = {0, 1, 2}, mo85359c = {"右上角", "Tab + My Sound", "Tab + Your Files"})
    @C17952c(mo34828a = "local_sound_entrance_style")
    @C41575g(mo85354a = "Music")
    private int localSoundEntranceStyle;
    @C41578j(mo85357a = "收藏和下载的文案AB测试", mo85358b = {0, 1, 2}, mo85359c = {"对照组", "实验组1", "实验组2"})
    @C17952c(mo34828a = "copywriting_in_save_or_download")
    @C41575g(mo85354a = "Feed")
    private int mtCopywritingSaveOrDownload;
    @C41578j(mo85357a = "音乐选择页", mo85358b = {0, 1, 2}, mo85359c = {"旧版本", "新版本、无详情按钮", "新版本、有详情按钮"})
    @C17952c(mo34828a = "music_list_style")
    @C41575g(mo85354a = "Music")
    private int musicListType = 1;
    @C41578j(mo85357a = "音乐选择页2", mo85358b = {0, 1}, mo85359c = {"线上样式", "新样式"})
    @C17952c(mo34828a = "enable_add_sound_new_style")
    @C41575g(mo85354a = "Music")
    private int musicListType2;
    @C41578j(mo85357a = "非标广告位-热歌榜", mo85358b = {0, 1, 2}, mo85359c = {"关闭", "仅展示", "启用"})
    @C17952c(mo34828a = "non_standard_ad_music_list_style")
    private int nonStdMusicList;

    public final int getLocalSoundEntranceStyle() {
        return this.localSoundEntranceStyle;
    }

    public final int getMtCopywritingSaveOrDownload() {
        return this.mtCopywritingSaveOrDownload;
    }

    public final int getMusicListType() {
        return this.musicListType;
    }

    public final int getMusicListType2() {
        return this.musicListType2;
    }

    public final int getNonStdMusicList() {
        return this.nonStdMusicList;
    }

    public final boolean isMusicInstantSearchEnabled() {
        return this.isMusicInstantSearchEnabled;
    }

    public final void setLocalSoundEntranceStyle(int i) {
        this.localSoundEntranceStyle = i;
    }

    public final void setMtCopywritingSaveOrDownload(int i) {
        this.mtCopywritingSaveOrDownload = i;
    }

    public final void setMusicInstantSearchEnabled(boolean z) {
        this.isMusicInstantSearchEnabled = z;
    }

    public final void setMusicListType(int i) {
        this.musicListType = i;
    }

    public final void setMusicListType2(int i) {
        this.musicListType2 = i;
    }

    public final void setNonStdMusicList(int i) {
        this.nonStdMusicList = i;
    }
}
