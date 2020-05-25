package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C34002d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.DouYinRedPacketContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1836g.C34173a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1836g.C34176c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.u */
public class C33880u extends C33805c<DouYinRedPacketContent> {

    /* renamed from: A */
    private String f87869A;

    /* renamed from: u */
    private View f87870u;

    /* renamed from: v */
    private RemoteImageView f87871v;

    /* renamed from: w */
    private DmtTextView f87872w;

    /* renamed from: x */
    private DmtTextView f87873x;

    /* renamed from: y */
    private DmtTextView f87874y;

    /* renamed from: z */
    private C34173a f87875z;

    /* renamed from: d */
    public final void mo71849d() {
        super.mo71849d();
        C47718bf.m103290c(this);
    }

    /* renamed from: e */
    public final void mo71850e() {
        super.mo71850e();
        C47718bf.m103291d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87870u = this.itemView.findViewById(R.id.k5);
        this.f87871v = (RemoteImageView) this.itemView.findViewById(R.id.aqo);
        this.f87872w = (DmtTextView) this.itemView.findViewById(R.id.d1l);
        this.f87873x = (DmtTextView) this.itemView.findViewById(R.id.erp);
        this.f87874y = (DmtTextView) this.itemView.findViewById(R.id.cxk);
        this.f87708j = (View) mo71845a((int) R.id.ze);
        this.f87875z = C34002d.m77716a();
        if (this.f87875z != null) {
            View view = (View) mo71845a((int) R.id.f86);
            ((View) mo71845a((int) R.id.f85)).setBackgroundResource(this.f87875z.mo72177c());
            view.setBackgroundResource(this.f87875z.mo72177c());
        }
    }

    @C53771m
    public void onRedPacketMsgUpdate(C34176c cVar) {
        if (this.f87712n != null && cVar.f88305a.equals(this.f87712n.getUuid())) {
            m77656b(this.f87712n);
        }
    }

    /* renamed from: b */
    private void m77656b(C11207p pVar) {
        Map localExt = pVar.getLocalExt();
        String str = "unopened";
        if (localExt.containsKey("a:s_awe_red_packet_state")) {
            str = (String) localExt.get("a:s_awe_red_packet_state");
        }
        if (!TextUtils.isEmpty(this.f87869A)) {
            TextUtils.equals(this.f87869A, str);
        }
        this.f87869A = str;
        this.f87872w.setText(((DouYinRedPacketContent) this.f87709k).getTitle());
        if ("unopened".equals(str)) {
            if (this.f87875z != null) {
                this.f87871v.setBackgroundResource(this.f87875z.mo72174a());
            }
            this.f87872w.setMaxLines(2);
            this.f87872w.setEllipsize(TruncateAt.END);
            this.f87873x.setVisibility(8);
            this.f87874y.setText(R.string.gj6);
            this.f87870u.setVisibility(8);
            return;
        }
        if (this.f87875z != null) {
            this.f87871v.setBackgroundResource(this.f87875z.mo72176b());
        }
        this.f87872w.setMaxLines(1);
        this.f87872w.setEllipsize(TruncateAt.END);
        this.f87873x.setVisibility(0);
        this.f87874y.setText(R.string.gj6);
        this.f87870u.setVisibility(0);
        if ("opened".equals(str)) {
            this.f87873x.setText(R.string.gj8);
        } else if ("none_left".equals(str)) {
            this.f87873x.setText(R.string.gj_);
        } else {
            if ("expired".equals(str)) {
                this.f87873x.setText(R.string.gj9);
            }
        }
    }

    public C33880u(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, DouYinRedPacketContent douYinRedPacketContent, int i) {
        super.mo71780a(pVar, pVar2, douYinRedPacketContent, i);
        this.f87708j.setTag(50331648, Integer.valueOf(43));
        this.f87708j.setTag(134217728, pVar);
        this.f87708j.setTag(100663296, douYinRedPacketContent);
        this.f87869A = null;
        m77656b(pVar);
    }
}
