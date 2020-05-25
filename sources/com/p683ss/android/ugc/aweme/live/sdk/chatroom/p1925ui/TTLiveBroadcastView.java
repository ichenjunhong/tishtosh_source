package com.p683ss.android.ugc.aweme.live.sdk.chatroom.p1925ui;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.support.p030v4.app.C0679r;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8678b.C8679a;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8682e;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.p457k.C8832a;
import com.bytedance.common.utility.C9432q;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.live.C36148r;
import com.p683ss.android.ugc.aweme.live.Live;
import com.p683ss.android.ugc.aweme.live.model.C36140a;
import com.p683ss.android.ugc.aweme.live.p1922e.C36072a;
import com.p683ss.android.ugc.aweme.live.p1922e.C36074b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.port.internal.C39655e.C39656a;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44880c;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44882e;
import com.p683ss.android.ugc.aweme.story.live.C46638a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView */
public class TTLiveBroadcastView implements C0183j, C36156a {

    /* renamed from: a */
    public Context f92563a;

    /* renamed from: b */
    public IRecordingOperationPanel f92564b;

    /* renamed from: c */
    public RemoteImageView f92565c;

    /* renamed from: d */
    public C8682e f92566d;

    /* renamed from: e */
    public float f92567e;

    /* renamed from: f */
    public float f92568f;

    /* renamed from: g */
    public float f92569g;

    /* renamed from: h */
    public C44882e f92570h;

    /* renamed from: i */
    public float f92571i;

    /* renamed from: j */
    public int f92572j = -1;

    /* renamed from: k */
    public boolean f92573k;

    /* renamed from: l */
    public boolean f92574l;

    /* renamed from: m */
    public boolean f92575m = true;

    /* renamed from: n */
    private FrameLayout f92576n;

    /* renamed from: o */
    private C36157b f92577o;

    /* renamed from: p */
    private C8682e f92578p;

    /* renamed from: q */
    private C44880c f92579q;

    /* renamed from: r */
    private int f92580r;

    /* renamed from: s */
    private List<C31459g> f92581s = new ArrayList();

    /* renamed from: t */
    private float f92582t;

    /* renamed from: u */
    private float f92583u;

    /* renamed from: v */
    private float f92584v;

    /* renamed from: w */
    private float f92585w;

    /* renamed from: x */
    private float f92586x;

    /* renamed from: y */
    private C8681d f92587y = new C8679a() {
        /* renamed from: a */
        public final void mo8942a() {
            if (TTLiveBroadcastView.this.f92564b != null) {
                TTLiveBroadcastView.this.f92564b.closeRecording();
            }
        }

        /* renamed from: b */
        public final void mo8946b() {
            TTLiveBroadcastView.this.f92574l = true;
            TTLiveBroadcastView.this.f92566d.mo8911k();
            if (TTLiveBroadcastView.this.f92566d != null && TTLiveBroadcastView.this.f92566d.mo8909i().isEmpty()) {
                C0013i.m12a(200).mo20a((C0011g<TResult, TContinuationResult>) new C36164h<TResult,TContinuationResult>(TTLiveBroadcastView.this), C0013i.f25b);
            }
        }

        /* renamed from: a */
        public final int mo8940a(String[] strArr) {
            mo8941a(strArr, new String[0]);
            return 0;
        }

        /* renamed from: b */
        public final void mo8948b(int i) {
            TTLiveBroadcastView.this.mo74881a(i);
        }

        /* renamed from: c */
        public final void mo8949c(float f) {
            TTLiveBroadcastView.this.f92567e = f;
            TTLiveBroadcastView.this.mo74880a(TTLiveBroadcastView.this.f92567e, TTLiveBroadcastView.this.f92568f);
        }

        /* renamed from: d */
        public final void mo8950d(float f) {
            TTLiveBroadcastView.this.f92568f = f;
            TTLiveBroadcastView.this.mo74880a(TTLiveBroadcastView.this.f92567e, TTLiveBroadcastView.this.f92568f);
        }

        /* renamed from: a */
        public final void mo8944a(int i) {
            if (i != TTLiveBroadcastView.this.f92564b.getCameraPos()) {
                TTLiveBroadcastView.this.f92564b.setCameraPos(i);
            }
            C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C36163g<TResult,TContinuationResult>(TTLiveBroadcastView.this), C0013i.f25b);
        }

        /* renamed from: b */
        public final void mo8947b(float f) {
            float f2;
            TTLiveBroadcastView.this.f92569g = f;
            float f3 = 0.0f;
            if (TTLiveBroadcastView.this.f92575m && TTLiveBroadcastView.this.f92570h != null) {
                C44882e eVar = TTLiveBroadcastView.this.f92570h;
                float f4 = TTLiveBroadcastView.this.f92569g;
                if (TTLiveBroadcastView.this.f92572j == 0) {
                    f2 = TTLiveBroadcastView.this.f92571i;
                } else {
                    f2 = 0.0f;
                }
                eVar.mo91001a(f4, f2);
                TTLiveBroadcastView.this.f92575m = false;
            }
            TTLiveBroadcastView tTLiveBroadcastView = TTLiveBroadcastView.this;
            float f5 = TTLiveBroadcastView.this.f92569g;
            if (TTLiveBroadcastView.this.f92572j == 0) {
                f3 = TTLiveBroadcastView.this.f92571i;
            }
            tTLiveBroadcastView.mo74886b(f5, f3);
        }

        /* renamed from: a */
        public final void mo8945a(boolean z) {
            UrlModel urlModel;
            if (!z || !TTLiveBroadcastView.this.f92573k) {
                TTLiveBroadcastView.this.f92565c.setVisibility(0);
                TTLiveBroadcastView.this.f92565c.setImageAlpha(0);
                return;
            }
            TTLiveBroadcastView.this.f92565c.setImageAlpha(NormalGiftView.ALPHA_255);
            TTLiveBroadcastView.this.f92565c.setVisibility(0);
            float a = ((float) C9432q.m18670a(TTLiveBroadcastView.this.f92563a)) / ((float) C9432q.m18688b(TTLiveBroadcastView.this.f92563a));
            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
            RemoteImageView remoteImageView = TTLiveBroadcastView.this.f92565c;
            if (baseUserService_Monster != null) {
                urlModel = baseUserService_Monster.getCurrentUser().getAvatarMedium();
            } else {
                urlModel = null;
            }
            C23515d.m57675a(remoteImageView, urlModel, (C14234d) new C36072a(5, a, null));
        }

        /* renamed from: a */
        public final int mo8941a(String[] strArr, String[] strArr2) {
            if (TTLiveBroadcastView.this.f92570h != null) {
                TTLiveBroadcastView.this.f92570h.mo91009a(true);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < strArr.length; i++) {
                    if (i >= strArr2.length) {
                        arrayList.add(strArr[i]);
                        arrayList2.add("");
                    } else {
                        arrayList.add(strArr[i]);
                        arrayList2.add(strArr2[i]);
                    }
                }
                TTLiveBroadcastView.this.f92570h.mo91008a((List<String>) arrayList, (List<String>) arrayList2, 10000);
            }
            return 0;
        }
    };

    static {
        Live.getService();
    }

    /* renamed from: a */
    public final View mo74879a() {
        return this.f92576n;
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
        if (this.f92573k && this.f92574l) {
            C0013i.m12a(500).mo20a((C0011g<TResult, TContinuationResult>) new C36161e<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: d */
    private void m81618d() {
        List i = this.f92566d.mo8909i();
        if (!i.isEmpty() && i.size() != this.f92581s.size()) {
            this.f92581s.clear();
            this.f92581s.addAll(C36074b.m81445a(i));
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        int i;
        if (this.f92566d != null) {
            this.f92566d.mo8898a(null);
        }
        this.f92570h = null;
        C47718bf.m103291d(this);
        if (this.f92564b == null) {
            i = 1;
        } else {
            i = this.f92564b.getCameraPos();
        }
        AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().setDefaultFilterForCamera(i, this.f92580r);
    }

    /* renamed from: c */
    public final void mo74887c() {
        float f;
        if (this.f92573k) {
            this.f92573k = false;
            if (this.f92566d != null) {
                this.f92566d.mo8912m();
            }
            C36157b bVar = this.f92577o;
            bVar.f92591a = 2;
            bVar.mo74893a();
            this.f92565c.setVisibility(8);
            if (this.f92579q != null) {
                this.f92579q.mo90996a(this.f92580r);
            }
            if (this.f92570h != null) {
                this.f92570h.mo91003a(this.f92580r);
                this.f92570h.mo91012b(this.f92584v, this.f92582t);
                C44882e eVar = this.f92570h;
                float f2 = this.f92583u;
                if (this.f92580r == 0) {
                    f = 0.35f;
                } else {
                    f = 0.0f;
                }
                eVar.mo91001a(f2, f);
                this.f92570h.mo91015c(this.f92585w, this.f92586x);
            }
        }
    }

    /* renamed from: b */
    public final void mo74885b() {
        boolean z;
        int i;
        if (!this.f92573k) {
            this.f92573k = true;
            C26890h.m65011a("livesdk_pm_live_takepage_show", C23089d.m56640a().mo47829a("event_type", "show").mo47829a("event_page", "live_take_page").mo47829a("event_belong", "live_take").f61491a);
            if (this.f92566d == null) {
                if (this.f92578p == null) {
                    this.f92578p = Live.getService().mo15031a((C8832a) new C8832a() {
                        /* renamed from: a */
                        public final void mo15815a(Activity activity, C8633b bVar, C8632a aVar) {
                            C36148r.m81573a().showShareDialog(activity, bVar, aVar);
                        }
                    });
                }
                this.f92566d = this.f92578p;
                this.f92566d.mo8898a(this.f92587y);
                C0679r a = this.f92564b.fragmentManager().mo2225a();
                a.mo2175a((int) R.id.bc7, this.f92566d.mo8913n());
                a.mo2195c();
                this.f92566d.mo8903b(90);
                if (C8830k.m17330d() != null) {
                    C8830k.m17330d().mo15055h().mo8931a(C36160d.f92599a);
                }
                this.f92565c = this.f92564b.backgroundView();
                this.f92565c.setVisibility(8);
                m81618d();
            }
            if (this.f92566d != null) {
                if (this.f92564b.getCameraPos() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C8682e eVar = this.f92566d;
                if (z) {
                    i = 0;
                } else {
                    i = 1;
                }
                eVar.mo8905c(i);
            }
            this.f92579q = this.f92564b.filterModule();
            if (this.f92570h != null) {
                this.f92584v = this.f92570h.mo91014c();
                this.f92582t = this.f92570h.mo91016d();
                this.f92583u = this.f92570h.mo91018e();
                this.f92585w = this.f92570h.mo90999a();
                this.f92586x = this.f92570h.mo91011b();
            }
            C36157b bVar = this.f92577o;
            bVar.f92591a = 1;
            bVar.mo74893a();
            C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C36162f<TResult,TContinuationResult>(this), C0013i.f25b);
            this.f92565c.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo74882a(C39656a aVar) {
        this.f92577o.f92595e = aVar;
    }

    /* renamed from: a */
    public final void mo74883a(View... viewArr) {
        C36157b bVar = this.f92577o;
        if (viewArr != null) {
            for (View add : viewArr) {
                bVar.f92593c.add(add);
            }
        }
    }

    @C53771m
    public void onCameraReverse(C46638a aVar) {
        if (this.f92573k && this.f92574l && this.f92566d != null) {
            boolean z = aVar.f117645a;
            if (this.f92566d.mo8910j() != z) {
                this.f92566d.mo8905c(z ? 1 : 0);
            }
        }
    }

    /* renamed from: a */
    public final C0013i mo74884b(C0013i iVar) {
        float f;
        if (this.f92570h != null) {
            mo74880a(this.f92567e, this.f92568f);
            float f2 = this.f92569g;
            if (this.f92572j == 0) {
                f = this.f92571i;
            } else {
                f = 0.0f;
            }
            mo74886b(f2, f);
            this.f92570h.mo91015c(0.0f, 0.0f);
            mo74881a(this.f92572j);
        }
        return null;
    }

    @C53771m
    public void onFilterChange(C36140a aVar) {
        C31459g gVar = aVar.f92547a;
        int i = aVar.f92548b;
        if (gVar != null) {
            for (int i2 = 0; i2 < this.f92581s.size(); i2++) {
                if (gVar.equals(this.f92581s.get(i2))) {
                    i = i2;
                }
            }
        }
        if (!this.f92573k) {
            this.f92580r = i;
        } else if (this.f92574l && this.f92572j != i) {
            this.f92572j = i;
            m81618d();
            if (this.f92566d != null) {
                this.f92566d.mo8906d(this.f92572j);
            }
            this.f92579q.mo90997a(this.f92581s);
            mo74881a(this.f92572j);
        }
    }

    /* renamed from: a */
    public final void mo74881a(int i) {
        float f;
        if (this.f92573k) {
            if (this.f92579q != null) {
                m81618d();
                this.f92579q.mo90998a(this.f92581s, i);
            }
            if (this.f92574l && i != -1) {
                this.f92572j = i;
                mo74880a(this.f92567e, this.f92568f);
                float f2 = this.f92569g;
                if (this.f92572j == 0) {
                    f = this.f92571i;
                } else {
                    f = 0.0f;
                }
                mo74886b(f2, f);
                if (this.f92566d != null) {
                    this.f92566d.mo8906d(this.f92572j);
                }
                if (this.f92570h != null && this.f92581s.size() > this.f92572j) {
                    String filterFolder = AVExternalServiceImpl.getAVServiceImpl_Monster().filterService().getFilterFolder((C31459g) this.f92581s.get(this.f92572j));
                    if (TextUtils.isEmpty(filterFolder)) {
                        filterFolder = "";
                    }
                    this.f92570h.mo91005a(filterFolder);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo74886b(float f, float f2) {
        if (this.f92570h != null) {
            if (this.f92566d.mo8907g().isEmpty()) {
                this.f92570h.mo91001a(f, f2);
            } else {
                this.f92570h.mo91006a(this.f92566d.mo8907g(), f, f2);
            }
            if (f > 0.0f) {
                this.f92570h.mo91000a(0.05f);
                return;
            }
            this.f92570h.mo91000a(0.01f);
        }
    }

    public TTLiveBroadcastView(Context context, IRecordingOperationPanel iRecordingOperationPanel) {
        C47718bf.m103290c(this);
        this.f92563a = context;
        this.f92564b = iRecordingOperationPanel;
        if (this.f92564b != null) {
            this.f92564b.getLifecycle().mo324a(this);
        }
        this.f92576n = new FrameLayout(this.f92563a);
        this.f92576n.setVisibility(4);
        this.f92576n.setId(R.id.bc7);
        this.f92577o = new C36157b(this.f92576n);
        this.f92578p = Live.getService().mo15031a((C8832a) new C8832a() {
            /* renamed from: a */
            public final void mo15815a(Activity activity, C8633b bVar, C8632a aVar) {
                C36148r.m81573a().showShareDialog(activity, bVar, aVar);
            }
        });
        this.f92570h = this.f92564b.videoRecorder();
    }

    /* renamed from: a */
    public final void mo74880a(float f, float f2) {
        if (this.f92570h != null) {
            if (this.f92566d.mo8908h().isEmpty()) {
                this.f92570h.mo91012b(f, f2);
                return;
            }
            this.f92570h.mo91013b(this.f92566d.mo8908h(), f, f2);
        }
    }
}
