package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareAwemeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ax */
public class C33775ax extends C33805c<ShareAwemeContent> {

    /* renamed from: A */
    private ImageView f87622A;

    /* renamed from: B */
    private TextView f87623B;

    /* renamed from: C */
    private View f87624C;

    /* renamed from: u */
    private RemoteImageView f87625u;

    /* renamed from: v */
    private TextView f87626v;

    /* renamed from: w */
    private TextView f87627w;

    /* renamed from: x */
    private RemoteImageView f87628x;

    /* renamed from: y */
    private TextView f87629y;

    /* renamed from: z */
    private ImageView f87630z;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo71782b() {
        super.mo71782b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87624C = this.itemView.findViewById(R.id.po);
        this.f87625u = (RemoteImageView) this.itemView.findViewById(R.id.zm);
        this.f87626v = (TextView) this.itemView.findViewById(R.id.zx);
        this.f87627w = (TextView) this.itemView.findViewById(R.id.zp);
        this.f87628x = (RemoteImageView) this.itemView.findViewById(R.id.zo);
        this.f87629y = (TextView) this.itemView.findViewById(R.id.zv);
        this.f87630z = (ImageView) this.itemView.findViewById(R.id.zy);
        this.f87622A = (ImageView) this.itemView.findViewById(R.id.a04);
        this.f87623B = (TextView) this.itemView.findViewById(R.id.a00);
        this.f87708j = (View) mo71845a((int) R.id.ze);
        View view = this.f87624C;
        if (view != null) {
            Drawable background = view.getBackground();
            if (background != null && VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87627w.setOnClickListener(onClickListener);
        this.f87625u.setOnClickListener(onClickListener);
        this.f87626v.setOnClickListener(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87627w, this.f87625u, this.f87626v, this.f87708j);
    }

    public C33775ax(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareAwemeContent shareAwemeContent, int i) {
        int i2;
        boolean z;
        super.mo71780a(pVar, pVar2, shareAwemeContent, i);
        int awemeType = shareAwemeContent.getAwemeType();
        if (awemeType == 0 || awemeType == 23) {
            this.f87622A.setVisibility(0);
            this.f87630z.setVisibility(8);
            this.f87627w.setVisibility(8);
            if (awemeType == 23) {
                this.f87629y.setVisibility(0);
            }
        } else {
            this.f87622A.setVisibility(8);
            this.f87630z.setVisibility(0);
            this.f87627w.setVisibility(0);
        }
        C23515d.m57669a(this.f87628x, shareAwemeContent.getCoverUrl());
        C23515d.m57669a(this.f87625u, shareAwemeContent.getContentThumb());
        this.f87626v.setText(shareAwemeContent.getContentName());
        String title = shareAwemeContent.getTitle();
        if (!TextUtils.isEmpty(title)) {
            this.f87623B.setText(title);
            this.f87623B.setVisibility(0);
        } else {
            this.f87623B.setVisibility(8);
        }
        if (awemeType == 0 || awemeType == 2) {
            IMUser a = C34010e.m77748a().mo71955a(shareAwemeContent.getUser(), shareAwemeContent.getSecUid(), true, (C34015a) null);
            if (a == null) {
                i2 = 0;
            } else {
                i2 = a.getFollowStatus();
            }
            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
            if (baseUserService_Monster != null) {
                z = TextUtils.equals(shareAwemeContent.getUser(), baseUserService_Monster.getCurrentUserID());
            } else {
                z = false;
            }
            if (i2 != 0 || z || !C34004b.m77718b().needAwemeMsgShowFollow()) {
                this.f87627w.setVisibility(8);
            } else {
                this.f87627w.setVisibility(0);
            }
        } else {
            this.f87627w.setVisibility(8);
        }
        if (awemeType == 0) {
            this.f87708j.setTag(50331648, Integer.valueOf(2));
            this.f87708j.setTag(67108864, shareAwemeContent.getItemId());
            this.f87627w.setTag(50331648, Integer.valueOf(5));
            this.f87627w.setTag(67108864, pVar);
        } else if (awemeType == 2) {
            this.f87708j.setTag(50331648, Integer.valueOf(8));
            this.f87708j.setTag(67108864, shareAwemeContent.getItemId());
            this.f87627w.setTag(50331648, Integer.valueOf(5));
            this.f87627w.setTag(67108864, pVar);
        }
        this.f87625u.setTag(50331648, Integer.valueOf(4));
        this.f87625u.setTag(100663296, shareAwemeContent);
        this.f87626v.setTag(50331648, Integer.valueOf(4));
        this.f87626v.setTag(100663296, shareAwemeContent);
        this.f87714p.f87454a = this.f87712n.getConversationId();
    }
}
