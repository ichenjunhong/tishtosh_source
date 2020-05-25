package com.bytedance.android.live.wallet.p261d;

import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.p455i.C8809a;
import com.bytedance.android.livesdkapi.p455i.C8809a.C8810a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.wallet.d.a */
public final class C4384a extends Fragment {

    /* renamed from: c */
    public static final C4385a f12003c = new C4385a(null);

    /* renamed from: a */
    public int f12004a = R.layout.ak5;

    /* renamed from: b */
    public int f12005b = R.layout.alq;

    /* renamed from: d */
    private ImageView f12006d;

    /* renamed from: e */
    private TextView f12007e;

    /* renamed from: f */
    private LinearLayout f12008f;

    /* renamed from: g */
    private HashMap f12009g;

    /* renamed from: com.bytedance.android.live.wallet.d.a$a */
    public static final class C4385a {
        private C4385a() {
        }

        public /* synthetic */ C4385a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.d.a$b */
    static final class C4386b {

        /* renamed from: a */
        final ImageView f12010a;

        /* renamed from: b */
        final TextView f12011b;

        /* renamed from: c */
        final View f12012c;

        /* renamed from: d */
        private final View f12013d;

        public C4386b(View view) {
            C52711k.m112240b(view, "view");
            this.f12013d = view;
            View findViewById = this.f12013d.findViewById(R.id.b3n);
            C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.iv_reward_item_icon)");
            this.f12010a = (ImageView) findViewById;
            View findViewById2 = this.f12013d.findViewById(R.id.dev);
            C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.tv_reward_item_text)");
            this.f12011b = (TextView) findViewById2;
            View findViewById3 = this.f12013d.findViewById(R.id.cby);
            C52711k.m112236a((Object) findViewById3, "view.findViewById(R.id.reward_item_placeholder)");
            this.f12012c = findViewById3;
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f12009g != null) {
            this.f12009g.clear();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        this.f12006d = (ImageView) view.findViewById(R.id.b3m);
        this.f12007e = (TextView) view.findViewById(R.id.dex);
        this.f12008f = (LinearLayout) view.findViewById(R.id.bg7);
        C4097p<C8809a> pVar = LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE;
        C52711k.m112236a((Object) pVar, "LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE");
        C8809a aVar = (C8809a) pVar.mo9431a();
        if (aVar != null) {
            ImageModel imageModel = aVar.f24044b;
            if (imageModel != null) {
                C5213c.m11814a(this.f12006d, imageModel);
            }
            C8851g gVar = aVar.f24043a;
            if (gVar != null) {
                ((C4193l) C4116c.m10249a(C4193l.class)).parsePatternAndGetSpannable(gVar, "");
                TextView textView = this.f12007e;
                if (textView != null) {
                    textView.setText(((C4193l) C4116c.m10249a(C4193l.class)).parsePatternAndGetSpannable(gVar, ""));
                }
            }
            List<C8810a> list = aVar.f24045c;
            C52711k.m112236a((Object) list, "rewardList.firstChargeRewards");
            if (!list.isEmpty()) {
                List<C8810a> list2 = aVar.f24045c;
                C52711k.m112236a((Object) list2, "rewardList.firstChargeRewards");
                int i2 = 0;
                for (Object next : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C52575l.m112100b();
                    }
                    C8810a aVar2 = (C8810a) next;
                    View inflate = getLayoutInflater().inflate(this.f12005b, this.f12008f, false);
                    C52711k.m112236a((Object) inflate, "itemReward");
                    C4386b bVar = new C4386b(inflate);
                    C52711k.m112236a((Object) aVar2, "reward");
                    if (i2 == aVar.f24045c.size() - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C52711k.m112240b(aVar2, "reward");
                    View view2 = bVar.f12012c;
                    if (z) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    view2.setVisibility(i);
                    ImageModel imageModel2 = aVar2.f24047b;
                    if (imageModel2 != null) {
                        C5213c.m11814a(bVar.f12010a, imageModel2);
                    }
                    C8851g gVar2 = aVar2.f24046a;
                    if (gVar2 != null) {
                        bVar.f12011b.setText(((C4193l) C4116c.m10249a(C4193l.class)).parsePatternAndGetSpannable(gVar2, ""));
                    }
                    LinearLayout linearLayout = this.f12008f;
                    if (linearLayout != null) {
                        linearLayout.addView(inflate);
                    }
                    i2 = i3;
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(this.f12004a, viewGroup, false);
    }
}
