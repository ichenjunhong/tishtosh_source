package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo;

import android.app.Application;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.bytedance.p879t.p882c.C13248c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.services.ISDKService;
import com.p683ss.android.ugc.aweme.shortvideo.C42469bn;
import com.p683ss.android.ugc.aweme.shortvideo.C42479bx;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43789em;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.aweme.sticker.p2280d.C45861d;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46297f;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.BackgroundVideoStickerPresenter.C46442a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46450c.C46452b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46453d.C46455b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46505b;
import com.p683ss.android.ugc.aweme.tools.C47324o;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f */
public final class C46457f implements C46456e {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f117196a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46457f.class), "loadingDialog", "getLoadingDialog()Lcom/ss/android/ugc/aweme/sticker/types/ar/pixelloop/ui/PixaloopLoadingDialog;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C46457f.class), "safeHandler", "getSafeHandler()Lcom/ss/android/ugc/aweme/shortvideo/SafeHandler;"))};

    /* renamed from: b */
    public String f117197b;

    /* renamed from: c */
    public final AppCompatActivity f117198c;

    /* renamed from: d */
    private boolean f117199d;

    /* renamed from: e */
    private String f117200e = "";

    /* renamed from: f */
    private String f117201f = "";

    /* renamed from: g */
    private boolean f117202g;

    /* renamed from: h */
    private boolean f117203h;

    /* renamed from: i */
    private final C52668f f117204i = C52732g.m112285a(new C46458a(this));

    /* renamed from: j */
    private final C52668f f117205j = C52732g.m112285a(new C46459b(this));

    /* renamed from: k */
    private final C45004a f117206k;

    /* renamed from: l */
    private final C20489b f117207l;

    /* renamed from: m */
    private final C46297f f117208m;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f$a */
    static final class C46458a extends C52712l implements C52670a<C46505b> {

        /* renamed from: a */
        final /* synthetic */ C46457f f117209a;

        C46458a(C46457f fVar) {
            this.f117209a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46505b(this.f117209a.f117198c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f$b */
    static final class C46459b extends C52712l implements C52670a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ C46457f f117210a;

        C46459b(C46457f fVar) {
            this.f117210a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SafeHandler(this.f117210a.f117198c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f$c */
    static final class C46460c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46457f f117211a;

        C46460c(C46457f fVar) {
            this.f117211a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f117211a.mo93196f().show();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f$d */
    static final class C46461d extends C52712l implements C52686q<Boolean, String, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46457f f117212a;

        /* renamed from: b */
        final /* synthetic */ Effect f117213b;

        C46461d(C46457f fVar, Effect effect) {
            this.f117212a = fVar;
            this.f117213b = effect;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            final String str = (String) obj2;
            final String str2 = (String) obj3;
            C52711k.m112240b(str, "defaultVideoPath");
            C52711k.m112240b(str2, "defaultAudioPath");
            if (this.f117212a.f117198c != null && !this.f117212a.f117198c.isFinishing()) {
                this.f117212a.mo93196f().dismiss();
                if (booleanValue) {
                    this.f117212a.f117197b = C46442a.m100829a(this.f117213b);
                    this.f117212a.mo93197g().post(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C46461d f117214a;

                        {
                            this.f117214a = r1;
                        }

                        public final void run() {
                            this.f117214a.f117212a.mo93195b(str, str2);
                        }
                    });
                } else {
                    C50203g.m108361b("BackgroundVideo default video parse fail");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f$e */
    static final class C46463e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46457f f117217a;

        C46463e(C46457f fVar) {
            this.f117217a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f117217a.mo93196f().show();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.f$f */
    static final class C46464f extends C52712l implements C52686q<Boolean, String, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46457f f117218a;

        /* renamed from: b */
        final /* synthetic */ Effect f117219b;

        C46464f(C46457f fVar, Effect effect) {
            this.f117218a = fVar;
            this.f117219b = effect;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            final String str = (String) obj2;
            final String str2 = (String) obj3;
            C52711k.m112240b(str, "defaultVideoPath");
            C52711k.m112240b(str2, "defaultAudioPath");
            if (this.f117218a.f117198c != null && !this.f117218a.f117198c.isFinishing()) {
                this.f117218a.mo93196f().dismiss();
                if (booleanValue) {
                    this.f117218a.f117197b = C46442a.m100829a(this.f117219b);
                    this.f117218a.mo93197g().post(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C46464f f117220a;

                        {
                            this.f117220a = r1;
                        }

                        public final void run() {
                            this.f117220a.f117218a.mo93195b(str, str2);
                        }
                    });
                } else {
                    C50203g.m108361b("BackgroundVideo default video parse fail");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo93187a() {
        this.f117199d = true;
    }

    /* renamed from: f */
    public final C46505b mo93196f() {
        return (C46505b) this.f117204i.getValue();
    }

    /* renamed from: g */
    public final SafeHandler mo93197g() {
        return (SafeHandler) this.f117205j.getValue();
    }

    /* renamed from: b */
    public final void mo93191b() {
        this.f117199d = this.f117202g;
    }

    /* renamed from: d */
    public final void mo93193d() {
        if (this.f117202g) {
            m100850a(this.f117198c, null, null, null);
        }
    }

    /* renamed from: h */
    private final ShortVideoContext m100852h() {
        C0209x a = C0214z.m440a((FragmentActivity) this.f117198c).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
        C52711k.m112236a((Object) shortVideoContext, "ViewModelProviders.of(ac…s.java).shortVideoContext");
        return shortVideoContext;
    }

    /* renamed from: i */
    private final double m100853i() {
        C0209x a = C0214z.m440a((FragmentActivity) this.f117198c).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        return ((ShortVideoContextViewModel) a).mo86392d();
    }

    /* renamed from: e */
    public final void mo93194e() {
        if (this.f117202g) {
            m100850a(this.f117198c, this.f117197b, this.f117200e, this.f117201f);
        }
    }

    /* renamed from: c */
    public final void mo93192c() {
        C0209x a = C0214z.m440a((FragmentActivity) this.f117198c).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f107134a;
        if (shortVideoContext != null && this.f117202g) {
            C46476a.m100891a(false);
            if (shortVideoContext != null) {
                C43789em emVar = shortVideoContext.f107119l;
                C52711k.m112236a((Object) emVar, "it.mDurings");
                C46448b.m100835a(emVar, shortVideoContext.f107126s);
            }
            shortVideoContext.f107126s = null;
            this.f117200e = "";
            this.f117201f = "";
            m100850a(this.f117198c, null, null, null);
            C50203g.m108358a("BackgroundVideo remove BGV");
            this.f117202g = false;
            m100849a(0);
        }
    }

    /* renamed from: a */
    public final void mo93189a(Double d) {
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (this.f117202g) {
                StringBuilder sb = new StringBuilder("BackgroundVideo set speed：");
                sb.append(doubleValue);
                C50203g.m108358a(sb.toString());
                this.f117207l.mo43449a(d.doubleValue());
            }
        }
    }

    /* renamed from: a */
    private final void m100849a(long j) {
        long j2;
        long j3;
        ShortVideoContext h = m100852h();
        if (h.f107089ao) {
            j2 = C46466g.f117223a;
        } else {
            j2 = 15000;
        }
        C42482c b = C43214dh.m94817a().mo50201b();
        String str = h.f107112e;
        if (b == null || TextUtils.isEmpty(str)) {
            j3 = j2 - h.f107120m;
        } else {
            j3 = C52753d.m112319b(j2, C42479bx.m93330a(b, str)) - h.f107120m;
        }
        if (!this.f117203h && j > 0) {
            j3 = C52753d.m112319b(j3, j);
        }
        long j4 = h.f107120m + j3;
        h.f107110c = j4;
        this.f117206k.mo91330a(new C47324o(j4));
    }

    /* renamed from: a */
    public final void mo93188a(Effect effect) {
        boolean z;
        IFoundationAVService iFoundationAVService;
        boolean z2;
        IFoundationAVService iFoundationAVService2;
        Effect effect2 = effect;
        C52711k.m112240b(effect2, "faceStickerBean");
        if (this.f117199d) {
            mo93195b(this.f117200e, this.f117201f);
            this.f117199d = false;
            return;
        }
        this.f117203h = C46059g.m100080d(effect);
        if (this.f117203h) {
            C46453d dVar = new C46453d(this.f117198c, effect2);
            C52670a cVar = new C46460c(this);
            C52686q dVar2 = new C46461d(this, effect2);
            C52711k.m112240b(cVar, "startCallback");
            C52711k.m112240b(dVar2, "finishCallback");
            cVar.invoke();
            if (!C50200d.m108346a(C43308eb.f109495h)) {
                C50200d.m108339a(C43308eb.f109495h, false);
            }
            String[] a = dVar.mo93186a();
            String str = a[0];
            String str2 = a[1];
            if (C50200d.m108346a(str2)) {
                dVar.f117188b = str;
                dVar.f117189c = str2;
            } else if (!TextUtils.isEmpty(str)) {
                String a2 = C42469bn.m93320a(str);
                StringBuilder sb = new StringBuilder();
                sb.append(dVar.f117187a);
                sb.append(File.separator);
                sb.append(a2);
                sb.append("_background_v");
                dVar.f117188b = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dVar.f117187a);
                sb2.append(File.separator);
                sb2.append(a2);
                sb2.append("_background_a");
                dVar.f117189c = sb2.toString();
            }
            if (!C50200d.m108346a(dVar.f117187a) || !C50200d.m108346a(dVar.f117188b) || !C50200d.m108346a(dVar.f117189c) || VEUtils.getVideoFileInfo(dVar.f117188b, new int[11]) != 0 || VEUtils.getAudioFileInfo(dVar.f117189c, new int[10]) != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                C50200d.m108347a(dVar.f117188b, dVar.f117190d);
                C50200d.m108347a(dVar.f117189c, dVar.f117191e);
                dVar2.invoke(Boolean.valueOf(true), dVar.f117190d, dVar.f117191e);
            } else {
                if (!C50200d.m108346a(dVar.f117187a)) {
                    C50200d.m108339a(dVar.f117187a, false);
                    if (!C50200d.m108346a(dVar.f117187a)) {
                        C50203g.m108361b("BackgroundVideo, splitDir create fail");
                        dVar2.invoke(Boolean.valueOf(false), dVar.f117190d, dVar.f117191e);
                    }
                }
                if (!C50200d.m108346a(str)) {
                    C50203g.m108361b("BackgroundVideo, default video not exist");
                    dVar2.invoke(Boolean.valueOf(false), dVar.f117190d, dVar.f117191e);
                } else {
                    Object a3 = C27991b.m66756a(IFoundationAVService.class);
                    if (a3 != null) {
                        iFoundationAVService2 = (IFoundationAVService) a3;
                    } else {
                        iFoundationAVService2 = (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
                    }
                    C52711k.m112236a((Object) iFoundationAVService2, "ServiceManager.get().get…ionAVService::class.java)");
                    ISDKService sDKService = iFoundationAVService2.getSDKService();
                    Application b = C39629l.m88233b();
                    C52711k.m112236a((Object) b, "CameraClient.getApplication()");
                    Context applicationContext = b.getApplicationContext();
                    C52711k.m112236a((Object) applicationContext, "CameraClient.getApplication().applicationContext");
                    sDKService.split(applicationContext, 1000, dVar.f117187a, str, dVar.f117189c, dVar.f117188b, true, new C46455b(dVar, dVar2));
                }
            }
        } else {
            C46450c cVar2 = new C46450c(this.f117198c, effect2);
            C52670a eVar = new C46463e(this);
            C52686q fVar = new C46464f(this, effect2);
            C52711k.m112240b(eVar, "startCallback");
            C52711k.m112240b(fVar, "finishCallback");
            eVar.invoke();
            if (!C50200d.m108346a(C43308eb.f109495h)) {
                C50200d.m108339a(C43308eb.f109495h, false);
            }
            if (!C50200d.m108346a(cVar2.f117177a) || !C50200d.m108346a(cVar2.f117178b) || !C50200d.m108346a(cVar2.f117179c) || VEUtils.getVideoFileInfo(cVar2.f117178b, new int[11]) != 0 || VEUtils.getAudioFileInfo(cVar2.f117179c, new int[10]) != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C50200d.m108347a(cVar2.f117178b, cVar2.f117180d);
                C50200d.m108347a(cVar2.f117179c, cVar2.f117181e);
                fVar.invoke(Boolean.valueOf(true), cVar2.f117180d, cVar2.f117181e);
                return;
            }
            if (!C50200d.m108346a(cVar2.f117177a)) {
                C50200d.m108339a(cVar2.f117177a, false);
                if (!C50200d.m108346a(cVar2.f117177a)) {
                    C50203g.m108361b("BackgroundVideo, splitDir create fail");
                    fVar.invoke(Boolean.valueOf(false), cVar2.f117180d, cVar2.f117181e);
                    return;
                }
            }
            String a4 = cVar2.mo93185a();
            if (!C50200d.m108346a(a4)) {
                C50203g.m108361b("BackgroundVideo, default video not exist");
                fVar.invoke(Boolean.valueOf(false), cVar2.f117180d, cVar2.f117181e);
                return;
            }
            Object a5 = C27991b.m66756a(IFoundationAVService.class);
            if (a5 != null) {
                iFoundationAVService = (IFoundationAVService) a5;
            } else {
                iFoundationAVService = (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
            }
            C52711k.m112236a((Object) iFoundationAVService, "ServiceManager.get().get…ionAVService::class.java)");
            ISDKService sDKService2 = iFoundationAVService.getSDKService();
            Application b2 = C39629l.m88233b();
            C52711k.m112236a((Object) b2, "CameraClient.getApplication()");
            Context applicationContext2 = b2.getApplicationContext();
            C52711k.m112236a((Object) applicationContext2, "CameraClient.getApplication().applicationContext");
            sDKService2.split(applicationContext2, 1000, cVar2.f117177a, a4, cVar2.f117179c, cVar2.f117178b, true, new C46452b(cVar2, fVar));
        }
    }

    /* renamed from: a */
    public final void mo93190a(String str, String str2) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(str2, "audioPath");
        this.f117200e = str;
        this.f117201f = str2;
    }

    /* renamed from: c */
    private static int m100851c(String str, String str2) {
        if (C13248c.m26638a(str) || C13248c.m26638a(str2)) {
            StringBuilder sb = new StringBuilder("BackgroundVideo path invalid, videoPath: ");
            sb.append(str);
            sb.append(" audioPath: ");
            sb.append(str2);
            C50203g.m108361b(sb.toString());
            return -1;
        }
        int[] iArr = new int[11];
        if (str == null) {
            C52711k.m112234a();
        }
        if (VEUtils.getVideoFileInfo(str, iArr) == 0) {
            return iArr[3];
        }
        StringBuilder sb2 = new StringBuilder("BackgroundVideo getVideoInfo fail, videoPath: ");
        sb2.append(str);
        sb2.append(" audioPath: ");
        sb2.append(str2);
        C50203g.m108361b(sb2.toString());
        return -1;
    }

    /* renamed from: b */
    public final void mo93195b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C0209x a = C0214z.m440a((FragmentActivity) this.f117198c).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
        C0198r e = ((ShortVideoContextViewModel) a).mo86394e();
        C52711k.m112236a((Object) e, "ViewModelProviders.of(ac…             .isRecording");
        Boolean bool = (Boolean) e.getValue();
        if (bool == null) {
            bool = Boolean.valueOf(true);
        }
        C52711k.m112236a((Object) bool, "ViewModelProviders.of(ac…isRecording.value ?: true");
        if (!bool.booleanValue()) {
            C45861d.m99710b(this.f117208m);
            return;
        }
        C0209x a2 = C0214z.m440a((FragmentActivity) this.f117198c).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a2, "ViewModelProviders.of(ac…extViewModel::class.java]");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f107134a;
        if (shortVideoContext == null) {
            C50203g.m108358a("BackgroundVideo set BGV error, shortVideo context is null");
            return;
        }
        int c = m100851c(str, str2);
        if (c > 0) {
            C46476a.m100891a(true);
            this.f117200e = str3;
            this.f117201f = str4;
            long j = (long) c;
            long j2 = j;
            C46066a aVar = r1;
            C46066a aVar2 = new C46066a(str, str2, j, this.f117203h, 0, null, 48, null);
            shortVideoContext.f107126s = aVar;
            m100849a(j2);
            StringBuilder sb = new StringBuilder("BackgroundVideo set BGV, videoPath: ");
            sb.append(str3);
            sb.append(" audioPath: ");
            sb.append(str4);
            C50203g.m108358a(sb.toString());
            m100850a(this.f117198c, this.f117197b, str3, str4);
            mo93189a(Double.valueOf(m100853i()));
            this.f117202g = true;
        }
    }

    public C46457f(AppCompatActivity appCompatActivity, C45004a aVar, C20489b bVar, C46297f fVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(aVar, "cameraApi");
        C52711k.m112240b(bVar, "effectController");
        C52711k.m112240b(fVar, "stickerModule");
        this.f117198c = appCompatActivity;
        this.f117206k = aVar;
        this.f117207l = bVar;
        this.f117208m = fVar;
    }

    /* renamed from: a */
    private final void m100850a(Context context, String str, String str2, String str3) {
        C0209x a = C0214z.m440a((FragmentActivity) this.f117198c).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java]");
        C0198r e = ((ShortVideoContextViewModel) a).mo86394e();
        C52711k.m112236a((Object) e, "ViewModelProviders.of(ac…             .isRecording");
        Boolean bool = (Boolean) e.getValue();
        if (bool == null) {
            bool = Boolean.valueOf(true);
        }
        C52711k.m112236a((Object) bool, "ViewModelProviders.of(ac…isRecording.value ?: true");
        if (bool.booleanValue()) {
            this.f117207l.mo43460a(context, str, str2, str3);
        }
        this.f117208m.mo93002a(str, str2, str3);
    }
}
