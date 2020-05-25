package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EmojiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ah */
public abstract class C33742ah {

    /* renamed from: f */
    public static final C33743a f87521f = new C33743a(null);

    /* renamed from: a */
    public final View f87522a;

    /* renamed from: b */
    public final Context f87523b;

    /* renamed from: c */
    protected C11207p f87524c;

    /* renamed from: d */
    protected SayHelloContent f87525d;

    /* renamed from: e */
    public final C33763aq f87526e;

    /* renamed from: g */
    private View f87527g;

    /* renamed from: h */
    private DmtTextView f87528h;

    /* renamed from: i */
    private View f87529i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ah$a */
    public static final class C33743a {
        private C33743a() {
        }

        public /* synthetic */ C33743a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ah$b */
    static final class C33744b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33742ah f87530a;

        C33744b(C33742ah ahVar) {
            this.f87530a = ahVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87530a.mo71797f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ah$c */
    static final class C33745c implements C33242d {

        /* renamed from: a */
        final /* synthetic */ C33742ah f87531a;

        /* renamed from: b */
        final /* synthetic */ C29366a f87532b;

        C33745c(C33742ah ahVar, C29366a aVar) {
            this.f87531a = ahVar;
            this.f87532b = aVar;
        }

        public final void sendMsg() {
            C11213r.m22771c(this.f87531a.mo71788a());
            C35237bj.m79649a().mo73340a(this.f87531a.mo71794c(), (BaseContent) EmojiContent.obtain(this.f87532b));
            C35190af.m79442a();
            C35190af.m79492c(this.f87531a.mo71788a().getConversationId(), this.f87531a.mo71794c(), String.valueOf(this.f87532b.getId()));
        }
    }

    /* renamed from: a */
    public abstract void mo71791a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract List<C29366a> mo71795d();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C11207p mo71788a() {
        C11207p pVar = this.f87524c;
        if (pVar == null) {
            C52711k.m112237a("message");
        }
        return pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final SayHelloContent mo71793b() {
        SayHelloContent sayHelloContent = this.f87525d;
        if (sayHelloContent == null) {
            C52711k.m112237a(C42311c.f106865i);
        }
        return sayHelloContent;
    }

    /* renamed from: c */
    public final String mo71794c() {
        C11207p pVar = this.f87524c;
        if (pVar == null) {
            C52711k.m112237a("message");
        }
        String valueOf = String.valueOf(C11190e.m22685a(pVar.getConversationId()));
        C52711k.m112236a((Object) valueOf, "java.lang.String.valueOf…(message.conversationId))");
        return valueOf;
    }

    /* renamed from: f */
    public final void mo71797f() {
        C35190af.m79442a();
        String c = mo71794c();
        C11207p pVar = this.f87524c;
        if (pVar == null) {
            C52711k.m112237a("message");
        }
        C35190af.m79471a(c, pVar.getConversationId(), mo71795d(), true);
        C11207p pVar2 = this.f87524c;
        if (pVar2 == null) {
            C52711k.m112237a("message");
        }
        C11213r.m22771c(pVar2);
    }

    /* renamed from: e */
    public void mo71796e() {
        int i;
        this.f87528h = (DmtTextView) mo71792b(R.id.ch1);
        this.f87527g = mo71792b(R.id.un);
        this.f87529i = mo71792b(R.id.a6j);
        View view = this.f87529i;
        if (view == null) {
            C52711k.m112237a("dividerTop");
        }
        if (C35279p.m79763a()) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        View view2 = this.f87527g;
        if (view2 == null) {
            C52711k.m112237a("closeIv");
        }
        view2.setOnClickListener(new C33744b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final <T extends View> T mo71792b(int i) {
        T findViewById = this.f87522a.findViewById(i);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(id)");
        return findViewById;
    }

    public C33742ah(C33763aq aqVar) {
        C52711k.m112240b(aqVar, "parent");
        this.f87526e = aqVar;
        View view = this.f87526e.itemView;
        C52711k.m112236a((Object) view, "parent.itemView");
        this.f87522a = view;
        Context context = this.f87522a.getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        this.f87523b = context;
        mo71796e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71789a(int i) {
        if (i < mo71795d().size()) {
            new C33220b(this.f87523b, new C33745c(this, (C29366a) mo71795d().get(i))).sendMsg();
        }
    }

    /* renamed from: a */
    public void mo71790a(C11207p pVar, C11207p pVar2, SayHelloContent sayHelloContent, int i) {
        boolean z;
        CharSequence charSequence;
        C52711k.m112240b(pVar, "msg");
        C52711k.m112240b(sayHelloContent, C42311c.f106865i);
        this.f87524c = pVar;
        this.f87525d = sayHelloContent;
        if (pVar.getLocalExt().get("is_logger") == null) {
            pVar.addLocalExt("is_logger", "true");
            C35190af.m79442a();
            String c = mo71794c();
            C11207p pVar3 = this.f87524c;
            if (pVar3 == null) {
                C52711k.m112237a("message");
            }
            C35190af.m79471a(c, pVar3.getConversationId(), mo71795d(), false);
            C35197am.m79556a(pVar);
        }
        DmtTextView dmtTextView = this.f87528h;
        if (dmtTextView == null) {
            C52711k.m112237a("sayHelloTv");
        }
        CharSequence helloText = sayHelloContent.getHelloText();
        if (helloText == null || helloText.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            charSequence = sayHelloContent.getHelloText();
        } else {
            charSequence = this.f87523b.getString(R.string.bmt, new Object[]{sayHelloContent.getNickname()});
        }
        dmtTextView.setText(charSequence);
    }
}
