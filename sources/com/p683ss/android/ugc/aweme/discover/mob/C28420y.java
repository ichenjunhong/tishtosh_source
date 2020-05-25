package com.p683ss.android.ugc.aweme.discover.mob;

import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.y */
public interface C28420y {

    /* renamed from: a */
    public static final C28421a f74677a = C28421a.f74678a;

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.y$a */
    public static final class C28421a {

        /* renamed from: a */
        static final /* synthetic */ C28421a f74678a = new C28421a();

        private C28421a() {
        }

        /* renamed from: a */
        public static int m67432a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 111178:
                        if (str.equals("poi")) {
                            return 5;
                        }
                        break;
                    case 114586:
                        if (str.equals("tag")) {
                            return 2;
                        }
                        break;
                    case 3322092:
                        if (str.equals(CustomActionPushReceiver.f104061f)) {
                            return 9;
                        }
                        break;
                    case 3599307:
                        if (str.equals("user")) {
                            return 0;
                        }
                        break;
                    case 104263205:
                        if (str.equals("music")) {
                            return 1;
                        }
                        break;
                    case 112202875:
                        if (str.equals("video")) {
                            return 4;
                        }
                        break;
                    case 998835423:
                        if (str.equals("general_search")) {
                            return 3;
                        }
                        break;
                    case 1528280640:
                        if (str.equals("ecommerce")) {
                            return 7;
                        }
                        break;
                }
            }
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.y$b */
    public enum C28422b {
        FROM_GENERAL_SEARCH("from_general_search"),
        FROM_SEARCH_RESULT("from_search_result"),
        FROM_OTHERS("from_others");
        

        /* renamed from: b */
        private final String f74680b;

        public final String getValue() {
            return this.f74680b;
        }

        private C28422b(String str) {
            this.f74680b = str;
        }
    }

    /* renamed from: a */
    String mo56813a(int i);
}
