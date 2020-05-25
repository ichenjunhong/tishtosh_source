package com.bytedance.android.live.broadcast.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4182c;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.p683ss.android.ugc.aweme.commercialize.abtest.NormalSplashDelayExperiment;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.broadcast.widget.k */
public final class C3776k implements OnClickListener {

    /* renamed from: j */
    private static int f10664j = 1;

    /* renamed from: k */
    private static int f10665k = 1;

    /* renamed from: l */
    private static int f10666l = 750;

    /* renamed from: m */
    private static int f10667m = 750;

    /* renamed from: a */
    public HSImageView f10668a;

    /* renamed from: b */
    public View f10669b;

    /* renamed from: c */
    public TextView f10670c;

    /* renamed from: d */
    C3846a f10671d;

    /* renamed from: e */
    public C4182c f10672e;

    /* renamed from: f */
    public String f10673f;

    /* renamed from: g */
    public final C1689b f10674g;

    /* renamed from: h */
    C3007g f10675h;

    /* renamed from: i */
    User f10676i;

    /* renamed from: n */
    private C8710m f10677n;

    /* renamed from: a */
    public final String mo9148a() {
        if (this.f10675h == null) {
            return null;
        }
        return this.f10675h.f8840a;
    }

    /* renamed from: b */
    public final void mo9151b() {
        if (this.f10673f == null) {
            this.f10672e.mo9580c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo9152c() {
        if (this.f10677n == null || this.f10677n.equals(C8710m.VIDEO)) {
            return "video_live";
        }
        if (this.f10677n.equals(C8710m.THIRD_PARTY)) {
            return "third_party";
        }
        return "video_live";
    }

    /* renamed from: a */
    public final void mo9149a(C8710m mVar) {
        if (mVar != this.f10677n) {
            this.f10677n = mVar;
        }
    }

    /* renamed from: a */
    public final void mo9150a(Throwable th) {
        String str;
        if (th instanceof C2949a) {
            str = ((C2949a) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = C3922z.m9903a((int) R.string.eyk);
        }
        this.f10673f = null;
        if (this.f10671d.mo8452l()) {
            this.f10672e.mo9579b();
            C4204a.m10423a(C3922z.m9915e(), str);
        }
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.bcj) {
            mo9151b();
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", mo9152c());
            if (this.f10676i != null) {
                hashMap.put("anchor_id", String.valueOf(this.f10676i.getId()));
            }
            C3837e.m9744a("ttlive_upload_cover_start", 0, (JSONObject) null);
            C8049c.m15979a().mo14202a("livesdk_cover_modify_click", hashMap, new C8059j().mo14218f("click").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("live_take_page"));
        }
    }

    public C3776k(View view, C3846a aVar) {
        this(view, aVar, f10664j, f10665k);
    }

    /* renamed from: a */
    public static void m9620a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    private C3776k(View view, C3846a aVar, int i, int i2) {
        C8333e eVar;
        C3009i iVar;
        this.f10674g = new C1689b();
        C4282a aVar2 = (C4282a) C4116c.m10249a(C4282a.class);
        User user = null;
        if (aVar2 != null) {
            eVar = aVar2.user();
        } else {
            eVar = null;
        }
        if (eVar != null) {
            iVar = eVar.mo14521a();
        } else {
            iVar = null;
        }
        if (iVar instanceof User) {
            user = (User) iVar;
        }
        this.f10676i = user;
        f10664j = i;
        f10665k = i2;
        if (i > i2) {
            f10666l = 480;
            f10667m = 270;
        } else if (i < i2) {
            f10666l = 270;
            f10667m = 480;
        }
        int i3 = NormalSplashDelayExperiment.GROUP1;
        if (LiveSettingKeys.LIVE_COVER_MIN_SIZE.mo9431a() != null) {
            i3 = ((Integer) LiveSettingKeys.LIVE_COVER_MIN_SIZE.mo9431a()).intValue();
        }
        f10666l = i3;
        f10667m = i3;
        this.f10671d = aVar;
        this.f10668a = (HSImageView) view.findViewById(R.id.bcj);
        this.f10668a.setImageResource(R.drawable.bnz);
        this.f10668a.setOnClickListener(this);
        this.f10670c = (TextView) view.findViewById(R.id.dba);
        this.f10669b = view.findViewById(R.id.bck);
        this.f10672e = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).createImagePicker(this.f10671d.getActivity(), this.f10671d, "cover", f10664j, f10665k, f10666l, f10667m, new C3778l(this));
        if (this.f10671d.mo8452l()) {
            this.f10670c.setText(C3922z.m9903a((int) R.string.efa));
            this.f10670c.setAlpha(0.64f);
            this.f10674g.mo6181a(C3395f.m9156f().mo8742c().mo9022e().anchorCoverStatus().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3779m<Object>(this), C3780n.f10682a));
        }
    }
}
