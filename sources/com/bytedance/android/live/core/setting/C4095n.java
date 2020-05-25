package com.bytedance.android.live.core.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.live.core.setting.n */
final /* synthetic */ class C4095n implements OnClickListener {

    /* renamed from: a */
    private final C40911 f11262a;

    /* renamed from: b */
    private final String[] f11263b;

    /* renamed from: c */
    private final C4097p f11264c;

    /* renamed from: d */
    private final int f11265d;

    C4095n(C40911 r1, String[] strArr, C4097p pVar, int i) {
        this.f11262a = r1;
        this.f11263b = strArr;
        this.f11264c = pVar;
        this.f11265d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C40911 r0 = this.f11262a;
        String[] strArr = this.f11263b;
        C4097p pVar = this.f11264c;
        int i2 = this.f11265d;
        if (i >= 0) {
            if (i == strArr.length) {
                C4098q.m10219a(pVar, null);
            } else {
                C4098q.m10219a(pVar, strArr[i].split(":")[0]);
            }
            r0.notifyItemChanged(i2);
        }
        dialogInterface.dismiss();
    }
}
