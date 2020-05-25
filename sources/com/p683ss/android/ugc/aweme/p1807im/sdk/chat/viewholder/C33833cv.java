package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C34002d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33711v;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SystemContent.Key;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.cv */
public final class C33833cv extends C33805c<SystemContent> {

    /* renamed from: u */
    private TextView f87785u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87785u = (TextView) mo71845a((int) R.id.bnh);
    }

    /* renamed from: d */
    public final void mo71849d() {
        String str;
        super.mo71849d();
        if (this.f87712n != null && this.f87709k != null) {
            SystemContent systemContent = (SystemContent) this.f87709k;
            C52711k.m112240b(systemContent, C42311c.f106865i);
            Key[] template = systemContent.getTemplate();
            if (template != null) {
                int length = template.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Key key = template[i];
                    C52711k.m112236a((Object) key, "it");
                    if (key.getAction() == 8 && key.getExtra().containsKey("order_no")) {
                        str = (String) key.getExtra().get("order_no");
                        break;
                    }
                    i++;
                }
            }
            str = null;
            if (C34002d.m77716a() != null && !TextUtils.isEmpty(str)) {
                this.f87712n.getConversationId();
                this.f87712n.isSelf();
            }
        }
    }

    public C33833cv(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo71780a(C11207p pVar, C11207p pVar2, BaseContent baseContent, int i) {
        SystemContent systemContent = (SystemContent) baseContent;
        super.mo71780a(pVar, pVar2, systemContent, i);
        C33711v.m77217a(pVar, systemContent, this.f87785u, this.f87707i);
    }
}
