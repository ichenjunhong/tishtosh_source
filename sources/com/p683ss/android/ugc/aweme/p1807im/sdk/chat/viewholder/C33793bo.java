package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.ShareLiveContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.bo */
public class C33793bo extends C33805c<ShareLiveContent> {

    /* renamed from: A */
    private ImageView f87661A;

    /* renamed from: B */
    private ImageView f87662B;

    /* renamed from: C */
    private TextView f87663C;

    /* renamed from: u */
    private LinearLayout f87664u;

    /* renamed from: v */
    private RemoteImageView f87665v;

    /* renamed from: w */
    private TextView f87666w;

    /* renamed from: x */
    private TextView f87667x;

    /* renamed from: y */
    private RemoteImageView f87668y;

    /* renamed from: z */
    private TextView f87669z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71779a() {
        super.mo71779a();
        this.f87664u = (LinearLayout) this.itemView.findViewById(R.id.po);
        this.f87665v = (RemoteImageView) this.itemView.findViewById(R.id.zm);
        this.f87666w = (TextView) this.itemView.findViewById(R.id.zx);
        this.f87667x = (TextView) this.itemView.findViewById(R.id.zp);
        this.f87668y = (RemoteImageView) this.itemView.findViewById(R.id.zo);
        this.f87669z = (TextView) this.itemView.findViewById(R.id.zv);
        this.f87661A = (ImageView) this.itemView.findViewById(R.id.zy);
        this.f87662B = (ImageView) this.itemView.findViewById(R.id.a04);
        this.f87663C = (TextView) this.itemView.findViewById(R.id.a00);
        this.f87708j = (View) mo71845a((int) R.id.ze);
    }

    /* renamed from: a */
    public void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
        this.f87667x.setOnClickListener(onClickListener);
        this.f87665v.setOnClickListener(onClickListener);
        this.f87666w.setOnClickListener(onClickListener);
        this.f87708j.setOnClickListener(onClickListener);
        this.f87713o.mo73331a(this.f87667x, this.f87665v, this.f87666w, this.f87708j);
    }

    public C33793bo(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo71780a(C11207p pVar, C11207p pVar2, ShareLiveContent shareLiveContent, int i) {
        int i2;
        boolean z;
        super.mo71780a(pVar, pVar2, shareLiveContent, i);
        this.f87662B.setVisibility(0);
        this.f87669z.setVisibility(0);
        this.f87667x.setVisibility(8);
        this.f87661A.setVisibility(8);
        if (shareLiveContent.getRoomCover() != null) {
            C23515d.m57669a(this.f87668y, shareLiveContent.getRoomCover());
        } else {
            C23515d.m57668a(this.f87668y, (int) R.drawable.dbz);
        }
        C23515d.m57669a(this.f87665v, shareLiveContent.getRoomOwnerAvatar());
        this.f87666w.setText(shareLiveContent.getRoomOwnerName());
        if (!TextUtils.isEmpty(shareLiveContent.getRoomDesc())) {
            this.f87663C.setText(shareLiveContent.getRoomDesc());
            this.f87663C.setVisibility(0);
        } else {
            this.f87663C.setVisibility(8);
        }
        IMUser a = C34010e.m77748a().mo71955a(shareLiveContent.getRoomOwnerId(), shareLiveContent.getRoomSecOwnerId(), true, (C34015a) null);
        if (a == null) {
            i2 = 0;
        } else {
            i2 = a.getFollowStatus();
        }
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        if (baseUserService_Monster != null) {
            z = TextUtils.equals(shareLiveContent.getRoomOwnerId(), baseUserService_Monster.getCurrentUserID());
        } else {
            z = false;
        }
        if (i2 != 0 || z || !C34004b.m77718b().needAwemeMsgShowFollow()) {
            this.f87667x.setVisibility(8);
        } else {
            this.f87667x.setVisibility(0);
        }
        this.f87714p.f87454a = this.f87712n.getConversationId();
        this.f87665v.setTag(50331648, Integer.valueOf(24));
        this.f87665v.setTag(100663296, shareLiveContent);
        this.f87666w.setTag(50331648, Integer.valueOf(24));
        this.f87666w.setTag(100663296, shareLiveContent);
        this.f87667x.setTag(50331648, Integer.valueOf(5));
        this.f87667x.setTag(67108864, pVar);
        this.f87708j.setTag(50331648, Integer.valueOf(23));
        C35190af.m79442a();
        String roomOwnerId = shareLiveContent.getRoomOwnerId();
        String roomId = shareLiveContent.getRoomId();
        long sender = pVar.getSender();
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", roomId);
        hashMap.put("anchor_id", roomOwnerId);
        hashMap.put("action_type", "click");
        hashMap.put("enter_from_merge", "chat");
        hashMap.put("enter_method", "live_cover");
        hashMap.put("_params_live_platform", CustomActionPushReceiver.f104061f);
        hashMap.put("from_user_id", String.valueOf(sender));
        C26890h.m65011a("livesdk_live_show", (Map<String, String>) hashMap);
    }
}
