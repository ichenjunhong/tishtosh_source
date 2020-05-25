package com.bytedance.android.livesdk.feed.p341i;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.feed.i.b */
final /* synthetic */ class C6973b implements OnLongClickListener {

    /* renamed from: a */
    private final C6959a f19062a;

    C6973b(C6959a aVar) {
        this.f19062a = aVar;
    }

    public final boolean onLongClick(View view) {
        C6959a aVar = this.f19062a;
        Room room = aVar.f19045j;
        boolean z = false;
        if (!(room == null || room.getOwner() == null)) {
            int[] iArr = new int[2];
            aVar.itemView.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            View view2 = (View) aVar.itemView.getParent();
            view2.getLocationInWindow(iArr2);
            int a = C3922z.m9899a(78.0f);
            int max = Math.max(0, iArr2[1] - iArr[1]);
            int height = (aVar.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + aVar.itemView.getHeight()) - iArr2[1]) - view2.getHeight());
            float f = ((float) a) / 2.0f;
            if (((float) height) >= (((float) aVar.itemView.getHeight()) / 2.0f) + f) {
                View inflate = View.inflate(aVar.itemView.getContext(), R.layout.aod, null);
                View findViewById = inflate.findViewById(R.id.a5z);
                ((LayoutParams) findViewById.getLayoutParams()).topMargin = (int) (((((float) aVar.itemView.getHeight()) / 2.0f) - f) - ((float) max));
                PopupWindow popupWindow = new PopupWindow(inflate, aVar.itemView.getWidth(), height, true);
                inflate.setOnClickListener(new C6978g(popupWindow));
                findViewById.setOnClickListener(new C6979h(aVar, room, popupWindow));
                popupWindow.showAtLocation(aVar.itemView, 51, iArr[0], iArr[1] + max);
                z = true;
            }
        }
        if (z) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return z;
    }
}
