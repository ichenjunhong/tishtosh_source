package com.bytedance.android.livesdk.chatroom.interact.p320i;

import android.graphics.Color;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.livesdk.chatroom.interact.p311a.C5265f.C5266a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.i.f */
public final class C5627f extends C1352v {

    /* renamed from: a */
    final C5266a f14743a;

    /* renamed from: b */
    final int f14744b;

    /* renamed from: c */
    int f14745c = 3;

    /* renamed from: d */
    private final VHeadView f14746d;

    /* renamed from: e */
    private final TextView f14747e;

    /* renamed from: f */
    private final TextView f14748f;

    /* renamed from: g */
    private final Button f14749g;

    /* renamed from: h */
    private final View f14750h;

    public C5627f(View view, C5266a aVar, int i) {
        super(view);
        this.f14746d = (VHeadView) view.findViewById(R.id.ao0);
        this.f14747e = (TextView) view.findViewById(R.id.dco);
        this.f14748f = (TextView) view.findViewById(R.id.d_c);
        this.f14749g = (Button) view.findViewById(R.id.n7);
        this.f14750h = view.findViewById(R.id.a6h);
        this.f14743a = aVar;
        this.f14744b = i;
    }

    /* renamed from: a */
    public final void mo11511a(C5627f fVar, int i, Room room, boolean z, int i2) {
        User owner = room.getOwner();
        if (owner != null) {
            this.f14745c = i2;
            C5213c.m11826b(fVar.f14746d, owner.getAvatarThumb(), fVar.f14746d.getWidth(), fVar.f14746d.getHeight(), R.drawable.bt6);
            fVar.f14747e.setText(owner.getNickName());
            int i3 = 8;
            if (owner.getUserHonor() == null || owner.getUserHonor().mo8152g() == 0) {
                fVar.f14748f.setVisibility(8);
            } else {
                fVar.f14748f.setVisibility(0);
                fVar.f14748f.setText(fVar.f14748f.getContext().getResources().getString(R.string.edc, new Object[]{C3890e.m9833a(owner.getFanTicketCount())}));
            }
            if (room.isWithLinkMic() || !(owner.getLinkMicStats() == 1 || (owner.getLinkMicStats() == 2 && owner.getFollowInfo() != null && owner.getFollowInfo().getFollowStatus() == 2))) {
                fVar.f14749g.setBackgroundResource(R.drawable.bjn);
                fVar.f14749g.setTextColor(Color.parseColor("#b0b0b0"));
            } else {
                fVar.f14749g.setBackgroundResource(R.drawable.bkg);
                fVar.f14749g.setTextColor(Color.parseColor("#ffffff"));
            }
            fVar.f14749g.setOnClickListener(new C5628g(this, room));
            View view = fVar.f14750h;
            if (z) {
                i3 = 0;
            }
            view.setVisibility(i3);
        }
    }
}
