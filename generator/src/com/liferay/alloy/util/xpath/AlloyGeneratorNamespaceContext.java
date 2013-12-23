/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.alloy.util.xpath;

import java.util.Map;

import org.jaxen.NamespaceContext;

/**
 * @author Eduardo Lundgren
 */
public class AlloyGeneratorNamespaceContext implements NamespaceContext {

	public AlloyGeneratorNamespaceContext(
		Map<String, String> namespaceContextMap) {

		_namespaceContextMap = namespaceContextMap;
	}

	@Override
	public String translateNamespacePrefixToUri(String prefix) {
		if (_namespaceContextMap == null) {
			return null;
		}

		return _namespaceContextMap.get(prefix);
	}

	private Map<String, String> _namespaceContextMap;

}