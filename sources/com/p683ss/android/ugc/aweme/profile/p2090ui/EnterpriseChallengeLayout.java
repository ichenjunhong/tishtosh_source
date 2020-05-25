package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.EnterpriseChallengeLayout */
public class EnterpriseChallengeLayout extends LinearLayout {

    /* renamed from: a */
    View f102082a;

    /* renamed from: b */
    TextView f102083b;

    /* renamed from: c */
    RecyclerView f102084c;

    /* renamed from: d */
    List<Challenge> f102085d;

    public EnterpriseChallengeLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public EnterpriseChallengeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EnterpriseChallengeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f102085d = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.tq, this);
        setOrientation(1);
        this.f102082a = findViewById(R.id.a6f);
        this.f102083b = (TextView) findViewById(R.id.ab3);
        this.f102084c = (RecyclerView) findViewById(R.id.ab2);
        this.f102084c.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
        this.f102084c.mo4798a((C1331h) new C1331h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                if (recyclerView.getAdapter() != null && RecyclerView.m4275f(view) < recyclerView.getAdapter().getItemCount() - 1) {
                    rect.right = (int) C9432q.m18687b(recyclerView.getContext(), 4.0f);
                }
            }
        });
    }
}
