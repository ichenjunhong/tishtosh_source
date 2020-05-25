package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.jedi.arch.C11934u;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.jedi.C49555b;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.o */
public final class C43268o {

    /* renamed from: g */
    public static final C43269a f109411g = new C43269a(null);

    /* renamed from: a */
    public boolean f109412a;

    /* renamed from: b */
    public Effect f109413b;

    /* renamed from: c */
    public int f109414c;

    /* renamed from: d */
    public final FragmentActivity f109415d;

    /* renamed from: e */
    public final C44885g f109416e;

    /* renamed from: f */
    public final C43295w f109417f;

    /* renamed from: h */
    private final ASCameraView f109418h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.o$a */
    static final class C43269a {
        private C43269a() {
        }

        public /* synthetic */ C43269a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.o$b */
    public static final class C43270b<T> implements C0199s<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43268o f109419a;

        public C43270b(C43268o oVar) {
            this.f109419a = oVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f109419a.f109412a = false;
                if (this.f109419a.f109413b != null) {
                    this.f109419a.mo87945a();
                }
                C43268o oVar = this.f109419a;
                if (!C39618d.f101152P.mo83103a(C40790a.StudioDuetChangeLayout)) {
                    return;
                }
                if (C43257i.f109380a.mo87936b() || oVar.f109413b != null) {
                    ChangeDuetLayoutViewModel changeDuetLayoutViewModel = (ChangeDuetLayoutViewModel) C48927d.m105736a(oVar.f109415d).mo96760a(ChangeDuetLayoutViewModel.class);
                    Effect effect = oVar.f109413b;
                    if (effect == null) {
                        C43257i iVar = C43257i.f109380a;
                        effect = new Effect();
                        effect.setName("left-right");
                        effect.setUnzipPath(C43257i.m94889c());
                        effect.setExtra("{\"duet_layout_mode\": \"{\\\"name\\\":\\\"horizontal\\\",\\\"change_direction_mode\\\":0,\\\"safety_status\\\":[\\\"new_left\\\"]}\"}");
                        effect.setSdkExtra("");
                    }
                    changeDuetLayoutViewModel.mo87897a(effect);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.o$c */
    static final class C43271c extends C52712l implements C52671b<C49555b<? extends Effect>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43268o f109420a;

        C43271c(C43268o oVar) {
            this.f109420a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C49555b bVar = (C49555b) obj;
            C52711k.m112240b(bVar, "it");
            this.f109420a.mo87945a();
            if (!C52711k.m112239a((Object) (Effect) bVar.f124309b, (Object) this.f109420a.f109413b)) {
                this.f109420a.f109414c = 0;
            }
            this.f109420a.f109413b = (Effect) bVar.f124309b;
            List arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append(((Effect) bVar.f124309b).getUnzipPath());
            sb.append(";switchButton;");
            sb.append(this.f109420a.f109414c);
            String sb2 = sb.toString();
            String sdkExtra = ((Effect) bVar.f124309b).getSdkExtra();
            C52711k.m112236a((Object) sdkExtra, "it.peekContent().sdkExtra");
            ComposerInfo composerInfo = new ComposerInfo(sb2, sdkExtra, null, 4, null);
            arrayList.add(composerInfo);
            this.f109420a.f109416e.mo91029a(arrayList, 60000);
            this.f109420a.mo87946a(C43266m.f109404a.mo87944a((Effect) bVar.f124309b, 0));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.o$d */
    static final class C43272d extends C52712l implements C52671b<C49555b<? extends Integer>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43268o f109421a;

        C43272d(C43268o oVar) {
            this.f109421a = oVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            int i;
            C49555b bVar = (C49555b) obj;
            C52711k.m112240b(bVar, "it");
            if (this.f109421a.f109413b != null) {
                this.f109421a.f109414c = ((Number) bVar.f124309b).intValue();
                C44885g gVar = this.f109421a.f109416e;
                Effect effect = this.f109421a.f109413b;
                if (effect == null) {
                    C52711k.m112234a();
                }
                gVar.mo91026a(60000, effect.getUnzipPath(), "switchButton", (float) this.f109421a.f109414c);
                C43268o oVar = this.f109421a;
                C43266m mVar = C43266m.f109404a;
                Effect effect2 = this.f109421a.f109413b;
                if (effect2 == null) {
                    C52711k.m112234a();
                }
                int i2 = this.f109421a.f109414c;
                C52711k.m112240b(effect2, "effect");
                C43245e a = mVar.mo87943a(effect2);
                if (a == null) {
                    str = "";
                } else {
                    List<String> list = a.f109357c;
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = -1;
                    }
                    if (i <= i2) {
                        str = "";
                    } else {
                        List<String> list2 = a.f109357c;
                        if (list2 == null) {
                            C52711k.m112234a();
                        }
                        str = (String) list2.get(i2);
                    }
                }
                C26890h.m65011a("switch_duet_layout", C23089d.m56640a().mo47829a("creation_id", oVar.f109417f.mo87954b().f107131x).mo47829a("shoot_way", oVar.f109417f.mo87954b().f107132y).mo47829a("enter_from", "video_shoot_page").mo47829a("shoot_at", str).f61491a);
                C43268o oVar2 = this.f109421a;
                C43266m mVar2 = C43266m.f109404a;
                Effect effect3 = this.f109421a.f109413b;
                if (effect3 == null) {
                    C52711k.m112234a();
                }
                oVar2.mo87946a(mVar2.mo87944a(effect3, this.f109421a.f109414c));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo87945a() {
        if (!this.f109412a) {
            this.f109418h.setDuetSupportChangeLayout(true);
            this.f109412a = true;
        }
    }

    /* renamed from: a */
    public final void mo87946a(String str) {
        C0209x a = C0214z.m440a(this.f109415d).mo359a(ShortVideoContextViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ((ShortVideoContextViewModel) a).f107134a.f107104bc = str;
    }

    public C43268o(FragmentActivity fragmentActivity, ASCameraView aSCameraView, C44885g gVar, C43295w wVar) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aSCameraView, "asCameraView");
        C52711k.m112240b(gVar, "videoRecorder");
        C52711k.m112240b(wVar, "recordDuetLayoutContext");
        this.f109415d = fragmentActivity;
        this.f109418h = aSCameraView;
        this.f109416e = gVar;
        this.f109417f = wVar;
        ((ChangeDuetLayoutViewModel) C48927d.m105736a(this.f109415d).mo96760a(ChangeDuetLayoutViewModel.class)).m106895a(this.f109415d, C43273p.f109422a, new C11934u(), new C43271c(this));
        ((ChangeDuetLayoutViewModel) C48927d.m105736a(this.f109415d).mo96760a(ChangeDuetLayoutViewModel.class)).m106895a(this.f109415d, C43274q.f109423a, new C11934u(), new C43272d(this));
    }
}
