package com.p683ss.android.ugc.aweme.account.util;

import android.os.Message;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.profile.UserResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.util.x */
public final class C22287x implements C9382a {

    /* renamed from: a */
    public C22269k f60056a;

    /* renamed from: b */
    private boolean f60057b = false;

    /* renamed from: c */
    private C9381g f60058c = new C9381g(this);

    /* renamed from: a */
    public final void mo46383a(Map<String, String> map) {
        if (map != null && map.size() != 0 && !this.f60057b) {
            this.f60057b = true;
            C23826bi.m58449a().updateUserInfo(this.f60058c, map);
        }
    }

    public final void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            int i = message.what;
            if (i == 112) {
                this.f60057b = false;
            }
            if (this.f60056a != null) {
                this.f60056a.mo45346a(exc, i);
                if (!this.f60057b) {
                    this.f60056a.mo45348c(false);
                }
            }
        } else if (message.obj instanceof User) {
            m55164a((User) message.obj, message.what);
        } else {
            if (message.obj instanceof UserResponse) {
                UserResponse userResponse = (UserResponse) message.obj;
                if (userResponse.getAction() == 1) {
                    m55165a(userResponse.status_msg, true);
                } else if (userResponse.getAction() == 2) {
                    m55165a(userResponse.status_msg, false);
                } else {
                    m55164a(userResponse.getUser(), message.what);
                }
            }
        }
    }

    /* renamed from: a */
    private void m55165a(String str, boolean z) {
        this.f60057b = false;
        if (this.f60056a != null) {
            this.f60056a.mo45347a(str, z);
        }
    }

    /* renamed from: a */
    private void m55164a(User user, int i) {
        if (user != null) {
            if (i == 112) {
                this.f60057b = false;
                C23826bi.m58457a(user);
            }
            if (this.f60056a != null && !this.f60057b) {
                this.f60056a.mo45348c(true);
            }
        }
    }
}
