package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.friends.experiment.AccountSuggestionExperiment;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37612g;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40338do.C40341c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40444k;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40444k.C40446b;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus */
public final class RecommendCommonUserViewMus extends RelativeLayout {

    /* renamed from: c */
    public static final int f102550c = 1;

    /* renamed from: d */
    public static final int f102551d = 2;

    /* renamed from: e */
    public static final int f102552e = 3;

    /* renamed from: f */
    public static final C40189a f102553f = new C40189a(null);

    /* renamed from: a */
    public RecyclerView f102554a;

    /* renamed from: b */
    public C40190b f102555b;

    /* renamed from: g */
    private View f102556g;

    /* renamed from: h */
    private TextView f102557h;

    /* renamed from: i */
    private DmtTextView f102558i;

    /* renamed from: j */
    private ImageView f102559j;

    /* renamed from: k */
    private View f102560k;

    /* renamed from: l */
    private C40444k f102561l;

    /* renamed from: m */
    private List<? extends User> f102562m;

    /* renamed from: n */
    private int f102563n;

    /* renamed from: o */
    private String f102564o;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$a */
    public static final class C40189a {
        private C40189a() {
        }

        public /* synthetic */ C40189a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$b */
    public interface C40190b {
        /* renamed from: J */
        void mo82188J();
    }

    public RecommendCommonUserViewMus(Context context) {
        this(context, null, 0, 6, null);
    }

    public RecommendCommonUserViewMus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo82362a() {
        getAdapter().mo54785f();
    }

    public final C40444k getAdapter() {
        if (this.f102561l == null) {
            this.f102561l = new C40444k();
        }
        return this.f102561l;
    }

    public final List<User> getData() {
        return getAdapter().mo50673a();
    }

    public final Map<String, Integer> getPosInApiListMap() {
        return getAdapter().f103256f;
    }

    public final void setSeeAllListener(C40190b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f102555b = bVar;
    }

    public final void setBackgroundResource(int i) {
        findViewById(R.id.b94).setBackgroundResource(i);
    }

    public final void setOnItemOperationListener(C40446b bVar) {
        C52711k.m112240b(bVar, "onItemOperationListener");
        C40444k adapter = getAdapter();
        C52711k.m112240b(bVar, "onItemOperationListener");
        adapter.f103251a = bVar;
    }

    public final void setOnViewAttachedToWindowListener(C26872d<C40338do> dVar) {
        C52711k.m112240b(dVar, "onViewAttachedToWindowListener");
        C40444k adapter = getAdapter();
        C52711k.m112240b(dVar, "onViewAttachedToWindowListener");
        adapter.f103252b = dVar;
    }

    public final void setPageType(int i) {
        this.f102563n = i;
        getAdapter().f103255e = i;
        getAdapter().mo54798c(false);
        this.f102557h.setText(R.string.czm);
    }

    /* renamed from: a */
    public final void mo82364a(boolean z) {
        if (z) {
            this.f102554a.setVisibility(8);
            this.f102557h.setVisibility(8);
            this.f102560k.setVisibility(0);
            return;
        }
        this.f102554a.setVisibility(0);
        this.f102557h.setVisibility(0);
        this.f102560k.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo82363a(List<? extends User> list, String str) {
        if (list != null) {
            if (list.size() <= 0) {
                mo82364a(true);
            } else {
                mo82364a(false);
            }
            this.f102564o = str;
            this.f102562m = list;
            C40444k adapter = getAdapter();
            List<? extends User> list2 = this.f102562m;
            if (list2 == null) {
                C52711k.m112237a("mUsers");
            }
            adapter.mo50303a(list2);
            getAdapter().f103254d = str;
            getAdapter().mo54798c(false);
        }
    }

    public RecommendCommonUserViewMus(final Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.bqj, this, true);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…mon_user_mus, this, true)");
        this.f102556g = inflate;
        setBackgroundResource(R.color.a0_);
        View findViewById = this.f102556g.findViewById(R.id.caf);
        C52711k.m112236a((Object) findViewById, "mRoot.findViewById(R.id.recycler_view)");
        this.f102554a = (RecyclerView) findViewById;
        View findViewById2 = this.f102556g.findViewById(R.id.f48);
        C52711k.m112236a((Object) findViewById2, "mRoot.findViewById(R.id.tv_see_all)");
        this.f102558i = (DmtTextView) findViewById2;
        this.f102561l = new C40444k();
        this.f102554a.setAdapter(getAdapter());
        View findViewById3 = this.f102556g.findViewById(R.id.drn);
        C52711k.m112236a((Object) findViewById3, "mRoot.findViewById(R.id.view_recommend_empty)");
        this.f102560k = findViewById3;
        View findViewById4 = this.f102556g.findViewById(R.id.def);
        C52711k.m112236a((Object) findViewById4, "mRoot.findViewById(R.id.tv_recommend)");
        this.f102557h = (TextView) findViewById4;
        View findViewById5 = this.f102556g.findViewById(R.id.ebs);
        C52711k.m112236a((Object) findViewById5, "mRoot.findViewById(R.id.im_suggest_icon)");
        this.f102559j = (ImageView) findViewById5;
        C1327f itemAnimator = this.f102554a.getItemAnimator();
        if (itemAnimator != null) {
            ((C1440au) itemAnimator).f5184m = false;
            C40444k kVar = this.f102561l;
            C40341c r0 = new C40341c(this) {

                /* renamed from: a */
                final /* synthetic */ RecommendCommonUserViewMus f102565a;

                /* renamed from: a */
                public final void mo82373a(int i) {
                    this.f102565a.f102554a.mo4795a((int) C9432q.m18687b(context, 130.0f), 0);
                }

                {
                    this.f102565a = r1;
                }
            };
            C52711k.m112240b(r0, "onItemFollowListener");
            kVar.f103253c = r0;
            this.f102554a.setPadding((int) C9432q.m18687b(this.f102554a.getContext(), 16.0f), 0, 0, 0);
            this.f102554a.setClipToPadding(false);
            this.f102554a.mo4798a((C1331h) new C32528d(0, (int) C9432q.m18687b(context, 4.0f), 0));
            this.f102554a.setLayoutManager(new WrapLinearLayoutManager(context, 0, false));
            if (AccountSuggestionExperiment.m75371b()) {
                this.f102558i.setVisibility(0);
                if (C20854a.m53167g().isLogin()) {
                    this.f102559j.setVisibility(0);
                } else {
                    this.f102559j.setVisibility(8);
                }
            } else {
                this.f102558i.setVisibility(8);
                this.f102559j.setVisibility(8);
            }
            this.f102558i.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ RecommendCommonUserViewMus f102567a;

                {
                    this.f102567a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C40190b bVar = this.f102567a.f102555b;
                    if (bVar != null) {
                        bVar.mo82188J();
                    }
                    C26890h.m65011a("click_see_all", C23089d.m56640a().mo47829a("enter_from", "others_homepage").f61491a);
                }
            });
            this.f102559j.setOnClickListener(new OnClickListener() {

                /* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus$3$a */
                public static final class C40188a extends ClickableSpan {

                    /* renamed from: a */
                    final /* synthetic */ Dialog f102569a;

                    /* renamed from: b */
                    final /* synthetic */ C401873 f102570b;

                    public final void updateDrawState(TextPaint textPaint) {
                        C52711k.m112240b(textPaint, "ds");
                        textPaint.setColor(context.getResources().getColor(R.color.avn));
                        textPaint.setUnderlineText(false);
                    }

                    public final void onClick(View view) {
                        C52711k.m112240b(view, "view");
                        if (this.f102569a != null && this.f102569a.isShowing()) {
                            this.f102569a.dismiss();
                        }
                        SmartRouter.buildRoute(context, "//privacy/setting").open();
                    }

                    C40188a(Dialog dialog, C401873 r2) {
                        this.f102569a = dialog;
                        this.f102570b = r2;
                    }
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (context != null) {
                        View inflate = LayoutInflater.from(context).inflate(R.layout.bq4, null);
                        View findViewById = inflate.findViewById(R.id.d__);
                        C52711k.m112236a((Object) findViewById, "dialogView.findViewById(R.id.tv_feedback)");
                        DmtTextView dmtTextView = (DmtTextView) findViewById;
                        dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
                        dmtTextView.setHighlightColor(context.getResources().getColor(R.color.a8w));
                        Context context = context;
                        if (context == null) {
                            C52711k.m112234a();
                        }
                        if (context != null) {
                            Activity activity = (Activity) context;
                            C52711k.m112236a((Object) inflate, "dialogView");
                            Dialog a = C37612g.m84061a(activity, inflate, 80, R.style.a4n);
                            String string = context.getResources().getString(R.string.hl3);
                            String string2 = context.getResources().getString(R.string.hl2, new Object[]{string});
                            C52711k.m112236a((Object) string2, "hintContent");
                            CharSequence charSequence = string2;
                            C52711k.m112236a((Object) string, "suggestLink");
                            int a2 = C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null);
                            int length = string.length() + a2;
                            SpannableString spannableString = new SpannableString(charSequence);
                            if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(string) && a2 >= 0) {
                                spannableString.setSpan(new C40188a(a, this), a2, length, 34);
                                spannableString.setSpan(new StyleSpan(1), a2, length, 34);
                            }
                            dmtTextView.setText(spannableString);
                            a.show();
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                        }
                    }
                    C26890h.m65011a("click_suggested_account_information", C23089d.m56640a().mo47829a("enter_from", "others_homepage").f61491a);
                }
            });
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    public /* synthetic */ RecommendCommonUserViewMus(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
