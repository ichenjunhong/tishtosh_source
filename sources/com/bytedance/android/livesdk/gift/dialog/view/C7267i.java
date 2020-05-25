package com.bytedance.android.livesdk.gift.dialog.view;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7289a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.widget.CountDownTextView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.i */
public final class C7267i extends C1352v {

    /* renamed from: a */
    final GiftViewModel f19758a;

    /* renamed from: b */
    int f19759b;

    /* renamed from: c */
    HSImageView f19760c;

    /* renamed from: d */
    public HSImageView f19761d;

    /* renamed from: e */
    public HSImageView f19762e;

    /* renamed from: f */
    View f19763f;

    /* renamed from: g */
    TextView f19764g;

    /* renamed from: h */
    TextView f19765h;

    /* renamed from: i */
    TextView f19766i;

    /* renamed from: j */
    LiveSendGiftAnimationView f19767j;

    /* renamed from: k */
    C7491b f19768k;

    /* renamed from: l */
    View f19769l;

    /* renamed from: m */
    LiveGiftComboView f19770m;

    /* renamed from: n */
    CountDownTextView f19771n;

    /* renamed from: o */
    boolean f19772o = true;

    /* renamed from: p */
    public final float f19773p;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13513b() {
        this.f19770m.setVisibility(8);
        this.f19767j.setVisibility(0);
        this.f19758a.mo13536a(new C7289a(13, null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13511a() {
        boolean z;
        if (this.f19768k.f20516d instanceof Prop) {
            Prop prop = (Prop) this.f19768k.f20516d;
            int a = this.f19758a.mo13527a();
            if (prop.gift != null && prop.gift.f20539H) {
                a = 10;
            }
            if (prop.count - a >= 0) {
                prop.count -= a;
            }
            if (prop.propType == 4) {
                z = true;
            } else {
                z = false;
            }
            mo13512a(prop, z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13512a(Prop prop, boolean z) {
        boolean z2;
        String str;
        Prop prop2 = prop;
        this.f19766i.setText(this.itemView.getContext().getString(R.string.ei8, new Object[]{Integer.valueOf(prop2.count)}));
        this.f19766i.setVisibility(0);
        Context context = this.itemView.getContext();
        if (context != null) {
            if (prop2.nextExpire > 0) {
                long currentTimeMillis = prop2.nextExpire - ((System.currentTimeMillis() / 1000) + prop.getNowTimeDiff());
                if (currentTimeMillis <= 0) {
                    str = context.getResources().getString(R.string.ei9, new Object[]{"00:00"});
                    z2 = true;
                } else {
                    if (currentTimeMillis < 3600) {
                        str = context.getResources().getString(R.string.ei9, new Object[]{C4574am.m10978a(currentTimeMillis)});
                        this.f19771n.mo14703a(R.string.ei9, currentTimeMillis, 0);
                    } else if (currentTimeMillis < 86400) {
                        int i = (int) (currentTimeMillis / 3600);
                        str = context.getResources().getQuantityString(R.plurals.y, i, new Object[]{Integer.valueOf(i)});
                    } else {
                        int i2 = (int) (currentTimeMillis / 86400);
                        str = context.getResources().getQuantityString(R.plurals.x, i2, new Object[]{Integer.valueOf(i2)});
                    }
                    z2 = false;
                }
                this.f19771n.setText(str);
                this.f19771n.setVisibility(0);
            } else {
                this.f19771n.setVisibility(8);
                z2 = false;
            }
            if (z || (prop2.count > 0 && !z2)) {
                this.f19769l.setAlpha(1.0f);
                this.f19772o = true;
                return;
            }
            this.f19769l.setAlpha(0.32f);
            this.f19772o = false;
        }
    }

    public C7267i(View view, int i, GiftViewModel giftViewModel) {
        super(view);
        this.f19759b = i;
        this.f19758a = giftViewModel;
        this.f19760c = (HSImageView) view.findViewById(R.id.e_p);
        this.f19761d = (HSImageView) view.findViewById(R.id.ba3);
        this.f19762e = (HSImageView) view.findViewById(R.id.e58);
        this.f19763f = view.findViewById(R.id.cke);
        this.f19764g = (TextView) view.findViewById(R.id.e_s);
        this.f19765h = (TextView) view.findViewById(R.id.a5f);
        this.f19766i = (TextView) view.findViewById(R.id.eqz);
        this.f19769l = view.findViewById(R.id.e3j);
        this.f19767j = (LiveSendGiftAnimationView) view.findViewById(R.id.eut);
        this.f19770m = (LiveGiftComboView) view.findViewById(R.id.euu);
        this.f19767j.setViewModel(this.f19758a);
        this.f19771n = (CountDownTextView) view.findViewById(R.id.e_t);
        view.setOnClickListener(new C7271j(this));
        this.f19767j.setOnClickListener(new C7272k(this));
        this.f19770m.setOnClickListener(new C7273l(this));
        this.f19773p = C9432q.m18687b(view.getContext(), 13.0f);
    }
}
