package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.app.C0643c;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p125a.C2667b;
import com.bytedance.p125a.C2669d;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23396j;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24529c;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24633ag;
import com.p683ss.android.ugc.aweme.commercialize.log.C26065bb;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26843i;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1593e.C26866a;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26990b.C26991a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30316ah;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23212ar;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.p1402b.C23344b;
import com.p683ss.android.ugc.aweme.p1462bq.C23955a;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.C39938k;
import com.p683ss.android.ugc.aweme.profile.adapter.C39739a;
import com.p683ss.android.ugc.aweme.profile.adapter.C39740b;
import com.p683ss.android.ugc.aweme.profile.adapter.C39741c;
import com.p683ss.android.ugc.aweme.profile.experiment.C39868b;
import com.p683ss.android.ugc.aweme.profile.experiment.EmptyProfilePostGuideProgress;
import com.p683ss.android.ugc.aweme.profile.experiment.ShowPrivateAlbumExp;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p683ss.android.ugc.aweme.profile.model.PostGuideTasks;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40200a.C40202b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq.C40267a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq.C40269c;
import com.p683ss.android.ugc.aweme.profile.presenter.C39958b;
import com.p683ss.android.ugc.aweme.profile.presenter.C39961d;
import com.p683ss.android.ugc.aweme.profile.presenter.C39989v;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.profile.service.C40014g;
import com.p683ss.android.ugc.aweme.profile.service.C40025r;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.service.C40027t;
import com.p683ss.android.ugc.aweme.profile.util.C40542c;
import com.p683ss.android.ugc.aweme.profile.util.C40548i;
import com.p683ss.android.ugc.aweme.profile.util.C40555n;
import com.p683ss.android.ugc.aweme.profile.util.ProfileFavoriteUndiggOptimizeSetting;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListViewModel;
import com.p683ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter;
import com.p683ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p683ss.android.ugc.aweme.setting.C41632l;
import com.p683ss.android.ugc.aweme.setting.p2148ui.C41873ba;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47729bp;
import com.p683ss.android.ugc.aweme.utils.C47896fq;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.views.C48201l;
import com.p683ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.c */
public class C40280c extends C40200a implements C24579d, C26846a, C26872d<C39741c>, C26877c<Aweme>, C26878d<Aweme>, C26991a, C30462o, C40271bs {

    /* renamed from: A */
    View f102822A;

    /* renamed from: B */
    public View f102823B;

    /* renamed from: C */
    C1690c f102824C;

    /* renamed from: D */
    protected ProfileViewModel f102825D;

    /* renamed from: E */
    protected C26866a f102826E;

    /* renamed from: F */
    C40269c f102827F;

    /* renamed from: J */
    private DmtTextView f102828J;

    /* renamed from: K */
    private String f102829K;

    /* renamed from: L */
    private String f102830L;

    /* renamed from: M */
    private String f102831M;

    /* renamed from: O */
    private C1690c f102832O;

    /* renamed from: P */
    private int f102833P;

    /* renamed from: Q */
    private boolean f102834Q;

    /* renamed from: R */
    private boolean f102835R;

    /* renamed from: S */
    private boolean f102836S;

    /* renamed from: T */
    private boolean f102837T;

    /* renamed from: U */
    private Aweme f102838U;

    /* renamed from: V */
    private String f102839V;

    /* renamed from: W */
    private boolean f102840W;

    /* renamed from: X */
    private boolean f102841X;

    /* renamed from: Y */
    private boolean f102842Y;

    /* renamed from: Z */
    private ViewStub f102843Z;

    /* renamed from: aa */
    private Boolean f102844aa;

    /* renamed from: ab */
    private final C40241b f102845ab = new C40241b(this);

    /* renamed from: ac */
    private String f102846ac;

    /* renamed from: ad */
    private String f102847ad;

    /* renamed from: ae */
    private String f102848ae;

    /* renamed from: af */
    private boolean f102849af;

    /* renamed from: ag */
    private boolean f102850ag;

    /* renamed from: ah */
    private DraftListener f102851ah = new DraftListenerAdapter() {
        public final void onDraftClean() {
            if (C40280c.this.f102857j && C40280c.this.f102856e == 0) {
                C40280c.this.mo82539o();
                C40280c.this.mo82553y();
            }
        }

        public final void onDraftUpdate(C29059c cVar) {
            if (C40280c.this.f102857j && C40280c.this.f102856e == 0) {
                C40280c.this.mo82529a(cVar);
                C40280c.this.mo82552x();
            }
        }

        public final void onDraftDelete(C29059c cVar) {
            if (C40280c.this.f102857j && C40280c.this.f102856e == 0) {
                IAVDraftService draftService = AVExternalServiceImpl.getAVServiceImpl_Monster().draftService();
                C0013i.m18a((Callable<TResult>) new C40389q<TResult>(this, draftService), (Executor) draftService.executor());
            }
        }
    };

    /* renamed from: ai */
    private boolean f102852ai = false;

    /* renamed from: b */
    protected User f102853b;

    /* renamed from: c */
    protected String f102854c;

    /* renamed from: d */
    protected String f102855d;

    /* renamed from: e */
    protected int f102856e;

    /* renamed from: j */
    protected boolean f102857j;

    /* renamed from: k */
    protected boolean f102858k;

    /* renamed from: l */
    protected int f102859l = -1;

    /* renamed from: m */
    protected RecyclerView f102860m;

    /* renamed from: n */
    protected C39740b f102861n;

    /* renamed from: o */
    protected WrapGridLayoutManager f102862o;

    /* renamed from: p */
    public C26876b<C26875a> f102863p;

    /* renamed from: q */
    protected DmtStatusView f102864q;

    /* renamed from: r */
    protected C40267a f102865r;

    /* renamed from: s */
    protected boolean f102866s = true;

    /* renamed from: t */
    protected C10719a f102867t;

    /* renamed from: u */
    protected boolean f102868u;

    /* renamed from: v */
    protected boolean f102869v = true;

    /* renamed from: w */
    public boolean f102870w;

    /* renamed from: x */
    protected ViewStub f102871x;

    /* renamed from: y */
    protected View f102872y;

    /* renamed from: z */
    protected boolean f102873z;

    /* renamed from: H */
    private void m89562H() {
    }

    /* renamed from: b */
    private static boolean m89585b(int i) {
        return i == 4;
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo50463a(C26882h hVar) {
        return false;
    }

    public final void aS_() {
    }

    public final void aU_() {
        ar_();
    }

    public final boolean aW_() {
        return this.f102850ag;
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<Aweme> list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo82513j() {
        return R.layout.bot;
    }

    /* renamed from: a */
    public final void mo82501a(String str) {
        this.f102847ad = str;
    }

    /* renamed from: a */
    public final void mo82499a(DmtStatusView dmtStatusView) {
        this.f102849af = true;
        this.f102864q = dmtStatusView;
    }

    /* renamed from: a */
    public final void mo82529a(C29059c cVar) {
        if (this.f102861n != null) {
            C39740b bVar = this.f102861n;
            if (!bVar.f101425C) {
                bVar.f101441i = cVar;
                bVar.f101437e = true;
                bVar.notifyDataSetChanged();
            }
        }
        if (this.f102864q != null && !this.f102864q.mo19215i()) {
            this.f102864q.mo19209d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82530a(FeedItemList feedItemList) throws Exception {
        if (C9376b.m18558a((Collection<T>) feedItemList.getItems())) {
            mo82510w();
            return;
        }
        C39958b bVar = (C39958b) this.f102863p.mo54803n();
        Message obtainMessage = bVar.mHandler.obtainMessage(0);
        obtainMessage.obj = feedItemList;
        bVar.handleMsg(obtainMessage);
        if (C40390r.m89731a(getActivity())) {
            mo82510w();
        } else {
            this.f102866s = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo82528a(IAVDraftService iAVDraftService) throws Exception {
        try {
            C40010c.f101950a.mo82022a();
            final List draftList = iAVDraftService.draftList(false);
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    if (C9376b.m18558a((Collection<T>) draftList)) {
                        C40280c.this.mo82539o();
                    } else {
                        C40280c.this.mo82529a((C29059c) draftList.get(draftList.size() - 1));
                    }
                }
            });
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo53807a(String str, String str2) {
        if (!TextUtils.equals(this.f102854c, str) && !TextUtils.equals(this.f102855d, str2)) {
            this.f102866s = true;
        }
        this.f102854c = str;
        this.f102855d = str2;
        if (this.f102861n != null) {
            C39740b bVar = this.f102861n;
            String str3 = this.f102854c;
            String str4 = this.f102855d;
            bVar.f101423A = str3;
            bVar.f101424B = str4;
        }
        if (this.f102856e == 0 && !this.f102857j && this.f102863p != null) {
            ((C39989v) this.f102863p).f101924a = this.f102854c;
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<Aweme> list, boolean z) {
        if (isViewValid()) {
            this.f102861n.mo54798c(true);
            if (getTag() != null && this.f102854c != null && this.f102854c.equals(C40202b.f102680b) && getTag().endsWith(Integer.toString(0)) && C40202b.m89427a() > 0) {
                C0013i.m16a((Callable<TResult>) new C40387o<TResult>(C40202b.f102681c, C40202b.m89427a()));
                C40202b.f102679a = 0;
                C40202b.f102680b = null;
                String str = "";
                C52711k.m112240b(str, "<set-?>");
                C40202b.f102681c = str;
            }
            this.f102869v = true;
            this.f102864q.mo19208c(true);
            this.f102861n.ao_();
            this.f102861n.f101446y = z;
            if (this.f102838U != null && this.f102838U.getVideo() != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Aweme aweme = (Aweme) it.next();
                    if (aweme.getAid() != null && aweme.getAid().equals(this.f102838U.getAid()) && aweme.getVideo() != null) {
                        aweme.getVideo().setCover(this.f102838U.getVideo().getCover());
                        aweme.getVideo().setDynamicCover(this.f102838U.getVideo().getDynamicCover());
                        break;
                    }
                }
            }
            this.f102861n.mo50303a(list);
            if (this.f102857j && TextUtils.equals(this.f102925H, C47896fq.m103601a(1)) && !((Boolean) C23183v.m56778a().mo47910f().mo47782d()).booleanValue() && !((Boolean) C23183v.m56778a().mo47906b().mo47782d()).booleanValue() && this.f102822A != null && this.f102861n.mo48636c() != 0 && !this.f102836S) {
                this.f102822A.setVisibility(0);
            }
            if (!(list == null || list.isEmpty() || this.f102865r == null)) {
                this.f102865r.mo82253b(this.f102857j, this.f102856e);
            }
            this.f102850ag = z;
            mo47019a(z);
            if (!this.f102857j) {
                C2667b.m7667b("profile", C2669d.m7669a(this.f102925H), 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        if (!z) {
            this.f102861n.mo54788a((C26846a) null);
            this.f102861n.mo54798c(false);
            return;
        }
        m89570P();
    }

    /* renamed from: a */
    private boolean m89584a(Aweme aweme) {
        List<Aweme> list = this.f102861n.f70670n;
        if (list != null) {
            for (Aweme aweme2 : list) {
                if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo82502a(boolean z, boolean z2) {
        if (C23729p.m58267b(getView()) && this.f102826E != null) {
            this.f102826E.mo54826a(z, z2);
        }
    }

    /* renamed from: a */
    public final void mo50347a(View view, Aweme aweme, String str) {
        if (!(C32800a.m75679a(view) || aweme == null || getActivity() == null)) {
            if (!this.f102834Q) {
                C31213v.m72896a((C26875a) this.f102863p.mo54803n());
                if (!C40390r.m89731a(getContext())) {
                    C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
                    return;
                }
                if (m89585b(this.f102856e)) {
                    str = "collection_video";
                } else if (this.f102856e == 14 && !C39868b.m88638a()) {
                    str = "privacy_album";
                }
                Bundle bundle = new Bundle();
                bundle.putString("id", aweme.getAid());
                bundle.putString("video_from", this.f102857j ? "from_profile_self" : "from_profile_other");
                bundle.putInt("video_type", this.f102856e);
                bundle.putString("userid", this.f102854c);
                bundle.putString("sec_userid", this.f102855d);
                bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                bundle.putString("enter_method", this.f102829K);
                bundle.putString("like_enter_method", this.f102830L);
                bundle.putString("content_source", this.f102831M);
                bundle.putString("refer", str);
                bundle.putString("previous_page", this.f102847ad);
                bundle.putString("extra_previous_page_position", this.f102848ae);
                bundle.putString("tab_name", this.f102925H);
                bundle.putString("enter_from_request_id", this.f102846ac);
                bundle.putString("feeds_aweme_id", this.f102839V);
                bundle.putInt("from_post_list", this.f102856e == 0 ? 1 : 0);
                if (!(((C26875a) this.f102863p.mo54803n()).getData() == null || !(((C26875a) this.f102863p.mo54803n()).getData() instanceof FeedItemList) || ((FeedItemList) ((C26875a) this.f102863p.mo54803n()).getData()).logPb == null)) {
                    bundle.putString("impr_id", ((FeedItemList) ((C26875a) this.f102863p.mo54803n()).getData()).logPb.getImprId());
                }
                if (view == null) {
                    SmartRouter.buildRoute((Context) getActivity(), "aweme://aweme/detail/").withParam(bundle).open();
                } else {
                    SmartRouter.buildRoute((Context) getActivity(), "aweme://aweme/detail/").withParam(bundle).withBundleAnimation(C0643c.m1729b(view, 0, 0, view.getWidth(), view.getHeight()).mo2171a()).open();
                }
                C30179b.m70792a(aweme);
                if (m89585b(this.f102856e)) {
                    C26890h.m65011a("click_personal_collection", C23089d.m56640a().mo47829a("enter_from", "collection_video").mo47829a(C42311c.f106865i, "video").mo47829a("video_id", aweme.getAid()).f61491a);
                }
            } else if (aweme.isInReviewing() || aweme.isSelfSee()) {
                C10691a.m21533a((Context) getActivity(), (int) R.string.cym).mo19066a();
            } else {
                C40026s.f101964a.launchProfileCoverCropActivity(getActivity(), aweme);
            }
        }
    }

    /* renamed from: a */
    public final void mo50461a(List list, int i) {
        if (isViewValid() && !C9376b.m18558a((Collection<T>) list)) {
            if (this.f102861n.f101437e) {
                i++;
            }
            if (this.f102861n.mo80833g() == 0) {
                this.f102861n.mo50303a(list);
                this.f102864q.setVisibility(4);
            } else {
                if (C40026s.f101964a.shouldUseRecyclerPartialUpdate()) {
                    this.f102861n.notifyItemInserted(i);
                } else {
                    this.f102861n.mo50303a(list);
                }
                if (this.f102860m != null) {
                    this.f102860m.post(new C40388p(this));
                }
            }
            if (this.f102865r != null) {
                this.f102865r.mo82253b(this.f102857j, this.f102856e);
            }
        }
    }

    /* renamed from: a */
    public final void mo82532a(User user) {
        this.f102853b = user;
        if (!this.f102857j && !C47915gg.m103651b() && this.f102856e == 1) {
            Context context = getContext();
            boolean z = this.f102852ai;
            if (this.f102828J != null) {
                this.f102828J.setGravity(17);
                this.f102828J.setText(m89586h(z));
                this.f102828J.setLineSpacing(C9432q.m18687b(context, 12.0f), 1.0f);
                if (context != null) {
                    this.f102828J.setTextColor(context.getResources().getColor(R.color.a19));
                }
            }
        }
        m89562H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DmtTextView mo82526a(final Context context, boolean z) {
        String str;
        String str2;
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.tf));
        if (z) {
            str = getString(R.string.cze);
        } else {
            str = getString(R.string.cz8);
        }
        if (z) {
            str2 = getString(R.string.czd);
        } else {
            str2 = getString(R.string.czg);
        }
        if (z) {
            str2 = C2240a.m6772a(str2, new Object[]{getString(R.string.czc)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        sb.append(str2);
        String sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
        if (context != null) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, str.length(), 18);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.a17)), 0, str.length(), 18);
            String string = getString(R.string.czc);
            if (z) {
                int indexOf = sb2.indexOf(string);
                int length = string.length() + indexOf;
                if (indexOf >= 0 && length >= 0) {
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }

                        public final void onClick(View view) {
                            SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                        }
                    }, indexOf, length, 18);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.ja)), indexOf, length, 18);
                }
                dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            dmtTextView.setTextColor(context.getResources().getColor(R.color.a19));
        }
        dmtTextView.setGravity(17);
        dmtTextView.setText(spannableStringBuilder);
        dmtTextView.setLineSpacing(C9432q.m18687b(context, 12.0f), 1.0f);
        return dmtTextView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82531a(MediaMixList mediaMixList) throws Exception {
        if (C9376b.m18558a((Collection<T>) mediaMixList.mixInfos)) {
            this.f102861n.mo80830a(false, (MediaMixList) null);
        } else {
            this.f102861n.mo80830a(true, mediaMixList);
        }
    }

    /* renamed from: V */
    private static boolean m89576V() {
        return C39868b.m88638a();
    }

    /* renamed from: I */
    private int m89563I() {
        return m89577a(this.f102835R, this.f102837T, this.f102857j, this.f102856e);
    }

    /* renamed from: J */
    private void m89564J() {
        if (this.f102872y != null) {
            this.f102872y.setVisibility(4);
        }
    }

    /* renamed from: L */
    private void m89566L() {
        if (m89568N()) {
            this.f102864q.mo19212f();
        }
    }

    /* renamed from: R */
    private boolean m89572R() {
        if (!this.f102857j || this.f102856e != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public final /* synthetic */ void mo82525G() {
        this.f102860m.mo4814b(0);
        if (this.f102826E != null) {
            this.f102826E.mo54826a(false, false);
        }
    }

    public final boolean aT_() {
        if (!this.f102866s || this.f102837T || this.f102835R) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final View mo50471l() {
        if (!isViewValid()) {
            return null;
        }
        return this.f102860m;
    }

    /* renamed from: o */
    public final void mo82539o() {
        if (this.f102861n != null) {
            C39740b bVar = this.f102861n;
            bVar.f101437e = false;
            bVar.f101441i = null;
            bVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo82547q() {
        this.f102862o = new WrapGridLayoutManager((Context) getActivity(), 3, 1, false);
    }

    /* renamed from: z */
    public final void mo82511z() {
        if (this.f102826E != null) {
            this.f102826E.mo54825a();
        }
    }

    /* renamed from: K */
    private void m89565K() {
        if (this.f102857j && this.f102856e == 0) {
            IAVDraftService draftService = AVExternalServiceImpl.getAVServiceImpl_Monster().draftService();
            C0013i.m18a((Callable<TResult>) new C40386n<TResult>(this, draftService), (Executor) draftService.executor());
        }
    }

    /* renamed from: M */
    private boolean m89567M() {
        if (!this.f102857j || this.f102856e != 0 || (!this.f102861n.f101437e && !this.f102861n.mo80834j())) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    private boolean m89568N() {
        if (this.f102861n.getItemCount() != 0 || this.f102861n.f101437e) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private boolean m89571Q() {
        if (this.f102863p == null || !(this.f102863p.mo54803n() instanceof C39958b) || !((C39958b) this.f102863p.mo54803n()).mo81866c()) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public final void mo82496A() {
        if (this.f102864q != null && !this.f102864q.mo19215i()) {
            this.f102864q.setVisibility(0);
        }
    }

    /* renamed from: C */
    public final void mo82497C() {
        if (this.f102864q != null && this.f102864q.mo19215i()) {
            this.f102864q.setVisibility(4);
        }
    }

    /* renamed from: n */
    public final void mo82538n() {
        if (!this.f102835R && !this.f102837T && isViewValid()) {
            this.f102864q.setVisibility(4);
            mo82537k().setVisibility(0);
        }
    }

    public void onStop() {
        if (getUserVisibleHint()) {
            mo82511z();
        }
        try {
            if (isViewValid()) {
                m89582a(this.f102860m);
            }
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C1331h mo82548r() {
        return new C39739a((int) C9432q.m18687b(getContext(), 1.0f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final void mo82552x() {
        if (this.f102865r != null) {
            this.f102865r.mo82253b(this.f102857j, this.f102856e);
        }
        this.f102864q.setVisibility(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final void mo82553y() {
        if (this.f102861n.getItemCount() == 0) {
            this.f102864q.setVisibility(4);
            if (this.f102865r != null) {
                this.f102865r.mo82252a(this.f102857j, this.f102856e);
            }
        }
    }

    /* renamed from: P */
    private void m89570P() {
        if (m89571Q()) {
            String str = ((C39958b) this.f102863p.mo54803n()).f101865g;
            if (TextUtils.isEmpty(str)) {
                str = getString(R.string.h56);
            }
            this.f102861n.mo80832d(str);
            this.f102861n.mo54798c(true);
        }
    }

    /* renamed from: F */
    public final void mo82524F() {
        if (this.f102861n != null && this.f102825D != null) {
            this.f102861n.mo80833g();
            C10181b.m20511a().mo18168a(EmptyProfilePostGuideProgress.class, true, "empty_profile_guide", 31744, 0);
            C20854a.m53167g().getCurUser();
            this.f102861n.mo80829a((PostGuideTasks) null);
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid()) {
            boolean z = true;
            if (this.f102857j || (!TextUtils.equals(this.f102925H, C47896fq.m103601a(1)) && !C23729p.m58267b(getView()) && !this.f102870w)) {
                z = false;
            }
            if (z) {
                C2667b.m7663a("profile", C2669d.m7669a(this.f102925H), 0);
            }
            m89564J();
            m89566L();
        }
    }

    public void aV_() {
        if (isViewValid()) {
            if (this.f102835R || this.f102837T) {
                aJ_();
            } else if (this.f102864q == null || (!this.f102873z && !C40027t.f101966a.mo47103a())) {
                mo82551v();
            } else {
                mo82538n();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final View mo82537k() {
        if (this.f102872y == null) {
            this.f102872y = this.f102871x.inflate();
            if (C40027t.f101966a.mo47103a()) {
                ((TextView) this.f102872y.findViewById(R.id.title)).setText(R.string.dww);
                ((TextView) this.f102872y.findViewById(R.id.ze)).setText(R.string.dwl);
            }
        }
        return this.f102872y;
    }

    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            mo82511z();
        }
        try {
            if (isViewValid()) {
                m89582a(this.f102860m);
            }
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
        if (!this.f102857j) {
            C2667b.m7668c("profile", C2669d.m7669a(this.f102925H), 0);
        }
    }

    public void onStart() {
        super.onStart();
        try {
            if (this.f102861n != null) {
                this.f102861n.notifyDataSetChanged();
                if (m89585b(this.f102856e)) {
                    RecyclerView recyclerView = this.f102860m;
                    if (recyclerView != null) {
                        C40014g.f101956a.mo82039a(true);
                        recyclerView.post(C40379g.f103043a);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo82550u() {
        if (this.f102856e != 0 || this.f102857j) {
            this.f102863p = new C26876b<>();
        } else {
            this.f102863p = new C39989v();
            ((C39989v) this.f102863p).f101924a = this.f102854c;
        }
        this.f102863p.mo54800a(this);
        this.f102863p.mo54838a((C26878d) this);
        C39958b bVar = new C39958b();
        bVar.f101862d = this.f102834Q;
        this.f102863p.mo54799a(bVar);
    }

    /* renamed from: T */
    private void m89574T() {
        int i;
        if (!(this.f102863p == null || this.f102863p.mo54803n() == null || ((C26875a) this.f102863p.mo54803n()).getItems() == null)) {
            List items = ((C26875a) this.f102863p.mo54803n()).getItems();
            if (items != null) {
                Iterator it = items.iterator();
                i = 0;
                while (it.hasNext() && ((Aweme) it.next()).isTop()) {
                    i++;
                }
                if (this.f102838U == null && this.f102863p.mo54840a((Object) this.f102838U, i)) {
                    ((C39958b) this.f102863p.mo54803n()).mo81860a(this.f102838U, this.f102854c);
                    mo82502a(false, true);
                    this.f102864q.setVisibility(4);
                    if (this.f102865r != null) {
                        this.f102865r.mo82253b(this.f102857j, this.f102856e);
                    }
                    return;
                }
            }
        }
        i = 0;
        if (this.f102838U == null) {
        }
    }

    /* renamed from: U */
    private void m89575U() {
        if (this.f102856e != 0) {
            return;
        }
        if ((this.f102857j || !this.f102873z || this.f102833P == 1 || this.f102833P == 2) && C40025r.f101962a.mo76335b()) {
            if (this.f102832O != null) {
                this.f102832O.dispose();
            }
            this.f102832O = MediaMixListViewModel.m90014a(this.f102854c, this.f102855d).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C40380h<Object>(this), C40381i.f103045a);
        }
    }

    /* renamed from: D */
    public final void mo82523D() {
        boolean z;
        StringBuilder sb = new StringBuilder("clearData(), type is ");
        sb.append(this.f102856e);
        sb.append(", mAwemeAdapter null is ");
        if (this.f102861n == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C40548i.m89965a(sb.toString());
        if (this.f102861n != null) {
            this.f102861n.ao_();
            this.f102861n.mo54785f();
            this.f102866s = true;
            if (this.f102863p.mo54803n() != null) {
                FeedItemList feedItemList = (FeedItemList) ((C39958b) this.f102863p.mo54803n()).getData();
                if (feedItemList != null) {
                    feedItemList.maxCursor = 0;
                    feedItemList.items = null;
                    feedItemList.hasMore = 0;
                }
            }
        }
    }

    /* renamed from: E */
    public final ArrayList<Aweme> mo82498E() {
        if (this.f102861n == null || this.f102861n.f70670n == null || this.f102861n.f70670n.size() < 3) {
            return null;
        }
        ArrayList<Aweme> arrayList = new ArrayList<>();
        for (Aweme aweme : this.f102861n.f70670n) {
            if (aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0) {
                arrayList.add(aweme);
                if (arrayList.size() >= 3) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public final void ar_() {
        int i;
        int i2;
        if (this.f102857j) {
            int i3 = this.f102856e;
            if (this.f102861n == null || this.f102861n.mo50673a() == null) {
                i2 = 0;
            } else {
                i2 = this.f102861n.mo50673a().size();
            }
            C40542c.m89958a(i3, true, i2);
        }
        C26876b<C26875a> bVar = this.f102863p;
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(4);
        objArr[1] = Boolean.valueOf(true);
        objArr[2] = this.f102854c;
        objArr[3] = Integer.valueOf(this.f102856e);
        if (this.f102857j) {
            i = 1000;
        } else {
            i = 2000;
        }
        objArr[4] = Integer.valueOf(i);
        objArr[5] = this.f102855d;
        bVar.mo44934a_(objArr);
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            if (this.f102863p == null || !C40555n.f103479a.mo82824a(this.f102863p, this.f102856e)) {
                this.f102861n.am_();
                return;
            }
            String b = ((C39958b) this.f102863p.mo54803n()).mo81865b();
            C39740b bVar = this.f102861n;
            bVar.f101428F = b;
            if (bVar.f101426D != null) {
                bVar.mo80831c(bVar.f101428F);
                bVar.f101427E = Boolean.valueOf(false);
            } else {
                bVar.f101427E = Boolean.valueOf(true);
            }
            bVar.am_();
        }
    }

    public void onDestroyView() {
        if (m89572R()) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().unregisterListener(this.f102851ah);
        }
        super.onDestroyView();
        if (this.f102863p != null) {
            this.f102863p.mo46991S_();
        }
        C26065bb.m63156a().f68836a.clear();
        C26065bb.m63156a().f68837b = false;
        if (this.f102861n != null) {
            this.f102861n.mo54785f();
        }
        if (this.f102832O != null) {
            this.f102832O.dispose();
        }
        if (this.f102824C != null) {
            this.f102824C.dispose();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo82551v() {
        if (!this.f102857j || this.f102856e != 0 || !MainServiceImpl.createIMainServicebyMonsterPlugin().isMainPage(getContext())) {
            mo82510w();
        } else {
            if (TextUtils.isEmpty(this.f102854c)) {
                this.f102854c = C20854a.m53167g().getCurUserId();
            }
            if (TextUtils.isEmpty(this.f102855d)) {
                this.f102855d = C20854a.m53167g().getCurSecUserId();
            }
            this.f102866s = false;
            ((C39958b) this.f102863p.mo54803n()).mo81859a(this.f102854c).mo6505a((C1710e<? super T>) new C40384l<Object>(this), (C1710e<? super Throwable>) new C40385m<Object>(this));
        }
        m89565K();
    }

    /* renamed from: S */
    private void m89573S() {
        int i;
        C26875a aVar = (C26875a) this.f102863p.mo54803n();
        if (aVar instanceof C39958b) {
            List items = ((C39958b) aVar).getItems();
            if (items == null) {
                i = 0;
            } else {
                i = items.size();
            }
            if (this.f102856e == 14) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    if (((Aweme) items.get(i2)).getStatus().getPrivateStatus() != 1) {
                        this.f102863p.mo54839a(items.get(i2));
                    }
                }
            } else if (this.f102856e == 0) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = i - 1; i3 >= 0; i3--) {
                    Aweme aweme = (Aweme) items.get(i3);
                    if (!aweme.isTop() && aweme.getStatus().getPrivateStatus() == 1) {
                        this.f102863p.mo54839a((Object) aweme);
                        arrayList.add(aweme);
                    }
                }
                ((C39958b) this.f102863p.mo54803n()).mo81862a((Collection<Aweme>) arrayList, this.f102854c);
            }
            this.f102861n.notifyDataSetChanged();
        }
    }

    public void aJ_() {
        if (isViewValid()) {
            boolean z = false;
            if (!this.f102857j) {
                C2667b.m7667b("profile", C2669d.m7669a(this.f102925H), 0);
            }
            if (((C26875a) this.f102863p.mo54803n()).isHasMore() && !this.f102837T && !this.f102835R) {
                ar_();
            }
            this.f102864q.mo19220n();
            if (!this.f102857j || this.f102856e != 0) {
                if (this.f102861n.f101442j != null) {
                    z = true;
                }
                if (z) {
                    this.f102864q.setVisibility(4);
                    return;
                }
                m89564J();
                if (!((C26875a) this.f102863p.mo54803n()).isHasMore()) {
                    m89569O();
                    this.f102864q.mo19213g();
                    if (this.f102822A != null) {
                        this.f102822A.setVisibility(8);
                    }
                    if (this.f102865r != null) {
                        this.f102865r.mo82252a(this.f102857j, this.f102856e);
                    }
                }
                return;
            }
            if (!C9376b.m18558a((Collection<T>) this.f102861n.mo50673a())) {
                this.f102861n.mo54785f();
            }
            if (this.f102861n.getItemCount() != 0 || this.f102861n.f101437e) {
                if (this.f102865r != null) {
                    this.f102865r.mo82253b(this.f102857j, this.f102856e);
                }
            } else if (this.f102865r != null && !((C26875a) this.f102863p.mo54803n()).isHasMore()) {
                this.f102865r.mo82252a(this.f102857j, this.f102856e);
            }
            this.f102864q.setVisibility(4);
        }
    }

    public final void aX_() {
        if (isViewValid()) {
            if (!getUserVisibleHint() || !C41632l.m91511a(getContext()) || !C40390r.m89731a(getActivity())) {
                mo82511z();
            } else {
                mo82502a(false, false);
            }
            if (getUserVisibleHint()) {
                RecyclerView recyclerView = this.f102860m;
                if (recyclerView != null) {
                    int childCount = recyclerView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        C1352v f = recyclerView.mo4847f(i);
                        if (f instanceof C39741c) {
                            C39741c.m88458a(recyclerView.getContext(), ((C39741c) f).mo54754d());
                        }
                    }
                }
                if (m89585b(this.f102856e)) {
                    RecyclerView recyclerView2 = this.f102860m;
                    List a = this.f102861n.mo50673a();
                    if (recyclerView2 != null) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
                        if (linearLayoutManager != null && !C9376b.m18558a((Collection<T>) a)) {
                            int l = linearLayoutManager.mo4751l();
                            for (int j = linearLayoutManager.mo4749j(); j <= l; j++) {
                                if (j >= 0 && j < a.size()) {
                                    Object obj = a.get(j);
                                    if (obj instanceof Aweme) {
                                        C40014g.f101956a.mo82038a((Aweme) obj);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo82514m() {
        int I = m89563I();
        this.f102867t = C10719a.m21676a(getContext());
        DmtTextView a = m89579a(getContext(), (int) R.string.c0e);
        a.setOnClickListener(new C40315d(this));
        this.f102867t.mo19234c((View) a);
        if (this.f102856e == 4) {
            Context context = getContext();
            DmtStatusView dmtStatusView = this.f102864q;
            C10719a aVar = this.f102867t;
            if (dmtStatusView != null) {
                LayoutParams layoutParams = (LayoutParams) dmtStatusView.getLayoutParams();
                layoutParams.topMargin = 0;
                layoutParams.width = -1;
                layoutParams.height = -1;
                dmtStatusView.setLayoutParams(layoutParams);
                MtEmptyView a2 = MtEmptyView.m21697a(context);
                a2.setStatus(new C10723a(context).mo19280b((int) R.string.b1d).mo19282c(R.string.b1c).mo19277a((int) R.drawable.dqq).f28711a);
                aVar.mo19231b((View) a2);
            }
        } else {
            try {
                if (!this.f102857j || this.f102856e != 1) {
                    if (this.f102857j || this.f102856e != 1) {
                        this.f102867t.mo19231b((View) m89579a(getContext(), I));
                    } else if (C47915gg.m103651b()) {
                        this.f102867t.mo19231b((View) m89579a(getContext(), I));
                    } else {
                        this.f102867t.mo19231b((View) mo82533b(getContext(), false));
                    }
                } else if (C47915gg.m103651b()) {
                    this.f102867t.mo19231b((View) m89579a(getContext(), I));
                } else if (((Integer) C23183v.m56778a().mo47909e().mo47782d()).intValue() == 0) {
                    this.f102867t.mo19231b((View) mo82526a(getContext(), false));
                } else {
                    this.f102867t.mo19231b((View) mo82526a(getContext(), true));
                }
            } catch (Exception unused) {
            }
        }
        this.f102864q.setBuilder(this.f102867t);
    }

    public void onResume() {
        super.onResume();
        if (this.f102857j && TextUtils.equals(this.f102925H, C47896fq.m103601a(1)) && ((((Boolean) C23183v.m56778a().mo47910f().mo47782d()).booleanValue() || this.f102861n.mo48636c() == 0 || ((Boolean) C23183v.m56778a().mo47906b().mo47782d()).booleanValue()) && this.f102822A != null && this.f102822A.getVisibility() == 0)) {
            this.f102822A.setVisibility(8);
            this.f102836S = true;
        }
        if (ShowPrivateAlbumExp.m88630a() && this.f102856e == 0) {
            getContext();
            if (!(!((C39938k) C23396j.m57478a(C11010c.m22280a(), C39938k.class)).mo48467a(false)) && this.f102823B != null && this.f102823B.getVisibility() == 0) {
                this.f102823B.setVisibility(8);
            }
        }
        if (getUserVisibleHint() && !C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
            mo82502a(false, true);
        }
        if (this.f102841X) {
            this.f102841X = false;
            m89573S();
        }
        if (this.f102842Y) {
            this.f102842Y = false;
            m89573S();
            mo82510w();
        }
        mo82524F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo82515p() {
        C24633ag agVar;
        String str;
        this.f102860m.setOverScrollMode(2);
        mo82547q();
        this.f102860m.setLayoutManager(this.f102862o);
        this.f102860m.mo4798a(mo82548r());
        if (!C23337c.m57398a()) {
            agVar = new C24633ag();
            this.f102860m.mo4801a((C1340m) agVar);
        } else {
            agVar = null;
        }
        this.f102826E = new C26866a(this.f102860m, agVar);
        this.f102860m = C40026s.f101964a.buildBaseRecyclerView(this.f102860m, this);
        if (this.f102857j) {
            str = "my_profile";
        } else {
            str = "user_profile";
        }
        C47729bp.m103326a(str).mo95020a(this.f102860m);
        mo82549s();
        this.f102860m.setAdapter(this.f102861n);
        mo82550u();
        if (((this.f102857j && this.f102856e == 0) || this.f102868u || this.f102924G) && !C40027t.f101966a.mo47103a()) {
            mo82551v();
        }
        if (this.f102859l > 0) {
            this.f102860m.setPadding(0, 0, 0, this.f102859l);
        }
        if (this.f102840W) {
            m89574T();
        }
        m89562H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo82549s() {
        String str;
        FragmentActivity activity = getActivity();
        if (this.f102857j || this.f102856e == 4) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C39740b bVar = new C39740b(activity, str, this.f102857j, this.f102856e, this, this, this.f102854c, this.f102855d);
        this.f102861n = bVar;
        this.f102861n.mo54788a((C26846a) this);
        this.f102861n.f101439g = this.f102858k;
        this.f102861n.f101425C = this.f102834Q;
        if (this.f102856e == 0) {
            this.f102861n.f70686w = new C1302b() {
                /* renamed from: a */
                public final int mo4690a(int i) {
                    int a = C40280c.this.f102861n.mo48641a(i);
                    if (a == 4 || a == 5) {
                        return C40280c.this.f102862o.f4521b;
                    }
                    return 1;
                }
            };
        }
        if (this.f102857j && this.f102856e == 0) {
            if (C10181b.m20511a().mo18168a(EmptyProfilePostGuideProgress.class, true, "empty_profile_guide", 31744, 0) == 0) {
                this.f102825D.mo82944a(false);
                return;
            }
            this.f102825D.mo82947g(new C40366e(this));
            this.f102825D.mo82948h(new C40382j(this));
            this.f102825D.mo82949i(new C40383k(this));
            this.f102861n.registerAdapterDataObserver(new C1324c() {
                /* renamed from: a */
                public final void mo4984a() {
                    C40280c.this.mo82524F();
                }

                /* renamed from: b */
                public final void mo4988b(int i, int i2) {
                    C40280c.this.mo82524F();
                }

                /* renamed from: c */
                public final void mo4989c(int i, int i2) {
                    C40280c.this.mo82524F();
                }
            });
        }
    }

    /* renamed from: t */
    public final void mo59991t() {
        boolean z;
        if (this.f102863p == null || this.f102863p.mo54803n() == null || C40027t.f101966a.mo47103a()) {
            C32458a.m75141a(5, "AwemeListFragment", "syncData() NOT executed");
            return;
        }
        C40548i.m89965a("syncData() start");
        List items = ((C26875a) this.f102863p.mo54803n()).getItems();
        HashSet hashSet = new HashSet();
        boolean z2 = false;
        if (items == null || items.size() <= 0) {
            z = false;
        } else {
            Iterator it = items.iterator();
            z = false;
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                int i = this.f102856e;
                if (i != 1) {
                    if (i == 4 && (aweme == null || !aweme.isCollected())) {
                        it.remove();
                    }
                } else if (aweme == null || !aweme.isLike()) {
                    it.remove();
                    if (aweme != null) {
                        hashSet.add(aweme.getAid());
                    }
                }
                z = true;
            }
        }
        if (z && this.f102861n != null) {
            StringBuilder sb = new StringBuilder("notifyDataSetChanged() called in syncData(), removed aids = ");
            sb.append(hashSet);
            C40548i.m89965a(sb.toString());
            this.f102861n.notifyDataSetChanged();
        }
        if (!this.f102864q.mo19217k()) {
            if (isViewValid() && this.f102861n != null && this.f102861n.getItemCount() == 0) {
                z2 = true;
            }
            if (z2) {
                aJ_();
            }
            this.f102863p.mo44838b();
        }
    }

    /* renamed from: w */
    public final boolean mo82510w() {
        int i;
        if (!isViewValid() || C40027t.f101966a.mo47103a()) {
            return false;
        }
        if (!C40390r.m89731a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            if (m89567M()) {
                this.f102864q.mo19214h();
            } else {
                this.f102864q.mo19209d();
            }
            this.f102866s = true;
            return false;
        }
        m89566L();
        boolean z = !this.f102863p.mo54804o();
        if (this.f102857j && TextUtils.isEmpty(this.f102854c)) {
            this.f102854c = C20854a.m53167g().getCurUserId();
        }
        if (this.f102857j && TextUtils.isEmpty(this.f102855d)) {
            this.f102855d = C20854a.m53167g().getCurSecUserId();
        }
        if (!TextUtils.isEmpty(this.f102854c)) {
            if (this.f102857j) {
                C40542c.m89958a(this.f102856e, false, 0);
            }
            C40542c.m89956a(this.f102856e, this.f102854c);
            C26876b<C26875a> bVar = this.f102863p;
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(1);
            objArr[1] = Boolean.valueOf(true);
            objArr[2] = this.f102854c;
            objArr[3] = Integer.valueOf(this.f102856e);
            if (this.f102857j) {
                i = 1000;
            } else {
                i = 2000;
            }
            objArr[4] = Integer.valueOf(i);
            objArr[5] = this.f102855d;
            bVar.mo44934a_(objArr);
            this.f102866s = false;
            m89575U();
        }
        return z;
    }

    /* renamed from: O */
    private void m89569O() {
        if (!this.f102849af) {
            int I = m89563I();
            if (!(I == 0 || this.f102867t == null || this.f102864q == null)) {
                this.f102864q.mo19209d();
                if (m89571Q()) {
                    String str = ((C39958b) this.f102863p.mo54803n()).f101865g;
                    if (TextUtils.isEmpty(str)) {
                        str = getString(R.string.h56);
                    }
                    DmtTextView a = m89580a(getContext(), str);
                    a.setTextSize(12.0f);
                    this.f102867t.mo19231b((View) a);
                    this.f102864q.setBuilder(this.f102867t);
                    return;
                }
                if (!this.f102857j || this.f102856e != 1) {
                    if (this.f102857j || this.f102856e != 1) {
                        if (C40555n.f103479a.mo82824a(this.f102863p, this.f102856e)) {
                            String b = ((C39958b) this.f102863p.mo54803n()).mo81865b();
                            if (!TextUtils.isEmpty(b)) {
                                this.f102867t.mo19231b((View) m89580a(getContext(), b));
                            } else {
                                this.f102867t.mo19231b((View) m89579a(getContext(), I));
                            }
                        } else {
                            this.f102867t.mo19231b((View) m89579a(getContext(), I));
                        }
                    } else if (C47915gg.m103651b()) {
                        this.f102867t.mo19231b((View) m89579a(getContext(), I));
                    } else {
                        this.f102867t.mo19231b((View) mo82533b(getContext(), false));
                    }
                } else if (C47915gg.m103651b()) {
                    this.f102867t.mo19231b((View) m89579a(getContext(), I));
                } else if (((Integer) C23183v.m56778a().mo47909e().mo47782d()).intValue() == 0) {
                    this.f102867t.mo19231b((View) mo82526a(getContext(), false));
                } else {
                    this.f102867t.mo19231b((View) mo82526a(getContext(), true));
                }
                this.f102864q.setBuilder(this.f102867t);
            }
        }
    }

    /* renamed from: a */
    public final void mo82500a(C40267a aVar) {
        this.f102865r = aVar;
    }

    /* renamed from: b */
    public final void mo82503b(String str) {
        this.f102830L = str;
    }

    /* renamed from: c */
    public final void mo82504c(String str) {
        this.f102831M = str;
    }

    /* renamed from: c_ */
    public final void mo76536c_(boolean z) {
        this.f102873z = z;
    }

    /* renamed from: d */
    public final void mo82536d(String str) {
        this.f102839V = str;
    }

    /* renamed from: e */
    public final void mo82507e(boolean z) {
        this.f102868u = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo82527a(Boolean bool) {
        this.f102844aa = bool;
        mo82524F();
        return null;
    }

    /* renamed from: d */
    public final void mo82505d(boolean z) {
        this.f102858k = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C52860x mo82534b(User user) {
        mo82524F();
        return null;
    }

    /* renamed from: c */
    public void mo77335c(boolean z) {
        if (this.f102837T != z) {
            this.f102837T = z;
            m89569O();
            this.f102864q.mo19213g();
        }
    }

    /* renamed from: f */
    public final void mo82508f(boolean z) {
        if (this.f102861n != null) {
            this.f102861n.f101438f = z;
        }
    }

    @C53771m
    public void onDynamicEvent(C24529c cVar) {
        if (cVar.f64950a == 0) {
            mo82502a(true, false);
        } else {
            mo82511z();
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            mo82524F();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ C52860x mo82535b(Boolean bool) {
        if (!bool.booleanValue()) {
            mo82524F();
        }
        return null;
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        if (C40026s.f101964a.onAntiCrawlerEvent(aVar.f62554a)) {
            C47718bf.m103293f(aVar);
            mo82510w();
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (isViewValid() && this.f102861n != null) {
            this.f102861n.mo54773a(followStatus);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            if (this.f102861n.getItemCount() == 0) {
                this.f102864q.mo19209d();
                if (this.f102865r != null) {
                    this.f102865r.mo82252a(this.f102857j, this.f102856e);
                }
            }
            this.f102861n.mo54793i();
            C40542c.m89960a(this.f102856e, true, exc);
        }
    }

    @C53771m
    public void onPublishStatusUpdate(C43891e eVar) {
        if (eVar.f111148b == 9 && !C40027t.f101966a.mo47103a()) {
            m89565K();
        }
        if (eVar.f111148b == 2 && !C40027t.f101966a.mo47103a()) {
            m89565K();
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(C41873ba baVar) {
        if (this.f102857j && TextUtils.equals(this.f102925H, C47896fq.m103601a(1))) {
            m89569O();
            if (this.f102861n.getItemCount() != 0 || C40027t.f101966a.mo47103a()) {
                this.f102864q.setVisibility(4);
            } else {
                this.f102864q.mo19213g();
            }
        }
    }

    /* renamed from: b */
    public void mo77334b(boolean z) {
        if (this.f102835R != z) {
            if (this.f102873z) {
                m89564J();
            }
            this.f102835R = z;
            m89569O();
            this.f102864q.mo19213g();
        }
    }

    /* renamed from: c_ */
    public final void mo50466c_(int i) {
        if (isViewValid()) {
            if (this.f102861n.f101437e) {
                i++;
            }
            if (i <= this.f102861n.getItemCount() || i == 0) {
                this.f102861n.notifyItemRemoved(i);
                if (this.f102861n.mo48636c() == 0) {
                    if (this.f102856e == 1) {
                        m89569O();
                        this.f102864q.mo19213g();
                    } else if (this.f102856e == 14) {
                        this.f102864q.mo19213g();
                    } else {
                        this.f102864q.setVisibility(4);
                    }
                    if (this.f102865r != null) {
                        this.f102865r.mo82252a(this.f102857j, this.f102856e);
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getParentFragment() != null) {
            this.f102825D = ProfileViewModel.m90030a(getParentFragment());
        }
        Bundle arguments = getArguments();
        this.f102856e = arguments.getInt("type");
        String string = arguments.getString("uid");
        String string2 = arguments.getString("sec_user_id");
        if (!TextUtils.isEmpty(string)) {
            this.f102854c = string;
        }
        if (!TextUtils.isEmpty(string2)) {
            this.f102855d = string2;
        }
        this.f102834Q = arguments.getBoolean("is_choose_video_cover", false);
        this.f102857j = arguments.getBoolean("is_my_profile");
        this.f102859l = arguments.getInt("bottom_bar_height");
        this.f102868u = arguments.getBoolean("should_refresh_on_init_data", false);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        boolean z2 = true;
        if (!z) {
            mo82511z();
            if (!this.f102857j) {
                C2667b.m7668c("profile", C2669d.m7669a(this.f102925H), 0);
            }
        } else if (isViewValid() && this.f102860m != null && this.f102861n != null && !this.f102861n.f101439g) {
            this.f102861n.f101439g = true;
            int childCount = this.f102860m.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1352v f = this.f102860m.mo4847f(i);
                if (f instanceof C39741c) {
                    C39741c cVar = (C39741c) f;
                    cVar.mo50301a();
                    mo50455a(cVar);
                }
            }
        }
        C26065bb a = C26065bb.m63156a();
        if (this.f102856e != 0) {
            z2 = false;
        }
        a.f68837b = z2;
        if (m89585b(this.f102856e) && this.f102861n != null) {
            this.f102861n.f101445m = z;
        }
    }

    /* renamed from: h */
    private SpannableStringBuilder m89586h(boolean z) {
        String str;
        String str2;
        if (getContext() == null) {
            return null;
        }
        if (z) {
            str = getContext().getString(R.string.cz5);
        } else {
            str = getContext().getString(R.string.cz8);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        String sb2 = sb.toString();
        if (z) {
            str2 = getContext().getString(R.string.cz4);
        } else {
            str2 = getContext().getString(R.string.cz6);
        }
        String a = C2240a.m6772a(str2, new Object[]{C47915gg.m103656e(this.f102853b)});
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb3.toString());
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, sb2.length() - 1, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, sb2.length() - 1, 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a17)), 0, sb2.length(), 18);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        boolean z;
        if (isViewValid()) {
            if (!m89567M()) {
                if (!this.f102857j && 1 == this.f102856e && this.f102827F != null) {
                    this.f102827F.mo82490a(false);
                }
                this.f102864q.mo19209d();
            } else if (this.f102857j || 1 != this.f102856e) {
                this.f102864q.mo19214h();
            } else {
                if (!(exc instanceof C23459a) || ((C23459a) exc).getErrorCode() != 7) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.f102864q.setBuilder(this.f102864q.mo19207c().mo19231b((View) mo82533b(getContext(), true)));
                    this.f102864q.mo19213g();
                    if (this.f102827F != null) {
                        this.f102827F.mo82490a(true);
                    }
                } else {
                    this.f102864q.mo19214h();
                    if (this.f102827F != null) {
                        this.f102827F.mo82490a(false);
                    }
                }
            }
            if (!C9376b.m18558a((Collection<T>) this.f102861n.mo50673a())) {
                this.f102861n.mo54785f();
            }
            this.f102866s = true;
            C40542c.m89960a(this.f102856e, false, exc);
            mo82524F();
            if (!this.f102857j) {
                C2667b.m7664a("profile", C2669d.m7669a(this.f102925H), 0, C10201a.m20660a(C11010c.m22280a(), (Throwable) exc));
            }
        }
    }

    @C53771m
    public void onPrivateModelEvent(C30316ah ahVar) {
        if (ahVar.f79205b != null && this.f102861n != null) {
            if (this.f102857j && C39868b.m88638a() && (this.f102856e == 14 || this.f102856e == 0)) {
                this.f102842Y = true;
            } else if (!this.f102857j || !ShowPrivateAlbumExp.m88630a() || !(this.f102856e == 14 || this.f102856e == 0)) {
                for (int i = 0; i < this.f102861n.mo50673a().size(); i++) {
                    Aweme aweme = (Aweme) this.f102861n.mo50673a().get(i);
                    if (aweme.getAid().equals(ahVar.f79205b.getAid())) {
                        aweme.setStatus(ahVar.f79205b.getStatus());
                        this.f102861n.notifyItemChanged(i);
                        return;
                    }
                }
            } else {
                this.f102841X = true;
                C26875a aVar = (C26875a) this.f102863p.mo54803n();
                if (aVar instanceof C39958b) {
                    Aweme aweme2 = ahVar.f79205b;
                    AwemeStatus status = aweme2.getStatus();
                    if (this.f102856e == 14) {
                        if (status.getPrivateStatus() == 1) {
                            ((C39958b) aVar).mo81863a(aweme2);
                        }
                    } else if (this.f102856e == 0 && status.getPrivateStatus() != 1) {
                        ((C39958b) aVar).mo81863a(aweme2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m89582a(RecyclerView recyclerView) throws Exception {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    C1352v b = recyclerView.mo4812b(childAt);
                    if (b != null && b.mItemViewType == 0) {
                        ((C26843i) b).mo54782j();
                    }
                }
            }
        }
    }

    @C53771m(mo112976b = true)
    public void onVideoEvent(C30332aw awVar) {
        int i;
        if ((awVar.f79228a == 15 || awVar.f79228a == 2 || awVar.f79228a == 13 || awVar.f79228a == 21) && isViewValid() && !C40027t.f101966a.mo47103a()) {
            int i2 = awVar.f79228a;
            if (i2 != 2) {
                boolean z = true;
                if (i2 != 13) {
                    if (i2 != 15) {
                        if (i2 == 21 && (awVar.f79229b instanceof Aweme)) {
                            Aweme aweme = (Aweme) awVar.f79229b;
                            if (aweme != null && this.f102856e == awVar.f79234g) {
                                int a = this.f102861n.mo54772a(aweme.getAid());
                                if (a != -1 && (this.f102860m.getLayoutManager() instanceof C48201l)) {
                                    RecyclerView recyclerView = this.f102860m;
                                    View c = recyclerView.getLayoutManager().mo4736c(a);
                                    if (c != null) {
                                        int[] iArr = new int[2];
                                        c.getLocationOnScreen(iArr);
                                        Activity activity = (Activity) recyclerView.getContext();
                                        if (VERSION.SDK_INT < 17 || activity == null) {
                                            i = C9432q.m18688b(C11010c.m22280a());
                                        } else {
                                            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                                            DisplayMetrics displayMetrics = new DisplayMetrics();
                                            defaultDisplay.getRealMetrics(displayMetrics);
                                            i = displayMetrics.heightPixels;
                                        }
                                        int i3 = i - iArr[1];
                                        if (c.getHeight() > 0 && (((float) i3) * 1.0f) / ((float) c.getHeight()) > 0.4f) {
                                            z = false;
                                        }
                                    }
                                    if (z) {
                                        C47718bf.m103288a(new C40328dk(this.f102857j));
                                        ((C48201l) this.f102860m.getLayoutManager()).mo95630a(a, 0);
                                    }
                                }
                            }
                        }
                    } else if (this.f102857j) {
                        if (this.f102856e == 0) {
                            Aweme updateAweme = C23324d.m57378a().updateAweme((Aweme) awVar.f79229b);
                            if (updateAweme != null) {
                                if (!m89576V() || updateAweme.getStatus().getPrivateStatus() != 1) {
                                    this.f102838U = updateAweme;
                                    C53755c.m114319a().mo112963g(awVar);
                                    if (this.f102863p == null) {
                                        this.f102840W = true;
                                    } else {
                                        m89574T();
                                    }
                                }
                            }
                        } else if (this.f102856e == 14 && m89576V()) {
                            Aweme updateAweme2 = C23324d.m57378a().updateAweme((Aweme) awVar.f79229b);
                            if (updateAweme2 != null && updateAweme2.getStatus().getPrivateStatus() == 1) {
                                C26875a aVar = (C26875a) this.f102863p.mo54803n();
                                if (aVar instanceof C39958b) {
                                    this.f102841X = true;
                                    ((C39958b) aVar).mo81863a(updateAweme2);
                                    if (C39868b.m88638a()) {
                                        this.f102864q.setVisibility(4);
                                    }
                                }
                            }
                        }
                    }
                } else if (this.f102857j && this.f102856e == 1) {
                    String str = (String) awVar.f79229b;
                    Aweme awemeById = C23324d.m57378a().getAwemeById(str);
                    if (awemeById == null) {
                        awemeById = C23324d.m57378a().getProfileSelfSeeAweme(str, this.f102856e);
                    }
                    if (awemeById != null && awemeById.getAwemeType() != 13) {
                        if (awemeById.getUserDigg() != 0) {
                            if (!m89584a(awemeById) && !this.f102863p.mo54840a((Object) awemeById, 0)) {
                            }
                        } else if (isResumed() && ProfileFavoriteUndiggOptimizeSetting.enabled() && m89584a(awemeById)) {
                            boolean a2 = this.f102863p.mo54839a((Object) awemeById);
                            this.f102861n.notifyDataSetChanged();
                            StringBuilder sb = new StringBuilder("handle cancel digg in favorite list for aid ");
                            sb.append(awemeById.getAid());
                            sb.append(", result is ");
                            sb.append(a2);
                            C40548i.m89965a(sb.toString());
                        }
                    }
                }
            } else if (this.f102857j && this.f102856e == 0) {
                String str2 = (String) awVar.f79229b;
                if (isViewValid() && !TextUtils.isEmpty(str2)) {
                    Aweme a3 = C31190f.m72830a(str2);
                    C39958b bVar = (C39958b) this.f102863p.mo54803n();
                    String str3 = this.f102854c;
                    if (a3 != null) {
                        C2201v.m6601a((C2205y<T>) new C39961d<T>(bVar, str3, a3)).mo6529b(C2168a.m6521b()).mo6551j();
                    }
                    if (this.f102863p.mo54839a((Object) a3)) {
                        this.f102861n.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo50455a(final C39741c cVar) {
        if (cVar.mo54754d() != null) {
            if (this.f102869v && this.f102826E != null) {
                this.f102869v = false;
                mo82502a(false, false);
            }
            C18842a.m45933a(new Runnable() {
                public final void run() {
                    String str;
                    int i;
                    if (C40280c.this.f102857j) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    if (C40280c.this.f102857j) {
                        i = 1000;
                    } else {
                        i = 2000;
                    }
                    int i2 = i + C40280c.this.f102856e;
                    if (cVar.getAdapterPosition() != -1) {
                        try {
                            View view = cVar.itemView;
                            Point point = new Point();
                            ((Activity) view.getContext()).getWindowManager().getDefaultDisplay().getSize(point);
                            Rect rect = new Rect(0, 0, point.x, point.y);
                            view.getLocationInWindow(new int[2]);
                            if (view.getLocalVisibleRect(rect)) {
                                C23212ar c = new C23212ar().mo47997a(str).mo47999c(cVar.mo54754d(), i2);
                                c.f61790b = C40280c.this.f102925H;
                                c.mo48076e();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }, 300);
        }
    }

    /* renamed from: a */
    private static DmtTextView m89579a(Context context, int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.tf));
        dmtTextView.setTextColor(context.getResources().getColor(R.color.a19));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (m89572R()) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().registerListener(this.f102851ah);
        }
        mo82515p();
    }

    /* renamed from: a */
    private static DmtTextView m89580a(Context context, String str) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.tf));
        dmtTextView.setTextColor(context.getResources().getColor(R.color.a19));
        dmtTextView.setText(str);
        return dmtTextView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DmtTextView mo82533b(Context context, boolean z) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.tf));
        this.f102852ai = z;
        dmtTextView.setGravity(17);
        dmtTextView.setText(m89586h(z));
        dmtTextView.setLineSpacing(C9432q.m18687b(context, 12.0f), 1.0f);
        if (context != null) {
            dmtTextView.setTextColor(context.getResources().getColor(R.color.a19));
        }
        this.f102828J = dmtTextView;
        return dmtTextView;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m89581a(String str, long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        String str2 = "group_id";
        if (str == null) {
            str = "";
        }
        try {
            jSONObject.put(str2, str);
            C23955a.f63624a = SystemClock.uptimeMillis() - j;
            jSONObject.put("duration", String.valueOf(C23955a.f63624a));
        } catch (JSONException unused) {
        }
        C18894a.m46006a("post_list", jSONObject);
        return null;
    }

    /* renamed from: b */
    public final void mo47026b(List<Aweme> list, boolean z) {
        if (isViewValid()) {
            this.f102861n.ao_();
            this.f102861n.f101446y = z;
            if (this.f102861n.getItemCount() == 0) {
                if (!C9376b.m18558a((Collection<T>) list)) {
                    if (this.f102865r != null) {
                        this.f102865r.mo82253b(this.f102857j, this.f102856e);
                    }
                } else if (!z && this.f102865r != null) {
                    this.f102865r.mo82252a(this.f102857j, this.f102856e);
                }
            }
            if (C40026s.f101964a.shouldUseRecyclerPartialUpdate()) {
                this.f102861n.mo50304b(list);
            } else {
                this.f102861n.mo50303a(list);
            }
            this.f102850ag = z;
            if (this.f102861n.mo48636c() != 0 || z || !this.f102864q.mo19215i()) {
                if (C9376b.m18558a((Collection<T>) list) && z && !this.f102837T && !this.f102835R) {
                    ar_();
                } else if (!C9376b.m18558a((Collection<T>) list)) {
                    this.f102864q.mo19208c(true);
                }
            } else if (!this.f102857j || this.f102856e != 0) {
                m89569O();
                this.f102864q.mo19213g();
            }
            mo47019a(z);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C23344b.f62351a.mo48400a(getActivity(), mo82513j(), layoutInflater, viewGroup);
        this.f102860m = (RecyclerView) a.findViewById(R.id.aeg);
        this.f102843Z = (ViewStub) a.findViewById(R.id.eyl);
        this.f102871x = (ViewStub) a.findViewById(R.id.cue);
        if (this.f102860m instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.f102860m).setLabel("profile_list");
        }
        if (C40026s.f101964a.shouldUseRecyclerPartialUpdate() && this.f102860m.getItemAnimator() != null) {
            this.f102860m.getItemAnimator().f4728i = 0;
        }
        if (((Integer) C23183v.m56778a().mo47909e().mo47782d()).intValue() == 0) {
            this.f102822A = m89578a(a, this.f102857j, this.f102925H, false);
        } else {
            this.f102822A = m89578a(a, this.f102857j, this.f102925H, true);
        }
        if (!this.f102849af) {
            this.f102864q = (DmtStatusView) a.findViewById(R.id.csv);
            mo82514m();
        }
        return a;
    }

    /* renamed from: a */
    private static int m89577a(boolean z, boolean z2, boolean z3, int i) {
        if (z3) {
            if (i == 0) {
                return R.string.ay_;
            }
            if (i != 1 || C47915gg.m103651b()) {
                return R.string.cf9;
            }
            if (((Integer) C23183v.m56778a().mo47909e().mo47782d()).intValue() == 0) {
                return R.string.bwk;
            }
            return R.string.bwl;
        } else if (i == 0) {
            return R.string.f_2;
        } else {
            if (i == 4) {
                return R.string.axu;
            }
            return R.string.f9v;
        }
    }

    /* renamed from: a */
    private static View m89578a(View view, boolean z, String str, boolean z2) {
        final Context context = view.getContext();
        if (!z || !TextUtils.equals(str, C47896fq.m103601a(1)) || C47915gg.m103651b() || !((Boolean) C23183v.m56778a().mo47908d().mo47782d()).booleanValue() || ((Boolean) C23183v.m56778a().mo47910f().mo47782d()).booleanValue() || ((Boolean) C23183v.m56778a().mo47906b().mo47782d()).booleanValue() || C40027t.f101966a.mo47103a() || !z2) {
            return null;
        }
        final View findViewById = view.findViewById(R.id.an7);
        TextView textView = (TextView) view.findViewById(R.id.bao);
        ImageView imageView = (ImageView) view.findViewById(R.id.az9);
        imageView.setImageResource(R.drawable.d0v);
        textView.setTextColor(context.getResources().getColor(R.color.a1y));
        findViewById.setBackgroundColor(context.getResources().getColor(R.color.ce));
        String string = context.getString(R.string.czf);
        String string2 = context.getString(R.string.czc);
        String a = C2240a.m6772a(string, new Object[]{context.getString(R.string.czc)});
        SpannableString spannableString = new SpannableString(a);
        int indexOf = a.indexOf(string2);
        int length = string2.length() + indexOf;
        if (indexOf >= 0 && length >= 0) {
            spannableString.setSpan(new ClickableSpan() {
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    C23183v.m56778a().mo47906b().mo47776a(Boolean.valueOf(true));
                    findViewById.setVisibility(8);
                    SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
                }
            }, indexOf, length, 18);
            spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.ja)), indexOf, length, 18);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        imageView.setOnClickListener(new C40378f(findViewById));
        return findViewById;
    }
}
