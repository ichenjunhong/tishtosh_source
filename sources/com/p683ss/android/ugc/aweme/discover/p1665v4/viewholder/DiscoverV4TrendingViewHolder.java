package com.p683ss.android.ugc.aweme.discover.p1665v4.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2643g.C52733a;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4TrendingViewHolder */
public final class DiscoverV4TrendingViewHolder<T> extends DiscoverV4PlayListVideoViewHolder<T> {

    /* renamed from: j */
    public static final C28890a f75667j = new C28890a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4TrendingViewHolder$a */
    public static final class C28890a {
        private C28890a() {
        }

        public /* synthetic */ C28890a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: j */
    public final void mo22674j() {
        super.mo22674j();
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.f0v);
        if (viewStub != null) {
            viewStub.inflate();
        }
        View view2 = this.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.dhb);
        C52711k.m112236a((Object) dmtTextView, "itemView.tv_title");
        dmtTextView.setMaxLines(2);
    }

    /* renamed from: a */
    public final void mo22662a(T t) {
        User user;
        CharSequence charSequence;
        super.mo22662a(t);
        Aweme aweme = this.f99193n;
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        boolean z = true;
        ((DmtTextView) view.findViewById(R.id.dhb)).setTextSize(1, 17.0f);
        int i = 0;
        if (aweme == null || aweme.getCreateTime() <= 0) {
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            C23729p.m58257a((View) (DmtTextView) view2.findViewById(R.id.ddv), 8);
        } else {
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            String d = C47903fw.m103627d(view3.getContext(), aweme.getCreateTime() * 1000);
            if (!TextUtils.isEmpty(d)) {
                View view4 = this.itemView;
                C52711k.m112236a((Object) view4, "itemView");
                DmtTextView dmtTextView = (DmtTextView) view4.findViewById(R.id.ddv);
                if (dmtTextView != null) {
                    StringBuilder sb = new StringBuilder("· ");
                    sb.append(d);
                    dmtTextView.setText(sb.toString());
                }
                View view5 = this.itemView;
                C52711k.m112236a((Object) view5, "itemView");
                C23729p.m58257a((View) (DmtTextView) view5.findViewById(R.id.ddv), 0);
            } else {
                View view6 = this.itemView;
                C52711k.m112236a((Object) view6, "itemView");
                C23729p.m58257a((View) (DmtTextView) view6.findViewById(R.id.ddv), 8);
            }
        }
        View view7 = this.itemView;
        C52711k.m112236a((Object) view7, "itemView");
        LinearLayout linearLayout = (LinearLayout) view7.findViewById(R.id.bf7);
        View view8 = this.itemView;
        C52711k.m112236a((Object) view8, "itemView");
        LinearLayout linearLayout2 = (LinearLayout) view8.findViewById(R.id.bf7);
        C52711k.m112236a((Object) linearLayout2, "itemView.ll_desc");
        int paddingLeft = linearLayout2.getPaddingLeft();
        View view9 = this.itemView;
        C52711k.m112236a((Object) view9, "itemView");
        LinearLayout linearLayout3 = (LinearLayout) view9.findViewById(R.id.bf7);
        C52711k.m112236a((Object) linearLayout3, "itemView.ll_desc");
        int paddingTop = linearLayout3.getPaddingTop();
        View view10 = this.itemView;
        C52711k.m112236a((Object) view10, "itemView");
        LinearLayout linearLayout4 = (LinearLayout) view10.findViewById(R.id.bf7);
        C52711k.m112236a((Object) linearLayout4, "itemView.ll_desc");
        int paddingRight = linearLayout4.getPaddingRight();
        View view11 = this.itemView;
        C52711k.m112236a((Object) view11, "itemView");
        linearLayout.setPadding(paddingLeft, paddingTop, paddingRight, C52733a.m112277a(C9432q.m18687b(view11.getContext(), 12.0f)));
        View view12 = this.itemView;
        C52711k.m112236a((Object) view12, "itemView");
        DmtTextView dmtTextView2 = (DmtTextView) view12.findViewById(R.id.d6x);
        String str = null;
        if (dmtTextView2 != null) {
            if (aweme != null) {
                User author = aweme.getAuthor();
                if (author != null) {
                    charSequence = author.getNickname();
                    dmtTextView2.setText(charSequence);
                }
            }
            charSequence = null;
            dmtTextView2.setText(charSequence);
        }
        View view13 = this.itemView;
        C52711k.m112236a((Object) view13, "itemView");
        ImageView imageView = (ImageView) view13.findViewById(R.id.ec1);
        if (imageView != null) {
            if (aweme != null) {
                user = aweme.getAuthor();
            } else {
                user = null;
            }
            if (user == null || TextUtils.isEmpty(user.getCustomVerify())) {
                z = false;
            }
            if (!z) {
                if (aweme != null) {
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        str = author2.getEnterpriseVerifyReason();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    i = 8;
                }
            }
            imageView.setVisibility(i);
        }
    }
}
