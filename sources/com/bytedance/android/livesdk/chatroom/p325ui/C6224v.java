package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView.BufferType;
import com.bytedance.android.live.base.model.user.C3014m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3897k;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.FitTextView;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.v */
public final class C6224v extends C5919a<C6226a> {

    /* renamed from: a */
    public DataCenter f16699a;

    /* renamed from: b */
    public boolean f16700b;

    /* renamed from: c */
    private final LayoutInflater f16701c;

    /* renamed from: d */
    private OnClickListener f16702d = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getTag() != null && (view.getTag() instanceof Long)) {
                if (C6224v.this.f16700b) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_belong", "live_take");
                    hashMap.put("event_type", "click");
                    hashMap.put("event_page", "live_take_detail");
                    hashMap.put(LeakCanaryFileProvider.f132050j, "top_online_pic");
                    C8049c.m15979a().mo14202a("pm_live_take_anchor_c_audience", hashMap, new C8060k());
                }
                if (C6224v.this.f16699a != null) {
                    Room room = (Room) C6224v.this.f16699a.get("data_room", null);
                    if (room != null && room.isKoiRoom()) {
                        return;
                    }
                }
                if (C6224v.this.f16699a != null) {
                    Room room2 = (Room) C6224v.this.f16699a.get("data_room", null);
                    if (room2 != null && room2.isStar()) {
                        return;
                    }
                }
                UserProfileEvent userProfileEvent = new UserProfileEvent(((Long) view.getTag()).longValue());
                userProfileEvent.setClickUserPosition("top_single_room_rank");
                C4495a.m10823a().mo10301a((Object) userProfileEvent);
            }
        }
    };

    /* renamed from: e */
    private List<C8219f> f16703e = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.v$a */
    static class C6226a extends C1352v {

        /* renamed from: a */
        View f16705a;

        /* renamed from: b */
        ImageView f16706b;

        /* renamed from: c */
        ImageView f16707c;

        /* renamed from: d */
        ImageView f16708d;

        /* renamed from: e */
        ImageView f16709e;

        /* renamed from: f */
        FitTextView f16710f;

        C6226a(View view) {
            super(view);
            this.f16705a = view;
            this.f16706b = (ImageView) view.findViewById(R.id.hi);
            this.f16707c = (ImageView) view.findViewById(R.id.hq);
            this.f16708d = (ImageView) view.findViewById(R.id.ap7);
            this.f16709e = (ImageView) view.findViewById(R.id.a2m);
            this.f16710f = (FitTextView) view.findViewById(R.id.a09);
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemCount() {
        return this.f16703e.size();
    }

    /* renamed from: a */
    public final void mo11850a() {
        this.f16703e.clear();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo11852a(DataCenter dataCenter) {
        this.f16699a = dataCenter;
    }

    /* renamed from: a */
    public final void mo11854a(boolean z) {
        this.f16700b = z;
    }

    /* renamed from: a */
    public final void mo11853a(List<C8219f> list) {
        if (list != null) {
            this.f16703e.clear();
            if (!C9376b.m18558a((Collection<T>) list)) {
                this.f16703e.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo11851a(long j) {
        User user;
        int size = this.f16703e.size() - 1;
        while (size >= 0) {
            C8219f fVar = (C8219f) this.f16703e.get(size);
            if (fVar != null) {
                user = fVar.f22442a;
            } else {
                user = null;
            }
            if (user == null || user.getId() != j) {
                size--;
            } else {
                this.f16703e.remove(size);
                notifyDataSetChanged();
                return;
            }
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C6226a(this.f16701c.inflate(R.layout.ap0, viewGroup, false));
    }

    public C6224v(Context context, DataCenter dataCenter) {
        this.f16701c = LayoutInflater.from(context.getApplicationContext());
        this.f16699a = dataCenter;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        String str;
        float f;
        C6226a aVar = (C6226a) vVar;
        C8219f fVar = (C8219f) this.f16703e.get(i);
        OnClickListener onClickListener = this.f16702d;
        DataCenter dataCenter = this.f16699a;
        if (fVar != null && fVar.f22442a != null) {
            User user = fVar.f22442a;
            if (user.getAvatarThumb() == null || C9376b.m18558a((Collection<T>) user.getAvatarThumb().getUrls())) {
                C5213c.m11813a(aVar.f16706b, (int) R.drawable.c2g);
            } else {
                C5213c.m11815a(aVar.f16706b, user.getAvatarThumb(), (int) R.drawable.c2g);
            }
            if (user.getBorder() == null || user.getBorder().f8838a == null || C9376b.m18558a((Collection<T>) user.getBorder().f8838a.getUrls())) {
                aVar.f16707c.setVisibility(8);
            } else {
                aVar.f16707c.setVisibility(0);
                C5213c.m11814a(aVar.f16707c, user.getBorder().f8838a);
            }
            if (fVar.f22443b > 0) {
                long j = fVar.f22443b;
                String str2 = "w";
                if (j < 10000) {
                    str = String.valueOf(j);
                } else if (j < 1000000) {
                    StringBuilder sb = new StringBuilder("#.#");
                    sb.append(str2);
                    DecimalFormat decimalFormat = new DecimalFormat(sb.toString());
                    double d = (double) j;
                    Double.isNaN(d);
                    str = decimalFormat.format((d * 1.0d) / 10000.0d);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    double d2 = (double) j;
                    Double.isNaN(d2);
                    sb2.append(C3897k.m9852a("%.0f", Double.valueOf((d2 * 1.0d) / 10000.0d)));
                    sb2.append(str2);
                    str = sb2.toString();
                }
                FitTextView fitTextView = aVar.f16710f;
                FitTextView fitTextView2 = aVar.f16710f;
                float a = (float) C3922z.m9899a(20.0f);
                float a2 = (float) C3922z.m9899a(32.0f);
                float b = C3922z.m9907b(9.0f);
                if (fitTextView2 == null) {
                    f = 0.0f;
                } else {
                    TextPaint paint = fitTextView2.getPaint();
                    paint.setTextSize(b);
                    float measureText = paint.measureText(str) + ((float) fitTextView2.getPaddingLeft()) + ((float) fitTextView2.getPaddingRight());
                    if (measureText <= a2) {
                        a2 = measureText;
                    }
                    if (a2 < a) {
                        f = a;
                    } else {
                        f = a2;
                    }
                }
                fitTextView.setWidth((int) f);
                aVar.f16710f.setText(str, BufferType.NORMAL);
                int i2 = R.drawable.beo;
                switch (fVar.f22444c) {
                    case 1:
                        i2 = R.drawable.bel;
                        break;
                    case 2:
                        i2 = R.drawable.bem;
                        break;
                    case 3:
                        i2 = R.drawable.ben;
                        break;
                }
                aVar.f16710f.setBackgroundResource(i2);
                aVar.f16710f.setVisibility(0);
                aVar.f16708d.setVisibility(4);
            } else {
                aVar.f16710f.setVisibility(8);
                C3014m userHonor = user.getUserHonor();
                if (userHonor == null || userHonor.mo8159n() <= 0) {
                    aVar.f16708d.setVisibility(4);
                } else {
                    aVar.f16708d.setVisibility(0);
                    C5213c.m11814a(aVar.f16708d, userHonor.mo8160o());
                }
            }
            aVar.f16705a.setTag(Long.valueOf(user.getId()));
            aVar.f16705a.setOnClickListener(onClickListener);
            C9432q.m18691b((View) aVar.f16710f, 8);
        }
    }
}
