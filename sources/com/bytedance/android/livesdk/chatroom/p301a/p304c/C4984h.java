package com.bytedance.android.livesdk.chatroom.p301a.p304c;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.p683ss.ugc.live.barrage.p2602a.C51605c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.c.h */
public final class C4984h {

    /* renamed from: a */
    public final C51605c f13366a;

    /* renamed from: b */
    private final View f13367b;

    public C4984h(View view, float f, float f2, C8001m mVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        this.f13367b = view;
        if (mVar == null || mVar.f21870c == null || TTLiveSDKContext.getHostService().mo10315h().mo14529b() != mVar.f21870c.getId()) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = (TextView) view.findViewById(R.id.d8j);
        if (!(mVar == null || mVar.f21869b == null)) {
            textView.setText(mVar.f21869b);
        }
        textView.setTextSize(1, f);
        textView.setAlpha(f2);
        if (view.getContext() == null || view.getContext().getResources() == null) {
            i = -1;
        } else {
            Resources resources = view.getContext().getResources();
            if (z) {
                i3 = R.color.akp;
            } else {
                i3 = R.color.alt;
            }
            i = resources.getColor(i3);
        }
        if (!(mVar == null || mVar.f21870c == null)) {
            NobleLevelInfo nobleLevelInfo = mVar.f21870c.getNobleLevelInfo();
            if (nobleLevelInfo != null && nobleLevelInfo.getNobleLevel() > 0) {
                try {
                    i2 = Color.parseColor(mVar.f21873f);
                } catch (Exception unused) {
                    i2 = -1;
                }
                if (z) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setStroke(C3922z.m9899a(1.0f), i);
                    gradientDrawable.setCornerRadius((float) C3922z.m9899a(17.0f));
                    gradientDrawable.setColor(0);
                    this.f13367b.setBackgroundDrawable(gradientDrawable);
                }
            }
        }
        textView.setTextColor(i);
        this.f13366a = new C51605c(this.f13367b);
    }
}
