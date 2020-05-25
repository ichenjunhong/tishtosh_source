package com.p683ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.GridView;
import com.p683ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.k */
final /* synthetic */ class C29353k implements OnTouchListener {

    /* renamed from: a */
    private final C29351i f76876a;

    /* renamed from: b */
    private final List f76877b;

    /* renamed from: c */
    private final GridView f76878c;

    /* renamed from: d */
    private final List f76879d;

    /* renamed from: e */
    private final SwipeControlledViewPager f76880e;

    C29353k(C29351i iVar, List list, GridView gridView, List list2, SwipeControlledViewPager swipeControlledViewPager) {
        this.f76876a = iVar;
        this.f76877b = list;
        this.f76878c = gridView;
        this.f76879d = list2;
        this.f76880e = swipeControlledViewPager;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C29351i iVar = this.f76876a;
        List list = this.f76877b;
        GridView gridView = this.f76878c;
        List list2 = this.f76879d;
        SwipeControlledViewPager swipeControlledViewPager = this.f76880e;
        switch (motionEvent.getAction()) {
            case 0:
                iVar.f76861c = System.currentTimeMillis();
                iVar.f76860b = 0;
                iVar.f76863e = System.currentTimeMillis();
                iVar.f76859a = motionEvent.getX();
                list.clear();
                iVar.f76866h = motionEvent.getX();
                iVar.f76867i = motionEvent.getY();
                for (int i = 0; i < gridView.getChildCount(); i++) {
                    list.add(gridView.getChildAt(i));
                }
                iVar.f76865g.removeCallbacksAndMessages(null);
                Handler handler = iVar.f76865g;
                C29354l lVar = new C29354l(iVar, list, list2, view, swipeControlledViewPager);
                handler.postDelayed(lVar, 500);
                break;
            case 1:
            case 3:
                iVar.f76865g.removeCallbacksAndMessages(null);
                if (iVar.f76868j != null && iVar.f76868j.isShowing()) {
                    iVar.f76868j.dismiss();
                }
                if (iVar.f76864f >= 0) {
                    View findViewById = ((View) list.get(iVar.f76864f)).findViewById(R.id.a_s);
                    if (findViewById != null) {
                        findViewById.setBackground(new ColorDrawable(0));
                    }
                }
                iVar.f76864f = -1;
                iVar.f76862d = true;
                swipeControlledViewPager.setSwipeEnabled(true);
                iVar.f76863e = 0;
                iVar.f76860b = System.currentTimeMillis() - iVar.f76861c;
                break;
            case 2:
                iVar.mo59296a(motionEvent.getX(), motionEvent.getY(), list, list2, view, swipeControlledViewPager);
                break;
        }
        return iVar.f76860b >= 500;
    }
}
