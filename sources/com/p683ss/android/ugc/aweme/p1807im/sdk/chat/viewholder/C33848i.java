package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ChatCallContent;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.i */
public class C33848i extends C33805c<ChatCallContent> {

    /* renamed from: u */
    private TextView f87810u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        Object a = mo71845a((int) R.id.bnh);
        C52711k.m112236a(a, "bindView(R.id.msg_tv)");
        this.f87810u = (TextView) a;
        this.f87708j = (View) mo71845a((int) R.id.ze);
        View view = this.f87708j;
        C52711k.m112236a((Object) view, "contentV");
        Drawable background = view.getBackground();
        if (background != null && VERSION.SDK_INT >= 19) {
            background.setAutoMirrored(true);
        }
        this.f87713o.mo73331a(this.f87708j);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71786a(C11207p pVar, int i) {
        if (pVar != null) {
            pVar.isSelf();
        }
    }

    public C33848i(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ChatCallContent chatCallContent, int i) {
        super.mo71780a(pVar, pVar2, chatCallContent, i);
        if (!(pVar == null || chatCallContent == null)) {
            TextView textView = this.f87810u;
            if (textView == null) {
                C52711k.m112237a("textView");
            }
            textView.setText(chatCallContent.getContent());
        }
        this.f87708j.setTag(50331648, Integer.valueOf(42));
        this.f87708j.setTag(67108864, this.f87712n);
    }
}
