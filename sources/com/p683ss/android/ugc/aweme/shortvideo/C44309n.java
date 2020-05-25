package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.draft.model.C29058b;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46798a;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46801b;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46805f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.n */
public final class C44309n {

    /* renamed from: a */
    private static final C46801b f112175a = new C46801b() {
        /* renamed from: a */
        public final String mo78695a(C46805f fVar) {
            return null;
        }
    };

    /* renamed from: b */
    private static final C46798a f112176b = new C46798a() {
        /* renamed from: a */
        public final void mo78696a(C46805f fVar, String str) {
        }
    };

    /* renamed from: a */
    public static C46798a m97056a(final ShortVideoContext shortVideoContext) {
        return new C46798a() {
            /* renamed from: a */
            public final void mo78696a(C46805f fVar, String str) {
                switch (C443143.f112179a[fVar.ordinal()]) {
                    case 1:
                        shortVideoContext.f107098ax = str;
                        return;
                    case 2:
                        shortVideoContext.f107099ay = str;
                        return;
                    case 3:
                        shortVideoContext.f107100az = str;
                        return;
                    case 4:
                        shortVideoContext.f107049aA = str;
                        return;
                    case 5:
                        shortVideoContext.f107050aB = str;
                        return;
                    case 6:
                        shortVideoContext.f107051aC = str;
                        return;
                    case 7:
                        shortVideoContext.f107052aD = str;
                        break;
                }
            }
        };
    }

    /* renamed from: b */
    public static C46798a m97058b(final BaseShortVideoContext baseShortVideoContext) {
        return new C46798a() {
            /* renamed from: a */
            public final void mo78696a(C46805f fVar, String str) {
                switch (fVar) {
                    case MAIN_BUSINESS:
                        baseShortVideoContext.setMainBusinessData(str);
                        return;
                    case SOCIAL:
                        baseShortVideoContext.socialData = str;
                        return;
                    case POI:
                        baseShortVideoContext.poiData = str;
                        return;
                    case COMMERCE:
                        baseShortVideoContext.commerceData = str;
                        return;
                    case UG:
                        baseShortVideoContext.ugData = str;
                        return;
                    case TECH:
                        baseShortVideoContext.techData = str;
                        return;
                    case GLOBAL:
                        baseShortVideoContext.globalData = str;
                        break;
                }
            }
        };
    }

    /* renamed from: a */
    public static C46798a m97054a(final C29058b bVar) {
        if (bVar == null) {
            return f112176b;
        }
        return new C46798a() {
            /* renamed from: a */
            public final void mo78696a(C46805f fVar, String str) {
                switch (fVar) {
                    case MAIN_BUSINESS:
                        bVar.f76110n = str;
                        return;
                    case SOCIAL:
                        bVar.f76111o = str;
                        return;
                    case POI:
                        bVar.f76112p = str;
                        return;
                    case COMMERCE:
                        bVar.f76113q = str;
                        return;
                    case UG:
                        bVar.f76114r = str;
                        return;
                    case TECH:
                        bVar.f76115s = str;
                        return;
                    case GLOBAL:
                        bVar.f76116t = str;
                        break;
                }
            }
        };
    }

    /* renamed from: b */
    public static C46801b m97059b(final C29058b bVar) {
        if (bVar == null) {
            return f112175a;
        }
        return new C46801b() {
            /* renamed from: a */
            public final String mo78695a(C46805f fVar) {
                switch (C443143.f112179a[fVar.ordinal()]) {
                    case 1:
                        return bVar.f76110n;
                    case 2:
                        return bVar.f76111o;
                    case 3:
                        return bVar.f76112p;
                    case 4:
                        return bVar.f76113q;
                    case 5:
                        return bVar.f76114r;
                    case 6:
                        return bVar.f76115s;
                    case 7:
                        return bVar.f76116t;
                    default:
                        return null;
                }
            }
        };
    }

    /* renamed from: a */
    public static C46798a m97055a(final PhotoContext photoContext) {
        if (photoContext == null) {
            return f112176b;
        }
        return new C46798a() {
            /* renamed from: a */
            public final void mo78696a(C46805f fVar, String str) {
                switch (fVar) {
                    case MAIN_BUSINESS:
                        photoContext.mainBusinessData = str;
                        return;
                    case SOCIAL:
                        photoContext.socialData = str;
                        return;
                    case POI:
                        photoContext.poiData = str;
                        return;
                    case COMMERCE:
                        photoContext.commerceData = str;
                        return;
                    case UG:
                        photoContext.ugData = str;
                        return;
                    case TECH:
                        photoContext.techData = str;
                        return;
                    case GLOBAL:
                        photoContext.globalData = str;
                        break;
                }
            }
        };
    }

    /* renamed from: b */
    public static C46801b m97060b(final PhotoContext photoContext) {
        if (photoContext == null) {
            return f112175a;
        }
        return new C46801b() {
            /* renamed from: a */
            public final String mo78695a(C46805f fVar) {
                switch (fVar) {
                    case MAIN_BUSINESS:
                        return photoContext.mainBusinessData;
                    case SOCIAL:
                        return photoContext.socialData;
                    case POI:
                        return photoContext.poiData;
                    case COMMERCE:
                        return photoContext.commerceData;
                    case UG:
                        return photoContext.ugData;
                    case TECH:
                        return photoContext.techData;
                    case GLOBAL:
                        return photoContext.globalData;
                    default:
                        return null;
                }
            }
        };
    }

    /* renamed from: a */
    public static C46801b m97057a(final BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null) {
            return f112175a;
        }
        return new C46801b() {
            /* renamed from: a */
            public final String mo78695a(C46805f fVar) {
                switch (fVar) {
                    case MAIN_BUSINESS:
                        return baseShortVideoContext.getMainBusinessData();
                    case SOCIAL:
                        return baseShortVideoContext.socialData;
                    case POI:
                        return baseShortVideoContext.poiData;
                    case COMMERCE:
                        return baseShortVideoContext.commerceData;
                    case UG:
                        return baseShortVideoContext.ugData;
                    case TECH:
                        return baseShortVideoContext.techData;
                    case GLOBAL:
                        return baseShortVideoContext.globalData;
                    default:
                        return null;
                }
            }
        };
    }

    /* renamed from: b */
    public static C46801b m97061b(final ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null) {
            return f112175a;
        }
        return new C46801b() {
            /* renamed from: a */
            public final String mo78695a(C46805f fVar) {
                switch (fVar) {
                    case MAIN_BUSINESS:
                        return shortVideoContext.f107098ax;
                    case SOCIAL:
                        return shortVideoContext.f107099ay;
                    case POI:
                        return shortVideoContext.f107100az;
                    case COMMERCE:
                        return shortVideoContext.f107049aA;
                    case UG:
                        return shortVideoContext.f107050aB;
                    case TECH:
                        return shortVideoContext.f107051aC;
                    case GLOBAL:
                        return shortVideoContext.f107052aD;
                    default:
                        return null;
                }
            }
        };
    }
}
