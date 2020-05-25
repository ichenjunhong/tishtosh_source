package com.bytedance.android.livesdk.chatroom.interact.p317f;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.chatroom.p310f.C5217f;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.avframework.livestreamv2.core.LiveCore.InteractConfig;
import com.p683ss.video.rtc.interact.model.CommonType.VideoQuality;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.TalkingState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.f.b */
public final class C5373b extends C5372a {

    /* renamed from: b */
    private double f14312b;

    /* renamed from: c */
    private double f14313c;

    /* renamed from: d */
    private double f14314d;

    /* renamed from: e */
    private double f14315e;

    /* renamed from: f */
    private double f14316f;

    /* renamed from: g */
    private C5374a f14317g;

    /* renamed from: h */
    private InteractConfig f14318h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.f.b$a */
    public interface C5374a {
        /* renamed from: a */
        boolean mo11067a(String str);

        /* renamed from: b */
        int mo11068b(String str);

        /* renamed from: c */
        long mo11069c(String str);
    }

    /* renamed from: a */
    public final void mo11286a(InteractConfig interactConfig) {
        this.f14318h = interactConfig;
    }

    public C5373b(VideoQuality videoQuality, C5374a aVar) {
        this.f14317g = aVar;
        int width = videoQuality.getWidth();
        int height = videoQuality.getHeight();
        double d = (double) ((((float) width) * 1.0f) / 360.0f);
        Double.isNaN(d);
        double d2 = 120.0d * d;
        double d3 = (double) width;
        Double.isNaN(d3);
        this.f14312b = d2 / d3;
        Double.isNaN(d);
        double d4 = 160.0d * d;
        double d5 = (double) height;
        Double.isNaN(d5);
        this.f14313c = d4 / d5;
        Double.isNaN(d);
        double d6 = 12.0d * d;
        Double.isNaN(d3);
        this.f14314d = (1.0d - this.f14312b) - (d6 / d3);
        Double.isNaN(d);
        double d7 = 60.0d * d;
        Double.isNaN(d5);
        this.f14315e = d7 / d5;
        Double.isNaN(d);
        double d8 = d * 4.0d;
        Double.isNaN(d5);
        this.f14316f = d8 / d5;
    }

    public final MixStreamInfo mixStream(int i, int i2, String str, List<String> list, List<TalkingState> list2) {
        List<String> list3 = list;
        String str2 = C4638d.m11114a().f12665h;
        long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        ArrayList arrayList = new ArrayList();
        Region region = new Region();
        double d = 1.0d;
        Region userId = region.mediaType(1).size(1.0d, 1.0d).position(ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT).interactId(str2).userId(b);
        int i3 = 0;
        userId.status(0);
        arrayList.add(region);
        if (list3 != null && !list.isEmpty()) {
            i3 = list.size();
        }
        int i4 = 1;
        while (i4 <= i3) {
            int i5 = i4 - 1;
            String str3 = (String) list3.get(i5);
            double d2 = d - this.f14315e;
            double d3 = (double) i4;
            double d4 = this.f14313c;
            Double.isNaN(d3);
            double d5 = d2 - (d3 * d4);
            if (i4 > 1) {
                double d6 = (double) i5;
                double d7 = this.f14316f;
                Double.isNaN(d6);
                d5 -= d6 * d7;
            }
            Region region2 = new Region();
            region2.mediaType(this.f14317g.mo11068b(str3)).size(this.f14312b, this.f14313c).position(this.f14314d, d5).interactId(str3).userId(this.f14317g.mo11069c(str3)).status(this.f14317g.mo11067a(str3) ^ true ? 1 : 0);
            arrayList.add(region2);
            i4++;
            d = 1.0d;
        }
        MixStreamInfo mixStreamInfo = new MixStreamInfo();
        mixStreamInfo.setRegions(arrayList);
        mixStreamInfo.setAppData(C5217f.m11833a(this.f14318h, (List<Region>) arrayList, i, i2, list2));
        return mixStreamInfo;
    }
}
