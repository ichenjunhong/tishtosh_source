package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33380e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.h */
public final class C33418h extends C33393ac implements C33445y {

    /* renamed from: a */
    C11207p f86635a;

    /* renamed from: b */
    public StoryPictureContent f86636b;

    /* renamed from: c */
    public C33445y f86637c;

    /* renamed from: d */
    private C9381g f86638d;

    /* renamed from: a */
    public final void mo70782a() {
        if (this.f86637c != null) {
            this.f86637c.mo70782a();
        }
        mo70776b();
    }

    public final void run() {
        super.run();
        if (!C33423l.m76617a(C11010c.m22280a())) {
            mo70784a("99");
            return;
        }
        List checkPics = this.f86636b.getCheckPics();
        if (checkPics == null || checkPics.size() == 0) {
            mo70784a("96");
            return;
        }
        C33380e.m76540a().mo70771a((String) this.f86636b.getCheckPics().get(0), 1, (C33445y) new C33445y() {
            /* renamed from: a */
            public final void mo70782a() {
            }

            /* renamed from: a */
            public final void mo70783a(double d) {
            }

            /* renamed from: a */
            public final void mo70784a(String str) {
                C33418h.this.mo70784a(str);
            }

            /* renamed from: a */
            public final void mo70785a(Throwable th) {
                C33418h.this.mo70785a(th);
            }

            /* renamed from: a */
            public final void mo70787a(String str, UrlModel urlModel) {
                String str2;
                if (urlModel != null) {
                    C35186ab.m79434b(str);
                    C33418h.this.f86636b.getCheckPics().set(0, urlModel.getUri());
                    if (C33418h.this.f86636b.isSendRaw()) {
                        str2 = C33418h.this.f86636b.getPicturePath();
                    } else if (TextUtils.isEmpty(C33418h.this.f86636b.getCompressPath())) {
                        str2 = C33418h.this.f86636b.getPicturePath();
                    } else {
                        str2 = C33418h.this.f86636b.getCompressPath();
                    }
                    C33380e.m76540a().mo70771a(str2, 0, (C33445y) C33418h.this, false);
                }
            }
        }, false);
    }

    /* renamed from: a */
    public final void mo70783a(double d) {
        if (this.f86637c != null) {
            this.f86637c.mo70783a(d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33418h)) {
            return false;
        }
        return this.f86585f.equals(((C33418h) obj).f86585f);
    }

    /* renamed from: a */
    public final void mo70784a(String str) {
        if (this.f86637c != null) {
            this.f86637c.mo70784a(str);
        }
        if (this.f86635a != null) {
            this.f86638d.post(new C33422k(this));
        }
        mo70776b();
        m76606a((Object) str, true);
        C35190af.m79442a().mo73319a(this.f86635a);
    }

    /* renamed from: a */
    public final void mo70785a(Throwable th) {
        if (this.f86637c != null) {
            this.f86637c.mo70785a(th);
        }
        if (this.f86635a != null) {
            this.f86638d.post(new C33421j(this));
        }
        mo70776b();
        m76606a((Object) th, true);
        C35190af.m79442a().mo73319a(this.f86635a);
    }

    /* renamed from: a */
    private void m76606a(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "EncryptImageUploadItem");
        if (obj != null) {
            if (z) {
                hashMap.put("error", obj);
            } else {
                hashMap.put("success", obj);
            }
        }
        hashMap.put("message", this.f86635a);
        C35265e.m79726a("message_upload_image", hashMap);
        if (z) {
            C35265e.m79731b("message_upload_image_error", hashMap);
        }
    }

    /* renamed from: a */
    public final void mo70787a(String str, UrlModel urlModel) {
        if (urlModel != null) {
            C35186ab.m79434b(this.f86636b.getCompressPath());
            this.f86636b.setUrl((C33376a) urlModel);
            if (this.f86637c != null) {
                this.f86637c.mo70787a(str, urlModel);
            }
            if (this.f86635a != null) {
                this.f86635a.setContent(C35277o.m79761a(this.f86636b));
                this.f86638d.post(new C33420i(this));
            }
        }
        mo70776b();
        m76606a((Object) str, false);
    }

    public C33418h(C9381g gVar, StoryPictureContent storyPictureContent, C11207p pVar) {
        this.f86638d = gVar;
        this.f86636b = storyPictureContent;
        this.f86635a = pVar;
        this.f86585f = m76551a(this.f86635a);
    }
}
