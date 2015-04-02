/*
 * Copyright (c) 2015, Mazen Kotb <email@mazenmc.io>
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package io.minecloud.models.bungee;

import io.minecloud.db.mongo.model.DataField;
import io.minecloud.db.mongo.model.MongoModel;
import io.minecloud.models.bungee.type.BungeeType;
import io.minecloud.models.network.Network;
import io.minecloud.models.nodes.Node;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@EqualsAndHashCode
public class Bungee implements MongoModel {
    @DataField(reference = true)
    @Setter
    private Network network;
    @DataField(reference = true)
    @Setter
    private BungeeType type;
    @DataField
    @Setter
    private String containerId;
    @DataField(reference = true)
    @Setter
    private Node node;
    @DataField
    @Setter
    private String publicIp;
    @DataField
    @Setter
    private int ramUsage;

    public Network network() {
        return network;
    }

    public BungeeType type() {
        return type;
    }

    public String containerId() {
        return containerId;
    }

    public Node node() {
        return node;
    }

    public String publicIp() {
        return publicIp;
    }

    public int ramUsage() {
        return ramUsage;
    }
}