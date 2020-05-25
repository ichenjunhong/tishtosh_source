package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.ss.android.ugc.trill.R;

public class TopRankListAnchorView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f22491a;

    /* renamed from: b */
    private TextView f22492b;

    /* renamed from: c */
    private ImageView f22493c;

    /* renamed from: d */
    private TextView f22494d;

    /* renamed from: e */
    private TextView f22495e;

    /* renamed from: f */
    private View f22496f;

    /* renamed from: a */
    private void m16315a() {
        inflate(getContext(), R.layout.arr, this);
        this.f22491a = (ImageView) findViewById(R.id.d3a);
        this.f22492b = (TextView) findViewById(R.id.d3d);
        this.f22493c = (ImageView) findViewById(R.id.d3o);
        this.f22494d = (TextView) findViewById(R.id.d3r);
        this.f22496f = findViewById(R.id.d3h);
        this.f22495e = (TextView) findViewById(R.id.d3_);
    }

    public TopRankListAnchorView(Context context) {
        super(context);
        m16315a();
    }

    private void setDouyinRankStyle(C8219f fVar) {
        Object obj;
        if (fVar != null && getContext() != null) {
            this.f22491a.setVisibility(8);
            this.f22492b.setVisibility(0);
            if (fVar.f22444c <= 0) {
                this.f22492b.setText(getContext().getResources().getString(R.string.enr));
                this.f22492b.setTextSize(1, 10.0f);
            } else {
                TextView textView = this.f22492b;
                if (fVar.f22444c > 99) {
                    obj = "99+";
                } else {
                    obj = Integer.valueOf(fVar.f22444c);
                }
                textView.setText(String.valueOf(obj));
                this.f22492b.setTextSize(1, 15.0f);
            }
            switch (fVar.f22444c) {
                case 1:
                    this.f22492b.setTextColor(getContext().getResources().getColor(R.color.b36));
                    return;
                case 2:
                    this.f22492b.setTextColor(getContext().getResources().getColor(R.color.b37));
                    return;
                case 3:
                    this.f22492b.setTextColor(getContext().getResources().getColor(R.color.b38));
                    return;
                default:
                    this.f22492b.setTextColor(getContext().getResources().getColor(R.color.b39));
                    return;
            }
        }
    }

    public TopRankListAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m16315a();
    }

    public TopRankListAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m16315a();
    }

    /* renamed from: a */
    public final void mo14382a(C8219f fVar, OnClickListener onClickListener, boolean z) {
        boolean z2;
        int i;
        float f;
        Object obj;
        if (fVar != null) {
            if (fVar.f22444c > 0 || getContext() == null) {
                switch (fVar.f22444c) {
                    case 1:
                        this.f22491a.setImageResource(R.drawable.c0z);
                        this.f22491a.setVisibility(0);
                        this.f22492b.setVisibility(8);
                        break;
                    case 2:
                        this.f22491a.setImageResource(R.drawable.c10);
                        this.f22491a.setVisibility(0);
                        this.f22492b.setVisibility(8);
                        break;
                    case 3:
                        this.f22491a.setImageResource(R.drawable.c11);
                        this.f22491a.setVisibility(0);
                        this.f22492b.setVisibility(8);
                        break;
                    default:
                        TextView textView = this.f22492b;
                        if (fVar.f22444c > 99) {
                            obj = "99+";
                        } else {
                            obj = Integer.valueOf(fVar.f22444c);
                        }
                        textView.setText(String.valueOf(obj));
                        this.f22492b.setVisibility(0);
                        this.f22491a.setVisibility(8);
                        break;
                }
            } else {
                this.f22492b.setText(getContext().getResources().getString(R.string.enr));
                this.f22492b.setVisibility(0);
                this.f22491a.setVisibility(8);
            }
            if (!(getContext() == null || getContext().getResources() == null)) {
                if (fVar.f22444c > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                TextView textView2 = this.f22492b;
                Resources resources = getContext().getResources();
                if (z2) {
                    i = R.color.alm;
                } else {
                    i = R.color.aln;
                }
                textView2.setTextColor(resources.getColor(i));
                TextView textView3 = this.f22492b;
                if (z2) {
                    f = 20.0f;
                } else {
                    f = 12.0f;
                }
                textView3.setTextSize(1, f);
            }
            User user = fVar.f22442a;
            if (user != null) {
                C5213c.m11826b(this.f22493c, user.getAvatarThumb(), this.f22493c.getWidth(), this.f22493c.getHeight(), R.drawable.bt6);
                this.f22494d.setText(user.getNickName());
            }
            if (!TextUtils.isEmpty(fVar.f22445d)) {
                this.f22495e.setText(fVar.f22445d);
            } else {
                this.f22495e.setVisibility(8);
            }
            if (z) {
                this.f22496f.setVisibility(8);
            } else {
                this.f22496f.setOnClickListener(onClickListener);
            }
            setVisibility(0);
        }
    }

    public TopRankListAnchorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m16315a();
    }
}
