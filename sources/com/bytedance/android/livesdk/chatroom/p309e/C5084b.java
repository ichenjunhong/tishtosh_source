package com.bytedance.android.livesdk.chatroom.p309e;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdkapi.message.C8851g;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.b */
public abstract class C5084b<T extends C7859c> {

    /* renamed from: a */
    public T f13643a;

    /* renamed from: b */
    public int f13644b;

    /* renamed from: c */
    public int f13645c;

    /* renamed from: d */
    public boolean f13646d;

    /* renamed from: e */
    public Spannable f13647e;

    /* renamed from: f */
    protected Spannable f13648f;

    /* renamed from: g */
    public boolean f13649g;

    /* renamed from: h */
    public List<ImageModel> f13650h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.b$a */
    public interface C5085a {
        /* renamed from: a */
        void mo10992a(Bitmap bitmap, C5084b bVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.b$b */
    public interface C5086b {
        /* renamed from: a */
        void mo10993a(Spannable spannable);
    }

    /* renamed from: e */
    public abstract User mo10980e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo10981f();

    /* renamed from: g */
    public String mo10982g() {
        return "#3d000000";
    }

    /* renamed from: k */
    public List<Integer> mo10988k() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract Spannable mo10984l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Spannable mo10985m() {
        return null;
    }

    /* renamed from: o */
    public final Spannable mo10990o() {
        if (this.f13648f == null) {
            this.f13648f = mo10985m();
        }
        return this.f13648f;
    }

    /* renamed from: i */
    public final ImageModel mo10986i() {
        if (!mo10981f()) {
            return null;
        }
        User e = mo10980e();
        if (e == null || e.getUserHonor() == null) {
            return null;
        }
        return e.getUserHonor().mo8156k();
    }

    /* renamed from: j */
    public final List<ImageModel> mo10987j() {
        if (!mo10981f()) {
            return null;
        }
        User e = mo10980e();
        if (e == null) {
            return null;
        }
        if (this.f13650h != null) {
            return this.f13650h;
        }
        return e.getNewUserBadges();
    }

    /* renamed from: p */
    public final long mo10991p() {
        if (mo10980e() == null) {
            return 0;
        }
        return mo10980e().getId();
    }

    /* renamed from: n */
    public final Spannable mo10989n() {
        if (this.f13647e == null || TextUtils.isEmpty(this.f13647e.toString())) {
            if (!this.f13643a.supportDisplayText()) {
                this.f13647e = mo10984l();
            } else if (!(this.f13643a.baseMessage == null || this.f13643a.baseMessage.f24139j == null)) {
                C8851g gVar = this.f13643a.baseMessage.f24139j;
                String str = null;
                String str2 = gVar.f24156b;
                if (gVar.f24155a != null) {
                    str = C7676b.m15696a().mo14036a(gVar.f24155a);
                }
                if (!(str == null && str2 == null)) {
                    if (TextUtils.isEmpty(str)) {
                        str = str2;
                    }
                    this.f13647e = C5115z.m11759a(str, gVar, this);
                }
            }
        }
        return this.f13647e;
    }

    public C5084b(T t) {
        this(t, 0);
    }

    public C5084b(T t, int i) {
        this.f13643a = t;
        this.f13644b = i;
    }
}
