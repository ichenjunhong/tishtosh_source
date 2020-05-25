package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C3007g;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.broadcast.utils.C3637e.C3638a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4182c;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import p064c.p065a.p069b.C1689b;

/* renamed from: com.bytedance.android.live.broadcast.widget.s */
public final class C3792s implements OnClickListener {

    /* renamed from: j */
    private static int f10712j = 1;

    /* renamed from: k */
    private static int f10713k = 1;

    /* renamed from: l */
    private static int f10714l = 750;

    /* renamed from: m */
    private static int f10715m = 750;

    /* renamed from: a */
    HSImageView f10716a;

    /* renamed from: b */
    TextView f10717b;

    /* renamed from: c */
    C3846a f10718c;

    /* renamed from: d */
    C4182c f10719d;

    /* renamed from: e */
    String f10720e;

    /* renamed from: f */
    public final C1689b f10721f;

    /* renamed from: g */
    C8710m f10722g;

    /* renamed from: h */
    C3007g f10723h;

    /* renamed from: i */
    StartLiveViewModel f10724i;

    /* renamed from: n */
    private View f10725n;

    /* renamed from: b */
    public final void mo9165b() {
        if (this.f10720e == null) {
            this.f10719d.mo9580c();
        }
    }

    /* renamed from: a */
    public final String mo9163a() {
        if (this.f10723h != null) {
            if (this.f10723h.f8840a != null) {
                return this.f10723h.f8840a;
            }
            if (!C9376b.m18558a((Collection<T>) this.f10723h.f8841b)) {
                return Uri.parse((String) this.f10723h.f8841b.get(0)).toString();
            }
        }
        return "";
    }

    /* renamed from: a */
    static C3007g m9645a(ImageModel imageModel) {
        if (imageModel == null) {
            return null;
        }
        C3007g gVar = new C3007g();
        gVar.f8840a = imageModel.mUri;
        gVar.f8841b = imageModel.mUrls;
        return gVar;
    }

    /* renamed from: a */
    public final void mo9164a(Throwable th) {
        String str;
        if (th instanceof C2949a) {
            str = ((C2949a) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f10718c.getString(R.string.eyk);
        }
        this.f10720e = null;
        if (this.f10718c.mo8452l()) {
            this.f10719d.mo9579b();
            C4204a.m10423a(this.f10718c.getContext(), str);
        }
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.bcj) {
            mo9165b();
            HashMap hashMap = new HashMap();
            hashMap.put("live_type", C3638a.m9476a(this.f10722g));
            C8049c.m15979a().mo14202a("cover_modify_click", hashMap, new C8059j().mo14218f("click").mo14214b(CustomActionPushReceiver.f104061f).mo14213a("live_take_page"));
        }
    }

    public C3792s(View view, C3846a aVar, StartLiveViewModel startLiveViewModel) {
        this(view, aVar, startLiveViewModel, f10712j, f10713k);
    }

    private C3792s(View view, C3846a aVar, StartLiveViewModel startLiveViewModel, int i, int i2) {
        this.f10721f = new C1689b();
        f10712j = i;
        f10713k = i2;
        if (i > i2) {
            f10714l = 480;
            f10715m = 270;
        } else if (i < i2) {
            f10714l = 270;
            f10715m = 480;
        }
        this.f10718c = aVar;
        this.f10724i = startLiveViewModel;
        this.f10716a = (HSImageView) view.findViewById(R.id.bcj);
        this.f10716a.setImageResource(R.drawable.bnz);
        this.f10716a.setOnClickListener(this);
        this.f10717b = (TextView) view.findViewById(R.id.dba);
        this.f10725n = view.findViewById(R.id.bck);
        this.f10719d = ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).createImagePicker(this.f10718c.getActivity(), this.f10718c, "cover", f10712j, f10713k, f10714l, f10715m, new C3794t(this));
        if (this.f10718c.mo8452l()) {
            this.f10717b.setText(this.f10718c.getString(R.string.efb));
            this.f10717b.setAlpha(0.64f);
        }
    }
}
