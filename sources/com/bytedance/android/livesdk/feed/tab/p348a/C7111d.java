package com.bytedance.android.livesdk.feed.tab.p348a;

import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.feed.feed.C6945f;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.tab.a.d */
public final class C7111d implements C7110c {

    /* renamed from: m */
    private static final String f19319m = ((INetworkService) C4116c.m10249a(INetworkService.class)).getHostDomain();

    /* renamed from: a */
    String[] f19320a = {"直播"};

    /* renamed from: b */
    String[] f19321b;

    /* renamed from: c */
    String[] f19322c;

    /* renamed from: d */
    String[] f19323d;

    /* renamed from: e */
    int[] f19324e;

    /* renamed from: f */
    int[] f19325f;

    /* renamed from: g */
    int[] f19326g;

    /* renamed from: h */
    int[] f19327h;

    /* renamed from: i */
    int[] f19328i;

    /* renamed from: j */
    int[] f19329j;

    /* renamed from: k */
    boolean[] f19330k;

    /* renamed from: l */
    int[] f19331l;

    /* renamed from: a */
    public final List<C6945f> mo13242a() {
        ArrayList arrayList = new ArrayList(1);
        for (int i = 0; i < this.f19320a.length; i++) {
            C6945f fVar = new C6945f();
            fVar.f19009a = (long) this.f19327h[i];
            fVar.f19016h = this.f19322c[i];
            fVar.f19010b = this.f19320a[i];
            fVar.f19012d = this.f19321b[i];
            fVar.f19011c = this.f19324e[i];
            fVar.f19014f = this.f19325f[i];
            fVar.f19015g = this.f19326g[i];
            fVar.f19017i = this.f19328i[i];
            fVar.f19018j = this.f19329j[i];
            arrayList.add(fVar);
        }
        return arrayList;
    }

    public C7111d() {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(f19319m);
        sb.append("/webcast/feed/");
        this.f19321b = new String[]{sb.toString()};
        this.f19322c = new String[]{CustomActionPushReceiver.f104061f};
        this.f19323d = new String[]{CustomActionPushReceiver.f104061f};
        this.f19324e = new int[]{1};
        this.f19325f = new int[]{1};
        this.f19326g = new int[]{1};
        this.f19327h = new int[]{1};
        this.f19328i = new int[]{1001};
        this.f19329j = new int[]{0};
        this.f19330k = new boolean[]{false};
        this.f19331l = new int[]{0};
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(f19319m);
        sb2.append("/webcast/feed/?content_type=0&style=2&channel_id=21");
        this.f19321b = new String[]{sb2.toString()};
        this.f19320a[0] = "Top LIVEs";
        this.f19325f[0] = 2;
    }
}
