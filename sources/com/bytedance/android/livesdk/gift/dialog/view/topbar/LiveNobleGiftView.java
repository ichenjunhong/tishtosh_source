package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.ss.android.ugc.trill.R;

public class LiveNobleGiftView extends FrameLayout {

    /* renamed from: a */
    private HSImageView f19808a;

    /* renamed from: b */
    private TextView f19809b;

    /* renamed from: c */
    private HSImageView f19810c;

    /* renamed from: d */
    private TextView f19811d;

    public LiveNobleGiftView(Context context) {
        this(context, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13521a(com.bytedance.android.livesdk.gift.dialog.viewmodel.C7290b r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.bytedance.android.livesdk.gift.model.GiftPage r10 = r10.mo13540a()
            if (r10 == 0) goto L_0x00bc
            int r1 = r10.pageType
            r2 = 4
            if (r1 == r2) goto L_0x0011
            goto L_0x00bc
        L_0x0011:
            com.bytedance.android.livesdk.gift.model.GiftOperation r1 = r10.operation
            r2 = 8
            if (r1 != 0) goto L_0x0026
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.f19808a
            r1.setVisibility(r2)
            com.bytedance.android.live.core.widget.HSImageView r1 = r9.f19810c
            r1.setVisibility(r2)
            android.widget.TextView r1 = r9.f19809b
            r1.setVisibility(r2)
        L_0x0026:
            java.lang.Class<com.bytedance.android.live.user.a> r1 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
            com.bytedance.android.live.user.a r1 = (com.bytedance.android.live.user.C4282a) r1
            com.bytedance.android.livesdk.user.e r1 = r1.user()
            boolean r1 = r1.mo14532c()
            r3 = 1
            if (r1 == 0) goto L_0x0065
            java.lang.Class<com.bytedance.android.live.user.a> r1 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
            com.bytedance.android.live.user.a r1 = (com.bytedance.android.live.user.C4282a) r1
            com.bytedance.android.livesdk.user.e r1 = r1.user()
            com.bytedance.android.live.base.model.user.i r1 = r1.mo14521a()
            com.bytedance.android.live.base.model.user.User r1 = com.bytedance.android.live.base.model.user.User.from(r1)
            if (r1 == 0) goto L_0x0065
            com.bytedance.android.live.base.model.user.NobleLevelInfo r4 = r1.getNobleLevelInfo()
            if (r4 == 0) goto L_0x0065
            com.bytedance.android.live.base.model.user.NobleLevelInfo r1 = r1.getNobleLevelInfo()
            long r4 = r1.getNobleLevel()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            android.widget.TextView r4 = r9.f19811d
            if (r1 == 0) goto L_0x006e
            r1 = 2132550399(0x7f1c22ff, float:2.0754128E38)
            goto L_0x0071
        L_0x006e:
            r1 = 2132550398(0x7f1c22fe, float:2.0754126E38)
        L_0x0071:
            r4.setText(r1)
            com.bytedance.android.livesdk.gift.model.GiftOperation r10 = r10.operation
            com.bytedance.android.live.base.model.ImageModel r1 = r10.leftImage
            java.lang.String r4 = r10.title
            java.lang.String r5 = r10.titleColor
            int r6 = r10.titleSize
            java.lang.String r7 = r10.schemeUrl
            com.bytedance.android.live.core.widget.HSImageView r8 = r9.f19808a
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11820a(r8, r1)
            android.widget.TextView r8 = r9.f19809b
            r8.setText(r4)
            android.widget.TextView r8 = r9.f19809b     // Catch:{ IllegalArgumentException -> 0x0093 }
            int r5 = android.graphics.Color.parseColor(r5)     // Catch:{ IllegalArgumentException -> 0x0093 }
            r8.setTextColor(r5)     // Catch:{ IllegalArgumentException -> 0x0093 }
        L_0x0093:
            android.widget.TextView r5 = r9.f19809b
            float r6 = (float) r6
            r5.setTextSize(r6)
            android.widget.TextView r5 = r9.f19809b
            com.bytedance.android.livesdk.gift.dialog.view.topbar.f r6 = new com.bytedance.android.livesdk.gift.dialog.view.topbar.f
            r6.<init>(r9, r7, r10)
            r5.setOnClickListener(r6)
            com.bytedance.android.live.core.widget.HSImageView r10 = r9.f19808a
            if (r1 == 0) goto L_0x00a9
            r1 = 0
            goto L_0x00ab
        L_0x00a9:
            r1 = 8
        L_0x00ab:
            r10.setVisibility(r1)
            android.widget.TextView r10 = r9.f19809b
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x00b8
            r0 = 8
        L_0x00b8:
            r10.setVisibility(r0)
            return r3
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.dialog.view.topbar.LiveNobleGiftView.mo13521a(com.bytedance.android.livesdk.gift.dialog.viewmodel.b):boolean");
    }

    public LiveNobleGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveNobleGiftView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.bxf, this);
        this.f19811d = (TextView) findViewById(R.id.bra);
        this.f19808a = (HSImageView) findViewById(R.id.bv2);
        this.f19809b = (TextView) findViewById(R.id.bv6);
        this.f19810c = (HSImageView) findViewById(R.id.bv5);
    }
}
