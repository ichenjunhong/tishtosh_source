package com.p683ss.android.ugc.aweme.profile.edit;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.os.Parcelable;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40265bp;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.util.C40537b;
import com.p683ss.android.ugc.aweme.profile.util.C40537b.C40541a;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.a */
public final class C39835a extends C39948a implements C40541a {

    /* renamed from: a */
    public boolean f101649a;

    /* renamed from: b */
    public final void mo80924b() {
        this.f101649a = true;
        if (this.f101827c != null) {
            ((C40265bp) this.f101827c).mo70161e();
        }
    }

    /* renamed from: c */
    public final void mo80927c() {
        if (this.f101826b != null && !TextUtils.isEmpty(this.f101829e)) {
            ((C40537b) this.f101826b).mo82809a(this.f101829e);
        }
    }

    /* renamed from: b */
    public final void mo80926b(String str) {
        if (this.f101827c != null) {
            ((C40265bp) this.f101827c).mo70158b(str);
        }
        this.f101829e = str;
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f101827c != null) {
            if (message.obj instanceof Exception) {
                if (this.f101828d >= 4 || this.f101826b == null) {
                    Exception exc = (Exception) message.obj;
                    String str3 = "aweme_avartar_upload_error_rate";
                    C23088c a = C23088c.m56631a();
                    String str4 = "errorDesc";
                    boolean z = exc instanceof C23459a;
                    if (z) {
                        str = ((C23459a) exc).getErrorMsg();
                    } else {
                        str = exc.getMessage();
                    }
                    C23088c a2 = a.mo47824a(str4, str);
                    String str5 = "errorCode";
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(((C23459a) exc).getErrorCode());
                        str2 = sb.toString();
                    } else {
                        str2 = "-1";
                    }
                    C23131p.m57776a(str3, 1, a2.mo47824a(str5, str2).mo47825b());
                    ((C40265bp) this.f101827c).mo70157b((Exception) message.obj);
                    if (this.f101826b != null) {
                        this.f101826b.mo82835d();
                    }
                    return;
                }
                this.f101828d++;
                ((C40537b) this.f101826b).mo82807a((this.f101828d << 1) * 1000);
            } else if (message.obj instanceof AvatarUri) {
                ((C40265bp) this.f101827c).mo70156b((AvatarUri) message.obj);
                C23131p.m57776a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo80921a(Activity activity, Fragment fragment) {
        this.f101826b = new C40537b(activity, fragment, new C9381g(this), this);
    }

    /* renamed from: b */
    public final void mo80925b(Activity activity, Fragment fragment) {
        this.f101826b = new C40537b(activity, fragment, new C9381g(this), this);
    }

    /* renamed from: a */
    public final void mo80922a(Activity activity, View view) {
        String[] strArr;
        User curUser = C20902b.m53242a().getCurUser();
        C40026s sVar = C40026s.f101964a;
        C47661ab a = C47661ab.m103163a().mo94970a("extra_zoom_info", (Parcelable) ZoomAnimationUtils.m103150a(view)).mo94973a("enable_edit_img", false).mo94973a("enable_download_img", true);
        String str = "uri";
        if (TextUtils.isEmpty(this.f101829e)) {
            strArr = C47915gg.m103648a(C47915gg.m103658g(curUser));
        } else {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(this.f101829e);
            strArr = new String[]{Uri.parse(sb.toString()).toString()};
        }
        sVar.startHeaderDetailActivity(activity, a.mo94974a(str, strArr).mo94971a("share_info", (Serializable) curUser).f120139a);
    }

    /* renamed from: a */
    public final boolean mo80923a(int i, int i2, Intent intent) {
        return super.mo80923a(i, i2, intent);
    }
}
