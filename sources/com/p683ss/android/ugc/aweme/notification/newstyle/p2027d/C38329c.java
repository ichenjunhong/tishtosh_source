package com.p683ss.android.ugc.aweme.notification.newstyle.p2027d;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.emoji.p1689h.p1692b.C29408b;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.c */
public final class C38329c extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f97552a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38329c.class), "mAiHead", "getMAiHead()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C38329c.class), "mTitle", "getMTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: b */
    public final View f97553b;

    /* renamed from: c */
    private final C52668f f97554c = C52732g.m112285a(new C38331a(this));

    /* renamed from: d */
    private final C52668f f97555d = C52732g.m112285a(new C38332b(this));

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.c$a */
    static final class C38331a extends C52712l implements C52670a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ C38329c f97557a;

        C38331a(C38329c cVar) {
            this.f97557a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RemoteImageView) this.f97557a.f97553b.findViewById(R.id.azj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.d.c$b */
    static final class C38332b extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C38329c f97558a;

        C38332b(C38329c cVar) {
            this.f97558a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f97558a.f97553b.findViewById(R.id.dhb);
        }
    }

    /* renamed from: a */
    private final RemoteImageView m85624a() {
        return (RemoteImageView) this.f97554c.getValue();
    }

    /* renamed from: b */
    private final DmtTextView m85625b() {
        return (DmtTextView) this.f97555d.getValue();
    }

    public C38329c(View view, UrlModel urlModel, String str, final C52670a<C52860x> aVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(aVar, "listner");
        super(view);
        this.f97553b = view;
        if (urlModel != null) {
            C23515d.m57669a(m85624a(), urlModel);
        }
        m85624a().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                aVar.invoke();
            }
        });
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            DmtTextView b = m85625b();
            C52711k.m112236a((Object) b, "mTitle");
            b.setVisibility(0);
            DmtTextView b2 = m85625b();
            C52711k.m112236a((Object) b2, "mTitle");
            b2.setText(charSequence);
            C29408b.m69342a((TextView) m85625b());
        }
    }
}
