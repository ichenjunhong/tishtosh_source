package com.p683ss.android.ugc.aweme.setting.personalization;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.p030v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.model.AdPersonalitySettings;
import com.p683ss.android.ugc.aweme.protection.p2093a.C40837a;
import com.p683ss.android.ugc.aweme.setting.personalization.p2144b.C41667a;
import com.p683ss.android.ugc.aweme.setting.personalization.p2144b.C41673b;
import com.p683ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41692a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41697d;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity */
public final class PersonalizationActivity extends AmeBaseActivity implements C41673b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f105377a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PersonalizationActivity.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/setting/personalization/viewmodel/PersonalizationViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PersonalizationActivity.class), "pushSettingPresenter", "getPushSettingPresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;"))};

    /* renamed from: f */
    public static final C41642a f105378f = new C41642a(null);

    /* renamed from: w */
    private static final boolean f105379w = false;

    /* renamed from: b */
    public CommonItemView f105380b;

    /* renamed from: c */
    public CommonItemView f105381c;

    /* renamed from: d */
    public boolean f105382d;

    /* renamed from: e */
    public final OnClickListener f105383e = new C41663u(this);

    /* renamed from: r */
    private CommonItemView f105384r;

    /* renamed from: s */
    private final C52668f f105385s = C52732g.m112285a(new C41661s(this));

    /* renamed from: t */
    private final C52668f f105386t = C52732g.m112285a(new C41664v(this));

    /* renamed from: u */
    private boolean f105387u;

    /* renamed from: v */
    private boolean f105388v;

    /* renamed from: x */
    private HashMap f105389x;

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$a */
    public static final class C41642a {
        private C41642a() {
        }

        public /* synthetic */ C41642a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$b */
    static final class C41643b<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105390a;

        C41643b(PersonalizationActivity personalizationActivity) {
            this.f105390a = personalizationActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Object obj2;
            float f;
            Integer num = (Integer) obj;
            CommonItemView b = PersonalizationActivity.m91514b(this.f105390a);
            boolean z2 = false;
            if (num != null && num.intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            b.setChecked(z);
            PersonalizationActivity personalizationActivity = this.f105390a;
            if (num != null && num.intValue() == 1) {
                z2 = true;
            }
            AdPersonalitySettings q = C40869c.m90386q();
            Boolean bool = null;
            if (q != null) {
                obj2 = q.getShowThirdAd();
            } else {
                obj2 = null;
            }
            float f2 = 0.34f;
            if (C52711k.m112239a(obj2, (Object) Boolean.valueOf(true))) {
                CommonItemView commonItemView = (CommonItemView) personalizationActivity.mo85484a((int) R.id.ezw);
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                commonItemView.setAlpha(f);
                if (z2) {
                    commonItemView.setOnClickListener(new C41648g(commonItemView, personalizationActivity, z2));
                } else {
                    commonItemView.setOnClickListener(new C41649h(personalizationActivity, z2));
                }
            }
            AdPersonalitySettings q2 = C40869c.m90386q();
            if (q2 != null) {
                bool = q2.getShowPartnerAd();
            }
            if (C52711k.m112239a((Object) bool, (Object) Boolean.valueOf(true))) {
                CommonItemView commonItemView2 = (CommonItemView) personalizationActivity.mo85484a((int) R.id.eo0);
                if (z2) {
                    f2 = 1.0f;
                }
                commonItemView2.setAlpha(f2);
                if (z2) {
                    commonItemView2.setOnClickListener(new C41650i(commonItemView2, personalizationActivity, z2));
                    return;
                }
                commonItemView2.setOnClickListener(new C41651j(personalizationActivity, z2));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$c */
    static final class C41644c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f105391a;

        C41644c(CommonItemView commonItemView) {
            this.f105391a = commonItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            TextView tvwDesc = this.f105391a.getTvwDesc();
            C52711k.m112236a((Object) tvwDesc, "tvwDesc");
            if (tvwDesc.getSelectionStart() == -1) {
                TextView tvwDesc2 = this.f105391a.getTvwDesc();
                C52711k.m112236a((Object) tvwDesc2, "tvwDesc");
                if (tvwDesc2.getSelectionEnd() == -1) {
                    this.f105391a.performClick();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$d */
    static final class C41645d<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105392a;

        C41645d(PersonalizationActivity personalizationActivity) {
            this.f105392a = personalizationActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f105392a.mo85484a((int) R.id.ezw);
            C52711k.m112236a((Object) commonItemView, "third_party_ads_item");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$e */
    static final class C41646e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f105393a;

        C41646e(CommonItemView commonItemView) {
            this.f105393a = commonItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            TextView tvwDesc = this.f105393a.getTvwDesc();
            C52711k.m112236a((Object) tvwDesc, "tvwDesc");
            if (tvwDesc.getSelectionStart() == -1) {
                TextView tvwDesc2 = this.f105393a.getTvwDesc();
                C52711k.m112236a((Object) tvwDesc2, "tvwDesc");
                if (tvwDesc2.getSelectionEnd() == -1) {
                    this.f105393a.performClick();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$f */
    static final class C41647f<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105394a;

        C41647f(PersonalizationActivity personalizationActivity) {
            this.f105394a = personalizationActivity;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            CommonItemView commonItemView = (CommonItemView) this.f105394a.mo85484a((int) R.id.eo0);
            C52711k.m112236a((Object) commonItemView, "partner_ads_item");
            boolean z = true;
            if (num == null || num.intValue() != 1) {
                z = false;
            }
            commonItemView.setChecked(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$g */
    static final class C41648g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f105395a;

        /* renamed from: b */
        final /* synthetic */ PersonalizationActivity f105396b;

        /* renamed from: c */
        final /* synthetic */ boolean f105397c;

        C41648g(CommonItemView commonItemView, PersonalizationActivity personalizationActivity, boolean z) {
            this.f105395a = commonItemView;
            this.f105396b = personalizationActivity;
            this.f105397c = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            PersonalizationViewModel c = this.f105396b.mo85486c();
            CommonItemView commonItemView = this.f105395a;
            C52711k.m112236a((Object) commonItemView, "this");
            PersonalizationViewModel.m91530a(c, null, Integer.valueOf(commonItemView.mo19040c() ^ true ? 1 : 0), null, 5, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$h */
    static final class C41649h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105398a;

        /* renamed from: b */
        final /* synthetic */ boolean f105399b;

        C41649h(PersonalizationActivity personalizationActivity, boolean z) {
            this.f105398a = personalizationActivity;
            this.f105399b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C10691a.m21548c((Context) this.f105398a, (int) R.string.hi4).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$i */
    static final class C41650i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f105400a;

        /* renamed from: b */
        final /* synthetic */ PersonalizationActivity f105401b;

        /* renamed from: c */
        final /* synthetic */ boolean f105402c;

        C41650i(CommonItemView commonItemView, PersonalizationActivity personalizationActivity, boolean z) {
            this.f105400a = commonItemView;
            this.f105401b = personalizationActivity;
            this.f105402c = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            PersonalizationViewModel c = this.f105401b.mo85486c();
            CommonItemView commonItemView = this.f105400a;
            C52711k.m112236a((Object) commonItemView, "this");
            PersonalizationViewModel.m91530a(c, null, null, Integer.valueOf(commonItemView.mo19040c() ^ true ? 1 : 0), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$j */
    static final class C41651j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105403a;

        /* renamed from: b */
        final /* synthetic */ boolean f105404b;

        C41651j(PersonalizationActivity personalizationActivity, boolean z) {
            this.f105403a = personalizationActivity;
            this.f105404b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C10691a.m21548c((Context) this.f105403a, (int) R.string.hi9).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$k */
    public static final class C41652k implements C41693b {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105405a;

        /* renamed from: e_ */
        public final void mo55285e_(Exception exc) {
        }

        C41652k(PersonalizationActivity personalizationActivity) {
            this.f105405a = personalizationActivity;
        }

        /* renamed from: a */
        public final void mo55281a(C41686c cVar) {
            CommonItemView a = PersonalizationActivity.m91513a(this.f105405a);
            int i = 0;
            boolean z = true;
            if (cVar == null || cVar.f105467J != 1) {
                z = false;
            }
            a.setChecked(z);
            C40837a a2 = C40869c.m90371a();
            if (cVar != null) {
                i = cVar.f105467J;
            }
            a2.mo83163a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$l */
    static final class C41653l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105406a;

        C41653l(PersonalizationActivity personalizationActivity) {
            this.f105406a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C10691a.m21548c((Context) this.f105406a, (int) R.string.hic).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$m */
    static final class C41654m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105407a;

        C41654m(PersonalizationActivity personalizationActivity) {
            this.f105407a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (PersonalizationActivity.m91513a(this.f105407a).mo19040c()) {
                new C10643a(this.f105407a).mo18899b((int) R.string.hif).mo18886a((int) R.string.ah2, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C41654m f105408a;

                    {
                        this.f105408a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f105408a.f105407a.mo85487d();
                    }
                }).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
            } else {
                this.f105407a.mo85487d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$n */
    static final class C41656n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105409a;

        C41656n(PersonalizationActivity personalizationActivity) {
            this.f105409a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Intent intent = new Intent(this.f105409a, CrossPlatformActivity.class);
            intent.setData(Uri.parse(new C18922i("https://www.tiktok.com/falcon/rn/export_data/?enter_from=settings&hide_nav_bar=1").toString()));
            intent.putExtra("hide_nav_bar", true);
            this.f105409a.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$o */
    static final class C41657o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105410a;

        C41657o(PersonalizationActivity personalizationActivity) {
            this.f105410a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Intent intent = new Intent(this.f105410a, CrossPlatformActivity.class);
            intent.setData(Uri.parse("https://www.tiktok.com/falcon/fe_tiktok_common/inferred_interests/index.html"));
            intent.putExtra("title", this.f105410a.getString(R.string.fh9));
            this.f105410a.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$p */
    static final class C41658p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105411a;

        C41658p(PersonalizationActivity personalizationActivity) {
            this.f105411a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Intent intent = new Intent(this.f105411a, CrossPlatformActivity.class);
            intent.setData(Uri.parse("https://www.tiktok.com/inapp/third_party_measurements?hide_more=1"));
            intent.putExtra("title", this.f105411a.getString(R.string.hnh));
            this.f105411a.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$q */
    public static final class C41659q extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105412a;

        /* renamed from: b */
        final /* synthetic */ String f105413b;

        /* renamed from: c */
        final /* synthetic */ int f105414c;

        /* renamed from: d */
        final /* synthetic */ String f105415d;

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            Intent intent = new Intent(this.f105412a, CrossPlatformActivity.class);
            intent.setData(Uri.parse(this.f105413b));
            intent.putExtra("use_webview_title", true);
            this.f105412a.startActivity(intent);
        }

        C41659q(PersonalizationActivity personalizationActivity, String str, int i, String str2) {
            this.f105412a = personalizationActivity;
            this.f105413b = str;
            this.f105414c = i;
            this.f105415d = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$r */
    static final class C41660r implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105416a;

        C41660r(PersonalizationActivity personalizationActivity) {
            this.f105416a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105416a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$s */
    static final class C41661s extends C52712l implements C52670a<PersonalizationViewModel> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105417a;

        C41661s(PersonalizationActivity personalizationActivity) {
            this.f105417a = personalizationActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (PersonalizationViewModel) C0214z.m440a((FragmentActivity) this.f105417a).mo359a(PersonalizationViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$t */
    static final class C41662t implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105418a;

        C41662t(PersonalizationActivity personalizationActivity) {
            this.f105418a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C10691a.m21548c((Context) this.f105418a, (int) R.string.cm5).mo19066a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$u */
    static final class C41663u implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105419a;

        C41663u(PersonalizationActivity personalizationActivity) {
            this.f105419a = personalizationActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f105419a.mo85485b(!PersonalizationActivity.m91514b(this.f105419a).mo19040c());
            this.f105419a.f105382d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$v */
    static final class C41664v extends C52712l implements C52670a<C41697d> {

        /* renamed from: a */
        final /* synthetic */ PersonalizationActivity f105420a;

        /* renamed from: com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$v$a */
        public static final class C41665a implements C41692a {

            /* renamed from: a */
            final /* synthetic */ C41664v f105421a;

            /* renamed from: g */
            public final void mo55287g() {
            }

            /* renamed from: l */
            public final void mo55288l() {
                PersonalizationActivity.m91513a(this.f105421a.f105420a).setChecked(!PersonalizationActivity.m91513a(this.f105421a.f105420a).mo19040c());
                C40869c.m90371a().mo83163a(PersonalizationActivity.m91513a(this.f105421a.f105420a).mo19040c() ^ true ? 1 : 0);
            }

            C41665a(C41664v vVar) {
                this.f105421a = vVar;
            }
        }

        C41664v(PersonalizationActivity personalizationActivity) {
            this.f105420a = personalizationActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C41697d dVar = new C41697d();
            dVar.mo54800a(new C41665a(this));
            return dVar;
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.d3;
    }

    /* renamed from: a */
    public final View mo85484a(int i) {
        if (this.f105389x == null) {
            this.f105389x = new HashMap();
        }
        View view = (View) this.f105389x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105389x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final PersonalizationViewModel mo85486c() {
        return (PersonalizationViewModel) this.f105385s.getValue();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a0_).statusBarDarkFont(true).init();
    }

    public final void onBackPressed() {
        if (this.f105388v) {
            if (this.f105382d) {
                Intent intent = new Intent();
                intent.putExtra("result", 0);
                setResult(10, intent);
            } else {
                mo85485b(false);
            }
        }
        super.onBackPressed();
        finish();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity", "onResume", true);
        super.onResume();
        if (C40869c.f104035d.mo83205f()) {
            C41667a.m91526a((Context) this, (C41673b) this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity", "onResume", false);
    }

    /* renamed from: d */
    public final void mo85487d() {
        CommonItemView commonItemView = this.f105381c;
        if (commonItemView == null) {
            C52711k.m112237a("mDoNotSellItem");
        }
        CommonItemView commonItemView2 = this.f105381c;
        if (commonItemView2 == null) {
            C52711k.m112237a("mDoNotSellItem");
        }
        commonItemView.setChecked(!commonItemView2.mo19040c());
        CommonItemView commonItemView3 = this.f105381c;
        if (commonItemView3 == null) {
            C52711k.m112237a("mDoNotSellItem");
        }
        boolean z = !commonItemView3.mo19040c();
        C40869c.m90371a().mo83163a(z ? 1 : 0);
        ((C41697d) this.f105386t.getValue()).mo44934a_("allow_sell_data", Integer.valueOf(z));
    }

    /* renamed from: a */
    public static final /* synthetic */ CommonItemView m91513a(PersonalizationActivity personalizationActivity) {
        CommonItemView commonItemView = personalizationActivity.f105381c;
        if (commonItemView == null) {
            C52711k.m112237a("mDoNotSellItem");
        }
        return commonItemView;
    }

    /* renamed from: b */
    public static final /* synthetic */ CommonItemView m91514b(PersonalizationActivity personalizationActivity) {
        CommonItemView commonItemView = personalizationActivity.f105380b;
        if (commonItemView == null) {
            C52711k.m112237a("mAdSettingItem");
        }
        return commonItemView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85485b(boolean r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel r0 = r8.mo85486c()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r2 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            r3 = 0
            if (r2 == 0) goto L_0x0014
            java.lang.Boolean r2 = r2.getShowThirdAd()
            goto L_0x0015
        L_0x0014:
            r2 = r3
        L_0x0015:
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r5)
            r5 = 1
            if (r2 != 0) goto L_0x0033
            if (r9 == 0) goto L_0x0028
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x0034
        L_0x0028:
            int r2 = com.p683ss.android.ugc.aweme.protection.C40869c.m90384o()
            if (r2 != r5) goto L_0x0033
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            goto L_0x0034
        L_0x0033:
            r2 = r3
        L_0x0034:
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r6 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            if (r6 == 0) goto L_0x003f
            java.lang.Boolean r6 = r6.getShowPartnerAd()
            goto L_0x0040
        L_0x003f:
            r6 = r3
        L_0x0040:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r7)
            if (r6 != 0) goto L_0x005b
            if (r9 == 0) goto L_0x0051
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            goto L_0x005b
        L_0x0051:
            int r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90385p()
            if (r9 != r5) goto L_0x005b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
        L_0x005b:
            r0.mo85513a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.personalization.PersonalizationActivity.mo85485b(boolean):void");
    }

    /* renamed from: a */
    public final void mo75861a(boolean z) {
        if (z) {
            if (C40869c.m90383n() == 1) {
                mo85485b(false);
            }
            CommonItemView commonItemView = this.f105380b;
            if (commonItemView == null) {
                C52711k.m112237a("mAdSettingItem");
            }
            commonItemView.setAlpha(0.34f);
            CommonItemView commonItemView2 = this.f105380b;
            if (commonItemView2 == null) {
                C52711k.m112237a("mAdSettingItem");
            }
            commonItemView2.setOnClickListener(new C41662t(this));
            return;
        }
        CommonItemView commonItemView3 = this.f105380b;
        if (commonItemView3 == null) {
            C52711k.m112237a("mAdSettingItem");
        }
        commonItemView3.setAlpha(1.0f);
        CommonItemView commonItemView4 = this.f105380b;
        if (commonItemView4 == null) {
            C52711k.m112237a("mAdSettingItem");
        }
        commonItemView4.setOnClickListener(this.f105383e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r9)
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "user_data_download"
            boolean r9 = r9.hasExtra(r0)
            r0 = 0
            if (r9 == 0) goto L_0x0023
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r1 = "user_data_download"
            boolean r9 = r9.getBooleanExtra(r1, r0)
            goto L_0x003e
        L_0x0023:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r9 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x0031 }
            java.lang.String r1 = "SettingsReader.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)     // Catch:{ a -> 0x0031 }
            java.lang.Boolean r9 = r9.getEnableDownloadTtData()     // Catch:{ a -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
        L_0x0035:
            java.lang.String r1 = "try {\n                Se…      false\n            }"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            boolean r9 = r9.booleanValue()
        L_0x003e:
            r8.f105387u = r9
            r9 = 2132023392(0x7f141860, float:1.968523E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById<TextView>(R.id.title)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r3 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            boolean r1 = r1.isLogin()
            if (r1 != 0) goto L_0x0067
            r1 = 2132548953(0x7f1c1d59, float:2.0751195E38)
            java.lang.String r1 = r8.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0070
        L_0x0067:
            r1 = 2132547809(0x7f1c18e1, float:2.0748875E38)
            java.lang.String r1 = r8.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x0070:
            r9.setText(r1)
            r9 = 2132017557(0x7f140195, float:1.9673396E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$r r1 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$r
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r9.setOnClickListener(r1)
            r9 = 2132021550(0x7f14112e, float:1.9681495E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.personalization_ads_item)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            r8.f105380b = r9
            r9 = 2132021552(0x7f141130, float:1.9681499E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.person…ation_download_data_item)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            r8.f105384r = r9
            r9 = 2132018608(0x7f1405b0, float:1.9675527E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.do_not_sell_item)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            r8.f105381c = r9
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r1 = "feed"
            boolean r9 = r9.getBooleanExtra(r1, r0)
            r8.f105388v = r9
            java.lang.String r9 = "enter_personalize_data"
            com.ss.android.ugc.aweme.app.f.d r1 = new com.ss.android.ugc.aweme.app.f.d
            r1.<init>()
            java.lang.String r3 = "enter_from"
            boolean r4 = r8.f105388v
            if (r4 == 0) goto L_0x00d2
            java.lang.String r4 = "homepage_hot"
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r4 = "settings"
        L_0x00d4:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r9, r1)
            com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel r9 = r8.mo85486c()
            boolean r1 = r8.f105388v
            r9.f105433b = r1
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            r1 = 0
            if (r9 == 0) goto L_0x00f1
            java.lang.Boolean r9 = r9.isShowSettings()
            goto L_0x00f2
        L_0x00f1:
            r9 = r1
        L_0x00f2:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r3)
            r9 = r9 ^ r2
            r3 = 8
            if (r9 == 0) goto L_0x010c
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105380b
            if (r9 != 0) goto L_0x0108
            java.lang.String r4 = "mAdSettingItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0108:
            r9.setVisibility(r3)
            goto L_0x0159
        L_0x010c:
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            if (r9 == 0) goto L_0x0117
            java.lang.String r9 = r9.getDescription()
            goto L_0x0118
        L_0x0117:
            r9 = r1
        L_0x0118:
            r4 = r9
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0128
            r9 = 2132548942(0x7f1c1d4e, float:2.0751173E38)
            java.lang.String r9 = r8.getString(r9)
        L_0x0128:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r8.f105380b
            if (r4 != 0) goto L_0x0131
            java.lang.String r5 = "mAdSettingItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0131:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r4.setDesc(r9)
            com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel r9 = r8.mo85486c()
            android.arch.lifecycle.r r9 = r9.mo85512a()
            r4 = r8
            android.arch.lifecycle.k r4 = (android.arch.lifecycle.C0184k) r4
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$b r5 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$b
            r5.<init>(r8)
            android.arch.lifecycle.s r5 = (android.arch.lifecycle.C0199s) r5
            r9.observe(r4, r5)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105380b
            if (r9 != 0) goto L_0x0154
            java.lang.String r4 = "mAdSettingItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0154:
            android.view.View$OnClickListener r4 = r8.f105383e
            r9.setOnClickListener(r4)
        L_0x0159:
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            if (r9 == 0) goto L_0x0164
            java.lang.Boolean r9 = r9.getShowThirdAd()
            goto L_0x0165
        L_0x0164:
            r9 = r1
        L_0x0165:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r4)
            r4 = 2132023347(0x7f141833, float:1.968514E38)
            if (r9 == 0) goto L_0x01db
            android.view.View r9 = r8.mo85484a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            r9.setVisibility(r0)
            android.widget.TextView r4 = r9.getTvwDesc()
            java.lang.String r5 = "tvwDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            r5 = 2132549035(0x7f1c1dab, float:2.0751361E38)
            java.lang.String r5 = r8.getString(r5)
            java.lang.String r6 = "getString(R.string.setti…_ad_networks_description)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r6 = 2132549037(0x7f1c1dad, float:2.0751365E38)
            java.lang.String r6 = r8.getString(r6)
            java.lang.String r7 = "getString(R.string.setti…ased_on_ad_networks_list)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.String r7 = "https://www.tiktok.com/falcon/fe_tiktok_common/third_party_detail/index.html/?advertisers_type=1&hide_loading=1&hide_nav_bar=1"
            android.text.SpannableStringBuilder r5 = r8.m91512a(r5, r6, r7)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            android.widget.TextView r4 = r9.getTvwDesc()
            java.lang.String r5 = "tvwDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.text.method.MovementMethod r5 = android.text.method.LinkMovementMethod.getInstance()
            r4.setMovementMethod(r5)
            android.widget.TextView r4 = r9.getTvwDesc()
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$c r5 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$c
            r5.<init>(r9)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.setOnClickListener(r5)
            com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel r9 = r8.mo85486c()
            android.arch.lifecycle.r r9 = r9.mo85514b()
            r4 = r8
            android.arch.lifecycle.k r4 = (android.arch.lifecycle.C0184k) r4
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$d r5 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$d
            r5.<init>(r8)
            android.arch.lifecycle.s r5 = (android.arch.lifecycle.C0199s) r5
            r9.observe(r4, r5)
            goto L_0x01e9
        L_0x01db:
            android.view.View r9 = r8.mo85484a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            java.lang.String r4 = "third_party_ads_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r4)
            r9.setVisibility(r3)
        L_0x01e9:
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            if (r9 == 0) goto L_0x01f4
            java.lang.Boolean r9 = r9.getShowPartnerAd()
            goto L_0x01f5
        L_0x01f4:
            r9 = r1
        L_0x01f5:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r4)
            r4 = 2132021504(0x7f141100, float:1.9681401E38)
            if (r9 == 0) goto L_0x026b
            android.view.View r9 = r8.mo85484a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            r9.setVisibility(r0)
            android.widget.TextView r4 = r9.getTvwDesc()
            java.lang.String r5 = "tvwDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            r5 = 2132549039(0x7f1c1daf, float:2.075137E38)
            java.lang.String r5 = r8.getString(r5)
            java.lang.String r6 = "getString(R.string.setti…ased_on_data_description)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r6 = 2132549040(0x7f1c1db0, float:2.0751371E38)
            java.lang.String r6 = r8.getString(r6)
            java.lang.String r7 = "getString(R.string.setti…s_ads_based_on_data_list)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.String r7 = "https://www.tiktok.com/falcon/fe_tiktok_common/third_party/index.html?type=partner&hide_loading=1&hide_nav_bar=1"
            android.text.SpannableStringBuilder r5 = r8.m91512a(r5, r6, r7)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            android.widget.TextView r4 = r9.getTvwDesc()
            java.lang.String r5 = "tvwDesc"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            android.text.method.MovementMethod r5 = android.text.method.LinkMovementMethod.getInstance()
            r4.setMovementMethod(r5)
            android.widget.TextView r4 = r9.getTvwDesc()
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$e r5 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$e
            r5.<init>(r9)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.setOnClickListener(r5)
            com.ss.android.ugc.aweme.setting.personalization.viewmodel.PersonalizationViewModel r9 = r8.mo85486c()
            android.arch.lifecycle.r r9 = r9.mo85515c()
            r4 = r8
            android.arch.lifecycle.k r4 = (android.arch.lifecycle.C0184k) r4
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$f r5 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$f
            r5.<init>(r8)
            android.arch.lifecycle.s r5 = (android.arch.lifecycle.C0199s) r5
            r9.observe(r4, r5)
            goto L_0x0279
        L_0x026b:
            android.view.View r9 = r8.mo85484a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            java.lang.String r4 = "partner_ads_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r4)
            r9.setVisibility(r3)
        L_0x0279:
            com.ss.android.ugc.aweme.IAccountUserService r9 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r4 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r4)
            boolean r9 = r9.isLogin()
            if (r9 != 0) goto L_0x0295
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105384r
            if (r9 != 0) goto L_0x0291
            java.lang.String r4 = "mDownloadDataItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0291:
            r9.setVisibility(r3)
            goto L_0x02c0
        L_0x0295:
            boolean r9 = r8.f105387u
            if (r9 == 0) goto L_0x029b
            r9 = 0
            goto L_0x029d
        L_0x029b:
            r9 = 8
        L_0x029d:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r8.f105384r
            if (r4 != 0) goto L_0x02a6
            java.lang.String r5 = "mDownloadDataItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x02a6:
            r4.setVisibility(r9)
            boolean r9 = r8.f105387u
            if (r9 == 0) goto L_0x02c0
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105384r
            if (r9 != 0) goto L_0x02b6
            java.lang.String r4 = "mDownloadDataItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x02b6:
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$n r4 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$n
            r4.<init>(r8)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r9.setOnClickListener(r4)
        L_0x02c0:
            int r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90388s()
            if (r9 <= 0) goto L_0x0363
            com.ss.android.ugc.aweme.IAccountUserService r9 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r4 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r4)
            boolean r9 = r9.isLogin()
            if (r9 == 0) goto L_0x0363
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105381c
            if (r9 != 0) goto L_0x02de
            java.lang.String r4 = "mDoNotSellItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x02de:
            r9.setVisibility(r0)
            int r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90388s()
            r4 = 2
            if (r9 != r4) goto L_0x0317
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105381c
            if (r9 != 0) goto L_0x02f1
            java.lang.String r4 = "mDoNotSellItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x02f1:
            r4 = 1051595899(0x3eae147b, float:0.34)
            r9.setAlpha(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105381c
            if (r9 != 0) goto L_0x0300
            java.lang.String r4 = "mDoNotSellItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0300:
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$l r4 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$l
            r4.<init>(r8)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r9.setOnClickListener(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105381c
            if (r9 != 0) goto L_0x0313
            java.lang.String r4 = "mDoNotSellItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0313:
            r9.setChecked(r2)
            goto L_0x036f
        L_0x0317:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105381c
            if (r9 != 0) goto L_0x0320
            java.lang.String r4 = "mDoNotSellItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0320:
            r4 = 1065353216(0x3f800000, float:1.0)
            r9.setAlpha(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105381c
            if (r9 != 0) goto L_0x032e
            java.lang.String r4 = "mDoNotSellItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x032e:
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$m r4 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$m
            r4.<init>(r8)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r9.setOnClickListener(r4)
            com.ss.android.ugc.aweme.setting.serverpush.b.e r9 = new com.ss.android.ugc.aweme.setting.serverpush.b.e
            r9.<init>()
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$k r4 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$k
            r4.<init>(r8)
            com.ss.android.ugc.aweme.common.e r4 = (com.p683ss.android.ugc.aweme.common.C26865e) r4
            r9.mo54800a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105381c
            if (r9 != 0) goto L_0x0350
            java.lang.String r4 = "mDoNotSellItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0350:
            com.ss.android.ugc.aweme.protection.a.a r4 = com.p683ss.android.ugc.aweme.protection.C40869c.f104033b
            com.bytedance.keva.Keva r4 = r4.f103983a
            java.lang.String r5 = "do_not_sell_data"
            int r4 = r4.getInt(r5, r0)
            if (r4 != 0) goto L_0x035e
            r4 = 1
            goto L_0x035f
        L_0x035e:
            r4 = 0
        L_0x035f:
            r9.setChecked(r4)
            goto L_0x036f
        L_0x0363:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = r8.f105381c
            if (r9 != 0) goto L_0x036c
            java.lang.String r4 = "mDoNotSellItem"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x036c:
            r9.setVisibility(r3)
        L_0x036f:
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            if (r9 == 0) goto L_0x037a
            java.lang.Boolean r9 = r9.getShowInterestLabel()
            goto L_0x037b
        L_0x037a:
            r9 = r1
        L_0x037b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r4)
            r4 = 2132021553(0x7f141131, float:1.96815E38)
            if (r9 == 0) goto L_0x039c
            android.view.View r9 = r8.mo85484a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            r9.setVisibility(r0)
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$o r4 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$o
            r4.<init>(r8)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r9.setOnClickListener(r4)
            goto L_0x03aa
        L_0x039c:
            android.view.View r9 = r8.mo85484a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            java.lang.String r4 = "personalization_interest_label_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r4)
            r9.setVisibility(r3)
        L_0x03aa:
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r9 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            if (r9 == 0) goto L_0x03b4
            java.lang.Boolean r1 = r9.getShowThirdPartyMeasurement()
        L_0x03b4:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r9)
            r1 = 2132023351(0x7f141837, float:1.9685147E38)
            if (r9 == 0) goto L_0x03d5
            android.view.View r9 = r8.mo85484a(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            r9.setVisibility(r0)
            com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$p r1 = new com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity$p
            r1.<init>(r8)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r9.setOnClickListener(r1)
            goto L_0x03e3
        L_0x03d5:
            android.view.View r9 = r8.mo85484a(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r9 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r9
            java.lang.String r1 = "third_party_measurement_item"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            r9.setVisibility(r3)
        L_0x03e3:
            java.lang.String r9 = "com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r9, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.personalization.PersonalizationActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private final SpannableStringBuilder m91512a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        CharSequence sb2 = sb.toString();
        int a = C52830p.m112419a(sb2, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return new SpannableStringBuilder(sb2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
        spannableStringBuilder.setSpan(new C41659q(this, str3, a, str2), a, str2.length() + a, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.su)), a, str2.length() + a, 33);
        return spannableStringBuilder;
    }
}
