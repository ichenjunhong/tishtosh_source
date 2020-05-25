package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.lighten.loader.SmartImageView;
import com.p683ss.android.ugc.aweme.C22570am;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.p683ss.android.ugc.aweme.challenge.p1495ab.C24531a;
import com.p683ss.android.ugc.aweme.challenge.p1497c.C24559a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24755p;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a.C24673c;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a.C24674d.C24677b;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailViewModel.C24785a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.p684l.C10912c.C10914b;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a */
public abstract class C24664a extends FrameLayout {

    /* renamed from: i */
    public static final C24665a f65270i = new C24665a(null);

    /* renamed from: A */
    private FrameLayout f65271A;

    /* renamed from: B */
    private SmartImageView f65272B;

    /* renamed from: C */
    private View f65273C;

    /* renamed from: D */
    private boolean f65274D;

    /* renamed from: E */
    private final List<C24708n> f65275E = new ArrayList();

    /* renamed from: F */
    private final C24706l f65276F;

    /* renamed from: G */
    private ChallengeDetailViewModel f65277G;

    /* renamed from: H */
    private boolean f65278H;

    /* renamed from: I */
    private final C0199s<C52847n<Integer, C24559a>> f65279I;

    /* renamed from: J */
    private final C24667c f65280J;

    /* renamed from: a */
    public SmartImageView f65281a;

    /* renamed from: b */
    public View f65282b;

    /* renamed from: c */
    public LinearLayout f65283c;

    /* renamed from: d */
    protected SmartImageView f65284d;

    /* renamed from: e */
    protected DmtTextView f65285e;

    /* renamed from: f */
    public ViewStub f65286f;

    /* renamed from: g */
    protected ChallengeDetail f65287g;

    /* renamed from: h */
    protected Challenge f65288h;

    /* renamed from: j */
    private final String f65289j = "AbsCommonHeaderView";

    /* renamed from: k */
    private View f65290k;

    /* renamed from: l */
    private View f65291l;

    /* renamed from: m */
    private DmtTextView f65292m;

    /* renamed from: n */
    private LinearLayout f65293n;

    /* renamed from: o */
    private DmtTextView f65294o;

    /* renamed from: p */
    private ImageView f65295p;

    /* renamed from: q */
    private ViewStub f65296q;

    /* renamed from: r */
    private View f65297r;

    /* renamed from: s */
    private DmtTextView f65298s;

    /* renamed from: t */
    private RecyclerView f65299t;

    /* renamed from: u */
    private ViewStub f65300u;

    /* renamed from: v */
    private View f65301v;

    /* renamed from: w */
    private View f65302w;

    /* renamed from: x */
    private DmtTextView f65303x;

    /* renamed from: y */
    private RecyclerView f65304y;

    /* renamed from: z */
    private C24673c f65305z;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$a */
    public static final class C24665a {
        private C24665a() {
        }

        public /* synthetic */ C24665a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m60178a(ChallengeDetail challengeDetail) {
            C52711k.m112240b(challengeDetail, "data");
            Challenge challenge = challengeDetail.challenge;
            if (challenge != null) {
                ChallengeTransform transfrom = challenge.getTransfrom();
                if (transfrom != null && C24678b.m60182a(transfrom.getText()) && C24678b.m60182a(transfrom.getAction())) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$b */
    static final class C24666b<T> implements C0199s<C52847n<? extends Integer, ? extends C24559a>> {

        /* renamed from: a */
        final /* synthetic */ C24664a f65306a;

        C24666b(C24664a aVar) {
            this.f65306a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C52847n nVar = (C52847n) obj;
            this.f65306a.mo50514c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$c */
    public static final class C24667c implements C24677b {

        /* renamed from: a */
        final /* synthetic */ C24664a f65307a;

        C24667c(C24664a aVar) {
            this.f65307a = aVar;
        }

        /* renamed from: a */
        public final void mo50550a(Aweme aweme, int i) {
            C52711k.m112240b(aweme, "aweme");
            ChallengeDetailViewModel mViewModel = this.f65307a.getMViewModel();
            if (mViewModel != null) {
                C23275b<C52847n<Integer, C24559a>> bVar = mViewModel.f65606b;
                if (bVar != null) {
                    C52847n nVar = (C52847n) bVar.getValue();
                    if (nVar != null) {
                        C24559a aVar = (C24559a) nVar.getSecond();
                        if (aVar != null) {
                            C31213v.m72896a((C26875a) aVar);
                            C41302w a = C41302w.m91042a();
                            Activity activity = this.f65307a.getActivity();
                            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                            sb.append(aweme.getAid());
                            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("refer", "challenge").mo83870a("video_from", "from_challenge").mo83870a("challenge_id", this.f65307a.getMChallenge().getCid()).mo83868a("video_type", 2).mo83868a("profile_enterprise_type", aweme.getEnterpriseType()).mo83871a());
                            C30179b.m70792a(aweme);
                            this.f65307a.mo50511a(aweme, i);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$d */
    static final class C24668d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24664a f65308a;

        /* renamed from: b */
        final /* synthetic */ C10912c f65309b;

        /* renamed from: c */
        final /* synthetic */ ChallengeDetail f65310c;

        C24668d(C24664a aVar, C10912c cVar, ChallengeDetail challengeDetail) {
            this.f65308a = aVar;
            this.f65309b = cVar;
            this.f65310c = challengeDetail;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22570am H = C23794bh.m58382H();
            Context context = this.f65308a.getContext();
            C10914b bVar = this.f65309b.f29318s;
            C52711k.m112236a((Object) bVar, "entry.bannerDetail");
            H.mo46909a(context, bVar.f29322b);
            Challenge challenge = this.f65310c.challenge;
            C52711k.m112236a((Object) challenge, "data.challenge");
            C26890h.m65011a("xmas_banner_click", C23089d.m56640a().mo47829a("enter_from", "tag_page").mo47829a("gen", C31357a.m73100c()).mo47829a("tag_id", challenge.getCid()).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$e */
    static final class C24669e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24664a f65311a;

        /* renamed from: b */
        final /* synthetic */ String f65312b;

        C24669e(C24664a aVar, String str) {
            this.f65311a = aVar;
            this.f65312b = str;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65311a.mo50512a(this.f65312b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a$f */
    public static final class C24670f extends C1331h {
        C24670f() {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            int f = RecyclerView.m4275f(view);
            if (f == 0) {
                rect.left = C23728o.m58241a(16.0d);
            }
            C1322a adapter = recyclerView.getAdapter();
            if (adapter == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) adapter, "parent.adapter!!");
            if (f == adapter.getItemCount() - 1) {
                rect.right = C23728o.m58241a(16.0d);
            } else {
                rect.right = C23728o.m58241a(4.0d);
            }
        }
    }

    /* renamed from: a */
    public void mo50508a() {
    }

    /* access modifiers changed from: protected */
    public abstract int getAttrsResId();

    /* access modifiers changed from: protected */
    public abstract int getButtonResId();

    public final boolean getHasBgCoverMask() {
        return this.f65274D;
    }

    /* access modifiers changed from: protected */
    public abstract int getLayoutResId();

    /* access modifiers changed from: protected */
    public final View getMDescContainer() {
        return this.f65291l;
    }

    /* access modifiers changed from: protected */
    public final C24706l getMHeaderParam() {
        return this.f65276F;
    }

    /* access modifiers changed from: protected */
    public final ChallengeDetailViewModel getMViewModel() {
        return this.f65277G;
    }

    public final String getTag() {
        return this.f65289j;
    }

    public final ChallengeDetailParam getDetailParam() {
        return this.f65276F.f65426f;
    }

    /* renamed from: e */
    private final boolean mo50599e() {
        if (this.f65288h == null) {
            C52711k.m112237a("mChallenge");
        }
        return false;
    }

    public final FragmentActivity getActivity() {
        Activity d = C23729p.m58270d(this);
        if (!(d instanceof FragmentActivity)) {
            d = null;
        }
        return (FragmentActivity) d;
    }

    /* access modifiers changed from: protected */
    public final SmartImageView getMAvatar() {
        SmartImageView smartImageView = this.f65284d;
        if (smartImageView == null) {
            C52711k.m112237a("mAvatar");
        }
        return smartImageView;
    }

    public final SmartImageView getMBgCover() {
        SmartImageView smartImageView = this.f65281a;
        if (smartImageView == null) {
            C52711k.m112237a("mBgCover");
        }
        return smartImageView;
    }

    public final View getMBgCoverMask() {
        View view = this.f65282b;
        if (view == null) {
            C52711k.m112237a("mBgCoverMask");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final Challenge getMChallenge() {
        Challenge challenge = this.f65288h;
        if (challenge == null) {
            C52711k.m112237a("mChallenge");
        }
        return challenge;
    }

    /* access modifiers changed from: protected */
    public final ChallengeDetail getMChallengeDetail() {
        ChallengeDetail challengeDetail = this.f65287g;
        if (challengeDetail == null) {
            C52711k.m112237a("mChallengeDetail");
        }
        return challengeDetail;
    }

    public final ViewStub getMDescContainerVs() {
        ViewStub viewStub = this.f65286f;
        if (viewStub == null) {
            C52711k.m112237a("mDescContainerVs");
        }
        return viewStub;
    }

    public final LinearLayout getMHeaderContainer() {
        LinearLayout linearLayout = this.f65283c;
        if (linearLayout == null) {
            C52711k.m112237a("mHeaderContainer");
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public final DmtTextView getMTitle() {
        DmtTextView dmtTextView = this.f65285e;
        if (dmtTextView == null) {
            C52711k.m112237a("mTitle");
        }
        return dmtTextView;
    }

    /* renamed from: f */
    private final boolean m60167f() {
        C24531a aVar = C24531a.f64953a;
        Challenge challenge = this.f65288h;
        if (challenge == null) {
            C52711k.m112237a("mChallenge");
        }
        return aVar.mo50297a(challenge, this.f65276F.f65426f);
    }

    /* renamed from: g */
    private void m60168g() {
        View view = this.f65282b;
        if (view == null) {
            C52711k.m112237a("mBgCoverMask");
        }
        view.setBackgroundResource(R.drawable.cqs);
        this.f65274D = true;
    }

    public final int getAvatarContainerHight() {
        SmartImageView smartImageView = this.f65284d;
        if (smartImageView == null) {
            C52711k.m112237a("mAvatar");
        }
        int height = smartImageView.getHeight();
        View view = this.f65290k;
        if (view == null) {
            C52711k.m112237a("mStatusBar");
        }
        return height + view.getHeight();
    }

    /* renamed from: c */
    public final void mo50514c() {
        ChallengeDetailViewModel challengeDetailViewModel = this.f65277G;
        if (challengeDetailViewModel != null) {
            C23275b<C52847n<Integer, C24559a>> bVar = challengeDetailViewModel.f65606b;
            if (bVar != null) {
                C52847n nVar = (C52847n) bVar.getValue();
                if (nVar != null) {
                    C24559a aVar = (C24559a) nVar.getSecond();
                    if (aVar != null) {
                        ChallengeDetail challengeDetail = this.f65287g;
                        if (challengeDetail == null) {
                            C52711k.m112237a("mChallengeDetail");
                        }
                        aVar.mo50332a(challengeDetail.slideList);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C47718bf.m103290c(this);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        this.f65277G = C24785a.m60319a(activity);
        ChallengeDetailViewModel challengeDetailViewModel = this.f65277G;
        if (challengeDetailViewModel == null) {
            C52711k.m112234a();
        }
        C23275b<C52847n<Integer, C24559a>> bVar = challengeDetailViewModel.f65606b;
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C52711k.m112234a();
        }
        bVar.observe(activity2, this.f65279I);
        mo50514c();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C47718bf.m103291d(this);
        ChallengeDetailViewModel challengeDetailViewModel = this.f65277G;
        if (challengeDetailViewModel == null) {
            C52711k.m112234a();
        }
        challengeDetailViewModel.f65606b.removeObserver(this.f65279I);
        this.f65277G = null;
        for (C24708n b : this.f65275E) {
            b.mo50583b();
        }
    }

    /* renamed from: d */
    public final void mo50515d() {
        View view = this.f65273C;
        if (view == null) {
            C52711k.m112237a("mBottomSpace");
        }
        LayoutParams layoutParams = view.getLayoutParams();
        LinearLayout linearLayout = this.f65283c;
        if (linearLayout == null) {
            C52711k.m112237a("mHeaderContainer");
        }
        int childCount = linearLayout.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            LinearLayout linearLayout2 = this.f65283c;
            if (linearLayout2 == null) {
                C52711k.m112237a("mHeaderContainer");
            }
            View childAt = linearLayout2.getChildAt(childCount);
            if (!(childAt instanceof ViewGroup)) {
                childAt = null;
            }
            ViewGroup viewGroup = (ViewGroup) childAt;
            if (viewGroup == null) {
                childCount--;
            } else {
                int id = viewGroup.getId();
                if (id == R.id.hr || id == R.id.cp7) {
                    layoutParams.height = C23728o.m58241a(32.0d);
                } else {
                    if (id == R.id.a4g || id == R.id.xw) {
                        layoutParams.height = C23728o.m58241a(23.0d);
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private final void m60169h() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = ",";
        ChallengeDetail challengeDetail = this.f65287g;
        if (challengeDetail == null) {
            C52711k.m112237a("mChallengeDetail");
        }
        List<RelatedChallengeMusic> list = challengeDetail.relatedChallengeMusicList;
        C52711k.m112236a((Object) list, "mChallengeDetail.relatedChallengeMusicList");
        for (RelatedChallengeMusic relatedChallengeMusic : list) {
            C52711k.m112236a((Object) relatedChallengeMusic, "it");
            if (relatedChallengeMusic.categoryType == 1 && relatedChallengeMusic.music != null) {
                Music music = relatedChallengeMusic.music;
                C52711k.m112236a((Object) music, "it.music");
                sb.append(music.getMid());
                sb.append(str);
            } else if (relatedChallengeMusic.categoryType == 2 && relatedChallengeMusic.challenge != null) {
                Challenge challenge = relatedChallengeMusic.challenge;
                C52711k.m112236a((Object) challenge, "it.challenge");
                sb2.append(challenge.getCid());
                sb2.append(str);
            }
        }
        CharSequence charSequence = str;
        C52830p.m112428a((CharSequence) sb, charSequence);
        C52830p.m112428a((CharSequence) sb2, charSequence);
        String str2 = "";
        String str3 = "0";
        if (TextUtils.equals(this.f65276F.f65424d, "from_related_tag")) {
            Challenge challenge2 = this.f65288h;
            if (challenge2 == null) {
                C52711k.m112237a("mChallenge");
            }
            str2 = challenge2.getCid();
            C52711k.m112236a((Object) str2, "mChallenge.cid");
            str3 = "1";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("level", str3);
            jSONObject.put("enter_from", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("music", sb.toString());
            jSONObject2.put("challenge", sb2.toString());
            jSONObject.put("related", jSONObject2);
        } catch (JSONException unused) {
        }
        MobClick labelName = MobClick.obtain().setEventName("extend_challenge").setLabelName("challenge");
        Challenge challenge3 = this.f65288h;
        if (challenge3 == null) {
            C52711k.m112237a("mChallenge");
        }
        C26890h.onEvent(labelName.setValue(challenge3.getCid()).setJsonObject(jSONObject));
    }

    /* renamed from: b */
    public void mo50513b() {
        View findViewById = findViewById(R.id.k5);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.bg_cover)");
        this.f65281a = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.k6);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.bg_cover_mask)");
        this.f65282b = findViewById2;
        View findViewById3 = findViewById(R.id.ao4);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.header_container)");
        this.f65283c = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.csm);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.status_bar)");
        this.f65290k = findViewById4;
        View findViewById5 = findViewById(R.id.hi);
        C52711k.m112236a((Object) findViewById5, "findViewById(R.id.avatar)");
        this.f65284d = (SmartImageView) findViewById5;
        View findViewById6 = findViewById(R.id.title);
        C52711k.m112236a((Object) findViewById6, "findViewById(R.id.title)");
        this.f65285e = (DmtTextView) findViewById6;
        View findViewById7 = findViewById(R.id.dsx);
        C52711k.m112236a((Object) findViewById7, "findViewById(R.id.vs_desc_container)");
        this.f65286f = (ViewStub) findViewById7;
        View findViewById8 = findViewById(R.id.dt4);
        C52711k.m112236a((Object) findViewById8, "findViewById(R.id.vs_related_container)");
        this.f65296q = (ViewStub) findViewById8;
        View findViewById9 = findViewById(R.id.dt0);
        C52711k.m112236a((Object) findViewById9, "findViewById(R.id.vs_horizontal_slide)");
        this.f65300u = (ViewStub) findViewById9;
        View findViewById10 = findViewById(R.id.ma);
        C52711k.m112236a((Object) findViewById10, "findViewById(R.id.bottom_space)");
        this.f65273C = findViewById10;
        for (C24708n a : this.f65275E) {
            a.mo50578a(this, this.f65276F);
        }
        if (VERSION.SDK_INT >= 19) {
            View view = this.f65290k;
            if (view == null) {
                C52711k.m112237a("mStatusBar");
            }
            view.getLayoutParams().height = C11065a.m22390a(getContext());
        }
    }

    public final void setHasBgCoverMask(boolean z) {
        this.f65274D = z;
    }

    /* access modifiers changed from: protected */
    public final void setMDescContainer(View view) {
        this.f65291l = view;
    }

    /* access modifiers changed from: protected */
    public final void setMViewModel(ChallengeDetailViewModel challengeDetailViewModel) {
        this.f65277G = challengeDetailViewModel;
    }

    /* access modifiers changed from: protected */
    public final void setMAvatar(SmartImageView smartImageView) {
        C52711k.m112240b(smartImageView, "<set-?>");
        this.f65284d = smartImageView;
    }

    public final void setMBgCover(SmartImageView smartImageView) {
        C52711k.m112240b(smartImageView, "<set-?>");
        this.f65281a = smartImageView;
    }

    public final void setMBgCoverMask(View view) {
        C52711k.m112240b(view, "<set-?>");
        this.f65282b = view;
    }

    /* access modifiers changed from: protected */
    public final void setMChallenge(Challenge challenge) {
        C52711k.m112240b(challenge, "<set-?>");
        this.f65288h = challenge;
    }

    /* access modifiers changed from: protected */
    public final void setMChallengeDetail(ChallengeDetail challengeDetail) {
        C52711k.m112240b(challengeDetail, "<set-?>");
        this.f65287g = challengeDetail;
    }

    public final void setMDescContainerVs(ViewStub viewStub) {
        C52711k.m112240b(viewStub, "<set-?>");
        this.f65286f = viewStub;
    }

    public final void setMHeaderContainer(LinearLayout linearLayout) {
        C52711k.m112240b(linearLayout, "<set-?>");
        this.f65283c = linearLayout;
    }

    /* access modifiers changed from: protected */
    public final void setMTitle(DmtTextView dmtTextView) {
        C52711k.m112240b(dmtTextView, "<set-?>");
        this.f65285e = dmtTextView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50510a(C24708n nVar) {
        C52711k.m112240b(nVar, "delegate");
        this.f65275E.add(nVar);
    }

    @C53771m
    public final void onEvent(C35471h hVar) {
        C52711k.m112240b(hVar, "event");
        if (TextUtils.equals("challenge", hVar.itemType)) {
            Context context = getContext();
            SmartImageView smartImageView = this.f65284d;
            if (smartImageView == null) {
                C52711k.m112237a("mAvatar");
            }
            C47881fd.m103578a(context, smartImageView, hVar);
        }
    }

    public final void setHeaderAlpha(float f) {
        LinearLayout linearLayout = this.f65283c;
        if (linearLayout == null) {
            C52711k.m112237a("mHeaderContainer");
        }
        linearLayout.setAlpha(1.0f - f);
        for (C24708n a : this.f65275E) {
            a.mo50577a(f);
        }
    }

    /* renamed from: a */
    public final void mo50512a(String str) {
        String str2 = this.f65276F.f65425e;
        Challenge challenge = this.f65288h;
        if (challenge == null) {
            C52711k.m112237a("mChallenge");
        }
        C24755p.m60286a(str2, challenge.getCid());
        C22570am H = C23794bh.m58382H();
        Activity activity = getActivity();
        C47661ab a = C47661ab.m103163a();
        String str3 = "extra_zoom_info";
        SmartImageView smartImageView = this.f65284d;
        if (smartImageView == null) {
            C52711k.m112237a("mAvatar");
        }
        C47661ab a2 = a.mo94970a(str3, (Parcelable) ZoomAnimationUtils.m103150a(smartImageView)).mo94968a("wh_ratio", 0.1f).mo94973a("enable_download_img", false);
        String str4 = "challenge_info";
        Challenge challenge2 = this.f65288h;
        if (challenge2 == null) {
            C52711k.m112237a("mChallenge");
        }
        C47661ab a3 = a2.mo94971a(str4, (Serializable) challenge2).mo94972a("process_id", this.f65276F.f65425e);
        String str5 = "uri";
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(str)) {
            str = new Builder().scheme("res").path("2131954349").build().toString();
        }
        strArr[0] = str;
        H.mo46908a(activity, a3.mo94974a(str5, strArr).f120139a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        if (r5 != null) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05ad A[LOOP:0: B:271:0x05a7->B:273:0x05ad, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0109  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50509a(com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail r15) {
        /*
            r14 = this;
            java.lang.String r0 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r15, r0)
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r15.challenge
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            r14.f65287g = r15
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r15.challenge
            java.lang.String r1 = "data.challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r14.f65288h = r0
            boolean r0 = r14.m60167f()
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x0027
            java.lang.String r4 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0027:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getChallengeNewCoverPhoto()
            if (r0 == 0) goto L_0x0032
            java.util.List r0 = r0.getUrlList()
            goto L_0x0033
        L_0x0032:
            r0 = r1
        L_0x0033:
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 != 0) goto L_0x006d
            r14.m60168g()
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x0047
            java.lang.String r4 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0047:
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getChallengeNewCoverPhoto()
            com.ss.android.ugc.aweme.base.k r0 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r0)
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24645a(r0)
            java.lang.String r4 = r14.f65289j
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r4)
            com.bytedance.lighten.loader.SmartImageView r4 = r14.f65281a
            if (r4 != 0) goto L_0x0062
            java.lang.String r5 = "mBgCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0062:
            com.bytedance.lighten.a.k r4 = (com.bytedance.lighten.p766a.C12197k) r4
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r4)
            r0.mo23121a()
            goto L_0x017d
        L_0x006d:
            boolean r0 = r14.mo50599e()
            if (r0 != 0) goto L_0x017d
            r14.m60168g()
            com.bytedance.lighten.loader.SmartImageView r0 = r14.f65281a
            if (r0 != 0) goto L_0x007f
            java.lang.String r4 = "mBgCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x007f:
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_XY
            r0.setScaleType(r4)
            com.bytedance.lighten.loader.SmartImageView r0 = r14.f65281a
            if (r0 != 0) goto L_0x008d
            java.lang.String r4 = "mBgCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x008d:
            r4 = 2131952637(0x7f1303fd, float:1.9541722E38)
            r0.setImageResource(r4)
            goto L_0x017d
        L_0x0095:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x009e
            java.lang.String r4 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x009e:
            java.lang.String r0 = r0.getChallengeBgUrl()
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r14.f65288h
            if (r4 != 0) goto L_0x00ab
            java.lang.String r5 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00ab:
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getBackgroundImageUrl()
            boolean r5 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r0)
            if (r5 != 0) goto L_0x00dd
            if (r4 != 0) goto L_0x00dd
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = r14.f65288h
            if (r5 != 0) goto L_0x00c0
            java.lang.String r6 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00c0:
            int r5 = r5.getSubType()
            if (r5 != r2) goto L_0x00df
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = r14.f65288h
            if (r5 != 0) goto L_0x00cf
            java.lang.String r6 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00cf:
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            if (r5 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.getAvatarLarger()
            goto L_0x00db
        L_0x00da:
            r5 = r1
        L_0x00db:
            if (r5 == 0) goto L_0x00df
        L_0x00dd:
            r14.f65278H = r2
        L_0x00df:
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0109
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24646a(r0)
            java.lang.String r4 = r14.f65289j
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r4)
            com.bytedance.lighten.loader.SmartImageView r4 = r14.f65281a
            if (r4 != 0) goto L_0x00fb
            java.lang.String r5 = "mBgCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x00fb:
            com.bytedance.lighten.a.k r4 = (com.bytedance.lighten.p766a.C12197k) r4
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r4)
            r0.mo23121a()
            r14.m60168g()
            goto L_0x017d
        L_0x0109:
            if (r4 == 0) goto L_0x012f
            com.ss.android.ugc.aweme.base.k r0 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r4)
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24645a(r0)
            java.lang.String r4 = r14.f65289j
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r4)
            com.bytedance.lighten.loader.SmartImageView r4 = r14.f65281a
            if (r4 != 0) goto L_0x0122
            java.lang.String r5 = "mBgCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0122:
            com.bytedance.lighten.a.k r4 = (com.bytedance.lighten.p766a.C12197k) r4
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r4)
            r0.mo23121a()
            r14.m60168g()
            goto L_0x017d
        L_0x012f:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x0138
            java.lang.String r4 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0138:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x017d
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r14.f65288h
            if (r4 != 0) goto L_0x0147
            java.lang.String r5 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0147:
            int r4 = r4.getSubType()
            if (r4 != r2) goto L_0x014f
            r4 = 1
            goto L_0x0150
        L_0x014f:
            r4 = 0
        L_0x0150:
            if (r4 == 0) goto L_0x0153
            goto L_0x0154
        L_0x0153:
            r0 = r1
        L_0x0154:
            if (r0 == 0) goto L_0x017d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getAvatarLarger()
            com.ss.android.ugc.aweme.base.k r0 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r0)
            com.bytedance.lighten.a.t r0 = com.bytedance.lighten.p766a.C12203q.m24645a(r0)
            java.lang.String r4 = r14.f65289j
            com.bytedance.lighten.a.t r0 = r0.mo23118a(r4)
            com.bytedance.lighten.loader.SmartImageView r4 = r14.f65281a
            if (r4 != 0) goto L_0x0171
            java.lang.String r5 = "mBgCover"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0171:
            com.bytedance.lighten.a.k r4 = (com.bytedance.lighten.p766a.C12197k) r4
            com.bytedance.lighten.a.t r0 = r0.mo23116a(r4)
            r0.mo23121a()
            r14.m60168g()
        L_0x017d:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x0186
            java.lang.String r4 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0186:
            java.lang.String r0 = r0.getChallengeProfileUrl()
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x01af
            com.bytedance.lighten.a.t r4 = com.bytedance.lighten.p766a.C12203q.m24646a(r0)
            java.lang.String r5 = r14.f65289j
            com.bytedance.lighten.a.t r4 = r4.mo23118a(r5)
            com.bytedance.lighten.loader.SmartImageView r5 = r14.f65284d
            if (r5 != 0) goto L_0x01a6
            java.lang.String r6 = "mAvatar"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x01a6:
            com.bytedance.lighten.a.k r5 = (com.bytedance.lighten.p766a.C12197k) r5
            com.bytedance.lighten.a.t r4 = r4.mo23116a(r5)
            r4.mo23121a()
        L_0x01af:
            com.bytedance.lighten.loader.SmartImageView r4 = r14.f65284d
            if (r4 != 0) goto L_0x01b8
            java.lang.String r5 = "mAvatar"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x01b8:
            com.ss.android.ugc.aweme.challenge.ui.header.a$e r5 = new com.ss.android.ugc.aweme.challenge.ui.header.a$e
            r5.<init>(r14, r0)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.setOnClickListener(r5)
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x01cb
            java.lang.String r4 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x01cb:
            java.lang.String r0 = r0.getChallengeName()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r14.f65285e
            if (r4 != 0) goto L_0x01d8
            java.lang.String r5 = "mTitle"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x01d8:
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = r14.f65288h
            if (r5 != 0) goto L_0x01e3
            java.lang.String r5 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x01e3:
            com.p683ss.android.ugc.aweme.challenge.p1500ui.C24757r.m60290a(r0, r4, r3)
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x01ef
            java.lang.String r4 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x01ef:
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r0 = r0.getCommerceChallengeTask()
            if (r0 == 0) goto L_0x01fa
            java.lang.String r0 = r0.getDesc()
            goto L_0x01fb
        L_0x01fa:
            r0 = r1
        L_0x01fb:
            boolean r0 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r0)
            r4 = 8
            if (r0 != 0) goto L_0x02b0
            boolean r0 = r14.m60167f()
            if (r0 == 0) goto L_0x020f
            boolean r0 = r14.mo50599e()
            if (r0 == 0) goto L_0x02b0
        L_0x020f:
            android.view.ViewStub r0 = r14.f65286f
            if (r0 != 0) goto L_0x0218
            java.lang.String r5 = "mDescContainerVs"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0218:
            android.view.View r5 = r14.f65291l
            if (r5 != 0) goto L_0x021e
            r5 = 1
            goto L_0x021f
        L_0x021e:
            r5 = 0
        L_0x021f:
            if (r5 == 0) goto L_0x0222
            goto L_0x0223
        L_0x0222:
            r0 = r1
        L_0x0223:
            if (r0 == 0) goto L_0x0265
            android.view.View r0 = r0.inflate()
            r5 = 2132023755(0x7f1419cb, float:1.9685967E38)
            android.view.View r5 = r0.findViewById(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5
            r14.f65292m = r5
            r5 = 2132018925(0x7f1406ed, float:1.967617E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r14.f65293n = r5
            r5 = 2132023795(0x7f1419f3, float:1.9686048E38)
            android.view.View r5 = r0.findViewById(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5
            r14.f65294o = r5
            r5 = 2132020035(0x7f140b43, float:1.9678422E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r14.f65295p = r5
            android.widget.ImageView r5 = r14.f65295p
            if (r5 != 0) goto L_0x025c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x025c:
            android.content.res.Resources r6 = r0.getResources()
            com.p683ss.android.ugc.aweme.challenge.p1500ui.C24755p.m60285a(r5, r6)
            r14.f65291l = r0
        L_0x0265:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x026e
            java.lang.String r5 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x026e:
            java.lang.String r0 = r0.getDesc()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0282
            android.view.View r0 = r14.f65291l
            if (r0 == 0) goto L_0x02b0
            r0.setVisibility(r4)
            goto L_0x02b0
        L_0x0282:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r5 = r14.getDetailParam()
            com.ss.android.ugc.aweme.discover.model.Challenge r6 = r14.f65288h
            if (r6 != 0) goto L_0x028f
            java.lang.String r0 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x028f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f65292m
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.widget.LinearLayout r0 = r14.f65293n
            r8 = r0
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f65294o
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            android.widget.ImageView r10 = r14.f65295p
            android.view.View r11 = r14.f65291l
            r12 = 1
            com.p683ss.android.ugc.aweme.challenge.p1500ui.C24757r.m60289a(r5, r6, r7, r8, r9, r10, r11, r12)
            android.view.View r0 = r14.f65291l
            if (r0 != 0) goto L_0x02ad
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x02ad:
            r0.setVisibility(r3)
        L_0x02b0:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r0 = r14.f65287g
            if (r0 != 0) goto L_0x02b9
            java.lang.String r5 = "mChallengeDetail"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x02b9:
            java.util.List<com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic> r0 = r0.relatedChallengeMusicList
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            r5 = 0
            if (r0 == 0) goto L_0x02cd
            android.view.View r0 = r14.f65297r
            if (r0 == 0) goto L_0x0393
            r0.setVisibility(r4)
            goto L_0x0393
        L_0x02cd:
            android.view.ViewStub r0 = r14.f65296q
            if (r0 != 0) goto L_0x02d6
            java.lang.String r6 = "mRelatedContainerVs"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x02d6:
            android.view.View r6 = r14.f65297r
            if (r6 != 0) goto L_0x02dc
            r6 = 1
            goto L_0x02dd
        L_0x02dc:
            r6 = 0
        L_0x02dd:
            if (r6 == 0) goto L_0x02e0
            goto L_0x02e1
        L_0x02e0:
            r0 = r1
        L_0x02e1:
            if (r0 == 0) goto L_0x0353
            android.view.View r0 = r0.inflate()
            r1 = 2132018770(0x7f140652, float:1.9675856E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r14.f65298s = r1
            r1 = 2132023246(0x7f1417ce, float:1.9684934E38)
            android.view.View r1 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r1 = (android.support.p043v7.widget.RecyclerView) r1
            r14.f65299t = r1
            android.support.v7.widget.RecyclerView r1 = r14.f65299t
            if (r1 != 0) goto L_0x0304
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0304:
            com.ss.android.ugc.aweme.views.f r13 = new com.ss.android.ugc.aweme.views.f
            android.content.Context r6 = r1.getContext()
            java.lang.String r7 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131821756(0x7f1104bc, float:1.9276264E38)
            int r7 = r6.getColor(r7)
            android.content.Context r6 = r1.getContext()
            r8 = 1103101952(0x41c00000, float:24.0)
            float r6 = com.bytedance.common.utility.C9432q.m18687b(r6, r8)
            int r8 = (int) r6
            r9 = 0
            android.content.Context r6 = r1.getContext()
            float r10 = com.bytedance.common.utility.C9432q.m18687b(r6, r5)
            android.content.Context r6 = r1.getContext()
            float r11 = com.bytedance.common.utility.C9432q.m18687b(r6, r5)
            r12 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            android.support.v7.widget.RecyclerView$h r13 = (android.support.p043v7.widget.RecyclerView.C1331h) r13
            r1.mo4798a(r13)
            r1.setHasFixedSize(r2)
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r6 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.content.Context r7 = r1.getContext()
            r6.<init>(r7, r3, r3)
            android.support.v7.widget.RecyclerView$i r6 = (android.support.p043v7.widget.RecyclerView.C1332i) r6
            r1.setLayoutManager(r6)
            r14.f65297r = r0
        L_0x0353:
            android.support.v7.widget.RecyclerView r0 = r14.f65299t
            if (r0 != 0) goto L_0x035a
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x035a:
            com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter r1 = new com.ss.android.ugc.aweme.challenge.ui.RelatedMusicChallengeAdapter
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r6 = r14.f65287g
            if (r6 != 0) goto L_0x0365
            java.lang.String r7 = "mChallengeDetail"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0365:
            java.util.List<com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic> r6 = r6.relatedChallengeMusicList
            android.content.Context r7 = r14.getContext()
            r1.<init>(r6, r7)
            com.ss.android.ugc.aweme.discover.model.Challenge r6 = r14.f65288h
            if (r6 != 0) goto L_0x0377
            java.lang.String r7 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0377:
            java.lang.String r6 = r6.getCid()
            r1.f65174b = r6
            java.lang.String r6 = "challenge_page"
            r1.f65176d = r6
            android.support.v7.widget.RecyclerView$a r1 = (android.support.p043v7.widget.RecyclerView.C1322a) r1
            r0.setAdapter(r1)
            android.view.View r0 = r14.f65297r
            if (r0 != 0) goto L_0x038d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x038d:
            r0.setVisibility(r3)
            r14.m60169h()
        L_0x0393:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r0 = r14.f65287g
            if (r0 != 0) goto L_0x039c
            java.lang.String r1 = "mChallengeDetail"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x039c:
            java.lang.String r0 = r0.slideTitle
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0492
            com.ss.android.ugc.aweme.challenge.ui.header.l r0 = r14.f65276F
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r0 = r0.f65426f
            boolean r0 = com.p683ss.android.ugc.aweme.challenge.p1495ab.C24531a.m59939a(r0)
            if (r0 != 0) goto L_0x0492
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r0 = r14.f65287g
            if (r0 != 0) goto L_0x03b9
            java.lang.String r1 = "mChallengeDetail"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x03b9:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r0.slideList
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 != 0) goto L_0x0492
            boolean r0 = r14.m60167f()
            if (r0 == 0) goto L_0x03d1
            boolean r0 = r14.mo50599e()
            if (r0 != 0) goto L_0x03d1
            goto L_0x0492
        L_0x03d1:
            android.view.View r0 = r14.f65301v
            if (r0 != 0) goto L_0x0442
            android.view.ViewStub r0 = r14.f65300u
            if (r0 != 0) goto L_0x03de
            java.lang.String r1 = "mHorizontalSlideContainerVs"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x03de:
            android.view.View r0 = r0.inflate()
            r1 = 2132022849(0x7f141641, float:1.968413E38)
            android.view.View r1 = r0.findViewById(r1)
            r14.f65302w = r1
            r1 = 2132022855(0x7f141647, float:1.9684141E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r14.f65303x = r1
            r1 = 2132022854(0x7f141646, float:1.968414E38)
            android.view.View r1 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r1 = (android.support.p043v7.widget.RecyclerView) r1
            r14.f65304y = r1
            android.support.v7.widget.RecyclerView r1 = r14.f65304y
            if (r1 != 0) goto L_0x0408
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0408:
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r6 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.content.Context r7 = r14.getContext()
            r6.<init>(r7, r3, r3)
            android.support.v7.widget.RecyclerView$i r6 = (android.support.p043v7.widget.RecyclerView.C1332i) r6
            r1.setLayoutManager(r6)
            android.support.v7.widget.RecyclerView r1 = r14.f65304y
            if (r1 != 0) goto L_0x041d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x041d:
            com.ss.android.ugc.aweme.challenge.ui.header.a$f r6 = new com.ss.android.ugc.aweme.challenge.ui.header.a$f
            r6.<init>()
            android.support.v7.widget.RecyclerView$h r6 = (android.support.p043v7.widget.RecyclerView.C1331h) r6
            r1.mo4798a(r6)
            com.ss.android.ugc.aweme.challenge.ui.header.a.c r1 = new com.ss.android.ugc.aweme.challenge.ui.header.a.c
            com.ss.android.ugc.aweme.challenge.ui.header.a$c r6 = r14.f65280J
            com.ss.android.ugc.aweme.challenge.ui.header.a.d$b r6 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a.C24674d.C24677b) r6
            r1.<init>(r6, r2)
            r14.f65305z = r1
            android.support.v7.widget.RecyclerView r1 = r14.f65304y
            if (r1 != 0) goto L_0x0439
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0439:
            com.ss.android.ugc.aweme.challenge.ui.header.a.c r2 = r14.f65305z
            android.support.v7.widget.RecyclerView$a r2 = (android.support.p043v7.widget.RecyclerView.C1322a) r2
            r1.setAdapter(r2)
            r14.f65301v = r0
        L_0x0442:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r14.f65288h
            if (r0 != 0) goto L_0x044b
            java.lang.String r1 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x044b:
            com.ss.android.ugc.aweme.discover.model.RelatedMediaSourceStruct r0 = r0.getMediaSource()
            if (r0 != 0) goto L_0x0458
            android.view.View r0 = r14.f65302w
            if (r0 == 0) goto L_0x0458
            r0.setVisibility(r3)
        L_0x0458:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f65303x
            if (r0 != 0) goto L_0x045f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x045f:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r1 = r14.f65287g
            if (r1 != 0) goto L_0x0468
            java.lang.String r2 = "mChallengeDetail"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0468:
            java.lang.String r1 = r1.slideTitle
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.challenge.ui.header.a.c r0 = r14.f65305z
            if (r0 != 0) goto L_0x0476
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0476:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r1 = r14.f65287g
            if (r1 != 0) goto L_0x047f
            java.lang.String r2 = "mChallengeDetail"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x047f:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r1.slideList
            r0.mo50553a(r1)
            android.view.View r0 = r14.f65301v
            if (r0 != 0) goto L_0x048b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x048b:
            r0.setVisibility(r3)
            r14.mo50514c()
            goto L_0x0499
        L_0x0492:
            android.view.View r0 = r14.f65301v
            if (r0 == 0) goto L_0x0499
            r0.setVisibility(r4)
        L_0x0499:
            boolean r0 = com.p683ss.android.ugc.aweme.challenge.p1500ui.C24755p.m60287a()
            r1 = 2132017211(0x7f14003b, float:1.9672694E38)
            if (r0 == 0) goto L_0x056c
            com.ss.android.ugc.aweme.l.c r0 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            if (r0 == 0) goto L_0x059f
            com.ss.android.ugc.aweme.l.c$b r2 = r0.f29318s
            if (r2 == 0) goto L_0x059f
            java.util.List<java.lang.String> r2 = r0.f29317r
            if (r2 == 0) goto L_0x059f
            java.util.List<java.lang.String> r2 = r0.f29317r
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r15.challenge
            java.lang.String r6 = "data.challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            java.lang.String r4 = r4.getCid()
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x059f
            r2 = 2132017210(0x7f14003a, float:1.9672692E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r14.f65271A = r2
            android.view.View r1 = r14.findViewById(r1)
            com.bytedance.lighten.loader.SmartImageView r1 = (com.bytedance.lighten.loader.SmartImageView) r1
            r14.f65272B = r1
            android.widget.FrameLayout r1 = r14.f65271A
            if (r1 == 0) goto L_0x04dd
            r1.setVisibility(r3)
        L_0x04dd:
            com.bytedance.lighten.loader.SmartImageView r1 = r14.f65272B
            if (r1 == 0) goto L_0x04e4
            r1.setVisibility(r3)
        L_0x04e4:
            com.ss.android.ugc.aweme.l.c$b r1 = r0.f29318s
            java.lang.String r2 = "entry.bannerDetail"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.f29321a
            com.bytedance.lighten.a.t r1 = com.bytedance.lighten.p766a.C12203q.m24646a(r1)
            java.lang.String r2 = "AbsCommonHeaderLayout"
            com.bytedance.lighten.a.t r1 = r1.mo23118a(r2)
            android.content.Context r2 = r14.getContext()
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.bytedance.lighten.a.e$a r3 = new com.bytedance.lighten.a.e$a
            r3.<init>()
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = com.bytedance.lighten.p766a.p770d.C12186c.m24630a(r2, r4)
            com.bytedance.lighten.a.e$a r3 = r3.mo23107b(r4)
            float r2 = com.bytedance.lighten.p766a.p770d.C12186c.m24630a(r2, r5)
            com.bytedance.lighten.a.e$a r2 = r3.mo23103a(r2)
            com.bytedance.lighten.a.e r2 = r2.mo23106a()
            java.lang.String r3 = "builder.build()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            com.bytedance.lighten.a.t r1 = r1.mo23115a(r2)
            com.bytedance.lighten.loader.SmartImageView r2 = r14.f65272B
            com.bytedance.lighten.a.k r2 = (com.bytedance.lighten.p766a.C12197k) r2
            com.bytedance.lighten.a.t r1 = r1.mo23116a(r2)
            r1.mo23121a()
            java.lang.String r1 = "xmas_banner_show"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "tag_page"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "gen"
            java.lang.String r4 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73100c()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.lang.String r3 = "tag_id"
            com.ss.android.ugc.aweme.discover.model.Challenge r4 = r15.challenge
            java.lang.String r5 = "data.challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r4 = r4.getCid()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r1, r2)
            android.widget.FrameLayout r1 = r14.f65271A
            if (r1 == 0) goto L_0x059f
            com.ss.android.ugc.aweme.challenge.ui.header.a$d r2 = new com.ss.android.ugc.aweme.challenge.ui.header.a$d
            r2.<init>(r14, r0, r15)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            goto L_0x059f
        L_0x056c:
            com.ss.android.ugc.aweme.l.c r0 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            if (r0 == 0) goto L_0x0590
            java.util.List<java.lang.String> r2 = r0.f29317r
            if (r2 == 0) goto L_0x0590
            java.util.List<java.lang.String> r0 = r0.f29317r
            com.ss.android.ugc.aweme.discover.model.Challenge r2 = r15.challenge
            java.lang.String r3 = "data.challenge"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = r2.getCid()
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0590
            android.view.View r0 = r14.f65291l
            if (r0 == 0) goto L_0x0590
            r0.setVisibility(r4)
        L_0x0590:
            android.view.View r0 = r14.findViewById(r1)
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            r14.f65272B = r0
            android.widget.FrameLayout r0 = r14.f65271A
            if (r0 == 0) goto L_0x059f
            r0.setVisibility(r4)
        L_0x059f:
            java.util.List<com.ss.android.ugc.aweme.challenge.ui.header.n> r0 = r14.f65275E
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x05a7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05b7
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.challenge.ui.header.n r1 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24708n) r1
            r1.mo50579a(r15)
            goto L_0x05a7
        L_0x05b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24664a.mo50509a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    /* renamed from: a */
    public final void mo50511a(Aweme aweme, int i) {
        String str = "click_challenge_video_card";
        C23089d a = C23089d.m56640a();
        String str2 = "challenge_id";
        Challenge challenge = this.f65288h;
        if (challenge == null) {
            C52711k.m112237a("mChallenge");
        }
        C26890h.m65011a(str, a.mo47829a(str2, challenge.getCid()).mo47829a("group_id", aweme.getAid()).mo47826a("order", i).f61491a);
    }

    public C24664a(Context context, C24706l lVar, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        if (lVar == null) {
            C52711k.m112234a();
        }
        this.f65276F = lVar;
        LayoutInflater.from(context).inflate(getLayoutResId(), this, true);
        mo50508a();
        mo50513b();
        this.f65279I = new C24666b(this);
        this.f65280J = new C24667c(this);
    }
}
