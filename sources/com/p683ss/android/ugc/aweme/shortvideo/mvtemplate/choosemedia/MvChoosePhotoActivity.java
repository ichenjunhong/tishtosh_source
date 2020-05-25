package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C1000h;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.C12935m;
import com.bytedance.scene.navigation.C12942d;
import com.bytedance.scene.p837a.C12837c;
import com.bytedance.scene.p837a.p838a.C12833c;
import com.bytedance.scene.p840b.C12861f.C12863a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23579a;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.greenscreen.p1795a.C32873b;
import com.p683ss.android.ugc.aweme.greenscreen.p1795a.C32884e;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.photo.local.MediaTypeNavigator;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44091ad.C44093b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44108ap.C44109a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.C44028a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44081b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2212b.C44013c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44210d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44213g;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44226i;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44226i.C44227a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44251l;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44251l.C44252a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44295c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44296d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44306f;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44285b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44290d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44291e;
import com.p683ss.android.ugc.aweme.shortvideo.p2202f.C43805a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.vesdk.C50784u;
import com.p683ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52708h;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity */
public final class MvChoosePhotoActivity extends AmeActivity implements C44028a {

    /* renamed from: L */
    public static final C44037b f111520L = new C44037b(null);

    /* renamed from: A */
    public int f111521A;

    /* renamed from: B */
    public int f111522B;

    /* renamed from: C */
    public C44285b f111523C;

    /* renamed from: D */
    public final C50784u f111524D = new C50784u();

    /* renamed from: E */
    public C44149m f111525E;

    /* renamed from: F */
    public ChooseMediaViewModel f111526F;

    /* renamed from: G */
    public final ArrayList<MyMediaModel> f111527G = new ArrayList<>();

    /* renamed from: H */
    public C44013c f111528H;

    /* renamed from: I */
    public int f111529I;

    /* renamed from: J */
    public int f111530J;

    /* renamed from: K */
    public boolean f111531K;

    /* renamed from: M */
    private final String f111532M = "album_Fragment";

    /* renamed from: N */
    private View f111533N;

    /* renamed from: O */
    private MediaTypeNavigator f111534O;

    /* renamed from: P */
    private int f111535P;

    /* renamed from: Q */
    private int f111536Q;

    /* renamed from: R */
    private int f111537R;

    /* renamed from: S */
    private int f111538S;

    /* renamed from: T */
    private Parcelable f111539T;

    /* renamed from: U */
    private int f111540U;

    /* renamed from: V */
    private boolean f111541V;

    /* renamed from: W */
    private boolean f111542W;

    /* renamed from: X */
    private String f111543X;

    /* renamed from: Y */
    private long f111544Y;

    /* renamed from: Z */
    private long f111545Z = -1;

    /* renamed from: a */
    public TextView f111546a;

    /* renamed from: aa */
    private C44148l f111547aa;

    /* renamed from: ab */
    private boolean f111548ab = true;

    /* renamed from: ac */
    private long f111549ac;

    /* renamed from: ad */
    private long f111550ad;

    /* renamed from: ae */
    private C12935m f111551ae;

    /* renamed from: af */
    private HashMap f111552af;

    /* renamed from: b */
    public TextView f111553b;

    /* renamed from: c */
    public C44126e f111554c;

    /* renamed from: d */
    public C44088ab f111555d;

    /* renamed from: e */
    public C44155r f111556e;

    /* renamed from: f */
    public C44134g f111557f;

    /* renamed from: g */
    public C32873b f111558g;

    /* renamed from: h */
    public ViewPager f111559h;

    /* renamed from: i */
    public int f111560i;

    /* renamed from: j */
    public int f111561j;

    /* renamed from: k */
    public int f111562k;

    /* renamed from: l */
    public int f111563l;

    /* renamed from: m */
    public String f111564m;

    /* renamed from: n */
    public String f111565n;

    /* renamed from: o */
    public final ArrayList<MediaModel> f111566o = new ArrayList<>();

    /* renamed from: p */
    public SdkExtraInfo f111567p;

    /* renamed from: q */
    public ShortVideoContext f111568q;

    /* renamed from: r */
    public int f111569r;

    /* renamed from: s */
    public int f111570s = -1;

    /* renamed from: t */
    public int f111571t = -1;

    /* renamed from: u */
    public int f111572u = -1;

    /* renamed from: v */
    public int f111573v = -1;

    /* renamed from: w */
    public int f111574w;

    /* renamed from: x */
    public int f111575x;

    /* renamed from: y */
    public List<? extends MyMediaModel> f111576y;

    /* renamed from: z */
    public List<? extends MyMediaModel> f111577z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$a */
    final class C44036a extends C0677p {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111578a;

        public final int getCount() {
            return this.f111578a.f111569r;
        }

        /* renamed from: a */
        public final Fragment mo2309a(int i) {
            return this.f111578a.mo89921a(i);
        }

        public final CharSequence getPageTitle(int i) {
            if (i == this.f111578a.f111573v) {
                return this.f111578a.getString(R.string.ghb);
            }
            if (i != this.f111578a.f111572u || this.f111578a.f111573v == -1) {
                return super.getPageTitle(i);
            }
            return this.f111578a.getString(R.string.bqj);
        }

        public C44036a(MvChoosePhotoActivity mvChoosePhotoActivity, C0654k kVar) {
            C52711k.m112240b(kVar, "fm");
            this.f111578a = mvChoosePhotoActivity;
            super(kVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$b */
    public static final class C44037b {
        private C44037b() {
        }

        public /* synthetic */ C44037b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m96620a(Activity activity, Bundle bundle, int i, int i2) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(bundle, "bundle");
            Intent intent = new Intent(activity, MvChoosePhotoActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("key_choose_request_code", i);
            intent.putExtra("key_start_activity_request_code", i2);
            activity.startActivityForResult(intent, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$c */
    public interface C44038c {
        /* renamed from: a */
        void mo89934a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$d */
    static final class C44039d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f111579a;

        /* renamed from: b */
        final /* synthetic */ MvChoosePhotoActivity f111580b;

        C44039d(TextView textView, MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111579a = textView;
            this.f111580b = mvChoosePhotoActivity;
        }

        public final void run() {
            int measuredWidth = this.f111579a.getMeasuredWidth();
            int b = C23724k.m58224b(this.f111580b);
            TextView textView = this.f111580b.f111553b;
            if (textView != null) {
                textView.setMaxWidth((b - (measuredWidth * 2)) - ((int) C9432q.m18687b((Context) this.f111580b, 60.0f)));
            }
            this.f111579a.setVisibility(8);
            this.f111579a.setTextSize(1, 17.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$e */
    public static final class C44040e implements C44213g {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111581a;

        /* renamed from: b */
        final /* synthetic */ C52670a f111582b;

        /* renamed from: c */
        final /* synthetic */ C52670a f111583c;

        /* renamed from: d */
        final /* synthetic */ C52670a f111584d;

        /* renamed from: a */
        public final boolean mo89936a() {
            if (!this.f111581a.mo89932d()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final int mo89939c() {
            return ((MyMediaModel) this.f111582b.invoke()).f111663s;
        }

        /* renamed from: d */
        public final int mo89940d() {
            return ((Number) this.f111583c.invoke()).intValue();
        }

        /* renamed from: e */
        public final boolean mo89941e() {
            return ((Boolean) this.f111584d.invoke()).booleanValue();
        }

        /* renamed from: b */
        public final View mo89938b() {
            ViewPager viewPager = this.f111581a.f111559h;
            if (viewPager != null) {
                C44086a a = this.f111581a.mo89921a(viewPager.getCurrentItem());
                if (a != null) {
                    return a.mo89996d(this.f111581a.f111529I);
                }
            }
            return null;
        }

        /* renamed from: a */
        public final boolean mo89937a(MyMediaModel myMediaModel) {
            if (this.f111581a.f111528H == null) {
                return true;
            }
            C44013c cVar = this.f111581a.f111528H;
            if (cVar == null) {
                C52711k.m112234a();
            }
            return cVar.mo89847a(this.f111581a.getApplicationContext(), this.f111581a.f111523C, myMediaModel, false);
        }

        C44040e(MvChoosePhotoActivity mvChoosePhotoActivity, C52670a aVar, C52670a aVar2, C52670a aVar3) {
            this.f111581a = mvChoosePhotoActivity;
            this.f111582b = aVar;
            this.f111583c = aVar2;
            this.f111584d = aVar3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$f */
    public static final class C44041f implements C44210d {

        /* renamed from: a */
        final /* synthetic */ C52670a f111585a;

        /* renamed from: b */
        final /* synthetic */ C52670a f111586b;

        /* renamed from: a */
        public final MyMediaModel mo89942a() {
            return (MyMediaModel) this.f111585a.invoke();
        }

        /* renamed from: b */
        public final View mo89943b() {
            return (View) this.f111586b.invoke();
        }

        C44041f(C52670a aVar, C52670a aVar2) {
            this.f111585a = aVar;
            this.f111586b = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$g */
    public static final class C44042g implements C44082c {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111587a;

        /* renamed from: a */
        public final int mo89944a(MyMediaModel myMediaModel, boolean z) {
            return 0;
        }

        /* renamed from: a */
        public final void mo89945a(MyMediaModel myMediaModel, View view) {
        }

        /* renamed from: a */
        public final void mo89946a(List<MyMediaModel> list, C44081b bVar) {
        }

        /* renamed from: a */
        public final boolean mo89947a() {
            return false;
        }

        /* renamed from: a */
        public final boolean mo89948a(MediaModel mediaModel) {
            return true;
        }

        /* renamed from: a */
        public final boolean mo89949a(MyMediaModel myMediaModel) {
            return true;
        }

        C44042g(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111587a = mvChoosePhotoActivity;
        }

        /* renamed from: b */
        public final void mo89950b(MediaModel mediaModel) {
            this.f111587a.f111566o.clear();
            if (mediaModel != null) {
                this.f111587a.f111566o.add(mediaModel);
            }
            this.f111587a.mo89929b(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$h */
    public static final class C44043h implements C32884e {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111588a;

        C44043h(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111588a = mvChoosePhotoActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
            if (r2 == null) goto L_0x0010;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
            if (r2 == null) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo69797a(java.lang.String r4) {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r1 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r2 = r3.f111588a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r2.f111568q
                if (r2 == 0) goto L_0x0010
                java.lang.String r2 = r2.f107131x
                if (r2 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r2 = ""
            L_0x0012:
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r2 = r3.f111588a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r2.f111568q
                if (r2 == 0) goto L_0x0022
                java.lang.String r2 = r2.f107132y
                if (r2 != 0) goto L_0x0024
            L_0x0022:
                java.lang.String r2 = ""
            L_0x0024:
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "enter_from"
                java.lang.String r2 = "album_page"
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
                java.lang.String r1 = "is_greenscreen"
                r2 = 1
                com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r1, r2)
                r1 = r4
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x004c
                java.lang.String r1 = "background_type"
                java.lang.String r2 = "library"
                r0.mo47829a(r1, r2)
                java.lang.String r1 = "background_id"
                r0.mo47829a(r1, r4)
            L_0x004c:
                java.lang.String r4 = "background_show"
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44043h.mo69797a(java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$i */
    public static final class C44044i implements C44082c {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111589a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$i$a */
        static final class C44045a extends C52712l implements C52670a<View> {

            /* renamed from: a */
            final /* synthetic */ View f111590a;

            C44045a(View view) {
                this.f111590a = view;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return this.f111590a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$i$b */
        static final class C44046b extends C52712l implements C52670a<MyMediaModel> {

            /* renamed from: a */
            final /* synthetic */ MyMediaModel f111591a;

            C44046b(MyMediaModel myMediaModel) {
                this.f111591a = myMediaModel;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return this.f111591a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$i$c */
        static final class C44047c extends C52712l implements C52670a<Integer> {

            /* renamed from: a */
            public static final C44047c f111592a = new C44047c();

            C44047c() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(3);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$i$d */
        static final class C44048d extends C52712l implements C52670a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C44044i f111593a;

            C44048d(C44044i iVar) {
                this.f111593a = iVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C44285b bVar = this.f111593a.f111589a.f111523C;
                boolean z = false;
                if (bVar != null) {
                    List a = bVar.mo90177a();
                    if (a != null && a.size() >= this.f111593a.f111589a.f111560i) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: a */
        public final boolean mo89949a(MyMediaModel myMediaModel) {
            return true;
        }

        /* renamed from: b */
        public final void mo89950b(MediaModel mediaModel) {
        }

        /* renamed from: a */
        public final boolean mo89947a() {
            C44285b bVar = this.f111589a.f111523C;
            boolean z = false;
            if (bVar != null) {
                List a = bVar.mo90177a();
                if (a != null) {
                    if (a.size() < this.f111589a.f111560i) {
                        return false;
                    }
                    z = true;
                }
            }
            return z;
        }

        C44044i(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111589a = mvChoosePhotoActivity;
        }

        /* renamed from: a */
        public final boolean mo89948a(MediaModel mediaModel) {
            if (this.f111589a.f111528H == null) {
                return true;
            }
            C44013c cVar = this.f111589a.f111528H;
            if (cVar == null) {
                C52711k.m112234a();
            }
            return cVar.mo89847a(this.f111589a.getApplicationContext(), this.f111589a.f111523C, mediaModel, true);
        }

        /* renamed from: a */
        public final int mo89944a(MyMediaModel myMediaModel, boolean z) {
            this.f111589a.mo89922a();
            ChooseMediaViewModel chooseMediaViewModel = this.f111589a.f111526F;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo89862e();
            }
            boolean z2 = true;
            if (myMediaModel == null || !myMediaModel.mo76676c()) {
                C44088ab abVar = this.f111589a.f111555d;
                if (abVar != null) {
                    abVar.mo89990a(myMediaModel, z);
                }
            } else {
                C44134g gVar = this.f111589a.f111557f;
                if (gVar != null) {
                    gVar.mo89990a(myMediaModel, z);
                }
            }
            C44285b bVar = this.f111589a.f111523C;
            if (bVar == null) {
                C52711k.m112234a();
            }
            if (myMediaModel == null || !myMediaModel.mo76676c()) {
                z2 = false;
            }
            return bVar.mo90176a(myMediaModel, z, z2);
        }

        /* renamed from: a */
        public final void mo89945a(MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f111589a.f111526F;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f111465g = 1;
                    chooseMediaViewModel.mo89861a(chooseMediaViewModel.f111464f);
                }
                this.f111589a.f111529I = this.f111589a.mo89920a(myMediaModel);
                this.f111589a.f111531K = false;
                this.f111589a.mo89924a(new C44045a(view), new C44046b(myMediaModel), C44047c.f111592a, new C44048d(this));
            }
        }

        /* renamed from: a */
        public final void mo89946a(List<MyMediaModel> list, C44081b bVar) {
            int i;
            int i2;
            boolean z;
            int i3 = 0;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (this.f111589a.f111521A + this.f111589a.f111522B < i) {
                if (list != null) {
                    z = ((MyMediaModel) list.get(C52575l.m112093a((List) list))).mo76676c();
                } else {
                    z = false;
                }
                if (z) {
                    this.f111589a.mo89927a(list, bVar);
                } else {
                    this.f111589a.mo89923a(bVar);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (list != null) {
                i2 = 0;
                for (MyMediaModel myMediaModel : list) {
                    if (myMediaModel.mo76676c()) {
                        i2++;
                        arrayList2.add(myMediaModel);
                    } else {
                        i3++;
                        arrayList.add(myMediaModel);
                    }
                }
            } else {
                i2 = 0;
            }
            this.f111589a.f111521A = i3;
            this.f111589a.f111522B = i2;
            this.f111589a.f111576y = arrayList;
            this.f111589a.f111577z = arrayList2;
            this.f111589a.mo89926a(list);
            TextView textView = this.f111589a.f111546a;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j */
    public static final class C44049j implements C44082c {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111594a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j$a */
        static final class C44050a implements IDetectImageResultListener {

            /* renamed from: a */
            final /* synthetic */ String f111595a;

            /* renamed from: b */
            final /* synthetic */ String f111596b;

            /* renamed from: c */
            final /* synthetic */ C44049j f111597c;

            /* renamed from: d */
            final /* synthetic */ MyMediaModel f111598d;

            /* renamed from: e */
            final /* synthetic */ AtomicBoolean f111599e;

            C44050a(String str, String str2, C44049j jVar, MyMediaModel myMediaModel, AtomicBoolean atomicBoolean) {
                this.f111595a = str;
                this.f111596b = str2;
                this.f111597c = jVar;
                this.f111598d = myMediaModel;
                this.f111599e = atomicBoolean;
            }

            public final void onDetectResult(String str, String str2, String str3, boolean z) {
                this.f111599e.set(z);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j$b */
        static final class C44051b extends C52712l implements C52670a<View> {

            /* renamed from: a */
            final /* synthetic */ View f111600a;

            C44051b(View view) {
                this.f111600a = view;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return this.f111600a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j$c */
        static final class C44052c extends C52712l implements C52670a<MyMediaModel> {

            /* renamed from: a */
            final /* synthetic */ MyMediaModel f111601a;

            C44052c(MyMediaModel myMediaModel) {
                this.f111601a = myMediaModel;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return this.f111601a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j$d */
        static final class C44053d extends C52712l implements C52670a<Integer> {

            /* renamed from: a */
            final /* synthetic */ C44049j f111602a;

            C44053d(C44049j jVar) {
                this.f111602a = jVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                int i;
                if (this.f111602a.f111594a.mo89931c() || C44300e.f112162b.mo90192a(this.f111602a.f111594a.f111575x)) {
                    i = 3;
                } else {
                    i = 2;
                }
                return Integer.valueOf(i);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j$e */
        static final class C44054e extends C52712l implements C52670a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C44049j f111603a;

            C44054e(C44049j jVar) {
                this.f111603a = jVar;
                super(0);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
                if (r0.size() >= r4.f111603a.f111594a.f111560i) goto L_0x0047;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
                if (r4.f111603a.f111594a.f111521A >= r4.f111603a.f111594a.f111560i) goto L_0x0047;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object invoke() {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e r0 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e.f112162b
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j r1 = r4.f111603a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r1 = r1.f111594a
                    int r1 = r1.f111575x
                    boolean r0 = r0.mo90192a(r1)
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L_0x0039
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j r0 = r4.f111603a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r0.f111594a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b r0 = r0.f111523C
                    if (r0 == 0) goto L_0x0048
                    java.util.List r0 = r0.mo90177a()
                    if (r0 == 0) goto L_0x0048
                    r3 = r0
                    java.util.Collection r3 = (java.util.Collection) r3
                    boolean r3 = r3.isEmpty()
                    r3 = r3 ^ r2
                    if (r3 == 0) goto L_0x0029
                    goto L_0x002a
                L_0x0029:
                    r0 = 0
                L_0x002a:
                    if (r0 == 0) goto L_0x0048
                    int r0 = r0.size()
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j r3 = r4.f111603a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r3.f111594a
                    int r3 = r3.f111560i
                    if (r0 < r3) goto L_0x0048
                    goto L_0x0047
                L_0x0039:
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j r0 = r4.f111603a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r0.f111594a
                    int r0 = r0.f111521A
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j r3 = r4.f111603a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r3.f111594a
                    int r3 = r3.f111560i
                    if (r0 < r3) goto L_0x0048
                L_0x0047:
                    r1 = 1
                L_0x0048:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44049j.C44054e.invoke():java.lang.Object");
            }
        }

        /* renamed from: a */
        public final boolean mo89948a(MediaModel mediaModel) {
            return true;
        }

        /* renamed from: a */
        public final boolean mo89947a() {
            boolean z = false;
            if (C44300e.f112162b.mo90192a(this.f111594a.f111575x)) {
                C44285b bVar = this.f111594a.f111523C;
                if (bVar != null) {
                    List a = bVar.mo90177a();
                    if (a != null) {
                        if (!(!a.isEmpty())) {
                            a = null;
                        }
                        if (a != null) {
                            if (a.size() < this.f111594a.f111560i) {
                                return false;
                            }
                            z = true;
                        }
                    }
                }
            } else if (this.f111594a.f111521A >= this.f111594a.f111560i) {
                return true;
            }
            return z;
        }

        C44049j(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111594a = mvChoosePhotoActivity;
        }

        /* renamed from: b */
        public final void mo89950b(MediaModel mediaModel) {
            if (mediaModel == null || (mediaModel.f95391j >= this.f111594a.f111563l && mediaModel.f95390i >= this.f111594a.f111562k)) {
                this.f111594a.mo89922a();
                if (this.f111594a.f111575x == 3 && mediaModel != null) {
                    String str = mediaModel.f95383b;
                    C52711k.m112236a((Object) str, "it.filePath");
                    if (!C44300e.m97039a(str)) {
                        C10691a.m21546b((Context) this.f111594a, this.f111594a.getResources().getString(R.string.c4u), 0).mo19066a();
                        C44109a.m96754a(3, 1);
                        return;
                    }
                }
                if (this.f111594a.f111575x != 5 || mediaModel == null || (mediaModel.f95391j >= this.f111594a.f111563l && mediaModel.f95390i >= this.f111594a.f111562k)) {
                    this.f111594a.f111566o.clear();
                    if (mediaModel != null) {
                        this.f111594a.f111566o.add(mediaModel);
                    }
                    this.f111594a.f111574w = 3;
                    this.f111594a.mo89929b(true);
                    return;
                }
                C10691a.m21546b((Context) this.f111594a, this.f111594a.getResources().getString(R.string.cp5), 0).mo19066a();
                return;
            }
            C10691a.m21546b((Context) this.f111594a, this.f111594a.getResources().getString(R.string.cp5), 0).mo19066a();
            C44109a.m96754a(0, 1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
            if (r2 == null) goto L_0x0080;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo89949a(com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel r14) {
            /*
                r13 = this;
                r0 = 0
                if (r14 != 0) goto L_0x0004
                return r0
            L_0x0004:
                int r1 = r14.f95391j
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r2 = r13.f111594a
                int r2 = r2.f111563l
                if (r1 <= r2) goto L_0x008f
                int r1 = r14.f95390i
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r2 = r13.f111594a
                int r2 = r2.f111562k
                if (r1 > r2) goto L_0x0016
                goto L_0x008f
            L_0x0016:
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r1 = r13.f111594a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo r1 = r1.f111567p
                r2 = 1
                if (r1 == 0) goto L_0x008e
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r1 = r13.f111594a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo r1 = r1.f111567p
                if (r1 == 0) goto L_0x002b
                boolean r1 = r1.isLegal()
                if (r1 != 0) goto L_0x002b
                goto L_0x008e
            L_0x002b:
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>(r2)
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r2 = r13.f111594a
                java.lang.String r2 = r2.f111565n
                if (r2 == 0) goto L_0x006a
                java.lang.String r9 = r14.f95383b
                if (r9 == 0) goto L_0x006a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r13.f111594a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo r3 = r3.f111567p
                if (r3 == 0) goto L_0x006a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PlDataBean r3 = r3.getPl()
                if (r3 == 0) goto L_0x006a
                java.util.List r10 = r3.getAlg()
                if (r10 == 0) goto L_0x006a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r13.f111594a
                com.ss.android.vesdk.u r11 = r3.f111524D
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j$a r12 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j$a
                r3 = r12
                r4 = r9
                r5 = r2
                r6 = r13
                r7 = r14
                r8 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                r7 = r12
                com.ss.android.vesdk.VEImageDetectUtils$IDetectImageResultListener r7 = (com.p683ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener) r7
                r8 = 1280(0x500, float:1.794E-42)
                r14 = 1280(0x500, float:1.794E-42)
                r3 = r11
                r4 = r2
                r5 = r9
                r6 = r10
                r9 = r14
                r3.mo99487a(r4, r5, r6, r7, r8, r9)
            L_0x006a:
                boolean r14 = r1.get()
                if (r14 != 0) goto L_0x0089
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r14 = r13.f111594a
                android.content.Context r14 = (android.content.Context) r14
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r2 = r13.f111594a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo r2 = r2.f111567p
                if (r2 == 0) goto L_0x0080
                java.lang.String r2 = r2.getMvAlgorithmHint()
                if (r2 != 0) goto L_0x0082
            L_0x0080:
                java.lang.String r2 = ""
            L_0x0082:
                com.bytedance.ies.dmt.ui.d.a r14 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21552c(r14, r2, r0)
                r14.mo19066a()
            L_0x0089:
                boolean r14 = r1.get()
                return r14
            L_0x008e:
                return r2
            L_0x008f:
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r14 = r13.f111594a
                android.content.Context r14 = (android.content.Context) r14
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r1 = r13.f111594a
                java.lang.String r1 = r1.f111564m
                if (r1 != 0) goto L_0x009b
                java.lang.String r1 = ""
            L_0x009b:
                com.bytedance.ies.dmt.ui.d.a r14 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21552c(r14, r1, r0)
                r14.mo19066a()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44049j.mo89949a(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel):boolean");
        }

        /* renamed from: a */
        public final void mo89946a(List<MyMediaModel> list, C44081b bVar) {
            int i;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (this.f111594a.f111521A < i) {
                this.f111594a.mo89923a(bVar);
            }
            this.f111594a.f111521A = i;
            this.f111594a.f111576y = list;
            this.f111594a.mo89926a(list);
        }

        /* renamed from: a */
        public final int mo89944a(MyMediaModel myMediaModel, boolean z) {
            this.f111594a.mo89922a();
            ChooseMediaViewModel chooseMediaViewModel = this.f111594a.f111526F;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo89862e();
            }
            C44285b bVar = this.f111594a.f111523C;
            if (bVar != null) {
                if (this.f111594a.mo89931c() && myMediaModel != null) {
                    C44126e eVar = this.f111594a.f111554c;
                    if (eVar != null) {
                        eVar.mo89990a(myMediaModel, z);
                    }
                    return bVar.mo90176a(myMediaModel, z, false);
                } else if (C44300e.f112162b.mo90192a(this.f111594a.f111575x) && myMediaModel != null) {
                    return bVar.mo90176a(myMediaModel, z, false);
                }
            }
            List<? extends MyMediaModel> list = this.f111594a.f111576y;
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    return list.size();
                }
            }
            return 1;
        }

        /* renamed from: a */
        public final void mo89945a(MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f111594a.f111526F;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f111465g = 3;
                    chooseMediaViewModel.mo89861a(chooseMediaViewModel.f111462d);
                }
                this.f111594a.f111529I = this.f111594a.mo89920a(myMediaModel);
                this.f111594a.f111531K = false;
                this.f111594a.mo89924a(new C44051b(view), new C44052c(myMediaModel), new C44053d(this), new C44054e(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k */
    public static final class C44055k implements C44082c {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111604a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k$a */
        static final class C44056a extends C52712l implements C52670a<View> {

            /* renamed from: a */
            final /* synthetic */ View f111605a;

            C44056a(View view) {
                this.f111605a = view;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return this.f111605a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k$b */
        static final class C44057b extends C52712l implements C52670a<MyMediaModel> {

            /* renamed from: a */
            final /* synthetic */ MyMediaModel f111606a;

            C44057b(MyMediaModel myMediaModel) {
                this.f111606a = myMediaModel;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return this.f111606a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k$c */
        static final class C44058c extends C52712l implements C52670a<Integer> {

            /* renamed from: a */
            final /* synthetic */ C44055k f111607a;

            C44058c(C44055k kVar) {
                this.f111607a = kVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                int i;
                if (this.f111607a.f111604a.mo89931c() || C44300e.f112162b.mo90192a(this.f111607a.f111604a.f111575x)) {
                    i = 3;
                } else {
                    i = 1;
                }
                return Integer.valueOf(i);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k$d */
        static final class C44059d extends C52712l implements C52670a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C44055k f111608a;

            C44059d(C44055k kVar) {
                this.f111608a = kVar;
                super(0);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
                if (r0.size() >= r4.f111608a.f111604a.f111561j) goto L_0x0047;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
                if (r4.f111608a.f111604a.f111522B >= r4.f111608a.f111604a.f111561j) goto L_0x0047;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object invoke() {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e r0 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e.f112162b
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k r1 = r4.f111608a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r1 = r1.f111604a
                    int r1 = r1.f111575x
                    boolean r0 = r0.mo90192a(r1)
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L_0x0039
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k r0 = r4.f111608a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r0.f111604a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b r0 = r0.f111523C
                    if (r0 == 0) goto L_0x0048
                    java.util.List r0 = r0.mo90177a()
                    if (r0 == 0) goto L_0x0048
                    r3 = r0
                    java.util.Collection r3 = (java.util.Collection) r3
                    boolean r3 = r3.isEmpty()
                    r3 = r3 ^ r2
                    if (r3 == 0) goto L_0x0029
                    goto L_0x002a
                L_0x0029:
                    r0 = 0
                L_0x002a:
                    if (r0 == 0) goto L_0x0048
                    int r0 = r0.size()
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k r3 = r4.f111608a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r3.f111604a
                    int r3 = r3.f111561j
                    if (r0 < r3) goto L_0x0048
                    goto L_0x0047
                L_0x0039:
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k r0 = r4.f111608a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r0.f111604a
                    int r0 = r0.f111522B
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k r3 = r4.f111608a
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r3.f111604a
                    int r3 = r3.f111561j
                    if (r0 < r3) goto L_0x0048
                L_0x0047:
                    r1 = 1
                L_0x0048:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44055k.C44059d.invoke():java.lang.Object");
            }
        }

        /* renamed from: a */
        public final boolean mo89949a(MyMediaModel myMediaModel) {
            return true;
        }

        /* renamed from: a */
        public final boolean mo89947a() {
            boolean z = false;
            if (C44300e.f112162b.mo90192a(this.f111604a.f111575x)) {
                C44285b bVar = this.f111604a.f111523C;
                if (bVar != null) {
                    List a = bVar.mo90177a();
                    if (a != null) {
                        if (!(!a.isEmpty())) {
                            a = null;
                        }
                        if (a != null) {
                            if (a.size() < this.f111604a.f111561j) {
                                return false;
                            }
                            z = true;
                        }
                    }
                }
            } else if (this.f111604a.f111522B >= this.f111604a.f111561j) {
                return true;
            }
            return z;
        }

        C44055k(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111604a = mvChoosePhotoActivity;
        }

        /* renamed from: b */
        public final void mo89950b(MediaModel mediaModel) {
            this.f111604a.f111566o.clear();
            if (mediaModel != null) {
                this.f111604a.f111566o.add(mediaModel);
            }
            this.f111604a.f111574w = 2;
            this.f111604a.mo89922a();
            this.f111604a.mo89929b(true);
        }

        /* renamed from: a */
        public final boolean mo89948a(MediaModel mediaModel) {
            if (this.f111604a.f111528H == null) {
                return true;
            }
            C44013c cVar = this.f111604a.f111528H;
            if (cVar == null) {
                C52711k.m112234a();
            }
            return cVar.mo89847a(this.f111604a.getApplicationContext(), this.f111604a.f111523C, mediaModel, true);
        }

        /* renamed from: a */
        public final void mo89946a(List<MyMediaModel> list, C44081b bVar) {
            int i;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            if (this.f111604a.f111522B < i) {
                this.f111604a.mo89927a(list, bVar);
            }
            this.f111604a.f111522B = i;
            this.f111604a.f111577z = list;
            this.f111604a.mo89926a(list);
        }

        /* renamed from: a */
        public final int mo89944a(MyMediaModel myMediaModel, boolean z) {
            this.f111604a.mo89922a();
            ChooseMediaViewModel chooseMediaViewModel = this.f111604a.f111526F;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.mo89862e();
            }
            C44285b bVar = this.f111604a.f111523C;
            if (bVar != null) {
                if (this.f111604a.mo89931c() && myMediaModel != null) {
                    C44126e eVar = this.f111604a.f111554c;
                    if (eVar != null) {
                        eVar.mo89990a(myMediaModel, z);
                    }
                    return bVar.mo90176a(myMediaModel, z, true);
                } else if (C44300e.f112162b.mo90192a(this.f111604a.f111575x) && myMediaModel != null) {
                    return bVar.mo90176a(myMediaModel, z, true);
                }
            }
            List<? extends MyMediaModel> list = this.f111604a.f111577z;
            if (list != null) {
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    return list.size();
                }
            }
            return 1;
        }

        /* renamed from: a */
        public final void mo89945a(MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null) {
                ChooseMediaViewModel chooseMediaViewModel = this.f111604a.f111526F;
                if (chooseMediaViewModel != null) {
                    chooseMediaViewModel.f111465g = 2;
                    chooseMediaViewModel.mo89861a(chooseMediaViewModel.f111463e);
                }
                this.f111604a.f111529I = this.f111604a.mo89920a(myMediaModel);
                this.f111604a.f111531K = false;
                this.f111604a.mo89924a(new C44056a(view), new C44057b(myMediaModel), new C44058c(this), new C44059d(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$l */
    public static final class C44060l {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111609a;

        /* renamed from: b */
        final /* synthetic */ Intent f111610b;

        C44060l(MvChoosePhotoActivity mvChoosePhotoActivity, Intent intent) {
            this.f111609a = mvChoosePhotoActivity;
            this.f111610b = intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$m */
    static final class C44061m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111611a;

        C44061m(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111611a = mvChoosePhotoActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C44155r rVar = this.f111611a.f111556e;
            if (rVar != null) {
                this.f111611a.mo89930c(!rVar.f111855m);
            }
            ViewPager viewPager = this.f111611a.f111559h;
            if (viewPager != null) {
                C44086a a = this.f111611a.mo89921a(viewPager.getCurrentItem());
                if (a != null) {
                    a.mo69794e();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$n */
    static final class C44062n implements C44093b {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111612a;

        C44062n(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111612a = mvChoosePhotoActivity;
        }

        /* renamed from: a */
        public final void mo89953a(C44092a aVar, boolean z, int i, boolean z2) {
            boolean z3;
            boolean z4;
            if (aVar != null) {
                if ((i & 8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i2 = i & 16;
                if (i2 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f111612a.f111572u != -1 && z3) {
                    C44088ab abVar = this.f111612a.f111555d;
                    if (abVar != null) {
                        abVar.mo89992a(aVar.f111707b, z2);
                    }
                    ChooseMediaViewModel chooseMediaViewModel = this.f111612a.f111526F;
                    if (chooseMediaViewModel != null) {
                        ArrayList arrayList = new ArrayList(aVar.f111707b);
                        C52711k.m112240b(arrayList, "mediaList");
                        chooseMediaViewModel.f111462d.clear();
                        chooseMediaViewModel.f111462d.addAll(arrayList);
                        if (chooseMediaViewModel.f111465g == 3) {
                            chooseMediaViewModel.mo89861a(chooseMediaViewModel.f111462d);
                        }
                    }
                }
                if (!(this.f111612a.f111571t == -1 || i2 == 0)) {
                    C44134g gVar = this.f111612a.f111557f;
                    if (gVar != null) {
                        gVar.mo89992a(aVar.f111708c, z2);
                    }
                    ChooseMediaViewModel chooseMediaViewModel2 = this.f111612a.f111526F;
                    if (chooseMediaViewModel2 != null) {
                        ArrayList arrayList2 = new ArrayList(aVar.f111708c);
                        C52711k.m112240b(arrayList2, "mediaList");
                        chooseMediaViewModel2.f111463e.clear();
                        chooseMediaViewModel2.f111463e.addAll(arrayList2);
                        if (chooseMediaViewModel2.f111465g == 2) {
                            chooseMediaViewModel2.mo89861a(chooseMediaViewModel2.f111463e);
                        }
                    }
                }
                if (this.f111612a.f111570s != -1 && z4 && z3) {
                    C44126e eVar = this.f111612a.f111554c;
                    if (eVar != null) {
                        eVar.mo89992a(aVar.mo90003a(), z2);
                    }
                    ChooseMediaViewModel chooseMediaViewModel3 = this.f111612a.f111526F;
                    if (chooseMediaViewModel3 != null) {
                        ArrayList arrayList3 = new ArrayList(aVar.mo90003a());
                        C52711k.m112240b(arrayList3, "mediaList");
                        chooseMediaViewModel3.f111464f.clear();
                        chooseMediaViewModel3.f111464f.addAll(arrayList3);
                        if (chooseMediaViewModel3.f111465g == 1) {
                            chooseMediaViewModel3.mo89861a(chooseMediaViewModel3.f111464f);
                        }
                    }
                }
                if (!TextUtils.isEmpty(aVar.f111706a)) {
                    TextView textView = this.f111612a.f111553b;
                    if (textView != null) {
                        textView.setText(aVar.f111706a);
                    }
                }
            }
            if (z) {
                this.f111612a.mo89930c(false);
                C26890h.m65011a("select_photo_album", C23089d.m56640a().mo47829a("content_source", "upload").mo47829a("content_type", "mv").mo47829a("upload_type", "multiple_content").f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$o */
    public static final class C44063o implements C44038c {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111613a;

        C44063o(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111613a = mvChoosePhotoActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
            if (r3 == null) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            if (r3 == null) goto L_0x0024;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo89934a(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = "change_upload_mode"
                com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r4.f111613a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r3.f111568q
                if (r3 == 0) goto L_0x0012
                java.lang.String r3 = r3.f107131x
                if (r3 != 0) goto L_0x0014
            L_0x0012:
                java.lang.String r3 = ""
            L_0x0014:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r4.f111613a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r3.f111568q
                if (r3 == 0) goto L_0x0024
                java.lang.String r3 = r3.f107132y
                if (r3 != 0) goto L_0x0026
            L_0x0024:
                java.lang.String r3 = ""
            L_0x0026:
                com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
                java.lang.String r2 = "to_status"
                if (r5 == 0) goto L_0x0031
                java.lang.String r5 = "multiple"
                goto L_0x0033
            L_0x0031:
                java.lang.String r5 = "single"
            L_0x0033:
                com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44063o.mo89934a(boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$p */
    public static final class C44064p extends C23579a {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111614a;

        /* renamed from: a */
        public final void mo48772a(View view, float f) {
            C52711k.m112240b(view, "bottomSheet");
        }

        C44064p(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111614a = mvChoosePhotoActivity;
        }

        /* renamed from: a */
        public final void mo48773a(View view, int i) {
            C52711k.m112240b(view, "bottomSheet");
            if (i == 5) {
                C44149m mVar = this.f111614a.f111525E;
                if (mVar != null) {
                    mVar.mo78609a();
                }
                this.f111614a.finish();
                this.f111614a.overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$q */
    public static final class C44065q implements C44290d {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111615a;

        C44065q(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111615a = mvChoosePhotoActivity;
        }

        /* renamed from: a */
        public final void mo89954a(boolean z) {
            if (z) {
                this.f111615a.f111566o.clear();
                C44285b bVar = this.f111615a.f111523C;
                if (bVar != null) {
                    List a = bVar.mo90177a();
                    if (a != null) {
                        this.f111615a.f111566o.addAll(a);
                    }
                }
                this.f111615a.mo89929b(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$r */
    public static final class C44066r implements C44291e {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111616a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$r$a */
        public static final class C44067a implements C44213g {

            /* renamed from: a */
            final /* synthetic */ View f111617a;

            /* renamed from: b */
            final /* synthetic */ MyMediaModel f111618b;

            /* renamed from: c */
            final /* synthetic */ C44066r f111619c;

            /* renamed from: d */
            final /* synthetic */ View f111620d;

            /* renamed from: d */
            public final int mo89940d() {
                return 3;
            }

            /* renamed from: e */
            public final boolean mo89941e() {
                return false;
            }

            /* renamed from: c */
            public final int mo89939c() {
                return this.f111618b.f111662r - 1;
            }

            /* renamed from: a */
            public final boolean mo89936a() {
                if (!this.f111619c.f111616a.mo89932d()) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final View mo89938b() {
                C44285b bVar = this.f111619c.f111616a.f111523C;
                if (bVar != null) {
                    return bVar.mo90181b(this.f111619c.f111616a.f111530J);
                }
                return null;
            }

            /* renamed from: a */
            public final boolean mo89937a(MyMediaModel myMediaModel) {
                if (this.f111619c.f111616a.f111528H == null) {
                    return true;
                }
                C44013c cVar = this.f111619c.f111616a.f111528H;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                return cVar.mo89847a(this.f111619c.f111616a.getApplicationContext(), this.f111619c.f111616a.f111523C, this.f111618b, false);
            }

            C44067a(View view, MyMediaModel myMediaModel, C44066r rVar, View view2) {
                this.f111617a = view;
                this.f111618b = myMediaModel;
                this.f111619c = rVar;
                this.f111620d = view2;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$r$b */
        public static final class C44068b implements C44210d {

            /* renamed from: a */
            final /* synthetic */ View f111621a;

            /* renamed from: b */
            final /* synthetic */ MyMediaModel f111622b;

            /* renamed from: c */
            final /* synthetic */ C44066r f111623c;

            /* renamed from: d */
            final /* synthetic */ View f111624d;

            /* renamed from: a */
            public final MyMediaModel mo89942a() {
                return this.f111622b;
            }

            /* renamed from: b */
            public final View mo89943b() {
                View findViewById = this.f111621a.findViewById(R.id.dp2);
                C52711k.m112236a((Object) findViewById, "previewItemView.findViewById(R.id.video_cover)");
                return findViewById;
            }

            C44068b(View view, MyMediaModel myMediaModel, C44066r rVar, View view2) {
                this.f111621a = view;
                this.f111622b = myMediaModel;
                this.f111623c = rVar;
                this.f111624d = view2;
            }
        }

        /* renamed from: a */
        public final void mo89955a(int i, int i2) {
        }

        /* renamed from: a */
        public final void mo89956a(MyMediaModel myMediaModel) {
        }

        C44066r(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111616a = mvChoosePhotoActivity;
        }

        /* renamed from: a */
        public final void mo89957a(MyMediaModel myMediaModel, View view) {
            if (myMediaModel != null && view != null && C48016e.m103944b(myMediaModel.f95383b)) {
                C44285b bVar = this.f111616a.f111523C;
                if (bVar != null) {
                    List a = bVar.mo90177a();
                    if (a != null) {
                        switch (C39618d.f101152P.mo83104b(C40790a.EnableAlbumTimelineAndFullScreenPreview)) {
                            case 0:
                            case 2:
                                C44227a.m96890a(new C44068b(view, myMediaModel, this, view));
                                this.f111616a.mo89925a(C44226i.class, false);
                                break;
                            case 1:
                            case 3:
                                ChooseMediaViewModel chooseMediaViewModel = this.f111616a.f111526F;
                                if (chooseMediaViewModel != null) {
                                    ArrayList arrayList = new ArrayList(a);
                                    C52711k.m112240b(arrayList, "mediaList");
                                    chooseMediaViewModel.f111465g = 0;
                                    chooseMediaViewModel.mo89861a(arrayList);
                                }
                                this.f111616a.f111530J = myMediaModel.f111662r - 1;
                                this.f111616a.f111531K = true;
                                C44252a.m96940a(new C44067a(view, myMediaModel, this, view));
                                this.f111616a.mo89925a(C44251l.class, false);
                                break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$s */
    static final class C44069s implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111625a;

        C44069s(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111625a = mvChoosePhotoActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f111625a.mo89929b(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$t */
    static final class C44070t implements OnClickListener {

        /* renamed from: a */
        public static final C44070t f111626a = new C44070t();

        C44070t() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$u */
    static final class C44071u implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111627a;

        C44071u(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111627a = mvChoosePhotoActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f111627a.mo89929b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$v */
    public static final class C44072v extends C1000h {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111628a;

        C44072v(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111628a = mvChoosePhotoActivity;
        }

        public final void onPageSelected(int i) {
            String str = "";
            if (i == this.f111628a.f111570s) {
                TextView textView = this.f111628a.f111546a;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                str = "all";
            } else if (i == this.f111628a.f111571t) {
                this.f111628a.mo89926a(this.f111628a.f111577z);
                str = "video";
            } else if (i == this.f111628a.f111572u) {
                this.f111628a.mo89926a(this.f111628a.f111576y);
                str = "photo";
            } else if (i == this.f111628a.f111573v) {
                TextView textView2 = this.f111628a.f111546a;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                str = "library";
            }
            ShortVideoContext shortVideoContext = this.f111628a.f111568q;
            if (shortVideoContext != null) {
                C26890h.m65011a("click_upload_tab", C23089d.m56640a().mo47829a("creation_id", shortVideoContext.f107131x).mo47829a("shoot_way", shortVideoContext.f107132y).mo47829a("tab_name", str).f61491a);
            }
            C44126e eVar = this.f111628a.f111554c;
            if (eVar != null) {
                eVar.mo69794e();
            }
            C44134g gVar = this.f111628a.f111557f;
            if (gVar != null) {
                gVar.mo69794e();
            }
            C44088ab abVar = this.f111628a.f111555d;
            if (abVar != null) {
                abVar.mo69794e();
            }
            C32873b bVar = this.f111628a.f111558g;
            if (bVar != null) {
                bVar.mo69794e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$w */
    static final class C44073w extends C52712l implements C52671b<MediaState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111629a;

        C44073w(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111629a = mvChoosePhotoActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C44086a aVar;
            MediaState mediaState = (MediaState) obj;
            C52711k.m112240b(mediaState, "selectMediaState");
            if (this.f111629a.f111531K) {
                MyMediaModel media = mediaState.getMedia();
                if (media != null) {
                    if (media.mo76676c()) {
                        aVar = this.f111629a.f111557f;
                    } else {
                        aVar = this.f111629a.f111555d;
                    }
                    if (aVar instanceof C44086a) {
                        aVar.mo89989a(mediaState.getMedia());
                    }
                    this.f111629a.f111530J = media.f111662r - 1;
                }
            } else {
                ViewPager viewPager = this.f111629a.f111559h;
                if (viewPager != null) {
                    C44086a a = this.f111629a.mo89921a(viewPager.getCurrentItem());
                    if (a != null) {
                        a.mo89989a(mediaState.getMedia());
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$x */
    static final class C44074x extends C52712l implements C52671b<MediaState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111630a;

        C44074x(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111630a = mvChoosePhotoActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C44086a aVar;
            MediaState mediaState = (MediaState) obj;
            C52711k.m112240b(mediaState, "unSelectMediaState");
            if (this.f111630a.f111531K) {
                MyMediaModel media = mediaState.getMedia();
                if (media != null) {
                    if (media.mo76676c()) {
                        aVar = this.f111630a.f111557f;
                    } else {
                        aVar = this.f111630a.f111555d;
                    }
                    if (aVar instanceof C44086a) {
                        aVar.mo89989a(mediaState.getMedia());
                    }
                    this.f111630a.f111530J = media.f111662r - 1;
                }
            } else {
                ViewPager viewPager = this.f111630a.f111559h;
                if (viewPager != null) {
                    C44086a a = this.f111630a.mo89921a(viewPager.getCurrentItem());
                    if (a != null) {
                        a.mo89989a(mediaState.getMedia());
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$y */
    static final class C44075y extends C52712l implements C52671b<MediaState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111631a;

        C44075y(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111631a = mvChoosePhotoActivity;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
            if (r5 == null) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
            if (r5 == null) goto L_0x0081;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState r7 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState) r7
                java.lang.String r0 = "previewMediaState"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r6.f111631a
                boolean r0 = r0.f111531K
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x002c
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r6.f111631a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r3 = r7.getMedia()
                if (r3 == 0) goto L_0x001b
                int r3 = r3.f111662r
                int r3 = r3 - r2
                goto L_0x001c
            L_0x001b:
                r3 = 0
            L_0x001c:
                r0.f111530J = r3
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r6.f111631a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.b r0 = r0.f111523C
                if (r0 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r6.f111631a
                int r3 = r3.f111530J
                r0.mo90178a(r3)
                goto L_0x0057
            L_0x002c:
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r6.f111631a
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r3 = r7.getMedia()
                if (r3 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r4 = r6.f111631a
                int r3 = r4.mo89920a(r3)
                goto L_0x003c
            L_0x003b:
                r3 = -1
            L_0x003c:
                r0.f111529I = r3
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r0 = r6.f111631a
                android.support.v4.view.ViewPager r0 = r0.f111559h
                if (r0 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r6.f111631a
                int r0 = r0.getCurrentItem()
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a r0 = r3.mo89921a(r0)
                if (r0 == 0) goto L_0x0057
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r3 = r6.f111631a
                int r3 = r3.f111529I
                r0.mo89995c(r3)
            L_0x0057:
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r0 = r7.getMedia()
                if (r0 == 0) goto L_0x00be
                java.lang.String r0 = "slide_content_detail"
                com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r4 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r5 = r6.f111631a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r5.f111568q
                if (r5 == 0) goto L_0x006f
                java.lang.String r5 = r5.f107131x
                if (r5 != 0) goto L_0x0071
            L_0x006f:
                java.lang.String r5 = ""
            L_0x0071:
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity r5 = r6.f111631a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r5 = r5.f111568q
                if (r5 == 0) goto L_0x0081
                java.lang.String r5 = r5.f107132y
                if (r5 != 0) goto L_0x0083
            L_0x0081:
                java.lang.String r5 = ""
            L_0x0083:
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "content_type"
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r5 = r7.getMedia()
                if (r5 == 0) goto L_0x0098
                boolean r5 = r5.mo76676c()
                if (r5 != r2) goto L_0x0098
                java.lang.String r5 = "video"
                goto L_0x009a
            L_0x0098:
                java.lang.String r5 = "photo"
            L_0x009a:
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "is_select"
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r7 = r7.getMedia()
                if (r7 == 0) goto L_0x00ad
                int r7 = r7.f111662r
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                goto L_0x00ae
            L_0x00ad:
                r7 = 0
            L_0x00ae:
                int r7 = r7.intValue()
                if (r7 < 0) goto L_0x00b5
                r1 = 1
            L_0x00b5:
                com.ss.android.ugc.aweme.app.f.d r7 = r3.mo47826a(r4, r1)
                java.util.Map<java.lang.String, java.lang.String> r7 = r7.f61491a
                com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r7)
            L_0x00be:
                d.x r7 = p2628d.C52860x.f131107a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44075y.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$z */
    static final class C44076z extends C52712l implements C52671b<MediaListState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MvChoosePhotoActivity f111632a;

        C44076z(MvChoosePhotoActivity mvChoosePhotoActivity) {
            this.f111632a = mvChoosePhotoActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaListState mediaListState = (MediaListState) obj;
            C52711k.m112240b(mediaListState, "mediaListState");
            this.f111632a.f111527G.clear();
            this.f111632a.f111527G.addAll(mediaListState.getMediaList());
            return C52860x.f131107a;
        }
    }

    /* renamed from: e */
    private View m96604e(int i) {
        if (this.f111552af == null) {
            this.f111552af = new HashMap();
        }
        View view = (View) this.f111552af.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f111552af.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo89922a() {
        if (this.f111548ab) {
            this.f111550ad = System.currentTimeMillis();
            this.f111548ab = false;
        }
    }

    /* renamed from: b */
    public final void mo89928b() {
        finish();
        overridePendingTransition(0, R.anim.r);
    }

    /* renamed from: d */
    public final boolean mo89932d() {
        if (this.f111575x == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo89931c() {
        if (!this.f111541V || !this.f111542W || !C44300e.m97042d()) {
            return false;
        }
        return true;
    }

    public final void onBackPressed() {
        C44149m mVar = this.f111525E;
        if (mVar != null) {
            mVar.mo78609a();
        }
        C12935m mVar2 = this.f111551ae;
        if (mVar2 != null) {
            if (!mVar2.mo24327a()) {
                mVar2 = null;
            }
            if (mVar2 != null) {
                return;
            }
        }
        super.onBackPressed();
    }

    public final void onPause() {
        String str;
        super.onPause();
        C45412b a = C45412b.m98979a();
        Context context = this;
        String str2 = "album";
        ShortVideoContext shortVideoContext = this.f111568q;
        String str3 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.f107132y;
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = this.f111568q;
        if (shortVideoContext2 != null) {
            str3 = shortVideoContext2.f107131x;
        }
        a.pause(context, str2, str, str3);
    }

    public final void onDestroy() {
        double d;
        Object obj;
        long j;
        super.onDestroy();
        if (!C44150n.f111841a.isEmpty()) {
            Iterable<Number> iterable = C44150n.f111841a;
            C52711k.m112240b(iterable, "$this$average");
            double d2 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            int i = 0;
            for (Number longValue : iterable) {
                double longValue2 = (double) longValue.longValue();
                Double.isNaN(longValue2);
                d2 += longValue2;
                i++;
                if (i < 0) {
                    C52575l.m112102c();
                }
            }
            if (i == 0) {
                d = C52708h.f130967a;
            } else {
                double d3 = (double) i;
                Double.isNaN(d3);
                d = d2 / d3;
            }
            C47702b bVar = C47702b.f120193a;
            String str = "tool_performance_fetch_thumbnail";
            C42438az a = C42438az.m93209a();
            String str2 = "ave_duration";
            if (Double.isNaN(d)) {
                obj = Integer.valueOf(-1);
            } else {
                obj = Double.valueOf(d);
            }
            C42438az a2 = a.mo86525a(str2, obj);
            String str3 = "max_duration";
            Long l = (Long) C52575l.m112146i(C44150n.f111841a);
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            bVar.mo94984a(str, a2.mo86524a(str3, j).f107329a);
            C44150n.m96799a();
        }
        C45412b.m98979a().leave(this, "album");
    }

    /* renamed from: b */
    private static String m96600b(int i) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.ds2);
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo89920a(MyMediaModel myMediaModel) {
        C52711k.m112240b(myMediaModel, "myMediaModel");
        ViewPager viewPager = this.f111559h;
        if (viewPager != null) {
            C44086a a = mo89921a(viewPager.getCurrentItem());
            if (a != null) {
                return a.mo89993b(myMediaModel);
            }
        }
        return -1;
    }

    /* renamed from: d */
    private final C44149m m96603d(int i) {
        int i2;
        if (this.f111575x == 3 || this.f111575x == 5) {
            i = 7;
        }
        if (this.f111575x == 4) {
            i2 = 8;
        } else {
            i2 = i;
        }
        C44149m create = MediaChosenResultProcessFactory.createIMediaChosenResultProcessFactorybyMonsterPlugin().create(this, i2, this.f111544Y, this.f111545Z);
        C52711k.m112236a((Object) create, "ServiceManager.get().get…minDuration, maxDuration)");
        return create;
    }

    /* renamed from: a */
    public final C44086a mo89921a(int i) {
        if (i == this.f111570s) {
            return this.f111554c;
        }
        if (i == this.f111571t) {
            return this.f111557f;
        }
        if (i == this.f111572u) {
            return this.f111555d;
        }
        if (i == this.f111573v) {
            return this.f111558g;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo89930c(boolean z) {
        float f;
        View view = this.f111533N;
        if (view != null) {
            String str = "rotation";
            float[] fArr = new float[2];
            float f2 = 180.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 180.0f;
            }
            fArr[0] = f;
            if (!z) {
                f2 = 0.0f;
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
            C52711k.m112236a((Object) ofFloat, "anim");
            ofFloat.setDuration(300);
            ofFloat.start();
        }
        C44155r rVar = this.f111556e;
        if (rVar != null) {
            rVar.mo90034a(z);
        }
    }

    /* renamed from: c */
    private final int m96602c(int i) {
        Integer num;
        int i2;
        if (this.f111574w != 1) {
            ViewPager viewPager = this.f111559h;
            if (viewPager != null) {
                num = Integer.valueOf(viewPager.getCurrentItem());
            } else {
                num = null;
            }
            int i3 = this.f111571t;
            if (num != null && num.intValue() == i3) {
                if (this.f111575x == 1) {
                    i2 = 6;
                } else {
                    i2 = 2;
                }
                this.f111574w = i2;
            } else {
                int i4 = this.f111572u;
                if (num != null && num.intValue() == i4) {
                    int i5 = this.f111575x;
                    int i6 = 5;
                    if (i5 != 1) {
                        if (i5 != 5) {
                            i6 = 3;
                        } else {
                            i6 = 9;
                        }
                    }
                    this.f111574w = i6;
                } else {
                    int i7 = this.f111573v;
                    if (num != null && num.intValue() == i7) {
                        this.f111574w = 9;
                    }
                }
            }
            if (this.f111574w == 3 && (i > 1 || (this.f111540U & 1) == 0)) {
                this.f111574w = 4;
            }
        }
        return this.f111574w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r3 == null) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89923a(com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44081b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "choose_upload_content"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "content_source"
            java.lang.String r3 = "upload"
            r1.mo47829a(r2, r3)
            java.lang.String r2 = "content_type"
            java.lang.String r3 = "mv"
            r1.mo47829a(r2, r3)
            java.lang.String r2 = "upload_type"
            java.lang.String r3 = "multiple_content"
            r1.mo47829a(r2, r3)
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r4.f111568q
            if (r3 == 0) goto L_0x0025
            java.lang.String r3 = r3.f107131x
            if (r3 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r3 = ""
        L_0x0027:
            r1.mo47829a(r2, r3)
            if (r5 == 0) goto L_0x0033
            java.lang.String r2 = "in_detail"
            int r5 = r5.value
            r1.mo47826a(r2, r5)
        L_0x0033:
            java.util.Map<java.lang.String, java.lang.String> r5 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.mo89923a(com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$b):void");
    }

    /* renamed from: b */
    private final void m96601b(List<String> list) {
        boolean z;
        boolean z2;
        this.f111523C = new C44296d();
        C44295c cVar = new C44295c();
        Collection collection = list;
        boolean z3 = false;
        if (!collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        cVar.f112124e = z;
        if (this.f111574w == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        cVar.f112122c = z2;
        cVar.f112125f = this.f111554c;
        cVar.f112127h = this.f111555d;
        cVar.f112126g = this.f111557f;
        cVar.f112128i = this.f111543X;
        cVar.f112129j = this.f111535P;
        cVar.f112130k = this.f111536Q;
        cVar.f112131l = this.f111560i;
        if (!C23715d.m58202a(collection)) {
            cVar.mo90187a(list);
        }
        if (this.f111574w == 10) {
            z3 = true;
        }
        cVar.f112123d = z3;
        if (this.f111528H != null) {
            C44013c cVar2 = this.f111528H;
            if (cVar2 == null) {
                C52711k.m112234a();
            }
            if (!C23715d.m58202a((Collection<T>) cVar2.mo89846a())) {
                C44013c cVar3 = this.f111528H;
                if (cVar3 == null) {
                    C52711k.m112234a();
                }
                ArrayList a = cVar3.mo89846a();
                if (a == null) {
                    C52711k.m112234a();
                }
                cVar.mo90186a(a);
            }
        }
        cVar.f112121b = new C44065q(this);
        cVar.f112120a = new C44066r(this);
        C44285b bVar = this.f111523C;
        if (bVar != null) {
            bVar.mo90180a(cVar);
        }
        C44285b bVar2 = this.f111523C;
        if (bVar2 != null) {
            View findViewById = findViewById(R.id.bmr);
            C52711k.m112236a((Object) findViewById, "findViewById(R.id.mixed_view)");
            bVar2.mo90179a(findViewById);
        }
        this.f111541V = true;
        this.f111542W = true;
        C44088ab abVar = this.f111555d;
        if (abVar != null) {
            abVar.f111692a = null;
        }
        ShortVideoContext shortVideoContext = this.f111568q;
        if (shortVideoContext != null) {
            C44306f.m97049a(shortVideoContext.f107131x, shortVideoContext.f107132y);
        }
    }

    /* renamed from: b */
    public final void mo89929b(boolean z) {
        int i = 0;
        if (z) {
            int c = m96602c(this.f111566o.size());
            C44285b bVar = this.f111523C;
            if (bVar != null) {
                if (mo89931c()) {
                    c = bVar.mo90175a(this.f111574w, this.f111575x);
                } else if (C44300e.f112162b.mo90192a(this.f111575x)) {
                    c = bVar.mo90175a(this.f111574w, this.f111575x);
                }
            }
            if (c != 1 || this.f111525E == null) {
                this.f111525E = m96603d(c);
            }
            Intent intent = new Intent();
            if (c == 2 && this.f111566o.size() > 1) {
                Iterator it = this.f111566o.iterator();
                boolean z2 = false;
                boolean z3 = false;
                while (it.hasNext()) {
                    MediaModel mediaModel = (MediaModel) it.next();
                    C52711k.m112236a((Object) mediaModel, "model");
                    if (mediaModel.mo76676c()) {
                        if (!z2) {
                            z2 = true;
                        }
                    } else if (!z3) {
                        z3 = true;
                    }
                    if (z2 && z3) {
                        break;
                    }
                }
                String str = "extra_stick_point_type";
                if (z2 && z3) {
                    i = 2;
                } else if (z2) {
                    i = 1;
                } else if (z3) {
                    i = 3;
                }
                intent.putExtra(str, i);
            }
            intent.putExtra("key_choose_media_data", this.f111566o);
            intent.putExtra("key_select_mv_data", this.f111539T);
            intent.putExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            if (this.f111568q != null) {
                intent.putExtra("key_short_video_context", this.f111568q);
            }
            C44148l lVar = this.f111547aa;
            if (lVar != null) {
                Bundle a = lVar.mo90032a();
                if (a != null) {
                    intent.putExtra("key_extra_info", a);
                }
            }
            C44149m mVar = this.f111525E;
            if (mVar != null) {
                mVar.mo78610a(this.f111537R, -1, intent);
            }
            C47702b.f120193a.mo94984a("upload_page_duration", C23089d.m56640a().mo47827a("first_selection_duration", System.currentTimeMillis() - this.f111550ad).mo47827a("page_stay_duration", System.currentTimeMillis() - this.f111549ac).f61491a);
            return;
        }
        C44149m mVar2 = this.f111525E;
        if (mVar2 != null) {
            mVar2.mo78609a();
        }
        finish();
        overridePendingTransition(0, R.anim.r);
    }

    /* renamed from: a */
    public final void mo89926a(List<? extends MyMediaModel> list) {
        String str;
        if (!mo89931c() && !C44300e.f112162b.mo90192a(this.f111575x)) {
            Collection collection = list;
            if (!C23715d.m58202a(collection)) {
                if (list != null) {
                    Integer num = null;
                    if (!(!collection.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        int size = list.size();
                        TextView textView = this.f111546a;
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                        if (m96602c(size) == 4) {
                            if (C43805a.m96244a()) {
                                TextView textView2 = this.f111546a;
                                if (textView2 != null) {
                                    textView2.setTextSize(1, 13.0f);
                                }
                            }
                            str = getResources().getString(R.string.b88);
                            C52711k.m112236a((Object) str, "resources.getString(R.st…g.generating_photo_films)");
                        } else {
                            TextView textView3 = this.f111546a;
                            if (textView3 != null) {
                                textView3.setTextSize(1, 17.0f);
                            }
                            str = getResources().getString(R.string.d53);
                            C52711k.m112236a((Object) str, "resources.getString(R.st…record_choose_photo_sure)");
                        }
                        TextView textView4 = this.f111546a;
                        if (textView4 != null) {
                            String a = C2240a.m6772a(str, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                            textView4.setText(a);
                        }
                        ViewPager viewPager = this.f111559h;
                        if (viewPager != null) {
                            num = Integer.valueOf(viewPager.getCurrentItem());
                        }
                        int i = this.f111535P;
                        int i2 = this.f111571t;
                        if (num != null && num.intValue() == i2) {
                            i = this.f111536Q;
                        }
                        if (size < i) {
                            TextView textView5 = this.f111546a;
                            if (textView5 != null) {
                                textView5.setTextColor(getResources().getColor(R.color.a3e));
                            }
                            TextView textView6 = this.f111546a;
                            if (textView6 != null) {
                                textView6.setClickable(false);
                            }
                        } else {
                            TextView textView7 = this.f111546a;
                            if (textView7 != null) {
                                textView7.setTextColor(getResources().getColor(R.color.a3c));
                            }
                            TextView textView8 = this.f111546a;
                            if (textView8 != null) {
                                textView8.setClickable(true);
                            }
                        }
                        this.f111566o.clear();
                        this.f111566o.addAll(list);
                        if (C44300e.f112162b.mo90192a(this.f111575x)) {
                            TextView textView9 = this.f111546a;
                            if (textView9 != null) {
                                textView9.setVisibility(8);
                                return;
                            }
                        }
                        return;
                    }
                }
                TextView textView10 = this.f111546a;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                    return;
                }
                return;
            }
        }
        TextView textView11 = this.f111546a;
        if (textView11 != null) {
            textView11.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03e0, code lost:
        if (r6 == null) goto L_0x03eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r21) {
        /*
            r20 = this;
            r0 = r20
            java.lang.String r1 = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity"
            java.lang.String r2 = "onCreate"
            r3 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r1, r2, r3)
            com.ss.android.ugc.aweme.shortvideo.util.b r1 = com.p683ss.android.ugc.aweme.shortvideo.util.C45412b.m98979a()
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r4 = "album"
            r1.enter(r2, r4)
            super.onCreate(r21)
            com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44150n.m96799a()
            r1 = 0
            r4 = 2131034154(0x7f05002a, float:1.7678818E38)
            r0.overridePendingTransition(r4, r1)
            r4 = 2132213852(0x7f17005c, float:2.007153E38)
            r0.setContentView(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r0.f111549ac = r4
            android.content.Intent r4 = r20.getIntent()
            r5 = 3
            r6 = 8
            r7 = 10
            r8 = 2
            r9 = -1
            r10 = 0
            if (r4 == 0) goto L_0x01fc
            java.lang.String r11 = "key_short_video_context"
            android.os.Parcelable r11 = r4.getParcelableExtra(r11)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext) r11
            r0.f111568q = r11
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11 = r0.f111568q
            if (r11 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory r11 = com.p683ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory.createIMediaChosenResultProcessFactorybyMonsterPlugin()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory r11 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory) r11
            r12 = r0
            android.app.Activity r12 = (android.app.Activity) r12
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.c r11 = r11.getCutSameVideoImageMixedController(r12)
            r0.f111528H = r11
            java.lang.String r11 = "jianying_mv_page"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12 = r0.f111568q
            if (r12 == 0) goto L_0x0063
            java.lang.String r12 = r12.f107132y
            goto L_0x0064
        L_0x0063:
            r12 = r10
        L_0x0064:
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r11, r12)
            if (r11 != 0) goto L_0x0087
            java.lang.String r11 = "jianying_mv_reuse"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12 = r0.f111568q
            if (r12 == 0) goto L_0x0073
            java.lang.String r12 = r12.f107132y
            goto L_0x0074
        L_0x0073:
            r12 = r10
        L_0x0074:
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r11, r12)
            if (r11 != 0) goto L_0x0087
            java.lang.String r11 = "reuse_mv"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12 = r0.f111568q
            if (r12 == 0) goto L_0x0083
            java.lang.String r12 = r12.f107132y
            goto L_0x0084
        L_0x0083:
            r12 = r10
        L_0x0084:
            p2628d.p2639f.p2641b.C52711k.m112239a(r11, r12)
        L_0x0087:
            java.lang.String r11 = "key_choose_scene"
            int r11 = r4.getIntExtra(r11, r9)
            r12 = 6
            if (r11 != r12) goto L_0x009c
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.c r11 = r0.f111528H
            if (r11 != 0) goto L_0x0097
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0097:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$l r11 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$l
            r11.<init>(r0, r4)
        L_0x009c:
            java.lang.String r11 = "key_short_video_context"
            android.os.Parcelable r11 = r4.getParcelableExtra(r11)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r11 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext) r11
            r0.f111568q = r11
            java.lang.String r11 = "key_photo_select_min_count"
            int r11 = r4.getIntExtra(r11, r1)
            r0.f111535P = r11
            java.lang.String r11 = "key_photo_select_max_count"
            int r11 = r4.getIntExtra(r11, r1)
            r0.f111560i = r11
            java.lang.String r11 = "key_video_select_min_count"
            int r11 = r4.getIntExtra(r11, r1)
            r0.f111536Q = r11
            java.lang.String r11 = "key_video_select_max_count"
            int r11 = r4.getIntExtra(r11, r1)
            r0.f111561j = r11
            java.lang.String r11 = "upload_photo_min_height"
            int r11 = r4.getIntExtra(r11, r1)
            r0.f111563l = r11
            java.lang.String r11 = "upload_photo_min_width"
            int r11 = r4.getIntExtra(r11, r1)
            r0.f111562k = r11
            java.lang.String r11 = "key_mv_src_limited_toast"
            java.lang.String r11 = r4.getStringExtra(r11)
            r0.f111564m = r11
            java.lang.String r11 = "key_mv_resource_unzip_path"
            java.lang.String r11 = r4.getStringExtra(r11)
            r0.f111565n = r11
            java.lang.String r11 = "key_mv_hint_text"
            java.lang.String r11 = r4.getStringExtra(r11)
            r0.f111543X = r11
            java.lang.String r11 = "key_select_mv_data"
            android.os.Parcelable r11 = r4.getParcelableExtra(r11)
            r0.f111539T = r11
            java.lang.String r11 = "Key_min_duration"
            long r12 = com.p683ss.android.ugc.aweme.shortvideo.C43307ea.m94995a()
            long r11 = r4.getLongExtra(r11, r12)
            r0.f111544Y = r11
            java.lang.String r11 = "Key_max_duration"
            r12 = -1
            long r11 = r4.getLongExtra(r11, r12)
            r0.f111545Z = r11
            java.lang.String r11 = "key_choose_scene"
            int r11 = r4.getIntExtra(r11, r9)
            r0.f111575x = r11
            java.lang.String r11 = "key_choose_request_code"
            int r11 = r4.getIntExtra(r11, r9)
            r0.f111537R = r11
            java.lang.String r11 = "key_start_activity_request_code"
            int r11 = r4.getIntExtra(r11, r9)
            r0.f111538S = r11
            int r11 = r0.f111575x
            if (r11 != r8) goto L_0x014c
            r0.f111574w = r3
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.o r11 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.o
            r11.<init>()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l r11 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44148l) r11
            r0.f111547aa = r11
            java.lang.String r11 = "Key_challenge_id"
            java.lang.String r11 = r4.getStringExtra(r11)
            if (r11 == 0) goto L_0x014c
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.l r12 = r0.f111547aa
            if (r12 == 0) goto L_0x014c
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r14 = "Key_challenge_id"
            r13.putString(r14, r11)
            r12.mo90033a(r13)
        L_0x014c:
            int r11 = r0.f111575x
            if (r11 != r5) goto L_0x0153
            r11 = 7
            r0.f111574w = r11
        L_0x0153:
            int r11 = r0.f111575x
            r12 = 4
            if (r11 != r12) goto L_0x015a
            r0.f111574w = r6
        L_0x015a:
            boolean r11 = r20.mo89932d()
            if (r11 == 0) goto L_0x0162
            r0.f111574w = r7
        L_0x0162:
            java.lang.String r11 = "key_support_flag"
            int r11 = r4.getIntExtra(r11, r9)
            r0.f111540U = r11
            java.lang.String r11 = "Key_enable_multi_video"
            boolean r11 = r4.getBooleanExtra(r11, r1)
            r0.f111541V = r11
            int r11 = r0.f111540U
            r11 = r11 & r8
            if (r11 == 0) goto L_0x0179
            r11 = 1
            goto L_0x017a
        L_0x0179:
            r11 = 0
        L_0x017a:
            r0.f111542W = r11
            int r11 = r0.f111540U
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0188
            r0.f111571t = r1
            int r11 = r0.f111569r
            int r11 = r11 + r3
            r0.f111569r = r11
        L_0x0188:
            int r11 = r0.f111540U
            r11 = r11 & r3
            if (r11 != 0) goto L_0x0192
            int r11 = r0.f111540U
            r11 = r11 & r8
            if (r11 == 0) goto L_0x01a0
        L_0x0192:
            int r11 = r0.f111569r
            int r11 = r11 + r3
            r0.f111569r = r11
            int r11 = r0.f111571t
            if (r11 != 0) goto L_0x019d
            r11 = 1
            goto L_0x019e
        L_0x019d:
            r11 = 0
        L_0x019e:
            r0.f111572u = r11
        L_0x01a0:
            int r11 = r0.f111569r
            if (r11 != r8) goto L_0x01c3
            boolean r11 = r20.mo89931c()
            if (r11 == 0) goto L_0x01c3
            int r11 = r0.f111569r
            int r11 = r11 + r3
            r0.f111569r = r11
            r0.f111570s = r1
            int r11 = r0.f111571t
            if (r11 < 0) goto L_0x01ba
            int r11 = r0.f111571t
            int r11 = r11 + r3
            r0.f111571t = r11
        L_0x01ba:
            int r11 = r0.f111572u
            if (r11 < 0) goto L_0x01c3
            int r11 = r0.f111572u
            int r11 = r11 + r3
            r0.f111572u = r11
        L_0x01c3:
            int r11 = r0.f111540U
            r11 = r11 & r6
            if (r11 == 0) goto L_0x01cf
            r0.f111573v = r3
            int r11 = r0.f111569r
            int r11 = r11 + r3
            r0.f111569r = r11
        L_0x01cf:
            java.lang.String r11 = "key_sdk_extra_data"
            java.lang.String r11 = r4.getStringExtra(r11)
            r12 = r11
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x01fc
            com.google.gson.f r12 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo> r13 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo.class
            java.lang.Object r11 = r12.mo34884a(r11, r13)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo r11 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo) r11
            r0.f111567p = r11
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.SdkExtraInfo r11 = r0.f111567p
            if (r11 == 0) goto L_0x01fc
            java.lang.String r12 = "key_mv_algorithm_hint"
            java.lang.String r4 = r4.getStringExtra(r12)
            java.lang.String r12 = "it.getStringExtra(MvThem…ts.KEY_MV_ALGORITHM_HINT)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r12)
            r11.setMvAlgorithmHint(r4)
        L_0x01fc:
            r4 = r0
            android.support.v4.app.FragmentActivity r4 = (android.support.p030v4.app.FragmentActivity) r4
            com.ss.android.ugc.gamora.b.c r4 = com.p683ss.android.ugc.gamora.p2458b.C48927d.m105736a(r4)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel> r11 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel.class
            com.bytedance.jedi.arch.JediViewModel r4 = r4.mo96760a(r11)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel r4 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel) r4
            r0.f111526F = r4
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.f> r11 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44133f.class
            com.bytedance.scene.h$a r11 = com.bytedance.scene.C12921h.m25903a(r4, r11)
            r12 = 16908290(0x1020002, float:2.3877235E-38)
            com.bytedance.scene.h$a r11 = r11.mo24450a(r12)
            com.bytedance.scene.m r11 = r11.mo24453a()
            r0.f111551ae = r11
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel r11 = r0.f111526F
            if (r11 == 0) goto L_0x026e
            r19 = r0
            android.arch.lifecycle.k r19 = (android.arch.lifecycle.C0184k) r19
            d.k.j r14 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44162x.f111868a
            r15 = 0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$w r12 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$w
            r12.<init>(r0)
            r16 = r12
            d.f.a.b r16 = (p2628d.p2639f.p2640a.C52671b) r16
            r17 = 4
            r18 = 0
            r12 = r11
            r13 = r19
            r12.m106895a(r13, r14, new com.bytedance.jedi.arch.C11934u(), r16)
            d.k.j r14 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44163y.f111869a
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$x r12 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$x
            r12.<init>(r0)
            r16 = r12
            d.f.a.b r16 = (p2628d.p2639f.p2640a.C52671b) r16
            r12 = r11
            r12.m106895a(r13, r14, new com.bytedance.jedi.arch.C11934u(), r16)
            d.k.j r14 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44164z.f111870a
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$y r12 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$y
            r12.<init>(r0)
            r16 = r12
            d.f.a.b r16 = (p2628d.p2639f.p2640a.C52671b) r16
            r12 = r11
            r12.m106895a(r13, r14, new com.bytedance.jedi.arch.C11934u(), r16)
            d.k.j r14 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44087aa.f111691a
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$z r12 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$z
            r12.<init>(r0)
            r16 = r12
            d.f.a.b r16 = (p2628d.p2639f.p2640a.C52671b) r16
            r12 = r11
            r12.m106895a(r13, r14, new com.bytedance.jedi.arch.C11934u(), r16)
        L_0x026e:
            r11 = 2132023644(0x7f14195c, float:1.9685742E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0.f111546a = r11
            r11 = 2132024169(0x7f141b69, float:1.9686807E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0.f111553b = r11
            r11 = 2132020238(0x7f140c0e, float:1.9678833E38)
            android.view.View r11 = r0.findViewById(r11)
            r0.f111533N = r11
            android.widget.TextView r11 = r0.f111546a
            if (r11 == 0) goto L_0x029b
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$s r12 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$s
            r12.<init>(r0)
            android.view.View$OnClickListener r12 = (android.view.View.OnClickListener) r12
            r11.setOnClickListener(r12)
        L_0x029b:
            r11 = 2132023420(0x7f14187c, float:1.9685287E38)
            android.view.View r11 = r0.m96604e(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$t r12 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44070t.f111626a
            android.view.View$OnClickListener r12 = (android.view.View.OnClickListener) r12
            r11.setOnClickListener(r12)
            r11 = 2132017557(0x7f140195, float:1.9673396E38)
            android.view.View r11 = r0.m96604e(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$u r12 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$u
            r12.<init>(r0)
            android.view.View$OnClickListener r12 = (android.view.View.OnClickListener) r12
            r11.setOnClickListener(r12)
            android.widget.TextView r11 = r0.f111546a
            if (r11 == 0) goto L_0x02c5
            r11.setVisibility(r1)
        L_0x02c5:
            boolean r11 = com.p683ss.android.ugc.aweme.shortvideo.p2202f.C43805a.m96244a()
            if (r11 == 0) goto L_0x02d4
            android.widget.TextView r11 = r0.f111546a
            if (r11 == 0) goto L_0x02d4
            r12 = 1095761920(0x41500000, float:13.0)
            r11.setTextSize(r3, r12)
        L_0x02d4:
            android.widget.TextView r11 = r0.f111546a
            if (r11 == 0) goto L_0x0300
            r12 = 2132544939(0x7f1c0dab, float:2.0743054E38)
            java.lang.String r12 = r0.getString(r12)
            java.lang.String r13 = "getString(R.string.generating_photo_films)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r14 = 12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r1] = r14
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r3)
            java.lang.String r12 = com.C2240a.m6772a(r12, r13)
            java.lang.String r13 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r13)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r11.setText(r12)
        L_0x0300:
            android.widget.TextView r11 = r0.f111546a
            if (r11 == 0) goto L_0x030e
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$d r12 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$d
            r12.<init>(r11, r0)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            r11.post(r12)
        L_0x030e:
            r11 = 2132022896(0x7f141670, float:1.9684225E38)
            android.view.View r11 = r0.m96604e(r11)
            android.support.v4.widget.Space r11 = (android.support.p030v4.widget.Space) r11
            java.lang.String r12 = "space"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            int r12 = com.p683ss.android.ugc.aweme.shortvideo.C43303dy.m94972c(r2)
            r11.setMinimumHeight(r12)
            r11 = 2132024610(0x7f141d22, float:1.96877E38)
            android.view.View r11 = r0.findViewById(r11)
            android.support.v4.view.ViewPager r11 = (android.support.p030v4.view.ViewPager) r11
            r0.f111559h = r11
            r11 = 2132021012(0x7f140f14, float:1.9680403E38)
            android.view.View r11 = r0.findViewById(r11)
            com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator r11 = (com.p683ss.android.ugc.aweme.photo.local.MediaTypeNavigator) r11
            r0.f111534O = r11
            com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator r11 = r0.f111534O
            if (r11 == 0) goto L_0x0346
            int r12 = r0.f111569r
            if (r12 != r3) goto L_0x0342
            goto L_0x0343
        L_0x0342:
            r6 = 0
        L_0x0343:
            r11.setVisibility(r6)
        L_0x0346:
            android.support.v4.app.k r6 = r20.getSupportFragmentManager()
            if (r6 == 0) goto L_0x0357
            int r11 = r0.f111570s
            java.lang.String r11 = m96600b(r11)
            android.support.v4.app.Fragment r11 = r6.mo2224a(r11)
            goto L_0x0358
        L_0x0357:
            r11 = r10
        L_0x0358:
            boolean r12 = r11 instanceof com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44126e
            if (r12 != 0) goto L_0x035d
            r11 = r10
        L_0x035d:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r11 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44126e) r11
            if (r11 != 0) goto L_0x0366
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r11 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e
            r11.<init>()
        L_0x0366:
            r0.f111554c = r11
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r11 = r0.f111554c
            if (r11 == 0) goto L_0x0370
            int r12 = r0.f111575x
            r11.f111689t = r12
        L_0x0370:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r11 = r0.f111554c
            if (r11 == 0) goto L_0x0379
            r12 = r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$a r12 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.C44028a) r12
            r11.f111690u = r12
        L_0x0379:
            int r11 = r0.f111572u
            java.lang.String r11 = m96600b(r11)
            android.support.v4.app.Fragment r11 = r6.mo2224a(r11)
            boolean r12 = r11 instanceof com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44088ab
            if (r12 != 0) goto L_0x0388
            r11 = r10
        L_0x0388:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r11 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44088ab) r11
            if (r11 != 0) goto L_0x0391
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r11 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab
            r11.<init>()
        L_0x0391:
            r0.f111555d = r11
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r11 = r0.f111555d
            if (r11 == 0) goto L_0x039b
            int r12 = r0.f111575x
            r11.f111689t = r12
        L_0x039b:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r11 = r0.f111555d
            if (r11 == 0) goto L_0x03a4
            r12 = r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$a r12 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.C44028a) r12
            r11.f111690u = r12
        L_0x03a4:
            int r11 = r0.f111571t
            java.lang.String r11 = m96600b(r11)
            android.support.v4.app.Fragment r11 = r6.mo2224a(r11)
            boolean r12 = r11 instanceof com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44134g
            if (r12 != 0) goto L_0x03b3
            goto L_0x03b4
        L_0x03b3:
            r10 = r11
        L_0x03b4:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r10 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44134g) r10
            if (r10 != 0) goto L_0x03bd
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r10 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g
            r10.<init>()
        L_0x03bd:
            r0.f111557f = r10
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r10 = r0.f111557f
            if (r10 == 0) goto L_0x03c7
            int r11 = r0.f111575x
            r10.f111689t = r11
        L_0x03c7:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r10 = r0.f111557f
            if (r10 == 0) goto L_0x03d0
            r11 = r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller$a r11 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScroller.C44028a) r11
            r10.f111690u = r11
        L_0x03d0:
            int r10 = r0.f111573v
            java.lang.String r10 = m96600b(r10)
            android.support.v4.app.Fragment r6 = r6.mo2224a(r10)
            if (r6 == 0) goto L_0x03eb
            if (r6 == 0) goto L_0x03e3
            com.ss.android.ugc.aweme.greenscreen.a.b r6 = (com.p683ss.android.ugc.aweme.greenscreen.p1795a.C32873b) r6
            if (r6 != 0) goto L_0x03f0
            goto L_0x03eb
        L_0x03e3:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.greenscreen.mediachoose.ChooseLibraryPhotoFragment"
            r1.<init>(r2)
            throw r1
        L_0x03eb:
            com.ss.android.ugc.aweme.greenscreen.a.b r6 = new com.ss.android.ugc.aweme.greenscreen.a.b
            r6.<init>()
        L_0x03f0:
            r0.f111558g = r6
            android.support.v4.view.ViewPager r6 = r0.f111559h
            if (r6 == 0) goto L_0x0409
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$a r10 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$a
            android.support.v4.app.k r11 = r20.getSupportFragmentManager()
            java.lang.String r12 = "supportFragmentManager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
            r10.<init>(r0, r11)
            android.support.v4.view.PagerAdapter r10 = (android.support.p030v4.view.PagerAdapter) r10
            r6.setAdapter(r10)
        L_0x0409:
            android.support.v4.view.ViewPager r6 = r0.f111559h
            if (r6 == 0) goto L_0x0417
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$v r10 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$v
            r10.<init>(r0)
            android.support.v4.view.ViewPager$e r10 = (android.support.p030v4.view.ViewPager.C0997e) r10
            r6.addOnPageChangeListener(r10)
        L_0x0417:
            com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator r6 = r0.f111534O
            if (r6 == 0) goto L_0x0422
            boolean r10 = r20.mo89931c()
            r6.setHasAllTab(r10)
        L_0x0422:
            com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator r6 = r0.f111534O
            if (r6 == 0) goto L_0x0430
            int r10 = r0.f111573v
            if (r10 == r9) goto L_0x042c
            r9 = 1
            goto L_0x042d
        L_0x042c:
            r9 = 0
        L_0x042d:
            r6.setGreenScreenMode(r9)
        L_0x0430:
            android.support.v4.view.ViewPager r6 = r0.f111559h
            if (r6 == 0) goto L_0x043b
            com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator r9 = r0.f111534O
            if (r9 == 0) goto L_0x043b
            r9.setupWithViewPager(r6)
        L_0x043b:
            com.ss.android.ugc.aweme.photo.local.MediaTypeNavigator r6 = r0.f111534O
            if (r6 == 0) goto L_0x0453
            android.widget.ImageView r6 = r6.getTabIndicator()
            if (r6 == 0) goto L_0x0453
            android.content.res.Resources r9 = r6.getResources()
            r10 = 2131821649(0x7f110451, float:1.9276047E38)
            int r9 = r9.getColor(r10)
            r6.setBackgroundColor(r9)
        L_0x0453:
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 19
            if (r6 > r9) goto L_0x045c
            com.p683ss.android.ugc.aweme.shortvideo.C43862ga.m96320a(r4)
        L_0x045c:
            r4 = 2132018509(0x7f14054d, float:1.9675327E38)
            android.view.View r4 = r0.findViewById(r4)
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior r4 = com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.m57784a(r4)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$p r6 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$p
            r6.<init>(r0)
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior$a r6 = (com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23579a) r6
            r4.f62717k = r6
            java.lang.String r6 = "behavior"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58221a(r2)
            int r2 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58228d(r2)
            int r6 = r6 + r2
            r4.mo48761a(r6)
            r4.f62710d = r3
            android.support.v4.view.ViewPager r2 = r0.f111559h
            r4.mo48762a(r2)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r2 = r0.f111555d
            if (r2 == 0) goto L_0x0490
            java.lang.String r4 = r0.f111543X
            r2.f111692a = r4
        L_0x0490:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r2 = r0.f111555d
            if (r2 == 0) goto L_0x0499
            int r4 = r0.f111560i
            r2.mo89994b(r4)
        L_0x0499:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r2 = r0.f111555d
            if (r2 == 0) goto L_0x04a1
            boolean r4 = r0.f111542W
            r2.f111693b = r4
        L_0x04a1:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r2 = r0.f111555d
            if (r2 == 0) goto L_0x04ae
            int r4 = r0.f111574w
            if (r4 != r3) goto L_0x04ab
            r4 = 1
            goto L_0x04ac
        L_0x04ab:
            r4 = 0
        L_0x04ac:
            r2.f111685p = r4
        L_0x04ae:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r2 = r0.f111555d
            if (r2 == 0) goto L_0x04bb
            int r4 = r0.f111574w
            if (r4 != r7) goto L_0x04b8
            r4 = 1
            goto L_0x04b9
        L_0x04b8:
            r4 = 0
        L_0x04b9:
            r2.f111686q = r4
        L_0x04bb:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r2 = r0.f111557f
            if (r2 == 0) goto L_0x04c4
            int r4 = r0.f111561j
            r2.mo89994b(r4)
        L_0x04c4:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r2 = r0.f111557f
            if (r2 == 0) goto L_0x04cc
            boolean r4 = r0.f111541V
            r2.f111817v = r4
        L_0x04cc:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r2 = r0.f111557f
            if (r2 == 0) goto L_0x04d4
            long r9 = r0.f111544Y
            r2.f111819x = r9
        L_0x04d4:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r2 = r0.f111557f
            if (r2 == 0) goto L_0x04e1
            int r4 = r0.f111574w
            if (r4 != r3) goto L_0x04de
            r4 = 1
            goto L_0x04df
        L_0x04de:
            r4 = 0
        L_0x04df:
            r2.f111685p = r4
        L_0x04e1:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r2 = r0.f111557f
            if (r2 == 0) goto L_0x04ee
            int r4 = r0.f111574w
            if (r4 != r7) goto L_0x04eb
            r4 = 1
            goto L_0x04ec
        L_0x04eb:
            r4 = 0
        L_0x04ec:
            r2.f111686q = r4
        L_0x04ee:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r2 = r0.f111554c
            if (r2 == 0) goto L_0x04f7
            int r4 = r0.f111560i
            r2.mo89994b(r4)
        L_0x04f7:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r2 = r0.f111554c
            if (r2 == 0) goto L_0x0504
            int r4 = r0.f111574w
            if (r4 != r3) goto L_0x0501
            r4 = 1
            goto L_0x0502
        L_0x0501:
            r4 = 0
        L_0x0502:
            r2.f111685p = r4
        L_0x0504:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r2 = r0.f111554c
            if (r2 == 0) goto L_0x0511
            int r4 = r0.f111574w
            if (r4 != r7) goto L_0x050e
            r4 = 1
            goto L_0x050f
        L_0x050e:
            r4 = 0
        L_0x050f:
            r2.f111686q = r4
        L_0x0511:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.content.Intent r4 = r20.getIntent()
            if (r4 == 0) goto L_0x054f
            android.content.Intent r4 = r20.getIntent()
            java.lang.String r6 = "key_selected_video_path"
            java.util.ArrayList r4 = r4.getStringArrayListExtra(r6)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r6 = com.p683ss.android.ugc.aweme.base.utils.C23715d.m58202a(r4)
            if (r6 != 0) goto L_0x054f
            r2.addAll(r4)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r4 = r0.f111554c
            if (r4 == 0) goto L_0x053b
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r4.mo89991a(r6)
        L_0x053b:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r4 = r0.f111557f
            if (r4 == 0) goto L_0x0545
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r4.mo89991a(r6)
        L_0x0545:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r4 = r0.f111555d
            if (r4 == 0) goto L_0x054f
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r4.mo89991a(r6)
        L_0x054f:
            android.widget.TextView r4 = r0.f111553b
            if (r4 == 0) goto L_0x0563
            android.content.res.Resources r6 = r20.getResources()
            r7 = 2132541842(0x7f1c0192, float:2.0736772E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r4.setText(r6)
        L_0x0563:
            android.support.v4.app.k r4 = r20.getSupportFragmentManager()
            java.lang.String r6 = r0.f111532M
            android.support.v4.app.Fragment r4 = r4.mo2224a(r6)
            if (r4 != 0) goto L_0x0591
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.r r4 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.r
            r4.<init>()
            r0.f111556e = r4
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.r r4 = r0.f111556e
            if (r4 == 0) goto L_0x0595
            android.support.v4.app.k r6 = r20.getSupportFragmentManager()
            android.support.v4.app.r r6 = r6.mo2225a()
            r7 = 2132019228(0x7f14081c, float:1.9676785E38)
            android.support.v4.app.Fragment r4 = (android.support.p030v4.app.Fragment) r4
            java.lang.String r9 = r0.f111532M
            android.support.v4.app.r r4 = r6.mo2176a(r7, r4, r9)
            r4.mo2189b()
            goto L_0x0595
        L_0x0591:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.r r4 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44155r) r4
            r0.f111556e = r4
        L_0x0595:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "key_support_flag"
            int r7 = r0.f111540U
            r4.putInt(r6, r7)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.r r6 = r0.f111556e
            if (r6 == 0) goto L_0x05a8
            r6.setArguments(r4)
        L_0x05a8:
            r4 = 2132017992(0x7f140348, float:1.9674278E38)
            android.view.View r4 = r0.findViewById(r4)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$m r6 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$m
            r6.<init>(r0)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r4.setOnClickListener(r6)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.r r4 = r0.f111556e
            if (r4 == 0) goto L_0x05c6
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$n r6 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$n
            r6.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ad$b r6 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44091ad.C44093b) r6
            r4.f111850d = r6
        L_0x05c6:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j r4 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$j
            r4.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k r6 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$k
            r6.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$i r7 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$i
            r7.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.e r9 = r0.f111554c
            if (r9 == 0) goto L_0x05dd
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$c r7 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c) r7
            r9.f111789b = r7
        L_0x05dd:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab r7 = r0.f111555d
            if (r7 == 0) goto L_0x05e5
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$c r4 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c) r4
            r7.f111679j = r4
        L_0x05e5:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r4 = r0.f111557f
            if (r4 == 0) goto L_0x05f2
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$c r6 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c) r6
            java.lang.String r7 = "onVideoChooseListener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r7)
            r4.f111816c = r6
        L_0x05f2:
            com.ss.android.ugc.aweme.greenscreen.a.b r4 = r0.f111558g
            if (r4 == 0) goto L_0x0604
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$g r6 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$g
            r6.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$c r6 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44082c) r6
            java.lang.String r7 = "listener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r7)
            r4.f111679j = r6
        L_0x0604:
            com.ss.android.ugc.aweme.greenscreen.a.b r4 = r0.f111558g
            if (r4 == 0) goto L_0x0611
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$h r6 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$h
            r6.<init>(r0)
            com.ss.android.ugc.aweme.greenscreen.a.e r6 = (com.p683ss.android.ugc.aweme.greenscreen.p1795a.C32884e) r6
            r4.f85490b = r6
        L_0x0611:
            int r4 = r0.f111537R
            if (r4 == r8) goto L_0x0627
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.g r4 = r0.f111557f
            if (r4 == 0) goto L_0x0627
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$o r6 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$o
            r6.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$c r6 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C44038c) r6
            java.lang.String r7 = "callback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r7)
            r4.f111815b = r6
        L_0x0627:
            boolean r4 = r20.mo89931c()
            if (r4 == 0) goto L_0x063a
            java.util.List r2 = (java.util.List) r2
            r0.m96601b(r2)
            android.support.v4.view.ViewPager r2 = r0.f111559h
            if (r2 == 0) goto L_0x0649
            r2.setOffscreenPageLimit(r5)
            goto L_0x0649
        L_0x063a:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e r4 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C44300e.f112162b
            int r5 = r0.f111575x
            boolean r4 = r4.mo90192a(r5)
            if (r4 == 0) goto L_0x0649
            java.util.List r2 = (java.util.List) r2
            r0.m96601b(r2)
        L_0x0649:
            boolean r2 = r20.mo89931c()
            if (r2 == 0) goto L_0x06f9
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r0.f111568q
            if (r2 == 0) goto L_0x06f9
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$a r4 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44116b.f111772b
            android.support.v4.app.k r5 = r20.getSupportFragmentManager()
            java.lang.String r6 = "supportFragmentManager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r2 = r2.f107132y
            java.lang.String r6 = "fragmentManager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
            com.ss.android.ugc.aweme.port.in.aa r6 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101183x
            java.lang.String r6 = r6.mo74283c()
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0676
            r7 = 1
            goto L_0x0677
        L_0x0676:
            r7 = 0
        L_0x0677:
            if (r7 != 0) goto L_0x06f9
            if (r2 != 0) goto L_0x067d
            goto L_0x06f9
        L_0x067d:
            int r7 = r2.hashCode()
            r8 = 669986889(0x27ef3049, float:6.6388177E-15)
            if (r7 == r8) goto L_0x06c3
            r8 = 721690291(0x2b041eb3, float:4.6938424E-13)
            if (r7 == r8) goto L_0x068c
            goto L_0x06f9
        L_0x068c:
            java.lang.String r7 = "upload_anchor"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x06f9
            com.ss.android.ugc.aweme.base.h.g r7 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44116b.f111771a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "sp_show_stick_point_guide_from_tab"
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            boolean r3 = r7.mo48705a(r8, r3)
            if (r3 == 0) goto L_0x06f9
            com.ss.android.ugc.aweme.base.h.g r3 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44116b.f111771a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "sp_show_stick_point_guide_from_tab"
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r3.mo48710b(r6, r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$a r4 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44116b.C44117a) r4
            r4.mo90016a(r5, r2)
            goto L_0x06f9
        L_0x06c3:
            java.lang.String r7 = "direct_shoot"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x06f9
            com.ss.android.ugc.aweme.base.h.g r7 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44116b.f111771a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "sp_show_stick_point_guide_from_label"
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            boolean r3 = r7.mo48705a(r8, r3)
            if (r3 == 0) goto L_0x06f9
            com.ss.android.ugc.aweme.base.h.g r3 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44116b.f111771a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "sp_show_stick_point_guide_from_label"
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r3.mo48710b(r6, r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b$a r4 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44116b.C44117a) r4
            r4.mo90016a(r5, r2)
        L_0x06f9:
            java.lang.String r2 = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity"
            java.lang.String r3 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3 == null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r3 == null) goto L_0x0020;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89891a(boolean r5) {
        /*
            r4 = this;
            java.lang.String r0 = "album_scroll"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r4.f111568q
            if (r3 == 0) goto L_0x0010
            java.lang.String r3 = r3.f107131x
            if (r3 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r3 = ""
        L_0x0012:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r4.f111568q
            if (r3 == 0) goto L_0x0020
            java.lang.String r3 = r3.f107132y
            if (r3 != 0) goto L_0x0022
        L_0x0020:
            java.lang.String r3 = ""
        L_0x0022:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.lang.String r2 = "enter_method"
            if (r5 == 0) goto L_0x002d
            java.lang.String r5 = "click"
            goto L_0x002f
        L_0x002d:
            java.lang.String r5 = "slide"
        L_0x002f:
            com.ss.android.ugc.aweme.app.f.d r5 = r1.mo47829a(r2, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.mo89891a(boolean):void");
    }

    /* renamed from: a */
    public final void mo89925a(Class<? extends C12924i> cls, boolean z) {
        C52711k.m112240b(cls, "clazz");
        C12935m mVar = this.f111551ae;
        if (mVar != null) {
            C12942d b = mVar.mo24328b();
            if (b != null) {
                Bundle bundle = new Bundle();
                C12863a aVar = new C12863a();
                aVar.mo24323a((C12837c) new C12833c());
                b.mo24525a(cls, bundle, aVar.mo24325a());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r4 == null) goto L_0x0046;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89927a(java.util.List<? extends com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel> r6, com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C44081b r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0028
            r2 = r6
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0011
            r2 = r6
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 == 0) goto L_0x0028
            java.util.Iterator r6 = r6.iterator()
        L_0x0018:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r6.next()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r2 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel) r2
            long r2 = r2.f95386e
            long r0 = r0 + r2
            goto L_0x0018
        L_0x0028:
            java.lang.String r6 = "choose_upload_content"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "content_type"
            java.lang.String r4 = "sound_sync"
            r2.mo47829a(r3, r4)
            java.lang.String r3 = "upload_type"
            java.lang.String r4 = "multiple_content"
            r2.mo47829a(r3, r4)
            java.lang.String r3 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r4 = r5.f111568q
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = r4.f107131x
            if (r4 != 0) goto L_0x0048
        L_0x0046:
            java.lang.String r4 = ""
        L_0x0048:
            r2.mo47829a(r3, r4)
            if (r7 == 0) goto L_0x0054
            java.lang.String r3 = "in_detail"
            int r7 = r7.value
            r2.mo47826a(r3, r7)
        L_0x0054:
            java.lang.String r7 = "duration_ms"
            r2.mo47827a(r7, r0)
            java.util.Map<java.lang.String, java.lang.String> r7 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.mo89927a(java.util.List, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$b):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!mo89932d() && i == this.f111538S && (this.f111575x != 4 || i2 == -1)) {
            setResult(i2, intent);
            finish();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        if (r0 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0077, code lost:
        if (r0 == null) goto L_0x0079;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89924a(p2628d.p2639f.p2640a.C52670a<? extends android.view.View> r3, p2628d.p2639f.p2640a.C52670a<? extends com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel> r4, p2628d.p2639f.p2640a.C52670a<java.lang.Integer> r5, p2628d.p2639f.p2640a.C52670a<java.lang.Boolean> r6) {
        /*
            r2 = this;
            java.lang.String r0 = "previewItemView"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "previewMedia"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "previewType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "isFullMaxCount"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            com.ss.android.ugc.aweme.property.h r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r1 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableAlbumTimelineAndFullScreenPreview
            com.ss.android.ugc.aweme.property.aa$a r1 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r1
            int r0 = r0.mo83104b(r1)
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0033;
                case 1: goto L_0x0023;
                case 2: goto L_0x0033;
                case 3: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0042
        L_0x0023:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$e r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$e
            r3.<init>(r2, r4, r5, r6)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.g r3 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44213g) r3
            com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44251l.C44252a.m96940a(r3)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.l> r3 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44251l.class
            r2.mo89925a(r3, r1)
            goto L_0x0042
        L_0x0033:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$f r5 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity$f
            r5.<init>(r4, r3)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.d r5 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44210d) r5
            com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44226i.C44227a.m96890a(r5)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.i> r3 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44226i.class
            r2.mo89925a(r3, r1)
        L_0x0042:
            android.support.v4.view.ViewPager r3 = r2.f111559h
            if (r3 == 0) goto L_0x0053
            int r3 = r3.getCurrentItem()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.a r3 = r2.mo89921a(r3)
            if (r3 == 0) goto L_0x0053
            r3.mo69794e()
        L_0x0053:
            java.lang.Object r3 = r4.invoke()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r3 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel) r3
            java.lang.String r4 = "click_content_detail"
            com.ss.android.ugc.aweme.app.f.d r5 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r6 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.f111568q
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = r0.f107131x
            if (r0 != 0) goto L_0x006b
        L_0x0069:
            java.lang.String r0 = ""
        L_0x006b:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r0)
            java.lang.String r6 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.f111568q
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = r0.f107132y
            if (r0 != 0) goto L_0x007b
        L_0x0079:
            java.lang.String r0 = ""
        L_0x007b:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r0)
            java.lang.String r6 = "content_type"
            boolean r0 = r3.mo76676c()
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = "video"
            goto L_0x008c
        L_0x008a:
            java.lang.String r0 = "photo"
        L_0x008c:
            com.ss.android.ugc.aweme.app.f.d r5 = r5.mo47829a(r6, r0)
            java.lang.String r6 = "is_select"
            int r3 = r3.f111662r
            if (r3 < 0) goto L_0x0097
            r1 = 1
        L_0x0097:
            com.ss.android.ugc.aweme.app.f.d r3 = r5.mo47826a(r6, r1)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.mo89924a(d.f.a.a, d.f.a.a, d.f.a.a, d.f.a.a):void");
    }
}
