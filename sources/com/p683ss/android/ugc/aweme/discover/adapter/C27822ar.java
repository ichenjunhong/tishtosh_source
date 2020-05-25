package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder.C27772a;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ar */
public final class C27822ar extends SearchChallengeViewHolder {

    /* renamed from: o */
    public static final C27823a f73095o = new C27823a(null);

    /* renamed from: j */
    public TextView f73096j;

    /* renamed from: k */
    public TextView f73097k;

    /* renamed from: l */
    public RemoteImageView f73098l;

    /* renamed from: m */
    public View f73099m;

    /* renamed from: n */
    public ImageView f73100n;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ar$a */
    public static final class C27823a {
        private C27823a() {
        }

        public /* synthetic */ C27823a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C27822ar m66565a(ViewGroup viewGroup, C27772a aVar, String str) {
            C52711k.m112240b(viewGroup, "parent");
            C52711k.m112240b(str, "refer");
            View a = C41457i.f105090b.mo84196a(viewGroup, R.layout.bsc);
            C27773b.m66473a(a, str);
            return new C27822ar(a, aVar, str);
        }
    }

    /* renamed from: b */
    public static final C27822ar m66563b(ViewGroup viewGroup, C27772a aVar, String str) {
        return C27823a.m66565a(viewGroup, null, str);
    }

    /* renamed from: a */
    public final void mo56207a(SearchChallenge searchChallenge, String str) {
        if (searchChallenge != null) {
            this.f72945f = str;
            if (searchChallenge.getChallenge() != null) {
                this.f72943d = searchChallenge.getChallenge();
            }
            TextView textView = this.f73096j;
            if (textView != null) {
                Challenge challenge = this.f72943d;
                C52711k.m112236a((Object) challenge, "mChallenge");
                textView.setText(challenge.getChallengeName());
            }
            TextView textView2 = this.f73097k;
            if (textView2 != null) {
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                Context context = view.getContext();
                Challenge challenge2 = this.f72943d;
                C52711k.m112236a((Object) challenge2, "mChallenge");
                Challenge challenge3 = this.f72943d;
                C52711k.m112236a((Object) challenge3, "mChallenge");
                textView2.setText(context.getString(R.string.z9, new Object[]{C33095b.m76068a(challenge2.getDisplayCount()), C33095b.m76068a((long) challenge3.getUserCount())}));
            }
            switch (this.f72943d.tag) {
                case 1:
                    ImageView imageView = this.f73100n;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    ImageView imageView2 = this.f73100n;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.dt_);
                        break;
                    }
                    break;
                case 2:
                    ImageView imageView3 = this.f73100n;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ImageView imageView4 = this.f73100n;
                    if (imageView4 != null) {
                        imageView4.setImageResource(R.drawable.dta);
                        break;
                    }
                    break;
                default:
                    ImageView imageView5 = this.f73100n;
                    if (imageView5 != null) {
                        imageView5.setVisibility(8);
                        break;
                    }
                    break;
            }
            Challenge challenge4 = this.f72943d;
            C52711k.m112236a((Object) challenge4, "mChallenge");
            String challengeProfileUrl = challenge4.getChallengeProfileUrl();
            if (!TextUtils.isEmpty(challengeProfileUrl)) {
                C23515d.m57677a(this.f73098l, challengeProfileUrl);
                View view2 = this.f73099m;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            } else {
                RemoteImageView remoteImageView = this.f73098l;
                if (remoteImageView != null) {
                    remoteImageView.setImageResource(R.drawable.dtd);
                }
                View view3 = this.f73099m;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            C27773b.m66472a(this.itemView, searchChallenge.getAdData());
            mo56206a(searchChallenge);
        }
    }

    public C27822ar(View view, C27772a aVar, String str) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(str, "adLogRefer");
        super(view, aVar, str);
        this.f73096j = (TextView) view.findViewById(R.id.d7l);
        this.f73097k = (TextView) view.findViewById(R.id.dd8);
        this.f73098l = (RemoteImageView) view.findViewById(R.id.hi);
        this.f73099m = view.findViewById(R.id.anj);
        this.f73100n = (ImageView) view.findViewById(R.id.aqa);
    }
}
