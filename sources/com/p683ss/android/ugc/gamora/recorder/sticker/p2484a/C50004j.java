package com.p683ss.android.ugc.gamora.recorder.sticker.p2484a;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.ApiCenter.C2755a;
import com.bytedance.als.C2767k;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.sticker.C46410r;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50077f;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.j */
public final class C50004j {

    /* renamed from: b */
    public static final C50011f f125282b = new C50011f(null);

    /* renamed from: a */
    public Effect f125283a;

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.j$a */
    static final class C50006a<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C50004j f125286a;

        /* renamed from: b */
        final /* synthetic */ C0184k f125287b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f125288c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f125289d;

        C50006a(C50004j jVar, C0184k kVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f125286a = jVar;
            this.f125287b = kVar;
            this.f125288c = remoteImageView;
            this.f125289d = remoteImageView2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            RemoteImageView remoteImageView = this.f125288c;
            if (remoteImageView != null && remoteImageView.getVisibility() == 0) {
                remoteImageView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.j$b */
    static final class C50007b<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C50004j f125290a;

        /* renamed from: b */
        final /* synthetic */ C0184k f125291b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f125292c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f125293d;

        C50007b(C50004j jVar, C0184k kVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f125290a = jVar;
            this.f125291b = kVar;
            this.f125292c = remoteImageView;
            this.f125293d = remoteImageView2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            RemoteImageView remoteImageView = this.f125293d;
            if (remoteImageView != null) {
                C52711k.m112236a((Object) bool, "enable");
                remoteImageView.setEnabled(bool.booleanValue());
                if (bool.booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                remoteImageView.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.j$c */
    static final class C50008c<T> implements C2767k<Effect> {

        /* renamed from: a */
        final /* synthetic */ C50004j f125294a;

        /* renamed from: b */
        final /* synthetic */ C0184k f125295b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f125296c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f125297d;

        C50008c(C50004j jVar, C0184k kVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f125294a = jVar;
            this.f125295b = kVar;
            this.f125296c = remoteImageView;
            this.f125297d = remoteImageView2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect = (Effect) obj;
            if (effect != null) {
                RemoteImageView remoteImageView = this.f125297d;
                if (remoteImageView != null) {
                    C50004j.m107904a(remoteImageView, effect);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.j$d */
    static final class C50009d<T> implements C2767k<Effect> {

        /* renamed from: a */
        final /* synthetic */ C50004j f125298a;

        /* renamed from: b */
        final /* synthetic */ C0184k f125299b;

        /* renamed from: c */
        final /* synthetic */ RemoteImageView f125300c;

        /* renamed from: d */
        final /* synthetic */ RemoteImageView f125301d;

        C50009d(C50004j jVar, C0184k kVar, RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
            this.f125298a = jVar;
            this.f125299b = kVar;
            this.f125300c = remoteImageView;
            this.f125301d = remoteImageView2;
        }

        public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            this.f125298a.f125283a = (Effect) obj;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.j$e */
    static final class C50010e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50004j f125302a;

        /* renamed from: b */
        final /* synthetic */ ApiCenter f125303b;

        /* renamed from: c */
        final /* synthetic */ AppCompatActivity f125304c;

        /* renamed from: d */
        final /* synthetic */ C50048n f125305d;

        /* renamed from: e */
        final /* synthetic */ RemoteImageView f125306e;

        C50010e(C50004j jVar, ApiCenter apiCenter, AppCompatActivity appCompatActivity, C50048n nVar, RemoteImageView remoteImageView) {
            this.f125302a = jVar;
            this.f125303b = apiCenter;
            this.f125304c = appCompatActivity;
            this.f125305d = nVar;
            this.f125306e = remoteImageView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((C50077f) this.f125303b.mo7339a(C50077f.class)).mo97832a(true);
            AppCompatActivity appCompatActivity = this.f125304c;
            C50048n nVar = this.f125305d;
            if (nVar != null) {
                FaceStickerBean C = nVar.mo97798C();
                if (C != null) {
                    C43214dh a = C43214dh.m94817a();
                    C52711k.m112236a((Object) a, "PublishManager.inst()");
                    C43804f fVar = a.f109289d;
                    if (fVar != null && !fVar.f110926c) {
                        if (TextUtils.equals(String.valueOf(C.getStickerId()), fVar.f110925b)) {
                            C50275d.m108541c(appCompatActivity, R.string.gtr).mo98174a();
                            C26890h.m65011a("show_task_activity_warn_toast", C23089d.m56640a().mo47829a("toast_type", "1").mo47829a("task_id", fVar.f110924a).f61491a);
                            return;
                        }
                        fVar.f110926c = true;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.j$f */
    public static final class C50011f {
        private C50011f() {
        }

        public /* synthetic */ C50011f(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public static void m107904a(RemoteImageView remoteImageView, Effect effect) {
        C52711k.m112240b(effect, "effect");
        UrlModel iconUrl = effect.getIconUrl();
        if (iconUrl != null) {
            List urlList = iconUrl.getUrlList();
            if (urlList != null) {
                String str = (String) C52575l.m112140f(urlList);
                if (str != null) {
                    C23515d.m57677a(remoteImageView, str);
                }
            }
        }
    }

    public C50004j(AppCompatActivity appCompatActivity, C0184k kVar, C50048n nVar, ViewGroup viewGroup, final RemoteImageView remoteImageView, RemoteImageView remoteImageView2) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(nVar, "stickerApiComponent");
        ApiCenter a = C2755a.m7851a(appCompatActivity);
        if (viewGroup != null) {
            C50010e eVar = new C50010e(this, a, appCompatActivity, nVar, remoteImageView);
            viewGroup.setOnClickListener(eVar);
            if (remoteImageView != null) {
                viewGroup.setOnTouchListener(new C46410r(1.2f, 150, remoteImageView));
            }
        }
        nVar.mo93023h().mo92989g().mo93014b().observe(kVar, new C0199s<Effect>(this) {

            /* renamed from: a */
            final /* synthetic */ C50004j f125284a;

            {
                this.f125284a = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Effect effect = (Effect) obj;
                if (effect == null) {
                    effect = this.f125284a.f125283a;
                }
                if (effect != null) {
                    C50004j.m107904a(remoteImageView, effect);
                }
            }
        });
        nVar.mo97822v().mo7349a(kVar, new C50006a(this, kVar, remoteImageView2, remoteImageView));
        nVar.mo97820t().mo7349a(kVar, new C50007b(this, kVar, remoteImageView2, remoteImageView));
        nVar.mo97821u().mo97830a().mo7349a(kVar, new C50008c(this, kVar, remoteImageView2, remoteImageView));
        nVar.mo97821u().mo97831b().mo7349a(kVar, new C50009d(this, kVar, remoteImageView2, remoteImageView));
    }
}
