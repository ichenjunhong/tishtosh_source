package com.p683ss.android.ugc.aweme.component.music;

import android.app.ProgressDialog;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.aweme.ttsetting.C11036a;
import com.bytedance.ies.ugc.aweme.ttsetting.C11043b;
import com.bytedance.keva.Keva;
import com.google.gson.C18082l;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.p683ss.android.ugc.aweme.choosemusic.p1514h.C24964d;
import com.p683ss.android.ugc.aweme.music.C37218a;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import com.p683ss.android.ugc.aweme.music.experiment.MusicPartnersExperiment;
import com.p683ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.model.MusicCoverInfo;
import com.p683ss.android.ugc.aweme.music.model.MusicList;
import com.p683ss.android.ugc.aweme.music.model.SimpleMusicDetail;
import com.p683ss.android.ugc.aweme.music.model.ThirdMusicCoverItem;
import com.p683ss.android.ugc.aweme.music.p1971ab.C37249a;
import com.p683ss.android.ugc.aweme.music.p1971ab.MusicAbTestModel;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37488a;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37625m;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1981c.C37597b;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1981c.C37597b.C37598a;
import com.p683ss.android.ugc.aweme.music.service.C37434a;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.music.service.IMusicService;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import com.p683ss.android.ugc.p2425e.C48545a;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.component.music.MusicService */
public class MusicService implements IMusicService {
    public C37372e mMusicFetcher;
    private int musicDownloadStrategy = 2;

    /* renamed from: com.ss.android.ugc.aweme.component.music.MusicService$a */
    static class C27092a {

        /* renamed from: a */
        public static final MusicService f71462a = new MusicService();
    }

    public static MusicService getInstance() {
        return C27092a.f71462a;
    }

    public int getDownloadStrategy() {
        return this.musicDownloadStrategy;
    }

    public String getMusicCoverDisplayText() {
        ThirdMusicCoverItem b = C37597b.f95893c.mo77115b();
        if (b != null) {
            return b.musicCoverDisplayText;
        }
        return null;
    }

    public void initService() {
        C11036a.m22354a((C11043b) new C37598a());
    }

    public void releaseMusicDownloadTasks() {
        if (this.mMusicFetcher != null) {
            this.mMusicFetcher.mo76655a(-1);
        }
    }

    public boolean getIsUseMusicPartnersNewStyle() {
        if (C10181b.m20511a().mo18172a(MusicPartnersExperiment.class, true, "music_detail_music_partners_new_style", 31744, false)) {
            return true;
        }
        return false;
    }

    public C0013i<List<MusicModel>> refreshHotMusicList() {
        return ChooseMusicApi.m60386a().getHotMusicList(0, 10).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<MusicList, List<MusicModel>>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (iVar.mo31c() || iVar.mo33d() || iVar.mo34e() == null) {
                    return null;
                }
                return C24964d.m60738a(((MusicList) iVar.mo34e()).items);
            }
        });
    }

    public static IMusicService createIMusicServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IMusicService.class);
        if (a != null) {
            return (IMusicService) a;
        }
        if (C27991b.f73480ak == null) {
            synchronized (IMusicService.class) {
                if (C27991b.f73480ak == null) {
                    C27991b.f73480ak = new MusicService();
                }
            }
        }
        return (MusicService) C27991b.f73480ak;
    }

    public void setDownloadStrategy(int i) {
        this.musicDownloadStrategy = i;
    }

    public long getMusicDuration(String str) {
        return C37378c.m83691a(str);
    }

    public C37218a provideMusicDownloadPlayHelper(C37625m mVar) {
        return new C37488a(mVar);
    }

    public String formatVideoDuration(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C2240a.m6773a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C2240a.m6773a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    public List<String> getMusicCoverUrl(String str) {
        ThirdMusicCoverItem thirdMusicCoverItem;
        C37597b bVar = C37597b.f95893c;
        if (C10181b.m20511a().mo18172a(MusicPartnersExperiment.class, true, "music_detail_music_partners_new_style", 31744, false)) {
            thirdMusicCoverItem = bVar.mo77115b();
        } else {
            thirdMusicCoverItem = bVar.mo77113a();
        }
        if (thirdMusicCoverItem != null) {
            List<MusicCoverInfo> list = thirdMusicCoverItem.musicCoverInfoList;
            if (!C9376b.m18558a((Collection<T>) list)) {
                for (MusicCoverInfo musicCoverInfo : list) {
                    if (musicCoverInfo != null && TextUtils.equals(musicCoverInfo.partnerName, str)) {
                        return musicCoverInfo.coverUrlList;
                    }
                }
            }
        }
        return null;
    }

    public void updateMusicAbTestModel(C18082l lVar) {
        C52711k.m112240b(lVar, "jsonElement");
        GsonProvider a = C47759cc.m103382a();
        C52711k.m112236a((Object) a, "GsonProvider.get()");
        Object a2 = a.getGson().mo34881a(lVar.mo35009m().mo35022b("data"), MusicAbTestModel.class);
        C52711k.m112236a(a2, "GsonProvider.get().gson.…cAbTestModel::class.java)");
        C37249a.f95099a = (MusicAbTestModel) a2;
        GsonProvider a3 = C47759cc.m103382a();
        C52711k.m112236a((Object) a3, "GsonProvider.get()");
        Keva.getRepo("music_sp").storeString("music_ab_test", a3.getGson().mo34889b(C37249a.f95099a));
    }

    public C0013i<SuggestMusicList> refreshSuggestList(String str, String str2) {
        return refreshSuggestList(str, str2, "");
    }

    public C0013i<SuggestMusicList> refreshSuggestLyricList(String str, String str2) {
        return refreshSuggestLyricList(str, str2, -1);
    }

    public C0013i<CollectedMusicList> userCollectedMusicList(int i, int i2) {
        return ChooseMusicApi.m60383a(i, i2);
    }

    public Music fetchMusicById(String str, int i) {
        try {
            Music music = MusicApi.m83621a(str, i).music;
            if (music != null) {
                return music;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public void attachPartnerTag(TextView textView, Music music, boolean z) {
        C37597b.f95893c.mo77114a(textView, music, z);
    }

    public boolean checkValidMusic(MusicModel musicModel, Context context, boolean z) {
        return C37378c.m83700a(musicModel, context, z);
    }

    public C0013i<SuggestMusicList> refreshSuggestList(String str, String str2, String str3) {
        return refreshSuggestList(str, str2, str3, -1);
    }

    public C0013i<SuggestMusicList> refreshSuggestLyricList(String str, String str2, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().recommentMusicByAIPolicy());
        return ChooseMusicApi.m60386a().getRecommenLyricMusicListFromAI(0, 50, "shoot_page", str, sb.toString(), str2, "aweme_sticker", j).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<MusicList, SuggestMusicList>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (iVar.mo33d() || iVar.mo31c() || iVar.mo34e() == null) {
                    return null;
                }
                SuggestMusicList suggestMusicList = new SuggestMusicList();
                suggestMusicList.musicList = C24964d.m60738a(((MusicList) iVar.mo34e()).items);
                suggestMusicList.musicType = Integer.valueOf(((MusicList) iVar.mo34e()).mMusicType);
                suggestMusicList.logPb = ((MusicList) iVar.mo34e()).logPb;
                return suggestMusicList;
            }
        });
    }

    public boolean checkValidMusic(MusicModel musicModel, Context context, boolean z, boolean z2) {
        return C37378c.m83701a(musicModel, context, z, z2);
    }

    public Music fetchMusicByIdAndLyricType(String str, boolean z, int i, int i2) {
        try {
            com.p683ss.android.ugc.aweme.music.api.MusicApi.MusicService musicService = MusicApi.f95243a;
            if (str != null) {
                str = str.trim();
            }
            Music music = ((SimpleMusicDetail) musicService.queryMusicWithLyricType(str, z, i, i2).get()).music;
            if (music != null) {
                return music;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public C0013i<SuggestMusicList> refreshSuggestList(String str, String str2, String str3, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().recommentMusicByAIPolicy());
        return ChooseMusicApi.m60386a().getRecommenMusicListFromAI(0, 10, "shoot_page", str, sb.toString(), str2, str3, j).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<MusicList, SuggestMusicList>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (iVar.mo33d() || iVar.mo31c() || iVar.mo34e() == null) {
                    return null;
                }
                SuggestMusicList suggestMusicList = new SuggestMusicList();
                suggestMusicList.musicList = C24964d.m60738a(((MusicList) iVar.mo34e()).items);
                suggestMusicList.musicType = Integer.valueOf(((MusicList) iVar.mo34e()).mMusicType);
                suggestMusicList.logPb = ((MusicList) iVar.mo34e()).logPb;
                return suggestMusicList;
            }
        });
    }

    public void downloadMusic(Context context, MusicModel musicModel, boolean z, int i, C37435b bVar) {
        if (musicModel != null && bVar != null) {
            C37372e eVar = new C37372e(context, false, true, z);
            eVar.f95347a = i;
            eVar.mo76656a(musicModel, bVar, -1, true);
        }
    }

    public void fetchMusicDetail(Context context, String str, int i, boolean z, final ProgressDialog progressDialog, final C37434a aVar) {
        MusicModel musicModel;
        try {
            final Music music = MusicApi.m83621a(str, 0).music;
            if (music != null) {
                musicModel = music.convertToMusicModel();
            } else {
                musicModel = null;
            }
            if (musicModel != null) {
                this.mMusicFetcher = new C37372e(context, z);
                this.mMusicFetcher.mo76656a(musicModel, new C37435b() {
                    /* renamed from: a */
                    public final void mo55350a() {
                    }

                    /* renamed from: a */
                    public final void mo55351a(int i) {
                    }

                    /* renamed from: b */
                    public final void mo55354b() {
                        if (progressDialog != null) {
                            progressDialog.show();
                        }
                    }

                    /* renamed from: a */
                    public final void mo55352a(C48545a aVar) {
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                        }
                        if (aVar != null) {
                            aVar.mo76947a(aVar);
                        }
                        MusicService.this.mMusicFetcher = null;
                    }

                    /* renamed from: a */
                    public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
                        MusicModel musicModel;
                        if (progressDialog != null) {
                            progressDialog.dismiss();
                        }
                        if (aVar != null) {
                            try {
                                if (music != null) {
                                    musicModel = music.convertToMusicModel();
                                } else {
                                    musicModel = null;
                                }
                                aVar.mo76948a(str, musicModel);
                            } catch (Exception e) {
                                aVar.mo76947a(e);
                            }
                        }
                        MusicService.this.mMusicFetcher = null;
                    }
                }, -1, true);
            }
        } catch (Exception e) {
            if (aVar != null) {
                aVar.mo76947a(e);
            }
        }
    }
}
