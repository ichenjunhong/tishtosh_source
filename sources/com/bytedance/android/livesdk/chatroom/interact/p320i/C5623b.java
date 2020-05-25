package com.bytedance.android.livesdk.chatroom.interact.p320i;

import android.graphics.Color;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5265f.C5266a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5382c.C5383a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.C17971f;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.i.b */
public final class C5623b extends C1352v {

    /* renamed from: a */
    final C5266a f14721a;

    /* renamed from: b */
    final int f14722b;

    /* renamed from: c */
    public final View f14723c;

    /* renamed from: d */
    int f14724d = 1;

    /* renamed from: e */
    private final VHeadView f14725e;

    /* renamed from: f */
    private final VHeadView f14726f;

    /* renamed from: g */
    private final TextView f14727g;

    /* renamed from: h */
    private final TextView f14728h;

    /* renamed from: i */
    private final TextView f14729i;

    /* renamed from: j */
    private final Button f14730j;

    /* renamed from: k */
    private final TextView f14731k;

    /* renamed from: l */
    private final TextView f14732l;

    /* renamed from: m */
    private View f14733m;

    /* renamed from: n */
    private View f14734n;

    public C5623b(View view, C5266a aVar, int i) {
        super(view);
        this.f14725e = (VHeadView) view.findViewById(R.id.ao0);
        this.f14727g = (TextView) view.findViewById(R.id.dco);
        this.f14728h = (TextView) view.findViewById(R.id.d_c);
        this.f14730j = (Button) view.findViewById(R.id.n7);
        this.f14723c = view.findViewById(R.id.a6h);
        this.f14729i = (TextView) view.findViewById(R.id.d4e);
        this.f14731k = (TextView) view.findViewById(R.id.di1);
        this.f14726f = (VHeadView) view.findViewById(R.id.ake);
        this.f14734n = view.findViewById(R.id.d4r);
        this.f14733m = view.findViewById(R.id.f0z);
        this.f14732l = (TextView) view.findViewById(R.id.dau);
        this.f14721a = aVar;
        this.f14722b = i;
    }

    /* renamed from: a */
    public final void mo11508a(C5623b bVar, int i, Room room, boolean z, int i2, C5382c cVar, Boolean bool, int i3, int i4) {
        String str;
        String str2;
        String str3;
        int i5;
        int i6;
        C5623b bVar2 = bVar;
        Room room2 = room;
        int i7 = i2;
        C5382c cVar2 = cVar;
        int i8 = i3;
        if (room2 != null) {
            User owner = room.getOwner();
            if (owner != null) {
                this.f14724d = i7;
                C5213c.m11826b(bVar2.f14725e, owner.getAvatarThumb(), bVar2.f14725e.getWidth(), bVar2.f14725e.getHeight(), R.drawable.bt6);
                bVar2.f14727g.setText(owner.getNickName());
                int i9 = 0;
                if (owner.getUserHonor() != null) {
                    bVar2.f14728h.setVisibility(0);
                    bVar2.f14728h.setText(bVar2.f14728h.getContext().getResources().getString(R.string.edc, new Object[]{C3890e.m9836d(owner.getUserHonor().mo8152g())}));
                    bVar2.f14728h.setTextColor(Color.parseColor("#808080"));
                }
                bVar2.f14729i.setVisibility(0);
                bVar2.f14729i.setText(bVar2.f14729i.getContext().getResources().getString(R.string.edb, new Object[]{C3890e.m9836d((long) room.getUserCount())}));
                this.f14734n.setVisibility(8);
                HashMap hashMap = new HashMap();
                if (owner.getLinkMicStats() != 0) {
                    if (room.getLinkMicInfo() == null) {
                        bVar2.f14730j.setBackgroundResource(R.drawable.bkg);
                        bVar2.f14730j.setText(R.string.eju);
                        bVar2.f14730j.setTextColor(Color.parseColor("#ffffff"));
                        hashMap.put("invitee_status", "0");
                    } else {
                        bVar2.f14730j.setBackgroundResource(R.drawable.bjn);
                        Button button = bVar2.f14730j;
                        if (i8 == 2) {
                            i6 = R.string.hqo;
                        } else {
                            i6 = R.string.ejs;
                        }
                        button.setText(i6);
                        bVar2.f14730j.setTextColor(Color.parseColor("#b0b0b0"));
                        hashMap.put("invitee_status", "1");
                    }
                    bVar2.f14730j.setVisibility(0);
                    bVar2.f14731k.setVisibility(8);
                } else {
                    bVar2.f14730j.setVisibility(8);
                    bVar2.f14731k.setVisibility(0);
                    TextView textView = bVar2.f14731k;
                    if (i8 == 2) {
                        i5 = R.string.hst;
                    } else {
                        i5 = R.string.hsu;
                    }
                    textView.setText(i5);
                    hashMap.put("invitee_status", "2");
                }
                bVar2.f14726f.setVisibility(0);
                if (owner.getGender() == 1) {
                    bVar2.f14726f.setImageResource(R.drawable.bqp);
                } else if (owner.getGender() == 2) {
                    bVar2.f14726f.setImageResource(R.drawable.bqo);
                } else {
                    bVar2.f14726f.setVisibility(8);
                }
                this.f14733m.setVisibility(8);
                bVar2.f14732l.setVisibility(8);
                C8056g gVar = new C8056g();
                if (cVar2 != null) {
                    String str4 = "connection_type";
                    if (this.f14722b == 2) {
                        str = "anchor";
                    } else {
                        str = "manual_pk";
                    }
                    hashMap.put(str4, str);
                    if (room.getOwner() != null) {
                        gVar.mo14211c(room.getOwner().getId());
                    }
                    String str5 = "invitee_list";
                    if (i7 == 1) {
                        str2 = "mutual_follow";
                    } else {
                        str2 = "recommend";
                    }
                    hashMap.put(str5, str2);
                    if (cVar2.f14332b == C5383a.Distance.ordinal()) {
                        str3 = "distance";
                    } else if (cVar2.f14332b == C5383a.DistanceCity.ordinal()) {
                        str3 = "city";
                    } else {
                        str3 = "money";
                    }
                    hashMap.put("inviter_level", String.valueOf(i4));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(str3, cVar2.f14331a);
                    hashMap.put("anchor_info", new C17971f().mo34889b(hashMap2));
                    C8049c.m15979a().mo14202a("livesdk_connection_invite_show", hashMap, gVar, Room.class);
                }
                bVar2.f14730j.setOnClickListener(new C5624c(this, room2, cVar2, i4));
                View view = bVar2.f14723c;
                if (!z) {
                    i9 = 8;
                }
                view.setVisibility(i9);
            }
        }
    }
}
