package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.C4085g;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p330f.C6768c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8329d.C8332b;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.et */
public class C6162et extends C6768c implements OnClickListener {

    /* renamed from: a */
    public static final String f16534a = "et";

    /* renamed from: b */
    public TextView f16535b;

    /* renamed from: c */
    public boolean f16536c;

    /* renamed from: d */
    public boolean f16537d;

    /* renamed from: e */
    public DataCenter f16538e;

    /* renamed from: f */
    private Room f16539f;

    /* renamed from: j */
    private User f16540j;

    /* renamed from: k */
    private Activity f16541k;

    /* renamed from: l */
    private String f16542l;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16537d = true;
    }

    public void onDetachedFromWindow() {
        this.f16537d = false;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aj8);
        ImageView imageView = (ImageView) findViewById(R.id.hi);
        TextView textView = (TextView) findViewById(R.id.bpp);
        ((HSImageView) findViewById(R.id.f7)).setVisibility(8);
        TextView textView2 = (TextView) findViewById(R.id.a4m);
        this.f16535b = (TextView) findViewById(R.id.ai0);
        this.f16535b.setOnClickListener(this);
        C5213c.m11815a(imageView, this.f16540j.getAvatarThumb(), (int) R.drawable.c2g);
        if ((((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion() || ((Boolean) LiveSettingKeys.LIVE_USERNAME_DISPLAY.mo9431a()).booleanValue()) && this.f16540j.displayId != null) {
            textView.setText(this.f16540j.displayId);
        } else {
            textView.setText(this.f16540j.getNickName());
        }
        textView2.setText(R.string.gz1);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.ai0) {
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "live_detail");
                bundle.putString("action_type", "follow");
                bundle.putString("source", CustomActionPushReceiver.f104061f);
                bundle.putString("v1_source", "follow");
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(getContext(), C8337i.m16520a().mo14540a(C4085g.m10200a()).mo14542b(C4085g.m10201b()).mo14544d("live_detail").mo14545e("follow").mo14543c(CustomActionPushReceiver.f104061f).mo14539a(-1).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
            } else if (!this.f16536c) {
                if (C4600j.m11040b(this.f16538e)) {
                    C4116c.m10249a(C8612a.class);
                    C4600j.m11041c(this.f16538e);
                }
                TTLiveSDKContext.getHostService().mo10315h().mo14518a(((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8332b) ((C8326a) C8334f.m16518b().mo14503a(this.f16540j.getId())).mo14504a(this.f16539f.getRequestId())).mo14507b("live_detail")).mo14508c("live_follow_popup")).mo14506b(this.f16539f.getId())).mo14509d(this.f16539f.getLabels())).mo14511a(this.f16541k)).mo14512e("live_detail")).mo14513f("follow")).mo14514c()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<C8686a>() {
                    public final void onComplete() {
                    }

                    public final void onSubscribe(C1690c cVar) {
                    }

                    public final void onError(Throwable th) {
                        if (C6162et.this.f16537d) {
                            C6162et.this.f16536c = false;
                            C4602l.m11046a(C6162et.this.getContext(), th);
                        }
                    }

                    public final /* synthetic */ void onNext(Object obj) {
                        C8686a aVar = (C8686a) obj;
                        if (C6162et.this.f16537d) {
                            C6162et.this.f16536c = false;
                            C6162et.this.f16535b.setText(R.string.gyz);
                            C6162et.this.dismiss();
                            C4575an.m10981a((int) R.string.gyz);
                        }
                    }
                });
                this.f16536c = true;
                long intValue = (long) ((Integer) C6718b.f18306C.mo9431a()).intValue();
                HashMap hashMap = new HashMap();
                hashMap.put("follow_notice_duration", String.valueOf(intValue));
                hashMap.put("growth_deepevent", "1");
                C8049c.m15979a().mo14202a("follow", hashMap, new C8052c("live_follow_popup", this.f16540j.getId()), new C8059j().mo14214b("live_interact").mo14213a("live_detail"), Room.class);
            }
        }
    }

    public C6162et(Activity activity, boolean z, Room room, String str) {
        super(activity, z);
        this.f16541k = activity;
        this.f16539f = room;
        this.f16540j = room.getOwner();
        this.f16542l = str;
    }
}
