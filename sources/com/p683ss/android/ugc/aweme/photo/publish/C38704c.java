package com.p683ss.android.ugc.aweme.photo.publish;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;

/* renamed from: com.ss.android.ugc.aweme.photo.publish.c */
public final class C38704c {
    /* renamed from: a */
    public static String m86059a(int i) {
        if (i != 0) {
            switch (i) {
                case 5:
                case 8:
                    return "photo";
                case 6:
                    return "slideshow";
                case 7:
                case 9:
                    break;
                default:
                    return null;
            }
        }
        return "video";
    }

    /* renamed from: b */
    public static boolean m86061b(int i) {
        return i == 0 || i == 7;
    }

    /* renamed from: c */
    public static boolean m86062c(int i) {
        return i == 8 || i == 7 || i == 9;
    }

    /* renamed from: a */
    public static String m86060a(int i, Object obj) {
        IFoundationAVService iFoundationAVService;
        if (i != 0) {
            switch (i) {
                case 5:
                    if (((PhotoContext) obj).mPhotoFrom == 1) {
                        return "shoot";
                    }
                    return "upload";
                case 6:
                    return "upload";
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    return null;
            }
        }
        Object a = C27991b.m66756a(IFoundationAVService.class);
        if (a != null) {
            iFoundationAVService = (IFoundationAVService) a;
        } else {
            iFoundationAVService = (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
        }
        if (iFoundationAVService.convertToExposureData(obj).getOrigin() == 1) {
            return "shoot";
        }
        return "upload";
    }
}
