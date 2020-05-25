package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a.C24671a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a.C24673c;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a.C24674d.C24677b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.CommerceChallengeBanner;
import com.p683ss.android.ugc.aweme.discover.model.CommerceChallengeTask;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39958b;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k */
public final class C24693k implements C24708n {

    /* renamed from: i */
    public static final C24694a f65354i = new C24694a(null);

    /* renamed from: A */
    private ImageView f65355A;

    /* renamed from: B */
    private DmtTextView f65356B;

    /* renamed from: C */
    private DmtTextView f65357C;

    /* renamed from: D */
    private DmtTextView f65358D;

    /* renamed from: E */
    private DmtTextView f65359E;

    /* renamed from: F */
    private DmtTextView f65360F;

    /* renamed from: G */
    private DmtTextView f65361G;

    /* renamed from: H */
    private CircleImageView f65362H;

    /* renamed from: I */
    private DmtTextView f65363I;

    /* renamed from: J */
    private LinearLayout f65364J;

    /* renamed from: K */
    private DmtTextView f65365K;

    /* renamed from: L */
    private RecyclerView f65366L;

    /* renamed from: M */
    private C24673c f65367M;

    /* renamed from: N */
    private ViewStub f65368N;

    /* renamed from: O */
    private DmtTextView f65369O;

    /* renamed from: P */
    private View f65370P;

    /* renamed from: Q */
    private ViewStub f65371Q;

    /* renamed from: R */
    private View f65372R;

    /* renamed from: S */
    private DmtTextView f65373S;

    /* renamed from: T */
    private ViewStub f65374T;

    /* renamed from: U */
    private View f65375U;

    /* renamed from: V */
    private DmtTextView f65376V;

    /* renamed from: W */
    private ChallengeDetail f65377W;

    /* renamed from: X */
    private final C24695b f65378X = new C24695b(this);

    /* renamed from: a */
    public DmtTextView f65379a;

    /* renamed from: b */
    public DmtTextView f65380b;

    /* renamed from: c */
    public ImageView f65381c;

    /* renamed from: d */
    public ImageView f65382d;

    /* renamed from: e */
    public List<? extends Aweme> f65383e;

    /* renamed from: f */
    public WrapContentRemoteImageView f65384f;

    /* renamed from: g */
    public Context f65385g;

    /* renamed from: h */
    C24706l f65386h;

    /* renamed from: j */
    private View f65387j;

    /* renamed from: k */
    private CheckableImageView f65388k;

    /* renamed from: l */
    private DmtTextView f65389l;

    /* renamed from: m */
    private ViewStub f65390m;

    /* renamed from: n */
    private View f65391n;

    /* renamed from: o */
    private LinearLayout f65392o;

    /* renamed from: p */
    private RelativeLayout f65393p;

    /* renamed from: q */
    private RelativeLayout f65394q;

    /* renamed from: r */
    private DmtTextView f65395r;

    /* renamed from: s */
    private ImageView f65396s;

    /* renamed from: t */
    private DmtTextView f65397t;

    /* renamed from: u */
    private CountDownTimer f65398u;

    /* renamed from: v */
    private RecyclerView f65399v;

    /* renamed from: w */
    private C24671a f65400w;

    /* renamed from: x */
    private LinearLayout f65401x;

    /* renamed from: y */
    private LinearLayout f65402y;

    /* renamed from: z */
    private DmtTextView f65403z;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$a */
    public static final class C24694a {
        private C24694a() {
        }

        public /* synthetic */ C24694a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m60213a(String str, String str2) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(str2, "bgColor");
            if (C24678b.m60182a(str)) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("bundle_webview_background", str2).build().toString();
            }
            C52711k.m112236a((Object) str, "if (url.isNotNullOrEmpty…            url\n        }");
            return str;
        }

        /* renamed from: a */
        public static String m60214a(String str, String str2, String str3) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(str2, "commerceEnterFrom");
            if (C24678b.m60182a(str)) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).appendQueryParameter("challenge_id", str3).build().toString();
            }
            C52711k.m112236a((Object) str, "if (url.isNotNullOrEmpty…            url\n        }");
            return str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$b */
    public static final class C24695b implements C24677b {

        /* renamed from: a */
        final /* synthetic */ C24693k f65404a;

        C24695b(C24693k kVar) {
            this.f65404a = kVar;
        }

        /* renamed from: a */
        public final void mo50550a(Aweme aweme, int i) {
            C52711k.m112240b(aweme, "aweme");
            C39958b bVar = new C39958b();
            bVar.setItems(this.f65404a.f65383e);
            C31213v.m72896a((C26875a) bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$c */
    public static final class C24696c extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C24693k f65405a;

        C24696c(C24693k kVar) {
            this.f65405a = kVar;
        }

        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
        }

        public final void onIntermediateImageFailed(String str, Throwable th) {
            super.onIntermediateImageFailed(str, th);
        }

        public final /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
            C14045f fVar = (C14045f) obj;
            WrapContentRemoteImageView wrapContentRemoteImageView = this.f65405a.f65384f;
            if (wrapContentRemoteImageView != null) {
                wrapContentRemoteImageView.mo95599b(fVar);
            }
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            WrapContentRemoteImageView wrapContentRemoteImageView = this.f65405a.f65384f;
            if (wrapContentRemoteImageView != null) {
                wrapContentRemoteImageView.mo95599b(fVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$d */
    static final class C24697d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24693k f65406a;

        /* renamed from: b */
        final /* synthetic */ CommerceChallengeBanner f65407b;

        C24697d(C24693k kVar, CommerceChallengeBanner commerceChallengeBanner) {
            this.f65406a = kVar;
            this.f65407b = commerceChallengeBanner;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65406a.mo50580a("banner_click");
            if (!this.f65406a.mo50582a(this.f65407b.getOpenUrl(), false)) {
                this.f65406a.mo50581a(C24694a.m60214a(this.f65407b.getWebUrl(), "challenge_banner", this.f65406a.mo50576a().getCid()), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$e */
    static final class C24698e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24693k f65408a;

        C24698e(C24693k kVar) {
            this.f65408a = kVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65408a.mo50584b("click_link");
            C27170a.m65584a("click_link", null, this.f65408a.mo50576a().getCid());
            if (this.f65408a.mo50576a().isLinkActionAsOpenUrl()) {
                C24693k kVar = this.f65408a;
                String linkAction = this.f65408a.mo50576a().getLinkAction();
                C52711k.m112236a((Object) linkAction, "mChallenge.linkAction");
                kVar.mo50582a(C52830p.m112401a(linkAction, "aweme://", "sslocal://", false, 4, (Object) null), true);
                return;
            }
            C24693k kVar2 = this.f65408a;
            String linkAction2 = this.f65408a.mo50576a().getLinkAction();
            C52711k.m112236a((Object) linkAction2, "mChallenge.linkAction");
            kVar2.mo50581a(C24694a.m60214a(C24694a.m60213a(linkAction2, "ffffff"), "challenge_link", this.f65408a.mo50576a().getCid()), this.f65408a.mo50576a().getLinkTitle());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$f */
    static final class C24699f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24693k f65409a;

        /* renamed from: b */
        final /* synthetic */ Integer f65410b;

        C24699f(C24693k kVar, Integer num) {
            this.f65409a = kVar;
            this.f65410b = num;
        }

        public final void run() {
            LayoutParams layoutParams;
            ImageView imageView = this.f65409a.f65382d;
            Integer num = null;
            if (imageView != null) {
                layoutParams = imageView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                ImageView imageView2 = this.f65409a.f65381c;
                if (imageView2 != null) {
                    num = Integer.valueOf(imageView2.getWidth());
                }
                if (num == null) {
                    C52711k.m112234a();
                }
                layoutParams.width = (int) (((float) (num.intValue() * this.f65410b.intValue())) / 100.0f);
            }
            ImageView imageView3 = this.f65409a.f65382d;
            if (imageView3 != null) {
                imageView3.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$g */
    public static final class C24700g extends C17956a<List<? extends Aweme>> {
        C24700g() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$h */
    public static final class C24701h extends C1331h {
        C24701h() {
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            int i;
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            int f = RecyclerView.m4275f(view);
            if (f == 0) {
                rect.left = C23728o.m58241a(14.0d);
            }
            C1322a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i = adapter.getItemCount() - 1;
            } else {
                i = -1;
            }
            if (f == i) {
                rect.right = C23728o.m58241a(14.0d);
            } else {
                rect.right = C23728o.m58241a(4.0d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$i */
    public static final class C24702i extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C24693k f65411a;

        /* renamed from: b */
        final /* synthetic */ Long f65412b;

        /* renamed from: c */
        final /* synthetic */ long f65413c;

        /* renamed from: d */
        final /* synthetic */ long f65414d;

        public final void onFinish() {
            DmtTextView dmtTextView = this.f65411a.f65379a;
            if (dmtTextView != null) {
                String string = C24693k.m60202a(this.f65411a).getString(R.string.frp);
                C52711k.m112236a((Object) string, "mContext.getString(R.str…llenge_task_joined_again)");
                String a = C2240a.m6772a(string, Arrays.copyOf(new Object[]{String.valueOf(this.f65412b.longValue())}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                dmtTextView.setText(a);
            }
        }

        public final void onTick(long j) {
            int i = (int) (j / 1000);
            int i2 = i / 60;
            int i3 = i2 / 60;
            Locale locale = Locale.getDefault();
            C52711k.m112236a((Object) locale, "Locale.getDefault()");
            String a = C2240a.m6773a(locale, "%02d : %02d : %02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2 % 60), Integer.valueOf(i % 60)}, 3));
            C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
            DmtTextView dmtTextView = this.f65411a.f65379a;
            if (dmtTextView != null) {
                String string = C24693k.m60202a(this.f65411a).getString(R.string.fro);
                C52711k.m112236a((Object) string, "mContext.getString(R.string.challenge_task_joined)");
                String a2 = C2240a.m6772a(string, Arrays.copyOf(new Object[]{String.valueOf(this.f65412b.longValue()), a}, 2));
                C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
                dmtTextView.setText(a2);
            }
        }

        C24702i(C24693k kVar, Long l, long j, long j2, long j3, long j4) {
            this.f65411a = kVar;
            this.f65412b = l;
            this.f65413c = j;
            this.f65414d = j2;
            super(j3, 1000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$j */
    static final class C24703j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceChallengeTask f65415a;

        C24703j(CommerceChallengeTask commerceChallengeTask) {
            this.f65415a = commerceChallengeTask;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C32800a.m75679a(view) && !TextUtils.isEmpty(this.f65415a.getSchema())) {
                C41302w.m91042a().mo83861a(this.f65415a.getSchema());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$k */
    static final class C24704k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24693k f65416a;

        /* renamed from: b */
        final /* synthetic */ SpannableStringBuilder f65417b;

        C24704k(C24693k kVar, SpannableStringBuilder spannableStringBuilder) {
            this.f65416a = kVar;
            this.f65417b = spannableStringBuilder;
        }

        public final void run() {
            int i;
            DmtTextView dmtTextView = this.f65416a.f65380b;
            int i2 = 0;
            if (dmtTextView != null) {
                i = dmtTextView.getWidth();
            } else {
                i = 0;
            }
            DmtTextView dmtTextView2 = this.f65416a.f65380b;
            if (dmtTextView2 != null) {
                i2 = dmtTextView2.getHeight();
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) i, (float) i2, Color.parseColor("#FF2260"), Color.parseColor("#FFA842"), TileMode.REPEAT);
            DmtTextView dmtTextView3 = this.f65416a.f65380b;
            if (dmtTextView3 != null) {
                TextPaint paint = dmtTextView3.getPaint();
                if (paint != null) {
                    paint.setShader(linearGradient);
                }
            }
            DmtTextView dmtTextView4 = this.f65416a.f65380b;
            if (dmtTextView4 != null) {
                dmtTextView4.setText(this.f65417b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.k$l */
    static final class C24705l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24693k f65418a;

        /* renamed from: b */
        final /* synthetic */ String f65419b;

        /* renamed from: c */
        final /* synthetic */ String f65420c;

        C24705l(C24693k kVar, String str, String str2) {
            this.f65418a = kVar;
            this.f65419b = str;
            this.f65420c = str2;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            C24693k kVar = this.f65418a;
            String str = this.f65419b;
            Context context = kVar.f65385g;
            if (context == null) {
                C52711k.m112237a("mContext");
            }
            if (TextUtils.isEmpty(str)) {
                z = false;
            } else {
                z = C26456b.m63972b(context, Uri.parse(str));
            }
            if (!z && !this.f65418a.mo50582a(this.f65419b, true)) {
                C24693k kVar2 = this.f65418a;
                String str2 = this.f65420c;
                C52711k.m112236a((Object) str2, "webUrl");
                if (!kVar2.mo50581a(C24694a.m60214a(C24694a.m60213a(str2, "ffffff"), "challenge_transform_button", this.f65418a.mo50576a().getCid()), "")) {
                    return;
                }
            }
            C24693k kVar3 = this.f65418a;
            String str3 = "click_variable_button";
            C23089d a = C23089d.m56640a().mo47829a("tag_id", kVar3.mo50576a().getCid());
            String str4 = "enter_from";
            C24706l lVar = kVar3.f65386h;
            if (lVar == null) {
                C52711k.m112237a("mHeaderParam");
            }
            C26890h.m65011a(str3, a.mo47829a(str4, lVar.f65424d).mo47829a("page_type", "challenge").f61491a);
            C27170a.m65584a("click_variable_button", null, kVar3.mo50576a().getCid());
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.util.List<com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner>] */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r8v4, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x033e, code lost:
        if (r0.intValue() != 3) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x034d, code lost:
        if (r0.intValue() != 99) goto L_0x0371;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x06da  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0799  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x07a4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0879  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50579a(com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail r24) {
        /*
            r23 = this;
            r11 = r23
            r0 = r24
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            r11.f65377W = r0
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r0 = r11.f65377W
            if (r0 != 0) goto L_0x0014
            java.lang.String r1 = "mChallengeDetail"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0014:
            java.lang.String r1 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.challenge
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.discover.model.InquiryStruct r0 = r0.inquiryStruct
            if (r0 != 0) goto L_0x0024
            goto L_0x0044
        L_0x0024:
            java.lang.String r1 = r0.getOpenUrl()
            boolean r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r1)
            if (r1 != 0) goto L_0x0038
            java.lang.String r1 = r0.getWebUrl()
            boolean r1 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r1)
            if (r1 == 0) goto L_0x0044
        L_0x0038:
            java.lang.String r0 = r0.getDesc()
            boolean r0 = com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24678b.m60182a(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r14 = 8
            if (r0 == 0) goto L_0x009c
            android.view.View r0 = r11.f65387j
            if (r0 == 0) goto L_0x0050
            r0.setVisibility(r14)
        L_0x0050:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r23.mo50576a()
            com.ss.android.ugc.aweme.discover.model.InquiryStruct r0 = r0.inquiryStruct
            if (r0 != 0) goto L_0x0059
            goto L_0x009c
        L_0x0059:
            java.lang.String r1 = r0.getDesc()
            java.lang.String r2 = r0.getOpenUrl()
            java.lang.String r3 = r0.getWebUrl()
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r0.getIcon()
            if (r4 != 0) goto L_0x0073
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r0 = r11.f65388k
            if (r0 == 0) goto L_0x007e
            r0.setVisibility(r14)
            goto L_0x007e
        L_0x0073:
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r4 = r11.f65388k
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r4 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r4
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getIcon()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r4, r0)
        L_0x007e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65389l
            if (r0 == 0) goto L_0x0087
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0087:
            android.view.View r0 = r11.f65387j
            if (r0 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.challenge.ui.header.k$l r1 = new com.ss.android.ugc.aweme.challenge.ui.header.k$l
            r1.<init>(r11, r2, r3)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0095:
            android.view.View r0 = r11.f65387j
            if (r0 == 0) goto L_0x009c
            r0.setVisibility(r13)
        L_0x009c:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r23.mo50576a()
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeTask r15 = r0.getCommerceChallengeTask()
            r9 = 5
            r10 = 3
            r7 = 17
            r8 = 0
            if (r15 != 0) goto L_0x00ba
            android.view.ViewStub r0 = r11.f65390m
            if (r0 != 0) goto L_0x00b4
            java.lang.String r1 = "mTaskDescContainerVs"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00b4:
            r0.setVisibility(r14)
            r3 = r8
            goto L_0x06c7
        L_0x00ba:
            android.view.ViewStub r0 = r11.f65390m
            if (r0 != 0) goto L_0x00c3
            java.lang.String r1 = "mTaskDescContainerVs"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00c3:
            android.view.View r1 = r11.f65391n
            if (r1 != 0) goto L_0x00c9
            r1 = 1
            goto L_0x00ca
        L_0x00c9:
            r1 = 0
        L_0x00ca:
            if (r1 == 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r0 = r8
        L_0x00ce:
            if (r0 == 0) goto L_0x01f4
            android.view.View r0 = r0.inflate()
            r1 = 2132023257(0x7f1417d9, float:1.9684957E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r11.f65392o = r1
            r1 = 2132022349(0x7f14144d, float:1.9683115E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r11.f65393p = r1
            r1 = 2132020817(0x7f140e51, float:1.9680008E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r11.f65394q = r1
            r1 = 2132023955(0x7f141a93, float:1.9686372E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65395r = r1
            r1 = 2132020136(0x7f140ba8, float:1.9678627E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r11.f65396s = r1
            r1 = 2132023954(0x7f141a92, float:1.968637E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65397t = r1
            r1 = 2132023956(0x7f141a94, float:1.9686374E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65379a = r1
            r1 = 2132022439(0x7f1414a7, float:1.9683298E38)
            android.view.View r1 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r1 = (android.support.p043v7.widget.RecyclerView) r1
            r11.f65399v = r1
            r1 = 2132017986(0x7f140342, float:1.9674266E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r11.f65401x = r1
            r1 = 2132017985(0x7f140341, float:1.9674264E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r11.f65402y = r1
            r1 = 2132023691(0x7f14198b, float:1.9685837E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65356B = r1
            r1 = 2132023686(0x7f141986, float:1.9685827E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65357C = r1
            r1 = 2132023687(0x7f141987, float:1.9685829E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65358D = r1
            r1 = 2132023688(0x7f141988, float:1.968583E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65359E = r1
            r1 = 2132023690(0x7f14198a, float:1.9685835E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65380b = r1
            r1 = 2132023689(0x7f141989, float:1.9685833E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65360F = r1
            r1 = 2132023993(0x7f141ab9, float:1.968645E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65361G = r1
            r1 = 2132019940(0x7f140ae4, float:1.967823E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r11.f65381c = r1
            r1 = 2132019960(0x7f140af8, float:1.967827E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r11.f65382d = r1
            r1 = 2132018917(0x7f1406e5, float:1.9676154E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r11.f65364J = r1
            r1 = 2132018919(0x7f1406e7, float:1.9676158E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65365K = r1
            r1 = 2132018918(0x7f1406e6, float:1.9676156E38)
            android.view.View r1 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r1 = (android.support.p043v7.widget.RecyclerView) r1
            r11.f65366L = r1
            r1 = 2132021822(0x7f14123e, float:1.9682046E38)
            android.view.View r1 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r1 = (com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView) r1
            r11.f65362H = r1
            r1 = 2132024016(0x7f141ad0, float:1.9686496E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65363I = r1
            r1 = 2132023685(0x7f141985, float:1.9685825E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65403z = r1
            r1 = 2132017452(0x7f14012c, float:1.9673183E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r11.f65355A = r1
            r11.f65391n = r0
        L_0x01f4:
            java.lang.Boolean r0 = r15.getInAudit()
            if (r0 == 0) goto L_0x01ff
            boolean r0 = r0.booleanValue()
            goto L_0x0200
        L_0x01ff:
            r0 = 0
        L_0x0200:
            if (r0 == 0) goto L_0x0224
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65379a
            if (r0 == 0) goto L_0x021b
            android.content.Context r1 = r11.f65385g
            if (r1 != 0) goto L_0x020f
            java.lang.String r2 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x020f:
            r2 = 2132542636(0x7f1c04ac, float:2.0738383E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x021b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65379a
            if (r0 == 0) goto L_0x02f4
            r0.setVisibility(r13)
            goto L_0x02f4
        L_0x0224:
            java.lang.Long r2 = r15.getParticipateCount()
            if (r2 == 0) goto L_0x02ed
            long r0 = r2.longValue()
            r3 = 1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0236
            goto L_0x02ed
        L_0x0236:
            long r0 = r2.longValue()
            r3 = 5
            r5 = 2132542640(0x7f1c04b0, float:2.073839E38)
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x02b1
            java.lang.Long r0 = r15.getAllowParticipateTime()
            if (r0 == 0) goto L_0x02f4
            long r3 = r0.longValue()
            long r16 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
            long r18 = r0 - r16
            r0 = 0
            int r6 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x027c
            com.ss.android.ugc.aweme.challenge.ui.header.k$i r20 = new com.ss.android.ugc.aweme.challenge.ui.header.k$i
            r21 = 1000(0x3e8, double:4.94E-321)
            r0 = r20
            r1 = r23
            r5 = r16
            r7 = r18
            r9 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9)
            r0 = r20
            android.os.CountDownTimer r0 = (android.os.CountDownTimer) r0
            r11.f65398u = r0
            android.os.CountDownTimer r0 = r11.f65398u
            if (r0 == 0) goto L_0x02e5
            r0.start()
            goto L_0x02e5
        L_0x027c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65379a
            if (r0 == 0) goto L_0x02e5
            android.content.Context r1 = r11.f65385g
            if (r1 != 0) goto L_0x0289
            java.lang.String r3 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0289:
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r3 = "mContext.getString(R.str…llenge_task_joined_again)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            long r4 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            r3[r13] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r12)
            java.lang.String r1 = com.C2240a.m6772a(r1, r2)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            goto L_0x02e5
        L_0x02b1:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65379a
            if (r0 == 0) goto L_0x02e5
            android.content.Context r1 = r11.f65385g
            if (r1 != 0) goto L_0x02be
            java.lang.String r3 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x02be:
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r3 = "mContext.getString(R.str…llenge_task_joined_again)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            long r4 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            r3[r13] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r12)
            java.lang.String r1 = com.C2240a.m6772a(r1, r2)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x02e5:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65379a
            if (r0 == 0) goto L_0x02f4
            r0.setVisibility(r13)
            goto L_0x02f4
        L_0x02ed:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65379a
            if (r0 == 0) goto L_0x02f4
            r0.setVisibility(r14)
        L_0x02f4:
            com.ss.android.ugc.aweme.challenge.ab.a r0 = com.p683ss.android.ugc.aweme.challenge.p1495ab.C24531a.f64953a
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r23.mo50576a()
            com.ss.android.ugc.aweme.challenge.ui.header.l r2 = r11.f65386h
            if (r2 != 0) goto L_0x0303
            java.lang.String r3 = "mHeaderParam"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0303:
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam r2 = r2.f65426f
            r0.mo50297a(r1, r2)
            android.widget.RelativeLayout r0 = r11.f65394q
            if (r0 == 0) goto L_0x030f
            r0.setVisibility(r14)
        L_0x030f:
            android.widget.RelativeLayout r0 = r11.f65393p
            if (r0 == 0) goto L_0x0316
            r0.setVisibility(r13)
        L_0x0316:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65356B
            if (r0 == 0) goto L_0x0323
            java.lang.String r1 = r15.getCommerceChallengeTaskType()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0323:
            java.lang.Integer r0 = r15.getStatus()
            r1 = 2
            if (r0 != 0) goto L_0x032b
            goto L_0x0331
        L_0x032b:
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x0350
        L_0x0331:
            java.lang.Integer r0 = r15.getStatus()
            if (r0 != 0) goto L_0x0339
            r2 = 3
            goto L_0x0340
        L_0x0339:
            int r0 = r0.intValue()
            r2 = 3
            if (r0 == r2) goto L_0x0351
        L_0x0340:
            java.lang.Integer r0 = r15.getStatus()
            if (r0 != 0) goto L_0x0347
            goto L_0x0371
        L_0x0347:
            int r0 = r0.intValue()
            r3 = 99
            if (r0 != r3) goto L_0x0371
            goto L_0x0351
        L_0x0350:
            r2 = 3
        L_0x0351:
            android.widget.ImageView r0 = r11.f65355A
            if (r0 == 0) goto L_0x0358
            r0.setVisibility(r14)
        L_0x0358:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65403z
            if (r0 == 0) goto L_0x0371
            android.content.Context r3 = r11.f65385g
            if (r3 != 0) goto L_0x0365
            java.lang.String r4 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0365:
            r4 = 2132542635(0x7f1c04ab, float:2.073838E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x0371:
            android.widget.LinearLayout r0 = r11.f65392o
            if (r0 == 0) goto L_0x037f
            com.ss.android.ugc.aweme.challenge.ui.header.k$j r3 = new com.ss.android.ugc.aweme.challenge.ui.header.k$j
            r3.<init>(r15)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r0.setOnClickListener(r3)
        L_0x037f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65357C
            if (r0 == 0) goto L_0x038c
            java.lang.String r3 = r15.getDesc()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x038c:
            java.util.List r0 = r15.getGiftRewards()
            if (r0 == 0) goto L_0x03e6
            java.util.List r3 = r15.getGiftRewards()
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r3 == 0) goto L_0x039f
            goto L_0x03e6
        L_0x039f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r11.f65358D
            if (r3 == 0) goto L_0x03a6
            r3.setVisibility(r13)
        L_0x03a6:
            android.support.v7.widget.RecyclerView r3 = r11.f65399v
            if (r3 == 0) goto L_0x03ba
            android.support.v7.widget.LinearLayoutManager r4 = new android.support.v7.widget.LinearLayoutManager
            android.support.v4.app.FragmentActivity r5 = r23.mo50585c()
            android.content.Context r5 = (android.content.Context) r5
            r4.<init>(r5, r12, r13)
            android.support.v7.widget.RecyclerView$i r4 = (android.support.p043v7.widget.RecyclerView.C1332i) r4
            r3.setLayoutManager(r4)
        L_0x03ba:
            com.ss.android.ugc.aweme.challenge.ui.header.a.a r3 = r11.f65400w
            if (r3 != 0) goto L_0x03d1
            com.ss.android.ugc.aweme.challenge.ui.header.a.a r3 = new com.ss.android.ugc.aweme.challenge.ui.header.a.a
            r3.<init>(r0)
            r11.f65400w = r3
            android.support.v7.widget.RecyclerView r0 = r11.f65399v
            if (r0 == 0) goto L_0x03df
            com.ss.android.ugc.aweme.challenge.ui.header.a.a r3 = r11.f65400w
            android.support.v7.widget.RecyclerView$a r3 = (android.support.p043v7.widget.RecyclerView.C1322a) r3
            r0.setAdapter(r3)
            goto L_0x03df
        L_0x03d1:
            com.ss.android.ugc.aweme.challenge.ui.header.a.a r3 = r11.f65400w
            if (r3 == 0) goto L_0x03df
            java.lang.String r4 = "list"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r4)
            r3.f65313a = r0
            r3.notifyDataSetChanged()
        L_0x03df:
            android.support.v7.widget.RecyclerView r0 = r11.f65399v
            if (r0 == 0) goto L_0x03e6
            r0.setVisibility(r13)
        L_0x03e6:
            if (r15 == 0) goto L_0x05e9
            java.lang.Integer r0 = r15.getRewardType()
            if (r0 != 0) goto L_0x03ef
            goto L_0x03f5
        L_0x03ef:
            int r0 = r0.intValue()
            if (r0 == r12) goto L_0x05e9
        L_0x03f5:
            java.lang.Integer r0 = r15.getRewardType()
            if (r0 != 0) goto L_0x03fc
            goto L_0x0404
        L_0x03fc:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0404
            goto L_0x05e9
        L_0x0404:
            com.ss.android.ugc.aweme.discover.model.ShareReward r0 = r15.getShareReward()
            if (r0 == 0) goto L_0x040f
            java.lang.String r8 = r0.getHighestProfit()
            goto L_0x0410
        L_0x040f:
            r8 = 0
        L_0x0410:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            java.lang.Integer r3 = r15.getRewardType()
            r4 = 4625759767262920704(0x4032000000000000, double:18.0)
            if (r3 != 0) goto L_0x0421
        L_0x041d:
            r7 = 17
            goto L_0x049b
        L_0x0421:
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x041d
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r11.f65359E
            if (r3 == 0) goto L_0x0440
            android.content.Context r6 = r11.f65385g
            if (r6 != 0) goto L_0x0434
            java.lang.String r7 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0434:
            r7 = 2132542645(0x7f1c04b5, float:2.07384E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r3.setText(r6)
        L_0x0440:
            r3 = r8
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x0482
            android.content.Context r6 = r11.f65385g
            if (r6 != 0) goto L_0x0452
            java.lang.String r7 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0452:
            r7 = 2132542646(0x7f1c04b6, float:2.0738403E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r0.append(r6)
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            r9 = 4622945017495814144(0x4028000000000000, double:12.0)
            int r7 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r9)
            r6.<init>(r7)
            r7 = 17
            r0.setSpan(r6, r13, r12, r7)
            r0.append(r3)
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            r3.<init>(r6)
            int r6 = r0.length()
            r0.setSpan(r3, r12, r6, r7)
            goto L_0x049b
        L_0x0482:
            r7 = 17
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65363I
            if (r0 == 0) goto L_0x048b
            r0.setVisibility(r14)
        L_0x048b:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r11.f65362H
            if (r0 == 0) goto L_0x0492
            r0.setVisibility(r14)
        L_0x0492:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65380b
            if (r0 == 0) goto L_0x05f9
            r0.setVisibility(r14)
            goto L_0x05f9
        L_0x049b:
            java.lang.Integer r3 = r15.getRewardType()
            r9 = 4623507967449235456(0x402a000000000000, double:13.0)
            if (r3 != 0) goto L_0x04a5
            goto L_0x0527
        L_0x04a5:
            int r3 = r3.intValue()
            r6 = 4
            if (r3 != r6) goto L_0x0527
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r11.f65359E
            if (r3 == 0) goto L_0x04c5
            android.content.Context r6 = r11.f65385g
            if (r6 != 0) goto L_0x04b9
            java.lang.String r16 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r16)
        L_0x04b9:
            r2 = 2132542643(0x7f1c04b3, float:2.0738397E38)
            java.lang.String r2 = r6.getString(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
        L_0x04c5:
            r2 = r8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0510
            r0.append(r2)
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            r2.<init>(r3)
            if (r8 != 0) goto L_0x04df
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x04df:
            int r3 = r8.length()
            r0.setSpan(r2, r13, r3, r7)
            android.content.Context r2 = r11.f65385g
            if (r2 != 0) goto L_0x04ef
            java.lang.String r3 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x04ef:
            r3 = 2132542644(0x7f1c04b4, float:2.0738399E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.append(r2)
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r9)
            r2.<init>(r3)
            int r3 = r8.length()
            int r6 = r0.length()
            r0.setSpan(r2, r3, r6, r7)
            goto L_0x0527
        L_0x0510:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65363I
            if (r0 == 0) goto L_0x0517
            r0.setVisibility(r14)
        L_0x0517:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r11.f65362H
            if (r0 == 0) goto L_0x051e
            r0.setVisibility(r14)
        L_0x051e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65380b
            if (r0 == 0) goto L_0x05f9
            r0.setVisibility(r14)
            goto L_0x05f9
        L_0x0527:
            java.lang.Integer r2 = r15.getRewardType()
            if (r2 != 0) goto L_0x052f
            goto L_0x05d0
        L_0x052f:
            int r2 = r2.intValue()
            r3 = 5
            if (r2 != r3) goto L_0x05d0
            android.widget.LinearLayout r2 = r11.f65402y
            if (r2 == 0) goto L_0x053d
            r2.setVisibility(r14)
        L_0x053d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r11.f65359E
            if (r2 == 0) goto L_0x0556
            android.content.Context r6 = r11.f65385g
            if (r6 != 0) goto L_0x054a
            java.lang.String r16 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r16)
        L_0x054a:
            r3 = 2132542647(0x7f1c04b7, float:2.0738405E38)
            java.lang.String r3 = r6.getString(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
        L_0x0556:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r11.f65363I
            if (r2 == 0) goto L_0x056f
            android.content.Context r3 = r11.f65385g
            if (r3 != 0) goto L_0x0563
            java.lang.String r6 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0563:
            r6 = 2132542649(0x7f1c04b9, float:2.0738409E38)
            java.lang.String r3 = r3.getString(r6)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
        L_0x056f:
            r2 = r8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x05ba
            r0.append(r2)
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            r2.<init>(r3)
            if (r8 != 0) goto L_0x0589
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0589:
            int r3 = r8.length()
            r0.setSpan(r2, r13, r3, r7)
            android.content.Context r2 = r11.f65385g
            if (r2 != 0) goto L_0x0599
            java.lang.String r3 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0599:
            r3 = 2132542648(0x7f1c04b8, float:2.0738407E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.append(r2)
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            int r3 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r9)
            r2.<init>(r3)
            int r3 = r8.length()
            int r4 = r0.length()
            r0.setSpan(r2, r3, r4, r7)
            goto L_0x05d0
        L_0x05ba:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65363I
            if (r0 == 0) goto L_0x05c1
            r0.setVisibility(r14)
        L_0x05c1:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r11.f65362H
            if (r0 == 0) goto L_0x05c8
            r0.setVisibility(r14)
        L_0x05c8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65380b
            if (r0 == 0) goto L_0x05f9
            r0.setVisibility(r14)
            goto L_0x05f9
        L_0x05d0:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r11.f65380b
            if (r2 == 0) goto L_0x05da
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
        L_0x05da:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r11.f65380b
            if (r2 == 0) goto L_0x05f9
            com.ss.android.ugc.aweme.challenge.ui.header.k$k r3 = new com.ss.android.ugc.aweme.challenge.ui.header.k$k
            r3.<init>(r11, r0)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.post(r3)
            goto L_0x05f9
        L_0x05e9:
            r7 = 17
            android.widget.LinearLayout r0 = r11.f65401x
            if (r0 == 0) goto L_0x05f2
            r0.setVisibility(r14)
        L_0x05f2:
            android.widget.LinearLayout r0 = r11.f65402y
            if (r0 == 0) goto L_0x05f9
            r0.setVisibility(r14)
        L_0x05f9:
            com.ss.android.ugc.aweme.discover.model.ShareReward r0 = r15.getShareReward()
            if (r0 == 0) goto L_0x0604
            java.lang.Integer r8 = r0.getRewardConsumePercent()
            goto L_0x0605
        L_0x0604:
            r8 = 0
        L_0x0605:
            if (r8 == 0) goto L_0x0637
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65361G
            if (r0 == 0) goto L_0x0623
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "  "
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r3 = "%  "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x0623:
            int r0 = r8.intValue()
            if (r0 <= 0) goto L_0x0637
            android.widget.ImageView r0 = r11.f65382d
            if (r0 == 0) goto L_0x0637
            com.ss.android.ugc.aweme.challenge.ui.header.k$f r2 = new com.ss.android.ugc.aweme.challenge.ui.header.k$f
            r2.<init>(r11, r8)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0.post(r2)
        L_0x0637:
            java.lang.String r0 = r15.getExampleAwemes()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0656
            java.lang.String r0 = r15.getExampleAwemes()
            com.ss.android.ugc.aweme.challenge.ui.header.k$g r2 = new com.ss.android.ugc.aweme.challenge.ui.header.k$g
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f49843c
            java.lang.Object r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64126a(r0, r2)
            java.util.List r0 = (java.util.List) r0
            r11.f65383e = r0
        L_0x0656:
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r11.f65383e
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r0 == 0) goto L_0x0669
            android.widget.LinearLayout r0 = r11.f65364J
            if (r0 == 0) goto L_0x0667
            r0.setVisibility(r14)
        L_0x0667:
            r3 = 0
            goto L_0x06c7
        L_0x0669:
            android.support.v7.widget.RecyclerView r0 = r11.f65366L
            if (r0 == 0) goto L_0x0680
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r2 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            android.content.Context r3 = r11.f65385g
            if (r3 != 0) goto L_0x0678
            java.lang.String r4 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0678:
            r2.<init>(r3, r13, r13)
            android.support.v7.widget.RecyclerView$i r2 = (android.support.p043v7.widget.RecyclerView.C1332i) r2
            r0.setLayoutManager(r2)
        L_0x0680:
            android.support.v7.widget.RecyclerView r0 = r11.f65366L
            if (r0 == 0) goto L_0x068e
            com.ss.android.ugc.aweme.challenge.ui.header.k$h r2 = new com.ss.android.ugc.aweme.challenge.ui.header.k$h
            r2.<init>()
            android.support.v7.widget.RecyclerView$h r2 = (android.support.p043v7.widget.RecyclerView.C1331h) r2
            r0.mo4798a(r2)
        L_0x068e:
            com.ss.android.ugc.aweme.challenge.ui.header.a.c r0 = new com.ss.android.ugc.aweme.challenge.ui.header.a.c
            com.ss.android.ugc.aweme.challenge.ui.header.k$b r2 = r11.f65378X
            com.ss.android.ugc.aweme.challenge.ui.header.a.d$b r2 = (com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a.C24674d.C24677b) r2
            r3 = 0
            r0.<init>(r2, r13, r1, r3)
            r11.f65367M = r0
            android.support.v7.widget.RecyclerView r0 = r11.f65366L
            if (r0 == 0) goto L_0x06a5
            com.ss.android.ugc.aweme.challenge.ui.header.a.c r1 = r11.f65367M
            android.support.v7.widget.RecyclerView$a r1 = (android.support.p043v7.widget.RecyclerView.C1322a) r1
            r0.setAdapter(r1)
        L_0x06a5:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65365K
            if (r0 == 0) goto L_0x06be
            android.content.Context r1 = r11.f65385g
            if (r1 != 0) goto L_0x06b2
            java.lang.String r2 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x06b2:
            r2 = 2132544495(0x7f1c0bef, float:2.0742153E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x06be:
            com.ss.android.ugc.aweme.challenge.ui.header.a.c r0 = r11.f65367M
            if (r0 == 0) goto L_0x06c7
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r11.f65383e
            r0.mo50553a(r1)
        L_0x06c7:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r23.mo50576a()
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64131a(r0)
            if (r0 != 0) goto L_0x06da
            android.view.View r0 = r11.f65375U
            if (r0 == 0) goto L_0x0795
            r0.setVisibility(r14)
            goto L_0x0795
        L_0x06da:
            android.view.ViewStub r8 = r11.f65374T
            if (r8 != 0) goto L_0x06e3
            java.lang.String r0 = "mDisclaimerContainerVs"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x06e3:
            android.view.View r0 = r11.f65375U
            if (r0 != 0) goto L_0x06e9
            r0 = 1
            goto L_0x06ea
        L_0x06e9:
            r0 = 0
        L_0x06ea:
            if (r0 == 0) goto L_0x06ed
            goto L_0x06ee
        L_0x06ed:
            r8 = r3
        L_0x06ee:
            if (r8 == 0) goto L_0x070c
            android.view.View r0 = r8.inflate()
            r1 = 2132018216(0x7f140428, float:1.9674732E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65376V = r1
            r1 = 2132018215(0x7f140427, float:1.967473E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65369O = r1
            r11.f65375U = r0
        L_0x070c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65376V
            if (r0 != 0) goto L_0x0713
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0713:
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r23.mo50576a()
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64131a(r1)
            if (r2 != 0) goto L_0x0720
            java.lang.String r1 = ""
            goto L_0x0728
        L_0x0720:
            com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer r1 = r1.getChallengeDisclaimer()
            java.lang.String r1 = r1.getTitle()
        L_0x0728:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r23.mo50576a()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64138b(r0)
            java.lang.String r1 = "AdDataUtils.getDisClaimerContent(mChallenge)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r11.f65369O
            if (r1 != 0) goto L_0x0741
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0741:
            android.view.View r1 = (android.view.View) r1
            java.text.Bidi r2 = new java.text.Bidi
            android.content.Context r1 = r1.getContext()
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r1)
            if (r1 == 0) goto L_0x0751
            r1 = -1
            goto L_0x0752
        L_0x0751:
            r1 = -2
        L_0x0752:
            r2.<init>(r0, r1)
            boolean r0 = r2.baseIsLeftToRight()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r11.f65369O
            if (r1 != 0) goto L_0x0760
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0760:
            if (r0 == 0) goto L_0x0764
            r2 = 3
            goto L_0x0765
        L_0x0764:
            r2 = 5
        L_0x0765:
            r1.setGravity(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r7) goto L_0x0777
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r11.f65369O
            if (r1 != 0) goto L_0x0773
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0773:
            r0 = r0 ^ r12
            r1.setTextDirection(r0)
        L_0x0777:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65369O
            if (r0 != 0) goto L_0x077e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x077e:
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r23.mo50576a()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64138b(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.view.View r0 = r11.f65375U
            if (r0 != 0) goto L_0x0792
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0792:
            r0.setVisibility(r13)
        L_0x0795:
            android.view.View r0 = r11.f65370P
            if (r0 == 0) goto L_0x079c
            r0.setVisibility(r14)
        L_0x079c:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r23.mo50576a()
            java.util.List<com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner> r8 = r0.commerceChallengeBannerList
            if (r8 == 0) goto L_0x085a
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r12
            if (r0 == 0) goto L_0x07af
            goto L_0x07b0
        L_0x07af:
            r8 = r3
        L_0x07b0:
            if (r8 != 0) goto L_0x07b4
            goto L_0x085a
        L_0x07b4:
            android.view.ViewStub r0 = r11.f65368N
            if (r0 != 0) goto L_0x07bd
            java.lang.String r1 = "mBannerContainerVs"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x07bd:
            android.view.View r1 = r11.f65370P
            if (r1 != 0) goto L_0x07c3
            r1 = 1
            goto L_0x07c4
        L_0x07c3:
            r1 = 0
        L_0x07c4:
            if (r1 == 0) goto L_0x07c7
            goto L_0x07c8
        L_0x07c7:
            r0 = r3
        L_0x07c8:
            if (r0 == 0) goto L_0x07db
            android.view.View r0 = r0.inflate()
            r1 = 2132018209(0x7f140421, float:1.9674718E38)
            android.view.View r1 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.views.WrapContentRemoteImageView r1 = (com.p683ss.android.ugc.aweme.views.WrapContentRemoteImageView) r1
            r11.f65384f = r1
            r11.f65370P = r0
        L_0x07db:
            java.lang.Object r0 = r8.get(r13)
            com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner r0 = (com.p683ss.android.ugc.aweme.discover.model.CommerceChallengeBanner) r0
            android.content.Context r1 = r11.f65385g
            if (r1 != 0) goto L_0x07ea
            java.lang.String r2 = "mContext"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x07ea:
            int r1 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58224b(r1)
            r4 = 4629700416936869888(0x4040000000000000, double:32.0)
            int r2 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            int r1 = r1 - r2
            com.ss.android.ugc.aweme.views.WrapContentRemoteImageView r2 = r11.f65384f
            if (r2 == 0) goto L_0x07fe
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            goto L_0x07ff
        L_0x07fe:
            r8 = r3
        L_0x07ff:
            if (r8 == 0) goto L_0x0803
            r8.width = r1
        L_0x0803:
            com.ss.android.ugc.aweme.views.WrapContentRemoteImageView r1 = r11.f65384f
            if (r1 == 0) goto L_0x080a
            r1.setLayoutParams(r8)
        L_0x080a:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.getIcon()
            java.util.List r1 = r1.getUrlList()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r1 != 0) goto L_0x083a
            com.ss.android.ugc.aweme.views.WrapContentRemoteImageView r1 = r11.f65384f
            if (r1 == 0) goto L_0x083a
            com.ss.android.ugc.aweme.views.WrapContentRemoteImageView r1 = r11.f65384f
            if (r1 == 0) goto L_0x083a
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r0.getIcon()
            java.util.List r2 = r2.getUrlList()
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            com.ss.android.ugc.aweme.challenge.ui.header.k$c r4 = new com.ss.android.ugc.aweme.challenge.ui.header.k$c
            r4.<init>(r11)
            com.facebook.drawee.c.d r4 = (com.facebook.drawee.p936c.C13791d) r4
            r1.mo95598a(r2, r3, r4)
        L_0x083a:
            com.ss.android.ugc.aweme.views.WrapContentRemoteImageView r1 = r11.f65384f
            if (r1 != 0) goto L_0x0841
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0841:
            com.ss.android.ugc.aweme.challenge.ui.header.k$d r2 = new com.ss.android.ugc.aweme.challenge.ui.header.k$d
            r2.<init>(r11, r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            android.view.View r0 = r11.f65370P
            if (r0 != 0) goto L_0x0852
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0852:
            r0.setVisibility(r13)
            java.lang.String r0 = "banner_show"
            r11.mo50580a(r0)
        L_0x085a:
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r23.mo50576a()
            if (r0 == 0) goto L_0x0876
            java.lang.String r1 = r0.getLinkText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0876
            java.lang.String r0 = r0.getLinkAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0876
            r0 = 1
            goto L_0x0877
        L_0x0876:
            r0 = 0
        L_0x0877:
            if (r0 != 0) goto L_0x0883
            android.view.View r0 = r11.f65372R
            if (r0 == 0) goto L_0x0882
            r0.setVisibility(r14)
            goto L_0x0908
        L_0x0882:
            return
        L_0x0883:
            android.view.ViewStub r8 = r11.f65371Q
            if (r8 != 0) goto L_0x088c
            java.lang.String r0 = "mLinkContainerVs"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x088c:
            android.view.View r0 = r11.f65372R
            if (r0 != 0) goto L_0x0891
            goto L_0x0892
        L_0x0891:
            r12 = 0
        L_0x0892:
            if (r12 == 0) goto L_0x0895
            r3 = r8
        L_0x0895:
            if (r3 == 0) goto L_0x08a8
            android.view.View r0 = r3.inflate()
            r1 = 2132024285(0x7f141bdd, float:1.9687042E38)
            android.view.View r1 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r1
            r11.f65373S = r1
            r11.f65372R = r0
        L_0x08a8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65373S
            if (r0 != 0) goto L_0x08af
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x08af:
            com.ss.android.ugc.aweme.challenge.ui.header.k$e r1 = new com.ss.android.ugc.aweme.challenge.ui.header.k$e
            r1.<init>(r11)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65373S
            if (r0 != 0) goto L_0x08c0
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x08c0:
            android.content.Context r0 = r0.getContext()
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r11.f65373S
            if (r1 != 0) goto L_0x08cf
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x08cf:
            if (r0 == 0) goto L_0x08d3
            r2 = 5
            goto L_0x08d4
        L_0x08d3:
            r2 = 3
        L_0x08d4:
            r1.setGravity(r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r7) goto L_0x08e5
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r11.f65373S
            if (r1 != 0) goto L_0x08e2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x08e2:
            r1.setTextDirection(r0)
        L_0x08e5:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f65373S
            if (r0 != 0) goto L_0x08ec
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x08ec:
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r23.mo50576a()
            java.lang.String r1 = r1.getLinkText()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.view.View r0 = r11.f65372R
            if (r0 != 0) goto L_0x0900
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0900:
            r0.setVisibility(r13)
            java.lang.String r0 = "show_link"
            r11.mo50584b(r0)
        L_0x0908:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24693k.mo50579a(com.ss.android.ugc.aweme.challenge.model.ChallengeDetail):void");
    }

    /* renamed from: b */
    public final void mo50583b() {
        CountDownTimer countDownTimer = this.f65398u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: a */
    public final Challenge mo50576a() {
        ChallengeDetail challengeDetail = this.f65377W;
        if (challengeDetail == null) {
            C52711k.m112237a("mChallengeDetail");
        }
        Challenge challenge = challengeDetail.challenge;
        C52711k.m112236a((Object) challenge, "mChallengeDetail.challenge");
        return challenge;
    }

    /* renamed from: c */
    public final FragmentActivity mo50585c() {
        Context context = this.f65385g;
        if (context == null) {
            C52711k.m112237a("mContext");
        }
        Activity a = C23729p.m58248a(context);
        if (!(a instanceof FragmentActivity)) {
            a = null;
        }
        return (FragmentActivity) a;
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m60202a(C24693k kVar) {
        Context context = kVar.f65385g;
        if (context == null) {
            C52711k.m112237a("mContext");
        }
        return context;
    }

    /* renamed from: a */
    public final void mo50577a(float f) {
        boolean z;
        DmtTextView dmtTextView = this.f65373S;
        if (dmtTextView != null) {
            if (((double) f) <= 0.9d) {
                z = true;
            } else {
                z = false;
            }
            dmtTextView.setClickable(z);
        }
    }

    /* renamed from: b */
    public final void mo50584b(String str) {
        String str2;
        C26890h.onEvent(MobClick.obtain().setEventName(str).setLabelName("challenge").setValue(mo50576a().getCid()).setJsonObject(new C23088c().mo47824a("link_type", "web_link").mo47825b()));
        User author = mo50576a().getAuthor();
        if (author != null) {
            str2 = author.getUid();
        } else {
            str2 = "";
        }
        C26890h.m65011a(str, C23089d.m56640a().mo47829a("author_id", str2).mo47829a("tag_id", mo50576a().getCid()).mo47829a("link_type", "web_link").mo47829a("enter_from", "challenge").f61491a);
    }

    /* renamed from: a */
    public final void mo50580a(String str) {
        C26890h.m65011a(str, C23089d.m56640a().mo47829a("tag_id", mo50576a().getCid()).mo47829a("enter_from", "challenge").f61491a);
    }

    /* renamed from: a */
    public final void mo50578a(FrameLayout frameLayout, C24706l lVar) {
        C52711k.m112240b(frameLayout, "root");
        C52711k.m112240b(lVar, "headerParam");
        Context context = frameLayout.getContext();
        C52711k.m112236a((Object) context, "root.context");
        this.f65385g = context;
        this.f65386h = lVar;
        if (lVar.f65423c == C24680d.TYPE_TRANSFORM) {
            this.f65387j = frameLayout.findViewById(R.id.d40);
            this.f65388k = (CheckableImageView) frameLayout.findViewById(R.id.b53);
            this.f65389l = (DmtTextView) frameLayout.findViewById(R.id.dhz);
        }
        View findViewById = frameLayout.findViewById(R.id.dsv);
        C52711k.m112236a((Object) findViewById, "root.findViewById(R.id.v…rce_disclaimer_container)");
        this.f65374T = (ViewStub) findViewById;
        View findViewById2 = frameLayout.findViewById(R.id.dsu);
        C52711k.m112236a((Object) findViewById2, "root.findViewById(R.id.v…ommerce_banner_container)");
        this.f65368N = (ViewStub) findViewById2;
        View findViewById3 = frameLayout.findViewById(R.id.dsw);
        C52711k.m112236a((Object) findViewById3, "root.findViewById(R.id.vs_commerce_link_container)");
        this.f65371Q = (ViewStub) findViewById3;
        View findViewById4 = frameLayout.findViewById(R.id.f82);
        C52711k.m112236a((Object) findViewById4, "root.findViewById(R.id.vs_task_desc_container)");
        this.f65390m = (ViewStub) findViewById4;
    }

    /* renamed from: a */
    public final boolean mo50581a(String str, String str2) {
        Context context = this.f65385g;
        if (context == null) {
            C52711k.m112237a("mContext");
        }
        return C26540w.m64222a(context, str, str2);
    }

    /* renamed from: a */
    public final boolean mo50582a(String str, boolean z) {
        Context context = this.f65385g;
        if (context == null) {
            C52711k.m112237a("mContext");
        }
        return C26540w.m64226a(context, str, z);
    }
}
