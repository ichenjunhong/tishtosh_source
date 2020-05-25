package com.bytedance.android.livesdk.feed.p341i;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import com.bytedance.android.live.core.p230g.C3922z;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.i.y */
final /* synthetic */ class C7003y implements OnLongClickListener {

    /* renamed from: a */
    private final C6997t f19139a;

    C7003y(C6997t tVar) {
        this.f19139a = tVar;
    }

    public final boolean onLongClick(View view) {
        C6997t tVar = this.f19139a;
        int[] iArr = new int[2];
        tVar.itemView.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        View view2 = (View) tVar.itemView.getParent();
        view2.getLocationInWindow(iArr2);
        int a = C3922z.m9899a(78.0f);
        boolean z = false;
        int max = Math.max(0, iArr2[1] - iArr[1]);
        int height = (tVar.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + tVar.itemView.getHeight()) - iArr2[1]) - view2.getHeight());
        float f = ((float) a) / 2.0f;
        if (((float) height) >= (((float) tVar.itemView.getHeight()) / 2.0f) + f) {
            View inflate = View.inflate(tVar.itemView.getContext(), R.layout.aod, null);
            View findViewById = inflate.findViewById(R.id.a5z);
            ((LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) tVar.itemView.getHeight()) / 2.0f) - f) - ((float) max));
            PopupWindow popupWindow = new PopupWindow(inflate, tVar.itemView.getWidth(), height, true);
            inflate.setOnClickListener(new C6964ae(popupWindow));
            findViewById.setOnClickListener(new C7001w(tVar, popupWindow));
            popupWindow.showAtLocation(tVar.itemView, 51, iArr[0], iArr[1] + max);
            z = true;
        }
        if (z) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return z;
    }
}
