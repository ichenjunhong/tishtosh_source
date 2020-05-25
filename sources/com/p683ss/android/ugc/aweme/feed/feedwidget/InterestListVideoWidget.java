package com.p683ss.android.ugc.aweme.feed.feedwidget;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.InterestSelectExperiment;
import com.p683ss.android.ugc.aweme.feed.interest.C30410b;
import com.p683ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout;
import com.p683ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout.C30414b;
import com.p683ss.android.ugc.aweme.feed.interest.view.InterestAwemeLayout.C30417c;
import com.p683ss.android.ugc.aweme.feed.interest.view.InterestTagLayout;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.journey.C35791v;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.InterestListVideoWidget */
public final class InterestListVideoWidget extends GenericWidget implements C0199s<C23274a> {

    /* renamed from: h */
    public static final C30235a f78985h = new C30235a(null);

    /* renamed from: a */
    public InterestAwemeLayout f78986a;

    /* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.InterestListVideoWidget$a */
    public static final class C30235a {
        private C30235a() {
        }

        public /* synthetic */ C30235a(C52707g gVar) {
            this();
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.f62238e.mo48226a("interest_params_data", sVar).mo48226a("interest_submit_animation", sVar).mo48226a("on_page_unselected", sVar).mo48226a("video_params", sVar);
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        super.mo48241a(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "view.context");
            InterestAwemeLayout interestAwemeLayout = new InterestAwemeLayout(context, null, 0, 6, null);
            interestAwemeLayout.setDataCenter(this.f62238e);
            this.f78986a = interestAwemeLayout;
            viewGroup.addView(this.f78986a);
            InterestAwemeLayout interestAwemeLayout2 = this.f78986a;
            if (interestAwemeLayout2 == null) {
                C52711k.m112234a();
            }
            LayoutParams layoutParams = interestAwemeLayout2.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (C22453b.m55513e() == 0) {
                    marginLayoutParams.bottomMargin = C23728o.m58241a(58.0d);
                }
                if (C22453b.m55511d() == 0) {
                    marginLayoutParams.topMargin = C11065a.m22390a(this.f62235b) - C23728o.m58241a(12.0d);
                }
                InterestAwemeLayout interestAwemeLayout3 = this.f78986a;
                if (interestAwemeLayout3 == null) {
                    C52711k.m112234a();
                }
                interestAwemeLayout3.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        if (aVar != null) {
            if (TextUtils.equals(aVar.f62242a, "interest_params_data")) {
                InterestAwemeLayout interestAwemeLayout = this.f78986a;
                if (interestAwemeLayout != null) {
                    Object a = aVar.mo48246a();
                    C52711k.m112236a(a, "kv.getData()");
                    C35791v vVar = (C35791v) a;
                    C52711k.m112240b(vVar, "selectedInterestList");
                    String e = InterestSelectExperiment.INSTANCE.mo59603e();
                    TextView textView = (TextView) interestAwemeLayout.mo60827a((int) R.id.ed9);
                    C52711k.m112236a((Object) textView, "interest_title");
                    textView.setText(e);
                    String f = InterestSelectExperiment.INSTANCE.mo59604f();
                    TextView textView2 = (TextView) interestAwemeLayout.mo60827a((int) R.id.ed7);
                    C52711k.m112236a((Object) textView2, "interest_sub_title");
                    textView2.setText(f);
                    Iterable<C52847n> iterable = interestAwemeLayout.f79499f;
                    Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (C52847n first : iterable) {
                        arrayList.add(Integer.valueOf(((Number) first.getFirst()).intValue()));
                    }
                    HashSet d = C52575l.m112135d((Iterable<? extends T>) (List) arrayList);
                    C30414b bVar = new C30414b(interestAwemeLayout, vVar, vVar.f91928a);
                    Set set = d;
                    bVar.f121729e.clear();
                    if (set != null) {
                        bVar.f121729e.addAll(set);
                    }
                    if (bVar.f121728d != null) {
                        bVar.f121728d.mo95849a();
                    }
                    interestAwemeLayout.f79499f.clear();
                    InterestTagLayout interestTagLayout = (InterestTagLayout) interestAwemeLayout.mo60827a((int) R.id.ed8);
                    C52711k.m112236a((Object) interestTagLayout, "interest_tag_layout");
                    interestTagLayout.setAdapter(bVar);
                    String a2 = InterestSelectExperiment.m69599a();
                    StringBuilder sb = new StringBuilder("last remember:");
                    sb.append(d);
                    C32458a.m75141a(4, a2, sb.toString());
                    ((LinearLayout) interestAwemeLayout.mo60827a((int) R.id.eao)).setOnClickListener(new C30417c(interestAwemeLayout));
                    LinearLayout linearLayout = interestAwemeLayout.f79497d;
                    C52711k.m112236a((Object) linearLayout, "initStateView");
                    linearLayout.setAlpha(1.0f);
                    interestAwemeLayout.f79498e.setAlpha(0.0f);
                }
            } else if (TextUtils.equals(aVar.f62242a, "interest_submit_animation")) {
                InterestAwemeLayout interestAwemeLayout2 = this.f78986a;
                if (interestAwemeLayout2 != null) {
                    Object a3 = aVar.mo48246a();
                    C52711k.m112236a(a3, "kv.getData()");
                    interestAwemeLayout2.mo60830b(((Boolean) a3).booleanValue());
                }
            } else if (TextUtils.equals(aVar.f62242a, "on_page_unselected")) {
                InterestAwemeLayout interestAwemeLayout3 = this.f78986a;
                if (interestAwemeLayout3 != null && C52711k.m112239a((Object) (Boolean) aVar.mo48246a(), (Object) Boolean.valueOf(true)) && !interestAwemeLayout3.f79500g) {
                    C30410b bVar2 = C30410b.f79484a;
                    C26890h.m65011a("skip_interest_lable", new C23089d().mo47829a("enter_from", "homepage_hot").mo47829a("user_id", C30410b.m71333a()).f61491a);
                }
            } else if (TextUtils.equals(aVar.f62242a, "video_params")) {
                InterestAwemeLayout interestAwemeLayout4 = this.f78986a;
                if (interestAwemeLayout4 != null) {
                    VideoItemParams videoItemParams = (VideoItemParams) aVar.mo48246a();
                    if (videoItemParams != null) {
                        Aweme aweme = videoItemParams.mAweme;
                        if (aweme != null) {
                            Video video = aweme.getVideo();
                            if (video != null) {
                                C12203q.m24645a((Object) C23608p.m57874a(video.getOriginCover())).mo23116a((C12197k) (SmartImageView) interestAwemeLayout4.f79498e.findViewById(R.id.ed4)).mo23110a((int) R.drawable.csk).mo23121a();
                            }
                        }
                    }
                }
            }
        }
    }
}
