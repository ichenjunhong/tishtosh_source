package com.p683ss.android.ugc.aweme.friends.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.friends.adapter.C32552x.C32554a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.z */
public final class C32556z extends C1352v {

    /* renamed from: a */
    TextView f84773a;

    /* renamed from: b */
    TextView f84774b;

    /* renamed from: c */
    AvatarImageWithVerify f84775c;

    /* renamed from: d */
    public String f84776d;

    /* renamed from: e */
    public int f84777e;

    /* renamed from: f */
    public C32554a f84778f;

    public C32556z(View view, String str, int i) {
        super(view);
        this.f84773a = (TextView) view.findViewById(R.id.dcn);
        this.f84774b = (TextView) view.findViewById(R.id.dg1);
        this.f84775c = (AvatarImageWithVerify) view.findViewById(R.id.ci3);
        this.f84776d = str;
        this.f84777e = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SpannableString mo65854a(SpannableString spannableString, int i, int i2) {
        if (TextUtils.isEmpty(spannableString)) {
            return spannableString;
        }
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getResources().getColor(R.color.a0y)), max, i2, 17);
        return spannableString;
    }
}
