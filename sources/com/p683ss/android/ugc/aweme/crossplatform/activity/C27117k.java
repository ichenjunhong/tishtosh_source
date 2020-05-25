package com.p683ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.crossplatform.p1615c.p1616a.C27187c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.k */
final class C27117k {

    /* renamed from: a */
    View f71533a;

    /* renamed from: b */
    View f71534b;

    /* renamed from: c */
    View f71535c;

    /* renamed from: d */
    List<Integer> f71536d;

    /* renamed from: e */
    Activity f71537e;

    /* renamed from: f */
    C27114h f71538f;

    /* renamed from: g */
    private PopupWindow f71539g;

    /* renamed from: h */
    private OnClickListener f71540h = new C27118l(this);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PopupWindow mo55429a() {
        if (this.f71539g == null) {
            View inflate = LayoutInflater.from(this.f71537e).inflate(R.layout.b80, null, false);
            this.f71533a = inflate.findViewById(R.id.f133595cat);
            this.f71534b = inflate.findViewById(R.id.a0m);
            this.f71535c = inflate.findViewById(R.id.buz);
            this.f71533a.setOnClickListener(this.f71540h);
            this.f71534b.setOnClickListener(this.f71540h);
            this.f71535c.setOnClickListener(this.f71540h);
            this.f71539g = new PopupWindow(inflate, -2, -2, true);
            this.f71539g.setTouchable(true);
            this.f71539g.setAnimationStyle(R.style.a54);
            this.f71539g.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.f71539g;
    }

    C27117k(Activity activity, C27114h hVar) {
        this.f71537e = activity;
        this.f71538f = hVar;
        mo55429a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo55430a(String str, int i) {
        if (!C9431p.m18664a(str)) {
            int i2 = -1;
            C27187c[] values = C27187c.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                C27187c cVar = values[i3];
                if (TextUtils.equals(str, cVar.key)) {
                    i2 = cVar.f71729id;
                    break;
                }
                i3++;
            }
            if (i2 > 0) {
                C9432q.m18691b(this.f71537e.findViewById(i2), 8);
                if (this.f71536d == null) {
                    this.f71536d = new ArrayList();
                }
                if (!this.f71536d.contains(Integer.valueOf(i2))) {
                    this.f71536d.add(Integer.valueOf(i2));
                }
            }
        }
    }
}
