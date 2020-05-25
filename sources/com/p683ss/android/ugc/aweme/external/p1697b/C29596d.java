package com.p683ss.android.ugc.aweme.external.p1697b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0781c;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.p1057b.p1058a.C17432q;
import com.google.p1057b.p1058a.C17433r;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p683ss.android.ugc.aweme.external.C29624f;
import com.p683ss.android.ugc.aweme.i18n.musically.cut.C33158j;
import com.p683ss.android.ugc.aweme.main.p1942e.C36623f;
import com.p683ss.android.ugc.aweme.p1426bb.C23763a;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.AVABAndSettingActivity;
import com.p683ss.android.ugc.aweme.services.external.IUIService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IDraftService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IDraftService.OnGetRecoverDraftCallback;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IEditService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IPublishPageService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IStoryService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ITestActivityService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IVideo2GifUIService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.PublishConfig;
import com.p683ss.android.ugc.aweme.services.story.IAVStoryProxyService;
import com.p683ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.p683ss.android.ugc.aweme.services.videochoose.IVideoChoose.Callback;
import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment;
import com.p683ss.android.ugc.aweme.shortvideo.p2220q.C44403a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoPublishActivity;
import com.p683ss.android.ugc.aweme.tools.debug.AVSchemaTestActivity;
import com.p683ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.superentrance.C53020f;
import dmt.p2652av.video.superentrance.C53020f.C53021a;
import dmt.p2652av.video.superentrance.SuperEntranceActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53755c;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.external.b.d */
public final class C29596d implements IUIService {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f77446a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29596d.class), "filterService", "getFilterService()Lcom/ss/android/ugc/aweme/external/FilterServiceImpl;"))};

    /* renamed from: b */
    final C52668f f77447b = C52732g.m112285a(C29600c.f77452a);

    /* renamed from: com.ss.android.ugc.aweme.external.b.d$a */
    public static final class C29597a implements IVideo2GifUIService {

        /* renamed from: com.ss.android.ugc.aweme.external.b.d$a$a */
        static final class C29598a<V> implements Callable<Void> {

            /* renamed from: a */
            final /* synthetic */ C33158j f77448a;

            /* renamed from: b */
            final /* synthetic */ Callback f77449b;

            /* renamed from: c */
            final /* synthetic */ FragmentActivity f77450c;

            /* renamed from: d */
            final /* synthetic */ Integer f77451d;

            C29598a(C33158j jVar, Callback callback, FragmentActivity fragmentActivity, Integer num) {
                this.f77448a = jVar;
                this.f77449b = callback;
                this.f77450c = fragmentActivity;
                this.f77451d = num;
            }

            public final /* synthetic */ Object call() {
                C0654k supportFragmentManager = this.f77450c.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    C0679r a = supportFragmentManager.mo2225a();
                    Integer num = this.f77451d;
                    if (num == null) {
                        C52711k.m112234a();
                    }
                    a.mo2175a(num.intValue(), (Fragment) this.f77448a).mo2195c();
                }
                return null;
            }
        }

        C29597a() {
        }

        public final Fragment video2GifFragment(VideoShare2GifEditContext videoShare2GifEditContext) {
            C52711k.m112240b(videoShare2GifEditContext, "context");
            Video2GifCutFragment video2GifCutFragment = new Video2GifCutFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_edit_context", videoShare2GifEditContext);
            video2GifCutFragment.setArguments(bundle);
            C52711k.m112236a((Object) video2GifCutFragment, "Video2GifCutFragment.newInstance(context)");
            return video2GifCutFragment;
        }

        public final IVideoChoose toMusVideoChooseFragment(FragmentActivity fragmentActivity, Fragment fragment, Callback callback, Integer num) {
            C52711k.m112240b(fragmentActivity, "activity");
            if (fragment instanceof C33158j) {
                return (IVideoChoose) fragment;
            }
            int a = C23723j.m58216a(R.color.a53);
            int a2 = C23723j.m58216a(R.color.a44);
            int a3 = C23723j.m58216a(R.color.aso);
            C33158j jVar = new C33158j();
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_NUM_COLUMNS", 3);
            bundle.putFloat("ARG_HORIZONTAL_SPACING", 1.5f);
            bundle.putFloat("ARG_VERTICAL_SPACING", 1.5f);
            bundle.putInt("ARG_GRID_PADDING", 0);
            bundle.putInt("ARG_TEXT_COLOR", a);
            bundle.putInt("ARG_SHADOW_COLOR", a2);
            bundle.putDouble("ARG_ITEM_HEIGHT_WIDTH_RATIO", 1.0d);
            bundle.putInt("ARG_TEXT_SIZE", 13);
            bundle.putBoolean("ARG_TEXT_BACKGROUND", false);
            bundle.putBoolean("ARG_TEXT_INDICATOR", false);
            bundle.putInt("ARG_BG_COLOR", a3);
            jVar.setArguments(bundle);
            jVar.f86098m = callback;
            C0013i.m18a((Callable<TResult>) new C29598a<TResult>(jVar, callback, fragmentActivity, num), (Executor) C23551l.f62672a);
            C52711k.m112236a((Object) jVar, "MusVideoChooseFragment.c…CE)\n                    }");
            return jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.d$b */
    public static final class C29599b implements IDraftService {
        C29599b() {
        }

        public final void removeRecoverDraft() {
            C23763a.m58318a((String) null);
        }

        public final void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(onGetRecoverDraftCallback, "callback");
            C23763a.m58317a(context, onGetRecoverDraftCallback);
        }

        public final void enterDraftBoxActivity(Context context, Bundle bundle) {
            C52711k.m112240b(context, "context");
            C39618d.f101144H.mo58584o().mo64333c().mo64345a();
            if (bundle == null) {
                DraftBoxActivity.m101985a(context);
            } else {
                DraftBoxActivity.m101986a(context, bundle);
            }
        }

        public final void enterDraftEditActivity(Context context, C29059c cVar, List<? extends C42482c> list) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(cVar, "draft");
            C52711k.m112240b(list, "musicList");
            PhotoMovieContext photoMovieContext = cVar.f76145c;
            if (photoMovieContext != null && cVar.f76144b != null) {
                photoMovieContext.challenges = cVar.f76144b.f76030c;
                photoMovieContext.title = cVar.f76144b.f76028a;
                photoMovieContext.structList = cVar.f76144b.f76029b;
                photoMovieContext.isPrivate = cVar.f76124B;
                photoMovieContext.mIsFromDraft = true;
                photoMovieContext.mFrom = 1;
                photoMovieContext.poiId = cVar.mo58733J();
                photoMovieContext.mSaveModel = cVar.mo58732I();
                photoMovieContext.draftEditTransferModel = new DraftEditTransferModel(cVar.mo58774ak(), null);
                C44403a.m97196a().mo48303a(context, photoMovieContext, list);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.d$c */
    static final class C29600c extends C52712l implements C52670a<C29624f> {

        /* renamed from: a */
        public static final C29600c f77452a = new C29600c();

        C29600c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29624f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.d$d */
    public static final class C29601d implements IPublishPageService {

        /* renamed from: a */
        final /* synthetic */ C29596d f77453a;

        /* renamed from: com.ss.android.ugc.aweme.external.b.d$d$a */
        static final class C29602a<T> implements C0781c<AVChallenge> {

            /* renamed from: a */
            final /* synthetic */ Intent f77454a;

            /* renamed from: b */
            final /* synthetic */ Activity f77455b;

            /* renamed from: c */
            final /* synthetic */ PublishConfig f77456c;

            C29602a(Intent intent, Activity activity, PublishConfig publishConfig) {
                this.f77454a = intent;
                this.f77455b = activity;
                this.f77456c = publishConfig;
            }

            public final /* synthetic */ void accept(Object obj) {
                AVChallenge aVChallenge = (AVChallenge) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVChallenge);
                this.f77454a.putExtra("challenge", arrayList);
                this.f77455b.startActivity(this.f77454a);
                this.f77455b.finish();
            }
        }

        C29601d(C29596d dVar) {
            this.f77453a = dVar;
        }

        public final void startPublish(Activity activity, PublishConfig publishConfig) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(publishConfig, "publishConfig");
            ((C29624f) this.f77453a.f77447b.getValue()).refreshData();
            Intent intent = new Intent();
            intent.setClass(activity, VideoPublishActivity.class);
            String videoId = publishConfig.getVideoId();
            if (videoId != null) {
                intent.putExtra("review_video_id", videoId);
                List queryAllDraftList = new C46994b().queryAllDraftList();
                C52711k.m112236a((Object) queryAllDraftList, "DraftService().queryAllDraftList()");
                Iterable iterable = queryAllDraftList;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    C29059c cVar = (C29059c) next;
                    CharSequence charSequence = videoId;
                    C52711k.m112236a((Object) cVar, "draft");
                    if (TextUtils.equals(charSequence, cVar.mo58782as())) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                if ((!list.isEmpty()) && !TextUtils.isEmpty(((C29059c) list.get(0)).mo58774ak())) {
                    intent.putExtra("review_video_draft_primary_key", ((C29059c) list.get(0)).mo58774ak());
                    activity.startActivity(intent);
                    activity.finish();
                    return;
                }
            }
            intent.putExtra("shoot_way", publishConfig.getShootway());
            intent.putExtra("creation_id", publishConfig.getCreationId());
            String musicId = publishConfig.getMusicId();
            if (musicId != null) {
                intent.putExtra("id", musicId);
            }
            String videoPath = publishConfig.getVideoPath();
            if (videoPath != null) {
                intent.putExtra("video_path", videoPath);
            }
            if (C52711k.m112239a((Object) publishConfig.getFastPublish(), (Object) Boolean.valueOf(true))) {
                intent.putExtra("review_video_fast_publish", true);
            }
            if (TextUtils.isEmpty(publishConfig.getChallenge())) {
                activity.startActivity(intent);
                activity.finish();
                return;
            }
            C39618d.f101163d.mo74186a(publishConfig.getChallenge(), null, 0, 0, new C29602a(intent, activity, publishConfig));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.d$e */
    public static final class C29603e implements ITestActivityService {
        C29603e() {
        }

        public final void startABTest(Context context) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(context, "context");
            context.startActivity(new Intent(context, AVABAndSettingActivity.class));
        }

        public final void startSchemaTest(Context context) {
            C52711k.m112240b(context, "context");
            Intent intent = new Intent(context, AVSchemaTestActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.b.d$f */
    public static final class C29604f implements IStoryService {

        /* renamed from: a */
        private final C17432q<IAVStoryProxyService> f77457a = C17433r.m42683a(C29605a.f77458a);

        /* renamed from: com.ss.android.ugc.aweme.external.b.d$f$a */
        static final class C29605a<T> implements C17432q<T> {

            /* renamed from: a */
            public static final C29605a f77458a = new C29605a();

            C29605a() {
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

        C29604f() {
        }

        public final void startStoryRecord(Intent intent) {
            C52711k.m112240b(intent, "intent");
            C53755c.m114319a().mo112960d(new C36623f(intent));
        }

        public final void startStoryEditActivity(Activity activity, Intent intent) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(intent, "intent");
            IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.f77457a.get();
            if (iAVStoryProxyService != null) {
                iAVStoryProxyService.startStoryEditActivity(activity, intent);
            }
        }

        public final void startStorySettingActivity(Activity activity, int i, int i2, int i3, boolean z) {
            C52711k.m112240b(activity, "activity");
            IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.f77457a.get();
            if (iAVStoryProxyService != null) {
                iAVStoryProxyService.startStorySettingActivity(activity, i, i2, i3, z);
            }
        }

        public final void startStorySettingActivity(Activity activity, int i, int i2, boolean z, int i3) {
            C52711k.m112240b(activity, "activity");
            IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.f77457a.get();
            if (iAVStoryProxyService != null) {
                iAVStoryProxyService.startStorySettingActivity(activity, i, i2, z, i3);
            }
        }

        public final void startStorySettingActivityForView(Activity activity, int i, int i2, boolean z, int i3, ViewGroup viewGroup) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(viewGroup, "viewGroup");
            IAVStoryProxyService iAVStoryProxyService = (IAVStoryProxyService) this.f77457a.get();
            if (iAVStoryProxyService != null) {
                iAVStoryProxyService.startStorySettingActivityForView(activity, i, i2, z, i3, viewGroup);
            }
        }
    }

    public final IVideo2GifUIService abilityUiService() {
        return new C29597a();
    }

    public final IDraftService draftService() {
        return new C29599b();
    }

    public final IEditService editService() {
        return new C29583a();
    }

    public final IPublishPageService publishService() {
        return new C29601d(this);
    }

    public final IRecordService recordService() {
        return new C29594c();
    }

    public final ITestActivityService schemaTestService() {
        return new C29603e();
    }

    public final IStoryService storyService() {
        return new C29604f();
    }

    public final void startSuperEntraceActivity(Context context) {
        C52711k.m112240b(context, "context");
        C53020f a = C53021a.m112748a();
        C52711k.m112240b(context, "context");
        a.f131476a.f131448a.storeBoolean("enable_show_super_entrance", false);
        C52711k.m112240b(context, "context");
        context.startActivity(new Intent(context, SuperEntranceActivity.class));
    }
}
