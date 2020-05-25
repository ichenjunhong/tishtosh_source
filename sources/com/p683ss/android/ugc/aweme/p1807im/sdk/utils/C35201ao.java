package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ao */
public final class C35201ao {
    /* renamed from: a */
    public static void m79579a(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy_im_label", str));
    }

    /* renamed from: a */
    public static int[] m79580a(View view, View view2) {
        boolean z;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int b = C9432q.m18688b(view.getContext());
        int a = C9432q.m18670a(view.getContext());
        view2.measure(0, 0);
        int measuredHeight = view2.getMeasuredHeight();
        int measuredWidth = view2.getMeasuredWidth();
        if (b / 2 < iArr2[1]) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iArr[1] = iArr2[1] - measuredHeight;
        } else {
            iArr[1] = iArr2[1] + height;
        }
        iArr[0] = (a - measuredWidth) / 2;
        return iArr;
    }

    /* renamed from: a */
    public static PopupWindow m79578a(Context context, int i, View view) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.rj, null);
        int b = (int) C9432q.m18687b(context, 100.0f);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setWidth(b);
        popupWindow.setAnimationStyle(R.style.a5x);
        popupWindow.setBackgroundDrawable(new ColorDrawable(context.getResources().getColor(R.color.d9)));
        popupWindow.setContentView(inflate);
        popupWindow.setTouchable(true);
        return popupWindow;
    }
}
