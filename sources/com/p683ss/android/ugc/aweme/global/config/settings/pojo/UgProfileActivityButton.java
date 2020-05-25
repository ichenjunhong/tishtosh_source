package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.bytedance.ies.p659c.C10619c;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton */
public final class UgProfileActivityButton extends Message<UgProfileActivityButton, Builder> {
    public static final DefaultValueProtoAdapter<UgProfileActivityButton> ADAPTER = new ProtoAdapter_UgProfileActivityButton();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 2)
    public final String h5_link;
    @WireFieldNoEnum(adapter = "com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel#ADAPTER", label = 0, tag = 1)
    public final UrlModel resource_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer show_scenery;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String tab_bubble_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer time_limit;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgProfileActivityButton, Builder> {
        public String h5_link;
        public UrlModel resource_url;
        public Integer show_scenery;
        public String tab_bubble_text;
        public Integer time_limit;

        public final UgProfileActivityButton build() {
            if (this.resource_url == null || this.h5_link == null) {
                throw C10619c.m21408a(this.resource_url, "resource_url", this.h5_link, "h5_link");
            }
            UgProfileActivityButton ugProfileActivityButton = new UgProfileActivityButton(this.resource_url, this.h5_link, this.tab_bubble_text, this.time_limit, this.show_scenery, super.buildUnknownFields());
            return ugProfileActivityButton;
        }

        public final Builder h5_link(String str) {
            this.h5_link = str;
            return this;
        }

        public final Builder resource_url(UrlModel urlModel) {
            this.resource_url = urlModel;
            return this;
        }

        public final Builder show_scenery(Integer num) {
            this.show_scenery = num;
            return this;
        }

        public final Builder tab_bubble_text(String str) {
            this.tab_bubble_text = str;
            return this;
        }

        public final Builder time_limit(Integer num) {
            this.time_limit = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton$ProtoAdapter_UgProfileActivityButton */
    static final class ProtoAdapter_UgProfileActivityButton extends DefaultValueProtoAdapter<UgProfileActivityButton> {
        public final UgProfileActivityButton redact(UgProfileActivityButton ugProfileActivityButton) {
            return ugProfileActivityButton;
        }

        public ProtoAdapter_UgProfileActivityButton() {
            super(FieldEncoding.LENGTH_DELIMITED, UgProfileActivityButton.class);
        }

        public final UgProfileActivityButton decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgProfileActivityButton) null);
        }

        public final int encodedSize(UgProfileActivityButton ugProfileActivityButton) {
            return UrlModel.ADAPTER.encodedSizeWithTag(1, ugProfileActivityButton.resource_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, ugProfileActivityButton.h5_link) + ProtoAdapter.STRING.encodedSizeWithTag(3, ugProfileActivityButton.tab_bubble_text) + ProtoAdapter.INT32.encodedSizeWithTag(4, ugProfileActivityButton.time_limit) + ProtoAdapter.INT32.encodedSizeWithTag(5, ugProfileActivityButton.show_scenery) + ugProfileActivityButton.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgProfileActivityButton ugProfileActivityButton) throws IOException {
            UrlModel.ADAPTER.encodeWithTag(protoWriter, 1, ugProfileActivityButton.resource_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ugProfileActivityButton.h5_link);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, ugProfileActivityButton.tab_bubble_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, ugProfileActivityButton.time_limit);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, ugProfileActivityButton.show_scenery);
            protoWriter.writeBytes(ugProfileActivityButton.unknownFields());
        }

        public final UgProfileActivityButton decode(ProtoReader protoReader, UgProfileActivityButton ugProfileActivityButton) throws IOException {
            Builder builder;
            UgProfileActivityButton ugProfileActivityButton2 = (UgProfileActivityButton) C10617a.m21405a().mo18840a(UgProfileActivityButton.class, ugProfileActivityButton);
            if (ugProfileActivityButton2 != null) {
                builder = ugProfileActivityButton2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.resource_url((UrlModel) UrlModel.ADAPTER.decode(protoReader, builder.resource_url));
                            break;
                        case 2:
                            builder.h5_link((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.tab_bubble_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.time_limit((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.show_scenery((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (ugProfileActivityButton2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getH5Link() {
        return this.h5_link;
    }

    public final UrlModel getResourceUrl() {
        return this.resource_url;
    }

    public final Integer getShowScenery() throws C10174a {
        if (this.show_scenery != null) {
            return this.show_scenery;
        }
        throw new C10174a();
    }

    public final String getTabBubbleText() throws C10174a {
        if (this.tab_bubble_text != null) {
            return this.tab_bubble_text;
        }
        throw new C10174a();
    }

    public final Integer getTimeLimit() throws C10174a {
        if (this.time_limit != null) {
            return this.time_limit;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_url = this.resource_url;
        builder.h5_link = this.h5_link;
        builder.tab_bubble_text = this.tab_bubble_text;
        builder.time_limit = this.time_limit;
        builder.show_scenery = this.show_scenery;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((((unknownFields().hashCode() * 37) + this.resource_url.hashCode()) * 37) + this.h5_link.hashCode()) * 37;
        int i4 = 0;
        if (this.tab_bubble_text != null) {
            i = this.tab_bubble_text.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.time_limit != null) {
            i2 = this.time_limit.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.show_scenery != null) {
            i4 = this.show_scenery.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", resource_url=");
        sb.append(this.resource_url);
        sb.append(", h5_link=");
        sb.append(this.h5_link);
        if (this.tab_bubble_text != null) {
            sb.append(", tab_bubble_text=");
            sb.append(this.tab_bubble_text);
        }
        if (this.time_limit != null) {
            sb.append(", time_limit=");
            sb.append(this.time_limit);
        }
        if (this.show_scenery != null) {
            sb.append(", show_scenery=");
            sb.append(this.show_scenery);
        }
        StringBuilder replace = sb.replace(0, 2, "UgProfileActivityButton{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgProfileActivityButton)) {
            return false;
        }
        UgProfileActivityButton ugProfileActivityButton = (UgProfileActivityButton) obj;
        if (!unknownFields().equals(ugProfileActivityButton.unknownFields()) || !this.resource_url.equals(ugProfileActivityButton.resource_url) || !this.h5_link.equals(ugProfileActivityButton.h5_link) || !Internal.equals(this.tab_bubble_text, ugProfileActivityButton.tab_bubble_text) || !Internal.equals(this.time_limit, ugProfileActivityButton.time_limit) || !Internal.equals(this.show_scenery, ugProfileActivityButton.show_scenery)) {
            return false;
        }
        return true;
    }

    public UgProfileActivityButton(UrlModel urlModel, String str, String str2, Integer num, Integer num2) {
        this(urlModel, str, str2, num, num2, ByteString.EMPTY);
    }

    public UgProfileActivityButton(UrlModel urlModel, String str, String str2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_url = urlModel;
        this.h5_link = str;
        this.tab_bubble_text = str2;
        this.time_limit = num;
        this.show_scenery = num2;
    }
}
