package dmt.p2652av.video.superentrance;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.ugc.aweme.app.p1372c.C23059a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa.C39528a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39541ac;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45435f;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.superentrance.p2657a.C53003a;
import dmt.p2652av.video.superentrance.p2657a.C53004b;
import dmt.p2652av.video.superentrance.player.SuperEntranceVideoPlayer;
import java.io.File;
import java.util.UUID;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: dmt.av.video.superentrance.SuperEntranceActivity */
public final class SuperEntranceActivity extends AmeActivity {

    /* renamed from: c */
    public static final C52990c f131423c = new C52990c(null);

    /* renamed from: a */
    public final SafeHandler f131424a = new SafeHandler(this);

    /* renamed from: b */
    public SuperEntranceVideoPlayer f131425b;

    /* renamed from: d */
    private KeepSurfaceTextureView f131426d;

    /* renamed from: e */
    private boolean f131427e;

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$a */
    public static final class C52988a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ImageView f131428a;

        /* renamed from: b */
        final /* synthetic */ ImageView f131429b;

        public final void onAnimationStart(Animator animator) {
            ImageView imageView = this.f131428a;
            C52711k.m112236a((Object) imageView, "imgJump");
            imageView.setImageAlpha(0);
            ImageView imageView2 = this.f131429b;
            C52711k.m112236a((Object) imageView2, "imgGo");
            imageView2.setImageAlpha(0);
            ImageView imageView3 = this.f131429b;
            C52711k.m112236a((Object) imageView3, "imgGo");
            imageView3.setTranslationY(60.0f);
        }

        C52988a(ImageView imageView, ImageView imageView2) {
            this.f131428a = imageView;
            this.f131429b = imageView2;
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$b */
    static final class C52989b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f131430a;

        /* renamed from: b */
        final /* synthetic */ ImageView f131431b;

        C52989b(ImageView imageView, ImageView imageView2) {
            this.f131430a = imageView;
            this.f131431b = imageView2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int floatValue = (int) (((Float) animatedValue).floatValue() * 255.0f);
                ImageView imageView = this.f131430a;
                C52711k.m112236a((Object) imageView, "imgJump");
                imageView.setImageAlpha(floatValue);
                ImageView imageView2 = this.f131431b;
                C52711k.m112236a((Object) imageView2, "imgGo");
                imageView2.setImageAlpha(floatValue);
                ImageView imageView3 = this.f131431b;
                C52711k.m112236a((Object) imageView3, "imgGo");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 != null) {
                    imageView3.setTranslationY(60.0f - (((Float) animatedValue2).floatValue() * 60.0f));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$c */
    public static final class C52990c {
        private C52990c() {
        }

        public /* synthetic */ C52990c(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m112719a(Context context, Intent intent) {
            C52711k.m112240b(context, "context");
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            C39541ac applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
            C52711k.m112236a((Object) applicationService, "ServiceManager.get().get…      .applicationService");
            Intent intent2 = new Intent(context, applicationService.mo74158d());
            intent2.setFlags(335544320);
            C53003a.m112727a(intent, intent2);
            C53003a.m112728b(intent, intent2);
            if (!(intent == null || intent.getExtras() == null)) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    C52711k.m112234a();
                }
                intent2.putExtras(extras);
            }
            context.startActivity(intent2);
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$d */
    static final class C52991d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ SuperEntranceActivity f131432a;

        C52991d(SuperEntranceActivity superEntranceActivity) {
            this.f131432a = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C50203g.m108358a("onFirstParagraphPlayCompleted showEnterRecordLayout()");
            this.f131432a.mo110549a();
            this.f131432a.f131424a.postDelayed(C529921.f131433a, 200);
            return C52860x.f131107a;
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$e */
    static final class C52993e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SuperEntranceActivity f131434a;

        C52993e(SuperEntranceActivity superEntranceActivity) {
            this.f131434a = superEntranceActivity;
        }

        public final void run() {
            C50203g.m108358a("handler post showEnterRecordLayout()");
            this.f131434a.mo110549a();
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$f */
    static final class C52994f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ SuperEntranceActivity f131435a;

        C52994f(SuperEntranceActivity superEntranceActivity) {
            this.f131435a = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            SuperEntranceActivity.m112716a(this.f131435a).stop();
            this.f131435a.mo110550b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$g */
    static final class C52995g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ SuperEntranceActivity f131436a;

        C52995g(SuperEntranceActivity superEntranceActivity) {
            this.f131436a = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo110555a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo110555a() {
            new C53006b().mo110559a(true);
            String str = "";
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                SuperEntranceConfig superEntranceConfig = b.getSuperEntranceConfig();
                C52711k.m112236a((Object) superEntranceConfig, "SettingsReader.get().superEntranceConfig");
                String effectTip = superEntranceConfig.getEffectTip();
                C52711k.m112236a((Object) effectTip, "SettingsReader.get().superEntranceConfig.effectTip");
                str = effectTip;
            } catch (Exception unused) {
            }
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            Activity activity = this.f131436a;
            Intent intent = new Intent();
            intent.putExtra("extra_enter_record_form_super_entrance", true);
            intent.putExtra("shoot_way", "super_entrance_splash");
            intent.putExtra("extra_camera_facing", 1);
            intent.putExtra("extra_super_entrance_pop", str);
            intent.putExtra("creation_id", uuid);
            C45435f.m99013a(activity, intent);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new LinearInterpolator());
            final FrameLayout frameLayout = (FrameLayout) this.f131436a.findViewById(R.id.cfc);
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C52711k.m112236a((Object) valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        float floatValue = 1.0f - (((Float) animatedValue).floatValue() * 0.1f);
                        FrameLayout frameLayout = frameLayout;
                        C52711k.m112236a((Object) frameLayout, "root");
                        frameLayout.setScaleX(floatValue);
                        FrameLayout frameLayout2 = frameLayout;
                        C52711k.m112236a((Object) frameLayout2, "root");
                        frameLayout2.setScaleY(floatValue);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
            });
            ofFloat.start();
            this.f131436a.finish();
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("creation_id", uuid).mo47829a("shoot_way", "super_entrance_splash").f61491a);
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$h */
    static final class C52997h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52995g f131438a;

        /* renamed from: b */
        final /* synthetic */ SuperEntranceActivity f131439b;

        C52997h(C52995g gVar, SuperEntranceActivity superEntranceActivity) {
            this.f131438a = gVar;
            this.f131439b = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo110557a();
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo110557a() {
            final C53008c cVar = new C53008c(this.f131439b);
            cVar.mo110561a(new C52671b<Boolean, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C52997h f131440a;

                {
                    this.f131440a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        this.f131440a.f131438a.mo110555a();
                    } else {
                        C53008c cVar = cVar;
                        C52671b r0 = new C52671b<Boolean, C52860x>(this) {

                            /* renamed from: a */
                            final /* synthetic */ C529981 f131442a;

                            {
                                this.f131442a = r1;
                            }

                            public final /* synthetic */ Object invoke(Object obj) {
                                if (((Boolean) obj).booleanValue()) {
                                    this.f131442a.f131440a.f131438a.mo110555a();
                                }
                                return C52860x.f131107a;
                            }
                        };
                        C52711k.m112240b(r0, "requestPermissionCallback");
                        boolean z = false;
                        String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
                        int i = 0;
                        while (true) {
                            if (i >= 3) {
                                break;
                            }
                            String str = strArr[i];
                            if (C39618d.f101145I.mo58605c().mo49435a((Context) cVar.f131449a, str) == -1 && !C39618d.f101145I.mo58605c().mo49438a((Activity) cVar.f131449a, str)) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        Dialog b = new C10643a(cVar.f131449a).mo18899b((int) R.string.kb).mo18900b((int) R.string.wf, (OnClickListener) C53011c.f131456a).mo18886a((int) R.string.ah4, (OnClickListener) new C53012d(cVar, z, r0)).mo18897a().mo18882b();
                        b.setOnCancelListener(C53010b.f131455a);
                        C47700ay.m103235a(b);
                    }
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: dmt.av.video.superentrance.SuperEntranceActivity$i */
    static final class C53000i extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52997h f131443a;

        /* renamed from: b */
        final /* synthetic */ SuperEntranceActivity f131444b;

        C53000i(C52997h hVar, SuperEntranceActivity superEntranceActivity) {
            this.f131443a = hVar;
            this.f131444b = superEntranceActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            SuperEntranceActivity.m112716a(this.f131444b).stop();
            if (!C39618d.f101183x.mo74282b()) {
                C39527aa aaVar = C39618d.f101183x;
                SuperEntranceActivity superEntranceActivity = this.f131444b;
                if (superEntranceActivity != null) {
                    aaVar.mo74276a((Activity) superEntranceActivity, "", "schema_record", (Bundle) null, (C39528a) new C39528a(this) {

                        /* renamed from: a */
                        final /* synthetic */ C53000i f131445a;

                        /* renamed from: a */
                        public final void mo64371a() {
                            this.f131445a.f131443a.mo110557a();
                        }

                        /* renamed from: b */
                        public final void mo64372b() {
                            this.f131445a.f131444b.mo110550b();
                        }

                        {
                            this.f131445a = r1;
                        }
                    });
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                }
            } else {
                this.f131443a.mo110557a();
            }
            return C52860x.f131107a;
        }
    }

    public final void onBackPressed() {
    }

    /* renamed from: b */
    public final void mo110550b() {
        C52990c.m112719a(this, getIntent());
        finish();
        overridePendingTransition(0, R.anim.dd);
    }

    /* renamed from: a */
    public final void mo110549a() {
        StringBuilder sb = new StringBuilder("called showEnterRecordLayout() -> ");
        sb.append(this.f131427e);
        C50203g.m108358a(sb.toString());
        if (!this.f131427e) {
            this.f131427e = true;
            View inflate = ((ViewStub) findViewById(R.id.f7h)).inflate();
            ImageView imageView = (ImageView) inflate.findViewById(R.id.ec0);
            C53004b.m112729a(imageView, new C52994f(this));
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.ebz);
            C53004b.m112729a(imageView2, new C53000i(new C52997h(new C52995g(this), this), this));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(300);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addListener(new C52988a(imageView, imageView2));
            ofFloat.addUpdateListener(new C52989b(imageView, imageView2));
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SuperEntranceVideoPlayer m112716a(SuperEntranceActivity superEntranceActivity) {
        SuperEntranceVideoPlayer superEntranceVideoPlayer = superEntranceActivity.f131425b;
        if (superEntranceVideoPlayer == null) {
            C52711k.m112237a("videoPlayer");
        }
        return superEntranceVideoPlayer;
    }

    public final void onCreate(Bundle bundle) {
        float f;
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Context context = this;
        if (!C23059a.m56592a(context)) {
            C23729p.m58254a((Activity) this);
        }
        setContentView((int) R.layout.axk);
        View findViewById = findViewById(R.id.dqi);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.video_view)");
        this.f131426d = (KeepSurfaceTextureView) findViewById;
        float b = ((float) C23724k.m58224b(context)) * 1.0f;
        float a = ((float) C23724k.m58221a(context)) * 1.0f;
        float f2 = (b / 9.0f) * 16.0f;
        if (f2 >= a) {
            f = b;
        } else {
            f = 9.0f * (a / 16.0f);
            f2 = a;
        }
        KeepSurfaceTextureView keepSurfaceTextureView = this.f131426d;
        if (keepSurfaceTextureView == null) {
            C52711k.m112237a("videoView");
        }
        LayoutParams layoutParams = keepSurfaceTextureView.getLayoutParams();
        layoutParams.width = (int) f;
        layoutParams.height = (int) f2;
        KeepSurfaceTextureView keepSurfaceTextureView2 = this.f131426d;
        if (keepSurfaceTextureView2 == null) {
            C52711k.m112237a("videoView");
        }
        keepSurfaceTextureView2.setLayoutParams(layoutParams);
        KeepSurfaceTextureView keepSurfaceTextureView3 = this.f131426d;
        if (keepSurfaceTextureView3 == null) {
            C52711k.m112237a("videoView");
        }
        keepSurfaceTextureView3.setTranslationX((-(f - b)) / 2.0f);
        KeepSurfaceTextureView keepSurfaceTextureView4 = this.f131426d;
        if (keepSurfaceTextureView4 == null) {
            C52711k.m112237a("videoView");
        }
        keepSurfaceTextureView4.setTranslationY((-(f2 - a)) / 2.0f);
        C0184k kVar = this;
        KeepSurfaceTextureView keepSurfaceTextureView5 = this.f131426d;
        if (keepSurfaceTextureView5 == null) {
            C52711k.m112237a("videoView");
        }
        this.f131425b = new SuperEntranceVideoPlayer(kVar, keepSurfaceTextureView5, new C52991d(this));
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) findViewById(R.id.f6x);
        C14229b a2 = C14232c.m29169a(Uri.fromFile(new File(C53015e.f131468e))).mo26453a(new C13952d(C23724k.m58224b(context), C23724k.m58221a(context))).mo26449a();
        C13773e a3 = C13771c.m27870a();
        C52711k.m112236a((Object) simpleDraweeView, "videoBackImage");
        simpleDraweeView.setController(((C13773e) ((C13773e) a3.mo25759b(simpleDraweeView.getController())).mo25757b(a2)).mo25763d());
        this.f131424a.postDelayed(new C52993e(this), 6000);
    }
}
