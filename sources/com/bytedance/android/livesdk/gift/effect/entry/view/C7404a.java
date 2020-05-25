package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.i18n.C4132a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7394a;
import com.bytedance.android.livesdk.message.model.C7835bj.C7836a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.a */
public final class C7404a extends ConstraintLayout {

    /* renamed from: h */
    TextView f20277h = ((TextView) findViewById(R.id.a4o));

    /* renamed from: i */
    public HSImageView f20278i = ((HSImageView) findViewById(R.id.fh));

    /* renamed from: j */
    private HSImageView f20279j = ((HSImageView) findViewById(R.id.hx));

    /* renamed from: k */
    private HSImageView f20280k = ((HSImageView) findViewById(R.id.ap9));

    /* renamed from: l */
    private BaseLightView f20281l = ((BaseLightView) findViewById(R.id.jk));

    private int getLayoutResource() {
        return R.layout.arv;
    }

    /* renamed from: c */
    public final void mo13692c() {
        this.f20281l.mo13663a();
    }

    /* renamed from: b */
    public final void mo13691b() {
        int i;
        boolean z = false;
        if (this.f20277h.getLayout() != null) {
            i = ((int) this.f20277h.getLayout().getLineWidth(0)) - ((this.f20277h.getWidth() - this.f20277h.getCompoundPaddingRight()) - this.f20277h.getCompoundPaddingLeft());
            if (i > 0) {
                z = true;
            }
        } else {
            i = 0;
        }
        if (z) {
            this.f20277h.post(new C7405b(this, i));
        }
    }

    public C7404a(Context context) {
        super(context);
        inflate(context, getLayoutResource(), this);
        if (!C4206c.m10426a(getContext()) && VERSION.SDK_INT >= 17) {
            this.f20277h.setTextDirection(3);
        }
        this.f20278i.setVisibility(4);
    }

    public final void setUI(C7394a aVar) {
        boolean z;
        String str;
        if (aVar.f20187e != null) {
            C5213c.m11815a((ImageView) this.f20279j, aVar.f20187e, (int) R.drawable.bt6);
        }
        if (aVar.f20188f != null) {
            C3899m.m9868b(this.f20280k, aVar.f20188f);
        } else {
            this.f20280k.setVisibility(8);
        }
        if (aVar.f20195m != null) {
            if (aVar.f20195m.f21649c != null) {
                if (aVar.f20195m.f21649c.f24155a == null || TextUtils.isEmpty(((C4132a) C4116c.m10249a(C4132a.class)).getI18nString(aVar.f20195m.f21649c.f24155a))) {
                    str = aVar.f20195m.f21649c.f24156b;
                } else {
                    str = ((C4132a) C4116c.m10249a(C4132a.class)).getI18nString(aVar.f20195m.f21649c.f24155a);
                }
                this.f20277h.setText(((C4193l) C4116c.m10249a(C4193l.class)).parsePatternAndGetSpannable(str, aVar.f20195m.f21649c).toString());
            }
            C7836a aVar2 = aVar.f20195m;
            if (aVar2 == null || (!(aVar2.f21647a == 5 || aVar2.f21647a == 7) || aVar.f20196n == null)) {
                z = false;
            } else {
                z = true;
            }
            if (z || aVar.f20195m.f21648b == null) {
                this.f20278i.setVisibility(8);
            } else {
                C3899m.m9868b(this.f20278i, aVar.f20195m.f21648b);
            }
        }
    }
}
