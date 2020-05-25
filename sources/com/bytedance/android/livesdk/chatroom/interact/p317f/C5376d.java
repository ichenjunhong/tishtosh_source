package com.bytedance.android.livesdk.chatroom.interact.p317f;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.chatroom.p310f.C5217f;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import com.p683ss.video.rtc.interact.model.Region;
import com.p683ss.video.rtc.interact.model.TalkingState;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.f.d */
public final class C5376d extends C5372a {

    /* renamed from: b */
    private C5377a f14323b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.f.d$a */
    public interface C5377a {
        /* renamed from: a */
        long mo11288a(String str);
    }

    public C5376d(C5377a aVar) {
        this.f14323b = aVar;
    }

    public final MixStreamInfo mixStream(int i, int i2, String str, List<String> list, List<TalkingState> list2) {
        int i3;
        List<String> list3 = list;
        String str2 = C4638d.m11114a().f12665h;
        long b = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        ArrayList arrayList = new ArrayList();
        Region region = new Region();
        Region userId = region.mediaType(1).size(1.0d, 1.0d).position(ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT).interactId(str2).userId(b);
        userId.status(0);
        arrayList.add(region);
        if (list3 == null || list.isEmpty()) {
            i3 = 0;
        } else {
            i3 = list.size();
        }
        for (int i4 = 0; i4 < i3; i4++) {
            String str3 = (String) list3.get(i4);
            Region region2 = new Region();
            region2.mediaType(2).size(1.0d, 1.0d).position(ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT).interactId(str3).userId(this.f14323b.mo11288a(str3));
            arrayList.add(region2);
        }
        MixStreamInfo mixStreamInfo = new MixStreamInfo();
        mixStreamInfo.setRegions(arrayList);
        int i5 = i;
        mixStreamInfo.setAppData(C5217f.m11833a(this.f14311a, (List<Region>) arrayList, i, i2, list2));
        return mixStreamInfo;
    }
}
