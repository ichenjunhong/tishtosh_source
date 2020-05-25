package com.p683ss.android.ugc.aweme.feedback.reply;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p683ss.android.ugc.aweme.app.C23128m;
import com.p683ss.android.ugc.aweme.feedback.C31273f;
import com.p683ss.android.ugc.aweme.feedback.C31284m;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.feedback.reply.a */
public class C31291a implements Callback {

    /* renamed from: c */
    private static final String f82037c = "a";

    /* renamed from: a */
    public Handler f82038a = new Handler(this.f82039b.getMainLooper(), this);

    /* renamed from: b */
    public Context f82039b;

    public C31291a(Context context) {
        this.f82039b = context.getApplicationContext();
    }

    public boolean handleMessage(Message message) {
        boolean z;
        if (message.obj instanceof C31294c) {
            C31294c cVar = (C31294c) message.obj;
            if (cVar.f82043b == 0 && cVar.f82044c != null && cVar.f82044c.f82046b.booleanValue()) {
                Activity g = C11016e.m22312g();
                if (!(g instanceof C31284m) && (g instanceof AbsActivity) && ((AbsActivity) g).isActive()) {
                    if (C23128m.m56685a() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C47718bf.m103288a(new C31273f());
                    }
                }
            }
        } else if (message.obj instanceof Exception) {
            Object obj = message.obj;
        }
        return false;
    }
}
