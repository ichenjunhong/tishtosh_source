package org.apache.http.message;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;

public class HeaderGroup implements Cloneable {
    private List headers = new ArrayList(16);

    public void clear() {
        this.headers.clear();
    }

    public Object clone() throws CloneNotSupportedException {
        HeaderGroup headerGroup = (HeaderGroup) super.clone();
        headerGroup.headers = new ArrayList(this.headers);
        return headerGroup;
    }

    public Header[] getAllHeaders() {
        return (Header[]) this.headers.toArray(new Header[this.headers.size()]);
    }

    public void setHeaders(Header[] headerArr) {
        clear();
        if (headerArr != null) {
            for (Header add : headerArr) {
                this.headers.add(add);
            }
        }
    }
}
