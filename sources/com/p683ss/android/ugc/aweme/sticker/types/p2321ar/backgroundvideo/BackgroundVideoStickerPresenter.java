package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0200t;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.ViewStubCompat;
import android.view.View;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.C22817e;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22795c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.sticker.C45893i;
import com.p683ss.android.ugc.aweme.sticker.C46073p;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45860c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.panel.C46190j;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q;
import com.p683ss.android.ugc.aweme.sticker.panel.C46256q.C46257a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46306b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46307a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46487b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46501a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2326d.C46502b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46508d;
import com.p683ss.android.ugc.aweme.sticker.viewmodel.EffectStickerViewModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter */
public final class BackgroundVideoStickerPresenter extends C46306b implements C0183j, C22817e, C46190j, C46256q {

    /* renamed from: e */
    public static final C46442a f117153e = new C46442a(null);

    /* renamed from: a */
    public int f117154a;

    /* renamed from: b */
    public final AppCompatActivity f117155b;

    /* renamed from: c */
    public final C17432q<C46456e> f117156c;

    /* renamed from: d */
    public ShortVideoContext f117157d;

    /* renamed from: f */
    private String f117158f = "";

    /* renamed from: g */
    private C46508d f117159g;

    /* renamed from: h */
    private boolean f117160h;

    /* renamed from: i */
    private Effect f117161i;

    /* renamed from: j */
    private final List<String> f117162j = new ArrayList();

    /* renamed from: k */
    private final boolean f117163k;

    /* renamed from: l */
    private final C46501a f117164l;

    /* renamed from: m */
    private final C46307a f117165m;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$a */
    public static final class C46442a {
        private C46442a() {
        }

        public /* synthetic */ C46442a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m100829a(Effect effect) {
            C52711k.m112240b(effect, "bean");
            String sdkExtra = effect.getSdkExtra();
            if (sdkExtra != null) {
                try {
                    return new JSONObject(sdkExtra).optJSONObject("vl").optString("imgK");
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$b */
    static final class C46443b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ BackgroundVideoStickerPresenter f117167a;

        /* renamed from: b */
        final /* synthetic */ String f117168b;

        C46443b(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, String str) {
            this.f117167a = backgroundVideoStickerPresenter;
            this.f117168b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            long j;
            Intent intent = new Intent();
            intent.putExtra("file_path", this.f117168b);
            intent.putExtra("from_background_video", true);
            String str = "background_video_max_length";
            ShortVideoContext shortVideoContext = this.f117167a.f117157d;
            if (shortVideoContext == null || !shortVideoContext.f107089ao) {
                j = 15000;
            } else {
                j = C39629l.m88232a().mo58574e().mo83119c(C40796a.LongVideoThreshold);
            }
            intent.putExtra(str, j);
            C22795c a = C22795c.m56156a();
            if (a != null) {
                a.mo47276c();
            }
            C45860c.m99704a(this.f117167a.f117155b, C46073p.m100128a().mo48309a(this.f117167a.f117155b, intent), C46476a.m100893b(), new C52686q<Integer, Integer, Intent, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C46443b f117169a;

                {
                    this.f117169a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    this.f117169a.f117167a.mo93179a(((Number) obj).intValue(), ((Number) obj2).intValue(), (Intent) obj3);
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$c */
    static final class C46445c extends C52712l implements C52686q<Integer, Integer, Intent, C52860x> {

        /* renamed from: a */
        final /* synthetic */ BackgroundVideoStickerPresenter f117170a;

        C46445c(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
            this.f117170a = backgroundVideoStickerPresenter;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            this.f117170a.mo93179a(((Number) obj).intValue(), ((Number) obj2).intValue(), (Intent) obj3);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$d */
    public static final class C46446d implements C46502b {

        /* renamed from: a */
        final /* synthetic */ BackgroundVideoStickerPresenter f117171a;

        /* renamed from: a */
        public final void mo93182a() {
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.f117171a;
            Bundle bundle = new Bundle();
            bundle.putInt("key_choose_scene", 4);
            bundle.putInt("key_video_select_min_count", 1);
            bundle.putInt("key_video_select_max_count", 1);
            bundle.putInt("key_support_flag", 4);
            bundle.putParcelable("key_short_video_context", backgroundVideoStickerPresenter.f117157d);
            C45860c.m99704a(backgroundVideoStickerPresenter.f117155b, C46073p.m100128a().mo48311b(backgroundVideoStickerPresenter.f117155b, bundle, C46476a.m100893b(), C46476a.m100893b()), C46476a.m100893b(), new C46445c(backgroundVideoStickerPresenter));
            this.f117171a.f117154a = 1;
            this.f117171a.mo93180a(true);
        }

        C46446d(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter) {
            this.f117171a = backgroundVideoStickerPresenter;
        }

        /* renamed from: a */
        public final void mo93183a(C46487b bVar) {
            IFoundationAVService iFoundationAVService;
            if (bVar != null) {
                String str = bVar.f117304a;
                if (str != null) {
                    BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.f117171a;
                    Object a = C27991b.m66756a(IFoundationAVService.class);
                    if (a != null) {
                        iFoundationAVService = (IFoundationAVService) a;
                    } else {
                        iFoundationAVService = (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
                    }
                    iFoundationAVService.getVideoLegalCheckerAndToastService(backgroundVideoStickerPresenter.f117155b).isVideoLengthOrTypeSupportedAndShowErrToast(str, true, 3600000, new C46443b(backgroundVideoStickerPresenter, str));
                    this.f117171a.f117154a = 0;
                    this.f117171a.mo93180a(true);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo92781b(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
    }

    /* renamed from: b */
    public final boolean mo92899b() {
        return this.f117160h;
    }

    public final void cl_() {
    }

    /* renamed from: d */
    public final void mo92901d() {
        this.f117160h = false;
        C46508d dVar = this.f117159g;
        if (dVar != null) {
            dVar.mo93254c();
        }
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        ((C46456e) this.f117156c.get()).mo93191b();
    }

    /* renamed from: e */
    private final void m100816e() {
        mo92900c();
        C22795c.m56156a().mo47268a(4, 100, 0, this);
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f117161i = null;
        this.f117158f = "";
        ((C46456e) this.f117156c.get()).mo93192c();
        C46508d dVar = this.f117159g;
        if (dVar != null) {
            dVar.mo93255d();
        }
        mo92901d();
    }

    /* renamed from: c */
    public final void mo92900c() {
        C46508d dVar = this.f117159g;
        if (dVar != null) {
            this.f117160h = true;
            dVar.mo93253b();
            if (true ^ this.f117162j.isEmpty()) {
                dVar.mo93249a(0);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return C46059g.m100079c(aVar.f116852a);
    }

    /* renamed from: a */
    public final void mo92779a(View view) {
        C52711k.m112240b(view, "stickerView");
        ViewStubCompat viewStubCompat = (ViewStubCompat) view.findViewById(R.id.eyi);
        if (viewStubCompat != null) {
            this.f117159g = new C46508d(viewStubCompat, this.f117155b, this.f117163k, new C46446d(this));
        }
    }

    /* renamed from: a */
    public final void mo92780a(C46257a aVar) {
        C52711k.m112240b(aVar, "state");
        if (aVar == C46257a.AFTER_ANIMATE && this.f117161i != null && !mo92899b()) {
            m100816e();
        }
    }

    /* renamed from: a */
    public final void mo93180a(boolean z) {
        String str;
        if (this.f117154a == 0) {
            str = "video";
        } else {
            str = "album";
        }
        if (z) {
            Effect effect = this.f117161i;
            if (effect != null) {
                this.f117165m.mo93037a(effect, "upload", FaceStickerBean.sCurPropSource, str);
            }
        } else {
            Effect effect2 = this.f117161i;
            if (effect2 != null) {
                this.f117165m.mo93038b(effect2, "upload", FaceStickerBean.sCurPropSource, str);
            }
            this.f117154a = 0;
        }
    }

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
        this.f117161i = aVar.f116852a;
        m100816e();
        ((C46456e) this.f117156c.get()).mo93188a(aVar.f116852a);
    }

    /* renamed from: a */
    public final void mo93179a(int i, int i2, Intent intent) {
        if (i == C46476a.m100893b()) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("videoPath");
                String stringExtra2 = intent.getStringExtra("audioPath");
                C46456e eVar = (C46456e) this.f117156c.get();
                C52711k.m112236a((Object) stringExtra, "videoPath");
                C52711k.m112236a((Object) stringExtra2, "audioPath");
                eVar.mo93190a(stringExtra, stringExtra2);
                String stringExtra3 = intent.getStringExtra("videoOriginPath");
                C52711k.m112236a((Object) stringExtra3, "it.getStringExtra(\"videoOriginPath\")");
                this.f117158f = stringExtra3;
                C46501a aVar = this.f117164l;
                if (aVar != null) {
                    aVar.mo93243a(stringExtra);
                }
            }
            ((C46456e) this.f117156c.get()).mo93187a();
            if (this.f117162j.contains(this.f117158f)) {
                C46508d dVar = this.f117159g;
                if (dVar != null) {
                    dVar.mo93250a(this.f117158f);
                }
            } else {
                C46508d dVar2 = this.f117159g;
                if (dVar2 != null) {
                    dVar2.mo93255d();
                }
            }
            mo93180a(false);
        }
    }

    /* renamed from: a */
    public final void mo47292a(boolean z, int i, List<MediaModel> list) {
        List list2;
        boolean z2;
        this.f117162j.clear();
        if (z) {
            if (list != null) {
                Iterable<MediaModel> iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (MediaModel mediaModel : iterable) {
                    List<String> list3 = this.f117162j;
                    String str = mediaModel.f95383b;
                    C52711k.m112236a((Object) str, "mediaModel.filePath");
                    list3.add(str);
                    String str2 = mediaModel.f95383b;
                    C52711k.m112236a((Object) str2, "mediaModel.filePath");
                    C46487b bVar = new C46487b(str2, mediaModel.f95386e);
                    bVar.f117312i = 2;
                    arrayList.add(bVar);
                }
                list2 = (List) arrayList;
            } else {
                list2 = C52575l.m112097a();
            }
            C46508d dVar = this.f117159g;
            if (dVar != null) {
                dVar.mo93258g();
                dVar.mo93251a(list2);
                String str3 = this.f117158f;
                if (str3.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    str3 = null;
                }
                if (str3 != null) {
                    dVar.mo93250a(str3);
                }
                if (list2.isEmpty()) {
                    dVar.mo93256e();
                }
            }
        }
    }

    public BackgroundVideoStickerPresenter(AppCompatActivity appCompatActivity, boolean z, C17432q<C46456e> qVar, C46501a aVar, C46307a aVar2, ShortVideoContext shortVideoContext) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(qVar, "bgvProcessorSupplier");
        C52711k.m112240b(aVar, "pixaloopListener");
        C52711k.m112240b(aVar2, "mobHelper");
        this.f117155b = appCompatActivity;
        this.f117163k = z;
        this.f117156c = qVar;
        this.f117164l = aVar;
        this.f117165m = aVar2;
        this.f117157d = shortVideoContext;
        this.f117155b.getLifecycle().mo324a(this);
        C0209x a = C0214z.m440a((FragmentActivity) this.f117155b).mo359a(EffectStickerViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…kerViewModel::class.java]");
        C45893i a2 = ((EffectStickerViewModel) a).mo93416a();
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…ava].recordStickerContext");
        a2.mo91267g().observe(this.f117155b, new C0199s<Double>(this) {

            /* renamed from: a */
            final /* synthetic */ BackgroundVideoStickerPresenter f117166a;

            {
                this.f117166a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                C46066a aVar;
                Double d = (Double) obj;
                ShortVideoContext shortVideoContext = this.f117166a.f117157d;
                if (shortVideoContext != null) {
                    aVar = shortVideoContext.f107126s;
                } else {
                    aVar = null;
                }
                if (aVar != null && d != null) {
                    ((C46456e) this.f117166a.f117156c.get()).mo93189a(d);
                }
            }
        });
    }
}
