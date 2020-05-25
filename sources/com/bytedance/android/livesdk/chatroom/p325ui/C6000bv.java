package com.bytedance.android.livesdk.chatroom.p325ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3896j;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.p230g.p231a.C3859i;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5696e;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bv */
public final class C6000bv extends C1322a<C6005c> {

    /* renamed from: a */
    public C6004b f15910a;

    /* renamed from: b */
    List<C5696e> f15911b;

    /* renamed from: c */
    private OnClickListener f15912c = new OnClickListener() {
        public final void onClick(View view) {
            if (C6000bv.this.f15910a != null && view.getTag() != null) {
                Object tag = view.getTag();
                if (tag instanceof User) {
                    User user = (User) tag;
                    C6000bv.this.f15910a.mo11982a(user.getId(), user.getSecUid());
                }
            }
        }
    };

    /* renamed from: d */
    private OnClickListener f15913d = new OnClickListener() {
        public final void onClick(View view) {
            if (C6000bv.this.f15910a != null && view.getTag() != null) {
                Object tag = view.getTag();
                if (tag instanceof User) {
                    User user = (User) tag;
                    C6000bv.this.f15910a.mo11983b(user.getId(), user.getSecUid());
                }
            }
        }
    };

    /* renamed from: e */
    private OnClickListener f15914e = C6006bw.f15924a;

    /* renamed from: f */
    private int f15915f;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bv$a */
    static class C6003a extends C6005c {

        /* renamed from: a */
        View f15918a;

        /* renamed from: b */
        View f15919b;

        C6003a(View view) {
            super(view);
            this.f15918a = view.findViewById(R.id.yr);
            this.f15919b = view.findViewById(R.id.a63);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bv$b */
    public interface C6004b {
        /* renamed from: a */
        void mo11982a(long j, String str);

        /* renamed from: b */
        void mo11983b(long j, String str);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bv$c */
    static class C6005c extends C1352v {

        /* renamed from: c */
        AvatarIconView f15920c;

        /* renamed from: d */
        ImageView f15921d;

        /* renamed from: e */
        TextView f15922e;

        /* renamed from: f */
        TextView f15923f;

        C6005c(View view) {
            super(view);
            this.f15920c = (AvatarIconView) view.findViewById(R.id.i3);
            this.f15921d = (ImageView) view.findViewById(R.id.ap8);
            this.f15922e = (TextView) view.findViewById(R.id.bpp);
            this.f15923f = (TextView) view.findViewById(R.id.a4m);
        }
    }

    public final int getItemCount() {
        return this.f15911b.size();
    }

    /* renamed from: a */
    public final int mo11997a() {
        int i = 0;
        for (C5696e eVar : this.f15911b) {
            if (2 == eVar.f14955f) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public final int mo11999b() {
        int i = 0;
        for (C5696e eVar : this.f15911b) {
            if (1 == eVar.f14955f) {
                i++;
            }
        }
        return i;
    }

    public final int getItemViewType(int i) {
        return this.f15915f;
    }

    /* renamed from: a */
    public final void mo11998a(long j) {
        int size = this.f15911b.size();
        if (size > 0) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                C5696e eVar = (C5696e) this.f15911b.get(i2);
                if (eVar != null && eVar.f14953d != null && eVar.f14953d.getId() == j) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i >= 0 && i < size) {
                this.f15911b.remove(i);
                notifyItemRemoved(i);
            }
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C6003a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.am0, null));
        }
        return new C6005c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.alz, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        String str;
        boolean z;
        int i2;
        int i3;
        C6005c cVar = (C6005c) vVar;
        C5696e eVar = (C5696e) this.f15911b.get(i);
        if (eVar != null && eVar.f14953d != null) {
            User user = eVar.f14953d;
            cVar.f15920c.setAvatar(user.getAvatarMedium());
            if (user.getUserHonor() != null) {
                cVar.f15920c.setIcon(user.getUserHonor().mo8157l());
            }
            C3859i.m9790a(cVar.f15920c, String.valueOf(cVar.f15920c.getId()), user);
            cVar.f15920c.setOnClickListener(this.f15914e);
            cVar.f15922e.setText(user.getNickName());
            boolean z2 = true;
            if (eVar.f14958i > 0) {
                str = C3922z.m9905a((int) R.string.emy, Integer.valueOf(eVar.f14958i));
            } else {
                int a = C4574am.m10976a((int) ((System.currentTimeMillis() / 1000) - eVar.f14954e));
                if (2 == eVar.f14955f) {
                    i3 = R.string.gyd;
                } else {
                    i3 = R.string.h1b;
                }
                str = C3896j.m9851a(i3, Integer.valueOf(a), Integer.valueOf(a));
            }
            cVar.f15923f.setText(str);
            if (cVar instanceof C6003a) {
                C6003a aVar = (C6003a) cVar;
                if (1 == eVar.f14955f) {
                    z = false;
                } else {
                    if (2 == eVar.f14955f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 = false;
                }
                View view = aVar.f15918a;
                int i4 = 8;
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
                View view2 = aVar.f15919b;
                if (z) {
                    i4 = 0;
                }
                view2.setVisibility(i4);
                aVar.f15918a.setTag(user);
                aVar.f15918a.setOnClickListener(this.f15912c);
                aVar.f15919b.setTag(user);
                aVar.f15919b.setOnClickListener(this.f15913d);
            }
        }
    }

    public C6000bv(C6004b bVar, List<C5696e> list, int i) {
        this.f15910a = bVar;
        if (list != null) {
            this.f15911b = list;
            if (i == 0 || i == 1) {
                this.f15915f = i;
                return;
            }
            throw new IllegalArgumentException("Type must be 1 for anchor or 2 for audience.");
        }
        throw new RuntimeException("List can not be null.");
    }
}
