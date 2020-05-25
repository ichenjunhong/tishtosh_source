package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Toast;
import com.bytedance.android.live.core.p226e.p228b.C3844a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.LiveTextView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C4494aa;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5166al;
import com.bytedance.android.livesdk.chatroom.event.C5168an;
import com.bytedance.android.livesdk.chatroom.event.C5169ao;
import com.bytedance.android.livesdk.chatroom.event.C5170ap;
import com.bytedance.android.livesdk.chatroom.event.C5173as;
import com.bytedance.android.livesdk.chatroom.event.C5182ba;
import com.bytedance.android.livesdk.chatroom.event.C5188h;
import com.bytedance.android.livesdk.chatroom.event.C5195o.C5196a;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.p306bl.C5006c;
import com.bytedance.android.livesdk.chatroom.p310f.C5208a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6013bz;
import com.bytedance.android.livesdk.chatroom.p325ui.C6013bz.C6017a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6013bz.C6018b;
import com.bytedance.android.livesdk.chatroom.p325ui.C6013bz.C6019c;
import com.bytedance.android.livesdk.chatroom.presenter.C5807b;
import com.bytedance.android.livesdk.chatroom.presenter.C5807b.C5809a;
import com.bytedance.android.livesdk.chatroom.presenter.C5873h;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C7862cc;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.viewmodel.C8422f;
import com.bytedance.android.livesdk.viewmodel.LotteryWaiting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8805i;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.p071d.C1710e;

public class CommentWidget extends LiveRecyclableWidget implements C0199s<KVData>, OnClickListener, C5809a {

    /* renamed from: d */
    public static final int f16819d = C3922z.m9899a(200.0f);

    /* renamed from: e */
    public static final int f16820e = C3922z.m9899a(128.0f);

    /* renamed from: a */
    public boolean f16821a;

    /* renamed from: b */
    public Room f16822b;

    /* renamed from: c */
    public boolean f16823c;

    /* renamed from: f */
    public C6013bz f16824f;

    /* renamed from: g */
    public C6018b f16825g = new C6018b();

    /* renamed from: h */
    public Runnable f16826h = new Runnable() {
        public final void run() {
            if (CommentWidget.this.isViewValid()) {
                CommentWidget.this.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new C5173as(1, "live_detail"));
            }
        }
    };

    /* renamed from: i */
    private View f16827i;

    /* renamed from: j */
    private View f16828j;

    /* renamed from: k */
    private View f16829k;

    /* renamed from: l */
    private Activity f16830l;

    /* renamed from: m */
    private String f16831m;

    /* renamed from: n */
    private String f16832n;

    /* renamed from: o */
    private boolean f16833o;

    /* renamed from: p */
    private boolean f16834p = true;

    /* renamed from: q */
    private C5807b f16835q;

    /* renamed from: r */
    private String f16836r;

    /* renamed from: s */
    private boolean f16837s;

    /* renamed from: t */
    private boolean f16838t;

    /* renamed from: u */
    private C7862cc f16839u;

    /* renamed from: v */
    private C6019c f16840v = new C6019c() {
        /* renamed from: a */
        public final void mo12022a(C6018b bVar) {
            if (CommentWidget.this.dataCenter != null) {
                CommentWidget.this.dataCenter.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(false));
            }
            C4494aa.m10815a().mo10294a(false);
            CommentWidget.this.f16824f = null;
            CommentWidget.this.f16825g = bVar;
        }

        /* renamed from: a */
        public final void mo12023a(String str, boolean z) {
            CommentWidget.this.mo12317a(str, z, false);
        }
    };

    /* renamed from: w */
    private C6017a f16841w = new C6017a() {
        /* renamed from: a */
        public final void mo12021a() {
            CommentWidget.this.containerView.post(CommentWidget.this.f16826h);
        }
    };

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.ap8;
    }

    /* renamed from: a */
    public final void mo12317a(String str, boolean z, boolean z2) {
        this.f16836r = str;
        this.f16837s = z;
        this.f16838t = z2;
        if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            TTLiveSDKContext.getHostService().mo10315h().mo14516a(this.context, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.e6t)).mo14543c("comment_live").mo14539a(-1).mo14541a()).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
        } else if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.COMMENT)) {
            if (this.f16834p) {
                C4495a.m10823a().mo10301a((Object) new C5170ap(true, 0));
                this.f16834p = false;
            }
            if (!z) {
                C5807b bVar = this.f16835q;
                C5196a aVar = C5196a.CommentWidget;
                String str2 = this.f16832n;
                HashMap hashMap = new HashMap();
                hashMap.put("live.intent.extra.ENTER_LIVE_SOURCE", str2);
                bVar.mo11688a(new C5168an(str, aVar, hashMap));
            } else if (str.length() > 15) {
                C4204a.m10421a(this.context, (int) R.string.efe);
            } else {
                C5807b bVar2 = this.f16835q;
                C5196a aVar2 = C5196a.CommentWidget;
                String str3 = this.f16832n;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("live.intent.extra.ENTER_LIVE_SOURCE", str3);
                bVar2.mo11687a(new C5166al(str, aVar2, hashMap2));
            }
        }
    }

    public void onPause() {
        super.onPause();
        C8064d.m16005b();
        C8064d.m9720b("ttlive_comment", "CommentWidget onPause");
    }

    public void onResume() {
        super.onResume();
        C8064d.m16005b();
        C8064d.m9720b("ttlive_comment", "CommentWidget onResume");
    }

    /* renamed from: d */
    private void m13429d() {
        final LayoutParams layoutParams = this.contentView.getLayoutParams();
        layoutParams.width = -1;
        this.contentView.setLayoutParams(layoutParams);
        this.contentView.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                int width = CommentWidget.this.contentView.getWidth();
                if (CommentWidget.this.f16823c) {
                    if (width > CommentWidget.f16820e) {
                        layoutParams.width = CommentWidget.f16820e;
                    }
                } else if (width > CommentWidget.f16819d) {
                    layoutParams.width = CommentWidget.f16819d;
                }
                CommentWidget.this.contentView.setLayoutParams(layoutParams);
                if (VERSION.SDK_INT >= 16) {
                    CommentWidget.this.contentView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    CommentWidget.this.contentView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    /* renamed from: e */
    private void m13430e() {
        if (this.f16824f != null) {
            this.f16824f.mo12014a("");
            return;
        }
        this.f16825g.f15981d = "";
    }

    /* renamed from: c */
    public final void mo12319c() {
        if (this.f16824f != null && isViewValid()) {
            this.f16824f.mo12012a();
            this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.valueOf(false));
        }
    }

    public void onUnload() {
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
        this.f16835q.mo8247a();
        this.f16833o = false;
        this.f16834p = true;
        this.f16836r = null;
        this.f16837s = false;
        this.f16838t = false;
        this.f16839u = null;
        if (this.f16824f != null) {
            this.f16824f.dismissAllowingStateLoss();
            this.f16824f = null;
        }
        C8064d.m16005b();
        C8064d.m9720b("ttlive_comment", "CommentWidget onUnload");
    }

    /* renamed from: a */
    public final void mo12316a() {
        if (this.f16824f == null && this.isViewValid && !TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.COMMENT)) {
            if (!this.f16825g.f15980c) {
                this.f16833o = true;
                this.dataCenter.lambda$put$1$DataCenter("data_pre_show_keyboard", Boolean.valueOf(true));
                if (!(this.f16822b == null || this.f16822b.mRoomAuthStatus == null)) {
                    this.f16825g.f15982e = this.f16822b.mRoomAuthStatus.enableDanmaku;
                }
                if (this.f16822b != null && this.f16822b.isOfficial()) {
                    this.f16825g.f15983f = true;
                }
                this.f16824f = C6013bz.m13114a(this.f16825g, this.f16841w);
                this.f16824f.f15959k = this.f16840v;
                try {
                    this.f16824f.show(((FragmentActivity) this.f16830l).getSupportFragmentManager(), "INPUT");
                    C4494aa.m10815a().mo10294a(true);
                } catch (IllegalStateException unused) {
                    this.f16824f = null;
                }
            } else {
                C4204a.m10421a((Context) this.f16830l, (int) R.string.euv);
            }
        }
    }

    public void onEvent(C5182ba baVar) {
        m13428a(baVar);
    }

    /* renamed from: a */
    public final void mo11693a(boolean z) {
        this.f16825g.f15982e = z;
    }

    /* renamed from: b */
    public final void mo12318b(boolean z) {
        if (isViewValid() && !this.f16821a) {
            if (this.f16824f != null) {
                this.f16824f.mo12015a(z);
            } else {
                this.f16825g.f15980c = z;
            }
        }
    }

    /* renamed from: a */
    private void m13427a(C2949a aVar) {
        if (C3844a.m9757a(aVar) && ((Boolean) LiveSettingKeys.ENABLE_COMMENT_BIND_PHONE.mo9431a()).booleanValue()) {
            TTLiveSDKContext.getHostService().mo10310c().startBindPhoneDialogFragment(this.f16830l, "live_detail", "live_detail", new C6595s(this));
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.a98 || id == R.id.a99 || id == R.id.a99 || id == R.id.d57) {
            if (this.dataCenter != null) {
                this.dataCenter.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(true));
            }
            mo12316a();
        }
    }

    /* renamed from: a */
    private void m13428a(final C5182ba baVar) {
        if (baVar.f13879a == 1) {
            this.contentView.postDelayed(new Runnable() {
                public final void run() {
                    if (CommentWidget.this.isViewValid()) {
                        String a = C4604n.m11050a("@%s ", baVar.f13880b);
                        if (CommentWidget.this.f16824f != null) {
                            CommentWidget.this.f16824f.mo12014a(a);
                            return;
                        }
                        CommentWidget.this.f16825g.f15981d = a;
                        CommentWidget.this.mo12316a();
                    }
                }
            }, 500);
        } else if (baVar.f13879a == 2) {
            this.contentView.postDelayed(new Runnable() {
                public final void run() {
                    if (CommentWidget.this.isViewValid()) {
                        if (CommentWidget.this.f16824f != null) {
                            C6013bz bzVar = CommentWidget.this.f16824f;
                            boolean z = baVar.f13881c;
                            if (bzVar.isAdded() && !bzVar.f15957i && ((!bzVar.f15956h || !z) && (bzVar.f15956h || z))) {
                                bzVar.f15956h = z;
                                if (z) {
                                    bzVar.f15949a.mo14683a(true);
                                } else {
                                    bzVar.f15949a.mo14684b(true);
                                }
                                bzVar.mo12016b();
                            }
                        } else {
                            CommentWidget.this.f16825g.f15978a = baVar.f13881c;
                            CommentWidget.this.mo12316a();
                        }
                    }
                }
            }, 500);
        } else {
            mo12316a();
        }
    }

    /* renamed from: b */
    public final void mo11694b(Exception exc) {
        if (exc instanceof C2949a) {
            C2949a aVar = (C2949a) exc;
            int errorCode = aVar.getErrorCode();
            if (50001 == errorCode) {
                mo12318b(true);
            } else {
                if (50004 == errorCode) {
                    m13430e();
                    mo12319c();
                } else if (errorCode == 50019) {
                    mo12319c();
                    C5208a.m11808a(this.f16830l, "send_message", new C8805i() {
                    });
                }
                C4204a.m10423a((Context) this.f16830l, aVar.getPrompt());
            }
            m13427a(aVar);
            return;
        }
        C4575an.m10981a((int) R.string.ees);
    }

    public void onInit(Object... objArr) {
        String str;
        this.f16821a = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.f16822b = (Room) this.dataCenter.get("data_room");
        this.f16823c = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
        this.f16832n = (String) this.dataCenter.get("log_enter_live_source");
        this.f16830l = (Activity) this.context;
        this.f16835q = new C5807b();
        this.f16827i = this.contentView.findViewById(R.id.a99);
        this.f16828j = this.contentView.findViewById(R.id.a98);
        this.f16829k = this.containerView.findViewById(R.id.d57);
        if (this.f16827i != null) {
            this.f16827i.setOnClickListener(this);
        }
        this.f16825g.f15979b = this.f16821a;
        if (C35807d.m80935a(this.f16830l, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.f16831m = str;
        m13429d();
        C8064d.m16005b();
        C8064d.m9720b("ttlive_comment", "CommentWidget onInit");
    }

    /* renamed from: a */
    public final void mo11690a(Barrage barrage) {
        if (isViewValid()) {
            m13430e();
            if (TextUtils.isEmpty(barrage.getOrderId())) {
                C4575an.m10981a((int) R.string.efd);
                return;
            }
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10091a((long) barrage.getLeftDiamond());
            if (((Boolean) LiveSettingKeys.LIVE_ENABLE_NORMAL_GIFT_AND_BARRAGE_SELF_FIRSTLY.mo9431a()).booleanValue() && ((C4193l) C4116c.m10249a(C4193l.class)).messageManagerHelper().mo9628a() != null && isViewValid()) {
                C7869cj a = C5006c.m11496a(barrage);
                if (a != null) {
                    a.isLocalInsertMsg = true;
                    ((C4193l) C4116c.m10249a(C4193l.class)).messageManagerHelper().mo9628a().insertMessage(a);
                }
            }
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("live_source", this.f16831m);
                if (!TextUtils.isEmpty(this.f16822b.getSourceType())) {
                    hashMap.put("moment_room_source", this.f16822b.getSourceType());
                }
            } catch (Exception unused) {
            }
            C8049c.m15979a().mo14202a("send_barrage", hashMap, new C8059j().mo14214b("live_interact"), Room.class);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (isViewValid() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            boolean z = true;
            int i = 4;
            switch (key.hashCode()) {
                case -1755796428:
                    if (key.equals("cmd_hide_other_toolbar")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1679741667:
                    if (key.equals("cmd_wanna_send_message")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1548871708:
                    if (key.equals("cmd_hide_in_douyin_commerce")) {
                        c = 4;
                        break;
                    }
                    break;
                case -657921921:
                    if (key.equals("cmd_do_send_message")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1060055221:
                    if (key.equals("data_keyboard_status")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1939188655:
                    if (key.equals("data_screen_record_is_open")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m13428a((C5182ba) kVData.getData());
                    return;
                case 1:
                    C5188h hVar = (C5188h) kVData.getData();
                    if (hVar != null) {
                        if (hVar.f13894b) {
                            this.f16839u = (C7862cc) hVar.f13895c;
                        }
                        mo12317a(hVar.f13893a, false, hVar.f13894b);
                        return;
                    }
                    break;
                case 2:
                    if (!((Boolean) kVData.getData()).booleanValue() && !this.f16833o) {
                        i = 0;
                    }
                    this.contentView.setVisibility(i);
                    C8064d.m16005b();
                    String str = "ttlive_comment";
                    StringBuilder sb = new StringBuilder("CommentWidget contentView status changed, visible:");
                    if (this.contentView.getVisibility() != 0) {
                        z = false;
                    }
                    sb.append(z);
                    sb.append(", reason: DATA_SCREEN_RECORD_IS_OPEN");
                    C8064d.m9720b(str, sb.toString());
                    return;
                case 3:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                    } else {
                        this.contentView.setVisibility(0);
                        this.f16833o = false;
                    }
                    C8064d.m16005b();
                    String str2 = "ttlive_comment";
                    StringBuilder sb2 = new StringBuilder("CommentWidget contentView status changed, visible:");
                    if (this.contentView.getVisibility() != 0) {
                        z = false;
                    }
                    sb2.append(z);
                    sb2.append(", reason: DATA_KEYBOARD_STATUS");
                    C8064d.m9720b(str2, sb2.toString());
                    return;
                case 4:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                    } else {
                        this.contentView.setVisibility(0);
                    }
                    C8064d.m16005b();
                    String str3 = "ttlive_comment";
                    StringBuilder sb3 = new StringBuilder("CommentWidget contentView status changed, visible:");
                    if (this.contentView.getVisibility() != 0) {
                        z = false;
                    }
                    sb3.append(z);
                    sb3.append(", reason: CMD_VISIBILITY_IN_DOUYIN_COMMERCE");
                    C8064d.m9720b(str3, sb3.toString());
                    return;
                case 5:
                    if (((Boolean) kVData.getData(Boolean.valueOf(false))).booleanValue()) {
                        this.contentView.setVisibility(4);
                    } else {
                        this.contentView.setVisibility(0);
                    }
                    C8064d.m16005b();
                    String str4 = "ttlive_comment";
                    StringBuilder sb4 = new StringBuilder("CommentWidget contentView status changed, visible:");
                    if (this.contentView.getVisibility() != 0) {
                        z = false;
                    }
                    sb4.append(z);
                    sb4.append(", reason: CMD_HIDE_OTHER_TOOLBARBUTTON");
                    C8064d.m9720b(str4, sb4.toString());
                    break;
            }
        }
    }

    public void onLoad(Object... objArr) {
        C4495a.m10823a().mo10300a(C5182ba.class).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6545f((C1710e<? super T>) new C1710e<C5182ba>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                CommentWidget.this.onEvent((C5182ba) obj);
            }
        });
        if (this.f16822b != null && this.contentView != null) {
            this.f16821a = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
            this.f16822b = (Room) this.dataCenter.get("data_room");
            this.f16823c = ((Boolean) this.dataCenter.get("data_is_portrait")).booleanValue();
            this.f16832n = (String) this.dataCenter.get("log_enter_live_source");
            this.f16830l = (Activity) this.context;
            this.f16835q.mo8520a((C5809a) this);
            this.dataCenter.observe("cmd_do_send_message", this).observe("data_screen_record_is_open", this).observe("cmd_wanna_send_message", this).observeForever("data_keyboard_status", this).observeForever("cmd_hide_other_toolbar", this).observeForever("cmd_hide_in_douyin_commerce", this);
            if (!this.f16823c) {
                C9432q.m18691b(this.f16827i, 0);
            } else if (this.f16821a) {
                this.f16828j.setOnClickListener(this);
                this.f16828j.setVisibility(0);
                this.f16827i.setVisibility(8);
            } else {
                if (this.f16828j != null) {
                    this.f16828j.setVisibility(8);
                }
                this.f16827i.setVisibility(0);
            }
            m13429d();
            if (this.f16822b != null && this.f16822b.isOfficial()) {
                View findViewById = this.contentView.findViewById(R.id.a99);
                if (findViewById != null && (findViewById instanceof LiveTextView)) {
                    LiveTextView liveTextView = (LiveTextView) findViewById;
                    if (!this.f16823c) {
                        liveTextView.setBackgroundResource(R.drawable.dzs);
                        liveTextView.setTextColor(-1);
                    } else if (!(getContext() == null || getContext().getResources() == null)) {
                        liveTextView.setBackgroundResource(R.drawable.bgq);
                        liveTextView.setTextColor(getContext().getResources().getColor(R.color.b4g));
                    }
                }
            }
            C8064d.m16005b();
            C8064d.m9720b("ttlive_comment", "CommentWidget onLoad");
        }
    }

    /* renamed from: a */
    public final void mo11691a(C8001m mVar) {
        if (isViewValid()) {
            m13430e();
            if (this.f16830l instanceof FragmentActivity) {
                TTLiveSDKContext.getHostService().mo10310c().checkBindHelpShow((FragmentActivity) this.f16830l, UserProfileEvent.SOURCE_COMMENT);
            }
            IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager");
            if (iMessageManager != null) {
                iMessageManager.insertMessage(mVar, true);
            }
            C4495a.m10823a().mo10301a((Object) new C5169ao(mVar));
            if (!this.f16821a) {
                HashMap hashMap = new HashMap();
                C8422f fVar = (C8422f) this.dataCenter.get("data_lottery_data_model", null);
                if (fVar != null && (fVar.f22869a instanceof LotteryWaiting)) {
                    hashMap.put("lottery_id", String.valueOf(((LotteryWaiting) fVar.f22869a).getLotteryId()));
                }
                if (this.f16836r == null || !this.f16836r.equals(mVar.f21869b) || !this.f16838t || this.f16839u == null) {
                    try {
                        hashMap.put("comment_id", String.valueOf(mVar.f21868a));
                        hashMap.put("to_user_id", String.valueOf(this.f16822b.getOwner().getId()));
                        hashMap.put("live_source", this.f16831m);
                        if (!TextUtils.isEmpty(this.f16822b.getSourceType())) {
                            hashMap.put("moment_room_source", this.f16822b.getSourceType());
                        }
                    } catch (Exception unused) {
                    }
                    C8049c.m15979a().mo14202a("audience_live_message", hashMap, new C8059j().mo14214b("live_interact"), Room.class, new C8060k());
                    return;
                }
                C5873h.m12789a(this.f16839u, hashMap);
                this.f16839u = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo11692a(Exception exc) {
        if (exc instanceof C2949a) {
            C2949a aVar = (C2949a) exc;
            int errorCode = aVar.getErrorCode();
            if (50001 == errorCode) {
                mo12318b(true);
            } else if (50004 == errorCode || 50014 == errorCode || 80074 == errorCode) {
                m13430e();
                mo12319c();
                C4204a.m10423a((Context) this.f16830l, aVar.getPrompt());
            } else if (40001 == errorCode) {
                C4204a.m10423a((Context) this.f16830l, aVar.getPrompt());
                if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo9431a()).intValue() == 1) {
                    this.dataCenter.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new C5173as(1, "live_detail"));
                }
            } else if (errorCode == 50019) {
                mo12319c();
                C5208a.m11808a(this.f16830l, "send_barrage", new C8805i() {
                });
            } else {
                C4602l.m11046a(getContext(), aVar);
            }
            m13427a(aVar);
            return;
        }
        Toast makeText = Toast.makeText(this.context, R.string.efd, 0);
        if (VERSION.SDK_INT == 25) {
            C47905fy.m103630a(makeText);
        }
        makeText.show();
    }
}
