package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.poi.widget.MerchantAvatarImageView;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.GotCouponDialog */
public class GotCouponDialog extends Dialog {

    /* renamed from: a */
    C39302a f100454a;
    MerchantAvatarImageView avatarImageView;

    /* renamed from: b */
    private boolean f100455b;
    RemoteImageView headImageIv;
    ImageView headImageIvBg;
    DmtTextView merchantNameTv;
    TextView tvCongrats;
    TextView tvISee;
    DmtTextView tvTitle;
    View vMask;

    public GotCouponDialog(Activity activity) {
        super(activity, R.style.a7i);
    }

    /* renamed from: a */
    public final void mo80119a(C39302a aVar) {
        m87368b(aVar);
        show();
    }

    /* renamed from: b */
    private void m87368b(C39302a aVar) {
        this.f100454a = aVar;
        if (this.f100455b) {
            C25687b bVar = aVar.f100478b;
            C23515d.m57669a(this.headImageIv, bVar.getHeadImageUrl());
            C23515d.m57669a((RemoteImageView) this.avatarImageView, bVar.getLogoImageUrl());
            if (bVar.isDefaultHeadImage()) {
                this.headImageIvBg.setVisibility(8);
            } else {
                this.headImageIvBg.setVisibility(0);
            }
            this.merchantNameTv.setText(bVar.getMerchantName());
            this.tvTitle.setText(bVar.getTitle());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bmj);
        this.f100455b = true;
        ButterKnife.bind((Dialog) this);
        float dimensionPixelOffset = (float) getContext().getResources().getDimensionPixelOffset(R.dimen.a0q);
        ((C13833a) this.headImageIv.getHierarchy()).mo25899a(C13837e.m28114b(dimensionPixelOffset, dimensionPixelOffset, 0.0f, 0.0f));
        ((C13833a) this.headImageIv.getHierarchy()).mo25897a((Drawable) new ColorDrawable(C0726c.m2098c(getContext(), R.color.ju)), C13818b.f36067g);
        this.vMask.setBackground(C23729p.m58252a(Orientation.TOP_BOTTOM, 0, C0726c.m2098c(getContext(), R.color.de)));
        this.tvTitle.setFontType("");
        this.merchantNameTv.setFontType(C10751d.f28903b);
        this.tvISee.setBackground(C23729p.m58249a(C0726c.m2098c(getContext(), R.color.z_), (float) C23728o.m58241a(2.0d)));
        this.tvISee.setOnClickListener(new C39311d(this));
        C47795d.m103429a(this.tvISee);
        if (this.f100454a != null) {
            m87368b(this.f100454a);
        }
    }
}
