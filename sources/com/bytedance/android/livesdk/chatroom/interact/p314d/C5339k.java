package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5303f.C5304a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5303f.C5305b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5616x;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.k */
public final class C5339k extends C5305b implements OnClickListener {

    /* renamed from: e */
    private User f14204e;

    /* renamed from: f */
    private User f14205f;

    /* renamed from: g */
    private int f14206g;

    /* renamed from: h */
    private long f14207h;

    /* renamed from: i */
    private long f14208i;

    /* renamed from: j */
    private String f14209j;

    /* renamed from: k */
    private long f14210k;

    /* renamed from: l */
    private TextView f14211l;

    /* renamed from: m */
    private int f14212m;

    /* renamed from: b */
    public final String mo11149b() {
        return this.f14209j;
    }

    /* renamed from: c */
    public final float mo11150c() {
        return 216.0f;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f14146a.setCancelable(true);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        ((C5304a) this.f14148c).mo11175c();
    }

    /* renamed from: e */
    public final View mo11152e() {
        if (this.f14206g == 0) {
            return null;
        }
        int i = 0;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aq0, (ViewGroup) getView(), false);
        View findViewById = inflate.findViewById(R.id.b47);
        if (!((Boolean) C4525b.f12349aR.mo10345a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C5340l(this));
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11249a(View view) {
        C4525b.f12349aR.mo10346a(Boolean.valueOf(false));
        this.f14146a.mo11094a(C5351u.m12157a(this.f14146a));
    }

    /* renamed from: a */
    public final void mo11176a(int i) {
        if (this.f10828D) {
            this.f14211l.setText(C4604n.m11050a(getString(R.string.ekr), Integer.valueOf(i)));
            if (i == 0) {
                if (this.f14206g == 1) {
                    ((C5304a) this.f14148c).mo11173a(1, this.f14207h, this.f14208i, this.f14205f.getId());
                }
                this.f14146a.dismiss();
            }
        }
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.n4) {
            if (this.f14206g == 1) {
                ((C5304a) this.f14148c).mo11173a(2, this.f14207h, this.f14208i, this.f14205f.getId());
                this.f14149d.mo10412c();
            } else {
                ((C5304a) this.f14148c).mo11174a(this.f14207h, this.f14208i, this.f14204e.getId(), this.f14210k);
                this.f14149d.f12614e = 0;
            }
            this.f14146a.dismiss();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.akc, viewGroup, false);
        this.f14211l = (TextView) inflate.findViewById(R.id.n4);
        VHeadView vHeadView = (VHeadView) inflate.findViewById(R.id.ao2);
        TextView textView = (TextView) inflate.findViewById(R.id.dcq);
        VHeadView vHeadView2 = (VHeadView) inflate.findViewById(R.id.ao1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dcp);
        this.f14211l.setOnClickListener(this);
        if (this.f14205f != null) {
            C5213c.m11826b(vHeadView, this.f14205f.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), R.drawable.bt6);
            textView.setText(this.f14205f.getNickName());
        }
        if (this.f14204e != null) {
            C5213c.m11826b(vHeadView2, this.f14204e.getAvatarThumb(), vHeadView2.getWidth(), vHeadView2.getHeight(), R.drawable.bt6);
            textView2.setText(this.f14204e.getNickName());
        }
        this.f14146a.setCancelable(false);
        C5304a aVar = (C5304a) this.f14148c;
        if (this.f14206g == 0) {
            i = 5;
        } else {
            i = 3;
        }
        aVar.mo11172a(i);
        return inflate;
    }

    /* renamed from: a */
    public static C5339k m12112a(C5323b bVar, int i, String str, User user, long j, long j2, DataCenter dataCenter, int i2) {
        C5339k kVar = new C5339k();
        kVar.f14148c = new C5616x(kVar, dataCenter);
        kVar.f14146a = bVar;
        if (i == 0) {
            kVar.f14204e = user;
            kVar.f14205f = bVar.mo11097c().getOwner();
        } else {
            kVar.f14205f = user;
            kVar.f14204e = bVar.mo11097c().getOwner();
        }
        kVar.f14208i = bVar.mo11097c().getId();
        kVar.f14207h = j;
        kVar.f14206g = i;
        kVar.f14212m = i2;
        if (TextUtils.isEmpty(str)) {
            kVar.f14209j = C3922z.m9903a((int) R.string.ee3);
        } else {
            kVar.f14209j = str;
        }
        kVar.f14210k = j2;
        return kVar;
    }
}
