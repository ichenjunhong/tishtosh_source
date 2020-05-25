package com.p2620vk.sdk.dialogs;

import android.graphics.Bitmap;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p2620vk.sdk.api.C52351b;
import com.p2620vk.sdk.api.C52352c;
import com.p2620vk.sdk.api.p2622a.C52327a;
import com.p2620vk.sdk.api.p2622a.C52333b;
import com.p2620vk.sdk.api.p2622a.C52343e;
import com.p2620vk.sdk.api.p2622a.C52343e.C52346a;

/* renamed from: com.vk.sdk.dialogs.a */
public class C52424a {

    /* renamed from: f */
    public static final /* synthetic */ boolean f130764f = (!C52424a.class.desiredAssertionStatus());

    /* renamed from: a */
    public final C52351b f130765a;

    /* renamed from: b */
    public EditText f130766b;

    /* renamed from: c */
    public ImageView f130767c;

    /* renamed from: d */
    public ProgressBar f130768d;

    /* renamed from: e */
    public float f130769e;

    /* renamed from: b */
    public final void mo109416b() {
        C52343e eVar = new C52343e(this.f130765a.f130355k);
        eVar.f130336f = this.f130769e;
        eVar.mo109155a(new C52346a() {
            /* renamed from: a */
            public final /* synthetic */ void mo109144a(C52327a aVar, C52351b bVar) {
                C52343e eVar = (C52343e) aVar;
                C52424a.this.mo109416b();
            }

            /* renamed from: a */
            public final /* synthetic */ void mo109145a(C52327a aVar, Object obj) {
                C52343e eVar = (C52343e) aVar;
                C52424a.this.f130767c.setImageBitmap((Bitmap) obj);
                C52424a.this.f130767c.setVisibility(0);
                C52424a.this.f130768d.setVisibility(8);
            }
        });
        C52333b.m111807a(eVar);
    }

    /* renamed from: a */
    public final void mo109415a() {
        String str;
        C52351b bVar = this.f130765a;
        if (this.f130766b.getText() != null) {
            str = this.f130766b.getText().toString();
        } else {
            str = "";
        }
        C52352c cVar = new C52352c();
        cVar.put("captcha_sid", bVar.f130354j);
        cVar.put("captcha_key", str);
        bVar.f130349e.f130359e.putAll(cVar);
        bVar.f130349e.mo109167c();
    }

    public C52424a(C52351b bVar) {
        this.f130765a = bVar;
    }
}
