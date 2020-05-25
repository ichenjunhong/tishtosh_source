package com.p683ss.android.ugc.aweme.external;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.google.p1057b.p1058a.C17432q;
import com.google.p1057b.p1058a.C17433r;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.effectplatform.C29241b;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.photo.C38676g;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.external.IInfoService;
import com.p683ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p683ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl;
import com.p683ss.android.ugc.aweme.services.story.IAVStoryProxyService;
import com.p683ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43597g;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.external.g */
public final class C29626g implements IInfoService {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f77480a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29626g.class), "stickerUtilsService", "getStickerUtilsService()Lcom/ss/android/ugc/aweme/services/sticker/StickerUtilsServiceImpl;"))};

    /* renamed from: b */
    private final C52668f f77481b = C52732g.m112285a(C29627a.f77483a);

    /* renamed from: c */
    private final C17432q<IAVStoryProxyService> f77482c = C17433r.m42683a(C29628b.f77484a);

    /* renamed from: com.ss.android.ugc.aweme.external.g$a */
    static final class C29627a extends C52712l implements C52670a<StickerUtilsServiceImpl> {

        /* renamed from: a */
        public static final C29627a f77483a = new C29627a();

        C29627a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new StickerUtilsServiceImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.g$b */
    static final class C29628b<T> implements C17432q<T> {

        /* renamed from: a */
        public static final C29628b f77484a = new C29628b();

        C29628b() {
        }

        public final /* synthetic */ Object get() {
            IAVStoryProxyService iAVStoryProxyService;
            Object a = C27991b.m66756a(IAVStoryProxyService.class);
            if (a != null) {
                iAVStoryProxyService = (IAVStoryProxyService) a;
            } else {
                iAVStoryProxyService = (IAVStoryProxyService) C20302a.m50070a(IAVStoryProxyService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
            }
            return iAVStoryProxyService;
        }
    }

    public final List<MusicModel> recommandMusic() {
        return C39618d.f101168i.mo80586h();
    }

    public final IStickerUtilsService stickerInfo() {
        return (StickerUtilsServiceImpl) this.f77481b.getValue();
    }

    public final List<MediaModel> getMediaLoaderImages(Context context) {
        C52711k.m112240b(context, "context");
        List<MediaModel> a = C38676g.m86027a(context);
        C52711k.m112236a((Object) a, "MediaLoader.getImages(context)");
        return a;
    }

    /* renamed from: a */
    private static C26916m m69682a(String str) {
        C43597g gVar = (C43597g) C39618d.f101139C.getRetrofitFactoryGson().mo34884a(str, C43597g.class);
        if (gVar != null) {
            return gVar.getShareContext();
        }
        return null;
    }

    public final VideoExposureData convertToExposureData(Object obj) {
        C52711k.m112240b(obj, "any");
        VideoExposureData convertToExposureData = VideoPublishEditModel.convertToExposureData((VideoPublishEditModel) obj);
        C52711k.m112236a((Object) convertToExposureData, "VideoPublishEditModel.co…as VideoPublishEditModel)");
        return convertToExposureData;
    }

    public final Map<Object, Object> getDataMapForEditActivity(Context context) {
        IAVStoryProxyService iAVStoryProxyService;
        C52711k.m112240b(context, "context");
        C17432q<IAVStoryProxyService> qVar = this.f77482c;
        if (qVar != null) {
            iAVStoryProxyService = (IAVStoryProxyService) qVar.get();
        } else {
            iAVStoryProxyService = null;
        }
        if (iAVStoryProxyService != null) {
            return iAVStoryProxyService.getTrickyMapByActivity(context);
        }
        if (context instanceof VEVideoPublishEditActivity) {
            return ((VEVideoPublishEditActivity) context).mo88096g();
        }
        return null;
    }

    public final C26916m shareContextInfo(Object obj) {
        C52711k.m112240b(obj, "args");
        if (obj instanceof PhotoContext) {
            String str = ((PhotoContext) obj).mainBusinessData;
            if (!C9431p.m18664a(str)) {
                C52711k.m112236a((Object) str, "mainBusinessData");
                return m69682a(str);
            }
        } else if (obj instanceof PhotoMovieContext) {
            String mainBusinessData = ((PhotoMovieContext) obj).getMainBusinessData();
            if (!C9431p.m18664a(mainBusinessData)) {
                C52711k.m112236a((Object) mainBusinessData, "mainBusinessData");
                return m69682a(mainBusinessData);
            }
        } else if (obj instanceof ShortVideoContext) {
            if (obj != null) {
                String str2 = ((ShortVideoContext) obj).f107098ax;
                C52711k.m112236a((Object) str2, "(o as ShortVideoContext).mainBusinessData");
                if (!C9431p.m18664a(str2)) {
                    return m69682a(str2);
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ShortVideoContext");
            }
        } else if (obj instanceof VideoPublishEditModel) {
            String mainBusinessData2 = VideoPublishEditModel.convertToExposureData(obj).getMainBusinessData();
            if (!C9431p.m18664a(mainBusinessData2)) {
                if (mainBusinessData2 == null) {
                    C52711k.m112234a();
                }
                return m69682a(mainBusinessData2);
            }
        }
        return null;
    }

    public final void startDownloadEffectAlog(Effect effect, long j) {
        new C29241b();
        C29241b.m68866a(effect, j);
    }

    public final void endDownloadEffectAlog(Effect effect, long j, long j2, int i, C48649d dVar) {
        new C29241b();
        C29241b.m68867a(effect, j, j2, i, dVar);
    }
}
