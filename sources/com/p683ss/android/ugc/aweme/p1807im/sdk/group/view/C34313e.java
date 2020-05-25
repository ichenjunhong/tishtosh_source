package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.view.Window;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.e */
public final class C34313e extends C1164e implements C34311c {

    /* renamed from: d */
    public static final C34314a f88605d = new C34314a(null);

    /* renamed from: a */
    public C34315f f88606a;

    /* renamed from: b */
    public final String f88607b;

    /* renamed from: c */
    public final int f88608c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.e$a */
    public static final class C34314a {
        private C34314a() {
        }

        public /* synthetic */ C34314a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: g */
    public final void mo71787g() {
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView((int) R.layout.bfw);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        C34311c cVar = this;
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.cfg);
        C52711k.m112236a((Object) frameLayout, "root_layout");
        C34315f fVar = new C34315f(cVar, context, frameLayout, this.f88607b, this.f88608c, null, 32, null);
        fVar.mo72335a();
        this.f88606a = fVar;
    }

    public C34313e(Context context, String str, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "conversationId");
        super(context);
        this.f88607b = str;
        this.f88608c = i;
    }
}
