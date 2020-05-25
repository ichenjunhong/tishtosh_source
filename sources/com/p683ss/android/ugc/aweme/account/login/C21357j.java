package com.p683ss.android.ugc.aweme.account.login;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.base.p1268a.C20917a.C20919a;
import com.p683ss.android.ugc.aweme.account.login.C21398r.C21399a;
import com.p683ss.android.ugc.aweme.account.login.C21398r.C21400b;
import com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21841f;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21674q;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity.C21859a;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.C22029a;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.C22029a.C22031a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.C22263e;
import com.p683ss.android.ugc.aweme.account.util.C22277q;
import com.p683ss.android.ugc.aweme.account.util.ThirdLoginSetting;
import com.p683ss.android.ugc.aweme.base.p1409b.C23476a;
import com.p683ss.android.ugc.aweme.base.p1409b.C23478b;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.service.C36691l;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2639f.p2641b.C52731z;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.login.j */
public final class C21357j implements C23478b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f57998a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21357j.class), "title_bar", "getTitle_bar()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21357j.class), "divider", "getDivider()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21357j.class), "ll_login_group", "getLl_login_group()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21357j.class), "channle_list", "getChannle_list()Landroid/support/v7/widget/RecyclerView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21357j.class), "more", "getMore()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21357j.class), "tv_user_terms_of_privacy", "getTv_user_terms_of_privacy()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21357j.class), "itemList", "getItemList()Ljava/util/List;"))};

    /* renamed from: b */
    final C52668f f57999b = C52732g.m112286a(C52757k.NONE, new C21374o(this));

    /* renamed from: c */
    final C52668f f58000c = C52732g.m112286a(C52757k.NONE, new C21359b(this));

    /* renamed from: d */
    public Dialog f58001d;

    /* renamed from: e */
    public String f58002e;

    /* renamed from: f */
    public String f58003f;

    /* renamed from: g */
    public String f58004g;

    /* renamed from: h */
    public int f58005h = 4;

    /* renamed from: i */
    public float f58006i = C9432q.m18687b((Context) this.f58007j, 56.0f);

    /* renamed from: j */
    public final Activity f58007j;

    /* renamed from: k */
    public final View f58008k;

    /* renamed from: l */
    public final Bundle f58009l;

    /* renamed from: m */
    public final boolean f58010m;

    /* renamed from: n */
    private final C52668f f58011n = C52732g.m112286a(C52757k.NONE, new C21371l(this));

    /* renamed from: o */
    private final C52668f f58012o = C52732g.m112286a(C52757k.NONE, new C21358a(this));

    /* renamed from: p */
    private final C52668f f58013p = C52732g.m112286a(C52757k.NONE, new C21373n(this));

    /* renamed from: q */
    private final C52668f f58014q = C52732g.m112286a(C52757k.NONE, new C21375p(this));

    /* renamed from: r */
    private final C52668f f58015r = C52732g.m112286a(C52757k.NONE, new C21369k(this));

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$a */
    static final class C21358a extends C52712l implements C52670a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C21357j f58016a;

        C21358a(C21357j jVar) {
            this.f58016a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecyclerView) this.f58016a.f58008k.findViewById(R.id.sj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$b */
    static final class C21359b extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C21357j f58017a;

        C21359b(C21357j jVar) {
            this.f58017a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f58017a.f58007j.findViewById(R.id.a6h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$c */
    static final class C21360c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21357j f58018a;

        C21360c(C21357j jVar) {
            this.f58018a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21377l.m53997a(this.f58018a.f58002e, "click_sign_up");
            Activity activity = this.f58018a.f58007j;
            if (!(activity instanceof I18nSignUpActivity)) {
                activity = null;
            }
            I18nSignUpActivity i18nSignUpActivity = (I18nSignUpActivity) activity;
            if (i18nSignUpActivity != null) {
                i18nSignUpActivity.mo45007a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$d */
    static final class C21361d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21357j f58019a;

        C21361d(C21357j jVar) {
            this.f58019a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Activity activity = this.f58019a.f58007j;
            if (!(activity instanceof I18nSignUpActivity)) {
                activity = null;
            }
            I18nSignUpActivity i18nSignUpActivity = (I18nSignUpActivity) activity;
            if (i18nSignUpActivity != null) {
                i18nSignUpActivity.mo45007a(true);
            }
            C26890h.m65011a("click_login", C20856a.m53173a().mo44776a("enter_method", this.f58019a.f58003f).f56798a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$e */
    static final class C21362e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21357j f58020a;

        C21362e(C21357j jVar) {
            this.f58020a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f58020a.f58007j.isFinishing()) {
                C21354g.m53971b(this.f58020a.f58007j).show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$f */
    static final class C21363f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21357j f58021a;

        C21363f(C21357j jVar) {
            this.f58021a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f58021a.f58007j.isFinishing()) {
                if (this.f58021a.f58001d == null) {
                    this.f58021a.f58001d = new C20919a().mo44875a(C22277q.f60046a.mo46374a("privacy-policy")).mo44876a((Context) this.f58021a.f58007j);
                }
                Dialog dialog = this.f58021a.f58001d;
                if (dialog == null) {
                    C52711k.m112234a();
                }
                dialog.show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$g */
    static final class C21364g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21357j f58022a;

        C21364g(C21357j jVar) {
            this.f58022a = jVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.onEventV3("signup_channel_unfold");
            RecyclerView a = this.f58022a.mo45501a();
            C52711k.m112236a((Object) a, "channle_list");
            C1322a adapter = a.getAdapter();
            if (adapter != null) {
                ((C21398r) adapter).f58056a = true;
                RecyclerView a2 = this.f58022a.mo45501a();
                C52711k.m112236a((Object) a2, "channle_list");
                C1322a adapter2 = a2.getAdapter();
                if (adapter2 != null) {
                    ((C21398r) adapter2).f58057b = true;
                    RecyclerView a3 = this.f58022a.mo45501a();
                    C52711k.m112236a((Object) a3, "channle_list");
                    C1322a adapter3 = a3.getAdapter();
                    if (adapter3 == null) {
                        C52711k.m112234a();
                    }
                    adapter3.notifyDataSetChanged();
                    C23727n.m58240b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C21364g f58023a;

                        {
                            this.f58023a = r1;
                        }

                        public final void run() {
                            boolean z;
                            RecyclerView a = this.f58023a.f58022a.mo45501a();
                            C52711k.m112236a((Object) a, "channle_list");
                            C1332i layoutManager = a.getLayoutManager();
                            if (layoutManager != null) {
                                int l = ((LinearLayoutManager) layoutManager).mo4751l();
                                View childAt = this.f58023a.f58022a.mo45501a().getChildAt(l);
                                C52711k.m112236a((Object) childAt, "channle_list.getChildAt(lvp)");
                                int bottom = childAt.getBottom();
                                View b = this.f58023a.f58022a.mo45502b();
                                View b2 = this.f58023a.f58022a.mo45502b();
                                C52711k.m112236a((Object) b2, "more");
                                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(b, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofInt("top", new int[]{b2.getTop(), bottom})});
                                C52711k.m112236a((Object) ofPropertyValuesHolder, "anim");
                                ofPropertyValuesHolder.setDuration(300);
                                ofPropertyValuesHolder.start();
                                RecyclerView a2 = this.f58023a.f58022a.mo45501a();
                                C52711k.m112236a((Object) a2, "channle_list");
                                int childCount = a2.getChildCount();
                                for (int i = this.f58023a.f58022a.f58005h + 1; i < childCount; i++) {
                                    View childAt2 = this.f58023a.f58022a.mo45501a().getChildAt(i);
                                    if (!(childAt2 == null || childAt2.getParent() == null)) {
                                        C1352v b3 = this.f58023a.f58022a.mo45501a().mo4812b(this.f58023a.f58022a.mo45501a().getChildAt(i));
                                        if (b3 != null) {
                                            C21399a aVar = (C21399a) b3;
                                            if (i <= l) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (aVar.f58064d.getAlpha() != 1.0f) {
                                                if (z) {
                                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f58064d, "alpha", new float[]{0.0f, 1.0f});
                                                    C52711k.m112236a((Object) ofFloat, "objectAnimator");
                                                    ofFloat.setDuration(300);
                                                    ofFloat.setStartDelay((long) (((aVar.getAdapterPosition() - aVar.f58065e.f58060e) - 1) * 50));
                                                    ofFloat.start();
                                                } else {
                                                    aVar.f58064d.setAlpha(1.0f);
                                                }
                                            }
                                        }
                                    }
                                }
                                RecyclerView a3 = this.f58023a.f58022a.mo45501a();
                                C52711k.m112236a((Object) a3, "channle_list");
                                C1322a adapter = a3.getAdapter();
                                if (adapter != null) {
                                    ((C21398r) adapter).f58057b = false;
                                    return;
                                }
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
                            }
                            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                        }
                    });
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$h */
    public static final class C21366h extends C1340m {

        /* renamed from: a */
        final /* synthetic */ C21357j f58024a;

        C21366h(C21357j jVar) {
            this.f58024a = jVar;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            View childAt = this.f58024a.mo45501a().getChildAt(0);
            if (childAt != null && childAt.getParent() != null) {
                C1352v b = this.f58024a.mo45501a().mo4812b(childAt);
                float f = 1.0f;
                if (b instanceof C21400b) {
                    C21400b bVar = (C21400b) b;
                    TextView textView = bVar.f58066a;
                    C52711k.m112236a((Object) textView, "vh.title");
                    if (textView.getHeight() > 0) {
                        int top = bVar.f58068c.getTop();
                        TextView textView2 = bVar.f58066a;
                        C52711k.m112236a((Object) textView2, "vh.title");
                        int top2 = textView2.getTop();
                        if (top >= 0) {
                            f = 0.0f;
                        } else {
                            TextView textView3 = bVar.f58066a;
                            C52711k.m112236a((Object) textView3, "vh.title");
                            if (top > (-(textView3.getHeight() + top2))) {
                                float abs = (float) (Math.abs(top) - top2);
                                TextView textView4 = bVar.f58066a;
                                C52711k.m112236a((Object) textView4, "vh.title");
                                f = abs / ((float) textView4.getHeight());
                            }
                        }
                    }
                }
                TextView textView5 = (TextView) this.f58024a.f57999b.getValue();
                C52711k.m112236a((Object) textView5, "title_bar");
                textView5.setAlpha(f);
                View view = (View) this.f58024a.f58000c.getValue();
                C52711k.m112236a((Object) view, "divider");
                view.setAlpha(f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$i */
    static final class C21367i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21357j f58025a;

        /* renamed from: b */
        final /* synthetic */ C52727e f58026b;

        C21367i(C21357j jVar, C52727e eVar) {
            this.f58025a = jVar;
            this.f58026b = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C22263e.m55109a(this.f58025a.f58007j, (String) this.f58026b.element, true);
            if (!this.f58025a.f58007j.isFinishing()) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$j */
    static final class C21368j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21357j f58027a;

        C21368j(C21357j jVar) {
            this.f58027a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f58027a.f58007j.isFinishing()) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$k */
    static final class C21369k extends C52712l implements C52670a<List<C22029a>> {

        /* renamed from: a */
        final /* synthetic */ C21357j f58028a;

        C21369k(C21357j jVar) {
            this.f58028a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            boolean z;
            List a = C22031a.m54768a((C23478b) this.f58028a);
            OnClickListener r2 = new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C21369k f58029a;

                {
                    this.f58029a = r1;
                }

                public final void onClick(View view) {
                    Intent intent;
                    ClickInstrumentation.onClick(view);
                    if (this.f58029a.f58028a.f58010m) {
                        C26890h.m65011a("click_sign_up", C20856a.m53173a().mo44776a("enter_method", this.f58029a.f58028a.f58003f).f56798a);
                        C36691l lVar = (C36691l) C23826bi.m58450a(C36691l.class);
                        if (lVar != null) {
                            lVar.mo47884a("click_sign_up");
                            lVar.mo47885b("SIGNUP");
                        }
                        intent = C21859a.m54544a(this.f58029a.f58028a.f58007j);
                    } else {
                        C26890h.m65011a("click_login_button", C20856a.m53173a().mo44776a("enter_from", this.f58029a.f58028a.f58002e).f56798a);
                        C36691l lVar2 = (C36691l) C23826bi.m58450a(C36691l.class);
                        if (lVar2 != null) {
                            lVar2.mo47884a("click_login");
                            lVar2.mo47885b("LOGIN");
                        }
                        intent = C21859a.m54545b(this.f58029a.f58028a.f58007j);
                    }
                    if (this.f58029a.f58028a.f58009l != null) {
                        if (intent == null) {
                            C52711k.m112234a();
                        }
                        intent.putExtras(this.f58029a.f58028a.f58009l);
                    }
                    this.f58029a.f58028a.f58007j.startActivity(intent);
                }
            };
            if (this.f58028a.f58010m) {
                i = R.string.af7;
            } else {
                i = R.string.fxo;
            }
            a.add(0, new C22029a(R.drawable.cem, r2, i));
            if (this.f58028a.f58010m) {
                C52711k.m112236a((Object) a, "channelList");
                Iterable iterable = a;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    C22029a aVar = (C22029a) next;
                    C52711k.m112236a((Object) aVar, "it");
                    if (aVar.f59521a == R.drawable.cep && aVar.f59523c == R.string.af3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                a.removeAll((List) arrayList);
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$l */
    static final class C21371l extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C21357j f58030a;

        C21371l(C21357j jVar) {
            this.f58030a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f58030a.f58008k.findViewById(R.id.bfw);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$m */
    public static final class C21372m implements C21841f {

        /* renamed from: a */
        final /* synthetic */ C21357j f58031a;

        /* renamed from: d */
        public final Bundle mo45075d() {
            return this.f58031a.f58009l;
        }

        /* renamed from: a */
        public final String mo45068a() {
            String str = this.f58031a.f58002e;
            if (str == null) {
                return "";
            }
            return str;
        }

        /* renamed from: b */
        public final String mo45072b() {
            String str = this.f58031a.f58003f;
            if (str == null) {
                return "";
            }
            return str;
        }

        /* renamed from: c */
        public final String mo45073c() {
            String str = this.f58031a.f58004g;
            if (str == null) {
                return "";
            }
            return str;
        }

        C21372m(C21357j jVar) {
            this.f58031a = jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$n */
    static final class C21373n extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C21357j f58032a;

        C21373n(C21357j jVar) {
            this.f58032a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f58032a.f58008k.findViewById(R.id.bmy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$o */
    static final class C21374o extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C21357j f58033a;

        C21374o(C21357j jVar) {
            this.f58033a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f58033a.f58007j.findViewById(R.id.d10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.j$p */
    static final class C21375p extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C21357j f58034a;

        C21375p(C21357j jVar) {
            this.f58034a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f58034a.f58008k.findViewById(R.id.die);
        }
    }

    /* renamed from: c */
    private TextView m53986c() {
        return (TextView) this.f58011n.getValue();
    }

    /* renamed from: d */
    private TextView m53987d() {
        return (TextView) this.f58014q.getValue();
    }

    /* renamed from: e */
    private List<C22029a> m53988e() {
        return (List) this.f58015r.getValue();
    }

    /* renamed from: a */
    public final RecyclerView mo45501a() {
        return (RecyclerView) this.f58012o.getValue();
    }

    /* renamed from: b */
    public final View mo45502b() {
        return (View) this.f58013p.getValue();
    }

    /* renamed from: a */
    private final boolean m53985a(String str) {
        InsRecoverSetting insRecoverSetting;
        if (C52711k.m112239a((Object) "instagram", (Object) str)) {
            try {
                insRecoverSetting = (InsRecoverSetting) C10193n.m20607a().mo18202a(InsRecoverUrl.class, "ins_recover_account_url", C10181b.m20511a().mo18175c().getInsRecoverAccountUrl(), "com.ss.android.ugc.aweme.account.login.InsRecoverSetting", InsRecoverSetting.class);
            } catch (Throwable unused) {
                insRecoverSetting = new InsRecoverSetting();
            }
            if (insRecoverSetting != null && insRecoverSetting.getForbid()) {
                C52727e eVar = new C52727e();
                eVar.element = insRecoverSetting.getUrl();
                if (TextUtils.isEmpty((String) eVar.element)) {
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(C24095a.m58955l());
                    sb.append("/passport/find_account/instagram/index/?append_common_params=1&&enter_from=ins_login");
                    eVar.element = sb.toString();
                }
                new C10643a(this.f58007j).mo18885a((int) R.string.h9p).mo18899b((int) R.string.h9o).mo18898b().mo18906c().mo18886a((int) R.string.h9m, (DialogInterface.OnClickListener) new C21367i(this, eVar)).mo18900b((int) R.string.h9n, (DialogInterface.OnClickListener) new C21368j(this)).mo18897a().mo18883c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String mo45069a(C23476a aVar) {
        if (aVar == null) {
            return null;
        }
        String str = aVar.f62546a;
        if (str == null || str.hashCode() != 103149417 || !str.equals("login") || !aVar.mo48645b()) {
            return null;
        }
        if (!C21376k.m53996a(this.f58007j)) {
            C10691a.m21542b((Context) this.f58007j, (int) R.string.cg1).mo19066a();
            return null;
        }
        String str2 = (String) aVar.mo48644a();
        C52711k.m112236a((Object) str2, "command.firstArg");
        if (!m53985a(str2)) {
            C21674q.f58706a.mo45930a((Boolean) null, str2, (C21841f) new C21372m(this), false);
            C36691l lVar = (C36691l) C23826bi.m58450a(C36691l.class);
            if (lVar != null) {
                StringBuilder sb = new StringBuilder("Mob.Event.LOGIN_SUBMIT_");
                sb.append(str2);
                lVar.mo47884a(sb.toString());
                lVar.mo47885b("LOGIN");
            }
            Intent intent = new Intent(this.f58007j, AuthorizeActivity.class);
            if (this.f58009l != null) {
                intent.putExtras(this.f58009l);
            }
            intent.putExtra("platform", str2).putExtra("enter_from", this.f58002e).putExtra("enter_method", this.f58003f);
            this.f58007j.startActivityForResult(intent, 1001);
            C21354g.m53487a(str2, this.f58002e, this.f58003f);
        }
        return null;
    }

    /* renamed from: a */
    private SpannableStringBuilder m53984a(int i, int i2) {
        String string = this.f58007j.getString(i2);
        String string2 = this.f58007j.getString(i, new Object[]{string});
        CharSequence charSequence = string2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        C52711k.m112236a((Object) string2, "temp");
        C52711k.m112236a((Object) string, "rightString");
        int a = C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null);
        int color = this.f58007j.getResources().getColor(R.color.z_);
        spannableStringBuilder.setSpan(new I18nLoginViewV2$getBottomText$1(color, color), a, string.length() + a, 34);
        return spannableStringBuilder;
    }

    public C21357j(Activity activity, View view, Bundle bundle, boolean z) {
        String str;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(view, "view");
        this.f58007j = activity;
        this.f58008k = view;
        this.f58009l = bundle;
        this.f58010m = z;
        if (this.f58009l != null) {
            this.f58002e = this.f58009l.getString("enter_from");
            this.f58003f = this.f58009l.getString("enter_method");
            if (this.f58010m) {
                str = "click_sign_up";
            } else {
                str = "click_login";
            }
            this.f58004g = str;
            Serializable serializable = this.f58009l.getSerializable("extra_param");
            if (serializable != null) {
                Map f = C52731z.m112270f(serializable);
                String str2 = "enter_type";
                String str3 = this.f58004g;
                if (str3 == null) {
                    C52711k.m112234a();
                }
                f.put(str2, str3);
            }
            this.f58009l.putString("enter_type", this.f58004g);
        }
        if (this.f58010m) {
            ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) C23859b.m58575b().mo49459a((Context) C23826bi.m58460b(), "i18n_third_login_strategy", ThirdLoginSetting.class);
            if (thirdLoginSetting != null && thirdLoginSetting.getDirectShowNumber() > 0) {
                this.f58005h = thirdLoginSetting.getDirectShowNumber() + 1;
            }
        }
        RecyclerView a = mo45501a();
        C52711k.m112236a((Object) a, "channle_list");
        List e = m53988e();
        C52711k.m112236a((Object) e, "itemList");
        a.setAdapter(new C21398r(e, this.f58010m, this.f58005h));
        mo45501a().mo4801a((C1340m) new C21366h(this));
        m53986c().setOnTouchListener(new C48221a(0.5f, 150, null));
        if (this.f58010m) {
            mo45501a().setItemViewCacheSize(0);
            TextView c = m53986c();
            C52711k.m112236a((Object) c, "ll_login_group");
            c.setText(m53984a(R.string.afa, R.string.afb));
            m53986c().setOnClickListener(new C21361d(this));
            C21057ae.m53524a(this.f58007j, m53987d(), new C21362e(this), new C21363f(this), false);
            RecyclerView a2 = mo45501a();
            C52711k.m112236a((Object) a2, "channle_list");
            a2.setLayoutManager(new I18nLoginViewV2$initSignUpStyle$4(this, this.f58007j));
            mo45502b().setOnClickListener(new C21364g(this));
            if (this.f58005h >= m53988e().size()) {
                View b = mo45502b();
                C52711k.m112236a((Object) b, "more");
                b.setVisibility(8);
                RecyclerView a3 = mo45501a();
                C52711k.m112236a((Object) a3, "channle_list");
                C1322a adapter = a3.getAdapter();
                if (adapter != null) {
                    ((C21398r) adapter).f58056a = true;
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
                }
            }
            return;
        }
        m53986c().setOnClickListener(new C21360c(this));
        View b2 = mo45502b();
        C52711k.m112236a((Object) b2, "more");
        b2.setVisibility(8);
        TextView d = m53987d();
        C52711k.m112236a((Object) d, "tv_user_terms_of_privacy");
        d.setVisibility(8);
        TextView c2 = m53986c();
        C52711k.m112236a((Object) c2, "ll_login_group");
        c2.setText(m53984a(R.string.adv, R.string.adw));
        this.f58008k.setBackgroundResource(R.color.in);
        RecyclerView a4 = mo45501a();
        C52711k.m112236a((Object) a4, "channle_list");
        a4.setLayoutManager(new LinearLayoutManager(this.f58007j));
    }
}
