package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.C1028c;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.AlsVMContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.C2756a;
import com.bytedance.als.C2757b;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2767k;
import com.bytedance.als.ext.C2761a;
import com.bytedance.als.ext.OCAdapterViewModel;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.dmt.p664ui.p669e.C10703a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.p582g.p583a.p593e.C10022a;
import com.bytedance.p780m.C12361b;
import com.bytedance.p780m.C12366c;
import com.bytedance.p780m.C12366c.C12369a;
import com.bytedance.p780m.C12366c.C12370b;
import com.bytedance.p780m.C12372e;
import com.bytedance.scene.C12921h;
import com.bytedance.scene.C12930k;
import com.bytedance.scene.C12935m;
import com.google.p1057b.p1058a.C17410f;
import com.google.p1057b.p1058a.C17421k;
import com.p683ss.android.ttve.nativePort.TELogcat;
import com.p683ss.android.ugc.asve.recorder.C20530m;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.base.activity.C23424c;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1595g.C26888e;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.port.internal.C39657f;
import com.p683ss.android.ugc.aweme.port.internal.C39666o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39550ai.C39551a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C42562ct;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43309ec;
import com.p683ss.android.ugc.aweme.shortvideo.C45328x;
import com.p683ss.android.ugc.aweme.shortvideo.RetakeViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42453c;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43268o;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43268o.C43270b;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43299y;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43763r;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2203g.C43859a;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43892f;
import com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43909b;
import com.p683ss.android.ugc.aweme.shortvideo.p2217n.C44321a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44882e;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45130a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45131b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45132c;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45133d;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45134e;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45135f;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45136g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45137h;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45138i;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45139j;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45140k;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45141l;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45143m;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45145n;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45146o;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45147p;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45148q;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45149r;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45150s;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45151t;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45129cx.C45153u;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45004a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45010ae;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45011af;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45012ag;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45098a;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45101d;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44452c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45392al;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.sticker.C45805a;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2275a.C45819c;
import com.p683ss.android.ugc.aweme.sticker.p2283g.C45889c;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46054d;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46296e;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46609g;
import com.p683ss.android.ugc.aweme.tools.C47026e;
import com.p683ss.android.ugc.aweme.tools.C47059f;
import com.p683ss.android.ugc.aweme.tools.C47064i;
import com.p683ss.android.ugc.aweme.tools.C47323n;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.tools.C47346u;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.aweme.tools.foundation.C47060a;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49683a;
import com.p683ss.android.ugc.gamora.recorder.filter.p2470a.C49685c;
import com.p683ss.android.ugc.gamora.recorder.filter.p2472c.C49717b;
import com.p683ss.android.ugc.gamora.recorder.filter.p2472c.C49718c;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49596h;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2468e.C49659a;
import com.p683ss.android.ugc.gamora.recorder.p2476j.C49842a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C49998d;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50012k;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.gamora.recorder.sticker.sticker_panel.C50077f;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50630ak;
import com.p683ss.android.vesdk.C50792y;
import com.p683ss.android.vesdk.runtime.C50771d;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52884a;
import dmt.p2652av.video.p2655c.C52943a;
import dmt.p2652av.video.p2655c.C52944b;
import dmt.p2652av.video.p2656d.C52955b;
import dmt.p2652av.video.p2656d.C52959d;
import dmt.p2652av.video.p2656d.C52960e;
import dmt.p2652av.video.p2656d.C52962g;
import dmt.p2652av.video.superentrance.SuperEntranceActivity.C52990c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity */
public class VideoRecordNewActivity extends RecordSessionActivity implements C23441t, C39657f {

    /* renamed from: A */
    boolean f113762A = false;

    /* renamed from: B */
    public String f113763B;

    /* renamed from: C */
    public ArrayList<StickerWrapper> f113764C = new ArrayList<>();

    /* renamed from: D */
    public C45328x f113765D;

    /* renamed from: E */
    public C45004a f113766E;

    /* renamed from: F */
    public C42451a f113767F;

    /* renamed from: G */
    public C50048n f113768G;

    /* renamed from: H */
    private List<C23422a> f113769H = new ArrayList();

    /* renamed from: I */
    private C12935m f113770I;

    /* renamed from: J */
    private boolean f113771J = false;

    /* renamed from: K */
    private boolean f113772K = false;

    /* renamed from: L */
    private int f113773L;

    /* renamed from: M */
    private C43268o f113774M;

    /* renamed from: N */
    private C39551a f113775N = new C39551a() {
    };

    /* renamed from: b */
    public final C52668f<ApiCenter> f113776b = C52732g.m112285a(new C45112cg(this));

    /* renamed from: c */
    public C12361b f113777c;

    /* renamed from: d */
    public ShortVideoContext f113778d;

    /* renamed from: e */
    public List<C23423b> f113779e = new ArrayList();

    /* renamed from: f */
    public SafeHandler f113780f = new SafeHandler(this);

    /* renamed from: g */
    public C44452c f113781g;

    /* renamed from: h */
    public C44885g f113782h;

    /* renamed from: i */
    public FrameLayout f113783i;

    /* renamed from: j */
    public FrameLayout f113784j;

    /* renamed from: k */
    public SurfaceView f113785k;

    /* renamed from: l */
    public FrameLayout f113786l;

    /* renamed from: m */
    public List<String> f113787m;

    /* renamed from: n */
    public Effect f113788n;

    /* renamed from: o */
    public boolean f113789o;

    /* renamed from: p */
    boolean f113790p;

    /* renamed from: q */
    public String f113791q;

    /* renamed from: r */
    public String f113792r;

    /* renamed from: s */
    public C43909b f113793s = new C43909b();

    /* renamed from: t */
    public C42562ct f113794t;

    /* renamed from: u */
    Effect f113795u;

    /* renamed from: v */
    public boolean f113796v = false;

    /* renamed from: w */
    FrameLayout f113797w;

    /* renamed from: x */
    public volatile boolean f113798x = true;

    /* renamed from: y */
    boolean f113799y;

    /* renamed from: z */
    public boolean f113800z = false;

    public final C44882e cj_() {
        return this.f113782h;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C20489b ck_() {
        return this.f113782h.f113586a;
    }

    /* renamed from: h */
    public final void mo91198h() {
        this.f113766E.mo91311Q();
    }

    public void onStop() {
        super.onStop();
        m98241p();
    }

    /* renamed from: p */
    private void m98241p() {
        if (this.f113766E != null) {
            this.f113766E.mo91338a(false);
        }
    }

    /* renamed from: e */
    public final C49683a mo91195e() {
        return (C49683a) this.f113777c.mo23372a(C49683a.class);
    }

    public Resources getResources() {
        C45392al.m98950a(this, this.mFirstResumed);
        return super.getResources();
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.arz);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final ShortVideoContextViewModel mo91199i() {
        return (ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this).mo359a(ShortVideoContextViewModel.class);
    }

    public void onStart() {
        super.onStart();
        C45101d.m98616a((C45098a) new C52959d());
    }

    /* renamed from: q */
    private void m98242q() {
        C39666o oVar = (C39666o) C26888e.m65000a(this, C39666o.class);
        if (oVar != null && oVar.mo48462d(true)) {
            oVar.mo48464e(false);
        }
    }

    /* renamed from: b */
    public final void mo46740b() {
        C22452a.m55494a(this.f113785k, this.f113778d.f107116i, this.f113778d.f107117j);
        if (this.f113794t != null) {
            boolean f = this.f113794t.mo86792f();
        }
    }

    /* renamed from: f */
    public final C50048n mo91196f() {
        if (this.f113768G == null) {
            this.f113768G = (C50048n) this.f113777c.mo23374b(C50048n.class);
        }
        return this.f113768G;
    }

    /* renamed from: g */
    public final C50077f mo91197g() {
        return (C50077f) ((ApiCenter) this.f113776b.getValue()).mo7341b(C50077f.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Effect mo91201k() {
        if (getIntent().getBooleanExtra("reuse_mvtheme_enter", false)) {
            return (Effect) getIntent().getParcelableExtra("first_sticker");
        }
        return null;
    }

    public void setStatusBarColor() {
        if (VERSION.SDK_INT >= 21) {
            getWindow().setFlags(0, DynamicTabYellowPointVersion.DEFAULT);
        }
    }

    /* renamed from: m */
    private void m98238m() {
        this.f113766E.mo91307M().mo43628a((C50771d) new C20530m(new C52943a(this.f113778d.f107118k)), this.f113778d.f107118k.mo86460g().getAbsolutePath());
    }

    /* renamed from: r */
    private Effect m98243r() {
        if (!"green_screen".equals(this.f113778d.f107132y)) {
            return null;
        }
        Effect effect = (Effect) getIntent().getParcelableExtra("first_sticker");
        if (effect != null) {
            this.f113778d.f107081ag = 13;
        }
        return effect;
    }

    /* renamed from: l */
    public final boolean mo91202l() {
        if (!AVServiceImpl.createIInternalAVServicebyMonsterPlugin().avSettingsService().isXsSupport() || this.f113794t == null || !this.f113794t.getLifecycle().mo323a().isAtLeast(C0178b.CREATED)) {
            return false;
        }
        C49596h hVar = (C49596h) this.f113794t.mo24388a("RecordBottomTabScene");
        if (hVar == null || !hVar.mo97503I()) {
            return false;
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        C10703a.m21575a(false);
        this.f113796v = false;
        C45380af.m98935a().mo91717b();
        C45412b.m98979a().pause(this, "record", this.f113778d.f107132y, this.f113778d.f107131x);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo78592d() {
        if (!isFinishing()) {
            C45412b.m98979a().step("av_video_record_init", "addFragment");
            C50203g.m108358a("addFragment PlanC");
            if (this.f113770I != null) {
                this.f113770I.mo24329c();
                this.f113770I = null;
                ((ViewGroup) findViewById(R.id.c_v)).removeAllViews();
            }
            this.f113794t = m98233a(getIntent());
            this.f113794t.f109319u = new C45127cv(this);
            this.f113770I = C12921h.m25903a((Activity) this, C42562ct.class).mo24452a(false).mo24451a((C12930k) new C45128cw(this)).mo24454b(false).mo24455c(false).mo24450a((int) R.id.c_v).mo24453a();
        }
    }

    /* renamed from: j */
    public final JSONObject mo91200j() {
        String str;
        C23088c a = C23088c.m56631a().mo47824a("creation_id", this.f113778d.f107131x).mo47824a("shoot_way", this.f113778d.f107132y).mo47824a("route", "1");
        String str2 = "is_photo";
        if (mo91199i().mo86389b()) {
            str = "1";
        } else {
            str = "0";
        }
        return a.mo47824a(str2, str).mo47824a("position", "shoot_page").mo47825b();
    }

    public void onDestroy() {
        super.onDestroy();
        C45183i.f114318a.clear();
        C45183i.f114319b.clear();
        m98242q();
        C44321a a = C44321a.m97073a();
        a.f112189b = null;
        a.f112190c = -1;
        C29252f fVar = a.f112188a;
        if (fVar != null) {
            fVar.destroy();
        }
        a.f112188a = null;
        C39618d.f101168i.mo80585g().mo80593b();
        this.f113794t = null;
        C53755c.m114319a().mo112959c((Object) this);
        C45380af a2 = C45380af.m98935a();
        a2.f114751a = null;
        a2.f114753c = null;
        a2.f114752b.sendEmptyMessage(1);
        C47858ep.f120420a = false;
        C47858ep.f120421b = false;
        C47858ep.f120422c = false;
        C43214dh.m94817a().mo87853c();
        C43214dh.m94817a().mo87854d();
        C44986ar.m98332a(false);
        AVServiceImpl.createIInternalAVServicebyMonsterPlugin().avSettingsService().isXsSupport();
        C45412b.m98979a().leave(this, "record");
        HashMap hashMap = (HashMap) C52884a.f131167a.get(1);
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: n */
    private void m98239n() {
        if (this.f113778d.f107132y != null) {
            String str = FaceStickerBean.sCurPropSource;
            String str2 = this.f113778d.f107132y;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1731750228:
                    if (str2.equals("single_song")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1098262888:
                    if (str2.equals("prop_reuse")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3449699:
                    if (str2.equals("prop")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3524221:
                    if (str2.equals("scan")) {
                        c = 1;
                        break;
                    }
                    break;
                case 669986889:
                    if (str2.equals("direct_shoot")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1402633315:
                    if (str2.equals("challenge")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = "challenge";
                    break;
                case 1:
                    str = "qr_code";
                    break;
                case 2:
                    str = "prop_single_song";
                    break;
                case 3:
                    str = "prop_reuse";
                    break;
                case 4:
                    str = "direct_shoot";
                    break;
                case 5:
                    str = "homepage_prop_maker";
                    break;
            }
            FaceStickerBean.sCurPropSource = str;
        }
    }

    /* renamed from: o */
    private void m98240o() {
        C50012k kVar = (C50012k) this.f113777c.mo23372a(C50012k.class);
        kVar.mo92999a((C46296e) new C46296e() {
            /* renamed from: b */
            public final void mo91211b() {
                VideoRecordNewActivity.this.f113766E.mo91335a(new C47351z());
                VideoRecordNewActivity.this.f113794t.mo86791d().mo86533a(new C47323n("click_next"));
            }

            /* renamed from: c */
            public final boolean mo91212c() {
                if (VideoRecordNewActivity.this.f113778d != null && !C10022a.m20170a(VideoRecordNewActivity.this.f113778d.mo86375p())) {
                    return true;
                }
                return false;
            }

            /* renamed from: a */
            public final boolean mo91210a() {
                if (VideoRecordNewActivity.this.f113794t == null || VideoRecordNewActivity.this.f113794t.mo87883J() == null || VideoRecordNewActivity.this.f113794t.mo87883J().mo86394e().getValue() == null) {
                    return true;
                }
                return ((Boolean) VideoRecordNewActivity.this.f113794t.mo87883J().mo86394e().getValue()).booleanValue();
            }
        });
        C0198r e = mo91199i().mo86394e();
        kVar.getClass();
        e.observe(this, new C45117cl(kVar));
        mo91199i().mo86396f().observe(this, new C45118cm(kVar));
        kVar.mo93024i().mo92250a((C45819c) new C45819c() {
            /* renamed from: a */
            public final void mo91209a(C46318d dVar) {
                C52711k.m112240b(C47060a.f118841a, "$this$cancelSticker");
                C47060a.m102182a("use_sticker", "");
            }

            /* renamed from: a */
            public final void mo91208a(C46315a aVar) {
                C47060a aVar2 = C47060a.f118841a;
                String name = aVar.f116852a.getName();
                C52711k.m112240b(aVar2, "$this$useSticker");
                C52711k.m112240b(name, "stickerName");
                C47060a.m102182a("use_sticker", name);
            }
        });
        List f = getSupportFragmentManager().mo2238f();
        if (C9414h.m18631b(f)) {
            C17410f fVar = C45114ci.f114233a;
            C17421k.m42653a(f);
            ArrayList<Fragment> arrayList = new ArrayList<>();
            for (Object next : f) {
                if (((Boolean) fVar.mo33734a(next)).booleanValue()) {
                    arrayList.add(next);
                }
            }
            if (C9414h.m18631b(arrayList)) {
                C0679r a = getSupportFragmentManager().mo2225a();
                for (Fragment a2 : arrayList) {
                    a.mo2177a(a2);
                }
                a.mo2195c();
            }
        }
    }

    public void finish() {
        String stringExtra = getIntent().getStringExtra("backurl");
        if (m98235b(getIntent())) {
            startActivity(new Intent(this, (Class) getIntent().getSerializableExtra("micro_app_class")));
        }
        if (getIntent().getBooleanExtra("extra_enter_record_form_super_entrance", false)) {
            C52990c.m112719a(this, getIntent());
        }
        super.finish();
        if (this.f113794t != null) {
            m98241p();
        }
        if (!TextUtils.isEmpty(stringExtra) && !m98235b(getIntent()) && !TextUtils.isEmpty(stringExtra) && !TextUtils.equals("__BACKURL__", stringExtra)) {
            try {
                Uri parse = Uri.parse(stringExtra);
                Intent intent = new Intent();
                intent.setData(parse);
                intent.setAction("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setComponent(null);
                intent.setSelector(null);
                startActivityIfNeeded(intent, -1);
                moveTaskToBack(true);
            } catch (Exception unused) {
            }
        }
        C23424c.m57557b(this, 3);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", true);
        if (C45392al.m98951b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
            return;
        }
        C50203g.m108358a("VideoRecordNewActivity => onResume start");
        super.onResume();
        C10703a.m21575a(true);
        this.f113796v = true;
        if (this.f113771J) {
            C39618d.f101148L.mo80685a(this, C39618d.f101148L.mo80683a(), this.f113795u);
            this.f113771J = false;
        }
        C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47829a("creation_id", this.f113778d.f107131x).mo47829a("enter_from", this.f113778d.f107133z).mo47827a("dalvikPss", C45380af.m98935a().f114754d).mo47827a("nativePss", C45380af.m98935a().f114755e).mo47827a("otherPss", C45380af.m98935a().f114757g).mo47827a("totalPss", C45380af.m98935a().f114756f).f61491a);
        C50203g.m108358a("VideoRecordNewActivity => onResume end");
        C45380af.m98935a().mo91715a(this, this.f113783i);
        if (this.f113778d != null) {
            this.f113766E.mo91307M().mo43640e(this.f113778d.mo86361c());
        }
        C45392al.m98949a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onResume", false);
    }

    /* renamed from: a */
    public final void mo48605a(C23422a aVar) {
        this.f113769H.add(aVar);
    }

    /* renamed from: b */
    public final void mo48606b(C23422a aVar) {
        this.f113769H.remove(aVar);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C43892f fVar) {
        this.f113778d.f107049aA = fVar.f111159a;
    }

    /* renamed from: b */
    private static boolean m98235b(Intent intent) {
        if (intent == null || intent.getSerializableExtra("micro_app_info") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo46739a(boolean z) {
        if (this.f113794t != null) {
            C43859a h = this.f113794t.mo86793h();
            if (h != null) {
                h.mo89404e(z);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("save_state_short_video_context", this.f113778d);
    }

    /* renamed from: d */
    private void m98237d(boolean z) {
        C49842a aVar = (C49842a) ApiCenter.m7844a((FragmentActivity) this).mo7341b(C49842a.class);
        if (aVar != null) {
            aVar.mo97679a(z);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C49659a aVar = (C49659a) ApiCenter.m7844a((FragmentActivity) this).mo7341b(C49659a.class);
            if (aVar != null) {
                aVar.mo97562e();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f113773L != configuration.screenWidthDp) {
            this.f113773L = configuration.screenWidthDp;
            C22452a.m55494a(this.f113785k, this.f113778d.f107116i, this.f113778d.f107117j);
        }
    }

    /* renamed from: a */
    private C42562ct m98233a(Intent intent) {
        if (intent == null) {
            return new C42562ct(this.f113778d, getIntent(), this.f113766E.mo91307M(), this.f113777c);
        }
        C42562ct ctVar = new C42562ct(this.f113778d, intent, this.f113766E.mo91307M(), this.f113777c);
        if (getIntent() != null) {
            Effect k = mo91201k();
            if (k != null) {
                ctVar.f109317s = k;
            }
            Effect r = m98243r();
            if (r != null) {
                ctVar.f109318t = r;
            }
        }
        return ctVar;
    }

    /* renamed from: c */
    private static void m98236c(boolean z) {
        StringBuilder sb = new StringBuilder("So Decompress: printing compressing data in VideoRecordNewActivity, in ");
        sb.append("abnormal statedecompress required: ");
        sb.append(AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getDecompressService().mo74199a());
        sb.append(", library path: ");
        sb.append(AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin().getDecompressService().mo74201c());
        C50203g.m108358a(sb.toString());
    }

    /* renamed from: b */
    public final void mo46741b(boolean z) {
        if (this.f113794t != null) {
            C43859a h = this.f113794t.mo86793h();
            if (h != null) {
                h.mo89402d(z);
            }
        }
    }

    @C53771m(mo112976b = true)
    public void receiveToast(C46609g gVar) {
        if (TextUtils.equals(gVar.f117594a, UnLockSticker.STICKER_UNLOCKED)) {
            this.f113771J = true;
            this.f113795u = gVar.f117595b;
            if (this.f113796v && !gVar.f117597d) {
                C39618d.f101148L.mo80685a(this, C39618d.f101148L.mo80683a(), gVar.f117595b);
                this.f113771J = false;
            }
            C53755c.m114319a().mo112963g(gVar);
        }
    }

    /* renamed from: a */
    private void m98234a(Bundle bundle) {
        boolean z;
        boolean z2 = true;
        if (bundle != null) {
            this.f113778d = (ShortVideoContext) bundle.getParcelable("save_state_short_video_context");
            StringBuilder sb = new StringBuilder("initData with outState,shortVideoContext is NULL:");
            if (this.f113778d == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C50203g.m108358a(sb.toString());
            m98236c(true);
        }
        if (this.f113778d == null) {
            C39629l.m88232a().mo58586q();
            this.f113778d = C43309ec.m95000a(getIntent());
            StringBuilder sb2 = new StringBuilder("initData with intent,shortVideoContext is NULL:");
            if (this.f113778d != null) {
                z2 = false;
            }
            sb2.append(z2);
            C50203g.m108358a(sb2.toString());
        }
        this.f113791q = getIntent().getStringExtra("extra_sticker_from");
        this.f113792r = getIntent().getStringExtra("grade_key");
        this.f113789o = getIntent().getBooleanExtra("navigate_back_to_main", false);
        m98239n();
        C43214dh.m94817a().f109290e = this.f113778d.f107132y;
        C43306a.m94985a(this.f113778d.f107131x);
        ShortVideoContextViewModel i = mo91199i();
        i.f107134a = this.f113778d;
        i.mo86383a(this.f113778d.f107081ag);
        this.f113790p = getIntent().getBooleanExtra("sticker_pannel_show", false);
        this.f113787m = getIntent().getStringArrayListExtra("reuse_sticker_ids");
        this.f113788n = (Effect) getIntent().getParcelableExtra("first_sticker");
        this.f113763B = getIntent().getStringExtra("update_effect_id");
        this.f113764C = getIntent().getParcelableArrayListExtra("update_effect_extra");
        if (C32816h.m75716b().getStickerUpdateApp().booleanValue() && "direct_shoot".equals(this.f113778d.f107132y) && this.f113788n == null && (this.f113787m == null || this.f113787m.size() == 0)) {
            String b = C39618d.f101182w.mo74173b((Context) this);
            if (!TextUtils.isEmpty(b)) {
                this.f113787m = new ArrayList();
                this.f113787m.add(b);
            }
        }
        if (!TextUtils.isEmpty(getIntent().getStringExtra("task_id"))) {
            this.f113778d.f107049aA = C39618d.f101173n.mo74191a(this.f113778d.f107049aA, getIntent().getStringExtra("task_id"));
        } else {
            C43214dh.m94817a().mo87854d();
        }
        if (!TextUtils.isEmpty(getIntent().getStringExtra("star_atlas_object"))) {
            this.f113778d.f107049aA = C39618d.f101173n.mo74195b(this.f113778d.f107049aA, getIntent().getStringExtra("star_atlas_object"));
        }
        String stringExtra = getIntent().getStringExtra("music_origin");
        if (stringExtra != null) {
            this.f113778d.f107115h = stringExtra;
        }
        C23778b.m58356c();
    }

    public void onNewIntent(Intent intent) {
        C47337r rVar;
        super.onNewIntent(intent);
        C50203g.m108358a("VideoRecordNewActivity onNewIntent");
        if (this.f113778d == null || !C52944b.m112642a(this)) {
            C50203g.m108358a("close record page because of null shortVideoContext instance when invoking onNewIntent method");
            finish();
            return;
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        boolean z = false;
        if (intExtra == 1) {
            C43309ec.m95001a(intent, this.f113778d);
            m98238m();
            C49860a aVar = (C49860a) ApiCenter.m7844a((FragmentActivity) this).mo7341b(C49860a.class);
            if (aVar != null) {
                aVar.mo97687a(this.f113778d.f107124q);
                aVar.mo97684a(0);
            }
            if (this.f113794t != null) {
                this.f113794t.mo86791d().mo86536a(new C47346u());
            }
            ((RetakeViewModel) C0214z.m440a((FragmentActivity) this).mo359a(RetakeViewModel.class)).f107019a.setValue(Boolean.valueOf(true));
        } else if (intExtra == 2) {
            C43309ec.m95005b(intent, this.f113778d);
            m98238m();
            if (this.f113794t != null) {
                if (!this.f113778d.mo86362d() || this.f113778d.f107037P == null) {
                    rVar = C47337r.m102705a(this.f113778d.mo86375p(), this.f113778d.mo86372m());
                } else {
                    rVar = C47337r.m102706a((List<TimeSpeedModelExtension>) this.f113778d.mo86375p(), this.f113778d.mo86372m(), this.f113778d.f107037P);
                }
                this.f113766E.mo91331a(rVar);
                this.f113794t.mo86791d().mo86530a(new C47026e());
            }
            ((RetakeViewModel) C0214z.m440a((FragmentActivity) this).mo359a(RetakeViewModel.class)).f107019a.setValue(Boolean.valueOf(false));
        }
        if (this.f113778d.mo86371l() == null) {
            C49607a aVar2 = (C49607a) ApiCenter.m7844a((FragmentActivity) this).mo7341b(C49607a.class);
            if (aVar2 != null) {
                aVar2.mo97524l();
            }
        }
        m98242q();
        boolean booleanExtra = intent.getBooleanExtra("recreate_record_and_clear", false);
        this.f113789o = getIntent().getBooleanExtra("navigate_back_to_main", false);
        this.f113790p = intent.getBooleanExtra("sticker_pannel_show", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_from_other_platform", false);
        if (booleanExtra) {
            C50203g.m108358a("VideoRecordNewActivity isClear");
            setIntent(intent);
            if (getIntent().getIntExtra("translation_type", 0) == 3) {
                C23424c.m57556a(this, 3);
            }
            if (this.f113766E != null) {
                this.f113766E.mo91332a(C47339t.NORMAL);
            }
            this.f113766E.mo91311Q();
            C50630ak.m109154a();
            if (mo91196f() != null) {
                mo91196f().mo97803H();
            }
            C39618d.f101144H.mo58584o().mo64333c().mo64345a();
            m98234a((Bundle) null);
            mo78592d();
        } else if (this.f113778d == null) {
            m98234a((Bundle) null);
        }
        ShortVideoContext shortVideoContext = this.f113778d;
        if (booleanExtra2 || this.f113778d.f107054aF != null) {
            z = true;
        }
        shortVideoContext.f107055aG = z;
        if (this.f113790p && mo91197g() != null) {
            mo91197g().mo97832a(true);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        byte b;
        byte b2;
        boolean z;
        boolean z2;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", true);
        C45412b.m98979a().enter(this, "record");
        m98234a(bundle);
        C43191e.m94739a().mo87798a((Context) this);
        C42482c b3 = C43214dh.m94817a().mo50201b();
        if (b3 != null && b3.getDuration() > 0) {
            this.f113778d.f107114g = b3.getDuration();
        }
        C52711k.m112240b(this, "activity");
        C0209x a = C0214z.m440a((FragmentActivity) this).mo359a(AlsVMContainer.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…sVMContainer::class.java]");
        AlsVMContainer alsVMContainer = (AlsVMContainer) a;
        alsVMContainer.f8313a = null;
        alsVMContainer.f8314b = null;
        C52711k.m112240b(this, "$this$bindComponents");
        AppCompatActivity appCompatActivity = this;
        OCAdapterViewModel a2 = C2761a.m7859a(appCompatActivity);
        C12366c cVar = a2.f8323a;
        C12370b a3 = cVar.mo23380a(AppCompatActivity.class, (String) null, appCompatActivity);
        C52711k.m112236a((Object) a3, "this.registerInstance(T:…ass.java, null, instance)");
        a3.mo23383a(FragmentActivity.class).mo23383a(Activity.class);
        C52711k.m112236a((Object) cVar.mo23380a(Context.class, (String) null, appCompatActivity), "this.registerInstance(T:…ass.java, null, instance)");
        Context applicationContext = appCompatActivity.getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "applicationContext");
        C52711k.m112236a((Object) cVar.mo23380a(Context.class, "applicationContext", applicationContext), "this.registerInstance(T:…ass.java, name, instance)");
        C52711k.m112236a((Object) cVar.mo23378a(VideoRecordNewActivity.class, (String) null, (C12372e<T>) new C45146o<T>(this)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(ShortVideoContext.class, (String) null, (C12372e<T>) new C45147p<T>(this)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(AbsActivity.class, (String) null, (C12372e<T>) new C45148q<T>(this)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(ApiCenter.class, (String) null, (C12372e<T>) new C45149r<T>(this)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(C0184k.class, (String) null, (C12372e<T>) new C45150s<T>(this)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(C49998d.class, (String) null, (C12372e<T>) new C45151t<T>(this)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(C46054d.class, (String) null, (C12372e<T>) new C45139j<T>()), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(C45889c.class, (String) null, (C12372e<T>) new C45153u<T>(this)), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        C52711k.m112236a((Object) cVar.mo23378a(C45805a.class, (String) null, (C12372e<T>) new C45140k<T>()), "this.registerSingle(T::c…ntainer)\n        }\n    })");
        a2.mo7346a();
        if (a2.mo7347b() == null) {
            C52711k.m112234a();
        }
        C2757b bVar = new C2757b(C2756a.m7852a(appCompatActivity));
        AlsLogicContainer alsLogicContainer = bVar.f8321a;
        Class<C45004a> cls = C45004a.class;
        Class<C45017b> cls2 = C45017b.class;
        alsLogicContainer.f8308c.mo23377a(cls2, (C12372e<T>) new C45141l<T>(this));
        C12369a a4 = alsLogicContainer.f8308c.mo23377a(cls, (C12372e<T>) new C45133d<T>(cls2));
        Class[] interfaces = cls.getInterfaces();
        C52711k.m112236a((Object) interfaces, "apiComponentClazz.interfaces");
        for (Class cls3 : interfaces) {
            if (!C52711k.m112239a((Object) cls3, (Object) C2759d.class)) {
                Class[] clsArr = new Class[1];
                if (cls3 != null) {
                    clsArr[0] = cls3;
                    a4.mo23383a(clsArr);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer.f8310e.add(cls2);
        AlsLogicContainer alsLogicContainer2 = bVar.f8321a;
        Class<C49683a> cls4 = C49683a.class;
        Class<C49685c> cls5 = C49685c.class;
        alsLogicContainer2.f8308c.mo23377a(cls5, (C12372e<T>) new C45134e<T>());
        C12369a a5 = alsLogicContainer2.f8308c.mo23377a(cls4, (C12372e<T>) new C45135f<T>(cls5));
        Class[] interfaces2 = cls4.getInterfaces();
        C52711k.m112236a((Object) interfaces2, "apiComponentClazz.interfaces");
        for (Class cls6 : interfaces2) {
            if (!C52711k.m112239a((Object) cls6, (Object) C2759d.class)) {
                Class[] clsArr2 = new Class[1];
                if (cls6 != null) {
                    clsArr2[0] = cls6;
                    a5.mo23383a(clsArr2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer2.f8310e.add(cls5);
        AlsLogicContainer alsLogicContainer3 = bVar.f8321a;
        Class<C49717b> cls7 = C49717b.class;
        Class<C49718c> cls8 = C49718c.class;
        alsLogicContainer3.f8308c.mo23377a(cls8, (C12372e<T>) new C45143m<T>(this));
        C12369a a6 = alsLogicContainer3.f8308c.mo23377a(cls7, (C12372e<T>) new C45136g<T>(cls8));
        Class[] interfaces3 = cls7.getInterfaces();
        C52711k.m112236a((Object) interfaces3, "apiComponentClazz.interfaces");
        for (Class cls9 : interfaces3) {
            if (!C52711k.m112239a((Object) cls9, (Object) C2759d.class)) {
                Class[] clsArr3 = new Class[1];
                if (cls9 != null) {
                    clsArr3[0] = cls9;
                    a6.mo23383a(clsArr3);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer3.f8310e.add(cls8);
        AlsLogicContainer alsLogicContainer4 = bVar.f8321a;
        Class<C42451a> cls10 = C42451a.class;
        Class<C42453c> cls11 = C42453c.class;
        alsLogicContainer4.f8308c.mo23377a(cls11, (C12372e<T>) new C45137h<T>());
        C12369a a7 = alsLogicContainer4.f8308c.mo23377a(cls10, (C12372e<T>) new C45138i<T>(cls11));
        Class[] interfaces4 = cls10.getInterfaces();
        C52711k.m112236a((Object) interfaces4, "apiComponentClazz.interfaces");
        for (Class cls12 : interfaces4) {
            if (!C52711k.m112239a((Object) cls12, (Object) C2759d.class)) {
                Class[] clsArr4 = new Class[1];
                if (cls12 != null) {
                    clsArr4[0] = cls12;
                    a7.mo23383a(clsArr4);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer4.f8310e.add(cls11);
        AlsLogicContainer alsLogicContainer5 = bVar.f8321a;
        Class<C50048n> cls13 = C50048n.class;
        Class<C50012k> cls14 = C50012k.class;
        alsLogicContainer5.f8308c.mo23377a(cls14, (C12372e<T>) new C45145n<T>(this));
        C12369a a8 = alsLogicContainer5.f8308c.mo23377a(cls13, (C12372e<T>) new C45130a<T>(cls14));
        Class[] interfaces5 = cls13.getInterfaces();
        C52711k.m112236a((Object) interfaces5, "apiComponentClazz.interfaces");
        for (Class cls15 : interfaces5) {
            if (!C52711k.m112239a((Object) cls15, (Object) C2759d.class)) {
                Class[] clsArr5 = new Class[1];
                if (cls15 != null) {
                    clsArr5[0] = cls15;
                    a8.mo23383a(clsArr5);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer5.f8310e.add(cls14);
        AlsLogicContainer alsLogicContainer6 = bVar.f8321a;
        Class<C45011af> cls16 = C45011af.class;
        Class<C45012ag> cls17 = C45012ag.class;
        alsLogicContainer6.f8308c.mo23377a(cls17, (C12372e<T>) new C45131b<T>());
        C12369a a9 = alsLogicContainer6.f8308c.mo23377a(cls16, (C12372e<T>) new C45132c<T>(cls17));
        Class[] interfaces6 = cls16.getInterfaces();
        C52711k.m112236a((Object) interfaces6, "apiComponentClazz.interfaces");
        for (Class cls18 : interfaces6) {
            if (!C52711k.m112239a((Object) cls18, (Object) C2759d.class)) {
                Class[] clsArr6 = new Class[1];
                if (cls18 != null) {
                    clsArr6[0] = cls18;
                    a9.mo23383a(clsArr6);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.Class<in A>");
                }
            }
        }
        alsLogicContainer6.f8310e.add(cls17);
        bVar.mo7344a();
        this.f113777c = C2756a.m7852a((AppCompatActivity) this).mo7332a();
        this.f113766E = (C45004a) this.f113777c.mo23372a(C45004a.class);
        this.f113782h = this.f113766E.mo91305K();
        this.f113785k = this.f113766E.mo91308N();
        this.f113766E.mo91325a((C45010ae) new C45121cp(this));
        this.f113780f.postDelayed(new C45122cq(this), 2000);
        this.f113766E.mo91362h().mo7352a(this, new C45123cr(this));
        this.f113766E.mo91366m().mo7349a(this, new C45124cs(this));
        this.f113766E.mo91363i().mo7349a(this, new C45125ct(this));
        this.f113767F = (C42451a) this.f113777c.mo23372a(C42451a.class);
        if (C43236a.m94873a(this.f113778d)) {
            this.f113774M = new C43268o(this, this.f113766E.mo91307M(), this.f113782h, new C43299y(this));
            C43268o oVar = this.f113774M;
            oVar.f109417f.mo87953a().observe(oVar.f109415d, new C43270b(oVar));
        }
        C50203g.m108358a("VideoRecordNewActivity => onCreate start");
        C43214dh.m94817a().f109295j = false;
        C45412b.m98979a().step("av_video_record_init", "onCreate");
        C45101d.m98616a((C45098a) new C52959d());
        C45101d.m98616a((C45098a) new C52962g(this));
        super.onCreate(bundle);
        C10703a.m21575a(true);
        if (getIntent().getIntExtra("translation_type", 0) == 3) {
            C23424c.m57556a(this, 3);
        }
        getWindow().addFlags(128);
        setContentView((int) R.layout.eu);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.f113773L = i;
        if (!C52944b.m112642a(this)) {
            C50203g.m108358a("RecordConditionCheck.check() false");
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
            return;
        }
        if (C39618d.f101151O.mo83117a(C40796a.EnableSdkLog)) {
            b = 15;
        } else {
            b = 7;
        }
        if (!TextUtils.isEmpty(null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C50792y.f127603a);
            sb.append(null);
            sb.append("-");
            C50792y.f127603a = sb.toString();
        }
        C50792y.f127604b = b;
        if (b == 1) {
            b2 = 1;
        } else if (b == 3) {
            b2 = 2;
        } else if (b == 7) {
            b2 = 4;
        } else if (b == 15) {
            b2 = 8;
        } else if (b != 31) {
            b2 = 0;
        } else {
            b2 = 16;
        }
        TELogcat.setLogLevel(b2);
        this.f113783i = (FrameLayout) findViewById(R.id.cfc);
        this.f113784j = (FrameLayout) findViewById(R.id.b_7);
        this.f113784j.addView(this.f113766E.mo91307M());
        m98240o();
        C45101d.m98616a((C45098a) new C52955b());
        ShortVideoContext shortVideoContext = this.f113778d;
        C52711k.m112240b(shortVideoContext, "shortVideoContext");
        if (C52711k.m112239a((Object) "push", (Object) shortVideoContext.f107132y)) {
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("shoot_way", shortVideoContext.f107132y).mo47829a("enter_from", shortVideoContext.f107132y).mo47829a("enter_method", "").mo47829a("prop_id", shortVideoContext.f107047Z).f61491a);
        }
        if (C52711k.m112239a((Object) "comment_reply", (Object) shortVideoContext.f107132y) && CommentUtils.isDataValid(shortVideoContext.f107125r)) {
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("shoot_way", shortVideoContext.f107132y).mo47829a("enter_method", shortVideoContext.f107125r.getEnterMethod()).mo47829a("reply_comment_id", shortVideoContext.f107125r.getCommentId()).mo47829a("reply_user_id", shortVideoContext.f107125r.getUserId()).f61491a);
        }
        C39618d.f101162c.mo74149a("SHOOT");
        getLifecycle().mo324a(AudioFocusManager.m98132a(this));
        this.f113797w = (FrameLayout) findViewById(R.id.b7w);
        FrameLayout frameLayout = this.f113797w;
        if (mo91201k() != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f113778d.f107058aJ || this.f113778d.f107056aH || this.f113778d.f107057aI || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        C52711k.m112240b(this, "context");
        C52711k.m112240b(frameLayout, "parent");
        if (z2) {
            C1028c cVar2 = new C1028c(this);
            C45173f.f114293a = true;
            cVar2.mo3205a(R.layout.go, frameLayout, new C45175b(this, frameLayout));
        }
        this.f113780f.post(new C45113ch(this));
        C43763r.m96182a(true);
        C50203g.m108358a("VideoRecordNewActivity => onCreate end");
        C47858ep.f120420a = true;
        C47858ep.f120421b = true;
        C47858ep.f120422c = true;
        C45101d.m98616a((C45098a) new C52960e());
        C45101d.m98616a((C45098a) new C45002b());
        C44986ar.m98332a(false);
        if (this.f113778d != null && TextUtils.equals(this.f113778d.f107132y, "upload_anchor")) {
            C49659a aVar = (C49659a) ApiCenter.m7844a((FragmentActivity) this).mo7341b(C49659a.class);
            if (aVar != null) {
                aVar.mo97561d();
            }
        }
        this.f113765D = new C45328x(this, this.f113766E);
        this.f113766E.mo91298D().mo7349a(this, new C2767k<C47064i>() {
            public final /* synthetic */ void onChanged(Object obj) {
                VideoRecordNewActivity.this.f113765D.onEvent((C47064i) obj);
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo91193a(boolean z, boolean z2) {
        int i;
        if (z) {
            SurfaceView surfaceView = this.f113785k;
            int i2 = this.f113778d.f107116i;
            int i3 = this.f113778d.f107117j;
            if (surfaceView != null) {
                Context context = surfaceView.getContext();
                int e = C43303dy.m94974e(context);
                int b = C43303dy.m94971b(context);
                LayoutParams layoutParams = new LayoutParams(-1, -1);
                if (e * 9 < b * 16 || i2 >= i3) {
                    layoutParams.width = b;
                    layoutParams.height = (i3 * b) / i2;
                    layoutParams.topMargin = (e - layoutParams.height) / 2;
                    if (layoutParams.topMargin >= 0) {
                        i = layoutParams.topMargin;
                    } else {
                        i = 0;
                    }
                    layoutParams.topMargin = i;
                    layoutParams.leftMargin = 0;
                } else {
                    layoutParams.width = (i2 * e) / i3;
                    layoutParams.height = e;
                    layoutParams.leftMargin = (b - layoutParams.width) / 2;
                    layoutParams.topMargin = 0;
                }
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(layoutParams.leftMargin);
                }
                surfaceView.setLayoutParams(layoutParams);
            }
            m98237d(false);
        }
        if (z2) {
            cb_();
            m98237d(true);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (mo91202l() && this.f113782h.f113587b != null && this.f113782h.f113587b.mo90995a(i, keyEvent)) {
            return true;
        }
        for (C23422a onKeyDown : this.f113769H) {
            if (onKeyDown.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f113794t == null) {
            if (getIntent().hasExtra("stitch_params")) {
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        } else if (!mo91199i().mo86391c()) {
            return true;
        } else {
            if (this.f113770I != null && this.f113770I.mo24327a()) {
                return true;
            }
            this.f113794t.mo86791d().mo86531a(new C47059f("back_key"));
            return true;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        for (C23423b a : this.f113779e) {
            if (a.mo48596a(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            if (this.f113778d == null || this.f113778d.f107054aF == null) {
                z = false;
            } else {
                z = true;
            }
            if (!(intent == null || intent.getExtras() == null || z)) {
                Intent intent2 = new Intent();
                intent2.setClass(this, C39618d.f101162c.mo74159e());
                intent2.addFlags(67108864);
                intent2.putExtras(intent.getExtras());
                startActivity(intent2);
            }
            finish();
        }
    }
}
