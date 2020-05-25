package com.p683ss.android.ugc.aweme.challenge.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.experiment.HashtagBiColAwemeListExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.playlist.viewholder.BiColPlayListCoverViewHolder;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewholder.BiColAwemeListCoverViewholder */
public final class BiColAwemeListCoverViewholder<T> extends BiColPlayListCoverViewHolder<T> {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f65575f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColAwemeListCoverViewholder.class), "mIvTag", "getMIvTag()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: j */
    public static final C24771a f65576j = new C24771a(null);

    /* renamed from: g */
    public C24579d f65577g;

    /* renamed from: p */
    private final C52668f f65578p = C52732g.m112285a(new C24772b(this));

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewholder.BiColAwemeListCoverViewholder$a */
    public static final class C24771a {
        private C24771a() {
        }

        public /* synthetic */ C24771a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewholder.BiColAwemeListCoverViewholder$b */
    static final class C24772b extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ BiColAwemeListCoverViewholder f65579a;

        C24772b(BiColAwemeListCoverViewholder biColAwemeListCoverViewholder) {
            this.f65579a = biColAwemeListCoverViewholder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f65579a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.b4u);
        }
    }

    /* renamed from: x */
    private final DmtTextView m60301x() {
        return (DmtTextView) this.f65578p.getValue();
    }

    /* renamed from: m */
    public final void mo22677m() {
        super.mo22677m();
        this.f65577g = null;
    }

    /* renamed from: a */
    public final void mo50639a(DmtTextView dmtTextView) {
        C52711k.m112240b(dmtTextView, "textView");
        Object o = mo22689o();
        if (o != null) {
            dmtTextView.setText(((Aweme) o).getDesc());
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    public final void onClick(View view) {
        super.onClick(view);
        C24579d dVar = this.f65577g;
        if (dVar != null) {
            Object o = mo22689o();
            if (o != null) {
                dVar.mo50347a(view, (Aweme) o, "Cover");
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        }
    }

    /* renamed from: a */
    public final void mo22662a(T t) {
        if (t != null) {
            Aweme aweme = (Aweme) t;
            this.f99171l = aweme;
            super.mo22662a(t);
            Calendar instance = Calendar.getInstance();
            C52711k.m112236a((Object) instance, "Calendar.getInstance()");
            long timeInMillis = instance.getTimeInMillis() - (aweme.getCreateTime() * 1000);
            if (!HashtagBiColAwemeListExperiment.m60029b() || timeInMillis > 604800000) {
                DmtTextView v = mo78991v();
                C52711k.m112236a((Object) v, "mTvTime");
                v.setVisibility(8);
            } else {
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                String d = C47903fw.m103627d(view.getContext(), aweme.getCreateTime() * 1000);
                if (!TextUtils.isEmpty(d)) {
                    DmtTextView v2 = mo78991v();
                    if (v2 != null) {
                        v2.setText(String.valueOf(d));
                    }
                    DmtTextView v3 = mo78991v();
                    C52711k.m112236a((Object) v3, "mTvTime");
                    v3.setVisibility(0);
                } else {
                    DmtTextView v4 = mo78991v();
                    C52711k.m112236a((Object) v4, "mTvTime");
                    v4.setVisibility(8);
                }
            }
            if (HashtagBiColAwemeListExperiment.m60030c()) {
                DmtTextView u = mo58382u();
                C52711k.m112236a((Object) u, "mTvTitle");
                u.setVisibility(0);
            } else {
                DmtTextView u2 = mo58382u();
                C52711k.m112236a((Object) u2, "mTvTitle");
                u2.setVisibility(8);
            }
            DmtTextView x = m60301x();
            C52711k.m112236a((Object) x, "mIvTag");
            x.setVisibility(8);
            if (aweme.isPgcShow()) {
                if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                    DmtTextView x2 = m60301x();
                    C52711k.m112236a((Object) x2, "mIvTag");
                    x2.setVisibility(0);
                    DmtTextView x3 = m60301x();
                    C52711k.m112236a((Object) x3, "mIvTag");
                    TextView textView = x3;
                    Object obj = aweme.getTextTopLabels().get(0);
                    C52711k.m112236a(obj, "aweme.getTextTopLabels().get(0)");
                    m60300a(textView, (AwemeTextLabelModel) obj);
                    return;
                }
            } else if (aweme.getOriginAuthor() == null && aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null && aweme.getIsTop() == 1) {
                if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                    DmtTextView x4 = m60301x();
                    C52711k.m112236a((Object) x4, "mIvTag");
                    x4.setVisibility(8);
                } else {
                    DmtTextView x5 = m60301x();
                    C52711k.m112236a((Object) x5, "mIvTag");
                    x5.setVisibility(0);
                    DmtTextView x6 = m60301x();
                    C52711k.m112236a((Object) x6, "mIvTag");
                    TextView textView2 = x6;
                    Object obj2 = aweme.getTextTopLabels().get(0);
                    C52711k.m112236a(obj2, "aweme.getTextTopLabels().get(0)");
                    m60300a(textView2, (AwemeTextLabelModel) obj2);
                    return;
                }
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    /* renamed from: a */
    private final void m60300a(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        textView.setTextColor(context.getResources().getColor(R.color.auk));
        View view2 = this.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        Context context2 = view2.getContext();
        C52711k.m112236a((Object) context2, "itemView.context");
        textView.setBackground(C23729p.m58249a(context2.getResources().getColor(R.color.av6), (float) C23728o.m58241a(2.0d)));
    }

    public BiColAwemeListCoverViewholder(View view, int i, C24579d dVar) {
        C52711k.m112240b(view, "view");
        super(view, i);
        this.f65577g = dVar;
    }
}
