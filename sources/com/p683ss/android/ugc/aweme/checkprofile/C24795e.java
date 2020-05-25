package com.p683ss.android.ugc.aweme.checkprofile;

import com.p683ss.android.ugc.aweme.checkprofile.api.CheckProfileManager.Response;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;

/* renamed from: com.ss.android.ugc.aweme.checkprofile.e */
public final class C24795e extends C26851b<C26832a<Response>, C24796f> {

    /* renamed from: a */
    private int f65626a;

    /* renamed from: b */
    private boolean f65627b = true;

    /* renamed from: c */
    private boolean f65628c;

    /* renamed from: R_ */
    public final void mo44834R_() {
        super.mo44834R_();
        ((C24796f) this.f70701g).mo50668b();
    }

    /* renamed from: d */
    public final void mo50676d() {
        if (this.f65627b && !this.f65628c) {
            mo44934a_(Integer.valueOf(this.f65626a), Integer.valueOf(20));
            this.f65628c = true;
        }
    }

    /* renamed from: b */
    public final void mo44838b() {
        String str;
        super.mo44838b();
        this.f65628c = false;
        Response response = (Response) this.f70700f.getData();
        if (response == null || response.users == null || response.status_code != 0) {
            C24796f fVar = (C24796f) this.f70701g;
            if (response == null) {
                str = "response is null";
            } else {
                StringBuilder sb = new StringBuilder("status_code: ");
                sb.append(response.status_code);
                str = sb.toString();
            }
            fVar.mo50666a(str);
            return;
        }
        this.f65627b = response.has_more;
        this.f65626a = response.cursor;
        ((C24796f) this.f70701g).mo50667a(response.users, this.f65627b);
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        this.f65628c = false;
        super.mo44840c_(exc);
        ((C24796f) this.f70701g).mo50666a(exc.getMessage());
    }
}
