package com.p683ss.android.ugc.aweme.poi.p2074ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0732g;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AnimationUtils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.base.C11079a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.p683ss.android.ugc.aweme.detail.p1619a.C27312a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C30433j;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30508z;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30750af;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1757f.C31777f;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.C31835c;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31846h;
import com.p683ss.android.ugc.aweme.location.C36265i;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23209ao;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38973e;
import com.p683ss.android.ugc.aweme.poi.adapter.C38973e.C38974a;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C38999a;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.C39137u;
import com.p683ss.android.ugc.aweme.poi.model.C39140x;
import com.p683ss.android.ugc.aweme.poi.model.C39141y;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.nearby.p2064b.C39148a;
import com.p683ss.android.ugc.aweme.poi.nearby.p2064b.C39149b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.C39384j.C39386a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39303b;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39307c;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39307c.C39308a;
import com.p683ss.android.ugc.aweme.poi.p2074ui.coupon.C39312e;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.PoiContext;
import com.p683ss.android.ugc.aweme.poi.utils.C39440a;
import com.p683ss.android.ugc.aweme.poi.utils.C39444e;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.PoiConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.utils.C47863eu;
import com.ss.android.ugc.trill.R;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.AbsPoiAwemeFeedFragment */
public abstract class AbsPoiAwemeFeedFragment extends C30750af implements OnGlobalLayoutListener, C36265i, C39149b, C39308a, C39312e, C39386a {

    /* renamed from: A */
    private C39148a f100270A;

    /* renamed from: B */
    private BroadcastReceiver f100271B;

    /* renamed from: C */
    private boolean f100272C;

    /* renamed from: D */
    private boolean f100273D;

    /* renamed from: E */
    private boolean f100274E = true;

    /* renamed from: a */
    protected C39387k f100275a;

    /* renamed from: b */
    public C39384j f100276b;

    /* renamed from: c */
    public boolean f100277c;

    /* renamed from: d */
    protected C39128l f100278d;

    /* renamed from: e */
    protected C39067g f100279e;

    /* renamed from: j */
    protected String f100280j;

    /* renamed from: k */
    protected String f100281k;

    /* renamed from: l */
    protected String f100282l;

    /* renamed from: m */
    protected PoiDetail f100283m;
    public NestedScrollingRecyclerView mRecyclerView;
    protected View mStartRecodeLayout;
    protected View mStartRecordOutRing;
    protected DmtStatusView mStatusView;

    /* renamed from: n */
    protected PoiStruct f100284n;

    /* renamed from: o */
    public boolean f100285o;

    /* renamed from: v */
    public C39481c f100286v;

    /* renamed from: w */
    public boolean f100287w;

    /* renamed from: x */
    boolean f100288x = true;

    /* renamed from: y */
    private C39140x f100289y;

    /* renamed from: z */
    private C31777f f100290z;

    /* renamed from: C */
    public C38974a mo80011C() {
        return null;
    }

    /* renamed from: D */
    public C31846h mo80012D() {
        return null;
    }

    public final void bD_() {
    }

    /* renamed from: c */
    public final C39128l mo80026c() {
        return this.f100278d;
    }

    /* renamed from: d_ */
    public final boolean mo59855d_(boolean z) {
        return false;
    }

    /* renamed from: h */
    public abstract int mo80029h();

    /* renamed from: i */
    public abstract int mo80030i();

    /* renamed from: j */
    public C11079a mo80015G() {
        return this;
    }

    /* renamed from: p */
    public final void mo80039p() {
        this.f100288x = false;
    }

    /* renamed from: w */
    public final int mo63442w() {
        return 10;
    }

    /* renamed from: z */
    public C38999a mo80044z() {
        return null;
    }

    /* renamed from: a */
    public boolean mo80023a(PoiDetail poiDetail) {
        if (this.f100284n != null) {
            return true;
        }
        if (poiDetail != null) {
            this.f100283m = poiDetail;
            this.f100284n = poiDetail.poiStruct;
            this.f100281k = this.f100284n.poiName;
            this.f100282l = this.f100284n.getTypeCode();
        }
        return false;
    }

    /* renamed from: A */
    public final String mo80010A() {
        return mo80026c().awemeid;
    }

    /* renamed from: F */
    public final void mo80014F() {
        mo80025b((C36282r) null);
        mo80021a((C36282r) null);
    }

    /* renamed from: x */
    public final String mo63443x() {
        return mo80026c().from;
    }

    /* renamed from: f */
    public final boolean mo80027f() {
        if (this.f100278d != null) {
            return this.f100278d.hasActivity;
        }
        return false;
    }

    /* renamed from: g */
    public final String mo80028g() {
        if (this.f100278d != null) {
            return this.f100278d.challengeId;
        }
        return "";
    }

    /* renamed from: k */
    public final void mo80032k() {
        if (this.mStartRecodeLayout != null) {
            this.mStartRecodeLayout.post(new C39379e(this));
        }
    }

    public void onGlobalLayout() {
        if (this.mRecyclerView != null) {
            this.mRecyclerView.setPadding(0, 0, 0, 0);
        }
    }

    public void onStop() {
        super.onStop();
        if (this.f100275a != null) {
            this.f100275a.mo64891g();
        }
        this.f100277c = false;
    }

    /* renamed from: r */
    public C39384j mo80041r() {
        if (this.f100276b == null) {
            this.f100276b = new C39384j(this);
        }
        return this.f100276b;
    }

    /* renamed from: s */
    public C39387k mo80042s() {
        if (this.f100275a == null) {
            this.f100275a = new C39387k();
        }
        return this.f100275a;
    }

    /* renamed from: t */
    public void mo63439t() {
        if (!C47863eu.m103535a()) {
            C23794bh.m58392f().mo64983a();
        }
    }

    /* renamed from: y */
    public C39140x mo80043y() {
        return new C39140x(mo80030i());
    }

    public final void bF_() {
        if (isViewValid()) {
            mo80025b(C36286a.m81925a().mo75118a());
        }
    }

    /* renamed from: o */
    public final void mo80036o() {
        C39387k kVar = this.f100275a;
        if (kVar.f83139f != null) {
            C38973e eVar = (C38973e) kVar.f83139f;
            if (eVar.f99258E != null) {
                PoiOptimizedDetailViewHolder poiOptimizedDetailViewHolder = eVar.f99258E;
                if (poiOptimizedDetailViewHolder.f99370c != null) {
                    poiOptimizedDetailViewHolder.f99370c.mo80360d();
                }
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.f29769b_ = false;
        if (this.f100275a != null) {
            this.f100275a.mo64893h();
        }
        mo63440u();
        this.f100277c = false;
    }

    public void onResume() {
        super.onResume();
        if (getUserVisibleHint() && !C47863eu.m103535a()) {
            if (this.f100275a != null) {
                this.f100275a.mo64890f();
            }
            mo63439t();
            this.f100277c = true;
        }
    }

    /* renamed from: u */
    public void mo63440u() {
        if (!C31843f.m74206a().mo64953b()) {
            C23794bh.m58392f().mo64998a("poi_page", "list");
        }
    }

    /* renamed from: I */
    private void mo80048I() {
        if (!C39381g.m87559a(getContext())) {
            if (!this.f100275a.f100748o) {
                this.mStatusView.mo19214h();
            }
            return;
        }
        C36282r rVar = null;
        if (this.f100285o) {
            rVar = C36286a.m81925a().mo75120b(this);
            if (rVar != null) {
                C36286a.m81925a().mo75121b();
                mo80025b(rVar);
            }
        } else {
            mo80025b((C36282r) null);
        }
        mo80021a(rVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public final /* synthetic */ void mo80016H() {
        if (isViewValid() && getActivity() != null) {
            this.f100286v = new C39481c(getActivity());
            this.f100286v.f100993h = C23728o.m58241a(-5.0d);
            this.f100286v.f100999n = 3000;
            this.f100286v.mo80486a((int) R.string.csw);
            this.f100286v.mo80489a(this.mStartRecodeLayout, 48);
        }
    }

    /* renamed from: l */
    public final void mo80033l() {
        if (this.mStartRecodeLayout != null) {
            this.mStartRecordOutRing.clearAnimation();
            this.mStartRecordOutRing.setVisibility(4);
            this.mStartRecodeLayout.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.e_));
        }
    }

    /* renamed from: m */
    public final void mo80034m() {
        if (this.mStartRecodeLayout != null) {
            this.mStartRecordOutRing.setVisibility(0);
            this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.eb));
            this.mStartRecodeLayout.clearAnimation();
        }
    }

    /* renamed from: E */
    public final void mo80013E() {
        FragmentActivity activity = getActivity();
        PoiStruct poiStruct = this.f100283m.poiStruct;
        C25687b couponInfo = this.f100283m.getPoiActivityInfo().getCouponInfo();
        String str = this.f100280j;
        String valueOf = String.valueOf(this.f100283m.getPoiActivityInfo().getCouponInfo().getActivityId());
        String valueOf2 = String.valueOf(this.f100283m.getPoiActivityInfo().getCouponInfo().getCouponId());
        C39067g gVar = this.f100279e;
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(poiStruct, "poiStruct");
        C52711k.m112240b(couponInfo, "couponInfo");
        C52711k.m112240b(str, "poiId");
        C52711k.m112240b(valueOf, "activityId");
        C52711k.m112240b(valueOf2, "couponId");
        C52711k.m112240b(gVar, "poiSimpleBundle");
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.mRecyclerView != null) {
            this.mRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        if (this.f100276b != null) {
            this.f100276b.mo46991S_();
            this.f100276b.aq_();
            this.f100276b.mo64717g();
            this.f100276b.mo64716f();
        }
        if (this.f100290z != null) {
            this.f100290z.mo46991S_();
            this.f100290z.aq_();
            this.f100290z.mo64734g();
        }
        if (this.f100270A != null) {
            this.f100270A.mo46991S_();
            this.f100270A.aq_();
        }
        if (this.f100275a != null) {
            this.f100275a.mo64894i();
        }
        C0732g.m2130a(getContext()).mo2402a(this.f100271B);
        C31843f.m74206a().mo64950a("key_container_poi");
        if (this.f100286v != null) {
            this.f100286v.mo80501d();
        }
    }

    /* renamed from: q */
    public final void mo80040q() {
        if (this.f100278d != null) {
            String str = this.f100278d.from;
            C23089d a = C23089d.m56640a();
            a.mo47829a("enter_from", str).mo47829a("group_id", this.f100278d.awemeid).mo47829a("poi_type", this.f100278d.poiType).mo47829a("poi_id", this.f100278d.poiId).mo47829a("to_user_id", this.f100278d.toUserId).mo47829a("poi_channel", C23198ae.m56852b()).mo47829a("enter_method", this.f100278d.clickMethod).mo47829a("author_id", this.f100278d.authorId).mo47829a("city_info", C23198ae.m56845a()).mo47829a("distance_info", this.f100278d.distanceInfo).mo47830a(this.f100278d.forwardTypeV3Params);
            if (C23198ae.m56860d(str)) {
                a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(this.f100278d.requestId));
                PoiStruct poiStruct = this.f100284n;
                String str2 = "request_poi_detail";
                if (poiStruct != null) {
                    if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                        a.mo47829a("poi_backend_type", poiStruct.getBackendTypeCode());
                    }
                    C39452l.m87734a(poiStruct.getCityCode(), a);
                }
                C26890h.m65012a(str2, C23198ae.m56851a(a.f61491a));
                return;
            }
            C39452l.m87732a(this.f100284n, "request_poi_detail", a);
        }
    }

    /* renamed from: n */
    public final void mo80035n() {
        String str;
        if (this.f100284n != null) {
            String uuid = UUID.randomUUID().toString();
            C26890h.onEvent(MobClick.obtain().setEventName("shoot").setLabelName("poi_page").setJsonObject(new C23088c().mo47824a("poi_id", this.f100280j).mo47825b()));
            C23209ao a = new C23209ao().mo47993a("poi_page");
            a.f61767a = this.f100280j;
            C23209ao d = a.mo47996d(uuid);
            if (C23198ae.m56860d(this.f100278d.from)) {
                d.f61770d = true;
                C29981aa a2 = C29981aa.m70153a();
                if (this.f100278d != null) {
                    str = this.f100278d.requestId;
                } else {
                    str = null;
                }
                d.f61769c = a2.mo60161a(str);
            }
            d.mo48076e();
            IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
            if (aVServiceImpl_Monster == null || !aVServiceImpl_Monster.configService().avsettingsConfig().needLoginBeforeRecord()) {
                PoiContext poiContext = new PoiContext();
                poiContext.mShootPoiId = this.f100280j;
                poiContext.mShootPoiName = this.f100281k;
                poiContext.setLat(this.f100284n.getPoiLatitude());
                poiContext.setLng(this.f100284n.getPoiLongitude());
                if (this.f100278d.hasActivity) {
                    if (mo80041r().mo80091t()) {
                        poiContext.mPoiActivity = mo80041r().mo80092u();
                    } else {
                        poiContext.mSelectPoiId = this.f100280j;
                        poiContext.mSelectPoiName = this.f100281k;
                    }
                } else if (!TextUtils.isEmpty(this.f100278d.challengeId) || !TextUtils.isEmpty(this.f100278d.challengeId)) {
                    poiContext.mSelectPoiId = this.f100280j;
                    poiContext.mSelectPoiName = this.f100281k;
                }
                final Builder poiSticker = new Builder().shootWay("poi_page").creationId(uuid).poiSticker(new PoiConfig(PoiContext.serializeToStr(poiContext), this.f100278d.sticker, this.f100278d.challengeId));
                AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new AsyncServiceLoader() {
                    public final void onLoad(AsyncAVService asyncAVService, long j) {
                        asyncAVService.uiService().recordService().startRecord((Context) AbsPoiAwemeFeedFragment.this.getActivity(), poiSticker.build());
                    }
                });
                return;
            }
            C27965f.m66723a((Fragment) this, "poi_page", "click_record");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo80024b(View view) {
        mo80048I();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80020a(View view) {
        mo80048I();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissionGranted", this.f100285o);
    }

    /* renamed from: a */
    public final void mo80019a(C1340m mVar) {
        this.f100275a.f83135b.mo4801a(mVar);
        this.mRecyclerView.setOnTouchListener(new C39380f(this));
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f100275a != null) {
            this.f100275a.mo64887c(z);
        }
        if (z) {
            mo63439t();
        } else {
            mo63440u();
        }
    }

    /* renamed from: a */
    public final void mo79792a(Exception exc) {
        if (isViewValid()) {
            if (exc instanceof C23459a) {
                C10691a.m21551c(getContext(), ((C23459a) exc).getErrorMsg()).mo19066a();
            } else {
                C10691a.m21551c(getContext(), getString(R.string.ajg)).mo19066a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80025b(C36282r rVar) {
        if (!(!isViewValid() || rVar == null || this.f100275a == null)) {
            C39387k kVar = this.f100275a;
            if (kVar.f83139f != null && ((C38973e) kVar.f83139f).getItemCount() > 0) {
                ((C38973e) kVar.f83139f).notifyItemChanged(0, "UPDATE_LOCATION");
            }
        }
    }

    /* renamed from: a */
    public final void mo80017a(int i) {
        if (this.f100288x) {
            if (i > 30) {
                if (this.mStartRecodeLayout != null && this.f100273D && this.f100274E) {
                    this.mStartRecordOutRing.clearAnimation();
                    this.mStartRecodeLayout.startAnimation(C27312a.m65833b(false, 1, null));
                    this.mStartRecodeLayout.setVisibility(8);
                    this.f100274E = false;
                    if (this.f100286v != null) {
                        this.f100286v.dismiss();
                        this.f100286v = null;
                    }
                }
                return;
            }
            if (i < -30 && this.mStartRecodeLayout != null && this.f100273D && !this.f100274E) {
                this.mStartRecodeLayout.setVisibility(0);
                this.mStartRecodeLayout.startAnimation(C27312a.m65832a(false, 1, null));
                this.f100274E = true;
                this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.eb));
            }
        }
    }

    /* renamed from: a */
    public void mo63436a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.mo63436a(bundle);
        if (bundle != null) {
            this.f100278d = (C39128l) bundle.getSerializable("poi_bundle");
            if (this.f100278d != null) {
                str = this.f100278d.poiId;
            } else {
                str = "";
            }
            this.f100280j = str;
            if (this.f100278d != null) {
                str2 = this.f100278d.poiName;
            } else {
                str2 = "";
            }
            this.f100281k = str2;
            if (this.f100278d != null) {
                str3 = this.f100278d.poiType;
            } else {
                str3 = "";
            }
            this.f100282l = str3;
            this.f100287w = false;
            if (this.f100287w) {
                this.f100272C = true;
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ik) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return;
        }
        if (id == R.id.cmr) {
            C26890h.onEvent(MobClick.obtain().setEventName("click_share_button").setLabelName("poi_page").setJsonObject(new C23088c().mo47824a("poi_id", this.f100280j).mo47825b()));
            C39452l.m87730a(this.f100279e, "click_share_poi_button", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("poi_id", this.f100280j).mo47829a("poi_type", this.f100282l).mo47829a("group_id", mo80010A()).mo47829a("previous_page", mo63443x()));
            if (this.f100284n != null) {
                FragmentActivity activity2 = getActivity();
                PoiStruct poiStruct = this.f100284n;
                this.f100283m.getEnterpriseClaimUrl();
                C39128l lVar = this.f100278d;
                C52711k.m112240b(activity2, "activity");
                C52711k.m112240b(poiStruct, "poi");
                SecApiImpl.createISecApibyMonsterPlugin().reportData("share");
            }
        }
    }

    /* renamed from: a */
    public final void mo80021a(C36282r rVar) {
        boolean z;
        if (isViewValid()) {
            if (!C39381g.m87559a(getContext())) {
                if (!this.f100275a.f100748o && this.mStatusView != null) {
                    this.mStatusView.mo19214h();
                }
                return;
            }
            boolean z2 = false;
            if (rVar == null) {
                C39387k kVar = this.f100275a;
                if (this.f100278d != null) {
                    z2 = this.f100278d.isPreviewMode;
                }
                kVar.mo80099a(z2, "", "", this.f100287w);
                return;
            }
            String[] a = C39440a.m87682a(rVar);
            C39387k kVar2 = this.f100275a;
            if (this.f100278d != null) {
                z = this.f100278d.isPreviewMode;
            } else {
                z = false;
            }
            kVar2.mo80099a(z, a[0], a[1], this.f100287w);
        }
    }

    /* renamed from: a */
    public final void mo79791a(C39141y yVar) {
        boolean z;
        if (yVar != null && isViewValid() && getContext() != null) {
            C39387k s = mo80042s();
            if (s != null) {
                C25687b couponInfo = yVar.getCouponInfo();
                if (couponInfo != null) {
                    if (this.f100283m.couponShareSetting == null || this.f100283m.couponShareSetting.shareFlag != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z2 = !TextUtils.isEmpty(this.f100283m.getBookUrl());
                    boolean a = C23542f.m57719d().mo48705a("show_coupon_guide_dialog", false);
                    if (z2) {
                        C39303b bVar = new C39303b(getContext(), couponInfo, true, this.f100283m.getBookUrl(), z, this.f100279e, this);
                        bVar.show();
                    } else if (!a) {
                        C39303b bVar2 = new C39303b(getContext(), couponInfo, false, this.f100283m.getBookUrl(), z, this.f100279e, this);
                        bVar2.show();
                    } else if (z) {
                        C39307c cVar = new C39307c(getContext(), this.f100283m.couponShareSetting.shareText, String.valueOf(couponInfo.getCouponId()), this.f100279e, this);
                        cVar.show();
                    } else {
                        C10691a.m21551c(getContext(), getString(R.string.ajz)).mo19066a();
                    }
                    C30433j.m71353a(true);
                    if (s.f83139f != null && ((C38973e) s.f83139f).getItemCount() > 0) {
                        C38973e eVar = (C38973e) s.f83139f;
                        if (eVar.f99258E != null) {
                            eVar.f99258E.mo79155a(couponInfo);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80018a(DialogInterface dialogInterface, int i) {
        mo80014F();
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        if (bundle != null) {
            this.f100285o = bundle.getBoolean("permissionGranted");
        }
        C10722c cVar = new C10723a(getActivity()).mo19277a((int) R.drawable.dgk).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, new C39277a(this)).f28711a;
        this.mStatusView.setBuilder(C10719a.m21676a(getContext()).mo19232b(cVar).mo19229a(new C10723a(getActivity()).mo19280b((int) R.string.bx4).mo19282c(R.string.c0d).mo19278a(C10720a.BORDER, R.string.f5u, new C39299b(this)).f28711a));
        this.f100275a = mo80042s();
        this.f100276b = mo80041r();
        this.f100276b.mo64702a((Fragment) this, mo63442w());
        this.f100290z = new C31777f(this.f80580q, mo63443x(), this.f80581r);
        this.f100290z.mo64733f();
        this.f100271B = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && AbsPoiAwemeFeedFragment.this.getUserVisibleHint() && AbsPoiAwemeFeedFragment.this.f29769b_ && !AbsPoiAwemeFeedFragment.this.f100277c) {
                    if (AbsPoiAwemeFeedFragment.this.f100275a != null) {
                        AbsPoiAwemeFeedFragment.this.f100275a.mo64890f();
                    }
                    AbsPoiAwemeFeedFragment.this.mo63439t();
                    AbsPoiAwemeFeedFragment.this.f100277c = true;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C0732g.m2130a(getContext()).mo2403a(this.f100271B, intentFilter);
        this.f100290z.mo54799a(new C30508z());
        this.f100290z.mo54800a((C31835c) this.f100275a);
        this.f100276b.mo54800a(this.f100275a);
        this.f100279e = this.f100275a.mo80352a(this.f100278d);
        this.f100275a.f100752s = mo80044z();
        this.f100275a.mo80098a((C39386a) this, view, this.f100276b, (C31754a) this.f100290z);
        this.f100289y = mo80043y();
        this.f100276b.mo54799a(this.f100289y);
        this.f100270A = new C39148a();
        this.f100270A.mo54799a(new C39137u());
        this.f100270A.mo54800a(this);
        if (!this.f100285o) {
            if (C36286a.m81927a(C11010c.m22280a())) {
                this.f100285o = true;
                C36282r b = C36286a.m81925a().mo75120b(this);
                if (b != null) {
                    C36286a.m81925a().mo75121b();
                    mo80025b(b);
                }
                mo80021a(b);
            } else if (C39444e.m87713a()) {
                mo80014F();
            } else {
                C39444e.m87712a(true);
                this.mStatusView.mo19212f();
                C39444e.m87711a(getContext(), new C39300c(this), new C39315d(this));
            }
            if (this.mStartRecodeLayout != null) {
                boolean z = this.f100272C;
                this.f100273D = z;
                View view2 = this.mStartRecodeLayout;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C23729p.m58257a(view2, i);
                if (this.f100272C) {
                    this.mStartRecordOutRing.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.eb));
                    this.mStartRecodeLayout.setOnTouchListener(new OnTouchListener() {
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            switch (motionEvent.getAction()) {
                                case 0:
                                    AbsPoiAwemeFeedFragment.this.mo80033l();
                                    break;
                                case 1:
                                    AbsPoiAwemeFeedFragment.this.mo80034m();
                                    break;
                            }
                            return false;
                        }
                    });
                    this.mStartRecodeLayout.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            ClickInstrumentation.onClick(view);
                            if (AbsPoiAwemeFeedFragment.this.f100286v != null) {
                                AbsPoiAwemeFeedFragment.this.f100286v.dismiss();
                                AbsPoiAwemeFeedFragment.this.f100286v = null;
                            }
                            User curUser = C20854a.m53167g().getCurUser();
                            if (curUser != null && curUser.isLive()) {
                                C10691a.m21548c(AbsPoiAwemeFeedFragment.this.getContext(), (int) R.string.btm).mo19066a();
                            } else if (AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishing()) {
                                C10691a.m21548c(AbsPoiAwemeFeedFragment.this.getContext(), (int) R.string.hr).mo19066a();
                            } else {
                                AbsPoiAwemeFeedFragment.this.mo80035n();
                            }
                        }
                    });
                }
                this.mRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo80022a(String str, int i) {
        if (this.f100270A != null) {
            this.f100270A.mo44934a_(str, Integer.valueOf(i));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo80029h(), viewGroup, false);
        C26894c.m65022a(inflate.findViewById(R.id.csm));
        if (!C39462r.m87772a()) {
            inflate.findViewById(R.id.cmr).setVisibility(8);
            inflate.findViewById(R.id.elh).setVisibility(8);
        }
        return inflate;
    }
}
