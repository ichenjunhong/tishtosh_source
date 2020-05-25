package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.h */
public final class C34341h extends C1164e {

    /* renamed from: a */
    public final C34342a f88664a;

    /* renamed from: b */
    private final View f88665b;

    /* renamed from: c */
    private final DmtTextView f88666c = ((DmtTextView) this.f88665b.findViewById(R.id.ze));

    /* renamed from: d */
    private final DmtButton f88667d = ((DmtButton) this.f88665b.findViewById(R.id.q7));

    /* renamed from: e */
    private final DmtButton f88668e = ((DmtButton) this.f88665b.findViewById(R.id.yn));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.h$a */
    public static final class C34342a {

        /* renamed from: a */
        public String f88669a;

        /* renamed from: b */
        public String f88670b;

        /* renamed from: c */
        public String f88671c;

        /* renamed from: d */
        public C52671b<? super View, C52860x> f88672d;

        /* renamed from: e */
        public C52671b<? super View, C52860x> f88673e;

        /* renamed from: f */
        public final Context f88674f;

        public C34342a(Context context) {
            C52711k.m112240b(context, "context");
            this.f88674f = context;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.h$b */
    static final class C34343b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34341h f88675a;

        C34343b(C34341h hVar) {
            this.f88675a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52671b<? super View, C52860x> bVar = this.f88675a.f88664a.f88672d;
            if (bVar != null) {
                C52711k.m112236a((Object) view, "it");
                bVar.invoke(view);
            }
            this.f88675a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.h$c */
    static final class C34344c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34341h f88676a;

        C34344c(C34341h hVar) {
            this.f88676a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52671b<? super View, C52860x> bVar = this.f88676a.f88664a.f88673e;
            if (bVar != null) {
                C52711k.m112236a((Object) view, "it");
                bVar.invoke(view);
            }
            this.f88676a.dismiss();
        }
    }

    public C34341h(C34342a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar.f88674f);
        this.f88664a = aVar;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.bfy, null);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…_group_tips_dialog, null)");
        this.f88665b = inflate;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(this.f88665b);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        String str = this.f88664a.f88669a;
        if (str != null) {
            DmtTextView dmtTextView = this.f88666c;
            C52711k.m112236a((Object) dmtTextView, "mContentTv");
            dmtTextView.setText(str);
        }
        String str2 = this.f88664a.f88670b;
        if (str2 != null) {
            DmtButton dmtButton = this.f88668e;
            C52711k.m112236a((Object) dmtButton, "mConfirmBtn");
            dmtButton.setText(str2);
        }
        String str3 = this.f88664a.f88671c;
        if (str3 != null) {
            DmtButton dmtButton2 = this.f88667d;
            C52711k.m112236a((Object) dmtButton2, "mCancelBtn");
            dmtButton2.setText(str3);
        }
        this.f88667d.setOnClickListener(new C34343b(this));
        this.f88668e.setOnClickListener(new C34344c(this));
    }
}
