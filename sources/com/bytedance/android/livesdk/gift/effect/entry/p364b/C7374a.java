package com.bytedance.android.livesdk.gift.effect.entry.p364b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p224c.C3831a;
import com.facebook.common.p918b.C13670i;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a */
public final class C7374a {

    /* renamed from: a */
    public static final C7375a f20136a = new C7375a(null);

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a$a */
    public static final class C7375a {
        private C7375a() {
        }

        public /* synthetic */ C7375a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static boolean m15221a(String str) {
            C13619c c = C13978j.m28504a().mo26147c(C14229b.fromUri(str), null);
            C14017k a = C14017k.m28587a();
            C52711k.m112236a((Object) a, "ImagePipelineFactory.getInstance()");
            return a.mo26210d().mo25512d(c);
        }

        /* renamed from: a */
        public static String m15220a(ImageModel imageModel) {
            Object obj;
            C52711k.m112240b(imageModel, "imageModel");
            List urls = imageModel.getUrls();
            C52711k.m112236a((Object) urls, "imageModel.urls");
            Iterator it = urls.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str = (String) obj;
                C52711k.m112236a((Object) str, "it");
                if (m15221a(str)) {
                    break;
                }
            }
            return (String) obj;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a$b */
    public static final class C7376b extends C13744b<Void> {

        /* renamed from: a */
        public final ImageModel f20137a;

        /* renamed from: b */
        public final C7377c f20138b;

        /* renamed from: c */
        private final List<String> f20139c;

        /* renamed from: a */
        public final void mo13649a() {
            if (this.f20139c.isEmpty()) {
                StringBuilder sb = new StringBuilder("Failed to fetch resource ");
                sb.append(this.f20137a.getUri());
                C3831a.m9716d("LocalImageProvider", sb.toString());
                return;
            }
            String str = (String) this.f20139c.remove(0);
            StringBuilder sb2 = new StringBuilder("Trying alternative ");
            sb2.append(str);
            sb2.append(" of resource ");
            sb2.append(this.f20137a.getUri());
            C3831a.m9712b("LocalImageProvider", sb2.toString());
            C13771c.m27875c().mo26192c(C14229b.fromUri(str), null).mo25666a(this, C13670i.m27623a());
        }

        public final void onFailureImpl(C13745c<Void> cVar) {
            if (cVar == null || cVar.mo25675e() == null) {
                C3831a.m9715c("LocalImageProvider", "Alternative failed");
            } else {
                C3831a.m9708a("LocalImageProvider", "Alternative failed", cVar.mo25675e());
            }
            mo13649a();
        }

        public final void onNewResultImpl(C13745c<Void> cVar) {
            if (cVar == null) {
                C52711k.m112234a();
            }
            if (cVar.mo25672b()) {
                StringBuilder sb = new StringBuilder("Resource ");
                sb.append(this.f20137a.getUri());
                sb.append(" fetched from network");
                C3831a.m9712b("LocalImageProvider", sb.toString());
                this.f20138b.mo12369a(this.f20137a);
            }
        }

        public C7376b(ImageModel imageModel, C7377c cVar) {
            C52711k.m112240b(imageModel, "imageModel");
            C52711k.m112240b(cVar, "callback");
            this.f20137a = imageModel;
            this.f20138b = cVar;
            List urls = this.f20137a.getUrls();
            C52711k.m112236a((Object) urls, "imageModel.urls");
            this.f20139c = C52575l.m112139e((Collection) urls);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.gift.effect.entry.b.a$c */
    public interface C7377c {
        /* renamed from: a */
        void mo12369a(ImageModel imageModel);
    }
}
