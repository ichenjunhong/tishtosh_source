package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p306bl.C5007d;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p330f.C6768c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8325b.C8327b;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class FollowGuideWidget extends LiveWidget implements OnClickListener {

    /* renamed from: a */
    public Room f16974a;

    /* renamed from: b */
    public C6282a f16975b;

    /* renamed from: c */
    public View f16976c;

    /* renamed from: d */
    public TextView f16977d;

    /* renamed from: e */
    public TextView f16978e;

    /* renamed from: f */
    public TextView f16979f;

    /* renamed from: g */
    public HSImageView f16980g;

    /* renamed from: h */
    private boolean f16981h = true;

    /* renamed from: i */
    private TextView f16982i;

    /* renamed from: j */
    private OnAttachStateChangeListener f16983j = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            C5007d.INSTANCE.onMessageFinish();
        }
    };

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget$a */
    public static final class C6282a extends C6768c {

        /* renamed from: a */
        private View f16986a;

        /* renamed from: b */
        private boolean f16987b;

        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.f16987b = true;
        }

        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f16987b = false;
        }

        public final void dismiss() {
            if (this.f16987b) {
                super.dismiss();
            }
        }

        public final void onStart() {
            super.onStart();
            if (getWindow() != null) {
                getWindow().setLayout(-1, -1);
            }
        }

        public final void show() {
            if ((!(getContext() instanceof Activity) || !((Activity) getContext()).isFinishing()) && !isShowing()) {
                super.show();
            }
        }

        /* access modifiers changed from: protected */
        public final void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(this.f16986a);
            setCanceledOnTouchOutside(true);
        }

        public C6282a(Context context, boolean z, View view) {
            super(context, z);
            this.f16986a = view;
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        if (this.f16976c == null) {
            FrameLayout frameLayout = new FrameLayout(this.context);
            frameLayout.setOnClickListener(new C6451am(this));
            this.f16976c = View.inflate(this.context, R.layout.ai1, frameLayout);
            this.f16976c.removeOnAttachStateChangeListener(this.f16983j);
            this.f16976c.addOnAttachStateChangeListener(this.f16983j);
            this.f16980g = (HSImageView) this.f16976c.findViewById(R.id.ay2);
            this.f16977d = (TextView) this.f16976c.findViewById(R.id.dco);
            this.f16979f = (TextView) this.f16976c.findViewById(R.id.d_i);
            this.f16978e = (TextView) this.f16976c.findViewById(R.id.dag);
            this.f16982i = (TextView) this.f16976c.findViewById(R.id.nr);
            this.f16975b = new C6282a(this.context, this.f16981h, frameLayout);
        }
        this.f16982i.setOnClickListener(this);
    }

    public FollowGuideWidget(boolean z) {
        this.f16981h = z;
    }

    public void onClick(View view) {
        if (this.f16974a == null) {
            this.f16975b.dismiss();
            return;
        }
        if (view.equals(this.f16982i)) {
            TTLiveSDKContext.getHostService().mo10315h().mo14517a(((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8326a) C8334f.m16517a().mo14503a(this.f16974a.author().getId())).mo14504a(this.f16974a.getRequestId())).mo14507b("live_detail")).mo14508c(CustomActionPushReceiver.f104061f)).mo14506b(this.f16974a.getId())).mo14509d(this.f16974a.getLabels())).mo14510c()).mo6551j();
            HashMap hashMap = new HashMap();
            hashMap.put("scene_id", "1003");
            hashMap.put("request_page", "follow_card");
            hashMap.put("request_id", this.f16974a.getRequestId());
            hashMap.put("to_user_id", String.valueOf(this.f16974a.author().getId()));
            hashMap.put("anchor_id", String.valueOf(this.f16974a.author().getId()));
            hashMap.put("room_id", String.valueOf(this.f16974a.getId()));
            m13510a(hashMap, "enter_from_merge", "enter_method", "action_type");
            C8049c.m15979a().mo14202a("livesdk_follow", hashMap, new Object[0]);
            if (C4600j.m11040b(this.dataCenter)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("anchor_id", String.valueOf(this.f16974a.author().getId()));
                    jSONObject.put("room_id", String.valueOf(this.f16974a.getId()));
                } catch (JSONException unused) {
                }
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject).mo14222a(C4600j.m11041c(this.dataCenter));
            }
            if (C4600j.m11043d(this.dataCenter)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("anchor_id", String.valueOf(this.f16974a.author().getId()));
                    jSONObject2.put("room_id", String.valueOf(this.f16974a.getId()));
                } catch (JSONException unused2) {
                }
                C4116c.m10249a(C8612a.class);
                C8066a.m16007a().mo14223a(jSONObject2).mo14222a(C4600j.m11044e(this.dataCenter));
            }
            this.f16975b.dismiss();
        }
    }

    /* renamed from: a */
    public static void m13510a(Map<String, String> map, String... strArr) {
        C8042k kVar = (C8042k) C8049c.m15979a().mo14201a(C8059j.class);
        if (kVar != null && strArr.length > 0) {
            for (String str : strArr) {
                if (kVar.mo14192a().containsKey(str)) {
                    map.put(str, kVar.mo14192a().get(str));
                }
            }
        }
    }
}
