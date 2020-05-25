package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.facebook.Profile;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.google.p1057b.p1058a.C17417i;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.christmas.FestivalHomePageView;
import com.p683ss.android.ugc.aweme.festival.christmas.p1740a.C31359a;
import com.p683ss.android.ugc.aweme.festival.christmas.p1741b.C31362a;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31351d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.p1382aq.C23215at;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.profile.edit.C39847g.C39849b;
import com.p683ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq.C40267a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40275bw.C40276a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40247c;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.p683ss.android.ugc.aweme.profile.tab.MusProfileNavigator.C40047a;
import com.p683ss.android.ugc.aweme.profile.tab.MusProfileTabImageView;
import com.p683ss.android.ugc.aweme.profile.tab.MusProfileTabView;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel.C40604e;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.setting.p2148ui.C41873ba;
import com.p683ss.android.ugc.aweme.translation.C47352a;
import com.p683ss.android.ugc.aweme.translation.p2371a.C47357d;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView;
import com.p683ss.android.ugc.aweme.translation.p2373ui.TranslationStatusView.C47363b;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47666ag;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47896fq;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.af */
public abstract class C40212af extends C40392t implements C31362a, C40047a {

    /* renamed from: C */
    protected TextView f102703C;

    /* renamed from: D */
    protected TextView f102704D;

    /* renamed from: E */
    protected TextView f102705E;

    /* renamed from: F */
    MusAvatarWithBorderView f102706F;

    /* renamed from: G */
    ViewStub f102707G;

    /* renamed from: H */
    FestivalHomePageView f102708H;

    /* renamed from: I */
    SwipableViewPager f102709I;

    /* renamed from: J */
    public MusProfileNavigator f102710J;

    /* renamed from: K */
    protected ImageView f102711K;

    /* renamed from: L */
    View f102712L;

    /* renamed from: M */
    View f102713M;

    /* renamed from: O */
    ImageView f102714O;

    /* renamed from: P */
    protected EnterpriseTransformLayout f102715P;

    /* renamed from: Q */
    ViewGroup f102716Q;

    /* renamed from: R */
    protected View f102717R;

    /* renamed from: S */
    protected View f102718S;

    /* renamed from: T */
    protected View f102719T;

    /* renamed from: U */
    protected TextView f102720U;

    /* renamed from: V */
    protected TranslationStatusView f102721V;

    /* renamed from: W */
    protected C40320dc f102722W;

    /* renamed from: X */
    protected IUserService f102723X;

    /* renamed from: Y */
    ArrayList<Integer> f102724Y = new ArrayList<>();

    /* renamed from: Z */
    protected int f102725Z = -1;

    /* renamed from: aa */
    protected AnalysisStayTimeFragmentComponent f102726aa;

    /* renamed from: ab */
    protected C40329dl f102727ab;

    /* renamed from: ac */
    protected View f102728ac;

    /* renamed from: ad */
    public boolean f102729ad = false;

    /* renamed from: ae */
    C31359a f102730ae;

    /* renamed from: af */
    protected C40267a f102731af = new C40267a() {
        /* renamed from: a */
        public final void mo82252a(boolean z, int i) {
            if (C40212af.this.f103065c != null) {
                C40212af.this.f103065c.setCanScrollUp(true);
            }
            if (i == 0) {
                C40212af.this.f103058A.mo82946c(true);
            }
            if (i == 0 && C40212af.this.f103078t == 0) {
                C40212af.this.f103058A.mo82945b(true);
            }
        }

        /* renamed from: b */
        public final void mo82253b(boolean z, int i) {
            if (C40212af.this.f103065c != null) {
                C40212af.this.f103065c.setCanScrollUp(true);
            }
            if (i == 0) {
                C40212af.this.f103058A.mo82946c(false);
            }
            if (i == 0 && C40212af.this.f103078t == 0) {
                C40212af.this.f103058A.mo82945b(false);
            }
        }
    };

    /* renamed from: ag */
    float f102732ag = 0.0f;

    /* renamed from: ah */
    boolean f102733ah;

    /* renamed from: ai */
    protected long f102734ai = -1;

    /* renamed from: aj */
    private ImageView f102735aj;

    /* renamed from: ak */
    private C39481c f102736ak;

    /* renamed from: al */
    private String f102737al;

    /* renamed from: am */
    private UrlModel f102738am;

    /* renamed from: an */
    private boolean f102739an = false;

    /* renamed from: k */
    public static String m89452k(int i) {
        switch (i) {
            case 1:
                return "instagram";
            case 2:
                return "youtube";
            case 3:
                return "twitter";
            default:
                return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo82183A() {
        return false;
    }

    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo82222p() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo82181z() {
        return false;
    }

    /* renamed from: a */
    public final void mo81891a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        if (isViewValid()) {
            this.f103066d.setText(str);
            this.f102737al = str;
        }
    }

    /* renamed from: a */
    public void mo81890a(User user) {
        super.mo81890a(user);
        this.f103081w = user;
        if (C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
            this.f102709I.f102579a = false;
            this.f102710J.mo82079a(0).setSelected(false);
        }
        mo82452i(this.f103081w);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo82445C() {
        this.f102734ai = System.currentTimeMillis();
    }

    public void onResume() {
        super.onResume();
        mo82445C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo82163g() {
        super.mo82163g();
        this.f102706F.setOnClickListener(this);
        mo82464y();
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f102736ak != null) {
            this.f102736ak.mo80501d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo82463x() {
        if (this.f103081w == null || this.f103081w.getShowArtistPlaylist() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final int mo82460s() {
        if (this.f103068j == null) {
            return -1;
        }
        return this.f103068j.indexOf(Integer.valueOf(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo82446D() {
        String str;
        if (this.f102734ai > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f102734ai;
            if (currentTimeMillis > 0) {
                if (mo82181z()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C40223ai aiVar = new C40223ai(this, str, currentTimeMillis, this.f103078t);
                C0013i.m18a((Callable<TResult>) aiVar, (Executor) C26890h.m65003a());
            }
            this.f102734ai = -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo82456o() {
        if (this.f102721V != null) {
            TranslationStatusView translationStatusView = this.f102721V;
            translationStatusView.f119519a.getPaint().setFakeBoldText(false);
            translationStatusView.f119521c.getPaint().setFakeBoldText(false);
            translationStatusView.f119523e.getPaint().setFakeBoldText(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo82459q() {
        if (this.f103081w != null) {
            String bioSecureUrl = this.f103081w.getBioSecureUrl();
            if (!TextUtils.isEmpty(bioSecureUrl)) {
                SmartRouter.buildRoute((Context) getActivity(), "aweme://webview/").withParam(Uri.parse(bioSecureUrl)).open();
            }
        }
    }

    /* renamed from: t */
    public void mo82224t() {
        if (isViewValid()) {
            if (mo20100Z_() && this.f102729ad) {
                this.f102706F.setImageURI("");
                this.f102729ad = false;
            }
            this.f103065c.mo55098a();
            this.f102709I.setCurrentItem(0, false);
        }
    }

    /* renamed from: u */
    public void mo82225u() {
        if (isViewValid()) {
            mo81899c(0);
            mo81902d(0);
            mo81887a(0, "");
            mo81894b((User) null);
            if (this.f102721V != null) {
                this.f102721V.setVisibility(8);
            }
            this.f102711K.setVisibility(8);
            this.f103065c.mo55098a();
            this.f102709I.setCurrentItem(0, false);
        }
    }

    /* renamed from: j */
    public final void mo82454j() {
        if (this.f103081w == null) {
            mo82621c(mo81901d());
        } else {
            mo82623g(this.f103081w);
        }
        this.f102722W = new C40320dc(getChildFragmentManager(), this.f103067e, this.f103068j);
        this.f102709I.setAdapter(this.f102722W);
        this.f102710J.mo82081a(this.f102709I, mo82463x(), mo82181z(), this);
        onPageSelected(this.f103078t);
        this.f102709I.setCurrentItem(this.f103078t);
        this.f102709I.addOnPageChangeListener(this);
    }

    /* renamed from: v */
    public final void mo82461v() {
        if (this.f102706F != null && this.f102706F.getController() != null) {
            Animatable i = this.f102706F.getController().mo25749i();
            if (i != null) {
                if (C39849b.m88609a()) {
                    i.stop();
                } else if (getUserVisibleHint() && !i.isRunning()) {
                    i.start();
                } else if (!getUserVisibleHint() && i.isRunning()) {
                    i.stop();
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo82462w() {
        ArrayList arrayList;
        C26890h.m65011a("enter_setting_page", C23089d.m56640a().mo47829a("previous_page", "personal_homepage").mo47829a("enter_method", "click_button").f61491a);
        C18898c.m46009a(getActivity(), "set", "personal_homepage");
        if (this.f103067e != null && this.f103067e.size() > 0) {
            if (this.f102722W.mo82580f(0) instanceof C40266bq) {
                arrayList = ((C40266bq) this.f102722W.mo82580f(0)).mo82498E();
            } else {
                arrayList = null;
            }
            C31187c.f81607a = arrayList;
        }
        if (C47915gg.m103651b()) {
            C40010c.f101950a.mo82023a(getActivity());
        } else {
            SmartRouter.buildRoute((Context) getActivity(), "aweme://setting").open();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo82464y() {
        int i;
        if (this.f102710J.getTabCount() >= 2) {
            View a = this.f102710J.mo82079a(this.f103068j.indexOf(Integer.valueOf(1)));
            if (a instanceof MusProfileTabImageView) {
                MusProfileTabImageView musProfileTabImageView = (MusProfileTabImageView) a;
                if (((Integer) C23183v.m56778a().mo47909e().mo47782d()).intValue() == 0 || !C47915gg.m103664m(this.f103081w)) {
                    i = R.drawable.dp5;
                } else {
                    i = R.drawable.dp4;
                }
                musProfileTabImageView.setImageResource(i);
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        mo82461v();
    }

    /* renamed from: a */
    public final void mo81885a(int i) {
        if (i < 0) {
            i = 0;
        }
        super.mo81885a((int) m89451b((long) i));
    }

    /* renamed from: b */
    public final void mo81893b(int i) {
        if (i < 0) {
            i = 0;
        }
        super.mo81893b((int) m89451b((long) i));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f102723X = BaseUserService.getBaseUserService_Monster();
    }

    /* renamed from: b */
    private long m89451b(long j) {
        if (!C47915gg.m103664m(this.f103081w) || !C47915gg.m103651b()) {
            return j;
        }
        return 0;
    }

    /* renamed from: l */
    public final void mo82455l(int i) {
        if (this.f103081w != null) {
            C40010c.f101950a.mo82026a(getContext(), this.f103081w, i);
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(C41873ba baVar) {
        if (TextUtils.equals(this.f103081w.getUid(), C20854a.m53167g().getCurUserId())) {
            mo82464y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo82161c(View view) {
        try {
            String charSequence = this.f103076r.getText().toString();
            if (charSequence != null) {
                charSequence = charSequence.replace("@", "");
            }
            C47666ag.m103177a("user_id", view.getContext(), charSequence);
            C10691a.m21533a(view.getContext(), (int) R.string.a40).mo19066a();
        } catch (SecurityException e) {
            C32458a.m75143a((Exception) e);
        }
    }

    /* renamed from: d */
    public final void mo81902d(int i) {
        if (isViewValid() && this.f102710J.getTabCount() >= 2) {
            MusProfileTabView musProfileTabView = (MusProfileTabView) this.f102710J.mo82079a(this.f103068j.indexOf(Integer.valueOf(1)));
            if (musProfileTabView != null && C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
                musProfileTabView.setClickable(false);
            }
        }
    }

    /* renamed from: e */
    public final void mo82089e(int i) {
        String str;
        String a = C47896fq.m103601a(i);
        if (this.f102733ah) {
            this.f102733ah = false;
            return;
        }
        if (mo82181z()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C26890h.m65011a("change_profile_tab", new C23089d().mo47829a("enter_from", str).mo47829a("enter_method", "slide").mo47829a("tab_name", a).f61491a);
    }

    /* renamed from: f */
    public final void mo82090f(int i) {
        String str;
        String a = C47896fq.m103601a(i);
        if (mo82181z()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C26890h.m65011a("change_profile_tab", new C23089d().mo47829a("enter_from", str).mo47829a("enter_method", "click").mo47829a("tab_name", a).f61491a);
        this.f102733ah = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo82452i(User user) {
        if (C31357a.m73095a() && this.f102714O != null) {
            if (user.isActivityUser()) {
                Drawable b = C31351d.m73085b();
                if (b != null) {
                    this.f102714O.setVisibility(0);
                    this.f102714O.setImageDrawable(b);
                } else {
                    this.f102714O.setVisibility(8);
                }
            } else {
                this.f102714O.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo82453j(int i) {
        String str = "";
        if (this.f103068j == null || this.f103068j.size() == 0 || i >= this.f103068j.size()) {
            return str;
        }
        return C47896fq.m103601a(((Integer) this.f103068j.get(i)).intValue());
    }

    /* renamed from: b */
    public void mo81896b(String str) {
        if (isViewValid() && this.f103076r != null) {
            StringBuilder sb = new StringBuilder("@");
            sb.append(str);
            this.f103076r.setText(sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo81899c(int i) {
        int i2;
        if (isViewValid() && this.f102710J.getTabCount() > 0) {
            MusProfileTabView musProfileTabView = (MusProfileTabView) this.f102710J.mo82079a(this.f103068j.indexOf(Integer.valueOf(0)));
            if (musProfileTabView != null) {
                if (C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
                    musProfileTabView.setClickable(false);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(" ");
                if (i > 1) {
                    i2 = R.string.cd5;
                } else {
                    i2 = R.string.cd4;
                }
                sb.append(getString(i2));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo82449d(View view) {
        Uri uri;
        C10912c e = C31357a.m73104e();
        if (e != null && !TextUtils.isEmpty(e.f29302c)) {
            User user = this.f103081w;
            if (user != null) {
                C26890h.m65011a("enter_activity_page", new C23089d().mo47829a("enter_from", C40247c.m89514a(user)).f61491a);
            }
            String str = null;
            if (mo82183A() && this.f103081w != null && !C20854a.m53167g().isMe(this.f103081w.getUid())) {
                str = this.f103081w.getUid();
            }
            if (!TextUtils.isEmpty(str)) {
                uri = Uri.parse(e.f29302c).buildUpon().appendQueryParameter("uid", str).build();
            } else {
                uri = Uri.parse(e.f29302c);
            }
            C40026s.f101964a.openFestivalPageWithSchema(getContext(), uri.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo82451h(User user) {
        int i;
        List list = this.f103068j;
        if (C47915gg.m103652b(user, TextUtils.equals(user.getUid(), C20854a.m53167g().getCurUserId()))) {
            i = 0;
        } else {
            i = user.getTabType();
        }
        int indexOf = list.indexOf(Integer.valueOf(m89736i(i)));
        if (indexOf < 0) {
            indexOf = 0;
        }
        int min = Math.min(this.f102722W.getCount() - 1, indexOf);
        if (this.f102709I.getCurrentItem() != min) {
            this.f102709I.setCurrentItem(min, false);
        }
        onPageSelected(min);
    }

    /* renamed from: a */
    public final void mo81888a(long j) {
        if (isViewValid()) {
            long b = m89451b(j);
            if (b < 0) {
                b = 0;
            }
            if (b > 1) {
                this.f102705E.setText(R.string.ca1);
            } else {
                this.f102705E.setText(R.string.ca0);
            }
            this.f103080v = C33095b.m76068a(b);
            this.f103073o.setText(this.f103080v);
        }
    }

    /* renamed from: e */
    public final void mo81904e(User user) {
        boolean z;
        if (isViewValid() && user != null) {
            boolean m = C47915gg.m103664m(this.f103081w);
            if (user != null && !user.isBlock() && (m || !user.isSecret() || !(user.getFollowStatus() == 0 || user.getFollowStatus() == 4))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f102711K.setVisibility(8);
                return;
            }
            this.f102724Y.clear();
            if (!TextUtils.isEmpty(user.getTwitterId())) {
                this.f102724Y.add(Integer.valueOf(3));
                this.f102711K.setVisibility(0);
                this.f102711K.setImageResource(R.drawable.dr3);
            }
            if (!TextUtils.isEmpty(user.getYoutubeChannelId())) {
                this.f102724Y.add(Integer.valueOf(2));
                this.f102711K.setVisibility(0);
                this.f102711K.setImageResource(R.drawable.dr4);
            }
            if (!TextUtils.isEmpty(user.getInsId())) {
                this.f102724Y.add(Integer.valueOf(1));
                this.f102711K.setVisibility(0);
                this.f102711K.setImageResource(R.drawable.dqw);
            }
            if (this.f102724Y.size() == 0) {
                this.f102711K.setVisibility(8);
                return;
            }
            this.f102711K.setVisibility(0);
            this.f102711K.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    String str;
                    ClickInstrumentation.onClick(view);
                    C40212af afVar = C40212af.this;
                    int size = afVar.f102724Y.size();
                    if (size == 1) {
                        int intValue = ((Integer) afVar.f102724Y.get(0)).intValue();
                        afVar.mo82455l(intValue);
                        String str2 = "click_social_account";
                        C23089d a = C23089d.m56640a();
                        String str3 = "enter_from";
                        if (C20854a.m53167g().isMe(afVar.f103081w.getUid())) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("platform", C40212af.m89452k(intValue)).f61491a);
                    } else if (size > 1 && afVar.getContext() != null && afVar.f103081w != null) {
                        C1161a aVar = new C1161a(afVar.getContext());
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (!TextUtils.isEmpty(afVar.f103081w.getInsId())) {
                            arrayList.add(Integer.valueOf(1));
                            arrayList2.add(afVar.getContext().getString(R.string.cbv, new Object[]{afVar.f103081w.getInsId()}));
                        }
                        if (!TextUtils.isEmpty(afVar.f103081w.getYoutubeChannelId())) {
                            arrayList.add(Integer.valueOf(2));
                            arrayList2.add(afVar.getContext().getString(R.string.cbw, new Object[]{afVar.f103081w.getYoutubeChannelTitle()}));
                        }
                        if (!TextUtils.isEmpty(afVar.f103081w.getTwitterId())) {
                            arrayList.add(Integer.valueOf(3));
                            arrayList2.add(C2240a.m6772a("Twitter: %s", new Object[]{afVar.f103081w.getTwitterName()}));
                        }
                        aVar.mo3767a((CharSequence[]) arrayList2.toArray(new String[0]), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(arrayList) {

                            /* renamed from: a */
                            final /* synthetic */ ArrayList f102748a;

                            {
                                this.f102748a = r2;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                String str;
                                if (i < this.f102748a.size()) {
                                    int intValue = ((Integer) this.f102748a.get(i)).intValue();
                                    C40212af.this.mo82455l(intValue);
                                    String str2 = "click_social_account";
                                    C23089d a = C23089d.m56640a();
                                    String str3 = "enter_from";
                                    if (C20854a.m53167g().isMe(C40212af.this.f103081w.getUid())) {
                                        str = "personal_homepage";
                                    } else {
                                        str = "others_homepage";
                                    }
                                    C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("platform", C40212af.m89452k(intValue)).f61491a);
                                }
                            }
                        });
                        C47700ay.m103235a(aVar.mo3772b());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo82450f(User user) {
        String str;
        super.mo82450f(user);
        if (this.f102727ab == null) {
            this.f102727ab = new C40329dl(getContext(), this.f102721V, this.f103074p);
        }
        C40329dl dlVar = this.f102727ab;
        dlVar.f102937c = user;
        if (dlVar.f102935a != null) {
            dlVar.f102935a.mo94642b();
            dlVar.f102939e = dlVar.f102937c.getSignature();
            C47357d a = C47352a.m102708a().mo94634a(dlVar.f102939e);
            String appLanguage = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage();
            if (TextUtils.isEmpty(dlVar.f102937c.getSignatureLanguage()) || TextUtils.equals("un", dlVar.f102937c.getSignatureLanguage())) {
                str = dlVar.f102937c.getLanguage();
            } else {
                str = dlVar.f102937c.getSignatureLanguage();
            }
            String signature = dlVar.f102937c.getSignature();
            if (a != null) {
                dlVar.f102935a.setVisibility(0);
                dlVar.f102935a.setStatusWithoutAnim(a.f119516b);
                if (a.f119516b == 2) {
                    dlVar.f102936b.setText(a.f119515a);
                }
            } else if (TextUtils.isEmpty(signature) || TextUtils.isEmpty(str) || appLanguage.equals(str)) {
                dlVar.f102935a.setVisibility(8);
            } else {
                dlVar.f102935a.setVisibility(0);
            }
            dlVar.f102935a.setOnTranslationViewClickListener(new C47363b(signature, str, appLanguage) {

                /* renamed from: a */
                final /* synthetic */ String f102941a;

                /* renamed from: b */
                final /* synthetic */ String f102942b;

                /* renamed from: c */
                final /* synthetic */ String f102943c;

                /* renamed from: a */
                public final void mo63630a(View view) {
                    C47352a.m102708a().mo94634a(C40329dl.this.f102939e).f119516b = 0;
                    C40329dl.this.mo82585a(C40329dl.this.f102936b, C40329dl.this.f102937c.getSignature());
                }

                /* renamed from: a */
                public final void mo63631a(View view, boolean z) {
                    C47357d a = C47352a.m102708a().mo94634a(C40329dl.this.f102939e);
                    if (a != null) {
                        C40329dl.this.f102935a.setStatus(2);
                        a.f119516b = 2;
                        C40329dl.this.mo82585a(C40329dl.this.f102936b, a.f119515a);
                        return;
                    }
                    C40329dl.this.f102938d.mo94640a(this.f102941a, this.f102942b, this.f102943c, "", 3);
                }

                {
                    this.f102941a = r2;
                    this.f102942b = r3;
                    this.f102943c = r4;
                }
            });
        }
        this.f102721V.setLoadingDrawable(R.drawable.dpj);
        this.f102721V.setTextColor(R.color.a17);
    }

    public void onMore(View view) {
        final boolean z = !C36173w.m81665a().getLiveInitService().mo74818a();
        C26891a aVar = new C26891a(getActivity());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C40276a(getResources().getString(R.string.av8), !C23859b.m58575b().mo49472b((Context) getActivity(), "is_show_profile_yellow_point", false)));
        if (z) {
            arrayList.add(new C40276a(getResources().getString(R.string.cb2), false));
        }
        arrayList.add(new C40276a(getResources().getString(R.string.deb), false));
        aVar.mo54843a((ListAdapter) new C40275bw(getActivity(), arrayList), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66723a((Fragment) C40212af.this, "personal_homepage", "click_more_setting");
                    return;
                }
                if (i == 0) {
                    if (!C23859b.m58575b().mo49472b((Context) C40212af.this.getActivity(), "is_show_profile_yellow_point", false)) {
                        C40212af.this.f102717R.setVisibility(8);
                        C23859b.m58575b().mo49466a((Context) C40212af.this.getActivity(), "is_show_profile_yellow_point", true);
                    }
                    C40212af.this.mo82448a((Bundle) null);
                } else if (z) {
                    if (i == 1) {
                        C40010c.f101950a.mo82028b(C40212af.this.getActivity());
                        C26890h.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
                    } else if (i == 2) {
                        C40212af.this.mo82462w();
                    }
                } else if (i == 1) {
                    C40212af.this.mo82462w();
                }
                dialogInterface.dismiss();
            }
        });
        try {
            aVar.mo54845b();
        } catch (NotFoundException e) {
            C32458a.m75148a((Throwable) e);
        }
    }

    public void onPageSelected(int i) {
        if (this.f103067e != null && i >= 0 && i < this.f103067e.size() && this.f103065c != null) {
            if (i != this.f103078t && this.f103078t >= 0 && this.f103078t < this.f103067e.size() && this.f103067e.get(this.f103078t) != null) {
                ((C40321dd) this.f103067e.get(this.f103078t)).setUserVisibleHint(false);
            }
            mo82446D();
            this.f103078t = i;
            this.f103058A.mo22530c(new C40604e(((Integer) this.f103068j.get(this.f103078t)).intValue()));
            mo82445C();
            this.f103065c.getHelper().f71219b = (C26991a) this.f103067e.get(i);
            this.f103065c.setCanScrollUp(true);
            if (i == 0) {
                if (mo82166h()) {
                    C26890h.m65004a((Context) getActivity(), "slide_left", "personal_homepage", 0, 0);
                }
            } else if (i == 1) {
                if (mo82166h()) {
                    C26890h.m65004a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
                }
            } else if (i == 2 && mo82166h()) {
                C26890h.m65004a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
            }
            if (!(this.f102722W == null || this.f102709I == null)) {
                int count = this.f102722W.getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    C40321dd ddVar = (C40321dd) this.f102722W.mo2309a(i2);
                    if (!(ddVar == null || ddVar.getFragmentManager() == null)) {
                        if (i2 == i) {
                            ddVar.setUserVisibleHint(true);
                        } else {
                            ddVar.setUserVisibleHint(false);
                        }
                        ddVar.aX_();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo82448a(Bundle bundle) {
        if (C47915gg.m103651b()) {
            C10691a.m21551c(getContext(), getString(R.string.a2a)).mo19066a();
            return;
        }
        if (getActivity() != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute((Context) getActivity(), "aweme://profile_edit");
            if (bundle != null) {
                buildRoute.withParam(bundle);
            }
            buildRoute.open();
        }
        SharePrefCache.inst().getIsProfileBubbleShown().mo47776a(Boolean.valueOf(false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo82160b(View view) {
        super.mo82160b(view);
        view.setBackgroundColor(getContext().getResources().getColor(R.color.as0));
        this.f102703C = (TextView) view.findViewById(R.id.aiq);
        this.f102704D = (TextView) view.findViewById(R.id.ail);
        this.f102705E = (TextView) view.findViewById(R.id.a56);
        this.f102706F = (MusAvatarWithBorderView) view.findViewById(R.id.ao6);
        this.f102706F.setBorderColor(R.color.a1v);
        this.f102706F.mo48984a(true, false);
        this.f102710J = (MusProfileNavigator) view.findViewById(R.id.c5p);
        this.f102719T = view.findViewById(R.id.bpa);
        this.f102721V = (TranslationStatusView) view.findViewById(R.id.d4a);
        mo82456o();
        if (this.f103076r != null) {
            this.f103076r.setOnClickListener(new C40225ak(this));
        }
        this.f102711K = (ImageView) view.findViewById(R.id.kv);
        this.f102728ac = view.findViewById(R.id.cb2);
        if (this.f102719T != null) {
            this.f102719T.setOnClickListener(new C40226al(this));
        }
        if (C47915gg.m103651b()) {
            C23729p.m58261a(false, this.f103074p, this.f102719T, this.f102728ac);
            if (this.f103075q != null) {
                this.f103075q.setPadding(0, 0, 0, 0);
            }
        }
        this.f102712L = view.findViewById(R.id.bp_);
        this.f102713M = view.findViewById(R.id.ae8);
        View findViewById = view.findViewById(R.id.e8b);
        if (getContext() != null && VERSION.SDK_INT >= 23) {
            try {
                findViewById.setForeground(getContext().getResources().getDrawable(R.drawable.dmq));
            } catch (NullPointerException unused) {
            }
        }
        this.f102712L.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C40010c.f101950a.mo82024a((Activity) C40212af.this.getActivity(), C47661ab.m103163a().mo94972a("enter_from", "personal_homepage").mo94972a("enter_method", "click_button").f120139a);
                SharePrefCache.inst().getShouldShowFavouriteTip().mo47776a(Boolean.valueOf(false));
                C40212af.this.f102713M.setVisibility(8);
            }
        });
        if (C47915gg.m103651b()) {
            C23729p.m58261a(false, this.f102712L, this.f102713M);
        }
        this.f102720U = (TextView) view.findViewById(R.id.dnz);
        if (this.f102720U != null) {
            this.f102720U.setOnClickListener(new C40227am(this));
        }
        this.f102735aj = (ImageView) view.findViewById(R.id.em2);
        if (this.f102735aj != null) {
            this.f102735aj.setOnClickListener(new C40228an(this));
        }
    }

    /* renamed from: d */
    public void mo81903d(User user) {
        if (user != null && user != null && isViewValid()) {
            if (TextUtils.isEmpty(user.getBioEmail()) || C47915gg.m103652b(user, C47915gg.m103664m(user))) {
                this.f102735aj.setVisibility(8);
            } else {
                this.f102735aj.setVisibility(0);
            }
            if (TextUtils.isEmpty(user.getBioUrl())) {
                this.f102720U.setVisibility(8);
            } else {
                this.f102720U.setVisibility(0);
                if (VERSION.SDK_INT >= 17) {
                    this.f102720U.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                } else {
                    this.f102720U.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                if (!C20854a.m53167g().isLogin() || !C47915gg.m103664m(user) || !TextUtils.isEmpty(user.getBioSecureUrl())) {
                    if (VERSION.SDK_INT >= 17) {
                        this.f102720U.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.dqx, 0, 0, 0);
                    } else {
                        this.f102720U.setCompoundDrawablesWithIntrinsicBounds(R.drawable.dqx, 0, 0, 0);
                    }
                    this.f102720U.setCompoundDrawablePadding((int) C9432q.m18687b(getContext(), 4.0f));
                    this.f102720U.setText(user.getBioUrl());
                    this.f102720U.setTextColor(getContext().getResources().getColor(R.color.a7x));
                    this.f102720U.setOnClickListener(new C40232ar(this));
                } else {
                    if (VERSION.SDK_INT >= 17) {
                        this.f102720U.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.dmw, 0, 0, 0);
                    } else {
                        this.f102720U.setCompoundDrawablesWithIntrinsicBounds(R.drawable.dmw, 0, 0, 0);
                    }
                    this.f102720U.setCompoundDrawablePadding((int) C9432q.m18687b(getContext(), 4.0f));
                    this.f102720U.setText(R.string.gpp);
                    this.f102720U.setTextColor(getContext().getResources().getColor(R.color.xn));
                    this.f102720U.setOnClickListener(new C40231aq(this, user));
                }
            }
            if (!C47915gg.m103664m(user)) {
                if (this.f102735aj != null && this.f102735aj.getVisibility() == 0) {
                    C40247c.m89519a("others_homepage", "email", user);
                }
                if (this.f102720U != null && this.f102720U.getVisibility() == 0) {
                    C40247c.m89519a("others_homepage", "weblink", user);
                }
            }
        }
    }

    public void onClick(View view) {
        if (!C40233as.m89499a(getActivity())) {
            C9432q.m18672a((Context) getActivity(), (int) R.string.cg1);
            return;
        }
        int id = view.getId();
        if (id == R.id.ao6) {
            if (!C32800a.m75679a(view)) {
                mo82170m();
            }
        } else if (id == R.id.aim) {
            if (!C32800a.m75679a(view)) {
                if (!C20854a.m53167g().isLogin()) {
                    C27965f.m66723a((Fragment) this, "personal_homepage", "follower_list");
                } else if (C47915gg.m103669r(this.f103081w) || !C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w)) || this.f103070l <= 0) {
                    mo82169l();
                }
            }
        } else if (id != R.id.air) {
            if (id == R.id.a8q) {
                String str = this.f103080v;
                String str2 = this.f102737al;
                if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle(Profile.f35248a) && this.f103081w != null) {
                    str2 = C47915gg.m103656e(this.f103081w);
                }
                StringBuilder sb = new StringBuilder("\"");
                sb.append(str2);
                sb.append("\" ");
                sb.append(getContext().getResources().getString(R.string.b4k));
                sb.append(" ");
                sb.append(str);
                sb.append(" ");
                sb.append(getContext().getResources().getString(R.string.b4l));
                C10643a c = new C10643a(getActivity()).mo18902b(sb.toString()).mo18885a((int) R.string.ff3).mo18886a((int) R.string.c_y, (DialogInterface.OnClickListener) null).mo18910d(-3476230).mo18907c(R.drawable.drm);
                c.f28295z = true;
                c.mo18897a().mo18883c();
                MobClick eventName = MobClick.obtain().setEventName("click_like_count");
                eventName.setLabelName("others_homepage");
                C26890h.onEvent(eventName);
            }
        } else if (!C32800a.m75679a(view)) {
            if (!C20854a.m53167g().isLogin()) {
                C27965f.m66723a((Fragment) this, "personal_homepage", "following_list");
            } else if (C47915gg.m103669r(this.f103081w) || !C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w)) || this.f103069k <= 0) {
                mo82168k();
            }
        }
    }

    public void onHiddenChanged(boolean z) {
        String str;
        int i;
        super.onHiddenChanged(z);
        if (this.f102726aa != null) {
            this.f102726aa.mo48652a(z);
        }
        if (z) {
            mo82446D();
            return;
        }
        mo82445C();
        if (this.f102715P != null) {
            EnterpriseTransformLayout enterpriseTransformLayout = this.f102715P;
            if (!C9376b.m18558a((Collection<T>) enterpriseTransformLayout.f102094e) && enterpriseTransformLayout.f102097h != null && !TextUtils.isEmpty(enterpriseTransformLayout.f102097h.getUid())) {
                if (enterpriseTransformLayout.mo82126b()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                for (int i2 = 0; i2 < enterpriseTransformLayout.f102094e.size(); i2++) {
                    String str2 = (String) enterpriseTransformLayout.f102094e.get(i2);
                    String str3 = (String) enterpriseTransformLayout.f102095f.get(i2);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        C26890h.m65008a(enterpriseTransformLayout.getContext(), "show_link", str, enterpriseTransformLayout.f102097h.getUid(), "0", EnterpriseTransformLayout.m89044a(str2));
                        C26890h.m65011a("show_link", C23089d.m56640a().mo47829a("author_id", enterpriseTransformLayout.f102097h.getUid()).mo47829a("enter_from", str).mo47829a("link_type", str2).f61491a);
                        if (TextUtils.equals(str2, "micro_app") || TextUtils.equals(str2, "micro_game")) {
                            String queryParameter = Uri.parse(str3).getQueryParameter("app_id");
                            IMiniAppService a = C36983a.m83185b().mo76294a();
                            if (TextUtils.equals(str2, "micro_app")) {
                                i = 1;
                            } else {
                                i = 2;
                            }
                            a.preloadMiniApp(queryParameter, i);
                            C26890h.m65011a("mp_show", C23089d.m56640a().mo47829a("mp_id", queryParameter).mo47829a("author_id", enterpriseTransformLayout.f102097h.getUid()).mo47829a("enter_from", str).mo47829a("position", "in_video_tag").mo47829a("_param_for_special", str2).f61491a);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo82156a(View view) {
        super.mo82156a(view);
        this.f102709I = (SwipableViewPager) view.findViewById(R.id.ci0);
        this.f102709I.setOffscreenPageLimit(2);
        this.f102715P = (EnterpriseTransformLayout) view.findViewById(R.id.c61);
        if (VERSION.SDK_INT >= 19) {
            this.f103064b.getLayoutParams().height = C11065a.m22390a((Context) getActivity());
        }
        this.f102718S = view.findViewById(R.id.bn2);
        this.f102718S.setOnClickListener(new C40221ag(this));
        this.f102717R = view.findViewById(R.id.bna);
        this.f102714O = (ImageView) view.findViewById(R.id.b0n);
        this.f102716Q = (ViewGroup) view.findViewById(R.id.yw);
        this.f102726aa = new AnalysisStayTimeFragmentComponent(this, mo82222p());
        this.f102726aa.f62564b = new C40222ah(this);
        if (C31357a.m73095a() && !this.f102739an) {
            this.f102707G = (ViewStub) view.findViewById(R.id.dt9);
            if (this.f102707G != null && this.f102708H == null) {
                this.f102708H = (FestivalHomePageView) this.f102707G.inflate();
                this.f102708H.setVisibility(8);
                this.f102708H.setOnClickListener(new C40230ap(this));
                this.f102707G = null;
            }
        }
        try {
            view.findViewById(R.id.d10).setOnTouchListener(C40229ao.f102762a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo81889a(UrlModel urlModel) {
        if (C23337c.m57398a()) {
            if (mo20100Z_() && urlModel != null && this.f103081w != null && !this.f102729ad && getUserVisibleHint()) {
                UrlModel avatarVideoUri = this.f103081w.getAvatarVideoUri();
                if (avatarVideoUri == null || avatarVideoUri.getUrlList() == null || avatarVideoUri.getUrlList().size() <= 0) {
                    this.f102738am = urlModel;
                    C23515d.m57672a((RemoteImageView) this.f102706F, urlModel, (C13791d<C14045f>) new C13790c<C14045f>() {
                        public final void onFailure(String str, Throwable th) {
                            super.onFailure(str, th);
                            C40212af.this.f102729ad = false;
                        }
                    });
                } else if (mo82183A() || !C17417i.m42646a(this.f102738am, avatarVideoUri)) {
                    C23515d.m57673a((RemoteImageView) this.f102706F, avatarVideoUri, (C13791d<C14045f>) new C13790c<C14045f>() {
                        public final void onFailure(String str, Throwable th) {
                            super.onFailure(str, th);
                            C40212af.this.f102729ad = false;
                        }

                        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                            C14045f fVar = (C14045f) obj;
                            C40212af.this.mo82461v();
                        }
                    }, false);
                    this.f102738am = avatarVideoUri;
                }
                this.f102729ad = true;
            }
            return;
        }
        if (!(!mo20100Z_() || urlModel == null || this.f103081w == null)) {
            UrlModel avatarVideoUri2 = this.f103081w.getAvatarVideoUri();
            if (avatarVideoUri2 == null || avatarVideoUri2.getUrlList() == null || avatarVideoUri2.getUrlList().size() <= 0) {
                this.f102738am = urlModel;
                C23515d.m57669a((RemoteImageView) this.f102706F, urlModel);
            } else if (mo82183A() || !C17417i.m42646a(this.f102738am, avatarVideoUri2)) {
                C23515d.m57673a((RemoteImageView) this.f102706F, avatarVideoUri2, (C13791d<C14045f>) new C13790c<C14045f>() {
                    public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                        C14045f fVar = (C14045f) obj;
                        C40212af.this.mo82461v();
                    }
                }, false);
                this.f102738am = avatarVideoUri2;
            }
        }
    }

    /* renamed from: a */
    public void mo50607a(float f, float f2) {
        if (isViewValid() && this.f103067e != null && !this.f103067e.isEmpty() && this.f103065c != null) {
            this.f103065c.setCanScrollUp(true);
        }
    }

    /* renamed from: b */
    public final void mo50613b(int i, int i2) {
        if (this.f102732ag == 0.0f) {
            this.f102732ag = (float) (this.f103075q.getBottom() - this.f103065c.getTabsMarginTop());
        }
        if (this.f103067e != null && !this.f103067e.isEmpty() && this.f103065c != null) {
            this.f103065c.setCanScrollUp(true);
        }
    }

    /* renamed from: a */
    public void mo81887a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f103074p.setVisibility(8);
            return;
        }
        this.f103074p.setVisibility(0);
        if (!C47915gg.m103664m(this.f103081w) || !C47915gg.m103651b()) {
            super.mo81887a(i, str);
        } else {
            this.f103074p.setText(R.string.dk1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo82447a(String str, long j, int i) throws Exception {
        ((C23215at) new C23215at().mo48016b(str).mo48015a(String.valueOf(j)).mo48100j(mo82453j(i))).mo48076e();
        return null;
    }
}
