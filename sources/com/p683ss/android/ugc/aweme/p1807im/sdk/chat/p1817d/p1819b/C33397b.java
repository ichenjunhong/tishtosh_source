package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11178a;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EncryptedVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33393ac;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.C33445y;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33376a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1818a.C33380e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34424d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileParam;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService.CompileResult;
import java.util.HashMap;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.b.b */
public final class C33397b extends C33393ac implements C33396a {

    /* renamed from: a */
    C11207p f86589a;

    /* renamed from: b */
    public StoryVideoContent f86590b;

    /* renamed from: c */
    public C33396a f86591c;

    /* renamed from: d */
    private C9381g f86592d;

    /* renamed from: d */
    private void m76559d() {
        if (this.f86589a != null) {
            this.f86592d.post(new C33401e(this));
        }
    }

    /* renamed from: a */
    public final void mo70782a() {
        if (this.f86591c != null) {
            this.f86591c.mo70782a();
        }
        mo70776b();
    }

    /* renamed from: c */
    private void m76558c() {
        if (!C33402f.m76571a(C11010c.m22280a())) {
            mo70784a("99");
            return;
        }
        C11178a aVar = null;
        final C11178a aVar2 = null;
        for (C11178a aVar3 : this.f86589a.getAttachments()) {
            if (aVar3 != null) {
                if (aVar == null && aVar3.getIndex() == 0) {
                    aVar = aVar3;
                } else if (aVar2 == null && aVar3.getIndex() == 1) {
                    aVar2 = aVar3;
                }
                if (!(aVar == null || aVar2 == null)) {
                    break;
                }
            }
        }
        if (aVar == null || TextUtils.isEmpty(aVar.getLocalPath())) {
            mo70784a("96");
        } else if (aVar2 == null || TextUtils.isEmpty(aVar2.getLocalPath())) {
            mo70784a("102");
        } else {
            C33380e.m76540a().mo70771a(aVar.getLocalPath(), 1, (C33445y) new C33445y() {
                /* renamed from: a */
                public final void mo70782a() {
                }

                /* renamed from: a */
                public final void mo70783a(double d) {
                }

                /* renamed from: a */
                public final void mo70784a(String str) {
                    C33397b.this.mo70784a(str);
                }

                /* renamed from: a */
                public final void mo70785a(Throwable th) {
                    C33397b.this.mo70785a(th);
                }

                /* renamed from: a */
                public final void mo70787a(String str, UrlModel urlModel) {
                    if (urlModel != null) {
                        C33397b.this.f86590b.getCheckPicList().add(urlModel.getUri());
                        C33380e.m76540a().mo70773a(aVar2.getLocalPath(), C33397b.this, false);
                    }
                }
            }, false);
        }
    }

    public final void run() {
        super.run();
        if (this.f86589a.getAttachments() == null || this.f86589a.getAttachments().size() < 3) {
            mo70784a("96");
            return;
        }
        for (C11178a aVar : this.f86589a.getAttachments()) {
            if (aVar != null && aVar.getStatus() < 0 && aVar.getIndex() == 1) {
                String localPath = aVar.getLocalPath();
                if (TextUtils.isEmpty(localPath)) {
                    C32458a.m75144a("EncryptedVideoUploadItem compileVideoAndUpload path empty");
                    mo70784a("102");
                    return;
                }
                C34424d.m78368a(new CompileParam(localPath, this.f86590b.getWidth(), this.f86590b.getHeight()), new C33399c(this));
                return;
            }
        }
        m76558c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C52860x mo70781a(CompileResult compileResult) {
        if (compileResult != null) {
            StoryVideoContent.updateAfterVECompile(this.f86590b, this.f86589a, compileResult);
            m76558c();
            return null;
        }
        C32458a.m75144a("EncryptedVideoUploadItem compileVideoAndUpload compile failed");
        mo70784a("105");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33397b)) {
            return false;
        }
        return this.f86585f.equals(((C33397b) obj).f86585f);
    }

    /* renamed from: a */
    public final void mo70783a(double d) {
        if (this.f86591c != null) {
            this.f86591c.mo70783a(d);
        }
    }

    /* renamed from: a */
    public final void mo70784a(String str) {
        if (this.f86591c != null) {
            this.f86591c.mo70784a(str);
        }
        m76559d();
        mo70776b();
        m76557a(str, true);
    }

    /* renamed from: a */
    public final void mo70785a(Throwable th) {
        if (this.f86591c != null) {
            this.f86591c.mo70785a(th);
        }
        m76559d();
        mo70776b();
        m76557a(th, true);
    }

    /* renamed from: a */
    private void m76557a(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "EncryptedVideoUploadItem");
        if (obj != null) {
            if (z) {
                hashMap.put("error", obj);
            } else {
                hashMap.put("success", obj);
            }
        }
        hashMap.put("message", this.f86589a);
        C35265e.m79726a("message_upload_video", hashMap);
        if (z) {
            C35265e.m79731b("message_upload_video_error", hashMap);
        }
    }

    public C33397b(C9381g gVar, StoryVideoContent storyVideoContent, C11207p pVar) {
        this.f86592d = gVar;
        this.f86589a = pVar;
        this.f86590b = storyVideoContent;
        this.f86585f = m76551a(this.f86589a);
    }

    /* renamed from: a */
    public final void mo70780a(String str, EncryptedVideoContent encryptedVideoContent, C33376a aVar) {
        if (encryptedVideoContent != null) {
            this.f86590b.setPoster(aVar);
            this.f86590b.setVideo(encryptedVideoContent);
            if (this.f86591c != null) {
                this.f86591c.mo70780a(str, encryptedVideoContent, aVar);
            }
            if (this.f86589a != null) {
                this.f86589a.setContent(C35277o.m79761a(this.f86590b));
                this.f86592d.post(new C33400d(this));
            }
        }
        mo70776b();
        m76557a(str, false);
    }
}
