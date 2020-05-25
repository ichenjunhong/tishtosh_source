package com.p683ss.android.ugc.aweme.discover.adapter.viewholder;

import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Params;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28523a;
import com.p683ss.android.ugc.aweme.discover.widget.C28976a;
import com.p683ss.android.ugc.aweme.p1323ae.p1324a.C22466a;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.f */
public final class C28011f extends C11949e<Object> {

    /* renamed from: c */
    public static final C28012a f73589c = new C28012a(null);

    /* renamed from: a */
    public C28523a f73590a;

    /* renamed from: b */
    public final ViewGroup f73591b;

    /* renamed from: d */
    private final RemoteImageView f73592d;

    /* renamed from: e */
    private final DmtTextView f73593e;

    /* renamed from: f */
    private final View f73594f;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.f$a */
    public static final class C28012a {
        private C28012a() {
        }

        public /* synthetic */ C28012a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.f$b */
    static final class C28013b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28011f f73595a;

        /* renamed from: b */
        final /* synthetic */ int f73596b;

        /* renamed from: c */
        final /* synthetic */ Word f73597c;

        C28013b(C28011f fVar, int i, Word word) {
            this.f73595a = fVar;
            this.f73596b = i;
            this.f73597c = word;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("trending_words_click", C23089d.m56640a().mo47826a("words_position", this.f73596b).mo47829a("words_source", "recom_search").mo47829a("words_content", this.f73597c.getWord()).mo47829a("group_id", this.f73597c.getId()).f61491a);
            C28523a aVar = this.f73595a.f73590a;
            if (aVar != null) {
                aVar.handleGuessWordItemClick(this.f73597c, this.f73595a.getAdapterPosition());
            }
        }
    }

    public C28011f(View view, ViewGroup viewGroup) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(viewGroup, "parent");
        super(view);
        this.f73591b = viewGroup;
        this.f73592d = (RemoteImageView) view.findViewById(R.id.b1m);
        this.f73593e = (DmtTextView) view.findViewById(R.id.dh5);
        this.f73594f = view.findViewById(R.id.by7);
    }

    /* renamed from: a */
    public final void mo22665a(Object obj, int i) {
        CharSequence charSequence;
        C52711k.m112240b(obj, "item");
        ViewGroup viewGroup = this.f73591b;
        if (viewGroup != null) {
            C1332i layoutManager = ((RecyclerView) viewGroup).getLayoutManager();
            if (layoutManager != null) {
                int a = ((GridLayoutManager) layoutManager).f4526g.mo4691a(getAdapterPosition(), 2);
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    if (a % 2 == 0) {
                        marginLayoutParams.leftMargin = 0;
                        marginLayoutParams.rightMargin = C23728o.m58241a(8.0d);
                    } else {
                        marginLayoutParams.leftMargin = C23728o.m58241a(8.0d);
                        marginLayoutParams.rightMargin = 0;
                    }
                    View view2 = this.itemView;
                    C52711k.m112236a((Object) view2, "itemView");
                    view2.setLayoutParams(marginLayoutParams);
                    if (obj instanceof Word) {
                        Word word = (Word) obj;
                        if (word.getWord() == null) {
                            View view3 = this.f73594f;
                            C52711k.m112236a((Object) view3, "placeHolderView");
                            view3.setVisibility(0);
                            RemoteImageView remoteImageView = this.f73592d;
                            C52711k.m112236a((Object) remoteImageView, "coverView");
                            remoteImageView.setVisibility(4);
                        } else {
                            View view4 = this.f73594f;
                            C52711k.m112236a((Object) view4, "placeHolderView");
                            view4.setVisibility(4);
                            RemoteImageView remoteImageView2 = this.f73592d;
                            C52711k.m112236a((Object) remoteImageView2, "coverView");
                            remoteImageView2.setVisibility(0);
                        }
                        if (word.getWord() != null) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(word.getWord());
                            if (word.getWordType() > 0 && word.getWordType() <= C22466a.f60522c.length) {
                                View view5 = this.itemView;
                                C52711k.m112236a((Object) view5, "itemView");
                                Drawable a2 = C0726c.m2091a(view5.getContext(), C22466a.f60522c[word.getWordType() - 1]);
                                if (a2 != null) {
                                    a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
                                    C28976a aVar = new C28976a(a2, 4, 0);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(" ");
                                    spannableStringBuilder2.setSpan(aVar, 0, 1, 17);
                                    spannableStringBuilder.append(spannableStringBuilder2);
                                }
                            }
                            DmtTextView dmtTextView = this.f73593e;
                            C52711k.m112236a((Object) dmtTextView, "textView");
                            dmtTextView.setText(spannableStringBuilder);
                            Params params = word.getParams();
                            String str = null;
                            if (params != null) {
                                charSequence = params.getWordImg();
                            } else {
                                charSequence = null;
                            }
                            if (!TextUtils.isEmpty(charSequence)) {
                                RemoteImageView remoteImageView3 = this.f73592d;
                                Params params2 = word.getParams();
                                if (params2 != null) {
                                    str = params2.getWordImg();
                                }
                                C23515d.m57677a(remoteImageView3, str);
                            }
                        }
                        this.itemView.setOnClickListener(new C28013b(this, i, word));
                        if (!word.isShowed()) {
                            word.setShowed(true);
                            C26890h.m65011a("trending_words_show", C23089d.m56640a().mo47826a("words_position", getPosition()).mo47829a("words_source", "recom_search").mo47829a("words_content", word.getWord()).mo47829a("group_id", word.getId()).f61491a);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
    }
}
