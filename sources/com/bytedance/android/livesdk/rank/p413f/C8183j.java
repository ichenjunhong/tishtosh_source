package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.view.C8232e.C8236a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.j */
public final class C8183j extends C53035c<C8219f, C8184a> {

    /* renamed from: a */
    C8214a f22336a;

    /* renamed from: b */
    private int f22337b;

    /* renamed from: c */
    private boolean f22338c;

    /* renamed from: d */
    private boolean f22339d;

    /* renamed from: com.bytedance.android.livesdk.rank.f.j$a */
    static class C8184a extends C1352v {

        /* renamed from: a */
        int f22340a;

        /* renamed from: b */
        boolean f22341b;

        /* renamed from: c */
        boolean f22342c;

        /* renamed from: d */
        ImageView f22343d;

        /* renamed from: e */
        TextView f22344e;

        /* renamed from: f */
        ImageView f22345f;

        /* renamed from: g */
        TextView f22346g;

        /* renamed from: h */
        View f22347h;

        /* renamed from: i */
        TextView f22348i;

        /* renamed from: j */
        C8236a f22349j;

        /* renamed from: k */
        LottieAnimationView f22350k;

        /* renamed from: l */
        boolean f22351l;

        /* renamed from: m */
        private ImageView f22352m;

        public C8184a(View view, int i, boolean z, boolean z2, C8236a aVar) {
            super(view);
            this.f22340a = i;
            this.f22341b = z;
            this.f22343d = (ImageView) view.findViewById(R.id.c8c);
            this.f22344e = (TextView) view.findViewById(R.id.c8g);
            this.f22345f = (ImageView) view.findViewById(R.id.dm3);
            this.f22346g = (TextView) view.findViewById(R.id.dn1);
            this.f22352m = (ImageView) view.findViewById(R.id.ay3);
            this.f22347h = view.findViewById(R.id.bdh);
            this.f22348i = (TextView) view.findViewById(R.id.d02);
            this.f22350k = (LottieAnimationView) view.findViewById(R.id.ej7);
            this.f22342c = z2;
            this.f22349j = aVar;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C8184a aVar = new C8184a(layoutInflater.inflate(R.layout.an0, viewGroup, false), this.f22337b, this.f22338c, this.f22339d, new C8185k(this));
        return aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        long j;
        String str;
        String str2;
        C8184a aVar = (C8184a) vVar;
        C8219f fVar = (C8219f) obj;
        if (fVar != null) {
            if (aVar.f22342c) {
                aVar.f22343d.setVisibility(8);
                aVar.f22344e.setVisibility(0);
                if (fVar.f22444c <= 0 || fVar.f22444c > 10) {
                    aVar.f22344e.setTextColor(aVar.itemView.getResources().getColor(R.color.ad6));
                } else {
                    aVar.f22344e.setTextColor(aVar.itemView.getResources().getColor(R.color.afk));
                }
            } else if (fVar.f22444c == 1) {
                aVar.f22343d.setImageResource(R.drawable.c0z);
                aVar.f22343d.setVisibility(0);
                aVar.f22344e.setVisibility(8);
            } else if (fVar.f22444c == 2) {
                aVar.f22343d.setImageResource(R.drawable.c10);
                aVar.f22343d.setVisibility(0);
                aVar.f22344e.setVisibility(8);
            } else if (fVar.f22444c == 3) {
                aVar.f22343d.setImageResource(R.drawable.c11);
                aVar.f22343d.setVisibility(0);
                aVar.f22344e.setVisibility(8);
            } else {
                aVar.f22343d.setVisibility(8);
                aVar.f22344e.setVisibility(0);
            }
        }
        aVar.f22344e.setText(String.valueOf(fVar.f22444c));
        C5213c.m11826b(aVar.f22345f, fVar.f22442a.getAvatarThumb(), aVar.f22345f.getWidth(), aVar.f22345f.getHeight(), R.drawable.bt6);
        aVar.f22346g.setText(fVar.f22442a.getNickName());
        if (fVar.mo14364a() > 0) {
            aVar.f22351l = true;
            C9432q.m18691b(aVar.f22347h, 8);
            C8068g.m16015a(aVar.f22347h);
            if (fVar != null) {
                HashMap hashMap = new HashMap();
                if (fVar.f22442a != null && fVar.f22442a.getId() > 0) {
                    hashMap.put("anchor_id", String.valueOf(fVar.f22442a.getId()));
                }
                hashMap.put("room_id", String.valueOf(fVar.mo14364a()));
                String str3 = "anchor_id";
                if (fVar.f22442a == null) {
                    j = 0;
                } else {
                    j = fVar.f22442a.getId();
                }
                hashMap.put(str3, String.valueOf(j));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live_detail");
                hashMap.put("enter_from", "live_detail");
                hashMap.put("action_type", "click");
                String str4 = "event_module";
                if (aVar.f22340a == 1) {
                    str = "hourly_rank";
                } else {
                    str = "regional_rank";
                }
                hashMap.put(str4, str);
                if (LinkCrossRoomDataHolder.m11103a().f12612c > 0) {
                    hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12612c));
                    hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12613d));
                    String str5 = "connection_type";
                    if (LinkCrossRoomDataHolder.m11103a().f12619j == 0) {
                        str2 = "anchor";
                    } else {
                        str2 = "pk";
                    }
                    hashMap.put(str5, str2);
                }
                hashMap.put("enter_from_merge", "live_detail");
                hashMap.put("enter_method", "hourly_rank");
                C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
                if (a instanceof C8042k) {
                    C8042k kVar = (C8042k) a;
                    if (kVar.mo14192a().containsKey("enter_from_merge")) {
                        hashMap.put("previous_page", (String) kVar.mo14192a().get("enter_from_merge"));
                    }
                }
                C8049c.m15979a().mo14202a("live_show", hashMap, new C8059j(), Room.class);
            }
        } else {
            aVar.f22351l = false;
            C9432q.m18691b((View) aVar.f22350k, 8);
            C9432q.m18691b(aVar.f22347h, 8);
        }
        if (C8607a.f23572a) {
            aVar.f22348i.setText(C3890e.m9835c(fVar.f22443b));
        } else {
            aVar.f22348i.setText(fVar.f22445d);
        }
        aVar.itemView.setOnClickListener(new C8186l(aVar, fVar));
    }

    public C8183j(int i, boolean z, boolean z2, C8214a aVar) {
        this.f22337b = i;
        this.f22338c = z;
        this.f22339d = z2;
        this.f22336a = aVar;
    }
}
