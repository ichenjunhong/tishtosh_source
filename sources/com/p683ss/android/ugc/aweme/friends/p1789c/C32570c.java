package com.p683ss.android.ugc.aweme.friends.p1789c;

import android.net.Uri;
import com.C2240a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.friends.invite.C32586d;
import com.p683ss.android.ugc.aweme.friends.model.ContactModel;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;
import com.p683ss.android.ugc.aweme.friends.p1788b.C32564a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.friends.c.c */
public final class C32570c implements IFetchShareConfigCallback {

    /* renamed from: a */
    final InviteContactFriendsModel f84795a;

    /* renamed from: b */
    public C32586d f84796b;

    /* renamed from: c */
    private final WeakReference<C32571a> f84797c;

    /* renamed from: com.ss.android.ugc.aweme.friends.c.c$a */
    public interface C32571a {
        /* renamed from: b */
        void mo65899b();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.c.c$b */
    public interface C32572b {
        /* renamed from: a */
        void mo65900a(String str);
    }

    public final void onFailed() {
    }

    /* renamed from: a */
    public final void mo65893a() {
        this.f84795a.fetchShareConfig(this);
    }

    /* renamed from: b */
    public final String mo65896b() {
        String str;
        try {
            str = this.f84796b.getUrl();
        } catch (Exception unused) {
            str = null;
        }
        if (C9431p.m18664a(str)) {
            return "https://m.tiktok.com/invitef/download";
        }
        return str;
    }

    public final void onSuccess(C32586d dVar) {
        this.f84796b = dVar;
        C32571a aVar = (C32571a) this.f84797c.get();
        if (aVar != null) {
            aVar.mo65899b();
        }
    }

    /* renamed from: a */
    public final String mo65892a(String str) {
        String str2;
        try {
            String text = this.f84796b.getText();
            String quote = Pattern.quote("%@");
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            return text.replaceFirst(quote, Matcher.quoteReplacement(str2));
        } catch (Exception unused) {
            return C2240a.m6772a(C32463a.m75161a().getString(R.string.ahx), new Object[]{str});
        } catch (Throwable unused2) {
            return C32463a.m75161a().getString(R.string.ahx);
        }
    }

    public C32570c(InviteContactFriendsModel inviteContactFriendsModel, C32571a aVar) {
        this.f84795a = inviteContactFriendsModel;
        this.f84797c = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo65895a(String str, C32572b bVar) {
        C9393e.submitRunnable(new C32573d(this, str, bVar));
    }

    /* renamed from: a */
    public final void mo65894a(User user, List<ContactModel> list, String str, InviteFriendsCallback inviteFriendsCallback) {
        if (user != null) {
            this.f84795a.inviteFriendsForMT(C47915gg.m103656e(user), list, str, inviteFriendsCallback);
        }
    }

    /* renamed from: a */
    public static String m75348a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        User curUser = C20854a.m53167g().getCurUser();
        if (C9431p.m18664a(str)) {
            return " ";
        }
        int b = C32564a.m75339a().mo65884b();
        if (!z) {
            str5 = "0";
        } else if (b == 1) {
            str5 = "system";
        } else {
            str5 = "manual";
        }
        if (C9431p.m18664a(str2)) {
            str2 = "0";
        }
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("user_id", C47915gg.m103665n(curUser)).appendQueryParameter("enter_from", str4).appendQueryParameter("invitemode", str3).appendQueryParameter("invitesystem", str5).appendQueryParameter("platform", str2).appendQueryParameter("copytype", "0").build().toString();
        } catch (Exception unused) {
            return str;
        }
    }
}
