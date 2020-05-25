package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.LiveTextView;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LoadingEmptyView */
public final class LoadingEmptyView extends FrameLayout {

    /* renamed from: a */
    private TextView f15569a;

    /* renamed from: b */
    private HashMap f15570b;

    public LoadingEmptyView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* renamed from: a */
    private View m12901a(int i) {
        if (this.f15570b == null) {
            this.f15570b = new HashMap();
        }
        View view = (View) this.f15570b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15570b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final LoadingEmptyView mo11844a(String str) {
        if (((LiveTextView) m12901a((int) R.id.bhh)) != null) {
            LiveTextView liveTextView = (LiveTextView) m12901a((int) R.id.bhh);
            C52711k.m112236a((Object) liveTextView, "loading_empty_text");
            liveTextView.setText(str);
        }
        return this;
    }

    /* renamed from: b */
    public final LoadingEmptyView mo11845b(String str) {
        LiveTextView liveTextView = (LiveTextView) m12901a((int) R.id.ekn);
        C52711k.m112236a((Object) liveTextView, "loading_empty_title");
        liveTextView.setText(str);
        LiveTextView liveTextView2 = (LiveTextView) m12901a((int) R.id.ekn);
        C52711k.m112236a((Object) liveTextView2, "loading_empty_title");
        liveTextView2.setVisibility(0);
        return this;
    }

    public LoadingEmptyView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.ao0, this, true);
        this.f15569a = (TextView) findViewById(R.id.ekm);
    }

    public /* synthetic */ LoadingEmptyView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
