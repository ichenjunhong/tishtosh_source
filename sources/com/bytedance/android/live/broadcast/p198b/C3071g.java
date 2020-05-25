package com.bytedance.android.live.broadcast.p198b;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3886c;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.widget.C8543d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.b.g */
public final class C3071g extends C8543d implements OnClickListener {

    /* renamed from: a */
    public boolean f8970a;

    /* renamed from: b */
    private String f8971b;

    /* renamed from: c */
    private String f8972c;

    /* renamed from: d */
    private String f8973d;

    /* renamed from: e */
    private String f8974e;

    /* renamed from: f */
    private TextView f8975f;

    /* renamed from: h */
    private TextView f8976h;

    /* renamed from: i */
    private TextView f8977i;

    /* renamed from: j */
    private TextView f8978j;

    /* renamed from: k */
    private TextView f8979k;

    /* renamed from: l */
    private TextView f8980l;

    /* renamed from: m */
    private TextView f8981m;

    /* renamed from: n */
    private TextView f8982n;

    /* renamed from: o */
    private TextView f8983o;

    /* renamed from: p */
    private Room f8984p;

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.bw1;
    }

    /* renamed from: a */
    private void m8557a(boolean z) {
        String str;
        String str2;
        String str3;
        if (z) {
            str = "livesdk_server_url_copy";
        } else {
            str = "livesdk_stream_key_copy";
        }
        HashMap hashMap = new HashMap();
        String str4 = "room_id";
        if (this.f8984p == null) {
            str2 = "";
        } else {
            str2 = this.f8984p.getIdStr();
        }
        hashMap.put(str4, str2);
        String str5 = "request_page";
        if (this.f8970a) {
            str3 = "live_start";
        } else {
            str3 = "live_room";
        }
        hashMap.put(str5, str3);
        C8049c.m15979a().mo14202a(str, hashMap, new Object[0]);
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ean) {
            ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(getContext(), C4704c.m11227b(this.f8971b).mo10505a(C3922z.m9903a((int) R.string.enx)));
            HashMap hashMap = new HashMap();
            hashMap.put("request_page", "live_room");
            C8049c.m15979a().mo14202a("thirdparty_take_guide", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_take_page"));
        } else if (id == R.id.ev3) {
            m8556a(this.f8973d, true);
        } else {
            if (id == R.id.ev0) {
                m8556a(this.f8974e, false);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8971b = (String) LiveConfigSettingKeys.LIVE_OBS_HELPER_PAGE.mo9431a();
        int indexOf = this.f8972c.indexOf("stream-");
        if (indexOf == -1) {
            this.f8974e = this.f8972c;
            this.f8973d = this.f8972c;
        } else {
            this.f8973d = this.f8972c.substring(0, indexOf);
            this.f8974e = this.f8972c.substring(indexOf);
        }
        this.f8975f = (TextView) findViewById(R.id.d1l);
        this.f8976h = (TextView) findViewById(R.id.ean);
        this.f8977i = (TextView) findViewById(R.id.ev4);
        this.f8978j = (TextView) findViewById(R.id.ev1);
        this.f8979k = (TextView) findViewById(R.id.ev3);
        this.f8980l = (TextView) findViewById(R.id.ev0);
        this.f8981m = (TextView) findViewById(R.id.eux);
        this.f8982n = (TextView) findViewById(R.id.euy);
        this.f8983o = (TextView) findViewById(R.id.euz);
        this.f8976h.setOnClickListener(this);
        this.f8979k.setOnClickListener(this);
        this.f8980l.setOnClickListener(this);
        this.f8977i.setText(this.f8973d);
        this.f8978j.setText(this.f8974e);
    }

    /* renamed from: a */
    private void m8556a(String str, boolean z) {
        int i;
        try {
            C3886c.m9822a(str);
            if (z) {
                i = R.string.h0y;
            } else {
                i = R.string.h11;
            }
            C4575an.m10981a(i);
            m8557a(z);
        } catch (Exception unused) {
            C4575an.m10981a((int) R.string.eez);
        }
    }

    public C3071g(Context context, String str, Room room) {
        super(context);
        this.f8972c = str;
        this.f8984p = room;
    }
}
