package com.google.ads;

/* renamed from: com.google.ads.a */
public final class C14850a {

    /* renamed from: com.google.ads.a$a */
    public enum C14851a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        

        /* renamed from: a */
        private final String f38376a;

        private C14851a(String str) {
            this.f38376a = str;
        }

        public final String toString() {
            return this.f38376a;
        }
    }

    /* renamed from: com.google.ads.a$b */
    public enum C14852b {
        UNKNOWN,
        MALE,
        FEMALE
    }
}
