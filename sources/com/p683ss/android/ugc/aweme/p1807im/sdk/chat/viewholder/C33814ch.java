package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareUserContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ch */
public class C33814ch extends C33805c<ShareUserContent> {

    /* renamed from: A */
    private TextView f87743A;

    /* renamed from: u */
    private RemoteImageView f87744u;

    /* renamed from: v */
    private DmtTextView f87745v;

    /* renamed from: w */
    private DmtTextView f87746w;

    /* renamed from: x */
    private RemoteImageView f87747x;

    /* renamed from: y */
    private RemoteImageView f87748y;

    /* renamed from: z */
    private RemoteImageView f87749z;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo71786a(C11207p pVar, int i) {
        if (pVar != null) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87708j = this.itemView.findViewById(R.id.ze);
        this.f87744u = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87745v = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87746w = (DmtTextView) this.itemView.findViewById(R.id.a4k);
        this.f87747x = (RemoteImageView) this.itemView.findViewById(R.id.arp);
        this.f87748y = (RemoteImageView) this.itemView.findViewById(R.id.arq);
        this.f87749z = (RemoteImageView) this.itemView.findViewById(R.id.arr);
        this.f87743A = (TextView) this.itemView.findViewById(R.id.aih);
    }

    /* renamed from: a */
    public final void mo71840a(OnLongClickListener onLongClickListener) {
        this.f87708j.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
        this.f87743A.setOnClickListener(onClickListener);
    }

    public C33814ch(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareUserContent shareUserContent, int i) {
        int i2;
        super.mo71780a(pVar, pVar2, shareUserContent, i);
        this.f87745v.setText(shareUserContent.getName());
        this.f87746w.setVisibility(0);
        if (C35279p.m79763a()) {
            DmtTextView dmtTextView = this.f87746w;
            StringBuilder sb = new StringBuilder("@");
            sb.append(shareUserContent.getDesc());
            dmtTextView.setText(sb.toString());
        } else {
            DmtTextView dmtTextView2 = this.f87746w;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C11010c.m22280a().getString(R.string.bdn));
            sb2.append(shareUserContent.getDesc());
            dmtTextView2.setText(sb2.toString());
        }
        C23515d.m57669a(this.f87744u, shareUserContent.getAvatar());
        C23515d.m57669a(this.f87747x, (UrlModel) shareUserContent.getAwemeCoverList().get(0));
        C23515d.m57669a(this.f87748y, (UrlModel) shareUserContent.getAwemeCoverList().get(1));
        C23515d.m57669a(this.f87749z, (UrlModel) shareUserContent.getAwemeCoverList().get(2));
        IMUser a = C34010e.m77748a().mo71955a(shareUserContent.getUid(), shareUserContent.getSecUid(), true, (C34015a) null);
        if (a == null) {
            i2 = 0;
        } else {
            i2 = a.getFollowStatus();
        }
        if (i2 == 0) {
            this.f87743A.setVisibility(0);
        } else {
            this.f87743A.setVisibility(8);
        }
        this.f87708j.setTag(50331648, Integer.valueOf(21));
        this.f87708j.setTag(67108864, this.f87712n);
        this.f87743A.setTag(50331648, Integer.valueOf(5));
        this.f87743A.setTag(67108864, pVar);
    }
}
