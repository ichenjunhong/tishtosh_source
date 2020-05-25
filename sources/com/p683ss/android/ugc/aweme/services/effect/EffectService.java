package com.p683ss.android.ugc.aweme.services.effect;

import android.app.Application;
import android.content.Context;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.presenter.C44352a;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45871b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.C53682y;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.services.effect.EffectService */
public class EffectService implements IEffectService {
    private static EffectService sInstance;
    private File MV_RES_CACHE_FILE = new File(C39618d.f101145I.mo58606d().mo80661a().mo80665b());
    private C45872c fetcher;
    private PoiEffectCheckHelper poiEffectCheckHelper = new PoiEffectCheckHelper();

    public String getLiveStickerPannel() {
        return "livestreaming";
    }

    public String getCacheDir() {
        return EffectPlatform.m68834a();
    }

    public ArrayList<String> getDraftEffectList() {
        return EffectPlatform.m68837f();
    }

    public Map<String, String> getPoiLastMap() {
        return this.poiEffectCheckHelper.getPoiLastMap();
    }

    public void setPoiLastSP() {
        this.poiEffectCheckHelper.setPoiLastSP();
    }

    private EffectService() {
    }

    public static EffectService getInstance() {
        if (sInstance == null) {
            synchronized (EffectService.class) {
                if (sInstance == null) {
                    sInstance = new EffectService();
                }
            }
        }
        return sInstance;
    }

    public C29252f createEffectPlatform(Context context, String str, C53682y yVar) {
        return C29242c.m68869a(context, new EffectService$$Lambda$0(str, yVar));
    }

    public C29252f createMvEffectPlatform(Context context, String str, C53682y yVar) {
        return C29242c.m68869a(context, new EffectService$$Lambda$1(this, str, yVar));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ C52860x lambda$createMvEffectPlatform$1$EffectService(String str, C53682y yVar, EffectPlatformBuilder effectPlatformBuilder) {
        effectPlatformBuilder.setRegion(str).setOkHttpClient(yVar);
        effectPlatformBuilder.setCacheDir(this.MV_RES_CACHE_FILE);
        return null;
    }

    public void fetchEffectWithMusicBind(C29252f fVar, String str, String str2, C48705j jVar) {
        if (this.fetcher == null) {
            this.fetcher = C45871b.m99717a(fVar);
        }
        this.fetcher.mo92470a(str, str2, jVar);
    }

    public void fetchEffectWithMusicBind(C29252f fVar, String str, Map<String, String> map, C48705j jVar) {
        if (this.fetcher == null) {
            this.fetcher = C45871b.m99717a(fVar);
        }
        this.fetcher.mo92471a(str, map, jVar);
    }

    public void getVideoCoverByCallback(List<EffectPointModel> list, C31459g gVar, float f, int i, boolean z, C29059c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        C44352a.m97145a(list, C31460h.m73281a(gVar), f, i, z, C29061d.m68500e(cVar), onVideoCoverCallback);
    }

    public void getVideoCoverByCallback(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback) {
        C39597bg bgVar = C39618d.f101150N;
        Application application = C39618d.f101160a;
        final List<EffectPointModel> list2 = list;
        final String str2 = str;
        final float f2 = f;
        final int i2 = i;
        final boolean z2 = z;
        final EditPreviewInfo editPreviewInfo2 = editPreviewInfo;
        final OnVideoCoverCallback onVideoCoverCallback2 = onVideoCoverCallback;
        C415011 r2 = new C39598a() {
            public void onCancel() {
            }

            public void onSuccess() {
                C44352a.m97145a(list2, str2, f2, i2, z2, editPreviewInfo2, onVideoCoverCallback2);
            }
        };
        bgVar.mo80676a(application, false, r2);
    }
}
