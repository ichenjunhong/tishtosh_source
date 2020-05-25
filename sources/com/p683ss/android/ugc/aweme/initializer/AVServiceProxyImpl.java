package com.p683ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.net.Uri;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0781c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8683f.C8684a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.p668d.C10702g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.google.gson.C17971f;
import com.google.p1057b.p1060c.C17593ar;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.app.AppLinkHandler;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23032at;
import com.p683ss.android.ugc.aweme.app.C23048bd;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.services.C23145aa;
import com.p683ss.android.ugc.aweme.audio.AudioUtils;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.widget.CanCancelRadioButton.C23737a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.captcha.C24483a;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24564e;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24570i;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24574j;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24578n;
import com.p683ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi;
import com.p683ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi.C24594a;
import com.p683ss.android.ugc.aweme.challenge.recommend.RecommendHashTagApi.HashTagApi;
import com.p683ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.p683ss.android.ugc.aweme.challenge.recommend.p1499a.C24598b;
import com.p683ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25615b;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25626g;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25633j;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28216c;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28219f;
import com.p683ss.android.ugc.aweme.discover.hitrank.C28220g;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.experiment.GreenScreenModeExperiment;
import com.p683ss.android.ugc.aweme.experiment.LoadingDialogExperiment;
import com.p683ss.android.ugc.aweme.experiment.UseHandlerExperiment;
import com.p683ss.android.ugc.aweme.experiment.p1695a.C29499a;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.friends.p1792ui.SummonFriendActivity;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.model.C36140a;
import com.p683ss.android.ugc.aweme.location.C36255b;
import com.p683ss.android.ugc.aweme.location.C36265i;
import com.p683ss.android.ugc.aweme.location.C36266j;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.location.C36275n;
import com.p683ss.android.ugc.aweme.location.C36285u;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.MainFragment;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import com.p683ss.android.ugc.aweme.opensdk.share.C38523c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23209ao;
import com.p683ss.android.ugc.aweme.p1382aq.C23210ap;
import com.p683ss.android.ugc.aweme.p1382aq.C23231d.C23232a;
import com.p683ss.android.ugc.aweme.p1382aq.C23237g;
import com.p683ss.android.ugc.aweme.p1797h.C32945b;
import com.p683ss.android.ugc.aweme.p2391v.C47962a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import com.p683ss.android.ugc.aweme.photomovie.p2048a.C38741a;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38950a;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38952c;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.PoiContext;
import com.p683ss.android.ugc.aweme.port.internal.C39655e;
import com.p683ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.p683ss.android.ugc.aweme.port.internal.ServiceConnectionImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39541ac;
import com.p683ss.android.ugc.aweme.port.p2082in.C39541ac.C39542a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39543ad;
import com.p683ss.android.ugc.aweme.port.p2082in.C39544ae;
import com.p683ss.android.ugc.aweme.port.p2082in.C39545af;
import com.p683ss.android.ugc.aweme.port.p2082in.C39545af.C39546a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39547ag;
import com.p683ss.android.ugc.aweme.port.p2082in.C39548ah;
import com.p683ss.android.ugc.aweme.port.p2082in.C39548ah.C39549a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39550ai;
import com.p683ss.android.ugc.aweme.port.p2082in.C39552aj;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39555a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39556b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39557c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39558d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al.C39559e;
import com.p683ss.android.ugc.aweme.port.p2082in.C39560am;
import com.p683ss.android.ugc.aweme.port.p2082in.C39561an;
import com.p683ss.android.ugc.aweme.port.p2082in.C39562ao;
import com.p683ss.android.ugc.aweme.port.p2082in.C39563ap;
import com.p683ss.android.ugc.aweme.port.p2082in.C39564aq;
import com.p683ss.android.ugc.aweme.port.p2082in.C39564aq.C39565a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39566ar;
import com.p683ss.android.ugc.aweme.port.p2082in.C39569au;
import com.p683ss.android.ugc.aweme.port.p2082in.C39575aw;
import com.p683ss.android.ugc.aweme.port.p2082in.C39576ax;
import com.p683ss.android.ugc.aweme.port.p2082in.C39577ay;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb.C39589a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb.C39590b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc;
import com.p683ss.android.ugc.aweme.port.p2082in.C39593bd;
import com.p683ss.android.ugc.aweme.port.p2082in.C39594be;
import com.p683ss.android.ugc.aweme.port.p2082in.C39594be.C39595a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39596bf;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg;
import com.p683ss.android.ugc.aweme.port.p2082in.C39599bh;
import com.p683ss.android.ugc.aweme.port.p2082in.C39600bi;
import com.p683ss.android.ugc.aweme.port.p2082in.C39603bj;
import com.p683ss.android.ugc.aweme.port.p2082in.C39604bk;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl.C39606a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl.C39607b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39608bm;
import com.p683ss.android.ugc.aweme.port.p2082in.C39609bn;
import com.p683ss.android.ugc.aweme.port.p2082in.C39610bo;
import com.p683ss.android.ugc.aweme.port.p2082in.C39612bq;
import com.p683ss.android.ugc.aweme.port.p2082in.C39613br;
import com.p683ss.android.ugc.aweme.port.p2082in.C39631n;
import com.p683ss.android.ugc.aweme.port.p2082in.C39638t;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39641a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39642b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39643c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39644d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.requesttask.idle.LibraryCompressABGray;
import com.p683ss.android.ugc.aweme.requesttask.idle.ReloadLibraryAB;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.NetworkServiceImpl;
import com.p683ss.android.ugc.aweme.services.connection.IConnectionEntranceService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig.Builder;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieServiceProvider;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieServiceLoadCallback;
import com.p683ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.share.C41934a;
import com.p683ss.android.ugc.aweme.share.C41962ag;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.C42226n;
import com.p683ss.android.ugc.aweme.share.C42227o;
import com.p683ss.android.ugc.aweme.share.libra.MTEndWatermarkExperiment;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42387a;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43870h;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.p2221r.C44406a;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45625a;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45626b;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45629e;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45630f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.ChallengeModule.C445171;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.p2232a.C44572a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2231f.C44571c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45455t;
import com.p683ss.android.ugc.aweme.sticker.prop.api.C46360a;
import com.p683ss.android.ugc.aweme.utils.ActivityStack;
import com.p683ss.android.ugc.aweme.utils.C47675ap;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47910gb;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import com.p683ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p683ss.android.ugc.aweme.video.p2394c.C48008f;
import com.p683ss.android.ugc.aweme.wiki.AddWikiActivity.C48397a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import com.p683ss.android.ugc.trill.share.C50487i;
import com.p683ss.android.ugc.trill.share.SyncShareView;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl */
public class AVServiceProxyImpl implements IAVServiceProxy {
    private C39631n abTestService;
    private C39527aa accountService;
    private C39541ac applicationService;
    private C39638t avConverter;
    private C39543ad bridgeService;
    private C39544ae businessGoodsService;
    private C39545af captchaService;
    private C39554al challengeService;
    private C39548ah commerceService;
    private C39552aj decompressService;
    private C39560am duoShanService;
    private C39562ao hashTagService;
    private C39564aq liveService;
    private C39566ar locationService;
    private C39569au musicService;
    private C39576ax networkService;
    private C39577ay openSDKShareService;
    private IPhotoMovieServiceProvider photomovieServiceProvider;
    private C39588bb poiService;
    private C39591bc publishService;
    private C39593bd settingService;
    private C39594be sharePrefService;
    private C39596bf shareService;
    private C39597bg shortVideoPluginService;
    private C39599bh stickerPropService;
    private C39600bi stickerShareService;
    private C39604bk summonFriendService;
    private C39605bl syncShareService;
    private C39608bm toolsComponentService;
    private C39609bn uiService;
    private C39610bo unlockStickerService;
    private C39613br wikiService;

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$a */
    static class C35646a implements C39631n {
        private C35646a() {
        }

        /* renamed from: b */
        public final boolean mo74140b() {
            return C29499a.m69636a();
        }

        /* renamed from: c */
        public final boolean mo74141c() {
            return MTEndWatermarkExperiment.m92638a();
        }

        /* renamed from: e */
        public final boolean mo74143e() {
            return GreenScreenModeExperiment.m69597a();
        }

        /* renamed from: a */
        public final int mo74139a() {
            return MigrateABTestModel.getInstance().getInsShareType();
        }

        /* renamed from: d */
        public final int mo74142d() {
            return C10181b.m20511a().mo18168a(LoadingDialogExperiment.class, true, "loading_dialog_optimize_type", 31744, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$b */
    static class C35647b implements C39541ac {
        private C35647b() {
        }

        /* renamed from: d */
        public final Class<? extends FragmentActivity> mo74158d() {
            return MainActivity.class;
        }

        /* renamed from: g */
        public final Class<? extends Activity> mo74161g() {
            return AppLinkHandler.class;
        }

        /* renamed from: l */
        public final Class mo74166l() {
            return null;
        }

        /* renamed from: a */
        public final boolean mo74153a(long j) {
            return LocalVideoPlayerManager.m104046a().mo95314a(j);
        }

        /* renamed from: a */
        public final String mo74144a() {
            return TeaAgent.getServerDeviceId();
        }

        /* renamed from: b */
        public final int mo74154b() {
            return C11010c.m22289j();
        }

        /* renamed from: c */
        public final Application mo74157c() {
            return AwemeApplication.m56199a();
        }

        /* renamed from: e */
        public final Class<? extends FragmentActivity> mo74159e() {
            return mo74158d();
        }

        /* renamed from: h */
        public final int mo74162h() {
            return (int) C11010c.m22286g();
        }

        /* renamed from: i */
        public final String mo74163i() {
            return C11010c.m22288i();
        }

        /* renamed from: j */
        public final String mo74164j() {
            return C11010c.m22295p();
        }

        /* renamed from: k */
        public final void mo74165k() {
            C47910gb.m103634a(10);
        }

        /* renamed from: f */
        public final boolean mo74160f() {
            for (Activity activity : ActivityStack.getActivityStack()) {
                if (activity instanceof MainActivity) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final ServiceConnection mo74155b(FragmentActivity fragmentActivity) {
            return new ServiceConnectionImpl(fragmentActivity);
        }

        /* renamed from: a */
        public final void mo74147a(FragmentActivity fragmentActivity) {
            new MainActivityCallback(fragmentActivity, null);
        }

        /* renamed from: b */
        public final boolean mo74156b(String str) {
            return C41302w.m91042a().mo83861a(str);
        }

        /* renamed from: a */
        public final void mo74149a(String str) {
            C30578o.m71566a(C29988ad.valueOf(str));
        }

        /* renamed from: a */
        public final void mo74152a(boolean z) {
            AwemeAppData.m47851a().f61131i = true;
        }

        /* renamed from: a */
        public final void mo74145a(Context context, final C39542a aVar) {
            new C32945b() {
                /* renamed from: a */
                public final void mo69833a(boolean z) {
                    aVar.mo78639a(z);
                }
            }.mo69833a(false);
        }

        /* renamed from: a */
        public final void mo74146a(Context context, AVChallenge aVChallenge) {
            new C23209ao().mo47993a("upload").mo47994b("video").mo47992a(1).mo48076e();
            Builder builder = new Builder();
            builder.creationId(UUID.randomUUID().toString()).challenge(aVChallenge);
            if (!(context instanceof Activity)) {
                builder.launchFlag(268435456);
            }
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C35691d(context, builder));
        }

        /* renamed from: a */
        public final void mo74148a(FragmentActivity fragmentActivity, String str) {
            C52711k.m112240b(fragmentActivity, "activity");
            if (str != null) {
                C28219f fVar = (C28219f) C23540d.m57713a(C11010c.m22280a(), C28219f.class);
                CharSequence charSequence = str;
                if ((C52830p.m112456b(charSequence, (CharSequence) "153070", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "153071", false, 2, (Object) null)) && C28216c.f74076a) {
                    if (!fVar.mo48490a()) {
                        fVar.mo48489a(true);
                        C28216c.f74076a = false;
                        C10691a.m21548c((Context) AwemeApplication.m56199a(), (int) R.string.bbe).mo19066a();
                    }
                    C28220g.f74083b.mo56653a(C28216c.f74077b, 7);
                }
            }
        }

        /* renamed from: a */
        public final void mo74150a(String str, String str2) {
            C23210ap apVar = new C23210ap();
            apVar.mo48072a("shoot_way", str, C23232a.f62005a);
            apVar.mo48072a("shoot_type", str2, C23232a.f62005a);
            apVar.mo48076e();
        }

        /* renamed from: a */
        public final void mo74151a(String str, String str2, String str3) {
            C23237g gVar = new C23237g();
            gVar.f62010a = str;
            gVar.f62011b = str2;
            gVar.f62012c = str3;
            gVar.mo48076e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$c */
    static class C35649c implements C39543ad {
        private C35649c() {
        }

        /* renamed from: c */
        public final boolean mo74176c() {
            return I18nBridgeService.getBridgeService_Monster().needCheckCopyright();
        }

        /* renamed from: b */
        public final boolean mo74175b() {
            return I18nBridgeService.getBridgeService_Monster().needLiveInRecord();
        }

        /* renamed from: a */
        public final boolean mo74171a() {
            return I18nBridgeService.getBridgeService_Monster().isFocusOnVideoTime();
        }

        /* renamed from: a */
        public final String mo74168a(Context context) {
            return C48008f.m103863a(context);
        }

        /* renamed from: c */
        public final boolean mo74177c(Context context) {
            return AudioUtils.m57298c(context);
        }

        /* renamed from: a */
        public final C26916m mo74167a(Object obj) {
            return I18nBridgeService.getBridgeService_Monster().checkShareContextWhenPublish(obj);
        }

        /* renamed from: b */
        public final void mo74174b(Object obj) {
            I18nBridgeService.getBridgeService_Monster().onBackToOpenPlatform(obj);
        }

        /* renamed from: b */
        public final String mo74173b(Context context) {
            C41962ag agVar = (C41962ag) C23540d.m57713a(context, C41962ag.class);
            String a = agVar.mo48475a("");
            Long valueOf = Long.valueOf(agVar.mo48474a(0));
            int a2 = agVar.mo48473a(0);
            if (TextUtils.isEmpty(a) || valueOf.longValue() == 0 || a2 == 0) {
                return "";
            }
            if (System.currentTimeMillis() - valueOf.longValue() >= FbUploadTokenTime.group0 || C11010c.m22287h() <= ((long) a2)) {
                return "";
            }
            agVar.mo48478b("");
            agVar.mo48477b(0);
            agVar.mo48476b(0);
            return a;
        }

        /* renamed from: a */
        public final boolean mo74172a(C26916m mVar) {
            return I18nBridgeService.getBridgeService_Monster().isClientKeyValid(mVar);
        }

        /* renamed from: a */
        public final void mo74170a(String str, String str2) {
            I18nBridgeService.getBridgeService_Monster().trackAppsFlyerEvent(str, null);
        }

        /* renamed from: a */
        public final void mo74169a(Activity activity, C26916m mVar, String str, int i) {
            I18nBridgeService.getBridgeService_Monster().onReturnThirdPlatformFailed(activity, mVar, str, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$d */
    static class C35650d implements C39545af {
        private C35650d() {
        }

        /* renamed from: a */
        public final boolean mo74179a(Exception exc) {
            return C24501b.m59896a(exc);
        }

        /* renamed from: a */
        public final void mo74178a(final C23459a aVar, final C39546a aVar2) {
            C47718bf.m103288a(new C24483a<MainFragment>() {
                /* renamed from: a */
                public final /* synthetic */ void mo48682a(Object obj) {
                    C24501b.m59895a(((MainFragment) obj).getChildFragmentManager(), aVar, new C24493b() {
                        /* renamed from: a */
                        public final void mo45353a() {
                            aVar2.mo80650a();
                        }

                        /* renamed from: b */
                        public final void mo45354b() {
                            aVar2.mo80651b();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$e */
    static class C35653e implements C39554al {
        private C35653e() {
        }

        /* renamed from: a */
        public final C39555a mo74180a(final C26877c<AVChallenge> cVar) {
            C26876b bVar = new C26876b();
            bVar.mo54799a(new C24564e());
            bVar.mo54800a(new C26877c() {
                /* renamed from: R_ */
                public final void mo47017R_() {
                    cVar.mo47017R_();
                }

                public final void aJ_() {
                    cVar.aJ_();
                }

                public final void aS_() {
                    cVar.aS_();
                }

                /* renamed from: e */
                public final void mo47031e() {
                    cVar.mo47031e();
                }

                /* renamed from: a_ */
                public final void mo47024a_(Exception exc) {
                    cVar.mo47024a_(exc);
                }

                /* renamed from: b */
                public final void mo47025b(Exception exc) {
                    cVar.mo47025b(exc);
                }

                /* renamed from: c */
                public final void mo47028c(Exception exc) {
                    cVar.mo47028c(exc);
                }

                /* renamed from: a */
                public final void mo47018a(List list, boolean z) {
                    cVar.mo47018a(C45625a.m99358a(list), z);
                }

                /* renamed from: b */
                public final void mo47026b(List list, boolean z) {
                    cVar.mo47026b(C45625a.m99358a(list), z);
                }

                /* renamed from: c */
                public final void mo47029c(List list, boolean z) {
                    cVar.mo47029c(C45625a.m99358a(list), z);
                }
            });
            bVar.getClass();
            return new C35693f(bVar);
        }

        /* renamed from: a */
        public final C39556b mo74181a(final C39558d dVar) {
            C24574j jVar = new C24574j();
            jVar.mo54799a(new C24570i());
            jVar.mo54800a(new C24578n() {
                /* renamed from: a */
                public final void mo50344a() {
                    dVar.mo80654b();
                }

                /* renamed from: a */
                public final void mo50345a(SearchSugChallengeList searchSugChallengeList) {
                    C39558d dVar = dVar;
                    new C45630f();
                    dVar.mo80653a(C45630f.m99368a(searchSugChallengeList));
                }

                /* renamed from: a */
                public final void mo50346a(Exception exc) {
                    dVar.mo80655d(exc);
                }
            });
            jVar.getClass();
            return new C35692e(jVar);
        }

        /* renamed from: a */
        public final C39557c mo74182a(Fragment fragment) {
            final RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) C0214z.m438a(fragment).mo359a(RecommendHashTagViewModel.class);
            return new C39557c() {
                /* renamed from: a */
                public final C43870h mo74187a() {
                    RecommendHashTagViewModel recommendHashTagViewModel = recommendHashTagViewModel;
                    if (recommendHashTagViewModel.f65066a == null) {
                        recommendHashTagViewModel.f65066a = new C0198r<>();
                    }
                    C24598b bVar = (C24598b) recommendHashTagViewModel.f65066a.getValue();
                    if (bVar == null) {
                        return null;
                    }
                    C43870h hVar = new C43870h();
                    hVar.f111129c = bVar.f65077c;
                    hVar.f111128b = bVar.f65076b;
                    hVar.f111127a = C17593ar.m43275a((Iterable<? extends E>) C17593ar.m43278a(bVar.f65075a, new C45629e()));
                    return hVar;
                }

                /* renamed from: a */
                public final void mo74188a(C39559e eVar) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String str5;
                    RecommendHashTagViewModel recommendHashTagViewModel = recommendHashTagViewModel;
                    if (recommendHashTagViewModel.f65066a == null) {
                        recommendHashTagViewModel.f65066a = new C0198r<>();
                    }
                    C0198r<C24598b> rVar = recommendHashTagViewModel.f65066a;
                    C52711k.m112240b(rVar, "data");
                    HashTagApi hashTagApi = RecommendHashTagApi.f65060a;
                    if (hashTagApi == null) {
                        C52711k.m112234a();
                    }
                    if (eVar != null) {
                        str = eVar.f101112e;
                    } else {
                        str = null;
                    }
                    if (eVar != null) {
                        str2 = eVar.f101111d;
                    } else {
                        str2 = null;
                    }
                    if (eVar != null) {
                        str3 = eVar.f101109b;
                    } else {
                        str3 = null;
                    }
                    if (eVar != null) {
                        str4 = eVar.f101108a;
                    } else {
                        str4 = null;
                    }
                    if (eVar != null) {
                        str5 = eVar.f101110c;
                    } else {
                        str5 = null;
                    }
                    hashTagApi.fetchRecommendHashTagsMT(str, str2, str3, str4, str5, null).mo20a((C0011g<TResult, TContinuationResult>) new C24594a<TResult,TContinuationResult>(rVar), C0013i.f25b);
                }
            };
        }

        /* renamed from: a */
        public final AVChallenge mo74184a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("challenge");
            if (serializableExtra instanceof Challenge) {
                new C45625a();
                return C45625a.m99357a((Challenge) serializableExtra);
            } else if (serializableExtra instanceof AVChallenge) {
                return (AVChallenge) serializableExtra;
            } else {
                return null;
            }
        }

        /* renamed from: a */
        public final AVChallenge mo74185a(String str, int i, boolean z) throws Exception {
            new C45625a();
            return C45625a.m99357a(ChallengeApi.m59966a(str, 0, false).challenge);
        }

        /* renamed from: a */
        public final AVChallenge mo74183a(int i, int i2, Intent intent, int i3) {
            if (i == 1 && i2 == -1) {
                return mo74184a(intent);
            }
            return null;
        }

        /* renamed from: a */
        public final void mo74186a(String str, String str2, int i, int i2, C0781c<AVChallenge> cVar) {
            ChallengeModule challengeModule = new ChallengeModule();
            C445171 r5 = new C17824h<ChallengeDetail>(new C35694g(cVar)) {

                /* renamed from: a */
                final /* synthetic */ C23522b f112641a;

                public final void onFailure(Throwable th) {
                    this.f112641a.mo48682a(null);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    this.f112641a.mo48682a((ChallengeDetail) obj);
                }

                {
                    this.f112641a = r2;
                }
            };
            if (C26403au.m63867b(str) || C26403au.m63867b((String) null)) {
                C17825i.m43740a(challengeModule.f112640a.fetchCommerceChallengeDetail(str, null, 0, 0), r5, C23551l.f62672a);
            } else {
                C17825i.m43740a(challengeModule.f112640a.fetchChallengeDetail(str, null, 0, 0), r5, C23551l.f62672a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$f */
    static class C35657f implements C39548ah {
        private C35657f() {
        }

        /* renamed from: a */
        public final String mo74190a(C29059c cVar) {
            String str = cVar.f76142T.f76113q;
            C26109ad a = C26109ad.m63393a("");
            a.f68924f = C26109ad.m63393a(str).f68924f;
            return C26109ad.m63394a(a);
        }

        /* renamed from: a */
        public final String mo74191a(String str, String str2) {
            C26109ad a = C26109ad.m63393a(str);
            a.f68936r = str2;
            return new C17971f().mo34889b(a);
        }

        /* renamed from: b */
        public final String mo74195b(String str, String str2) {
            C26109ad a = C26109ad.m63393a(str);
            a.f68937s = str2;
            return new C17971f().mo34889b(a);
        }

        /* renamed from: a */
        public final C39549a mo74189a(FragmentActivity fragmentActivity, String str, C39561an anVar) {
            return new C39549a() {
            };
        }

        /* renamed from: a */
        public final boolean mo74193a(Context context, String str, String str2) {
            return C26540w.m64222a(context, str, str2);
        }

        /* renamed from: a */
        public final boolean mo74194a(Context context, String str, boolean z) {
            return C26540w.m64226a(context, str, false);
        }

        /* renamed from: a */
        public final void mo74192a(String str, String str2, String str3, String str4, Map<String, Object> map) {
            if (!TextUtils.isEmpty(str4)) {
                try {
                    AwemeRawAd awemeRawAd = (AwemeRawAd) new C17971f().mo34884a(str4, AwemeRawAd.class);
                    if (awemeRawAd != null) {
                        JSONObject a = C26088l.m63265a(C11010c.m22280a(), awemeRawAd, "", false);
                        if (!TextUtils.isEmpty(str3)) {
                            try {
                                a.put("refer", str3);
                            } catch (JSONException unused) {
                            }
                        }
                        C26088l.m63299a(C11010c.m22280a(), str, str2, a, awemeRawAd);
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$g */
    static class C35659g implements C39552aj {
        private C35659g() {
        }

        /* renamed from: c */
        public final String mo74201c() {
            C47964c.m103778e();
            return C47964c.m103775a();
        }

        /* renamed from: d */
        public final ArrayList<String> mo74202d() {
            C47964c.m103778e();
            return C47962a.m103773a();
        }

        /* renamed from: b */
        public final boolean mo74200b() {
            if (C10181b.m20511a().mo18167a(LibraryCompressABGray.class, true, "decompress_so_strategy_client", ClientExpManager.decompress_so_strategy_client()) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo74203e() {
            return C10181b.m20511a().mo18172a(ReloadLibraryAB.class, true, "reload_vesdk_library_strategy", 31744, true);
        }

        /* renamed from: a */
        public final boolean mo74199a() {
            boolean z;
            String str;
            boolean b = mo74200b();
            boolean b2 = C47964c.m103778e().mo95123b();
            if (!b || !b2) {
                z = false;
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder("So decompress: DecompressServiceImpl, decompressing is ");
            if (!b || !b2) {
                str = "not";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" required, experiment value: ");
            sb.append(C10181b.m20511a().mo18167a(LibraryCompressABGray.class, true, "decompress_so_strategy_client", ClientExpManager.decompress_so_strategy_client()));
            sb.append(", compress status: ");
            sb.append(b2);
            C45407ay.m98968a(sb.toString());
            return z;
        }

        /* renamed from: a */
        public final void mo74196a(int i) {
            if (mo74200b()) {
                StringBuilder sb = new StringBuilder("So decompress: DecompressServiceImpl, calling decompress, required by experiment, type: ");
                sb.append(i);
                C45407ay.m98968a(sb.toString());
                C47964c.m103778e().mo95122a(i, false, null);
            }
        }

        /* renamed from: a */
        public final void mo74197a(C52682m<? super Boolean, ? super Long, C52860x> mVar) {
            if (mo74199a()) {
                C45407ay.m98968a("So decompress: need decompressing, waiting");
                C47964c.m103778e().f120580b.add(mVar);
                return;
            }
            C45407ay.m98968a("So decompress: no need to decompress");
            mVar.invoke(Boolean.valueOf(true), Long.valueOf(-1));
        }

        /* renamed from: a */
        public final void mo74198a(boolean z, C52682m<? super Boolean, ? super Long, C52860x> mVar) {
            if (mo74200b()) {
                StringBuilder sb = new StringBuilder("So decompress: DecompressServiceImpl, calling decompress, required by feature. Foreground: ");
                sb.append(z);
                C45407ay.m98968a(sb.toString());
                C47964c.m103778e().mo95122a(-1, z, mVar);
                return;
            }
            C45407ay.m98968a("So decompress: DecompressServiceImpl, calling decompress, but not in experiment, return");
            mVar.invoke(Boolean.valueOf(true), Long.valueOf(-1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$h */
    static class C35660h implements C39560am {
        private C35660h() {
        }

        /* renamed from: a */
        public final boolean mo74204a() {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$i */
    static class C35661i implements C39562ao {
        private C35661i() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|7|8|9|(1:11)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001b */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo74205a(long r2, java.lang.String r4) {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.challenge.data.c r0 = new com.ss.android.ugc.aweme.challenge.data.c
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0.<init>(r2, r4)
                com.ss.android.e.c<com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase> r2 = com.p683ss.android.ugc.aweme.challenge.data.C24591d.f65058a     // Catch:{ Exception -> 0x002b }
                java.lang.Object r2 = r2.mo39084b()     // Catch:{ Exception -> 0x002b }
                com.ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase r2 = (com.p683ss.android.ugc.aweme.challenge.data.LocalHashTagDataBase) r2     // Catch:{ Exception -> 0x002b }
                if (r2 == 0) goto L_0x002a
                com.ss.android.ugc.aweme.challenge.data.a r2 = r2.mo50351g()     // Catch:{ Exception -> 0x002b }
                r2.mo50354a(r0)     // Catch:{ SQLiteConstraintException -> 0x001b }
                goto L_0x001e
            L_0x001b:
                r2.mo50356b(r0)     // Catch:{ Exception -> 0x002b }
            L_0x001e:
                int r3 = r2.mo50355b()     // Catch:{ Exception -> 0x002b }
                r4 = 20
                if (r3 <= r4) goto L_0x002a
                int r3 = r3 - r4
                r2.mo50353a(r3)     // Catch:{ Exception -> 0x002b }
            L_0x002a:
                return
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl.C35661i.mo74205a(long, java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$j */
    static class C35662j implements C39563ap {
        private C35662j() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$k */
    static class C35663k implements C39564aq {

        /* renamed from: a */
        private final Map<Class, Object> f91620a;

        /* renamed from: b */
        private final Map<C39565a, C8684a> f91621b;

        /* renamed from: c */
        public final C39655e mo74213c() {
            return C36173w.m81665a().getLiveModule();
        }

        private C35663k() {
            this.f91620a = new HashMap();
            this.f91621b = new HashMap();
            this.f91620a.put(C39563ap.class, new C35662j());
        }

        /* renamed from: b */
        public final boolean mo74212b() {
            if (!C36173w.m81665a().getLiveServiceAdapter().mo74827a() || C36173w.m81665a().getLive() == null) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo74209a() {
            return I18nBridgeService.getBridgeService_Monster().needLiveInRecord();
        }

        /* renamed from: b */
        public final void mo74211b(boolean z) {
            C36173w.m81665a().getLiveServiceAdapter().mo74828b(z);
        }

        /* renamed from: a */
        public final void mo74208a(boolean z) {
            C36173w.m81665a().getLiveServiceAdapter().mo74826a(z);
        }

        /* renamed from: b */
        public final void mo74210b(C39565a aVar) {
            C8684a aVar2 = (C8684a) this.f91621b.get(aVar);
            if (aVar2 != null) {
                this.f91621b.remove(aVar);
                C36173w.m81665a().startLiveManager().mo8932b(aVar2);
            }
        }

        /* renamed from: a */
        public final void mo74207a(C39565a aVar) {
            C8684a aVar2 = (C8684a) this.f91621b.get(aVar);
            if (aVar2 == null) {
                aVar.getClass();
                aVar2 = new C35695h(aVar);
                this.f91621b.put(aVar, aVar2);
            }
            C36173w.m81665a().startLiveManager().mo8931a(aVar2);
        }

        /* renamed from: a */
        public final void mo74206a(C31459g gVar, int i) {
            C47718bf.m103288a(new C36140a(gVar, i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$l */
    static class C35664l implements C39566ar {
        private C35664l() {
        }

        /* renamed from: b */
        public final Boolean mo74220b() {
            return Boolean.valueOf(false);
        }

        /* renamed from: d */
        public final boolean mo74224d() {
            return C36255b.m81859d();
        }

        /* renamed from: a */
        public final String mo74214a() {
            C36699t d = C23145aa.m56732d();
            if (d != null) {
                return d.mo47865b();
            }
            return "";
        }

        /* renamed from: c */
        public final Boolean mo74222c() {
            return Boolean.valueOf(C35837h.m80977b());
        }

        /* renamed from: a */
        public final void mo74215a(Context context) {
            C36272l.m81897a(context).mo75074b();
        }

        /* renamed from: b */
        public final void mo74221b(Context context) {
            C36285u uVar = C36272l.m81897a(context).f92826b;
            if (uVar != null) {
                C36266j jVar = uVar.f92882a;
                if (jVar != null) {
                    WeakReference<C36265i> weakReference = jVar.f92835b;
                    if (weakReference != null) {
                        weakReference.clear();
                    }
                    jVar.f92835b = null;
                    C36275n nVar = jVar.f92836c;
                    if (nVar != null) {
                        nVar.mo75065c();
                    }
                }
            }
        }

        /* renamed from: c */
        public final void mo74223c(Context context) {
            C23048bd a = C23048bd.f61405f.mo47774a(context);
            if (a.f61409d != null) {
                SensorManager sensorManager = a.f61406a;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(a);
                }
            }
        }

        /* renamed from: a */
        public final void mo74219a(Context context, final C39644d dVar) {
            if (!C36255b.m81859d()) {
                C36255b.m81858a((Activity) context, (C47939a) new C47939a() {
                    /* renamed from: a */
                    public final void mo60068a() {
                        if (dVar != null) {
                            dVar.mo74039a();
                        }
                    }

                    /* renamed from: b */
                    public final void mo60069b() {
                        if (dVar != null) {
                            dVar.mo74040b();
                        }
                    }
                });
            } else {
                dVar.mo74039a();
            }
        }

        /* renamed from: a */
        public final void mo74217a(Context context, final C39641a aVar) {
            C23048bd.f61405f.mo47774a(context).f61409d = new C23032at() {
                /* renamed from: a */
                public final void mo47762a(float f) {
                    aVar.mo80713a(f);
                }
            };
            C23048bd a = C23048bd.f61405f.mo47774a(context);
            if (a.f61409d != null) {
                SensorManager sensorManager = a.f61406a;
                if (sensorManager != null) {
                    sensorManager.registerListener(a, a.f61407b, 1);
                }
                SensorManager sensorManager2 = a.f61406a;
                if (sensorManager2 != null) {
                    sensorManager2.registerListener(a, a.f61408c, 1);
                }
            }
        }

        /* renamed from: a */
        public final void mo74218a(Context context, C39642b bVar) {
            if (context != null) {
                C39054d a = C36272l.m81897a(context.getApplicationContext()).mo75072a();
                if (a == null || !a.isValid()) {
                    C36272l.m81897a(context.getApplicationContext()).mo75073a((C36265i) new C35696i(context, bVar));
                } else {
                    bVar.mo74042a(a.latitude, a.longitude);
                }
            }
        }

        /* renamed from: a */
        public final void mo74216a(final Context context, int i, final C39643c cVar) {
            C36272l a = C36272l.m81897a(context);
            C356662 r0 = new C36265i() {
                public final void bF_() {
                    new C45626b();
                    cVar.mo80714a(C45626b.m99360a(C36272l.m81897a(context).mo75072a()));
                }
            };
            C52711k.m112240b(r0, "locationCallback");
            C36285u uVar = a.f92826b;
            if (uVar != null) {
                C52711k.m112240b(r0, "locationCallback");
                C36266j jVar = uVar.f92882a;
                if (jVar != null) {
                    C52711k.m112240b(r0, "locationCallback");
                    if (jVar.mo75088c()) {
                        C36275n nVar = jVar.f92836c;
                        if (nVar != null) {
                            jVar.f92835b = new WeakReference<>(r0);
                            nVar.mo75063a(3);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$m */
    static class C35668m implements IPhotoMovieServiceProvider {

        /* renamed from: a */
        IPhotoMovieService f91629a;

        private C35668m() {
        }

        public final void get(Context context, String str, final PhotoMovieServiceLoadCallback photoMovieServiceLoadCallback) {
            if (this.f91629a != null) {
                photoMovieServiceLoadCallback.onPhotoMovieServiceLoadSuccess(this.f91629a);
                return;
            }
            try {
                this.f91629a = (IPhotoMovieService) Class.forName("com.ss.android.ugc.aweme.services.photomovie.PhotoMovieService").newInstance();
                photoMovieServiceLoadCallback.onPhotoMovieServiceLoadSuccess(this.f91629a);
            } catch (Exception unused) {
                new C38741a(str, new PhotoMovieServiceLoadCallback() {
                    public final void onPhotoMovieServiceLoadSuccess(IPhotoMovieService iPhotoMovieService) {
                        C35668m.this.f91629a = iPhotoMovieService;
                        photoMovieServiceLoadCallback.onPhotoMovieServiceLoadSuccess(iPhotoMovieService);
                    }

                    public final void onPhotoMovieServiceLoadFailed(int i, String str) {
                        photoMovieServiceLoadCallback.onPhotoMovieServiceLoadFailed(i, str);
                    }
                }).mo55969b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$n */
    static class C35670n implements C39588bb {
        private C35670n() {
        }

        /* renamed from: a */
        public final String mo74229a(String str) {
            return PoiContext.serializeForDraft(str);
        }

        /* renamed from: a */
        public final void mo74231a(C39590b bVar, FragmentActivity fragmentActivity, boolean z) {
            C44572a.m97511a().mo90503a((C38950a) null);
        }

        /* renamed from: a */
        public final void mo74230a(final C39589a aVar, FragmentActivity fragmentActivity, boolean z) {
            C44572a a = C44572a.m97511a().mo90503a((C38950a) new C38950a() {
                /* renamed from: a */
                public final void mo74232a() {
                    if (aVar != null) {
                        aVar.mo80673a();
                    }
                }

                /* renamed from: b */
                public final void mo74234b() {
                    if (aVar != null) {
                        aVar.mo80675b();
                    }
                }

                /* renamed from: a */
                public final void mo74233a(C38952c cVar, PoiStruct poiStruct, String str) {
                    if (aVar != null) {
                        aVar.mo80674a(poiStruct.toStickerPoiStruct(), str);
                    }
                }
            });
            if (!C36255b.m81859d()) {
                C36255b.m81858a((Activity) fragmentActivity, (C47939a) new C47939a(fragmentActivity) {

                    /* renamed from: a */
                    final /* synthetic */ FragmentActivity f112770a;

                    /* renamed from: a */
                    public final void mo60068a() {
                        C44572a.this.mo90504a((Activity) this.f112770a);
                    }

                    /* renamed from: b */
                    public final void mo60069b() {
                        C10691a.m21542b((Context) this.f112770a, (int) R.string.oj).mo19066a();
                    }

                    {
                        this.f112770a = r2;
                    }
                });
            } else {
                a.mo90504a((Activity) fragmentActivity);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$o */
    static class C35672o implements C39593bd {
        private C35672o() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$p */
    static class C35673p implements C39594be {
        private C35673p() {
        }

        /* renamed from: a */
        public final String mo74236a() {
            return "guide";
        }

        /* renamed from: b */
        public final C39595a<Boolean> mo74238b() {
            return new C39595a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo74245a() {
                    return (Boolean) SharePrefCache.inst().getIsAwemePrivate().mo47782d();
                }

                /* renamed from: a */
                public final /* synthetic */ void mo74246a(Object obj) {
                    SharePrefCache.inst().getIsAwemePrivate().mo47776a((Boolean) obj);
                }
            };
        }

        /* renamed from: c */
        public final C39595a<Boolean> mo74241c() {
            return new C39595a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo74245a() {
                    return (Boolean) SharePrefCache.inst().getAutoSaveVideo().mo47782d();
                }

                /* renamed from: a */
                public final /* synthetic */ void mo74246a(Object obj) {
                    SharePrefCache.inst().getAutoSaveVideo().mo47776a((Boolean) obj);
                }
            };
        }

        /* renamed from: d */
        public final C39595a<Boolean> mo74242d() {
            return new C39595a<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo74245a() {
                    return (Boolean) C23183v.m56778a().mo47897H().mo47782d();
                }

                /* renamed from: a */
                public final /* synthetic */ void mo74246a(Object obj) {
                    C23183v.m56778a().mo47897H().mo47776a((Boolean) obj);
                }
            };
        }

        /* renamed from: e */
        public final C39595a<Integer> mo74243e() {
            return new C39595a<Integer>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo74245a() {
                    return (Integer) SharePrefCache.inst().getStoryInfoStickerMaxCount().mo47782d();
                }

                /* renamed from: a */
                public final /* synthetic */ void mo74246a(Object obj) {
                    SharePrefCache.inst().getStoryInfoStickerMaxCount().mo47776a((Integer) obj);
                }
            };
        }

        /* renamed from: f */
        public final C39595a<Integer> mo74244f() {
            return new C39595a<Integer>() {
                /* renamed from: a */
                public final /* synthetic */ Object mo74245a() {
                    return (Integer) SharePrefCache.inst().getStoryTextStickerMaxCount().mo47782d();
                }

                /* renamed from: a */
                public final /* synthetic */ void mo74246a(Object obj) {
                    SharePrefCache.inst().getStoryTextStickerMaxCount().mo47776a((Integer) obj);
                }
            };
        }

        /* renamed from: a */
        public final int mo74235a(String str, int i) {
            return C23542f.m57715a().mo48699a(str, 0);
        }

        /* renamed from: b */
        public final void mo74239b(String str, int i) {
            C23542f.m57715a().mo48707b(str, i);
        }

        /* renamed from: a */
        public final boolean mo74237a(String str, boolean z) {
            return C23542f.m57715a().mo48705a(str, true);
        }

        /* renamed from: b */
        public final void mo74240b(String str, boolean z) {
            C23542f.m57715a().mo48710b(str, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$q */
    static class C35679q implements C39596bf {
        private C35679q() {
        }

        /* renamed from: a */
        public final boolean mo74247a() {
            return C41979aq.m91946a().getMuteDownloadForJapanExperiment();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$r */
    static class C35680r implements C39600bi {
        private C35680r() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$s */
    static class C35681s implements C39604bk {
        private C35681s() {
        }

        /* renamed from: a */
        public final User mo74248a(Intent intent) {
            if (intent != null) {
                return (User) intent.getSerializableExtra("extra_data");
            }
            return null;
        }

        /* renamed from: a */
        public final void mo74249a(Fragment fragment, int i) {
            SummonFriendActivity.m75410a(fragment, 3, "", 0);
        }

        /* renamed from: a */
        public final void mo74250a(Fragment fragment, int i, String str, int i2) {
            SummonFriendActivity.m75410a(fragment, 3, str, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$t */
    static class C35682t implements C39605bl {
        private C35682t() {
        }

        /* renamed from: a */
        public final C39606a mo74251a(Context context, int i) {
            final C42227o oVar;
            new C42226n();
            if (C41934a.m91880a()) {
                oVar = new C50487i(context, 0);
            } else {
                oVar = new SyncShareView(context, 0);
            }
            return new C39606a() {
                /* renamed from: d */
                public final View mo74261d() {
                    return oVar;
                }

                /* renamed from: a */
                public final void mo74252a() {
                    oVar.mo86175a();
                }

                /* renamed from: b */
                public final String mo74259b() {
                    return oVar.mo86180b();
                }

                /* renamed from: c */
                public final int mo74260c() {
                    return oVar.getSaveUploadType();
                }

                /* renamed from: a */
                public final void mo74253a(int i) {
                    oVar.mo86176a(i);
                }

                /* renamed from: a */
                public final void mo74257a(Fragment fragment) {
                    oVar.f106754a = fragment;
                }

                /* renamed from: a */
                public final void mo74258a(String str) {
                    oVar.setSyncShareViewTitle(str);
                }

                /* renamed from: a */
                public final void mo74255a(int i, C39607b bVar) {
                    C42227o oVar = oVar;
                    bVar.getClass();
                    oVar.mo86178a(1, (C23737a) new C35697j(bVar));
                }

                /* renamed from: a */
                public final void mo74256a(int i, boolean z) {
                    oVar.mo86179a(1, z);
                }

                /* renamed from: a */
                public final void mo74254a(int i, int i2, Intent intent) {
                    oVar.mo86177a(i, i2, intent);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$u */
    static class C35684u implements C39609bn {
        private C35684u() {
        }

        /* renamed from: a */
        public final int mo74262a() {
            return C10675b.m21494a().f28434a;
        }

        /* renamed from: b */
        public final boolean mo74268b() {
            return UseHandlerExperiment.m69633a("Camera");
        }

        /* renamed from: a */
        public final Drawable mo74263a(Context context) {
            return context.getResources().getDrawable(2131953301);
        }

        /* renamed from: a */
        public final C50207b mo74265a(Activity activity) {
            if (activity instanceof C23441t) {
                return C47675ap.m103188a((C23441t) activity);
            }
            return null;
        }

        /* renamed from: a */
        public final boolean mo74266a(String str) {
            return C10702g.m21573a().mo19076a(str);
        }

        /* renamed from: a */
        public final C13791d<C14045f> mo74264a(C13791d<C14045f> dVar, Uri uri, Context context, UrlModel urlModel) {
            return C23515d.m57662a(dVar, uri, context, urlModel);
        }

        /* renamed from: a */
        public final C14229b[] mo74267a(UrlModel urlModel, C13952d dVar, C13951c cVar, C14234d dVar2, Config config) {
            return C23515d.m57682a(urlModel, dVar, cVar, dVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl$v */
    public static class C35685v implements C39613br {

        /* renamed from: b */
        private List<C39612bq> f91641b = new ArrayList();

        C35685v() {
            C47718bf.m103290c(this);
        }

        /* renamed from: a */
        public final int mo74269a() {
            List b = AnchorListManager.f67772d.mo52758b();
            if (b == null || b.isEmpty()) {
                return 0;
            }
            for (int i = 0; i < b.size(); i++) {
                if (((C25626g) b.get(i)).f67830a == C25600a.WIKIPEDIA.getTYPE()) {
                    return ((C25626g) b.get(i)).f67840k;
                }
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo74271a(C39612bq bqVar) {
            this.f91641b.add(bqVar);
        }

        /* renamed from: b */
        public final void mo74272b(C39612bq bqVar) {
            this.f91641b.remove(bqVar);
        }

        @C53771m(mo112975a = ThreadMode.MAIN)
        public void onAsyncAnchor(C25615b bVar) {
            for (C39612bq a : this.f91641b) {
                a.mo80687a(bVar.f67806a);
            }
        }

        @C53771m(mo112975a = ThreadMode.MAIN)
        public void onWikiActivityClose(C25633j jVar) {
            for (C39612bq a : this.f91641b) {
                a.mo80687a(null);
            }
        }

        /* renamed from: a */
        public final void mo74270a(Context context, Map<String, String> map) {
            String str;
            List b = AnchorListManager.f67772d.mo52758b();
            if (b != null) {
                for (int i = 0; i < b.size(); i++) {
                    C25626g gVar = (C25626g) b.get(i);
                    if (gVar.f67830a == C25600a.WIKIPEDIA.getTYPE()) {
                        if (gVar.f67833d != null) {
                            str = gVar.f67833d;
                        } else {
                            str = "";
                        }
                        C48397a.m104727a(context, str, map);
                        return;
                    }
                }
            }
        }
    }

    static final /* synthetic */ boolean lambda$superEntrancePrivacyService$1$AVServiceProxyImpl(Context context) {
        return false;
    }

    public C39550ai getConnectionService() {
        return null;
    }

    public C39575aw getNationalTaskService() {
        return null;
    }

    public IConnectionEntranceService getXsEntranceService() {
        return null;
    }

    public ISuperEntrancePrivacyService superEntrancePrivacyService() {
        return C35690c.f91647a;
    }

    public C39547ag getChallengeService() {
        return getChallengeServiceInternal();
    }

    public C39554al getDmtChallengeService() {
        return getChallengeServiceInternal();
    }

    public C39603bj getStoryPublishService() {
        return new C35706o();
    }

    private C39554al getChallengeServiceInternal() {
        if (this.challengeService == null) {
            this.challengeService = new C35653e();
        }
        return this.challengeService;
    }

    public C39631n getABService() {
        if (this.abTestService == null) {
            this.abTestService = new C35646a();
        }
        return this.abTestService;
    }

    public C39638t getAVConverter() {
        if (this.avConverter == null) {
            this.avConverter = C35689b.f91646a;
        }
        return this.avConverter;
    }

    public C39527aa getAccountService() {
        if (this.accountService == null) {
            this.accountService = new C35686a();
        }
        return this.accountService;
    }

    public C39541ac getApplicationService() {
        if (this.applicationService == null) {
            this.applicationService = new C35647b();
        }
        return this.applicationService;
    }

    public C39543ad getBridgeService() {
        if (this.bridgeService == null) {
            this.bridgeService = new C35649c();
        }
        return this.bridgeService;
    }

    public C39544ae getBusinessGoodsService() {
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new C39544ae() {
                /* renamed from: a */
                public final void mo74138a(String str) {
                    C45455t.m99052a(str);
                }
            };
        }
        return this.businessGoodsService;
    }

    public C39545af getCaptureService() {
        if (this.captchaService == null) {
            this.captchaService = new C35650d();
        }
        return this.captchaService;
    }

    public C39548ah getCommerceService() {
        if (this.commerceService == null) {
            this.commerceService = new C35657f();
        }
        return this.commerceService;
    }

    public C39552aj getDecompressService() {
        if (this.decompressService == null) {
            this.decompressService = new C35659g();
        }
        return this.decompressService;
    }

    public C39560am getDuoShanService() {
        if (this.duoShanService == null) {
            this.duoShanService = new C35660h();
        }
        return this.duoShanService;
    }

    public C39562ao getHashTagService() {
        if (this.hashTagService == null) {
            this.hashTagService = new C35661i();
        }
        return this.hashTagService;
    }

    public C39599bh getIStickerPropService() {
        if (this.stickerPropService == null) {
            this.stickerPropService = new C46360a();
        }
        return this.stickerPropService;
    }

    public C39564aq getLiveService() {
        if (this.liveService == null) {
            this.liveService = new C35663k();
        }
        return this.liveService;
    }

    public C39566ar getLocationService() {
        if (this.locationService == null) {
            this.locationService = new C35664l();
        }
        return this.locationService;
    }

    public C39569au getMusicService() {
        if (this.musicService == null) {
            this.musicService = new C35699l();
        }
        return this.musicService;
    }

    public C39576ax getNetworkService() {
        if (this.networkService == null) {
            this.networkService = new NetworkServiceImpl();
        }
        return this.networkService;
    }

    public IPhotoMovieServiceProvider getPhotoMovieServiceProvider() {
        if (this.photomovieServiceProvider == null) {
            this.photomovieServiceProvider = new C35668m();
        }
        return this.photomovieServiceProvider;
    }

    public C39588bb getPoiService() {
        if (this.poiService == null) {
            this.poiService = new C35670n();
        }
        return this.poiService;
    }

    public C39591bc getPublishService() {
        if (this.publishService == null) {
            this.publishService = new C35703m();
        }
        return this.publishService;
    }

    public C39593bd getSettingService() {
        if (this.settingService == null) {
            this.settingService = new C35672o();
        }
        return this.settingService;
    }

    public C39596bf getShareService() {
        if (this.shareService == null) {
            this.shareService = new C35679q();
        }
        return this.shareService;
    }

    public C39597bg getShortVideoPluginService() {
        if (this.shortVideoPluginService == null) {
            this.shortVideoPluginService = new C44406a();
        }
        return this.shortVideoPluginService;
    }

    public C39594be getSpService() {
        if (this.sharePrefService == null) {
            this.sharePrefService = new C35673p();
        }
        return this.sharePrefService;
    }

    public C39600bi getStickerShareService() {
        if (this.stickerShareService == null) {
            this.stickerShareService = new C35680r();
        }
        return this.stickerShareService;
    }

    public C39604bk getSummonFriendService() {
        if (this.summonFriendService == null) {
            this.summonFriendService = new C35681s();
        }
        return this.summonFriendService;
    }

    public C39605bl getSyncShareService() {
        if (this.syncShareService == null) {
            this.syncShareService = new C35682t();
        }
        return this.syncShareService;
    }

    public C39608bm getToolsComponentService() {
        if (this.toolsComponentService == null) {
            this.toolsComponentService = new C35707p();
        }
        return this.toolsComponentService;
    }

    public C39609bn getUiService() {
        if (this.uiService == null) {
            this.uiService = new C35684u();
        }
        return this.uiService;
    }

    public C39613br getWikiService() {
        if (this.wikiService == null) {
            this.wikiService = new C35685v();
        }
        return this.wikiService;
    }

    public C39577ay openSDKService() {
        if (this.openSDKShareService == null) {
            this.openSDKShareService = new C38523c();
        }
        return this.openSDKShareService;
    }

    public C39610bo unlockStickerService() {
        if (this.unlockStickerService == null) {
            this.unlockStickerService = new C44571c();
        }
        return this.unlockStickerService;
    }

    public static IAVServiceProxy createIAVServiceProxybyMonsterPlugin() {
        Object a = C27991b.m66756a(IAVServiceProxy.class);
        if (a != null) {
            return (IAVServiceProxy) a;
        }
        if (C27991b.f73467aX == null) {
            synchronized (IAVServiceProxy.class) {
                if (C27991b.f73467aX == null) {
                    C27991b.f73467aX = new AVServiceProxyImpl();
                }
            }
        }
        return (AVServiceProxyImpl) C27991b.f73467aX;
    }

    static final /* synthetic */ C42387a lambda$getAVConverter$0$AVServiceProxyImpl(C42421al alVar) {
        if (alVar instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) alVar;
            if (createAwemeResponse.aweme != null) {
                C42387a aVar = new C42387a();
                aVar.aid = createAwemeResponse.aweme.getAid();
                return aVar;
            }
        }
        return null;
    }
}
