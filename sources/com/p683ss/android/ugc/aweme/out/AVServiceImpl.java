package com.p683ss.android.ugc.aweme.out;

import android.app.Application;
import android.content.Context;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.external.C29624f;
import com.p683ss.android.ugc.aweme.p1361ap.C22801b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.AVPublishServiceImpl;
import com.p683ss.android.ugc.aweme.services.AVSettingsServiceImpl;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.aweme.services.IInternalAVService;
import com.p683ss.android.ugc.aweme.services.ISDKService;
import com.p683ss.android.ugc.aweme.services.SDKServiceImpl;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService;
import com.p683ss.android.ugc.aweme.services.effect.EffectService;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService;
import com.p683ss.android.ugc.aweme.services.filter.IFilterService;
import com.p683ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.services.settings.IDmtAVSettingsService;
import com.p683ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.p683ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.p683ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43257i;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.aweme.utils.C47919gk;
import com.p683ss.android.ugc.aweme.utils.C47951r;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48902j;
import dmt.p2652av.video.p2654b.C52930a;

/* renamed from: com.ss.android.ugc.aweme.out.AVServiceImpl */
public class AVServiceImpl implements IInternalAVService {
    private IDraftService draftService;
    private IFilterService filterService = new C29624f();
    private C52930a loader;
    private ISDKService sdkService;
    private IVideoCoverService videoCoverService;

    static {
        C47919gk.m103684b();
    }

    public IFilterService getFilterService() {
        return this.filterService;
    }

    public String shortVideoDir() {
        return C43307ea.f109491d;
    }

    private IDmtAVSettingsService getSettingsServiceInternal() {
        return AVSettingsServiceImpl.getInstance();
    }

    public IAVSettingsService avSettingsService() {
        return getSettingsServiceInternal();
    }

    public IDmtAVSettingsService dmtSettingsService() {
        return getSettingsServiceInternal();
    }

    public IEffectService effectService() {
        return EffectService.getInstance();
    }

    public void tryCopyDuetDefaultLayout() {
        C43257i.f109380a.mo87935a();
    }

    public IDraftService draftService() {
        if (this.draftService == null) {
            this.draftService = new C46994b();
        }
        return this.draftService;
    }

    public boolean enableMultiPublisherScheduler() {
        return AVPublishServiceImpl.getInstance().enableMultiPublisherScheduler();
    }

    public ISDKService getSDKService() {
        if (this.sdkService == null) {
            this.sdkService = new SDKServiceImpl();
        }
        return this.sdkService;
    }

    public IVideoCoverService videoCoverService() {
        if (this.videoCoverService == null) {
            this.videoCoverService = new VideoCoverServiceImpl();
        }
        return this.videoCoverService;
    }

    public static IInternalAVService createIInternalAVServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IInternalAVService.class);
        if (a != null) {
            return (IInternalAVService) a;
        }
        if (C27991b.f73446aC == null) {
            synchronized (IInternalAVService.class) {
                if (C27991b.f73446aC == null) {
                    C27991b.f73446aC = new AVServiceImpl();
                }
            }
        }
        return (AVServiceImpl) C27991b.f73446aC;
    }

    public VideoExposureData convertToExposureData(Object obj) {
        return VideoPublishEditModel.convertToExposureData(obj);
    }

    public IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context) {
        return new C22801b(context);
    }

    public boolean isPublishServiceRunning(Context context) {
        return AVPublishServiceImpl.getInstance().isPublishServiceRunning(context);
    }

    public void fetchResourcesNeededByRequirements(String[] strArr, final IFetchResourcesListener iFetchResourcesListener) {
        C39618d.m88216e();
        C48580c.m105110b().mo96133a(strArr, (C48902j) new C48902j() {
            /* renamed from: a */
            public final void mo59198a(Exception exc) {
                if (iFetchResourcesListener != null) {
                    iFetchResourcesListener.onFailed(exc);
                }
            }

            /* renamed from: a */
            public final void mo59199a(String[] strArr) {
                if (iFetchResourcesListener != null) {
                    iFetchResourcesListener.onSuccess(strArr);
                }
            }
        });
    }

    public void loadLibrary(String str, Application application) {
        if (C39618d.f101147K.mo74200b()) {
            if (this.loader == null) {
                this.loader = new C52930a();
            }
            this.loader.mo110534b(str);
            return;
        }
        C11511a.m23579a(str, application);
    }

    public void setLastStickerId(Context context, String str, int i) {
        C47951r.m103761a(context, str, i);
    }
}
