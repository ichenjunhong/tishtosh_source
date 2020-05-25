package com.p683ss.android.ugc.trill.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.p683ss.android.ugc.aweme.base.widget.CanCancelRadioButton.C23737a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.share.C41985as;
import com.p683ss.android.ugc.aweme.share.C41985as.C41986a;
import com.p683ss.android.ugc.aweme.share.C42227o;
import com.p683ss.android.ugc.trill.p2521f.C50323b;
import com.p683ss.android.ugc.trill.share.helo.C50460a;
import com.p683ss.android.ugc.trill.share.helo.C50460a.C50461a;
import com.p683ss.android.ugc.trill.share.helo.C50477b;
import com.p683ss.android.ugc.trill.share.helo.p2526a.C50475a;
import com.p683ss.android.ugc.trill.share.helo.p2526a.C50476b;
import com.p683ss.android.ugc.trill.share.helo.p2527b.C50481b;
import com.p683ss.android.ugc.trill.share.helo.p2527b.C50481b.C50482a;
import com.p683ss.android.ugc.trill.share.helo.p2529d.C50485a;
import com.p683ss.android.ugc.trill.share.helo.p2529d.C50486b;
import com.p683ss.android.ugc.trill.share.p2525a.C50413a;
import com.p683ss.android.ugc.trill.share.p2530ui.SilentSharePopupWindow;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.trill.share.i */
public final class C50487i extends C42227o {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f126559b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50487i.class), "heloGroup", "getHeloGroup()Landroid/widget/RadioGroup;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50487i.class), "heloButton", "getHeloButton()Lcom/ss/android/ugc/aweme/base/widget/CanCancelRadioButton;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50487i.class), "radioGroup", "getRadioGroup()Landroid/widget/RadioGroup;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50487i.class), "syncTitle", "getSyncTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: k */
    public static final C50488a f126560k = new C50488a(null);

    /* renamed from: c */
    public boolean f126561c;

    /* renamed from: d */
    int f126562d;

    /* renamed from: e */
    public final List<C52847n<C41985as, CanCancelRadioButton>> f126563e = new ArrayList();

    /* renamed from: f */
    public SilentSharePopupWindow f126564f;

    /* renamed from: g */
    public String f126565g = "";

    /* renamed from: h */
    int f126566h = 2;

    /* renamed from: i */
    public int f126567i = -1;

    /* renamed from: j */
    final Context f126568j;

    /* renamed from: l */
    private final C52668f f126569l = C52732g.m112285a(new C50493f(this));

    /* renamed from: m */
    private final C52668f f126570m = C52732g.m112285a(new C50492e(this));

    /* renamed from: n */
    private final C52668f f126571n = C52732g.m112285a(new C50495h(this));

    /* renamed from: o */
    private final C52668f f126572o = C52732g.m112285a(new C50497j(this));

    /* renamed from: p */
    private final int f126573p = 0;

    /* renamed from: com.ss.android.ugc.trill.share.i$a */
    public static final class C50488a {
        private C50488a() {
        }

        public /* synthetic */ C50488a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$b */
    static final class C50489b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50487i f126574a;

        C50489b(C50487i iVar) {
            this.f126574a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf isAwemePrivate = inst.getIsAwemePrivate();
            C52711k.m112236a((Object) isAwemePrivate, "SharePrefCache.inst().isAwemePrivate");
            Object d = isAwemePrivate.mo47782d();
            C52711k.m112236a(d, "SharePrefCache.inst().isAwemePrivate.cache");
            if (((Boolean) d).booleanValue()) {
                C10691a.m21551c(this.f126574a.getContext(), this.f126574a.getContext().getString(R.string.cxx)).mo19066a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$c */
    static final class C50490c implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C50487i f126575a;

        C50490c(C50487i iVar) {
            this.f126575a = iVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            int i2;
            int i3 = i;
            C50487i iVar = this.f126575a;
            if (iVar.f126567i != i3) {
                int i4 = 0;
                if (i3 == -1) {
                    C23542f.m57715a().mo48707b("key_silent_share_save", 0);
                }
                int i5 = 1;
                if (!iVar.f126561c) {
                    iVar.f126561c = true;
                    AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().cancelSynthetise(iVar.getContext());
                }
                if (iVar.f126564f != null && C50487i.m108832a(iVar).isShowing()) {
                    C50487i.m108832a(iVar).dismiss();
                }
                for (C52847n nVar : iVar.f126563e) {
                    if (((CanCancelRadioButton) nVar.getSecond()).getId() == i3) {
                        C23542f.m57715a().mo48707b("key_silent_share_save", ((C41985as) nVar.getFirst()).getSaveType());
                        View view = (View) nVar.getSecond();
                        String label = ((C41985as) nVar.getFirst()).getLabel();
                        if (C23542f.m57715a().mo48699a("key_pop_up_window_share_count", i4) < 3 && (!C50412a.m108716b() || iVar.f126566h > 0)) {
                            iVar.f126566h -= i5;
                            if (iVar.f126564f != null) {
                                SilentSharePopupWindow silentSharePopupWindow = iVar.f126564f;
                                if (silentSharePopupWindow == null) {
                                    C52711k.m112237a("popupWindow");
                                }
                                if (silentSharePopupWindow.isShowing()) {
                                    SilentSharePopupWindow silentSharePopupWindow2 = iVar.f126564f;
                                    if (silentSharePopupWindow2 == null) {
                                        C52711k.m112237a("popupWindow");
                                    }
                                    silentSharePopupWindow2.dismiss();
                                }
                            }
                            Context context = iVar.getContext();
                            C52711k.m112236a((Object) context, "context");
                            Resources resources = iVar.getResources();
                            Object[] objArr = new Object[i5];
                            objArr[i4] = label;
                            String string = resources.getString(R.string.d67, objArr);
                            C52711k.m112236a((Object) string, "resources.getString(R.st…direct_share_hint, label)");
                            SilentSharePopupWindow silentSharePopupWindow3 = new SilentSharePopupWindow(context, string, (int) C20141b.m49696a(iVar.getContext(), 3.0f), 0, 8, null);
                            iVar.f126564f = silentSharePopupWindow3;
                            SilentSharePopupWindow silentSharePopupWindow4 = iVar.f126564f;
                            if (silentSharePopupWindow4 == null) {
                                C52711k.m112237a("popupWindow");
                            }
                            silentSharePopupWindow4.getContentView().measure(i4, i4);
                            float a = C20141b.m49696a(iVar.getContext(), 10.0f);
                            SilentSharePopupWindow silentSharePopupWindow5 = iVar.f126564f;
                            if (silentSharePopupWindow5 == null) {
                                C52711k.m112237a("popupWindow");
                            }
                            View contentView = silentSharePopupWindow5.getContentView();
                            C52711k.m112236a((Object) contentView, "popupWindow.contentView");
                            int measuredWidth = contentView.getMeasuredWidth();
                            SilentSharePopupWindow silentSharePopupWindow6 = iVar.f126564f;
                            if (silentSharePopupWindow6 == null) {
                                C52711k.m112237a("popupWindow");
                            }
                            View contentView2 = silentSharePopupWindow6.getContentView();
                            C52711k.m112236a((Object) contentView2, "popupWindow.contentView");
                            int measuredHeight = contentView2.getMeasuredHeight();
                            SilentSharePopupWindow silentSharePopupWindow7 = iVar.f126564f;
                            if (silentSharePopupWindow7 == null) {
                                C52711k.m112237a("popupWindow");
                            }
                            ImageView imageView = (ImageView) silentSharePopupWindow7.getContentView().findViewById(R.id.aya);
                            SilentSharePopupWindow silentSharePopupWindow8 = iVar.f126564f;
                            if (silentSharePopupWindow8 == null) {
                                C52711k.m112237a("popupWindow");
                            }
                            ImageView imageView2 = (ImageView) silentSharePopupWindow8.getContentView().findViewById(R.id.ayb);
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            int a2 = C20141b.m49697a(iVar.f126568j);
                            int width = iArr[i4] + (view.getWidth() / 2);
                            int i6 = measuredWidth / 2;
                            float f = (float) width;
                            if (((float) i6) + a > f) {
                                i2 = (int) (a - ((float) iArr[0]));
                                C52711k.m112236a((Object) imageView, "left");
                                imageView.getLayoutParams().width = (int) (f - a);
                                C52711k.m112236a((Object) imageView2, "right");
                                imageView2.getLayoutParams().width = measuredWidth - imageView.getLayoutParams().width;
                            } else {
                                float f2 = (float) (width + i6);
                                float f3 = ((float) a2) - a;
                                if (f2 > f3) {
                                    i2 = (int) (f3 - ((float) (iArr[0] + measuredWidth)));
                                    C52711k.m112236a((Object) imageView2, "right");
                                    imageView2.getLayoutParams().width = (int) (f3 - f);
                                    C52711k.m112236a((Object) imageView, "left");
                                    imageView.getLayoutParams().width = measuredWidth - imageView2.getLayoutParams().width;
                                } else {
                                    i2 = (view.getWidth() - measuredWidth) / 2;
                                    C52711k.m112236a((Object) imageView, "left");
                                    imageView.getLayoutParams().width = i6;
                                    C52711k.m112236a((Object) imageView2, "right");
                                    imageView2.getLayoutParams().width = i6;
                                }
                            }
                            imageView.getLayoutParams().height = measuredHeight;
                            imageView2.getLayoutParams().height = measuredHeight;
                            SilentSharePopupWindow silentSharePopupWindow9 = iVar.f126564f;
                            if (silentSharePopupWindow9 == null) {
                                C52711k.m112237a("popupWindow");
                            }
                            silentSharePopupWindow9.getContentView().measure(0, 0);
                            View contentView3 = silentSharePopupWindow9.getContentView();
                            C52711k.m112236a((Object) contentView3, "contentView");
                            silentSharePopupWindow9.f126587c = contentView3.getMeasuredHeight();
                            View contentView4 = silentSharePopupWindow9.getContentView();
                            C52711k.m112236a((Object) contentView4, "contentView");
                            silentSharePopupWindow9.f126586b = contentView4.getMeasuredWidth();
                            try {
                                SilentSharePopupWindow silentSharePopupWindow10 = iVar.f126564f;
                                if (silentSharePopupWindow10 == null) {
                                    C52711k.m112237a("popupWindow");
                                }
                                if (view != null && (!(silentSharePopupWindow10.f126588d instanceof Activity) || !((Activity) silentSharePopupWindow10.f126588d).isFinishing())) {
                                    if (VERSION.SDK_INT >= 19) {
                                        silentSharePopupWindow10.showAsDropDown(view, i2, -(view.getHeight() + silentSharePopupWindow10.f126587c + silentSharePopupWindow10.f126589e), 51);
                                    } else {
                                        silentSharePopupWindow10.showAsDropDown(view, i2, -(view.getHeight() + silentSharePopupWindow10.f126587c + silentSharePopupWindow10.f126589e));
                                    }
                                    silentSharePopupWindow10.getContentView().removeCallbacks(silentSharePopupWindow10.f126585a);
                                    silentSharePopupWindow10.getContentView().postDelayed(silentSharePopupWindow10.f126585a, 5000);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        iVar.mo98396a(true, ((C41985as) nVar.getFirst()).getKey());
                    }
                    if (((CanCancelRadioButton) nVar.getSecond()).getId() == iVar.f126567i) {
                        iVar.mo98396a(false, ((C41985as) nVar.getFirst()).getKey());
                    }
                    i4 = 0;
                    i5 = 1;
                }
                iVar.f126567i = i3;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$d */
    public static final class C50491d implements C50475a {

        /* renamed from: a */
        final /* synthetic */ C50487i f126576a;

        /* renamed from: a */
        public final void mo98324a() {
            this.f126576a.getHeloGroup().clearCheck();
            this.f126576a.getHeloButton().setCanChecked(true);
            CanCancelRadioButton heloButton = this.f126576a.getHeloButton();
            C52711k.m112236a((Object) heloButton, "heloButton");
            heloButton.setChecked(true);
            C50482a.m108825a().mo98380b(this.f126576a.mo98397d());
            C50482a.m108825a().mo98378a(true);
        }

        C50491d(C50487i iVar) {
            this.f126576a = iVar;
        }

        /* renamed from: a */
        public final void mo98325a(int i, String str, String str2) {
            this.f126576a.getHeloButton().setCanChecked(false);
            CanCancelRadioButton heloButton = this.f126576a.getHeloButton();
            C52711k.m112236a((Object) heloButton, "heloButton");
            heloButton.setChecked(false);
            C50482a.m108825a().mo98380b(this.f126576a.mo98397d());
            C50482a.m108825a().mo98378a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$e */
    static final class C50492e extends C52712l implements C52670a<CanCancelRadioButton> {

        /* renamed from: a */
        final /* synthetic */ C50487i f126577a;

        C50492e(C50487i iVar) {
            this.f126577a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (CanCancelRadioButton) this.f126577a.findViewById(R.id.ny);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$f */
    static final class C50493f extends C52712l implements C52670a<RadioGroup> {

        /* renamed from: a */
        final /* synthetic */ C50487i f126578a;

        C50493f(C50487i iVar) {
            this.f126578a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RadioGroup) this.f126578a.findViewById(R.id.aml);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$g */
    public static final class C50494g implements C50476b {

        /* renamed from: a */
        final /* synthetic */ C50487i f126579a;

        /* renamed from: b */
        final /* synthetic */ boolean f126580b;

        C50494g(C50487i iVar, boolean z) {
            this.f126579a = iVar;
            this.f126580b = z;
        }

        /* renamed from: a */
        public final void mo98326a(boolean z, boolean z2) {
            boolean z3;
            boolean z4;
            CanCancelRadioButton heloButton = this.f126579a.getHeloButton();
            boolean z5 = true;
            if (!this.f126580b || !z || !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            heloButton.setCanChecked(z3);
            CanCancelRadioButton heloButton2 = this.f126579a.getHeloButton();
            C52711k.m112236a((Object) heloButton2, "heloButton");
            if (this.f126580b && z && z2) {
                CanCancelRadioButton heloButton3 = this.f126579a.getHeloButton();
                C52711k.m112236a((Object) heloButton3, "heloButton");
                if (heloButton3.isChecked()) {
                    z4 = true;
                    heloButton2.setChecked(z4);
                    C50482a.m108825a().mo98380b(this.f126579a.mo98397d());
                    C50481b a = C50482a.m108825a();
                    if (!z || !z2) {
                        z5 = false;
                    }
                    a.mo98378a(z5);
                }
            }
            z4 = false;
            heloButton2.setChecked(z4);
            C50482a.m108825a().mo98380b(this.f126579a.mo98397d());
            C50481b a2 = C50482a.m108825a();
            z5 = false;
            a2.mo98378a(z5);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$h */
    static final class C50495h extends C52712l implements C52670a<RadioGroup> {

        /* renamed from: a */
        final /* synthetic */ C50487i f126581a;

        C50495h(C50487i iVar) {
            this.f126581a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RadioGroup) this.f126581a.findViewById(R.id.c7y);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$i */
    static final class C50496i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C50487i f126582a;

        C50496i(C50487i iVar) {
            this.f126582a = iVar;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            C50413a aVar = (C50413a) C23540d.m57713a(this.f126582a.getContext(), C50413a.class);
            CanCancelRadioButton heloButton = this.f126582a.getHeloButton();
            if (heloButton != null) {
                z = heloButton.f63268a;
            } else {
                z = false;
            }
            if (z) {
                C50482a.m108825a().mo98380b(this.f126582a.mo98397d());
                this.f126582a.mo98396a(this.f126582a.mo98397d(), "helo");
                return;
            }
            this.f126582a.getHeloButton().toggle();
            if (aVar.mo48484b(false)) {
                C50487i iVar = this.f126582a;
                if (iVar.f126562d == 2) {
                    C10691a.m21551c(iVar.getContext(), iVar.getContext().getString(R.string.wd)).mo19066a();
                } else {
                    C10691a.m21551c(iVar.getContext(), iVar.getContext().getString(R.string.cxx)).mo19066a();
                }
            } else {
                if (!C50487i.m108834c()) {
                    this.f126582a.f126565g = "helo";
                    C50487i iVar2 = this.f126582a;
                    String userName = iVar2.getUserName();
                    String userAvatarUrl = iVar2.getUserAvatarUrl();
                    C50477b b = C50461a.m108799a().mo98373b();
                    Fragment fragment = iVar2.getFragment();
                    C52711k.m112236a((Object) fragment, "fragment");
                    FragmentActivity activity = fragment.getActivity();
                    if (activity == null) {
                        C52711k.m112234a();
                    }
                    C52711k.m112236a((Object) activity, "fragment.activity!!");
                    b.mo98377a((Activity) activity, new C50485a(userName, userAvatarUrl), new C50491d(iVar2));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.i$j */
    static final class C50497j extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C50487i f126583a;

        C50497j(C50487i iVar) {
            this.f126583a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f126583a.findViewById(R.id.cwi);
        }
    }

    private final RadioGroup getRadioGroup() {
        return (RadioGroup) this.f126571n.getValue();
    }

    private final DmtTextView getSyncTitle() {
        return (DmtTextView) this.f126572o.getValue();
    }

    /* renamed from: a */
    public final void mo86178a(int i, C23737a aVar) {
    }

    /* renamed from: a */
    public final void mo86179a(int i, boolean z) {
    }

    public final CanCancelRadioButton getHeloButton() {
        return (CanCancelRadioButton) this.f126570m.getValue();
    }

    public final RadioGroup getHeloGroup() {
        return (RadioGroup) this.f126569l.getValue();
    }

    public final void setSaveLocalEnabled(boolean z) {
    }

    /* renamed from: c */
    public static boolean m108834c() {
        C50461a.m108799a();
        return C50460a.m108792a();
    }

    private final int getLayoutResId() {
        if (this.f126573p == 0) {
            return R.layout.awo;
        }
        return R.layout.c2;
    }

    /* renamed from: d */
    public final boolean mo98397d() {
        CanCancelRadioButton heloButton = getHeloButton();
        if (heloButton != null) {
            return heloButton.isChecked();
        }
        return false;
    }

    /* renamed from: f */
    private final void m108836f() {
        Context context = getContext();
        if (context != null) {
            if (!(!C41986a.m91950a((Activity) context).isEmpty()) && !C50412a.m108715a()) {
                DmtTextView syncTitle = getSyncTitle();
                C52711k.m112236a((Object) syncTitle, "syncTitle");
                syncTitle.setVisibility(8);
                getRadioGroup().setVisibility(8);
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    public final void mo86175a() {
        C50461a.m108799a().mo98373b().mo98375a();
    }

    /* renamed from: b */
    public final String mo86180b() {
        ArrayList arrayList = new ArrayList();
        if (mo98397d()) {
            arrayList.add(Integer.valueOf(100));
        }
        int saveUploadType = getSaveUploadType();
        if (saveUploadType != 0) {
            arrayList.add(Integer.valueOf(saveUploadType));
        }
        return C50323b.m108603a(";", arrayList);
    }

    public final int getSaveUploadType() {
        for (C52847n nVar : this.f126563e) {
            if (((CanCancelRadioButton) nVar.getSecond()).getId() == getRadioGroup().getCheckedRadioButtonId()) {
                return ((C41985as) nVar.getFirst()).getSaveType();
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final String getUserName() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        C52711k.m112236a((Object) baseUserService_Monster, "service");
        if (baseUserService_Monster.getCurrentUser() == null) {
            return "";
        }
        User currentUser = baseUserService_Monster.getCurrentUser();
        C52711k.m112236a((Object) currentUser, "service.currentUser");
        String nickname = currentUser.getNickname();
        C52711k.m112236a((Object) nickname, "service.currentUser.nickname");
        return nickname;
    }

    /* access modifiers changed from: 0000 */
    public final String getUserAvatarUrl() {
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        C52711k.m112236a((Object) baseUserService_Monster, "service");
        if (baseUserService_Monster.getCurrentUser() != null) {
            User currentUser = baseUserService_Monster.getCurrentUser();
            C52711k.m112236a((Object) currentUser, "service.currentUser");
            if (currentUser.getAvatarMedium() != null) {
                User currentUser2 = baseUserService_Monster.getCurrentUser();
                C52711k.m112236a((Object) currentUser2, "service.currentUser");
                UrlModel avatarMedium = currentUser2.getAvatarMedium();
                C52711k.m112236a((Object) avatarMedium, "service.currentUser.avatarMedium");
                if (avatarMedium.getUrlList() != null) {
                    User currentUser3 = baseUserService_Monster.getCurrentUser();
                    C52711k.m112236a((Object) currentUser3, "service.currentUser");
                    UrlModel avatarMedium2 = currentUser3.getAvatarMedium();
                    C52711k.m112236a((Object) avatarMedium2, "service.currentUser.avatarMedium");
                    if (avatarMedium2.getUrlList().size() != 0) {
                        User currentUser4 = baseUserService_Monster.getCurrentUser();
                        C52711k.m112236a((Object) currentUser4, "service.currentUser");
                        UrlModel avatarMedium3 = currentUser4.getAvatarMedium();
                        C52711k.m112236a((Object) avatarMedium3, "service.currentUser.avatarMedium");
                        Object obj = avatarMedium3.getUrlList().get(0);
                        C52711k.m112236a(obj, "service.currentUser.avatarMedium.urlList[0]");
                        return (String) obj;
                    }
                }
            }
        }
        return "";
    }

    /* renamed from: e */
    private final void m108835e() {
        int i;
        if (getContext() instanceof Activity) {
            RadioGroup radioGroup = (RadioGroup) findViewById(R.id.c7y);
            Context context = getContext();
            if (context != null) {
                List a = C41986a.m91950a((Activity) context);
                if (a.isEmpty()) {
                    m108836f();
                    return;
                }
                Iterable iterable = a;
                if (C50412a.m108716b()) {
                    i = 4;
                } else {
                    i = 3;
                }
                for (C41985as asVar : C52575l.m112129b(iterable, i)) {
                    View inflate = LayoutInflater.from(getContext()).inflate(R.layout.a6q, radioGroup, false);
                    if (inflate != null) {
                        CanCancelRadioButton canCancelRadioButton = (CanCancelRadioButton) inflate;
                        canCancelRadioButton.setTag(asVar);
                        canCancelRadioButton.setBackground(getResources().getDrawable(asVar.getIconRes()));
                        canCancelRadioButton.setId(View.generateViewId());
                        canCancelRadioButton.setOnClickListener(new C50489b(this));
                        radioGroup.addView(canCancelRadioButton);
                        this.f126563e.add(new C52847n(asVar, canCancelRadioButton));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton");
                    }
                }
                int a2 = C23542f.m57715a().mo48699a("key_silent_share_save", 0);
                for (C52847n nVar : this.f126563e) {
                    if (((C41985as) nVar.getFirst()).getSaveType() == a2) {
                        ((CanCancelRadioButton) nVar.getSecond()).setChecked(true);
                        this.f126567i = ((CanCancelRadioButton) nVar.getSecond()).getId();
                    }
                }
                radioGroup.setOnCheckedChangeListener(new C50490c(this));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public final void setSyncShareViewTextColor(int i) {
        getSyncTitle().setTextColor(i);
    }

    /* renamed from: a */
    public static final /* synthetic */ SilentSharePopupWindow m108832a(C50487i iVar) {
        SilentSharePopupWindow silentSharePopupWindow = iVar.f126564f;
        if (silentSharePopupWindow == null) {
            C52711k.m112237a("popupWindow");
        }
        return silentSharePopupWindow;
    }

    public final void setSyncShareViewTextSize(float f) {
        DmtTextView syncTitle = getSyncTitle();
        C52711k.m112236a((Object) syncTitle, "syncTitle");
        syncTitle.setTextSize(f);
    }

    public final void setSyncShareViewTitle(String str) {
        DmtTextView syncTitle = getSyncTitle();
        C52711k.m112236a((Object) syncTitle, "syncTitle");
        syncTitle.setText(str);
    }

    /* renamed from: a */
    private static String m108833a(Object obj) {
        if (obj != null) {
            String obj2 = obj.toString();
            if (obj2 != null) {
                return obj2;
            }
        }
        return "";
    }

    public final void setSyncIconSize(int i) {
        for (C52847n second : this.f126563e) {
            LayoutParams layoutParams = ((CanCancelRadioButton) second.getSecond()).getLayoutParams();
            layoutParams.height = i;
            layoutParams.width = i;
        }
    }

    /* renamed from: a */
    public final void mo86176a(int i) {
        boolean z;
        int i2 = 0;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f126562d = i;
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf isAwemePrivate = inst.getIsAwemePrivate();
        C52711k.m112236a((Object) isAwemePrivate, "SharePrefCache.inst().isAwemePrivate");
        isAwemePrivate.mo47776a(Boolean.valueOf(z));
        ((C50413a) C23540d.m57713a(getContext(), C50413a.class)).mo48483a(z);
        if (C50412a.m108715a()) {
            if (z) {
                getHeloButton().setCanChecked(false);
                if (getHeloGroup() != null) {
                    RadioGroup heloGroup = getHeloGroup();
                    C52711k.m112236a((Object) heloGroup, "heloGroup");
                    int checkedRadioButtonId = heloGroup.getCheckedRadioButtonId();
                    CanCancelRadioButton heloButton = getHeloButton();
                    if (heloButton == null) {
                        C52711k.m112234a();
                    }
                    if (checkedRadioButtonId == heloButton.getId()) {
                        getHeloGroup().check(-1);
                    }
                }
            } else {
                getHeloButton().setCanChecked(m108834c());
            }
        }
        if (z) {
            if (getRadioGroup().getCheckedRadioButtonId() != -1) {
                getRadioGroup().check(-1);
            }
            for (C52847n second : this.f126563e) {
                ((CanCancelRadioButton) second.getSecond()).setCanChecked(false);
            }
        } else {
            for (C52847n second2 : this.f126563e) {
                ((CanCancelRadioButton) second2.getSecond()).setCanChecked(true);
            }
        }
        DmtTextView syncTitle = getSyncTitle();
        C52711k.m112236a((Object) syncTitle, "syncTitle");
        if (z) {
            i2 = 8;
        }
        syncTitle.setVisibility(i2);
        m108836f();
    }

    public C50487i(Context context, int i) {
        boolean z;
        C52711k.m112240b(context, "ctx");
        super(context);
        this.f126568j = context;
        boolean z2 = false;
        LayoutInflater.from(this.f126568j).inflate(getLayoutResId(), this, true);
        m108835e();
        CanCancelRadioButton heloButton = getHeloButton();
        if (heloButton != null) {
            heloButton.setOnClickListener(new C50496i(this));
        }
        if (getHeloButton() != null && C50412a.m108715a()) {
            RadioGroup heloGroup = getHeloGroup();
            C52711k.m112236a((Object) heloGroup, "heloGroup");
            heloGroup.setVisibility(0);
            C50413a aVar = (C50413a) C23540d.m57713a(getContext(), C50413a.class);
            boolean b = C50482a.m108825a().mo98381b();
            boolean z3 = !aVar.mo48484b(false);
            CanCancelRadioButton heloButton2 = getHeloButton();
            if (!z3 || !m108834c()) {
                z = false;
            } else {
                z = true;
            }
            heloButton2.setCanChecked(z);
            CanCancelRadioButton heloButton3 = getHeloButton();
            C52711k.m112236a((Object) heloButton3, "heloButton");
            if (z3 && m108834c() && b) {
                z2 = true;
            }
            heloButton3.setChecked(z2);
            C50461a.m108799a().mo98372a(new C50494g(this, z3));
        }
        if (C50412a.m108715a()) {
            C50460a a = C50461a.m108799a();
            Context context2 = getContext();
            C52711k.m112236a((Object) context2, "context");
            a.mo98370a(context2, new C50486b(TutorialVideoApiManager.f96873a, "https://open-api.tiktok.com"));
        }
    }

    /* renamed from: a */
    public final void mo98396a(boolean z, String str) {
        String str2;
        Object tag = getTag();
        if (!(tag instanceof Map)) {
            tag = null;
        }
        Map map = (Map) tag;
        if (map != null) {
            if (z) {
                str2 = "publish_share_confirm";
            } else {
                str2 = "publish_share_cancel";
            }
            C26890h.m65011a(str2, C23089d.m56640a().mo47829a("creation_id", m108833a(map.get("creation_id"))).mo47829a("enter_from", m108833a(map.get("enter_from"))).mo47829a("content_type", m108833a(map.get("content_type"))).mo47829a("shoot_way", m108833a(map.get("shoot_way"))).mo47829a("share_to", str).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo86177a(int i, int i2, Intent intent) {
        String str = this.f126565g;
        if (str.hashCode() == 3198784 && str.equals("helo")) {
            C50461a.m108799a().mo98373b().mo98376a(i, i2, intent);
        }
    }
}
