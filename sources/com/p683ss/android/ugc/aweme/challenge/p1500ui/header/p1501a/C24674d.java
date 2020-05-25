package com.p683ss.android.ugc.aweme.challenge.p1500ui.header.p1501a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a.d */
public final class C24674d extends C1352v {

    /* renamed from: d */
    public static final C24676a f65319d = new C24676a(null);

    /* renamed from: a */
    final AnimatedImageView f65320a;

    /* renamed from: b */
    public Aweme f65321b;

    /* renamed from: c */
    public final C24677b f65322c;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a.d$a */
    public static final class C24676a {
        private C24676a() {
        }

        public /* synthetic */ C24676a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.a.d$b */
    public interface C24677b {
        /* renamed from: a */
        void mo50550a(Aweme aweme, int i);
    }

    public C24674d(View view, C24677b bVar) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(bVar, "listener");
        super(view);
        this.f65322c = bVar;
        View findViewById = view.findViewById(R.id.cp6);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.slide_aiv)");
        this.f65320a = (AnimatedImageView) findViewById;
        this.f65320a.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C24674d f65323a;

            {
                this.f65323a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f65323a.f65321b != null && !C32800a.m75679a(view)) {
                    C24677b bVar = this.f65323a.f65322c;
                    Aweme aweme = this.f65323a.f65321b;
                    if (aweme == null) {
                        C52711k.m112234a();
                    }
                    bVar.mo50550a(aweme, this.f65323a.getAdapterPosition() + 1);
                }
            }
        });
    }
}
