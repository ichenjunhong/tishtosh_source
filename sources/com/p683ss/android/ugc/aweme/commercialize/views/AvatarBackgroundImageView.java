package com.p683ss.android.ugc.aweme.commercialize.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.log.C26086j;
import com.p683ss.android.ugc.aweme.commercialize.p1571g.C25931a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AvatarBackgroundImageView */
public class AvatarBackgroundImageView extends RemoteImageView implements C39978l, C39985s {

    /* renamed from: a */
    private C25931a f70056a;

    /* renamed from: b */
    private C39954ad f70057b;

    /* renamed from: c */
    private Activity f70058c;

    /* renamed from: d */
    private boolean f70059d;

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    public AvatarBackgroundImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        if (this.f70056a != null) {
            C25931a aVar = this.f70056a;
            if (aVar.f68479a != null) {
                aVar.f68479a.mo82832b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        if (this.f70056a != null) {
            this.f70056a.mo53277b();
        }
        if (this.f70057b == null || avatarUri == null) {
            C10691a.m21548c(getContext(), (int) R.string.czz).mo19066a();
            return;
        }
        User curUser = C20902b.m53242a().getCurUser();
        if (!C47915gg.m103662k(curUser)) {
            this.f70057b.mo81852a(avatarUri.uri, 2);
            this.f70059d = true;
            return;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(avatarUri.uri);
        urlModel.setUrlList(avatarUri.urlList);
        curUser.getCommerceInfo().setHeadImageUrl(urlModel);
        C23515d.m57669a((RemoteImageView) this, urlModel);
        C10691a.m21533a(getContext(), (int) R.string.czi).mo19066a();
        C26086j.m57776a("aweme_header_image_upload_error_rate", 0, (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        if ((!(this.f70058c instanceof AmeActivity) || ((AmeActivity) this.f70058c).isViewValid()) && this.f70056a != null) {
            this.f70056a.mo53277b();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", exc.toString());
            } catch (Exception unused) {
            }
            C26086j.m57776a("aweme_header_image_upload_error_rate", 1, jSONObject);
            C22971a.m56494a(getContext(), exc, R.string.czz);
        }
    }

    public AvatarBackgroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarBackgroundImageView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        if (this.f70059d) {
            C10691a.m21548c(getContext(), (int) R.string.czz).mo19066a();
            C22971a.m56494a(getContext(), exc, R.string.czy);
        }
        this.f70059d = false;
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        if (this.f70059d) {
            C10691a.m21533a(getContext(), (int) R.string.czi).mo19066a();
            C39954ad adVar = this.f70057b;
            if (!adVar.f101836a) {
                adVar.f101836a = true;
                C20854a.m53167g().queryUser(adVar.f101839d);
            }
        }
        this.f70059d = false;
    }
}
