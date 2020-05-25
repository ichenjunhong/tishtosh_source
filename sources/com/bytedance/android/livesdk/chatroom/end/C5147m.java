package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.C2240a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.C3031a;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4187f;
import com.bytedance.android.livesdk.browser.p289c.C4697b;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4703e;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p433a.C8614a;
import com.ss.android.ugc.trill.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.m */
public final class C5147m extends C5145k implements C4187f {

    /* renamed from: a */
    private FrameLayout f13801a;

    /* renamed from: b */
    private Room f13802b;

    /* renamed from: c */
    private C4703e f13803c;

    /* renamed from: d */
    private long f13804d;

    /* renamed from: e */
    private long f13805e;

    /* renamed from: a */
    public final void mo9602a(C3031a aVar) {
    }

    public final void onPause() {
        super.onPause();
        this.f13805e += SystemClock.elapsedRealtime() - this.f13804d;
    }

    public final void onResume() {
        super.onResume();
        this.f13804d = SystemClock.elapsedRealtime();
    }

    public final void onDestroy() {
        super.onDestroy();
        ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10494a(this.f13803c);
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(this.f13805e));
        C8049c.m15979a().mo14202a("live_end_duration", hashMap, C8059j.class, Room.class);
    }

    /* renamed from: a */
    private String m11798a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13802b.finish_url);
        sb.append("?anchor_avatar=%s");
        String sb2 = sb.toString();
        String str = "";
        if (this.f13802b.getOwner() != null) {
            ImageModel avatarLarge = this.f13802b.getOwner().getAvatarLarge();
            if (avatarLarge != null) {
                List urls = avatarLarge.getUrls();
                if (urls != null && urls.size() > 0) {
                    str = (String) urls.get(0);
                }
            }
            try {
                str = URLEncoder.encode(str, "utf-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return C2240a.m6773a(Locale.US, sb2, new Object[]{str});
    }

    public final void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11036a(View view) {
        mo11034d();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f13802b != null && !TextUtils.isEmpty(this.f13802b.finish_url)) {
            this.f13801a = (FrameLayout) mo11032a(R.id.d8);
            mo11032a(R.id.iw).setOnClickListener(new C5148n(this));
            C4697b webViewManager = ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager();
            if (this.f13803c == null) {
                this.f13803c = webViewManager.mo10489a((Activity) getActivity(), C5149o.f13807a);
                if (VERSION.SDK_INT <= 19) {
                    this.f13803c.f12813a.setLayerType(1, null);
                }
                this.f13803c.f12813a.setBackgroundColor(0);
                this.f13803c.f12813a.setLayoutParams(this.f13801a.getLayoutParams());
                this.f13801a.addView(this.f13803c.f12813a);
            }
            webViewManager.mo10495a(this.f13803c, Uri.parse(m11798a()).buildUpon().toString());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.bwg, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo9601a(Activity activity, Room room, C8614a aVar, String str) {
        this.f13802b = room;
    }
}
