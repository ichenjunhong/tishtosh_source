package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5297d.C5298a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5297d.C5299b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
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

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.c */
public final class C5330c extends C5299b implements OnClickListener {

    /* renamed from: e */
    private TextView f14154e;

    /* renamed from: f */
    private User f14155f;

    /* renamed from: g */
    private User f14156g;

    /* renamed from: h */
    private int f14157h;

    /* renamed from: i */
    private long f14158i;

    /* renamed from: j */
    private long f14159j;

    /* renamed from: k */
    private String f14160k;

    /* renamed from: l */
    private long f14161l;

    /* renamed from: m */
    private TextView f14162m;

    /* renamed from: n */
    private ConstraintLayout f14163n;

    /* renamed from: o */
    private LinearLayout f14164o;

    /* renamed from: p */
    private String f14165p;

    /* renamed from: q */
    private Room f14166q;

    /* renamed from: r */
    private String[] f14167r = {"mutual_follow", "recommend", "recent", "other_follow"};

    /* renamed from: s */
    private int f14168s;

    /* renamed from: t */
    private C5382c f14169t;

    /* renamed from: u */
    private View f14170u;

    /* renamed from: b */
    public final String mo11149b() {
        return this.f14160k;
    }

    /* renamed from: c */
    public final float mo11150c() {
        return 216.0f;
    }

    /* renamed from: d */
    public final View mo11151d() {
        return null;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f14146a.setCancelable(true);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        ((C5298a) this.f14148c).mo11158c();
    }

    /* renamed from: a */
    public final void mo11226a() {
        if (this.f14156g != null) {
            ((C5298a) this.f14148c).mo11156a(2, this.f14158i, this.f14159j, this.f14156g);
        }
        this.f14149d.mo10412c();
        ((C5298a) this.f14148c).mo11158c();
    }

    /* renamed from: e */
    public final View mo11152e() {
        if (this.f14157h == 0) {
            return null;
        }
        int i = 0;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aq0, (ViewGroup) getView(), false);
        View findViewById = inflate.findViewById(R.id.b47);
        if (!((Boolean) C4525b.f12349aR.mo10345a()).booleanValue()) {
            i = 8;
        }
        findViewById.setVisibility(i);
        inflate.setOnClickListener(new C5331d(this));
        return inflate;
    }

    /* renamed from: a */
    public final void mo11161a(boolean z) {
        this.f14146a.dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11227a(View view) {
        C4525b.f12349aR.mo10346a(Boolean.valueOf(false));
        this.f14146a.mo11094a(C5351u.m12157a(this.f14146a));
    }

    /* renamed from: a */
    public final void mo11160a(int i) {
        String str;
        if (this.f10828D) {
            if (this.f14157h != 0) {
                this.f14154e.setText(C4604n.m11050a(getString(R.string.edk), Integer.valueOf(i)));
            }
            if (i == 0) {
                if (this.f14157h == 1) {
                    if (this.f14156g != null) {
                        ((C5298a) this.f14148c).mo11156a(5, this.f14158i, this.f14159j, this.f14156g);
                    }
                    this.f14146a.setCancelable(false);
                } else if (this.f14157h == 0) {
                    mo11161a(false);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_page", "live_detail");
                hashMap.put("room_id", String.valueOf(this.f14146a.mo11097c().getId()));
                if (this.f14156g != null) {
                    hashMap.put("inviter_id", String.valueOf(this.f14156g.getId()));
                }
                if (this.f14155f != null) {
                    hashMap.put("invitee_id", String.valueOf(this.f14155f.getId()));
                }
                if (this.f14149d.f12627r == 1) {
                    HashMap hashMap2 = new HashMap(hashMap);
                    hashMap2.put("theme", this.f14149d.f12620k);
                    hashMap2.put("pk_time", String.valueOf(this.f14149d.f12619j));
                    C8049c.m15979a().mo14202a("random_match_cancel", hashMap2, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"));
                }
                String str2 = "match_type";
                if (this.f14149d.f12627r == 1) {
                    str = "random";
                } else {
                    str = "manual";
                }
                hashMap.put(str2, str);
                if (this.f14149d.f12619j == 0) {
                    hashMap.put("connection_type", "anchor");
                } else {
                    hashMap.put("connection_type", "pk");
                    hashMap.put("theme", this.f14149d.f12620k);
                    hashMap.put("pk_time", String.valueOf(this.f14149d.f12619j));
                }
                hashMap.put("is_oncemore", "0");
                hashMap.put("selection", "reject");
                C8056g gVar = new C8056g();
                if (this.f14149d.f12619j > 0 && this.f14149d.f12627r == 0) {
                    gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
                }
                C8049c.m15979a().mo14202a("connection_invited", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), gVar, Room.class);
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
        if (this.f14156g != null) {
            hashMap.put("inviter_id", String.valueOf(this.f14156g.getId()));
        }
        if (this.f14155f != null) {
            hashMap.put("invitee_id", String.valueOf(this.f14155f.getId()));
        }
        if ((id == R.id.n4 || id == R.id.n9) && this.f14149d.f12627r == 1) {
            HashMap hashMap2 = new HashMap(hashMap);
            hashMap2.put("theme", this.f14149d.f12620k);
            hashMap2.put("pk_time", String.valueOf(this.f14149d.f12619j));
            C8049c.m15979a().mo14202a("random_match_cancel", hashMap2, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"));
        }
        if (id == R.id.n4 && this.f14149d.f12627r == 0) {
            HashMap hashMap3 = new HashMap();
            Room c = this.f14146a.mo11097c();
            if (c != null) {
                hashMap3.put("room_id", String.valueOf(c.getId()));
                hashMap3.put("anchor_id", String.valueOf(c.getOwnerUserId()));
            }
            if (this.f14155f != null) {
                hashMap3.put("invitee_id", String.valueOf(this.f14155f.getId()));
            }
            C8049c.m15979a().mo14202a("livesdk_manual_match_cancel", hashMap3, new Object[0]);
        }
        if (id == R.id.n9 || id == R.id.n3) {
            if (this.f14149d.f12619j == 0) {
                hashMap.put("connection_type", "anchor");
            } else {
                hashMap.put("connection_type", "pk");
                hashMap.put("theme", this.f14149d.f12620k);
                hashMap.put("pk_time", String.valueOf(this.f14149d.f12619j));
            }
            hashMap.put("is_oncemore", "0");
            String str2 = "selection";
            if (id == R.id.n9) {
                str = "reject";
            } else {
                str = "accept";
            }
            hashMap.put(str2, str);
            C8056g gVar = new C8056g();
            if (this.f14149d.f12619j > 0 && this.f14149d.f12627r == 0) {
                gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
            }
            C8049c.m15979a().mo14202a("connection_invited", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("other"), Room.class);
        }
        if (id == R.id.n4) {
            if (this.f14155f != null) {
                ((C5298a) this.f14148c).mo11157a(this.f14158i, this.f14159j, this.f14155f.getId(), this.f14161l);
            }
            this.f14149d.f12614e = 0;
            this.f14146a.dismiss();
        } else if (id == R.id.n3 || id == R.id.n9) {
            if (this.f14156g != null) {
                C5298a aVar = (C5298a) this.f14148c;
                if (id == R.id.n9) {
                    i = 2;
                } else {
                    i = 1;
                }
                aVar.mo11156a(i, this.f14158i, this.f14159j, this.f14156g);
            }
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
        View inflate = layoutInflater.inflate(R.layout.aka, viewGroup, false);
        this.f14154e = (TextView) inflate.findViewById(R.id.n9);
        this.f14162m = (TextView) inflate.findViewById(R.id.n3);
        this.f14170u = inflate.findViewById(R.id.f0z);
        VHeadView vHeadView = (VHeadView) inflate.findViewById(R.id.d4u);
        TextView textView = (TextView) inflate.findViewById(R.id.d4h);
        VHeadView vHeadView2 = (VHeadView) inflate.findViewById(R.id.av1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dar);
        TextView textView3 = (TextView) inflate.findViewById(R.id.d4t);
        TextView textView4 = (TextView) inflate.findViewById(R.id.daq);
        this.f14163n = (ConstraintLayout) inflate.findViewById(R.id.d4g);
        this.f14164o = (LinearLayout) inflate.findViewById(R.id.d4z);
        inflate.findViewById(R.id.kb);
        this.f14154e.setOnClickListener(this);
        this.f14162m.setOnClickListener(this);
        if (this.f14157h == 0) {
            this.f14154e.setVisibility(8);
            this.f14162m.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.f14163n.setVisibility(0);
            textView.setText(this.f14165p);
            if (this.f14156g != null) {
                C5213c.m11826b(vHeadView, this.f14156g.getAvatarThumb(), vHeadView.getWidth(), vHeadView.getHeight(), R.drawable.bt6);
                textView2.setText(this.f14156g.getNickName());
                textView4.setText(getContext().getResources().getString(R.string.edc, new Object[]{C4204a.m10420a(this.f14156g.getFanTicketCount(), "")}));
                vHeadView2.setVisibility(0);
                if (this.f14156g.getGender() == 1) {
                    vHeadView2.setImageResource(R.drawable.bqp);
                } else {
                    vHeadView2.setImageResource(R.drawable.bqo);
                }
            }
            if (this.f14166q != null && LinkCrossRoomDataHolder.m11103a().f12619j > 0) {
                textView3.setVisibility(0);
                textView3.setText(getContext().getResources().getString(R.string.edb, new Object[]{C3890e.m9836d((long) this.f14166q.getUserCount())}));
            }
        }
        this.f14146a.setCancelable(false);
        C5298a aVar = (C5298a) this.f14148c;
        if (this.f14157h == 0) {
            i = 12;
        } else {
            i = 10;
        }
        aVar.mo11155a(i);
        return inflate;
    }

    /* renamed from: a */
    public static C5299b m12071a(C5323b bVar, int i, String str, Room room, String str2, long j, long j2, DataCenter dataCenter, int i2, C5382c cVar) {
        C5330c cVar2 = new C5330c();
        cVar2.f14148c = new C5606n(cVar2, dataCenter);
        cVar2.f14146a = bVar;
        if (TextUtils.isEmpty(str)) {
            cVar2.f14160k = C3922z.m9915e().getString(R.string.ee3);
        } else {
            cVar2.f14160k = C3922z.m9915e().getString(R.string.hqt);
        }
        if (room != null) {
            cVar2.f14156g = room.getOwner();
        }
        cVar2.f14155f = bVar.mo11097c().getOwner();
        cVar2.f14159j = bVar.mo11097c().getId();
        cVar2.f14158i = j;
        cVar2.f14157h = 1;
        cVar2.f14161l = 0;
        cVar2.f14165p = str2;
        cVar2.f14166q = room;
        cVar2.f14168s = i2;
        cVar2.f14169t = cVar;
        return cVar2;
    }
}
