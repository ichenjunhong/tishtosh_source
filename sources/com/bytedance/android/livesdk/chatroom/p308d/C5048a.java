package com.bytedance.android.livesdk.chatroom.p308d;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.d.a */
public final class C5048a {

    /* renamed from: b */
    public static final String[] f13516b = {"_id", "date_added"};

    /* renamed from: c */
    private static final String[] f13517c = {"screenshot", C3922z.m9903a((int) R.string.f0u), "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    /* renamed from: a */
    public C5050a f13518a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.d.a$a */
    public static class C5050a {

        /* renamed from: a */
        public long f13520a;

        /* renamed from: b */
        public long f13521b;

        /* renamed from: c */
        public long f13522c;

        public C5050a(long j, long j2, long j3) {
            this.f13520a = j2;
            this.f13521b = j;
            this.f13522c = j3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.d.a$b */
    static class C5051b {

        /* renamed from: a */
        public static final C5048a f13523a = new C5048a();
    }

    private C5048a() {
    }

    /* renamed from: a */
    public static C5048a m11552a() {
        return C5051b.f13523a;
    }

    /* renamed from: a */
    public final void mo10913a(long j) {
        if (((Boolean) LiveSettingKeys.LIVE_SCREEN_SHOT_RECORD_ENABLE.mo9431a()).booleanValue() && this.f13518a != null && j != 0 && this.f13518a.f13521b == j) {
            C2201v.m6607a((Callable<? extends T>) new Callable<HashMap<String, String>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public HashMap<String, String> call() throws Exception {
                    long j;
                    HashMap<String, String> hashMap = new HashMap<>();
                    if (C5048a.this.f13518a == null) {
                        return hashMap;
                    }
                    Uri uri = Media.EXTERNAL_CONTENT_URI;
                    try {
                        ContentResolver contentResolver = C3922z.m9915e().getContentResolver();
                        String[] strArr = C5048a.f13516b;
                        StringBuilder sb = new StringBuilder("date_added>=");
                        sb.append(C5048a.this.f13518a.f13522c / 1000);
                        Cursor query = Media.query(contentResolver, uri, strArr, sb.toString(), "date_added DESC");
                        hashMap.put("anchor_id", String.valueOf(C5048a.this.f13518a.f13520a));
                        hashMap.put("room_id", String.valueOf(C5048a.this.f13518a.f13521b));
                        String str = "photo_num";
                        if (query != null) {
                            j = (long) query.getCount();
                        } else {
                            j = 0;
                        }
                        hashMap.put(str, String.valueOf(j));
                    } catch (Exception unused) {
                        hashMap.put("anchor_id", String.valueOf(C5048a.this.f13518a.f13520a));
                        hashMap.put("room_id", String.valueOf(C5048a.this.f13518a.f13521b));
                        hashMap.put("photo_num", "0");
                    }
                    return hashMap;
                }
            }).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f(C5052b.f13524a);
        }
    }
}
