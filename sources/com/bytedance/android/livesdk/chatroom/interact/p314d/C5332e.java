package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5297d.C5298a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5297d.C5299b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5606n;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.e */
public final class C5332e extends C5299b implements OnClickListener {

    /* renamed from: e */
    private TextView f14172e;

    /* renamed from: f */
    private TextView f14173f;

    /* renamed from: g */
    private TextView f14174g;

    /* renamed from: h */
    private TextView f14175h;

    /* renamed from: i */
    private User f14176i;

    /* renamed from: j */
    private User f14177j;

    /* renamed from: k */
    private int f14178k;

    /* renamed from: l */
    private long f14179l;

    /* renamed from: m */
    private long f14180m;

    /* renamed from: n */
    private String f14181n;

    /* renamed from: o */
    private long f14182o;

    /* renamed from: p */
    private TextView f14183p;

    /* renamed from: q */
    private int f14184q;

    /* renamed from: r */
    private String[] f14185r = {"mutual_follow", "recommend", "recent", "other_follow"};

    /* renamed from: b */
    public final String mo11149b() {
        return this.f14181n;
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
        ((C5298a) this.f14148c).mo11158c();
    }

    /* renamed from: d */
    public final View mo11151d() {
        if (this.f14178k == 1) {
            return null;
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        autoRTLImageView.setLayoutParams(new LayoutParams(C3922z.m9899a(32.0f), C3922z.m9899a(32.0f)));
        autoRTLImageView.setImageDrawable(C3922z.m9911c(R.drawable.bsi));
        autoRTLImageView.setOnClickListener(new C5334g(this));
        return autoRTLImageView;
    }

    /* renamed from: e */
    public final View mo11152e() {
        if (this.f14178k == 0) {
            return null;
        }
        int i = 0;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aq0, (ViewGroup) getView(), false);
        View findViewById = inflate.findViewById(R.id.b47);
        if (!((Boolean) C4525b.f12349aR.mo10345a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C5333f(this));
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11230a(View view) {
        ((C5298a) this.f14148c).mo11157a(this.f14179l, this.f14180m, this.f14176i.getId(), this.f14182o);
        this.f14149d.f12614e = 0;
        this.f14146a.mo11093a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11231b(View view) {
        C4525b.f12349aR.mo10346a(Boolean.valueOf(false));
        this.f14146a.mo11094a(C5351u.m12157a(this.f14146a));
    }

    /* renamed from: a */
    public final void mo11161a(boolean z) {
        if (z) {
            this.f14172e.setVisibility(8);
            this.f14183p.setVisibility(8);
            this.f14174g.setVisibility(0);
            this.f14175h.setVisibility(0);
            return;
        }
        this.f14146a.dismiss();
    }

    /* renamed from: a */
    public final void mo11160a(int i) {
        if (this.f10828D) {
            if (this.f14178k == 0) {
                this.f14173f.setText(C4604n.m11050a(getString(R.string.ekr), Integer.valueOf(i)));
            } else {
                this.f14172e.setText(C4604n.m11050a(getString(R.string.edk), Integer.valueOf(i)));
            }
            if (i == 0) {
                if (this.f14178k == 1) {
                    ((C5298a) this.f14148c).mo11156a(5, this.f14179l, this.f14180m, this.f14177j);
                    this.f14146a.setCancelable(false);
                } else if (this.f14178k == 0) {
                    mo11161a(false);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_page", "live_detail");
                hashMap.put("room_id", String.valueOf(this.f14146a.mo11097c().getId()));
                hashMap.put("inviter_id", String.valueOf(this.f14177j.getId()));
                hashMap.put("invitee_id", String.valueOf(this.f14176i.getId()));
                if (this.f14149d.f12619j > 0) {
                    hashMap.put("theme", this.f14149d.f12620k);
                    hashMap.put("pk_time", String.valueOf(this.f14149d.f12619j));
                }
                hashMap.put("selection", "reject");
                C8049c.m15979a().mo14202a("connection_invited", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), new C8056g().mo14206a(this.f14149d.f12616g), this.f14149d.mo10411b(), Room.class);
            }
        }
    }

    public final void onClick(View view) {
        int i;
        String str;
        int id = view.getId();
        HashMap hashMap = new HashMap();
        hashMap.put("event_page", "live_detail");
        hashMap.put("room_id", String.valueOf(this.f14146a.mo11097c().getId()));
        hashMap.put("inviter_id", String.valueOf(this.f14177j.getId()));
        hashMap.put("invitee_id", String.valueOf(this.f14176i.getId()));
        if (id == R.id.n9 || id == R.id.n3) {
            if (this.f14149d.f12619j > 0) {
                hashMap.put("theme", this.f14149d.f12620k);
                hashMap.put("pk_time", String.valueOf(this.f14149d.f12619j));
            }
            String str2 = "selection";
            if (id == R.id.n9) {
                str = "reject";
            } else {
                str = "accept";
            }
            hashMap.put(str2, str);
            C8049c.m15979a().mo14202a("connection_invited", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), this.f14149d.mo10411b(), new C8056g().mo14206a(this.f14149d.f12616g), Room.class);
        }
        if (id == R.id.n4) {
            ((C5298a) this.f14148c).mo11157a(this.f14179l, this.f14180m, this.f14176i.getId(), this.f14182o);
            this.f14149d.f12614e = 0;
            this.f14146a.dismiss();
        } else if (id == R.id.n3 || id == R.id.n9) {
            C5298a aVar = (C5298a) this.f14148c;
            if (id == R.id.n9) {
                i = 2;
            } else {
                i = 1;
            }
            aVar.mo11156a(i, this.f14179l, this.f14180m, this.f14177j);
            if (id == R.id.n9) {
                this.f14149d.mo10412c();
            }
            ((C5298a) this.f14148c).mo11158c();
        } else if (id == R.id.ne) {
            this.f14146a.dismiss();
        } else {
            if (id == R.id.pg) {
                ((C5298a) this.f14148c).mo11159d();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.ak_, viewGroup, false);
        this.f14173f = (TextView) inflate.findViewById(R.id.n4);
        this.f14172e = (TextView) inflate.findViewById(R.id.n9);
        this.f14183p = (TextView) inflate.findViewById(R.id.n3);
        this.f14174g = (TextView) inflate.findViewById(R.id.pg);
        this.f14175h = (TextView) inflate.findViewById(R.id.ne);
        VHeadView vHeadView = (VHeadView) inflate.findViewById(R.id.ao2);
        TextView textView = (TextView) inflate.findViewById(R.id.dcq);
        VHeadView vHeadView2 = (VHeadView) inflate.findViewById(R.id.ao1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dcp);
        this.f14173f.setOnClickListener(this);
        this.f14172e.setOnClickListener(this);
        this.f14183p.setOnClickListener(this);
        this.f14174g.setOnClickListener(this);
        this.f14175h.setOnClickListener(this);
        if (this.f14177j != null) {
            C5213c.m11826b(vHeadView, this.f14177j.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), R.drawable.bt6);
        }
        if (this.f14176i != null) {
            C5213c.m11826b(vHeadView2, this.f14176i.getAvatarThumb(), vHeadView2.getWidth(), vHeadView2.getHeight(), R.drawable.bt6);
        }
        if (this.f14177j != null) {
            textView.setText(this.f14177j.getNickName());
        }
        if (this.f14176i != null) {
            textView2.setText(this.f14176i.getNickName());
        }
        if (this.f14178k == 0) {
            this.f14172e.setVisibility(8);
            this.f14183p.setVisibility(8);
        } else {
            this.f14173f.setVisibility(8);
        }
        this.f14146a.setCancelable(false);
        C5298a aVar = (C5298a) this.f14148c;
        if (this.f14178k == 0) {
            i = 12;
        } else {
            i = 10;
        }
        aVar.mo11155a(i);
        return inflate;
    }

    /* renamed from: a */
    public static C5332e m12080a(C5323b bVar, int i, String str, User user, long j, long j2, DataCenter dataCenter) {
        C5332e eVar = new C5332e();
        eVar.f14148c = new C5606n(eVar, dataCenter);
        eVar.f14146a = bVar;
        if (TextUtils.isEmpty(str)) {
            eVar.f14181n = C3922z.m9915e().getString(R.string.ee3);
        } else {
            eVar.f14181n = str;
        }
        eVar.f14176i = user;
        eVar.f14177j = bVar.mo11097c().getOwner();
        eVar.f14180m = bVar.mo11097c().getId();
        eVar.f14179l = j;
        eVar.f14178k = 0;
        eVar.f14182o = j2;
        return eVar;
    }

    /* renamed from: a */
    public static C5332e m12081a(C5323b bVar, int i, String str, User user, long j, long j2, DataCenter dataCenter, int i2) {
        C5332e eVar = new C5332e();
        eVar.f14148c = new C5606n(eVar, dataCenter);
        eVar.f14146a = bVar;
        if (LinkCrossRoomDataHolder.m11103a().f12619j == 0) {
            eVar.f14181n = C3922z.m9915e().getString(R.string.ee3);
        } else {
            eVar.f14181n = C3922z.m9915e().getString(R.string.hqt);
        }
        Room c = bVar.mo11097c();
        eVar.f14177j = user;
        eVar.f14176i = c.getOwner();
        eVar.f14180m = c.getId();
        eVar.f14179l = j;
        eVar.f14178k = 1;
        eVar.f14182o = 0;
        eVar.f14184q = i2;
        return eVar;
    }
}
