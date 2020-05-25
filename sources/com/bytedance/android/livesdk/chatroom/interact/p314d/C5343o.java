package com.bytedance.android.livesdk.chatroom.interact.p314d;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5306g.C5308b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5309h.C5311b;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5321l.C5323b;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5405aq;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.widget.WheelPicker;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.d.o */
public final class C5343o extends C5311b {

    /* renamed from: e */
    private WheelPicker f14220e;

    /* renamed from: f */
    private Button f14221f;

    /* renamed from: g */
    private C5308b f14222g;

    /* renamed from: h */
    private int[] f14223h = {120, 300, 600, 900};

    /* renamed from: i */
    private int f14224i;

    /* renamed from: c */
    public final float mo11150c() {
        return 144.0f;
    }

    /* renamed from: b */
    public final String mo11149b() {
        return getString(R.string.ela);
    }

    /* renamed from: d */
    public final View mo11151d() {
        return this.f14146a.mo11095b();
    }

    public C5343o() {
        if (((Boolean) LiveConfigSettingKeys.PK_TEST_TIME.mo9431a()).booleanValue()) {
            this.f14223h = new int[]{10, 120, 300, 600, 900};
        }
    }

    /* renamed from: e */
    public final View mo11152e() {
        if (this.f14221f == null) {
            this.f14221f = new Button(getContext());
            this.f14221f.setLayoutParams(new LayoutParams((int) C9432q.m18687b(getContext(), 32.0f), (int) C9432q.m18687b(getContext(), 32.0f)));
            this.f14221f.setBackgroundResource(R.drawable.bpc);
            this.f14221f.setOnClickListener(new C5344p(this));
        }
        return this.f14221f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11256a(View view) {
        int currentItemPosition = this.f14220e.getCurrentItemPosition();
        if (currentItemPosition >= 0 && currentItemPosition < this.f14223h.length) {
            this.f14222g.mo11186a(this.f14223h[currentItemPosition], currentItemPosition);
            this.f14146a.mo11093a();
        }
    }

    /* renamed from: a */
    public static C5343o m12129a(C5323b bVar, C5308b bVar2, int i) {
        C5343o oVar = new C5343o();
        oVar.f14148c = new C5405aq(oVar);
        oVar.f14146a = bVar;
        oVar.f14222g = bVar2;
        oVar.f14224i = i;
        return oVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f14223h) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("s");
            arrayList.add(sb.toString());
        }
        if (this.f14224i < 0 || this.f14224i >= arrayList.size()) {
            this.f14224i = 1;
        }
        this.f14220e = new WheelPicker(getContext());
        this.f14220e.setData(arrayList);
        this.f14220e.setIndicator(true);
        this.f14220e.setIndicatorSize(3);
        this.f14220e.setItemTextSize((int) C9432q.m18687b(getContext(), 16.0f));
        this.f14220e.setSelectItemTextSize((int) C9432q.m18687b(getContext(), 18.0f));
        this.f14220e.setItemTextColor(Color.parseColor("#a0404040"));
        this.f14220e.setSelectedItemTextColor(Color.parseColor("#404040"));
        this.f14220e.setBackgroundColor(Color.parseColor("#f7f7f7"));
        this.f14220e.mo14896a(this.f14224i, false);
        return this.f14220e;
    }
}
