/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j;

/**
 * General superclass of all unchecked exceptions that parts of OpenRDF Sesame
 * can throw.
 * 
 * @author jeen
 * @deprecated use {@link RDF4JException} instead.
 */
@Deprecated
public abstract class OpenRDFException extends RDF4JException {

	private static final long serialVersionUID = 8913366826930181397L;

	public OpenRDFException() {
		super();
	}

	public OpenRDFException(String msg) {
		super(msg);
	}

	public OpenRDFException(Throwable t) {
		super(t);
	}

	public OpenRDFException(String msg, Throwable t) {
		super(msg, t);
	}
}
