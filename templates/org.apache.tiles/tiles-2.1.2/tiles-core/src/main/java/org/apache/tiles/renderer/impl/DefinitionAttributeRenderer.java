/*
 * $Id: DefinitionAttributeRenderer.java 736275 2009-01-21 09:58:20Z apetrelli $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tiles.renderer.impl;

import java.io.IOException;

import org.apache.tiles.Attribute;
import org.apache.tiles.TilesContainer;
import org.apache.tiles.awareness.TilesContainerAware;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.renderer.AttributeRenderer;

/**
 * Renders an attribute that contains a reference to a definition.
 *
 * @version $Rev: 736275 $ $Date: 2009-01-21 10:58:20 +0100 (Wed, 21 Jan 2009) $
 * @since 2.1.0
 */
public class DefinitionAttributeRenderer extends AbstractBaseAttributeRenderer
        implements TilesContainerAware, AttributeRenderer {

    /**
     * The Tiles container.
     *
     * @since 2.1.0
     */
    protected TilesContainer container;

    /** {@inheritDoc} */
    public void setContainer(TilesContainer container) {
        this.container = container;
    }

    /** {@inheritDoc} */
    @Override
    public void write(Object value, Attribute attribute,
            TilesRequestContext request)
            throws IOException {
        container.render(value.toString(), request.getRequestObjects());
    }
}
