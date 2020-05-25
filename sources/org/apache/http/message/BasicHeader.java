package org.apache.http.message;

import org.apache.http.Header;

public class BasicHeader implements Cloneable, Header {
    private final String name;
    private final String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatHeader(null, this).toString();
    }

    public BasicHeader(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
