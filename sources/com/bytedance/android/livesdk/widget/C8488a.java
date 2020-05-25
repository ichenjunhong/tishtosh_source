package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.p309e.C5081a;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.widget.a */
public class C8488a extends LinearLayout {

    /* renamed from: b */
    private static final String f23302b = "com.bytedance.android.livesdk.widget.a";

    /* renamed from: a */
    public boolean f23303a;

    /* renamed from: c */
    private ImageView f23304c = ((ImageView) findViewById(R.id.aqa));

    /* renamed from: d */
    private TextView f23305d = ((TextView) findViewById(R.id.ze));

    /* renamed from: e */
    private View f23306e = findViewById(R.id.bu6);

    private int getLayoutResource() {
        return R.layout.aom;
    }

    public C8488a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
    }

    public void setAbsActionMessage(C5084b<?> bVar) {
        if (bVar instanceof C5081a) {
            C5081a aVar = (C5081a) bVar;
            if (aVar.mo10975a() != null) {
                C5213c.m11816a(this.f23304c, aVar.mo10975a(), this.f23304c.getWidth(), this.f23304c.getHeight());
            } else if (aVar.mo10977b() > 0) {
                this.f23304c.setImageResource(aVar.mo10977b());
            } else {
                this.f23304c.setBackgroundResource(R.drawable.bxv);
            }
            if (!TextUtils.isEmpty(aVar.mo10989n())) {
                this.f23305d.setText(aVar.mo10989n());
            } else {
                this.f23305d.setText("");
            }
            if (!TextUtils.isEmpty(aVar.mo10982g())) {
                try {
                    ((GradientDrawable) this.f23306e.getBackground()).setColor(Color.parseColor(aVar.mo10982g()));
                } catch (Exception unused) {
                }
            }
            this.f23303a = true;
        }
    }
}
