package com.bytedance.android.livesdk.gift.dialog.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.ss.android.ugc.trill.R;

public class LiveSendGiftAnimationView extends FrameLayout {

    /* renamed from: a */
    Pair<Float, Animator> f19741a;

    /* renamed from: b */
    TextView f19742b;

    /* renamed from: c */
    private Context f19743c;

    /* renamed from: d */
    private HSImageView f19744d;

    /* renamed from: e */
    private TextView f19745e;

    /* renamed from: f */
    private GiftViewModel f19746f;

    public void setViewModel(GiftViewModel giftViewModel) {
        this.f19746f = giftViewModel;
    }

    public LiveSendGiftAnimationView(Context context) {
        this(context, null);
    }

    public LiveSendGiftAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveSendGiftAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19743c = context;
        View.inflate(this.f19743c, R.layout.bvn, this);
        this.f19744d = (HSImageView) findViewById(R.id.e_p);
        this.f19742b = (TextView) findViewById(R.id.a5f);
        this.f19745e = (TextView) findViewById(R.id.ckz);
    }

    /* renamed from: a */
    public final void mo13506a(ImageModel imageModel, String str, int i, String str2) {
        C5213c.m11820a(this.f19744d, imageModel);
        this.f19742b.setText(str);
        this.f19742b.setTextColor(i);
        this.f19745e.setText(str2);
    }
}
