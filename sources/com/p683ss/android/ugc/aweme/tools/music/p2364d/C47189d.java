package com.p683ss.android.ugc.aweme.tools.music.p2364d;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24441j;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.d */
public final class C47189d extends C1352v {

    /* renamed from: b */
    public static final C47192a f119147b = new C47192a(null);

    /* renamed from: a */
    public final C24441j f119148a;

    /* renamed from: c */
    private AVDmtImageTextView f119149c;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.d$a */
    public static final class C47192a {
        private C47192a() {
        }

        public /* synthetic */ C47192a(C52707g gVar) {
            this();
        }
    }

    public C47189d(final View view, int i, C24441j jVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f119148a = jVar;
        this.f119149c = (AVDmtImageTextView) view.findViewById(R.id.axg);
        if (i == 0) {
            AVDmtImageTextView aVDmtImageTextView = this.f119149c;
            if (aVDmtImageTextView != null) {
                aVDmtImageTextView.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C47189d f119150a;

                    {
                        this.f119150a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        C24441j jVar = this.f119150a.f119148a;
                        if (jVar != null) {
                            jVar.mo50207a(view, this.f119150a.getAdapterPosition());
                        }
                    }
                });
            }
        } else {
            AVDmtImageTextView aVDmtImageTextView2 = this.f119149c;
            if (aVDmtImageTextView2 != null) {
                aVDmtImageTextView2.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C47189d f119152a;

                    {
                        this.f119152a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        C24441j jVar = this.f119152a.f119148a;
                        if (jVar != null) {
                            jVar.mo50207a(view, this.f119152a.getAdapterPosition());
                        }
                    }
                });
            }
        }
    }
}
