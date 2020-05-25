package com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1831a;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33368b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34150g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.e */
public final class C34142e extends C33298c<C33368b> {

    /* renamed from: b */
    private ImageView f88238b;

    /* renamed from: c */
    private C35225a f88239c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.e$a */
    static final class C34143a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33368b f88240a;

        C34143a(C33368b bVar) {
            this.f88240a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34141d.m77965a(5, ((C34150g) this.f88240a).f88259a, 221);
        }
    }

    /* renamed from: b */
    public final void mo70628b() {
        super.mo70628b();
        View findViewById = this.itemView.findViewById(R.id.b2f);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_member_action)");
        this.f88238b = (ImageView) findViewById;
        ImageView imageView = this.f88238b;
        if (imageView == null) {
            C52711k.m112237a("mRemoveMemberView");
        }
        imageView.setImageResource(R.drawable.d9r);
    }

    /* renamed from: c */
    public final void mo70629c() {
        C35225a l = C35225a.m79617l();
        C52711k.m112236a((Object) l, "TouchAnimationUtils.AlphaAnimTouchHandle.obtain()");
        this.f88239c = l;
        C35225a aVar = this.f88239c;
        if (aVar == null) {
            C52711k.m112237a("mAlphaAnimTouchHandle");
        }
        View[] viewArr = new View[1];
        ImageView imageView = this.f88238b;
        if (imageView == null) {
            C52711k.m112237a("mRemoveMemberView");
        }
        viewArr[0] = imageView;
        aVar.mo73331a(viewArr);
    }

    public C34142e(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup, (int) R.layout.bd8);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo70627a(Object obj, int i) {
        boolean z;
        C33368b bVar = (C33368b) obj;
        super.mo70627a(bVar, i);
        if (bVar instanceof C34150g) {
            CharSequence charSequence = ((C34150g) bVar).f88259a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ImageView imageView = this.f88238b;
                if (imageView == null) {
                    C52711k.m112237a("mRemoveMemberView");
                }
                imageView.setOnClickListener(new C34143a(bVar));
            }
        }
    }
}
