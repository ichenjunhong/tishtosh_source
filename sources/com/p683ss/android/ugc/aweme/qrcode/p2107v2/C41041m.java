package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40940b;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40951i;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.m */
public final class C41041m extends QRCodeCardViewV2 {
    /* renamed from: a */
    public final C40940b mo83553a() {
        return new C40951i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ BitmapDrawable mo83555b() throws Exception {
        try {
            if (this.f104360a.mo83470a()) {
                return new BitmapDrawable(getResources(), this.f104360a.mo83471d().getAbsolutePath());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public C41041m(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo83463a(Exception exc) {
        if (!this.f104364e) {
            super.mo83463a(exc);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo83554a(C0013i iVar) throws Exception {
        if (iVar.mo34e() != null) {
            ((C13833a) this.f104361b.getHierarchy()).mo25890a(0);
            ((C13833a) this.f104361b.getHierarchy()).mo25897a((Drawable) iVar.mo34e(), C13818b.f36067g);
            this.f104365f = true;
        }
        return null;
    }

    public final void setData(C40952c cVar) {
        super.setData(cVar);
        if (this.f104360a.mo83470a()) {
            this.f104364e = true;
            Uri fromFile = Uri.fromFile(this.f104360a.mo83471d());
            C13771c.m27875c().mo26191b(fromFile);
            this.f104361b.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25725b(fromFile).mo25759b(this.f104361b.getController())).mo25751a((C13791d<? super INFO>) this.f104366g)).mo25763d());
            if (this.f104362c != null) {
                this.f104362c.mo83509c();
            }
            C0013i.m16a((Callable<TResult>) new C41042n<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C41043o<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }
}
