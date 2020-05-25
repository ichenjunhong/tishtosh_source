package com.bytedance.android.livesdk.chatroom.interact.p311a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.d */
public final class C5258d extends C1322a<C5263b> {

    /* renamed from: a */
    public C5262a f14068a;

    /* renamed from: b */
    public List<C5696e> f14069b;

    /* renamed from: c */
    private OnClickListener f14070c = new OnClickListener() {
        public final void onClick(View view) {
            if (C5258d.this.f14068a != null && view.getTag() != null) {
                Object tag = view.getTag();
                if (tag instanceof User) {
                    User user = (User) tag;
                    C5258d.this.f14068a.mo11114a(user.getId(), user.getSecUid());
                }
            }
        }
    };

    /* renamed from: d */
    private OnClickListener f14071d = new OnClickListener() {
        public final void onClick(View view) {
            if (C5258d.this.f14068a != null && view.getTag() != null) {
                Object tag = view.getTag();
                if (tag instanceof User) {
                    User user = (User) tag;
                    C5258d.this.f14068a.mo11115b(user.getId(), user.getSecUid());
                }
            }
        }
    };

    /* renamed from: e */
    private OnClickListener f14072e = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() != null) {
                C4495a.m10823a().mo10301a((Object) new UserProfileEvent((User) view.getTag(R.id.amw), "guest_waiting_list"));
            }
        }
    };

    /* renamed from: f */
    private boolean f14073f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.d$a */
    public interface C5262a {
        /* renamed from: a */
        void mo11114a(long j, String str);

        /* renamed from: b */
        void mo11115b(long j, String str);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.d$b */
    static class C5263b extends C1352v {

        /* renamed from: a */
        HSImageView f14077a;

        /* renamed from: b */
        TextView f14078b;

        /* renamed from: c */
        TextView f14079c;

        /* renamed from: d */
        TextView f14080d;

        /* renamed from: e */
        TextView f14081e;

        C5263b(View view) {
            super(view);
            this.f14077a = (HSImageView) view.findViewById(R.id.amw);
            this.f14078b = (TextView) view.findViewById(R.id.amy);
            this.f14079c = (TextView) view.findViewById(R.id.a4m);
            this.f14080d = (TextView) view.findViewById(R.id.bx_);
            this.f14081e = (TextView) view.findViewById(R.id.a64);
        }
    }

    public final int getItemCount() {
        return this.f14069b.size();
    }

    /* renamed from: a */
    public final int mo11109a() {
        int i = 0;
        for (C5696e eVar : this.f14069b) {
            if (2 == eVar.f14955f) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public final int mo11110b() {
        int i = 0;
        for (C5696e eVar : this.f14069b) {
            if (1 == eVar.f14955f) {
                i++;
            }
        }
        return i;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5263b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amq, viewGroup, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0065, code lost:
        if (r11.f14955f == 2) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(android.support.p043v7.widget.RecyclerView.C1352v r10, int r11) {
        /*
            r9 = this;
            com.bytedance.android.livesdk.chatroom.interact.a.d$b r10 = (com.bytedance.android.livesdk.chatroom.interact.p311a.C5258d.C5263b) r10
            java.util.List<com.bytedance.android.livesdk.chatroom.model.a.e> r0 = r9.f14069b
            java.lang.Object r11 = r0.get(r11)
            com.bytedance.android.livesdk.chatroom.model.a.e r11 = (com.bytedance.android.livesdk.chatroom.model.p323a.C5696e) r11
            boolean r0 = r9.f14073f
            com.bytedance.android.live.core.widget.HSImageView r1 = r10.f14077a
            com.bytedance.android.live.base.model.user.User r2 = r11.f14953d
            com.bytedance.android.live.base.model.ImageModel r2 = r2.getAvatarMedium()
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11820a(r1, r2)
            android.widget.TextView r1 = r10.f14078b
            com.bytedance.android.live.base.model.user.User r2 = r11.f14953d
            java.lang.String r2 = r2.getNickName()
            r1.setText(r2)
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r11.f14954e
            long r1 = r1 - r3
            int r1 = (int) r1
            int r1 = com.bytedance.android.livesdk.p279af.C4574am.m10976a(r1)
            int r2 = r11.f14955f
            r3 = 2
            if (r3 != r2) goto L_0x003a
            r2 = 2132547397(0x7f1c1745, float:2.0748039E38)
            goto L_0x003d
        L_0x003a:
            r2 = 2132547506(0x7f1c17b2, float:2.074826E38)
        L_0x003d:
            android.widget.TextView r4 = r10.f14079c
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r8 = 0
            r6[r8] = r7
            java.lang.String r1 = com.bytedance.android.live.core.p230g.C3922z.m9904a(r2, r1, r6)
            r4.setText(r1)
            r1 = 8
            if (r0 == 0) goto L_0x0067
            int r0 = r11.f14955f
            if (r0 != r5) goto L_0x0063
            android.widget.TextView r0 = r10.f14080d
            r0.setVisibility(r8)
            android.widget.TextView r0 = r10.f14081e
            r0.setVisibility(r1)
            goto L_0x0071
        L_0x0063:
            int r0 = r11.f14955f
            if (r0 != r3) goto L_0x0071
        L_0x0067:
            android.widget.TextView r0 = r10.f14080d
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.f14081e
            r0.setVisibility(r8)
        L_0x0071:
            com.bytedance.android.live.core.widget.HSImageView r0 = r10.f14077a
            r1 = 2132019399(0x7f1408c7, float:1.9677132E38)
            com.bytedance.android.live.base.model.user.User r2 = r11.f14953d
            r0.setTag(r1, r2)
            android.widget.TextView r0 = r10.f14080d
            com.bytedance.android.live.base.model.user.User r1 = r11.f14953d
            r0.setTag(r1)
            android.widget.TextView r0 = r10.f14081e
            com.bytedance.android.live.base.model.user.User r11 = r11.f14953d
            r0.setTag(r11)
            com.bytedance.android.live.core.widget.HSImageView r11 = r10.f14077a
            android.view.View$OnClickListener r0 = r9.f14072e
            r11.setOnClickListener(r0)
            android.widget.TextView r11 = r10.f14080d
            android.view.View$OnClickListener r0 = r9.f14070c
            r11.setOnClickListener(r0)
            android.widget.TextView r10 = r10.f14081e
            android.view.View$OnClickListener r11 = r9.f14071d
            r10.setOnClickListener(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p311a.C5258d.onBindViewHolder(android.support.v7.widget.RecyclerView$v, int):void");
    }

    public C5258d(C5262a aVar, List<C5696e> list, boolean z) {
        this.f14073f = z;
        this.f14068a = aVar;
        if (list != null) {
            this.f14069b = list;
            return;
        }
        throw new RuntimeException("List can not be null.");
    }
}
