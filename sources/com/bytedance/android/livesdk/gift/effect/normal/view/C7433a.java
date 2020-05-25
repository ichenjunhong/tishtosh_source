package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.effect.normal.p372d.C7421b;
import com.bytedance.android.livesdk.gift.effect.normal.p373e.C7429b;
import com.bytedance.android.livesdk.gift.effect.p358a.C7327a;
import com.bytedance.android.livesdk.gift.p377g.C7456f;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.normal.view.a */
public final class C7433a extends ConstraintLayout {

    /* renamed from: h */
    ImageView f20372h = ((ImageView) findViewById(R.id.dm8));

    /* renamed from: i */
    ImageView f20373i = ((ImageView) findViewById(R.id.dm4));

    /* renamed from: j */
    ImageView f20374j = ((ImageView) findViewById(R.id.ap_));

    /* renamed from: k */
    ImageView f20375k = ((ImageView) findViewById(R.id.al1));

    /* renamed from: l */
    TextView f20376l = ((TextView) findViewById(R.id.dn7));

    /* renamed from: m */
    TextView f20377m = ((TextView) findViewById(R.id.akr));

    /* renamed from: n */
    TextView f20378n = ((TextView) findViewById(R.id.amj));

    /* renamed from: o */
    public C7327a f20379o;

    /* renamed from: p */
    private View f20380p = findViewById(R.id.jh);

    /* renamed from: q */
    private int f20381q;

    private int getLayoutResource() {
        return R.layout.ap5;
    }

    public final void setDrawingCacheListener(C7327a aVar) {
        this.f20379o = aVar;
    }

    public final void setOrientation(int i) {
        this.f20381q = i;
    }

    public C7433a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
    }

    public final void setUI(C7421b bVar) {
        String str;
        String str2;
        if (((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) {
            str = bVar.f20320l.displayId;
        } else if (((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion()) {
            str = bVar.f20320l.displayId;
        } else {
            str = bVar.f20320l.getNickName();
        }
        TextView textView = this.f20376l;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = this.f20377m;
        if (TextUtils.isEmpty(bVar.f20319k)) {
            str2 = "";
        } else {
            str2 = bVar.f20319k;
        }
        textView2.setText(str2);
        if (bVar.f20324a > 1) {
            this.f20378n.setText(String.valueOf(bVar.f20324a));
            this.f20378n.setVisibility(0);
        } else {
            this.f20378n.setVisibility(8);
        }
        if (!(bVar.f20320l == null || bVar.f20320l.getAvatarThumb() == null)) {
            m15341a(this.f20372h, bVar.f20320l.getAvatarThumb());
        }
        if (!(bVar.f20320l == null || bVar.f20320l.getUserHonor() == null)) {
            m15341a(this.f20374j, bVar.f20320l.getUserHonor().mo8157l());
        }
        if (!(bVar.f20320l == null || bVar.f20320l.getBorder() == null || bVar.f20320l.getBorder().f8838a == null)) {
            m15341a(this.f20373i, bVar.f20320l.getBorder().f8838a);
        }
        if (bVar.f20328e != null) {
            m15342a(this.f20375k, bVar.f20328e, false);
        }
        this.f20380p.setBackgroundResource(C7456f.m15404a().mo13859a(bVar.f20323o * bVar.f20324a));
        invalidate();
    }

    /* renamed from: a */
    private void m15341a(ImageView imageView, ImageModel imageModel) {
        m15342a(imageView, imageModel, true);
    }

    /* renamed from: a */
    private void m15342a(final ImageView imageView, ImageModel imageModel, final boolean z) {
        ((C8794c) C4116c.m10249a(C8794c.class)).mo15490a(imageModel, (C8797c) new C8797c() {
            /* renamed from: a */
            public final void mo9146a(C8795a aVar) {
            }

            /* renamed from: a */
            public final void mo9145a(Bitmap bitmap) {
                Bitmap bitmap2;
                if (bitmap != null) {
                    if (z) {
                        bitmap2 = C7429b.m15316a(bitmap);
                    } else {
                        bitmap2 = C7429b.m15318b(bitmap);
                    }
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        imageView.setImageBitmap(bitmap2);
                        C7433a.this.invalidate();
                        if (C7433a.this.f20379o != null) {
                            C7433a.this.f20379o.updateDrawingCache(C7433a.this);
                        }
                    }
                }
            }
        });
    }
}
