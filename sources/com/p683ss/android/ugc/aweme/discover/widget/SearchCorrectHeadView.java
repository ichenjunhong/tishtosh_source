package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28103k;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.SearchCorrectHeadView */
public final class SearchCorrectHeadView extends FrameLayout {

    /* renamed from: a */
    private SearchCorrectTextView f75848a;

    /* renamed from: b */
    private SearchCorrectTextView f75849b;

    /* renamed from: c */
    private SearchCorrectTextView f75850c;

    /* renamed from: d */
    private ViewGroup f75851d;

    /* renamed from: e */
    private ViewGroup f75852e;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.SearchCorrectHeadView$a */
    static final class C28974a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchCorrectHeadView f75853a;

        /* renamed from: b */
        final /* synthetic */ String f75854b;

        /* renamed from: c */
        final /* synthetic */ QueryCorrectInfo f75855c;

        /* renamed from: d */
        final /* synthetic */ String f75856d;

        C28974a(SearchCorrectHeadView searchCorrectHeadView, String str, QueryCorrectInfo queryCorrectInfo, String str2) {
            this.f75853a = searchCorrectHeadView;
            this.f75854b = str;
            this.f75855c = queryCorrectInfo;
            this.f75856d = str2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C47718bf.m103288a(new C28103k(this.f75854b, this.f75855c.getCorrectedLevel()));
            SearchCorrectHeadView.m68283a("click", this.f75855c.getCorrectedLevel(), this.f75855c.getCorrectedKeyword(), this.f75856d, this.f75855c.getRequestId());
        }
    }

    public SearchCorrectHeadView(Context context) {
        C52711k.m112240b(context, "context");
        this(context, null);
    }

    public SearchCorrectHeadView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo58547a(QueryCorrectInfo queryCorrectInfo, String str) {
        String str2;
        C52711k.m112240b(queryCorrectInfo, "info");
        C52711k.m112240b(str, "originalKeyWord");
        setVisibility(0);
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        Resources resources = context.getResources();
        if (queryCorrectInfo.getCorrectedLevel() == 2) {
            ViewGroup viewGroup = this.f75851d;
            if (viewGroup == null) {
                C52711k.m112237a("strongContainer");
            }
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = this.f75852e;
            if (viewGroup2 == null) {
                C52711k.m112237a("weakContainer");
            }
            viewGroup2.setVisibility(8);
            SearchCorrectTextView searchCorrectTextView = this.f75848a;
            if (searchCorrectTextView == null) {
                C52711k.m112237a("tvSearchResult");
            }
            StringBuilder sb = new StringBuilder(" ");
            sb.append(queryCorrectInfo.getCorrectedKeyword());
            searchCorrectTextView.mo58549a(R.string.aqo, sb.toString(), resources.getColor(R.color.pr));
            SearchCorrectTextView searchCorrectTextView2 = this.f75849b;
            if (searchCorrectTextView2 == null) {
                C52711k.m112237a("tvCorrectStrong");
            }
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(str);
            searchCorrectTextView2.mo58549a(R.string.aqn, sb2.toString(), resources.getColor(R.color.su));
            str2 = str;
        } else {
            ViewGroup viewGroup3 = this.f75851d;
            if (viewGroup3 == null) {
                C52711k.m112237a("strongContainer");
            }
            viewGroup3.setVisibility(8);
            ViewGroup viewGroup4 = this.f75852e;
            if (viewGroup4 == null) {
                C52711k.m112237a("weakContainer");
            }
            viewGroup4.setVisibility(0);
            SearchCorrectTextView searchCorrectTextView3 = this.f75850c;
            if (searchCorrectTextView3 == null) {
                C52711k.m112237a("tvCorrectWeak");
            }
            StringBuilder sb3 = new StringBuilder(": ");
            sb3.append(queryCorrectInfo.getCorrectedKeyword());
            searchCorrectTextView3.mo58549a(R.string.aqp, sb3.toString(), resources.getColor(R.color.su));
            str2 = queryCorrectInfo.getCorrectedKeyword();
            C52711k.m112236a((Object) str2, "info.correctedKeyword");
        }
        m68283a("show", queryCorrectInfo.getCorrectedLevel(), queryCorrectInfo.getCorrectedKeyword(), str, queryCorrectInfo.getRequestId());
        setOnClickListener(new C28974a(this, str2, queryCorrectInfo, str));
    }

    public SearchCorrectHeadView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        setLayoutParams(new LayoutParams(-1, -2));
        LayoutInflater.from(getContext()).inflate(R.layout.btm, this, true);
        View findViewById = findViewById(R.id.dfj);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.tv_search_result)");
        this.f75848a = (SearchCorrectTextView) findViewById;
        View findViewById2 = findViewById(R.id.d8r);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.tv_correct_strong)");
        this.f75849b = (SearchCorrectTextView) findViewById2;
        View findViewById3 = findViewById(R.id.d8s);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.tv_correct_weak)");
        this.f75850c = (SearchCorrectTextView) findViewById3;
        View findViewById4 = findViewById(R.id.cto);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.strong_container)");
        this.f75851d = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(R.id.du3);
        C52711k.m112236a((Object) findViewById5, "findViewById(R.id.weak_container)");
        this.f75852e = (ViewGroup) findViewById5;
    }

    /* renamed from: a */
    public static void m68283a(String str, int i, String str2, String str3, String str4) {
        String str5;
        if (i == 2) {
            str5 = "strong";
        } else {
            str5 = "weak";
        }
        C26890h.m65011a("search_correction", C23089d.m56640a().mo47829a("action_type", str).mo47829a("correction_type", str5).mo47829a("corrected_keyword", str2).mo47829a("original_keyword", str3).mo47829a("log_pb", C29981aa.m70153a().mo60161a(str4)).f61491a);
    }
}
