package com.p683ss.android.ugc.aweme.recommend;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.following.p1768a.C32003j;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37612g;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder */
public final class RecommendSuggestTitleViewHolder extends JediSimpleViewHolder<C32003j> {

    /* renamed from: f */
    public final ImageView f104417f;

    /* renamed from: g */
    private final DmtTextView f104418g;

    /* renamed from: j */
    private final Context f104419j;

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder$a */
    static final class C41076a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendSuggestTitleViewHolder f104420a;

        /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder$a$a */
        public static final class C41077a extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ Dialog f104421a;

            /* renamed from: b */
            final /* synthetic */ C41076a f104422b;

            public final void onClick(View view) {
                C52711k.m112240b(view, "view");
                if (this.f104421a != null && this.f104421a.isShowing()) {
                    this.f104421a.dismiss();
                }
                SmartRouter.buildRoute(this.f104422b.f104420a.f104417f.getContext(), "//privacy/setting").open();
            }

            public final void updateDrawState(TextPaint textPaint) {
                C52711k.m112240b(textPaint, "ds");
                Context context = this.f104422b.f104420a.f104417f.getContext();
                C52711k.m112236a((Object) context, "mIcon.context");
                textPaint.setColor(context.getResources().getColor(R.color.avn));
                textPaint.setUnderlineText(false);
            }

            C41077a(Dialog dialog, C41076a aVar) {
                this.f104421a = dialog;
                this.f104422b = aVar;
            }
        }

        C41076a(RecommendSuggestTitleViewHolder recommendSuggestTitleViewHolder) {
            this.f104420a = recommendSuggestTitleViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f104420a.f104417f.getContext() != null) {
                View inflate = LayoutInflater.from(this.f104420a.f104417f.getContext()).inflate(R.layout.bq4, null);
                View findViewById = inflate.findViewById(R.id.d__);
                C52711k.m112236a((Object) findViewById, "dialogView.findViewById(R.id.tv_feedback)");
                DmtTextView dmtTextView = (DmtTextView) findViewById;
                dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
                Context context = this.f104420a.f104417f.getContext();
                C52711k.m112236a((Object) context, "mIcon.context");
                dmtTextView.setHighlightColor(context.getResources().getColor(R.color.a8w));
                Context context2 = this.f104420a.f104417f.getContext();
                if (context2 == null) {
                    C52711k.m112234a();
                }
                if (context2 != null) {
                    Activity activity = (Activity) context2;
                    C52711k.m112236a((Object) inflate, "dialogView");
                    Dialog a = C37612g.m84061a(activity, inflate, 80, R.style.a4n);
                    Context context3 = this.f104420a.f104417f.getContext();
                    C52711k.m112236a((Object) context3, "mIcon.context");
                    String string = context3.getResources().getString(R.string.hl3);
                    Context context4 = this.f104420a.f104417f.getContext();
                    C52711k.m112236a((Object) context4, "mIcon.context");
                    String string2 = context4.getResources().getString(R.string.hl2, new Object[]{string});
                    C52711k.m112236a((Object) string2, "hintContent");
                    CharSequence charSequence = string2;
                    C52711k.m112236a((Object) string, "suggestLink");
                    int a2 = C52830p.m112419a(charSequence, string, 0, false, 6, (Object) null);
                    int length = string.length() + a2;
                    SpannableString spannableString = new SpannableString(charSequence);
                    if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(string) && a2 >= 0) {
                        spannableString.setSpan(new C41077a(a, this), a2, length, 34);
                        spannableString.setSpan(new StyleSpan(1), a2, length, 34);
                    }
                    dmtTextView.setText(spannableString);
                    a.show();
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.app.Activity");
                }
            }
            C26890h.m65011a("click_suggested_account_information", C23089d.m56640a().mo47829a("previous_page", "personal_homepage").mo47829a("enter_from", "following_list").f61491a);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        C32003j jVar = (C32003j) obj;
        C52711k.m112240b(jVar, "item");
        this.f104418g.setText(jVar.f83562b);
        this.f104417f.setOnClickListener(new C41076a(this));
    }

    public RecommendSuggestTitleViewHolder(View view, Context context) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(context, "context");
        super(view);
        this.f104419j = context;
        View findViewById = view.findViewById(R.id.f52);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.tv_title_name)");
        this.f104418g = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ebs);
        C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.im_suggest_icon)");
        this.f104417f = (ImageView) findViewById2;
    }
}
