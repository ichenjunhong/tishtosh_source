package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33674j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.aa */
public final class C33731aa extends C33805c<SayHelloContent> {

    /* renamed from: u */
    private final DmtTextView f87505u;

    /* renamed from: v */
    private final AutoRTLImageView f87506v;

    /* renamed from: w */
    private final RecyclerView f87507w;

    /* renamed from: x */
    private final C33674j f87508x = new C33674j();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.aa$a */
    static final class C33732a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33731aa f87509a;

        C33732a(C33731aa aaVar) {
            this.f87509a = aaVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SayHelloContent sayHelloContent = (SayHelloContent) this.f87509a.f87709k;
            if (sayHelloContent != null) {
                C35190af.m79442a();
                String str = this.f87509a.f87707i;
                C11207p pVar = this.f87509a.f87712n;
                C52711k.m112236a((Object) pVar, "currentMessage");
                C35190af.m79471a(str, pVar.getConversationId(), sayHelloContent.getEmoji(), true);
            }
            C11213r.m22771c(this.f87509a.f87712n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.aa$b */
    static final class C33733b extends C52712l implements C52682m<View, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C33731aa f87510a;

        C33733b(C33731aa aaVar) {
            this.f87510a = aaVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            final int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(view, "view");
            new C33220b(view.getContext(), new C33242d(this) {

                /* renamed from: a */
                final /* synthetic */ C33733b f87511a;

                {
                    this.f87511a = r1;
                }

                public final void sendMsg() {
                    C11213r.m22771c(this.f87511a.f87510a.f87712n);
                    C11207p pVar = this.f87511a.f87510a.f87712n;
                    C52711k.m112236a((Object) pVar, "currentMessage");
                    SayHelloContent sayHelloContent = (SayHelloContent) C35277o.m79760a(pVar.getContent(), SayHelloContent.class);
                    if (sayHelloContent != null && intValue >= 0 && intValue < sayHelloContent.getEmoji().size()) {
                        C35190af.m79442a();
                        C11207p pVar2 = this.f87511a.f87510a.f87712n;
                        C52711k.m112236a((Object) pVar2, "currentMessage");
                        Object obj = sayHelloContent.getEmoji().get(intValue);
                        C52711k.m112236a(obj, "emoji[position]");
                        C35190af.m79492c(pVar2.getConversationId(), "", String.valueOf(((C29366a) obj).getId()));
                        C35237bj a = C35237bj.m79649a();
                        C11207p pVar3 = this.f87511a.f87510a.f87712n;
                        C52711k.m112236a((Object) pVar3, "currentMessage");
                        a.mo73345b(pVar3.getConversationId(), (BaseContent) EmojiContent.obtain((C29366a) sayHelloContent.getEmoji().get(intValue)));
                    }
                }
            }).sendMsg();
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87506v.setOnClickListener(new C33732a(this));
        this.f87508x.f87312a = new C33733b(this);
    }

    public C33731aa(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
        View findViewById = view.findViewById(R.id.ame);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.greet_tv)");
        this.f87505u = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.un);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.close_iv)");
        this.f87506v = (AutoRTLImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.amd);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.greet_icon_list)");
        this.f87507w = (RecyclerView) findViewById3;
        RecyclerView recyclerView = this.f87507w;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.setAdapter(this.f87508x);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        CharSequence charSequence;
        SayHelloContent sayHelloContent = (SayHelloContent) baseContent;
        C52711k.m112240b(pVar, "msg");
        super.mo71780a(pVar, pVar2, sayHelloContent, i);
        if (sayHelloContent != null) {
            C35190af.m79442a();
            boolean z = false;
            C35190af.m79471a(this.f87707i, pVar.getConversationId(), sayHelloContent.getEmoji(), false);
            DmtTextView dmtTextView = this.f87505u;
            CharSequence helloText = sayHelloContent.getHelloText();
            if (helloText == null || helloText.length() == 0) {
                z = true;
            }
            if (!z) {
                charSequence = sayHelloContent.getHelloText();
            } else {
                View view = this.itemView;
                C52711k.m112236a((Object) view, "itemView");
                charSequence = view.getContext().getString(R.string.bms);
            }
            dmtTextView.setText(charSequence);
            this.f87508x.mo70601a(sayHelloContent.getEmoji(), null);
        }
    }
}
