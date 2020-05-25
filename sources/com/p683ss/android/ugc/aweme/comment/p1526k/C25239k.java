package com.p683ss.android.ugc.aweme.comment.p1526k;

import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.k.k */
public final class C25239k {

    /* renamed from: a */
    public static final C25239k f66838a = new C25239k();

    /* renamed from: com.ss.android.ugc.aweme.comment.k.k$a */
    static final class C25240a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Aweme f66839a;

        /* renamed from: b */
        final /* synthetic */ String f66840b;

        /* renamed from: c */
        final /* synthetic */ View f66841c;

        /* renamed from: d */
        final /* synthetic */ String f66842d;

        C25240a(Aweme aweme, String str, View view, String str2) {
            this.f66839a = aweme;
            this.f66840b = str;
            this.f66841c = view;
            this.f66842d = str2;
        }

        public final void onClick(View view) {
            int i;
            ClickInstrumentation.onClick(view);
            if (this.f66839a != null && !TextUtils.isEmpty(this.f66839a.getAid())) {
                C52711k.m112236a((Object) view, "v");
                SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "aweme://donation/pannel").withParam("enter_method", "comment_click").withParam("enter_from", this.f66840b);
                String str = "height";
                View view2 = this.f66841c;
                if (view2 != null) {
                    i = view2.getHeight();
                } else {
                    i = 0;
                }
                withParam.withParam(str, i).withParam("log_pb", this.f66842d).withParam("aweme_id", this.f66839a.getAid()).open();
            }
        }
    }

    private C25239k() {
    }

    /* renamed from: a */
    private static List<UrlModel> m61361a(String str) {
        if (str == null) {
            return null;
        }
        try {
            C25238j jVar = (C25238j) C47760cd.m103383a().mo34884a(str, C25238j.class);
            if (jVar != null) {
                return jVar.getIconUrlList();
            }
            return null;
        } catch (C18091u e) {
            C32458a.m75148a((Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo51508a(String str, String str2, View view, Aweme aweme, View view2) {
        CharSequence charSequence;
        C52711k.m112240b(view, "v");
        SmartCircleImageView smartCircleImageView = (SmartCircleImageView) view.findViewById(R.id.dy9);
        SmartCircleImageView smartCircleImageView2 = (SmartCircleImageView) view.findViewById(R.id.dy_);
        TextView textView = (TextView) view.findViewById(R.id.a4e);
        List donationAnchor = C25282a.m61494a().getDonationAnchor(aweme);
        if (donationAnchor == null) {
            C52711k.m112234a();
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) donationAnchor.get(0);
        if (anchorCommonStruct == null) {
            C52711k.m112234a();
        }
        if (TextUtils.isEmpty(anchorCommonStruct.getExtra())) {
            smartCircleImageView.setImageResource(R.drawable.ciq);
            C52711k.m112236a((Object) smartCircleImageView2, "avatar2");
            smartCircleImageView2.setVisibility(8);
            C52711k.m112236a((Object) textView, "desc");
            LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                ((ConstraintLayout.LayoutParams) layoutParams).f861e = R.id.dy9;
                LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 != null) {
                    ((ConstraintLayout.LayoutParams) layoutParams2).f872p = R.id.dy9;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
        } else {
            List a = m61361a(anchorCommonStruct.getExtra());
            if (a != null && a.size() > 1) {
                C12203q.m24645a((Object) C23608p.m57874a((UrlModel) a.get(0))).mo23118a("CommentDonation").mo23110a((int) R.color.atv).mo23116a((C12197k) smartCircleImageView).mo23121a();
                C12203q.m24645a((Object) C23608p.m57874a((UrlModel) a.get(1))).mo23118a("CommentDonation").mo23110a((int) R.color.atv).mo23116a((C12197k) smartCircleImageView2).mo23121a();
            }
            C52711k.m112236a((Object) smartCircleImageView2, "avatar2");
            smartCircleImageView2.setVisibility(0);
            C52711k.m112236a((Object) textView, "desc");
            LayoutParams layoutParams3 = textView.getLayoutParams();
            if (layoutParams3 != null) {
                ((ConstraintLayout.LayoutParams) layoutParams3).f861e = R.id.dy_;
                LayoutParams layoutParams4 = textView.getLayoutParams();
                if (layoutParams4 != null) {
                    ((ConstraintLayout.LayoutParams) layoutParams4).f872p = R.id.dy_;
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
            }
        }
        textView.setLayoutParams(textView.getLayoutParams());
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword != null) {
            charSequence = keyword;
        } else {
            charSequence = "";
        }
        textView.setText(charSequence);
        view.setOnClickListener(new C25240a(aweme, str2, view2, str));
    }
}
