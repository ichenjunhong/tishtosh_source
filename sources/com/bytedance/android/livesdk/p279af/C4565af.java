package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.support.p030v4.p038f.C0785g;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.message.C7772a;
import com.bytedance.android.livesdk.message.p396a.C7773a;
import com.bytedance.android.livesdk.message.p396a.C7774b;
import com.bytedance.android.livesdk.message.p396a.C7775c;
import com.bytedance.android.livesdk.message.p397b.C7779b;
import com.bytedance.android.livesdk.message.p397b.C7780c;
import com.bytedance.android.livesdk.message.p397b.C7785e;
import com.bytedance.android.livesdk.message.p397b.C7786f;
import com.p683ss.ugc.live.sdk.message.MessageManagerFactory;
import com.p683ss.ugc.live.sdk.message.data.Configuration;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* renamed from: com.bytedance.android.livesdk.af.af */
public final class C4565af {

    /* renamed from: a */
    private static C0785g<IMessageManager> f12527a = new C0785g<>(2);

    /* renamed from: b */
    private static C0785g<C7786f> f12528b = new C0785g<>(2);

    /* renamed from: c */
    private static long f12529c;

    /* renamed from: d */
    private static C7772a f12530d;

    /* renamed from: a */
    public static IMessageManager m10958a() {
        return (IMessageManager) f12527a.mo2487a(f12529c);
    }

    /* renamed from: a */
    public static void m10961a(long j) {
        IMessageManager iMessageManager = (IMessageManager) f12527a.mo2487a(j);
        if (iMessageManager != null) {
            iMessageManager.release();
            if (f12530d != null) {
                f12530d.mo14111a();
            }
            C7786f fVar = (C7786f) f12528b.mo2487a(j);
            if (fVar != null) {
                fVar.mo14130a();
            }
            f12527a.mo2496c(j);
        }
    }

    /* renamed from: a */
    public static IMessageManager m10959a(long j, boolean z, Context context) {
        return m10960a(j, z, context, false);
    }

    /* renamed from: a */
    public static IMessageManager m10960a(long j, boolean z, Context context, boolean z2) {
        IMessageClient iMessageClient;
        f12529c = j;
        if (z2) {
            iMessageClient = new C7773a(z);
        } else {
            iMessageClient = new C7774b(z);
        }
        if (iMessageClient instanceof C7774b) {
            ((C7774b) iMessageClient).mo14119a(j, context);
        } else {
            ((C7773a) iMessageClient).mo14113a(j, context);
        }
        C7772a giftInterceptor = ((IGiftService) C4116c.m10249a(IGiftService.class)).getGiftInterceptor(j, z);
        f12530d = ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssetsInterceptor(z);
        C7786f fVar = new C7786f();
        f12528b.mo2493b(j, fVar);
        IMessageManager iMessageManager = MessageManagerFactory.get(new Configuration().setHttpClient(iMessageClient).setMessageConverter(new C7775c()).addInterceptor(fVar).addInterceptor(new C7780c(j)).addInterceptor(giftInterceptor).addInterceptor(f12530d).addInterceptor(new C7779b()).addInterceptor(new C7785e()).setAnchor(z).setEnablePriority(false).setEnableSmoothlyDispatch(true));
        f12527a.mo2493b(j, iMessageManager);
        giftInterceptor.mo14112a(iMessageManager);
        f12530d.mo14112a(iMessageManager);
        return iMessageManager;
    }
}
