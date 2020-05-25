package com.p683ss.android.ugc.aweme.effect;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0781c;
import android.support.p030v4.p038f.C0794k;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a.C29127a;
import com.p683ss.android.ugc.aweme.effect.p1673c.C29163a;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a;
import com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29165b;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29200c;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29201d;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43855fx;
import com.p683ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43765s;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45617m;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView.C45564a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C46784a;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.tools.C50179a.C50180a;
import com.p683ss.android.ugc.tools.view.p2508a.C50206a;
import com.p683ss.android.ugc.tools.view.p2508a.C50207b;
import com.p683ss.android.ugc.tools.view.widget.AVStatusView;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o.C50747h;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.C52906ab;
import dmt.p2652av.video.C53026u;
import dmt.p2652av.video.C53030y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2629a.C52575l;

/* renamed from: com.ss.android.ugc.aweme.effect.ad */
public class C29094ad {

    /* renamed from: a */
    public static final String f76264a = "ad";

    /* renamed from: A */
    C29101a f76265A;

    /* renamed from: B */
    View f76266B;

    /* renamed from: C */
    public C29216u f76267C;

    /* renamed from: D */
    boolean f76268D;

    /* renamed from: E */
    public FragmentActivity f76269E;

    /* renamed from: F */
    public EffectPointModel f76270F;

    /* renamed from: G */
    C52906ab f76271G;

    /* renamed from: H */
    public C29163a f76272H = new C29163a();

    /* renamed from: I */
    public String f76273I;

    /* renamed from: J */
    ArrayList<EffectPointModel> f76274J;

    /* renamed from: K */
    ArrayList<EffectPointModel> f76275K;

    /* renamed from: L */
    int f76276L = -1;

    /* renamed from: M */
    C0198r<Bitmap> f76277M;

    /* renamed from: N */
    C0198r<Boolean> f76278N;

    /* renamed from: O */
    public SafeHandler f76279O;

    /* renamed from: P */
    protected EditEffectVideoModel f76280P;

    /* renamed from: Q */
    public C29200c f76281Q;

    /* renamed from: R */
    C50207b f76282R;

    /* renamed from: S */
    C50206a f76283S = new C29103ae(this);

    /* renamed from: T */
    public Runnable f76284T = new Runnable() {
        public final void run() {
            if (C29094ad.this.f76313t != null) {
                C29094ad.this.mo58941a((int) C29094ad.this.f76314u.mo58932d());
                C29094ad.this.f76279O.postDelayed(C29094ad.this.f76284T, 0);
            }
        }
    };

    /* renamed from: U */
    private C43765s f76285U;

    /* renamed from: V */
    private LinearLayout f76286V;

    /* renamed from: W */
    private ImageView f76287W;

    /* renamed from: X */
    private RelativeLayout f76288X;

    /* renamed from: Y */
    private LinearLayout f76289Y;

    /* renamed from: Z */
    private AVStatusView f76290Z;

    /* renamed from: aa */
    private AVDmtTabLayout f76291aa;

    /* renamed from: ab */
    private EffectPointModel f76292ab;

    /* renamed from: ac */
    private C29201d f76293ac;

    /* renamed from: ad */
    private C0997e f76294ad;

    /* renamed from: b */
    public VideoPublishEditModel f76295b;

    /* renamed from: c */
    C0198r<C53026u> f76296c;

    /* renamed from: d */
    public C0198r<C53030y> f76297d;

    /* renamed from: e */
    C0198r<C52906ab> f76298e;

    /* renamed from: f */
    C0198r<Boolean> f76299f;

    /* renamed from: g */
    public SafeHandler f76300g;

    /* renamed from: h */
    C0184k f76301h;

    /* renamed from: i */
    public VEEffectSeekLayout f76302i;

    /* renamed from: j */
    FrameLayout f76303j;

    /* renamed from: k */
    RelativeLayout f76304k;

    /* renamed from: l */
    TextView f76305l;

    /* renamed from: m */
    TextView f76306m;

    /* renamed from: n */
    TextView f76307n;

    /* renamed from: o */
    public NoScrollViewPager f76308o;

    /* renamed from: p */
    ChooseVideoCoverView f76309p;

    /* renamed from: q */
    VideoEditView f76310q;

    /* renamed from: r */
    CutMultiVideoViewModel f76311r;

    /* renamed from: s */
    C42542c f76312s;

    /* renamed from: t */
    public C20347c f76313t;

    /* renamed from: u */
    public C29087a f76314u;

    /* renamed from: v */
    C45617m f76315v;

    /* renamed from: w */
    C50711k f76316w;

    /* renamed from: x */
    public int f76317x;

    /* renamed from: y */
    public int f76318y;

    /* renamed from: z */
    C29102b f76319z;

    /* renamed from: com.ss.android.ugc.aweme.effect.ad$a */
    class C29101a implements Runnable {
        public final void run() {
            C29094ad.this.mo58941a((int) C29094ad.this.f76314u.mo58932d());
            if (!C29094ad.this.mo58960c()) {
                C29094ad.this.f76300g.postDelayed(this, 0);
            }
        }

        C29101a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.ad$b */
    class C29102b implements Runnable {

        /* renamed from: a */
        int f76329a;

        public final void run() {
            long d = C29094ad.this.f76314u.mo58932d();
            VEEffectSeekLayout vEEffectSeekLayout = C29094ad.this.f76302i;
            int i = this.f76329a;
            int i2 = (int) d;
            if (!vEEffectSeekLayout.f76239c.isEmpty()) {
                EffectPointModel a = vEEffectSeekLayout.mo58910a(i);
                if (a != null) {
                    a.setUiEndPoint(i2);
                }
                vEEffectSeekLayout.f76237a.postInvalidate();
            }
            vEEffectSeekLayout.mo58917c(i2);
            C29094ad.this.f76300g.post(this);
        }

        C29102b(int i) {
            this.f76329a = i;
        }
    }

    /* renamed from: a */
    public final boolean mo58952a() {
        return !this.f76295b.isStitchMode() && !this.f76295b.isMvThemeVideoType();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58947a(C53026u uVar) {
        if (uVar != null) {
            long j = uVar.f131488b;
            if (uVar.f131492f == 0) {
                try {
                    this.f76302i.mo58912a(uVar.f131487a[0], uVar.f131490d, uVar.f131494h, uVar.f131493g);
                } catch (NullPointerException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.getMessage());
                    sb.append(" ");
                    sb.append(uVar.toString());
                    throw new NullPointerException(sb.toString());
                }
            } else if (uVar.f131492f == 5) {
                m68549a(C29164a.m68669a(uVar.f131490d, uVar.f131491e), true, true);
            } else if (uVar.f131492f == 7) {
                this.f76310q.mo87547a(false, true, null);
            } else if (uVar.f131492f == 8) {
                m68557h(false);
                m68556g(true);
                m68547a((int) uVar.f131490d, (int) uVar.f131491e);
                this.f76310q.mo87547a(false, true, (C0781c<Void>) new C29143bc<Void>(this, uVar, j));
            } else {
                ArrayList effectPointModels = this.f76302i.getEffectPointModels();
                if (uVar.f131492f == 1) {
                    if (!effectPointModels.isEmpty()) {
                        EffectPointModel effectPointModel = (EffectPointModel) effectPointModels.get(effectPointModels.size() - 1);
                        VEEffectSeekLayout vEEffectSeekLayout = this.f76302i;
                        int index = effectPointModel.getIndex();
                        long j2 = uVar.f131491e;
                        EffectPointModel a = vEEffectSeekLayout.mo58910a(index);
                        if (a != null) {
                            a.setUiEndPoint((int) j2);
                            vEEffectSeekLayout.f76237a.postInvalidate();
                        }
                    }
                } else if (uVar.f131492f == 2) {
                    m68551c(uVar.f131487a[0]);
                } else if (uVar.f131492f == 3) {
                    if (this.f76297d != null) {
                        this.f76297d.setValue(C53030y.m112775b(0));
                    }
                    mo58941a((int) this.f76314u.mo58928a(0));
                    this.f76302i.f76239c.clear();
                } else {
                    if (uVar.f131492f == 4 && this.f76275K != null) {
                        for (int length = uVar.f131487a.length - 1; length >= 0; length--) {
                            m68551c(uVar.f131487a[length]);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58946a(VEEffectSelectOp vEEffectSelectOp) {
        long j;
        C53026u uVar;
        if (vEEffectSelectOp != null) {
            switch (vEEffectSelectOp.mType) {
                case 1:
                    m68550b(vEEffectSelectOp.mTimePosition, false);
                    return;
                case 2:
                    EffectModel effectModel = vEEffectSelectOp.mEffectModel;
                    if (!this.f76314u.mo58930b()) {
                        C53026u a = C53026u.m112766a(effectModel.resDir, this.f76314u.mo58927a());
                        a.f131490d = this.f76314u.mo58932d();
                        a.f131494h = effectModel.color;
                        a.f131496j = effectModel.key;
                        a.f131497k = effectModel.name;
                        a.f131493g = this.f76314u.mo58931c();
                        a.f131499m = effectModel.category;
                        a.f131498l = effectModel.duration;
                        a.f131500n = effectModel.extra;
                        this.f76296c.setValue(a);
                        mo58972l();
                        long j2 = a.f131490d + ((long) effectModel.duration);
                        C53026u a2 = C53026u.m112765a((long) this.f76313t.mo43088s((int) j2));
                        a2.f131491e = j2;
                        a2.f131493g = this.f76314u.mo58931c();
                        this.f76296c.setValue(a2);
                        C47702b.f120193a.mo94984a("effect_click", C42438az.m93209a().mo86526a("creation_id", this.f76295b.creationId).mo86523a("scene_id", (int) BaseNotice.COMMENT_REPLY_WITH_VIDEO).mo86526a("shoot_way", this.f76295b.mShootWay).mo86523a("draft_id", this.f76295b.draftId).mo86526a("tab_name", this.f76273I).mo86526a("effect_name", effectModel.name).mo86526a("effect_id", effectModel.key).f107329a);
                    }
                    return;
                case 3:
                    int i = vEEffectSelectOp.action;
                    EffectModel effectModel2 = vEEffectSelectOp.mEffectModel;
                    if (i == 0) {
                        if (this.f76313t != null) {
                            if (!this.f76314u.mo58930b()) {
                                C53026u a3 = C53026u.m112766a(effectModel2.resDir, this.f76314u.mo58927a());
                                a3.f131490d = this.f76314u.mo58932d();
                                a3.f131494h = effectModel2.color;
                                a3.f131496j = effectModel2.key;
                                a3.f131497k = effectModel2.name;
                                a3.f131493g = this.f76314u.mo58931c();
                                a3.f131499m = effectModel2.category;
                                a3.f131500n = effectModel2.extra;
                                this.f76296c.setValue(a3);
                                mo58972l();
                                C47702b.f120193a.mo94984a("effect_click", C42438az.m93209a().mo86526a("creation_id", this.f76295b.creationId).mo86523a("scene_id", (int) BaseNotice.COMMENT_REPLY_WITH_VIDEO).mo86526a("shoot_way", this.f76295b.mShootWay).mo86523a("draft_id", this.f76295b.draftId).mo86526a("tab_name", this.f76273I).mo86526a("effect_name", effectModel2.name).mo86526a("effect_id", effectModel2.key).f107329a);
                                break;
                            }
                        } else {
                            C39629l.m88232a().mo58567E().mo49425a("VEEffectHelper selectFilterEffect mVEEditor is null");
                            break;
                        }
                    } else if (i == 1) {
                        C53026u uVar2 = (C53026u) this.f76296c.getValue();
                        if (uVar2 != null && uVar2.f131492f == 0) {
                            C53026u a4 = C53026u.m112765a(this.f76314u.mo58927a());
                            a4.f131491e = this.f76314u.mo58932d();
                            a4.f131493g = this.f76314u.mo58931c();
                            this.f76296c.setValue(a4);
                            mo58973m();
                        }
                    }
                    return;
                case 4:
                    EffectModel effectModel3 = vEEffectSelectOp.mEffectModel;
                    EffectPointModel effectPointModel = vEEffectSelectOp.mPreviousModel;
                    this.f76297d.setValue(C53030y.m112775b(0));
                    VideoEditViewModel videoEditViewModel = this.f76310q.getVideoEditViewModel();
                    if (videoEditViewModel == null || C9376b.m18558a((Collection<T>) videoEditViewModel.mo87633k()) || videoEditViewModel.mo87633k().size() != 1) {
                        j = (long) this.f76313t.mo42966A();
                    } else {
                        j = ((VideoSegment) videoEditViewModel.mo87633k().get(0)).f107904c;
                    }
                    long a5 = this.f76314u.mo58928a(j);
                    if (effectPointModel == null) {
                        String str = effectModel3.resDir;
                        uVar = new C53026u();
                        uVar.f131492f = 5;
                        uVar.f131495i = str;
                        uVar.f131488b = 0;
                        uVar.f131489c = a5;
                    } else {
                        String str2 = effectModel3.resDir;
                        int index = effectPointModel.getIndex();
                        C53026u uVar3 = new C53026u();
                        uVar3.f131492f = 8;
                        uVar3.f131495i = str2;
                        uVar3.f131488b = 0;
                        uVar3.f131489c = a5;
                        uVar3.f131487a = new int[]{index};
                        uVar = uVar3;
                    }
                    uVar.f131490d = 0;
                    uVar.f131491e = j;
                    uVar.f131494h = effectModel3.color;
                    uVar.f131496j = effectModel3.key;
                    uVar.f131497k = effectModel3.name;
                    uVar.f131493g = this.f76314u.mo58931c();
                    uVar.f131499m = effectModel3.category;
                    uVar.f131500n = effectModel3.extra;
                    this.f76296c.setValue(uVar);
                    mo58972l();
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58948a(Void voidR) {
        if (this.f76268D) {
            C0794k playBoundary = this.f76310q.getPlayBoundary();
            Long l = (Long) playBoundary.f2711a;
            Long l2 = (Long) playBoundary.f2712b;
            if (!(l == null || l2 == null)) {
                this.f76297d.setValue(C53030y.m112775b(this.f76314u.mo58928a((long) l.intValue())));
                m68548a((long) l.intValue(), (long) l2.intValue(), false);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo58953a(List<EffectCategoryResponse> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!mo58952a()) {
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    if (list.get(i) != null && C29207l.m68793b(((EffectCategoryResponse) list.get(i)).getKey())) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                list.remove(i);
            }
            return false;
        }
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.setName(this.f76269E.getString(R.string.dvl));
        list.add(effectCategoryResponse);
        return true;
    }

    /* renamed from: a */
    public final void mo58951a(boolean z, List<EffectCategoryResponse> list) {
        if (z && list != null && list.size() == 1 && this.f76294ad != null) {
            this.f76294ad.onPageSelected(0);
        }
    }

    /* renamed from: a */
    public final void mo58950a(boolean z) {
        if (z) {
            this.f76289Y.setVisibility(0);
            this.f76286V.setVisibility(8);
            if (this.f76290Z != null) {
                this.f76290Z.mo98095b();
            }
        } else {
            if (this.f76290Z != null) {
                this.f76290Z.mo98093a();
            }
            this.f76289Y.setVisibility(8);
            this.f76286V.setVisibility(0);
        }
    }

    /* renamed from: u */
    private void m68560u() {
        mo58941a((int) this.f76314u.mo58932d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo58954b() {
        this.f76319z = null;
        this.f76265A = null;
        this.f76300g.removeCallbacksAndMessages(null);
        this.f76279O.removeCallbacksAndMessages(null);
    }

    /* renamed from: e */
    public final void mo58963e() {
        this.f76300g.removeCallbacksAndMessages(null);
    }

    /* renamed from: m */
    public final void mo58973m() {
        this.f76297d.setValue(C53030y.m112774b());
        mo58974n();
    }

    /* renamed from: q */
    public final void mo58977q() {
        this.f76280P.mo58845c().setValue(Boolean.valueOf(false));
    }

    /* renamed from: t */
    private void m68559t() {
        this.f76280P.mo58847e().setValue(Float.valueOf(this.f76310q.getSelectedTime()));
        m68555f(true);
    }

    /* renamed from: g */
    public final void mo58967g() {
        mo58941a(0);
        int A = this.f76313t.mo42966A();
        this.f76302i.setVideoDuration(A);
        this.f76310q.mo87542a(A);
        this.f76272H.mo59037a(A);
    }

    /* renamed from: h */
    public final void mo58968h() {
        this.f76285U.mo59019a().mo20a((C0011g<TResult, TContinuationResult>) new C29105ag<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo58969i() {
        if (this.f76288X.getHeight() == 0) {
            return (int) C9432q.m18687b((Context) this.f76269E, 52.0f);
        }
        return this.f76288X.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo58970j() {
        if (this.f76303j.getHeight() == 0) {
            return (int) C9432q.m18687b((Context) this.f76269E, 247.0f);
        }
        return this.f76303j.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo58972l() {
        this.f76297d.setValue(C53030y.m112772a());
        C29218v.m68808a((View) this.f76287W, false, (View) null, false, false);
        if (this.f76287W != null) {
            this.f76287W.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo58974n() {
        C29218v.m68808a((View) this.f76287W, true, (View) null, false, false);
        if (this.f76287W != null) {
            this.f76287W.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public int mo58978r() {
        return (((C43303dy.m94974e(this.f76269E) - mo58969i()) - mo58970j()) - C43303dy.m94972c(this.f76269E)) - C43303dy.m94973d(this.f76269E);
    }

    /* renamed from: s */
    public final void mo58979s() {
        m68550b(0, true);
        C53026u uVar = new C53026u();
        uVar.f131492f = 9;
        this.f76296c.setValue(uVar);
        this.f76310q.mo87547a(false, false, null);
    }

    /* renamed from: d */
    public final void mo58961d() {
        if (this.f76319z != null) {
            this.f76300g.post(this.f76319z);
        }
        if (this.f76265A != null) {
            this.f76300g.post(this.f76265A);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo58975o() {
        this.f76275K = new ArrayList<>(this.f76274J);
        if (this.f76270F != null) {
            this.f76292ab = this.f76270F.clone();
        }
        if (this.f76298e.getValue() != null) {
            this.f76271G = ((C52906ab) this.f76298e.getValue()).clone();
        }
    }

    /* renamed from: p */
    public final void mo58976p() {
        this.f76280P.mo58845c().setValue(Boolean.valueOf(true));
        if (this.f76295b.isMultiVideoEdit() && (this.f76267C.f76523a instanceof C29233z)) {
            mo58968h();
        }
    }

    /* renamed from: f */
    public final void mo58965f() {
        if (!(this.f76313t == null || this.f76316w == null)) {
            this.f76313t.mo43048c(this.f76316w);
        }
        if (this.f76309p.getAdapter() instanceof C45564a) {
            C45564a aVar = (C45564a) this.f76309p.getAdapter();
            if (aVar != null) {
                aVar.mo91860a();
            }
        }
        if (this.f76293ac != null) {
            this.f76293ac.mo59105a();
        }
        if (this.f76267C != null) {
            C29126a aVar2 = this.f76267C.f76524b;
            C29252f a = C29127a.m68628a();
            if (a != null) {
                a.destroy();
            }
            C29126a.f76355g = null;
            aVar2.f76357a.clear();
            aVar2.f76358b.clear();
            aVar2.f76359c.clear();
            aVar2.f76360d.set(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo58971k() {
        m68560u();
        if (this.f76276L == 1) {
            m68561v();
            this.f76281Q.mo59104n().setValue(Boolean.valueOf(false));
            m68558i(false);
        } else if (this.f76276L == 2 && (this.f76270F == null || !TextUtils.equals("1", this.f76270F.getKey()) || this.f76285U == null || this.f76285U.mo59020b())) {
            this.f76281Q.mo59104n().setValue(Boolean.valueOf(true));
            m68558i(true);
        }
    }

    /* renamed from: c */
    public final boolean mo58960c() {
        if (!this.f76268D) {
            return true;
        }
        if (!this.f76314u.mo58930b()) {
            return false;
        }
        this.f76297d.setValue(C53030y.m112775b(this.f76272H.mo59036a()));
        mo58941a((int) this.f76272H.f76422b);
        mo58973m();
        return true;
    }

    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m68561v() {
        /*
            r6 = this;
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r0 = r6.f76274J
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r1 = r6.f76275K
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 != 0) goto L_0x004b
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r1 = r6.f76275K
            if (r1 == 0) goto L_0x004b
            int r1 = r0.size()
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r3 = r6.f76275K
            int r3 = r3.size()
            if (r1 <= r3) goto L_0x004b
            int r1 = r0.size()
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r3 = r6.f76275K
            int r3 = r3.size()
            int r1 = r1 - r3
            int[] r1 = new int[r1]
            r3 = 0
        L_0x0029:
            int r4 = r1.length
            if (r3 >= r4) goto L_0x0042
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r4 = r6.f76275K
            int r4 = r4.size()
            int r4 = r4 + r3
            java.lang.Object r4 = r0.get(r4)
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = (com.p683ss.android.ugc.aweme.effect.EffectPointModel) r4
            int r4 = r4.getIndex()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0042:
            android.arch.lifecycle.r<dmt.av.video.u> r0 = r6.f76296c
            dmt.av.video.u r1 = dmt.p2652av.video.C53026u.m112767a(r1)
            r0.setValue(r1)
        L_0x004b:
            dmt.av.video.ab r0 = r6.f76271G
            if (r0 == 0) goto L_0x005b
            android.arch.lifecycle.r<dmt.av.video.ab> r0 = r6.f76298e
            dmt.av.video.ab r1 = r6.f76271G
            dmt.av.video.ab r1 = r1.clone()
            r0.setValue(r1)
            goto L_0x0064
        L_0x005b:
            android.arch.lifecycle.r<dmt.av.video.ab> r0 = r6.f76298e
            dmt.av.video.ab r1 = dmt.p2652av.video.C52906ab.m112590a()
            r0.setValue(r1)
        L_0x0064:
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r6.f76292ab
            r1 = 0
            if (r0 == 0) goto L_0x0072
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r6.f76292ab
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r0.clone()
            r6.f76270F = r0
            goto L_0x0074
        L_0x0072:
            r6.f76270F = r1
        L_0x0074:
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r6.f76270F
            boolean r0 = com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a.m68672a(r0)
            r6.m68552c(r0)
            java.lang.String r0 = "time_effect"
            java.lang.String r3 = r6.f76273I
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0123
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r6.f76302i
            r3 = 1
            r0.mo58914a(r3)
            dmt.av.video.ab r0 = r6.f76271G
            if (r0 == 0) goto L_0x0113
            android.arch.lifecycle.r<dmt.av.video.ab> r0 = r6.f76298e
            java.lang.Object r0 = r0.getValue()
            dmt.av.video.ab r0 = (dmt.p2652av.video.C52906ab) r0
            if (r0 != 0) goto L_0x009c
            return
        L_0x009c:
            java.lang.String r0 = r0.f131241a
            r4 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case 48: goto L_0x00c5;
                case 49: goto L_0x00bb;
                case 50: goto L_0x00b1;
                case 51: goto L_0x00a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x00cf
        L_0x00a7:
            java.lang.String r5 = "3"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00cf
            r0 = 2
            goto L_0x00d0
        L_0x00b1:
            java.lang.String r5 = "2"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00cf
            r0 = 1
            goto L_0x00d0
        L_0x00bb:
            java.lang.String r5 = "1"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00cf
            r0 = 0
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r5 = "0"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00cf
            r0 = 3
            goto L_0x00d0
        L_0x00cf:
            r0 = -1
        L_0x00d0:
            switch(r0) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00df;
                case 2: goto L_0x00df;
                case 3: goto L_0x00d4;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            goto L_0x010b
        L_0x00d4:
            r6.mo58958b(r2)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r6.f76302i
            int r2 = r6.f76318y
            r0.setOverlayColor(r2)
            goto L_0x010b
        L_0x00df:
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r6.f76302i
            int r1 = r6.f76318y
            r0.setOverlayColor(r1)
            r6.mo58958b(r3)
            r0 = 0
            dmt.av.video.y r1 = dmt.p2652av.video.C53030y.m112775b(r0)
            r6.mo58941a(r2)
            goto L_0x010b
        L_0x00f3:
            android.arch.lifecycle.r<java.lang.Boolean> r0 = r6.f76299f
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r4)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r6.f76302i
            r0.mo58911a(r2, r3)
            r6.mo58958b(r2)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r6.f76302i
            int r2 = r6.f76317x
            r0.setOverlayColor(r2)
        L_0x010b:
            if (r1 == 0) goto L_0x0112
            android.arch.lifecycle.r<dmt.av.video.y> r0 = r6.f76297d
            r0.setValue(r1)
        L_0x0112:
            return
        L_0x0113:
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r6.f76302i
            r0.mo58911a(r2, r3)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r6.f76302i
            int r1 = r6.f76318y
            r0.setOverlayColor(r1)
            r6.mo58958b(r2)
            return
        L_0x0123:
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r0 = r6.f76302i
            r0.mo58914a(r2)
            r6.mo58958b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effect.C29094ad.m68561v():void");
    }

    /* renamed from: c */
    private void m68552c(boolean z) {
        m68553d(z);
        m68554e(z);
    }

    /* renamed from: e */
    private void m68554e(boolean z) {
        this.f76310q.mo87555b(z);
    }

    /* renamed from: a */
    public final void mo58941a(int i) {
        mo58942a(i, false);
    }

    /* renamed from: b */
    public final void mo58958b(boolean z) {
        this.f76310q.mo87557c(z);
    }

    /* renamed from: g */
    private void m68556g(boolean z) {
        int i;
        VideoEditView videoEditView = this.f76310q;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        videoEditView.setVisibility(i);
    }

    /* renamed from: h */
    private void m68557h(boolean z) {
        int i;
        VEEffectSeekLayout vEEffectSeekLayout = this.f76302i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        vEEffectSeekLayout.setVisibility(i);
    }

    /* renamed from: d */
    private void m68553d(boolean z) {
        C45564a aVar;
        if (this.f76309p.getAdapter() instanceof C45564a) {
            aVar = (C45564a) this.f76309p.getAdapter();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.mo91861a(z);
        }
    }

    /* renamed from: b */
    public final void mo58955b(int i) {
        this.f76280P.mo58846d().setValue(Integer.valueOf(i));
    }

    /* renamed from: f */
    private void m68555f(boolean z) {
        if (z) {
            this.f76280P.mo58848f().setValue(C29165b.m68675a(this.f76310q.getSelectedTime()));
            return;
        }
        this.f76280P.mo58848f().setValue(C29165b.m68676b((float) this.f76313t.mo42966A()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo58956b(Void voidR) {
        if (this.f76268D) {
            Long l = (Long) this.f76310q.getPlayBoundary().f2711a;
            if (l != null) {
                this.f76297d.setValue(C53030y.m112773a(this.f76314u.mo58928a((long) l.intValue())));
                m68559t();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo58959c(Void voidR) {
        if (this.f76268D) {
            C0794k playBoundary = this.f76310q.getPlayBoundary();
            Long l = (Long) playBoundary.f2711a;
            Long l2 = (Long) playBoundary.f2712b;
            if (!(l == null || l2 == null)) {
                this.f76297d.setValue(C53030y.m112775b(this.f76314u.mo58928a((long) l.intValue())));
                m68548a((long) l.intValue(), (long) l2.intValue(), true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo58964e(Void voidR) {
        if (this.f76268D) {
            C0794k playBoundary = this.f76310q.getPlayBoundary();
            Long l = (Long) playBoundary.f2711a;
            Long l2 = (Long) playBoundary.f2712b;
            if (!(l == null || l2 == null)) {
                this.f76297d.setValue(C53030y.m112775b(this.f76314u.mo58928a((long) l.intValue())));
                m68548a((long) l.intValue(), (long) l2.intValue(), false);
            }
        }
    }

    /* renamed from: c */
    private void m68551c(int i) {
        ArrayList effectPointModels = this.f76302i.getEffectPointModels();
        if (!C9414h.m18630a(effectPointModels)) {
            C50747h g = this.f76313t.mo43063g();
            VEEffectSeekLayout vEEffectSeekLayout = this.f76302i;
            vEEffectSeekLayout.f76239c.remove(vEEffectSeekLayout.mo58910a(i));
            vEEffectSeekLayout.f76237a.postInvalidate();
            if (effectPointModels.isEmpty()) {
                this.f76297d.setValue(C53030y.m112775b(0));
                mo58941a((int) this.f76314u.mo58928a(0));
            } else {
                EffectPointModel effectPointModel = (EffectPointModel) effectPointModels.get(effectPointModels.size() - 1);
                int uiEndPoint = effectPointModel.getUiEndPoint();
                if (effectPointModel.isFromEnd() ^ this.f76314u.mo58931c()) {
                    uiEndPoint = this.f76313t.mo42966A() - uiEndPoint;
                }
                mo58941a(uiEndPoint);
                this.f76297d.setValue(C53030y.m112775b((long) uiEndPoint));
            }
            if (g == C50747h.STARTED) {
                mo58973m();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo58962d(Void voidR) {
        if (this.f76268D) {
            Long l = (Long) this.f76310q.getPlayBoundary().f2711a;
            if (l != null) {
                this.f76297d.setValue(C53030y.m112773a(this.f76314u.mo58928a((long) l.intValue())));
                m68559t();
            }
        }
    }

    /* renamed from: b */
    public final void mo58957b(List<EffectCategoryResponse> list) {
        if (list != null && !list.isEmpty()) {
            this.f76291aa.mo90692b();
            this.f76291aa.setMaxTabModeForCount(list.size());
            for (int i = 0; i < list.size(); i++) {
                AVDmtTabItemView a = C46784a.m101614a(this.f76269E);
                a.setText(((EffectCategoryResponse) list.get(i)).getName());
                int size = list.size();
                if (!C50180a.m108284a().f125724d) {
                    a.setLayoutParams(new LayoutParams((int) (((float) C9432q.m18670a(a.getContext())) / 4.5f), -2));
                } else if (i == 0) {
                    a.setPadding((int) C9432q.m18687b(a.getContext(), 6.0f), 0, 0, 0);
                } else if (i == size - 1) {
                    a.setPadding(0, 0, (int) C9432q.m18687b(a.getContext(), 6.0f), 0);
                }
                a.setTag(Integer.valueOf(i));
                a.setOnClickListener(new C29119au(this));
                this.f76291aa.mo90684a(this.f76291aa.mo90678a().mo90742a((View) a));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo58966f(Void voidR) {
        if (this.f76268D) {
            Long l = (Long) this.f76310q.getPlayBoundary().f2712b;
            if (l != null) {
                this.f76297d.setValue(C53030y.m112773a(this.f76314u.mo58928a((long) l.intValue())));
                m68559t();
            }
        }
    }

    /* renamed from: i */
    private void m68558i(boolean z) {
        if (z) {
            this.f76295b.mEffectList = new ArrayList<>(this.f76281Q.mo59098h());
            this.f76295b.mTimeEffect = this.f76270F;
            if (!(this.f76295b.mTimeEffect == null || !this.f76295b.mTimeEffect.getKey().equals("1") || this.f76281Q.mo59095e().getValue() == null)) {
                this.f76295b.getPreviewInfo().updateReverseVideoContent(this.f76285U.mo59021c(), this.f76285U.mo59023e(), this.f76285U.mo59022d());
            }
            if (this.f76295b.mTimeEffect != null) {
                this.f76295b.mEffectList.add(this.f76295b.mTimeEffect);
            }
            C42438az a = C42438az.m93209a().mo86526a("creation_id", this.f76295b.creationId).mo86526a("shoot_way", this.f76295b.mShootWay).mo86523a("draft_id", this.f76295b.draftId);
            if (this.f76295b.mEffectList != null) {
                StringBuilder sb = new StringBuilder();
                Iterator it = this.f76295b.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel effectPointModel = (EffectPointModel) it.next();
                    if (!TextUtils.isEmpty(effectPointModel.getName())) {
                        sb.append(effectPointModel.getName());
                        sb.append(",");
                    }
                }
                if (sb.length() > 0) {
                    a.mo86526a("effect_name", sb.substring(0, sb.length() - 1));
                }
            }
            C39629l.m88232a().mo58567E().mo49430a("effect_confirm", a.f107329a);
            return;
        }
        this.f76295b.mEffectList = new ArrayList<>(this.f76281Q.mo59098h());
        this.f76295b.mTimeEffect = this.f76270F;
        if (this.f76295b.mTimeEffect != null) {
            this.f76295b.mEffectList.add(this.f76295b.mTimeEffect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x02cf, code lost:
        if (r2.equals("1") != false) goto L_0x02d3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58944a(android.view.View r7) {
        /*
            r6 = this;
            r6.f76266B = r7
            android.view.View r7 = r6.f76266B
            r0 = 2132018764(0x7f14064c, float:1.9675844E38)
            android.view.View r7 = r7.findViewById(r0)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r7 = (com.p683ss.android.ugc.aweme.effect.VEEffectSeekLayout) r7
            r6.f76302i = r7
            android.view.View r7 = r6.f76266B
            r0 = 2132022621(0x7f14155d, float:1.9683667E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.f76286V = r7
            android.view.View r7 = r6.f76266B
            r0 = 2132018309(0x7f140485, float:1.967492E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.f76303j = r7
            android.view.View r7 = r6.f76266B
            r0 = 2132020158(0x7f140bbe, float:1.9678671E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f76287W = r7
            android.view.View r7 = r6.f76266B
            r0 = 2132022322(0x7f141432, float:1.968306E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r6.f76304k = r7
            android.view.View r7 = r6.f76266B
            r0 = 2132023785(0x7f1419e9, float:1.9686028E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f76305l = r7
            android.view.View r7 = r6.f76266B
            r0 = 2132018763(0x7f14064b, float:1.9675842E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r6.f76288X = r7
            android.view.View r7 = r6.f76266B
            r0 = 2132024540(0x7f141cdc, float:1.9687559E38)
            android.view.View r7 = r7.findViewById(r0)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            android.view.View r0 = r6.f76266B
            r1 = 2132020866(0x7f140e82, float:1.9680107E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.f76289Y = r0
            android.view.View r0 = r6.f76266B
            r1 = 2132020889(0x7f140e99, float:1.9680154E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.tools.view.widget.AVStatusView r0 = (com.p683ss.android.ugc.tools.view.widget.AVStatusView) r0
            r6.f76290Z = r0
            android.view.View r0 = r6.f76266B
            r1 = 2132024062(0x7f141afe, float:1.968659E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f76306m = r0
            android.view.View r0 = r6.f76266B
            r1 = 2132023679(0x7f14197f, float:1.9685813E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6.f76307n = r0
            android.view.View r0 = r6.f76266B
            r1 = 2132024610(0x7f141d22, float:1.96877E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r0 = (com.p683ss.android.ugc.aweme.effect.NoScrollViewPager) r0
            r6.f76308o = r0
            android.view.View r0 = r6.f76266B
            r1 = 2132023227(0x7f1417bb, float:1.9684896E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = (com.p683ss.android.ugc.aweme.themechange.base.AVDmtTabLayout) r0
            r6.f76291aa = r0
            android.view.View r0 = r6.f76266B
            r1 = 2132018037(0x7f140375, float:1.967437E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView r0 = (com.p683ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView) r0
            r6.f76309p = r0
            android.view.View r0 = r6.f76266B
            r1 = 2132024488(0x7f141ca8, float:1.9687454E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView r0 = (com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView) r0
            r6.f76310q = r0
            android.view.View r0 = r6.f76266B
            android.view.View$OnTouchListener r1 = com.p683ss.android.ugc.aweme.effect.C29104af.f76332a
            r0.setOnTouchListener(r1)
            com.ss.android.ugc.aweme.effect.ad$1 r0 = new com.ss.android.ugc.aweme.effect.ad$1
            r0.<init>()
            android.widget.ImageView r1 = r6.f76287W
            r1.setOnClickListener(r0)
            r7.setOnClickListener(r0)
            android.widget.TextView r7 = r6.f76307n
            r7.setOnClickListener(r0)
            android.widget.TextView r7 = r6.f76306m
            r7.setOnClickListener(r0)
            android.support.v4.app.FragmentActivity r7 = r6.f76269E
            r0 = 2131820609(0x7f110041, float:1.9273938E38)
            int r7 = android.support.p030v4.content.C0726c.m2098c(r7, r0)
            r0 = 204(0xcc, float:2.86E-43)
            int r7 = android.support.p030v4.graphics.C0803a.m2298b(r7, r0)
            r6.f76317x = r7
            android.support.v4.app.FragmentActivity r7 = r6.f76269E
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {2131361934, 2131361935, 2131362080, 2131362329, 2131362358, 2131362531, 2131362655, 2131362889, 2131362890} // fill-array
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r0)
            r0 = 0
            r6.f76318y = r0
            r7.recycle()
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r7 = r6.f76302i
            com.ss.android.ugc.asve.c.c r1 = r6.f76313t
            int r1 = r1.mo42966A()
            r7.setVideoDuration(r1)
            r6.mo58941a(r0)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r7 = r6.f76302i
            r7.setNormalColor(r0)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r7 = r6.f76302i
            int r1 = r6.f76317x
            r7.setOverlayColor(r1)
            com.ss.android.ugc.tools.view.widget.AVStatusView r7 = r6.f76290Z
            r1 = 1
            if (r7 == 0) goto L_0x0140
            com.ss.android.ugc.tools.view.widget.AVStatusView r7 = r6.f76290Z
            android.support.v4.app.FragmentActivity r2 = r6.f76269E
            com.ss.android.ugc.tools.view.widget.AVStatusView$a r2 = com.p683ss.android.ugc.tools.view.widget.AVStatusView.C50243a.m108469a(r2)
            com.ss.android.ugc.tools.view.widget.AVStatusView$a r2 = r2.mo98106b(r1)
            r7.setBuilder(r2)
        L_0x0140:
            com.ss.android.ugc.aweme.effect.u r7 = new com.ss.android.ugc.aweme.effect.u
            android.support.v4.app.FragmentActivity r2 = r6.f76269E
            android.support.v4.app.k r2 = r2.getSupportFragmentManager()
            android.support.v4.app.FragmentActivity r3 = r6.f76269E
            r7.<init>(r2, r3)
            r6.f76267C = r7
            com.ss.android.ugc.aweme.effect.u r7 = r6.f76267C
            boolean r2 = r6.mo58952a()
            r2 = r2 ^ r1
            r7.f76525c = r2
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r7 = r6.f76308o
            r7.setOffscreenPageLimit(r1)
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r7 = r6.f76308o
            r7.setNoScroll(r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r7 = r6.f76291aa
            com.ss.android.ugc.tools.a r2 = com.p683ss.android.ugc.tools.C50179a.C50180a.m108284a()
            int r2 = r2.f125725e
            r7.setTabMargin(r2)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r7 = r6.f76291aa
            r7.setDefaultAddTab(r0)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r7 = r6.f76291aa
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r2 = r6.f76308o
            r7.setupWithViewPager(r2)
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r7 = r6.f76308o
            r7.clearOnPageChangeListeners()
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r7 = r6.f76308o
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r3 = r6.f76291aa
            r2.<init>(r3)
            r7.addOnPageChangeListener(r2)
            com.ss.android.ugc.aweme.effect.ad$2 r7 = new com.ss.android.ugc.aweme.effect.ad$2
            r7.<init>()
            r6.f76294ad = r7
            com.ss.android.ugc.aweme.effect.NoScrollViewPager r7 = r6.f76308o
            android.support.v4.view.ViewPager$e r2 = r6.f76294ad
            r7.addOnPageChangeListener(r2)
            android.app.Application r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88233b()
            java.lang.Class<com.ss.android.ugc.aweme.effect.c> r2 = com.p683ss.android.ugc.aweme.effect.C29162c.class
            java.lang.Object r7 = com.p683ss.android.ugc.aweme.common.p1595g.C26888e.m65000a(r7, r2)
            com.ss.android.ugc.aweme.effect.c r7 = (com.p683ss.android.ugc.aweme.effect.C29162c) r7
            com.ss.android.ugc.aweme.port.in.u r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.q r2 = r2.mo58588s()
            int r2 = r2.mo74162h()
            r3 = -1
            int r4 = r7.mo48491a(r3)
            if (r2 == r4) goto L_0x01ca
            r7.mo48492b(r2)
            com.ss.android.ugc.aweme.port.in.u r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.filter.c.a r7 = r7.mo58584o()
            r7.mo64331a()
            java.util.concurrent.Callable r7 = com.p683ss.android.ugc.aweme.effect.C29208m.f76514a
            p001a.C0013i.m16a(r7)
        L_0x01ca:
            r6.mo58950a(r1)
            com.ss.android.ugc.aweme.effect.f.d r7 = r6.f76293ac
            if (r7 != 0) goto L_0x01df
            com.ss.android.ugc.aweme.port.in.u r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.effect.f.b r7 = r7.mo58576g()
            com.ss.android.ugc.aweme.effect.f.d r7 = r7.mo59090b()
            r6.f76293ac = r7
        L_0x01df:
            com.ss.android.ugc.aweme.effect.f.d r7 = r6.f76293ac
            com.ss.android.ugc.aweme.effect.ad$6 r2 = new com.ss.android.ugc.aweme.effect.ad$6
            r2.<init>()
            r7.mo59106a(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.s r7 = r6.f76285U
            if (r7 != 0) goto L_0x0237
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r6.f76295b
            boolean r7 = r7.isFastImport
            if (r7 != 0) goto L_0x0223
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r6.f76295b
            boolean r7 = r7.isCutSameVideoType()
            if (r7 == 0) goto L_0x01fc
            goto L_0x0223
        L_0x01fc:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r6.f76295b
            boolean r7 = r7.isMultiVideoEdit()
            if (r7 == 0) goto L_0x0214
            com.ss.android.ugc.aweme.shortvideo.edit.p r7 = new com.ss.android.ugc.aweme.shortvideo.edit.p
            com.ss.android.ugc.asve.c.c r2 = r6.f76313t
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f76295b
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData r4 = r4.multiEditVideoRecordData
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r4 = r4.curMultiEditVideoRecordData
            r7.<init>(r2, r4)
            r6.f76285U = r7
            goto L_0x0237
        L_0x0214:
            com.ss.android.ugc.aweme.effect.bl r7 = new com.ss.android.ugc.aweme.effect.bl
            com.ss.android.ugc.asve.c.c r2 = r6.f76313t
            r7.<init>(r2)
            r6.f76285U = r7
            java.lang.String r7 = "generate reverse video ,using old api"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r7)
            goto L_0x0237
        L_0x0223:
            com.ss.android.ugc.aweme.shortvideo.edit.x r7 = new com.ss.android.ugc.aweme.shortvideo.edit.x
            com.ss.android.ugc.asve.c.c r2 = r6.f76313t
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r6.f76295b
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r4 = r4.getPreviewInfo()
            r7.<init>(r2, r4)
            r6.f76285U = r7
            java.lang.String r7 = "generate reverse video ,using new api"
            com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r7)
        L_0x0237:
            android.widget.ImageView r7 = r6.f76287W
            r7.setVisibility(r0)
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView r7 = r6.f76309p
            r7.mo91846a(r0)
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView r7 = r6.f76309p
            android.support.v7.widget.LinearLayoutManager r2 = new android.support.v7.widget.LinearLayoutManager
            android.support.v4.app.FragmentActivity r4 = r6.f76269E
            r2.<init>(r4, r0, r0)
            r7.setLayoutManager(r2)
            com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView r7 = r6.f76309p
            com.ss.android.ugc.aweme.effect.at r2 = new com.ss.android.ugc.aweme.effect.at
            r2.<init>(r6)
            r7.post(r2)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r7 = r6.f76302i
            com.ss.android.ugc.aweme.effect.ad$3 r2 = new com.ss.android.ugc.aweme.effect.ad$3
            r2.<init>()
            r7.setOnCursorSeekListener(r2)
            com.ss.android.ugc.aweme.effect.ad$4 r7 = new com.ss.android.ugc.aweme.effect.ad$4
            r7.<init>()
            r6.f76314u = r7
            com.ss.android.ugc.aweme.effect.f.c r7 = r6.f76281Q
            dmt.av.video.f r7 = r7.mo59099i()
            r6.f76296c = r7
            android.arch.lifecycle.r<dmt.av.video.u> r7 = r6.f76296c
            android.arch.lifecycle.k r2 = r6.f76301h
            com.ss.android.ugc.aweme.effect.aq r4 = new com.ss.android.ugc.aweme.effect.aq
            r4.<init>(r6)
            r7.observe(r2, r4)
            com.ss.android.ugc.aweme.effect.f.c r7 = r6.f76281Q
            android.arch.lifecycle.r r7 = r7.mo59097g()
            r6.f76299f = r7
            com.ss.android.ugc.aweme.effect.f.c r7 = r6.f76281Q
            android.arch.lifecycle.r r7 = r7.mo59100j()
            r6.f76297d = r7
            android.arch.lifecycle.r<dmt.av.video.y> r7 = r6.f76297d
            android.arch.lifecycle.k r2 = r6.f76301h
            com.ss.android.ugc.aweme.effect.bb r4 = new com.ss.android.ugc.aweme.effect.bb
            r4.<init>(r6)
            r7.observe(r2, r4)
            com.ss.android.ugc.aweme.effect.f.c r7 = r6.f76281Q
            dmt.av.video.h r7 = r7.mo59103m()
            r6.f76298e = r7
            android.arch.lifecycle.r<dmt.av.video.ab> r7 = r6.f76298e
            java.lang.Object r7 = r7.getValue()
            dmt.av.video.ab r7 = (dmt.p2652av.video.C52906ab) r7
            if (r7 == 0) goto L_0x0318
            java.lang.String r2 = r7.f131241a
            int r4 = r2.hashCode()
            r5 = 2
            switch(r4) {
                case 49: goto L_0x02c9;
                case 50: goto L_0x02bf;
                case 51: goto L_0x02b5;
                default: goto L_0x02b4;
            }
        L_0x02b4:
            goto L_0x02d2
        L_0x02b5:
            java.lang.String r0 = "3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02d2
            r0 = 2
            goto L_0x02d3
        L_0x02bf:
            java.lang.String r0 = "2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02d2
            r0 = 1
            goto L_0x02d3
        L_0x02c9:
            java.lang.String r4 = "1"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02d2
            goto L_0x02d3
        L_0x02d2:
            r0 = -1
        L_0x02d3:
            switch(r0) {
                case 0: goto L_0x02da;
                case 1: goto L_0x02d9;
                case 2: goto L_0x02d7;
                default: goto L_0x02d6;
            }
        L_0x02d6:
            goto L_0x0318
        L_0x02d7:
            r1 = 3
            goto L_0x02da
        L_0x02d9:
            r1 = 2
        L_0x02da:
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = new com.ss.android.ugc.aweme.effect.EffectPointModel
            r0.<init>()
            r6.f76270F = r0
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r6.f76270F
            r0.setType(r5)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r6.f76270F
            long r2 = r7.f131242b
            int r2 = (int) r2
            r0.setStartPoint(r2)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = r6.f76270F
            long r2 = r7.f131243c
            int r7 = (int) r2
            r0.setEndPoint(r7)
            com.ss.android.ugc.aweme.effect.EffectPointModel r7 = r6.f76270F
            java.util.ArrayList r0 = com.p683ss.android.ugc.aweme.effect.C29207l.m68790a()
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.effect.EffectModel r0 = (com.p683ss.android.ugc.aweme.effect.EffectModel) r0
            java.lang.String r0 = r0.key
            r7.setKey(r0)
            com.ss.android.ugc.aweme.effect.EffectPointModel r7 = r6.f76270F
            java.util.ArrayList r0 = com.p683ss.android.ugc.aweme.effect.C29207l.m68790a()
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.effect.EffectModel r0 = (com.p683ss.android.ugc.aweme.effect.EffectModel) r0
            java.lang.String r0 = r0.name
            r7.setName(r0)
        L_0x0318:
            com.ss.android.ugc.aweme.effect.EditEffectVideoModel r7 = r6.f76280P
            android.arch.lifecycle.r r7 = r7.mo58849g()
            android.arch.lifecycle.k r0 = r6.f76301h
            com.ss.android.ugc.aweme.effect.bf r1 = new com.ss.android.ugc.aweme.effect.bf
            r1.<init>(r6)
            r7.observe(r0, r1)
            com.ss.android.ugc.aweme.effect.EditEffectVideoModel r7 = r6.f76280P
            android.arch.lifecycle.r r7 = r7.mo58850h()
            android.arch.lifecycle.k r0 = r6.f76301h
            com.ss.android.ugc.aweme.effect.bg r1 = new com.ss.android.ugc.aweme.effect.bg
            r1.<init>(r6)
            r7.observe(r0, r1)
            com.ss.android.ugc.aweme.effect.f.c r7 = r6.f76281Q
            android.arch.lifecycle.r r7 = r7.mo59101k()
            android.arch.lifecycle.k r0 = r6.f76301h
            com.ss.android.ugc.aweme.effect.bd r1 = new com.ss.android.ugc.aweme.effect.bd
            r1.<init>(r6)
            r7.observe(r0, r1)
            com.ss.android.ugc.aweme.effect.f.c r7 = r6.f76281Q
            java.util.ArrayList r7 = r7.mo59098h()
            r6.f76274J = r7
            com.ss.android.ugc.aweme.effect.EditEffectVideoModel r7 = r6.f76280P
            android.arch.lifecycle.r r7 = r7.mo58845c()
            android.arch.lifecycle.k r0 = r6.f76301h
            com.ss.android.ugc.aweme.effect.be r1 = new com.ss.android.ugc.aweme.effect.be
            r1.<init>(r6)
            r7.observe(r0, r1)
            r6.mo58973m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effect.C29094ad.mo58944a(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo58945a(C29200c cVar) {
        this.f76281Q = cVar;
        this.f76280P = (EditEffectVideoModel) C0214z.m440a(cVar.mo59091a()).mo359a(EditEffectVideoModel.class);
        this.f76280P.mo58843a(this.f76281Q);
    }

    /* renamed from: a */
    public final void mo58949a(List<EffectPointModel> list, boolean z) {
        m68549a(list, z, false);
    }

    /* renamed from: a */
    private void m68547a(int i, int i2) {
        if (i >= 0 && i2 >= 0 && !this.f76310q.mo87549a(i, i2, 0, false)) {
            this.f76310q.postDelayed(new C29123ay(this, i, i2), 300);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo58942a(int i, boolean z) {
        if (this.f76302i != null) {
            this.f76302i.mo58917c(i);
        }
        if (this.f76310q != null && this.f76311r != null && !z) {
            this.f76311r.f107668b.setValue(Long.valueOf((long) i));
        }
    }

    /* renamed from: a */
    public final void mo58943a(FragmentActivity fragmentActivity, C0184k kVar) {
        this.f76269E = fragmentActivity;
        this.f76301h = kVar;
        if (this.f76269E instanceof C50207b) {
            this.f76282R = (C50207b) this.f76269E;
        } else {
            this.f76282R = C39629l.m88232a().mo58564B().mo74265a((Activity) this.f76269E);
        }
        this.f76279O = new SafeHandler(this.f76269E);
        this.f76300g = new SafeHandler(kVar);
        this.f76295b = this.f76281Q.mo59092b();
        this.f76278N = this.f76281Q.mo59093c();
        this.f76277M = this.f76281Q.mo59094d();
        this.f76313t = (C20347c) this.f76281Q.mo59095e().getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0152  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m68550b(int r14, boolean r15) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.utils.b r0 = com.p683ss.android.ugc.aweme.utils.C47702b.f120193a
            java.lang.String r1 = "effect_click"
            com.ss.android.ugc.aweme.shortvideo.az r2 = com.p683ss.android.ugc.aweme.shortvideo.C42438az.m93209a()
            java.lang.String r3 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r13.f76295b
            java.lang.String r4 = r4.creationId
            com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86526a(r3, r4)
            java.lang.String r3 = "scene_id"
            r4 = 1003(0x3eb, float:1.406E-42)
            com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86523a(r3, r4)
            java.lang.String r3 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r13.f76295b
            java.lang.String r4 = r4.mShootWay
            com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86526a(r3, r4)
            java.lang.String r3 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4 = r13.f76295b
            int r4 = r4.draftId
            com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86523a(r3, r4)
            java.lang.String r3 = "tab_name"
            java.lang.String r4 = "time_effect"
            com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86526a(r3, r4)
            java.lang.String r3 = "effect_name"
            java.util.ArrayList r4 = com.p683ss.android.ugc.aweme.effect.C29207l.m68790a()
            java.lang.Object r4 = r4.get(r14)
            com.ss.android.ugc.aweme.effect.EffectModel r4 = (com.p683ss.android.ugc.aweme.effect.EffectModel) r4
            java.lang.String r4 = r4.name
            com.ss.android.ugc.aweme.shortvideo.az r2 = r2.mo86526a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f107329a
            r0.mo94984a(r1, r2)
            r0 = 0
            r1 = 1
            if (r15 != 0) goto L_0x0059
            if (r14 != r1) goto L_0x0055
            r15 = 1
            goto L_0x0056
        L_0x0055:
            r15 = 0
        L_0x0056:
            r13.m68552c(r15)
        L_0x0059:
            java.util.ArrayList r15 = com.p683ss.android.ugc.aweme.effect.C29207l.m68790a()
            java.lang.Object r15 = r15.get(r14)
            com.ss.android.ugc.aweme.effect.EffectModel r15 = (com.p683ss.android.ugc.aweme.effect.EffectModel) r15
            java.lang.String r15 = r15.key
            r2 = 2
            r3 = 0
            r5 = 0
            if (r14 != 0) goto L_0x007e
            dmt.av.video.ab r6 = dmt.p2652av.video.C52906ab.m112590a()
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r7 = r13.f76302i
            int r8 = r13.f76318y
            r7.mo58915a(r0, r8)
            r13.mo58949a(r5, r0)
            r7 = r5
            r8 = r6
        L_0x007b:
            r5 = r3
            goto L_0x010c
        L_0x007e:
            if (r14 != r1) goto L_0x00a1
            dmt.av.video.y r6 = dmt.p2652av.video.C53030y.m112775b(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.s r7 = r13.f76285U
            boolean r7 = r7.mo59020b()
            if (r7 == 0) goto L_0x009b
            dmt.av.video.ab r7 = dmt.p2652av.video.C52906ab.m112593b()
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r8 = r13.f76302i
            int r9 = r13.f76317x
            r8.mo58915a(r1, r9)
            r13.mo58949a(r5, r0)
            r5 = r7
        L_0x009b:
            r13.mo58941a(r0)
            r8 = r5
            r7 = r6
            goto L_0x007b
        L_0x00a1:
            if (r14 != r2) goto L_0x00d6
            com.ss.android.ugc.aweme.effect.c.a r3 = r13.f76272H
            com.ss.android.ugc.asve.c.c r4 = r13.f76313t
            d.n r3 = com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a.m68667a(r15, r3, r4)
            java.lang.Object r4 = r3.getFirst()
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            java.lang.Object r3 = r3.getSecond()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            dmt.av.video.ab r8 = dmt.p2652av.video.C52906ab.m112591a(r6, r3)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r9 = r13.f76302i
            int r10 = r13.f76318y
            r9.setOverlayColor(r10)
            java.util.List r9 = com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a.m68669a(r6, r3)
            r13.mo58949a(r9, r1)
        L_0x00d1:
            r11 = r6
            r7 = r5
            r5 = r3
            r3 = r11
            goto L_0x010c
        L_0x00d6:
            r6 = 3
            if (r14 != r6) goto L_0x0108
            com.ss.android.ugc.aweme.effect.c.a r3 = r13.f76272H
            com.ss.android.ugc.asve.c.c r4 = r13.f76313t
            d.n r3 = com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a.m68667a(r15, r3, r4)
            java.lang.Object r4 = r3.getFirst()
            java.lang.Long r4 = (java.lang.Long) r4
            long r6 = r4.longValue()
            java.lang.Object r3 = r3.getSecond()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            dmt.av.video.ab r8 = dmt.p2652av.video.C52906ab.m112594b(r6, r3)
            com.ss.android.ugc.aweme.effect.VEEffectSeekLayout r9 = r13.f76302i
            int r10 = r13.f76318y
            r9.setOverlayColor(r10)
            java.util.List r9 = com.p683ss.android.ugc.aweme.effect.p1673c.p1674a.C29164a.m68669a(r6, r3)
            r13.mo58949a(r9, r1)
            goto L_0x00d1
        L_0x0108:
            r7 = r5
            r8 = r7
            goto L_0x007b
        L_0x010c:
            com.ss.android.ugc.aweme.effect.EffectPointModel r9 = new com.ss.android.ugc.aweme.effect.EffectPointModel
            r9.<init>()
            r13.f76270F = r9
            if (r14 == 0) goto L_0x013c
            com.ss.android.ugc.aweme.effect.EffectPointModel r9 = r13.f76270F
            r9.setType(r2)
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r13.f76270F
            int r3 = (int) r3
            r2.setStartPoint(r3)
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r13.f76270F
            int r3 = (int) r5
            r2.setEndPoint(r3)
            com.ss.android.ugc.aweme.effect.EffectPointModel r2 = r13.f76270F
            r2.setKey(r15)
            com.ss.android.ugc.aweme.effect.EffectPointModel r15 = r13.f76270F
            java.util.ArrayList r2 = com.p683ss.android.ugc.aweme.effect.C29207l.m68790a()
            java.lang.Object r2 = r2.get(r14)
            com.ss.android.ugc.aweme.effect.EffectModel r2 = (com.p683ss.android.ugc.aweme.effect.EffectModel) r2
            java.lang.String r2 = r2.name
            r15.setName(r2)
        L_0x013c:
            if (r7 == 0) goto L_0x0143
            android.arch.lifecycle.r<dmt.av.video.y> r15 = r13.f76297d
            r15.setValue(r7)
        L_0x0143:
            if (r8 == 0) goto L_0x014d
            android.arch.lifecycle.r<dmt.av.video.ab> r15 = r13.f76298e
            r15.setValue(r8)
            r13.mo58972l()
        L_0x014d:
            com.ss.android.ugc.aweme.effect.c.a r15 = r13.f76272H
            if (r14 == 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            r15.mo59038a(r1)
            r13.m68555f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.effect.C29094ad.m68550b(int, boolean):void");
    }

    /* renamed from: a */
    private void m68549a(List<EffectPointModel> list, boolean z, boolean z2) {
        m68556g(z);
        m68557h(!z);
        if (z) {
            if (!C9414h.m18630a(list)) {
                m68547a(((EffectPointModel) list.get(0)).getUiStartPoint(), ((EffectPointModel) list.get(0)).getUiEndPoint());
                this.f76310q.mo87547a(true, z2, null);
                return;
            }
            this.f76310q.mo87547a(false, z2, null);
        }
    }

    /* renamed from: a */
    private void m68548a(long j, long j2, boolean z) {
        String str;
        String str2;
        m68559t();
        long j3 = j2 - j;
        int currentItem = this.f76308o.getCurrentItem();
        if (currentItem < this.f76267C.getCount()) {
            str = this.f76267C.mo59110a(currentItem).getKey();
        } else {
            str = null;
        }
        if (C29164a.m68671a((ViewPager) this.f76308o, (PagerAdapter) this.f76267C, mo58952a())) {
            C52906ab abVar = (C52906ab) this.f76298e.getValue();
            if (abVar != null) {
                this.f76270F.setStartPoint((int) j);
                this.f76270F.setEndPoint((int) j2);
                this.f76298e.setValue(C52906ab.m112592a(abVar.f131241a, j, j2));
                this.f76297d.setValue(C53030y.m112775b(j));
                if (!(this.f76270F == null || this.f76270F.getKey() == null)) {
                    String key = this.f76270F.getKey();
                    this.f76272H.f76423c.put(key, Long.valueOf(j));
                    this.f76272H.f76424d.put(key, Long.valueOf(Math.abs(j3)));
                }
            } else {
                return;
            }
        } else if (C29207l.m68793b(str)) {
            long a = this.f76314u.mo58928a(j);
            long a2 = this.f76314u.mo58928a(j2);
            C53026u uVar = new C53026u();
            uVar.f131492f = 6;
            uVar.f131488b = a;
            uVar.f131489c = a2;
            uVar.f131490d = j;
            uVar.f131491e = j2;
            uVar.f131493g = this.f76314u.mo58931c();
            this.f76296c.setValue(uVar);
        }
        mo58972l();
        if (!z) {
            NoScrollViewPager noScrollViewPager = this.f76308o;
            C29216u uVar2 = this.f76267C;
            VideoPublishEditModel videoPublishEditModel = this.f76295b;
            EffectPointModel effectPointModel = this.f76270F;
            String str3 = this.f76273I;
            boolean a3 = mo58952a();
            if (noScrollViewPager != null && uVar2 != null && videoPublishEditModel != null) {
                if (C29164a.m68671a((ViewPager) noScrollViewPager, (PagerAdapter) uVar2, a3)) {
                    if (effectPointModel != null) {
                        C47702b bVar = C47702b.f120193a;
                        String str4 = "duration_adjust_complete";
                        C42438az a4 = C42438az.m93209a().mo86526a("creation_id", videoPublishEditModel.creationId).mo86526a("shoot_way", videoPublishEditModel.mShootWay).mo86526a("enter_from", "edit_effect_page").mo86526a("content_source", C43855fx.m96288a(videoPublishEditModel)).mo86526a("content_type", C43855fx.m96289b(videoPublishEditModel)).mo86526a("effect_name", effectPointModel.getName()).mo86526a("effect_id", effectPointModel.getKey());
                        String str5 = "tab_name";
                        if (str3 == null) {
                            str2 = "";
                        } else {
                            str2 = str3;
                        }
                        bVar.mo94984a(str4, a4.mo86526a(str5, str2).mo86524a("duration", j3).f107329a);
                    } else {
                        return;
                    }
                }
                EffectCategoryResponse a5 = uVar2.mo59110a(noScrollViewPager.getCurrentItem());
                if (a5 != null && C29207l.m68793b(a5.getKey())) {
                    Fragment fragment = uVar2.f76523a;
                    if (fragment instanceof C29227x) {
                        EffectPointModel effectPointModel2 = (EffectPointModel) C52575l.m112140f(((C29227x) fragment).mo59057c());
                        if (effectPointModel2 != null) {
                            C47702b bVar2 = C47702b.f120193a;
                            String str6 = "duration_adjust_complete";
                            C42438az a6 = C42438az.m93209a().mo86526a("creation_id", videoPublishEditModel.creationId).mo86526a("shoot_way", videoPublishEditModel.mShootWay).mo86526a("enter_from", "edit_effect_page").mo86526a("content_source", C43855fx.m96288a(videoPublishEditModel)).mo86526a("content_type", C43855fx.m96289b(videoPublishEditModel)).mo86526a("effect_name", effectPointModel2.getName()).mo86526a("effect_id", effectPointModel2.getKey());
                            String str7 = "tab_name";
                            if (str3 == null) {
                                str3 = "";
                            }
                            bVar2.mo94984a(str6, a6.mo86526a(str7, str3).mo86524a("duration", j3).f107329a);
                        }
                    }
                }
            }
        }
    }
}
