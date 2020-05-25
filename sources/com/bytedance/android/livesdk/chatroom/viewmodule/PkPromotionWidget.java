package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.chatroom.model.C5715ah;
import com.bytedance.android.livesdk.chatroom.model.C5715ah.C5717b;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.presenter.C5839bt;
import com.bytedance.android.livesdk.chatroom.presenter.C5839bt.C5840a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.ss.android.ugc.trill.R;

public class PkPromotionWidget extends LiveRecyclableWidget implements C0199s<KVData>, OnClickListener, C5840a {

    /* renamed from: a */
    private ImageView f17407a;

    /* renamed from: b */
    private ViewGroup f17408b;

    /* renamed from: c */
    private ViewGroup f17409c;

    /* renamed from: d */
    private TextView f17410d;

    /* renamed from: e */
    private TextView f17411e;

    /* renamed from: f */
    private ForegroundColorSpan f17412f;

    /* renamed from: g */
    private Room f17413g;

    /* renamed from: h */
    private boolean f17414h;

    /* renamed from: i */
    private C5839bt f17415i;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.aqz;
    }

    public void onUnload() {
        this.f17415i.mo8247a();
        this.dataCenter.removeObserver(this);
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            if (((Integer) kVData.getData()).intValue() != 1) {
                this.contentView.setVisibility(0);
            } else {
                this.contentView.setVisibility(8);
            }
        }
    }

    public void onLoad(Object[] objArr) {
        this.f17413g = (Room) this.dataCenter.get("data_room");
        this.f17414h = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.dataCenter.observe("data_link_state", this);
        this.f17415i.mo8520a((C5840a) this);
    }

    public void onClick(View view) {
        String str;
        C4495a.m10823a().mo10301a((Object) new C5161ag(Uri.parse("https://hotsoon.snssdk.com/hotsoon/in_app/common_live/pk_division/").buildUpon().appendQueryParameter("anchor_id", String.valueOf(this.f17413g.getOwner().getId())).appendQueryParameter("room_id", String.valueOf(this.f17413g.getId())).appendQueryParameter("is_anchor", String.valueOf(this.f17414h ? 1 : 0)).build().toString(), ""));
        C8049c a = C8049c.m15979a();
        String str2 = "medal_click";
        Object[] objArr = new Object[2];
        C8059j b = new C8059j().mo14214b("live_function");
        if (this.f17414h) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        objArr[0] = b.mo14213a(str);
        objArr[1] = Room.class;
        a.mo14203a(str2, objArr);
    }

    public void onInit(Object... objArr) {
        this.f17407a = (ImageView) this.contentView.findViewById(R.id.b2e);
        this.f17408b = (ViewGroup) this.contentView.findViewById(R.id.crz);
        this.f17409c = (ViewGroup) this.contentView.findViewById(R.id.c6l);
        this.f17410d = (TextView) this.contentView.findViewById(R.id.dg7);
        this.f17411e = (TextView) this.contentView.findViewById(R.id.de3);
        this.contentView.setOnClickListener(this);
        this.f17415i = new C5839bt();
    }

    /* renamed from: a */
    public final void mo11717a(C5715ah ahVar, long j, boolean z) {
        C5213c.m11814a(this.f17407a, ahVar.f15037l);
        if (ahVar.f15035j != null) {
            C5717b bVar = ahVar.f15035j;
            this.f17408b.setVisibility(8);
            this.f17409c.setVisibility(0);
            SpannableString spannableString = new SpannableString(C3922z.m9905a((int) R.string.el1, Integer.valueOf(bVar.f15040b), Integer.valueOf(bVar.f15041c)));
            if (this.f17412f == null) {
                this.f17412f = new ForegroundColorSpan(Color.parseColor("#ffee00"));
            }
            spannableString.setSpan(this.f17412f, 0, String.valueOf(bVar.f15040b).length(), 33);
            this.f17411e.setText(spannableString);
            if (this.f17414h && !((Boolean) C4525b.f12344aM.mo10345a()).booleanValue()) {
                new C8552a(this.context, 1).mo15004b(2, (CharSequence) C3922z.m9903a((int) R.string.e59), C6550ed.f17881a).mo15008c((int) R.string.eo_).mo15011d();
                C4525b.f12344aM.mo10346a(Boolean.valueOf(true));
                C4525b.f12345aN.mo10346a(Long.valueOf(j));
            }
        } else {
            int i = ahVar.f15028c;
            int i2 = ahVar.f15029d;
            this.f17409c.setVisibility(8);
            this.f17408b.setVisibility(0);
            if (i2 < 100000000) {
                this.f17410d.setText(C3922z.m9905a((int) R.string.el1, Integer.valueOf(i), Integer.valueOf(i2)));
            } else {
                this.f17410d.setText(String.valueOf(i));
            }
            if (this.f17414h) {
                if (((Boolean) C4525b.f12344aM.mo10345a()).booleanValue() && ahVar.f15036k != null && !TextUtils.isEmpty(ahVar.f15036k.f15038a) && j - ((Long) C4525b.f12345aN.mo10345a()).longValue() > FbUploadTokenTime.group0) {
                    new C8552a(this.context, 1).mo15004b(2, (CharSequence) C3922z.m9903a((int) R.string.e59), C6551ee.f17882a).mo15009c((CharSequence) ahVar.f15036k.f15038a).mo15011d();
                }
                C4525b.f12344aM.mo10346a(Boolean.valueOf(false));
            }
        }
        if (this.f17414h && z && ahVar.f15036k != null && !TextUtils.isEmpty(ahVar.f15036k.f15038a)) {
            new C8552a(this.context, 1).mo15004b(2, (CharSequence) C3922z.m9903a((int) R.string.e59), C6552ef.f17883a).mo15009c((CharSequence) ahVar.f15036k.f15038a).mo15011d();
        }
    }
}
