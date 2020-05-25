package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5300e.C5301a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5300e.C5302b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p316e.C5362a;
import com.bytedance.android.livesdk.chatroom.interact.p316e.C5369h.C5370a;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5394af;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.C8737f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.h */
public final class C5335h extends C5302b implements OnClickListener {

    /* renamed from: e */
    private TextView f14188e;

    /* renamed from: f */
    private VHeadView f14189f;

    /* renamed from: g */
    private TextView f14190g;

    /* renamed from: h */
    private TextView f14191h;

    /* renamed from: i */
    private View f14192i;

    /* renamed from: j */
    private FrameLayout f14193j;

    /* renamed from: k */
    private FrameLayout f14194k;

    /* renamed from: l */
    private C8737f f14195l;

    /* renamed from: m */
    private int f14196m;

    /* renamed from: n */
    private LinkAutoMatchModel f14197n;

    /* renamed from: o */
    private DataCenter f14198o;

    /* renamed from: p */
    private int f14199p;

    /* renamed from: q */
    private C5370a f14200q = new C5370a() {
        /* renamed from: a */
        public final boolean mo11241a() {
            return false;
        }

        /* renamed from: c */
        public final boolean mo11246c() {
            return false;
        }

        /* renamed from: b */
        public final boolean mo11244b() {
            C5335h.this.mo11235a();
            return false;
        }

        /* renamed from: a */
        public final boolean mo11243a(LinkAutoMatchModel linkAutoMatchModel) {
            C5335h.this.mo11237a(linkAutoMatchModel);
            return false;
        }

        /* renamed from: b */
        public final boolean mo11245b(LinkAutoMatchModel linkAutoMatchModel) {
            C5335h.this.mo11239b(linkAutoMatchModel);
            return false;
        }

        /* renamed from: a */
        public final boolean mo11242a(C2949a aVar) {
            if (aVar != null) {
                String prompt = aVar.getPrompt();
                if (!TextUtils.isEmpty(prompt)) {
                    C4204a.m10423a(C5335h.this.getContext(), prompt);
                }
            }
            return false;
        }
    };

    /* renamed from: c */
    public final float mo11150c() {
        return 216.0f;
    }

    /* renamed from: a */
    public final void mo11171a(Throwable th) {
        if (this.f10828D) {
            C4602l.m11046a(getContext(), th);
            ((C5301a) this.f14148c).mo11163a(this.f14146a.mo11097c().getId());
        }
    }

    /* renamed from: b */
    public final String mo11149b() {
        return getString(R.string.el9);
    }

    /* renamed from: d */
    public final View mo11151d() {
        if (this.f14196m != 1) {
            return null;
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        autoRTLImageView.setLayoutParams(new LayoutParams(C3922z.m9899a(32.0f), C3922z.m9899a(32.0f)));
        autoRTLImageView.setImageDrawable(C3922z.m9911c(R.drawable.bsi));
        autoRTLImageView.setOnClickListener(new C5337i(this));
        return autoRTLImageView;
    }

    /* renamed from: e */
    public final View mo11152e() {
        if (this.f14196m == 2 || this.f14149d.f12627r == 2) {
            return null;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.apz, (ViewGroup) getView(), false);
        inflate.setOnClickListener(new C5338j(this));
        return inflate;
    }

    public final void onStop() {
        if (((C5301a) this.f14148c).mo11167e()) {
            ((C5301a) this.f14148c).mo11166d();
            C5362a.m12170a().mo11280a(this.f14146a.mo11097c().getId());
        }
        C5362a.m12170a().mo11281a(this.f14200q);
        super.onStop();
    }

    /* renamed from: a */
    public final void mo11235a() {
        if (mo8452l()) {
            LinkCrossRoomDataHolder.m11103a().f12628s = 0;
            if (((Boolean) C4525b.f12350aS.mo10345a()).booleanValue()) {
                this.f14190g.setVisibility(0);
                this.f14192i.setVisibility(8);
                ((C5301a) this.f14148c).mo11162a(3);
                return;
            }
            this.f14188e.setText(R.string.eku);
            this.f14193j.setVisibility(8);
            this.f14194k.setVisibility(0);
            this.f14191h.setText(R.string.el_);
        }
    }

    public final void onStart() {
        super.onStart();
        C5362a.m12170a().mo11282a(this.f14200q, 0);
        switch (this.f14196m) {
            case 1:
                ((C5301a) this.f14148c).mo11163a(this.f14146a.mo11097c().getId());
                return;
            case 2:
                if (mo8452l()) {
                    if (this.f14197n != null) {
                        C5213c.m11826b(this.f14189f, this.f14197n.getDefaultAvatar(), this.f14189f.getWidth(), this.f14189f.getHeight(), R.drawable.bt6);
                    }
                    mo11235a();
                    return;
                }
                return;
            case 3:
                if (this.f14197n != null) {
                    if (this.f14197n.getRivalRoom() != null) {
                        mo11239b(this.f14197n);
                        break;
                    } else {
                        mo11237a(this.f14197n);
                        return;
                    }
                } else {
                    mo11235a();
                    return;
                }
        }
    }

    /* renamed from: b */
    private void m12092b(int i) {
        this.f14191h.setText(i);
    }

    /* renamed from: a */
    public final void mo11170a(String str) {
        C4575an.m10987a(str);
        m12092b((int) R.string.el_);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11238b(View view) {
        C5362a.m12170a().mo11283b();
        this.f14146a.mo11093a();
    }

    /* renamed from: b */
    public final void mo11239b(LinkAutoMatchModel linkAutoMatchModel) {
        if (mo8452l()) {
            ((C5301a) this.f14148c).mo11164a(linkAutoMatchModel.getRivalRoom(), this.f14146a.mo11097c().getId(), (String) C4525b.f12352aU.mo10345a(), 300, this.f14199p);
        }
    }

    /* renamed from: a */
    public final void mo11168a(int i) {
        if (mo8452l()) {
            if (this.f14190g.getVisibility() == 0) {
                this.f14190g.setText(String.valueOf(i));
                this.f14188e.setText(getString(R.string.ekv, Integer.valueOf(i)));
            }
            if (i == 0) {
                this.f14190g.setVisibility(8);
                this.f14192i.setVisibility(0);
                ((C5301a) this.f14148c).mo11163a(this.f14146a.mo11097c().getId());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11236a(View view) {
        m12092b((int) R.string.el_);
        ((C5301a) this.f14148c).mo11166d();
        C5362a.m12170a().mo11283b();
        this.f14188e.setText("");
        this.f14190g.setText("");
        this.f14146a.mo11094a(C5347s.m12140a(this.f14146a, 1, this.f14198o));
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.n4) {
            if (C5362a.m12170a().mo11284c()) {
                m12092b((int) R.string.el_);
                ((C5301a) this.f14148c).mo11165c();
                C8049c.m15979a().mo14203a("match_cancel_click", LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            } else if (((C5301a) this.f14148c).mo11167e()) {
                m12092b((int) R.string.el_);
                ((C5301a) this.f14148c).mo11166d();
                C5362a.m12170a().mo11283b();
                this.f14188e.setText("");
                this.f14190g.setText("");
                C8049c.m15979a().mo14203a("match_cancel_click", LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            } else {
                m12092b((int) R.string.e41);
                this.f14190g.setVisibility(8);
                this.f14192i.setVisibility(0);
                ((C5301a) this.f14148c).mo11163a(this.f14146a.mo11097c().getId());
                LinkCrossRoomDataHolder.m11103a().f12634y = true;
                C8049c.m15979a().mo14203a("connection_invite", new C8056g().mo14205a(300).mo14207a(Boolean.valueOf(true)), LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
            }
        } else if (view.getId() == R.id.n5) {
            ((C5301a) this.f14148c).mo11163a(this.f14146a.mo11097c().getId());
        } else {
            if (view.getId() == R.id.n8) {
                C4525b.f12350aS.mo10346a(Boolean.valueOf(true));
                ((C5301a) this.f14148c).mo11163a(this.f14146a.mo11097c().getId());
            }
        }
    }

    /* renamed from: a */
    public final void mo11237a(LinkAutoMatchModel linkAutoMatchModel) {
        if (mo8452l()) {
            this.f14193j.setVisibility(0);
            this.f14194k.setVisibility(8);
            this.f14188e.setText(linkAutoMatchModel.getDefaultContent());
            C5213c.m11826b(this.f14189f, linkAutoMatchModel.getDefaultAvatar(), this.f14189f.getWidth(), this.f14189f.getHeight(), R.drawable.bt6);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14195l = TTLiveSDKContext.getHostService().mo10309b().mo15489b();
        this.f14188e = (TextView) view.findViewById(R.id.dbq);
        VHeadView vHeadView = (VHeadView) view.findViewById(R.id.ao2);
        TextView textView = (TextView) view.findViewById(R.id.dcq);
        this.f14189f = (VHeadView) view.findViewById(R.id.ao1);
        this.f14193j = (FrameLayout) view.findViewById(R.id.b8e);
        this.f14190g = (TextView) view.findViewById(R.id.d8x);
        this.f14191h = (TextView) view.findViewById(R.id.n4);
        this.f14192i = view.findViewById(R.id.b9f);
        this.f14191h.setOnClickListener(this);
        this.f14190g.setVisibility(8);
        this.f14194k = (FrameLayout) view.findViewById(R.id.b8f);
        TextView textView2 = (TextView) view.findViewById(R.id.n5);
        TextView textView3 = (TextView) view.findViewById(R.id.n8);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        this.f14194k.setVisibility(8);
        if (this.f14146a.mo11097c().getOwner() != null) {
            textView.setText(this.f14146a.mo11097c().getOwner().getNickName());
            C5213c.m11826b(vHeadView, this.f14146a.mo11097c().getOwner().getAvatarMedium(), vHeadView.getWidth(), vHeadView.getHeight(), R.drawable.bt6);
        }
    }

    /* renamed from: a */
    public final void mo11169a(Room room, int i) {
        if (this.f10828D) {
            this.f14146a.mo11094a(C5339k.m12112a(this.f14146a, 0, (String) C4525b.f12352aU.mo10345a(), room.getOwner(), this.f14149d.f12612c, room.getId(), this.f14198o, i));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.akb, viewGroup, false);
    }

    /* renamed from: a */
    public static C5335h m12091a(C5323b bVar, DataCenter dataCenter, int i) {
        C5335h hVar = new C5335h();
        hVar.f14148c = new C5394af(hVar);
        hVar.f14146a = bVar;
        hVar.f14197n = null;
        hVar.f14196m = 1;
        hVar.f14198o = dataCenter;
        hVar.f14199p = i;
        return hVar;
    }

    /* renamed from: a */
    public static C5335h m12090a(C5323b bVar, LinkAutoMatchModel linkAutoMatchModel, int i, DataCenter dataCenter) {
        C5335h hVar = new C5335h();
        hVar.f14148c = new C5394af(hVar);
        hVar.f14146a = bVar;
        hVar.f14197n = linkAutoMatchModel;
        hVar.f14196m = i;
        hVar.f14198o = dataCenter;
        return hVar;
    }
}
