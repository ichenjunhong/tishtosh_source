package com.google.gson;

/* renamed from: com.google.gson.v */
public enum C18092v {
    DEFAULT {
        public final C18082l serialize(Long l) {
            return new C18088r((Number) l);
        }
    },
    STRING {
        public final C18082l serialize(Long l) {
            return new C18088r(String.valueOf(l));
        }
    };

    public abstract C18082l serialize(Long l);
}
