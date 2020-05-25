package com.twitter;

/* renamed from: com.twitter.a */
public final class C52059a {

    /* renamed from: a */
    public boolean f129617a = true;

    /* renamed from: com.twitter.a$a */
    public static class C52060a {

        /* renamed from: a */
        protected int f129618a;

        /* renamed from: b */
        protected int f129619b;

        /* renamed from: c */
        public final String f129620c;

        /* renamed from: d */
        public final String f129621d;

        /* renamed from: e */
        public final C52061a f129622e;

        /* renamed from: com.twitter.a$a$a */
        public enum C52061a {
            URL,
            HASHTAG,
            MENTION,
            CASHTAG
        }

        public final int hashCode() {
            return this.f129622e.hashCode() + this.f129620c.hashCode() + this.f129618a + this.f129619b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f129620c);
            sb.append("(");
            sb.append(this.f129622e);
            sb.append(") [");
            sb.append(this.f129618a);
            sb.append(",");
            sb.append(this.f129619b);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C52060a)) {
                return false;
            }
            C52060a aVar = (C52060a) obj;
            if (!this.f129622e.equals(aVar.f129622e) || this.f129618a != aVar.f129618a || this.f129619b != aVar.f129619b || !this.f129620c.equals(aVar.f129620c)) {
                return false;
            }
            return true;
        }

        public C52060a(int i, int i2, String str, C52061a aVar) {
            this(i, i2, str, null, aVar);
        }

        private C52060a(int i, int i2, String str, String str2, C52061a aVar) {
            this.f129618a = i;
            this.f129619b = i2;
            this.f129620c = str;
            this.f129621d = null;
            this.f129622e = aVar;
        }
    }
}
