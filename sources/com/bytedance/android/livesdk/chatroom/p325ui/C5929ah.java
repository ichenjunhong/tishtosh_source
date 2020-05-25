package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.p248b.C4123b;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p306bl.C5007d;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p330f.C6768c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8534c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ah */
public final class C5929ah extends C6768c implements OnClickListener {

    /* renamed from: a */
    final Room f15597a;

    /* renamed from: b */
    final long f15598b;

    /* renamed from: c */
    final C4123b f15599c;

    /* renamed from: d */
    public TextView f15600d;

    /* renamed from: e */
    boolean f15601e;

    /* renamed from: f */
    DataCenter f15602f;

    /* renamed from: j */
    private final String f15603j = "@";

    /* renamed from: k */
    private final User f15604k;

    /* renamed from: l */
    private final C3009i f15605l;

    /* renamed from: m */
    private String f15606m;

    /* renamed from: n */
    private final long f15607n;

    /* renamed from: o */
    private final String f15608o;

    /* renamed from: p */
    private HSImageView f15609p;

    /* renamed from: q */
    private TextView f15610q;

    /* renamed from: r */
    private TextView f15611r;

    /* renamed from: s */
    private View f15612s;

    /* renamed from: t */
    private C1690c f15613t;

    public final void onStart() {
        super.onStart();
    }

    public final void show() {
        super.show();
    }

    /* renamed from: a */
    private boolean m12925a() {
        if (this.f15597a != null && this.f15597a.isOfficial()) {
            return false;
        }
        this.f15602f.get("data_user_in_room");
        LiveSettingKeys.LIVE_FIRST_CHARGE_TIP_INFO.mo9431a();
        return false;
    }

    public final void dismiss() {
        super.dismiss();
        C5007d.INSTANCE.onMessageFinish();
        if (this.f15613t != null && !this.f15613t.isDisposed()) {
            this.f15613t.dispose();
        }
    }

    public final void onClick(View view) {
        String str;
        if (view.getId() == R.id.z1) {
            dismiss();
            return;
        }
        if (view.getId() == R.id.dfp) {
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(this.f15597a.getId()));
            String str2 = "guide_style";
            if (this.f15607n == 3) {
                str = "charge";
            } else {
                str = "convenient_gift";
            }
            hashMap.put(str2, str);
            C8049c.m15979a().mo14202a("gift_guide_popup_click", hashMap, new C8059j().mo14214b("live_function").mo14218f("click").mo14213a("live_detail").mo14215c("gift_guide_popup"));
            if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(getContext(), C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev8)).mo14543c("gift_guide").mo14539a(-1).mo14541a()).mo6551j();
            } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.GIFT)) {
                m12925a();
                if (((IHostContext) C4116c.m10249a(IHostContext.class)).isNeedProtectUnderage()) {
                    C4575an.m10981a((int) R.string.epj);
                    return;
                }
                C7505d findGiftById = GiftManager.inst().findGiftById(this.f15598b);
                if (findGiftById != null && !((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10093b((long) findGiftById.f20545f)) {
                    String channel = ((IHostContext) C4116c.m10249a(IHostContext.class)).getChannel();
                    if (!"test".equals(channel) && !"local_test".equals(channel)) {
                        if (this.f15599c != null) {
                            this.f15599c.mo9491a();
                        }
                        return;
                    }
                }
                if (!this.f15601e) {
                    this.f15601e = true;
                    ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).send(this.f15598b, this.f15597a.getId(), this.f15597a.getOwner().getId(), 1, 125).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6506a((C1710e<? super T>) new C5931ai<Object>(this, SystemClock.uptimeMillis(), findGiftById), (C1710e<? super Throwable>) new C5932aj<Object>(this, findGiftById), (C1706a) new C5933ak(this));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ai8);
        setCanceledOnTouchOutside(true);
        this.f15609p = (HSImageView) findViewById(R.id.ay2);
        this.f15610q = (TextView) findViewById(R.id.dco);
        this.f15600d = (TextView) findViewById(R.id.d98);
        this.f15611r = (TextView) findViewById(R.id.dfp);
        this.f15612s = findViewById(R.id.z1);
        C5213c.m11820a(this.f15609p, this.f15604k.getAvatarThumb());
        if (this.f15610q != null) {
            if (this.f15605l == null || C9431p.m18664a(this.f15605l.getNickName())) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("@");
                stringBuffer.append(C3922z.m9903a((int) R.string.ei7));
                this.f15610q.setText(stringBuffer.toString());
            } else {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("@");
                stringBuffer2.append(this.f15605l.getNickName());
                this.f15610q.setText(stringBuffer2.toString());
            }
        }
        C7505d findGiftById = GiftManager.inst().findGiftById(this.f15598b);
        if (TextUtils.isEmpty(this.f15606m) || findGiftById == null) {
            this.f15606m = getContext().getResources().getString(R.string.f13);
            findGiftById = GiftManager.inst().getFastGift();
        }
        LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.mo9431a();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15606m);
            sb.append(" ");
            final SpannableString spannableString = new SpannableString(sb.toString());
            GiftManager.inst().getGiftIconBitmap(findGiftById.f20543d, new C8797c() {
                /* renamed from: a */
                public final void mo9146a(C8795a aVar) {
                    C3831a.m9714b("GiftGuideDialog", aVar.f24035a);
                    C5929ah.this.f15600d.setText(spannableString);
                }

                /* renamed from: a */
                public final void mo9145a(Bitmap bitmap) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(C5929ah.this.getContext().getResources(), bitmap);
                    int a = C3922z.m9899a(16.0f);
                    bitmapDrawable.setBounds(0, 0, a, a);
                    spannableString.setSpan(new C8534c(bitmapDrawable), spannableString.length() - 1, spannableString.length(), 33);
                    C5929ah.this.f15600d.setText(spannableString);
                }
            });
        } catch (Exception unused) {
        }
        this.f15611r.setOnClickListener(this);
        this.f15612s.setOnClickListener(this);
        m12925a();
    }

    public C5929ah(Context context, Room room, C3009i iVar, C4123b bVar, long j, String str, long j2, String str2, DataCenter dataCenter) {
        super(context, true);
        this.f15597a = room;
        this.f15604k = room.getOwner();
        this.f15605l = iVar;
        this.f15599c = bVar;
        this.f15598b = j;
        this.f15606m = str;
        this.f15607n = j2;
        this.f15608o = str2;
        this.f15602f = dataCenter;
    }
}
