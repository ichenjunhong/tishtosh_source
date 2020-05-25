package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33655i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d.p1819b.C33403g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.u */
public final class C33437u {

    /* renamed from: a */
    public static final C33437u f86671a = new C33437u();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.u$a */
    static final class C33438a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ List f86672a;

        /* renamed from: b */
        final /* synthetic */ String f86673b;

        /* renamed from: c */
        final /* synthetic */ boolean f86674c;

        C33438a(List list, String str, boolean z) {
            this.f86672a = list;
            this.f86673b = str;
            this.f86674c = z;
        }

        public final /* synthetic */ Object call() {
            String str = "";
            boolean z = false;
            int i = 0;
            for (C34409a aVar : this.f86672a) {
                if (aVar.isVideo()) {
                    String str2 = this.f86673b;
                    StoryVideoContent obtain = StoryVideoContent.Companion.obtain(aVar);
                    if (obtain != null) {
                        C33403g.m76572a(str2, obtain);
                    }
                } else {
                    String str3 = this.f86673b;
                    boolean z2 = this.f86674c;
                    C33655i fromMediaModel = C33655i.fromMediaModel(aVar);
                    if (fromMediaModel == null) {
                        str = "";
                    } else {
                        str = C33440v.m76638a().mo70844a(str3, C52575l.m112092a(fromMediaModel), z2);
                        if (str == null) {
                            str = "";
                        }
                    }
                    i++;
                }
            }
            if (str.length() > 0) {
                z = true;
            }
            if (!z || i <= 1) {
                return str;
            }
            String string = C11010c.m22280a().getString(R.string.bg1);
            C52711k.m112236a((Object) string, "AppContextManager.getApp…im_compress_failed_multi)");
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.u$b */
    static final class C33439b<TTaskResult, TContinuationResult> implements C0011g<String, C52860x> {

        /* renamed from: a */
        public static final C33439b f86675a = new C33439b();

        C33439b() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            boolean z;
            C52711k.m112236a((Object) iVar, "it");
            Object e = iVar.mo34e();
            C52711k.m112236a(e, "it.result");
            if (((CharSequence) e).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C10691a.m21545b(C11010c.m22280a(), (String) iVar.mo34e()).mo19066a();
            }
            return C52860x.f131107a;
        }
    }

    private C33437u() {
    }

    /* renamed from: a */
    public static final void m76637a(String str, List<C34409a> list, boolean z) {
        boolean z2;
        C52711k.m112240b(list, "list");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !list.isEmpty()) {
            C0013i.m16a((Callable<TResult>) new C33438a<TResult>(list, str, z)).mo20a((C0011g<TResult, TContinuationResult>) C33439b.f86675a, C0013i.f25b);
        }
    }
}
