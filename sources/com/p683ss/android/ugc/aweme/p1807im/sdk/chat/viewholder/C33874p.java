package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.CommandShareContent;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.p */
public class C33874p extends C33805c<CommandShareContent> {

    /* renamed from: u */
    TextView f87861u;

    /* renamed from: v */
    private RemoteImageView f87862v;

    /* renamed from: w */
    private TextView f87863w;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71782b() {
        super.mo71782b();
        this.f87713o.mo73331a(this.f87708j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87862v = (RemoteImageView) this.itemView.findViewById(R.id.by0);
        this.f87861u = (TextView) this.itemView.findViewById(R.id.d1l);
        this.f87863w = (TextView) this.itemView.findViewById(R.id.a4k);
        this.f87708j = this.itemView.findViewById(R.id.ze);
    }

    public C33874p(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, CommandShareContent commandShareContent, int i) {
        super.mo71780a(pVar, pVar2, commandShareContent, i);
        C23515d.m57669a(this.f87862v, commandShareContent.getCoverUrl());
        this.f87861u.setText(R.string.bfy);
        if (TextUtils.isEmpty(commandShareContent.getTitle())) {
            this.f87863w.setText(C11010c.m22280a().getString(R.string.bfp, new Object[]{commandShareContent.getAuthorName()}));
        } else {
            this.f87863w.setText(commandShareContent.getTitle());
        }
        this.f87708j.setTag(50331648, Integer.valueOf(12));
        this.f87708j.setTag(67108864, commandShareContent.getItemId());
    }
}
