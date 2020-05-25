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
import com.p683ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder;
import com.p683ss.android.ugc.aweme.playlist.viewholder.BiColPlayListVideoViewHolder.C38932b;
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

/* renamed from: com.ss.android.ugc.aweme.challenge.viewholder.BiColAwemeListVideoViewholder */
public final class BiColAwemeListVideoViewholder<T> extends BiColPlayListVideoViewHolder<T> implements C38932b {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f65580f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(BiColAwemeListVideoViewholder.class), "mIvTag", "getMIvTag()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: l */
    public static final C24773a f65581l = new C24773a(null);

    /* renamed from: g */
    public C24579d f65582g;

    /* renamed from: j */
    public String f65583j;

    /* renamed from: k */
    public String f65584k;

    /* renamed from: v */
    private final C52668f f65585v = C52732g.m112285a(new C24774b(this));

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewholder.BiColAwemeListVideoViewholder$a */
    public static final class C24773a {
        private C24773a() {
        }

        public /* synthetic */ C24773a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewholder.BiColAwemeListVideoViewholder$b */
    static final class C24774b extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ BiColAwemeListVideoViewholder f65586a;

        C24774b(BiColAwemeListVideoViewholder biColAwemeListVideoViewholder) {
            this.f65586a = biColAwemeListVideoViewholder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f65586a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            return (DmtTextView) view.findViewById(R.id.b4u);
        }
    }

    /* renamed from: C */
    private final DmtTextView m60305C() {
        return (DmtTextView) this.f65585v.getValue();
    }

    /* renamed from: a */
    public final void mo50641a(int i) {
    }

    /* renamed from: a */
    public final void mo50642a(long j, int i) {
    }

    /* renamed from: b */
    public final void mo50644b(int i) {
    }

    /* renamed from: c */
    public final void mo50645c(int i) {
    }

    /* renamed from: m */
    public final void mo22677m() {
        super.mo22677m();
        this.f65582g = null;
    }

    /* renamed from: a */
    public final void mo50643a(DmtTextView dmtTextView) {
        String str;
        C52711k.m112240b(dmtTextView, "textView");
        Aweme aweme = this.f99193n;
        if (aweme != null) {
            str = aweme.getDesc();
        } else {
            str = null;
        }
        dmtTextView.setText(str);
    }

    public final void onClick(View view) {
        super.onClick(view);
        C24579d dVar = this.f65582g;
        if (dVar != null) {
            Object o = mo22689o();
            if (o != null) {
                dVar.mo50347a(view, (Aweme) o, "Video");
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        }
    }

    /* renamed from: a */
    public final void mo22662a(T t) {
        if (t != null) {
            Aweme aweme = (Aweme) t;
            mo78995a(aweme);
            super.mo22662a(t);
            Calendar instance = Calendar.getInstance();
            C52711k.m112236a((Object) instance, "Calendar.getInstance()");
            long timeInMillis = instance.getTimeInMillis() - (aweme.getCreateTime() * 1000);
            if (!HashtagBiColAwemeListExperiment.m60029b() || timeInMillis > 604800000) {
                DmtTextView w = mo78996w();
                C52711k.m112236a((Object) w, "mTvTime");
                w.setVisibility(8);
            } else {
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                String d = C47903fw.m103627d(view.getContext(), aweme.getCreateTime() * 1000);
                if (!TextUtils.isEmpty(d)) {
                    DmtTextView w2 = mo78996w();
                    if (w2 != null) {
                        w2.setText(String.valueOf(d));
                    }
                    DmtTextView w3 = mo78996w();
                    C52711k.m112236a((Object) w3, "mTvTime");
                    w3.setVisibility(0);
                } else {
                    DmtTextView w4 = mo78996w();
                    C52711k.m112236a((Object) w4, "mTvTime");
                    w4.setVisibility(8);
                }
            }
            if (HashtagBiColAwemeListExperiment.m60030c()) {
                DmtTextView v = mo78991v();
                C52711k.m112236a((Object) v, "mTvTitle");
                v.setVisibility(0);
            } else {
                DmtTextView v2 = mo78991v();
                C52711k.m112236a((Object) v2, "mTvTitle");
                v2.setVisibility(8);
            }
            DmtTextView C = m60305C();
            C52711k.m112236a((Object) C, "mIvTag");
            C.setVisibility(8);
            if (aweme.isPgcShow()) {
                if (aweme.getTextTopLabels() != null && aweme.getTextTopLabels().size() > 0) {
                    DmtTextView C2 = m60305C();
                    C52711k.m112236a((Object) C2, "mIvTag");
                    C2.setVisibility(0);
                    DmtTextView C3 = m60305C();
                    C52711k.m112236a((Object) C3, "mIvTag");
                    TextView textView = C3;
                    Object obj = aweme.getTextTopLabels().get(0);
                    C52711k.m112236a(obj, "aweme.getTextTopLabels().get(0)");
                    m60306a(textView, (AwemeTextLabelModel) obj);
                }
            } else if (aweme.getOriginAuthor() == null && aweme.getMusicStarter() == null && aweme.getOriginAuthor() == null && aweme.getIsTop() == 1) {
                if (aweme.getTextTopLabels() == null || aweme.getTextTopLabels().size() <= 0) {
                    DmtTextView C4 = m60305C();
                    C52711k.m112236a((Object) C4, "mIvTag");
                    C4.setVisibility(8);
                } else {
                    DmtTextView C5 = m60305C();
                    C52711k.m112236a((Object) C5, "mIvTag");
                    C5.setVisibility(0);
                    DmtTextView C6 = m60305C();
                    C52711k.m112236a((Object) C6, "mIvTag");
                    TextView textView2 = C6;
                    Object obj2 = aweme.getTextTopLabels().get(0);
                    C52711k.m112236a(obj2, "aweme.getTextTopLabels().get(0)");
                    m60306a(textView2, (AwemeTextLabelModel) obj2);
                }
            }
            this.f99199t = this;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    /* renamed from: a */
    private final void m60306a(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
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

    public BiColAwemeListVideoViewholder(View view, int i, C24579d dVar, String str, String str2) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(str, "cid");
        C52711k.m112240b(str2, "processId");
        super(view, i);
        this.f65582g = dVar;
        this.f65583j = str;
        this.f65584k = str2;
    }
}
