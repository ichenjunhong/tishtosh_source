package com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1831a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33298c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33368b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34144a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34258f.C34259a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.a */
public final class C34132a extends C33298c<C33368b> {

    /* renamed from: b */
    ImageView f88220b;

    /* renamed from: c */
    public final String f88221c;

    /* renamed from: d */
    private C35225a f88222d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.a$a */
    static final class C34133a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33368b f88223a;

        C34133a(C33368b bVar) {
            this.f88223a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34141d.m77965a(4, ((C34144a) this.f88223a).f88241a, 220);
            C35190af.m79442a();
            C35190af.m79484b(((C34144a) this.f88223a).f88241a, "group_add_click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.a.a$b */
    static final class C34134b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34132a f88224a;

        C34134b(C34132a aVar) {
            this.f88224a = aVar;
        }

        public final void run() {
            int measuredWidth;
            int measuredWidth2;
            C34132a aVar = this.f88224a;
            if (C35284t.m79782a().mo73450z() && C34259a.m78168a(aVar.f88221c)) {
                View view = aVar.itemView;
                C52711k.m112236a((Object) view, "itemView");
                Context context = view.getContext();
                if (context != null) {
                    C10660a a = new C10661a((Activity) context).mo19015b((int) R.string.a15).mo19017c(true).mo19010a(4000).mo19014a();
                    a.mo18996a();
                    int[] iArr = new int[2];
                    ImageView imageView = aVar.f88220b;
                    if (imageView == null) {
                        C52711k.m112237a("mAddMemberView");
                    }
                    imageView.getLocationOnScreen(iArr);
                    int e = a.mo19005e();
                    int i = iArr[1];
                    ImageView imageView2 = aVar.f88220b;
                    if (imageView2 == null) {
                        C52711k.m112237a("mAddMemberView");
                    }
                    int measuredHeight = i + imageView2.getMeasuredHeight();
                    int i2 = iArr[0];
                    ImageView imageView3 = aVar.f88220b;
                    if (imageView3 == null) {
                        C52711k.m112237a("mAddMemberView");
                    }
                    if (i2 + imageView3.getMeasuredWidth() <= e) {
                        measuredWidth = iArr[0];
                        ImageView imageView4 = aVar.f88220b;
                        if (imageView4 == null) {
                            C52711k.m112237a("mAddMemberView");
                        }
                        measuredWidth2 = (imageView4.getMeasuredWidth() / 2) + C23728o.m58241a(3.5d);
                    } else {
                        int i3 = iArr[0];
                        ImageView imageView5 = aVar.f88220b;
                        if (imageView5 == null) {
                            C52711k.m112237a("mAddMemberView");
                        }
                        measuredWidth = (i3 + imageView5.getMeasuredWidth()) - e;
                        ImageView imageView6 = aVar.f88220b;
                        if (imageView6 == null) {
                            C52711k.m112237a("mAddMemberView");
                        }
                        measuredWidth2 = (e - (imageView6.getMeasuredWidth() / 2)) + C23728o.m58241a(3.5d);
                    }
                    int i4 = measuredWidth;
                    ImageView imageView7 = aVar.f88220b;
                    if (imageView7 == null) {
                        C52711k.m112237a("mAddMemberView");
                    }
                    a.mo18998a(imageView7, 80, i4, measuredHeight, (float) measuredWidth2);
                    C35284t.m79782a().mo73375A();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* renamed from: b */
    public final void mo70628b() {
        super.mo70628b();
        View findViewById = this.itemView.findViewById(R.id.b2f);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_member_action)");
        this.f88220b = (ImageView) findViewById;
        ImageView imageView = this.f88220b;
        if (imageView == null) {
            C52711k.m112237a("mAddMemberView");
        }
        imageView.setImageResource(R.drawable.d96);
        ImageView imageView2 = this.f88220b;
        if (imageView2 == null) {
            C52711k.m112237a("mAddMemberView");
        }
        imageView2.postDelayed(new C34134b(this), 500);
    }

    /* renamed from: c */
    public final void mo70629c() {
        C35225a l = C35225a.m79617l();
        C52711k.m112236a((Object) l, "TouchAnimationUtils.AlphaAnimTouchHandle.obtain()");
        this.f88222d = l;
        C35225a aVar = this.f88222d;
        if (aVar == null) {
            C52711k.m112237a("mAlphaAnimTouchHandle");
        }
        View[] viewArr = new View[1];
        ImageView imageView = this.f88220b;
        if (imageView == null) {
            C52711k.m112237a("mAddMemberView");
        }
        viewArr[0] = imageView;
        aVar.mo73331a(viewArr);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo70627a(Object obj, int i) {
        boolean z;
        C33368b bVar = (C33368b) obj;
        super.mo70627a(bVar, i);
        if (bVar instanceof C34144a) {
            CharSequence charSequence = ((C34144a) bVar).f88241a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ImageView imageView = this.f88220b;
                if (imageView == null) {
                    C52711k.m112237a("mAddMemberView");
                }
                imageView.setOnClickListener(new C34133a(bVar));
            }
        }
    }

    public C34132a(ViewGroup viewGroup, int i, String str) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup, (int) R.layout.bd8);
        this.f88221c = str;
    }
}
