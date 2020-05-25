package com.p683ss.android.ugc.aweme.status.repository;

import android.support.p030v4.app.FragmentActivity;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.socialbase.downloader.model.DownloadTask;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.port.p2082in.C39566ar;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p683ss.android.ugc.aweme.status.C45733a;
import com.p683ss.android.ugc.aweme.status.p2272a.C45735b;
import com.p683ss.android.ugc.aweme.tools.AVApi;
import java.io.File;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.status.repository.StatusMusicListRepository */
public final class StatusMusicListRepository {
    public static final C45798a Companion = new C45798a(null);
    private FragmentActivity activity;
    private final IRetrofit retrofit;

    /* renamed from: com.ss.android.ugc.aweme.status.repository.StatusMusicListRepository$RetrofitService */
    public interface RetrofitService {
        @C53075f(mo110603a = "/aweme/v1/commerce/music/list/")
        C17832m<C45800b> getCommerceMusicListmusicList(@C53089t(mo110619a = "scene") String str, @C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "region") String str2);

        @C53075f(mo110603a = "/aweme/v1/music/list/")
        C17832m<C45800b> getMusicListmusicList(@C53089t(mo110619a = "scene") String str, @C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "region") String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.status.repository.StatusMusicListRepository$a */
    public static final class C45798a {
        private C45798a() {
        }

        public /* synthetic */ C45798a(C52707g gVar) {
            this();
        }
    }

    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final IRetrofit getRetrofit() {
        return this.retrofit;
    }

    public final void setActivity(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "<set-?>");
        this.activity = fragmentActivity;
    }

    public StatusMusicListRepository(FragmentActivity fragmentActivity, final Callback callback) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(callback, "cb");
        this.activity = fragmentActivity;
        IRetrofitService createIRetrofitServicebyMonsterPlugin = com.p683ss.android.ugc.aweme.services.RetrofitService.createIRetrofitServicebyMonsterPlugin();
        AVApi createAVApibyMonsterPlugin = AVApiImpl.createAVApibyMonsterPlugin();
        C52711k.m112236a((Object) createAVApibyMonsterPlugin, "ServiceManager.get().getService(AVApi::class.java)");
        IRetrofit createNewRetrofit = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createAVApibyMonsterPlugin.getAPI_URL_PREFIX_SI());
        C52711k.m112236a((Object) createNewRetrofit, "ServiceManager.get().get….java).apI_URL_PREFIX_SI)");
        this.retrofit = createNewRetrofit;
        RetrofitService retrofitService = (RetrofitService) this.retrofit.create(RetrofitService.class);
        C39566ar arVar = C39618d.f101167h;
        C52711k.m112236a((Object) arVar, "AVEnv.LOCATION_SERVICE");
        String a = arVar.mo74214a();
        C52711k.m112236a((Object) a, "AVEnv.LOCATION_SERVICE.region");
        C17832m musicListmusicList = retrofitService.getMusicListmusicList("status", 0, 30, a);
        if (C45733a.m99540a()) {
            C39566ar arVar2 = C39618d.f101167h;
            C52711k.m112236a((Object) arVar2, "AVEnv.LOCATION_SERVICE");
            String a2 = arVar2.mo74214a();
            C52711k.m112236a((Object) a2, "AVEnv.LOCATION_SERVICE.region");
            musicListmusicList = retrofitService.getCommerceMusicListmusicList("status", 0, 30, a2);
        }
        C17825i.m43740a(musicListmusicList, new C17824h<C45800b>(this) {

            /* renamed from: a */
            final /* synthetic */ StatusMusicListRepository f115743a;

            /* renamed from: com.ss.android.ugc.aweme.status.repository.StatusMusicListRepository$1$a */
            public static final class C45797a extends C45735b {

                /* renamed from: a */
                final /* synthetic */ C457961 f115745a;

                /* renamed from: b */
                final /* synthetic */ Music f115746b;

                public final void onProgress(DownloadInfo downloadInfo) {
                    super.onProgress(downloadInfo);
                    callback.onProgress(downloadInfo);
                }

                public final void onSuccessed(DownloadInfo downloadInfo) {
                    super.onSuccessed(downloadInfo);
                    callback.callback(this.f115746b);
                }

                C45797a(C457961 r1, Music music) {
                    this.f115745a = r1;
                    this.f115746b = music;
                }

                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    super.onFailed(downloadInfo, baseException);
                    callback.callback(null);
                }
            }

            public final void onFailure(Throwable th) {
                C52711k.m112240b(th, "t");
                callback.callback(null);
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                C45800b bVar = (C45800b) obj;
                if (bVar != null && bVar.f115752a != null) {
                    List<? extends Music> list = bVar.f115752a;
                    if (list == null) {
                        C52711k.m112234a();
                    }
                    if (!list.isEmpty()) {
                        List<? extends Music> list2 = bVar.f115752a;
                        if (list2 == null) {
                            C52711k.m112234a();
                        }
                        double random = Math.random();
                        List<? extends Music> list3 = bVar.f115752a;
                        if (list3 == null) {
                            C52711k.m112234a();
                        }
                        double size = (double) (list3.size() - 1);
                        Double.isNaN(size);
                        Music music = (Music) list2.get((int) (random * size));
                        UrlModel playUrl = music.getPlayUrl();
                        C52711k.m112236a((Object) playUrl, "music.playUrl");
                        String uri = playUrl.getUri();
                        C52711k.m112236a((Object) uri, "music.playUrl.uri");
                        List b = C52830p.m112452b((CharSequence) uri, new String[]{"/"}, false, 0, 6, (Object) null);
                        StringBuilder sb = new StringBuilder();
                        File filesDir = C39629l.m88233b().getFilesDir();
                        C52711k.m112236a((Object) filesDir, "CameraClient.getApplication().getFilesDir()");
                        sb.append(filesDir.getAbsolutePath());
                        sb.append(File.separator);
                        sb.append("status");
                        sb.append((String) b.get(b.size() - 1));
                        File file = new File(sb.toString());
                        music.setPath(file.getAbsolutePath());
                        DownloadTask with = Downloader.with(this.f115743a.getActivity());
                        UrlModel playUrl2 = music.getPlayUrl();
                        C52711k.m112236a((Object) playUrl2, "music.playUrl");
                        with.url(playUrl2.getUri()).savePath(file.getParent()).name(file.getName()).mainThreadListener(new C45797a(this, music)).download();
                    }
                }
            }

            {
                this.f115743a = r1;
            }
        }, C23551l.f62672a);
    }
}
