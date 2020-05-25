package com.p683ss.android.ugc.aweme.flowfeed.p1759h;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25723l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.widget.DragView.IViewInfo;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C30158b;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31757d;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31762b;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31764d;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31781d;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.flowfeed.viewmodel.FollowEnterDetailViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.main.C36546c;
import com.p683ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.newfollow.util.C37938f;
import com.p683ss.android.ugc.aweme.newfollow.util.C37942h;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23217av;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.player.C38850c;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39042b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.VideoPlayerProgressbar;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44586b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2234b.C44587a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p683ss.android.ugc.aweme.sticker.C46062l;
import com.p683ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.p */
public class C31805p extends C31782a implements C38871j, C44586b {

    /* renamed from: aA */
    protected ViewGroup f83096aA;

    /* renamed from: aB */
    VideoPlayerProgressbar f83097aB;

    /* renamed from: aC */
    ImageView f83098aC;

    /* renamed from: aD */
    protected ViewGroup f83099aD;

    /* renamed from: aE */
    ImageView f83100aE;

    /* renamed from: aF */
    ImageView f83101aF;

    /* renamed from: aG */
    ViewStub f83102aG;

    /* renamed from: aH */
    ViewGroup f83103aH;

    /* renamed from: aI */
    ViewGroup f83104aI;

    /* renamed from: aJ */
    ViewStub f83105aJ;

    /* renamed from: aK */
    View f83106aK;

    /* renamed from: aL */
    TextView f83107aL;

    /* renamed from: aM */
    TextView f83108aM;

    /* renamed from: aN */
    public C37937e f83109aN;

    /* renamed from: aO */
    protected C48021h f83110aO;

    /* renamed from: aP */
    public C31757d f83111aP;

    /* renamed from: aQ */
    protected boolean f83112aQ;

    /* renamed from: aR */
    public boolean f83113aR;

    /* renamed from: aS */
    protected boolean f83114aS;

    /* renamed from: aT */
    private RotateAnimation f83115aT;

    /* renamed from: aU */
    private C30178a f83116aU;

    /* renamed from: aV */
    private boolean f83117aV;

    /* renamed from: aW */
    private C44576a f83118aW;

    /* renamed from: aX */
    private final boolean f83119aX;

    /* renamed from: av */
    protected FrameLayout f83120av;

    /* renamed from: aw */
    protected KeepSurfaceTextureView f83121aw;

    /* renamed from: ax */
    public ImageView f83122ax;

    /* renamed from: ay */
    public TextView f83123ay;

    /* renamed from: az */
    MarqueeView f83124az;

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo64838W() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public String mo64842Z() {
        return null;
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    /* renamed from: a */
    public void mo64843a(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public String mo64844aa() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ab */
    public int mo64845ab() {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public String mo64846ad() {
        return "from_follow_page";
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
    }

    /* renamed from: a */
    public void mo53527a(String str) {
        if (m74048i(str)) {
            this.f83113aR = false;
            mo64809y();
            m74047f(0);
            mo64736A();
            this.f83116aU.f78757a = 2;
            C43893g gVar = new C43893g(11, this.f83109aN.mo77406c(), this.f83109aN.mo77407d());
            m74038a(gVar);
            mo77431ah();
            mo77432ai();
        }
    }

    /* renamed from: a */
    public void mo53526a(C50118g gVar) {
        String str = gVar.f125566a;
        if (m74048i(str)) {
            C31781d.m73922a().mo64691a(str);
            mo64809y();
            m74038a(new C43893g(5));
            mo77431ah();
            mo77432ai();
            if (TextUtils.equals(mo64771c(), "homepage_follow") && (mo64749N() instanceof FragmentActivity)) {
                FollowPageFirstFrameViewModel.m103062a((FragmentActivity) mo64749N());
            }
            C36546c.m82442a("video_play");
        }
    }

    /* renamed from: L */
    public void mo64747L() {
        super.mo64747L();
        mo64848c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo64769b() {
        return this.f83117aV;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo64781f() {
        if (this.f83026af) {
            mo64808x();
        }
    }

    /* renamed from: ag */
    private boolean mo77430ag() {
        this.f83109aN.f96594a = m74045al();
        this.f83109aN.mo77405b();
        return true;
    }

    /* renamed from: ai */
    private void mo77432ai() {
        C31842e D = mo64739D();
        if (D != null) {
            D.mo64943a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo64736A() {
        super.mo64736A();
        this.f83018Z.postDelayed(new Runnable() {
            public final void run() {
                if (C31805p.this.f83124az != null && C31805p.this.f83025ae) {
                    C31805p.this.f83124az.mo64085a();
                }
            }
        }, 100);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo64737B() {
        super.mo64737B();
        if (this.f83124az != null) {
            this.f83124az.mo64088c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo64738C() {
        super.mo64738C();
        if (this.f83124az != null) {
            this.f83124az.mo64087b();
        }
    }

    /* renamed from: E */
    public void mo64740E() {
        super.mo64740E();
        if (this.f83119aX) {
            C0013i.m16a((Callable<TResult>) new Callable<Object>() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x0050  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
                /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object call() throws java.lang.Exception {
                    /*
                        r7 = this;
                        com.ss.android.ugc.aweme.flowfeed.h.p r0 = com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f83048c
                        com.ss.android.ugc.aweme.flowfeed.h.p r1 = com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p.this
                        java.lang.String r1 = r1.f83011S
                        java.lang.String r2 = "show_compilation_entrance"
                        com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                        java.lang.String r4 = "enter_from"
                        com.ss.android.ugc.aweme.app.f.d r1 = r3.mo47829a(r4, r1)
                        java.lang.String r3 = "compilation_id"
                        r4 = 0
                        if (r0 == 0) goto L_0x0022
                        com.ss.android.ugc.aweme.feed.model.MixStruct r5 = r0.getMixInfo()
                        if (r5 == 0) goto L_0x0022
                        java.lang.String r5 = r5.mixId
                        goto L_0x0023
                    L_0x0022:
                        r5 = r4
                    L_0x0023:
                        com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r5)
                        java.lang.String r3 = "author_id"
                        if (r0 == 0) goto L_0x0030
                        java.lang.String r5 = r0.getAuthorUid()
                        goto L_0x0031
                    L_0x0030:
                        r5 = r4
                    L_0x0031:
                        com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r5)
                        java.lang.String r3 = "log_pb"
                        com.ss.android.ugc.aweme.feed.aa r5 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                        java.lang.String r6 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56857c(r0)
                        java.lang.String r5 = r5.mo60161a(r6)
                        com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r5)
                        java.lang.String r3 = "group_id"
                        if (r0 == 0) goto L_0x0050
                        java.lang.String r0 = r0.getAid()
                        goto L_0x0051
                    L_0x0050:
                        r0 = r4
                    L_0x0051:
                        com.ss.android.ugc.aweme.app.f.d r0 = r1.mo47829a(r3, r0)
                        java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                        com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r0)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31805p.C318072.call():java.lang.Object");
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo64748M() {
        super.mo64748M();
        if (!C32800a.m75679a(this.f83120av)) {
            mo64847ae();
        }
    }

    /* renamed from: R */
    public final void mo64833R() {
        this.f83118aW.mo90508a(this.f83048c);
        this.f83118aW.mo90512b();
    }

    /* renamed from: af */
    private void mo77429af() {
        if (this.f83106aK == null) {
            this.f83105aJ.setLayoutResource(R.layout.ba_);
            this.f83106aK = this.f83105aJ.inflate();
        }
    }

    /* renamed from: aj */
    private void m74043aj() {
        C31842e D = mo64739D();
        if (D != null && this.f83110aO != null) {
            D.mo64946a(this.f83112aQ, mo64771c(), this.f83029ai, this.f83031ak);
        }
    }

    /* renamed from: al */
    private C48021h m74045al() {
        if (this.f83110aO == null) {
            C31842e D = mo64739D();
            if (D == null || D.f83207h == null) {
                this.f83110aO = C37938f.m84829a().mo77414b();
            } else {
                this.f83110aO = D.f83207h;
            }
        }
        return this.f83110aO;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo64834S() {
        C50160i a = C50160i.m108259a(this.f83121aw);
        this.f83109aN = new C37937e(this.f83121aw, this, null);
        this.f83109aN.f96596c = true;
        a.mo97950a((C50161j) new C50161j() {
            public final void aD_() {
                if (C31805p.this.f83026af) {
                    C31805p.this.mo64808x();
                }
                C47718bf.m103291d(C31805p.this);
            }

            /* renamed from: b */
            public final void mo54505b(int i, int i2) {
                if (C31805p.this.f83048c.getVideo() != null) {
                    C37942h.m84841a(i, i2, C31805p.this.f83121aw, ((float) C31805p.this.f83048c.getVideo().getHeight()) / ((float) C31805p.this.f83048c.getVideo().getWidth()));
                    C31805p.this.mo64835T();
                }
            }

            /* renamed from: a */
            public final void mo54503a(int i, int i2) {
                C31805p.this.f83016X = false;
                C31805p.this.f83113aR = false;
                if (C31805p.this.mo64765a()) {
                    C31805p.this.f83017Y.mo64960a(C31805p.this.f83036ap);
                    C31805p.this.f83017Y.mo64964d();
                }
                if (C31805p.this.f83048c.getVideo() != null) {
                    C37942h.m84841a(i, i2, C31805p.this.f83121aw, ((float) C31805p.this.f83048c.getVideo().getHeight()) / ((float) C31805p.this.f83048c.getVideo().getWidth()));
                    C31805p.this.mo64835T();
                }
                C47718bf.m103290c(C31805p.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo64836U() {
        this.f83018Z.removeMessages(16);
        Message message = new Message();
        message.what = 16;
        message.obj = this.f83048c;
        this.f83018Z.sendMessageDelayed(message, 150);
    }

    /* renamed from: V */
    public void mo64837V() {
        if (this.f83048c != null) {
            this.f83018Z.removeMessages(16);
            if (this.f83026af || this.f83024ad.mo64654a()) {
                this.f83109aN.mo77408e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public boolean mo64839X() {
        if (!(mo64749N() instanceof FragmentActivity)) {
            return false;
        }
        return FollowEnterDetailViewModel.m74256a(mo64771c(), (FragmentActivity) mo64749N()).f83230a;
    }

    /* renamed from: ac */
    public final AbsInteractStickerWidget mo60212ac() {
        AbsInteractStickerWidget a = C31781d.m73922a().mo64683a();
        this.f83033am.mo48250a((int) R.id.auf, (Widget) a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo64805u() {
        super.mo64805u();
        if (this.f83096aA != null) {
            this.f83096aA.setOnClickListener(new C31812t(this));
        }
        if (this.f83123ay != null) {
            this.f83123ay.setOnClickListener(new C31813u(this));
        }
    }

    /* renamed from: G */
    public void mo64742G() {
        super.mo64742G();
        mo64837V();
        this.f83113aR = false;
        if (this.f83048c != null) {
            C31842e D = mo64739D();
            if (D != null) {
                D.f83201b = 0;
            }
        }
        if (C26503d.m64061d(this.f83048c)) {
            m74043aj();
        }
    }

    /* renamed from: J */
    public void mo64745J() {
        if (this.f83114aS) {
            this.f83114aS = false;
            return;
        }
        if (!mo64839X()) {
            super.mo64745J();
        }
        if (mo64744I()) {
            mo64737B();
            return;
        }
        this.f83113aR = true;
        mo64837V();
        C48107j.m104193f().mo95348b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo64778e() {
        if (this.f83048c.getVideo() != null) {
            mo64760a((View) this.f83120av, this.f83048c.getVideo().getWidth(), this.f83048c.getVideo().getHeight());
            m74037a(this.f83048c, this.f83120av.getLayoutParams().width, this.f83120av.getLayoutParams().height, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo64808x() {
        super.mo64808x();
        if (this.f83048c.getVideo() != null) {
            C23515d.m57670a(this.f83053h, this.f83048c.getVideo().getOriginCover(), this.f83053h.getWidth(), this.f83053h.getHeight());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo64810z() {
        if (VERSION.SDK_INT >= 21) {
            this.f83120av.setOutlineProvider(new C47856en(this.f83120av.getResources().getDimensionPixelOffset(R.dimen.zu)));
            this.f83120av.setClipToOutline(true);
        }
    }

    /* renamed from: ah */
    private void mo77431ah() {
        C31842e D = mo64739D();
        if (D != null) {
            D.mo64945a(mo64771c(), this.f83029ai, this.f83031ak, this.f83112aQ, this.f83014V);
            if (this.itemView.getContext() instanceof Activity) {
                Intent intent = ((Activity) this.itemView.getContext()).getIntent();
                if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                    String stringExtra = intent.getStringExtra("rule_id");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        new C23217av("video_play_from_push").mo48036s(stringExtra).mo48076e();
                    }
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo64835T() {
        if (this.f83121aw != null) {
            float[] fArr = new float[9];
            Matrix matrix = new Matrix();
            this.f83121aw.getTransform(matrix);
            matrix.getValues(fArr);
            m74037a(this.f83048c, (int) (((float) this.f83120av.getLayoutParams().width) * fArr[0]), (int) (((float) this.f83120av.getLayoutParams().height) * fArr[4]), (int) fArr[2], (int) fArr[5]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public void mo64841Y() {
        if (this.f83048c != null) {
            C23794bh.m58392f().mo65001b(this.f83048c, mo64771c());
            C30367g.m71282a().f79372a = m74045al();
            C31842e D = mo64739D();
            C30367g.m71282a().f79374c = D.f83205f;
            C30367g.m71282a().f79379h = true;
            if (D != null) {
                D.f83207h = null;
                this.f83109aN.f96594a = null;
                this.f83110aO = null;
            }
            C31213v.m72896a(this.f83052g.mo64671c(this.f83048c));
            this.f83114aS = true;
            mo64848c(true);
        }
    }

    /* renamed from: ak */
    private void m74044ak() {
        if (this.f83109aN.f96594a == null) {
            this.f83109aN.f96594a = m74045al();
        }
        if (!C31815w.m74105a(C11010c.m22280a())) {
            C10691a.m21542b(mo64749N(), (int) R.string.cg1).mo19066a();
        } else if (!this.f83016X && this.f83048c != null && this.f83048c.getVideo() != null) {
            if (this.f83116aU.f78757a == 2 || this.f83116aU.f78757a == 1) {
                C23794bh.m58392f().mo64997a(this.f83048c, mo64771c(), this.f83112aQ);
                mo64837V();
                if (mo64739D() != null) {
                    mo64739D().f83201b = 3;
                }
                return;
            }
            if ((this.f83116aU.f78757a == 3 || this.f83116aU.f78757a == 0) && this.f83048c.getVideo().getProperPlayAddr() != null) {
                C23794bh.m58392f().mo65000b(this.f83048c);
                this.f83048c.getVideo().setRationAndSourceId(this.f83048c.getAid());
                this.f83109aN.f96594a = m74045al();
                this.f83109aN.mo77410g();
                if (this.f83111aP != null) {
                    this.f83111aP.mo64623a(this.f83048c);
                }
                if (mo64739D() != null) {
                    mo64739D().f83201b = 4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public void mo64847ae() {
        float f;
        if (this.f83048c != null) {
            this.f83112aQ = true;
            C31842e D = mo64739D();
            if (D != null) {
                D.f83202c.mo95017a(16777216);
                D.f83201b = this.f83116aU.f78757a;
                D.f83203d = this.f83099aD.getLayoutParams().height;
                D.f83204e = this.f83099aD.getLayoutParams().width;
                D.f83207h = m74045al();
                if (this.f83109aN.f96594a == null) {
                    this.f83109aN.f96594a = m74045al();
                }
                int[] iArr = new int[2];
                this.f83121aw.getLocationOnScreen(iArr);
                if (this.f83048c == null || this.f83048c.getVideo() == null) {
                    f = ((float) this.f83121aw.getHeight()) / ((float) this.f83121aw.getWidth());
                } else {
                    f = ((float) this.f83048c.getVideo().getHeight()) / ((float) this.f83048c.getVideo().getWidth());
                }
                IViewInfo iViewInfo = new IViewInfo(iArr[0], iArr[1], this.f83121aw.getHeight(), this.f83121aw.getWidth(), (float) this.f83053h.getResources().getDimensionPixelOffset(R.dimen.zu), f);
                int i = this.f83116aU.f78757a;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            C31781d.m73922a().mo64684a(mo64749N(), iViewInfo, this.f83048c, 4, mo64771c(), D.f83208i, false, true);
                            return;
                        case 3:
                            break;
                        default:
                            C31781d.m73922a().mo64684a(mo64749N(), iViewInfo, this.f83048c, 2, mo64771c(), D.f83208i, false, true);
                            return;
                    }
                }
                C31781d.m73922a().mo64684a(mo64749N(), iViewInfo, this.f83048c, 3, mo64771c(), D.f83208i, false, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo64784g() {
        int i;
        Resources resources;
        MarqueeView marqueeView;
        Object[] objArr;
        String str;
        super.mo64784g();
        new C31811s(this);
        if (this.f83048c.getAuthor() != null) {
            C31781d.m73922a();
            this.f83048c.getAuthor().getStarBillboardRank();
            mo64771c();
        }
        if (this.f83048c.getMusic() == null || !this.f83048c.getMusic().isOriginMusic()) {
            this.f83123ay.setVisibility(8);
            this.f83122ax.setImageResource(R.drawable.dfb);
        } else {
            this.f83123ay.setVisibility(0);
            this.f83122ax.setImageResource(R.drawable.dgf);
        }
        Music music = this.f83048c.getMusic();
        if (music != null) {
            marqueeView = this.f83124az;
            resources = this.itemView.getResources();
            i = R.string.cer;
            objArr = new Object[2];
            objArr[0] = music.getMusicName();
            str = music.getAuthorName();
        } else {
            marqueeView = this.f83124az;
            resources = this.itemView.getResources();
            i = R.string.cep;
            objArr = new Object[2];
            objArr[0] = this.itemView.getResources().getString(R.string.ce5);
            if (this.f83048c.getAuthor() == null) {
                str = "";
            } else {
                str = this.f83048c.getAuthor().getNickname();
            }
        }
        objArr[1] = str;
        marqueeView.setText(resources.getString(i, objArr));
        this.f83097aB.setVisibility(8);
        if (this.f83108aM != null) {
            this.f83108aM.setVisibility(8);
        }
        if (C26503d.m64061d(this.f83048c) && !TextUtils.isEmpty(this.f83048c.getAwemeRawAd().getTopTitle())) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.cuj);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.ba9);
                mo64758a(viewStub.inflate(), 4.0f, 13.0f);
            }
            this.f83108aM = (TextView) this.itemView.findViewById(R.id.dhu);
            if (this.f83108aM != null) {
                this.f83108aM.setText(this.f83048c.getAwemeRawAd().getTopTitle());
                this.f83108aM.setVisibility(0);
            }
        }
        C23794bh.m58395i().mo76330a(mo64749N(), this.f83048c, this.f83104aI, this.f83107aL, mo64771c(), mo64845ab());
        if (this.f83048c.isHotListAweme() && this.f83105aJ != null) {
            mo77429af();
            C31781d.m73922a().mo64692b(this.f83106aK, this.f83011S, true, this.f83048c);
        } else if (!this.f83048c.isHotSearchAweme() || this.f83105aJ == null) {
            if (this.f83106aK != null) {
                this.f83106aK.setVisibility(8);
            }
        } else {
            mo77429af();
            C31781d.m73922a().mo64688a(this.f83106aK, this.f83011S, true, this.f83048c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ void mo64851l(View view) {
        m74044ak();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ void mo64852m(View view) {
        m74044ak();
    }

    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
    }

    /* renamed from: a */
    private void m74038a(C43893g gVar) {
        this.f83097aB.mo91146a(gVar, (int) gVar.f111160a);
    }

    @C53771m
    public void onPauseFollowVideoEvent(C25723l lVar) {
        if (this.f83116aU.f78757a != 3) {
            mo64837V();
        }
    }

    /* renamed from: i */
    private boolean m74048i(String str) {
        if (this.f83048c == null || !TextUtils.equals(str, this.f83048c.getAid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        if (m74048i(dVar.f125523a)) {
            mo64738C();
            m74038a(new C43893g(1));
            m74047f(1);
        }
    }

    /* renamed from: b */
    public void mo64766b(int i) {
        super.mo64766b(i);
        switch (i) {
            case 0:
            case 1:
                mo64836U();
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public void mo53533c(String str) {
        if (m74048i(str)) {
            m74038a(new C43893g(7));
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        if (m74048i(str)) {
            m74047f(2);
            this.f83116aU.f78757a = 1;
            m74038a(new C43893g(2));
        }
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
        if (message.what == 16) {
            mo64849d((Aweme) message.obj);
        }
    }

    /* renamed from: d */
    private void mo77433d(boolean z) {
        if (z) {
            if (this.f83098aC.getVisibility() != 0) {
                this.f83098aC.startAnimation(this.f83115aT);
                this.f83098aC.setVisibility(0);
            }
        } else if (this.f83098aC.getVisibility() != 8) {
            this.f83098aC.clearAnimation();
            this.f83098aC.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo64753a(int i) {
        super.mo64753a(i);
        switch (i) {
            case 0:
            case 1:
                this.f83018Z.removeMessages(16);
                Message message = new Message();
                message.what = 16;
                message.obj = this.f83048c;
                this.f83018Z.sendMessage(message);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        if (m74048i(str)) {
            if (this.f83116aU.f78757a != 3) {
                mo64738C();
                m74047f(1);
                this.f83116aU.f78757a = 3;
                m74038a(new C43893g(4));
            }
            if (!mo64744I() && !C26503d.m64061d(this.f83048c)) {
                m74043aj();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo64848c(boolean z) {
        if (mo64749N() instanceof FragmentActivity) {
            FollowEnterDetailViewModel.m74256a(mo64771c(), (FragmentActivity) mo64749N()).f83230a = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo64850h(String str) {
        if ("on_ear_phone_unplug".equals(str)) {
            if (m74045al().mo95257o()) {
                mo64837V();
                m74047f(1);
                C36546c.m82443a("play", mo64771c(), this.f83048c);
                return;
            }
            C36546c.m82443a("pause", mo64771c(), this.f83048c);
        }
    }

    @C53771m
    public void onFollowFeedDetailEvent(C31762b bVar) {
        if (mo64749N() != null && bVar.f82958b != null && bVar.f82958b.getAid().equals(this.f83048c.getAid())) {
            switch (bVar.f82957a) {
                case 1:
                    m74047f(bVar.f82959c);
                    return;
                case 2:
                    mo64754a(0);
                    break;
            }
        }
    }

    /* renamed from: f */
    private void m74047f(int i) {
        switch (i) {
            case 0:
                this.f83100aE.setVisibility(8);
                mo77433d(false);
                this.f83101aF.setVisibility(0);
                return;
            case 1:
                mo77433d(false);
                this.f83101aF.setVisibility(8);
                this.f83100aE.setVisibility(0);
                return;
            case 2:
                this.f83100aE.setVisibility(8);
                this.f83101aF.setVisibility(8);
                mo77433d(true);
                break;
            case 3:
                this.f83100aE.setVisibility(8);
                mo77433d(false);
                this.f83101aF.setVisibility(8);
                return;
        }
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        int i;
        m74038a(new C43893g(8, z, 0));
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        m74047f(i);
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        if (m74048i(str)) {
            m74038a(new C43893g(6));
            mo64754a(0);
            C23794bh.m58392f().mo64994a(this.f83048c, this.f83029ai, this.f83031ak, mo64771c());
            C47718bf.m103288a(new C39042b(C23198ae.m56861e(this.f83048c)));
        }
    }

    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        this.f83018Z.removeMessages(16);
        mo64837V();
        mo64737B();
        this.f83097aB.setVisibility(8);
        if (!(this.f83110aO == null || this.f83048c == null)) {
            C48107j.m104193f().mo95407b(this.f83048c);
        }
        mo64838W();
        if (this.f83026af) {
            mo64808x();
            if (this.f83110aO != null) {
                C37938f.m84829a().mo77413a(this.f83110aO);
                this.f83109aN.mo77401a();
                this.f83109aN.f96594a = null;
                this.f83110aO = null;
            }
        }
        mo64775d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64756a(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.cu2);
        viewStub.setLayoutResource(R.layout.ba1);
        mo64757a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.ctu);
        viewStub2.setLayoutResource(R.layout.ba0);
        mo64757a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.ctz);
        viewStub3.setLayoutResource(R.layout.b_r);
        mo64757a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.cud);
        viewStub4.setLayoutResource(R.layout.b_w);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.cty);
        viewStub5.setLayoutResource(R.layout.b_s);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.cts);
        viewStub6.setLayoutResource(R.layout.b_u);
        viewStub6.inflate();
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.cu0);
        viewStub7.setLayoutResource(R.layout.b_y);
        mo64757a(viewStub7.inflate(), 12.0f);
    }

    /* renamed from: d */
    public void mo64849d(Aweme aweme) {
        if (!C31815w.m74105a(C11010c.m22280a())) {
            m74047f(3);
            C10691a.m21542b(mo64749N(), (int) R.string.cg1).mo19066a();
        } else if (this.f83025ae && !this.f83016X && mo64765a() && this.f83024ad.mo64655b() && aweme != null && this.f83048c != null && TextUtils.equals(this.f83048c.getAid(), aweme.getAid())) {
            C31842e D = mo64739D();
            if (D == null) {
                this.f83116aU.f78757a = 4;
            } else if (!D.f83202c.mo95019c(16777216)) {
                if (D.f83201b == 3 && !C30367g.m71282a().f79376e) {
                    if (C10181b.m20511a().mo18172a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", 31744, false)) {
                        mo77430ag();
                        mo64837V();
                    }
                    m74047f(1);
                    this.f83116aU.f78757a = 3;
                    C43893g gVar = new C43893g(12, this.f83109aN.mo77406c(), this.f83109aN.mo77407d());
                    m74038a(gVar);
                    return;
                } else if (C30367g.m71282a().f79376e) {
                    C30367g.m71282a().f79376e = false;
                }
            } else {
                return;
            }
            mo77430ag();
            if (this.f83111aP != null) {
                this.f83111aP.mo64623a(this.f83048c);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64764a(FollowFeedLayout followFeedLayout) {
        super.mo64764a(followFeedLayout);
        this.f83120av = (FrameLayout) followFeedLayout.findViewById(R.id.b_i);
        this.f83121aw = (KeepSurfaceTextureView) followFeedLayout.findViewById(R.id.czh);
        this.f83122ax = (ImageView) followFeedLayout.findViewById(R.id.bo7);
        this.f83123ay = (TextView) followFeedLayout.findViewById(R.id.boc);
        this.f83124az = (MarqueeView) followFeedLayout.findViewById(R.id.bot);
        this.f83096aA = (ViewGroup) followFeedLayout.findViewById(R.id.b8h);
        this.f83097aB = (VideoPlayerProgressbar) followFeedLayout.findViewById(R.id.dpu);
        this.f83098aC = (ImageView) followFeedLayout.findViewById(R.id.b25);
        this.f83099aD = (ViewGroup) followFeedLayout.findViewById(R.id.b8g);
        this.f83100aE = (ImageView) followFeedLayout.findViewById(R.id.b37);
        this.f83101aF = (ImageView) followFeedLayout.findViewById(R.id.b2x);
        this.f83102aG = (ViewStub) followFeedLayout.findViewById(R.id.ctv);
        this.f83103aH = (ViewGroup) followFeedLayout.findViewById(R.id.auf);
        this.f83104aI = (ViewGroup) followFeedLayout.findViewById(R.id.bma);
        this.f83105aJ = (ViewStub) followFeedLayout.findViewById(R.id.cu3);
        this.f83107aL = (TextView) followFeedLayout.findViewById(R.id.bm8);
        if (this.f83100aE != null) {
            this.f83100aE.setOnClickListener(new C31809q(this));
        }
        if (this.f83101aF != null) {
            this.f83101aF.setOnClickListener(new C31810r(this));
        }
    }

    /* renamed from: a */
    public void mo53525a(C50117f fVar) {
        int i;
        if (!this.f83016X && m74048i(fVar.f125563a)) {
            C38850c.m86283a();
            m74047f(0);
            mo64736A();
            this.f83116aU.f78757a = 2;
            int i2 = this.f83012T;
            String str = fVar.f125563a;
            if (this.f83048c != null) {
                i = this.f83048c.getAwemeType();
            } else {
                i = 0;
            }
            C30158b.m70764a(i2, str, i, this.f83048c);
            C30158b.m70765a(this.f83048c);
            C47718bf.m103288a(new C31764d(this.f83048c));
            m74038a(new C43893g(0, fVar.f125565c));
        }
    }

    public C31805p(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar) {
        this(followFeedLayout, bVar, jVar, aVar, false);
    }

    /* renamed from: a */
    public final void mo64762a(Aweme aweme, List<Comment> list, List<User> list2, C31758e eVar) {
        super.mo64762a(aweme, list, list2, eVar);
        this.f83109aN.mo77404a(aweme);
        this.f83109aN.f96595b = mo64771c();
        this.f83116aU.f78757a = 0;
        this.f83112aQ = false;
        LayoutParams layoutParams = this.f83099aD.getLayoutParams();
        layoutParams.width = (int) (((float) this.f83120av.getLayoutParams().width) * 0.6f);
        this.f83099aD.setLayoutParams(layoutParams);
        this.f83118aW.mo90508a(this.f83048c);
        this.f83118aW.mo90514d();
        mo64833R();
        mo77433d(false);
        this.f83101aF.setVisibility(8);
        this.f83100aE.setVisibility(0);
    }

    public C31805p(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f83116aU = new C30178a();
        this.f83119aX = C23794bh.m58395i().mo76332a();
        mo64834S();
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f83115aT = rotateAnimation;
        this.f83115aT.setRepeatCount(-1);
        this.f83115aT.setInterpolator(new LinearInterpolator());
        this.f83115aT.setDuration(1000);
        this.f83117aV = z;
        if (this.f83117aV) {
            this.f83003K.setDisplayType(true);
        }
        if (EarPhoneUnplugExperiment.m82548a()) {
            Activity g = C11016e.m22312g();
            if (g instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) g;
                HomePageDataViewModel.m75866a(fragmentActivity).f85654h.observe(fragmentActivity, new C31814v(this));
            }
        }
        this.f83118aW = new C44576a(this);
    }

    /* renamed from: a */
    private void m74037a(Aweme aweme, int i, int i2, int i3, int i4) {
        if (aweme != null) {
            C46062l lVar = new C46062l();
            lVar.mo92607b(this.f83048c.getAuthorUid()).mo92606a(mo64771c()).mo92608c(this.f83048c.getAid()).mo92609d(C29981aa.m70153a().mo60161a(this.f83048c.getRequestId()));
            this.f83118aW.mo90508a(aweme);
            this.f83118aW.f112784d = new C44587a(i, i2, i3, i4);
            this.f83118aW.f112785e = lVar;
            this.f83118aW.f112789i = false;
            this.f83118aW.mo90506a();
        }
    }
}
